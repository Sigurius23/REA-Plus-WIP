package ig0;

import android.content.Context;
import android.widget.CalendarView;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import bm.C3396t;
import c41.C4140w1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.integrations.view.IntegrationsFragment;
import com.whoop.navigation.C9598e;
import fg0.C14452a;
import fg0.C14454c;
import fh1.C14488a;
import fh1.C14490c;
import fm1.C14597a;
import fm1.C14599c;
import fm1.C14600d;
import gg0.InterfaceC15822a;
import gh1.InterfaceC15852b;
import gr1.C16095b;
import ih1.AbstractC18525i;
import ii2.AbstractC18572a;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao_Impl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import io.getstream.chat.android.p226ui.common.state.messages.list.GiphyAction;
import io2.AbstractC20773m0;
import io2.AbstractC20782s;
import io2.C20777o0;
import is0.AbstractC20889j0;
import iw0.AbstractC20992x;
import iw0.C20965e;
import iw0.C20967f;
import j22.AbstractC21256e;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import ji2.C21733l;
import jp1.AbstractC21854f;
import jr1.AbstractC21896d;
import js2.AbstractC21931i;
import k22.C22164d;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n23.AbstractC26202e;
import p114eb.C12987s0;
import p294l3.C23254g;
import p390p1.C28624i0;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p500tb.InterfaceC33687a;
import p636y3.C39180l;
import p710im1.AbstractC18657a1;
import p710im1.AbstractC18661c;
import p710im1.C18665d0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import p720m91.C25314w;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ig0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18468h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71905w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f71906x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f71907y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f71908z;

    public /* synthetic */ C18468h(Object obj, Object obj2, Object obj3, int i13) {
        this.f71905w = i13;
        this.f71907y = obj;
        this.f71908z = obj2;
        this.f71906x = obj3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f71905w) {
            case 0:
                return AbstractC18469i.m53268i((C14452a) this.f71907y, (C14454c) this.f71908z, (InterfaceC23462h) this.f71906x, (InterfaceC15822a) obj);
            case 1:
                return AbstractC18525i.m53694i((C14488a) this.f71907y, (C14490c) this.f71908z, (InterfaceC23462h) this.f71906x, (InterfaceC15852b) obj);
            case 2:
                return AbstractC18572a.m53792f((C21733l) this.f71907y, (Function1) this.f71908z, (InterfaceC4339a) this.f71906x, (C12987s0) obj);
            case 3:
                return AbstractC18661c.m54141n((C18665d0) this.f71907y, (InterfaceC25312u) this.f71908z, (C14600d) this.f71906x, obj);
            case 4:
                return AbstractC18657a1.m54106t((C18665d0) this.f71907y, (C14597a) this.f71908z, (C14599c) this.f71906x, obj);
            case 5:
                return AbstractC18657a1.m54112z((InterfaceC2994c0) this.f71907y, (C3396t) this.f71908z, (List) this.f71906x, ((Integer) obj).intValue());
            case 6:
                return ChatClient.sendPoll$lambda$68((ChatClient) this.f71907y, (String) this.f71908z, (String) this.f71906x, (Poll) obj);
            case 7:
                return ChannelDao_Impl.m54676b((String) this.f71907y, (List) this.f71908z, (ChannelDao_Impl) this.f71906x, (InterfaceC33687a) obj);
            case 8:
                ChannelDao_Impl.setDeletedAt$lambda$11("UPDATE stream_chat_channel_state SET deletedAt = ? WHERE cid = ?", (ChannelDao_Impl) this.f71907y, (Date) this.f71908z, (String) this.f71906x, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 9:
                return MessageDao_Impl.m54704G((String) this.f71907y, (List) this.f71908z, (MessageDao_Impl) this.f71906x, (InterfaceC33687a) obj);
            case 10:
                return MessageDao_Impl.m54712c((String) this.f71907y, (String) this.f71908z, (MessageDao_Impl) this.f71906x, (InterfaceC33687a) obj);
            case 11:
                MessageDao_Impl.deleteChannelMessagesBefore$lambda$26("DELETE from stream_chat_message WHERE cid = ? AND createdAt < ?", (String) this.f71907y, (MessageDao_Impl) this.f71908z, (Date) this.f71906x, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 12:
                return ReactionDao_Impl.m54758i((String) this.f71907y, (String) this.f71908z, (ReactionDao_Impl) this.f71906x, (InterfaceC33687a) obj);
            case 13:
                return ReactionDao_Impl.m54755f((String) this.f71907y, (List) this.f71908z, (ReactionDao_Impl) this.f71906x, (InterfaceC33687a) obj);
            case 14:
                return ThreadDao_Impl.m54763a((String) this.f71907y, (Collection) this.f71908z, (ThreadDao_Impl) this.f71906x, (InterfaceC33687a) obj);
            case 15:
                return UserDao_Impl.m54772a((String) this.f71907y, (List) this.f71908z, (UserDao_Impl) this.f71906x, (InterfaceC33687a) obj);
            case 16:
                return ChannelStateImpl.updateMessageFromEvent$lambda$52((ChannelStateImpl) this.f71907y, (Message) this.f71908z, (InterfaceC4351m) this.f71906x, (Message) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                MessageListController.performGiphyAction$lambda$147((MessageListController) this.f71907y, (GiphyAction) this.f71908z, (Message) this.f71906x, (AbstractC26202e) obj);
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC20782s.m57286v((C23254g) this.f71907y, (Function1) this.f71908z, (C9598e) this.f71906x, ((Integer) obj).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC20773m0.m57201C((C20777o0) this.f71907y, (Function1) this.f71908z, (InterfaceC28601c1) this.f71906x, (String) obj);
            case 20:
                return AbstractC20889j0.m57764d0((C25314w) this.f71907y, (InterfaceC28670t2) this.f71908z, (InterfaceC28593a1) this.f71906x, (C39180l) obj);
            case 21:
                return AbstractC20992x.m58463v0((C20967f) this.f71907y, (Function1) this.f71908z, (InterfaceC28601c1) this.f71906x, ((Integer) obj).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC20992x.m58341C0((C4140w1) this.f71907y, (Function1) this.f71908z, (Function1) this.f71906x, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC20992x.m58448q0((C20965e) this.f71907y, (Function1) this.f71908z, (InterfaceC28601c1) this.f71906x, ((Integer) obj).intValue());
            case 24:
                return AbstractC21256e.m59603F((Function1) this.f71907y, (Function1) this.f71908z, (C22164d) this.f71906x, (C12987s0) obj);
            case 25:
                return AbstractC21854f.m61853n((Calendar) this.f71907y, (C22669g0) this.f71908z, (SimpleDateFormat) this.f71906x, (CalendarView) obj);
            case 26:
                return AbstractC21896d.m62180H((C16095b) this.f71907y, (Function1) this.f71908z, (InterfaceC28601c1) this.f71906x, obj);
            case 27:
                return IntegrationsFragment.m22262V((InterfaceC1585g0) this.f71907y, (IntegrationsFragment) this.f71908z, (InterfaceC28670t2) this.f71906x, (C28624i0) obj);
            case 28:
                return AbstractC21931i.m62480t((InterfaceC1585g0) this.f71907y, (InterfaceC28601c1) this.f71908z, (InterfaceC28601c1) this.f71906x, (C28624i0) obj);
            default:
                return AbstractC21931i.m62482v((InterfaceC1585g0) this.f71907y, (Context) this.f71908z, (InterfaceC23462h) this.f71906x, (C28624i0) obj);
        }
    }
}
