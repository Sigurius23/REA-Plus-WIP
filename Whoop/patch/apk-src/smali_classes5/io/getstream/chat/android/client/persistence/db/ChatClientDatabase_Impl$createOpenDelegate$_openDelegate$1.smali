.class public final Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1;
.super Landroidx/room/g1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "io/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1",
        "Landroidx/room/g1;",
        "Ltb/a;",
        "connection",
        "Ll83/a0;",
        "createAllTables",
        "(Ltb/a;)V",
        "dropAllTables",
        "onCreate",
        "onOpen",
        "onPreMigrate",
        "onPostMigrate",
        "Landroidx/room/f1;",
        "onValidateSchema",
        "(Ltb/a;)Landroidx/room/f1;",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;)V
    .locals 2

    iput-object p1, p0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1;->this$0:Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;

    const-string p1, "732fee2ad841bfe4651148c25ff61c21"

    const-string v0, "5bafa6ec32d155c01bfddda430a9407c"

    const/4 v1, 0x1

    invoke-direct {p0, v1, p1, v0}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `message_receipt` (`messageId` TEXT NOT NULL, `cid` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`messageId`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'732fee2ad841bfe4651148c25ff61c21\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public final dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `message_receipt`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public final onCreate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onOpen(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1;->this$0:Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;

    invoke-virtual {v0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method

.method public final onPostMigrate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onPreMigrate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lse/a;->I(Ltb/a;)V

    return-void
.end method

.method public final onValidateSchema(Ltb/a;)Landroidx/room/f1;
    .locals 11

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Lob/h;

    const/4 v6, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x1

    const-string v4, "messageId"

    const-string v5, "TEXT"

    const/4 v7, 0x1

    invoke-direct/range {v1 .. v7}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "messageId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v6, "cid"

    const-string v7, "TEXT"

    const/4 v9, 0x1

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "cid"

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lob/h;

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    const-string v7, "createdAt"

    const-string v8, "INTEGER"

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v10}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "createdAt"

    invoke-static {v0, v1, v4}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v3, Lob/k;

    const-string v4, "message_receipt"

    invoke-direct {v3, v4, v0, v1, v2}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v4, p1}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object p1

    invoke-virtual {v3, p1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v1, "message_receipt(io.getstream.chat.android.client.persistence.db.entity.MessageReceiptEntity).\n Expected:\n"

    const-string v2, "\n Found:\n"

    invoke-static {v1, v3, v2, p1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Landroidx/room/f1;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
