.class final Lis0/j0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/j0;->z(Landroidx/compose/ui/Modifier;Lis0/s0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.communityreactions.view.ReactionsPanelKt$ReactionsPanel$3$1"
    f = "ReactionsPanel.kt"
    l = {
        0x71,
        0x72,
        0x78,
        0x78,
        0x7a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lis0/m0;

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
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

.field final synthetic H:Lp1/z0;

.field final synthetic I:Lp1/z0;

.field w:Z

.field x:F

.field y:I

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lis0/m0;Lp1/c1;Lp1/c1;Lp1/z0;Lp1/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lis0/m0;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/z0;",
            "Lp1/z0;",
            "Lq83/d<",
            "-",
            "Lis0/j0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lis0/j0$a;->z:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lis0/j0$a;->E:Lis0/m0;

    iput-object p3, p0, Lis0/j0$a;->F:Lp1/c1;

    iput-object p4, p0, Lis0/j0$a;->G:Lp1/c1;

    iput-object p5, p0, Lis0/j0$a;->H:Lp1/z0;

    iput-object p6, p0, Lis0/j0$a;->I:Lp1/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(J)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lis0/j0$a;->j(J)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/z0;Lp1/z0;)Z
    .locals 0

    invoke-static {p0, p1}, Lis0/j0$a;->i(Lp1/z0;Lp1/z0;)Z

    move-result p0

    return p0
.end method

.method private static final i(Lp1/z0;Lp1/z0;)Z
    .locals 1

    invoke-static {p0}, Lis0/j0;->u0(Lp1/z0;)F

    move-result p0

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-gtz p0, :cond_1

    invoke-static {p1}, Lis0/j0;->v0(Lp1/z0;)F

    move-result p0

    cmpl-float p0, p0, v0

    if-lez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final j(J)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance v0, Lis0/j0$a;

    iget-object v1, p0, Lis0/j0$a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lis0/j0$a;->E:Lis0/m0;

    iget-object v3, p0, Lis0/j0$a;->F:Lp1/c1;

    iget-object v4, p0, Lis0/j0$a;->G:Lp1/c1;

    iget-object v5, p0, Lis0/j0$a;->H:Lp1/z0;

    iget-object v6, p0, Lis0/j0$a;->I:Lp1/z0;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lis0/j0$a;-><init>(Lkotlin/jvm/functions/Function1;Lis0/m0;Lp1/c1;Lp1/c1;Lp1/z0;Lp1/z0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lis0/j0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lis0/j0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lis0/j0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lis0/j0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lis0/j0$a;->y:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v6, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget-boolean v1, p0, Lis0/j0$a;->w:Z

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-boolean v1, p0, Lis0/j0$a;->w:Z

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lis0/j0$a;->F:Lp1/c1;

    invoke-static {p1}, Lis0/j0;->w0(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lis0/j0$a;->G:Lp1/c1;

    invoke-static {p1}, Lis0/j0;->y0(Lp1/c1;)Z

    move-result p1

    iget-object v1, p0, Lis0/j0$a;->G:Lp1/c1;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lis0/j0;->z0(Lp1/c1;Z)V

    if-nez p1, :cond_5

    iget-object v1, p0, Lis0/j0$a;->z:Lkotlin/jvm/functions/Function1;

    sget-object v2, Lis0/r0$g;->a:Lis0/r0$g;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v1, p0, Lis0/j0$a;->H:Lp1/z0;

    iget-object v2, p0, Lis0/j0$a;->I:Lp1/z0;

    new-instance v7, Lis0/i0;

    const/4 v8, 0x0

    invoke-direct {v7, v8, v1, v2}, Lis0/i0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v1

    new-instance v2, Lis0/j0$a$a;

    const/4 v7, 0x0

    invoke-direct {v2, v7}, Lis0/j0$a$a;-><init>(Lq83/d;)V

    iput-boolean p1, p0, Lis0/j0$a;->w:Z

    iput v6, p0, Lis0/j0$a;->y:I

    invoke-static {v1, v2, p0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    goto :goto_3

    :cond_6
    move v1, p1

    :goto_1
    new-instance p1, Lis0/y;

    const/4 v2, 0x1

    invoke-direct {p1, v2}, Lis0/y;-><init>(I)V

    iput-boolean v1, p0, Lis0/j0$a;->w:Z

    iput v5, p0, Lis0/j0$a;->y:I

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v2

    invoke-interface {v2, p1, p0}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    iget-object p1, p0, Lis0/j0$a;->H:Lp1/z0;

    invoke-static {p1}, Lis0/j0;->u0(Lp1/z0;)F

    move-result p1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v5, p1, v2

    if-gez v5, :cond_8

    move p1, v2

    :cond_8
    iget-object v2, p0, Lis0/j0$a;->E:Lis0/m0;

    iget-object v5, p0, Lis0/j0$a;->I:Lp1/z0;

    invoke-static {v5}, Lis0/j0;->v0(Lp1/z0;)F

    move-result v5

    invoke-virtual {v2, p1, v5}, Lis0/m0;->p(FF)V

    iget-object v2, p0, Lis0/j0$a;->E:Lis0/m0;

    iput-boolean v1, p0, Lis0/j0$a;->w:Z

    iput p1, p0, Lis0/j0$a;->x:F

    if-eqz v1, :cond_9

    iput v4, p0, Lis0/j0$a;->y:I

    invoke-virtual {v2, p0}, Lis0/m0;->o(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_3

    :cond_9
    iput v3, p0, Lis0/j0$a;->y:I

    invoke-virtual {v2, p0}, Lis0/m0;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_3

    :cond_a
    iget-object p1, p0, Lis0/j0$a;->E:Lis0/m0;

    invoke-virtual {p1}, Lis0/m0;->j()Lis0/b0;

    move-result-object p1

    sget-object v1, Lis0/b0;->Collapsed:Lis0/b0;

    if-eq p1, v1, :cond_b

    iget-object p1, p0, Lis0/j0$a;->E:Lis0/m0;

    iput v2, p0, Lis0/j0$a;->y:I

    invoke-virtual {p1, p0}, Lis0/m0;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_3
    return-object v0

    :cond_b
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
