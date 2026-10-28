.class public final Lp6/d0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp6/b;

.field public final synthetic F:Lp6/g0;

.field public final synthetic G:Landroid/os/Bundle;

.field public final synthetic H:Lc93/n;

.field public w:Z

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lp6/b;Lp6/g0;Landroid/os/Bundle;Lc93/n;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lp6/d0;->z:Landroid/content/Context;

    iput-object p2, p0, Lp6/d0;->E:Lp6/b;

    iput-object p3, p0, Lp6/d0;->F:Lp6/g0;

    iput-object p4, p0, Lp6/d0;->G:Landroid/os/Bundle;

    iput-object p5, p0, Lp6/d0;->H:Lc93/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lp6/d0;

    iget-object v4, p0, Lp6/d0;->G:Landroid/os/Bundle;

    iget-object v5, p0, Lp6/d0;->H:Lc93/n;

    iget-object v1, p0, Lp6/d0;->z:Landroid/content/Context;

    iget-object v2, p0, Lp6/d0;->E:Lp6/b;

    iget-object v3, p0, Lp6/d0;->F:Lp6/g0;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lp6/d0;-><init>(Landroid/content/Context;Lp6/b;Lp6/g0;Landroid/os/Bundle;Lc93/n;Lq83/d;)V

    iput-object p1, v0, Lp6/d0;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx6/k;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp6/d0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp6/d0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp6/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp6/d0;->x:I

    iget-object v2, p0, Lp6/d0;->z:Landroid/content/Context;

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    iget-object v6, p0, Lp6/d0;->E:Lp6/b;

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v1, p0, Lp6/d0;->w:Z

    iget-object v2, p0, Lp6/d0;->y:Ljava/lang/Object;

    check-cast v2, Lx6/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lp6/d0;->y:Ljava/lang/Object;

    check-cast v1, Lx6/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp6/d0;->y:Ljava/lang/Object;

    check-cast p1, Lx6/k;

    iget v1, v6, Lp6/b;->a:I

    invoke-static {v1}, Lvd/e;->l(I)Ljava/lang/String;

    move-result-object v1

    iput-object p1, p0, Lp6/d0;->y:Ljava/lang/Object;

    iput v5, p0, Lp6/d0;->x:I

    invoke-virtual {p1, v2, v1, p0}, Lx6/k;->a(Landroid/content/Context;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object v8, v1

    move-object v1, p1

    move-object p1, v8

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object v5, p0, Lp6/d0;->F:Lp6/g0;

    iget-object v7, p0, Lp6/d0;->G:Landroid/os/Bundle;

    invoke-virtual {v5, v2, v6, v7}, Lp6/g0;->a(Landroid/content/Context;Lp6/b;Landroid/os/Bundle;)Lp6/l;

    move-result-object v5

    iput-object v1, p0, Lp6/d0;->y:Ljava/lang/Object;

    iput-boolean p1, p0, Lp6/d0;->w:Z

    iput v4, p0, Lp6/d0;->x:I

    invoke-virtual {v1, v2, v5, p0}, Lx6/k;->c(Landroid/content/Context;Lp6/l;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, v1

    move v1, p1

    :goto_1
    move p1, v1

    move-object v1, v2

    :cond_6
    iget v2, v6, Lp6/b;->a:I

    invoke-static {v2}, Lvd/e;->l(I)Ljava/lang/String;

    move-result-object v2

    iget-object v4, v1, Lx6/k;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp6/l;

    const-string v4, "null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v4, 0x0

    iput-object v4, p0, Lp6/d0;->y:Ljava/lang/Object;

    iput v3, p0, Lp6/d0;->x:I

    iget-object v3, p0, Lp6/d0;->H:Lc93/n;

    invoke-interface {v3, v1, v2, p1, p0}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    return-object p1
.end method
