package p531uq;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.whoop.android.R;
import java.util.ArrayList;
import p211i5.C18091d;
import p211i5.C18093f;
import p573w5.AbstractC36831b;

/* JADX INFO: renamed from: uq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C35157b extends AbstractC36831b {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Chip f149169q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35157b(Chip chip, Chip chip2) {
        super(chip2);
        this.f149169q = chip;
    }

    @Override // p573w5.AbstractC36831b
    /* JADX INFO: renamed from: l */
    public final void mo111232l(ArrayList arrayList) {
        C35159d c35159d;
        arrayList.add(0);
        Rect rect = Chip.f20867W;
        Chip chip = this.f149169q;
        if (!chip.m15730c() || (c35159d = chip.f20870E) == null || !c35159d.f149217l0 || chip.f20873H == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p573w5.AbstractC36831b
    /* JADX INFO: renamed from: o */
    public final void mo111233o(int i13, C18093f c18093f) {
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        if (i13 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f20867W);
            return;
        }
        Chip chip = this.f149169q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c18093f.m51948b(C18091d.f70301e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
