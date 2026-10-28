.class public abstract Lu0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x19

    int-to-float v0, v0

    sput v0, Lu0/b;->a:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    const v1, 0x401a827a

    div-float/2addr v0, v1

    sput v0, Lu0/b;->b:F

    return-void
.end method

.method public static final a(Lf1/m;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V
    .locals 9

    check-cast p4, Lp1/q;

    const v0, 0x69deb1cb

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    or-int/lit16 v0, v0, 0x80

    and-int/lit16 v2, v0, 0x93

    const/16 v3, 0x92

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_2

    move v2, v5

    goto :goto_2

    :cond_2
    move v2, v4

    :goto_2
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p4, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p4}, Lp1/q;->Z()V

    and-int/lit8 v2, p5, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {p4}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p4}, Lp1/q;->X()V

    and-int/lit16 v0, v0, -0x381

    goto :goto_4

    :cond_4
    :goto_3
    and-int/lit16 v0, v0, -0x381

    const-wide p2, 0x7fc000007fc00000L    # 2.247117487993712E307

    :goto_4
    invoke-virtual {p4}, Lp1/q;->r()V

    and-int/lit8 v0, v0, 0xe

    if-eq v0, v1, :cond_5

    move v5, v4

    :cond_5
    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v5, :cond_6

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_7

    :cond_6
    new-instance v1, Lrq0/x;

    const/16 v2, 0x16

    invoke-direct {v1, p0, v2}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v4, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->x:Lb2/m;

    new-instance v3, Lg1/a3;

    const/4 v4, 0x1

    invoke-direct {v3, p2, p3, v1, v4}, Lg1/a3;-><init>(JLjava/lang/Object;I)V

    const v1, -0x628ed1fe

    invoke-static {v1, p4, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    or-int/lit16 v0, v0, 0x1b0

    invoke-static {p0, v2, v1, p4, v0}, Lf1/y0;->b(Lf1/m;Lb2/h;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    move-wide v6, p2

    goto :goto_6

    :cond_8
    invoke-virtual {p4}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v3, Lp6/p1;

    move-object v4, p0

    move-object v5, p1

    move v8, p5

    invoke-direct/range {v3 .. v8}, Lp6/p1;-><init>(Lf1/m;Landroidx/compose/ui/Modifier;JI)V

    iput-object v3, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 5

    check-cast p2, Lp1/q;

    const v0, 0x29616e63

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, p1, 0x6

    goto :goto_1

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    or-int/2addr v2, p1

    :goto_1
    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x1

    if-eq v3, v1, :cond_2

    move v1, v4

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/2addr v2, v4

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    if-eqz v0, :cond_3

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_3
    sget v0, Lu0/b;->b:F

    sget v1, Lu0/b;->a:F

    invoke-static {p0, v0, v1}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lu0/a;->x:Lu0/a;

    invoke-static {v0, v1}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p2, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_3

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_5

    new-instance v0, Lau1/f;

    invoke-direct {v0, p0, p1, p3}, Lau1/f;-><init>(Landroidx/compose/ui/Modifier;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method
