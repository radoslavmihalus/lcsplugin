/*global cordova, module*/

module.exports = {
    send: function (script, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "LCSPlugin", "send", [script]);
    }
};