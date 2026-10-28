package p222ij;

import ad3.C0764g;
import ad3.C0775r;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.AppReviewAction;
import com.amplitude.android.engagement.types.LinkAction;
import com.amplitude.android.engagement.types.LinkOperation;
import cr.RunnableC11076n;
import java.security.SecureRandom;
import l83.C23454a0;
import live.hms.video.factories.MediaConstraintsFactory;
import m83.AbstractC25260n;
import p031b9.AbstractC2875y;
import p197hj.C17338u;
import p217ib.C18312i;
import p479s4.AbstractC32120a;
import p525uj.AbstractC35033k;
import p549vb.AbstractC35862g;
import p585wj.AbstractC37316b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import te0.AbstractC33745d;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ij.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18577c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C18577c f72578E;

    /* JADX INFO: renamed from: F */
    public static final C18577c f72579F;

    /* JADX INFO: renamed from: G */
    public static final C18577c f72580G;

    /* JADX INFO: renamed from: H */
    public static final C18577c f72581H;

    /* JADX INFO: renamed from: I */
    public static final C18577c f72582I;

    /* JADX INFO: renamed from: x */
    public static final C18577c f72583x;

    /* JADX INFO: renamed from: y */
    public static final C18577c f72584y;

    /* JADX INFO: renamed from: z */
    public static final C18577c f72585z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72586w;

    static {
        int i13 = 1;
        f72583x = new C18577c(i13, 0);
        f72584y = new C18577c(i13, 1);
        f72585z = new C18577c(i13, 2);
        f72578E = new C18577c(i13, 3);
        f72579F = new C18577c(i13, 4);
        f72580G = new C18577c(i13, 5);
        f72581H = new C18577c(i13, 6);
        f72582I = new C18577c(i13, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18577c(int i13, int i14) {
        super(i13);
        this.f72586w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM1831b;
        String strM1833d;
        Object objM1831b2;
        switch (this.f72586w) {
            case 0:
                C0764g Json = (C0764g) obj;
                AbstractC22676k.m65750j(Json, "$this$Json");
                Json.f2776c = true;
                Json.f2777d = true;
                Json.f2780g = true;
                return C23454a0.f92919a;
            case 1:
                Object[] args = (Object[]) obj;
                AbstractC22676k.m65750j(args, "args");
                if (args.length == 0) {
                    return "";
                }
                byte[] bytes = args[0].toString().getBytes(AbstractC39397a.f169546a);
                AbstractC22676k.m65749i(bytes, "getBytes(...)");
                return Base64.encodeToString(bytes, 2);
            case 2:
                Object[] args2 = (Object[]) obj;
                AbstractC22676k.m65750j(args2, "args");
                if (args2.length == 0) {
                    return "";
                }
                try {
                    byte[] decodedBytes = Base64.decode(AbstractC39414r.m125869O0(args2[0].toString()).toString(), 0);
                    AbstractC22676k.m65749i(decodedBytes, "decodedBytes");
                    return AbstractC25260n.m74027C0(decodedBytes, "", C18586l.f72600x, 30);
                } catch (Exception unused) {
                    return "";
                }
            case 3:
                Object[] args3 = (Object[]) obj;
                AbstractC22676k.m65750j(args3, "args");
                if (args3.length != 0) {
                    try {
                        byte[] bArr = new byte[Integer.parseInt(args3[0].toString())];
                        new SecureRandom().nextBytes(bArr);
                        return Base64.encodeToString(bArr, 2);
                    } catch (Exception unused2) {
                    }
                }
                return "";
            case 4:
                Object[] args4 = (Object[]) obj;
                AbstractC22676k.m65750j(args4, "args");
                if (args4.length == 0) {
                    return Boolean.FALSE;
                }
                String string = args4[0].toString();
                Activity activityM49083a = C17338u.f67142w.m49083a();
                if (activityM49083a == null) {
                    return Boolean.FALSE;
                }
                View viewFindViewWithTag = activityM49083a.getWindow().getDecorView().findViewWithTag(string);
                if (viewFindViewWithTag == null || !viewFindViewWithTag.isClickable()) {
                    return Boolean.FALSE;
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC11076n(viewFindViewWithTag, 2));
                return Boolean.TRUE;
            case 5:
                AbstractC22676k.m65750j((Object[]) obj, "args");
                Activity activityM49083a2 = C17338u.f67142w.m49083a();
                return AbstractC33745d.m106642a(activityM49083a2 != null ? AbstractC35033k.m110710b(activityM49083a2) : 1);
            case 6:
                Object[] args5 = (Object[]) obj;
                AbstractC22676k.m65750j(args5, "args");
                if (args5.length == 0) {
                    return Boolean.FALSE;
                }
                try {
                    String string2 = args5[0].toString();
                    try {
                        C0775r c0775r = AbstractC37316b.f159546a;
                        c0775r.getClass();
                        objM1831b = c0775r.m1831b(AppReviewAction.Companion.serializer(), string2);
                        break;
                    } catch (Exception e5) {
                        C4861a.f20259o.m16067m0("Failed to deserialize from JSON string: " + e5.getMessage());
                        objM1831b = null;
                    }
                    AppReviewAction appReviewAction = (AppReviewAction) objM1831b;
                    if (appReviewAction == null) {
                        return Boolean.FALSE;
                    }
                    AbstractC32120a.m99981g(appReviewAction.getPlayStorePackageName());
                    return Boolean.TRUE;
                } catch (Exception e13) {
                    C4861a.f20259o.m16032K(AbstractC2875y.m8298k(e13, new StringBuilder("Failed to handle app review action: ")));
                    return Boolean.FALSE;
                }
            case 7:
                C0764g Json2 = (C0764g) obj;
                AbstractC22676k.m65750j(Json2, "$this$Json");
                Json2.f2776c = true;
                Json2.f2777d = true;
                Json2.f2780g = true;
                return C23454a0.f92919a;
            default:
                Object[] args6 = (Object[]) obj;
                AbstractC22676k.m65750j(args6, "args");
                if (args6.length < 2) {
                    return Boolean.FALSE;
                }
                try {
                    String string3 = args6[0].toString();
                    Object obj2 = args6[1];
                    try {
                        C0775r c0775r2 = AbstractC37316b.f159546a;
                        strM1833d = c0775r2.m1833d(AbstractC35862g.m113843f(c0775r2.f2764b, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Object.class)), obj2);
                        break;
                    } catch (Exception e14) {
                        C4861a.f20259o.m16067m0("Failed to serialize to JSON string: " + e14.getMessage());
                        strM1833d = null;
                    }
                    boolean zM65745e = AbstractC22676k.m65745e(strM1833d, MediaConstraintsFactory.kValueTrue);
                    try {
                        C0775r c0775r3 = AbstractC37316b.f159546a;
                        c0775r3.getClass();
                        objM1831b2 = c0775r3.m1831b(LinkAction.Companion.serializer(), string3);
                        break;
                    } catch (Exception e15) {
                        C4861a.f20259o.m16067m0("Failed to deserialize from JSON string: " + e15.getMessage());
                        objM1831b2 = null;
                    }
                    LinkAction linkAction = (LinkAction) objM1831b2;
                    if (linkAction == null) {
                        return Boolean.FALSE;
                    }
                    if (linkAction.getOperation() == LinkOperation.ROUTER) {
                        String string4 = AbstractC39414r.m125869O0(linkAction.getValue()).toString();
                        if ((string4.length() > 0 ? string4 : null) == null) {
                            C4861a.f20259o.m16032K("Failed to perform linkExecutable, invalid router operation: empty screen identifier");
                        } else {
                            C4861a.f20259o.m16032K("Failed to perform linkExecutable, no router registered");
                        }
                        return Boolean.FALSE;
                    }
                    Activity activityM49083a3 = C17338u.f67142w.m49083a();
                    if (activityM49083a3 == null) {
                        return Boolean.FALSE;
                    }
                    Uri uri = Uri.parse(linkAction.getValue());
                    String scheme = uri.getScheme();
                    if (scheme != null && scheme.length() != 0) {
                        if ((!AbstractC22676k.m65745e(uri.getScheme(), "http") && !AbstractC22676k.m65745e(uri.getScheme(), "https")) || zM65745e || linkAction.getOperation() == LinkOperation.BLANK) {
                            activityM49083a3.startActivity(new Intent("android.intent.action.VIEW", uri));
                        } else {
                            C18312i c18312i = new C18312i();
                            c18312i.m52718e();
                            c18312i.m52714a().m91499h(activityM49083a3, uri);
                        }
                        return Boolean.TRUE;
                    }
                    C4861a.f20259o.m16032K("Failed to perform linkExecutable, missing URL scheme: " + linkAction.getValue());
                    return Boolean.FALSE;
                } catch (Exception e16) {
                    C4861a.f20259o.m16032K(AbstractC2875y.m8298k(e16, new StringBuilder("Failed to perform linkExecutable, unable to decode link action: ")));
                    return Boolean.FALSE;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18577c(C4861a c4861a) {
        super(1);
        this.f72586w = 8;
    }
}
