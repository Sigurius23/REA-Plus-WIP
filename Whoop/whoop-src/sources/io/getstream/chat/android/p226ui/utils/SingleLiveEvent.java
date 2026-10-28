package io.getstream.chat.android.p226ui.utils;

import androidx.lifecycle.C1630u0;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/utils/SingleLiveEvent;", "T", "Landroidx/lifecycle/u0;", "<init>", "()V", "Landroidx/lifecycle/g0;", "owner", "Landroidx/lifecycle/v0;", "observer", "Ll83/a0;", "observe", "(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V", "value", "setValue", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SingleLiveEvent<T> extends C1630u0 {
    private final AtomicBoolean pending = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 observe$lambda$0(SingleLiveEvent singleLiveEvent, InterfaceC1633v0 interfaceC1633v0, Object obj) {
        if (singleLiveEvent.pending.compareAndSet(true, false)) {
            interfaceC1633v0.onChanged(obj);
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.lifecycle.AbstractC1615p0
    public final void observe(InterfaceC1585g0 owner, InterfaceC1633v0 observer) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC22676k.m65750j(observer, "observer");
        super.observe(owner, new SingleLiveEventKt$sam$androidx_lifecycle_Observer$0(new C19223a(19, this, observer)));
    }

    @Override // androidx.lifecycle.C1630u0, androidx.lifecycle.AbstractC1615p0
    public final void setValue(T value) {
        this.pending.set(true);
        super.setValue(value);
    }
}
