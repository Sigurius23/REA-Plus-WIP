.class public final Lg1/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg1/s1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg1/s1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg1/s1;->a:Lg1/s1;

    return-void
.end method


# virtual methods
.method public final a(JFLandroidx/compose/runtime/Composer;I)J
    .locals 3

    check-cast p4, Lp1/q;

    const p5, -0x648f4fbd

    invoke-virtual {p4, p5}, Lp1/q;->e0(I)V

    sget-object p5, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p4, p5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lg1/c1;

    const/4 v0, 0x0

    int-to-float v1, v0

    invoke-static {p3, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p5}, Lg1/c1;->i()Z

    move-result p5

    if-nez p5, :cond_0

    const p5, -0x414d36ea

    invoke-virtual {p4, p5}, Lp1/q;->e0(I)V

    sget-object p5, Lg1/u2;->a:Lp1/u2;

    const/4 p5, 0x1

    int-to-float p5, p5

    add-float/2addr p3, p5

    float-to-double v1, p3

    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    move-result-wide v1

    double-to-float p3, v1

    const/high16 p5, 0x40900000    # 4.5f

    mul-float/2addr p3, p5

    const/high16 p5, 0x40000000    # 2.0f

    add-float/2addr p3, p5

    const/high16 p5, 0x42c80000    # 100.0f

    div-float/2addr p3, p5

    invoke-static {p1, p2, p4}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v1

    invoke-static {p3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Li2/w0;->p(JJ)J

    move-result-wide p1

    invoke-virtual {p4, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    const p3, -0x414b19de

    invoke-virtual {p4, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p4, v0}, Lp1/q;->q(Z)V

    :goto_0
    invoke-virtual {p4, v0}, Lp1/q;->q(Z)V

    return-wide p1
.end method
