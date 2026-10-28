.class final Lcp0/j0$c;
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
    c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt$CoachEverywhereBottomSheet$6$1"
    f = "CoachEverywhereBottomSheet.kt"
    l = {
        0xf5
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

.field final synthetic x:Lcp0/m0;

.field final synthetic y:Z

.field final synthetic z:F


# direct methods
.method public constructor <init>(Lcp0/m0;ZFLp1/c1;Lp1/z0;Lp1/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp0/m0;",
            "ZF",
            "Lp1/c1;",
            "Lp1/z0;",
            "Lp1/z0;",
            "Lq83/d<",
            "-",
            "Lcp0/j0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcp0/j0$c;->x:Lcp0/m0;

    iput-boolean p2, p0, Lcp0/j0$c;->y:Z

    iput p3, p0, Lcp0/j0$c;->z:F

    iput-object p4, p0, Lcp0/j0$c;->E:Lp1/c1;

    iput-object p5, p0, Lcp0/j0$c;->F:Lp1/z0;

    iput-object p6, p0, Lcp0/j0$c;->G:Lp1/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/z0;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/j0$c;->l(Lp1/z0;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;Lcp0/u1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/j0$c;->j(Lp1/c1;Lcp0/u1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/z0;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/j0$c;->k(Lp1/z0;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lp1/c1;Lcp0/u1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/j0;->X0(Lp1/c1;Lcp0/u1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/z0;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/j0;->b1(Lp1/z0;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/z0;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcp0/j0;->a1(Lp1/z0;F)V

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

    new-instance v0, Lcp0/j0$c;

    iget-object v1, p0, Lcp0/j0$c;->x:Lcp0/m0;

    iget-boolean v2, p0, Lcp0/j0$c;->y:Z

    iget v3, p0, Lcp0/j0$c;->z:F

    iget-object v4, p0, Lcp0/j0$c;->E:Lp1/c1;

    iget-object v5, p0, Lcp0/j0$c;->F:Lp1/z0;

    iget-object v6, p0, Lcp0/j0$c;->G:Lp1/z0;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcp0/j0$c;-><init>(Lcp0/m0;ZFLp1/c1;Lp1/z0;Lp1/z0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcp0/j0$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcp0/j0$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcp0/j0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcp0/j0$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcp0/j0$c;->w:I

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

    iget-object p1, p0, Lcp0/j0$c;->x:Lcp0/m0;

    invoke-virtual {p1}, Lcp0/m0;->k()Z

    move-result v3

    iget-boolean v4, p0, Lcp0/j0$c;->y:Z

    iget v5, p0, Lcp0/j0$c;->z:F

    iget-object p1, p0, Lcp0/j0$c;->E:Lp1/c1;

    new-instance v6, Lcp0/k0;

    const/4 v1, 0x0

    invoke-direct {v6, v1, p1}, Lcp0/k0;-><init>(ILp1/c1;)V

    iget-object p1, p0, Lcp0/j0$c;->F:Lp1/z0;

    new-instance v7, Lcp0/l0;

    invoke-direct {v7, p1, v1}, Lcp0/l0;-><init>(Lp1/z0;I)V

    iget-object p1, p0, Lcp0/j0$c;->G:Lp1/z0;

    new-instance v8, Lcp0/l0;

    const/4 v1, 0x1

    invoke-direct {v8, p1, v1}, Lcp0/l0;-><init>(Lp1/z0;I)V

    iput v2, p0, Lcp0/j0$c;->w:I

    move-object v9, p0

    invoke-static/range {v3 .. v9}, Lcp0/j0;->d1(ZZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
