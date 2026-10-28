.class public abstract La61/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0002\u001a\u000f\u0010\u0007\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0002\u001a\u000f\u0010\u0008\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\u0002\u001a\u000f\u0010\t\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\t\u0010\u0002\u001a?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Ll83/a0;",
        "u",
        "(Landroidx/compose/runtime/Composer;I)V",
        "m",
        "o",
        "w",
        "q",
        "y",
        "s",
        "k",
        "",
        "totalProgress",
        "currentProgress",
        "",
        "leftText",
        "rightText",
        "Ly81/f;",
        "color",
        "rightTextColor",
        "Lk71/p;",
        "A",
        "(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;)Lk71/p;",
        "La61/e;",
        "E",
        "()La61/e;",
        "C",
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


# direct methods
.method public static final A(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;)Lk71/p;
    .locals 13

    move-object/from16 v3, p4

    move-object/from16 v0, p5

    const-string v1, "leftText"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "rightText"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "color"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "rightTextColor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lk71/p;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v1, Ly01/f;

    sget-object v4, Ly81/f;->BLACK_20:Ly81/f;

    new-instance v5, Ly01/g;

    invoke-static {p2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p2

    invoke-direct {v5, p2, v3}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    new-instance v6, Ly01/g;

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p2

    invoke-direct {v6, p2, v0}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    const/16 v8, 0x40

    const/4 v9, 0x0

    const/4 v7, 0x0

    move v2, p1

    move-object v0, v1

    move v1, p0

    invoke-direct/range {v0 .. v9}, Ly01/f;-><init>(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v10, v11, v12, v0}, Lk71/p;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lm91/u;)V

    return-object v10
.end method

.method public static synthetic B(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;ILjava/lang/Object;)Lk71/p;
    .locals 6

    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_0

    sget-object p5, Ly81/f;->WHITE_70:Ly81/f;

    :cond_0
    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, La61/d;->A(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;)Lk71/p;

    move-result-object p0

    return-object p0
.end method

