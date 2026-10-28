package androidx.compose.p018ui.input.pointer;

import java.util.concurrent.CancellationException;
import p512u2.AbstractC34454d0;
import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public PointerEventTimeoutCancellationException(long j7) {
        super(AbstractC31061c.m95636l(j7, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC34454d0.f144756a);
        return this;
    }
}
