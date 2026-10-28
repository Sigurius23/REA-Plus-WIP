.class final Lj70/d$j;
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
    c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler$handle$9"
    f = "ScreenSpecificForwardActionHandler.kt"
    l = {
        0x189
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/activation/iajf/domain/SignUpSource;

.field w:I

.field final synthetic x:Lj70/d;

.field final synthetic y:Lf70/e$b;

.field final synthetic z:Lcom/whoop/activation/domain/models/ActivationFlowStepModel;


# direct methods
.method public constructor <init>(Lj70/d;Lf70/e$b;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj70/d;",
            "Lf70/e$b;",
            "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;",
            "Lcom/whoop/activation/iajf/domain/SignUpSource;",
            "Lq83/d<",
            "-",
            "Lj70/d$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj70/d$j;->x:Lj70/d;

    iput-object p2, p0, Lj70/d$j;->y:Lf70/e$b;

    iput-object p3, p0, Lj70/d$j;->z:Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    iput-object p4, p0, Lj70/d$j;->E:Lcom/whoop/activation/iajf/domain/SignUpSource;

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

    new-instance v0, Lj70/d$j;

    iget-object v1, p0, Lj70/d$j;->x:Lj70/d;

    iget-object v2, p0, Lj70/d$j;->y:Lf70/e$b;

    iget-object v3, p0, Lj70/d$j;->z:Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    iget-object v4, p0, Lj70/d$j;->E:Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lj70/d$j;-><init>(Lj70/d;Lf70/e$b;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)V

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
            "Lf70/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lj70/d$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj70/d$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj70/d$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj70/d$j;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj70/d$j;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj70/d$j;->x:Lj70/d;

    invoke-static {p1}, Lj70/d;->a(Lj70/d;)Lf70/x;

    move-result-object v3

    iget-object p1, p0, Lj70/d$j;->y:Lf70/e$b;

    invoke-virtual {p1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object p1

    invoke-virtual {p1}, Lf70/q0;->j()Ld70/c;

    move-result-object p1

    invoke-virtual {p1}, Ld70/c;->a()Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lj70/d$j;->z:Lcom/whoop/activation/domain/models/ActivationFlowStepModel;

    move-object v5, p1

    check-cast v5, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;

    iget-object p1, p0, Lj70/d$j;->y:Lf70/e$b;

    invoke-virtual {p1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v6

    iget-object v7, p0, Lj70/d$j;->E:Lcom/whoop/activation/iajf/domain/SignUpSource;

    iput v2, p0, Lj70/d$j;->w:I

    move-object v8, p0

    invoke-virtual/range {v3 .. v8}, Lf70/x;->b(Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
