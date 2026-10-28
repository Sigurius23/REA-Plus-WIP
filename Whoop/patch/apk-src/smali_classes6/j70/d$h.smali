.class final Lj70/d$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj70/d;->k(Lec3/m;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;
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
        "Lf70/f;",
        "<anonymous>",
        "(Lbc3/c0;)Lf70/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$handle$6"
    f = "ScreenSpecificForwardActionHandler.kt"
    l = {
        0xbb,
        0xc1
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lj70/d;

.field final synthetic z:Lf70/e$b;


# direct methods
.method public constructor <init>(Lj70/d;Lf70/e$b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj70/d;",
            "Lf70/e$b;",
            "Lq83/d<",
            "-",
            "Lj70/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj70/d$h;->y:Lj70/d;

    iput-object p2, p0, Lj70/d$h;->z:Lf70/e$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lj70/d$h;

    iget-object v0, p0, Lj70/d$h;->y:Lj70/d;

    iget-object v1, p0, Lj70/d$h;->z:Lf70/e$b;

    invoke-direct {p1, v0, v1, p2}, Lj70/d$h;-><init>(Lj70/d;Lf70/e$b;Lq83/d;)V

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
            "Lf70/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lj70/d$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj70/d$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj70/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj70/d$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj70/d$h;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lj70/d$h;->w:Ljava/lang/Object;

    check-cast v0, Lf70/f;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj70/d$h;->y:Lj70/d;

    invoke-static {p1}, Lj70/d;->d(Lj70/d;)Lf70/w0;

    move-result-object p1

    iget-object v1, p0, Lj70/d$h;->z:Lf70/e$b;

    iget-object v4, p0, Lj70/d$h;->y:Lj70/d;

    invoke-static {v4}, Lj70/d;->c(Lj70/d;)Lod1/j;

    move-result-object v4

    invoke-virtual {v4}, Lod1/j;->a()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    move v4, v3

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    iput v3, p0, Lj70/d$h;->x:I

    invoke-virtual {p1, v1, v4, p0}, Lf70/w0;->h(Lf70/e$b;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lf70/f;

    invoke-virtual {p1}, Lf70/f;->f()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lj70/d$h;->z:Lf70/e$b;

    invoke-virtual {v1}, Lf70/e$b;->m()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_5

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    instance-of v3, v3, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;

    if-eqz v3, :cond_6

    iget-object v1, p0, Lj70/d$h;->y:Lj70/d;

    invoke-static {v1}, Lj70/d;->g(Lj70/d;)Lf70/d1;

    move-result-object v3

    invoke-virtual {p1}, Lf70/f;->e()Lf70/e$b;

    move-result-object v4

    const/4 p1, 0x0

    iput-object p1, p0, Lj70/d$h;->w:Ljava/lang/Object;

    iput v2, p0, Lj70/d$h;->x:I

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v3 .. v8}, Lf70/d1;->c(Lf70/d1;Lf70/e$b;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    :goto_3
    check-cast p1, Lf70/f;

    :cond_8
    :goto_4
    return-object p1
.end method
