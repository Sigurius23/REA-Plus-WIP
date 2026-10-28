package io.getstream.chat.android.p226ui.viewmodel.channel;

import a23.C0174a;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.feature.channel.attachments.ChannelAttachmentsViewAction;
import io.getstream.chat.android.p226ui.common.feature.channel.attachments.ChannelAttachmentsViewController;
import io.getstream.chat.android.p226ui.utils.SingleLiveEventKt;
import java.util.List;
import l83.InterfaceC23462h;
import p000.C17820i;
import p000.C28503p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;", "Landroidx/lifecycle/w1;", "", "cid", "", "attachmentTypes", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Attachment;", "", "localFilter", "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;", "controllerProvider", "<init>", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;", "action", "Ll83/a0;", "onViewAction", "(Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewAction;)V", "Ljava/lang/String;", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "controller$delegate", "Ll83/h;", "getController", "()Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;", "controller", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/state/channel/attachments/ChannelAttachmentsViewState;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent;", "events", "getEvents", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelAttachmentsViewModel extends AbstractC1637w1 {
    private final List<String> attachmentTypes;
    private final String cid;

    /* JADX INFO: renamed from: controller$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h controller;
    private final AbstractC1615p0 events;
    private final Function1 localFilter;
    private final AbstractC1615p0 state;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChannelAttachmentsViewModel(String str, List list, Function1 function1, Function1 function2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        function1 = (i13 & 4) != 0 ? new C28503p(2) : function1;
        this(str, list, function1, (i13 & 8) != 0 ? new C0174a(str, list, function1) : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Attachment it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelAttachmentsViewController _init_$lambda$1(String str, List list, Function1 function1, AbstractC1637w1 abstractC1637w1) {
        AbstractC22676k.m65750j(abstractC1637w1, "<this>");
        return new ChannelAttachmentsViewController(str, list, function1, null, AbstractC1640x1.m5043b(abstractC1637w1), 8, null);
    }

    private static final ChannelAttachmentsViewController controller_delegate$lambda$2(Function1 function1, ChannelAttachmentsViewModel channelAttachmentsViewModel) {
        return (ChannelAttachmentsViewController) function1.invoke(channelAttachmentsViewModel);
    }

    private final ChannelAttachmentsViewController getController() {
        return (ChannelAttachmentsViewController) this.controller.getValue();
    }

    public final AbstractC1615p0 getEvents() {
        return this.events;
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final void onViewAction(ChannelAttachmentsViewAction action) {
        AbstractC22676k.m65750j(action, "action");
        getController().onViewAction(action);
    }

    public ChannelAttachmentsViewModel(String cid, List<String> attachmentTypes, Function1 localFilter, Function1 controllerProvider) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(attachmentTypes, "attachmentTypes");
        AbstractC22676k.m65750j(localFilter, "localFilter");
        AbstractC22676k.m65750j(controllerProvider, "controllerProvider");
        this.cid = cid;
        this.attachmentTypes = attachmentTypes;
        this.localFilter = localFilter;
        this.controller = AbstractC30060g.m92088H(new C17820i(3, controllerProvider, this));
        this.state = AbstractC1613o1.m5012b(getController().getState(), null, 3);
        this.events = SingleLiveEventKt.asSingleLiveEvent$default(getController().getEvents(), null, 1, null);
    }
}
