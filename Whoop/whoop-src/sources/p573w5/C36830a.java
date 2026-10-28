package p573w5;

import ad3.C0783z;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p211i5.C18093f;
import p531uq.C35157b;

/* JADX INFO: renamed from: w5.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C36830a extends C0783z {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC36831b f157546y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36830a(AbstractC36831b abstractC36831b) {
        super(14);
        this.f157546y = abstractC36831b;
    }

    @Override // ad3.C0783z
    /* JADX INFO: renamed from: i */
    public final C18093f mo1865i(int i13) {
        return new C18093f(AccessibilityNodeInfo.obtain(this.f157546y.m118068n(i13).f70317a));
    }

    @Override // ad3.C0783z
    /* JADX INFO: renamed from: k */
    public final C18093f mo1867k(int i13) {
        AbstractC36831b abstractC36831b = this.f157546y;
        int i14 = i13 == 2 ? abstractC36831b.f157557k : abstractC36831b.f157558l;
        if (i14 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1865i(i14);
    }

    @Override // ad3.C0783z
    /* JADX INFO: renamed from: s */
    public final boolean mo1874s(int i13, int i14, Bundle bundle) {
        int i15;
        AbstractC36831b abstractC36831b = this.f157546y;
        Chip chip = abstractC36831b.f157555i;
        if (i13 == -1) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            return chip.performAccessibilityAction(i14, bundle);
        }
        if (i14 == 1) {
            return abstractC36831b.m118069p(i13);
        }
        if (i14 == 2) {
            return abstractC36831b.m118065j(i13);
        }
        boolean z4 = false;
        if (i14 == 64) {
            AccessibilityManager accessibilityManager = abstractC36831b.f157554h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i15 = abstractC36831b.f157557k) == i13) {
                return false;
            }
            if (i15 != Integer.MIN_VALUE) {
                abstractC36831b.f157557k = Integer.MIN_VALUE;
                chip.invalidate();
                abstractC36831b.m118070q(i15, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
            }
            abstractC36831b.f157557k = i13;
            chip.invalidate();
            abstractC36831b.m118070q(i13, 32768);
            return true;
        }
        if (i14 == 128) {
            if (abstractC36831b.f157557k != i13) {
                return false;
            }
            abstractC36831b.f157557k = Integer.MIN_VALUE;
            chip.invalidate();
            abstractC36831b.m118070q(i13, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
            return true;
        }
        Chip chip2 = ((C35157b) abstractC36831b).f149169q;
        if (i14 == 16) {
            if (i13 == 0) {
                return chip2.performClick();
            }
            if (i13 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f20873H;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z4 = true;
                }
                if (chip2.f20884S) {
                    chip2.f20883R.m118070q(1, 1);
                }
            }
        }
        return z4;
    }
}
