package w41;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b81.C2795b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import com.google.android.gms.maps.model.CameraPosition;
import eu.C13607d0;
import eu.C13612g;
import eu.C13639z;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC22973k1;
import p291l0.InterfaceC23004v;
import p389p0.C28539n0;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p591wp.C37486g;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p733ry2.C31919h;
import rq2.C31755w;
import vw0.C36541a;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: w41.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\r\"A\u0010\u0014\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lw41/w;", "userLocation", "", "isMyLocationEnabled", "Lkotlin/Function0;", "Ll83/a0;", "overlay", "j", "(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)V", "mapOverlay", "f", "(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;II)V", "Lp1/t1;", "Lkotlin/Function4;", "a", "Lp1/t1;", "n", "()Lp1/t1;", "LocalActivityMapBackground", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36800a {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f157427a = new C28596b0(new C36541a(25));

    /* JADX INFO: renamed from: w41.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f157428w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1) {
            super(0);
            this.f157428w = function1;
        }

        @Override // c93.InterfaceC4339a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13612g invoke() {
            C13612g c13612g = new C13612g();
            this.f157428w.invoke(c13612g);
            return c13612g;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0073  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d A[PHI: r3 r13 r14
      0x008d: PHI (r3v7 boolean) = (r3v4 boolean), (r3v8 boolean) binds: [B:64:0x00ab, B:54:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r13v6 androidx.compose.ui.Modifier) = (r13v3 androidx.compose.ui.Modifier), (r13v0 androidx.compose.ui.Modifier) binds: [B:64:0x00ab, B:54:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r14v5 w41.w) = (r14v2 w41.w), (r14v0 w41.w) binds: [B:64:0x00ab, B:54:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0100  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m117926f(Modifier modifier, C36823w c36823w, boolean z4, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4351m interfaceC4351m2;
        boolean z13;
        boolean z14;
        InterfaceC4351m interfaceC4351m3;
        Modifier modifier2;
        C36823w c36823w2;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1807551396);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= ((i14 & 2) == 0 && c28655q.m87153g(c36823w)) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i15 |= c28655q.m87157i(interfaceC4351m2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if (i16 != 0) {
                        modifier = C2314t.f9131w;
                    }
                    if ((i14 & 2) != 0) {
                        c36823w = new C36823w(42.3601d, -71.0589d);
                    }
                    if (i17 != 0) {
                        z14 = false;
                    } else {
                        z14 = z4;
                    }
                    if (i18 != 0) {
                        interfaceC4351m4 = null;
                    }
                    c28655q.m87175r();
                    C36812l c36812l = new C36812l(c36823w, 7);
                    c28655q.m87152f0(-1911106014);
                    C13612g c13612g = (C13612g) AbstractC39038k.m124459e(new Object[0], C13612g.f48186h, new a(c36812l), c28655q, 72, 0);
                    c28655q.m87173q(false);
                    AbstractC22953f.m66714a(AbstractC1102d.m3407d(1.0f, modifier), null, false, AbstractC37817c.m121344e(-796960262, c28655q, new C2795b(c13612g, z14, interfaceC4351m4, 2)), c28655q, 3072, 6);
                    c28655q = c28655q;
                    interfaceC4351m3 = interfaceC4351m4;
                } else {
                    c28655q.m87138X();
                    z14 = z4;
                }
                interfaceC4351m4 = interfaceC4351m2;
                c28655q.m87175r();
                C36812l c36812l2 = new C36812l(c36823w, 7);
                c28655q.m87152f0(-1911106014);
                C13612g c13612g2 = (C13612g) AbstractC39038k.m124459e(new Object[0], C13612g.f48186h, new a(c36812l2), c28655q, 72, 0);
                c28655q.m87173q(false);
                AbstractC22953f.m66714a(AbstractC1102d.m3407d(1.0f, modifier), null, false, AbstractC37817c.m121344e(-796960262, c28655q, new C2795b(c13612g2, z14, interfaceC4351m4, 2)), c28655q, 3072, 6);
                c28655q = c28655q;
                interfaceC4351m3 = interfaceC4351m4;
            } else {
                c28655q.m87138X();
                z14 = z4;
                interfaceC4351m3 = interfaceC4351m2;
            }
            modifier2 = modifier;
            c36823w2 = c36823w;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(modifier2, (Object) c36823w2, z14, (InterfaceC23459e) interfaceC4351m3, i13, i14, 8);
            }
        }
        i15 |= 3072;
        interfaceC4351m2 = interfaceC4351m;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i16 != 0) {
                    modifier = C2314t.f9131w;
                }
                if ((i14 & 2) != 0) {
                    c36823w = new C36823w(42.3601d, -71.0589d);
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z4;
                }
                if (i18 != 0) {
                    interfaceC4351m4 = null;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
            } else {
                if (i16 != 0) {
                    modifier = C2314t.f9131w;
                }
                if ((i14 & 2) != 0) {
                    c36823w = new C36823w(42.3601d, -71.0589d);
                }
                if (i17 != 0) {
                    z14 = false;
                } else {
                    z14 = z4;
                }
                if (i18 != 0) {
                    interfaceC4351m4 = null;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
            }
            c28655q.m87175r();
            C36812l c36812l3 = new C36812l(c36823w, 7);
            c28655q.m87152f0(-1911106014);
            C13612g c13612g3 = (C13612g) AbstractC39038k.m124459e(new Object[0], C13612g.f48186h, new a(c36812l3), c28655q, 72, 0);
            c28655q.m87173q(false);
            AbstractC22953f.m66714a(AbstractC1102d.m3407d(1.0f, modifier), null, false, AbstractC37817c.m121344e(-796960262, c28655q, new C2795b(c13612g3, z14, interfaceC4351m4, 2)), c28655q, 3072, 6);
            c28655q = c28655q;
            interfaceC4351m3 = interfaceC4351m4;
        } else {
            c28655q.m87138X();
            z14 = z4;
            interfaceC4351m3 = interfaceC4351m2;
        }
        modifier2 = modifier;
        c36823w2 = c36823w;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(modifier2, (Object) c36823w2, z14, (InterfaceC23459e) interfaceC4351m3, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m117927g(C36823w c36823w, C13612g rememberCameraPositionState) {
        AbstractC22676k.m65750j(rememberCameraPositionState, "$this$rememberCameraPositionState");
        rememberCameraPositionState.m38432d(new CameraPosition(AbstractC36816p.m118031a(c36823w), 16.0f, 0.0f, 0.0f));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m117928h(C13612g c13612g, boolean z4, InterfaceC4351m interfaceC4351m, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC22973k1 interfaceC22973k1M118023d = AbstractC36813m.m118023d(AbstractC36813m.m118022c(((C1101c) BoxWithConstraints).m3403d()));
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            C13639z c13639z = new C13639z(z4, null, new C37486g((String) c28655q.m87161k(AbstractC36811k.m117986M())), 411);
            C13607d0 c13607d0 = new C13607d0(false, false, false, false, 67);
            C28539n0 c28539n0 = C13612g.f48186h;
            AbstractC37926s0.m121465c(modifierM3407d2, c13612g, null, c13639z, c13607d0, null, null, null, null, null, null, null, interfaceC22973k1M118023d, null, c28655q, 32838, 0, 49068);
            if (interfaceC4351m == null) {
                c28655q.m87150e0(-1647765351);
            } else {
                c28655q.m87150e0(1055224936);
                interfaceC4351m.invoke(c28655q, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m117929i(Modifier modifier, C36823w c36823w, boolean z4, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m117926f(modifier, c36823w, z4, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m117930j(Modifier modifier, C36823w c36823w, boolean z4, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-108983553);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c36823w) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            m117926f(modifier, c36823w, z4, interfaceC4351m, c28655q, i14 & 8190, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31755w(i13, 10, modifier, c36823w, interfaceC4351m, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m117931k(Modifier modifier, C36823w c36823w, boolean z4, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m117930j(modifier, c36823w, z4, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC4354p m117932l() {
        return C36820t.f157503a.m118040b();
    }

    /* JADX INFO: renamed from: n */
    public static final AbstractC28669t1 m117934n() {
        return f157427a;
    }
}
