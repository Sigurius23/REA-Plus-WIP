package kr2;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import kd1.C22389c0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.C11362i1;
import p077d0.C11393q0;
import p163g1.C15079m3;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p636y3.C39178j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: kr2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a5\u0010\n\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\u000e\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a=\u0010\u0011\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\r\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0013\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m65681d2 = {"", "y", "(Landroidx/compose/runtime/Composer;I)Z", "Ld0/q0;", "visibleState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ll83/a0;", "content", "k", "(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Lkr2/f;", "fromDirection", "q", "(Ld0/q0;Lkr2/f;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Lkr2/g;", "u", "(Ld0/q0;Lkr2/g;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "n", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22813b {

    /* JADX INFO: renamed from: kr2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f89833a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f89834b;

        static {
            int[] iArr = new int[EnumC22817f.values().length];
            try {
                iArr[EnumC22817f.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22817f.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f89833a = iArr;
            int[] iArr2 = new int[EnumC22818g.values().length];
            try {
                iArr2[EnumC22818g.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC22818g.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f89834b = iArr2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m66084k(C11393q0 visibleState, Modifier modifier, InterfaceC4351m content, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(visibleState, "visibleState");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-887881149);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(visibleState) : c28655q.m87157i(visibleState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(content) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            AbstractC1090b.m3347b(visibleState, modifier3, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(-2081763557, c28655q, new C22389c0(3, content)), c28655q, (i15 & 14) | 196992 | (i15 & 112), 24);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22812a(visibleState, modifier2, content, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m66085l(InterfaceC4351m interfaceC4351m, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        interfaceC4351m.invoke(composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m66086m(C11393q0 c11393q0, Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m66084k(c11393q0, modifier, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m66087n(C11393q0 visibleState, Modifier modifier, InterfaceC4351m content, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(visibleState, "visibleState");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(818831185);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(visibleState) : c28655q.m87157i(visibleState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(content) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            AbstractC1090b.m3347b(visibleState, modifier3, AbstractC3788w0.m11579g(AbstractC11348f.m30574v(500, 0, null, 6), 0.0f, 6), null, null, AbstractC37817c.m121344e(-1831785095, c28655q, new C22389c0(2, content)), c28655q, (i15 & 14) | 196992 | (i15 & 112), 24);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22812a(visibleState, modifier2, content, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m66088o(InterfaceC4351m interfaceC4351m, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        interfaceC4351m.invoke(composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m66089p(C11393q0 c11393q0, Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m66087n(c11393q0, modifier, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public static final void m66090q(C11393q0 visibleState, EnumC22817f fromDirection, Modifier modifier, InterfaceC4351m content, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z13;
        Object objM87133R;
        int i16;
        AbstractC22676k.m65750j(visibleState, "visibleState");
        AbstractC22676k.m65750j(fromDirection, "fromDirection");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(910160067);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(visibleState) : c28655q.m87157i(visibleState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(fromDirection.ordinal()) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(content)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                long j7 = 1;
                C11362i1 c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 200.0f, 1, new C39178j((j7 & 4294967295L) | (j7 << 32)));
                z13 = (i15 & 112) == 32;
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C19962a(fromDirection, 20);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC1090b.m3347b(visibleState, modifier4, AbstractC3788w0.m11585m(c11362i1M30573u, (Function1) objM87133R), null, null, AbstractC37817c.m121344e(386740123, c28655q, new C22389c0(4, content)), c28655q, (i15 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 >> 3) & 112), 24);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(visibleState, fromDirection, modifier3, content, i13, i14, 29);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(content)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            long j13 = 1;
            C11362i1 c11362i1M30573u2 = AbstractC11348f.m30573u(0.0f, 200.0f, 1, new C39178j((j13 & 4294967295L) | (j13 << 32)));
            if ((i15 & 112) == 32) {
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C19962a(fromDirection, 20);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C19962a(fromDirection, 20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC1090b.m3347b(visibleState, modifier4, AbstractC3788w0.m11585m(c11362i1M30573u2, (Function1) objM87133R), null, null, AbstractC37817c.m121344e(386740123, c28655q, new C22389c0(4, content)), c28655q, (i15 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 >> 3) & 112), 24);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(visibleState, fromDirection, modifier3, content, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final int m66091r(EnumC22817f enumC22817f, int i13) {
        int i14 = a.f89833a[enumC22817f.ordinal()];
        if (i14 == 1) {
            return -i13;
        }
        if (i14 == 2) {
            return i13;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m66092s(InterfaceC4351m interfaceC4351m, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        interfaceC4351m.invoke(composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m66093t(C11393q0 c11393q0, EnumC22817f enumC22817f, Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m66090q(c11393q0, enumC22817f, modifier, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public static final void m66094u(C11393q0 visibleState, EnumC22818g fromDirection, Modifier modifier, InterfaceC4351m content, Composer composer, int i13, int i14) {
        int i15;
        boolean z4;
        Modifier modifier2;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        boolean z13;
        Object objM87133R;
        int i16;
        AbstractC22676k.m65750j(visibleState, "visibleState");
        AbstractC22676k.m65750j(fromDirection, "fromDirection");
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2073373273);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(visibleState) : c28655q.m87157i(visibleState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(fromDirection.ordinal()) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                i15 |= c28655q.m87153g(modifier) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(content)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                z13 = (i15 & 112) == 32;
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C19962a(fromDirection, 19);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC1090b.m3347b(visibleState, modifier3, AbstractC3788w0.m11588p(null, (Function1) objM87133R, 1), null, null, AbstractC37817c.m121344e(1251557503, c28655q, new C22389c0(1, content)), c28655q, (i15 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 >> 3) & 112), 24);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15079m3(visibleState, fromDirection, modifier2, content, i13, i14, 28);
            }
        }
        i15 |= 384;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(content)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            if ((i15 & 112) == 32) {
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C19962a(fromDirection, 19);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C19962a(fromDirection, 19);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC1090b.m3347b(visibleState, modifier3, AbstractC3788w0.m11588p(null, (Function1) objM87133R, 1), null, null, AbstractC37817c.m121344e(1251557503, c28655q, new C22389c0(1, content)), c28655q, (i15 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 >> 3) & 112), 24);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15079m3(visibleState, fromDirection, modifier2, content, i13, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final int m66095v(EnumC22818g enumC22818g, int i13) {
        int i14 = a.f89834b[enumC22818g.ordinal()];
        if (i14 == 1) {
            return -i13;
        }
        if (i14 == 2) {
            return i13;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m66096w(InterfaceC4351m interfaceC4351m, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        interfaceC4351m.invoke(composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m66097x(C11393q0 c11393q0, EnumC22818g enumC22818g, Modifier modifier, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m66094u(c11393q0, enumC22818g, modifier, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m66098y(Composer composer, int i13) {
        return C38072d.f163053a.m121950c(composer, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.USER_JOURNEY_CUSTOM_ANIMATIONS);
    }
}
