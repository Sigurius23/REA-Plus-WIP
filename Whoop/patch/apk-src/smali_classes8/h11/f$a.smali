.class final Lh11/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh11/f;->h(Landroidx/compose/ui/Modifier;Ljava/util/List;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.molecule.datepill.DatePillRowKt$DatePillRow$1$1"
    f = "DatePillRow.kt"
    l = {
        0x4c,
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:F

.field F:F

.field G:I

.field final synthetic H:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic I:Z

.field final synthetic J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh11/h;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic K:Ln0/u;

.field final synthetic L:Ly3/c;

.field final synthetic M:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field x:I

.field y:I

.field z:F


# direct methods
.method public constructor <init>(Lp1/t2;ZLjava/util/List;Ln0/u;Ly3/c;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            "Z",
            "Ljava/util/List<",
            "Lh11/h;",
            ">;",
            "Ln0/u;",
            "Ly3/c;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lh11/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lh11/f$a;->H:Lp1/t2;

    iput-boolean p2, p0, Lh11/f$a;->I:Z

    iput-object p3, p0, Lh11/f$a;->J:Ljava/util/List;

    iput-object p4, p0, Lh11/f$a;->K:Ln0/u;

    iput-object p5, p0, Lh11/f$a;->L:Ly3/c;

    iput-object p6, p0, Lh11/f$a;->M:Lp1/c1;

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

    new-instance v0, Lh11/f$a;

    iget-object v1, p0, Lh11/f$a;->H:Lp1/t2;

    iget-boolean v2, p0, Lh11/f$a;->I:Z

    iget-object v3, p0, Lh11/f$a;->J:Ljava/util/List;

    iget-object v4, p0, Lh11/f$a;->K:Ln0/u;

    iget-object v5, p0, Lh11/f$a;->L:Ly3/c;

    iget-object v6, p0, Lh11/f$a;->M:Lp1/c1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lh11/f$a;-><init>(Lp1/t2;ZLjava/util/List;Ln0/u;Ly3/c;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lh11/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh11/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh11/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh11/f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh11/f$a;->G:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

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
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh11/f$a;->H:Lp1/t2;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    if-ltz p1, :cond_7

    iget-object p1, p0, Lh11/f$a;->H:Lp1/t2;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-boolean v1, p0, Lh11/f$a;->I:Z

    add-int/2addr p1, v1

    iget-object v1, p0, Lh11/f$a;->J:Ljava/util/List;

    iget-object v4, p0, Lh11/f$a;->H:Lp1/t2;

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh11/h;

    invoke-virtual {v1}, Lh11/h;->l()Lh11/a;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-static {}, Lh11/d;->j()F

    move-result v1

    goto :goto_1

    :cond_3
    invoke-static {}, Lh11/d;->k()F

    move-result v1

    :goto_1
    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v4, v4

    iget-object v5, p0, Lh11/f$a;->K:Ln0/u;

    invoke-virtual {v5}, Ln0/u;->h()Ln0/n;

    move-result-object v5

    invoke-virtual {v5}, Ln0/n;->e()J

    move-result-wide v5

    const/16 v7, 0x20

    shr-long/2addr v5, v7

    long-to-int v5, v5

    iget-object v6, p0, Lh11/f$a;->L:Ly3/c;

    div-int/lit8 v7, v5, 0x2

    int-to-float v7, v7

    invoke-interface {v6, v1}, Ly3/c;->q0(F)F

    move-result v8

    int-to-float v9, v3

    div-float/2addr v8, v9

    sub-float/2addr v7, v8

    invoke-interface {v6, v4}, Ly3/c;->q0(F)F

    move-result v6

    sub-float/2addr v7, v6

    iget-object v6, p0, Lh11/f$a;->M:Lp1/c1;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4

    move v6, v2

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_5

    iget-object v3, p0, Lh11/f$a;->K:Ln0/u;

    float-to-int v8, v7

    mul-int/lit8 v8, v8, -0x1

    iput p1, p0, Lh11/f$a;->w:I

    iput v1, p0, Lh11/f$a;->z:F

    iput v4, p0, Lh11/f$a;->E:F

    iput v5, p0, Lh11/f$a;->x:I

    iput v7, p0, Lh11/f$a;->F:F

    iput v6, p0, Lh11/f$a;->y:I

    iput v2, p0, Lh11/f$a;->G:I

    invoke-virtual {v3, p1, v8, p0}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_5
    iget-object v2, p0, Lh11/f$a;->K:Ln0/u;

    float-to-int v8, v7

    mul-int/lit8 v8, v8, -0x1

    iput p1, p0, Lh11/f$a;->w:I

    iput v1, p0, Lh11/f$a;->z:F

    iput v4, p0, Lh11/f$a;->E:F

    iput v5, p0, Lh11/f$a;->x:I

    iput v7, p0, Lh11/f$a;->F:F

    iput v6, p0, Lh11/f$a;->y:I

    iput v3, p0, Lh11/f$a;->G:I

    invoke-virtual {v2, p1, v8, p0}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    iget-object p1, p0, Lh11/f$a;->M:Lp1/c1;

    iget-object v0, p0, Lh11/f$a;->H:Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
