.class final Liq0/b0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liq0/b0;->D()V
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
    c = "com.whoop.community.presentation.chat.NotificationSettingsViewModel$getNotificationSettings$1"
    f = "NotificationSettingsViewModel.kt"
    l = {
        0x5b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Liq0/b0;


# direct methods
.method public constructor <init>(Liq0/b0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liq0/b0;",
            "Lq83/d<",
            "-",
            "Liq0/b0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liq0/b0$b;->x:Liq0/b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Liq0/b0$b;

    iget-object v0, p0, Liq0/b0$b;->x:Liq0/b0;

    invoke-direct {p1, v0, p2}, Liq0/b0$b;-><init>(Liq0/b0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Liq0/b0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liq0/b0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liq0/b0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liq0/b0$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Liq0/b0$b;->w:I

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

    iget-object p1, p0, Liq0/b0$b;->x:Liq0/b0;

    invoke-static {p1}, Liq0/b0;->w(Liq0/b0;)Lcq0/a;

    move-result-object p1

    iget-object v1, p0, Liq0/b0$b;->x:Liq0/b0;

    invoke-virtual {v1}, Liq0/b0;->C()I

    move-result v1

    iput v2, p0, Liq0/b0$b;->w:I

    invoke-virtual {p1, v1, p0}, Lcq0/a;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getSuccess()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbq0/d;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lbq0/d;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Liq0/b0$b;->x:Liq0/b0;

    invoke-virtual {v0}, Liq0/b0;->G()Landroidx/lifecycle/p0;

    move-result-object v1

    invoke-static {v0, v1, p1}, Liq0/b0;->B(Liq0/b0;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Liq0/b0$b;->x:Liq0/b0;

    invoke-static {p1}, Liq0/b0;->y(Liq0/b0;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Get notification settings failed"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
