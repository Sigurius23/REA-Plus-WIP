.class final Ln71/o$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln71/o;->q(Landroidx/compose/ui/Modifier;Ln71/q;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.design.atomic.organism.heartratemonitor.LiveHrMonitorKt$FinalMarkerLineWithBubble$1$1"
    f = "LiveHrMonitor.kt"
    l = {
        0x16c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/z0;

.field w:I

.field final synthetic x:Ln71/q;

.field final synthetic y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln71/a;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/z0;


# direct methods
.method public constructor <init>(Ln71/q;Ljava/util/List;Lp1/z0;Lp1/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln71/q;",
            "Ljava/util/List<",
            "Ln71/a;",
            ">;",
            "Lp1/z0;",
            "Lp1/z0;",
            "Lq83/d<",
            "-",
            "Ln71/o$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ln71/o$a;->x:Ln71/q;

    iput-object p2, p0, Ln71/o$a;->y:Ljava/util/List;

    iput-object p3, p0, Ln71/o$a;->z:Lp1/z0;

    iput-object p4, p0, Ln71/o$a;->E:Lp1/z0;

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

    new-instance v0, Ln71/o$a;

    iget-object v1, p0, Ln71/o$a;->x:Ln71/q;

    iget-object v2, p0, Ln71/o$a;->y:Ljava/util/List;

    iget-object v3, p0, Ln71/o$a;->z:Lp1/z0;

    iget-object v4, p0, Ln71/o$a;->E:Lp1/z0;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ln71/o$a;-><init>(Ln71/q;Ljava/util/List;Lp1/z0;Lp1/z0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ln71/o$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln71/o$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln71/o$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln71/o$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ln71/o$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

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

    :cond_2
    iget-object p1, p0, Ln71/o$a;->x:Ln71/q;

    invoke-virtual {p1}, Ln71/q;->f()Ln71/r;

    move-result-object p1

    invoke-virtual {p1}, Ln71/r;->isCalibrating()Z

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p1, :cond_3

    iget-object p1, p0, Ln71/o$a;->z:Lp1/z0;

    invoke-static {p1}, Ln71/o;->W(Lp1/z0;)F

    move-result v3

    const v4, 0x3ca3d70a    # 0.02f

    add-float/2addr v3, v4

    invoke-static {p1, v3}, Ln71/o;->X(Lp1/z0;F)V

    iget-object p1, p0, Ln71/o$a;->E:Lp1/z0;

    int-to-float v3, v2

    iget-object v4, p0, Ln71/o$a;->z:Lp1/z0;

    invoke-static {v4}, Ln71/o;->W(Lp1/z0;)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    add-float/2addr v3, v4

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v3, v4, v1}, Le93/b;->m(FFF)F

    move-result v1

    invoke-static {p1, v1}, Ln71/o;->V(Lp1/z0;F)V

    iput v2, p0, Ln71/o$a;->w:I

    const-wide/16 v3, 0x10

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_3
    iget-object p1, p0, Ln71/o$a;->E:Lp1/z0;

    iget-object v0, p0, Ln71/o$a;->y:Ljava/util/List;

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln71/a;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ln71/a;->b()F

    move-result v1

    :cond_4
    invoke-static {p1, v1}, Ln71/o;->V(Lp1/z0;F)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
