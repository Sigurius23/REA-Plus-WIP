.class final Lcom/whoop/ui/home/redesign/view/MainActivity$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/home/redesign/view/MainActivity;->e0(Lbc3/c0;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lxm2/a;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lxm2/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ui.home.redesign.view.MainActivity$collectNavEvents$1"
    f = "MainActivity.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/ui/home/redesign/view/MainActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/home/redesign/view/MainActivity;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/home/redesign/view/MainActivity$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

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

    new-instance v0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;

    iget-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {v0, v1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$d;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lxm2/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxm2/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/home/redesign/view/MainActivity$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxm2/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->f(Lxm2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->x:Ljava/lang/Object;

    check-cast v0, Lxm2/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->w:I

    if-nez v1, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lxm2/a$b;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->O(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lwm2/b;

    move-result-object p1

    new-instance v1, Lxm2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lxm2/b$a;-><init>(Landroid/net/Uri;)V

    invoke-virtual {p1, v1}, Lwm2/b;->o(Lxm2/b;)V

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->F(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lvm2/d;

    move-result-object p1

    new-instance v1, Lj02/m0$v4;

    check-cast v0, Lxm2/a$b;

    invoke-virtual {v0}, Lxm2/a$b;->a()Lxm2/c;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lxm2/c;->a()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {v0}, Lxm2/a$b;->a()Lxm2/c;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lxm2/c;->c()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    invoke-virtual {v0}, Lxm2/a$b;->a()Lxm2/c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lxm2/c;->b()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-direct {v1, v3, v4, v2}, Lj02/m0$v4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$d;->y:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->J(Lcom/whoop/ui/home/redesign/view/MainActivity;)Ltr2/n;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not find the navigation event for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
