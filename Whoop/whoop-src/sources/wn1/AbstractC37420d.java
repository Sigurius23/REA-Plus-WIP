package wn1;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p163g1.AbstractC15005f3;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: wn1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "rotation", "", "animateToReplayIcon", "", AttachmentExtensionsKt.EXTRA_DURATION, "Ly3/f;", "checkmarkIconSize", "Ll83/a0;", "c", "(FZIFLandroidx/compose/runtime/Composer;I)V", "home-notifications-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37420d {
    /* JADX INFO: renamed from: c */
    public static final void m119785c(float f13, boolean z4, int i13, float f14, Composer composer, int i14) {
        int i15;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-531887133);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            z13 = z4;
            i15 |= c28655q.m87155h(z13) ? 32 : 16;
        } else {
            z13 = z4;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            float f15 = i13;
            AbstractC1090b.m3351f(z13, AbstractC1772c1.m5375L(90.0f + f13, C2314t.f9131w), AbstractC3788w0.m11577e(AbstractC11348f.m30574v(AbstractC12889b.m36258X(0.8f * f15), AbstractC12889b.m36258X(f15 * 0.2f), null, 4), 2), AbstractC3736e1.f15289a, null, AbstractC37817c.m121344e(-898922997, c28655q, new C37417a(f14, 1)), c28655q, ((i15 >> 3) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 16);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37418b(f13, z4, i13, f14, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m119786d(float f13, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        Modifier modifierM3419p = AbstractC1102d.m3419p(f13, C2314t.f9131w);
        C38072d c38072d = C38072d.f163053a;
        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getUndo(), composer, 6), AbstractC8693b.m21273g(AbstractC16277f.f62380t1, composer, 0), modifierM3419p, c38072d.m121949b(composer, C38072d.f163054b).getBrandWhite(), composer, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m119787e(float f13, boolean z4, int i13, float f14, int i14, Composer composer, int i15) {
        m119785c(f13, z4, i13, f14, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }
}
