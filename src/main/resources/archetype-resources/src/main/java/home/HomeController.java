#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.home;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "home")
@RequestScoped
public class HomeController {

  private String appName;

  public HomeController() {
    this.appName = "vue-${artifactId}";
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }


}
