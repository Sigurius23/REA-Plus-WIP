package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import c93.InterfaceC4351m;
import hg3.AbstractC17269i;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p209i3.AbstractC18032n;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import qc1.C30217a;

/* JADX INFO: renamed from: g1.c8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14977c8 {

    /* JADX INFO: renamed from: a */
    public static final float f55961a = 90;

    /* JADX INFO: renamed from: b */
    public static final C11347e2 f55962b = AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, AbstractC11333b0.f36310a, 2);

    /* JADX INFO: renamed from: a */
    public static final void m43098a(int i13, Modifier modifier, long j7, long j13, float f13, C37816b c37816b, InterfaceC4351m interfaceC4351m, C37816b c37816b2, Composer composer, int i14) {
        int i15;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1291546575);
        if ((i14 & 6) == 0) {
            i15 = (c28655q2.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q2.m87151f(j7) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q2.m87151f(j13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q2.m87147d(f13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q2.m87157i(c37816b) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= c28655q2.m87157i(c37816b2) ? 8388608 : 4194304;
        }
        if (c28655q2.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            c28655q = c28655q2;
            AbstractC17269i.m48898k(modifier, null, j7, j13, null, 0.0f, AbstractC37817c.m121344e(-1575164555, c28655q2, new C15213z7(f13, c37816b2, interfaceC4351m, c37816b, i13)), c28655q, ((i15 >> 3) & 14) | 1572864 | (i15 & 896) | (i15 & 7168), 50);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15024h0(i13, modifier, j7, j13, f13, c37816b, interfaceC4351m, c37816b2, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43099b(int i13, final Modifier modifier, final long j7, final long j13, final C37816b c37816b, final InterfaceC4351m interfaceC4351m, final C37816b c37816b2, Composer composer, final int i14) {
        final int i15;
        int i16;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(113221600);
        if ((i14 & 6) == 0) {
            i15 = i13;
            i16 = (c28655q2.m87149e(i15) ? 4 : 2) | i14;
        } else {
            i15 = i13;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87151f(j7) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87151f(j13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i16 |= c28655q2.m87157i(c37816b) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i16 |= c28655q2.m87157i(interfaceC4351m) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= c28655q2.m87157i(c37816b2) ? 1048576 : 524288;
        }
        if (c28655q2.m87135U(i16 & 1, (599187 & i16) != 599186)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            c28655q = c28655q2;
            AbstractC17269i.m48898k(AbstractC18032n.m51775c(modifier, false, new C30217a(12)), null, j7, j13, null, 0.0f, AbstractC37817c.m121344e(-638448612, c28655q2, new C14966b8(c37816b2, interfaceC4351m, c37816b, 0)), c28655q, 1572864 | (i16 & 896) | (i16 & 7168), 50);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.x7
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC14977c8.m43099b(i15, modifier, j7, j13, c37816b, interfaceC4351m, c37816b2, (Composer) obj, AbstractC28683x.m87244L(i14 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }
}
