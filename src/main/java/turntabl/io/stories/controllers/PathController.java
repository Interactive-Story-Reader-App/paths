package turntabl.io.stories.controllers;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import turntabl.io.stories.models.NewPath;
import turntabl.io.stories.models.Path;

@RestController
public class PathController {

    @Autowired
    private Database db;

    @CrossOrigin
    @PostMapping("api/v1/path")
    public void addNewPath(@RequestBody NewPath newPath){
        Response response = db.save(newPath);
    }

    @CrossOrigin
    @RequestMapping(value = "api/v1/path/{id}", method = RequestMethod.GET)
    public Path getPathById(@PathVariable("id") String id){
        return db.find(Path.class, id);
    }

    @CrossOrigin
    @RequestMapping(value = "api/v1/path/story", method = RequestMethod.GET)
    public Path getPathByStoryId(@RequestParam String story_id){
        return db.find(Path.class, story_id);
    }

    @CrossOrigin
    @PatchMapping("/api/v1/path/{id}")
    public void updatePath(@RequestBody Path upath, @PathVariable("id") String id){
        Path path = db.find(Path.class, id);

        path.setStory_id(upath.getStory_id());
        path.setPaths(upath.getPaths());

        Response response = db.update(path);
    }

    @CrossOrigin
    @DeleteMapping("/api/v1/path/{id}/{rev}")
    public void deletePath(@PathVariable("id") String id, @PathVariable("rev") String rev){
        Response response = db.remove(id, rev);
    }
}
