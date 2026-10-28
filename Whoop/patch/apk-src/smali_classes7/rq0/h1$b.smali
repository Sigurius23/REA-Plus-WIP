.class final Lrq0/h1$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/h1;->h0(II)Lxg3/g;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "Lxg3/g;",
        "Lcom/whoop/domain/model/RecordsDto;",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "<anonymous>",
        "(Lbc3/c0;)Lxg3/g;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.presentation.teams.TeamsViewModel$getUsers$1"
    f = "TeamsViewModel.kt"
    l = {
        0xa2
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Lrq0/h1;

.field final synthetic G:I

.field final synthetic H:I

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lrq0/h1;IILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq0/h1;",
            "II",
            "Lq83/d<",
            "-",
            "Lrq0/h1$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrq0/h1$b;->F:Lrq0/h1;

    iput p2, p0, Lrq0/h1$b;->G:I

    iput p3, p0, Lrq0/h1$b;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lrq0/h1$b;

    iget-object v0, p0, Lrq0/h1$b;->F:Lrq0/h1;

    iget v1, p0, Lrq0/h1$b;->G:I

    iget v2, p0, Lrq0/h1$b;->H:I

    invoke-direct {p1, v0, v1, v2, p2}, Lrq0/h1$b;-><init>(Lrq0/h1;IILq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lxg3/g<",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/TeamUser;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lrq0/h1$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrq0/h1$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrq0/h1$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrq0/h1$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lrq0/h1$b;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v0, p0, Lrq0/h1$b;->z:I

    iget v1, p0, Lrq0/h1$b;->y:I

    iget v2, p0, Lrq0/h1$b;->x:I

    iget-object v3, p0, Lrq0/h1$b;->w:Ljava/lang/Object;

    check-cast v3, Lcq0/g;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v3

    move v3, v0

    move-object v0, v6

    move v6, v2

    move v2, v1

    move v1, v6

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrq0/h1$b;->F:Lrq0/h1;

    invoke-static {p1}, Lrq0/h1;->E(Lrq0/h1;)Lcq0/g;

    move-result-object v3

    iget-object p1, p0, Lrq0/h1$b;->F:Lrq0/h1;

    invoke-static {p1}, Lrq0/h1;->F(Lrq0/h1;)Lrq0/i1;

    move-result-object p1

    invoke-virtual {p1}, Lrq0/i1;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iget v1, p0, Lrq0/h1$b;->G:I

    iget v4, p0, Lrq0/h1$b;->H:I

    iget-object v5, p0, Lrq0/h1$b;->F:Lrq0/h1;

    iput-object v3, p0, Lrq0/h1$b;->w:Ljava/lang/Object;

    iput p1, p0, Lrq0/h1$b;->x:I

    iput v1, p0, Lrq0/h1$b;->y:I

    iput v4, p0, Lrq0/h1$b;->z:I

    iput v2, p0, Lrq0/h1$b;->E:I

    invoke-virtual {v5, p0}, Lrq0/h1;->F0(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    return-object v0

    :cond_3
    move v0, v1

    move v1, p1

    move-object p1, v2

    move v2, v0

    move-object v0, v3

    move v3, v4

    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v4

    iget-object p1, p0, Lrq0/h1$b;->F:Lrq0/h1;

    invoke-static {p1}, Lrq0/h1;->F(Lrq0/h1;)Lrq0/i1;

    move-result-object p1

    invoke-virtual {p1}, Lrq0/i1;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getTeamType()Lcom/whoop/domain/model/teams/TeamType;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    move-object v5, p1

    goto :goto_4

    :cond_5
    :goto_3
    sget-object p1, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    goto :goto_2

    :goto_4
    invoke-virtual/range {v0 .. v5}, Lcq0/g;->U(IIIILcom/whoop/domain/model/teams/TeamType;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method
