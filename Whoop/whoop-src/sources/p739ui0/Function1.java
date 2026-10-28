package p739ui0;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$TakePicture;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.content.FileProvider;
import bm2.C3424a0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import l83.C23454a0;
import p000.AbstractC11266d;
import p179h.C16351i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p479s4.AbstractC32122c;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import u91.C34656a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ui0.c, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\f\u001a\u00020\u000b2\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0002*\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006&²\u0006\u001a\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u001e\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00068\nX\u008a\u0084\u0002²\u0006\u0010\u0010!\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\"\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006*\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010#j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001`$8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function1;", "", "Ll83/a0;", "onResult", "Lkotlin/Function0;", "onUnavailable", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/io/File;", "Landroid/net/Uri;", "captureUriFor", "Lui0/a;", "l", "(Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Lui0/a;", "context", "i", "(Landroid/content/Context;)Ljava/io/File;", "g", "file", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;", "", "k", "(Ljava/io/File;)Z", "j", "(Ljava/io/File;)V", "Ltr2/n;", "a", "Ltr2/n;", "logger", "currentOnResult", "currentOnUnavailable", "currentCaptureUriFor", "capturePath", "captureStateKey", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "keptCaptures", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f148070a = InterfaceC34116n.INSTANCE.m107848a("CameraCaptureLauncher");

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final InterfaceC28601c1 m110484A() {
        return AbstractC28683x.m87272z(new HashMap());
    }

    /* JADX INFO: renamed from: B */
    private static final void m110485B(Context context, C16351i c16351i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t3) {
        File fileM110494i = m110494i(context);
        if (fileM110494i == null) {
            m110511z(interfaceC28601c1, null);
            m110499n(interfaceC28670t2).invoke();
            return;
        }
        m110508w(interfaceC28601c2, fileM110494i.getAbsolutePath());
        try {
            c16351i.mo4052a(m110505t(interfaceC28670t3).invoke(context, fileM110494i), null);
        } catch (ActivityNotFoundException e5) {
            f148070a.mo85222m(AbstractC11266d.m30461o("No camera app to open: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(e5.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
            m110508w(interfaceC28601c2, null);
            m110511z(interfaceC28601c1, null);
            m110495j(fileM110494i);
            m110499n(interfaceC28670t2).invoke();
        }
    }

    /* JADX INFO: renamed from: g */
    private static final File m110492g(Context context) {
        File file = new File(context.getCacheDir(), "media_captures");
        file.mkdirs();
        return file;
    }

    /* JADX INFO: renamed from: h */
    public static final Uri m110493h(Context context, File file) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(file, "file");
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
        AbstractC22676k.m65749i(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    /* JADX INFO: renamed from: i */
    private static final File m110494i(Context context) {
        try {
            return File.createTempFile("capture_", ".jpg", m110492g(context));
        } catch (IOException e5) {
            f148070a.mo85222m(AbstractC11266d.m30461o("Could not create a file for the camera to write to: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(e5.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private static final void m110495j(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        f148070a.mo85222m("Could not delete a capture file", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m110496k(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC34999a m110497l(p715kotlin.jvm.functions.Function1 onResult, InterfaceC4339a onUnavailable, InterfaceC4351m captureUriFor, Composer composer, int i13) {
        AbstractC22676k.m65750j(onResult, "onResult");
        AbstractC22676k.m65750j(onUnavailable, "onUnavailable");
        AbstractC22676k.m65750j(captureUriFor, "captureUriFor");
        C28655q c28655q = (C28655q) composer;
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(onResult, c28655q);
        InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(onUnavailable, c28655q);
        InterfaceC28601c1 interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(captureUriFor, c28655q);
        Object[] objArr = new Object[0];
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C34656a(16);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 48);
        Object[] objArr2 = new Object[0];
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C34656a(17);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R2, c28655q, 48);
        Object[] objArr3 = new Object[0];
        Object objM87133R3 = c28655q.m87133R();
        if (objM87133R3 == c28676v0) {
            objM87133R3 = new C34656a(18);
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R3, c28655q, 48);
        ActivityResultContracts$TakePicture activityResultContracts$TakePicture = new ActivityResultContracts$TakePicture();
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c1M87238F2) | c28655q.m87153g(interfaceC28601c3) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC28601c1M87238F3) | c28655q.m87157i(context);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87153g || objM87133R4 == c28676v0) {
            objM87133R4 = new C3424a0(context, interfaceC28601c1, interfaceC28601c2, interfaceC28601c1M87238F2, interfaceC28601c3, interfaceC28601c1M87238F, interfaceC28601c1M87238F3);
            c28655q.m87172p0(objM87133R4);
        }
        C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$TakePicture, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q, 0);
        ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
        boolean zM87157i = c28655q.m87157i(context) | c28655q.m87153g(interfaceC28601c2) | c28655q.m87153g(interfaceC28601c1M87238F2) | c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(c16351iM118972a0) | c28655q.m87153g(interfaceC28601c1M87238F3) | c28655q.m87153g(interfaceC28601c1M87238F);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i || objM87133R5 == c28676v0) {
            C3424a0 c3424a0 = new C3424a0((Object) context, (Object) c16351iM118972a0, interfaceC28601c2, interfaceC28601c1M87238F2, interfaceC28601c1, interfaceC28601c1M87238F3, interfaceC28601c1M87238F, 14);
            interfaceC28601c1 = interfaceC28601c1;
            interfaceC28601c1M87238F3 = interfaceC28601c1M87238F3;
            c28655q.m87172p0(c3424a0);
            objM87133R5 = c3424a0;
        }
        C16351i c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission, (p715kotlin.jvm.functions.Function1) objM87133R5, c28655q, 0);
        boolean zM87153g2 = c28655q.m87153g(context) | c28655q.m87153g(c16351iM118972a0) | c28655q.m87153g(c16351iM118972a1);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87153g2 || objM87133R6 == c28676v0) {
            objM87133R6 = new C35000b(context, c16351iM118972a1, interfaceC28601c2, c16351iM118972a0, interfaceC28601c1M87238F2, interfaceC28601c1, interfaceC28601c1M87238F3);
            c28655q.m87172p0(objM87133R6);
        }
        return (InterfaceC34999a) objM87133R6;
    }

    /* JADX INFO: renamed from: m */
    private static final p715kotlin.jvm.functions.Function1 m110498m(InterfaceC28670t2 interfaceC28670t2) {
        return (p715kotlin.jvm.functions.Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: n */
    private static final InterfaceC4339a m110499n(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC4339a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: o */
    private static final HashMap<String, String> m110500o(InterfaceC28601c1 interfaceC28601c1) {
        return (HashMap) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m110501p(InterfaceC28601c1 interfaceC28601c1, HashMap<String, String> map) {
        interfaceC28601c1.setValue(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m110502q(Context context, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, boolean z4) {
        String strM110507v = m110507v(interfaceC28601c1);
        File file = strM110507v != null ? new File(strM110507v) : null;
        String strM110510y = m110510y(interfaceC28601c2);
        m110508w(interfaceC28601c1, null);
        m110511z(interfaceC28601c2, null);
        if (file == null) {
            f148070a.mo85222m("Camera returned with no file to read", new AbstractC30556a.a[0]);
            m110499n(interfaceC28670t2).invoke();
        } else if (z4 && !m110496k(file)) {
            f148070a.mo85222m("Camera reported success but wrote nothing readable", new AbstractC30556a.a[0]);
            m110495j(file);
            m110499n(interfaceC28670t2).invoke();
        } else if (z4) {
            if (strM110510y != null) {
                String str = m110500o(interfaceC28601c3).get(strM110510y);
                if (str != null) {
                    m110495j(new File(str));
                }
                HashMap map = new HashMap(m110500o(interfaceC28601c3));
                map.put(strM110510y, file.getAbsolutePath());
                m110501p(interfaceC28601c3, map);
            }
            m110498m(interfaceC28670t3).invoke(((Uri) m110505t(interfaceC28670t4).invoke(context, file)).toString());
        } else {
            m110495j(file);
            m110498m(interfaceC28670t3).invoke(null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m110503r(Context context, C16351i c16351i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, boolean z4) {
        if (z4) {
            m110485B(context, c16351i, interfaceC28601c1, interfaceC28670t2, interfaceC28601c2, interfaceC28670t3);
        } else {
            m110511z(interfaceC28601c1, null);
            f148070a.mo85228t("Camera permission denied; leaving the screen as it was", new AbstractC30556a.a[0]);
            m110498m(interfaceC28670t4).invoke(null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m110504s(Context context, C16351i c16351i, InterfaceC28601c1 interfaceC28601c1, C16351i c16351i2, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t3, String stateKey) {
        AbstractC22676k.m65750j(stateKey, "stateKey");
        m110511z(interfaceC28601c1, stateKey);
        if (AbstractC32122c.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
            m110485B(context, c16351i2, interfaceC28601c1, interfaceC28670t2, interfaceC28601c2, interfaceC28670t3);
        } else {
            c16351i.mo4052a("android.permission.CAMERA", null);
        }
    }

    /* JADX INFO: renamed from: t */
    private static final InterfaceC4351m m110505t(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC4351m) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC28601c1 m110506u() {
        return AbstractC28683x.m87272z(null);
    }

    /* JADX INFO: renamed from: v */
    private static final String m110507v(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: w */
    private static final void m110508w(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final InterfaceC28601c1 m110509x() {
        return AbstractC28683x.m87272z(null);
    }

    /* JADX INFO: renamed from: y */
    private static final String m110510y(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: z */
    private static final void m110511z(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }
}
