package turntabl.io.stories.models;

public class Path {

    private String _id;
    private String _rev;
    private String story_id;
    private Integer[] paths;

    public Path(String _id, String _rev, String story_id, Integer[] paths) {
        this._id = _id;
        this._rev = _rev;
        this.story_id = story_id;
        this.paths = paths;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
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
