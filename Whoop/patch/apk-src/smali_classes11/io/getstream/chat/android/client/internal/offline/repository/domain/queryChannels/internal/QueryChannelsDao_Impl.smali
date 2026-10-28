.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;",
        "queryChannelsEntity",
        "Ll83/a0;",
        "insert",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;Lq83/d;)Ljava/lang/Object;",
        "",
        "id",
        "select",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deleteAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfQueryChannelsEntity",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;",
        "__filterObjectConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;",
        "__querySortConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
        "__listConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;",
        "__nullableMapConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl$Companion;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __filterObjectConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;

.field private final __insertAdapterOfQueryChannelsEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

.field private final __nullableMapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;

.field private final __querySortConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__filterObjectConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__querySortConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__nullableMapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__insertAdapterOfQueryChannelsEntity:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->insert$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$get__filterObjectConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__filterObjectConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;

    return-object p0
.end method

.method public static final synthetic access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    return-object p0
.end method

.method public static final synthetic access$get__nullableMapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__nullableMapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;

    return-object p0
.end method

.method public static final synthetic access$get__querySortConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__querySortConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;

    return-object p0
.end method

.method public static synthetic b(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE FROM stream_channel_query"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->deleteAll$lambda$2(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;
    .locals 1

    const-string v0, "SELECT * FROM stream_channel_query WHERE stream_channel_query.id=?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->select$lambda$1(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    move-result-object p0

    return-object p0
.end method

.method private static final deleteAll$lambda$2(Ljava/lang/String;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
.end method

.method private static final insert$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__insertAdapterOfQueryChannelsEntity:Landroidx/room/k;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final select$lambda$1(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;
    .locals 19

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "_connection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    move-object/from16 v3, p1

    :try_start_0
    invoke-interface {v1, v2, v3}, Ltb/c;->L(ILjava/lang/String;)V

    const-string v2, "id"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "filter"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "querySort"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "cids"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "predefinedFilterName"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "predefinedFilterValues"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "predefinedSortValues"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_8

    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v10

    goto :goto_0

    :cond_0
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    :goto_0
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__filterObjectConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/FilterObjectConverter;->stringToObject(Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object v13

    if-eqz v13, :cond_7

    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v10

    goto :goto_1

    :cond_1
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__querySortConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;->stringToObject(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v14

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v10

    goto :goto_2

    :cond_2
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    :goto_2
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v15

    if-eqz v15, :cond_6

    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v16, v10

    goto :goto_3

    :cond_3
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v16, v2

    :goto_3
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v2, v10

    goto :goto_4

    :cond_4
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    :goto_4
    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__nullableMapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v17

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v10

    :goto_5
    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__nullableMapConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;

    invoke-virtual {v0, v10}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/NullableMapConverter;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v18

    new-instance v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    invoke-direct/range {v11 .. v18}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    move-object v10, v11

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Expected NON-NULL \'io.getstream.chat.android.models.FilterObject\', but it was NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_8
    :goto_6
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v10

    :goto_7
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method


# virtual methods
.method public final deleteAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    invoke-direct {v1, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    invoke-static {v0, p1, p1, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
