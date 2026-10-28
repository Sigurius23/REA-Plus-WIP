package androidx.core.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class DialogCompat {

    public static class Api28Impl {
        private Api28Impl() {
        }

        public static <T> T requireViewById(Dialog dialog, int i13) {
            return (T) dialog.requireViewById(i13);
        }
    }

    private DialogCompat() {
    }

    public static View requireViewById(Dialog dialog, int i13) {
        return (View) Api28Impl.requireViewById(dialog, i13);
    }
}
