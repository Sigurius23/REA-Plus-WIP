package t61;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import j93.AbstractC21478l0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p014aj.C0929d;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17918w0;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import u61.EnumC34553b;

/* JADX INFO: renamed from: t61.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Li2/x;", "color", "Ly3/f;", "size", "Lu61/b;", "shape", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;JFLu61/b;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33556f {

    /* JADX INFO: renamed from: t61.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f140036a;

        static {
            int[] iArr = new int[EnumC34553b.values().length];
            try {
                iArr[EnumC34553b.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC34553b.DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC34553b.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC34553b.DIAMOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f140036a = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m105964c(Modifier modifier, final long j7, final float f13, EnumC34553b enumC34553b, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        final EnumC34553b enumC34553b2;
        final Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1885631947);
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
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87147d(f13) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87149e(enumC34553b == null ? -1 : enumC34553b.ordinal()) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            final EnumC34553b enumC34553b3 = i17 != 0 ? EnumC34553b.CIRCLE : enumC34553b;
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            final float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(2);
            final float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f13);
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, modifier3);
            boolean zM87147d = ((i15 & 7168) == 2048) | ((i15 & 112) == 32) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1);
            Object objM87133R = c28655q.m87133R();
            if (zM87147d || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: t61.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC33556f.m105965d(enumC34553b3, j7, fMo743q0, fMo743q1, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 0);
            enumC34553b2 = enumC34553b3;
        } else {
            c28655q.m87138X();
            enumC34553b2 = enumC34553b;
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: t61.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC33556f.m105966e(modifier3, j7, f13, enumC34553b2, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m105965d(EnumC34553b enumC34553b, long j7, float f13, float f14, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        int i13 = a.f140036a[enumC34553b.ordinal()];
        if (i13 == 1) {
            InterfaceC22131e.m63379M(Canvas, j7, 0.0f, 0L, 0.0f, null, 126);
            long jM670A = Canvas.mo744t0().m670A();
            float f15 = 2 * f13;
            if (Float.intBitsToFloat((int) (jM670A >> 32)) > f15 && Float.intBitsToFloat((int) (jM670A & 4294967295L)) > f15 && f15 < f14) {
                ((C0929d) Canvas.mo744t0().f812x).m2355o(f13, f13, f13, f13);
                try {
                    InterfaceC22131e.m63379M(Canvas, AbstractC17918w0.m51517e(4278918955L), 0.0f, 0L, 0.0f, null, 126);
                } finally {
                    float f16 = -f13;
                    ((C0929d) Canvas.mo744t0().f812x).m2355o(f16, f16, f16, f16);
                }
            }
        } else if (i13 == 2) {
            InterfaceC22131e.m63379M(Canvas, j7, 0.0f, 0L, 0.0f, null, 126);
        } else if (i13 == 3) {
            InterfaceC22131e.m63383i0(Canvas, j7, 0L, 0L, 0.0f, null, 0, 126);
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            long jMo721B0 = Canvas.mo721B0();
            C0237p c0237pMo744t0 = Canvas.mo744t0();
            long jM670A2 = c0237pMo744t0.m670A();
            c0237pMo744t0.m716w().mo51426q();
            try {
                ((C0929d) c0237pMo744t0.f812x).m2358v(45.0f, jMo721B0);
                InterfaceC22131e.m63383i0(Canvas, j7, 0L, 0L, 0.0f, null, 0, 126);
            } finally {
                AbstractC11266d.m30472z(c0237pMo744t0, jM670A2);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m105966e(Modifier modifier, long j7, float f13, EnumC34553b enumC34553b, int i13, int i14, Composer composer, int i15) {
        m105964c(modifier, j7, f13, enumC34553b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
