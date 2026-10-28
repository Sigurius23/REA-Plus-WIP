.class public final Lcq0/h;
.super Lhj0/n;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ6\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J(\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcq0/h;",
        "Lhj0/n;",
        "Lcom/whoop/widget/api/WidgetApi;",
        "widgetApi",
        "Ltr2/n;",
        "logger",
        "Lin2/d;",
        "dispatcherFactory",
        "Lrr2/c;",
        "crashReporter",
        "<init>",
        "(Lcom/whoop/widget/api/WidgetApi;Ltr2/n;Lin2/d;Lrr2/c;)V",
        "",
        "collectionName",
        "date",
        "",
        "offset",
        "limit",
        "Lcom/whoop/data/remote/commons/Resource;",
        "Lcom/whoop/domain/model/teams/WidgetCollectionResponse;",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/domain/model/teams/share/TeamResponse;",
        "e",
        "(IILq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/widget/api/WidgetApi;",
        "community_release"
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
.field private final a:Lcom/whoop/widget/api/WidgetApi;


# direct methods
.method public constructor <init>(Lcom/whoop/widget/api/WidgetApi;Ltr2/n;Lin2/d;Lrr2/c;)V
    .locals 1

    const-string v0, "widgetApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p4, p3}, Lhj0/n;-><init>(Ltr2/n;Lrr2/c;Lin2/d;)V

    iput-object p1, p0, Lcq0/h;->a:Lcom/whoop/widget/api/WidgetApi;

    return-void
.end method


# virtual methods
.method public final e(IILq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "Lcom/whoop/domain/model/teams/share/TeamResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcq0/h$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcq0/h$a;

    iget v1, v0, Lcq0/h$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcq0/h$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcq0/h$a;

    invoke-direct {v0, p0, p3}, Lcq0/h$a;-><init>(Lcq0/h;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lcq0/h$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcq0/h$a;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lcq0/h;->a:Lcom/whoop/widget/api/WidgetApi;

    iput p1, v0, Lcq0/h$a;->w:I

    iput p2, v0, Lcq0/h$a;->x:I

    iput v3, v0, Lcq0/h$a;->E:I

    invoke-interface {p3, p1, p2, v0}, Lcom/whoop/widget/api/WidgetApi;->getSelectTeams(IILq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;

    invoke-virtual {p3}, Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;->toTeamResponse()Lcom/whoop/domain/model/teams/share/TeamResponse;

    move-result-object p1

    sget-object p2, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    invoke-virtual {p2, p1}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :goto_2
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p2

    invoke-virtual {p0}, Lhj0/n;->getCrashReporter()Lrr2/c;

    move-result-object p3

    const-string v0, "Exception occurred while getting fetching user teams"

    invoke-static {p1, v0, p2, p3}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    move-result-object v2

    sget-object v1, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    sget-object p2, Lcom/whoop/network/exception/DomainException;->x:Lcom/whoop/network/exception/DomainException$a;

    invoke-virtual {p2, p1}, Lcom/whoop/network/exception/DomainException$a;->a(Ljava/lang/Throwable;)Lcom/whoop/network/exception/DomainException;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "Lcom/whoop/domain/model/teams/WidgetCollectionResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcq0/h$b;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcq0/h$b;

    iget v1, v0, Lcq0/h$b;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcq0/h$b;->G:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcq0/h$b;

    invoke-direct {v0, p0, p5}, Lcq0/h$b;-><init>(Lcq0/h;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p5, v6, Lcq0/h$b;->E:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcq0/h$b;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lcq0/h$b;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lcq0/h$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v1, p0, Lcq0/h;->a:Lcom/whoop/widget/api/WidgetApi;

    const/4 p5, 0x0

    iput-object p5, v6, Lcq0/h$b;->w:Ljava/lang/Object;

    iput-object p5, v6, Lcq0/h$b;->x:Ljava/lang/Object;

    iput p3, v6, Lcq0/h$b;->y:I

    iput p4, v6, Lcq0/h$b;->z:I

    iput v2, v6, Lcq0/h$b;->G:I

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v1 .. v6}, Lcom/whoop/widget/api/WidgetApi;->getUserWidgetsForCollection(Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p5, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;

    invoke-virtual {p5}, Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;->toWidgetCollectionResponse()Lcom/whoop/domain/model/teams/WidgetCollectionResponse;

    move-result-object p1

    sget-object p2, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    invoke-virtual {p2, p1}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :goto_3
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p2

    invoke-virtual {p0}, Lhj0/n;->getCrashReporter()Lrr2/c;

    move-result-object p3

    const-string p4, "Exception occurred while getting fetching user widgets"

    invoke-static {p1, p4, p2, p3}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    sget-object p2, Lcom/whoop/network/exception/DomainException;->x:Lcom/whoop/network/exception/DomainException$a;

    invoke-virtual {p2, p1}, Lcom/whoop/network/exception/DomainException$a;->a(Ljava/lang/Throwable;)Lcom/whoop/network/exception/DomainException;

    move-result-object v4

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method
