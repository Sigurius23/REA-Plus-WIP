package p734sl0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.activity.result.contract.ActivityResultContracts$TakePicture;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.content.FileProvider;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p179h.C16351i;
import p236j.C21062a;
import p267k.C22083d;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pp2.C29440d;
import qr2.AbstractC30556a;
import se.AbstractC32416g;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sl0.p2, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u00062\"\u0010\u0005\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lkotlin/Function2;", "", "Landroid/net/Uri;", "Lsl0/q2;", "Ll83/a0;", "onResult", "Lsl0/n2;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lc93/m;Landroidx/compose/runtime/Composer;I)Lsl0/n2;", "Landroid/content/Context;", "context", "Ljava/io/File;", "g", "(Landroid/content/Context;)Ljava/io/File;", "Ltr2/n;", "a", "Ltr2/n;", "logger", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function2 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f135424a = InterfaceC34116n.INSTANCE.m107848a("MediaPickerLauncher");

    /* JADX INFO: renamed from: sl0.p2$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"sl0/p2$a", "Lsl0/n2;", "Lsl0/q2;", "mode", "Ll83/a0;", "a", "(Lsl0/q2;)V", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC32647n2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C16351i f135425a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC28601c1 f135426b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C16351i f135427c;

        public a(C16351i c16351i, InterfaceC28601c1 interfaceC28601c1, C16351i c16351i2) {
            this.f135425a = c16351i;
            this.f135426b = interfaceC28601c1;
            this.f135427c = c16351i2;
        }

        @Override // p734sl0.InterfaceC32647n2
        /* JADX INFO: renamed from: a */
        public void mo102038a(AbstractC32662q2 mode) {
            AbstractC22676k.m65750j(mode, "mode");
            if (mode.equals(AbstractC32662q2.c.f135511a)) {
                this.f135425a.mo4052a(AbstractC32416g.m101149f(C22083d.f85640a), null);
                return;
            }
            if (mode.equals(AbstractC32662q2.a.f135509a)) {
                this.f135426b.setValue(Boolean.FALSE);
                this.f135427c.mo4052a("android.permission.CAMERA", null);
            } else {
                if (!mode.equals(AbstractC32662q2.b.f135510a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f135426b.setValue(Boolean.TRUE);
                this.f135427c.mo4052a("android.permission.CAMERA", null);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static final File m102167g(Context context) {
        try {
            return File.createTempFile("camera_", ".jpg", context.getCacheDir());
        } catch (IOException e5) {
            f135424a.mo85228t("Failed to create temp file with exception: " + e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC32647n2 m102168h(final InterfaceC4351m onResult, Composer composer, int i13) {
        Object c29440d;
        InterfaceC28601c1 interfaceC28601c1;
        C16351i c16351i;
        AbstractC22676k.m65750j(onResult, "onResult");
        C28655q c28655q = (C28655q) composer;
        final Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        ActivityResultContracts$PickMultipleVisualMedia activityResultContracts$PickMultipleVisualMedia = new ActivityResultContracts$PickMultipleVisualMedia(5);
        int i14 = (i13 & 14) ^ 6;
        boolean z4 = true;
        boolean z13 = (i14 > 4 && c28655q.m87153g(onResult)) || (i13 & 6) == 4;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (z13 || objM87133R == c28676v0) {
            objM87133R = new C32604f(onResult, 1);
            c28655q.m87172p0(objM87133R);
        }
        C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$PickMultipleVisualMedia, (Function1) objM87133R, c28655q, 0);
        Object[] objArr = new Object[0];
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C32581a1(11);
            c28655q.m87172p0(objM87133R2);
        }
        final InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R2, c28655q, 48);
        ActivityResultContracts$TakePicture activityResultContracts$TakePicture = new ActivityResultContracts$TakePicture();
        boolean zM87153g = c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(context) | ((i14 > 4 && c28655q.m87153g(onResult)) || (i13 & 6) == 4);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g || objM87133R3 == c28676v0) {
            final int i15 = 0;
            objM87133R3 = new Function1() { // from class: sl0.o2
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return Function2.m102171k(interfaceC28601c2, onResult, context, ((Boolean) obj).booleanValue());
                        default:
                            return Function2.m102173m(interfaceC28601c2, onResult, context, (C21062a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R3);
        }
        C16351i c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$TakePicture, (Function1) objM87133R3, c28655q, 0);
        Object[] objArr2 = new Object[0];
        Object objM87133R4 = c28655q.m87133R();
        if (objM87133R4 == c28676v0) {
            objM87133R4 = new C32581a1(12);
            c28655q.m87172p0(objM87133R4);
        }
        InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R4, c28655q, 48);
        ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
        boolean zM87153g2 = c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(context);
        if ((i14 <= 4 || !c28655q.m87153g(onResult)) && (i13 & 6) != 4) {
            z4 = false;
        }
        boolean z14 = zM87153g2 | z4;
        Object objM87133R5 = c28655q.m87133R();
        if (z14 || objM87133R5 == c28676v0) {
            final int i16 = 1;
            objM87133R5 = new Function1() { // from class: sl0.o2
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            return Function2.m102171k(interfaceC28601c2, onResult, context, ((Boolean) obj).booleanValue());
                        default:
                            return Function2.m102173m(interfaceC28601c2, onResult, context, (C21062a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R5);
        }
        C16351i c16351iM118972a2 = AbstractC37056f.m118972a0(activityResultContracts$StartActivityForResult, (Function1) objM87133R5, c28655q, 0);
        ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
        boolean zM87153g3 = c28655q.m87153g(interfaceC28601c2) | c28655q.m87157i(context) | c28655q.m87157i(c16351iM118972a2) | c28655q.m87157i(c16351iM118972a1) | c28655q.m87153g(interfaceC28601c3);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87153g3 || objM87133R6 == c28676v0) {
            interfaceC28601c1 = interfaceC28601c3;
            c16351i = c16351iM118972a2;
            c29440d = new C29440d(interfaceC28601c1, interfaceC28601c2, context, c16351i, c16351iM118972a1);
            c28655q.m87172p0(c29440d);
        } else {
            c16351i = c16351iM118972a2;
            c29440d = objM87133R6;
            interfaceC28601c1 = interfaceC28601c3;
        }
        C16351i c16351iM118972a3 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission, (Function1) c29440d, c28655q, 0);
        boolean zM87153g4 = c28655q.m87153g(c16351iM118972a0) | c28655q.m87153g(c16351iM118972a1) | c28655q.m87153g(c16351i) | c28655q.m87153g(c16351iM118972a3);
        Object objM87133R7 = c28655q.m87133R();
        if (zM87153g4 || objM87133R7 == c28676v0) {
            objM87133R7 = new a(c16351iM118972a0, interfaceC28601c1, c16351iM118972a3);
            c28655q.m87172p0(objM87133R7);
        }
        return (a) objM87133R7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m102169i(InterfaceC4351m interfaceC4351m, List uris) {
        AbstractC22676k.m65750j(uris, "uris");
        interfaceC4351m.invoke(uris, AbstractC32662q2.c.f135511a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC28601c1 m102170j() {
        return AbstractC28683x.m87272z(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m102171k(InterfaceC28601c1 interfaceC28601c1, InterfaceC4351m interfaceC4351m, Context context, boolean z4) {
        if (z4) {
            String str = (String) interfaceC28601c1.getValue();
            Uri uriForFile = str != null ? FileProvider.getUriForFile(context, AbstractC2875y.m8299l(context.getApplicationContext().getPackageName(), ".provider"), new File(str)) : null;
            interfaceC4351m.invoke(uriForFile != null ? AbstractC37056f.m118958J(uriForFile) : null, AbstractC32662q2.a.f135509a);
        } else {
            String str2 = (String) interfaceC28601c1.getValue();
            if (str2 != null) {
                new File(str2).delete();
            }
            interfaceC28601c1.setValue(null);
            interfaceC4351m.invoke(null, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC28601c1 m102172l() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m102173m(InterfaceC28601c1 interfaceC28601c1, InterfaceC4351m interfaceC4351m, Context context, C21062a result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.f79915w == -1) {
            String str = (String) interfaceC28601c1.getValue();
            Uri uriForFile = str != null ? FileProvider.getUriForFile(context, AbstractC2875y.m8299l(context.getApplicationContext().getPackageName(), ".provider"), new File(str)) : null;
            interfaceC4351m.invoke(uriForFile != null ? AbstractC37056f.m118958J(uriForFile) : null, AbstractC32662q2.b.f135510a);
        } else {
            String str2 = (String) interfaceC28601c1.getValue();
            if (str2 != null) {
                new File(str2).delete();
            }
            interfaceC28601c1.setValue(null);
            interfaceC4351m.invoke(null, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m102174n(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Context context, C16351i c16351i, C16351i c16351i2, boolean z4) {
        if (z4) {
            m102175o(interfaceC28601c2, context, c16351i, c16351i2, ((Boolean) interfaceC28601c1.getValue()).booleanValue());
            interfaceC28601c1.setValue(Boolean.FALSE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m102175o(InterfaceC28601c1 interfaceC28601c1, Context context, C16351i c16351i, C16351i c16351i2, boolean z4) {
        String str = (String) interfaceC28601c1.getValue();
        if (str != null) {
            new File(str).delete();
        }
        File fileM102167g = m102167g(context);
        if (fileM102167g == null) {
            return;
        }
        interfaceC28601c1.setValue(fileM102167g.getAbsolutePath());
        Uri uriForFile = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".provider", fileM102167g);
        if (!z4) {
            c16351i2.mo4052a(uriForFile, null);
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uriForFile);
        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
        intent.putExtra("com.google.assistant.extra.USE_FRONT_CAMERA", true);
        intent.putExtra("camerafacing", "front");
        intent.putExtra("previous_mode", "Selfie");
        c16351i.mo4052a(intent, null);
    }
}
