.class final Loy2/e$n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->r0(Loy2/a;Lq83/d;)Ljava/lang/Object;
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
        "Loy2/l;",
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
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$handleAction$2"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x78
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Loy2/e;

.field final synthetic z:Loy2/a;


# direct methods
.method public constructor <init>(Loy2/e;Loy2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/e;",
            "Loy2/a;",
            "Lq83/d<",
            "-",
            "Loy2/e$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$n;->y:Loy2/e;

    iput-object p2, p0, Loy2/e$n;->z:Loy2/a;

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

    new-instance v0, Loy2/e$n;

    iget-object v1, p0, Loy2/e$n;->y:Loy2/e;

    iget-object v2, p0, Loy2/e$n;->z:Loy2/a;

    invoke-direct {v0, v1, v2, p2}, Loy2/e$n;-><init>(Loy2/e;Loy2/a;Lq83/d;)V

    iput-object p1, v0, Loy2/e$n;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Loy2/e$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$n;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Loy2/e$n;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Loy2/e$n;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Loy2/e$n;->y:Loy2/e;

    invoke-static {p1}, Loy2/e;->z(Loy2/e;)I

    move-result v2

    iget-object v4, p0, Loy2/e$n;->z:Loy2/a;

    check-cast v4, Loy2/a$b0;

    invoke-virtual {v4}, Loy2/a$b0;->a()Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-result-object v4

    invoke-static {p1, v2, v4}, Loy2/e;->c0(Loy2/e;ILcom/whoop/whooplabs/data/domain/SurveyProvider;)Lec3/l;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, p0, Loy2/e$n;->x:Ljava/lang/Object;

    iput v3, p0, Loy2/e$n;->w:I

    invoke-static {v0, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
