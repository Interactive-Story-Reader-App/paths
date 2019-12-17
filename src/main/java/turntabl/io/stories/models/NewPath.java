package turntabl.io.stories.models;

public class NewPath {
    private String story_id;
    private Integer[] paths;

    public NewPath(String story_id, Integer[] paths) {
        this.story_id = story_id;
        this.paths = paths;
    }

    public String getStory_id() {
        return story_id;
    }

    public void setStory_id(String story_id) {
        this.story_id = story_id;
    }

    public Integer[] getPaths() {
        return paths;
    }

    public void setPaths(Integer[] paths) {
        this.paths = paths;
    }
}
