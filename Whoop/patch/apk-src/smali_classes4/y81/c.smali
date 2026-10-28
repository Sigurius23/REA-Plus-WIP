.class public abstract Ly81/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aE\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Li2/x;",
        "accent",
        "active",
        "affirmative",
        "negative",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "content",
        "b",
        "(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V",
        "Ly81/a;",
        "a",
        "Ly81/a;",
        "d",
        "()Ly81/a;",
        "DarkSemanticColors",
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
.field private static final a:Ly81/a;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Ly81/a;

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v1

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->a()J

    move-result-wide v5

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v9}, Ly81/a;-><init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ly81/c;->a:Ly81/a;

    return-void
.end method

.method public static synthetic a(JJJJLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Ly81/c;->c(JJJJLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJJ",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v9, p8

    move/from16 v10, p10

    const-string v0, "content"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, -0x19ffef8a

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, p11, 0x1

    if-nez v1, :cond_0

    move-wide/from16 v1, p0

    invoke-virtual {v0, v1, v2}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move-wide/from16 v1, p0

    move v3, v10

    :goto_1
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, p11, 0x2

    if-nez v4, :cond_3

    move-wide/from16 v4, p2

    invoke-virtual {v0, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    move-wide/from16 v4, p2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    goto :goto_3

    :cond_5
    move-wide/from16 v4, p2

    :goto_3
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_8

    and-int/lit8 v6, p11, 0x4

    if-nez v6, :cond_6

    move-wide/from16 v6, p4

    invoke-virtual {v0, v6, v7}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    move-wide/from16 v6, p4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    goto :goto_5

    :cond_8
    move-wide/from16 v6, p4

    :goto_5
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_a

    and-int/lit8 v8, p11, 0x8

    move-wide/from16 v11, p6

    if-nez v8, :cond_9

    invoke-virtual {v0, v11, v12}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_6

    :cond_9
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v3, v8

    goto :goto_7

    :cond_a
    move-wide/from16 v11, p6

    :goto_7
    and-int/lit16 v8, v10, 0x6000

    if-nez v8, :cond_c

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v8, 0x4000

    goto :goto_8

    :cond_b
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v3, v8

    :cond_c
    and-int/lit16 v8, v3, 0x2493

    const/16 v13, 0x2492

    if-eq v8, v13, :cond_d

    const/4 v8, 0x1

    goto :goto_9

    :cond_d
    const/4 v8, 0x0

    :goto_9
    and-int/lit8 v13, v3, 0x1

    invoke-virtual {v0, v13, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v8, v10, 0x1

    if-eqz v8, :cond_13

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_e

    goto :goto_b

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v8, p11, 0x1

    if-eqz v8, :cond_f

    and-int/lit8 v3, v3, -0xf

    :cond_f
    and-int/lit8 v8, p11, 0x2

    if-eqz v8, :cond_10

    and-int/lit8 v3, v3, -0x71

    :cond_10
    and-int/lit8 v8, p11, 0x4

    if-eqz v8, :cond_11

    and-int/lit16 v3, v3, -0x381

    :cond_11
    and-int/lit8 v8, p11, 0x8

    if-eqz v8, :cond_12

    :goto_a
    and-int/lit16 v3, v3, -0x1c01

    :cond_12
    move-wide v14, v1

    move-wide/from16 v16, v4

    move-wide/from16 v18, v6

    move-wide/from16 v20, v11

    goto :goto_c

    :cond_13
    :goto_b
    and-int/lit8 v8, p11, 0x1

    const/4 v13, 0x6

    if-eqz v8, :cond_14

    sget-object v1, Lx81/b;->a:Lx81/b;

    invoke-virtual {v1, v0, v13}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v1

    invoke-virtual {v1}, Ly81/a;->a()J

    move-result-wide v1

    and-int/lit8 v3, v3, -0xf

    :cond_14
    and-int/lit8 v8, p11, 0x2

    if-eqz v8, :cond_15

    sget-object v4, Lx81/b;->a:Lx81/b;

    invoke-virtual {v4, v0, v13}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v4

    invoke-virtual {v4}, Ly81/a;->b()J

    move-result-wide v4

    and-int/lit8 v3, v3, -0x71

    :cond_15
    and-int/lit8 v8, p11, 0x4

    if-eqz v8, :cond_16

    sget-object v6, Lx81/b;->a:Lx81/b;

    invoke-virtual {v6, v0, v13}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v6

    invoke-virtual {v6}, Ly81/a;->c()J

    move-result-wide v6

    and-int/lit16 v3, v3, -0x381

    :cond_16
    and-int/lit8 v8, p11, 0x8

    if-eqz v8, :cond_12

    sget-object v8, Lx81/b;->a:Lx81/b;

    invoke-virtual {v8, v0, v13}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v8

    invoke-virtual {v8}, Ly81/a;->d()J

    move-result-wide v11

    goto :goto_a

    :goto_c
    invoke-virtual {v0}, Lp1/q;->r()V

    new-instance v13, Ly81/a;

    const/16 v22, 0x0

    invoke-direct/range {v13 .. v22}, Ly81/a;-><init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lx81/c;->c()Lp1/t1;

    move-result-object v1

    invoke-virtual {v1, v13}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    shr-int/lit8 v2, v3, 0x9

    and-int/lit8 v2, v2, 0x70

    const/16 v3, 0x8

    or-int/2addr v2, v3

    invoke-static {v1, v9, v0, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-wide v1, v14

    move-wide/from16 v3, v16

    move-wide/from16 v5, v18

    move-wide/from16 v7, v20

    goto :goto_d

    :cond_17
    invoke-virtual {v0}, Lp1/q;->X()V

    move-wide v3, v4

    move-wide v5, v6

    move-wide v7, v11

    :goto_d
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_18

    new-instance v0, Ly81/b;

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Ly81/b;-><init>(JJJJLc93/m;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final c(JJJJLc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-wide v1, p0

    move-wide v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d()Ly81/a;
    .locals 1

    sget-object v0, Ly81/c;->a:Ly81/a;

    return-object v0
.end method
