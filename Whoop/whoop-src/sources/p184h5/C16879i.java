package p184h5;

import android.app.Activity;
import android.view.DragEvent;

/* JADX INFO: renamed from: h5.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C16879i {
    /* JADX INFO: renamed from: a */
    public static C16879i m47521a(Activity activity, DragEvent dragEvent) {
        if (activity.requestDragAndDropPermissions(dragEvent) != null) {
            return new C16879i();
        }
        return null;
    }
}
