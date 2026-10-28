package ty1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.dynamicinformationalimagecard.DynamicInformationalImageCardLayoutState;
import com.whoop.design.models.celebration.AnimationModeModel;
import com.whoop.design.models.celebration.CelebrationButtonsModel;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.celebration.CelebrationMediaWithCaptionModel;
import com.whoop.design.models.celebration.CelebrationOverlayModel;
import com.whoop.design.models.celebration.DynamicLottieModel;
import com.whoop.design.models.celebration.SlotGroupModel;
import com.whoop.design.models.celebration.SlotModeModel;
import com.whoop.design.models.celebration.SlotOptionsModel;
import com.whoop.onboardingpersonalization.dayzero.header.models.DayZeroHeaderWidgetsModel;
import com.whoop.sanguine.domain.models.SanguineWaitlistBiomarkersResponse;
import com.whoop.sanguine.domain.models.SanguineWaitlistResponse;
import com.whoop.sanguine.domain.models.SanguineWaitlistSection;
import l83.C23454a0;
import p636y3.C39178j;

/* JADX INFO: renamed from: ty1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34260e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143698w;

    public /* synthetic */ C34260e(int i13) {
        this.f143698w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f143698w) {
            case 0:
                return AbstractC34264i.m108325B();
            case 1:
                return AbstractC34264i.m108345V();
            case 2:
                return AbstractC34264i.m108346W();
            case 3:
                return AbstractC34264i.m108332I();
            case 4:
                return new C39178j(0L);
            case 5:
                return new C39178j(0L);
            case 6:
                return DayZeroHeaderWidgetsModel._childSerializers$_anonymous_();
            case 7:
                return "\n<!DOCTYPE HTML>\n<html lang=\"en\">\n<head>\n    <title>hCaptcha Android</title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\"/>\n    <style>\n        * {\n            padding: 0;\n            margin: 0;\n        }\n        html {\n            height: 100%;\n        }\n        body {\n            display: table;\n            width: 100%;\n            height: 100%;\n            text-align: center;\n        }\n        #hcaptcha-container {\n            margin-top: 5px;\n            display: table-cell;\n            vertical-align: middle;\n        }\n        /* overwrite hCaptcha iframe overlay which adds a #FFF background with opacity 0.05 */\n        div > div:nth-child(2) {\n            opacity: 0 !important;\n        }\n    </style>\n</head>\n<body>\n<div id=\"hcaptcha-container\"></div>\n<script type=\"text/javascript\">\n    if (window.JSDI) {\n        JSON.parse(window.JSDI.getDebugInfo()).forEach(function (v) { window[v] = true; });\n        window.sysDebug = JSON.parse(window.JSDI.getSysDebug());\n    }\n</script>\n<script type=\"text/javascript\">\n    // Android will inject this bridge object as `JSInterface`\n    // Browser is missing it, so we mock it\n    var BridgeObject = window.JSInterface || {\n        getConfig: function getConfig() {\n            return JSON.stringify({\n                siteKey: '10000000-ffff-ffff-ffff-000000000001',\n                locale: 'ro',\n                size: 'compact',\n                orientation: 'portrait',\n                theme: 'dark',\n                sentry: true,\n                rqdata: null,\n                jsSrc: 'https://js.hcaptcha.com/1/api.js',\n                endpoint: null,\n                assethost: null,\n                imghost: null,\n                reportapi: null\n            });\n        },\n        onPass: function onPass(token) {\n            return console.log(\"pass: token \".concat(token));\n        },\n        onError: function onError(errCode) {\n            return console.log(\"error: code \".concat(errCode));\n        },\n        onLoaded: function onLoaded() {\n            return console.log('cb: api is loaded');\n        },\n        onOpen: function onOpen() {\n            return console.log('cb: challenge is visible');\n        }\n    };\n    var bridgeConfig = JSON.parse(BridgeObject.getConfig());\n    var hCaptchaID = null;\n    /**\n     * Called programmatically from HCaptchaWebViewHelper.\n     */\n    function resetAndExecute() {\n        hcaptcha.reset();\n        hcaptcha.execute(hCaptchaID);\n    }\n    function reset() {\n        hcaptcha.reset();\n    }\n    function getTheme(bridgeConfig) {\n        var theme = bridgeConfig.theme;\n        var customTheme = bridgeConfig.customTheme;\n        if (customTheme) {\n            try {\n                return JSON.parse(customTheme);\n            } catch (e) {\n                console.error(e);\n                BridgeObject.onError(32);\n            }\n        }\n        return theme;\n    }\n    function getRenderConfig() {\n        return {\n            sitekey: bridgeConfig.siteKey,\n            size: bridgeConfig.size,\n            orientation: bridgeConfig.orientation,\n            theme: getTheme(bridgeConfig),\n            callback: function callback(token) {\n                return BridgeObject.onPass(token);\n            },\n            'chalexpired-callback': function chalexpiredCallback() {\n                return BridgeObject.onError(15);\n            },\n            'close-callback': function closeCallback() {\n                return BridgeObject.onError(30);\n            },\n            'error-callback': function errorCallback(error) {\n                switch(error) {\n                    case \"rate-limited\":\n                        return BridgeObject.onError(31);\n                    case \"network-error\":\n                        return BridgeObject.onError(7);\n                    case \"invalid-data\":\n                        return BridgeObject.onError(8);\n                    case \"challenge-error\":\n                        return BridgeObject.onError(9);\n                    case \"internal-error\":\n                        return BridgeObject.onError(10);\n                    default:\n                        // Error not handled? Log it for debugging purposes\n                        console.error(error);\n                        return BridgeObject.onError(29);\n                }\n            },\n            'open-callback': function openCallback() {\n                return BridgeObject.onOpen();\n            }\n        };\n    }\n    function onHcaptchaLoaded() {\n        try {\n            var renderConfig = getRenderConfig();\n            hCaptchaID = hcaptcha.render('hcaptcha-container', renderConfig);\n            BridgeObject.onLoaded();\n            var rqdata = bridgeConfig.rqdata;\n            if (rqdata) {\n                hcaptcha.setData(hCaptchaID, { rqdata: rqdata });\n            }\n            if (renderConfig.size === 'invisible' && !bridgeConfig.hideDialog) {\n                // We want to auto execute in case of `invisible` checkbox.\n                // But not in case of `hideDialog` since verification process\n                // might be desired to happen at a later time.\n                hcaptcha.execute(hCaptchaID);\n            }\n        } catch (e) {\n            console.error(e);\n            BridgeObject.onError(29);\n        }\n    }\n    function addQueryParamIfDefined(url, queryName, queryValue) {\n        if (queryValue !== undefined && queryValue !== null) {\n            var link = url.indexOf('?') !== -1 ? '&' : '?';\n            return url + link + queryName + '=' + encodeURIComponent(queryValue);\n        }\n        return url;\n    }\n    function loadApi() {\n        var siteKey = bridgeConfig.siteKey;\n        var locale = bridgeConfig.locale;\n        var sentry = bridgeConfig.sentry;\n        var jsSrc = bridgeConfig.jsSrc;\n        var endpoint = bridgeConfig.endpoint;\n        var assethost = bridgeConfig.assethost;\n        var imghost = bridgeConfig.imghost;\n        var reportapi = bridgeConfig.reportapi;\n        var host = bridgeConfig.host || siteKey + '.android-sdk.hcaptcha.com';\n        var scriptSrc = jsSrc + '?render=explicit&onload=' + onHcaptchaLoaded.name;\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'recaptchacompat', 'off');\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'hl', locale);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'host', host);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'sentry', sentry);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'endpoint', endpoint);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'assethost', assethost);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'imghost', imghost);\n        scriptSrc = addQueryParamIfDefined(scriptSrc, 'reportapi', reportapi);\n        if (bridgeConfig.customTheme) {\n            scriptSrc = addQueryParamIfDefined(scriptSrc, 'custom', 'true');\n        }\n        var script = document.createElement('script');\n        script.async = true;\n        script.src = scriptSrc;\n        script.onerror = function () {\n            // network issue\n            BridgeObject.onError(7);\n        };\n        document.head.appendChild(script);\n    }\n    var container = document.getElementById(\"hcaptcha-container\");\n    container.addEventListener(\"click\", function () {\n        if (window.hcaptcha) {\n            // Allows dismissal of checkbox view\n            window.hcaptcha.close();\n        } else {\n            BridgeObject.onError(30);\n        }\n    });\n    loadApi();\n</script>\n</body>\n</html>\n";
            case 8:
                return C23454a0.f92919a;
            case 9:
                return DynamicInformationalImageCardLayoutState._init_$_anonymous_();
            case 10:
                return SanguineWaitlistBiomarkersResponse._childSerializers$_anonymous_();
            case 11:
                return SanguineWaitlistResponse._childSerializers$_anonymous_();
            case 12:
                return SanguineWaitlistSection._childSerializers$_anonymous_();
            case 13:
                return AnimationModeModel._init_$_anonymous_();
            case 14:
                return CelebrationButtonsModel._childSerializers$_anonymous_();
            case 15:
                return CelebrationMediaModel._childSerializers$_anonymous_();
            case 16:
                return CelebrationMediaModel._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return CelebrationMediaWithCaptionModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return CelebrationOverlayModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return CelebrationOverlayModel._childSerializers$_anonymous_$0();
            case 20:
                return CelebrationOverlayModel._childSerializers$_anonymous_$1();
            case 21:
                return DynamicLottieModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return DynamicLottieModel._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return DynamicLottieModel._childSerializers$_anonymous_$1();
            case 24:
                return SlotGroupModel._childSerializers$_anonymous_();
            case 25:
                return SlotGroupModel._childSerializers$_anonymous_$0();
            case 26:
                return SlotModeModel._init_$_anonymous_();
            case 27:
                return SlotOptionsModel._init_$_anonymous_();
            case 28:
                return SlotOptionsModel.BooleanOptionsModel._childSerializers$_anonymous_();
            default:
                return SlotOptionsModel.CumulativeOptionsModel._childSerializers$_anonymous_();
        }
    }
}
