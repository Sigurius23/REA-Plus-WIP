.class final Lcom/whoop/activation/view/ActivationFragment$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/activation/view/ActivationFragment;->K(Lc93/a;)V
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
    c = "com.whoop.activation.view.ActivationFragment$askPermission$1"
    f = "ActivationFragment.kt"
    l = {
        0x6a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/activation/view/ActivationFragment;

.field final synthetic y:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/activation/view/ActivationFragment;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/activation/view/ActivationFragment;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/activation/view/ActivationFragment$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/activation/view/ActivationFragment$a;->x:Lcom/whoop/activation/view/ActivationFragment;

    iput-object p2, p0, Lcom/whoop/activation/view/ActivationFragment$a;->y:Lc93/a;

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

    new-instance p1, Lcom/whoop/activation/view/ActivationFragment$a;

    iget-object v0, p0, Lcom/whoop/activation/view/ActivationFragment$a;->x:Lcom/whoop/activation/view/ActivationFragment;

    iget-object v1, p0, Lcom/whoop/activation/view/ActivationFragment$a;->y:Lc93/a;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/activation/view/ActivationFragment$a;-><init>(Lcom/whoop/activation/view/ActivationFragment;Lc93/a;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/activation/view/ActivationFragment$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/activation/view/ActivationFragment$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/activation/view/ActivationFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/activation/view/ActivationFragment$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/activation/view/ActivationFragment$a;->w:I

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

    iget-object p1, p0, Lcom/whoop/activation/view/ActivationFragment$a;->x:Lcom/whoop/activation/view/ActivationFragment;

    invoke-static {p1}, Lcom/whoop/activation/view/ActivationFragment;->I(Lcom/whoop/activation/view/ActivationFragment;)Lm32/a;

    move-result-object p1

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    invoke-interface {p1, v1}, Lm32/a;->a(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/whoop/activation/view/ActivationFragment$a;->x:Lcom/whoop/activation/view/ActivationFragment;

    invoke-static {p1}, Lcom/whoop/activation/view/ActivationFragment;->J(Lcom/whoop/activation/view/ActivationFragment;)Lm32/c;

    move-result-object p1

    iput v2, p0, Lcom/whoop/activation/view/ActivationFragment$a;->w:I

    invoke-interface {p1, v2, p0}, Lm32/c;->x(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/whoop/activation/view/ActivationFragment$a;->y:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
