.class public final Lk03/c;
.super Lp6/g0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk03/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lk03/c;",
        "Lp6/g0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "w",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Landroid/content/Context;",
        "context",
        "Ln6/l;",
        "id",
        "l",
        "(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;",
        "Ly6/h;",
        "E",
        "Ly6/h;",
        "A",
        "()Ly6/h;",
        "stateDefinition",
        "Lp6/u1;",
        "F",
        "Lp6/u1;",
        "g",
        "()Lp6/u1;",
        "sizeMode",
        "G",
        "a",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final G:Lk03/c$a;

.field public static final H:I

.field private static final I:J

.field private static final J:J

.field private static final K:J


# instance fields
.field private final E:Ly6/h;

.field private final F:Lp6/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk03/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk03/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lk03/c;->G:Lk03/c$a;

    const/16 v0, 0x8

    sput v0, Lk03/c;->H:I

    const/16 v0, 0x5a

    int-to-float v0, v0

    const/4 v1, 0x1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lvf3/b;->a(FF)J

    move-result-wide v2

    sput-wide v2, Lk03/c;->I:J

    const/16 v0, 0xa0

    int-to-float v0, v0

    invoke-static {v0, v1}, Lvf3/b;->a(FF)J

    move-result-wide v2

    sput-wide v2, Lk03/c;->J:J

    const/16 v0, 0x10e

    int-to-float v0, v0

    invoke-static {v0, v1}, Lvf3/b;->a(FF)J

    move-result-wide v0

    sput-wide v0, Lk03/c;->K:J

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lp6/g0;-><init>()V

    sget-object v0, Ly6/h;->a:Ly6/h;

    iput-object v0, p0, Lk03/c;->E:Ly6/h;

    new-instance v0, Lp6/s1;

    sget-wide v1, Lk03/c;->I:J

    new-instance v3, Ly3/h;

    invoke-direct {v3, v1, v2}, Ly3/h;-><init>(J)V

    sget-wide v1, Lk03/c;->J:J

    new-instance v4, Ly3/h;

    invoke-direct {v4, v1, v2}, Ly3/h;-><init>(J)V

    sget-wide v1, Lk03/c;->K:J

    new-instance v5, Ly3/h;

    invoke-direct {v5, v1, v2}, Ly3/h;-><init>(J)V

    filled-new-array {v3, v4, v5}, [Ly3/h;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Lp6/s1;-><init>(Ljava/util/Set;)V

    iput-object v0, p0, Lk03/c;->F:Lp6/u1;

    return-void
.end method

.method private static final B(Lk03/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-direct {p0, p1, v2}, Lk03/c;->w(Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic s(Lk03/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk03/c;->B(Lk03/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lk03/c;->y(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lk03/c;->x(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lk03/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lk03/c;->z(Lk03/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final w(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v0, p2

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v1, -0x1cdaab9c

    invoke-virtual {v6, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-virtual {v6, v1, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    const v1, -0x1fdef903

    invoke-virtual {v6, v1}, Lp1/q;->f0(I)V

    invoke-static {}, Ln6/h;->c()Lp1/b0;

    move-result-object v1

    invoke-virtual {v6, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    check-cast v1, Lf6/f;

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const-string v3, "WIDGET_KEY_STRAP_BATTERY_PERCENT"

    invoke-static {v3}, Lge3/g;->C(Ljava/lang/String;)Lf6/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_1

    const v4, 0x351adff1

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "%"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_1
    move-object v15, v4

    goto :goto_2

    :cond_1
    const v4, -0x50de1347

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-static {}, Ln6/h;->a()Lp1/u2;

    move-result-object v4

    invoke-virtual {v6, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    sget v5, Ld03/b;->b:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    goto :goto_1

    :goto_2
    invoke-static {v3}, Lo03/a;->d(Ljava/lang/Integer;)I

    move-result v9

    invoke-static {v3}, Lo03/a;->c(Ljava/lang/Integer;)J

    move-result-wide v11

    const-string v3, "WIDGET_KEY_RECOVERY_PERCENT"

    invoke-static {v3}, Lge3/g;->x(Ljava/lang/String;)Lf6/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_3
    move v8, v3

    goto :goto_4

    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    goto :goto_3

    :goto_4
    const-string v3, "WIDGET_KEY_SLEEP_PERCENT"

    invoke-static {v3}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "getString(...)"

    if-nez v3, :cond_3

    const v3, -0x50dddc9c

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-static {}, Ln6/h;->a()Lp1/u2;

    move-result-object v3

    invoke-virtual {v6, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    sget v5, Ld03/b;->a:I

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    move-object v13, v3

    goto :goto_6

    :cond_3
    const v5, -0x50dde782

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    goto :goto_5

    :goto_6
    const-string v3, "WIDGET_KEY_STRAIN_PERCENT"

    invoke-static {v3}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_4

    const v3, -0x50ddc9fc

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-static {}, Ln6/h;->a()Lp1/u2;

    move-result-object v3

    invoke-virtual {v6, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    sget v5, Ld03/b;->a:I

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_7
    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    move-object v14, v3

    goto :goto_8

    :cond_4
    const v4, -0x50ddd501

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    goto :goto_7

    :goto_8
    const-string v3, "WIDGET_KEY_IS_CALIBRATING"

    invoke-static {v3}, Lge3/g;->f(Ljava/lang/String;)Lf6/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_5
    move/from16 v16, v2

    new-instance v7, Lk03/b;

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v16}, Lk03/b;-><init>(FIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const v1, 0x2ef38e9f

    invoke-static {v1, v6, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6000

    const/16 v8, 0xf

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v8}, Lx81/e;->n(Lcom/whoop/data/repositories/FeatureFlagChecker;Lfy1/l;Ldp0/g;La91/b;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Ld71/c;

    const/16 v3, 0x1c

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v0, v3}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_8
    move-object/from16 v4, p0

    return-void
.end method

.method private static final x(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    and-int/lit8 v0, p9, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p9, 0x1

    move-object/from16 v2, p8

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v3, Lk03/b;

    const/4 v6, 0x1

    move v4, p0

    move-object v9, p1

    move-object v10, p2

    move-object/from16 v11, p3

    move/from16 v5, p4

    move-wide/from16 v7, p5

    move/from16 v12, p7

    invoke-direct/range {v3 .. v12}, Lk03/b;-><init>(FIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const p0, -0x2e160003

    invoke-static {p0, v2, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p2

    const/16 p0, 0x180

    const/4 p1, 0x1

    const/4 v0, 0x0

    sget-object v1, Lv6/c;->d:Lv6/c;

    move/from16 p4, p0

    move/from16 p5, p1

    move-object p0, v0

    move-object p1, v1

    move-object/from16 p3, v2

    invoke-static/range {p0 .. p5}, Lrs/b;->a(Ln6/o;Lv6/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    move-object p0, v2

    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    and-int/lit8 v0, p9, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p9, 0x1

    move-object/from16 v12, p8

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Ln6/h;->b()Lp1/u2;

    move-result-object v0

    invoke-virtual {v12, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/h;

    iget-wide v0, v0, Ly3/h;->a:J

    sget-wide v4, Lk03/c;->I:J

    invoke-static {v0, v1, v4, v5}, Ly3/h;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_1

    const v0, -0x960152

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    move v4, p0

    move-object v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move/from16 v8, p4

    move-wide/from16 v9, p5

    move/from16 v11, p7

    invoke-static/range {v4 .. v13}, Lk03/n;->W(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    sget-wide v4, Lk03/c;->J:J

    invoke-static {v0, v1, v4, v5}, Ly3/h;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_2

    const v0, -0x95ef39

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    move v4, p0

    move-object v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move/from16 v8, p4

    move-wide/from16 v9, p5

    move/from16 v11, p7

    invoke-static/range {v4 .. v13}, Lk03/n;->V(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    sget-wide v4, Lk03/c;->K:J

    invoke-static {v0, v1, v4, v5}, Ly3/h;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    const v0, -0x95de34

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    move v4, p0

    move-object v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move/from16 v8, p4

    move-wide/from16 v9, p5

    move/from16 v11, p7

    invoke-static/range {v4 .. v13}, Lk03/n;->X(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_3
    const p0, -0x122401db

    invoke-virtual {v12, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    :goto_1
    const/16 p0, 0xb4

    int-to-float p0, p0

    sget-object p1, Ln6/m;->a:Ln6/m;

    invoke-static {p1, p0}, Ls2/d;->o(Ln6/o;F)Ln6/o;

    move-result-object p0

    invoke-static {p0}, Ls2/d;->l(Ln6/o;)Ln6/o;

    move-result-object p0

    invoke-static {}, Ln6/h;->a()Lp1/u2;

    move-result-object p1

    invoke-virtual {v12, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lo03/a;->a(Landroid/content/Context;)Lo6/a;

    move-result-object p1

    invoke-static {p0, p1}, Lx30/s0;->l(Ln6/o;Lo6/a;)Ln6/o;

    move-result-object p0

    sget-object p1, Lk03/a;->a:Lk03/a;

    invoke-virtual {p1}, Lk03/a;->d()Lc93/m;

    move-result-object p1

    const/16 v0, 0x180

    const/4 v1, 0x2

    const/4 v2, 0x0

    move-object/from16 p2, p1

    move/from16 p4, v0

    move/from16 p5, v1

    move-object p1, v2

    move-object/from16 p3, v12

    invoke-static/range {p0 .. p5}, Lrs/b;->a(Ln6/o;Lv6/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_4
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lk03/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-direct {p0, p2, p1}, Lk03/c;->w(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public A()Ly6/h;
    .locals 1

    iget-object v0, p0, Lk03/c;->E:Ly6/h;

    return-object v0
.end method

.method public g()Lp6/u1;
    .locals 1

    iget-object v0, p0, Lk03/c;->F:Lp6/u1;

    return-object v0
.end method

.method public bridge synthetic h()Ly6/g;
    .locals 1

    invoke-virtual {p0}, Lk03/c;->A()Ly6/h;

    move-result-object v0

    return-object v0
.end method

.method public l(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ln6/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p3, Lk03/c$b;

    if-eqz p1, :cond_0

    move-object p1, p3

    check-cast p1, Lk03/c$b;

    iget p2, p1, Lk03/c$b;->E:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, Lk03/c$b;->E:I

    goto :goto_0

    :cond_0
    new-instance p1, Lk03/c$b;

    invoke-direct {p1, p0, p3}, Lk03/c$b;-><init>(Lk03/c;Lq83/d;)V

    :goto_0
    iget-object p2, p1, Lk03/c$b;->y:Ljava/lang/Object;

    sget-object p3, Lr83/a;->w:Lr83/a;

    iget v0, p1, Lk03/c$b;->E:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p3, p1, Lk03/c$b;->x:Ljava/lang/Object;

    check-cast p3, Ln6/l;

    iget-object p1, p1, Lk03/c$b;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lhb2/f;

    const/16 v0, 0x19

    invoke-direct {p2, p0, v0}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lx1/b;

    const v2, 0x49294db9

    invoke-direct {v0, p2, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p2, 0x0

    iput-object p2, p1, Lk03/c$b;->w:Ljava/lang/Object;

    iput-object p2, p1, Lk03/c$b;->x:Ljava/lang/Object;

    iput v1, p1, Lk03/c$b;->E:I

    invoke-static {v0, p1}, Lpf/c;->Q(Lx1/b;Ls83/c;)V

    return-object p3
.end method
