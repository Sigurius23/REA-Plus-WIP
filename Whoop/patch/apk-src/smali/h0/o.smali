.class public final Lh0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/a;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:F

.field public final synthetic d:Lh0/p;


# direct methods
.method public constructor <init>(Lh0/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/o;->d:Lh0/p;

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lh0/o;->c:F

    return-void
.end method


# virtual methods
.method public final b(FF)V
    .locals 6

    iget-object v0, p0, Lh0/o;->d:Lh0/p;

    iget-object v1, v0, Lh0/p;->f:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v2

    invoke-virtual {v1, p1}, Lp1/g1;->y(F)V

    iget-object v3, v0, Lh0/p;->g:Lp1/g1;

    invoke-virtual {v3, p2}, Lp1/g1;->y(F)V

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-eqz p2, :cond_0

    goto/16 :goto_4

    :cond_0
    cmpl-float p1, p1, v2

    const/4 p2, 0x0

    const/4 v2, 0x1

    if-ltz p1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, p2

    :goto_0
    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object v3

    iget-object v4, v0, Lh0/p;->c:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v3, Lh0/x;

    invoke-virtual {v3, v5}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v3

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v5

    cmpg-float v3, v5, v3

    if-nez v3, :cond_5

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result p2

    if-eqz p1, :cond_2

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    const/high16 v2, -0x40800000    # -1.0f

    :goto_1
    add-float/2addr p2, v2

    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object v2

    check-cast v2, Lh0/x;

    invoke-virtual {v2, p2, p1}, Lh0/x;->b(FZ)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_3

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p2

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lh0/o;->a:Ljava/lang/Object;

    iput-object p2, p0, Lh0/o;->b:Ljava/lang/Object;

    goto :goto_2

    :cond_4
    iput-object p2, p0, Lh0/o;->a:Ljava/lang/Object;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Lh0/o;->b:Ljava/lang/Object;

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object v3

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v5

    check-cast v3, Lh0/x;

    invoke-virtual {v3, v5, p2}, Lh0/x;->b(FZ)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_6

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p2

    :cond_6
    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object v3

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v5

    check-cast v3, Lh0/x;

    invoke-virtual {v3, v5, v2}, Lh0/x;->b(FZ)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_7

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    :cond_7
    iput-object p2, p0, Lh0/o;->a:Ljava/lang/Object;

    iput-object v2, p0, Lh0/o;->b:Ljava/lang/Object;

    :goto_2
    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object p2

    iget-object v2, p0, Lh0/o;->a:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p2, Lh0/x;

    invoke-virtual {p2, v2}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result p2

    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object v2

    iget-object v3, p0, Lh0/o;->b:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Lh0/x;

    invoke-virtual {v2, v3}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v2

    sub-float/2addr p2, v2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iput p2, p0, Lh0/o;->c:F

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result p2

    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object v1

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v1, Lh0/x;

    invoke-virtual {v1, v2}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v1

    sub-float/2addr p2, v1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    iget v1, p0, Lh0/o;->c:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    cmpl-float p2, p2, v1

    if-ltz p2, :cond_a

    if-eqz p1, :cond_8

    iget-object p1, p0, Lh0/o;->b:Ljava/lang/Object;

    goto :goto_3

    :cond_8
    iget-object p1, p0, Lh0/o;->a:Ljava/lang/Object;

    :goto_3
    if-nez p1, :cond_9

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    :cond_9
    invoke-virtual {v0, p1}, Lh0/p;->g(Ljava/lang/Object;)V

    :cond_a
    :goto_4
    return-void
.end method
