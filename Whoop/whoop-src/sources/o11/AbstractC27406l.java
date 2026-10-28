package o11;

import am2.C1017f0;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import b30.C2646w1;
import c31.C3922f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp0.C11005v0;
import d01.C11439d;
import gy0.AbstractC16277f;
import hb3.AbstractC17104a0;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import j93.AbstractC21478l0;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kw1.C22852c;
import l83.C23454a0;
import l83.InterfaceC23459e;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import mh.C25540h;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import ny0.C27266m;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11352g;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15210z4;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.C17891j;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17910s0;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.C18027i;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import p720m91.AbstractC25303l;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import ph.C29227a;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: o11.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aû\u0001\u0010*\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010 \u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00172\"\b\u0002\u0010#\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b*\u0010+\u001a_\u0010,\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b,\u0010-\u001aO\u0010/\u001a\u00020\u0007*\u00020.2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0003¢\u0006\u0004\b/\u00100\u001a1\u00101\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u00152\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0003¢\u0006\u0004\b1\u00102\u001a\u000f\u00103\u001a\u00020\u0007H\u0003¢\u0006\u0004\b3\u00104\u001a\u000f\u00105\u001a\u00020\u0007H\u0003¢\u0006\u0004\b5\u00104\"\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u0010;\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108\"\u0014\u0010=\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108\"\u0014\u0010?\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108\"\u0014\u0010A\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00108\"\u0014\u0010D\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00101¨\u0006F²\u0006\f\u0010E\u001a\u00020$8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "titleBarModifier", "Lo11/m;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "p", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lo11/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkd1/o;", "image", "N", "(Landroidx/compose/ui/Modifier;Lkd1/o;)Landroidx/compose/ui/Modifier;", "", "enabled", "Li3/z;", "semanticsProperties", "Li3/i;", "role", "Ly81/e;", "backgroundColor", "Lcom/whoop/design/util/TextResource;", "title", "titleTextColor", "subtitle", "subtitleTextColor", "isSubtitleAboveTitle", "", "", "achievementIcons", "imageModifier", "imageBackgroundColor", "imageContentDescription", "titleBarEndContent", "", "titleBarEndContentRotation", "onTitleBarClickEvent", "onImageClickEvent", "", "imageTestTag", "z", "(ZLkotlin/jvm/functions/Function1;Li3/i;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZLjava/util/List;Landroidx/compose/ui/Modifier;Lkd1/o;Ly81/e;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function3;FLjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V", "t", "(Landroidx/compose/ui/Modifier;Lkd1/o;Ly81/e;Lcom/whoop/design/util/TextResource;ZLjava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll0/s1;", "x", "(Ll0/s1;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZLjava/util/List;Landroidx/compose/runtime/Composer;II)V", "J", "(Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "C", "(Landroidx/compose/runtime/Composer;I)V", "A", "Ly3/f;", "a", "F", "achievementIconSize", "b", "titleBarHeight", "c", "tileCornerRadius", "d", "titleBarCornerRadius", "e", "imageCornerRadius", "Li2/x;", "f", "shadowColor", "endContentRotation", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27406l {

    /* JADX INFO: renamed from: a */
    private static final float f110229a;

    /* JADX INFO: renamed from: b */
    private static final float f110230b;

    /* JADX INFO: renamed from: c */
    private static final float f110231c;

    /* JADX INFO: renamed from: d */
    private static final float f110232d;

    /* JADX INFO: renamed from: e */
    private static final float f110233e;

    /* JADX INFO: renamed from: f */
    private static final long f110234f = C17919x.m51541c(0.1f, C17919x.f69625b);

    static {
        float f13 = 4;
        float f14 = 3 * f13;
        f110229a = f14;
        f110230b = 16 * f13;
        f110231c = f14;
        f110232d = f14;
        f110233e = 2 * f13;
    }

    /* JADX INFO: renamed from: A */
    private static final void m82640A(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-447445215);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3411h(2 * 4, AbstractC1102d.m3409f(1.0f, C2314t.f9131w)), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(f110234f), new C17919x(C17919x.f69636m)), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m82641B(int i13, Composer composer, int i14) {
        m82640A(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m82642C(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2002321653);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
            float f13 = f110230b;
            float fMo743q0 = interfaceC39171c.mo743q0(f13);
            float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f110232d);
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            boolean zM87147d = c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1);
            Object objM87133R = c28655q.m87133R();
            if (zM87147d || objM87133R == C28635l.f115821a) {
                objM87133R = new C11005v0(fMo743q0, fMo743q1, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3411h, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m82643D(float f13, float f14, InterfaceC22131e Canvas) throws Throwable {
        C0237p c0237p;
        float f15;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float f16 = f13 - f14;
        if (Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) - f16 > 0.0f) {
            C17891j c17891jM51478a = AbstractC17897m.m51478a();
            C16618c c16618cM48896j = AbstractC17269i.m48896j(0L, Canvas.mo731d());
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
            InterfaceC17910s0.m51496b(c17891jM51478a, AbstractC21478l0.m60423b(c16618cM48896j.f63939a, c16618cM48896j.f63940b, c16618cM48896j.f63941c, c16618cM48896j.f63942d, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))));
            C0237p c0237pMo744t0 = Canvas.mo744t0();
            long jM670A = c0237pMo744t0.m670A();
            c0237pMo744t0.m716w().mo51426q();
            try {
                ((C0929d) c0237pMo744t0.f812x).m2344b(c17891jM51478a, 0);
                ((C0929d) Canvas.mo744t0().f812x).m2355o(0.0f, f16, 0.0f, 0.0f);
                try {
                    f15 = -0.0f;
                    try {
                        InterfaceC22131e.m63383i0(Canvas, f110234f, 0L, 0L, 0.0f, null, 0, 126);
                        try {
                            ((C0929d) Canvas.mo744t0().f812x).m2355o(-0.0f, -f16, -0.0f, -0.0f);
                            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                        } catch (Throwable th3) {
                            th = th3;
                            c0237p = c0237pMo744t0;
                            AbstractC11266d.m30472z(c0237p, jM670A);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c0237p = c0237pMo744t0;
                        try {
                            ((C0929d) Canvas.mo744t0().f812x).m2355o(f15, -f16, f15, f15);
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            AbstractC11266d.m30472z(c0237p, jM670A);
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c0237p = c0237pMo744t0;
                    f15 = -0.0f;
                }
            } catch (Throwable th7) {
                th = th7;
                c0237p = c0237pMo744t0;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m82644E(int i13, Composer composer, int i14) {
        m82642C(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m82645F(Function1 function1, Object obj) {
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m82646G(boolean z4, Function1 function1, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        if (!z4) {
            AbstractC18041w.m51802a(semantics);
        }
        function1.invoke(semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final float m82647H(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m82648I(boolean z4, Function1 function1, C18027i c18027i, InterfaceC39332e interfaceC39332e, TextResource textResource, InterfaceC39332e interfaceC39332e2, TextResource textResource2, InterfaceC39332e interfaceC39332e3, boolean z13, List list, Modifier modifier, AbstractC22403o abstractC22403o, InterfaceC39332e interfaceC39332e4, TextResource textResource3, Function3 function3, float f13, Object obj, Object obj2, String str, Modifier modifier2, Function1 function2, int i13, int i14, int i15, int i16, Composer composer, int i17) {
        m82679z(z4, function1, c18027i, interfaceC39332e, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z13, list, modifier, abstractC22403o, interfaceC39332e4, textResource3, function3, f13, obj, obj2, str, modifier2, function2, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[LOOP:0: B:74:0x01e3->B:76:0x01e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0213  */
    /* JADX WARN: Code duplicated, block: B:81:0x0224  */
    /* JADX WARN: Code duplicated, block: B:84:0x022e  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: J */
    private static final void m82649J(final TextResource textResource, final InterfaceC39332e interfaceC39332e, List<Integer> list, Composer composer, final int i13, final int i14) {
        int i15;
        List<Integer> list2;
        boolean z4;
        final List<Integer> list3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        final List<Integer> list4;
        List<Integer> list5;
        int iHashCode;
        C2314t c2314t;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        boolean z13;
        int i16;
        C2314t c2314t2;
        boolean z14;
        C28655q c28655q2;
        C28655q c28655q3;
        ?? r10;
        C28655q c28655q4;
        Iterator<T> it;
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(1181027577);
        if ((i13 & 6) == 0) {
            i15 = (c28655q5.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q5.m87153g(interfaceC39332e) : c28655q5.m87157i(interfaceC39332e) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                list2 = list;
                i15 |= c28655q5.m87157i(list2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q5.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                if (textResource == null || !list4.isEmpty()) {
                    list5 = list4;
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 0.5d, 8, C2299e.f9108K, c28655q5, 54);
                    iHashCode = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(interfaceC4339a);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c22994r1M53376q);
                    AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N);
                    if (textResource == null) {
                        c28655q5.m87150e0(-1421128437);
                        c28655q5.m87173q(false);
                        i16 = i15;
                        c2314t2 = c2314t;
                        z14 = false;
                        c28655q2 = c28655q5;
                    } else {
                        c28655q5.m87150e0(-1421128436);
                        if (1.0f > 0.0d) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        i16 = i15;
                        c2314t2 = c2314t;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q5, i15 & 14), new LayoutWeightElement(1.0f, false), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q5, (i15 >> 3) & 14), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, C38072d.f163053a.m121952e(c28655q5, 6).getB3(), null, c28655q5, 0, 3120, 186360);
                        C28655q c28655q6 = c28655q5;
                        z14 = false;
                        c28655q6.m87173q(false);
                        c28655q2 = c28655q6;
                    }
                    if (list5.isEmpty()) {
                        c28655q2.m87150e0(-1420092819);
                        c28655q2.m87173q(z14);
                        c28655q3 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-1420724196);
                        if (textResource != null) {
                            c28655q2.m87150e0(-1420701566);
                            C28655q c28655q7 = c28655q2;
                            AbstractC30795n.m94707h("·", null, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 3) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB3(), null, c28655q7, 6, 0, 196602);
                            C28655q c28655q8 = c28655q7;
                            r10 = 0;
                            c28655q8.m87173q(false);
                            c28655q4 = c28655q8;
                        } else {
                            boolean z15 = z14;
                            c28655q2.m87150e0(-1420475731);
                            c28655q2.m87173q(z15);
                            c28655q4 = c28655q2;
                            r10 = z15;
                        }
                        it = list5.iterator();
                        while (it.hasNext()) {
                            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(((Number) it.next()).intValue(), c28655q4, r10), AbstractC30060g.m92103Y(c28655q4, AbstractC16277f.f62398y), AbstractC1102d.m3419p(f110229a, c2314t2), C17919x.f69637n, c28655q4, 3456, 0);
                        }
                        c28655q4.m87173q(r10);
                        c28655q3 = c28655q4;
                    }
                    c28655q3.m87173q(true);
                    list3 = list5;
                    c28655q = c28655q3;
                } else {
                    c28677v1M87180u = c28655q5.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    }
                    final int i18 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: o11.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i18) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC27406l.m82650K(textResource, interfaceC39332e, list4, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC27406l.m82651L(textResource, interfaceC39332e, list4, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q5.m87138X();
            list3 = list2;
            c28655q = c28655q5;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i19 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: o11.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i19) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC27406l.m82650K(textResource, interfaceC39332e, list3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC27406l.m82651L(textResource, interfaceC39332e, list3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 384;
        list2 = list;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q5.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                list4 = C25271y.f99162w;
            } else {
                list4 = list2;
            }
            if (textResource == null) {
            }
            list5 = list4;
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q((float) 0.5d, 8, C2299e.f9108K, c28655q5, 54);
            iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, c2314t);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c22994r1M53376q2);
            AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q5.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N2);
            if (textResource == null) {
                c28655q5.m87150e0(-1421128437);
                c28655q5.m87173q(false);
                i16 = i15;
                c2314t2 = c2314t;
                z14 = false;
                c28655q2 = c28655q5;
            } else {
                c28655q5.m87150e0(-1421128436);
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                i16 = i15;
                c2314t2 = c2314t;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q5, i15 & 14), new LayoutWeightElement(1.0f, false), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q5, (i15 >> 3) & 14), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, C38072d.f163053a.m121952e(c28655q5, 6).getB3(), null, c28655q5, 0, 3120, 186360);
                C28655q c28655q9 = c28655q5;
                z14 = false;
                c28655q9.m87173q(false);
                c28655q2 = c28655q9;
            }
            if (list5.isEmpty()) {
                c28655q2.m87150e0(-1420724196);
                if (textResource != null) {
                    c28655q2.m87150e0(-1420701566);
                    C28655q c28655q10 = c28655q2;
                    AbstractC30795n.m94707h("·", null, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i16 >> 3) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB3(), null, c28655q10, 6, 0, 196602);
                    C28655q c28655q11 = c28655q10;
                    r10 = 0;
                    c28655q11.m87173q(false);
                    c28655q4 = c28655q11;
                } else {
                    boolean z16 = z14;
                    c28655q2.m87150e0(-1420475731);
                    c28655q2.m87173q(z16);
                    c28655q4 = c28655q2;
                    r10 = z16;
                }
                it = list5.iterator();
                while (it.hasNext()) {
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(((Number) it.next()).intValue(), c28655q4, r10), AbstractC30060g.m92103Y(c28655q4, AbstractC16277f.f62398y), AbstractC1102d.m3419p(f110229a, c2314t2), C17919x.f69637n, c28655q4, 3456, 0);
                }
                c28655q4.m87173q(r10);
                c28655q3 = c28655q4;
            } else {
                c28655q2.m87150e0(-1420092819);
                c28655q2.m87173q(z14);
                c28655q3 = c28655q2;
            }
            c28655q3.m87173q(true);
            list3 = list5;
            c28655q = c28655q3;
        } else {
            c28655q5.m87138X();
            list3 = list2;
            c28655q = c28655q5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i110 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: o11.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i110) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC27406l.m82650K(textResource, interfaceC39332e, list3, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC27406l.m82651L(textResource, interfaceC39332e, list3, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m82650K(TextResource textResource, InterfaceC39332e interfaceC39332e, List list, int i13, int i14, Composer composer, int i15) {
        m82649J(textResource, interfaceC39332e, list, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m82651L(TextResource textResource, InterfaceC39332e interfaceC39332e, List list, int i13, int i14, Composer composer, int i15) {
        m82649J(textResource, interfaceC39332e, list, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final Modifier m82653N(Modifier modifier, AbstractC22403o abstractC22403o) {
        if (abstractC22403o instanceof AbstractC22403o.c) {
            return ((AbstractC22403o.c) abstractC22403o).getData() == null ? AbstractC1102d.m3419p(24, modifier) : AbstractC1102d.m3407d(1.0f, modifier);
        }
        return modifier;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x0153  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x0164  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0215  */
    /* JADX WARN: Code duplicated, block: B:83:0x0255  */
    /* JADX WARN: Code duplicated, block: B:86:0x0260  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public static final void m82669p(Modifier modifier, Modifier modifier2, AbstractC27407m itemState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier3;
        int i15;
        Modifier modifier4;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier5;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier6;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        InterfaceC27402h interfaceC27402hMo82689i;
        Object objM87133R;
        int i18;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(51306391);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier3 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier3 = modifier;
            i15 = (c28655q.m87153g(modifier3) ? 4 : 2) | i13;
        } else {
            modifier3 = modifier;
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier4 = modifier2;
                i15 |= c28655q.m87153g(modifier4) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(itemState)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i15 |= i18;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i24 != 0) {
                        modifier6 = c2314t;
                    } else {
                        modifier6 = modifier4;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C27266m(8);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    Modifier modifierM82653N = m82653N(c2314t, itemState.getImage());
                    Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC34132o.m107879c(itemState.m82686f(), AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(modifier3, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(f110231c)))), AbstractC8693b.m21274h(itemState.getTitle(), c28655q, 0));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    m82679z(itemState.getEnabled(), itemState.getSemanticsProperties(), itemState.getRole(), itemState.getBackgroundColor(), itemState.getTitle(), itemState.getTitleTextColor(), itemState.getSubtitle(), itemState.getSubtitleTextColor(), itemState.getIsSubtitleAboveTitle(), itemState.mo82685e(), modifierM82653N, itemState.getImage(), itemState.getImageBackgroundColor(), itemState.getImageContentDescription(), itemState.getTitleBarEndContent(), itemState.getTitleBarEndContentRotation(), itemState.getOnTitleBarClickEvent(), itemState.getOnImageClickEvent(), AbstractC11266d.m30461o("exercise_tile_image_", AbstractC8693b.m21274h(itemState.getTitle(), c28655q, 0)), modifier6, function4, c28655q, 0, (i15 << 24) & 1879048192, (i15 >> 9) & 14, 0);
                    function3 = function4;
                    c28655q = c28655q;
                    AbstractC29125c.m88520b(Boolean.valueOf(itemState.getIsExpanded()), null, null, null, C27395a.f110113a.m82553f(), c28655q, 24576, 14);
                    c28655q.m87173q(true);
                    interfaceC27402hMo82689i = itemState.getExpandedContent();
                    if (interfaceC27402hMo82689i == null) {
                        c28655q.m87150e0(942700498);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(942700499);
                        AbstractC1090b.m3350e(C23016z.f90757a, itemState.getIsExpanded(), null, AbstractC3788w0.m11576d(null, null, 13), AbstractC3788w0.m11584l(null, C2299e.f9107J, null, 13), null, AbstractC37817c.m121344e(685111353, c28655q, new C26949h(itemState, interfaceC27402hMo82689i, function3, 5)), c28655q, 1600518, 18);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    modifier5 = modifier6;
                } else {
                    c28655q.m87138X();
                    modifier5 = modifier4;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) modifier5, (Object) itemState, (InterfaceC23459e) function3, i13, i14, 28);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier3 = c2314t;
                }
                if (i24 != 0) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier4;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C27266m(8);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                Modifier modifierM82653N2 = m82653N(c2314t, itemState.getImage());
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(itemState.m82686f(), AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(modifier3, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(f110231c)))), AbstractC8693b.m21274h(itemState.getTitle(), c28655q, 0));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                m82679z(itemState.getEnabled(), itemState.getSemanticsProperties(), itemState.getRole(), itemState.getBackgroundColor(), itemState.getTitle(), itemState.getTitleTextColor(), itemState.getSubtitle(), itemState.getSubtitleTextColor(), itemState.getIsSubtitleAboveTitle(), itemState.mo82685e(), modifierM82653N2, itemState.getImage(), itemState.getImageBackgroundColor(), itemState.getImageContentDescription(), itemState.getTitleBarEndContent(), itemState.getTitleBarEndContentRotation(), itemState.getOnTitleBarClickEvent(), itemState.getOnImageClickEvent(), AbstractC11266d.m30461o("exercise_tile_image_", AbstractC8693b.m21274h(itemState.getTitle(), c28655q, 0)), modifier6, function4, c28655q, 0, (i15 << 24) & 1879048192, (i15 >> 9) & 14, 0);
                function3 = function4;
                c28655q = c28655q;
                AbstractC29125c.m88520b(Boolean.valueOf(itemState.getIsExpanded()), null, null, null, C27395a.f110113a.m82553f(), c28655q, 24576, 14);
                c28655q.m87173q(true);
                interfaceC27402hMo82689i = itemState.getExpandedContent();
                if (interfaceC27402hMo82689i == null) {
                    c28655q.m87150e0(942700498);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(942700499);
                    AbstractC1090b.m3350e(C23016z.f90757a, itemState.getIsExpanded(), null, AbstractC3788w0.m11576d(null, null, 13), AbstractC3788w0.m11584l(null, C2299e.f9107J, null, 13), null, AbstractC37817c.m121344e(685111353, c28655q, new C26949h(itemState, interfaceC27402hMo82689i, function3, 5)), c28655q, 1600518, 18);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier5 = modifier6;
            } else {
                c28655q.m87138X();
                modifier5 = modifier4;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) modifier5, (Object) itemState, (InterfaceC23459e) function3, i13, i14, 28);
            }
        }
        i15 |= 48;
        modifier4 = modifier2;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(itemState)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier3 = c2314t;
                }
                if (i24 != 0) {
                    modifier6 = c2314t;
                } else {
                    modifier6 = modifier4;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C27266m(8);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                Modifier modifierM82653N3 = m82653N(c2314t, itemState.getImage());
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(itemState.m82686f(), AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(modifier3, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(f110231c)))), AbstractC8693b.m21274h(itemState.getTitle(), c28655q, 0));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3599a3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                m82679z(itemState.getEnabled(), itemState.getSemanticsProperties(), itemState.getRole(), itemState.getBackgroundColor(), itemState.getTitle(), itemState.getTitleTextColor(), itemState.getSubtitle(), itemState.getSubtitleTextColor(), itemState.getIsSubtitleAboveTitle(), itemState.mo82685e(), modifierM82653N3, itemState.getImage(), itemState.getImageBackgroundColor(), itemState.getImageContentDescription(), itemState.getTitleBarEndContent(), itemState.getTitleBarEndContentRotation(), itemState.getOnTitleBarClickEvent(), itemState.getOnImageClickEvent(), AbstractC11266d.m30461o("exercise_tile_image_", AbstractC8693b.m21274h(itemState.getTitle(), c28655q, 0)), modifier6, function4, c28655q, 0, (i15 << 24) & 1879048192, (i15 >> 9) & 14, 0);
                function3 = function4;
                c28655q = c28655q;
                AbstractC29125c.m88520b(Boolean.valueOf(itemState.getIsExpanded()), null, null, null, C27395a.f110113a.m82553f(), c28655q, 24576, 14);
                c28655q.m87173q(true);
                interfaceC27402hMo82689i = itemState.getExpandedContent();
                if (interfaceC27402hMo82689i == null) {
                    c28655q.m87150e0(942700498);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(942700499);
                    AbstractC1090b.m3350e(C23016z.f90757a, itemState.getIsExpanded(), null, AbstractC3788w0.m11576d(null, null, 13), AbstractC3788w0.m11584l(null, C2299e.f9107J, null, 13), null, AbstractC37817c.m121344e(685111353, c28655q, new C26949h(itemState, interfaceC27402hMo82689i, function3, 5)), c28655q, 1600518, 18);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier5 = modifier6;
            } else {
                c28655q.m87138X();
                modifier5 = modifier4;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) modifier5, (Object) itemState, (InterfaceC23459e) function3, i13, i14, 28);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier3 = c2314t;
            }
            if (i24 != 0) {
                modifier6 = c2314t;
            } else {
                modifier6 = modifier4;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C27266m(8);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            Modifier modifierM82653N4 = m82653N(c2314t, itemState.getImage());
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC34132o.m107879c(itemState.m82686f(), AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(modifier3, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(f110231c)))), AbstractC8693b.m21274h(itemState.getTitle(), c28655q, 0));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3599a4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            m82679z(itemState.getEnabled(), itemState.getSemanticsProperties(), itemState.getRole(), itemState.getBackgroundColor(), itemState.getTitle(), itemState.getTitleTextColor(), itemState.getSubtitle(), itemState.getSubtitleTextColor(), itemState.getIsSubtitleAboveTitle(), itemState.mo82685e(), modifierM82653N4, itemState.getImage(), itemState.getImageBackgroundColor(), itemState.getImageContentDescription(), itemState.getTitleBarEndContent(), itemState.getTitleBarEndContentRotation(), itemState.getOnTitleBarClickEvent(), itemState.getOnImageClickEvent(), AbstractC11266d.m30461o("exercise_tile_image_", AbstractC8693b.m21274h(itemState.getTitle(), c28655q, 0)), modifier6, function4, c28655q, 0, (i15 << 24) & 1879048192, (i15 >> 9) & 14, 0);
            function3 = function4;
            c28655q = c28655q;
            AbstractC29125c.m88520b(Boolean.valueOf(itemState.getIsExpanded()), null, null, null, C27395a.f110113a.m82553f(), c28655q, 24576, 14);
            c28655q.m87173q(true);
            interfaceC27402hMo82689i = itemState.getExpandedContent();
            if (interfaceC27402hMo82689i == null) {
                c28655q.m87150e0(942700498);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(942700499);
                AbstractC1090b.m3350e(C23016z.f90757a, itemState.getIsExpanded(), null, AbstractC3788w0.m11576d(null, null, 13), AbstractC3788w0.m11584l(null, C2299e.f9107J, null, 13), null, AbstractC37817c.m121344e(685111353, c28655q, new C26949h(itemState, interfaceC27402hMo82689i, function3, 5)), c28655q, 1600518, 18);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier5 = modifier6;
        } else {
            c28655q.m87138X();
            modifier5 = modifier4;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) modifier5, (Object) itemState, (InterfaceC23459e) function3, i13, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m82670q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m82671r(AbstractC27407m abstractC27407m, InterfaceC27402h interfaceC27402h, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "exercise_tile_expanded_content_" + AbstractC8693b.m21274h(abstractC27407m.getTitle(), composer, 0));
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3599a);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        AbstractC25303l.m74291r(interfaceC27402h, null, null, function1, composer, 0, 6);
        m82640A(composer, 0);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m82672s(Modifier modifier, Modifier modifier2, AbstractC27407m abstractC27407m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m82669p(modifier, modifier2, abstractC27407m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m82673t(Modifier modifier, AbstractC22403o abstractC22403o, InterfaceC39332e interfaceC39332e, TextResource textResource, boolean z4, Object obj, String str, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22403o abstractC22403o2;
        Modifier modifier3;
        C2314t c2314t;
        Modifier modifierM3360e;
        String strM21274h;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-754384728);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            abstractC22403o2 = abstractC22403o;
            i15 |= c28655q.m87153g(abstractC22403o2) ? 32 : 16;
        } else {
            abstractC22403o2 = abstractC22403o;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(interfaceC39332e) : c28655q.m87157i(interfaceC39332e) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(textResource) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(obj) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q.m87153g(str) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87157i(function1) ? 8388608 : 4194304;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (4793491 & i15) != 4793490)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t2 : modifier2;
            float f13 = 18 * 4;
            int iMo743q0 = ((int) ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f13)) * 2;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (!z4 || AbstractC22676k.m65745e(obj, C23454a0.f92919a)) {
                c2314t = c2314t2;
                c28655q.m87150e0(1689288930);
                c28655q.m87173q(false);
                modifierM3360e = c2314t;
            } else {
                c28655q.m87150e0(1689102341);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                boolean zM87157i = ((i17 & 29360128) == 8388608) | c28655q.m87157i(obj);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C11439d(function1, obj, 10);
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM3360e = AbstractC1092a.m3360e(c2314t2, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28);
                c2314t = c2314t2;
                c28655q.m87173q(false);
            }
            float f14 = ((float) 0.5d) * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3424u(f13, c2314t)), f14, f14, 0.0f, f14, 4);
            long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, (i17 >> 6) & 14);
            float f15 = f110233e;
            Modifier modifierMo3471e = AbstractC1136a.m3599a(AbstractC1092a.m3358c(modifierM3398t, jMo134584toComposableColorWaAFU9c, AbstractC33253j.m105489e(f15)), str).mo3471e(modifierM3360e);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            Modifier modifierM118994r = AbstractC37056f.m118994r(modifier4, AbstractC33253j.m105489e(f15));
            boolean zM87149e = c28655q.m87149e(iMo743q0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87149e || objM87133R3 == c28676v0) {
                objM87133R3 = new C6494e(iMo743q0, 23);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o2, null, (Function1) objM87133R3, c28655q, (i17 >> 3) & 14, 1);
            if (textResource == null) {
                c28655q.m87150e0(-1470515813);
                c28655q.m87173q(false);
                strM21274h = null;
            } else {
                c28655q.m87150e0(-1470515812);
                strM21274h = AbstractC8693b.m21274h(textResource, c28655q, 0);
                c28655q.m87173q(false);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i, strM21274h, modifierM118994r, null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2646w1(modifier3, abstractC22403o, interfaceC39332e, textResource, z4, obj, str, function1, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m82674u(Function1 function1, Object obj) {
        function1.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m82675v(int i13, C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75120d(i13, i13);
        rememberImagePainter.f100086j = new C29227a(0, 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m82676w(Modifier modifier, AbstractC22403o abstractC22403o, InterfaceC39332e interfaceC39332e, TextResource textResource, boolean z4, Object obj, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m82673t(modifier, abstractC22403o, interfaceC39332e, textResource, z4, obj, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:83:0x011c  */
    /* JADX WARN: Code duplicated, block: B:86:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0147  */
    /* JADX WARN: Code duplicated, block: B:92:0x0162  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:99:0x0201  */
    /* JADX INFO: renamed from: x */
    private static final void m82677x(InterfaceC22997s1 interfaceC22997s1, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, InterfaceC39332e interfaceC39332e2, boolean z4, List<Integer> list, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        List<Integer> list2;
        int i17;
        int i18;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        List<Integer> list3;
        C28677v1 c28677v1M87180u;
        boolean z16;
        List<Integer> list4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        List<Integer> list5;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2137798990);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q2.m87153g(interfaceC39332e) : c28655q2.m87157i(interfaceC39332e) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(textResource2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= (32768 & i13) == 0 ? c28655q2.m87153g(interfaceC39332e2) : c28655q2.m87157i(interfaceC39332e2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((196608 & i13) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((1572864 & i13) == 0) {
                    list2 = list;
                    if (c28655q2.m87157i(list2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i18 & 1, z14)) {
                    if (i19 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i16 != 0) {
                        list4 = C25271y.f99162w;
                    } else {
                        list4 = list2;
                    }
                    float f13 = 8;
                    Modifier modifierMo66772c = interfaceC22997s1.mo66772c(AbstractC1099a.m3395q(C2314t.f9131w, ((float) 1.5d) * f13, ((float) 0.5d) * f13), true, 1.0f);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo66772c);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    if (z16) {
                        c28655q2.m87150e0(-121555402);
                        m82649J(textResource2, interfaceC39332e2, list4, c28655q2, ((i18 >> 12) & 896) | ((i18 >> 9) & 126), 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-121355514);
                        c28655q2.m87173q(false);
                    }
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, (i18 >> 3) & 14), null, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 3120, 186362);
                    if (z16) {
                        list5 = list4;
                        c28655q2.m87150e0(-120871418);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-121071306);
                        list5 = list4;
                        m82649J(textResource2, interfaceC39332e2, list5, c28655q2, ((i18 >> 9) & 126) | ((i18 >> 12) & 896), 0);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    list3 = list5;
                    z15 = z16;
                } else {
                    c28655q2.m87138X();
                    c28655q = c28655q2;
                    z15 = z13;
                    list3 = list2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(interfaceC22997s1, textResource, interfaceC39332e, textResource2, interfaceC39332e2, z15, list3, i13, i14);
                }
            }
            i15 |= 1572864;
            list2 = list;
            i18 = i15;
            if ((i18 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z14)) {
                if (i19 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                float f14 = 8;
                Modifier modifierMo66772c2 = interfaceC22997s1.mo66772c(AbstractC1099a.m3395q(C2314t.f9131w, ((float) 1.5d) * f14, ((float) 0.5d) * f14), true, 1.0f);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                if (z16) {
                    c28655q2.m87150e0(-121555402);
                    m82649J(textResource2, interfaceC39332e2, list4, c28655q2, ((i18 >> 12) & 896) | ((i18 >> 9) & 126), 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-121355514);
                    c28655q2.m87173q(false);
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, (i18 >> 3) & 14), null, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 3120, 186362);
                if (z16) {
                    c28655q2.m87150e0(-121071306);
                    list5 = list4;
                    m82649J(textResource2, interfaceC39332e2, list5, c28655q2, ((i18 >> 9) & 126) | ((i18 >> 12) & 896), 0);
                    c28655q2.m87173q(false);
                } else {
                    list5 = list4;
                    c28655q2.m87150e0(-120871418);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                list3 = list5;
                z15 = z16;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                z15 = z13;
                list3 = list2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(interfaceC22997s1, textResource, interfaceC39332e, textResource2, interfaceC39332e2, z15, list3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((1572864 & i13) == 0) {
                list2 = list;
                if (c28655q2.m87157i(list2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z14)) {
                if (i19 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i16 != 0) {
                    list4 = C25271y.f99162w;
                } else {
                    list4 = list2;
                }
                float f15 = 8;
                Modifier modifierMo66772c3 = interfaceC22997s1.mo66772c(AbstractC1099a.m3395q(C2314t.f9131w, ((float) 1.5d) * f15, ((float) 0.5d) * f15), true, 1.0f);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                if (z16) {
                    c28655q2.m87150e0(-121555402);
                    m82649J(textResource2, interfaceC39332e2, list4, c28655q2, ((i18 >> 12) & 896) | ((i18 >> 9) & 126), 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-121355514);
                    c28655q2.m87173q(false);
                }
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, (i18 >> 3) & 14), null, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 3120, 186362);
                if (z16) {
                    c28655q2.m87150e0(-121071306);
                    list5 = list4;
                    m82649J(textResource2, interfaceC39332e2, list5, c28655q2, ((i18 >> 9) & 126) | ((i18 >> 12) & 896), 0);
                    c28655q2.m87173q(false);
                } else {
                    list5 = list4;
                    c28655q2.m87150e0(-120871418);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                list3 = list5;
                z15 = z16;
            } else {
                c28655q2.m87138X();
                c28655q = c28655q2;
                z15 = z13;
                list3 = list2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(interfaceC22997s1, textResource, interfaceC39332e, textResource2, interfaceC39332e2, z15, list3, i13, i14);
            }
        }
        i15 |= 1572864;
        list2 = list;
        i18 = i15;
        if ((i18 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z14)) {
            if (i19 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (i16 != 0) {
                list4 = C25271y.f99162w;
            } else {
                list4 = list2;
            }
            float f16 = 8;
            Modifier modifierMo66772c4 = interfaceC22997s1.mo66772c(AbstractC1099a.m3395q(C2314t.f9131w, ((float) 1.5d) * f16, ((float) 0.5d) * f16), true, 1.0f);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierMo66772c4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            if (z16) {
                c28655q2.m87150e0(-121555402);
                m82649J(textResource2, interfaceC39332e2, list4, c28655q2, ((i18 >> 12) & 896) | ((i18 >> 9) & 126), 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-121355514);
                c28655q2.m87173q(false);
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, (i18 >> 3) & 14), null, interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, (i18 >> 6) & 14), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 3120, 186362);
            if (z16) {
                c28655q2.m87150e0(-121071306);
                list5 = list4;
                m82649J(textResource2, interfaceC39332e2, list5, c28655q2, ((i18 >> 9) & 126) | ((i18 >> 12) & 896), 0);
                c28655q2.m87173q(false);
            } else {
                list5 = list4;
                c28655q2.m87150e0(-120871418);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q = c28655q2;
            list3 = list5;
            z15 = z16;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
            z15 = z13;
            list3 = list2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(interfaceC22997s1, textResource, interfaceC39332e, textResource2, interfaceC39332e2, z15, list3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m82678y(InterfaceC22997s1 interfaceC22997s1, TextResource textResource, InterfaceC39332e interfaceC39332e, TextResource textResource2, InterfaceC39332e interfaceC39332e2, boolean z4, List list, int i13, int i14, Composer composer, int i15) {
        m82677x(interfaceC22997s1, textResource, interfaceC39332e, textResource2, interfaceC39332e2, z4, list, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:103:0x0167  */
    /* JADX WARN: Code duplicated, block: B:107:0x016f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0173  */
    /* JADX WARN: Code duplicated, block: B:110:0x0178  */
    /* JADX WARN: Code duplicated, block: B:112:0x017e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0186  */
    /* JADX WARN: Code duplicated, block: B:119:0x018f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0196  */
    /* JADX WARN: Code duplicated, block: B:125:0x019d  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01da  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:165:0x0208  */
    /* JADX WARN: Code duplicated, block: B:167:0x020e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0211  */
    /* JADX WARN: Code duplicated, block: B:170:0x0216  */
    /* JADX WARN: Code duplicated, block: B:173:0x0224  */
    /* JADX WARN: Code duplicated, block: B:179:0x0230  */
    /* JADX WARN: Code duplicated, block: B:183:0x023a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x023c  */
    /* JADX WARN: Code duplicated, block: B:185:0x023f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0245  */
    /* JADX WARN: Code duplicated, block: B:189:0x0247  */
    /* JADX WARN: Code duplicated, block: B:191:0x024b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0250  */
    /* JADX WARN: Code duplicated, block: B:195:0x0276  */
    /* JADX WARN: Code duplicated, block: B:198:0x0281  */
    /* JADX WARN: Code duplicated, block: B:201:0x0294  */
    /* JADX WARN: Code duplicated, block: B:204:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:205:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:208:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:212:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:213:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:216:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:217:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:220:0x02df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:224:0x0319  */
    /* JADX WARN: Code duplicated, block: B:225:0x031d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0330  */
    /* JADX WARN: Code duplicated, block: B:231:0x0341  */
    /* JADX WARN: Code duplicated, block: B:235:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:236:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:238:0x0408  */
    /* JADX WARN: Code duplicated, block: B:239:0x040c  */
    /* JADX WARN: Code duplicated, block: B:242:0x041b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0429  */
    /* JADX WARN: Code duplicated, block: B:249:0x044d  */
    /* JADX WARN: Code duplicated, block: B:252:0x045e  */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x012b  */
    /* JADX WARN: Code duplicated, block: B:86:0x012e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0136  */
    /* JADX WARN: Code duplicated, block: B:91:0x013f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0143  */
    /* JADX WARN: Code duplicated, block: B:95:0x014d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0150  */
    /* JADX WARN: Code duplicated, block: B:98:0x0155  */
    /* JADX INFO: renamed from: z */
    private static final void m82679z(final boolean z4, final Function1 function1, final C18027i c18027i, final InterfaceC39332e interfaceC39332e, final TextResource textResource, final InterfaceC39332e interfaceC39332e2, final TextResource textResource2, final InterfaceC39332e interfaceC39332e3, boolean z13, final List<Integer> list, Modifier modifier, final AbstractC22403o abstractC22403o, final InterfaceC39332e interfaceC39332e4, final TextResource textResource3, Function3 function3, final float f13, final Object obj, final Object obj2, final String str, final Modifier modifier2, Function1 function2, Composer composer, final int i13, final int i14, final int i15, final int i16) {
        int i17;
        C18027i c18027i2;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z14;
        Function1 function4;
        C28655q c28655q;
        final boolean z15;
        final Modifier modifier3;
        final Function3 function5;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C2314t c2314t;
        Modifier modifier4;
        Function3 function6;
        boolean z17;
        Object objM87133R;
        C28676v0 c28676v0;
        int i34;
        boolean z18;
        boolean zM87157i;
        Object objM87133R2;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C0209i c0209i5;
        C0209i c0209i6;
        InterfaceC28670t2 interfaceC28670t2M30588b;
        Function3 function7;
        int iHashCode2;
        boolean z26;
        int i35;
        boolean zM87157i2;
        int i36;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2115971432);
        if ((i13 & 6) == 0) {
            i17 = (c28655q2.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i17 = i13;
        }
        if ((i13 & 48) == 0) {
            i17 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            c18027i2 = c18027i;
            i17 |= c28655q2.m87153g(c18027i2) ? 256 : 128;
        } else {
            c18027i2 = c18027i;
        }
        int i37 = i13 & 3072;
        int i38 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i37 == 0) {
            i17 |= (i13 & 4096) == 0 ? c28655q2.m87153g(interfaceC39332e) : c28655q2.m87157i(interfaceC39332e) ? 2048 : 1024;
        }
        int i39 = i13 & 24576;
        int i44 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i39 == 0) {
            i17 |= c28655q2.m87153g(textResource) ? 16384 : 8192;
        }
        int i45 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i46 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i45 == 0) {
            i17 |= (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0 ? c28655q2.m87153g(interfaceC39332e2) : c28655q2.m87157i(interfaceC39332e2) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i17 |= c28655q2.m87153g(textResource2) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i17 |= (i13 & 16777216) == 0 ? c28655q2.m87153g(interfaceC39332e3) : c28655q2.m87157i(interfaceC39332e3) ? 8388608 : 4194304;
        }
        int i47 = i16 & 256;
        int i48 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i47 == 0) {
            if ((i13 & 100663296) == 0) {
                i17 |= c28655q2.m87155h(z13) ? 67108864 : 33554432;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(list)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i17 |= i36;
            }
            i18 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i18 != 0) {
                i19 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87153g(modifier)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i19 = i14 | i24;
            } else {
                i19 = i14;
            }
            if ((i14 & 48) == 0) {
                i19 |= c28655q2.m87153g(abstractC22403o) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if ((i14 & 512) == 0) {
                    zM87157i2 = c28655q2.m87153g(interfaceC39332e4);
                } else {
                    zM87157i2 = c28655q2.m87157i(interfaceC39332e4);
                }
                i19 |= zM87157i2 ? 256 : 128;
            }
            if ((i14 & 3072) != 0) {
                if (!c28655q2.m87153g(textResource3)) {
                    i38 = 1024;
                }
                i19 |= i38;
            }
            i25 = i19;
            i26 = i16 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i26 != 0) {
                i27 = i25;
                if ((i14 & 24576) == 0) {
                    if (c28655q2.m87157i(function3)) {
                        i44 = 16384;
                    }
                    i27 |= i44;
                }
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87147d(f13)) {
                        i46 = 131072;
                    }
                    i27 |= i46;
                }
                if ((i14 & 1572864) == 0) {
                    i27 |= c28655q2.m87157i(obj) ? 1048576 : 524288;
                }
                if ((i14 & 12582912) == 0) {
                    i27 |= c28655q2.m87157i(obj2) ? 8388608 : 4194304;
                }
                if ((i14 & 100663296) == 0) {
                    if (c28655q2.m87153g(str)) {
                        i48 = 67108864;
                    }
                    i27 |= i48;
                }
                if ((i14 & 805306368) == 0) {
                    i27 |= c28655q2.m87153g(modifier2) ? 536870912 : 268435456;
                }
                i28 = i27;
                if ((i15 & 6) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i35 = 4;
                    } else {
                        i35 = 2;
                    }
                    i29 = i15 | i35;
                } else {
                    i29 = i15;
                }
                if ((i17 & 306783379) != 306783378 && (i28 & 306783379) == 306783378) {
                    if ((i29 & 3) == 2) {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i17 & 1, z14)) {
                        if (i47 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        c2314t = C2314t.f9131w;
                        if (i18 != 0) {
                            modifier4 = c2314t;
                        } else {
                            modifier4 = modifier;
                        }
                        if (i26 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        int i49 = i17 >> 9;
                        Modifier modifier5 = modifier4;
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(f110230b, modifier2), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, i49 & 14), AbstractC33253j.m105489e(f110232d)));
                        if (z4 || AbstractC22676k.m65745e(obj, C23454a0.f92919a)) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                        objM87133R = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                        i34 = i29 & 14;
                        if (i34 == 4) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i = z18 | c28655q2.m87157i(obj);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87157i || objM87133R2 == c28676v0) {
                            objM87133R2 = new C11439d(function2, obj, 9);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3409f, interfaceC21083i, c1119dM43228a, z17, c18027i2, (InterfaceC4339a) objM87133R2, 8);
                        if ((i17 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i17 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z19 | z24;
                        objM87133R3 = c28655q2.m87133R();
                        if (z25 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C1017f0(z4, function1, 2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3360e, false, (Function1) objM87133R3);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM51775c);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            c0209i4 = c0209i2;
                        } else {
                            c0209i4 = c0209i2;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                            int i54 = i28 >> 6;
                            c0209i6 = c0209i4;
                            m82673t(modifier5, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i54 & 458752) | (i54 & 3670016) | ((i29 << 21) & 29360128), 0);
                            function4 = function2;
                            c28655q = c28655q2;
                            boolean z27 = z16;
                            m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z27, list, c28655q, (i49 & 112) | 6 | (i49 & 896) | (i49 & 7168) | (i49 & 57344) | (i49 & 458752) | (i49 & 3670016), 0);
                            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
                            function7 = function6;
                            if (function7 == null) {
                                c28655q.m87150e0(650917065);
                                c28655q.m87173q(false);
                                z26 = true;
                            } else {
                                c28655q.m87150e0(650917066);
                                Modifier modifierM5375L = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM5375L);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m2);
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                                function7.invoke(function4, c28655q, Integer.valueOf(i34));
                                z26 = true;
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z26);
                            function5 = function7;
                            z15 = z27;
                            modifier3 = modifier5;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                        c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                        int i55 = i28 >> 6;
                        c0209i6 = c0209i4;
                        m82673t(modifier5, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i55 & 458752) | (i55 & 3670016) | ((i29 << 21) & 29360128), 0);
                        function4 = function2;
                        c28655q = c28655q2;
                        boolean z28 = z16;
                        m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z28, list, c28655q, (i49 & 112) | 6 | (i49 & 896) | (i49 & 7168) | (i49 & 57344) | (i49 & 458752) | (i49 & 3670016), 0);
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
                        function7 = function6;
                        if (function7 == null) {
                            c28655q.m87150e0(650917065);
                            c28655q.m87173q(false);
                            z26 = true;
                        } else {
                            c28655q.m87150e0(650917066);
                            Modifier modifierM5375L2 = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM5375L2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                            function7.invoke(function4, c28655q, Integer.valueOf(i34));
                            z26 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z26);
                        function5 = function7;
                        z15 = z28;
                        modifier3 = modifier5;
                    } else {
                        function4 = function2;
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z15 = z13;
                        modifier3 = modifier;
                        function5 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        final Function1 function8 = function4;
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: o11.k
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC27406l.m82648I(z4, function1, c18027i, interfaceC39332e, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z15, list, modifier3, abstractC22403o, interfaceC39332e4, textResource3, function5, f13, obj, obj2, str, modifier2, function8, i13, i14, i15, i16, (Composer) obj3, iIntValue);
                            }
                        };
                    }
                }
                if (c28655q2.m87135U(i17 & 1, z14)) {
                    if (i47 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier;
                    }
                    if (i26 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    int i410 = i17 >> 9;
                    Modifier modifier6 = modifier4;
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(f110230b, modifier2), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, i410 & 14), AbstractC33253j.m105489e(f110232d)));
                    if (z4) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    C1119d c1119dM43228a2 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                    i34 = i29 & 14;
                    if (i34 == 4) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i = z18 | c28655q2.m87157i(obj);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R2 = new C11439d(function2, obj, 9);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C11439d(function2, obj, 9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM3409f2, interfaceC21083i2, c1119dM43228a2, z17, c18027i2, (InterfaceC4339a) objM87133R2, 8);
                    if ((i17 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if ((i17 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z19 | z24;
                    objM87133R3 = c28655q2.m87133R();
                    if (z25) {
                        objM87133R3 = new C1017f0(z4, function1, 2);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C1017f0(z4, function1, 2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3360e2, false, (Function1) objM87133R3);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM51775c2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                    c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        c0209i4 = c0209i2;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
                        int i56 = i28 >> 6;
                        c0209i6 = c0209i4;
                        m82673t(modifier6, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i56 & 458752) | (i56 & 3670016) | ((i29 << 21) & 29360128), 0);
                        function4 = function2;
                        c28655q = c28655q2;
                        boolean z29 = z16;
                        m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z29, list, c28655q, (i410 & 112) | 6 | (i410 & 896) | (i410 & 7168) | (i410 & 57344) | (i410 & 458752) | (i410 & 3670016), 0);
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
                        function7 = function6;
                        if (function7 == null) {
                            c28655q.m87150e0(650917065);
                            c28655q.m87173q(false);
                            z26 = true;
                        } else {
                            c28655q.m87150e0(650917066);
                            Modifier modifierM5375L3 = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM5375L3);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                            function7.invoke(function4, c28655q, Integer.valueOf(i34));
                            z26 = true;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z26);
                        function5 = function7;
                        z15 = z29;
                        modifier3 = modifier6;
                    } else {
                        c0209i4 = c0209i2;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
                    int i57 = i28 >> 6;
                    c0209i6 = c0209i4;
                    m82673t(modifier6, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i57 & 458752) | (i57 & 3670016) | ((i29 << 21) & 29360128), 0);
                    function4 = function2;
                    c28655q = c28655q2;
                    boolean z210 = z16;
                    m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z210, list, c28655q, (i410 & 112) | 6 | (i410 & 896) | (i410 & 7168) | (i410 & 57344) | (i410 & 458752) | (i410 & 3670016), 0);
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
                    function7 = function6;
                    if (function7 == null) {
                        c28655q.m87150e0(650917065);
                        c28655q.m87173q(false);
                        z26 = true;
                    } else {
                        c28655q.m87150e0(650917066);
                        Modifier modifierM5375L4 = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM5375L4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
                        function7.invoke(function4, c28655q, Integer.valueOf(i34));
                        z26 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z26);
                    function5 = function7;
                    z15 = z210;
                    modifier3 = modifier6;
                } else {
                    function4 = function2;
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z15 = z13;
                    modifier3 = modifier;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final Function1 function9 = function4;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: o11.k
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC27406l.m82648I(z4, function1, c18027i, interfaceC39332e, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z15, list, modifier3, abstractC22403o, interfaceC39332e4, textResource3, function5, f13, obj, obj2, str, modifier2, function9, i13, i14, i15, i16, (Composer) obj3, iIntValue);
                        }
                    };
                }
            }
            i27 = i25 | 24576;
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87147d(f13)) {
                    i46 = 131072;
                }
                i27 |= i46;
            }
            if ((i14 & 1572864) == 0) {
                i27 |= c28655q2.m87157i(obj) ? 1048576 : 524288;
            }
            if ((i14 & 12582912) == 0) {
                i27 |= c28655q2.m87157i(obj2) ? 8388608 : 4194304;
            }
            if ((i14 & 100663296) == 0) {
                if (c28655q2.m87153g(str)) {
                    i48 = 67108864;
                }
                i27 |= i48;
            }
            if ((i14 & 805306368) == 0) {
                i27 |= c28655q2.m87153g(modifier2) ? 536870912 : 268435456;
            }
            i28 = i27;
            if ((i15 & 6) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i29 = i15 | i35;
            } else {
                i29 = i15;
            }
            z14 = (i17 & 306783379) != 306783378 ? true : true;
            if (c28655q2.m87135U(i17 & 1, z14)) {
                if (i47 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier;
                }
                if (i26 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                int i411 = i17 >> 9;
                Modifier modifier7 = modifier4;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(f110230b, modifier2), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, i411 & 14), AbstractC33253j.m105489e(f110232d)));
                if (z4) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                C1119d c1119dM43228a3 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                i34 = i29 & 14;
                if (i34 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i = z18 | c28655q2.m87157i(obj);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C11439d(function2, obj, 9);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11439d(function2, obj, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e3 = AbstractC1092a.m3360e(modifierM3409f3, interfaceC21083i3, c1119dM43228a3, z17, c18027i2, (InterfaceC4339a) objM87133R2, 8);
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((i17 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z19 | z24;
                objM87133R3 = c28655q2.m87133R();
                if (z25) {
                    objM87133R3 = new C1017f0(z4, function1, 2);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C1017f0(z4, function1, 2);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM51775c3 = AbstractC18032n.m51775c(modifierM3360e3, false, (Function1) objM87133R3);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM51775c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m7);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i4 = c0209i2;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N7);
                    int i58 = i28 >> 6;
                    c0209i6 = c0209i4;
                    m82673t(modifier7, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i58 & 458752) | (i58 & 3670016) | ((i29 << 21) & 29360128), 0);
                    function4 = function2;
                    c28655q = c28655q2;
                    boolean z211 = z16;
                    m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z211, list, c28655q, (i411 & 112) | 6 | (i411 & 896) | (i411 & 7168) | (i411 & 57344) | (i411 & 458752) | (i411 & 3670016), 0);
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
                    function7 = function6;
                    if (function7 == null) {
                        c28655q.m87150e0(650917065);
                        c28655q.m87173q(false);
                        z26 = true;
                    } else {
                        c28655q.m87150e0(650917066);
                        Modifier modifierM5375L5 = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM5375L5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m8);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N8);
                        function7.invoke(function4, c28655q, Integer.valueOf(i34));
                        z26 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z26);
                    function5 = function7;
                    z15 = z211;
                    modifier3 = modifier7;
                } else {
                    c0209i4 = c0209i2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N7);
                int i59 = i28 >> 6;
                c0209i6 = c0209i4;
                m82673t(modifier7, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i59 & 458752) | (i59 & 3670016) | ((i29 << 21) & 29360128), 0);
                function4 = function2;
                c28655q = c28655q2;
                boolean z212 = z16;
                m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z212, list, c28655q, (i411 & 112) | 6 | (i411 & 896) | (i411 & 7168) | (i411 & 57344) | (i411 & 458752) | (i411 & 3670016), 0);
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
                function7 = function6;
                if (function7 == null) {
                    c28655q.m87150e0(650917065);
                    c28655q.m87173q(false);
                    z26 = true;
                } else {
                    c28655q.m87150e0(650917066);
                    Modifier modifierM5375L6 = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM5375L6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N9);
                    function7.invoke(function4, c28655q, Integer.valueOf(i34));
                    z26 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z26);
                function5 = function7;
                z15 = z212;
                modifier3 = modifier7;
            } else {
                function4 = function2;
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                modifier3 = modifier;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final Function1 function10 = function4;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: o11.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC27406l.m82648I(z4, function1, c18027i, interfaceC39332e, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z15, list, modifier3, abstractC22403o, interfaceC39332e4, textResource3, function5, f13, obj, obj2, str, modifier2, function10, i13, i14, i15, i16, (Composer) obj3, iIntValue);
                    }
                };
            }
        }
        i17 |= 100663296;
        if ((i13 & 805306368) == 0) {
            if (c28655q2.m87157i(list)) {
                i36 = 536870912;
            } else {
                i36 = 268435456;
            }
            i17 |= i36;
        }
        i18 = i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i18 != 0) {
            i19 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q2.m87153g(modifier)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i19 = i14 | i24;
        } else {
            i19 = i14;
        }
        if ((i14 & 48) == 0) {
            i19 |= c28655q2.m87153g(abstractC22403o) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            if ((i14 & 512) == 0) {
                zM87157i2 = c28655q2.m87153g(interfaceC39332e4);
            } else {
                zM87157i2 = c28655q2.m87157i(interfaceC39332e4);
            }
            i19 |= zM87157i2 ? 256 : 128;
        }
        if ((i14 & 3072) != 0) {
            if (!c28655q2.m87153g(textResource3)) {
                i38 = 1024;
            }
            i19 |= i38;
        }
        i25 = i19;
        i26 = i16 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i26 != 0) {
            i27 = i25;
            if ((i14 & 24576) == 0) {
                if (c28655q2.m87157i(function3)) {
                    i44 = 16384;
                }
                i27 |= i44;
            }
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87147d(f13)) {
                    i46 = 131072;
                }
                i27 |= i46;
            }
            if ((i14 & 1572864) == 0) {
                i27 |= c28655q2.m87157i(obj) ? 1048576 : 524288;
            }
            if ((i14 & 12582912) == 0) {
                i27 |= c28655q2.m87157i(obj2) ? 8388608 : 4194304;
            }
            if ((i14 & 100663296) == 0) {
                if (c28655q2.m87153g(str)) {
                    i48 = 67108864;
                }
                i27 |= i48;
            }
            if ((i14 & 805306368) == 0) {
                i27 |= c28655q2.m87153g(modifier2) ? 536870912 : 268435456;
            }
            i28 = i27;
            if ((i15 & 6) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i29 = i15 | i35;
            } else {
                i29 = i15;
            }
            if ((i17 & 306783379) != 306783378) {
            }
            if (c28655q2.m87135U(i17 & 1, z14)) {
                if (i47 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier;
                }
                if (i26 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                int i412 = i17 >> 9;
                Modifier modifier8 = modifier4;
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(f110230b, modifier2), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, i412 & 14), AbstractC33253j.m105489e(f110232d)));
                if (z4) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                C1119d c1119dM43228a4 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                i34 = i29 & 14;
                if (i34 == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i = z18 | c28655q2.m87157i(obj);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C11439d(function2, obj, 9);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11439d(function2, obj, 9);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM3360e4 = AbstractC1092a.m3360e(modifierM3409f4, interfaceC21083i4, c1119dM43228a4, z17, c18027i2, (InterfaceC4339a) objM87133R2, 8);
                if ((i17 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((i17 & 112) == 32) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z19 | z24;
                objM87133R3 = c28655q2.m87133R();
                if (z25) {
                    objM87133R3 = new C1017f0(z4, function1, 2);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C1017f0(z4, function1, 2);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM51775c4 = AbstractC18032n.m51775c(modifierM3360e4, false, (Function1) objM87133R3);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM51775c4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a4);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m10);
                c0209i3 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c0209i4 = c0209i2;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N10);
                    int i510 = i28 >> 6;
                    c0209i6 = c0209i4;
                    m82673t(modifier8, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i510 & 458752) | (i510 & 3670016) | ((i29 << 21) & 29360128), 0);
                    function4 = function2;
                    c28655q = c28655q2;
                    boolean z213 = z16;
                    m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z213, list, c28655q, (i412 & 112) | 6 | (i412 & 896) | (i412 & 7168) | (i412 & 57344) | (i412 & 458752) | (i412 & 3670016), 0);
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
                    function7 = function6;
                    if (function7 == null) {
                        c28655q.m87150e0(650917065);
                        c28655q.m87173q(false);
                        z26 = true;
                    } else {
                        c28655q.m87150e0(650917066);
                        Modifier modifierM5375L7 = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM5375L7);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m11);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N11);
                        function7.invoke(function4, c28655q, Integer.valueOf(i34));
                        z26 = true;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z26);
                    function5 = function7;
                    z15 = z213;
                    modifier3 = modifier8;
                } else {
                    c0209i4 = c0209i2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N10);
                int i511 = i28 >> 6;
                c0209i6 = c0209i4;
                m82673t(modifier8, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i511 & 458752) | (i511 & 3670016) | ((i29 << 21) & 29360128), 0);
                function4 = function2;
                c28655q = c28655q2;
                boolean z214 = z16;
                m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z214, list, c28655q, (i412 & 112) | 6 | (i412 & 896) | (i412 & 7168) | (i412 & 57344) | (i412 & 458752) | (i412 & 3670016), 0);
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
                function7 = function6;
                if (function7 == null) {
                    c28655q.m87150e0(650917065);
                    c28655q.m87173q(false);
                    z26 = true;
                } else {
                    c28655q.m87150e0(650917066);
                    Modifier modifierM5375L8 = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM5375L8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N12);
                    function7.invoke(function4, c28655q, Integer.valueOf(i34));
                    z26 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z26);
                function5 = function7;
                z15 = z214;
                modifier3 = modifier8;
            } else {
                function4 = function2;
                c28655q = c28655q2;
                c28655q.m87138X();
                z15 = z13;
                modifier3 = modifier;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final Function1 function11 = function4;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: o11.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC27406l.m82648I(z4, function1, c18027i, interfaceC39332e, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z15, list, modifier3, abstractC22403o, interfaceC39332e4, textResource3, function5, f13, obj, obj2, str, modifier2, function11, i13, i14, i15, i16, (Composer) obj3, iIntValue);
                    }
                };
            }
        }
        i27 = i25 | 24576;
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87147d(f13)) {
                i46 = 131072;
            }
            i27 |= i46;
        }
        if ((i14 & 1572864) == 0) {
            i27 |= c28655q2.m87157i(obj) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i27 |= c28655q2.m87157i(obj2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            if (c28655q2.m87153g(str)) {
                i48 = 67108864;
            }
            i27 |= i48;
        }
        if ((i14 & 805306368) == 0) {
            i27 |= c28655q2.m87153g(modifier2) ? 536870912 : 268435456;
        }
        i28 = i27;
        if ((i15 & 6) == 0) {
            if (c28655q2.m87157i(function2)) {
                i35 = 4;
            } else {
                i35 = 2;
            }
            i29 = i15 | i35;
        } else {
            i29 = i15;
        }
        if ((i17 & 306783379) != 306783378) {
        }
        if (c28655q2.m87135U(i17 & 1, z14)) {
            if (i47 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier;
            }
            if (i26 != 0) {
                function6 = null;
            } else {
                function6 = function3;
            }
            int i413 = i17 >> 9;
            Modifier modifier9 = modifier4;
            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC1102d.m3411h(f110230b, modifier2), interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q2, i413 & 14), AbstractC33253j.m105489e(f110232d)));
            if (z4) {
                z17 = false;
            } else {
                z17 = false;
            }
            C1119d c1119dM43228a5 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R;
            i34 = i29 & 14;
            if (i34 == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            zM87157i = z18 | c28655q2.m87157i(obj);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R2 = new C11439d(function2, obj, 9);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C11439d(function2, obj, 9);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3360e5 = AbstractC1092a.m3360e(modifierM3409f5, interfaceC21083i5, c1119dM43228a5, z17, c18027i2, (InterfaceC4339a) objM87133R2, 8);
            if ((i17 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            if ((i17 & 112) == 32) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = z19 | z24;
            objM87133R3 = c28655q2.m87133R();
            if (z25) {
                objM87133R3 = new C1017f0(z4, function1, 2);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C1017f0(z4, function1, 2);
                c28655q2.m87172p0(objM87133R3);
            }
            Modifier modifierM51775c5 = AbstractC18032n.m51775c(modifierM3360e5, false, (Function1) objM87133R3);
            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM51775c5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a5);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m13);
            c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c0209i4 = c0209i2;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N13);
                int i512 = i28 >> 6;
                c0209i6 = c0209i4;
                m82673t(modifier9, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i512 & 458752) | (i512 & 3670016) | ((i29 << 21) & 29360128), 0);
                function4 = function2;
                c28655q = c28655q2;
                boolean z215 = z16;
                m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z215, list, c28655q, (i413 & 112) | 6 | (i413 & 896) | (i413 & 7168) | (i413 & 57344) | (i413 & 458752) | (i413 & 3670016), 0);
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
                function7 = function6;
                if (function7 == null) {
                    c28655q.m87150e0(650917065);
                    c28655q.m87173q(false);
                    z26 = true;
                } else {
                    c28655q.m87150e0(650917066);
                    Modifier modifierM5375L9 = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM5375L9);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d9);
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N14);
                    function7.invoke(function4, c28655q, Integer.valueOf(i34));
                    z26 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z26);
                function5 = function7;
                z15 = z215;
                modifier3 = modifier9;
            } else {
                c0209i4 = c0209i2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N13);
            int i513 = i28 >> 6;
            c0209i6 = c0209i4;
            m82673t(modifier9, abstractC22403o, interfaceC39332e4, textResource3, z4, obj2, str, function2, c28655q2, (i28 & 8190) | ((i17 << 12) & 57344) | (i513 & 458752) | (i513 & 3670016) | ((i29 << 21) & 29360128), 0);
            function4 = function2;
            c28655q = c28655q2;
            boolean z216 = z16;
            m82677x(C23000t1.f90727a, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z216, list, c28655q, (i413 & 112) | 6 | (i413 & 896) | (i413 & 7168) | (i413 & 57344) | (i413 & 458752) | (i413 & 3670016), 0);
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, null, null, null, c28655q, (i28 >> 15) & 14, 30);
            function7 = function6;
            if (function7 == null) {
                c28655q.m87150e0(650917065);
                c28655q.m87173q(false);
                z26 = true;
            } else {
                c28655q.m87150e0(650917066);
                Modifier modifierM5375L10 = AbstractC1772c1.m5375L(m82647H(interfaceC28670t2M30588b), AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2));
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM5375L10);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d10);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N15);
                function7.invoke(function4, c28655q, Integer.valueOf(i34));
                z26 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z26);
            function5 = function7;
            z15 = z216;
            modifier3 = modifier9;
        } else {
            function4 = function2;
            c28655q = c28655q2;
            c28655q.m87138X();
            z15 = z13;
            modifier3 = modifier;
            function5 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final Function1 function12 = function4;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: o11.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC27406l.m82648I(z4, function1, c18027i, interfaceC39332e, textResource, interfaceC39332e2, textResource2, interfaceC39332e3, z15, list, modifier3, abstractC22403o, interfaceC39332e4, textResource3, function5, f13, obj, obj2, str, modifier2, function12, i13, i14, i15, i16, (Composer) obj3, iIntValue);
                }
            };
        }
    }
}
