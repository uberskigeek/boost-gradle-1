package boost.project;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class BoostPlugin implements Plugin<Project> {
    public void apply(Project project) {
//        project.getPluginManager().apply(net.wasdev.wlp.gradle.plugins.Liberty.class);
        project.getTasks().create("packageApp", Boost.class, (task) -> { 
            task.setMessage("Hello");
            task.setRecipient("World");                                
        });
    }
}
