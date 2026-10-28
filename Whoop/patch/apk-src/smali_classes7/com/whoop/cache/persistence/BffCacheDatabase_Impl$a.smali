.class public final Lcom/whoop/cache/persistence/BffCacheDatabase_Impl$a;
.super Landroidx/room/g1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;
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
        "com/whoop/cache/persistence/BffCacheDatabase_Impl$a",
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
        "cache_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;)V
    .locals 2

    iput-object p1, p0, Lcom/whoop/cache/persistence/BffCacheDatabase_Impl$a;->a:Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;

    const-string p1, "fdc37bd8a1eb858fff6b9d0f40a9cffb"

    const-string v0, "4a693d5f73d2b96c6730d97e08aa51aa"

    const/4 v1, 0x1

    invoke-direct {p0, v1, p1, v0}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `cache_entries` (`uri` TEXT NOT NULL, `data` BLOB NOT NULL, `lastUpdated` INTEGER NOT NULL, PRIMARY KEY(`uri`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `cache_scopes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uri` TEXT NOT NULL, `scope` TEXT NOT NULL, FOREIGN KEY(`uri`) REFERENCES `cache_entries`(`uri`) ON UPDATE NO ACTION ON DELETE CASCADE )"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_cache_scopes_uri` ON `cache_scopes` (`uri`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_cache_scopes_scope` ON `cache_scopes` (`scope`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'fdc37bd8a1eb858fff6b9d0f40a9cffb\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `cache_entries`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `cache_scopes`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public onCreate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onOpen(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PRAGMA foreign_keys = ON"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    iget-object v0, p0, Lcom/whoop/cache/persistence/BffCacheDatabase_Impl$a;->a:Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;

    invoke-static {v0, p1}, Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;->e(Lcom/whoop/cache/persistence/BffCacheDatabase_Impl;Ltb/a;)V

    return-void
.end method

.method public onPostMigrate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onPreMigrate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lse/a;->I(Ltb/a;)V

    return-void
.end method

.method public onValidateSchema(Ltb/a;)Landroidx/room/f1;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "connection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Lob/h;

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x1

    const-string v5, "uri"

    const-string v6, "TEXT"

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "uri"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lob/h;

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    const-string v7, "data"

    const-string v8, "BLOB"

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v10}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "data"

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "lastUpdated"

    const-string v9, "INTEGER"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "lastUpdated"

    invoke-static {v1, v2, v5}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v5, Lob/k;

    const-string v6, "cache_entries"

    invoke-direct {v5, v6, v1, v2, v4}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v6, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v5, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "\n Found:\n"

    const/4 v6, 0x0

    if-nez v2, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v2, "cache_entries(com.whoop.cache.persistence.CacheEntryEntity).\n Expected:\n"

    invoke-static {v2, v5, v4, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v6, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x1

    const-string v10, "id"

    const-string v11, "INTEGER"

    const/4 v13, 0x1

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "id"

    invoke-interface {v1, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "uri"

    const-string v12, "TEXT"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v1, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    const-string v12, "scope"

    const-string v13, "TEXT"

    const/4 v15, 0x1

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "scope"

    invoke-static {v1, v2, v9}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v5

    new-instance v7, Lob/i;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const-string v8, "cache_entries"

    const-string v9, "CASCADE"

    const-string v11, "NO ACTION"

    invoke-direct/range {v7 .. v12}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v5, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v8, Lob/j;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v9, "ASC"

    invoke-static {v9}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const-string v11, "index_cache_scopes_uri"

    invoke-direct {v8, v11, v3, v10, v6}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v7, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v3, Lob/j;

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v9}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v9, "index_cache_scopes_scope"

    invoke-direct {v3, v9, v2, v8, v6}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v7, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v2, Lob/k;

    const-string v3, "cache_scopes"

    invoke-direct {v2, v3, v1, v5, v7}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v3, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v0

    invoke-virtual {v2, v0}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Landroidx/room/f1;

    const-string v3, "cache_scopes(com.whoop.cache.persistence.CacheScopeEntity).\n Expected:\n"

    invoke-static {v3, v2, v4, v0}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v6, v0}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_1
    new-instance v0, Landroidx/room/f1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
