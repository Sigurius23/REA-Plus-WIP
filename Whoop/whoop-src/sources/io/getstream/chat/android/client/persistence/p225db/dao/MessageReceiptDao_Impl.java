package io.getstream.chat.android.client.persistence.p225db.dao;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.mapbox.maps.MapboxMap;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.C19212a;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.client.persistence.p225db.converter.DateConverter;
import io.getstream.chat.android.client.persistence.p225db.entity.MessageReceiptEntity;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;", "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "", "Lio/getstream/chat/android/client/persistence/db/entity/MessageReceiptEntity;", "receipts", "Ll83/a0;", "upsert", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", MapboxMap.QFE_LIMIT, "selectAll", "(ILq83/d;)Ljava/lang/Object;", "", "messageIds", "deleteByMessageIds", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfMessageReceiptEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/persistence/db/converter/DateConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReceiptDao_Impl implements MessageReceiptDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfMessageReceiptEntity;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MessageReceiptDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__dateConverter = new DateConverter();
        this.__db = __db;
        this.__insertAdapterOfMessageReceiptEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.persistence.db.dao.MessageReceiptDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `message_receipt` (`messageId`,`cid`,`createdAt`) VALUES (?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, MessageReceiptEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getMessageId());
                statement.mo5354L(2, entity.getCid());
                Long db4 = MessageReceiptDao_Impl.this.__dateConverter.toDb(entity.getCreatedAt());
                if (db4 == null) {
                    statement.mo5359u(3);
                } else {
                    statement.mo5356p(3, db4.longValue());
                }
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ArrayList m54909c(int i13, MessageReceiptDao_Impl messageReceiptDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectAll$lambda$1("SELECT * FROM message_receipt ORDER BY createdAt ASC LIMIT ?", i13, messageReceiptDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$3(String str, InterfaceC33687a _connection) throws Exception {
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
    public static final C23454a0 deleteByMessageIds$lambda$2(String str, List list, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                interfaceC33689cMo68212g1.mo5354L(i13, (String) it.next());
                i13++;
            }
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    private static final List selectAll$lambda$1(String str, int i13, MessageReceiptDao_Impl messageReceiptDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageId");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                Date dateFromDb = messageReceiptDao_Impl.__dateConverter.fromDb(interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N3)));
                if (dateFromDb == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                arrayList.add(new MessageReceiptEntity(strMo5353J0, strMo5353J1, dateFromDb));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 upsert$lambda$0(MessageReceiptDao_Impl messageReceiptDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        messageReceiptDao_Impl.__insertAdapterOfMessageReceiptEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19336c(10), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao
    public final Object deleteByMessageIds(List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("DELETE FROM message_receipt WHERE messageId IN (");
        AbstractC29125c.m88533j(list.size(), sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19212a(2, string, list), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao
    public final Object selectAll(int i13, InterfaceC30057d<? super List<MessageReceiptEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C6516c(i13, this, 11), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao
    public final Object upsert(List<MessageReceiptEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19223a(13, this, list), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }
}
