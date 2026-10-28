package io.getstream.chat.android.p226ui.viewmodel.messages;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.InterfaceC1563a2;
import i01.C17841d;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.common.feature.messages.poll.PollOptionVotesViewAction;
import io.getstream.chat.android.p226ui.common.feature.messages.poll.PollOptionVotesViewController;
import io.getstream.chat.android.p226ui.utils.SingleLiveEventKt;
import j93.InterfaceC21461d;
import l83.InterfaceC23462h;
import p298l8.AbstractC23420c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/models/Poll;", "poll", "Lio/getstream/chat/android/models/Option;", "option", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;", "controllerProvider", "<init>", "(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;", "action", "Ll83/a0;", "onViewAction", "(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewAction;)V", "controller$delegate", "Ll83/h;", "getController", "()Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;", "controller", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollOptionVotesViewState;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewEvent;", "events", "getEvents", "Factory", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollOptionVotesViewModel extends AbstractC1637w1 {

    /* JADX INFO: renamed from: controller$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h controller;
    private final AbstractC1615p0 events;
    private final AbstractC1615p0 state;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/PollOptionVotesViewModel$Factory;", "Landroidx/lifecycle/a2;", "Lio/getstream/chat/android/models/Poll;", "poll", "Lio/getstream/chat/android/models/Option;", "option", "<init>", "(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/models/Poll;", "Lio/getstream/chat/android/models/Option;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Factory implements InterfaceC1563a2 {
        private final Option option;
        private final Poll poll;

        public Factory(Poll poll, Option option) {
            AbstractC22676k.m65750j(poll, "poll");
            AbstractC22676k.m65750j(option, "option");
            this.poll = poll;
            this.option = option;
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public final <T extends AbstractC1637w1> T create(InterfaceC21461d interfaceC21461d, AbstractC23420c abstractC23420c) {
            return (T) super.create(interfaceC21461d, abstractC23420c);
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public final <T extends AbstractC1637w1> T create(Class<T> cls, AbstractC23420c abstractC23420c) {
            return (T) super.create(cls, abstractC23420c);
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public final <T extends AbstractC1637w1> T create(Class<T> modelClass) {
            AbstractC22676k.m65750j(modelClass, "modelClass");
            if (modelClass.equals(PollOptionVotesViewModel.class)) {
                return new PollOptionVotesViewModel(this.poll, this.option, null, 4, null);
            }
            throw new IllegalArgumentException("Factory can only create instances of PollOptionVotesViewModel");
        }
    }

    public /* synthetic */ PollOptionVotesViewModel(Poll poll, Option option, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(poll, option, (i13 & 4) != 0 ? new C19223a(22, poll, option) : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PollOptionVotesViewController _init_$lambda$0(Poll poll, Option option, AbstractC1637w1 abstractC1637w1) {
        AbstractC22676k.m65750j(abstractC1637w1, "<this>");
        return new PollOptionVotesViewController(poll, option, null, AbstractC1640x1.m5043b(abstractC1637w1), 4, null);
    }

    private static final PollOptionVotesViewController controller_delegate$lambda$1(Function1 function1, PollOptionVotesViewModel pollOptionVotesViewModel) {
        return (PollOptionVotesViewController) function1.invoke(pollOptionVotesViewModel);
    }

    private final PollOptionVotesViewController getController() {
        return (PollOptionVotesViewController) this.controller.getValue();
    }

    public final AbstractC1615p0 getEvents() {
        return this.events;
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final void onViewAction(PollOptionVotesViewAction action) {
        AbstractC22676k.m65750j(action, "action");
        getController().onViewAction(action);
    }

    public PollOptionVotesViewModel(Poll poll, Option option, Function1 controllerProvider) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(option, "option");
        AbstractC22676k.m65750j(controllerProvider, "controllerProvider");
        this.controller = AbstractC30060g.m92088H(new C17841d(controllerProvider, this, 22));
        this.state = AbstractC1613o1.m5012b(getController().getState(), null, 3);
        this.events = SingleLiveEventKt.asSingleLiveEvent$default(getController().getEvents(), null, 1, null);
    }
}
