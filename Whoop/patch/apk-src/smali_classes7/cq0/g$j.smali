.class final Lcq0/g$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/g;->z(IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)I"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.data.repository.TeamsRepository$getCommunityMemberCount$2"
    f = "TeamsRepository.kt"
    l = {
        0xaa
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/domain/model/teams/TeamType;

.field w:I

.field final synthetic x:Lcq0/g;

.field final synthetic y:I

.field final synthetic z:I


# direct methods
.method public constructor <init>(Lcq0/g;IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq0/g;",
            "II",
            "Lcom/whoop/domain/model/teams/TeamType;",
            "Lq83/d<",
            "-",
            "Lcq0/g$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcq0/g$j;->x:Lcq0/g;

    iput p2, p0, Lcq0/g$j;->y:I

    iput p3, p0, Lcq0/g$j;->z:I

    iput-object p4, p0, Lcq0/g$j;->E:Lcom/whoop/domain/model/teams/TeamType;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcq0/g$j;

    iget-object v1, p0, Lcq0/g$j;->x:Lcq0/g;

    iget v2, p0, Lcq0/g$j;->y:I

    iget v3, p0, Lcq0/g$j;->z:I

    iget-object v4, p0, Lcq0/g$j;->E:Lcom/whoop/domain/model/teams/TeamType;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcq0/g$j;-><init>(Lcq0/g;IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcq0/g$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcq0/g$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcq0/g$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcq0/g$j;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcq0/g$j;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v9, p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v9, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcq0/g$j;->x:Lcq0/g;

    invoke-virtual {p1}, Lcq0/g;->y()Lcom/whoop/service/network/CommunityApi;

    move-result-object v3

    iget v4, p0, Lcq0/g$j;->y:I

    iget v7, p0, Lcq0/g$j;->z:I

    iget-object p1, p0, Lcq0/g$j;->E:Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamType;->getValue()Ljava/lang/String;

    move-result-object v8

    iput v2, p0, Lcq0/g$j;->w:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v5, 0x0

    const/16 v6, 0x32

    move-object v9, p0

    :try_start_2
    invoke-interface/range {v3 .. v9}, Lcom/whoop/service/network/CommunityApi;->getCommunityMembers(IIIILjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    invoke-virtual {p1}, Lcom/whoop/domain/model/RecordsDto;->getTotalCount()I

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v9, p0

    goto :goto_1

    :goto_2
    iget-object v0, v9, Lcq0/g$j;->x:Lcq0/g;

    invoke-virtual {v0}, Lcq0/g;->F()Ltr2/n;

    move-result-object v0

    const-string v1, "Error in getCommunityMemberCount: "

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move p1, v2

    :goto_3
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    return-object v0
.end method
