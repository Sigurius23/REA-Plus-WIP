package io.getstream.chat.android.client.parser2;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.parser2.adapters.DateAdapter;
import io.getstream.chat.android.client.parser2.direct.AttachmentAdapter;
import io.getstream.chat.android.client.parser2.direct.ChannelInfoAdapter;
import io.getstream.chat.android.client.parser2.direct.DeviceAdapter;
import io.getstream.chat.android.client.parser2.direct.LocationAdapter;
import io.getstream.chat.android.client.parser2.direct.MessageAdapter;
import io.getstream.chat.android.client.parser2.direct.MessageModerationDetailsAdapter;
import io.getstream.chat.android.client.parser2.direct.MessageReminderInfoAdapter;
import io.getstream.chat.android.client.parser2.direct.ModerationAdapter;
import io.getstream.chat.android.client.parser2.direct.NewMessageEventAdapter;
import io.getstream.chat.android.client.parser2.direct.OptionAdapter;
import io.getstream.chat.android.client.parser2.direct.PollAdapter;
import io.getstream.chat.android.client.parser2.direct.PrivacySettingsAdapter;
import io.getstream.chat.android.client.parser2.direct.ReactionAdapter;
import io.getstream.chat.android.client.parser2.direct.ReactionGroupAdapter;
import io.getstream.chat.android.client.parser2.direct.UserAdapter;
import io.getstream.chat.android.models.MessageTransformer;
import io.getstream.chat.android.models.UserTransformer;
import java.util.Date;
import java.util.Map;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import ne3.C26616h;
import p000.AbstractC11266d;
import p441qx.C30716i0;
import p441qx.C30722l0;
import p441qx.C30742x;
import p441qx.EnumC30741w;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import va3.AbstractC35854l;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u0000 p2\u00020\u0001:\u0001pB-\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R#\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R?\u0010\u001f\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u001b0\u001b \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0016\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0016\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u0016\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u0016\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u0016\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010\u0016\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010\u0016\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010\u0016\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010\u0016\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010\u0016\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010\u0016\u001a\u0004\bh\u0010iR/\u0010o\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u001a0k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010\u0016\u001a\u0004\bm\u0010n¨\u0006q"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/DirectEventParser;", "", "Lkotlin/Function0;", "", "Lio/getstream/chat/android/models/UserId;", "currentUserIdProvider", "Lio/getstream/chat/android/models/MessageTransformer;", "messageTransformer", "Lio/getstream/chat/android/models/UserTransformer;", "userTransformer", "<init>", "(Lc93/a;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/UserTransformer;)V", "raw", "Lio/getstream/chat/android/client/events/ChatEvent;", "parse", "(Ljava/lang/String;)Lio/getstream/chat/android/client/events/ChatEvent;", "Lc93/a;", "Lio/getstream/chat/android/models/MessageTransformer;", "Lio/getstream/chat/android/models/UserTransformer;", "Lqx/l0;", "kotlin.jvm.PlatformType", "moshi$delegate", "Ll83/h;", "getMoshi", "()Lqx/l0;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Date;", "dateAdapter$delegate", "getDateAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "dateAdapter", "Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;", "deviceAdapter$delegate", "getDeviceAdapter", "()Lio/getstream/chat/android/client/parser2/direct/DeviceAdapter;", "deviceAdapter", "Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;", "privacySettingsAdapter$delegate", "getPrivacySettingsAdapter", "()Lio/getstream/chat/android/client/parser2/direct/PrivacySettingsAdapter;", "privacySettingsAdapter", "Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;", "attachmentAdapter$delegate", "getAttachmentAdapter", "()Lio/getstream/chat/android/client/parser2/direct/AttachmentAdapter;", "attachmentAdapter", "Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;", "channelInfoAdapter$delegate", "getChannelInfoAdapter", "()Lio/getstream/chat/android/client/parser2/direct/ChannelInfoAdapter;", "channelInfoAdapter", "Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;", "moderationDetailsAdapter$delegate", "getModerationDetailsAdapter", "()Lio/getstream/chat/android/client/parser2/direct/MessageModerationDetailsAdapter;", "moderationDetailsAdapter", "Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;", "moderationAdapter$delegate", "getModerationAdapter", "()Lio/getstream/chat/android/client/parser2/direct/ModerationAdapter;", "moderationAdapter", "Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;", "optionAdapter$delegate", "getOptionAdapter", "()Lio/getstream/chat/android/client/parser2/direct/OptionAdapter;", "optionAdapter", "Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;", "locationAdapter$delegate", "getLocationAdapter", "()Lio/getstream/chat/android/client/parser2/direct/LocationAdapter;", "locationAdapter", "Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;", "reactionGroupAdapter$delegate", "getReactionGroupAdapter", "()Lio/getstream/chat/android/client/parser2/direct/ReactionGroupAdapter;", "reactionGroupAdapter", "Lio/getstream/chat/android/client/parser2/direct/UserAdapter;", "userAdapter$delegate", "getUserAdapter", "()Lio/getstream/chat/android/client/parser2/direct/UserAdapter;", "userAdapter", "Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;", "reactionAdapter$delegate", "getReactionAdapter", "()Lio/getstream/chat/android/client/parser2/direct/ReactionAdapter;", "reactionAdapter", "Lio/getstream/chat/android/client/parser2/direct/PollAdapter;", "pollAdapter$delegate", "getPollAdapter", "()Lio/getstream/chat/android/client/parser2/direct/PollAdapter;", "pollAdapter", "Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;", "reminderAdapter$delegate", "getReminderAdapter", "()Lio/getstream/chat/android/client/parser2/direct/MessageReminderInfoAdapter;", "reminderAdapter", "Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;", "messageAdapter$delegate", "getMessageAdapter", "()Lio/getstream/chat/android/client/parser2/direct/MessageAdapter;", "messageAdapter", "Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;", "newMessageEventAdapter$delegate", "getNewMessageEventAdapter", "()Lio/getstream/chat/android/client/parser2/direct/NewMessageEventAdapter;", "newMessageEventAdapter", "", "adapterMap$delegate", "getAdapterMap", "()Ljava/util/Map;", "adapterMap", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DirectEventParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final InterfaceC23462h logger$delegate;

    /* JADX INFO: renamed from: adapterMap$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h adapterMap;

    /* JADX INFO: renamed from: attachmentAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h attachmentAdapter;

    /* JADX INFO: renamed from: channelInfoAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h channelInfoAdapter;
    private final InterfaceC4339a currentUserIdProvider;

    /* JADX INFO: renamed from: dateAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h dateAdapter;

    /* JADX INFO: renamed from: deviceAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h deviceAdapter;

    /* JADX INFO: renamed from: locationAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h locationAdapter;

    /* JADX INFO: renamed from: messageAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h messageAdapter;
    private final MessageTransformer messageTransformer;

    /* JADX INFO: renamed from: moderationAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h moderationAdapter;

    /* JADX INFO: renamed from: moderationDetailsAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h moderationDetailsAdapter;

    /* JADX INFO: renamed from: moshi$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h moshi;

    /* JADX INFO: renamed from: newMessageEventAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h newMessageEventAdapter;

    /* JADX INFO: renamed from: optionAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h optionAdapter;

    /* JADX INFO: renamed from: pollAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h pollAdapter;

    /* JADX INFO: renamed from: privacySettingsAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h privacySettingsAdapter;

    /* JADX INFO: renamed from: reactionAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h reactionAdapter;

    /* JADX INFO: renamed from: reactionGroupAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h reactionGroupAdapter;

    /* JADX INFO: renamed from: reminderAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h reminderAdapter;

    /* JADX INFO: renamed from: userAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h userAdapter;
    private final UserTransformer userTransformer;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/DirectEventParser$Companion;", "", "<init>", "()V", "", "raw", "extractType$stream_chat_android_client_release", "(Ljava/lang/String;)Ljava/lang/String;", "extractType", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2345k getLogger() {
            return (C2345k) DirectEventParser.logger$delegate.getValue();
        }

        public final String extractType$stream_chat_android_client_release(String raw) {
            String strNextString;
            AbstractC22676k.m65750j(raw, "raw");
            if (!AbstractC39414r.m125890i0(raw)) {
                C26616h c26616h = new C26616h();
                c26616h.m79232u1(raw);
                C30742x c30742x = new C30742x(c26616h);
                try {
                    try {
                        if (c30742x.mo16731k() != EnumC30741w.f126551y) {
                            c30742x.close();
                            return null;
                        }
                        c30742x.beginObject();
                        while (c30742x.hasNext()) {
                            if (AbstractC22676k.m65745e(c30742x.nextName(), "type")) {
                                if (c30742x.mo16731k() == EnumC30741w.f126546I) {
                                    c30742x.mo16730i();
                                    strNextString = null;
                                } else {
                                    strNextString = c30742x.nextString();
                                }
                                c30742x.close();
                                return strNextString;
                            }
                            c30742x.skipValue();
                        }
                        c30742x.close();
                        return null;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(c30742x, th3);
                            throw th4;
                        }
                    }
                } catch (Exception e5) {
                    C2345k logger = getLogger();
                    InterfaceC2339e interfaceC2339e = logger.f9275c;
                    String str = logger.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("extractType failed; falling back to DTO path: ", e5.getMessage()), null);
                    }
                }
            }
            return null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        logger$delegate = AbstractC1772c1.m5382S(companion, "DirectEventParser");
    }

    public DirectEventParser(InterfaceC4339a currentUserIdProvider, MessageTransformer messageTransformer, UserTransformer userTransformer) {
        AbstractC22676k.m65750j(currentUserIdProvider, "currentUserIdProvider");
        AbstractC22676k.m65750j(messageTransformer, "messageTransformer");
        AbstractC22676k.m65750j(userTransformer, "userTransformer");
        this.currentUserIdProvider = currentUserIdProvider;
        this.messageTransformer = messageTransformer;
        this.userTransformer = userTransformer;
        final int i13 = 9;
        this.moshi = AbstractC30060g.m92088H(new C19383k(i13));
        this.dateAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
        this.deviceAdapter = AbstractC30060g.m92088H(new C19383k(10));
        this.privacySettingsAdapter = AbstractC30060g.m92088H(new C19383k(11));
        this.attachmentAdapter = AbstractC30060g.m92088H(new C19383k(12));
        this.channelInfoAdapter = AbstractC30060g.m92088H(new C19383k(13));
        this.moderationDetailsAdapter = AbstractC30060g.m92088H(new C19383k(14));
        this.moderationAdapter = AbstractC30060g.m92088H(new C19383k(15));
        this.optionAdapter = AbstractC30060g.m92088H(new C19383k(16));
        final int i14 = 0;
        this.locationAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
        final int i15 = 1;
        this.reactionGroupAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
        final int i16 = 2;
        this.userAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
        final int i17 = 3;
        this.reactionAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
        final int i18 = 4;
        this.pollAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
        final int i19 = 5;
        this.reminderAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
        final int i24 = 6;
        this.messageAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
        final int i25 = 7;
        this.newMessageEventAdapter = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
        final int i26 = 8;
        this.adapterMap = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.parser2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DirectEventParser f73945x;

            {
                this.f73945x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return DirectEventParser.locationAdapter_delegate$lambda$9(this.f73945x);
                    case 1:
                        return DirectEventParser.reactionGroupAdapter_delegate$lambda$10(this.f73945x);
                    case 2:
                        return DirectEventParser.userAdapter_delegate$lambda$11(this.f73945x);
                    case 3:
                        return DirectEventParser.reactionAdapter_delegate$lambda$12(this.f73945x);
                    case 4:
                        return DirectEventParser.pollAdapter_delegate$lambda$13(this.f73945x);
                    case 5:
                        return DirectEventParser.reminderAdapter_delegate$lambda$14(this.f73945x);
                    case 6:
                        return DirectEventParser.messageAdapter_delegate$lambda$15(this.f73945x);
                    case 7:
                        return DirectEventParser.newMessageEventAdapter_delegate$lambda$16(this.f73945x);
                    case 8:
                        return DirectEventParser.adapterMap_delegate$lambda$17(this.f73945x);
                    default:
                        return DirectEventParser.m54891a(this.f73945x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static JsonAdapter m54891a(DirectEventParser directEventParser) {
        return directEventParser.getMoshi().m94398a(Date.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map adapterMap_delegate$lambda$17(DirectEventParser directEventParser) {
        return AbstractC25247g0.m73989X(new C23465k("message.new", directEventParser.getNewMessageEventAdapter()));
    }

    private static final AttachmentAdapter attachmentAdapter_delegate$lambda$4() {
        return new AttachmentAdapter();
    }

    private static final ChannelInfoAdapter channelInfoAdapter_delegate$lambda$5() {
        return new ChannelInfoAdapter();
    }

    private static final DeviceAdapter deviceAdapter_delegate$lambda$2() {
        return new DeviceAdapter();
    }

    private final Map<String, JsonAdapter<? extends ChatEvent>> getAdapterMap() {
        return (Map) this.adapterMap.getValue();
    }

    private final AttachmentAdapter getAttachmentAdapter() {
        return (AttachmentAdapter) this.attachmentAdapter.getValue();
    }

    private final ChannelInfoAdapter getChannelInfoAdapter() {
        return (ChannelInfoAdapter) this.channelInfoAdapter.getValue();
    }

    private final JsonAdapter<Date> getDateAdapter() {
        return (JsonAdapter) this.dateAdapter.getValue();
    }

    private final DeviceAdapter getDeviceAdapter() {
        return (DeviceAdapter) this.deviceAdapter.getValue();
    }

    private final LocationAdapter getLocationAdapter() {
        return (LocationAdapter) this.locationAdapter.getValue();
    }

    private final MessageAdapter getMessageAdapter() {
        return (MessageAdapter) this.messageAdapter.getValue();
    }

    private final ModerationAdapter getModerationAdapter() {
        return (ModerationAdapter) this.moderationAdapter.getValue();
    }

    private final MessageModerationDetailsAdapter getModerationDetailsAdapter() {
        return (MessageModerationDetailsAdapter) this.moderationDetailsAdapter.getValue();
    }

    private final C30722l0 getMoshi() {
        return (C30722l0) this.moshi.getValue();
    }

    private final NewMessageEventAdapter getNewMessageEventAdapter() {
        return (NewMessageEventAdapter) this.newMessageEventAdapter.getValue();
    }

    private final OptionAdapter getOptionAdapter() {
        return (OptionAdapter) this.optionAdapter.getValue();
    }

    private final PollAdapter getPollAdapter() {
        return (PollAdapter) this.pollAdapter.getValue();
    }

    private final PrivacySettingsAdapter getPrivacySettingsAdapter() {
        return (PrivacySettingsAdapter) this.privacySettingsAdapter.getValue();
    }

    private final ReactionAdapter getReactionAdapter() {
        return (ReactionAdapter) this.reactionAdapter.getValue();
    }

    private final ReactionGroupAdapter getReactionGroupAdapter() {
        return (ReactionGroupAdapter) this.reactionGroupAdapter.getValue();
    }

    private final MessageReminderInfoAdapter getReminderAdapter() {
        return (MessageReminderInfoAdapter) this.reminderAdapter.getValue();
    }

    private final UserAdapter getUserAdapter() {
        return (UserAdapter) this.userAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationAdapter locationAdapter_delegate$lambda$9(DirectEventParser directEventParser) {
        JsonAdapter<Date> dateAdapter = directEventParser.getDateAdapter();
        AbstractC22676k.m65749i(dateAdapter, "<get-dateAdapter>(...)");
        return new LocationAdapter(dateAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageAdapter messageAdapter_delegate$lambda$15(DirectEventParser directEventParser) {
        AttachmentAdapter attachmentAdapter = directEventParser.getAttachmentAdapter();
        ChannelInfoAdapter channelInfoAdapter = directEventParser.getChannelInfoAdapter();
        ReactionAdapter reactionAdapter = directEventParser.getReactionAdapter();
        ReactionGroupAdapter reactionGroupAdapter = directEventParser.getReactionGroupAdapter();
        UserAdapter userAdapter = directEventParser.getUserAdapter();
        MessageModerationDetailsAdapter moderationDetailsAdapter = directEventParser.getModerationDetailsAdapter();
        ModerationAdapter moderationAdapter = directEventParser.getModerationAdapter();
        PollAdapter pollAdapter = directEventParser.getPollAdapter();
        MessageReminderInfoAdapter reminderAdapter = directEventParser.getReminderAdapter();
        LocationAdapter locationAdapter = directEventParser.getLocationAdapter();
        JsonAdapter<Date> dateAdapter = directEventParser.getDateAdapter();
        AbstractC22676k.m65749i(dateAdapter, "<get-dateAdapter>(...)");
        return new MessageAdapter(attachmentAdapter, channelInfoAdapter, reactionAdapter, reactionGroupAdapter, userAdapter, moderationDetailsAdapter, moderationAdapter, pollAdapter, reminderAdapter, locationAdapter, dateAdapter, directEventParser.messageTransformer);
    }

    private static final ModerationAdapter moderationAdapter_delegate$lambda$7() {
        return new ModerationAdapter();
    }

    private static final MessageModerationDetailsAdapter moderationDetailsAdapter_delegate$lambda$6() {
        return new MessageModerationDetailsAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C30722l0 moshi_delegate$lambda$0() {
        C30716i0 c30716i0 = new C30716i0();
        c30716i0.m94392b(Date.class, new DateAdapter());
        return new C30722l0(c30716i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewMessageEventAdapter newMessageEventAdapter_delegate$lambda$16(DirectEventParser directEventParser) {
        return new NewMessageEventAdapter(directEventParser.getMessageAdapter(), directEventParser.getUserAdapter());
    }

    private static final OptionAdapter optionAdapter_delegate$lambda$8() {
        return new OptionAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PollAdapter pollAdapter_delegate$lambda$13(DirectEventParser directEventParser) {
        UserAdapter userAdapter = directEventParser.getUserAdapter();
        OptionAdapter optionAdapter = directEventParser.getOptionAdapter();
        JsonAdapter<Date> dateAdapter = directEventParser.getDateAdapter();
        AbstractC22676k.m65749i(dateAdapter, "<get-dateAdapter>(...)");
        return new PollAdapter(userAdapter, optionAdapter, dateAdapter, directEventParser.currentUserIdProvider);
    }

    private static final PrivacySettingsAdapter privacySettingsAdapter_delegate$lambda$3() {
        return new PrivacySettingsAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionAdapter reactionAdapter_delegate$lambda$12(DirectEventParser directEventParser) {
        UserAdapter userAdapter = directEventParser.getUserAdapter();
        JsonAdapter<Date> dateAdapter = directEventParser.getDateAdapter();
        AbstractC22676k.m65749i(dateAdapter, "<get-dateAdapter>(...)");
        return new ReactionAdapter(userAdapter, dateAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionGroupAdapter reactionGroupAdapter_delegate$lambda$10(DirectEventParser directEventParser) {
        JsonAdapter<Date> dateAdapter = directEventParser.getDateAdapter();
        AbstractC22676k.m65749i(dateAdapter, "<get-dateAdapter>(...)");
        return new ReactionGroupAdapter(dateAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageReminderInfoAdapter reminderAdapter_delegate$lambda$14(DirectEventParser directEventParser) {
        JsonAdapter<Date> dateAdapter = directEventParser.getDateAdapter();
        AbstractC22676k.m65749i(dateAdapter, "<get-dateAdapter>(...)");
        return new MessageReminderInfoAdapter(dateAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserAdapter userAdapter_delegate$lambda$11(DirectEventParser directEventParser) {
        DeviceAdapter deviceAdapter = directEventParser.getDeviceAdapter();
        PrivacySettingsAdapter privacySettingsAdapter = directEventParser.getPrivacySettingsAdapter();
        JsonAdapter<Date> dateAdapter = directEventParser.getDateAdapter();
        AbstractC22676k.m65749i(dateAdapter, "<get-dateAdapter>(...)");
        return new UserAdapter(deviceAdapter, privacySettingsAdapter, dateAdapter, directEventParser.userTransformer);
    }

    public final ChatEvent parse(String raw) {
        JsonAdapter<? extends ChatEvent> jsonAdapter;
        ChatEvent chatEventM107888l;
        AbstractC22676k.m65750j(raw, "raw");
        String strExtractType$stream_chat_android_client_release = INSTANCE.extractType$stream_chat_android_client_release(raw);
        if (strExtractType$stream_chat_android_client_release == null || (jsonAdapter = getAdapterMap().get(strExtractType$stream_chat_android_client_release)) == null) {
            return null;
        }
        try {
            chatEventM107888l = jsonAdapter.fromJson(raw);
        } catch (Throwable th3) {
            chatEventM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(chatEventM107888l);
        if (thM68037a != null) {
            C2345k logger = INSTANCE.getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC31061c.m95640p("Direct parse failed for '", strExtractType$stream_chat_android_client_release, "'; falling back to DTO path: ", thM68037a.getMessage()), null);
            }
        }
        return (ChatEvent) (chatEventM107888l instanceof C23467m ? null : chatEventM107888l);
    }
}
