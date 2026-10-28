.class final Lv41/p$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/p;->g(Landroidx/compose/ui/Modifier;Lv41/r0;Lv41/m0;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.LottieAnimationsKt$WhoopLottieAnimation$1$1"
    f = "LottieAnimations.kt"
    l = {
        0x26,
        0x2b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lui/l;

.field w:I

.field final synthetic x:Lui/b;

.field final synthetic y:Lv41/m0;

.field final synthetic z:Lui/p;


# direct methods
.method public constructor <init>(Lui/b;Lv41/m0;Lui/p;Lui/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lui/b;",
            "Lv41/m0;",
            "Lui/p;",
            "Lui/l;",
            "Lq83/d<",
            "-",
            "Lv41/p$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/p$a;->x:Lui/b;

    iput-object p2, p0, Lv41/p$a;->y:Lv41/m0;

    iput-object p3, p0, Lv41/p$a;->z:Lui/p;

    iput-object p4, p0, Lv41/p$a;->E:Lui/l;

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

    new-instance v0, Lv41/p$a;

    iget-object v1, p0, Lv41/p$a;->x:Lui/b;

    iget-object v2, p0, Lv41/p$a;->y:Lv41/m0;

    iget-object v3, p0, Lv41/p$a;->z:Lui/p;

    iget-object v4, p0, Lv41/p$a;->E:Lui/l;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lv41/p$a;-><init>(Lui/b;Lv41/m0;Lui/p;Lui/l;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lv41/p$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/p$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/p$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/p$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lv41/p$a;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lv41/p$a;->x:Lui/b;

    iget-object v1, p0, Lv41/p$a;->z:Lui/p;

    invoke-static {v1}, Lv41/p;->r(Lui/p;)Lqi/i;

    move-result-object v1

    iget-object v4, p0, Lv41/p$a;->E:Lui/l;

    invoke-static {v4}, Lv41/p;->s(Lui/l;)F

    move-result v4

    iput v3, p0, Lv41/p$a;->w:I

    const/16 v3, 0xc

    invoke-static {p1, v1, v4, p0, v3}, Lj93/l0;->a0(Lui/b;Lqi/i;FLs83/i;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v3, p0, Lv41/p$a;->x:Lui/b;

    iget-object p1, p0, Lv41/p$a;->z:Lui/p;

    invoke-static {p1}, Lv41/p;->r(Lui/p;)Lqi/i;

    move-result-object v4

    iget-object p1, p0, Lv41/p$a;->y:Lv41/m0;

    invoke-static {p1}, Lv41/p;->t(Lv41/m0;)Lui/o;

    move-result-object v7

    iput v2, p0, Lv41/p$a;->w:I

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/16 v11, 0x7de

    move-object v10, p0

    invoke-static/range {v3 .. v11}, Lj93/l0;->i(Lui/b;Lqi/i;IFLui/o;FILs83/i;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
