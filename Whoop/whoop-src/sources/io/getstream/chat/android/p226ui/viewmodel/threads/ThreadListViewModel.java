package io.getstream.chat.android.p226ui.viewmodel.threads;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import io.getstream.chat.android.p226ui.common.feature.threads.ThreadListController;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;", "controller", "<init>", "(Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;)V", "Ll83/a0;", "load", "()V", "loadNextPage", "Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadListViewModel extends AbstractC1637w1 {
    private final ThreadListController controller;
    private final AbstractC1615p0 state;

    public ThreadListViewModel(ThreadListController controller) {
        AbstractC22676k.m65750j(controller, "controller");
        this.controller = controller;
        this.state = AbstractC1613o1.m5012b(controller.getState(), null, 3);
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final void load() {
        this.controller.load();
    }

    public final void loadNextPage() {
        this.controller.loadNextPage();
    }
}
