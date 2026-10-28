.class public final Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;
.super Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r0\u000e0\u000cH\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00120\r0\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J1\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\u000cH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;",
        "Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;",
        "<init>",
        "()V",
        "Landroidx/room/g1;",
        "createOpenDelegate",
        "()Landroidx/room/g1;",
        "Landroidx/room/v;",
        "createInvalidationTracker",
        "()Landroidx/room/v;",
        "Ll83/a0;",
        "clearAllTables",
        "",
        "Lj93/d;",
        "",
        "getRequiredTypeConverterClasses",
        "()Ljava/util/Map;",
        "",
        "Lmb/a;",
        "getRequiredAutoMigrationSpecClasses",
        "()Ljava/util/Set;",
        "autoMigrationSpecs",
        "Lmb/b;",
        "createAutoMigrations",
        "(Ljava/util/Map;)Ljava/util/List;",
        "Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;",
        "messageReceiptDao",
        "()Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;",
        "Ll83/h;",
        "_messageReceiptDao",
        "Ll83/h;",
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
.field private final _messageReceiptDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;-><init>()V

    new-instance v0, La6/l0;

    const/16 v1, 0x17

    invoke-direct {v0, p0, v1}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;->_messageReceiptDao:Ll83/h;

    return-void
.end method

.method private static final _messageReceiptDao$lambda$0(Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;)Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method public static final synthetic access$internalInitInvalidationTracker(Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;Ltb/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method


# virtual methods
.method public final clearAllTables()V
    .locals 2

    const-string v0, "message_receipt"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroidx/room/z0;->performClear(Z[Ljava/lang/String;)V

    return-void
.end method

.method public final createAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lmb/a;",
            ">;)",
            "Ljava/util/List<",
            "Lmb/b;",
            ">;"
        }
    .end annotation

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public final createInvalidationTracker()Landroidx/room/v;
    .locals 4

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Landroidx/room/v;

    const-string v3, "message_receipt"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p0, v0, v1, v3}, Landroidx/room/v;-><init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v2
.end method

.method public final createOpenDelegate()Landroidx/room/g1;
    .locals 1

    .line 1
    new-instance v0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1;-><init>(Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;)V

    return-object v0
.end method

.method public final createOpenDelegate()Landroidx/room/h1;
    .locals 1

    .line 2
    new-instance v0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl$createOpenDelegate$_openDelegate$1;-><init>(Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;)V

    return-object v0
.end method

.method public final getRequiredAutoMigrationSpecClasses()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method public final getRequiredTypeConverterClasses()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Ljava/util/List<",
            "Lj93/d;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-class v1, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl;->Companion:Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao_Impl$Companion;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final messageReceiptDao()Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase_Impl;->_messageReceiptDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/persistence/db/dao/MessageReceiptDao;

    return-object v0
.end method
