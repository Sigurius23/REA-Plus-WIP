package h02;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import b02.C2197a;
import c31.EnumC3919c;
import c93.InterfaceC4351m;
import coil.compose.AsyncImagePainter$State$Error;
import com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment;
import com.whoop.data.remote.domain.response.growth.AffiliateType;
import com.whoop.design.util.TextResource;
import com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment;
import com.whoop.settings.myaccount.MyAccountFragment;
import com.whoop.stealthmode.view.StealthModeFragment;
import eh2.EnumC13196a;
import f60.C14138c;
import fd0.C14398b;
import gd0.AbstractC15711a;
import ge2.InterfaceC15741f;
import gv2.InterfaceC16243a;
import h60.AbstractC16978g;
import h61.C16980a;
import h71.AbstractC16990g;
import hh2.C17295f;
import hh2.C17296g;
import hv2.AbstractC17687i;
import hv2.C17679a;
import hv2.C17689k;
import hy0.AbstractC17770n;
import hy0.AbstractC17795v0;
import hy0.C17754i1;
import hy0.C17772n1;
import hy0.C17782r;
import i20.C17954j1;
import ic2.AbstractC18401f;
import ic2.C18396a;
import ih2.AbstractC18527b;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigInnerEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageInnerEntity;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p002a0.C0022g;
import p114eb.C12987s0;
import p127ev.AbstractC13673n;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p500tb.InterfaceC33687a;
import p510u0.InterfaceC34345p0;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h02.h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16574h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63794w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f63795x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f63796y;

    public /* synthetic */ C16574h(int i13, Object obj, Object obj2) {
        this.f63794w = i13;
        this.f63795x = obj;
        this.f63796y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f63794w) {
            case 0:
                return AbstractC16578j.m47016o((C2197a) this.f63795x, (Function1) this.f63796y, (InterfaceC26064q) obj);
            case 1:
                return ProductDescriptionPageFragment.m23009T((ProductDescriptionPageFragment) this.f63795x, (InterfaceC28670t2) this.f63796y, obj);
            case 2:
                return AbstractC16978g.m47781t((C14138c.c) this.f63795x, (Function1) this.f63796y, (EnumC3919c) obj);
            case 3:
                return AbstractC16990g.m47839r((C16980a) this.f63795x, (InterfaceC28601c1) this.f63796y, (InterfaceC39147y) obj);
            case 4:
                return MyAccountFragment.m25602W0((MyAccountFragment) this.f63795x, (AffiliateType) this.f63796y, (View) obj);
            case 5:
                return p709he2.Function1.m48708V((Function1) this.f63796y, (InterfaceC15741f.b) this.f63795x, ((Boolean) obj).booleanValue());
            case 6:
                return StealthModeFragment.m26098L((C17296g) this.f63795x, (StealthModeFragment) this.f63796y, (C12987s0) obj);
            case 7:
                return AbstractC17687i.m50474Q((C17679a) this.f63795x, (InterfaceC23462h) this.f63796y, (InterfaceC16243a) obj);
            case 8:
                return AbstractC17687i.m50533y0((C17689k.c) this.f63795x, (Function1) this.f63796y, (InterfaceC26064q) obj);
            case 9:
                return AbstractC17770n.m51032y((C17782r) this.f63795x, (InterfaceC28601c1) this.f63796y, (AsyncImagePainter$State$Error) obj);
            case 10:
                return AbstractC17795v0.m51134q((Function1) this.f63796y, (TextResource) this.f63795x, (InterfaceC34345p0) obj);
            case 11:
                return C17754i1.m50926d((C17772n1) this.f63795x, (Function1) this.f63796y, (String) obj);
            case 12:
                return AttachmentDao_Impl.m54697b((String) this.f63795x, (AttachmentDao_Impl) this.f63796y, (InterfaceC33687a) obj);
            case 13:
                C17954j1 c17954j1 = (C17954j1) this.f63795x;
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) this.f63796y;
                ((Boolean) obj).getClass();
                AbstractC13673n.m38550B(!((Boolean) interfaceC28670t2.getValue()).booleanValue(), c17954j1.f69754O, null);
                return C23454a0.f92919a;
            case 14:
                return AbstractC18401f.m52933p((InterfaceC4351m) this.f63795x, (C18396a) this.f63796y, ((Boolean) obj).booleanValue());
            case 15:
                return MultiConsentFragment.m17499N((C14398b) this.f63795x, (InterfaceC23462h) this.f63796y, (AbstractC15711a) obj);
            case 16:
                return AbstractC18527b.m53703D((InterfaceC4351m) this.f63795x, (EnumC13196a) this.f63796y, ((Boolean) obj).booleanValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18527b.m53745z((C17295f) this.f63795x, (InterfaceC4351m) this.f63796y, (InterfaceC26064q) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ChatClient.partialUpdateUser$lambda$118((ChatClient) this.f63795x, (String) this.f63796y, (List) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ChannelDao_Impl.insertMany$lambda$1((ChannelDao_Impl) this.f63795x, (List) this.f63796y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 20:
                return ChannelDao_Impl.select$lambda$9("SELECT * FROM stream_chat_channel_state WHERE stream_chat_channel_state.cid IN (?)", (String) this.f63795x, (ChannelDao_Impl) this.f63796y, (InterfaceC33687a) obj);
            case 21:
                ChannelDao_Impl.insert$lambda$0((ChannelDao_Impl) this.f63795x, (ChannelEntity) this.f63796y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ChannelConfigDao_Impl.m54688xabb2e31d((ChannelConfigDao_Impl) this.f63795x, (InterfaceC33687a) this.f63796y, (C0022g) obj);
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ChannelConfigDao_Impl.insertConfig$lambda$0((ChannelConfigDao_Impl) this.f63795x, (ChannelConfigInnerEntity) this.f63796y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 24:
                MessageDao_Impl.insertDraftMessages$lambda$4((MessageDao_Impl) this.f63795x, (DraftMessageEntity) this.f63796y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 25:
                PollDao_Impl.insertPolls$lambda$0((PollDao_Impl) this.f63795x, (List) this.f63796y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
            case 26:
                return PollDao_Impl.getPoll$lambda$1("SELECT * From stream_chat_poll  WHERE id = ?", (String) this.f63795x, (PollDao_Impl) this.f63796y, (InterfaceC33687a) obj);
            case 27:
                return ReplyMessageDao_Impl.selectById$lambda$3("SELECT * FROM stream_chat_reply_message WHERE id = ?", (String) this.f63795x, (ReplyMessageDao_Impl) this.f63796y, (InterfaceC33687a) obj);
            case 28:
                ReplyMessageDao_Impl.m54740xd0942a01((ReplyMessageDao_Impl) this.f63795x, (InterfaceC33687a) this.f63796y, (C0022g) obj);
                return C23454a0.f92919a;
            default:
                ReplyMessageDao_Impl.delete$lambda$2((ReplyMessageDao_Impl) this.f63795x, (ReplyMessageInnerEntity) this.f63796y, (InterfaceC33687a) obj);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C16574h(Function1 function1, Object obj, int i13) {
        this.f63794w = i13;
        this.f63796y = function1;
        this.f63795x = obj;
    }
}
