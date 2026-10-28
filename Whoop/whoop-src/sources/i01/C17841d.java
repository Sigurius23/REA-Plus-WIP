package i01;

import android.view.View;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.education.FeatureEducationDebugFragment;
import g22.C15281a;
import gd0.AbstractC15713c;
import i21.AbstractC17993c;
import i21.AbstractC18004n;
import i21.InterfaceC18002l;
import i22.AbstractC18015c;
import ib2.AbstractC18337b;
import ib2.InterfaceC18340e;
import id0.AbstractC18409c;
import id2.AbstractC18429n;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.internal.DistinctChatApi;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;
import io.getstream.chat.android.client.api2.MoshiChatApi;
import io.getstream.chat.android.client.api2.model.requests.QueryUsersRequest;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.feature.mentions.MentionListController;
import io.getstream.chat.android.p226ui.common.feature.messages.poll.PollOptionVotesViewController;
import io.getstream.chat.android.p226ui.common.feature.messages.poll.PollResultsViewController;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryItem;
import io.getstream.chat.android.p226ui.feature.gallery.overview.internal.MediaAttachmentAdapter;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProvider;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderKt;
import io.getstream.chat.android.p226ui.viewmodel.mentions.MentionListViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModelBinding;
import io.getstream.chat.android.p226ui.viewmodel.messages.PollOptionVotesViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.PollResultsViewModel;
import io2.AbstractC20749a0;
import io2.AbstractC20757e0;
import io2.AbstractC20760g;
import io2.C20751b0;
import io2.C20755d0;
import io2.C20762h;
import iw0.AbstractC20992x;
import iw0.C20970g0;
import j01.AbstractC21125b;
import j01.C21127d;
import java.util.ArrayList;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import tr2.InterfaceC34116n;
import z30.C40039b;

/* JADX INFO: renamed from: i01.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17841d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69352w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f69353x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f69354y;

    public /* synthetic */ C17841d(int i13, Object obj, Object obj2) {
        this.f69352w = i13;
        this.f69354y = obj;
        this.f69353x = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f69352w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f69353x;
        Object obj2 = this.f69354y;
        switch (i13) {
            case 0:
                return AbstractC17843f.m51287n((C17845h) obj2, (Function1) obj);
            case 1:
                ((Function1) obj).invoke((C40039b) obj2);
                return c23454a0;
            case 2:
                return AbstractC17993c.m51605i((Function1) obj, (InterfaceC18002l.a) obj2);
            case 3:
                return AbstractC18004n.m51676l((Function1) obj, (InterfaceC18002l.d) obj2);
            case 4:
                return AbstractC18015c.m51722C((InterfaceC4351m) obj2, (C15281a) obj);
            case 5:
                return AbstractC18337b.m52805E((Function1) obj, (InterfaceC18340e.a) obj2);
            case 6:
                return AbstractC18337b.m52830x((Function1) obj, (InterfaceC18340e) obj2);
            case 7:
                return AbstractC18337b.m52802B((InterfaceC34116n) obj2, (InterfaceC18340e.a) obj);
            case 8:
                return AbstractC18409c.m52981t((AbstractC15713c) obj2, (Function1) obj);
            case 9:
                return AbstractC18429n.m53072y((ComposeView) obj2, (View) obj);
            case 10:
                return FeatureEducationDebugFragment.m21351F((FeatureEducationDebugFragment) obj2, (InterfaceC28601c1) obj);
            case 11:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.MarkReadIdentifier((String) obj2, (String) obj));
            case 12:
                return DistinctChatApi.m54546f((DistinctChatApi) obj2, (QueryChannelsRequest) obj);
            case 13:
                return MoshiChatApi.m54569H((MoshiChatApi) obj2, (QueryThreadsRequest) obj);
            case 14:
                return MoshiChatApi.m54616o((MoshiChatApi) obj2, (QueryUsersRequest) obj);
            case 15:
                return MoshiChatApi.m54623s((MoshiChatApi) obj2, (io.getstream.chat.android.client.api2.model.requests.QueryChannelsRequest) obj);
            case 16:
                ChannelListView.setChannels$lambda$9((ChannelListView) obj2, (ArrayList) obj);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                MediaAttachmentAdapter.MediaAttachmentViewHolder.loadImage$lambda$2((MediaAttachmentAdapter.MediaAttachmentViewHolder) obj2, (AttachmentGalleryItem) obj);
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return MessageListView.m55338G0((MessageListView) obj2, (Attachment) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return DecoratorProviderKt.C197911.m55538a((DecoratorProvider) obj2, (DecoratorProvider) obj);
            case 20:
                return (MentionListController) ((Function1) obj).invoke((MentionListViewModel) obj2);
            case 21:
                MessageListViewModelBinding.bindView$lambda$17$lambda$16((MessageListViewModel) obj2, (InterfaceC4339a) obj);
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return (PollOptionVotesViewController) ((Function1) obj).invoke((PollOptionVotesViewModel) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return (PollResultsViewController) ((Function1) obj).invoke((PollResultsViewModel) obj2);
            case 24:
                return AbstractC20760g.m57166h((Function1) obj, (C20762h) obj2);
            case 25:
                return AbstractC20749a0.m57120j((Function1) obj, (C20751b0) obj2);
            case 26:
                return AbstractC20757e0.m57154h((Function1) obj, (C20755d0) obj2);
            case 27:
                return AbstractC20992x.m58449q1((C20970g0) obj2, (Function1) obj);
            case 28:
                return AbstractC20992x.m58407c1((C20970g0) obj2, (InterfaceC4339a) obj);
            default:
                return AbstractC21125b.m58945k((C21127d) obj2, (Function1) obj);
        }
    }

    public /* synthetic */ C17841d(Function1 function1, Object obj, int i13) {
        this.f69352w = i13;
        this.f69353x = function1;
        this.f69354y = obj;
    }
}
