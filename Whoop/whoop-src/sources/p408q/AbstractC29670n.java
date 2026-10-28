package p408q;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: q.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29670n {
    /* JADX INFO: renamed from: a */
    public static void m91146a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i13) {
        callback.onProvideKeyboardShortcuts(list, menu, i13);
    }
}
