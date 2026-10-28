package uu2;

import android.annotation.SuppressLint;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.bot.settings.C6077g;
import cu2.AbstractC11128h;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import id2.C18432q;
import j81.C21421e;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import mh.C25537e;
import mh.C25540h;
import mh.C25542j;
import mh.C25547o;
import mh.InterfaceC25541i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.C18027i;
import p21.C28751d;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23004v;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
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
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import ph.C29227a;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: uu2.g0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aE\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkd1/o;", "image", "", "videoUrl", "imageContentDescription", "Lkotlin/Function0;", "Ll83/a0;", "onPlayVideo", "f", "(Landroidx/compose/ui/Modifier;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "icon", "n", "(ILandroidx/compose/runtime/Composer;II)V", "", "isPressed", "imageModifier", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35252g0 {

    /* JADX INFO: renamed from: uu2.g0$a */
    @Metadata(m65680d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"uu2/g0$a", "Lmh/i;", "Lmh/j;", "request", "Ll83/a0;", "b", "(Lmh/j;)V", "c", "Lmh/e;", "result", "d", "(Lmh/j;Lmh/e;)V", "Lmh/o;", "a", "(Lmh/j;Lmh/o;)V", "coil-base_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC25541i {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC28601c1 f149956a;

        public a(InterfaceC28601c1 interfaceC28601c1) {
            this.f149956a = interfaceC28601c1;
        }

        @Override // mh.InterfaceC25541i
        /* JADX INFO: renamed from: a */
        public void mo9379a(C25542j request, C25547o result) {
            AbstractC35252g0.m111711k(this.f149956a, AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
        }

        @Override // mh.InterfaceC25541i
        /* JADX INFO: renamed from: b */
        public void mo9380b(C25542j request) {
        }

        @Override // mh.InterfaceC25541i
        /* JADX INFO: renamed from: c */
        public void mo9381c(C25542j request) {
        }

        @Override // mh.InterfaceC25541i
        /* JADX INFO: renamed from: d */
        public void mo9382d(C25542j request, C25537e result) {
        }
    }

    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    /* JADX INFO: renamed from: f */
    public static final void m111706f(Modifier modifier, final AbstractC22403o abstractC22403o, String str, final String str2, InterfaceC4339a onPlayVideo, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Modifier modifier3;
        AbstractC22676k.m65750j(onPlayVideo, "onPlayVideo");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-653866977);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87153g(str2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onPlayVideo) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        boolean z4 = true;
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            Modifier modifierM3360e = C2314t.f9131w;
            modifier2 = i16 != 0 ? modifierM3360e : modifier;
            if (str != null && !AbstractC39414r.m125890i0(str)) {
                z4 = false;
            }
            final boolean z13 = !z4;
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            final float f13 = (!m111707g(AbstractC15751g.m44460m(interfaceC21083i, c28655q, 6)) || z4) ? 1.0f : 0.5f;
            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, modifier2), false, 1.9f);
            if (z4) {
                modifier3 = modifierM3384f;
            } else {
                modifier3 = modifierM3384f;
                modifierM3360e = AbstractC1092a.m3360e(modifierM3360e, interfaceC21083i, null, false, new C18027i(0), onPlayVideo, 12);
            }
            float f14 = 8;
            AbstractC12889b.m36263b(modifier3.mo3471e(modifierM3360e), AbstractC33253j.m105489e(((float) 1.5d) * f14), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack50(), null, 0 * f14, AbstractC37817c.m121344e(-642548990, c28655q, new InterfaceC4351m() { // from class: uu2.f0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC35252g0.m111708h(z13, abstractC22403o, f13, str2, (Composer) obj, iIntValue);
                }
            }), c28655q, 1769472, 24);
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e((Object) modifier2, (Object) abstractC22403o, str, (Object) str2, (Object) onPlayVideo, i13, i14, 29);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final boolean m111707g(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m111708h(boolean z4, AbstractC22403o abstractC22403o, float f13, String str, Composer composer, int i13) {
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC22953f.m66714a(AbstractC1102d.m3407d(1.0f, c2314t), null, false, AbstractC37817c.m121344e(-1993846306, c28655q, new C6077g(abstractC22403o, f13, str, 2)), c28655q, 3078, 6);
            if (z4) {
                c28655q.m87150e0(-292480488);
                C2307m c2307m2 = C2299e.f9116y;
                C1100b c1100b = C1100b.f4583a;
                float f14 = 8;
                float f15 = ((float) 1.5d) * f14;
                long j7 = C17919x.f69629f;
                float f16 = 1 * f14;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC15751g.m44455h(AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m2), 0.0f, f15, f15, 0.0f, 9), ((float) 0.125d) * f14, C17919x.m51541c(0.2f, j7), AbstractC33253j.m105489e(f16)), C17919x.m51541c(0.1f, C17919x.f69625b), AbstractC33253j.m105489e(f16)), f16, ((float) 0.5d) * f14);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC11128h.f35497p1), null, C17919x.m51541c(0.7f, j7), 0L, null, null, null, AbstractC35745c.m113246h(0), null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getSh5(), null, c28655q, 12583296, C2886a.f11498d << 18, 196474);
                c28655q = c28655q;
                c28655q.m87173q(true);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, C2299e.f9104G), f15, 0.0f, 0.0f, f15, 6);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                z13 = true;
                m111714n(0, c28655q, 0, 1);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                z13 = true;
                c28655q.m87150e0(-291309990);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m111709i(AbstractC22403o abstractC22403o, float f13, String str, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC26165a abstractC26165aM64500i;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            C1101c c1101c = (C1101c) BoxWithConstraints;
            int iMo743q0 = (int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(c1101c.m3403d());
            int iMo743q1 = (int) ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(c1101c.m3402c());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(AbstractC1102d.m3419p(15 * 8, C2314t.f9131w));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (abstractC22403o == null) {
                c28655q.m87150e0(722731723);
                c28655q.m87173q(false);
                abstractC26165aM64500i = null;
            } else {
                c28655q.m87150e0(-530875402);
                boolean zM87149e = c28655q.m87149e(iMo743q0) | c28655q.m87149e(iMo743q1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87149e || objM87133R2 == c28676v0) {
                    objM87133R2 = new C28751d(iMo743q0, iMo743q1, interfaceC28601c1, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, (Function1) objM87133R2, c28655q, AbstractC22403o.f87638a, 1);
                c28655q.m87173q(false);
            }
            AbstractC26165a abstractC26165a = abstractC26165aM64500i;
            if (abstractC26165a == null) {
                c28655q.m87150e0(723045598);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(723045599);
                AbstractC29125c.m88522c(abstractC26165a, str, AbstractC34132o.m107879c(f13, C1100b.f4583a.mo3400a(m111710j(interfaceC28601c1), C2299e.f9102E)), null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final Modifier m111710j(InterfaceC28601c1 interfaceC28601c1) {
        return (Modifier) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m111711k(InterfaceC28601c1 interfaceC28601c1, Modifier modifier) {
        interfaceC28601c1.setValue(modifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m111712l(int i13, int i14, InterfaceC28601c1 interfaceC28601c1, C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.m75120d(i13, i14);
        rememberImagePainter.f100086j = new C29227a(0, 3);
        rememberImagePainter.f100081e = new a(interfaceC28601c1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m111713m(Modifier modifier, AbstractC22403o abstractC22403o, String str, String str2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m111706f(modifier, abstractC22403o, str, str2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m111714n(int i13, Composer composer, int i14, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-73232989);
        if ((i14 & 6) == 0) {
            i16 = (((i15 & 1) == 0 && c28655q.m87149e(i13)) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 3) != 2)) {
            c28655q.m87140Z();
            if ((i14 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i15 & 1) != 0) {
                    i16 &= -15;
                }
            } else if ((i15 & 1) != 0) {
                i13 = C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getPlay();
                i16 &= -15;
            }
            c28655q.m87175r();
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1102d.m3419p(4 * f13, c2314t), 1, f13, C17919x.f69629f);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM95629e);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i16 << 3) & 112) | 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62243H1), AbstractC1102d.m3419p(((float) 1.625d) * f13, c2314t), AbstractC17918w0.m51517e(4279374354L), c28655q, 3456, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18432q(i13, i14, i15, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m111715o(int i13, int i14, int i15, Composer composer, int i16) {
        m111714n(i13, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }
}
