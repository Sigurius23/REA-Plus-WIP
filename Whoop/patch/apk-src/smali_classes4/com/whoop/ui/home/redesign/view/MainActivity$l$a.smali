.class final Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/home/redesign/view/MainActivity$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.ui.home.redesign.view.MainActivity$onActivityCreated$2$1"
    f = "MainActivity.kt"
    l = {
        0xef
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/ui/home/redesign/view/MainActivity;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/home/redesign/view/MainActivity;",
            "Z",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    iput-boolean p2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->z:Z

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

    new-instance v0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;

    iget-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    iget-boolean v2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->z:Z

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;ZLq83/d;)V

    iput-object p1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    iput-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->x:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->w:I

    invoke-static {p1, p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->D(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_2

    return-object v1

    :goto_0
    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->J(Lcom/whoop/ui/home/redesign/view/MainActivity;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "App navigator setup failed"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    iget-boolean v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->z:Z

    invoke-static {p1, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->Y(Lcom/whoop/ui/home/redesign/view/MainActivity;Z)V

    iget-boolean p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->z:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$l$a;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->I(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lvm2/j;

    move-result-object p1

    invoke-virtual {p1}, Lvm2/j;->c()V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
