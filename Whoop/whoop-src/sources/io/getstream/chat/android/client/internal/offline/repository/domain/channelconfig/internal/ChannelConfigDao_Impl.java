package io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import h02.C16574h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.DateConverter;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25271y;
import p002a0.AbstractC0038m;
import p002a0.C0010c;
import p002a0.C0022g;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p505ts.AbstractC34132o;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rH\u0096@¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\rH\u0096@¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Ltb/a;", "_connection", "La0/g;", "", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;", "_map", "Ll83/a0;", "__fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity", "(Ltb/a;La0/g;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;", "channelConfigInnerEntity", "insertConfig", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Lq83/d;)Ljava/lang/Object;", "", "channelConfigInnerEntities", "insertConfigs", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "commands", "insertCommands", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;", "channelConfigEntity", "insert", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lq83/d;)Ljava/lang/Object;", "selectAll", "(Lq83/d;)Ljava/lang/Object;", "deleteCommands", "deleteConfigs", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfChannelConfigInnerEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__insertAdapterOfCommandInnerEntity", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelConfigDao_Impl implements ChannelConfigDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfChannelConfigInnerEntity;
    private final AbstractC1802k __insertAdapterOfCommandInnerEntity;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao_Impl$2 */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"io/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$2", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;", "", "createQuery", "()Ljava/lang/String;", "Ltb/c;", "statement", "entity", "Ll83/a0;", "bind", "(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191512 extends AbstractC1802k {
        @Override // androidx.room.AbstractC1802k
        public final String createQuery() {
            return "INSERT OR REPLACE INTO `command_inner_entity` (`name`,`description`,`args`,`set`,`channelType`,`id`) VALUES (?,?,?,?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public final void bind(InterfaceC33689c statement, CommandInnerEntity entity) {
            AbstractC22676k.m65750j(statement, "statement");
            AbstractC22676k.m65750j(entity, "entity");
            statement.mo5354L(1, entity.getName());
            statement.mo5354L(2, entity.getDescription());
            statement.mo5354L(3, entity.getArgs());
            statement.mo5354L(4, entity.getSet());
            statement.mo5354L(5, entity.getChannelType());
            statement.mo5356p(6, entity.getId());
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao_Impl$insert$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao_Impl$insert$2", m100430f = "ChannelConfigDao_Impl.kt", m100431l = {135}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191522 extends AbstractC32275i implements Function1 {
        final /* synthetic */ ChannelConfigEntity $channelConfigEntity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191522(ChannelConfigEntity channelConfigEntity, InterfaceC30057d<? super C191522> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$channelConfigEntity = channelConfigEntity;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ChannelConfigDao_Impl.this.new C191522(this.$channelConfigEntity, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ChannelConfigDao_Impl channelConfigDao_Impl = ChannelConfigDao_Impl.this;
                ChannelConfigEntity channelConfigEntity = this.$channelConfigEntity;
                this.label = 1;
                if (ChannelConfigDao_Impl.m134218access$insert$s21986483(channelConfigDao_Impl, channelConfigEntity, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C191522) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public ChannelConfigDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__dateConverter = new DateConverter();
        this.__db = __db;
        this.__insertAdapterOfChannelConfigInnerEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_channel_config` (`channelType`,`createdAt`,`updatedAt`,`name`,`isTypingEvents`,`isReadEvents`,`deliveryEventsEnabled`,`isConnectEvents`,`isSearch`,`isReactionsEnabled`,`isThreadEnabled`,`isMutes`,`uploadsEnabled`,`urlEnrichmentEnabled`,`customEventsEnabled`,`pushNotificationsEnabled`,`messageRetention`,`maxMessageLength`,`automod`,`automodBehavior`,`blocklistBehavior`,`messageRemindersEnabled`,`markMessagesPending`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, ChannelConfigInnerEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getChannelType());
                Long lDateToTimestamp = ChannelConfigDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(2);
                } else {
                    statement.mo5356p(2, lDateToTimestamp.longValue());
                }
                Long lDateToTimestamp2 = ChannelConfigDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(3);
                } else {
                    statement.mo5356p(3, lDateToTimestamp2.longValue());
                }
                statement.mo5354L(4, entity.getName());
                statement.mo5356p(5, entity.isTypingEvents() ? 1L : 0L);
                statement.mo5356p(6, entity.isReadEvents() ? 1L : 0L);
                statement.mo5356p(7, entity.getDeliveryEventsEnabled() ? 1L : 0L);
                statement.mo5356p(8, entity.isConnectEvents() ? 1L : 0L);
                statement.mo5356p(9, entity.isSearch() ? 1L : 0L);
                statement.mo5356p(10, entity.isReactionsEnabled() ? 1L : 0L);
                statement.mo5356p(11, entity.isThreadEnabled() ? 1L : 0L);
                statement.mo5356p(12, entity.isMutes() ? 1L : 0L);
                statement.mo5356p(13, entity.getUploadsEnabled() ? 1L : 0L);
                statement.mo5356p(14, entity.getUrlEnrichmentEnabled() ? 1L : 0L);
                statement.mo5356p(15, entity.getCustomEventsEnabled() ? 1L : 0L);
                statement.mo5356p(16, entity.getPushNotificationsEnabled() ? 1L : 0L);
                statement.mo5354L(17, entity.getMessageRetention());
                statement.mo5356p(18, entity.getMaxMessageLength());
                statement.mo5354L(19, entity.getAutomod());
                statement.mo5354L(20, entity.getAutomodBehavior());
                statement.mo5354L(21, entity.getBlocklistBehavior());
                statement.mo5356p(22, entity.getMessageRemindersEnabled() ? 1L : 0L);
                statement.mo5356p(23, entity.getMarkMessagesPending() ? 1L : 0L);
            }
        };
        this.__insertAdapterOfCommandInnerEntity = new C191512();
    }

    /* JADX INFO: renamed from: __fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity */
    private final void m54687xf67bcfa0(InterfaceC33687a _connection, C0022g _map) throws Exception {
        C0010c c0010c = (C0010c) _map.keySet();
        C0022g c0022g = c0010c.f25w;
        if (c0022g.isEmpty()) {
            return;
        }
        if (_map.f50y > 999) {
            AbstractC32411b.m101080X(_map, new C16574h(22, this, _connection));
            return;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT `name`,`description`,`args`,`set`,`channelType`,`id` FROM `command_inner_entity` WHERE `channelType` IN (");
        AbstractC29125c.m88533j(c0022g.f50y, sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(string);
        Iterator it = c0010c.iterator();
        int i13 = 1;
        while (true) {
            AbstractC0038m abstractC0038m = (AbstractC0038m) it;
            if (!abstractC0038m.hasNext()) {
                try {
                    break;
                } catch (Throwable th3) {
                    interfaceC33689cMo68212g1.close();
                    throw th3;
                }
            }
            interfaceC33689cMo68212g1.mo5354L(i13, (String) abstractC0038m.next());
            i13++;
        }
        int iM60657M = AbstractC21598x.m60657M(interfaceC33689cMo68212g1, "channelType");
        if (iM60657M == -1) {
            interfaceC33689cMo68212g1.close();
            return;
        }
        while (interfaceC33689cMo68212g1.mo5355e1()) {
            List list = (List) _map.get(interfaceC33689cMo68212g1.mo5353J0(iM60657M));
            if (list != null) {
                CommandInnerEntity commandInnerEntity = new CommandInnerEntity(interfaceC33689cMo68212g1.mo5353J0(0), interfaceC33689cMo68212g1.mo5353J0(1), interfaceC33689cMo68212g1.mo5353J0(2), interfaceC33689cMo68212g1.mo5353J0(3), interfaceC33689cMo68212g1.mo5353J0(4));
                commandInnerEntity.setId((int) interfaceC33689cMo68212g1.getLong(5));
                list.add(commandInnerEntity);
            }
        }
        interfaceC33689cMo68212g1.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: __fetchRelationshipcommandInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainChannelconfigInternalCommandInnerEntity$lambda$6 */
    public static final C23454a0 m54688xabb2e31d(ChannelConfigDao_Impl channelConfigDao_Impl, InterfaceC33687a interfaceC33687a, C0022g _tmpMap) throws Exception {
        AbstractC22676k.m65750j(_tmpMap, "_tmpMap");
        channelConfigDao_Impl.m54687xf67bcfa0(interfaceC33687a, _tmpMap);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: access$insert$s-21986483, reason: not valid java name */
    public static final Object m134218access$insert$s21986483(ChannelConfigDao_Impl channelConfigDao_Impl, ChannelConfigEntity channelConfigEntity, InterfaceC30057d interfaceC30057d) {
        channelConfigDao_Impl.getClass();
        return ChannelConfigDao.insert$suspendImpl(channelConfigDao_Impl, channelConfigEntity, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ArrayList m54690b(ChannelConfigDao_Impl channelConfigDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectAll$lambda$3("SELECT * FROM stream_chat_channel_config LIMIT 100", channelConfigDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteCommands$lambda$4(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteConfigs$lambda$5(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertCommands$lambda$2(ChannelConfigDao_Impl channelConfigDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        channelConfigDao_Impl.__insertAdapterOfCommandInnerEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertConfig$lambda$0(ChannelConfigDao_Impl channelConfigDao_Impl, ChannelConfigInnerEntity channelConfigInnerEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        channelConfigDao_Impl.__insertAdapterOfChannelConfigInnerEntity.insert(_connection, channelConfigInnerEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertConfigs$lambda$1(ChannelConfigDao_Impl channelConfigDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        channelConfigDao_Impl.__insertAdapterOfChannelConfigInnerEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    private static final List selectAll$lambda$3(String str, ChannelConfigDao_Impl channelConfigDao_Impl, InterfaceC33687a _connection) throws Exception {
        ChannelConfigDao_Impl channelConfigDao_Impl2 = channelConfigDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelType");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isTypingEvents");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isReadEvents");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deliveryEventsEnabled");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isConnectEvents");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isSearch");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isReactionsEnabled");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isThreadEnabled");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "isMutes");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "uploadsEnabled");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "urlEnrichmentEnabled");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "customEventsEnabled");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pushNotificationsEnabled");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageRetention");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "maxMessageLength");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "automod");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "automodBehavior");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "blocklistBehavior");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageRemindersEnabled");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "markMessagesPending");
            int i13 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J0)) {
                    c0022g.put(strMo5353J0, new ArrayList());
                    iM60658N11 = iM60658N11;
                }
            }
            int i14 = iM60658N11;
            interfaceC33689cMo68212g1.reset();
            channelConfigDao_Impl2.m54687xf67bcfa0(_connection, c0022g);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                Date dateFromTimestamp = channelConfigDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N2)));
                Date dateFromTimestamp2 = channelConfigDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N3)));
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N5)) != 0;
                C0022g c0022g2 = c0022g;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N6)) != 0;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N7)) != 0;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0;
                int i15 = iM60658N2;
                int i16 = i14;
                int i17 = iM60658N3;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(i16)) != 0;
                int i18 = i13;
                int i19 = iM60658N4;
                boolean z19 = ((int) interfaceC33689cMo68212g1.getLong(i18)) != 0;
                int i24 = iM60658N13;
                int i25 = iM60658N5;
                boolean z24 = ((int) interfaceC33689cMo68212g1.getLong(i24)) != 0;
                int i26 = iM60658N14;
                boolean z25 = ((int) interfaceC33689cMo68212g1.getLong(i26)) != 0;
                int i27 = iM60658N15;
                boolean z26 = ((int) interfaceC33689cMo68212g1.getLong(i27)) != 0;
                int i28 = iM60658N16;
                boolean z27 = ((int) interfaceC33689cMo68212g1.getLong(i28)) != 0;
                int i29 = iM60658N17;
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(i29);
                int i34 = iM60658N18;
                int i35 = (int) interfaceC33689cMo68212g1.getLong(i34);
                int i36 = iM60658N19;
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(i36);
                int i37 = iM60658N20;
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(i37);
                iM60658N20 = i37;
                int i38 = iM60658N21;
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(i38);
                iM60658N21 = i38;
                iM60658N19 = i36;
                int i39 = iM60658N22;
                int i44 = iM60658N23;
                ChannelConfigInnerEntity channelConfigInnerEntity = new ChannelConfigInnerEntity(strMo5353J1, dateFromTimestamp, dateFromTimestamp2, strMo5353J2, z4, z13, z14, z15, z16, z17, z18, z19, z24, z25, z26, z27, strMo5353J3, i35, strMo5353J4, strMo5353J5, strMo5353J6, ((int) interfaceC33689cMo68212g1.getLong(i39)) != 0, ((int) interfaceC33689cMo68212g1.getLong(i44)) != 0);
                Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U, "getValue(...)");
                arrayList.add(new ChannelConfigEntity(channelConfigInnerEntity, (List) objM73986U));
                channelConfigDao_Impl2 = channelConfigDao_Impl;
                iM60658N4 = i19;
                iM60658N3 = i17;
                i14 = i16;
                i13 = i18;
                iM60658N16 = i28;
                iM60658N18 = i34;
                iM60658N5 = i25;
                iM60658N13 = i24;
                iM60658N14 = i26;
                iM60658N15 = i27;
                iM60658N17 = i29;
                iM60658N22 = i39;
                iM60658N23 = i44;
                iM60658N2 = i15;
                c0022g = c0022g2;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao
    public final Object deleteCommands(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(9), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao
    public final Object deleteConfigs(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(8), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao
    public final Object insert(ChannelConfigEntity channelConfigEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44433M = AbstractC15751g.m44433M(this.__db, new C191522(channelConfigEntity, null), interfaceC30057d);
        return objM44433M == EnumC31071a.f128113w ? objM44433M : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao
    public final Object insertCommands(List<CommandInnerEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19154a(this, list, 1), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao
    public final Object insertConfig(ChannelConfigInnerEntity channelConfigInnerEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C16574h(23, this, channelConfigInnerEntity), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao
    public final Object insertConfigs(List<ChannelConfigInnerEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19154a(this, list, 0), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao
    public final Object selectAll(InterfaceC30057d<? super List<ChannelConfigEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C17095c(this, 15), interfaceC30057d);
    }
}
