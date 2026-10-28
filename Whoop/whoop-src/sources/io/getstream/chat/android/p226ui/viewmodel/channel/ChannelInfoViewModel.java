package io.getstream.chat.android.p226ui.viewmodel.channel;

import a23.C0176c;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoMemberViewEvent;
import io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoViewAction;
import io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoViewController;
import io.getstream.chat.android.p226ui.common.state.channel.info.ChannelInfoViewState;
import io.getstream.chat.android.p226ui.utils.SingleLiveEventKt;
import l83.InterfaceC23462h;
import p000.C17820i;
import p000.C28503p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001c8\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;", "Landroidx/lifecycle/w1;", "", "cid", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;", "", "optionFilter", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;", "controllerProvider", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;", "action", "Ll83/a0;", "onViewAction", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewAction;)V", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", NotificationCompat.CATEGORY_EVENT, "onMemberViewEvent", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;)V", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "controller$delegate", "Ll83/h;", "getController", "()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;", "controller", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;", "events", "getEvents", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoViewModel extends AbstractC1637w1 {
    private final String cid;

    /* JADX INFO: renamed from: controller$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h controller;
    private final AbstractC1615p0 events;
    private final Function1 optionFilter;
    private final AbstractC1615p0 state;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChannelInfoViewModel(String str, Function1 function1, Function1 function2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        function1 = (i13 & 2) != 0 ? new C28503p(4) : function1;
        this(str, function1, (i13 & 4) != 0 ? new C0176c(str, function1, 0) : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(ChannelInfoViewState.Content.Option it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelInfoViewController _init_$lambda$1(String str, Function1 function1, AbstractC1637w1 abstractC1637w1) {
        AbstractC22676k.m65750j(abstractC1637w1, "<this>");
        return new ChannelInfoViewController(str, AbstractC1640x1.m5043b(abstractC1637w1), function1, null, null, null, null, 120, null);
    }

    private static final ChannelInfoViewController controller_delegate$lambda$2(Function1 function1, ChannelInfoViewModel channelInfoViewModel) {
        return (ChannelInfoViewController) function1.invoke(channelInfoViewModel);
    }

    private final ChannelInfoViewController getController() {
        return (ChannelInfoViewController) this.controller.getValue();
    }

    public final AbstractC1615p0 getEvents() {
        return this.events;
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final void onMemberViewEvent(ChannelInfoMemberViewEvent event) {
        AbstractC22676k.m65750j(event, "event");
        getController().onMemberViewEvent(event);
    }

    public final void onViewAction(ChannelInfoViewAction action) {
        AbstractC22676k.m65750j(action, "action");
        getController().onViewAction(action);
    }

    public ChannelInfoViewModel(String cid, Function1 optionFilter, Function1 controllerProvider) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(optionFilter, "optionFilter");
        AbstractC22676k.m65750j(controllerProvider, "controllerProvider");
        this.cid = cid;
        this.optionFilter = optionFilter;
        this.controller = AbstractC30060g.m92088H(new C17820i(5, controllerProvider, this));
        this.state = AbstractC1613o1.m5012b(getController().getState(), null, 3);
        this.events = SingleLiveEventKt.asSingleLiveEvent$default(getController().getEvents(), null, 1, null);
    }
}
