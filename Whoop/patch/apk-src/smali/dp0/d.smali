.class public abstract Ldp0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a1\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a-\u0010\u000e\u001a\u00020\u000c2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\t\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u0017\u0010\u0013\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0010\u00a8\u0006\u001a\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0018\u001a\u00020\u00078\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00078\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "",
        "e",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z",
        "Landroidx/compose/ui/Modifier;",
        "Lep0/j;",
        "screenContext",
        "Ly3/f;",
        "bottomPadding",
        "isNavHostScreen",
        "a",
        "(Landroidx/compose/ui/Modifier;Lep0/j;FZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;",
        "Ll0/k1;",
        "basePadding",
        "f",
        "(Lep0/j;Ll0/k1;ZLandroidx/compose/runtime/Composer;II)Ll0/k1;",
        "F",
        "d",
        "()F",
        "FAB_HEIGHT_WITH_MARGIN",
        "b",
        "COACH_BAR_HEIGHT_WITH_MARGIN",
        "Lep0/d;",
        "globalCoachState",
        "animatedPadding",
        "animatedBottomPadding",
        "coach-everywhere-common_release"
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
    .locals 1

    const/16 v0, 0x56

    int-to-float v0, v0

    sput v0, Ldp0/d;->a:F

    const/16 v0, 0xa0

    int-to-float v0, v0

    sput v0, Ldp0/d;->b:F

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Lep0/j;FZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ComposableModifierFactory",
            "This is actually the standard moving forward, but lint disagrees and the agents will keep trying to change it"
        }
    .end annotation

    const-string p1, "$this$coachEverywhereBottomSheetPadding"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p6, 0x2

    const/4 p5, 0x0

    if-eqz p1, :cond_0

    int-to-float p2, p5

    :cond_0
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_1

    move p3, p5

    :cond_1
    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object p1

    move-object v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldp0/g;

    sget-object p4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v3, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/res/Configuration;

    sget-object p6, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v3, p6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ly3/c;

    invoke-interface {p1}, Ldp0/g;->getState()Lec3/f2;

    move-result-object p1

    invoke-static {p1, v3, p5}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p1

    const v0, -0x7b188f30

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v3}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v0

    iget-object v0, v0, Ll0/c2;->e:Ll0/b;

    invoke-virtual {v0}, Ll0/b;->e()Lv4/b;

    move-result-object v0

    iget v0, v0, Lv4/b;->d:I

    invoke-interface {p6, v0}, Ly3/c;->e0(I)F

    move-result p6

    invoke-virtual {v3, p5}, Lp1/q;->q(Z)V

    if-eqz p3, :cond_2

    const p3, -0x7b187b2a

    invoke-virtual {v3, p3}, Lp1/q;->e0(I)V

    invoke-static {}, Lqf1/a;->c()Lp1/t1;

    move-result-object p3

    invoke-virtual {v3, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-static {p3}, Ldp0/d;->e(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z

    move-result p3

    invoke-virtual {v3, p5}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_2
    const p3, 0x18091abf

    invoke-virtual {v3, p3}, Lp1/q;->e0(I)V

    invoke-virtual {v3, p5}, Lp1/q;->q(Z)V

    move p3, p5

    :goto_0
    if-eqz p3, :cond_3

    sget p3, Ldp0/d;->b:F

    goto :goto_1

    :cond_3
    sget p3, Ldp0/d;->a:F

    :goto_1
    invoke-static {p1}, Ldp0/d;->b(Lp1/t2;)Lep0/d;

    move-result-object p1

    invoke-virtual {p1}, Lep0/d;->f()Z

    move-result p1

    if-eqz p1, :cond_4

    iget p1, p4, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float p1, p1

    const p2, 0x3eb33333    # 0.35f

    mul-float/2addr p1, p2

    :goto_2
    move v0, p1

    goto :goto_3

    :cond_4
    add-float/2addr p2, p6

    add-float p1, p2, p3

    goto :goto_2

    :goto_3
    const/16 p1, 0x12c

    const/4 p2, 0x0

    const/4 p3, 0x6

    invoke-static {p1, p5, p2, p3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    const/16 v4, 0x1b0

    const/16 v5, 0x8

    const-string v2, "coach_bottom_sheet_padding"

    invoke-static/range {v0 .. v5}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p1

    invoke-static {p1}, Ldp0/d;->c(Lp1/t2;)F

    move-result v4

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lp1/t2;)Lep0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lep0/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lep0/d;

    return-object p0
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

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method public static final d()F
    .locals 1

    sget v0, Ldp0/d;->a:F

    return v0
.end method

.method public static final e(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aix-coach-bar-fab"

    invoke-interface {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "aix-coach-bar-home"

    invoke-interface {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final f(Lep0/j;Ll0/k1;ZLandroidx/compose/runtime/Composer;II)Ll0/k1;
    .locals 8

    and-int/lit8 p4, p5, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    int-to-float p1, v0

    new-instance p4, Ll0/l1;

    invoke-direct {p4, p1, p1, p1, p1}, Ll0/l1;-><init>(FFFF)V

    move-object p1, p4

    :cond_0
    and-int/lit8 p4, p5, 0x4

    if-eqz p4, :cond_1

    move p2, v0

    :cond_1
    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object p4

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ldp0/g;

    sget-object p4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v4, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/content/res/Configuration;

    sget-object p5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v4, p5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ly3/c;

    sget-object v1, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v4, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ly3/m;

    invoke-interface {p3}, Ldp0/g;->getState()Lec3/f2;

    move-result-object p3

    invoke-static {p3, v4, v0}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p3

    const v1, -0x358d9406    # -3971838.5f

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    sget-object v1, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v4}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v1

    iget-object v1, v1, Ll0/c2;->e:Ll0/b;

    invoke-virtual {v1}, Ll0/b;->e()Lv4/b;

    move-result-object v1

    iget v1, v1, Lv4/b;->d:I

    invoke-interface {p5, v1}, Ly3/c;->e0(I)F

    move-result p5

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    if-eqz p2, :cond_2

    const p2, -0x358d8000    # -3973120.0f

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-static {}, Lqf1/a;->c()Lp1/t1;

    move-result-object p2

    invoke-virtual {v4, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-static {p2}, Ldp0/d;->e(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z

    move-result p2

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_2
    const p2, -0x7c227b2b

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    move p2, v0

    :goto_0
    if-eqz p2, :cond_3

    sget p2, Ldp0/d;->b:F

    goto :goto_1

    :cond_3
    sget p2, Ldp0/d;->a:F

    :goto_1
    invoke-static {p3}, Ldp0/d;->g(Lp1/t2;)Lep0/d;

    move-result-object p3

    invoke-virtual {p3}, Lep0/d;->f()Z

    move-result p3

    if-eqz p3, :cond_4

    iget p0, p4, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float p0, p0

    const p2, 0x3eb33333    # 0.35f

    mul-float/2addr p0, p2

    :goto_2
    move v1, p0

    goto :goto_4

    :cond_4
    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lep0/j;->x()Z

    move-result p0

    const/4 p3, 0x1

    if-ne p0, p3, :cond_5

    goto :goto_3

    :cond_5
    move p3, v0

    :goto_3
    if-eqz p3, :cond_6

    invoke-interface {p1}, Ll0/k1;->a()F

    move-result p0

    add-float/2addr p0, p5

    add-float/2addr p0, p2

    goto :goto_2

    :cond_6
    invoke-interface {p1}, Ll0/k1;->a()F

    move-result p0

    add-float/2addr p0, p5

    goto :goto_2

    :goto_4
    const/16 p0, 0x12c

    const/4 p2, 0x0

    const/4 p3, 0x6

    invoke-static {p0, v0, p2, p3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    const/16 v5, 0x1b0

    const/16 v6, 0x8

    const-string v3, "coach_bottom_sheet_content_padding"

    invoke-static/range {v1 .. v6}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p0

    invoke-static {p1, v7}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result p2

    invoke-interface {p1}, Ll0/k1;->d()F

    move-result p3

    invoke-static {p1, v7}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result p1

    invoke-static {p0}, Ldp0/d;->h(Lp1/t2;)F

    move-result p0

    new-instance p4, Ll0/l1;

    invoke-direct {p4, p2, p3, p1, p0}, Ll0/l1;-><init>(FFFF)V

    return-object p4
.end method

.method private static final g(Lp1/t2;)Lep0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lep0/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lep0/d;

    return-object p0
.end method

.method private static final h(Lp1/t2;)F
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

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method
