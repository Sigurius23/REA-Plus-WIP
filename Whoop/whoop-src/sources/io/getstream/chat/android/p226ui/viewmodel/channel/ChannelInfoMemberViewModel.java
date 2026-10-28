package io.getstream.chat.android.p226ui.viewmodel.channel;

import a23.C0175b;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoMemberViewAction;
import io.getstream.chat.android.p226ui.common.feature.channel.info.ChannelInfoMemberViewController;
import io.getstream.chat.android.p226ui.utils.SingleLiveEventKt;
import l83.InterfaceC23462h;
import p000.C17820i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;", "Landroidx/lifecycle/w1;", "", "cid", "memberId", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;", "controllerProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;", "action", "Ll83/a0;", "onViewAction", "(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewAction;)V", "Ljava/lang/String;", "controller$delegate", "Ll83/h;", "getController", "()Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;", "controller", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoMemberViewState;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewEvent;", "events", "getEvents", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelInfoMemberViewModel extends AbstractC1637w1 {
    private final String cid;

    /* JADX INFO: renamed from: controller$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h controller;
    private final AbstractC1615p0 events;
    private final String memberId;
    private final AbstractC1615p0 state;

    public /* synthetic */ ChannelInfoMemberViewModel(String str, String str2, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? new C0175b(str, str2, 0) : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelInfoMemberViewController _init_$lambda$0(String str, String str2, AbstractC1637w1 abstractC1637w1) {
        AbstractC22676k.m65750j(abstractC1637w1, "<this>");
        return new ChannelInfoMemberViewController(str, str2, AbstractC1640x1.m5043b(abstractC1637w1), null, null, null, 56, null);
    }

    private static final ChannelInfoMemberViewController controller_delegate$lambda$1(Function1 function1, ChannelInfoMemberViewModel channelInfoMemberViewModel) {
        return (ChannelInfoMemberViewController) function1.invoke(channelInfoMemberViewModel);
    }

    private final ChannelInfoMemberViewController getController() {
        return (ChannelInfoMemberViewController) this.controller.getValue();
    }

    public final AbstractC1615p0 getEvents() {
        return this.events;
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final void onViewAction(ChannelInfoMemberViewAction action) {
        AbstractC22676k.m65750j(action, "action");
        getController().onViewAction(action);
    }

    public ChannelInfoMemberViewModel(String cid, String memberId, Function1 controllerProvider) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(memberId, "memberId");
        AbstractC22676k.m65750j(controllerProvider, "controllerProvider");
        this.cid = cid;
        this.memberId = memberId;
        this.controller = AbstractC30060g.m92088H(new C17820i(4, controllerProvider, this));
        this.state = AbstractC1613o1.m5012b(getController().getState(), null, 3);
        this.events = SingleLiveEventKt.asSingleLiveEvent$default(getController().getEvents(), null, 1, null);
    }
}
