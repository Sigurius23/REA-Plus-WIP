package io.getstream.chat.android.client.persistence.p225db;

import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p363ob.C27785h;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;
import se.AbstractC32417h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"io/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1", "Landroidx/room/g1;", "Ltb/a;", "connection", "Ll83/a0;", "createAllTables", "(Ltb/a;)V", "dropAllTables", "onCreate", "onOpen", "onPreMigrate", "onPostMigrate", "Landroidx/room/f1;", "onValidateSchema", "(Ltb/a;)Landroidx/room/f1;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1 extends AbstractC1788g1 {
    final /* synthetic */ ChatClientDatabase_Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1(ChatClientDatabase_Impl chatClientDatabase_Impl) {
        super(1, "732fee2ad841bfe4651148c25ff61c21", "5bafa6ec32d155c01bfddda430a9407c");
        this.this$0 = chatClientDatabase_Impl;
    }

    @Override // androidx.room.AbstractC1788g1
    public final void createAllTables(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `message_receipt` (`messageId` TEXT NOT NULL, `cid` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`messageId`))", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", connection);
        AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '732fee2ad841bfe4651148c25ff61c21')", connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final void dropAllTables(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `message_receipt`", connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onCreate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onOpen(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        this.this$0.internalInitInvalidationTracker(connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onPostMigrate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onPreMigrate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC32410a.m101001I(connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final C1784f1 onValidateSchema(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("messageId", new C27785h(1, 1, "messageId", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap.put("cid", new C27785h(0, 1, "cid", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        C27788k c27788k = new C27788k("message_receipt", linkedHashMap, AbstractC17176i.m48507i(linkedHashMap, "createdAt", new C27785h(0, 1, "createdAt", "INTEGER", null, true)), new LinkedHashSet());
        C27788k c27788kM101188S = AbstractC32417h.m101188S("message_receipt", connection);
        return !c27788k.equals(c27788kM101188S) ? new C1784f1(false, AbstractC17176i.m48505g("message_receipt(io.getstream.chat.android.client.persistence.db.entity.MessageReceiptEntity).\n Expected:\n", c27788k, "\n Found:\n", c27788kM101188S)) : new C1784f1(true, null);
    }
}
