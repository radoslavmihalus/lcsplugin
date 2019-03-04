// Empty constructor
function LCSPlugin() {}

// The function that passes work along to native shells
// script is a string
LCSPlugin.prototype.send = function (script, successCallback, errorCallback) {
    var options = {};
    options.script = script;
    cordova.exec(successCallback, errorCallback, 'LCSPlugin', 'send', [options]);
}

// Installation constructor that binds LCSPlugin to window
LCSPlugin.install = function () {
    if (!window.plugins) {
        window.plugins = {};
    }
    window.plugins.lcsPlugin = new LCSPlugin();
    return window.plugins.lcsPlugin;
};
cordova.addConstructor(LCSPlugin.install);