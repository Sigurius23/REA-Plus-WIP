package io.getstream.chat.android.p226ui.viewmodel.messages;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import i01.C17841d;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.common.feature.messages.poll.PollResultsViewController;
import j93.InterfaceC21461d;
import l83.InterfaceC23462h;
import p298l8.AbstractC23420c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\r\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/models/Poll;", "poll", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;", "controllerProvider", "<init>", "(Lio/getstream/chat/android/models/Poll;Lkotlin/jvm/functions/Function1;)V", "controller$delegate", "Ll83/h;", "getController", "()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollResultsViewController;", "controller", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "Factory", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollResultsViewModel extends AbstractC1637w1 {

    /* JADX INFO: renamed from: controller$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h controller;
    private final AbstractC1615p0 state;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/PollResultsViewModel$Factory;", "Landroidx/lifecycle/a2;", "Lio/getstream/chat/android/models/Poll;", "poll", "<init>", "(Lio/getstream/chat/android/models/Poll;)V", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/models/Poll;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Factory implements InterfaceC1563a2 {
        private final Poll poll;

        public Factory(Poll poll) {
            AbstractC22676k.m65750j(poll, "poll");
            this.poll = poll;
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public final <T extends AbstractC1637w1> T create(InterfaceC21461d interfaceC21461d, AbstractC23420c abstractC23420c) {
            return (T) super.create(interfaceC21461d, abstractC23420c);
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public final <T extends AbstractC1637w1> T create(Class<T> cls, AbstractC23420c abstractC23420c) {
            return (T) super.create(cls, abstractC23420c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.InterfaceC1563a2
        public final <T extends AbstractC1637w1> T create(Class<T> modelClass) {
            AbstractC22676k.m65750j(modelClass, "modelClass");
            if (modelClass.equals(PollResultsViewModel.class)) {
                return new PollResultsViewModel(this.poll, null, 2, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("Factory can only create instances of PollResultsViewModel");
        }
    }

    public /* synthetic */ PollResultsViewModel(Poll poll, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(poll, (i13 & 2) != 0 ? new C19942f(poll, 1) : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PollResultsViewController _init_$lambda$0(Poll poll, AbstractC1637w1 abstractC1637w1) {
        AbstractC22676k.m65750j(abstractC1637w1, "<this>");
        return new PollResultsViewController(poll);
    }

    private static final PollResultsViewController controller_delegate$lambda$1(Function1 function1, PollResultsViewModel pollResultsViewModel) {
        return (PollResultsViewController) function1.invoke(pollResultsViewModel);
    }

    private final PollResultsViewController getController() {
        return (PollResultsViewController) this.controller.getValue();
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public PollResultsViewModel(Poll poll, Function1 controllerProvider) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(controllerProvider, "controllerProvider");
        this.controller = AbstractC30060g.m92088H(new C17841d(controllerProvider, this, 23));
        this.state = AbstractC1613o1.m5012b(getController().getState(), null, 3);
    }
}
