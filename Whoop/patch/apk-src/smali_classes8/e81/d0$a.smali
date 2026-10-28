.class final Le81/d0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le81/d0;->h(Landroidx/compose/ui/Modifier;Ljava/util/List;FFFFLe81/u;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.piechart.PieChartKt$PieChart$2$1"
    f = "PieChart.kt"
    l = {
        0x70,
        0x71
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/Integer;

.field final synthetic F:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
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

.field final synthetic I:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le81/w;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic z:Le81/u;


# direct methods
.method public constructor <init>(Ljava/util/List;Le81/u;Ljava/lang/Integer;Ld0/e;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le81/w;",
            ">;",
            "Le81/u;",
            "Ljava/lang/Integer;",
            "Ld0/e;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Le81/d0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le81/d0$a;->y:Ljava/util/List;

    iput-object p2, p0, Le81/d0$a;->z:Le81/u;

    iput-object p3, p0, Le81/d0$a;->E:Ljava/lang/Integer;

    iput-object p4, p0, Le81/d0$a;->F:Ld0/e;

    iput-object p5, p0, Le81/d0$a;->G:Lp1/c1;

    iput-object p6, p0, Le81/d0$a;->H:Lp1/c1;

    iput-object p7, p0, Le81/d0$a;->I:Lp1/c1;

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

    new-instance v0, Le81/d0$a;

    iget-object v1, p0, Le81/d0$a;->y:Ljava/util/List;

    iget-object v2, p0, Le81/d0$a;->z:Le81/u;

    iget-object v3, p0, Le81/d0$a;->E:Ljava/lang/Integer;

    iget-object v4, p0, Le81/d0$a;->F:Ld0/e;

    iget-object v5, p0, Le81/d0$a;->G:Lp1/c1;

    iget-object v6, p0, Le81/d0$a;->H:Lp1/c1;

    iget-object v7, p0, Le81/d0$a;->I:Lp1/c1;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Le81/d0$a;-><init>(Ljava/util/List;Le81/u;Ljava/lang/Integer;Ld0/e;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Le81/d0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le81/d0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le81/d0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le81/d0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Le81/d0$a;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Le81/d0$a;->w:Ljava/lang/Object;

    check-cast v0, Ld0/l;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Le81/d0$a;->w:Ljava/lang/Object;

    check-cast v1, Ld0/l;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_2
    move-object v6, v1

    goto/16 :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le81/d0$a;->y:Ljava/util/List;

    iget-object v1, p0, Le81/d0$a;->G:Lp1/c1;

    invoke-static {v1}, Le81/d0;->A(Lp1/c1;)Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto/16 :goto_4

    :cond_4
    iget-object p1, p0, Le81/d0$a;->z:Le81/u;

    if-nez p1, :cond_5

    invoke-static {}, Ld0/f;->t()Ld0/g1;

    move-result-object p1

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_5
    iget-object v1, p0, Le81/d0$a;->E:Ljava/lang/Integer;

    if-nez v1, :cond_6

    invoke-virtual {p1}, Le81/u;->e()Ld0/l;

    move-result-object p1

    goto :goto_0

    :cond_6
    iget-object p1, p0, Le81/d0$a;->H:Lp1/c1;

    invoke-static {p1}, Le81/d0;->C(Lp1/c1;)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_7

    iget-object p1, p0, Le81/d0$a;->z:Le81/u;

    invoke-virtual {p1}, Le81/u;->d()Ld0/l;

    move-result-object p1

    goto :goto_0

    :cond_7
    iget-object p1, p0, Le81/d0$a;->z:Le81/u;

    invoke-virtual {p1}, Le81/u;->b()Ld0/l;

    move-result-object p1

    goto :goto_0

    :goto_1
    iget-object p1, p0, Le81/d0$a;->H:Lp1/c1;

    iget-object v5, p0, Le81/d0$a;->E:Ljava/lang/Integer;

    invoke-static {p1, v5}, Le81/d0;->D(Lp1/c1;Ljava/lang/Integer;)V

    iget-object p1, p0, Le81/d0$a;->I:Lp1/c1;

    invoke-static {p1}, Le81/d0;->E(Lp1/c1;)Ljava/util/List;

    move-result-object v5

    iget-object v6, p0, Le81/d0$a;->G:Lp1/c1;

    invoke-static {v6}, Le81/d0;->A(Lp1/c1;)Ljava/util/List;

    move-result-object v6

    iget-object v7, p0, Le81/d0$a;->F:Ld0/e;

    invoke-virtual {v7}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    invoke-static {v5, v6, v7}, Le81/s;->c(Ljava/util/List;Ljava/util/List;F)Ljava/util/List;

    move-result-object v5

    invoke-static {p1, v5}, Le81/d0;->F(Lp1/c1;Ljava/util/List;)V

    iget-object p1, p0, Le81/d0$a;->G:Lp1/c1;

    iget-object v5, p0, Le81/d0$a;->y:Ljava/util/List;

    invoke-static {p1, v5}, Le81/d0;->B(Lp1/c1;Ljava/util/List;)V

    iget-object p1, p0, Le81/d0$a;->F:Ld0/e;

    new-instance v5, Ljava/lang/Float;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Ljava/lang/Float;-><init>(F)V

    iput-object v1, p0, Le81/d0$a;->w:Ljava/lang/Object;

    iput v4, p0, Le81/d0$a;->x:I

    invoke-virtual {p1, v5, p0}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_3

    :goto_2
    iget-object v4, p0, Le81/d0$a;->F:Ld0/e;

    new-instance v5, Ljava/lang/Float;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-direct {v5, p1}, Ljava/lang/Float;-><init>(F)V

    const/4 p1, 0x0

    iput-object p1, p0, Le81/d0$a;->w:Ljava/lang/Object;

    iput v3, p0, Le81/d0$a;->x:I

    const/4 v7, 0x0

    const/16 v9, 0xc

    move-object v8, p0

    invoke-static/range {v4 .. v9}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_3
    return-object v0

    :cond_8
    :goto_4
    return-object v2
.end method
