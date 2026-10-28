package io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal;

import android.view.View;
import android.widget.TextView;
import androidx.compose.p018ui.Modifier;
import androidx.constraintlayout.widget.C1153p;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1596j;
import androidx.lifecycle.C1627t0;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.recyclerview.widget.C1715o0;
import e10.C12553k;
import fk1.C14553a;
import h20.C16665h1;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserEntity;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelStateLogic;
import io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao_Impl;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity;
import io.getstream.chat.android.p226ui.feature.gallery.overview.internal.MediaAttachmentDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.PinIndicatorDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal.ReactionsDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessageDeletedViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal.ViewReactionsView;
import io.getstream.chat.android.p226ui.utils.SingleLiveEvent;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.PollOptionVotesViewModel;
import io2.AbstractC20757e0;
import io2.C20755d0;
import iz0.AbstractC21048g;
import j01.AbstractC21125b;
import j01.C21127d;
import j81.AbstractC21422f;
import j81.C21425i;
import java.util.List;
import jb1.C21536b;
import ji0.C21715c;
import ji0.C21716d;
import jk1.AbstractC21757b;
import l83.C23454a0;
import n23.AbstractC26205h;
import p027b3.InterfaceC2355b3;
import p236j.AbstractC21065d;
import p31.AbstractC28799j;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import w20.C36713c0;
import w20.C36721k;
import w20.C36722l;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19223a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73863w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73864x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f73865y;

    public /* synthetic */ C19223a(int i13, Object obj, Object obj2) {
        this.f73863w = i13;
        this.f73865y = obj;
        this.f73864x = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73863w) {
            case 0:
                return QueryChannelsDao_Impl.select$lambda$1("SELECT * FROM stream_channel_query WHERE stream_channel_query.id=?", (String) this.f73865y, (QueryChannelsDao_Impl) this.f73864x, (InterfaceC33687a) obj);
            case 1:
                QueryChannelsDao_Impl.insert$lambda$0((QueryChannelsDao_Impl) this.f73864x, (QueryChannelsEntity) this.f73865y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 2:
                SyncStateDao_Impl.insert$lambda$0((SyncStateDao_Impl) this.f73865y, (SyncStateEntity) this.f73864x, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 3:
                return SyncStateDao_Impl.select$lambda$1("SELECT * FROM stream_sync_state WHERE stream_sync_state.userId = ?", (String) this.f73865y, (SyncStateDao_Impl) this.f73864x, (InterfaceC33687a) obj);
            case 4:
                ThreadDao_Impl.insertThread$lambda$0((ThreadDao_Impl) this.f73865y, (ThreadEntity) this.f73864x, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 5:
                ThreadDao_Impl.insertThreads$lambda$1((ThreadDao_Impl) this.f73865y, (List) this.f73864x, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 6:
                return ThreadDao_Impl.selectThread$lambda$2("SELECT * FROM stream_chat_thread WHERE parentMessageId=?", (String) this.f73865y, (ThreadDao_Impl) this.f73864x, (InterfaceC33687a) obj);
            case 7:
                ThreadOrderDao_Impl.insertThreadOrder$lambda$0((ThreadOrderDao_Impl) this.f73865y, (ThreadOrderEntity) this.f73864x, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 8:
                return ThreadOrderDao_Impl.selectThreadOrder$lambda$1("SELECT * FROM stream_chat_thread_order WHERE id=?", (String) this.f73865y, (ThreadOrderDao_Impl) this.f73864x, (InterfaceC33687a) obj);
            case 9:
                UserDao_Impl.insertMany$lambda$0((UserDao_Impl) this.f73865y, (List) this.f73864x, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 10:
                return UserDao_Impl.select$lambda$3("SELECT * FROM stream_chat_user WHERE stream_chat_user.id IN (?)", (String) this.f73865y, (UserDao_Impl) this.f73864x, (InterfaceC33687a) obj);
            case 11:
                UserDao_Impl.insert$lambda$1((UserDao_Impl) this.f73865y, (UserEntity) this.f73864x, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 12:
                return ChannelStateLogic.updateMembership$lambda$5((Member) this.f73865y, (ChannelStateLogic) this.f73864x, (ChannelData) obj);
            case 13:
                MessageReceiptDao_Impl.upsert$lambda$0((MessageReceiptDao_Impl) this.f73865y, (List) this.f73864x, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 14:
                AttachmentGalleryActivity.setupGalleryOverviewButton$lambda$14$lambda$13$lambda$12((AttachmentGalleryActivity) this.f73865y, (MediaAttachmentDialogFragment) this.f73864x, ((Integer) obj).intValue());
                return C23454a0.f92919a;
            case 15:
                MessageListView.initSwipeToReply$lambda$103$lambda$102$lambda$101$lambda$100((C1715o0) this.f73865y, (MessageListView) this.f73864x, (Message) obj);
                return C23454a0.f92919a;
            case 16:
                PinIndicatorDecorator.setupPinIndicator$lambda$7((MessageListItem.MessageItem) this.f73865y, (TextView) this.f73864x, (C1153p) obj);
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ReactionsDecorator.setupReactionsView$lambda$11$lambda$7((ViewReactionsView) this.f73865y, (View) this.f73864x, (C1153p) obj);
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                MessageDeletedViewHolder.lambda$3$lambda$2$lambda$1((MessageListListeners) this.f73865y, (MessageDeletedViewHolder) this.f73864x, (View) obj);
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                SingleLiveEvent.observe$lambda$0((SingleLiveEvent) this.f73865y, (InterfaceC1633v0) this.f73864x, obj);
                return C23454a0.f92919a;
            case 20:
                ((C1627t0) this.f73865y).m5036c((C1596j) this.f73864x);
                return C23454a0.f92919a;
            case 21:
                MessageListViewModel.onEvent$lambda$13((MessageListViewModel) this.f73865y, (MessageListViewModel.Event) this.f73864x, (AbstractC26205h) obj);
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return PollOptionVotesViewModel._init_$lambda$0((Poll) this.f73865y, (Option) this.f73864x, (AbstractC1637w1) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC20757e0.m57153g((Function1) this.f73865y, (C20755d0) this.f73864x, (AbstractC28799j) obj);
            case 24:
                return AbstractC21048g.m58789B0((Function1) this.f73865y, (InterfaceC2355b3) this.f73864x, (String) obj);
            case 25:
                return AbstractC21125b.m58947m((C21127d) this.f73865y, (Function1) this.f73864x, obj);
            case 26:
                C36713c0 c36713c0 = (C36713c0) this.f73865y;
                C12553k c12553k = (C12553k) this.f73864x;
                C36722l recollectionData = (C36722l) obj;
                AbstractC22676k.m65750j(recollectionData, "recollectionData");
                C16665h1 appearance = c12553k.f42878x.f150989f0;
                boolean zMo124338q0 = c12553k.f42879y.mo124338q0();
                AbstractC22676k.m65750j(appearance, "appearance");
                AbstractC21065d abstractC21065d = c36713c0.f157196a;
                String str = recollectionData.f157210a;
                if (str == null) {
                    str = "";
                }
                abstractC21065d.mo4052a(new C36721k(str, recollectionData.f157211b, appearance, !zMo124338q0), null);
                return C23454a0.f92919a;
            case 27:
                return AbstractC21422f.m60271o((C21425i) this.f73865y, (Function1) this.f73864x, (Modifier) obj);
            case 28:
                return ((C21715c) this.f73865y).m61171i((C21716d) this.f73864x, (InterfaceC33687a) obj);
            default:
                return AbstractC21757b.m61415w((C14553a) this.f73865y, (C21536b) this.f73864x, (C23749z0) obj);
        }
    }

    public /* synthetic */ C19223a(QueryChannelsDao_Impl queryChannelsDao_Impl, QueryChannelsEntity queryChannelsEntity) {
        this.f73863w = 1;
        this.f73864x = queryChannelsDao_Impl;
        this.f73865y = queryChannelsEntity;
    }
}
