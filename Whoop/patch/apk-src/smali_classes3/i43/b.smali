.class public final Li43/b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final synthetic d:I


# instance fields
.field public final a:Ll83/p;

.field public b:Lt23/c0;

.field public c:Z


# direct methods
.method public constructor <init>(Lhc3/d;)V
    .locals 7

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const-string v0, "ToggleCameraBroadcastReceiver"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Li43/b;->a:Ll83/p;

    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    invoke-virtual {p0}, Li43/b;->a()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v5, v0

    check-cast v5, Lt23/b4;

    iget-object v5, v5, Lt23/b4;->U:Lt23/g1;

    if-eqz v5, :cond_0

    iget-object v5, v5, Lt23/g1;->h:Lec3/h2;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt23/c0;

    if-eqz v5, :cond_0

    iget-object v5, v5, Lt23/c0;->v:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    const-string v6, "Init active call value: "

    invoke-static {v6, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v1, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {p0}, Li43/b;->a()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v5, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    if-eqz v0, :cond_2

    move-object v5, v0

    check-cast v5, Lt23/b4;

    iget-object v5, v5, Lt23/b4;->U:Lt23/g1;

    if-eqz v5, :cond_2

    iget-object v5, v5, Lt23/g1;->g:Lec3/h2;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt23/c0;

    if-eqz v5, :cond_2

    iget-object v5, v5, Lt23/c0;->v:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v5, v4

    :goto_1
    const-string v6, "Init ringing call value: "

    invoke-static {v6, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v1, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    if-eqz v0, :cond_5

    move-object v1, v0

    check-cast v1, Lt23/b4;

    iget-object v2, v1, Lt23/b4;->U:Lt23/g1;

    iget-object v2, v2, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/c0;

    if-nez v2, :cond_4

    iget-object v1, v1, Lt23/b4;->U:Lt23/g1;

    iget-object v1, v1, Lt23/g1;->g:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lt23/c0;

    :cond_4
    iput-object v2, p0, Li43/b;->b:Lt23/c0;

    if-nez v2, :cond_5

    new-instance v1, Lh20/i0;

    const/16 v2, 0xc

    invoke-direct {v1, v0, p0, v4, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {p1, v4, v4, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_5
    return-void
.end method


# virtual methods
.method public final a()Lb23/k;
    .locals 1

    iget-object v0, p0, Li43/b;->a:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x7ed8ea7f

    const/4 v1, 0x0

    if-eq p2, v0, :cond_6

    const v0, -0x56ac2893

    if-eq p2, v0, :cond_4

    const v0, 0x311a1d6c

    if-eq p2, v0, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string p2, "android.intent.action.USER_PRESENT"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-virtual {p0}, Li43/b;->a()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object p2, p0, Li43/b;->b:Lt23/c0;

    if-eqz p2, :cond_2

    iget-object p2, p2, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_0

    :cond_2
    move-object p2, v1

    :goto_0
    const-string v3, "Screen is on and unlocked. Call: "

    invoke-static {v3, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v2, v0, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-boolean p1, p0, Li43/b;->c:Z

    if-eqz p1, :cond_c

    iget-object p1, p0, Li43/b;->b:Lt23/c0;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Lt23/c0;->e()Lt23/e1;

    move-result-object p1

    if-eqz p1, :cond_c

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lt23/e1;->e(Z)V

    return-void

    :cond_4
    const-string p2, "android.intent.action.SCREEN_ON"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Li43/b;->a()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_c

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object p2, p0, Li43/b;->b:Lt23/c0;

    if-eqz p2, :cond_5

    iget-object p2, p2, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_1

    :cond_5
    move-object p2, v1

    :goto_1
    const-string v3, "Screen is on and locked. Call: "

    invoke-static {v3, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v2, v0, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_6
    const-string p2, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_5

    :cond_7
    iget-object p1, p0, Li43/b;->b:Lt23/c0;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lt23/c0;->e()Lt23/e1;

    move-result-object p1

    goto :goto_2

    :cond_8
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_9

    iget-object p2, p1, Lt23/e1;->l:Ln53/e;

    if-eqz p2, :cond_9

    iget-object p2, p2, Ln53/e;->y:Ll83/e;

    check-cast p2, Lkotlin/jvm/internal/m;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_3

    :cond_9
    const/4 p2, 0x0

    :goto_3
    iput-boolean p2, p0, Li43/b;->c:Z

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lt23/e1;->c()V

    :cond_a
    invoke-virtual {p0}, Li43/b;->a()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_c

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object p2, p0, Li43/b;->b:Lt23/c0;

    if-eqz p2, :cond_b

    iget-object p2, p2, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_4

    :cond_b
    move-object p2, v1

    :goto_4
    iget-boolean v3, p0, Li43/b;->c:Z

    const-string v4, ". Should re-enable camera: "

    const-string v5, "."

    const-string v6, "Screen is off. Call: "

    invoke-static {v6, p2, v4, v5, v3}, Lnh3/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v2, v0, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    :goto_5
    return-void
.end method
