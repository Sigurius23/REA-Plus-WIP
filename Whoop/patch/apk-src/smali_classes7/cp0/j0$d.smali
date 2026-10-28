.class final Lcp0/j0$d;
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
    c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt$CoachEverywhereBottomSheet$7$1"
    f = "CoachEverywhereBottomSheet.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/z0;

.field w:I

.field final synthetic x:Lcp0/m0;

.field final synthetic y:F

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcp0/m0;FLp1/c1;Lp1/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp0/m0;",
            "F",
            "Lp1/c1;",
            "Lp1/z0;",
            "Lq83/d<",
            "-",
            "Lcp0/j0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcp0/j0$d;->x:Lcp0/m0;

    iput p2, p0, Lcp0/j0$d;->y:F

    iput-object p3, p0, Lcp0/j0$d;->z:Lp1/c1;

    iput-object p4, p0, Lcp0/j0$d;->E:Lp1/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lcp0/j0$d;

    iget-object v1, p0, Lcp0/j0$d;->x:Lcp0/m0;

    iget v2, p0, Lcp0/j0$d;->y:F

    iget-object v3, p0, Lcp0/j0$d;->z:Lp1/c1;

    iget-object v4, p0, Lcp0/j0$d;->E:Lp1/z0;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcp0/j0$d;-><init>(Lcp0/m0;FLp1/c1;Lp1/z0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcp0/j0$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcp0/j0$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcp0/j0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcp0/j0$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcp0/j0$d;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcp0/j0$d;->x:Lcp0/m0;

    invoke-virtual {p1}, Lcp0/m0;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcp0/j0$d;->z:Lp1/c1;

    invoke-static {p1}, Lcp0/j0;->W0(Lp1/c1;)Lcp0/u1;

    move-result-object p1

    sget-object v0, Lcp0/u1;->Partial:Lcp0/u1;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcp0/j0$d;->E:Lp1/z0;

    iget v0, p0, Lcp0/j0$d;->y:F

    invoke-static {p1, v0}, Lcp0/j0;->a1(Lp1/z0;F)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
