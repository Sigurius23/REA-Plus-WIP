.class final Lcp0/s$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/s;->n(Landroidx/compose/ui/Modifier;Lcp0/t;ZZLc93/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "velocity",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;F)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.coacheverywhere.view.composables.CoachDrawerOverScrollKt$swipeUpToOpenCoachDrawer$3$1"
    f = "CoachDrawerOverScroll.kt"
    l = {
        0x3f,
        0x41
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcp0/t;

.field final synthetic F:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:I

.field synthetic x:F

.field final synthetic y:Lh0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/p;"
        }
    .end annotation
.end field

.field final synthetic z:Lh0/p3;


# direct methods
.method public constructor <init>(Lh0/p;Lh0/p3;Lcp0/t;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/p;",
            "Lh0/p3;",
            "Lcp0/t;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lcp0/s$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcp0/s$f;->y:Lh0/p;

    iput-object p2, p0, Lcp0/s$f;->z:Lh0/p3;

    iput-object p3, p0, Lcp0/s$f;->E:Lcp0/t;

    iput-object p4, p0, Lcp0/s$f;->F:Lp1/t2;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lbc3/c0;FLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "F",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcp0/s$f;

    iget-object v1, p0, Lcp0/s$f;->y:Lh0/p;

    iget-object v2, p0, Lcp0/s$f;->z:Lh0/p3;

    iget-object v3, p0, Lcp0/s$f;->E:Lcp0/t;

    iget-object v4, p0, Lcp0/s$f;->F:Lp1/t2;

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcp0/s$f;-><init>(Lh0/p;Lh0/p3;Lcp0/t;Lp1/t2;Lq83/d;)V

    iput p2, v0, Lcp0/s$f;->x:F

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcp0/s$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcp0/s$f;->f(Lbc3/c0;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcp0/s$f;->x:F

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcp0/s$f;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcp0/s$f;->y:Lh0/p;

    iget-object v2, p0, Lcp0/s$f;->z:Lh0/p3;

    const/4 v5, 0x0

    cmpl-float v6, v0, v5

    if-lez v6, :cond_3

    goto :goto_0

    :cond_3
    move v5, v0

    :goto_0
    iput v0, p0, Lcp0/s$f;->x:F

    iput v4, p0, Lcp0/s$f;->w:I

    invoke-static {p1, v2, v5, p0}, Lcp0/s;->d(Lh0/p;Lh0/o1;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lcp0/s$f;->E:Lcp0/t;

    invoke-virtual {p1}, Lcp0/t;->g()Lcp0/l;

    move-result-object p1

    invoke-virtual {p1}, Lcp0/l;->isDrawerDetent()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcp0/s$f;->E:Lcp0/t;

    iget-object v2, p0, Lcp0/s$f;->F:Lp1/t2;

    invoke-static {v2}, Lcp0/s;->e(Lp1/t2;)Z

    move-result v2

    iput v0, p0, Lcp0/s$f;->x:F

    iput v3, p0, Lcp0/s$f;->w:I

    const/4 v0, 0x0

    invoke-virtual {p1, v2, v0, p0}, Lcp0/t;->q(ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
