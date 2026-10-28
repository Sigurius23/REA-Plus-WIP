package p108e4;

import a00.C0072g;
import a01.C0084d;
import a40.AbstractC0357b;
import a40.AbstractC0359d;
import a40.AbstractC0361f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1538v;
import androidx.health.platform.client.proto.C1543w;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.InterfaceC1756y1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.AbstractC1772c1;
import b30.AbstractC2543i4;
import b30.AbstractC2592o5;
import b30.C2535h4;
import b30.C2549j2;
import b30.C2627t3;
import b30.C2637v;
import b30.C2647w2;
import bz.C3710i;
import c41.C4119t1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cb3.AbstractC4393e;
import cg.C4560o;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import cz.AbstractC11227t0;
import cz.C11215n0;
import cz.C11219p0;
import cz.C11223r0;
import cz.C11225s0;
import d10.C11465b;
import d30.C11524d0;
import d30.C11568w;
import d40.AbstractC11673r;
import d40.C11666k;
import d40.C11669n;
import d40.C11671p;
import db3.C11890b;
import e10.C12554k0;
import e93.AbstractC12889b;
import ej1.C13242h;
import f01.C13857f;
import fa0.C14294a;
import g40.AbstractC15327b3;
import g40.C15352f4;
import g40.C15420s2;
import g40.InterfaceC15455z2;
import ge0.C15728c;
import ge3.AbstractC15751g;
import gf.C15762c;
import gf.C15768i;
import gf.InterfaceC15761b;
import h20.AbstractC16736t0;
import h20.C16659g1;
import hm.C17417d;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.C20316e0;
import io.sentry.C20321e5;
import io.sentry.config.AbstractC20301a;
import io.sentry.protocol.C20491o;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import j93.InterfaceC21467g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C2032u;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m40.C25046w;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mx.AbstractC25990c;
import mx.C25988a;
import mx.C25989b;
import ng.C26676f;
import no.nordicsemi.android.dfu.DfuBaseService;
import o23.C27486p;
import o73.C27648a;
import oa3.C27770m;
import of2.C27900d;
import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0262w0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.EnumC0236o2;
import p005a3.InterfaceC0221l;
import p005a3.InterfaceC0240p2;
import p025b1.C2213d;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.C2320z;
import p077d0.AbstractC11348f;
import p077d0.C11365j0;
import p077d0.C11373l0;
import p077d0.C11407v;
import p078d1.C11456i;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p095dp.AbstractC12240d;
import p097ds.AbstractC12313p;
import p106e2.C12591f;
import p108e4.AbstractC12667a;
import p129ex.C13724a;
import p133f1.C13921a0;
import p139f7.AbstractC14163a;
import p161g.AbstractActivityC14909l;
import p178gz.C16283a;
import p178gz.C16284b;
import p178gz.C16285c;
import p178gz.C16286d;
import p178gz.C16287e;
import p181h2.C16618c;
import p181h2.C16619d;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17904p0;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.C17898m0;
import p208i2.C17900n0;
import p208i2.C17902o0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p208i2.InterfaceC17910s0;
import p264jx.C21997d;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p312lx.C24782c;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p326mf.C25500t;
import p326mf.EnumC25498r;
import p342nj.AbstractC26744i;
import p342nj.C26739d;
import p342nj.C26740e;
import p342nj.C26741f;
import p342nj.C26742g;
import p342nj.C26743h;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p401pj.C29282p;
import p408q.C29660d;
import p409q0.AbstractC29701y;
import p424qg.C30334c;
import p452r7.C31008e;
import p452r7.C31020k;
import p452r7.EnumC31018j;
import p459rf.C31341l;
import p474s.AbstractC32004s;
import p477s2.AbstractC32069a;
import p477s2.AbstractC32073e;
import p479s4.AbstractC32122c;
import p490t0.AbstractC33253j;
import p513u4.AbstractC34514b;
import p513u4.AbstractC34523k;
import p522uf.AbstractC34870c0;
import p525uj.AbstractC35033k;
import p525uj.C35031i;
import p525uj.C35035m;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35903f;
import p551vf.InterfaceC35936a;
import p557vo.AbstractC36220b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p603x2.AbstractC37831a;
import p621xn.C38464a;
import p635y2.AbstractC39071a;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39178j;
import p636y3.C39180l;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import pf.AbstractC29125c;
import q20.AbstractC29840y;
import q83.AbstractC30060g;
import q93.C30080d;
import r93.InterfaceC31117e;
import r93.InterfaceC31163w0;
import r93.InterfaceC31165x0;
import s30.AbstractC32100b;
import se.AbstractC32411b;
import u93.AbstractC34676g;
import v30.AbstractC35594c;
import va3.C35845c;
import va3.C35850h;
import wb3.AbstractC37056f;
import x43.AbstractC37978j;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: e4.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12667a {

    /* JADX INFO: renamed from: a */
    public static C27430e f43312a = null;

    /* JADX INFO: renamed from: b */
    public static Boolean f43313b = null;

    /* JADX INFO: renamed from: c */
    public static Context f43314c = null;

    /* JADX INFO: renamed from: d */
    public static C17417d f43315d = null;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f43316e = true;

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ C31020k m35430A() {
        double d3 = DurationKt.NANOS_IN_MILLIS;
        C31008e c31008e = C31020k.f128009y;
        return C31008e.m95546a(d3);
    }

    /* JADX INFO: renamed from: B */
    public static String m35431B(int i13, int[] iArr, int[] iArr2, String[] strArr) {
        StringBuilder sb4 = new StringBuilder("$");
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            if (i15 == 1 || i15 == 2) {
                sb4.append('[');
                sb4.append(iArr2[i14]);
                sb4.append(']');
            } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                sb4.append('.');
                String str = strArr[i14];
                if (str != null) {
                    sb4.append(str);
                }
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: C */
    public static C2535h4 m35432C(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1656996728);
        c28655q.m87150e0(-1749410128);
        C11666k c11666k = C11671p.f37684e;
        C2535h4 c2535h4 = (C2535h4) c28655q.m87161k(AbstractC2543i4.f9875b);
        c28655q.m87150e0(-1244204280);
        boolean zM87153g = c28655q.m87153g(c11666k) | c28655q.m87153g(c2535h4);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            float f13 = c2535h4.f9843a;
            if (Float.isNaN(f13)) {
                f13 = c11666k.f37661c.f37656a;
            }
            float f14 = c2535h4.f9844b;
            if (Float.isNaN(f14)) {
                f14 = c11666k.f37661c.f37657b;
            }
            float f15 = c2535h4.f9845c;
            if (Float.isNaN(f15)) {
                f15 = c11666k.f37661c.f37658c;
            }
            C2535h4 c2535h5 = new C2535h4(f13, f14, f15);
            c28655q.m87172p0(c2535h5);
            objM87133R = c2535h5;
        }
        C2535h4 c2535h6 = (C2535h4) objM87133R;
        AbstractC25012a.m73392y(c28655q, false, false, false);
        return c2535h6;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m35433D(List list, C20321e5 c20321e5) {
        if (c20321e5 != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            C20491o c20491o = c20321e5.f76301Q;
            if (c20491o != null) {
                String str = c20491o.f76745x;
                if (str != null) {
                    hashSet.add(str);
                }
                String str2 = c20491o.f76744w;
                if (str2 != null) {
                    hashSet.add(str2);
                }
            }
            Throwable thM56670a = c20321e5.m56670a();
            if (thM56670a != null) {
                hashSet.add(thM56670a.toString());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(((C20316e0) it.next()).f76296a)) {
                    return true;
                }
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C20316e0 c20316e0 = (C20316e0) it3.next();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    if (c20316e0.m56472b((String) it4.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m35434E(AbstractC17904p0 abstractC17904p0, float f13, float f14) {
        if (abstractC17904p0 instanceof C17900n0) {
            C16618c c16618c = ((C17900n0) abstractC17904p0).f69601a;
            return c16618c.f63939a <= f13 && f13 < c16618c.f63941c && c16618c.f63940b <= f14 && f14 < c16618c.f63942d;
        }
        if (!(abstractC17904p0 instanceof C17902o0)) {
            if (abstractC17904p0 instanceof C17898m0) {
                return m35435F(((C17898m0) abstractC17904p0).f69599a, f13, f14);
            }
            throw new NoWhenBranchMatchedException();
        }
        C16619d c16619d = ((C17902o0) abstractC17904p0).f69602a;
        float f15 = c16619d.f63943a;
        long j7 = c16619d.f63948f;
        long j13 = c16619d.f63950h;
        long j14 = c16619d.f63949g;
        float f16 = c16619d.f63946d;
        float f17 = c16619d.f63944b;
        float f18 = c16619d.f63945c;
        long j15 = c16619d.f63947e;
        if (f13 < f15 || f13 >= f18 || f14 < f17 || f14 >= f16) {
            return false;
        }
        int i13 = (int) (j15 >> 32);
        int i14 = (int) (j7 >> 32);
        if (Float.intBitsToFloat(i14) + Float.intBitsToFloat(i13) <= c16619d.m47208b()) {
            int i15 = (int) (j13 >> 32);
            int i16 = (int) (j14 >> 32);
            if (Float.intBitsToFloat(i16) + Float.intBitsToFloat(i15) <= c16619d.m47208b()) {
                int i17 = (int) (j15 & 4294967295L);
                int i18 = (int) (j13 & 4294967295L);
                if (Float.intBitsToFloat(i18) + Float.intBitsToFloat(i17) <= c16619d.m47207a()) {
                    int i19 = (int) (j7 & 4294967295L);
                    int i24 = (int) (j14 & 4294967295L);
                    if (Float.intBitsToFloat(i24) + Float.intBitsToFloat(i19) <= c16619d.m47207a()) {
                        float fIntBitsToFloat = Float.intBitsToFloat(i13) + f15;
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i17) + f17;
                        float fIntBitsToFloat3 = f18 - Float.intBitsToFloat(i14);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i19) + f17;
                        float fIntBitsToFloat5 = f18 - Float.intBitsToFloat(i16);
                        float fIntBitsToFloat6 = f16 - Float.intBitsToFloat(i24);
                        float fIntBitsToFloat7 = f16 - Float.intBitsToFloat(i18);
                        float fIntBitsToFloat8 = Float.intBitsToFloat(i15) + f15;
                        if (f13 < fIntBitsToFloat && f14 < fIntBitsToFloat2) {
                            return m35437H(c16619d.f63947e, f13, f14, fIntBitsToFloat, fIntBitsToFloat2);
                        }
                        if (f13 < fIntBitsToFloat8 && f14 > fIntBitsToFloat7) {
                            return m35437H(c16619d.f63950h, f13, f14, fIntBitsToFloat8, fIntBitsToFloat7);
                        }
                        if (f13 > fIntBitsToFloat3 && f14 < fIntBitsToFloat4) {
                            return m35437H(c16619d.f63948f, f13, f14, fIntBitsToFloat3, fIntBitsToFloat4);
                        }
                        if (f13 <= fIntBitsToFloat5 || f14 <= fIntBitsToFloat6) {
                            return true;
                        }
                        return m35437H(c16619d.f63949g, f13, f14, fIntBitsToFloat5, fIntBitsToFloat6);
                    }
                }
            }
        }
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        InterfaceC17910s0.m51496b(c17891jM51478a, c16619d);
        return m35435F(c17891jM51478a, f13, f14);
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m35435F(InterfaceC17910s0 interfaceC17910s0, float f13, float f14) {
        C16618c c16618c = new C16618c(f13 - 0.005f, f14 - 0.005f, f13 + 0.005f, f14 + 0.005f);
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        InterfaceC17910s0.m51495a(c17891jM51478a, c16618c);
        C17891j c17891jM51478a2 = AbstractC17897m.m51478a();
        c17891jM51478a2.m51463j(interfaceC17910s0, c17891jM51478a, 1);
        boolean zIsEmpty = c17891jM51478a2.f69587a.isEmpty();
        c17891jM51478a2.m51464k();
        c17891jM51478a.m51464k();
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m35436G(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context must be non-null");
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalStateException("Application context is null!");
        }
        if (f43313b != null && applicationContext.equals(f43314c)) {
            return f43313b.booleanValue();
        }
        Boolean bool = null;
        f43313b = null;
        if (f43315d == null || !applicationContext.equals(f43314c)) {
            f43315d = new C17417d(applicationContext.getPackageManager(), 1);
        }
        C17417d c17417d = f43315d;
        c17417d.getClass();
        if (C17417d.f67505y == null) {
            try {
                C17417d.f67505y = PackageManager.class.getDeclaredMethod("isInstantApp", null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        bool = (Boolean) C17417d.f67505y.invoke((PackageManager) c17417d.f67507x, null);
        f43314c = applicationContext;
        if (bool != null) {
            f43313b = bool;
        } else {
            try {
                applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f43313b = Boolean.TRUE;
            } catch (ClassNotFoundException unused2) {
                f43313b = Boolean.FALSE;
            }
        }
        return f43313b.booleanValue();
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m35437H(long j7, float f13, float f14, float f15, float f16) {
        float f17 = f13 - f15;
        float f18 = f14 - f16;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return ((f18 * f18) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f17 * f17) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX INFO: renamed from: I */
    public static final void m35438I(String key) {
        AbstractC22676k.m65750j(key, "key");
        throw new IllegalArgumentException(AbstractC11895b.m31996o("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    /* JADX INFO: renamed from: K */
    public static void m35439K(InterfaceC22712o interfaceC22712o, C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        interfaceC22712o.getContributedFunctions(name, location);
    }

    /* JADX INFO: renamed from: L */
    public static void m35440L(C30334c c30334c, Long l7) {
        AbstractC22676k.m65750j(c30334c, "<this>");
    }

    /* JADX INFO: renamed from: M */
    public static final void m35441M(C30334c recordSeconds, long j7, InterfaceC15761b attributes, C26676f c26676f) {
        AbstractC22676k.m65750j(recordSeconds, "$this$recordSeconds");
        AbstractC22676k.m65750j(attributes, "attributes");
        Duration.m134275getInWholeNanosecondsimpl(j7);
    }

    /* JADX INFO: renamed from: N */
    public static void m35442N(C30334c c30334c, long j7, C15762c c15762c, int i13) {
        InterfaceC15761b interfaceC15761b = c15762c;
        if ((i13 & 2) != 0) {
            interfaceC15761b = C15768i.f59433w;
        }
        m35441M(c30334c, j7, interfaceC15761b, null);
    }

    /* JADX INFO: renamed from: O */
    public static void m35443O(C38464a c38464a) {
        c38464a.f164716k = -3.4028235E38f;
        c38464a.f164715j = Integer.MIN_VALUE;
        CharSequence charSequence = c38464a.f164706a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c38464a.f164706a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c38464a.f164706a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static final void m35444P(AbstractActivityC14909l abstractActivityC14909l) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        AbstractC29125c.m88513V(abstractActivityC14909l.getWindow(), false);
    }

    /* JADX INFO: renamed from: Q */
    public static float m35445Q(float f13, int i13, int i14, int i15) {
        float f14;
        if (f13 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i13 == 0) {
            f14 = i15;
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    return -3.4028235E38f;
                }
                return f13;
            }
            f14 = i14;
        }
        return f13 * f14;
    }

    /* JADX INFO: renamed from: R */
    public static final String m35446R(InterfaceC31117e classDescriptor, String jvmDescriptor) {
        AbstractC22676k.m65750j(classDescriptor, "classDescriptor");
        AbstractC22676k.m65750j(jvmDescriptor, "jvmDescriptor");
        String str = C30080d.f122759a;
        C35845c c35845cM92211g = C30080d.m92211g(AbstractC4393e.m13809g(classDescriptor).f152613a);
        String internalName = c35845cM92211g != null ? C11890b.m31927e(c35845cM92211g) : AbstractC12240d.m34083t(classDescriptor, C27770m.f111970a);
        AbstractC22676k.m65750j(internalName, "internalName");
        return internalName + '.' + jvmDescriptor;
    }

    /* JADX INFO: renamed from: S */
    public static final C1543w m35447S(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        C1538v c1538vM4921s = C1543w.m4921s();
        String str = (String) AbstractC14163a.f51027b.get(interfaceC21461d);
        if (str != null) {
            c1538vM4921s.m4815c();
            C1543w.m4919p((C1543w) c1538vM4921s.f6114x, str);
            return (C1543w) c1538vM4921s.m4813a();
        }
        throw new UnsupportedOperationException("Not supported yet: " + interfaceC21461d);
    }

    /* JADX INFO: renamed from: T */
    public static final String m35448T(C31341l c31341l) {
        AbstractC22676k.m65750j(c31341l, "<this>");
        InterfaceC35936a interfaceC35936a = c31341l.f128963w;
        EnumC25498r method = interfaceC35936a.getMethod();
        C4560o url = interfaceC35936a.getUrl();
        C25500t c25500t = c31341l.f128964x.f159235a;
        return AbstractC25265s.m74110N0(AbstractC37056f.m118959K("HTTP", method, url, "-->", Integer.valueOf(c25500t.f99856a), c25500t.f99857b), " ", null, null, null, 62);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x0166  */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x0187  */
    /* JADX WARN: Code duplicated, block: B:68:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x021d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0239  */
    /* JADX WARN: Code duplicated, block: B:89:0x0241  */
    /* JADX WARN: Code duplicated, block: B:90:0x0244  */
    /* JADX WARN: Code duplicated, block: B:93:0x0251  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0281  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX INFO: renamed from: a */
    public static final void m35449a(C11219p0 viewState, Function1 viewActionHandler, C3710i userFacingLogger, Composer composer, int i13) {
        boolean z4;
        C22976l1 c22976l1;
        ?? r10;
        ?? r14;
        C28676v0 c28676v0;
        ?? r15;
        Object obj;
        ?? r16;
        Object obj2;
        ?? r17;
        int i14;
        Object obj3;
        C28676v0 c28676v1;
        C2314t c2314t;
        C2314t c2314t2;
        ?? r18;
        Object obj4;
        ?? r19;
        String strM113396S;
        float f13;
        Object obj5;
        ?? r110;
        AbstractC22676k.m65750j(viewState, "viewState");
        InterfaceC41211c interfaceC41211c = viewState.f36004r;
        boolean z13 = viewState.f36005s;
        InterfaceC41211c interfaceC41211c2 = viewState.f35999m;
        AbstractC22676k.m65750j(viewActionHandler, "viewActionHandler");
        AbstractC22676k.m65750j(userFacingLogger, "userFacingLogger");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1095696825);
        int i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2) | (c28655q.m87157i(viewActionHandler) ? 32 : 16) | (c28655q.m87157i(userFacingLogger) ? 256 : 128) | (c28655q.m87155h(true) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i15 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
            r110 = c28655q;
        } else {
            C11669n c11669n = C11671p.f37680a;
            C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
            c28655q.m87150e0(1183663941);
            boolean z14 = viewState.f36006t;
            C28676v0 c28676v2 = C28635l.f115821a;
            if (z14) {
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_confirm_close_form_title);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, R.string.stripe_confirm_close_form_body);
                String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_close);
                String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, R.string.stripe_cancel);
                c28655q.m87150e0(1183682742);
                int i16 = i15 & 112;
                boolean z15 = i16 == 32;
                Object objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v2) {
                    C14294a c14294a = new C14294a(viewActionHandler, 27);
                    c28655q.m87172p0(c14294a);
                    obj5 = c14294a;
                } else {
                    obj5 = objM87133R;
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj5;
                c28655q.m87173q(false);
                c28655q.m87150e0(1183678840);
                boolean z16 = i16 == 32;
                Object objM87133R2 = c28655q.m87133R();
                Object obj6 = objM87133R2;
                if (z16 || objM87133R2 == c28676v2) {
                    C14294a c14294a2 = new C14294a(viewActionHandler, 28);
                    c28655q.m87172p0(c14294a2);
                    obj6 = c14294a2;
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj6;
                c28655q.m87173q(false);
                r10 = 0;
                z4 = true;
                c22976l1 = c22976l1M31081j;
                AbstractC32100b.m99857b(strM92103Y, strM92103Y2, strM92103Y3, strM92103Y4, true, interfaceC4339a, interfaceC4339a2, c28655q, 24576);
                r14 = c28655q;
            } else {
                z13 = z13;
                z4 = true;
                c22976l1 = c22976l1M31081j;
                r10 = 0;
                r14 = c28655q;
            }
            r14.m87173q(r10);
            String strM92103Y5 = AbstractC30060g.m92103Y(r14, R.string.stripe_paymentsheet_save_a_new_payment_method);
            C2314t c2314t3 = C2314t.f9131w;
            AbstractC32004s.m99532a(strM92103Y5, AbstractC1099a.m3393o(c22976l1, AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, 0.0f, 4, 7)), r14, r10, r10);
            r14.m87150e0(1183696358);
            int i17 = i15 & 112;
            ?? r24 = i17 == 32 ? z4 ? 1 : 0 : r10;
            Object objM87133R3 = r14.m87133R();
            if (r24 == 0) {
                c28676v0 = c28676v2;
                if (objM87133R3 == c28676v0) {
                }
                obj = objM87133R3;
                C16286d c16286d = (C16286d) obj;
                r14.m87173q(r10);
                r14.m87150e0(1183700609);
                if (i17 == 32) {
                    r15 = z4 ? 1 : 0;
                } else {
                    r15 = r10;
                }
                Object objM87133R4 = r14.m87133R();
                obj = objM87133R4;
                if (r15 == 0 || objM87133R4 == c28676v0) {
                    C16285c c16285c = new C16285c(viewActionHandler);
                    r14.m87172p0(c16285c);
                    obj = c16285c;
                }
                C16285c c16285c2 = (C16285c) obj;
                r14.m87173q(r10);
                r14.m87150e0(1183704828);
                if (i17 == 32) {
                    r16 = z4 ? 1 : 0;
                } else {
                    r16 = r10;
                }
                Object objM87133R5 = r14.m87133R();
                obj2 = objM87133R5;
                if (r16 == 0 || objM87133R5 == c28676v0) {
                    C16284b c16284b = new C16284b(viewActionHandler);
                    r14.m87172p0(c16284b);
                    obj2 = c16284b;
                }
                C16284b c16284b2 = (C16284b) obj2;
                r14.m87173q(r10);
                r14.m87150e0(1183708895);
                if (i17 == 32) {
                    r17 = z4 ? 1 : 0;
                } else {
                    r17 = r10;
                }
                i14 = r17 | (r14.m87153g(userFacingLogger) ? 1 : 0);
                Object objM87133R6 = r14.m87133R();
                obj3 = objM87133R6;
                if (i14 == 0 || objM87133R6 == c28676v0) {
                    C16287e c16287e = new C16287e(viewActionHandler, userFacingLogger);
                    r14.m87172p0(c16287e);
                    obj3 = c16287e;
                }
                r14.m87173q(r10);
                r14.m87150e0(1183714250);
                AbstractC28683x.m87248b(new C28673u1[]{AbstractC0361f.f1242a.mo86977a(c16286d), AbstractC0359d.f1241a.mo86977a(c16285c2), AbstractC0357b.f1240a.mo86977a(c16284b2), AbstractC35594c.f151360a.mo86977a((C16287e) obj3)}, AbstractC37817c.m121344e(1294033369, r14, new C2647w2(12, viewState, viewActionHandler)), r14, 56);
                r14.m87173q(r10);
                AbstractC22953f.m66715b(r14, AbstractC1099a.m3398t(c2314t3, 0.0f, 24, 0.0f, 0.0f, 13));
                r14.m87150e0(1183755092);
                if (interfaceC41211c2 != null) {
                    AbstractC35903f.m114006a(AbstractC35785b.m113396S(interfaceC41211c2, r14), AbstractC1099a.m3393o(c22976l1, c2314t3), r14, r10);
                }
                r14.m87173q(r10);
                r14.m87150e0(1183760279);
                if (z13) {
                    r14.m87150e0(1183763497);
                    if (interfaceC41211c == null) {
                        strM113396S = null;
                    } else {
                        strM113396S = AbstractC35785b.m113396S(interfaceC41211c, r14);
                    }
                    r14.m87173q(r10);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t3);
                    if (interfaceC41211c2 != null) {
                        f13 = 8;
                    } else {
                        f13 = (float) r10;
                    }
                    Modifier modifierM3393o = AbstractC1099a.m3393o(c22976l1, AbstractC1099a.m3398t(modifierM3409f, 0.0f, f13, 0.0f, 0.0f, 13));
                    c28676v1 = c28676v0;
                    c2314t = c2314t3;
                    AbstractC32069a.m99663a(strM113396S, modifierM3393o, 0, 0, null, r14, 0, 28);
                } else {
                    c28676v1 = c28676v0;
                    c2314t = c2314t3;
                }
                r14.m87173q(r10);
                String strM113396S2 = AbstractC35785b.m113396S(viewState.f36001o, r14);
                boolean z17 = viewState.f36002p;
                boolean z18 = viewState.f35998l;
                c2314t2 = c2314t;
                Modifier modifierM3393o2 = AbstractC1099a.m3393o(c22976l1, AbstractC1099a.m3398t(AbstractC1136a.m3599a(c2314t2, "CustomerSheetSaveButton"), 0.0f, 10, 0.0f, 0.0f, 13));
                r14.m87150e0(1183780313);
                r18 = z4;
                if (i17 != 32) {
                    r18 = r10;
                }
                Object objM87133R7 = r14.m87133R();
                obj4 = objM87133R7;
                if (r18 == 0 || objM87133R7 == c28676v1) {
                    C14294a c14294a3 = new C14294a(viewActionHandler, 29);
                    r14.m87172p0(c14294a3);
                    obj4 = c14294a3;
                }
                r14.m87173q(r10);
                ?? r111 = r14;
                AbstractC20301a.m56341i(strM113396S2, z17, (InterfaceC4339a) obj4, modifierM3393o2, false, z18, true, null, r111, 1572864, 144);
                r19 = r111;
                r110 = r19;
                if (!z13) {
                    r19.m87150e0(1183792297);
                    String strM113396S3 = interfaceC41211c != null ? AbstractC35785b.m113396S(interfaceC41211c, r19) : null;
                    r19.m87173q(r10);
                    AbstractC32069a.m99663a(strM113396S3, AbstractC1099a.m3393o(c22976l1, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 8, 0.0f, 0.0f, 13)), 0, 0, null, r19, 0, 28);
                    r110 = r19;
                }
            } else {
                c28676v0 = c28676v2;
            }
            obj = objM87133R3;
            C16286d c16286d2 = new C16286d(viewActionHandler);
            r14.m87172p0(c16286d2);
            Object obj7 = c16286d2;
            obj7 = objM87133R3;
            C16286d c16286d3 = (C16286d) obj7;
            r14.m87173q(r10);
            r14.m87150e0(1183700609);
            if (i17 == 32) {
                r15 = z4 ? 1 : 0;
            } else {
                r15 = r10;
            }
            Object objM87133R8 = r14.m87133R();
            obj = objM87133R8;
            if (r15 == 0) {
                C16285c c16285c3 = new C16285c(viewActionHandler);
                r14.m87172p0(c16285c3);
                obj = c16285c3;
            } else {
                C16285c c16285c4 = new C16285c(viewActionHandler);
                r14.m87172p0(c16285c4);
                obj = c16285c4;
            }
            C16285c c16285c5 = (C16285c) obj;
            r14.m87173q(r10);
            r14.m87150e0(1183704828);
            if (i17 == 32) {
                r16 = z4 ? 1 : 0;
            } else {
                r16 = r10;
            }
            Object objM87133R9 = r14.m87133R();
            obj2 = objM87133R9;
            if (r16 == 0) {
                C16284b c16284b3 = new C16284b(viewActionHandler);
                r14.m87172p0(c16284b3);
                obj2 = c16284b3;
            } else {
                C16284b c16284b4 = new C16284b(viewActionHandler);
                r14.m87172p0(c16284b4);
                obj2 = c16284b4;
            }
            C16284b c16284b5 = (C16284b) obj2;
            r14.m87173q(r10);
            r14.m87150e0(1183708895);
            if (i17 == 32) {
                r17 = z4 ? 1 : 0;
            } else {
                r17 = r10;
            }
            i14 = r17 | (r14.m87153g(userFacingLogger) ? 1 : 0);
            Object objM87133R10 = r14.m87133R();
            obj3 = objM87133R10;
            if (i14 == 0) {
                C16287e c16287e2 = new C16287e(viewActionHandler, userFacingLogger);
                r14.m87172p0(c16287e2);
                obj3 = c16287e2;
            } else {
                C16287e c16287e3 = new C16287e(viewActionHandler, userFacingLogger);
                r14.m87172p0(c16287e3);
                obj3 = c16287e3;
            }
            r14.m87173q(r10);
            r14.m87150e0(1183714250);
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC0361f.f1242a.mo86977a(c16286d3), AbstractC0359d.f1241a.mo86977a(c16285c5), AbstractC0357b.f1240a.mo86977a(c16284b5), AbstractC35594c.f151360a.mo86977a((C16287e) obj3)}, AbstractC37817c.m121344e(1294033369, r14, new C2647w2(12, viewState, viewActionHandler)), r14, 56);
            r14.m87173q(r10);
            AbstractC22953f.m66715b(r14, AbstractC1099a.m3398t(c2314t3, 0.0f, 24, 0.0f, 0.0f, 13));
            r14.m87150e0(1183755092);
            if (interfaceC41211c2 != null) {
                AbstractC35903f.m114006a(AbstractC35785b.m113396S(interfaceC41211c2, r14), AbstractC1099a.m3393o(c22976l1, c2314t3), r14, r10);
            }
            r14.m87173q(r10);
            r14.m87150e0(1183760279);
            if (z13) {
                r14.m87150e0(1183763497);
                if (interfaceC41211c == null) {
                    strM113396S = null;
                } else {
                    strM113396S = AbstractC35785b.m113396S(interfaceC41211c, r14);
                }
                r14.m87173q(r10);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t3);
                if (interfaceC41211c2 != null) {
                    f13 = 8;
                } else {
                    f13 = (float) r10;
                }
                Modifier modifierM3393o3 = AbstractC1099a.m3393o(c22976l1, AbstractC1099a.m3398t(modifierM3409f2, 0.0f, f13, 0.0f, 0.0f, 13));
                c28676v1 = c28676v0;
                c2314t = c2314t3;
                AbstractC32069a.m99663a(strM113396S, modifierM3393o3, 0, 0, null, r14, 0, 28);
            } else {
                c28676v1 = c28676v0;
                c2314t = c2314t3;
            }
            r14.m87173q(r10);
            String strM113396S4 = AbstractC35785b.m113396S(viewState.f36001o, r14);
            boolean z19 = viewState.f36002p;
            boolean z110 = viewState.f35998l;
            c2314t2 = c2314t;
            Modifier modifierM3393o4 = AbstractC1099a.m3393o(c22976l1, AbstractC1099a.m3398t(AbstractC1136a.m3599a(c2314t2, "CustomerSheetSaveButton"), 0.0f, 10, 0.0f, 0.0f, 13));
            r14.m87150e0(1183780313);
            r18 = z4;
            if (i17 != 32) {
                r18 = r10;
            }
            Object objM87133R11 = r14.m87133R();
            obj4 = objM87133R11;
            if (r18 == 0) {
                C14294a c14294a4 = new C14294a(viewActionHandler, 29);
                r14.m87172p0(c14294a4);
                obj4 = c14294a4;
            } else {
                C14294a c14294a5 = new C14294a(viewActionHandler, 29);
                r14.m87172p0(c14294a5);
                obj4 = c14294a5;
            }
            r14.m87173q(r10);
            ?? r112 = r14;
            AbstractC20301a.m56341i(strM113396S4, z19, (InterfaceC4339a) obj4, modifierM3393o4, false, z110, true, null, r112, 1572864, 144);
            r19 = r112;
            r110 = r19;
            if (!z13) {
                r19.m87150e0(1183792297);
                String strM113396S5 = interfaceC41211c != null ? AbstractC35785b.m113396S(interfaceC41211c, r19) : null;
                r19.m87173q(r10);
                AbstractC32069a.m99663a(strM113396S5, AbstractC1099a.m3393o(c22976l1, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 8, 0.0f, 0.0f, 13)), 0, 0, null, r19, 0, 28);
                r110 = r19;
            }
        }
        C28677v1 c28677v1M87180u = r110.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0084d(viewState, viewActionHandler, userFacingLogger, false, i13, 17);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m35450b(C29282p c29282p, long j7, Modifier modifier, Composer composer, int i13) {
        float f13;
        long jM115297a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1362306613);
        int i14 = c29282p != null ? c29282p.f118496b : 0;
        switch (i14 == 0 ? -1 : AbstractC26744i.f106364a[AbstractC12682p.m35485e(i14)]) {
            case 4:
            case 5:
            case 6:
                f13 = 180.0f;
                break;
            case 7:
            case 8:
            case 9:
                f13 = 90.0f;
                break;
            case 10:
            case 11:
            case 12:
                f13 = 270.0f;
                break;
            default:
                f13 = 0.0f;
                break;
        }
        boolean zM87153g = c28655q.m87153g(new C39180l(j7)) | c28655q.m87153g(c29282p);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            int i15 = -12;
            if ((c29282p != null ? c29282p.f118497c.f118439a : null) != null) {
                int iIntValue = c29282p.f118497c.f118439a.intValue();
                int i16 = c29282p.f118496b;
                switch (i16 != 0 ? AbstractC26744i.f106364a[AbstractC12682p.m35485e(i16)] : -1) {
                    case 1:
                    case 2:
                    case 3:
                        i15 = (int) (j7 & 4294967295L);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        i15 = 0;
                        break;
                }
                jM115297a = AbstractC36220b.m115297a(iIntValue, i15);
            } else {
                if ((c29282p != null ? c29282p.f118497c.f118440b : null) != null) {
                    int i17 = c29282p.f118496b;
                    switch (i17 != 0 ? AbstractC26744i.f106364a[AbstractC12682p.m35485e(i17)] : -1) {
                        case 7:
                        case 8:
                        case 9:
                            i15 = (int) (j7 >> 32);
                            break;
                        case 10:
                        case 11:
                        case 12:
                            break;
                        default:
                            i15 = 0;
                            break;
                    }
                    jM115297a = AbstractC36220b.m115297a(i15, c29282p.f118497c.f118440b.intValue());
                } else {
                    jM115297a = AbstractC36220b.m115297a(0, 0);
                }
            }
            objM87133R = new C39178j(jM115297a);
            c28655q.m87172p0(objM87133R);
        }
        long j13 = ((C39178j) objM87133R).f168416a;
        c28655q.m87152f0(-412521741);
        C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
        c28655q.m87173q(false);
        long j14 = c35035m.f148366w;
        Modifier modifierM5375L = AbstractC1772c1.m5375L(f13, AbstractC1102d.m3424u(24, AbstractC1102d.m3411h(12, AbstractC1099a.m3391m(modifier, (int) (j13 >> 32), (int) (j13 & 4294967295L)))));
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM5375L);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
        boolean zM87153g2 = c28655q.m87153g(new C17919x(j14));
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C26739d(j14);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R2, c28655q, 6);
        c28655q.m87173q(true);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C26740e(c29282p, j7, modifier, i13);
    }

    /* JADX INFO: renamed from: c */
    public static final void m35451c(Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(181905311);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 14) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i17 = i15;
        if ((i17 & 91) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            c28655q.m87152f0(-412521741);
            C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            c28655q.m87173q(false);
            C35031i c35031i = c35035m.f148357n0;
            float f13 = c35031i.f148279a;
            C11373l0 c11373l0M30571s = AbstractC11348f.m30571s("BeaconPulse", c28655q, 0);
            C11365j0 c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s, 1.0f, 4.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1500, 0, new C11407v(0.0f, 0.0f, 0.2f, 1.0f), 2), null, 6), "scale", c28655q, 29112, 0);
            C11365j0 c11365j0M30559g2 = AbstractC11348f.m30559g(c11373l0M30571s, 1.0f, 0.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1500, 0, new C11407v(0.0f, 0.0f, 0.2f, 1.0f), 2), null, 6), "alpha", c28655q, 29112, 0);
            boolean zM87153g = c28655q.m87153g(c11365j0M30559g) | c28655q.m87153g(c11365j0M30559g2);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2320z(18, c11365j0M30559g, c11365j0M30559g2);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, AbstractC1127a.m3486a(modifier4, (Function1) objM87133R));
            float f14 = c35031i.f148282d;
            long j7 = c35031i.f148283e;
            Modifier modifierM118994r = AbstractC37056f.m118994r(modifierM3419p, AbstractC33253j.m105489e(f14));
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM118994r, j7, c17916v0), c28655q, 0);
            AbstractC22989q.m66760a(AbstractC12313p.m34307y(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13, modifier4), AbstractC33253j.m105489e(c35031i.f148282d)), j7, c17916v0), interfaceC4339a != null, new C26741f(interfaceC4339a, i17), c28655q, 0), c28655q, 0);
            modifier3 = modifier4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C26742g(modifier3, interfaceC4339a, i13, i14, 0);
    }

    /* JADX INFO: renamed from: d */
    public static final void m35452d(C29282p c29282p, long j7, Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        long jM115297a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(738243544);
        boolean zM87153g = c28655q.m87153g(new C39180l(j7)) | c28655q.m87153g(c29282p);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            int i14 = -12;
            if ((c29282p != null ? c29282p.f118497c.f118439a : null) != null) {
                int iIntValue = c29282p.f118497c.f118439a.intValue();
                int i15 = c29282p.f118496b;
                switch (i15 != 0 ? AbstractC26744i.f106364a[AbstractC12682p.m35485e(i15)] : -1) {
                    case 1:
                    case 2:
                    case 3:
                        i14 = (int) (j7 & 4294967295L);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        i14 = 0;
                        break;
                }
                jM115297a = AbstractC36220b.m115297a(iIntValue, i14);
            } else {
                if ((c29282p != null ? c29282p.f118497c.f118440b : null) != null) {
                    int i16 = c29282p.f118496b;
                    switch (i16 != 0 ? AbstractC26744i.f106364a[AbstractC12682p.m35485e(i16)] : -1) {
                        case 7:
                        case 8:
                        case 9:
                            i14 = (int) (j7 >> 32);
                            break;
                        case 10:
                        case 11:
                        case 12:
                            break;
                        default:
                            i14 = 0;
                            break;
                    }
                    jM115297a = AbstractC36220b.m115297a(i14, c29282p.f118497c.f118440b.intValue());
                } else {
                    jM115297a = 0;
                }
            }
            C39178j c39178j = new C39178j(jM115297a);
            c28655q.m87172p0(c39178j);
            objM87133R = c39178j;
        }
        long j13 = ((C39178j) objM87133R).f168416a;
        m35451c(AbstractC1099a.m3391m(modifier, (int) (j13 >> 32), (int) (j13 & 4294967295L)), interfaceC4339a, c28655q, 0, 0);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C26743h(c29282p, j7, modifier, interfaceC4339a, i13);
    }

    /* JADX INFO: renamed from: e */
    public static final void m35453e(C11215n0 viewModel, Composer composer, int i13) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1645160815);
        if ((((c28655q.m87157i(viewModel) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC11227t0 abstractC11227t0 = (AbstractC11227t0) C27648a.m83597t(viewModel.f35964M, c28655q, 0).getValue();
            c28655q.m87150e0(1917988334);
            boolean zM87157i = c28655q.m87157i(viewModel);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                C15352f4 c15352f4 = new C15352f4(1, viewModel, C11215n0.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V", 0, 1);
                c28655q.m87172p0(c15352f4);
                objM87133R = c15352f4;
            }
            c28655q.m87173q(false);
            Function1 function1 = (Function1) ((InterfaceC21467g) objM87133R);
            c28655q.m87150e0(1917990422);
            boolean zM87157i2 = c28655q.m87157i(viewModel);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C15352f4 c15352f5 = new C15352f4(1, viewModel, C11215n0.class, "providePaymentMethodName", "providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;", 0, 2);
                c28655q.m87172p0(c15352f5);
                objM87133R2 = c15352f5;
            }
            c28655q.m87173q(false);
            m35454f(abstractC11227t0, false, null, function1, (Function1) ((InterfaceC21467g) objM87133R2), viewModel.f35960I, c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13242h(viewModel, i13);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m35454f(AbstractC11227t0 viewState, boolean z4, Modifier modifier, Function1 function1, Function1 paymentMethodNameProvider, C3710i userFacingLogger, Composer composer, int i13) {
        C28655q c28655q;
        Modifier modifier2;
        boolean z13;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(paymentMethodNameProvider, "paymentMethodNameProvider");
        AbstractC22676k.m65750j(userFacingLogger, "userFacingLogger");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-397120279);
        if (((i13 | (c28655q2.m87153g(viewState) ? 4 : 2) | 432 | (c28655q2.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q2.m87157i(paymentMethodNameProvider) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q2.m87157i(userFacingLogger) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST)) & 74899) == 74898 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            z13 = z4;
            modifier2 = modifier;
            c28655q = c28655q2;
        } else {
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-870306936, c28655q2, new C2647w2(13, viewState, function1));
            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(1383985255, c28655q2, new C2213d(viewState, function1, paymentMethodNameProvider, userFacingLogger, 3));
            c28655q = c28655q2;
            modifier2 = C2314t.f9131w;
            AbstractC12240d.m34061a(c37816bM121344e, c37816bM121344e2, modifier2, null, c28655q, 438, 8);
            z13 = true;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4119t1(viewState, z13, modifier2, function1, paymentMethodNameProvider, userFacingLogger, i13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m35455g(final boolean z4, final boolean z13, final int i13, final String str, final C25046w imageLoader, final String title, final String str2, final String str3, final boolean z14, final InterfaceC4339a onClick, final Modifier modifier, final C16659g1 c16659g1, Composer composer, final int i14, final int i15) {
        int i16;
        boolean z15;
        int i17;
        C28655q c28655q;
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(55108718);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87155h(z4) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            z15 = z13;
            i16 |= c28655q2.m87155h(z15) ? 32 : 16;
        } else {
            z15 = z13;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= (32768 & i14) == 0 ? c28655q2.m87153g(imageLoader) : c28655q2.m87157i(imageLoader) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 |= c28655q2.m87153g(title) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i14) == 0) {
            i16 |= c28655q2.m87153g(str2) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= c28655q2.m87153g(str3) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= c28655q2.m87155h(z14) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i14 & 805306368) == 0) {
            i16 |= c28655q2.m87157i(onClick) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (c28655q2.m87153g(modifier) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q2.m87157i(null) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= (i15 & 512) == 0 ? c28655q2.m87153g(c16659g1) : c28655q2.m87157i(c16659g1) ? 256 : 128;
        }
        int i18 = i17;
        if ((i16 & 306783379) == 306783378 && (i18 & 147) == 146 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            c28655q = c28655q2;
            AbstractC22674j.m65720f(z4, z15, false, false, AbstractC37817c.m121344e(1411453836, c28655q2, new C11524d0(i13, str, imageLoader, z14)), title, str2, str3, onClick, null, modifier, c16659g1, null, c28655q, (i16 & 14) | 27648 | (i16 & 112) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | ((i16 >> 3) & 234881024), (i18 & 14) | ((i18 >> 3) & 112) | ((i18 << 3) & 896), 516);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: d30.c0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i14 | 1);
                    int iM87244L2 = AbstractC28683x.m87244L(i15);
                    AbstractC12667a.m35455g(z4, z13, i13, str, imageLoader, title, str2, str3, z14, onClick, modifier, c16659g1, (Composer) obj, iM87244L, iM87244L2);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m35456h(boolean z4, boolean z13, C11568w displayablePaymentMethod, C25046w imageLoader, Modifier modifier, C16659g1 c16659g1, Composer composer, int i13) {
        boolean z14;
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(displayablePaymentMethod, "displayablePaymentMethod");
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(805862142);
        if ((i13 & 6) == 0) {
            z14 = z4;
            i14 = (c28655q2.m87155h(z14) ? 4 : 2) | i13;
        } else {
            z14 = z4;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(displayablePaymentMethod) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q2.m87153g(imageLoader) : c28655q2.m87157i(imageLoader) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((1572864 & i13) == 0) {
            i15 |= (2097152 & i13) == 0 ? c28655q2.m87153g(c16659g1) : c28655q2.m87157i(c16659g1) ? 1048576 : 524288;
        }
        if ((599187 & i15) == 599186 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            c28655q2.m87150e0(-1609013721);
            int iM121625H = AbstractC37978j.m121625H(displayablePaymentMethod.f37333d, displayablePaymentMethod.f37334e, displayablePaymentMethod.f37341l, c28655q2);
            c28655q2.m87173q(false);
            c28655q2.m87150e0(475424180);
            String str = displayablePaymentMethod.f37335f;
            String str2 = displayablePaymentMethod.f37336g;
            c28655q2.m87150e0(-201455451);
            c28655q2.m87150e0(-1529074886);
            boolean z15 = ((double) AbstractC17918w0.m51536x(AbstractC11673r.m31082k(c28655q2).f37668a)) < 0.5d;
            c28655q2.m87173q(false);
            if (z15 && str2 != null) {
                str = str2;
            }
            c28655q2.m87173q(false);
            c28655q2.m87173q(false);
            String strM113396S = AbstractC35785b.m113396S(displayablePaymentMethod.f37332c, c28655q2);
            InterfaceC41211c interfaceC41211c = displayablePaymentMethod.f37338i;
            c28655q2.m87150e0(-1560062245);
            String strM113396S2 = interfaceC41211c == null ? null : AbstractC35785b.m113396S(interfaceC41211c, c28655q2);
            c28655q2.m87173q(false);
            String str3 = displayablePaymentMethod.f37339j;
            String str4 = str;
            String str5 = strM113396S2;
            boolean z16 = displayablePaymentMethod.f37337h;
            Modifier modifierM3599a = AbstractC1136a.m3599a(modifier, "TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON_" + displayablePaymentMethod.f37330a);
            c28655q2.m87150e0(-1560057012);
            boolean zM87157i = c28655q2.m87157i(displayablePaymentMethod);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C11456i(displayablePaymentMethod, 5);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            m35455g(z14, z13, iM121625H, str4, imageLoader, strM113396S, str5, str3, z16, (InterfaceC4339a) objM87133R, modifierM3599a, c16659g1, c28655q, (i15 & 126) | 32768 | ((i15 << 3) & 57344), (i15 >> 12) & MessageListItemViewType.GIPHY);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2637v(z4, z13, displayablePaymentMethod, imageLoader, modifier, c16659g1, i13);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m35457i(boolean z4, C15420s2 c15420s2, Set set, IdentifierSpec identifierSpec, Modifier modifier, Composer composer, int i13) {
        boolean z13;
        int i14;
        Set set2 = set;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-704852762);
        if ((i13 & 6) == 0) {
            z13 = z4;
            i14 = (c28655q.m87155h(z13) ? 4 : 2) | i13;
        } else {
            z13 = z4;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c15420s2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(set2) ? 256 : 128;
        }
        IdentifierSpec identifierSpec2 = identifierSpec;
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(identifierSpec2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14;
        if ((i15 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            List list = (List) c15420s2.f57938c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!set2.contains(((AbstractC15327b3) obj).mo43531a())) {
                    arrayList.add(obj);
                }
            }
            c28655q.m87150e0(1628105702);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(new C39174f(0));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q.m87173q(false);
            if (!arrayList.isEmpty()) {
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3428y = AbstractC1102d.m3428y(AbstractC1102d.m3409f(1.0f, c2314t), null, false, 3);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3428y);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(985626410);
                Iterator it = arrayList.iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    AbstractC15327b3 abstractC15327b3 = (AbstractC15327b3) next;
                    float size = 1.0f / arrayList.size();
                    Iterator it3 = it;
                    if (size <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (size > Float.MAX_VALUE) {
                        size = Float.MAX_VALUE;
                    }
                    Modifier modifierMo3471e = modifier.mo3471e(new LayoutWeightElement(size, true));
                    c28655q.m87150e0(-1578024274);
                    Object objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13921a0(10, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87173q(false);
                    int i18 = i15 << 3;
                    C2314t c2314t2 = c2314t;
                    AbstractC32073e.m99745g(z13, abstractC15327b3, AbstractC1132b.m3502b(modifierMo3471e, (Function1) objM87133R2), set2, identifierSpec2, c28655q, (i18 & 57344) | (i15 & 14) | (i18 & 7168), 0);
                    c28655q.m87150e0(985645430);
                    if (i16 != AbstractC37056f.m118951C(arrayList)) {
                        AbstractC15751g.m44449b(AbstractC1102d.m3424u(AbstractC11673r.m31083l(c28655q).f37679c, AbstractC1102d.m3411h(((C39174f) interfaceC28601c1.getValue()).f168413w, c2314t2)), AbstractC11673r.m31082k(c28655q).f37670c, 0.0f, 0.0f, c28655q, 0, 12);
                    }
                    c28655q.m87173q(false);
                    z13 = z4;
                    set2 = set;
                    identifierSpec2 = identifierSpec;
                    c2314t = c2314t2;
                    i16 = i17;
                    it = it3;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(z4, (InterfaceC15455z2) c15420s2, (Object) set, (Object) identifierSpec, modifier, i13, 5);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m35458j(C11223r0 viewState, Function1 viewActionHandler, Function1 paymentMethodNameProvider, Modifier modifier, Composer composer, int i13) {
        C28655q c28655q;
        boolean z4;
        Function1 function1;
        boolean z13;
        Modifier modifier2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(viewActionHandler, "viewActionHandler");
        AbstractC22676k.m65750j(paymentMethodNameProvider, "paymentMethodNameProvider");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1248593812);
        int i14 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2) | (c28655q2.m87157i(viewActionHandler) ? 32 : 16) | (c28655q2.m87157i(paymentMethodNameProvider) ? 256 : 128) | 3072;
        if ((i14 & 1171) == 1170 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            modifier2 = modifier;
            function1 = viewActionHandler;
            c28655q = c28655q2;
        } else {
            C11669n c11669n = C11671p.f37680a;
            C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
            int i15 = 0;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM92103Y = viewState.f36012c;
            c28655q2.m87150e0(2144068846);
            if (strM92103Y == null) {
                strM92103Y = AbstractC30060g.m92103Y(c28655q2, R.string.stripe_paymentsheet_manage_your_payment_methods);
            }
            c28655q2.m87173q(false);
            float f13 = 20;
            AbstractC32004s.m99532a(strM92103Y, AbstractC1099a.m3393o(c22976l1M31081j, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7)), c28655q2, 0, 0);
            List list = viewState.f36013d;
            boolean z14 = viewState.f36018i;
            AbstractC29840y abstractC29840y = viewState.f36014e;
            ArrayList arrayListM101057A = AbstractC32411b.m101057A(list, z14, false, paymentMethodNameProvider, viewState.f36024o, null);
            AbstractC16736t0 abstractC16736t0M101064H = AbstractC32411b.m101064H(arrayListM101057A, abstractC29840y);
            boolean z15 = viewState.f36017h;
            boolean z16 = viewState.f36016g;
            c28655q2.m87150e0(2144100431);
            int i16 = i14 & 112;
            boolean z17 = i16 == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z17 || objM87133R == c28676v0) {
                objM87133R = new C16283a(viewActionHandler, i15);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(2144103441);
            boolean z18 = i16 == 32;
            Object objM87133R2 = c28655q2.m87133R();
            if (z18 || objM87133R2 == c28676v0) {
                objM87133R2 = new C15728c(viewActionHandler, 9);
                c28655q2.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(2144106447);
            boolean z19 = i16 == 32;
            Object objM87133R3 = c28655q2.m87133R();
            if (z19 || objM87133R3 == c28676v0) {
                objM87133R3 = new C15728c(viewActionHandler, 10);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q2.m87173q(false);
            float f14 = 2;
            c28655q = c28655q2;
            AbstractC2592o5.m7510h(arrayListM101057A, abstractC16736t0M101064H, z15, z16, interfaceC4339a, function2, (Function1) objM87133R3, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7), null, c28655q, 12582912);
            String str = viewState.f36022m;
            c28655q.m87150e0(2144111858);
            if (str == null) {
                z4 = false;
            } else {
                z4 = false;
                AbstractC35903f.m114006a(str, AbstractC1099a.m3393o(c22976l1M31081j, AbstractC1099a.m3396r(c2314t, 0.0f, f14, 1)), c28655q, 0);
            }
            c28655q.m87173q(z4);
            c28655q.m87150e0(2144119783);
            if (viewState.f36019j) {
                String strM113396S = AbstractC35785b.m113396S(viewState.f36025p, c28655q);
                boolean z24 = viewState.f36016g;
                boolean z25 = !z24;
                Modifier modifierM3393o = AbstractC1099a.m3393o(c22976l1M31081j, AbstractC1099a.m3398t(AbstractC1136a.m3599a(c2314t, "CustomerSheetConfirmButton"), 0.0f, f13, 0.0f, 0.0f, 13));
                c28655q.m87150e0(2144128025);
                boolean z26 = i16 == 32;
                Object objM87133R4 = c28655q.m87133R();
                if (z26 || objM87133R4 == c28676v0) {
                    function1 = viewActionHandler;
                    objM87133R4 = new C14294a(function1, 26);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function1 = viewActionHandler;
                }
                c28655q.m87173q(false);
                z13 = false;
                AbstractC20301a.m56341i(strM113396S, z25, (InterfaceC4339a) objM87133R4, modifierM3393o, false, z24, false, null, c28655q, 0, 208);
                c28655q = c28655q;
            } else {
                function1 = viewActionHandler;
                z13 = false;
            }
            c28655q.m87173q(z13);
            InterfaceC41211c interfaceC41211c = viewState.f36023n;
            c28655q.m87150e0(2144140537);
            String strM113396S2 = interfaceC41211c == null ? null : AbstractC35785b.m113396S(interfaceC41211c, c28655q);
            c28655q.m87173q(z13);
            AbstractC32069a.m99663a(strM113396S2, AbstractC1099a.m3393o(c22976l1M31081j, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 8, 0.0f, 0.0f, 13)), 0, 0, null, c28655q, 0, 28);
            c28655q.m87173q(true);
            modifier2 = c2314t;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2032u(viewState, function1, paymentMethodNameProvider, modifier2, i13, 10);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m35459k(String str, C11465b c11465b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1144143026);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c11465b) : c28655q.m87157i(c11465b) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(-1451301209);
            boolean z4 = true;
            boolean z13 = (i14 & 14) == 4;
            if ((i14 & 112) != 32 && ((i14 & 64) == 0 || !c28655q.m87157i(c11465b))) {
                z4 = false;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C27486p(str, c11465b, null, 1);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87254h(str, c11465b, (InterfaceC4351m) objM87133R, c28655q);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(str, c11465b, i13, 11);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m35460l(C11225s0 c11225s0, Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1607914208);
        int i14 = 20;
        if ((((c28655q.m87153g(c11225s0) ? 4 : 2) | i13 | 48) & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C11669n c11669n = C11671p.f37680a;
            C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C41210b c41210b = c11225s0.f36027c.f10414y;
            c28655q.m87150e0(1302819226);
            if (c41210b != null) {
                AbstractC32004s.m99532a(AbstractC35785b.m113396S(c41210b, c28655q), AbstractC1099a.m3393o(c22976l1M31081j, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 20, 7)), c28655q, 0, 0);
            }
            c28655q.m87173q(false);
            AbstractC34870c0.m110021w(c11225s0.f36027c, c2314t, c28655q, 48);
            c28655q.m87173q(true);
            modifier = c2314t;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13857f(c11225s0, modifier, i13, i14);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final int m35461m(AbstractC0262w0 abstractC0262w0, AbstractC39071a abstractC39071a) {
        AbstractC0262w0 abstractC0262w0Mo785I0 = abstractC0262w0.mo785I0();
        if (abstractC0262w0Mo785I0 == null) {
            AbstractC37831a.m121374b("Child of " + abstractC0262w0 + " cannot be null when calculating alignment line");
        }
        if (abstractC0262w0.mo789O0().mo776a().containsKey(abstractC39071a)) {
            Integer num = (Integer) abstractC0262w0.mo789O0().mo776a().get(abstractC39071a);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iMo450c0 = abstractC0262w0Mo785I0.mo450c0(abstractC39071a);
            if (iMo450c0 != Integer.MIN_VALUE) {
                abstractC0262w0Mo785I0.f897J = true;
                abstractC0262w0.f898K = true;
                abstractC0262w0.mo794U0();
                abstractC0262w0Mo785I0.f897J = false;
                abstractC0262w0.f898K = false;
                return iMo450c0 + ((int) (abstractC39071a instanceof C39111m ? abstractC0262w0Mo785I0.mo791Q0() & 4294967295L : abstractC0262w0Mo785I0.mo791Q0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m35462n(C12591f c12591f, long j7) {
        if (!c12591f.f9142w.f9141N) {
            return false;
        }
        C1134a c1134a = (C1134a) AbstractC0201g.m516p(c12591f).f783e0.f740d;
        if (!c1134a.f4881p0.f9141N) {
            return false;
        }
        long jMo3523Z = c1134a.mo3523Z(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3523Z >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo3523Z & 4294967295L));
        long j13 = c12591f.f42976Q;
        float f13 = ((int) (j13 >> 32)) + fIntBitsToFloat;
        float f14 = ((int) (j13 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j7 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f13) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f14;
    }

    /* JADX INFO: renamed from: o */
    public static final void m35463o(C12591f c12591f, C12554k0 c12554k0) {
        c12591f.m35289Y0(c12554k0);
        c12591f.m35291a1(c12554k0);
    }

    /* JADX INFO: renamed from: p */
    public static final void m35464p(InterfaceC0240p2 interfaceC0240p2, Function1 function1) {
        if (function1.invoke(interfaceC0240p2) != EnumC0236o2.f807w) {
            return;
        }
        AbstractC0201g.m520t(interfaceC0240p2, function1);
    }

    /* JADX INFO: renamed from: q */
    public static final float m35465q(long j7, long j13, long j14, float f13) {
        long jM51528p = AbstractC17918w0.m51528p(C17919x.m51541c(f13, j7), j14);
        float fM51536x = AbstractC17918w0.m51536x(AbstractC17918w0.m51528p(j13, jM51528p)) + 0.05f;
        float fM51536x2 = AbstractC17918w0.m51536x(jM51528p) + 0.05f;
        return Math.max(fM51536x, fM51536x2) / Math.min(fM51536x, fM51536x2);
    }

    /* JADX INFO: renamed from: r */
    public static C0072g m35466r(C0072g c0072g, InterfaceC31163w0 interfaceC31163w0, List list) {
        List parameters = ((AbstractC34676g) interfaceC31163w0).f146066I.getParameters();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(parameters, 10));
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC31165x0) it.next()).mo78660a());
        }
        return new C0072g(c0072g, interfaceC31163w0, list, AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, list)), 22);
    }

    /* JADX INFO: renamed from: s */
    public static C25989b m35467s(AbstractC25990c abstractC25990c, RecyclerView recyclerView) {
        C25989b c25989b = new C25989b();
        InterfaceC1756y1 c25988a = new C25988a(c25989b);
        C24782c c24782c = new C24782c();
        c24782c.f96960b = c25989b;
        abstractC25990c.m77109c();
        AbstractC25990c abstractC25990c2 = c25989b.f102690a;
        if (abstractC25990c2 != null) {
            ((C13724a) ((C21997d) abstractC25990c2.m77119p0()).f85233a.f42881x).remove(c24782c);
        }
        c25989b.f102690a = abstractC25990c;
        ((C13724a) ((C21997d) abstractC25990c.m77119p0()).f85233a.f42881x).add(c24782c);
        c25989b.setHasStableIds(abstractC25990c.m77126y());
        if (recyclerView != null) {
            recyclerView.setAdapter(c25989b);
            recyclerView.addOnItemTouchListener(c25988a);
        }
        abstractC25990c.mo72637G();
        return c25989b;
    }

    /* JADX INFO: renamed from: t */
    public static final long m35468t(AbstractC29701y abstractC29701y) {
        return AbstractC12889b.m36259Y(((C28617g1) abstractC29701y.f121433d.f93080d).m87022x() * abstractC29701y.m91165o()) + (((long) abstractC29701y.m91162k()) * ((long) abstractC29701y.m91165o()));
    }

    /* JADX INFO: renamed from: w */
    public static final C31020k m35469w(int i13) {
        double d3 = i13;
        C31008e c31008e = C31020k.f128009y;
        return new C31020k(d3, EnumC31018j.f128003w);
    }

    /* JADX INFO: renamed from: x */
    public static C2627t3 m35470x(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-214126613);
        c28655q.m87150e0(-1604949716);
        C11666k c11666k = C11671p.f37684e;
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        C2627t3 c2627t3 = (C2627t3) c28655q.m87161k(AbstractC2543i4.f9874a);
        boolean zM31939G = AbstractC11894a.m31939G(c28655q);
        c28655q.m87150e0(197436429);
        boolean zM87153g = c28655q.m87153g(c11666k) | c28655q.m87153g(context) | c28655q.m87153g(c2627t3) | c28655q.m87155h(zM31939G);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            long jM51515c = c2627t3.f10223a;
            if (jM51515c == 16) {
                jM51515c = AbstractC17918w0.m51515c(AbstractC11673r.m31074c(c11666k, context));
            }
            long j7 = jM51515c;
            long jM51515c2 = c2627t3.f10224b;
            if (jM51515c2 == 16) {
                jM51515c2 = AbstractC17918w0.m51515c(AbstractC11673r.m31079h(c11666k, context));
            }
            long j13 = jM51515c2;
            long jM51515c3 = c2627t3.f10225c;
            if (jM51515c3 == 16) {
                jM51515c3 = AbstractC17918w0.m51515c(AbstractC32122c.getColor(context, R.color.stripe_paymentsheet_primary_button_success_background));
            }
            long j14 = jM51515c3;
            long j15 = c2627t3.f10226d;
            if (j15 == 16) {
                j15 = zM31939G ? C17919x.f69625b : C17919x.f69629f;
            }
            long j16 = j15;
            long jM51515c4 = c2627t3.f10227e;
            if (jM51515c4 == 16) {
                jM51515c4 = AbstractC17918w0.m51515c(AbstractC11673r.m31076e(c11666k, context));
            }
            C2627t3 c2627t4 = new C2627t3(j7, j13, j14, j16, jM51515c4);
            c28655q.m87172p0(c2627t4);
            objM87133R = c2627t4;
        }
        C2627t3 c2627t5 = (C2627t3) objM87133R;
        AbstractC25012a.m73392y(c28655q, false, false, false);
        return c2627t5;
    }

    /* JADX INFO: renamed from: y */
    public static Drawable m35471y(Context context, Context context2, int i13) {
        return m35472z(context, context2, i13, null);
    }

    /* JADX INFO: renamed from: z */
    public static Drawable m35472z(Context context, Context context2, int i13, Resources.Theme theme) {
        try {
            if (f43316e) {
                return AbstractC30060g.m92133x(theme != null ? new C29660d(context2, theme) : context2, i13);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e5) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e5;
            }
            return AbstractC32122c.getDrawable(context2, i13);
        } catch (NoClassDefFoundError unused2) {
            f43316e = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC34523k.f145117a;
        return AbstractC34514b.m109070f(resources, i13, theme);
    }

    /* JADX INFO: renamed from: J */
    public abstract int mo4437J(byte[] bArr, int i13, int i14);

    /* JADX INFO: renamed from: u */
    public abstract String mo4438u(byte[] bArr, int i13, int i14);

    /* JADX INFO: renamed from: v */
    public abstract int mo4439v(String str, byte[] bArr, int i13, int i14);
}
