package p512u2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.input.pointer.SuspendPointerInputElement;
import m83.C25271y;

/* JADX INFO: renamed from: u2.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34452c0 {

    /* JADX INFO: renamed from: a */
    public static final C34465k f144747a = new C34465k(C25271y.f99162w, null);

    /* JADX INFO: renamed from: a */
    public static final C34462h0 m108902a(PointerInputEventHandler pointerInputEventHandler) {
        return new C34462h0(null, null, null, pointerInputEventHandler);
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m108903b(Modifier modifier, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.mo3471e(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6));
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m108905d(Modifier modifier, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        return modifier.mo3471e(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3));
    }
}
