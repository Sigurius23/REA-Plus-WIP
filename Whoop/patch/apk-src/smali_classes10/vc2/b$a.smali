.class final Lvc2/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc2/b;->g(Ljava/lang/String;)Lec3/l;
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
        "Lvc2/c;",
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
    c = "com.whoop.settings.switchPlan.domain.SwitchBillingPlanModalInteractor$fetchSwitchBillingPlanModalInfo$1"
    f = "SwitchBillingPlanModalInteractor.kt"
    l = {
        0x1b,
        0x1c,
        0x1f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvc2/b;


# direct methods
.method public constructor <init>(Lvc2/b;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc2/b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvc2/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvc2/b$a;->z:Lvc2/b;

    iput-object p2, p0, Lvc2/b$a;->E:Ljava/lang/String;

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

    new-instance v0, Lvc2/b$a;

    iget-object v1, p0, Lvc2/b$a;->z:Lvc2/b;

    iget-object v2, p0, Lvc2/b$a;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lvc2/b$a;-><init>(Lvc2/b;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lvc2/b$a;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvc2/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvc2/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvc2/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvc2/b$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lvc2/b$a;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lvc2/b$a;->x:I

    const/4 v10, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v11, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v10, :cond_0

    iget-object v0, p0, Lvc2/b$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lvc2/c$c;->a:Lvc2/c$c;

    iput-object v8, p0, Lvc2/b$a;->y:Ljava/lang/Object;

    iput v2, p0, Lvc2/b$a;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lvc2/b$a;->z:Lvc2/b;

    invoke-static {v2}, Lvc2/b;->e(Lvc2/b;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lvc2/b$a$a;

    iget-object v3, p0, Lvc2/b$a;->z:Lvc2/b;

    iget-object v6, p0, Lvc2/b$a;->E:Ljava/lang/String;

    invoke-direct {v4, v3, v6, v11}, Lvc2/b$a$a;-><init>(Lvc2/b;Ljava/lang/String;Lq83/d;)V

    iput-object v8, p0, Lvc2/b$a;->y:Ljava/lang/Object;

    iput v1, p0, Lvc2/b$a;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_6

    new-instance v0, Lvc2/c$a;

    sget-object v1, Lxc2/a;->FETCH_BILLING_MODAL_ERROR:Lxc2/a;

    iget-object v2, p0, Lvc2/b$a;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lvc2/c$a;-><init>(Lxc2/a;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_8

    new-instance v1, Lvc2/c$b;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;

    iget-object v2, p0, Lvc2/b$a;->E:Ljava/lang/String;

    invoke-direct {v1, v0, v2}, Lvc2/c$b;-><init>(Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;Ljava/lang/String;)V

    move-object v0, v1

    :goto_2
    iput-object v11, p0, Lvc2/b$a;->y:Ljava/lang/Object;

    iput-object v11, p0, Lvc2/b$a;->w:Ljava/lang/Object;

    iput v10, p0, Lvc2/b$a;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    :goto_3
    return-object v9

    :cond_7
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
