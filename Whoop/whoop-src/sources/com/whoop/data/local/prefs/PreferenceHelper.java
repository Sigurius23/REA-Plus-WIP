package com.whoop.data.local.prefs;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.List;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u92.C34660d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\f2\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0#\"\u00020\b¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020'2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b.\u0010\u000eJ\u001f\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b/\u0010\u0011J#\u00102\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\b00¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b4\u0010\u0014J\u001f\u00105\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b5\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106¨\u00067"}, m65681d2 = {"Lcom/whoop/data/local/prefs/PreferenceHelper;", "", "Lu92/d;", "mainPrefsStore", "featurePrefs", "languagePrefs", "<init>", "(Lu92/d;Lu92/d;Lu92/d;)V", "", "key", "", NotificationCompat.CATEGORY_STATUS, "Ll83/a0;", "putBooleanValueIntoMainPrefs", "(Ljava/lang/String;Z)V", "defaultValue", "getBooleanValueFromMainPrefs", "(Ljava/lang/String;Z)Z", "value", "putStringValueIntoMainPrefs", "(Ljava/lang/String;Ljava/lang/String;)V", "getStringValueFromMainPrefs", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getNullableStringFromMainPrefs", "(Ljava/lang/String;)Ljava/lang/String;", "", "putIntValueIntoMainPrefs", "(Ljava/lang/String;I)V", "getIntValueFromMainPrefs", "(Ljava/lang/String;I)I", "", "putLongValueIntoMainPrefs", "(Ljava/lang/String;J)V", "getLongValueFromMainPrefs", "(Ljava/lang/String;J)J", "", "keys", "removeFromMainPrefs", "([Ljava/lang/String;)V", "", "putFloatValueIntoMainPrefs", "(Ljava/lang/String;F)V", "getFloatValueFromMainPrefs", "(Ljava/lang/String;F)F", "mainPrefsContains", "(Ljava/lang/String;)Z", "putBooleanValueIntoFeaturePrefs", "getBooleanValueFromFeaturePrefs", "", "listValues", "putListOfStringsIntoFeaturePrefs", "(Ljava/lang/String;Ljava/util/List;)V", "putStringValueIntoLanguagePrefs", "getStringValueFromLanguagePrefs", "Lu92/d;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class PreferenceHelper {
    private final C34660d featurePrefs;
    private final C34660d languagePrefs;
    private final C34660d mainPrefsStore;

    public PreferenceHelper(C34660d mainPrefsStore, C34660d featurePrefs, C34660d languagePrefs) {
        AbstractC22676k.m65750j(mainPrefsStore, "mainPrefsStore");
        AbstractC22676k.m65750j(featurePrefs, "featurePrefs");
        AbstractC22676k.m65750j(languagePrefs, "languagePrefs");
        this.mainPrefsStore = mainPrefsStore;
        this.featurePrefs = featurePrefs;
        this.languagePrefs = languagePrefs;
    }

    public static /* synthetic */ boolean getBooleanValueFromFeaturePrefs$default(PreferenceHelper preferenceHelper, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return preferenceHelper.getBooleanValueFromFeaturePrefs(str, z4);
    }

    public static /* synthetic */ boolean getBooleanValueFromMainPrefs$default(PreferenceHelper preferenceHelper, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return preferenceHelper.getBooleanValueFromMainPrefs(str, z4);
    }

    public static /* synthetic */ int getIntValueFromMainPrefs$default(PreferenceHelper preferenceHelper, String str, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return preferenceHelper.getIntValueFromMainPrefs(str, i13);
    }

    public static /* synthetic */ long getLongValueFromMainPrefs$default(PreferenceHelper preferenceHelper, String str, long j7, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            j7 = 0;
        }
        return preferenceHelper.getLongValueFromMainPrefs(str, j7);
    }

    public static /* synthetic */ String getStringValueFromLanguagePrefs$default(PreferenceHelper preferenceHelper, String str, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        return preferenceHelper.getStringValueFromLanguagePrefs(str, str2);
    }

    public static /* synthetic */ String getStringValueFromMainPrefs$default(PreferenceHelper preferenceHelper, String str, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        return preferenceHelper.getStringValueFromMainPrefs(str, str2);
    }

    public final boolean getBooleanValueFromFeaturePrefs(String key, boolean defaultValue) {
        AbstractC22676k.m65750j(key, "key");
        return this.featurePrefs.m109528e(key, defaultValue);
    }

    public final boolean getBooleanValueFromMainPrefs(String key, boolean defaultValue) {
        AbstractC22676k.m65750j(key, "key");
        return this.mainPrefsStore.m109528e(key, defaultValue);
    }

    public final float getFloatValueFromMainPrefs(String key, float defaultValue) {
        AbstractC22676k.m65750j(key, "key");
        return this.mainPrefsStore.m109530g(key, defaultValue);
    }

    public final int getIntValueFromMainPrefs(String key, int defaultValue) {
        AbstractC22676k.m65750j(key, "key");
        return this.mainPrefsStore.m109531h(key, defaultValue);
    }

    public final long getLongValueFromMainPrefs(String key, long defaultValue) {
        AbstractC22676k.m65750j(key, "key");
        return this.mainPrefsStore.m109532i(key, defaultValue);
    }

    public final String getNullableStringFromMainPrefs(String key) {
        AbstractC22676k.m65750j(key, "key");
        return this.mainPrefsStore.m109533j(key);
    }

    public final String getStringValueFromLanguagePrefs(String key, String defaultValue) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(defaultValue, "defaultValue");
        String strM109534k = this.languagePrefs.m109534k(key, defaultValue);
        return strM109534k == null ? "" : strM109534k;
    }

    public final String getStringValueFromMainPrefs(String key, String defaultValue) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(defaultValue, "defaultValue");
        String strM109534k = this.mainPrefsStore.m109534k(key, defaultValue);
        return strM109534k == null ? "" : strM109534k;
    }

    public final boolean mainPrefsContains(String key) {
        AbstractC22676k.m65750j(key, "key");
        return this.mainPrefsStore.m109526c(key);
    }

    public final void putBooleanValueIntoFeaturePrefs(String key, boolean status) {
        AbstractC22676k.m65750j(key, "key");
        this.featurePrefs.m109538q(key, status);
    }

    public final void putBooleanValueIntoMainPrefs(String key, boolean status) {
        AbstractC22676k.m65750j(key, "key");
        this.mainPrefsStore.m109538q(key, status);
    }

    public final void putFloatValueIntoMainPrefs(String key, float value) {
        AbstractC22676k.m65750j(key, "key");
        this.mainPrefsStore.m109540s(key, value);
    }

    public final void putIntValueIntoMainPrefs(String key, int value) {
        AbstractC22676k.m65750j(key, "key");
        this.mainPrefsStore.m109541t(key, value);
    }

    public final void putListOfStringsIntoFeaturePrefs(String key, List<String> listValues) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(listValues, "listValues");
        this.featurePrefs.m109544w(key, listValues);
    }

    public final void putLongValueIntoMainPrefs(String key, long value) {
        AbstractC22676k.m65750j(key, "key");
        this.mainPrefsStore.m109542u(key, value);
    }

    public final void putStringValueIntoLanguagePrefs(String key, String value) {
        AbstractC22676k.m65750j(key, "key");
        this.languagePrefs.m109543v(key, value);
    }

    public final void putStringValueIntoMainPrefs(String key, String value) {
        AbstractC22676k.m65750j(key, "key");
        this.mainPrefsStore.m109543v(key, value);
    }

    public final void removeFromMainPrefs(String... keys) {
        AbstractC22676k.m65750j(keys, "keys");
        this.mainPrefsStore.m109537p((String[]) Arrays.copyOf(keys, keys.length));
    }
}
