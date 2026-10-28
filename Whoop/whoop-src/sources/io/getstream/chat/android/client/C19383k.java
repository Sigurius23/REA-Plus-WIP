package io.getstream.chat.android.client;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.notifications.handler.ChatNotificationHandler;
import io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationFactory;
import io.getstream.chat.android.client.parser2.DirectEventParser;
import io.getstream.chat.android.client.parser2.direct.AttachmentAdapter;
import io.getstream.chat.android.client.parser2.direct.ChannelInfoAdapter;
import io.getstream.chat.android.client.parser2.direct.DeviceAdapter;
import io.getstream.chat.android.client.parser2.direct.MessageModerationDetailsAdapter;
import io.getstream.chat.android.client.parser2.direct.ModerationAdapter;
import io.getstream.chat.android.client.parser2.direct.OptionAdapter;
import io.getstream.chat.android.client.parser2.direct.PrivacySettingsAdapter;
import io.getstream.chat.android.p226ui.common.images.internal.CDNImageInterceptor;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListView;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerView;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal.ViewReactionsView;
import io2.AbstractC20773m0;
import iw0.AbstractC20992x;
import ix2.C21024c;
import iz0.AbstractC21050i;
import java.util.UUID;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.client.k */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19383k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73937w;

    public /* synthetic */ C19383k(int i13) {
        this.f73937w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f73937w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                return -150079702;
            case 1:
                return Long.valueOf(System.currentTimeMillis());
            case 2:
                return Long.valueOf(System.currentTimeMillis());
            case 3:
                return Long.valueOf(System.currentTimeMillis());
            case 4:
                return Long.valueOf(System.currentTimeMillis());
            case 5:
                return Long.valueOf(System.currentTimeMillis());
            case 6:
                return Long.valueOf(System.currentTimeMillis());
            case 7:
                return ChatNotificationHandler._init_$lambda$0();
            case 8:
                return MessagingStyleNotificationFactory._init_$lambda$0();
            case 9:
                return DirectEventParser.moshi_delegate$lambda$0();
            case 10:
                DirectEventParser.Companion companion2 = DirectEventParser.INSTANCE;
                return new DeviceAdapter();
            case 11:
                DirectEventParser.Companion companion3 = DirectEventParser.INSTANCE;
                return new PrivacySettingsAdapter();
            case 12:
                DirectEventParser.Companion companion4 = DirectEventParser.INSTANCE;
                return new AttachmentAdapter();
            case 13:
                DirectEventParser.Companion companion5 = DirectEventParser.INSTANCE;
                return new ChannelInfoAdapter();
            case 14:
                DirectEventParser.Companion companion6 = DirectEventParser.INSTANCE;
                return new MessageModerationDetailsAdapter();
            case 15:
                DirectEventParser.Companion companion7 = DirectEventParser.INSTANCE;
                return new ModerationAdapter();
            case 16:
                DirectEventParser.Companion companion8 = DirectEventParser.INSTANCE;
                return new OptionAdapter();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Long.valueOf(System.currentTimeMillis());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return CDNImageInterceptor._init_$lambda$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                StreamImageLoader.Companion companion9 = StreamImageLoader.INSTANCE;
                return c23454a0;
            case 20:
                return ChatClient.INSTANCE.instance();
            case 21:
                return ChannelListView.defaultChildLayoutParams_delegate$lambda$15();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int i14 = MessageComposerView.f74523w;
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int i15 = ViewReactionsView.f74799w;
                return c23454a0;
            case 24:
                return AbstractC20773m0.m57200B();
            case 25:
                return AbstractC20992x.m58374N0();
            case 26:
                return Long.valueOf(C21024c.m58641Z());
            case 27:
                return C21024c.m58643a0();
            case 28:
                return AbstractC21050i.m58878b();
            default:
                return UUID.randomUUID().toString();
        }
    }
}
