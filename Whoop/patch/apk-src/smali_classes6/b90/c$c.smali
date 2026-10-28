.class final Lb90/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb90/c;->e(Lg80/f;Lf80/a;Lf80/d;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lm91/u;",
        "currentScreen",
        "Lf70/q0;",
        "memberInfo",
        "Ll83/a0;",
        "<anonymous>",
        "(Lm91/u;Lf70/q0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.view.screens.enterpassword.EnterYourPasswordScreenContainerKt$EnterYourPasswordScreenContainer$6$1"
    f = "EnterYourPasswordScreenContainer.kt"
    l = {
        0x6f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Landroid/content/Context;

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lf80/e;


# direct methods
.method public constructor <init>(Lf80/e;Landroid/content/Context;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf80/e;",
            "Landroid/content/Context;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lb90/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lb90/c$c;->z:Lf80/e;

    iput-object p2, p0, Lb90/c$c;->E:Landroid/content/Context;

    iput-object p3, p0, Lb90/c$c;->F:Lp1/c1;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lm91/u;Lf70/q0;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lf70/q0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lb90/c$c;

    iget-object v1, p0, Lb90/c$c;->z:Lf80/e;

    iget-object v2, p0, Lb90/c$c;->E:Landroid/content/Context;

    iget-object v3, p0, Lb90/c$c;->F:Lp1/c1;

    invoke-direct {v0, v1, v2, v3, p3}, Lb90/c$c;-><init>(Lf80/e;Landroid/content/Context;Lp1/c1;Lq83/d;)V

    iput-object p1, v0, Lb90/c$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lb90/c$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb90/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    check-cast p2, Lf70/q0;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lb90/c$c;->f(Lm91/u;Lf70/q0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lb90/c$c;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lm91/u;

    iget-object v0, p0, Lb90/c$c;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lf70/q0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb90/c$c;->w:I

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

    iget-object v1, p0, Lb90/c$c;->z:Lf80/e;

    move p1, v2

    iget-object v2, p0, Lb90/c$c;->E:Landroid/content/Context;

    iget-object v5, p0, Lb90/c$c;->F:Lp1/c1;

    invoke-static {v5}, Lb90/c;->p(Lp1/c1;)Z

    move-result v5

    const/4 v6, 0x0

    iput-object v6, p0, Lb90/c$c;->x:Ljava/lang/Object;

    iput-object v6, p0, Lb90/c$c;->y:Ljava/lang/Object;

    iput p1, p0, Lb90/c$c;->w:I

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, Lf80/e;->a(Landroid/content/Context;Lm91/u;Lf70/q0;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
