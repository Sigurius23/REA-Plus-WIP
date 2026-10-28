package iq0;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.repositories.LanguageRepository;
import io.getstream.chat.android.client.api.QueryParams;
import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;
import l83.C23454a0;
import l83.C23465k;
import p093dl.C12144i;
import p093dl.C12146k;
import p093dl.C12148m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: iq0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Liq0/q;", "", "<init>", "()V", "", QueryParams.URL, "Ll83/k;", "header", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "b", "(Ljava/lang/String;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/content/Context;", "context", "Ltr2/n;", "logger", "Landroid/net/Uri;", "a", "(Landroid/graphics/Bitmap;Landroid/content/Context;Ltr2/n;)Landroid/net/Uri;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20838q {

    /* JADX INFO: renamed from: a */
    public static final C20838q f78353a = new C20838q();

    private C20838q() {
    }

    /* JADX INFO: renamed from: a */
    public final Uri m57556a(Bitmap bitmap, Context context, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        File file = new File(context.getExternalCacheDir(), "images");
        try {
            file.mkdirs();
            File file2 = new File(file, UUID.randomUUID() + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file2);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(fileOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            logger.mo85222m("Exception occurred while getting the widget image uri: " + C23454a0.f92919a, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m57557b(String url, C23465k header, PreferenceHelper preferenceHelper) {
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        if (url == null) {
            return null;
        }
        if (header == null) {
            return url;
        }
        C12146k c12146k = new C12146k();
        c12146k.m33608a((String) header.f92937w, (String) header.f92938x);
        c12146k.m33608a("Accept-Language", LanguageRepository.INSTANCE.getAcceptLanguageHeaderValue(preferenceHelper, null));
        c12146k.f40391a = true;
        return new C12144i(url, new C12148m(c12146k.f40392b));
    }
}
