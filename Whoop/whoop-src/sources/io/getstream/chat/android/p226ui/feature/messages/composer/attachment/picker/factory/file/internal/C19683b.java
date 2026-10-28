package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.feature.hormonalcontext.view.HormonalContextFragment;
import com.whoop.advancedlabs.view.AdvancedLabsFragment;
import com.whoop.videocall.view.VideoCallFragment;
import io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentFragment;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.system.internal.AttachmentsPickerSystemFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$viewModel$2$1;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.PollCommentsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.SingleReactionViewBubbleDrawer;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal.ViewReactionsBubbleDrawer;
import io.getstream.chat.android.p226ui.feature.pinned.list.PinnedMessageListView;
import io.getstream.chat.android.p226ui.feature.search.list.SearchResultListView;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListView;
import io.getstream.chat.android.p226ui.utils.ListenerDelegate;
import io.sentry.internal.debugmeta.C20378c;
import iu2.C20937a;
import kc2.C22356f;
import l83.C23454a0;
import ld0.C23858q;
import ld0.C23859r;
import le3.C23886g;
import le3.C23890k;
import lf0.AbstractC23917f2;
import lf0.AbstractC23927i0;
import lf0.AbstractC23952o1;
import lf0.C23931j0;
import live.hms.video.audio.manager.HMSAudioManagerApi31;
import live.hms.video.connection.degredation.QualityLimitationReasons;
import p005a3.AbstractC0201g;
import p031b9.C2817b;
import p269k1.C22110a;
import p292l1.C23196w3;
import p292l1.DialogC23087e2;
import p314m.DialogInterfaceC24846j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.AbstractLongTimeSource;
import wd3.AbstractC37172f;
import zd3.C40571o;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.file.internal.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19683b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74532w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74533x;

    public /* synthetic */ C19683b(Object obj, int i13) {
        this.f74532w = i13;
        this.f74533x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74532w) {
            case 0:
                return FileAttachmentFragment.fileAttachmentsAdapter_delegate$lambda$1((FileAttachmentFragment) this.f74533x);
            case 1:
                return MediaAttachmentFragment.mediaAttachmentsAdapter_delegate$lambda$0((MediaAttachmentFragment) this.f74533x);
            case 2:
                AttachmentsPickerSystemFragment.setupViews$lambda$7$lambda$6$lambda$5((AttachmentsPickerSystemFragment) this.f74533x);
                return C23454a0.f92919a;
            case 3:
                return new AllPollOptionsDialogFragment$viewModel$2$1((AllPollOptionsDialogFragment) this.f74533x);
            case 4:
                return PollCommentsDialogFragment.m55621z((PollCommentsDialogFragment) this.f74533x);
            case 5:
                return SingleReactionViewBubbleDrawer.bubbleStrokePaintTheirs_delegate$lambda$5((SingleReactionViewBubbleDrawer) this.f74533x);
            case 6:
                return ViewReactionsBubbleDrawer.bubbleStrokePaintTheirs_delegate$lambda$5((ViewReactionsBubbleDrawer) this.f74533x);
            case 7:
                PinnedMessageListView.scrollListener$lambda$0((PinnedMessageListView) this.f74533x);
                return C23454a0.f92919a;
            case 8:
                SearchResultListView.scrollListener$lambda$0((SearchResultListView) this.f74533x);
                return C23454a0.f92919a;
            case 9:
                ThreadListView.scrollListener$lambda$0((ThreadListView) this.f74533x);
                return C23454a0.f92919a;
            case 10:
                return ListenerDelegate.m55663a((ListenerDelegate) this.f74533x);
            case 11:
                return C20937a.m58149o((C20937a) this.f74533x);
            case 12:
                return StatePlugin.m54788a((StatePlugin) this.f74533x);
            case 13:
                return VideoCallFragment.m27833D((VideoCallFragment) this.f74533x);
            case 14:
                AbstractC0201g.m508h((C22110a) this.f74533x);
                return C23454a0.f92919a;
            case 15:
                return C22356f.m64254D((C22356f) this.f74533x);
            case 16:
                return AdvancedLabsFragment.m17688D((AdvancedLabsFragment) this.f74533x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Long.valueOf(((AbstractLongTimeSource) this.f74533x).getReading());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((DialogC23087e2) this.f74533x).f91112z.invoke();
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C23196w3) this.f74533x).f91786d;
            case 20:
                C2817b this$0 = (C2817b) this.f74533x;
                AbstractC22676k.m65750j(this$0, "this$0");
                ((DialogInterfaceC24846j) this$0.f11025z).dismiss();
                return C23454a0.f92919a;
            case 21:
                return ((C20378c) this.f74533x).mo11169h(":memory:");
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return HormonalContextFragment.m17448E((HormonalContextFragment) this.f74533x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC37172f.m119117b((C23890k) this.f74533x);
                return C23454a0.f92919a;
            case 24:
                C40571o c40571o = ((C23886g) this.f74533x).f94453i;
                AbstractC22676k.m65747g(c40571o);
                c40571o.cancel();
                return C23454a0.f92919a;
            case 25:
                return AbstractC23927i0.m70406j((C23931j0) this.f74533x);
            case 26:
                return Boolean.valueOf(AbstractC23952o1.m70568l((C23858q) this.f74533x));
            case 27:
                return AbstractC23917f2.m70339s((C23859r) this.f74533x);
            case 28:
                return HMSAudioManagerApi31.mainHandler_delegate$lambda$0((HMSAudioManagerApi31) this.f74533x);
            default:
                return QualityLimitationReasons.reason_delegate$lambda$0((QualityLimitationReasons) this.f74533x);
        }
    }
}
