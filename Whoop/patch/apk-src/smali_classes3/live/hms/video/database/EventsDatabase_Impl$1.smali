.class Llive/hms/video/database/EventsDatabase_Impl$1;
.super Landroidx/room/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/database/EventsDatabase_Impl;->createOpenHelper(Landroidx/room/g;)Lub/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Llive/hms/video/database/EventsDatabase_Impl;


# direct methods
.method public constructor <init>(Llive/hms/video/database/EventsDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/database/EventsDatabase_Impl$1;->this$0:Llive/hms/video/database/EventsDatabase_Impl;

    invoke-direct {p0, p2}, Landroidx/room/i1;-><init>(I)V

    return-void
.end method


# virtual methods
.method public createAllTables(Lub/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `analytics_table` (`timestamp` INTEGER NOT NULL, `eventId` TEXT NOT NULL, `payload` TEXT NOT NULL, `eventName` TEXT NOT NULL, `token` TEXT NOT NULL, `isQa` INTEGER NOT NULL, `peerId` TEXT, `role` TEXT, `joinedAt` INTEGER, `leftAt` INTEGER, `roomName` TEXT, `sessionStartedAt` INTEGER, `userData` TEXT, `userName` TEXT, `templateId` TEXT, `sessionId` TEXT, `websocketUrl` TEXT, PRIMARY KEY(`eventId`))"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'356e4a21530b2975a5e43ebcfbd41316\')"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    return-void
.end method

.method public dropAllTables(Lub/a;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS `analytics_table`"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/database/EventsDatabase_Impl$1;->this$0:Llive/hms/video/database/EventsDatabase_Impl;

    invoke-static {p1}, Llive/hms/video/database/EventsDatabase_Impl;->access$000(Llive/hms/video/database/EventsDatabase_Impl;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/room/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onCreate(Lub/a;)V
    .locals 2

    iget-object v0, p0, Llive/hms/video/database/EventsDatabase_Impl$1;->this$0:Llive/hms/video/database/EventsDatabase_Impl;

    invoke-static {v0}, Llive/hms/video/database/EventsDatabase_Impl;->access$100(Llive/hms/video/database/EventsDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/room/q0;

    invoke-virtual {v1, p1}, Landroidx/room/q0;->onCreate(Lub/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onOpen(Lub/a;)V
    .locals 2

    iget-object v0, p0, Llive/hms/video/database/EventsDatabase_Impl$1;->this$0:Llive/hms/video/database/EventsDatabase_Impl;

    invoke-static {v0, p1}, Llive/hms/video/database/EventsDatabase_Impl;->access$202(Llive/hms/video/database/EventsDatabase_Impl;Lub/a;)Lub/a;

    iget-object v0, p0, Llive/hms/video/database/EventsDatabase_Impl$1;->this$0:Llive/hms/video/database/EventsDatabase_Impl;

    invoke-static {v0, p1}, Llive/hms/video/database/EventsDatabase_Impl;->access$300(Llive/hms/video/database/EventsDatabase_Impl;Lub/a;)V

    iget-object v0, p0, Llive/hms/video/database/EventsDatabase_Impl$1;->this$0:Llive/hms/video/database/EventsDatabase_Impl;

    invoke-static {v0}, Llive/hms/video/database/EventsDatabase_Impl;->access$400(Llive/hms/video/database/EventsDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/room/q0;

    invoke-virtual {v1, p1}, Landroidx/room/q0;->onOpen(Lub/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPostMigrate(Lub/a;)V
    .locals 0

    return-void
.end method

.method public onPreMigrate(Lub/a;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwb/a;

    invoke-direct {v0, p1}, Lwb/a;-><init>(Lub/a;)V

    invoke-static {v0}, Lse/a;->I(Ltb/a;)V

    return-void
.end method

.method public onValidateSchema(Lub/a;)Landroidx/room/j1;
    .locals 17

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v6, "timestamp"

    const-string v7, "INTEGER"

    const/4 v9, 0x1

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "timestamp"

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lob/h;

    const/4 v9, 0x0

    const/4 v6, 0x1

    const-string v7, "eventId"

    const-string v8, "TEXT"

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v10}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "eventId"

    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "payload"

    const-string v9, "TEXT"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "payload"

    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lob/h;

    const/4 v11, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    const-string v9, "eventName"

    const-string v10, "TEXT"

    const/4 v12, 0x1

    invoke-direct/range {v6 .. v12}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "eventName"

    invoke-virtual {v1, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v10, "token"

    const-string v11, "TEXT"

    const/4 v13, 0x1

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "token"

    invoke-virtual {v1, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "isQa"

    const-string v12, "INTEGER"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "isQa"

    invoke-virtual {v1, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    const-string v12, "peerId"

    const-string v13, "TEXT"

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "peerId"

    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-string v13, "role"

    const-string v14, "TEXT"

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "role"

    invoke-virtual {v1, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v6, "joinedAt"

    const-string v7, "INTEGER"

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "joinedAt"

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lob/h;

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    const-string v7, "leftAt"

    const-string v8, "INTEGER"

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v10}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "leftAt"

    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "roomName"

    const-string v9, "TEXT"

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "roomName"

    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lob/h;

    const/4 v11, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    const-string v9, "sessionStartedAt"

    const-string v10, "INTEGER"

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v12}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "sessionStartedAt"

    invoke-virtual {v1, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v10, "userData"

    const-string v11, "TEXT"

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "userData"

    invoke-virtual {v1, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "userName"

    const-string v12, "TEXT"

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "userName"

    invoke-virtual {v1, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    const-string v12, "templateId"

    const-string v13, "TEXT"

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "templateId"

    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-string v13, "sessionId"

    const-string v14, "TEXT"

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "sessionId"

    invoke-virtual {v1, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v6, "websocketUrl"

    const-string v7, "TEXT"

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "websocketUrl"

    invoke-static {v1, v2, v3, v4}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, Lob/k;

    const-string v6, "analytics_table"

    invoke-direct {v5, v6, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "database"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwb/a;

    invoke-direct {v1, v0}, Lwb/a;-><init>(Lub/a;)V

    invoke-static {v6, v1}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v0

    invoke-virtual {v5, v0}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroidx/room/j1;

    const-string v2, "analytics_table(live.hms.video.database.entity.AnalyticsEntityModel).\n Expected:\n"

    const-string v3, "\n Found:\n"

    invoke-static {v2, v5, v3, v0}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v4, v0}, Landroidx/room/j1;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_0
    new-instance v0, Landroidx/room/j1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/room/j1;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
