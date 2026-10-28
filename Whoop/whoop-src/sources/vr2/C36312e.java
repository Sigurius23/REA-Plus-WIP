package vr2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.util.regex.Pattern;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: vr2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lvr2/e;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "b", "Ljava/lang/String;", "androidId", "c", "brand", "d", "model", "e", "()Ljava/lang/String;", "deviceId", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36312e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SuppressLint({"HardwareIds"})
    private final String androidId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String brand;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String model;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String deviceId;

    public C36312e(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        AbstractC22676k.m65749i(string, "getString(...)");
        this.androidId = string;
        String BRAND = Build.BRAND;
        AbstractC22676k.m65749i(BRAND, "BRAND");
        Pattern patternCompile = Pattern.compile("\\s");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(BRAND).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        String strConcat = strReplaceAll.concat("_");
        this.brand = strConcat;
        String MODEL = Build.MODEL;
        AbstractC22676k.m65749i(MODEL, "MODEL");
        Pattern patternCompile2 = Pattern.compile("\\s");
        AbstractC22676k.m65749i(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(MODEL).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll2, "replaceAll(...)");
        String strConcat2 = strReplaceAll2.concat("_");
        this.model = strConcat2;
        this.deviceId = AbstractC31061c.m95640p("Android_", strConcat, strConcat2, string);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }
}
