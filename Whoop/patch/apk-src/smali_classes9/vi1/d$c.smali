.class final Lvi1/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi1/d;->o(Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lvi1/c;",
        "<anonymous>",
        "(Lbc3/c0;)Lvi1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor$getOfflineState$2"
    f = "HeartHealthInteractor.kt"
    l = {
        0x9f,
        0xa1,
        0xa2
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Lvi1/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvi1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi1/d;",
            "Lq83/d<",
            "-",
            "Lvi1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvi1/d$c;->H:Lvi1/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lvi1/d$c;

    iget-object v1, p0, Lvi1/d$c;->H:Lvi1/d;

    invoke-direct {v0, v1, p2}, Lvi1/d$c;-><init>(Lvi1/d;Lq83/d;)V

    iput-object p1, v0, Lvi1/d$c;->G:Ljava/lang/Object;

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
            "Lvi1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvi1/d$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvi1/d$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvi1/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvi1/d$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lvi1/d$c;->G:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvi1/d$c;->F:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lvi1/d$c;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    iget-object v1, p0, Lvi1/d$c;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/i0;

    iget-object v1, p0, Lvi1/d$c;->w:Ljava/lang/Object;

    check-cast v1, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v0, p0, Lvi1/d$c;->E:I

    iget-object v2, p0, Lvi1/d$c;->z:Ljava/lang/Object;

    check-cast v2, [Lcom/whoop/design/models/DesignSystemModel;

    iget-object v7, p0, Lvi1/d$c;->y:Ljava/lang/Object;

    check-cast v7, [Lcom/whoop/design/models/DesignSystemModel;

    iget-object v8, p0, Lvi1/d$c;->x:Ljava/lang/Object;

    check-cast v8, Lbc3/i0;

    iget-object v9, p0, Lvi1/d$c;->w:Ljava/lang/Object;

    check-cast v9, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lvi1/d$c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v2, p0, Lvi1/d$c;->w:Ljava/lang/Object;

    check-cast v2, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object v8, v0

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lvi1/d$c$a;

    iget-object v2, p0, Lvi1/d$c;->H:Lvi1/d;

    invoke-direct {p1, v2, v6}, Lvi1/d$c$a;-><init>(Lvi1/d;Lq83/d;)V

    invoke-static {v0, v6, p1, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    new-instance v2, Lvi1/d$c$b;

    iget-object v7, p0, Lvi1/d$c;->H:Lvi1/d;

    invoke-direct {v2, v7, v6}, Lvi1/d$c$b;-><init>(Lvi1/d;Lq83/d;)V

    invoke-static {v0, v6, v2, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iput-object v6, p0, Lvi1/d$c;->G:Ljava/lang/Object;

    iput-object v6, p0, Lvi1/d$c;->w:Ljava/lang/Object;

    iput-object v0, p0, Lvi1/d$c;->x:Ljava/lang/Object;

    iput v5, p0, Lvi1/d$c;->F:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    new-array v2, v3, [Lcom/whoop/design/models/DesignSystemModel;

    iget-object p1, p0, Lvi1/d$c;->H:Lvi1/d;

    iput-object v6, p0, Lvi1/d$c;->G:Ljava/lang/Object;

    iput-object v6, p0, Lvi1/d$c;->w:Ljava/lang/Object;

    iput-object v8, p0, Lvi1/d$c;->x:Ljava/lang/Object;

    iput-object v2, p0, Lvi1/d$c;->y:Ljava/lang/Object;

    iput-object v2, p0, Lvi1/d$c;->z:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lvi1/d$c;->E:I

    iput v4, p0, Lvi1/d$c;->F:I

    invoke-static {p1, p0}, Lvi1/d;->h(Lvi1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v7, v2

    :goto_1
    aput-object p1, v2, v0

    iget-object p1, p0, Lvi1/d$c;->H:Lvi1/d;

    invoke-virtual {p1}, Lvi1/d;->m()Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;

    move-result-object p1

    aput-object p1, v7, v5

    iget-object p1, p0, Lvi1/d$c;->H:Lvi1/d;

    invoke-virtual {p1}, Lvi1/d;->n()Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    move-result-object p1

    aput-object p1, v7, v4

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    invoke-direct {v0, p1}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;-><init>(Ljava/util/List;)V

    iput-object v6, p0, Lvi1/d$c;->G:Ljava/lang/Object;

    iput-object v6, p0, Lvi1/d$c;->w:Ljava/lang/Object;

    iput-object v6, p0, Lvi1/d$c;->x:Ljava/lang/Object;

    iput-object v0, p0, Lvi1/d$c;->y:Ljava/lang/Object;

    iput-object v6, p0, Lvi1/d$c;->z:Ljava/lang/Object;

    iput v3, p0, Lvi1/d$c;->F:I

    invoke-interface {v8, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v1, Lvi1/c$c;

    invoke-direct {v1, v0, p1}, Lvi1/c$c;-><init>(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;Z)V

    return-object v1

    :cond_7
    sget-object p1, Lvi1/c$b;->a:Lvi1/c$b;

    return-object p1
.end method
