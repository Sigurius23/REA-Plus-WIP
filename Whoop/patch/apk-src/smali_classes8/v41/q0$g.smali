.class final Lv41/q0$g;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lp1/r1;",
        "Lui/y;",
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
    c = "com.whoop.design.atomic.organism.WhoopLottieOverrideViewKt$WhoopLottieOverrideView$spec$2$1"
    f = "WhoopLottieOverrideView.kt"
    l = {
        0x5c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lv41/r0;

.field final synthetic z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv41/r0;Ljava/util/List;Lc93/a;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv41/r0;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lc93/a;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lv41/q0$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/q0$g;->y:Lv41/r0;

    iput-object p2, p0, Lv41/q0$g;->z:Ljava/util/List;

    iput-object p3, p0, Lv41/q0$g;->E:Lc93/a;

    iput-object p4, p0, Lv41/q0$g;->F:Lp1/c1;

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

    new-instance v0, Lv41/q0$g;

    iget-object v1, p0, Lv41/q0$g;->y:Lv41/r0;

    iget-object v2, p0, Lv41/q0$g;->z:Ljava/util/List;

    iget-object v3, p0, Lv41/q0$g;->E:Lc93/a;

    iget-object v4, p0, Lv41/q0$g;->F:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lv41/q0$g;-><init>(Lv41/r0;Ljava/util/List;Lc93/a;Lp1/c1;Lq83/d;)V

    iput-object p1, v0, Lv41/q0$g;->x:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lv41/q0$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/q0$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/q0$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lp1/r1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/q0$g;->f(Lp1/r1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lv41/q0$g;->x:Ljava/lang/Object;

    check-cast v0, Lp1/r1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lv41/q0$g;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lv41/q;->a:Lv41/q;

    iget-object v2, p0, Lv41/q0$g;->y:Lv41/r0;

    iget-object v4, p0, Lv41/q0$g;->z:Ljava/util/List;

    iget-object v5, p0, Lv41/q0$g;->E:Lc93/a;

    iput-object v0, p0, Lv41/q0$g;->x:Ljava/lang/Object;

    iput v3, p0, Lv41/q0$g;->w:I

    invoke-virtual {p1, v2, v4, v5, p0}, Lv41/q;->f(Lv41/r0;Ljava/util/List;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Lui/y;

    if-eqz p1, :cond_3

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_3
    iget-object p1, p0, Lv41/q0$g;->F:Lp1/c1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lv41/q0;->D(Lp1/c1;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
