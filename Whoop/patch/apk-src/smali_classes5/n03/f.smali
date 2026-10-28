.class public final Ln03/f;
.super Lp6/g0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Ln03/f;",
        "Lp6/g0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "v",
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
        "y",
        "()Ly6/h;",
        "stateDefinition",
        "Lp6/u1;",
        "F",
        "Lp6/u1;",
        "g",
        "()Lp6/u1;",
        "sizeMode",
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


# instance fields
.field private final E:Ly6/h;

.field private final F:Lp6/u1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp6/g0;-><init>()V

    sget-object v0, Ly6/h;->a:Ly6/h;

    iput-object v0, p0, Ln03/f;->E:Ly6/h;

    sget-object v0, Lp6/t1;->a:Lp6/t1;

    iput-object v0, p0, Ln03/f;->F:Lp6/u1;

    return-void
.end method

.method public static synthetic s(FZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln03/f;->w(FZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Ln03/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln03/f;->x(Ln03/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ln03/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ln03/f;->z(Ln03/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final v(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x3735408f

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    invoke-virtual {v5, p1, v1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    const p1, -0x1fdef903

    invoke-virtual {v5, p1}, Lp1/q;->f0(I)V

    invoke-static {}, Ln6/h;->c()Lp1/b0;

    move-result-object p1

    invoke-virtual {v5, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Lf6/f;

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    const-string v1, "WIDGET_KEY_RECOVERY_PERCENT"

    invoke-static {v1}, Lge3/g;->x(Ljava/lang/String;)Lf6/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_1

    :cond_1
    const/high16 v1, -0x40800000    # -1.0f

    :goto_1
    const-string v2, "WIDGET_KEY_IS_CALIBRATING"

    invoke-static {v2}, Lge3/g;->f(Ljava/lang/String;)Lf6/d;

    move-result-object v2

    invoke-virtual {p1, v2}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :cond_2
    new-instance p1, Lih0/x;

    const/4 v2, 0x2

    invoke-direct {p1, v1, v2, v0}, Lih0/x;-><init>(FIZ)V

    const v0, -0x2ab5286a

    invoke-static {v0, v5, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0x6000

    const/16 v7, 0xf

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lx81/e;->n(Lcom/whoop/data/repositories/FeatureFlagChecker;Lfy1/l;Ldp0/g;La91/b;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Lk71/i;

    const/16 v1, 0xf

    invoke-direct {v0, p0, p2, v1}, Lk71/i;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final w(FZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ln6/h;->a()Lp1/u2;

    move-result-object v0

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    invoke-static {}, Ln6/h;->a()Lp1/u2;

    move-result-object v0

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, p0}, Lo03/a;->i(Landroid/content/Context;F)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p0 .. p1}, Lo03/a;->j(FZ)J

    move-result-wide v4

    sget v6, Ld03/a;->h:I

    const/4 v12, 0x0

    const/16 v13, 0xf0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v13}, Ln03/e;->d(Landroid/content/Context;Ljava/lang/String;JILjava/lang/String;Lo6/a;Ln6/o;FLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Ln03/f;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-direct {p0, p2, p1}, Ln03/f;->v(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Ln03/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-direct {p0, p1, v2}, Ln03/f;->v(Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public g()Lp6/u1;
    .locals 1

    iget-object v0, p0, Ln03/f;->F:Lp6/u1;

    return-object v0
.end method

.method public bridge synthetic h()Ly6/g;
    .locals 1

    invoke-virtual {p0}, Ln03/f;->y()Ly6/h;

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

    instance-of p1, p3, Ln03/f$a;

    if-eqz p1, :cond_0

    move-object p1, p3

    check-cast p1, Ln03/f$a;

    iget p2, p1, Ln03/f$a;->E:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, Ln03/f$a;->E:I

    goto :goto_0

    :cond_0
    new-instance p1, Ln03/f$a;

    invoke-direct {p1, p0, p3}, Ln03/f$a;-><init>(Ln03/f;Lq83/d;)V

    :goto_0
    iget-object p2, p1, Ln03/f$a;->y:Ljava/lang/Object;

    sget-object p3, Lr83/a;->w:Lr83/a;

    iget v0, p1, Ln03/f$a;->E:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p3, p1, Ln03/f$a;->x:Ljava/lang/Object;

    check-cast p3, Ln6/l;

    iget-object p1, p1, Ln03/f$a;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lmw1/a;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lx1/b;

    const v2, 0x19175bc

    invoke-direct {v0, p2, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p2, 0x0

    iput-object p2, p1, Ln03/f$a;->w:Ljava/lang/Object;

    iput-object p2, p1, Ln03/f$a;->x:Ljava/lang/Object;

    iput v1, p1, Ln03/f$a;->E:I

    invoke-static {v0, p1}, Lpf/c;->Q(Lx1/b;Ls83/c;)V

    return-object p3
.end method

.method public y()Ly6/h;
    .locals 1

    iget-object v0, p0, Ln03/f;->E:Ly6/h;

    return-object v0
.end method
