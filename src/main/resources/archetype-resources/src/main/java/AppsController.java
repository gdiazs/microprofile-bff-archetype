#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "apps")
@RequestScoped
public class AppsController {

  private String appName;

  public AppsController() {
    this.appName = "vue-${artifactId}";
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }


}
