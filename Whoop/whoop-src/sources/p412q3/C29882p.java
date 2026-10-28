package p412q3;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p078d1.InputConnectionC11463p;

/* JADX INFO: renamed from: q3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C29882p extends InputConnectionC29881o {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            inputConnectionC11463p.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnectionC11463p inputConnectionC11463p = this.f122108b;
        if (inputConnectionC11463p != null) {
            return inputConnectionC11463p.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
