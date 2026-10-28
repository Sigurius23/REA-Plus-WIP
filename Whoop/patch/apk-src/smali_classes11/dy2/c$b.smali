.class final Ldy2/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldy2/c;->e(ILq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Ldy2/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.feature.campaignschedule.interactor.CampaignScheduleInteractor$loadCampaignSchedule$2"
    f = "CampaignScheduleInteractor.kt"
    l = {
        0x18,
        0x1b,
        0x1a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Ldy2/c;


# direct methods
.method public constructor <init>(Ldy2/c;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldy2/c;",
            "I",
            "Lq83/d<",
            "-",
            "Ldy2/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldy2/c$b;->z:Ldy2/c;

    iput p2, p0, Ldy2/c$b;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Ldy2/c$b;

    iget-object v1, p0, Ldy2/c$b;->z:Ldy2/c;

    iget v2, p0, Ldy2/c$b;->E:I

    invoke-direct {v0, v1, v2, p2}, Ldy2/c$b;-><init>(Ldy2/c;ILq83/d;)V

    iput-object p1, v0, Ldy2/c$b;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldy2/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldy2/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldy2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldy2/c$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ldy2/c$b;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldy2/c$b;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Ldy2/c$b;->w:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Ldy2/b$c;->a:Ldy2/b$c;

    iput-object v0, p0, Ldy2/c$b;->y:Ljava/lang/Object;

    iput v5, p0, Ldy2/c$b;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    iget-object p1, p0, Ldy2/c$b;->z:Ldy2/c;

    invoke-static {p1}, Ldy2/c;->b(Ldy2/c;)Ltr2/n;

    move-result-object p1

    iget v2, p0, Ldy2/c$b;->E:I

    const-string v5, "Loading campaign schedule for campaignId: "

    invoke-static {v2, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {p1, v2, v5}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ldy2/c$b;->z:Ldy2/c;

    invoke-static {p1}, Ldy2/c;->a(Ldy2/c;)Lex2/b;

    move-result-object p1

    iget v2, p0, Ldy2/c$b;->E:I

    iput-object v6, p0, Ldy2/c$b;->y:Ljava/lang/Object;

    iput-object v0, p0, Ldy2/c$b;->w:Ljava/lang/Object;

    iput v4, p0, Ldy2/c$b;->x:I

    invoke-virtual {p1, v2, p0}, Lex2/b;->k(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    iget v2, p0, Ldy2/c$b;->E:I

    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;

    if-eqz p1, :cond_6

    new-instance v2, Ldy2/b$a;

    invoke-direct {v2, p1}, Ldy2/b$a;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;)V

    goto :goto_2

    :cond_6
    new-instance p1, Ldy2/b$b;

    invoke-direct {p1, v2}, Ldy2/b$b;-><init>(I)V

    move-object v2, p1

    :goto_2
    iput-object v6, p0, Ldy2/c$b;->y:Ljava/lang/Object;

    iput-object v6, p0, Ldy2/c$b;->w:Ljava/lang/Object;

    iput v3, p0, Ldy2/c$b;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
