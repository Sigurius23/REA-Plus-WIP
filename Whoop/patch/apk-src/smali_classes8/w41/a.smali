.class public abstract Lw41/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a5\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a?\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\"A\u0010\u0014\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lw41/w;",
        "userLocation",
        "",
        "isMyLocationEnabled",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "overlay",
        "j",
        "(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)V",
        "mapOverlay",
        "f",
        "(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;II)V",
        "Lp1/t1;",
        "Lkotlin/Function4;",
        "a",
        "Lp1/t1;",
        "n",
        "()Lp1/t1;",
        "LocalActivityMapBackground",
        "design_release"
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
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvw0/a;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lvw0/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lw41/a;->a:Lp1/t1;

    return-void
.end method

.method public static synthetic a()Lc93/p;
    .locals 1

    invoke-static {}, Lw41/a;->l()Lc93/p;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Leu/g;ZLc93/m;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw41/a;->h(Leu/g;ZLc93/m;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lw41/w;Leu/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/a;->g(Lw41/w;Leu/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lw41/a;->k(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lw41/a;->i(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lw41/w;",
            "Z",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, 0x6bbd0ba4

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_2
    move v1, v5

    :goto_1
    and-int/lit8 v2, v5, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p6, 0x2

    if-nez v2, :cond_3

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v1, v1, 0x180

    goto :goto_4

    :cond_5
    and-int/lit16 v3, v5, 0x180

    if-nez v3, :cond_7

    invoke-virtual {v9, p2}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x100

    goto :goto_3

    :cond_6
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v1, v4

    :cond_7
    :goto_4
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    :cond_8
    move-object/from16 v6, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_8

    move-object/from16 v6, p3

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_5

    :cond_a
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v1, v7

    :goto_6
    and-int/lit16 v7, v1, 0x493

    const/16 v8, 0x492

    const/4 v12, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_b

    move v7, v10

    goto :goto_7

    :cond_b
    move v7, v12

    :goto_7
    and-int/2addr v1, v10

    invoke-virtual {v9, v1, v7}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v1, v5, 0x1

    if-eqz v1, :cond_e

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v9}, Lp1/q;->X()V

    move v3, p2

    :cond_d
    move-object v0, v6

    goto :goto_a

    :cond_e
    :goto_8
    if-eqz v0, :cond_f

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_f
    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_10

    new-instance p1, Lw41/w;

    const-wide v0, 0x40452e17c1bda512L    # 42.3601

    const-wide v7, -0x3fae3c3afb7e9100L    # -71.0589

    invoke-direct {p1, v0, v1, v7, v8}, Lw41/w;-><init>(DD)V

    :cond_10
    if-eqz v2, :cond_11

    move v3, v12

    goto :goto_9

    :cond_11
    move v3, p2

    :goto_9
    if-eqz v4, :cond_d

    const/4 v0, 0x0

    :goto_a
    invoke-virtual {v9}, Lp1/q;->r()V

    new-instance v1, Lw41/l;

    const/4 v2, 0x7

    invoke-direct {v1, p1, v2}, Lw41/l;-><init>(Ljava/lang/Object;I)V

    const v2, -0x71e929de

    invoke-virtual {v9, v2}, Lp1/q;->f0(I)V

    sget-object v7, Leu/g;->h:Lp0/n0;

    new-array v6, v12, [Ljava/lang/Object;

    new-instance v8, Lw41/a$a;

    invoke-direct {v8, v1}, Lw41/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/16 v10, 0x48

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leu/g;

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, p0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v2, Lb81/b;

    const/4 v4, 0x2

    invoke-direct {v2, v1, v3, v0, v4}, Lb81/b;-><init>(Ljava/lang/Object;ZLl83/e;I)V

    const v1, -0x2f80a606

    invoke-static {v1, v9, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v11, 0xc00

    const/4 v12, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v9

    move-object v9, v1

    invoke-static/range {v6 .. v12}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    move-object v4, v0

    :goto_b
    move-object v1, p0

    move-object v2, p1

    goto :goto_c

    :cond_12
    invoke-virtual {v9}, Lp1/q;->X()V

    move v3, p2

    move-object v4, v6

    goto :goto_b

    :goto_c
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_13

    new-instance v0, Lry2/h;

    const/16 v7, 0x8

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lry2/h;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZLl83/e;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final g(Lw41/w;Leu/g;)Ll83/a0;
    .locals 3

    const-string v0, "$this$rememberCameraPositionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lw41/p;->a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition;

    const/4 v1, 0x0

    const/high16 v2, 0x41800000    # 16.0f

    invoke-direct {v0, p0, v2, v1, v1}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V

    invoke-virtual {p1, v0}, Leu/g;->d(Lcom/google/android/gms/maps/model/CameraPosition;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Leu/g;ZLc93/m;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 25

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "$this$BoxWithConstraints"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p5, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p4

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p5, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p5

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_2

    move v3, v6

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    and-int/2addr v2, v6

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    check-cast v1, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v1

    invoke-static {v1}, Lw41/m;->c(F)Lw41/x;

    move-result-object v1

    invoke-static {v1}, Lw41/m;->d(Lw41/x;)Ll0/k1;

    move-result-object v19

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v4, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_3

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v4, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-nez v9, :cond_4

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    :cond_4
    invoke-static {v8, v4, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v4, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v1, Lwp/g;

    invoke-static {}, Lw41/k;->M()Lp1/t1;

    move-result-object v2

    invoke-virtual {v4, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Lwp/g;-><init>(Ljava/lang/String;)V

    new-instance v10, Leu/z;

    const/4 v2, 0x0

    const/16 v3, 0x19b

    move/from16 v8, p1

    invoke-direct {v10, v8, v2, v1, v3}, Leu/z;-><init>(ZLcom/google/android/gms/maps/model/LatLngBounds;Lwp/g;I)V

    new-instance v11, Leu/d0;

    const/4 v15, 0x0

    const/16 v16, 0x43

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Leu/d0;-><init>(ZZZZI)V

    sget-object v1, Leu/g;->h:Lp0/n0;

    const/16 v23, 0x0

    const v24, 0xbfac

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const v22, 0x8046

    move-object/from16 v8, p0

    move-object/from16 v21, v4

    invoke-static/range {v7 .. v24}, Lx30/s0;->c(Landroidx/compose/ui/Modifier;Leu/g;Lc93/a;Leu/z;Leu/d0;Leu/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ll0/k1;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v21

    if-nez v0, :cond_6

    const v0, -0x6236e767

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    :goto_4
    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    const v2, 0x3ee57468

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :goto_5
    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    move-object v1, v4

    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lw41/a;->f(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lw41/w;",
            "Z",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v6, p4

    check-cast v6, Lp1/q;

    const v0, -0x67ef501

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v3, p5, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, p5, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v6, p2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, p5, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v6, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v6, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_9

    and-int/lit16 v7, v0, 0x1ffe

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-static/range {v2 .. v8}, Lw41/a;->f(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_9
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_a

    new-instance v0, Lrq2/w;

    const/16 v2, 0xa

    move-object v3, p0

    move-object v4, p1

    move v6, p2

    move-object v5, p3

    move v1, p5

    invoke-direct/range {v0 .. v6}, Lrq2/w;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lw41/a;->j(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l()Lc93/p;
    .locals 1

    sget-object v0, Lw41/t;->a:Lw41/t;

    invoke-virtual {v0}, Lw41/t;->b()Lc93/p;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic m(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lw41/a;->j(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final n()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lw41/a;->a:Lp1/t1;

    return-object v0
.end method
