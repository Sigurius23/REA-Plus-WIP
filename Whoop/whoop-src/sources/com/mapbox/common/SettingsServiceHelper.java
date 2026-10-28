package com.mapbox.common;

import android.content.SharedPreferences;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.None;
import ih0.AbstractC18489d0;
import java.util.List;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m65681d2 = {"Lcom/mapbox/common/SettingsServiceHelper;", "", "()V", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class SettingsServiceHelper {
    private static final String MAPBOX_PREFERENCES_NAME = "mapbox_settings";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h preferences$delegate = AbstractC30060g.m92088H(SettingsServiceHelper$Companion$preferences$2.INSTANCE);

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J3\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b0\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lcom/mapbox/common/SettingsServiceHelper$Companion;", "", "<init>", "()V", "Ll83/a0;", "clear$common_release", "clear", "", "key", "value", "Lcom/mapbox/bindgen/Expected;", "", "set", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "get", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "erase", "", "has", "(Ljava/lang/String;)Z", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "preferences$delegate", "Ll83/h;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences", "MAPBOX_PREFERENCES_NAME", "Ljava/lang/String;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SharedPreferences getPreferences() {
            return (SharedPreferences) SettingsServiceHelper.preferences$delegate.getValue();
        }

        public final void clear$common_release() {
            SharedPreferences.Editor editorEdit = getPreferences().edit();
            editorEdit.clear();
            editorEdit.apply();
        }

        public final Expected<String, None> erase(String key) {
            AbstractC22676k.m65750j(key, "key");
            try {
                SharedPreferences.Editor editorEdit = getPreferences().edit();
                editorEdit.remove(key);
                editorEdit.apply();
                Expected<String, None> expectedCreateNone = ExpectedFactory.createNone();
                AbstractC22676k.m65749i(expectedCreateNone, "createNone()");
                return expectedCreateNone;
            } catch (Exception e5) {
                String message = e5.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                Expected<String, None> expectedCreateError = ExpectedFactory.createError(message);
                AbstractC22676k.m65749i(expectedCreateError, "createError(exception.message ?: \"Unknown error\")");
                return expectedCreateError;
            }
        }

        public final Expected<String, String> get(String key) {
            AbstractC22676k.m65750j(key, "key");
            try {
                String string = getPreferences().getString(key, null);
                Expected<String, String> expectedCreateValue = string != null ? ExpectedFactory.createValue(string) : null;
                if (expectedCreateValue != null) {
                    return expectedCreateValue;
                }
                Expected<String, String> expectedCreateError = ExpectedFactory.createError("Key is not found");
                AbstractC22676k.m65749i(expectedCreateError, "createError(\"Key is not found\")");
                return expectedCreateError;
            } catch (ClassCastException e5) {
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Unable to get a value for ", key, ": ");
                sbM53375p.append(e5.getMessage());
                String string2 = sbM53375p.toString();
                Log.error(string2, "settings");
                Expected<String, String> expectedCreateError2 = ExpectedFactory.createError(string2);
                AbstractC22676k.m65749i(expectedCreateError2, "createError(errorMessage)");
                return expectedCreateError2;
            } catch (Exception e13) {
                String message = e13.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                Expected<String, String> expectedCreateError3 = ExpectedFactory.createError(message);
                AbstractC22676k.m65749i(expectedCreateError3, "createError(exception.message ?: \"Unknown error\")");
                return expectedCreateError3;
            }
        }

        public final boolean has(String key) {
            AbstractC22676k.m65750j(key, "key");
            try {
                return getPreferences().contains(key);
            } catch (Exception unused) {
                return false;
            }
        }

        public final Expected<String, List<String>> set(String key, String value) {
            AbstractC22676k.m65750j(key, "key");
            AbstractC22676k.m65750j(value, "value");
            Expected<String, String> expected = get(key);
            if (expected.isError() && !AbstractC22676k.m65745e(expected.getError(), "Key is not found")) {
                String error = expected.getError();
                AbstractC22676k.m65747g(error);
                Expected<String, List<String>> expectedCreateError = ExpectedFactory.createError(error);
                AbstractC22676k.m65749i(expectedCreateError, "createError(existingValue.error!!)");
                return expectedCreateError;
            }
            if (expected.isValue() && AbstractC22676k.m65745e(expected.getValue(), value)) {
                Expected<String, List<String>> expectedCreateValue = ExpectedFactory.createValue(AbstractC37056f.m118958J(value));
                AbstractC22676k.m65749i(expectedCreateValue, "createValue(listOf(value))");
                return expectedCreateValue;
            }
            String value2 = expected.isValue() ? expected.getValue() : null;
            try {
                SharedPreferences.Editor editorEdit = getPreferences().edit();
                editorEdit.putString(key, value);
                editorEdit.apply();
                Expected<String, List<String>> expectedCreateValue2 = ExpectedFactory.createValue(AbstractC37056f.m118958J(value2));
                AbstractC22676k.m65749i(expectedCreateValue2, "createValue(listOf(oldValue))");
                return expectedCreateValue2;
            } catch (Exception e5) {
                String message = e5.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                Expected<String, List<String>> expectedCreateError2 = ExpectedFactory.createError(message);
                AbstractC22676k.m65749i(expectedCreateError2, "createError(exception.message ?: \"Unknown error\")");
                return expectedCreateError2;
            }
        }

        private Companion() {
        }
    }

    public static final Expected<String, None> erase(String str) {
        return INSTANCE.erase(str);
    }

    public static final Expected<String, String> get(String str) {
        return INSTANCE.get(str);
    }

    public static final boolean has(String str) {
        return INSTANCE.has(str);
    }

    public static final Expected<String, List<String>> set(String str, String str2) {
        return INSTANCE.set(str, str2);
    }
}
