package io.getstream.chat.android.client.receipts;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import com.mapbox.common.logger.LogPriority;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.ChannelKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0017\u0010\u0014J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\"*\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$J\u001e\u0010'\u001a\u00020&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0086@¢\u0006\u0004\b'\u0010\u001cJ\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b(\u0010)J\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b(\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u00104¨\u00066"}, m65681d2 = {"Lio/getstream/chat/android/client/receipts/MessageReceiptManager;", "", "Lkotlin/Function0;", "Ljava/util/Date;", "now", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "getRepositoryFacade", "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;", "messageReceiptRepository", "Lio/getstream/chat/android/client/api/ChatApi;", "api", "<init>", "(Lc93/a;Lc93/a;Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;Lio/getstream/chat/android/client/api/ChatApi;)V", "Lio/getstream/chat/android/models/User;", "retrieveCurrentUser", "(Lq83/d;)Ljava/lang/Object;", "", "cid", "Lio/getstream/chat/android/models/Channel;", "retrieveChannel", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "id", "Lio/getstream/chat/android/models/Message;", "retrieveMessage", "", "messages", "", "markMessagesAsDelivered", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "currentUser", "channel", "message", "canMarkMessageAsDelivered", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Z", "Lio/getstream/chat/android/client/receipts/MessageReceipt;", "toDeliveryReceipt", "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/receipts/MessageReceipt;", "channels", "Ll83/a0;", "markChannelsAsDelivered", "markMessageAsDelivered", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "messageId", "Lc93/a;", "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;", "Lio/getstream/chat/android/client/api/ChatApi;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repositoryFacade", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReceiptManager {
    private final ChatApi api;
    private final InterfaceC4339a getRepositoryFacade;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final MessageReceiptRepository messageReceiptRepository;
    private final InterfaceC4339a now;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.receipts.MessageReceiptManager$markChannelsAsDelivered$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.receipts.MessageReceiptManager", m100430f = "MessageReceiptManager.kt", m100431l = {70, 82}, m100432m = "markChannelsAsDelivered")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194211 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C194211(InterfaceC30057d<? super C194211> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageReceiptManager.this.markChannelsAsDelivered(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.receipts.MessageReceiptManager$markMessageAsDelivered$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.receipts.MessageReceiptManager", m100430f = "MessageReceiptManager.kt", m100431l = {92, LogPriority.NONE, 105}, m100432m = "markMessageAsDelivered")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194221 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C194221(InterfaceC30057d<? super C194221> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageReceiptManager.this.markMessageAsDelivered((Message) null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.receipts.MessageReceiptManager$markMessageAsDelivered$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.receipts.MessageReceiptManager", m100430f = "MessageReceiptManager.kt", m100431l = {117, 122}, m100432m = "markMessageAsDelivered")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194232 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C194232(InterfaceC30057d<? super C194232> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageReceiptManager.this.markMessageAsDelivered((String) null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.receipts.MessageReceiptManager$markMessagesAsDelivered$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.receipts.MessageReceiptManager", m100430f = "MessageReceiptManager.kt", m100431l = {151}, m100432m = "markMessagesAsDelivered")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194241 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C194241(InterfaceC30057d<? super C194241> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageReceiptManager.this.markMessagesAsDelivered(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.receipts.MessageReceiptManager$retrieveChannel$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.receipts.MessageReceiptManager", m100430f = "MessageReceiptManager.kt", m100431l = {129, 133}, m100432m = "retrieveChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194251 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C194251(InterfaceC30057d<? super C194251> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageReceiptManager.this.retrieveChannel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.receipts.MessageReceiptManager$retrieveMessage$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.receipts.MessageReceiptManager", m100430f = "MessageReceiptManager.kt", m100431l = {137, 139}, m100432m = "retrieveMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194261 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C194261(InterfaceC30057d<? super C194261> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageReceiptManager.this.retrieveMessage(null, this);
        }
    }

    public MessageReceiptManager(InterfaceC4339a now, InterfaceC4339a getRepositoryFacade, MessageReceiptRepository messageReceiptRepository, ChatApi api) {
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(getRepositoryFacade, "getRepositoryFacade");
        AbstractC22676k.m65750j(messageReceiptRepository, "messageReceiptRepository");
        AbstractC22676k.m65750j(api, "api");
        this.now = now;
        this.getRepositoryFacade = getRepositoryFacade;
        this.messageReceiptRepository = messageReceiptRepository;
        this.api = api;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MessageReceiptManager");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0155  */
    /* JADX WARN: Code duplicated, block: B:48:0x015f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0173  */
    /* JADX WARN: Code duplicated, block: B:52:0x018f  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01db  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:67:0x0205 A[RETURN] */
    private final boolean canMarkMessageAsDelivered(User currentUser, Channel channel, Message message) {
        ChannelUserRead channelUserReadUserRead;
        Date createdAtOrDefault;
        Date lastDeliveredAt;
        C2345k logger;
        InterfaceC2339e interfaceC2339eM7232c;
        EnumC2341g enumC2341g;
        C2345k logger2;
        InterfaceC2339e interfaceC2339eM7232c2;
        EnumC2341g enumC2341g2;
        C2345k logger3;
        InterfaceC2339e interfaceC2339eM7232c3;
        EnumC2341g enumC2341g3;
        if (!channel.getConfig().getDeliveryEventsEnabled()) {
            C2345k logger4 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c4 = logger4.m7232c();
            EnumC2341g enumC2341g4 = EnumC2341g.WARN;
            if (interfaceC2339eM7232c4.isLoggable(enumC2341g4, logger4.m7231b())) {
                logger4.m7230a().log(enumC2341g4, logger4.m7231b(), "[canMarkMessageAsDelivered] Delivery events disabled for channel " + channel.getCid(), null);
                return false;
            }
        } else if (AbstractC22676k.m65745e(message.getUser().getId(), currentUser.getId())) {
            C2345k logger5 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c5 = logger5.m7232c();
            EnumC2341g enumC2341g5 = EnumC2341g.WARN;
            if (interfaceC2339eM7232c5.isLoggable(enumC2341g5, logger5.m7231b())) {
                logger5.m7230a().log(enumC2341g5, logger5.m7231b(), AbstractC31061c.m95640p("[canMarkMessageAsDelivered] Message ", message.getId(), " was sent by the current user ", currentUser.getId()), null);
                return false;
            }
        } else if (message.getShadowed()) {
            C2345k logger6 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c6 = logger6.m7232c();
            EnumC2341g enumC2341g6 = EnumC2341g.WARN;
            if (interfaceC2339eM7232c6.isLoggable(enumC2341g6, logger6.m7231b())) {
                logger6.m7230a().log(enumC2341g6, logger6.m7231b(), AbstractC11895b.m31996o("[canMarkMessageAsDelivered] Message ", message.getId(), " is shadowed"), null);
                return false;
            }
        } else {
            List<Mute> mutes = currentUser.getMutes();
            if (!(mutes instanceof Collection) || !mutes.isEmpty()) {
                Iterator<T> it = mutes.iterator();
                while (it.hasNext()) {
                    User target = ((Mute) it.next()).getTarget();
                    if (AbstractC22676k.m65745e(target != null ? target.getId() : null, message.getUser().getId())) {
                        C2345k logger7 = getLogger();
                        InterfaceC2339e interfaceC2339eM7232c7 = logger7.m7232c();
                        EnumC2341g enumC2341g7 = EnumC2341g.WARN;
                        if (interfaceC2339eM7232c7.isLoggable(enumC2341g7, logger7.m7231b())) {
                            logger7.m7230a().log(enumC2341g7, logger7.m7231b(), AbstractC31061c.m95640p("[canMarkMessageAsDelivered] Message ", message.getId(), " was sent by a muted user ", message.getUser().getId()), null);
                            return false;
                        }
                    }
                }
                if (message.getParentId() != null || message.getShowInChannel()) {
                    channelUserReadUserRead = ChannelExtensionKt.userRead(channel, currentUser.getId());
                    if (channelUserReadUserRead == null) {
                        logger3 = getLogger();
                        interfaceC2339eM7232c3 = logger3.m7232c();
                        enumC2341g3 = EnumC2341g.WARN;
                        if (interfaceC2339eM7232c3.isLoggable(enumC2341g3, logger3.m7231b())) {
                            logger3.m7230a().log(enumC2341g3, logger3.m7231b(), AbstractC31061c.m95640p("[canMarkMessageAsDelivered] No read state for user ", currentUser.getId(), " in channel ", channel.getCid()), null);
                            return false;
                        }
                    } else {
                        createdAtOrDefault = MessageExtensionsKt.getCreatedAtOrDefault(message, MessageKt.getNEVER());
                        if (createdAtOrDefault.compareTo(channelUserReadUserRead.getLastRead()) <= 0) {
                            logger2 = getLogger();
                            interfaceC2339eM7232c2 = logger2.m7232c();
                            enumC2341g2 = EnumC2341g.WARN;
                            if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                                logger2.m7230a().log(enumC2341g2, logger2.m7231b(), AbstractC11895b.m31996o("[canMarkMessageAsDelivered] Message ", message.getId(), " is already marked as read"), null);
                                return false;
                            }
                        } else {
                            lastDeliveredAt = channelUserReadUserRead.getLastDeliveredAt();
                            if (lastDeliveredAt == null) {
                                lastDeliveredAt = MessageKt.getNEVER();
                            }
                            if (createdAtOrDefault.compareTo(lastDeliveredAt) > 0) {
                                return true;
                            }
                            logger = getLogger();
                            interfaceC2339eM7232c = logger.m7232c();
                            enumC2341g = EnumC2341g.WARN;
                            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                                logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[canMarkMessageAsDelivered] Message ", message.getId(), " is already marked as delivered"), null);
                            }
                        }
                    }
                } else {
                    C2345k logger8 = getLogger();
                    InterfaceC2339e interfaceC2339eM7232c8 = logger8.m7232c();
                    EnumC2341g enumC2341g8 = EnumC2341g.WARN;
                    if (interfaceC2339eM7232c8.isLoggable(enumC2341g8, logger8.m7231b())) {
                        logger8.m7230a().log(enumC2341g8, logger8.m7231b(), AbstractC11895b.m31996o("[canMarkMessageAsDelivered] Message ", message.getId(), " is a reply and not shown in channel"), null);
                        return false;
                    }
                }
            } else if (message.getParentId() != null) {
                channelUserReadUserRead = ChannelExtensionKt.userRead(channel, currentUser.getId());
                if (channelUserReadUserRead == null) {
                    logger3 = getLogger();
                    interfaceC2339eM7232c3 = logger3.m7232c();
                    enumC2341g3 = EnumC2341g.WARN;
                    if (interfaceC2339eM7232c3.isLoggable(enumC2341g3, logger3.m7231b())) {
                        logger3.m7230a().log(enumC2341g3, logger3.m7231b(), AbstractC31061c.m95640p("[canMarkMessageAsDelivered] No read state for user ", currentUser.getId(), " in channel ", channel.getCid()), null);
                        return false;
                    }
                } else {
                    createdAtOrDefault = MessageExtensionsKt.getCreatedAtOrDefault(message, MessageKt.getNEVER());
                    if (createdAtOrDefault.compareTo(channelUserReadUserRead.getLastRead()) <= 0) {
                        logger2 = getLogger();
                        interfaceC2339eM7232c2 = logger2.m7232c();
                        enumC2341g2 = EnumC2341g.WARN;
                        if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                            logger2.m7230a().log(enumC2341g2, logger2.m7231b(), AbstractC11895b.m31996o("[canMarkMessageAsDelivered] Message ", message.getId(), " is already marked as read"), null);
                            return false;
                        }
                    } else {
                        lastDeliveredAt = channelUserReadUserRead.getLastDeliveredAt();
                        if (lastDeliveredAt == null) {
                            lastDeliveredAt = MessageKt.getNEVER();
                        }
                        if (createdAtOrDefault.compareTo(lastDeliveredAt) > 0) {
                            return true;
                        }
                        logger = getLogger();
                        interfaceC2339eM7232c = logger.m7232c();
                        enumC2341g = EnumC2341g.WARN;
                        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[canMarkMessageAsDelivered] Message ", message.getId(), " is already marked as delivered"), null);
                        }
                    }
                }
            } else {
                channelUserReadUserRead = ChannelExtensionKt.userRead(channel, currentUser.getId());
                if (channelUserReadUserRead == null) {
                    logger3 = getLogger();
                    interfaceC2339eM7232c3 = logger3.m7232c();
                    enumC2341g3 = EnumC2341g.WARN;
                    if (interfaceC2339eM7232c3.isLoggable(enumC2341g3, logger3.m7231b())) {
                        logger3.m7230a().log(enumC2341g3, logger3.m7231b(), AbstractC31061c.m95640p("[canMarkMessageAsDelivered] No read state for user ", currentUser.getId(), " in channel ", channel.getCid()), null);
                        return false;
                    }
                } else {
                    createdAtOrDefault = MessageExtensionsKt.getCreatedAtOrDefault(message, MessageKt.getNEVER());
                    if (createdAtOrDefault.compareTo(channelUserReadUserRead.getLastRead()) <= 0) {
                        logger2 = getLogger();
                        interfaceC2339eM7232c2 = logger2.m7232c();
                        enumC2341g2 = EnumC2341g.WARN;
                        if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                            logger2.m7230a().log(enumC2341g2, logger2.m7231b(), AbstractC11895b.m31996o("[canMarkMessageAsDelivered] Message ", message.getId(), " is already marked as read"), null);
                            return false;
                        }
                    } else {
                        lastDeliveredAt = channelUserReadUserRead.getLastDeliveredAt();
                        if (lastDeliveredAt == null) {
                            lastDeliveredAt = MessageKt.getNEVER();
                        }
                        if (createdAtOrDefault.compareTo(lastDeliveredAt) > 0) {
                            return true;
                        }
                        logger = getLogger();
                        interfaceC2339eM7232c = logger.m7232c();
                        enumC2341g = EnumC2341g.WARN;
                        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[canMarkMessageAsDelivered] Message ", message.getId(), " is already marked as delivered"), null);
                        }
                    }
                }
            }
        }
        return false;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final RepositoryFacade getRepositoryFacade() {
        return (RepositoryFacade) this.getRepositoryFacade.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object markMessagesAsDelivered(List<Message> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C194241 c194241;
        if (interfaceC30057d instanceof C194241) {
            c194241 = (C194241) interfaceC30057d;
            int i13 = c194241.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194241.label = i13 - Integer.MIN_VALUE;
            } else {
                c194241 = new C194241(interfaceC30057d);
            }
        } else {
            c194241 = new C194241(interfaceC30057d);
        }
        Object obj = c194241.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c194241.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (list.isEmpty()) {
                C2345k logger = getLogger();
                InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
                EnumC2341g enumC2341g = EnumC2341g.WARN;
                if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                    logger.m7230a().log(enumC2341g, logger.m7231b(), "[markMessagesAsDelivered] No receipts to send", null);
                }
                return Boolean.FALSE;
            }
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                logger2.m7230a().log(enumC2341g2, logger2.m7231b(), AbstractC2875y.m8296i(list.size(), "[markMessagesAsDelivered] Processing delivery receipts for ", " messages…"), null);
            }
            List<Message> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(toDeliveryReceipt((Message) it.next()));
            }
            MessageReceiptRepository messageReceiptRepository = this.messageReceiptRepository;
            c194241.L$0 = list;
            c194241.L$1 = null;
            c194241.label = 1;
            if (messageReceiptRepository.upsertMessageReceipts(arrayList, c194241) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c194241.L$0;
            AbstractC34132o.m107864I(obj);
        }
        C2345k logger3 = getLogger();
        InterfaceC2339e interfaceC2339eM7232c3 = logger3.m7232c();
        EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c3.isLoggable(enumC2341g3, logger3.m7231b())) {
            logger3.m7230a().log(enumC2341g3, logger3.m7231b(), AbstractC2875y.m8296i(list.size(), "[markMessagesAsDelivered] ", " delivery receipts upserted"), null);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retrieveChannel(java.lang.String r6, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Channel> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.getstream.chat.android.client.receipts.MessageReceiptManager.C194251
            if (r0 == 0) goto L13
            r0 = r7
            io.getstream.chat.android.client.receipts.MessageReceiptManager$retrieveChannel$1 r0 = (io.getstream.chat.android.client.receipts.MessageReceiptManager.C194251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.receipts.MessageReceiptManager$retrieveChannel$1 r0 = new io.getstream.chat.android.client.receipts.MessageReceiptManager$retrieveChannel$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r6 = r0.L$4
            io.getstream.chat.android.client.api.models.QueryChannelRequest r6 = (io.getstream.chat.android.client.api.models.QueryChannelRequest) r6
            java.lang.Object r6 = r0.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$1
            io.getstream.chat.android.client.receipts.MessageReceiptManager r6 = (io.getstream.chat.android.client.receipts.MessageReceiptManager) r6
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L92
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L60
        L4e:
            p505ts.AbstractC34132o.m107864I(r7)
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade r7 = r5.getRepositoryFacade()
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.selectChannel(r6, r0)
            if (r7 != r1) goto L60
            goto L91
        L60:
            io.getstream.chat.android.models.Channel r7 = (io.getstream.chat.android.models.Channel) r7
            if (r7 != 0) goto L9b
            l83.k r6 = io.getstream.chat.android.client.extensions.StringExtensionsKt.cidToTypeAndId(r6)
            java.lang.Object r7 = r6.f92937w
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.f92938x
            java.lang.String r6 = (java.lang.String) r6
            io.getstream.chat.android.client.api.models.QueryChannelRequest r2 = new io.getstream.chat.android.client.api.models.QueryChannelRequest
            r2.<init>()
            io.getstream.chat.android.client.api.ChatApi r4 = r5.api
            o23.d r6 = r4.queryChannel(r7, r6, r2)
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.L$4 = r7
            r7 = 0
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L92
        L91:
            return r1
        L92:
            n23.h r7 = (n23.AbstractC26205h) r7
            java.lang.Object r6 = r7.m77816b()
            io.getstream.chat.android.models.Channel r6 = (io.getstream.chat.android.models.Channel) r6
            return r6
        L9b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.receipts.MessageReceiptManager.retrieveChannel(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retrieveCurrentUser(InterfaceC30057d<? super User> interfaceC30057d) {
        return getRepositoryFacade().selectUser("me", interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retrieveMessage(java.lang.String r6, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Message> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.getstream.chat.android.client.receipts.MessageReceiptManager.C194261
            if (r0 == 0) goto L13
            r0 = r7
            io.getstream.chat.android.client.receipts.MessageReceiptManager$retrieveMessage$1 r0 = (io.getstream.chat.android.client.receipts.MessageReceiptManager.C194261) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.receipts.MessageReceiptManager$retrieveMessage$1 r0 = new io.getstream.chat.android.client.receipts.MessageReceiptManager$retrieveMessage$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$1
            io.getstream.chat.android.client.receipts.MessageReceiptManager r6 = (io.getstream.chat.android.client.receipts.MessageReceiptManager) r6
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L6f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L54
        L42:
            p505ts.AbstractC34132o.m107864I(r7)
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade r7 = r5.getRepositoryFacade()
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.selectMessage(r6, r0)
            if (r7 != r1) goto L54
            goto L6e
        L54:
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            if (r7 != 0) goto L78
            io.getstream.chat.android.client.api.ChatApi r7 = r5.api
            o23.d r6 = r7.getMessage(r6)
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r7 = 0
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            n23.h r7 = (n23.AbstractC26205h) r7
            java.lang.Object r6 = r7.m77816b()
            io.getstream.chat.android.models.Message r6 = (io.getstream.chat.android.models.Message) r6
            return r6
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.receipts.MessageReceiptManager.retrieveMessage(java.lang.String, q83.d):java.lang.Object");
    }

    private final MessageReceipt toDeliveryReceipt(Message message) {
        return new MessageReceipt(message.getId(), message.getCid(), (Date) this.now.invoke());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object markChannelsAsDelivered(List<Channel> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C194211 c194211;
        if (interfaceC30057d instanceof C194211) {
            c194211 = (C194211) interfaceC30057d;
            int i13 = c194211.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194211.label = i13 - Integer.MIN_VALUE;
            } else {
                c194211 = new C194211(interfaceC30057d);
            }
        } else {
            c194211 = new C194211(interfaceC30057d);
        }
        Object objRetrieveCurrentUser = c194211.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c194211.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objRetrieveCurrentUser);
            c194211.L$0 = list;
            c194211.label = 1;
            objRetrieveCurrentUser = retrieveCurrentUser(c194211);
            if (objRetrieveCurrentUser != obj) {
            }
            return obj;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objRetrieveCurrentUser);
            return c23454a0;
        }
        list = (List) c194211.L$0;
        AbstractC34132o.m107864I(objRetrieveCurrentUser);
        User user = (User) objRetrieveCurrentUser;
        if (user == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), "[markChannelsAsDelivered] Current user not found", null);
                return c23454a0;
            }
        } else if (user.isDeliveryReceiptsEnabled()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                Message message = null;
                if (!it.hasNext()) {
                    break;
                }
                Channel channel = (Channel) it.next();
                Message lastMessage = ChannelKt.getLastMessage(channel);
                if (lastMessage != null && canMarkMessageAsDelivered(user, channel, lastMessage)) {
                    message = lastMessage;
                }
                if (message != null) {
                    arrayList.add(message);
                }
            }
            c194211.L$0 = null;
            c194211.L$1 = null;
            c194211.L$2 = null;
            c194211.label = 2;
            if (markMessagesAsDelivered(arrayList, c194211) == obj) {
                return obj;
            }
        }
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object markMessageAsDelivered(Message message, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C194221 c194221;
        Message message2;
        User user;
        Channel channel;
        Object objMarkMessagesAsDelivered;
        C2345k logger;
        InterfaceC2339e interfaceC2339eM7232c;
        EnumC2341g enumC2341g;
        if (interfaceC30057d instanceof C194221) {
            c194221 = (C194221) interfaceC30057d;
            int i13 = c194221.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194221.label = i13 - Integer.MIN_VALUE;
            } else {
                c194221 = new C194221(interfaceC30057d);
            }
        } else {
            c194221 = new C194221(interfaceC30057d);
        }
        Object objRetrieveCurrentUser = c194221.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c194221.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objRetrieveCurrentUser);
            c194221.L$0 = message;
            c194221.label = 1;
            objRetrieveCurrentUser = retrieveCurrentUser(c194221);
            if (objRetrieveCurrentUser != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            message = (Message) c194221.L$0;
            AbstractC34132o.m107864I(objRetrieveCurrentUser);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objRetrieveCurrentUser);
                return objRetrieveCurrentUser;
            }
            user = (User) c194221.L$1;
            message2 = (Message) c194221.L$0;
            AbstractC34132o.m107864I(objRetrieveCurrentUser);
        }
        channel = (Channel) objRetrieveCurrentUser;
        if (channel == null) {
            logger = getLogger();
            interfaceC2339eM7232c = logger.m7232c();
            enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[markMessageAsDelivered] Channel ", message2.getCid(), " not found"), null);
            }
            return Boolean.FALSE;
        }
        if (canMarkMessageAsDelivered(user, channel, message2)) {
            return Boolean.FALSE;
        }
        List<Message> listM118958J = AbstractC37056f.m118958J(message2);
        c194221.L$0 = null;
        c194221.L$1 = null;
        c194221.L$2 = null;
        c194221.label = 3;
        objMarkMessagesAsDelivered = markMessagesAsDelivered(listM118958J, c194221);
        if (objMarkMessagesAsDelivered != obj) {
            return obj;
        }
        return objMarkMessagesAsDelivered;
        User user2 = (User) objRetrieveCurrentUser;
        if (user2 == null) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                logger2.m7230a().log(enumC2341g2, logger2.m7231b(), "[markMessageAsDelivered] Current user not found", null);
            }
            return Boolean.FALSE;
        }
        if (!user2.isDeliveryReceiptsEnabled()) {
            return Boolean.FALSE;
        }
        String cid = message.getCid();
        c194221.L$0 = message;
        c194221.L$1 = user2;
        c194221.label = 2;
        Object objRetrieveChannel = retrieveChannel(cid, c194221);
        if (objRetrieveChannel != obj) {
            message2 = message;
            user = user2;
            objRetrieveCurrentUser = objRetrieveChannel;
            channel = (Channel) objRetrieveCurrentUser;
            if (channel == null) {
                logger = getLogger();
                interfaceC2339eM7232c = logger.m7232c();
                enumC2341g = EnumC2341g.WARN;
                if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                    logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[markMessageAsDelivered] Channel ", message2.getCid(), " not found"), null);
                }
                return Boolean.FALSE;
            }
            if (canMarkMessageAsDelivered(user, channel, message2)) {
                return Boolean.FALSE;
            }
            List<Message> listM118958J2 = AbstractC37056f.m118958J(message2);
            c194221.L$0 = null;
            c194221.L$1 = null;
            c194221.L$2 = null;
            c194221.label = 3;
            objMarkMessagesAsDelivered = markMessagesAsDelivered(listM118958J2, c194221);
            if (objMarkMessagesAsDelivered != obj) {
                return objMarkMessagesAsDelivered;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object markMessageAsDelivered(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C194232 c194232;
        if (interfaceC30057d instanceof C194232) {
            c194232 = (C194232) interfaceC30057d;
            int i13 = c194232.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194232.label = i13 - Integer.MIN_VALUE;
            } else {
                c194232 = new C194232(interfaceC30057d);
            }
        } else {
            c194232 = new C194232(interfaceC30057d);
        }
        Object objRetrieveMessage = c194232.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c194232.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objRetrieveMessage);
            c194232.L$0 = str;
            c194232.label = 1;
            objRetrieveMessage = retrieveMessage(str, c194232);
            if (objRetrieveMessage != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objRetrieveMessage);
            return objRetrieveMessage;
        }
        str = (String) c194232.L$0;
        AbstractC34132o.m107864I(objRetrieveMessage);
        Message message = (Message) objRetrieveMessage;
        if (message == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[markMessageAsDelivered] Message ", str, " not found"), null);
            }
            return Boolean.FALSE;
        }
        c194232.L$0 = null;
        c194232.L$1 = null;
        c194232.label = 2;
        Object objMarkMessageAsDelivered = markMessageAsDelivered(message, c194232);
        return objMarkMessageAsDelivered == obj ? obj : objMarkMessageAsDelivered;
    }
}
