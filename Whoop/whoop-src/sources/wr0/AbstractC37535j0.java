package wr0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.models.AchievementsBackgroundStyle;
import com.whoop.profile.view.edit.C9771b;
import e93.AbstractC12889b;
import gb1.AbstractC15670a;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2414n2;
import p027b3.InterfaceC2410m3;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17921y;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17923z;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p530up.AbstractC35148d;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23594b;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import p736sz0.C33209p1;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q12.C29801b;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import vy0.C36570d0;
import vy0.C36598z;
import wb3.AbstractC37056f;
import wo1.C37445e0;
import x81.C38072d;

/* JADX INFO: renamed from: wr0.j0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0002*\u00020\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#\"\u0014\u0010(\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010*\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#\"\u0014\u0010,\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#\"\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00064²\u0006\u000e\u00102\u001a\u0002018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00103\u001a\u0002018\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lwr0/k0;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Lwr0/k0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lm91/u;", "items", "", "containerId", "k", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "", "contentTopPx", "y", "(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Li2/x;", "tint", "Li2/y;", "C", "(J)Li2/y;", "A", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lt0/i;", "a", "Lt0/i;", "MomentContainerShape", "Ly3/f;", "b", "F", "MomentContainerStrokeWidth", "c", "ScrimRampHeight", "d", "ChromeScrimFade", "e", "MomentGlowCenterY", "f", "MomentGlowRadius", "Lvy0/d0;", "g", "Lvy0/d0;", "previewChromeMenu", "", "headerChromeHeightPx", "footerChromeHeightPx", "community-moments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37535j0 {

    /* JADX INFO: renamed from: a */
    private static final C33252i f160510a;

    /* JADX INFO: renamed from: b */
    private static final float f160511b;

    /* JADX INFO: renamed from: c */
    private static final float f160512c;

    /* JADX INFO: renamed from: d */
    private static final float f160513d;

    /* JADX INFO: renamed from: e */
    private static final float f160514e = (float) 140.5d;

    /* JADX INFO: renamed from: f */
    private static final float f160515f = 310;

    /* JADX INFO: renamed from: g */
    private static final C36570d0 f160516g = new C36570d0(AbstractC37056f.m118959K(new C36598z("Take Photo", null, EnumC16313m0.CAMERA, 2, null), new C36598z("Select Photo", null, EnumC16313m0.PICTURE, 2, null)));

    static {
        float f13 = 4;
        float f14 = 6 * f13;
        f160510a = AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12);
        f160511b = ((float) 0.25d) * f13;
        f160512c = 30 * f13;
        f160513d = 8 * f13;
    }

    /* JADX INFO: renamed from: A */
    private static final Modifier m120368A(Modifier modifier, Composer composer, int i13) {
        long jM125393f0 = C38072d.f163053a.m121949b(composer, C38072d.f163054b).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        C28655q c28655q = (C28655q) composer;
        boolean zM87151f = c28655q.m87151f(jM125393f0);
        Object objM87133R = c28655q.m87133R();
        if (zM87151f || objM87133R == C28635l.f115821a) {
            objM87133R = new C33209p1(jM125393f0, 6);
            c28655q.m87172p0(objM87133R);
        }
        return AbstractC1125a.m3478a(modifier, (Function1) objM87133R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m120369B(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k[] c23465kArr = {new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.2f, j7))), new C23465k(Float.valueOf(0.817f), new C17919x(C17919x.m51541c(0.0f, j7)))};
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) * 0.17175573f;
        float fMo743q0 = drawBehind.mo743q0(f160514e);
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51490h(c17909s, c23465kArr, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), drawBehind.mo743q0(f160515f), 8), 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final AbstractC17921y m120370C(long j7) {
        float[] fArrM111187r = AbstractC35148d.m111187r();
        AbstractC35148d.m111165P(fArrM111187r, C17919x.m51547i(j7), C17919x.m51546h(j7), C17919x.m51544f(j7));
        float[] fArrM111187r2 = AbstractC35148d.m111187r();
        AbstractC35148d.m111164O(fArrM111187r2);
        AbstractC35148d.m111168S(fArrM111187r, fArrM111187r2);
        return new C17923z(fArrM111187r);
    }

    /* JADX INFO: renamed from: k */
    private static final void m120381k(List<? extends InterfaceC25312u> list, String str, Function1 function1, Composer composer, int i13) {
        Function1 function2;
        Object objValueOf;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2108291333);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            function2 = function1;
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        } else {
            function2 = function1;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            c28655q.m87150e0(1240553652);
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                InterfaceC25305n interfaceC25305n = interfaceC25312u instanceof InterfaceC25305n ? (InterfaceC25305n) interfaceC25312u : null;
                if (interfaceC25305n == null || (objValueOf = interfaceC25305n.getId()) == null) {
                    objValueOf = Integer.valueOf(i15);
                }
                c28655q.m87144b0(1187381040, c28655q.m87124I(str, objValueOf));
                AbstractC25303l.m74291r(interfaceC25312u, null, null, function2, c28655q, (i14 << 3) & 7168, 6);
                c28655q.m87173q(false);
                function2 = function1;
                i15 = i16;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9771b(list, str, function1, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m120382l(List list, String str, Function1 function1, int i13, Composer composer, int i14) {
        m120381k(list, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:67:0x0170  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static final void m120383m(final C37537k0 viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function3;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AchievementsBackgroundStyle achievementsBackgroundStyleM120397a;
        boolean z14;
        Modifier modifierM43971a;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(298366967);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C37445e0(17);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function3 = (Function1) objM87133R3;
                    } else {
                        function3 = function2;
                    }
                    final InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    if (viewState.getHeaderLeadingButton() == null || !viewState.m120401f().isEmpty()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    final boolean z15 = !viewState.m120399c().isEmpty();
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                    }
                    final InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
                    }
                    final InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R2;
                    final float fMo733e0 = interfaceC39171c.mo733e0(m120391u(interfaceC28593a1));
                    final float fMo733e1 = interfaceC39171c.mo733e0(m120393w(interfaceC28593a2));
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(modifier4, "MomentContainer"));
                    C33252i c33252i = f160510a;
                    Modifier modifierM118994r = AbstractC37056f.m118994r(modifierM3407d, c33252i);
                    float f13 = f160511b;
                    C17909s c17909s = AbstractC17911t.f69612b;
                    Float fValueOf = Float.valueOf(0.0f);
                    C38072d c38072d = C38072d.f163053a;
                    int i19 = C38072d.f163054b;
                    final boolean z16 = z13;
                    final Function1 function4 = function3;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC15751g.m44456i(f13, modifierM118994r, C17909s.m51494l(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(c38072d.m121949b(c28655q2, i19).getWhite20())), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), c33252i), c38072d.m121949b(c28655q2, i19).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                    achievementsBackgroundStyleM120397a = viewState.getAchievementBackgroundStyle();
                    if (achievementsBackgroundStyleM120397a == null) {
                        c28655q2.m87150e0(-1930719713);
                        z14 = false;
                        c28655q2.m87173q(false);
                        modifierM43971a = null;
                    } else {
                        z14 = false;
                        c28655q2.m87150e0(-1930719712);
                        modifierM43971a = AbstractC15670a.m43971a(c2314t, achievementsBackgroundStyleM120397a, c28655q2, 6);
                        c28655q2.m87173q(false);
                    }
                    if (modifierM43971a == null) {
                        c28655q2.m87150e0(-1032110196);
                        modifierM43971a = m120368A(c2314t, c28655q2, 6);
                    } else {
                        c28655q2.m87150e0(-1032113730);
                    }
                    c28655q2.m87173q(z14);
                    AbstractC22953f.m66714a(AbstractC22953f.m66722k(modifierM3358c.mo3471e(modifierM43971a)), null, false, AbstractC37817c.m121344e(-439289631, c28655q2, new Function3() { // from class: wr0.g0
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC37535j0.m120385o(interfaceC39171c, viewState, fMo733e0, z15, fMo733e1, z16, function4, interfaceC28593a1, interfaceC28593a2, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q2, 3072, 6);
                    c28655q = c28655q2;
                    modifier3 = modifier4;
                    function2 = function4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C37526f(i13, i14, 6, modifier3, function2, viewState);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37445e0(17);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function2;
                }
                final InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                if (viewState.getHeaderLeadingButton() == null) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                final boolean z17 = !viewState.m120399c().isEmpty();
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                }
                final InterfaceC28593a1 interfaceC28593a3 = (InterfaceC28593a1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
                }
                final InterfaceC28593a1 interfaceC28593a4 = (InterfaceC28593a1) objM87133R2;
                final float fMo733e2 = interfaceC39171c2.mo733e0(m120391u(interfaceC28593a3));
                final float fMo733e3 = interfaceC39171c2.mo733e0(m120393w(interfaceC28593a4));
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(modifier4, "MomentContainer"));
                C33252i c33252i2 = f160510a;
                Modifier modifierM118994r2 = AbstractC37056f.m118994r(modifierM3407d2, c33252i2);
                float f14 = f160511b;
                C17909s c17909s2 = AbstractC17911t.f69612b;
                Float fValueOf2 = Float.valueOf(0.0f);
                C38072d c38072d2 = C38072d.f163053a;
                int i110 = C38072d.f163054b;
                final boolean z18 = z13;
                final Function1 function5 = function3;
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC15751g.m44456i(f14, modifierM118994r2, C17909s.m51494l(c17909s2, new C23465k[]{new C23465k(fValueOf2, new C17919x(c38072d2.m121949b(c28655q2, i110).getWhite20())), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), c33252i2), c38072d2.m121949b(c28655q2, i110).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                achievementsBackgroundStyleM120397a = viewState.getAchievementBackgroundStyle();
                if (achievementsBackgroundStyleM120397a == null) {
                    c28655q2.m87150e0(-1930719713);
                    z14 = false;
                    c28655q2.m87173q(false);
                    modifierM43971a = null;
                } else {
                    z14 = false;
                    c28655q2.m87150e0(-1930719712);
                    modifierM43971a = AbstractC15670a.m43971a(c2314t, achievementsBackgroundStyleM120397a, c28655q2, 6);
                    c28655q2.m87173q(false);
                }
                if (modifierM43971a == null) {
                    c28655q2.m87150e0(-1032110196);
                    modifierM43971a = m120368A(c2314t, c28655q2, 6);
                } else {
                    c28655q2.m87150e0(-1032113730);
                }
                c28655q2.m87173q(z14);
                AbstractC22953f.m66714a(AbstractC22953f.m66722k(modifierM3358c2.mo3471e(modifierM43971a)), null, false, AbstractC37817c.m121344e(-439289631, c28655q2, new Function3() { // from class: wr0.g0
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC37535j0.m120385o(interfaceC39171c2, viewState, fMo733e2, z17, fMo733e3, z18, function5, interfaceC28593a3, interfaceC28593a4, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3072, 6);
                c28655q = c28655q2;
                modifier3 = modifier4;
                function2 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(i13, i14, 6, modifier3, function2, viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37445e0(17);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function2;
                }
                final InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                if (viewState.getHeaderLeadingButton() == null) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                final boolean z19 = !viewState.m120399c().isEmpty();
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(0, c28655q2);
                }
                final InterfaceC28593a1 interfaceC28593a5 = (InterfaceC28593a1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
                }
                final InterfaceC28593a1 interfaceC28593a6 = (InterfaceC28593a1) objM87133R2;
                final float fMo733e4 = interfaceC39171c3.mo733e0(m120391u(interfaceC28593a5));
                final float fMo733e5 = interfaceC39171c3.mo733e0(m120393w(interfaceC28593a6));
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(modifier4, "MomentContainer"));
                C33252i c33252i3 = f160510a;
                Modifier modifierM118994r3 = AbstractC37056f.m118994r(modifierM3407d3, c33252i3);
                float f15 = f160511b;
                C17909s c17909s3 = AbstractC17911t.f69612b;
                Float fValueOf3 = Float.valueOf(0.0f);
                C38072d c38072d3 = C38072d.f163053a;
                int i111 = C38072d.f163054b;
                final boolean z110 = z13;
                final Function1 function6 = function3;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC15751g.m44456i(f15, modifierM118994r3, C17909s.m51494l(c17909s3, new C23465k[]{new C23465k(fValueOf3, new C17919x(c38072d3.m121949b(c28655q2, i111).getWhite20())), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), c33252i3), c38072d3.m121949b(c28655q2, i111).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                achievementsBackgroundStyleM120397a = viewState.getAchievementBackgroundStyle();
                if (achievementsBackgroundStyleM120397a == null) {
                    c28655q2.m87150e0(-1930719713);
                    z14 = false;
                    c28655q2.m87173q(false);
                    modifierM43971a = null;
                } else {
                    z14 = false;
                    c28655q2.m87150e0(-1930719712);
                    modifierM43971a = AbstractC15670a.m43971a(c2314t, achievementsBackgroundStyleM120397a, c28655q2, 6);
                    c28655q2.m87173q(false);
                }
                if (modifierM43971a == null) {
                    c28655q2.m87150e0(-1032110196);
                    modifierM43971a = m120368A(c2314t, c28655q2, 6);
                } else {
                    c28655q2.m87150e0(-1032113730);
                }
                c28655q2.m87173q(z14);
                AbstractC22953f.m66714a(AbstractC22953f.m66722k(modifierM3358c3.mo3471e(modifierM43971a)), null, false, AbstractC37817c.m121344e(-439289631, c28655q2, new Function3() { // from class: wr0.g0
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC37535j0.m120385o(interfaceC39171c3, viewState, fMo733e4, z19, fMo733e5, z110, function6, interfaceC28593a5, interfaceC28593a6, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q2, 3072, 6);
                c28655q = c28655q2;
                modifier3 = modifier4;
                function2 = function6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(i13, i14, 6, modifier3, function2, viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C37445e0(17);
                    c28655q2.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            } else {
                function3 = function2;
            }
            final InterfaceC39171c interfaceC39171c4 = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            if (viewState.getHeaderLeadingButton() == null) {
                z13 = true;
            } else {
                z13 = true;
            }
            final boolean z111 = !viewState.m120399c().isEmpty();
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(0, c28655q2);
            }
            final InterfaceC28593a1 interfaceC28593a7 = (InterfaceC28593a1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95646v(0, c28655q2);
            }
            final InterfaceC28593a1 interfaceC28593a8 = (InterfaceC28593a1) objM87133R2;
            final float fMo733e6 = interfaceC39171c4.mo733e0(m120391u(interfaceC28593a7));
            final float fMo733e7 = interfaceC39171c4.mo733e0(m120393w(interfaceC28593a8));
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(modifier4, "MomentContainer"));
            C33252i c33252i4 = f160510a;
            Modifier modifierM118994r4 = AbstractC37056f.m118994r(modifierM3407d4, c33252i4);
            float f16 = f160511b;
            C17909s c17909s4 = AbstractC17911t.f69612b;
            Float fValueOf4 = Float.valueOf(0.0f);
            C38072d c38072d4 = C38072d.f163053a;
            int i112 = C38072d.f163054b;
            final boolean z112 = z13;
            final Function1 function7 = function3;
            Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC15751g.m44456i(f16, modifierM118994r4, C17909s.m51494l(c17909s4, new C23465k[]{new C23465k(fValueOf4, new C17919x(c38072d4.m121949b(c28655q2, i112).getWhite20())), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.f69636m))}, 0.0f, 0.0f, 14), c33252i4), c38072d4.m121949b(c28655q2, i112).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
            achievementsBackgroundStyleM120397a = viewState.getAchievementBackgroundStyle();
            if (achievementsBackgroundStyleM120397a == null) {
                c28655q2.m87150e0(-1930719713);
                z14 = false;
                c28655q2.m87173q(false);
                modifierM43971a = null;
            } else {
                z14 = false;
                c28655q2.m87150e0(-1930719712);
                modifierM43971a = AbstractC15670a.m43971a(c2314t, achievementsBackgroundStyleM120397a, c28655q2, 6);
                c28655q2.m87173q(false);
            }
            if (modifierM43971a == null) {
                c28655q2.m87150e0(-1032110196);
                modifierM43971a = m120368A(c2314t, c28655q2, 6);
            } else {
                c28655q2.m87150e0(-1032113730);
            }
            c28655q2.m87173q(z14);
            AbstractC22953f.m66714a(AbstractC22953f.m66722k(modifierM3358c4.mo3471e(modifierM43971a)), null, false, AbstractC37817c.m121344e(-439289631, c28655q2, new Function3() { // from class: wr0.g0
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC37535j0.m120385o(interfaceC39171c4, viewState, fMo733e6, z111, fMo733e7, z112, function7, interfaceC28593a7, interfaceC28593a8, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q2, 3072, 6);
            c28655q = c28655q2;
            modifier3 = modifier4;
            function2 = function7;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 6, modifier3, function2, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m120384n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x0343  */
    /* JADX WARN: Code duplicated, block: B:103:0x0361  */
    /* JADX WARN: Code duplicated, block: B:106:0x0374  */
    /* JADX WARN: Code duplicated, block: B:107:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:111:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x0415  */
    /* JADX WARN: Code duplicated, block: B:119:0x0423  */
    /* JADX WARN: Code duplicated, block: B:120:0x0432  */
    /* JADX WARN: Code duplicated, block: B:123:0x0474  */
    /* JADX WARN: Code duplicated, block: B:126:0x049d  */
    /* JADX WARN: Code duplicated, block: B:128:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:130:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:132:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:134:0x0508  */
    /* JADX WARN: Code duplicated, block: B:135:0x050c  */
    /* JADX WARN: Code duplicated, block: B:140:0x052d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0547  */
    /* JADX WARN: Code duplicated, block: B:146:0x0574  */
    /* JADX WARN: Code duplicated, block: B:147:0x0578  */
    /* JADX WARN: Code duplicated, block: B:152:0x0593  */
    /* JADX WARN: Code duplicated, block: B:156:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:158:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:160:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:161:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:165:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:171:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x05ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:72:0x0224  */
    /* JADX WARN: Code duplicated, block: B:73:0x0228  */
    /* JADX WARN: Code duplicated, block: B:78:0x0243  */
    /* JADX WARN: Code duplicated, block: B:82:0x0260  */
    /* JADX WARN: Code duplicated, block: B:84:0x0268  */
    /* JADX WARN: Code duplicated, block: B:86:0x0274  */
    /* JADX WARN: Code duplicated, block: B:92:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x0337  */
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
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m120385o(InterfaceC39171c interfaceC39171c, C37537k0 c37537k0, float f13, boolean z4, float f14, boolean z13, Function1 function1, InterfaceC28593a1 interfaceC28593a1, InterfaceC28593a1 interfaceC28593a2, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        float fMo733e0;
        C17919x c17919xM31989h;
        C28676v0 c28676v0;
        C1100b c1100b;
        C28655q c28655q;
        C28676v0 c28676v1;
        Modifier modifierM3413j;
        float f15;
        float f16;
        C1100b c1100b2;
        int iHashCode;
        int i14;
        C1100b c1100b3;
        C2314t c2314t;
        C28676v0 c28676v2;
        boolean z14;
        int iHashCode2;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        int iHashCode3;
        int i15;
        int i16;
        InterfaceC25312u interfaceC25312u;
        InterfaceC25305n interfaceC25305n;
        Object objValueOf;
        Object objM87133R2;
        Modifier modifierM3357b;
        int iHashCode4;
        C0213j c0213j2;
        C0209i c0209i2;
        C37539l0 c37539l0M120400e;
        boolean zM87153g;
        Object objM87133R3;
        C23454a0 c23454a0;
        int i17;
        Object objM74316c;
        C2307m c2307m = C2299e.f9105H;
        C2305k c2305k = C2299e.f9110M;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        int i18 = (i13 & 6) == 0 ? i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2) : i13;
        C28655q c28655q2 = (C28655q) composer;
        boolean zM87135U = c28655q2.m87135U(i18 & 1, (i18 & 19) != 18);
        C23454a0 c23454a1 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q2.m87138X();
            return c23454a1;
        }
        C1101c c1101c = (C1101c) BoxWithConstraints;
        if (C39174f.m124782b(c1101c.m3402c(), Float.POSITIVE_INFINITY)) {
            c28655q2.m87150e0(-111721916);
            fMo733e0 = interfaceC39171c.mo733e0((int) (((C2414n2) ((InterfaceC2410m3) c28655q2.m87161k(AbstractC2453v1.f9581t))).m7408a() & 4294967295L));
            c28655q2.m87173q(false);
        } else {
            c28655q2.m87150e0(-111762464);
            c28655q2.m87173q(false);
            fMo733e0 = c1101c.m3402c();
        }
        AbstractC22403o abstractC22403oM120398b = c37537k0.getBackgroundImage();
        C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
        C39174f c39174f = new C39174f(f13);
        if (!z13) {
            c39174f = null;
        }
        float f17 = c39174f != null ? c39174f.f168413w : 0;
        C39174f c39174f2 = new C39174f(c37537k0.getPhotoRevealFraction() * fMo733e0);
        if (abstractC22403oM120398b == null) {
            c39174f2 = null;
        }
        if (c39174f2 != null) {
            f17 = ((C39174f) AbstractC12889b.m36281k(c39174f2, new C39174f(f17))).f168413w;
        }
        C2314t c2314t2 = C2314t.f9131w;
        C28676v0 c28676v3 = C28635l.f115821a;
        C1100b c1100b4 = C1100b.f4583a;
        if (abstractC22403oM120398b == null) {
            c28655q2.m87150e0(-111053929);
            c28655q2.m87173q(false);
            f17 = f17;
            c28655q = c28655q2;
            c28676v0 = c28676v3;
            c1100b = c1100b4;
        } else {
            c28655q2.m87150e0(-111053928);
            float fMo743q0 = interfaceC39171c.mo743q0(f17);
            AchievementsBackgroundStyle achievementsBackgroundStyleM120397a = c37537k0.getAchievementBackgroundStyle();
            EnumC39333f enumC39333fM68508g = achievementsBackgroundStyleM120397a != null ? AbstractC23594b.m68508g(achievementsBackgroundStyleM120397a.name()) : null;
            if (enumC39333fM68508g == null) {
                c28655q2.m87150e0(472131422);
                c28655q2.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q2.m87150e0(1262156035);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, enumC39333fM68508g.mo134584toComposableColorWaAFU9c(c28655q2, 0));
            }
            c28676v0 = c28676v3;
            c1100b = c1100b4;
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM120398b, null, null, c28655q2, AbstractC22403o.f87638a, 3);
            boolean zM87153g2 = c28655q2.m87153g(c17919xM31989h);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R4 == c28676v0) {
                objM87133R4 = c17919xM31989h != null ? m120370C(c17919xM31989h.f69639a) : null;
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC17921y abstractC17921y = (AbstractC17921y) objM87133R4;
            Modifier modifierM3599a = AbstractC1136a.m3599a(c1100b.mo3401b(c2314t2), "MomentContainerPhoto");
            boolean zM87147d = c28655q2.m87147d(fMo743q0) | c28655q2.m87153g(c13821r1M92099U);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87147d || objM87133R5 == c28676v0) {
                objM87133R5 = new C29801b(fMo743q0, c13821r1M92099U, 1);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, m120395y(modifierM3599a, (InterfaceC4339a) objM87133R5, c28655q2, 0), null, C39102j.f168199a, 0.0f, abstractC17921y, c28655q2, 24624, 40);
            c28655q = c28655q2;
            c28655q.m87173q(false);
        }
        Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3409f(1.0f, c2314t2), c13821r1M92099U, 14);
        C22957g c22957g = AbstractC22977m.f90652c;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
        int iHashCode5 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j3 = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j3);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i3 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
        C0209i c0209i4 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
        C0209i c0209i5 = C0217k.f732j;
        if (!c28655q.f115903S) {
            c28676v1 = c28676v0;
            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
            }
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, AbstractC1136a.m3599a(c2314t2, "MomentContainerContentInset")));
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            if (abstractC22403oM120398b != 0) {
                modifierM3413j = AbstractC1102d.m3413j(c2314t2, fMo733e0, 0.0f, 2);
            } else {
                modifierM3413j = c2314t2;
            }
            Modifier modifierMo3471e = modifierM3409f.mo3471e(modifierM3413j);
            f15 = 8;
            f16 = 2 * f15;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifierMo3471e, f16, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
            c1100b2 = c1100b;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
            c28655q.m87150e0(2140982286);
            i14 = 0;
            for (Object obj : c37537k0.m120402g()) {
                i17 = i14 + 1;
                if (i14 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C25306o c25306o = (C25306o) obj;
                String id4 = c37537k0.getId();
                objM74316c = c25306o.m74316c();
                if (objM74316c == null) {
                    objM74316c = Integer.valueOf(i14);
                }
                c28655q.m87144b0(495800288, c28655q.m87124I(id4, objM74316c));
                C28655q c28655q3 = c28655q;
                AbstractC25303l.m74290q(c25306o, null, null, function1, c28655q3, C25306o.f99297c, 6);
                c28655q = c28655q3;
                c28655q.m87173q(false);
                i14 = i17;
                c1100b2 = c1100b2;
                c2314t2 = c2314t2;
            }
            c1100b3 = c1100b2;
            c2314t = c2314t2;
            c28676v2 = c28676v1;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            if (z4) {
                c28655q.m87150e0(-1902037447);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, AbstractC1136a.m3599a(c2314t, "MomentContainerFooterInset")));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1901824105);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (abstractC22403oM120398b == 0 && z4) {
                c28655q.m87150e0(-108805250);
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3411h(f14 + f160513d, AbstractC1102d.m3409f(1.0f, c1100b3.mo3400a(c2314t, c2307m))), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd())), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-108371839);
                c28655q.m87173q(false);
            }
            if (z13) {
                c28655q.m87150e0(-108291394);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c1100b3.mo3400a(c2314t, C2299e.f9115x)), "MomentContainerHeaderOverlay");
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v2) {
                    objM87133R2 = new C37531h0(interfaceC28593a1, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3502b = AbstractC1132b.m3502b(modifierM3599a2, (Function1) objM87133R2);
                if (abstractC22403oM120398b != null) {
                    c28655q.m87150e0(-107990818);
                    C17909s c17909s = AbstractC17911t.f69612b;
                    C38072d c38072d = C38072d.f163053a;
                    int i19 = C38072d.f163054b;
                    modifierM3357b = AbstractC1092a.m3357b(c2314t, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i19).getBlack30()), new C17919x(c38072d.m121949b(c28655q, i19).getTransparent())), 0.0f, 0.0f, 14), null, 0.0f, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-107764735);
                    c28655q.m87173q(false);
                    modifierM3357b = c2314t;
                }
                Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3502b.mo3471e(modifierM3357b), f16, 1 * f15);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                c37539l0M120400e = c37537k0.getHeaderLeadingButton();
                if (c37539l0M120400e == null) {
                    c28655q.m87150e0(626269550);
                    c28655q.m87173q(false);
                    z14 = false;
                    c23454a0 = null;
                } else {
                    c28655q.m87150e0(626269551);
                    C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, c37539l0M120400e.getIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62229E);
                    Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "MomentContainerHeaderLeadingButton");
                    zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c37539l0M120400e);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g || objM87133R3 == c28676v2) {
                        objM87133R3 = new C37550r(function1, c37539l0M120400e, 1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3599a3, null, (InterfaceC4339a) objM87133R3, c28655q, C27270o.f109105k | 384, 8);
                    z14 = false;
                    c28655q.m87173q(false);
                    c23454a0 = c23454a1;
                }
                if (c23454a0 == null) {
                    c28655q.m87150e0(-533971813);
                    AbstractC22953f.m66715b(c28655q, c2314t);
                } else {
                    c28655q.m87150e0(-533988026);
                }
                c28655q.m87173q(z14);
                m120381k(c37537k0.m120401f(), c37537k0.getId(), function1, c28655q, z14 ? 1 : 0);
                c28655q.m87173q(true);
                c28655q.m87173q(z14);
            } else {
                c2314t = c2314t;
                c28676v2 = c28676v2;
                z14 = false;
                c28655q.m87150e0(-106566399);
                c28655q.m87173q(false);
            }
            if (z4) {
                c28655q.m87150e0(-105442463);
                c28655q.m87173q(z14);
                return c23454a1;
            }
            c28655q.m87150e0(-106507251);
            Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC1102d.m3409f(1.0f, c1100b3.mo3400a(c2314t, c2307m)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z14);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66720i);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i7 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "MomentContainerFooterOverlay");
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v2) {
                objM87133R = new C37531h0(interfaceC28593a2, 1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3502b2 = AbstractC1132b.m3502b(modifierM3599a4, (Function1) objM87133R);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3502b2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
            c28655q.m87150e0(-166351790);
            i15 = 0;
            for (Object obj2 : c37537k0.m120399c()) {
                i16 = i15 + 1;
                if (i15 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                interfaceC25312u = (InterfaceC25312u) obj2;
                String id5 = c37537k0.getId();
                if (interfaceC25312u instanceof InterfaceC25305n) {
                    interfaceC25305n = (InterfaceC25305n) interfaceC25312u;
                } else {
                    interfaceC25305n = null;
                }
                if (interfaceC25305n != null || (objValueOf = interfaceC25305n.getId()) == null) {
                    objValueOf = Integer.valueOf(i15);
                }
                c28655q.m87144b0(1407740342, c28655q.m87124I(id5, objValueOf));
                AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, 0, 6);
                c28655q.m87173q(false);
                i15 = i16;
            }
            AbstractC2875y.m8286B(c28655q, false, true, true, false);
            return c23454a1;
        }
        c28676v1 = c28676v0;
        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
        C0209i c0209i10 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N);
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, AbstractC1136a.m3599a(c2314t2, "MomentContainerContentInset")));
        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
        if (abstractC22403oM120398b != 0) {
            modifierM3413j = AbstractC1102d.m3413j(c2314t2, fMo733e0, 0.0f, 2);
        } else {
            modifierM3413j = c2314t2;
        }
        Modifier modifierMo3471e2 = modifierM3409f2.mo3471e(modifierM3413j);
        f15 = 8;
        f16 = 2 * f15;
        Modifier modifierM3396r2 = AbstractC1099a.m3396r(modifierMo3471e2, f16, 0.0f, 2);
        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
        c1100b2 = c1100b;
        iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j3);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a4);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m6);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
        } else {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
        }
        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
        c28655q.m87150e0(2140982286);
        i14 = 0;
        while (r0.hasNext()) {
            i17 = i14 + 1;
            if (i14 >= 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C25306o c25306o2 = (C25306o) obj;
            String id6 = c37537k0.getId();
            objM74316c = c25306o2.m74316c();
            if (objM74316c == null) {
                objM74316c = Integer.valueOf(i14);
            }
            c28655q.m87144b0(495800288, c28655q.m87124I(id6, objM74316c));
            C28655q c28655q4 = c28655q;
            AbstractC25303l.m74290q(c25306o2, null, null, function1, c28655q4, C25306o.f99297c, 6);
            c28655q = c28655q4;
            c28655q.m87173q(false);
            i14 = i17;
            c1100b2 = c1100b2;
            c2314t2 = c2314t2;
        }
        c1100b3 = c1100b2;
        c2314t = c2314t2;
        c28676v2 = c28676v1;
        c28655q.m87173q(false);
        c28655q.m87173q(true);
        if (z4) {
            c28655q.m87150e0(-1902037447);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, AbstractC1136a.m3599a(c2314t, "MomentContainerFooterInset")));
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1901824105);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        if (abstractC22403oM120398b == 0) {
            c28655q.m87150e0(-108371839);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-108371839);
            c28655q.m87173q(false);
        }
        if (z13) {
            c28655q.m87150e0(-108291394);
            Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c1100b3.mo3400a(c2314t, C2299e.f9115x)), "MomentContainerHeaderOverlay");
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v2) {
                objM87133R2 = new C37531h0(interfaceC28593a1, 0);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3502b3 = AbstractC1132b.m3502b(modifierM3599a5, (Function1) objM87133R2);
            if (abstractC22403oM120398b != null) {
                c28655q.m87150e0(-107990818);
                C17909s c17909s2 = AbstractC17911t.f69612b;
                C38072d c38072d2 = C38072d.f163053a;
                int i110 = C38072d.f163054b;
                modifierM3357b = AbstractC1092a.m3357b(c2314t, C17909s.m51493k(c17909s2, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, i110).getBlack30()), new C17919x(c38072d2.m121949b(c28655q, i110).getTransparent())), 0.0f, 0.0f, 14), null, 0.0f, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-107764735);
                c28655q.m87173q(false);
                modifierM3357b = c2314t;
            }
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM3502b3.mo3471e(modifierM3357b), f16, 1 * f15);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
            c37539l0M120400e = c37537k0.getHeaderLeadingButton();
            if (c37539l0M120400e == null) {
                c28655q.m87150e0(626269550);
                c28655q.m87173q(false);
                z14 = false;
                c23454a0 = null;
            } else {
                c28655q.m87150e0(626269551);
                C27270o c27270o2 = new C27270o(AbstractC27274q.a.f109136f, c37539l0M120400e.getIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62229E);
                Modifier modifierM3599a6 = AbstractC1136a.m3599a(c2314t, "MomentContainerHeaderLeadingButton");
                zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c37539l0M120400e);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C37550r(function1, c37539l0M120400e, 1);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C37550r(function1, c37539l0M120400e, 1);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27242b1.m82092d(c27270o2, strM92103Y2, modifierM3599a6, null, (InterfaceC4339a) objM87133R3, c28655q, C27270o.f109105k | 384, 8);
                z14 = false;
                c28655q.m87173q(false);
                c23454a0 = c23454a1;
            }
            if (c23454a0 == null) {
                c28655q.m87150e0(-533971813);
                AbstractC22953f.m66715b(c28655q, c2314t);
            } else {
                c28655q.m87150e0(-533988026);
            }
            c28655q.m87173q(z14);
            m120381k(c37537k0.m120401f(), c37537k0.getId(), function1, c28655q, z14 ? 1 : 0);
            c28655q.m87173q(true);
            c28655q.m87173q(z14);
        } else {
            c2314t = c2314t;
            c28676v2 = c28676v2;
            z14 = false;
            c28655q.m87150e0(-106566399);
            c28655q.m87173q(false);
        }
        if (z4) {
            c28655q.m87150e0(-105442463);
            c28655q.m87173q(z14);
            return c23454a1;
        }
        c28655q.m87150e0(-106507251);
        Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC1102d.m3409f(1.0f, c1100b3.mo3400a(c2314t, c2307m)));
        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
        iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM66720i2);
        InterfaceC0221l.f734a.getClass();
        c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i11 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d2);
        C0209i c0209i12 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
        c0209i = C0217k.f732j;
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
        } else {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
        }
        C0209i c0209i13 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
        Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "MomentContainerFooterOverlay");
        objM87133R = c28655q.m87133R();
        if (objM87133R == c28676v2) {
            objM87133R = new C37531h0(interfaceC28593a2, 1);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM3502b4 = AbstractC1132b.m3502b(modifierM3599a7, (Function1) objM87133R);
        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
        iHashCode3 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3502b4);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a5);
        AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m9);
        if (c28655q.f115903S) {
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
        } else {
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
        c28655q.m87150e0(-166351790);
        i15 = 0;
        while (r7.hasNext()) {
            i16 = i15 + 1;
            if (i15 >= 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            interfaceC25312u = (InterfaceC25312u) obj2;
            String id7 = c37537k0.getId();
            if (interfaceC25312u instanceof InterfaceC25305n) {
                interfaceC25305n = (InterfaceC25305n) interfaceC25312u;
            } else {
                interfaceC25305n = null;
            }
            if (interfaceC25305n != null) {
                objValueOf = Integer.valueOf(i15);
            } else {
                objValueOf = Integer.valueOf(i15);
            }
            c28655q.m87144b0(1407740342, c28655q.m87124I(id7, objValueOf));
            AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, 0, 6);
            c28655q.m87173q(false);
            i15 = i16;
        }
        AbstractC2875y.m8286B(c28655q, false, true, true, false);
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final float m120386p(float f13, C13821r1 c13821r1) {
        return f13 - c13821r1.f49318a.m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m120387q(InterfaceC28593a1 interfaceC28593a1, C39180l c39180l) {
        m120392v(interfaceC28593a1, (int) (c39180l.f168422a & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m120388r(Function1 function1, C37539l0 c37539l0) {
        function1.invoke(c37539l0.getAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m120389s(InterfaceC28593a1 interfaceC28593a1, C39180l c39180l) {
        m120394x(interfaceC28593a1, (int) (c39180l.f168422a & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m120390t(C37537k0 c37537k0, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m120383m(c37537k0, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final int m120391u(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: v */
    private static final void m120392v(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: w */
    private static final int m120393w(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: x */
    private static final void m120394x(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: y */
    private static final Modifier m120395y(Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        long jM125410o = c38072d.m121949b(composer, i14).getBackgroundDarkStd();
        long jM125368V0 = c38072d.m121949b(composer, i14).getTransparent();
        C28655q c28655q = (C28655q) composer;
        float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f160512c);
        boolean zM87151f = ((((i13 & 112) ^ 48) > 32 && c28655q.m87153g(interfaceC4339a)) || (i13 & 48) == 32) | c28655q.m87151f(jM125368V0) | c28655q.m87151f(jM125410o) | c28655q.m87147d(fMo743q0);
        Object objM87133R = c28655q.m87133R();
        if (zM87151f || objM87133R == C28635l.f115821a) {
            C37533i0 c37533i0 = new C37533i0(interfaceC4339a, jM125368V0, jM125410o, fMo743q0, 0);
            c28655q.m87172p0(c37533i0);
            objM87133R = c37533i0;
        }
        return AbstractC1125a.m3480c(modifier, (Function1) objM87133R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m120396z(InterfaceC4339a interfaceC4339a, long j7, long j13, float f13, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        C22128b c22128b = c0238p0.f815w;
        c0238p0.m728a();
        float fFloatValue = ((Number) interfaceC4339a.invoke()).floatValue();
        float f14 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L));
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (f14 >= fIntBitsToFloat) {
            return c23454a0;
        }
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(j13)), fFloatValue, fFloatValue + f13, 8), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) - f14))), 0.0f, null, 0, 120);
        return c23454a0;
    }
}
