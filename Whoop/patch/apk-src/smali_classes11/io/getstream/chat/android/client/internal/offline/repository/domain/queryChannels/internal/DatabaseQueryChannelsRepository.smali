.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;",
        "queryChannelsDao",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;)V",
        "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "queryChannelsSpec",
        "Ll83/a0;",
        "insertQueryChannels",
        "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "identifier",
        "selectBy",
        "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;",
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
.field private static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;


# instance fields
.field private final queryChannelsDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;)V
    .locals 1

    const-string v0, "queryChannelsDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;->queryChannelsDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;

    return-void
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;->queryChannelsDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertQueryChannels(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;->queryChannelsDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;

    sget-object v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;

    invoke-static {v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;->access$toEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;Lio/getstream/chat/android/client/query/QueryChannelsSpec;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;->insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final selectBy(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;->queryChannelsDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;

    sget-object v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;

    invoke-static {v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;->access$generateId(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Ljava/lang/String;

    move-result-object p1

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$selectBy$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;->select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    if-eqz p2, :cond_4

    sget-object p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;->access$toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;)Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v3
.end method
