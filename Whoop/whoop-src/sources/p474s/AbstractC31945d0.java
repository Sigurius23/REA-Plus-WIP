package p474s;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: renamed from: s.d0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31945d0 {
    /* JADX INFO: renamed from: a */
    public static void m99429a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
