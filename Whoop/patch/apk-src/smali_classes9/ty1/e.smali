.class public final synthetic Lty1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lty1/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lty1/e;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/whoop/design/models/celebration/SlotOptionsModel$BooleanOptionsModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {}, Lcom/whoop/design/models/celebration/SlotOptionsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {}, Lcom/whoop/design/models/celebration/SlotModeModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {}, Lcom/whoop/design/models/celebration/SlotGroupModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {}, Lcom/whoop/design/models/celebration/SlotGroupModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationOverlayModel;->c()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationOverlayModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationOverlayModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationMediaWithCaptionModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->b()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_d
    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {}, Lcom/whoop/design/models/celebration/CelebrationButtonsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {}, Lcom/whoop/design/models/celebration/AnimationModeModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {}, Lcom/whoop/sanguine/domain/models/SanguineWaitlistBiomarkersResponse;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_13
    invoke-static {}, Lcom/whoop/design/atomic/organism/dynamicinformationalimagecard/DynamicInformationalImageCardLayoutState;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_14
    invoke-static {}, Lcom/whoop/profile/samples/EditProfileSamples;->a()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    const-string v0, "\n<!DOCTYPE HTML>\n<html lang=\"en\">\n<head>\n    <title>hCaptcha Android</title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\"/>\n    <style>\n        * {\n            padding: 0;\n            margin: 0;\n        }\n        html {\n            height: 100%;\n        }\n        body {\n            display: table;\n            width: 100%;\n            height: 100%;\n            text-align: center;\n        }\n        #hcaptcha-container {\n            margin-top: 5px;\n            display: table-cell;\n            vertical-align: middle;\n        }\n        /* overwrite hCaptcha iframe overlay which adds a #FFF background with opacity 0.05 */\n        div > div:nth-child(2) {\n            opacity: 0 !important;\n        }\n    </style>\n</head>\n<body>\n<div id=\"hcaptcha-container\"></div>\n<script type=\"text/javascript\">\n    if (window.JSDI) {\n        JSON.parse(window.JSDI.getDebugInfo()).forEach(function (v) { window[v] = true; });\n        window.sysDebug = JSON.parse(window.JSDI.getSysDebug());\n    }\n</script>\n<script type=\"text/javascript\">\n    // Android will inject this bridge object as `JSInterface`\n    // Browser is missing it, so we mock it\n    var BridgeObject = window.JSInterface || {\n        getConfig: function getConfig() {\n            return JSON.stringify({\n                siteKey: \'10000000-ffff-ffff-ffff-000000000001\',\n                locale: \'ro\',\n                size: \'compact\',\n                orientation: \'portrait\',\n                theme: \'dark\',\n                sentry: true,\n                rqdata: null,\n                jsSrc: \'https://js.hcaptcha.com/1/api.js\',\n                endpoint: null,\n                assethost: null,\n                imghost: null,\n                reportapi: null\n            });\n        },\n        onPass: function onPass(token) {\n            return console.log(\"pass: token \".concat(token));\n        },\n        onError: function onError(errCode) {\n            return console.log(\"error: code \".concat(errCode));\n        },\n        onLoaded: function onLoaded() {\n            return console.log(\'cb: api is loaded\');\n        },\n        onOpen: function onOpen() {\n            return console.log(\'cb: challenge is visible\');\n        }\n    };\n    var bridgeConfig = JSON.parse(BridgeObject.getConfig());\n    var hCaptchaID = null;\n    /**\n     * Called programmatically from HCaptchaWebViewHelper.\n     */\n    function resetAndExecute() {\n        hcaptcha.reset();\n        hcaptcha.execute(hCaptchaID);\n    }\n    function reset() {\n        hcaptcha.reset();\n    }\n    function getTheme(bridgeConfig) {\n        var theme = bridgeConfig.theme;\n        var customTheme = bridgeConfig.customTheme;\n        if (customTheme) {\n            try {\n                return JSON.parse(customTheme);\n            } catch (e) {\n                console.error(e);\n                BridgeObject.onError(32);\n            }\n        }\n        return theme;\n    }\n    function getRenderConfig() {\n        return {\n            sitekey: bridgeConfig.siteKey,\n            size: bridgeConfig.size,\n            orientation: bridgeConfig.orientation,\n            theme: getTheme(bridgeConfig),\n            callback: function callback(token) {\n                return BridgeObject.onPass(token);\n            },\n            \'chalexpired-callback\': function chalexpiredCallback() {\n                return BridgeObject.onError(15);\n            },\n            \'close-callback\': function closeCallback() {\n                return BridgeObject.onError(30);\n            },\n            \'error-callback\': function errorCallback(error) {\n                switch(error) {\n                    case \"rate-limited\":\n                        return BridgeObject.onError(31);\n                    case \"network-error\":\n                        return BridgeObject.onError(7);\n                    case \"invalid-data\":\n                        return BridgeObject.onError(8);\n                    case \"challenge-error\":\n                        return BridgeObject.onError(9);\n                    case \"internal-error\":\n                        return BridgeObject.onError(10);\n                    default:\n                        // Error not handled? Log it for debugging purposes\n                        console.error(error);\n                        return BridgeObject.onError(29);\n                }\n            },\n            \'open-callback\': function openCallback() {\n                return BridgeObject.onOpen();\n            }\n        };\n    }\n    function onHcaptchaLoaded() {\n        try {\n            var renderConfig = getRenderConfig();\n            hCaptchaID = hcaptcha.render(\'hcaptcha-container\', renderConfig);\n            BridgeObject.onLoaded();\n            var rqdata = bridgeConfig.rqdata;\n            if (rqdata) {\n                hcaptcha.setData(hCaptchaID, { rqdata: rqdata });\n            }\n            if (renderConfig.size === \'invisible\' && !bridgeConfig.hideDialog) {\n                // We want to auto execute in case of `invisible` checkbox.\n                // But not in case of `hideDialog` since verification process\n                // might be desired to happen at a later time.\n                hcaptcha.execute(hCaptchaID);\n            }\n        } catch (e) {\n            console.error(e);\n            BridgeObject.onError(29);\n        }\n    }\n    function addQueryParamIfDefined(url, queryName, queryValue) {\n        if (queryValue !== undefined && queryValue !== null) {\n            var link = url.indexOf(\'?\') !== -1 ? \'&\' : \'?\';\n            return url + link + queryName + \'=\' + encodeURIComponent(queryValue);\n        }\n        return url;\n    }\n    function loadApi() {\n        var siteKey = bridgeConfig.siteKey;\n        var locale = bridgeConfig.locale;\n        var sentry = bridgeConfig.sentry;\n        var jsSrc = bridgeConfig.jsSrc;\n        var endpoint = bridgeConfig.endpoint;\n        var assethost = bridgeConfig.assethost;\n        var imghost = bridgeConfig.imghost;\n        var reportapi = bridgeConfig.reportapi;\n        var host = bridgeConfig.host || siteKey + \'.android-sdk.hcaptcha.com\';\n        var scriptSrc = jsSrc + \'?render=explicit&onload=\' + onHcaptchaLoaded.name;\n        scriptSrc = addQueryParamIfDefined(scriptSrc, \'recaptchacompat\', \'off\');\n        scriptSrc = addQueryParamIfDefined(scriptSrc, \'hl\', locale);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, \'host\', host);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, \'sentry\', sentry);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, \'endpoint\', endpoint);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, \'assethost\', assethost);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, \'imghost\', imghost);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, \'reportapi\', reportapi);\n        if (bridgeConfig.customTheme) {\n            scriptSrc = addQueryParamIfDefined(scriptSrc, \'custom\', \'true\');\n        }\n        var script = document.createElement(\'script\');\n        script.async = true;\n        script.src = scriptSrc;\n        script.onerror = function () {\n            // network issue\n            BridgeObject.onError(7);\n        };\n        document.head.appendChild(script);\n    }\n    var container = document.getElementById(\"hcaptcha-container\");\n    container.addEventListener(\"click\", function () {\n        if (window.hcaptcha) {\n            // Allows dismissal of checkbox view\n            window.hcaptcha.close();\n        } else {\n            BridgeObject.onError(30);\n        }\n    });\n    loadApi();\n</script>\n</body>\n</html>\n"

    return-object v0

    :pswitch_16
    invoke-static {}, Lcom/whoop/onboardingpersonalization/dayzero/header/models/DayZeroHeaderWidgetsModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_17
    new-instance v0, Ly3/j;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ly3/j;-><init>(J)V

    return-object v0

    :pswitch_18
    new-instance v0, Ly3/j;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ly3/j;-><init>(J)V

    return-object v0

    :pswitch_19
    invoke-static {}, Lty1/i;->s()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    invoke-static {}, Lty1/i;->y()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    invoke-static {}, Lty1/i;->l()Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    invoke-static {}, Lty1/i;->d()Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
