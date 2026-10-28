.class final Ld80/e$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld80/e;->w(ZLkotlin/jvm/functions/Function1;Lny0/h;Lcom/whoop/activation/iajf/domain/SignUpSource;ZLcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lp1/c1;Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lkotlin/jvm/functions/Function1;)V
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
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.iajf.view.IAJFBffScreensContainerKt$IAJFBffScreensContainer$9$4$1$handleCardButtonTap$1"
    f = "IAJFBffScreensContainer.kt"
    l = {
        0x131
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic F:Lcom/whoop/activation/iajf/domain/SignUpSource;

.field w:I

.field final synthetic x:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field

.field final synthetic y:Lm91/u;

.field final synthetic z:Lg80/g;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3;",
            "Lm91/u;",
            "Lg80/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/whoop/activation/iajf/domain/SignUpSource;",
            "Lq83/d<",
            "-",
            "Ld80/e$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ld80/e$f;->x:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Ld80/e$f;->y:Lm91/u;

    iput-object p3, p0, Ld80/e$f;->z:Lg80/g;

    iput-object p4, p0, Ld80/e$f;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ld80/e$f;->F:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Ld80/e$f;

    iget-object v1, p0, Ld80/e$f;->x:Lkotlin/jvm/functions/Function3;

    iget-object v2, p0, Ld80/e$f;->y:Lm91/u;

    iget-object v3, p0, Ld80/e$f;->z:Lg80/g;

    iget-object v4, p0, Ld80/e$f;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ld80/e$f;->F:Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ld80/e$f;-><init>(Lkotlin/jvm/functions/Function3;Lm91/u;Lg80/g;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ld80/e$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld80/e$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld80/e$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld80/e$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld80/e$f;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld80/e$f;->x:Lkotlin/jvm/functions/Function3;

    iget-object v1, p0, Ld80/e$f;->y:Lm91/u;

    iget-object v3, p0, Ld80/e$f;->z:Lg80/g;

    invoke-virtual {v3}, Lg80/g;->e()Lf70/q0;

    move-result-object v3

    iput v2, p0, Ld80/e$f;->w:I

    invoke-interface {p1, v1, v3, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Ld80/e$f;->E:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lj80/a$c0;

    iget-object v3, p0, Ld80/e$f;->F:Lcom/whoop/activation/iajf/domain/SignUpSource;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lj80/a$c0;-><init>(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
