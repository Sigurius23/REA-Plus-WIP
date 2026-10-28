.class final Lb90/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
    c = "com.whoop.activation.view.screens.enterpassword.EnterYourPasswordScreenContainerKt$EnterYourPasswordScreenContainer$3$1"
    f = "EnterYourPasswordScreenContainer.kt"
    l = {
        0x47
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lf80/d;

.field final synthetic F:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic H:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lf80/a;

.field final synthetic z:Landroid/content/Context;


# direct methods
.method public constructor <init>(ZLf80/a;Landroid/content/Context;Lf80/d;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lf80/a;",
            "Landroid/content/Context;",
            "Lf80/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lb90/c$b;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lb90/c$b;->x:Z

    iput-object p2, p0, Lb90/c$b;->y:Lf80/a;

    iput-object p3, p0, Lb90/c$b;->z:Landroid/content/Context;

    iput-object p4, p0, Lb90/c$b;->E:Lf80/d;

    iput-object p5, p0, Lb90/c$b;->F:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lb90/c$b;->G:Lp1/c1;

    iput-object p7, p0, Lb90/c$b;->H:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lb90/c$b;

    iget-boolean v1, p0, Lb90/c$b;->x:Z

    iget-object v2, p0, Lb90/c$b;->y:Lf80/a;

    iget-object v3, p0, Lb90/c$b;->z:Landroid/content/Context;

    iget-object v4, p0, Lb90/c$b;->E:Lf80/d;

    iget-object v5, p0, Lb90/c$b;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lb90/c$b;->G:Lp1/c1;

    iget-object v7, p0, Lb90/c$b;->H:Lp1/c1;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lb90/c$b;-><init>(ZLf80/a;Landroid/content/Context;Lf80/d;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lb90/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lb90/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lb90/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lb90/c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lb90/c$b;->w:I

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

    iget-boolean p1, p0, Lb90/c$b;->x:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lb90/c$b;->G:Lp1/c1;

    invoke-static {p1}, Lb90/c;->n(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lb90/c$b;->G:Lp1/c1;

    invoke-static {p1, v2}, Lb90/c;->o(Lp1/c1;Z)V

    iget-object p1, p0, Lb90/c$b;->y:Lf80/a;

    iget-object v1, p0, Lb90/c$b;->z:Landroid/content/Context;

    iput v2, p0, Lb90/c$b;->w:I

    invoke-virtual {p1, v1, p0}, Lf80/a;->a(Landroid/content/Context;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lf80/b;

    iget-object v0, p0, Lb90/c$b;->E:Lf80/d;

    invoke-virtual {v0, p1}, Lf80/d;->d(Lf80/b;)V

    instance-of v0, p1, Lf80/b$b;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lb90/c$b;->H:Lp1/c1;

    invoke-static {v0, v2}, Lb90/c;->q(Lp1/c1;Z)V

    iget-object v0, p0, Lb90/c$b;->F:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lj80/a$u0;

    new-instance v3, Ld70/e;

    check-cast p1, Lf80/b$b;

    invoke-virtual {p1}, Lf80/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ld70/e;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v3, v2}, Lj80/a$u0;-><init>(Ld70/e;Z)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lb90/c$b;->F:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lj80/a$o0;

    invoke-direct {v0, v2}, Lj80/a$o0;-><init>(Z)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
