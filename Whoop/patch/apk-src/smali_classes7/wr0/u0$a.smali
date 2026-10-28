.class final Lwr0/u0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwr0/u0;->t(Landroidx/compose/ui/Modifier;Lwr0/x0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.communitymoments.view.MomentStackKt$MomentStack$3$1"
    f = "MomentStack.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/a1;

.field w:I

.field final synthetic x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lwr0/b0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lp1/c1;Ljava/util/List;Lp1/a1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lp1/c1;",
            "Ljava/util/List<",
            "Lwr0/b0;",
            ">;",
            "Lp1/a1;",
            "Lq83/d<",
            "-",
            "Lwr0/u0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwr0/u0$a;->x:Ljava/util/List;

    iput-object p2, p0, Lwr0/u0$a;->y:Lp1/c1;

    iput-object p3, p0, Lwr0/u0$a;->z:Ljava/util/List;

    iput-object p4, p0, Lwr0/u0$a;->E:Lp1/a1;

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

    new-instance v0, Lwr0/u0$a;

    iget-object v1, p0, Lwr0/u0$a;->x:Ljava/util/List;

    iget-object v2, p0, Lwr0/u0$a;->y:Lp1/c1;

    iget-object v3, p0, Lwr0/u0$a;->z:Ljava/util/List;

    iget-object v4, p0, Lwr0/u0$a;->E:Lp1/a1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lwr0/u0$a;-><init>(Ljava/util/List;Lp1/c1;Ljava/util/List;Lp1/a1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lwr0/u0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwr0/u0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwr0/u0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwr0/u0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lwr0/u0$a;->w:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwr0/u0$a;->x:Ljava/util/List;

    iget-object v0, p0, Lwr0/u0$a;->y:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lwr0/u0$a;->y:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, Lwr0/u0$a;->x:Ljava/util/List;

    invoke-static {p1, v1}, Lwr0/y0;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lwr0/u0$a;->E:Lp1/a1;

    invoke-static {p1, v0}, Lwr0/u0;->X(Lp1/a1;I)V

    :cond_0
    iget-object p1, p0, Lwr0/u0$a;->y:Lp1/c1;

    iget-object v1, p0, Lwr0/u0$a;->x:Ljava/util/List;

    invoke-interface {p1, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lwr0/u0$a;->E:Lp1/a1;

    invoke-static {p1}, Lwr0/u0;->W(Lp1/a1;)I

    move-result p1

    iget-object v1, p0, Lwr0/u0$a;->z:Ljava/util/List;

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-le p1, v1, :cond_3

    iget-object p1, p0, Lwr0/u0$a;->E:Lp1/a1;

    iget-object v1, p0, Lwr0/u0$a;->z:Ljava/util/List;

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-gez v1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    invoke-static {p1, v0}, Lwr0/u0;->X(Lp1/a1;I)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
