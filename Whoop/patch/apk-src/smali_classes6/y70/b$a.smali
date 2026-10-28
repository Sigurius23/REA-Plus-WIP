.class final Ly70/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly70/b;->t(Lcom/whoop/navigation/e;)V
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
    c = "com.whoop.activation.feature.orderconfirmation.presentation.OrderConfirmationViewModel$handleForwardNavigationRequest$1"
    f = "OrderConfirmationViewModel.kt"
    l = {
        0x44,
        0x46,
        0x49
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Ly70/b;

.field final synthetic z:Lcom/whoop/navigation/e;


# direct methods
.method public constructor <init>(Ly70/b;Lcom/whoop/navigation/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly70/b;",
            "Lcom/whoop/navigation/e;",
            "Lq83/d<",
            "-",
            "Ly70/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly70/b$a;->y:Ly70/b;

    iput-object p2, p0, Ly70/b$a;->z:Lcom/whoop/navigation/e;

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

    new-instance p1, Ly70/b$a;

    iget-object v0, p0, Ly70/b$a;->y:Ly70/b;

    iget-object v1, p0, Ly70/b$a;->z:Lcom/whoop/navigation/e;

    invoke-direct {p1, v0, v1, p2}, Ly70/b$a;-><init>(Ly70/b;Lcom/whoop/navigation/e;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ly70/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ly70/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ly70/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ly70/b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ly70/b$a;->x:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    iget-object v0, p0, Ly70/b$a;->w:Ljava/lang/Object;

    check-cast v0, Lv70/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Ly70/b$a;->y:Ly70/b;

    invoke-static {p1}, Ly70/b;->o(Ly70/b;)Lv70/g;

    move-result-object p1

    iget-object v1, p0, Ly70/b$a;->z:Lcom/whoop/navigation/e;

    iput v4, p0, Ly70/b$a;->x:I

    invoke-virtual {p1, v1, p0}, Lv70/g;->a(Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    check-cast p1, Lv70/a;

    instance-of v1, p1, Lv70/a$c;

    if-eqz v1, :cond_5

    iget-object v1, p0, Ly70/b$a;->y:Ly70/b;

    invoke-static {v1}, Ly70/b;->l(Ly70/b;)Ldc3/l;

    move-result-object v1

    new-instance v2, Ly70/a$c;

    check-cast p1, Lv70/a$c;

    invoke-virtual {p1}, Lv70/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v2, p1}, Ly70/a$c;-><init>(Lcom/whoop/navigation/e;)V

    iput-object v5, p0, Ly70/b$a;->w:Ljava/lang/Object;

    iput v3, p0, Ly70/b$a;->x:I

    invoke-interface {v1, v2, p0}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_1

    :cond_5
    instance-of v1, p1, Lv70/a$a;

    if-eqz v1, :cond_6

    iget-object v1, p0, Ly70/b$a;->y:Ly70/b;

    invoke-static {v1}, Ly70/b;->l(Ly70/b;)Ldc3/l;

    move-result-object v1

    new-instance v3, Ly70/a$g;

    move-object v4, p1

    check-cast v4, Lv70/a$a;

    invoke-virtual {v4}, Lv70/a$a;->a()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    check-cast p1, Lv70/a$a;

    invoke-virtual {p1}, Lv70/a$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v4, p1}, Ly70/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, p0, Ly70/b$a;->w:Ljava/lang/Object;

    iput v2, p0, Ly70/b$a;->x:I

    invoke-interface {v1, v3, p0}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_1
    return-object v0

    :cond_6
    sget-object v0, Lv70/a$b;->a:Lv70/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_8

    :cond_7
    :goto_2
    iget-object p1, p0, Ly70/b$a;->y:Ly70/b;

    invoke-static {p1}, Ly70/b;->j(Ly70/b;)Lec3/p1;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v5, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    :try_start_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    iget-object v0, p0, Ly70/b$a;->y:Ly70/b;

    invoke-static {v0}, Ly70/b;->j(Ly70/b;)Lec3/p1;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p1
.end method
