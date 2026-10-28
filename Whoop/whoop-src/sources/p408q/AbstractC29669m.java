package p408q;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* JADX INFO: renamed from: q.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29669m {
    /* JADX INFO: renamed from: a */
    public static boolean m91144a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* JADX INFO: renamed from: b */
    public static ActionMode m91145b(Window.Callback callback, ActionMode.Callback callback2, int i13) {
        return callback.onWindowStartingActionMode(callback2, i13);
    }
}
