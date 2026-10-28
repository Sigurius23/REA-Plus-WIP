package ur2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import or2.C28162g;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uv0.AbstractC35283c;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: ur2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u00020\u0006*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lur2/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "authority", "Ljava/io/File;", "compressedFile", "Lor2/g;", "buildConfigProvider", "strapSerial", "Landroid/content/Intent;", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Lor2/g;Ljava/lang/String;)Landroid/content/Intent;", "a", "(Lor2/g;)Ljava/lang/String;", "appVersion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35201c {
    /* JADX INFO: renamed from: a */
    private final String m111540a(C28162g c28162g) {
        return AbstractC25012a.m73373f(c28162g.getVersionCode(), c28162g.getVersionName(), " - ");
    }

    /* JADX INFO: renamed from: b */
    public final Intent m111541b(Context context, String authority, File compressedFile, C28162g buildConfigProvider, String strapSerial) throws IOException {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(authority, "authority");
        AbstractC22676k.m65750j(compressedFile, "compressedFile");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        Uri uriForFile = FileProvider.getUriForFile(context, authority, compressedFile);
        String applicationId = buildConfigProvider.getApplicationId();
        String strM111540a = m111540a(buildConfigProvider);
        int sdkInt = buildConfigProvider.getSdkInt();
        StringBuilder sbM32001t = AbstractC11895b.m32001t("\n            App ID: ", applicationId, "\n            App Version: ", strM111540a, "\n            Android Version: ");
        sbM32001t.append(sdkInt);
        sbM32001t.append("\n        ");
        String strM125909s = AbstractC39415s.m125909s(sbM32001t.toString());
        if (strapSerial != null) {
            strM125909s = ((Object) strM125909s) + "\nLast Serial: " + strapSerial;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.SUBJECT", "WHOOP Support Logs");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{context.getString(AbstractC35283c.f150187d)});
        intent.putExtra("android.intent.extra.TEXT", "By submitting this support request, you acknowledge and understand that Whoop utilizes a third-party large language model partner to offer personalized support services using the information you provide.  Please avoid sharing sensitive information as part of your request for support services.\n\n" + ((Object) strM125909s) + "\n\nPlease describe the issue you’re facing:");
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        AbstractC22676k.m65749i(intentCreateChooser, "createChooser(...)");
        return intentCreateChooser;
    }
}
