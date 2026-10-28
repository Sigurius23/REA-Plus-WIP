package p667z0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import p181h2.C16618c;

/* JADX INFO: renamed from: z0.j */
/* JADX INFO: loaded from: classes5.dex */
public final class ActionModeCallbackC39928j extends ActionMode.Callback2 implements ActionMode.Callback {

    /* JADX INFO: renamed from: a */
    public final C39922d f172365a;

    public ActionModeCallbackC39928j(C39922d c39922d) {
        this.f172365a = c39922d;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        this.f172365a.getClass();
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f172365a.m128084a(menu);
        return menu.size() > 0;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f172365a.f172345a.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C16618c c16618c = (C16618c) this.f172365a.f172347c.invoke();
        rect.set(Math.round(c16618c.f63939a), Math.round(c16618c.f63940b), Math.round(c16618c.f63941c), Math.round(c16618c.f63942d));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f172365a.m128084a(menu);
    }
}
