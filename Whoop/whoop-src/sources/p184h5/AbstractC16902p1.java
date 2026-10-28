package p184h5;

import android.view.WindowInsets;

/* JADX INFO: renamed from: h5.p1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16902p1 {
    /* JADX INFO: renamed from: a */
    public static int m47587a(int i13) {
        int iStatusBars;
        int i14 = 0;
        for (int i15 = 1; i15 <= 256; i15 <<= 1) {
            if ((i13 & i15) != 0) {
                if (i15 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i15 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i15 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i15 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i15 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i15 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i15 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i15 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                }
                i14 |= iStatusBars;
            }
        }
        return i14;
    }
}
