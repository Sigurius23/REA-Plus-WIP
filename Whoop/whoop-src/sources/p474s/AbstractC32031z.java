package p474s;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p047c9.C4322m;
import p184h5.AbstractC16901p0;
import p184h5.C16864d;
import p184h5.InterfaceC16861c;

/* JADX INFO: renamed from: s.z */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32031z {
    /* JADX INFO: renamed from: a */
    public static boolean m99584a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC16861c c4322m;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c4322m = new C4322m(clipData, 3);
            } else {
                C16864d c16864d = new C16864d();
                c16864d.f64790b = clipData;
                c16864d.f64791c = 3;
                c4322m = c16864d;
            }
            AbstractC16901p0.m47579j(textView, c4322m.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m99585b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC16861c c4322m;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c4322m = new C4322m(clipData, 3);
        } else {
            C16864d c16864d = new C16864d();
            c16864d.f64790b = clipData;
            c16864d.f64791c = 3;
            c4322m = c16864d;
        }
        AbstractC16901p0.m47579j(view, c4322m.build());
        return true;
    }
}