.method public static final C()La61/e;
    .locals 19

    const-string v0, "HR ZONES 1-3 TIME"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v0, "Get 1:20 more hours of Zone 1-3 training during activities this week to hit your goal."

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v0, "50&"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v11, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    const/16 v13, 0x20

    const/4 v14, 0x0

    const/16 v7, 0x1388

    const/16 v8, 0x9c4

    const-string v9, "1:10"

    const-string v10, "2:30"

    const/4 v12, 0x0

    invoke-static/range {v7 .. v14}, La61/d;->B(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;ILjava/lang/Object;)Lk71/p;

    move-result-object v8

    new-instance v0, La61/f;

    const-string v1, "1:15"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v12, Lkd1/o$c;

    const/16 v17, 0xe

    const/16 v18, 0x0

    const-string v13, "https://s3-us-west-2.amazonaws.com/icons.whoop.com/mobile/activities/yoga.png"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Yoga"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v0, v1, v12, v2, v11}, La61/f;-><init>(Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    new-instance v1, La61/e;

    new-instance v2, La2/d;

    const/4 v0, 0x5

    invoke-direct {v2, v0}, La2/d;-><init>(I)V

    const/16 v12, 0x322

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, La61/e;-><init>(Ljava/lang/Object;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/c;Lk71/p;Ljava/util/List;Lx11/c;Lp01/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final D()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final E()La61/e;
    .locals 15

    const-string v0, "HR ZONES 4-5 TIME"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v0, "Get 39 more minutes of Zone 4-5 training during activities this week to hit your goal."

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v0, "78&"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v11, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    const/16 v13, 0x20

    const/4 v14, 0x0

    const/16 v7, 0x1388

    const/16 v8, 0xdac

    const-string v9, "2:51"

    const-string v10, "3:30"

    const/4 v12, 0x0

    invoke-static/range {v7 .. v14}, La61/d;->B(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;ILjava/lang/Object;)Lk71/p;

    move-result-object v8

    new-instance v0, La61/f;

    const-string v1, "1:24"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lkd1/o$a;

    invoke-static {}, Lc13/a;->a()I

    move-result v3

    invoke-direct {v2, v3}, Lkd1/o$a;-><init>(I)V

    const-string v3, "Cycling"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, v11}, La61/f;-><init>(Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    new-instance v1, La61/f;

    const-string v2, "1:03"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/c;->f()I

    move-result v7

    invoke-direct {v3, v7}, Lkd1/o$a;-><init>(I)V

    const-string v7, "Weightlifting"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct {v1, v2, v3, v7, v11}, La61/f;-><init>(Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    new-instance v2, La61/f;

    const-string v3, "0:24"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v7, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/c;->e()I

    move-result v9

    invoke-direct {v7, v9}, Lkd1/o$a;-><init>(I)V

    const-string v9, "Running"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-direct {v2, v3, v7, v9, v11}, La61/f;-><init>(Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    filled-new-array {v0, v1, v2}, [La61/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    sget-object v7, Lk71/c;->DISABLED:Lk71/c;

    new-instance v1, La61/e;

    new-instance v2, La2/d;

    const/4 v0, 0x6

    invoke-direct {v2, v0}, La2/d;-><init>(I)V

    const/16 v12, 0x302

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, La61/e;-><init>(Ljava/lang/Object;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/c;Lk71/p;Ljava/util/List;Lx11/c;Lp01/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final F()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La61/d;->z(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La61/d;->p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La61/d;->n(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La61/d;->t(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La61/d;->x(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, La61/d;->F()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La61/d;->r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La61/d;->v(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La61/d;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()Ll83/a0;
    .locals 1

    invoke-static {}, La61/d;->D()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, 0x3b09f784

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, La61/d;->E()La61/e;

    move-result-object v5

    const-string v1, "0%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v1, "Log or add an activity today to start working towards your HR zones 4-5 goal."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v15, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    const/16 v17, 0x20

    const/16 v18, 0x0

    const/16 v11, 0x1388

    const/16 v12, 0x32

    const-string v13, "0:00"

    const-string v14, "3:30"

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, La61/d;->B(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;ILjava/lang/Object;)Lk71/p;

    move-result-object v12

    new-instance v14, Lx11/c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const-string v1, "add activity"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v17, 0x1

    move-object v13, v14

    const/4 v14, 0x0

    invoke-direct/range {v13 .. v18}, Lx11/c;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x227

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object v14, v13

    sget-object v13, Lm83/y;->w:Lm83/y;

    const/4 v15, 0x0

    invoke-static/range {v5 .. v17}, La61/e;->b(La61/e;Ljava/lang/Object;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/c;Lk71/p;Ljava/util/List;Lx11/c;Lp01/b;ILjava/lang/Object;)La61/e;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, La61/c;->h(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, La11/h;

    const/16 v3, 0xb

    invoke-direct {v2, v0, v3}, La11/h;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La61/d;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p0, Lp1/q;

    const v0, -0x391ad7a7

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x2

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, p0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, p0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v7, p0, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p0, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, p0, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, v0}, La61/d;->o(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v0}, La61/d;->q(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v0}, La61/d;->k(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, La11/h;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final n(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La61/d;->m(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v3, p0

    check-cast v3, Lp1/q;

    const p0, -0x5ec6af7e

    invoke-virtual {v3, p0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    and-int/lit8 v0, p1, 0x1

    invoke-virtual {v3, v0, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, La61/d;->E()La61/e;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, La61/c;->h(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, La11/h;

    const/16 v1, 0xc

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La61/d;->o(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final q(Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, -0x2aeb1311

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, La61/d;->E()La61/e;

    move-result-object v5

    const-string v1, "124%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v1, "You\u2019ve hit your time in HR zones 4-5 goal for the week. Nice job!"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v11, Lk71/c;->ENABLED:Lk71/c;

    sget-object v16, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    const/16 v18, 0x20

    const/16 v19, 0x0

    const/16 v12, 0x1388

    const/16 v13, 0x1388

    const-string v14, "2:51"

    const-string v15, "1:25"

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, La61/d;->B(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;ILjava/lang/Object;)Lk71/p;

    move-result-object v12

    const/16 v16, 0x387

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v5 .. v17}, La61/e;->b(La61/e;Ljava/lang/Object;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/c;Lk71/p;Ljava/util/List;Lx11/c;Lp01/b;ILjava/lang/Object;)La61/e;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, La61/c;->h(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, La11/h;

    const/16 v3, 0xe

    invoke-direct {v2, v0, v3}, La11/h;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La61/d;->q(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, 0x3c79f2ba

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, La61/d;->C()La61/e;

    move-result-object v5

    const-string v1, "0%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v1, "Log an activity today to start working towards your HR zones 1-3 goal."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v15, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    const/16 v17, 0x20

    const/16 v18, 0x0

    const/16 v11, 0x1388

    const/16 v12, 0x32

    const-string v13, "0:00"

    const-string v14, "2:30"

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, La61/d;->B(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;ILjava/lang/Object;)Lk71/p;

    move-result-object v12

    new-instance v14, Lx11/c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const-string v1, "add activity"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v17, 0x1

    move-object v13, v14

    const/4 v14, 0x0

    invoke-direct/range {v13 .. v18}, Lx11/c;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x227

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object v14, v13

    sget-object v13, Lm83/y;->w:Lm83/y;

    const/4 v15, 0x0

    invoke-static/range {v5 .. v17}, La61/e;->b(La61/e;Ljava/lang/Object;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/c;Lk71/p;Ljava/util/List;Lx11/c;Lp01/b;ILjava/lang/Object;)La61/e;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, La61/c;->h(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, La11/h;

    const/16 v3, 0xd

    invoke-direct {v2, v0, v3}, La11/h;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final t(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La61/d;->s(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final u(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p0, Lp1/q;

    const v0, -0xc8b6c1d

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x2

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, p0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, p0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v7, p0, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p0, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, p0, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, v0}, La61/d;->w(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v0}, La61/d;->y(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v0}, La61/d;->s(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, La11/h;

    const/16 v1, 0x8

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final v(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La61/d;->u(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v3, p0

    check-cast v3, Lp1/q;

    const p0, 0x5611920c

    invoke-virtual {v3, p0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    and-int/lit8 v0, p1, 0x1

    invoke-virtual {v3, v0, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, La61/d;->C()La61/e;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, La61/c;->h(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, La11/h;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final x(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La61/d;->w(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final y(Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, 0x688cc6a5

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, La61/d;->C()La61/e;

    move-result-object v5

    const-string v1, "100%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v1, "You\u2019ve hit your time in HR zones 1-3 goal for the week. Nice job!"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v11, Lk71/c;->ENABLED:Lk71/c;

    sget-object v16, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    const/16 v18, 0x20

    const/16 v19, 0x0

    const/16 v12, 0x1388

    const/16 v13, 0x1388

    const-string v14, "2:40"

    const-string v15, "2:35"

    const/16 v17, 0x0

    invoke-static/range {v12 .. v19}, La61/d;->B(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;ILjava/lang/Object;)Lk71/p;

    move-result-object v12

    const/16 v16, 0x387

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v5 .. v17}, La61/e;->b(La61/e;Ljava/lang/Object;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/c;Lk71/p;Ljava/util/List;Lx11/c;Lp01/b;ILjava/lang/Object;)La61/e;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, La61/c;->h(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, La11/h;

    const/16 v3, 0xa

    invoke-direct {v2, v0, v3}, La11/h;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final z(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, La61/d;->y(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
