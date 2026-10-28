package io.getstream.chat.android.client.persistence.p225db;

import androidx.room.AbstractC1788g1;
import androidx.room.C1835v;
import androidx.room.InterfaceC1792h1;
import io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao;
import io.getstream.chat.android.client.persistence.p225db.dao.MessageReceiptDao_Impl;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.InterfaceC23462h;
import m83.C25271y;
import p007a6.C0438l0;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;", "Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;", "<init>", "()V", "Landroidx/room/g1;", "createOpenDelegate", "()Landroidx/room/g1;", "Landroidx/room/v;", "createInvalidationTracker", "()Landroidx/room/v;", "Ll83/a0;", "clearAllTables", "", "Lj93/d;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Lmb/a;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Lmb/b;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;", "messageReceiptDao", "()Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;", "Ll83/h;", "_messageReceiptDao", "Ll83/h;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClientDatabase_Impl extends ChatClientDatabase {
    private final InterfaceC23462h _messageReceiptDao = AbstractC30060g.m92088H(new C0438l0(this, 23));

    private static final MessageReceiptDao_Impl _messageReceiptDao$lambda$0(ChatClientDatabase_Impl chatClientDatabase_Impl) {
        return new MessageReceiptDao_Impl(chatClientDatabase_Impl);
    }

    @Override // androidx.room.AbstractC1848z0
    public final void clearAllTables() {
        performClear(false, "message_receipt");
    }

    @Override // androidx.room.AbstractC1848z0
    public final List<AbstractC25380b> createAutoMigrations(Map<InterfaceC21461d, ? extends InterfaceC25379a> autoMigrationSpecs) {
        AbstractC22676k.m65750j(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.AbstractC1848z0
    public final C1835v createInvalidationTracker() {
        return new C1835v(this, new LinkedHashMap(), new LinkedHashMap(), "message_receipt");
    }

    @Override // androidx.room.AbstractC1848z0
    public final AbstractC1788g1 createOpenDelegate() {
        return new ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1(this);
    }

    @Override // androidx.room.AbstractC1848z0
    public final Set<InterfaceC21461d> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.AbstractC1848z0
    public final Map<InterfaceC21461d, List<InterfaceC21461d>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(MessageReceiptDao.class);
        MessageReceiptDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass, C25271y.f99162w);
        return linkedHashMap;
    }

    @Override // io.getstream.chat.android.client.persistence.p225db.ChatClientDatabase
    public final MessageReceiptDao messageReceiptDao() {
        return (MessageReceiptDao) this._messageReceiptDao.getValue();
    }

    @Override // androidx.room.AbstractC1848z0
    public final InterfaceC1792h1 createOpenDelegate() {
        return new ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1(this);
    }
}
