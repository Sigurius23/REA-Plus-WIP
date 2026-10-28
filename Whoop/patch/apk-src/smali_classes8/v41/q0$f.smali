.class final Lv41/q0$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/q0;->l(Landroidx/compose/ui/Modifier;Lv41/r0;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IZLjava/lang/Float;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;III)V
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u0012\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lp1/r1;",
        "",
        "Lui/a0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lp1/r1;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.WhoopLottieOverrideViewKt$WhoopLottieOverrideView$overlayDynamicProperties$2$1"
    f = "WhoopLottieOverrideView.kt"
    l = {
        0x93,
        0x98
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Lv41/r0;

.field final synthetic J:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic K:Landroid/content/Context;

.field final synthetic L:Lui/p;

.field final synthetic M:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lv41/r0;Lc93/a;Landroid/content/Context;Lui/p;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv41/r0;",
            "Lc93/a;",
            "Landroid/content/Context;",
            "Lui/p;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lv41/q0$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/q0$f;->H:Ljava/lang/String;

    iput-object p2, p0, Lv41/q0$f;->I:Lv41/r0;

    iput-object p3, p0, Lv41/q0$f;->J:Lc93/a;

    iput-object p4, p0, Lv41/q0$f;->K:Landroid/content/Context;

    iput-object p5, p0, Lv41/q0$f;->L:Lui/p;

    iput-object p6, p0, Lv41/q0$f;->M:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lv41/q0$f;

    iget-object v1, p0, Lv41/q0$f;->H:Ljava/lang/String;

    iget-object v2, p0, Lv41/q0$f;->I:Lv41/r0;

    iget-object v3, p0, Lv41/q0$f;->J:Lc93/a;

    iget-object v4, p0, Lv41/q0$f;->K:Landroid/content/Context;

    iget-object v5, p0, Lv41/q0$f;->L:Lui/p;

    iget-object v6, p0, Lv41/q0$f;->M:Lp1/c1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lv41/q0$f;-><init>(Ljava/lang/String;Lv41/r0;Lc93/a;Landroid/content/Context;Lui/p;Lp1/c1;Lq83/d;)V

    iput-object p1, v0, Lv41/q0$f;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lp1/r1;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/r1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lv41/q0$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/q0$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/q0$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp1/r1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/q0$f;->f(Lp1/r1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lv41/q0$f;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp1/r1;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lv41/q0$f;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lv41/q0$f;->E:Ljava/lang/Object;

    check-cast v0, Lp1/r1;

    iget-object v2, p0, Lv41/q0$f;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    iget-object v2, p0, Lv41/q0$f;->y:Ljava/lang/Object;

    check-cast v2, Lud3/l0;

    iget-object v2, p0, Lv41/q0$f;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, p0, Lv41/q0$f;->w:Ljava/lang/Object;

    check-cast v2, Lqi/i;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lv41/q0$f;->y:Ljava/lang/Object;

    check-cast v2, Lud3/l0;

    iget-object v2, p0, Lv41/q0$f;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, p0, Lv41/q0$f;->w:Ljava/lang/Object;

    check-cast v2, Lqi/i;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lv41/q0$f;->L:Lui/p;

    invoke-static {p1}, Lv41/q0;->E(Lui/p;)Lqi/i;

    move-result-object v2

    if-eqz v2, :cond_9

    :try_start_2
    iget-object p1, p0, Lv41/q0$f;->H:Ljava/lang/String;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lv41/q0$f;->I:Lv41/r0;

    instance-of v7, p1, Lv41/r0$e;

    if-eqz v7, :cond_3

    check-cast p1, Lv41/r0$e;

    invoke-virtual {p1}, Lv41/r0$e;->f()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    move-object p1, v6

    :goto_0
    if-nez p1, :cond_4

    move-object p1, v6

    :cond_4
    iget-object v7, p0, Lv41/q0$f;->J:Lc93/a;

    if-eqz v7, :cond_5

    invoke-interface {v7}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lud3/l0;

    goto :goto_1

    :cond_5
    move-object v7, v6

    :goto_1
    if-eqz p1, :cond_7

    if-eqz v7, :cond_7

    sget-object v8, Lv41/q;->a:Lv41/q;

    iput-object v1, p0, Lv41/q0$f;->G:Ljava/lang/Object;

    iput-object v2, p0, Lv41/q0$f;->w:Ljava/lang/Object;

    iput-object v6, p0, Lv41/q0$f;->x:Ljava/lang/Object;

    iput-object v6, p0, Lv41/q0$f;->y:Ljava/lang/Object;

    iput v5, p0, Lv41/q0$f;->F:I

    invoke-virtual {v8, p1, v7, p0}, Lv41/q;->h(Ljava/lang/String;Lud3/l0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    check-cast p1, Ljava/util/Map;

    goto :goto_3

    :cond_7
    sget-object p1, Lm83/z;->w:Lm83/z;

    :goto_3
    new-instance v7, Li51/q;

    iget-object v8, p0, Lv41/q0$f;->K:Landroid/content/Context;

    iget-object v9, p0, Lv41/q0$f;->H:Ljava/lang/String;

    const/16 v12, 0xc

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Li51/q;-><init>(Landroid/content/Context;Ljava/lang/String;Lbh/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lv41/q0$f;->G:Ljava/lang/Object;

    iput-object v2, p0, Lv41/q0$f;->w:Ljava/lang/Object;

    iput-object v6, p0, Lv41/q0$f;->x:Ljava/lang/Object;

    iput-object v6, p0, Lv41/q0$f;->y:Ljava/lang/Object;

    iput-object v6, p0, Lv41/q0$f;->z:Ljava/lang/Object;

    iput-object v1, p0, Lv41/q0$f;->E:Ljava/lang/Object;

    iput v4, p0, Lv41/q0$f;->F:I

    invoke-virtual {v7, v2, p1, p0}, Li51/q;->b(Lqi/i;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_4
    return-object v0

    :cond_8
    move-object v0, v1

    :goto_5
    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_7

    :goto_6
    invoke-interface {v1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "WhoopLottieOverrideView"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    const-string v1, "Failed to build overlay dynamic properties"

    new-array v4, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_9
    :goto_7
    iget-object p1, p0, Lv41/q0$f;->H:Ljava/lang/String;

    if-eqz p1, :cond_a

    if-eqz v2, :cond_b

    :cond_a
    iget-object p1, p0, Lv41/q0$f;->M:Lp1/c1;

    invoke-static {p1, v3}, Lv41/q0;->B(Lp1/c1;Z)V

    :cond_b
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
