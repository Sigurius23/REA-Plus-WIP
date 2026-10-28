.class final Lcp0/j0$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/j0;->I(Lcp0/m0;Lkotlin/jvm/functions/Function1;Lzo0/c;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ZLc93/m;Lc93/m;ZLch0/v0;Lc93/b;Landroidx/compose/runtime/Composer;III)V
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
    c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt$CoachEverywhereBottomSheet$9$1$1"
    f = "CoachEverywhereBottomSheet.kt"
    l = {
        0x11b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/z0;

.field final synthetic G:Lp1/z0;

.field w:I

.field final synthetic x:F

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lcp0/u1;


# direct methods
.method public constructor <init>(FLkotlin/jvm/functions/Function1;Lcp0/u1;Lp1/c1;Lp1/z0;Lp1/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lkotlin/jvm/functions/Function1;",
            "Lcp0/u1;",
            "Lp1/c1;",
            "Lp1/z0;",
            "Lp1/z0;",
            "Lq83/d<",
            "-",
            "Lcp0/j0$f;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcp0/j0$f;->x:F

    iput-object p2, p0, Lcp0/j0$f;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcp0/j0$f;->z:Lcp0/u1;

    iput-object p4, p0, Lcp0/j0$f;->E:Lp1/c1;

    iput-object p5, p0, Lcp0/j0$f;->F:Lp1/z0;

    iput-object p6, p0, Lcp0/j0$f;->G:Lp1/z0;

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

    new-instance v0, Lcp0/j0$f;

    iget v1, p0, Lcp0/j0$f;->x:F

    iget-object v2, p0, Lcp0/j0$f;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcp0/j0$f;->z:Lcp0/u1;

    iget-object v4, p0, Lcp0/j0$f;->E:Lp1/c1;

    iget-object v5, p0, Lcp0/j0$f;->F:Lp1/z0;

    iget-object v6, p0, Lcp0/j0$f;->G:Lp1/z0;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcp0/j0$f;-><init>(FLkotlin/jvm/functions/Function1;Lcp0/u1;Lp1/c1;Lp1/z0;Lp1/z0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcp0/j0$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcp0/j0$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcp0/j0$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcp0/j0$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcp0/j0$f;->w:I

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

    iget-object p1, p0, Lcp0/j0$f;->E:Lp1/c1;

    sget-object v1, Lcp0/u1;->Hidden:Lcp0/u1;

    invoke-static {p1, v1}, Lcp0/j0;->X0(Lp1/c1;Lcp0/u1;)V

    iget-object p1, p0, Lcp0/j0$f;->F:Lp1/z0;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcp0/j0;->b1(Lp1/z0;F)V

    iget-object p1, p0, Lcp0/j0$f;->G:Lp1/z0;

    iget v1, p0, Lcp0/j0$f;->x:F

    invoke-static {p1, v1}, Lcp0/j0;->a1(Lp1/z0;F)V

    iput v2, p0, Lcp0/j0$f;->w:I

    const-wide/16 v1, 0x12c

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcp0/j0$f;->y:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcp0/j0$f;->z:Lcp0/u1;

    invoke-static {v0}, Lpo0/b;->a(Lcp0/u1;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
