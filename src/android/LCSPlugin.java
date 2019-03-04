package com.blueticket.cordova.plugin;

// Cordova-required packages
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LCSPlugin extends CordovaPlugin {
  @Override
  public boolean execute(String action, JSONArray args,
    final CallbackContext callbackContext) {
      // Verify that the user sent a 'send' action
      if (!action.equals("send")) {
        callbackContext.error("\"" + action + "\" is not a recognized action.");
        return false;
      }
      String script;
      try {
        JSONObject options = args.getJSONObject(0);
        script = options.getString("script");
      } catch (JSONException e) {
        callbackContext.error("Error encountered: " + e.getMessage());
        return false;
      }
      
      
      // Od tadeto by sa mal vykonat send command pre LCS - script je v premennej script
      
      // Po tadeto
      
      // Send a positive result to the callbackContext
      PluginResult pluginResult = new PluginResult(PluginResult.Status.OK);
      callbackContext.sendPluginResult(pluginResult);
      return true;
      
  }
}