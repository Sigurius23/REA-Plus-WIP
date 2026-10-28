.class public final Ln03/k;
.super Lp6/g0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J \u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Ln03/k;",
        "Lp6/g0;",
        "Ly6/g;",
        "Lf6/f;",
        "stateDefinition",
        "<init>",
        "(Ly6/g;)V",
        "Landroid/content/Context;",
        "context",
        "Ln6/l;",
        "id",
        "Ll83/a0;",
        "l",
        "(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;",
        "x",
        "(Landroidx/compose/runtime/Composer;I)V",
        "E",
        "Ly6/g;",
        "h",
        "()Ly6/g;",
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
.field private final E:Ly6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly6/g;"
        }
    .end annotation
.end field

.field private final F:Lp6/u1;


# direct methods
.method public constructor <init>(Ly6/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/g;",
            ")V"
        }
    .end annotation

    const-string v0, "stateDefinition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lp6/g0;-><init>()V

    .line 2
    iput-object p1, p0, Ln03/k;->E:Ly6/g;

    .line 3
    sget-object p1, Lp6/t1;->a:Lp6/t1;

    iput-object p1, p0, Ln03/k;->F:Lp6/u1;

    return-void
.end method

.method public synthetic constructor <init>(Ly6/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Ly6/h;->a:Ly6/h;

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Ln03/k;-><init>(Ly6/g;)V

    return-void
.end method

.method public static synthetic s(Ln03/k;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ln03/k;->y(Ln03/k;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ln03/k;->v(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ln03/k;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln03/k;->w(Ln03/k;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    and-int/lit8 v1, p5, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p5, 0x1

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez p1, :cond_1

    sget v1, Ld03/b;->a:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v1, p1

    :goto_1
    invoke-static/range {p2 .. p2}, Lo03/a;->g(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static/range {p2 .. p2}, Lo03/a;->h(Ljava/lang/String;)I

    move-result v2

    const-string v6, "whoop://com.whoop/stress_monitor"

    invoke-static {p0, v6}, Lo03/a;->b(Landroid/content/Context;Ljava/lang/String;)Lo6/a;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->n()J

    move-result-wide v7

    const v10, 0x3f733333    # 0.95f

    invoke-static {v10, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    new-instance v10, La7/f;

    invoke-direct {v10, v7, v8}, La7/f;-><init>(J)V

    new-instance v7, Ln6/c;

    invoke-direct {v7, v10}, Ln6/c;-><init>(La7/f;)V

    const/16 v8, 0x10

    int-to-float v8, v8

    new-instance v10, Lp6/u;

    new-instance v11, La7/a;

    invoke-direct {v11, v8}, La7/a;-><init>(F)V

    invoke-direct {v10, v11}, Lp6/u;-><init>(La7/a;)V

    invoke-interface {v7, v10}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object v7

    int-to-float v8, v3

    const/high16 v10, 0xc00000

    const/4 v11, 0x0

    move-wide v12, v4

    move v4, v2

    move-wide v2, v12

    move-object v0, p0

    move-object/from16 v5, p3

    invoke-static/range {v0 .. v11}, Ln03/e;->d(Landroid/content/Context;Ljava/lang/String;JILjava/lang/String;Lo6/a;Ln6/o;FLandroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_2
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w(Ln03/k;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Ln03/k;->x(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Ln03/k;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-virtual {p0, p1, v2}, Ln03/k;->x(Landroidx/compose/runtime/Composer;I)V

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

    iget-object v0, p0, Ln03/k;->F:Lp6/u1;

    return-object v0
.end method

.method public h()Ly6/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly6/g;"
        }
    .end annotation

    iget-object v0, p0, Ln03/k;->E:Ly6/g;

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

    instance-of p1, p3, Ln03/k$a;

    if-eqz p1, :cond_0

    move-object p1, p3

    check-cast p1, Ln03/k$a;

    iget p2, p1, Ln03/k$a;->E:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, Ln03/k$a;->E:I

    goto :goto_0

    :cond_0
    new-instance p1, Ln03/k$a;

    invoke-direct {p1, p0, p3}, Ln03/k$a;-><init>(Ln03/k;Lq83/d;)V

    :goto_0
    iget-object p2, p1, Ln03/k$a;->y:Ljava/lang/Object;

    sget-object p3, Lr83/a;->w:Lr83/a;

    iget v0, p1, Ln03/k$a;->E:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p3, p1, Ln03/k$a;->x:Ljava/lang/Object;

    check-cast p3, Ln6/l;

    iget-object p1, p1, Ln03/k$a;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lmw1/a;

    const/4 v0, 0x7

    invoke-direct {p2, p0, v0}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lx1/b;

    const v2, 0x7958f17e

    invoke-direct {v0, p2, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p2, 0x0

    iput-object p2, p1, Ln03/k$a;->w:Ljava/lang/Object;

    iput-object p2, p1, Ln03/k$a;->x:Ljava/lang/Object;

    iput v1, p1, Ln03/k$a;->E:I

    invoke-static {v0, p1}, Lpf/c;->Q(Lx1/b;Ls83/c;)V

    return-object p3
.end method

.method public final x(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, 0x1dbd5db3

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

    if-eqz p1, :cond_2

    const p1, -0x1fdef903

    invoke-virtual {v5, p1}, Lp1/q;->f0(I)V

    sget-object p1, Ln6/h;->c:Lp1/b0;

    invoke-virtual {v5, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Lf6/f;

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    const-string v0, "WIDGET_KEY_STRESS_SCORE"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    const-string v0, "WIDGET_KEY_STRESS_STATE"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    const-string v0, "WIDGET_KEY_STRESS_BUCKET"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, Ljava/lang/String;

    sget-object p1, Ln6/h;->b:Lp1/u2;

    invoke-virtual {v5, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Landroid/content/Context;

    new-instance v6, Lat2/u;

    const/16 v11, 0x19

    invoke-direct/range {v6 .. v11}, Lat2/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p1, 0x60715058

    invoke-static {p1, v5, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0x6000

    const/16 v7, 0xf

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lx81/e;->n(Lcom/whoop/data/repositories/FeatureFlagChecker;Lfy1/l;Ldp0/g;La91/b;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lk71/i;

    const/16 v1, 0x14

    invoke-direct {v0, p0, p2, v1}, Lk71/i;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method
