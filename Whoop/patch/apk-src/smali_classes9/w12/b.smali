.class public abstract Lw12/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\r\u00a8\u0006\u0011\u00b2\u0006\u000c\u0010\u0010\u001a\u00020\u00088\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "currentStep",
        "totalSteps",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "b",
        "(IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "",
        "e",
        "(II)F",
        "Ly3/f;",
        "a",
        "F",
        "TRACK_HEIGHT",
        "TRACK_CORNER",
        "animatedProgress",
        "onboarding-personalization_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x2

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lw12/b;->a:F

    const/4 v0, 0x1

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lw12/b;->b:F

    return-void
.end method

.method public static synthetic a(IILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw12/b;->d(IILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p3

    check-cast v5, Lp1/q;

    const p3, 0x4895d9f9

    invoke-virtual {v5, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p4, 0x6

    if-nez p3, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->e(I)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    goto :goto_1

    :cond_1
    move p3, p4

    :goto_1
    and-int/lit8 v0, p4, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v5, p1}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p3, v0

    :cond_3
    and-int/lit16 v0, p4, 0x180

    if-nez v0, :cond_5

    invoke-virtual {v5, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr p3, v0

    :cond_5
    and-int/lit16 v0, p3, 0x93

    const/16 v1, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v0, v1, :cond_6

    move v0, v9

    goto :goto_4

    :cond_6
    move v0, v8

    :goto_4
    and-int/2addr p3, v9

    invoke-virtual {v5, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-static {p0, p1}, Lw12/b;->e(II)F

    move-result v1

    const/16 v6, 0xc00

    const/16 v7, 0x16

    const/4 v2, 0x0

    const-string v3, "conversationProgress"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p3

    sget v0, Lw12/b;->a:F

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lw12/b;->b:F

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v0, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    sget-object v4, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v2, v3, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p3}, Lw12/b;->c(Lp1/t2;)F

    move-result p3

    invoke-static {p3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    invoke-static {p3, v0}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {p3, v0, v1, v2, v3}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object p3

    invoke-static {p3, v5, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_b

    new-instance v0, Leg2/l;

    invoke-direct {v0, p0, p1, p4, p2}, Leg2/l;-><init>(IIILandroidx/compose/ui/Modifier;)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final d(IILandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lw12/b;->b(IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(II)F
    .locals 0

    if-gtz p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p0, p1}, Llz0/f;->d(II)F

    move-result p0

    return p0
.end method
