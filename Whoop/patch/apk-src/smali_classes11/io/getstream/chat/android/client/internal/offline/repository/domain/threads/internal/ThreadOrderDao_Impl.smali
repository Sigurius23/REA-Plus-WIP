.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;",
        "Landroidx/room/z0;",
        "__db",
        "<init>",
        "(Landroidx/room/z0;)V",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;",
        "order",
        "Ll83/a0;",
        "insertThreadOrder",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;Lq83/d;)Ljava/lang/Object;",
        "",
        "id",
        "selectThreadOrder",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deleteAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "Landroidx/room/z0;",
        "Landroidx/room/k;",
        "__insertAdapterOfThreadOrderEntity",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
        "__listConverter",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;",
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
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl$Companion;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfThreadOrderEntity:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const-string v0, "__db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->__insertAdapterOfThreadOrderEntity:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;
    .locals 1

    const-string v0, "SELECT * FROM stream_chat_thread_order WHERE id=?"

    invoke-static {v0, p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->selectThreadOrder$lambda$1(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get__listConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    return-object p0
.end method

.method public static synthetic b(Ltb/a;)V
    .locals 1

    const-string v0, "DELETE from stream_chat_thread_order"

    invoke-static {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->deleteAll$lambda$2(Ljava/lang/String;Ltb/a;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;Ltb/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->insertThreadOrder$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;Ltb/a;)Ll83/a0;

    return-void
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

.method private static final insertThreadOrder$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "_connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->__insertAdapterOfThreadOrderEntity:Landroidx/room/k;

    invoke-virtual {p0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final selectThreadOrder$lambda$1(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;Ltb/a;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;
    .locals 2

    const-string v0, "_connection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    const/4 p3, 0x1

    :try_start_0
    invoke-interface {p0, p3, p1}, Ltb/c;->L(ILjava/lang/String;)V

    const-string p1, "id"

    invoke-static {p0, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string p3, "order"

    invoke-static {p0, p3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p3

    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p0, p1}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p3}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    iget-object p2, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->__listConverter:Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;

    invoke-virtual {p2, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;->toStringList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;

    invoke-direct {v1, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;-><init>(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Expected NON-NULL \'kotlin.collections.List<kotlin.String>\', but it was NULL."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_2
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw p1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0x11

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

.method public final insertThreadOrder(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/4 v2, 0x7

    invoke-direct {v1, v2, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

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

.method public final selectThreadOrder(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v2, 0x8

    invoke-direct {v1, v2, p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
