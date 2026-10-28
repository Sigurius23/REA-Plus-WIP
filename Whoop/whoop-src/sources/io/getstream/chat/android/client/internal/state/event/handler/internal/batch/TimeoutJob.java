package io.getstream.chat.android.client.internal.state.event.handler.internal.batch;

import bc3.InterfaceC3027k1;
import java.util.concurrent.CancellationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;", "", "<init>", "()V", "Ll83/a0;", "cancel", "reset", "Lbc3/k1;", "job", "set", "(Lbc3/k1;)V", "pending", "Lbc3/k1;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class TimeoutJob {
    private InterfaceC3027k1 pending;

    public final void cancel() {
        InterfaceC3027k1 interfaceC3027k1 = this.pending;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.pending = null;
    }

    public final void reset() {
        this.pending = null;
    }

    public final void set(InterfaceC3027k1 job) {
        AbstractC22676k.m65750j(job, "job");
        InterfaceC3027k1 interfaceC3027k1 = this.pending;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.pending = job;
    }
}
