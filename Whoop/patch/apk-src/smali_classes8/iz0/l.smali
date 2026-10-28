.class public final Liz0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u00a5\u0001\u0010\u001b\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Liz0/l;",
        "",
        "<init>",
        "()V",
        "Ll3/v0;",
        "textStyle",
        "Li2/x;",
        "textColor",
        "linkColor",
        "blockQuoteLineColor",
        "Lp3/r;",
        "strongEmphasisFontWeight",
        "strongEmphasisColor",
        "Lp3/n;",
        "emphasisFontStyle",
        "emphasisColor",
        "Liz0/a;",
        "headingStyles",
        "tableBorderColor",
        "Ly3/f;",
        "tableCellPadding",
        "tableCellWidth",
        "",
        "enableHorizontalScrollOnTable",
        "enableMailtoAction",
        "paragraphSpacing",
        "Liz0/m;",
        "a",
        "(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;",
        "design_release"
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
.field public static final a:Liz0/l;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Liz0/l;

    invoke-direct {v0}, Liz0/l;-><init>()V

    sput-object v0, Liz0/l;->a:Liz0/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;
    .locals 19

    move-object/from16 v0, p22

    move/from16 v1, p25

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x6

    if-eqz v2, :cond_0

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v2

    invoke-virtual {v2}, Lb91/a;->d()Ll3/v0;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p2

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->k0()J

    move-result-wide v6

    goto :goto_2

    :cond_2
    move-wide/from16 v6, p4

    :goto_2
    and-int/lit8 v8, v1, 0x8

    if-eqz v8, :cond_3

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->X()J

    move-result-wide v8

    goto :goto_3

    :cond_3
    move-wide/from16 v8, p6

    :goto_3
    and-int/lit8 v10, v1, 0x10

    if-eqz v10, :cond_4

    sget-object v10, Lp3/r;->x:Lp3/r;

    sget-object v10, Lp3/r;->I:Lp3/r;

    goto :goto_4

    :cond_4
    move-object/from16 v10, p8

    :goto_4
    and-int/lit8 v11, v1, 0x20

    if-eqz v11, :cond_5

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p9

    :goto_5
    and-int/lit8 v13, v1, 0x40

    if-eqz v13, :cond_6

    const/4 v13, 0x1

    goto :goto_6

    :cond_6
    move/from16 v13, p11

    :goto_6
    and-int/lit16 v14, v1, 0x80

    if-eqz v14, :cond_7

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    goto :goto_7

    :cond_7
    move-wide/from16 v14, p12

    :goto_7
    and-int/lit16 v3, v1, 0x100

    if-eqz v3, :cond_8

    new-instance v3, Liz0/a;

    move-object/from16 p1, v2

    sget-object v2, Lx81/d;->a:Lx81/d;

    move-wide/from16 v16, v4

    const/4 v4, 0x6

    invoke-virtual {v2, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->N()Lb91/a;

    move-result-object v5

    invoke-virtual {v2, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v18

    move-wide/from16 p2, v6

    invoke-virtual/range {v18 .. v18}, Lb91/d;->O()Lb91/a;

    move-result-object v6

    invoke-virtual {v2, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->P()Lb91/a;

    move-result-object v7

    invoke-virtual {v2, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->Q()Lb91/a;

    move-result-object v2

    invoke-direct {v3, v5, v6, v7, v2}, Liz0/a;-><init>(Lb91/a;Lb91/a;Lb91/a;Lb91/a;)V

    goto :goto_8

    :cond_8
    move-object/from16 p1, v2

    move-wide/from16 v16, v4

    move-wide/from16 p2, v6

    const/4 v4, 0x6

    move-object/from16 v3, p14

    :goto_8
    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_9

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    goto :goto_9

    :cond_9
    move-wide/from16 v4, p15

    :goto_9
    and-int/lit16 v0, v1, 0x400

    const/16 v2, 0x8

    const/4 v6, 0x0

    if-eqz v0, :cond_a

    int-to-float v0, v6

    int-to-float v7, v2

    mul-float/2addr v0, v7

    goto :goto_a

    :cond_a
    move/from16 v0, p17

    :goto_a
    and-int/lit16 v7, v1, 0x800

    if-eqz v7, :cond_b

    int-to-float v7, v6

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v2, v7

    goto :goto_b

    :cond_b
    move/from16 v2, p18

    :goto_b
    and-int/lit16 v7, v1, 0x1000

    if-eqz v7, :cond_c

    move v7, v6

    goto :goto_c

    :cond_c
    move/from16 v7, p19

    :goto_c
    and-int/lit16 v6, v1, 0x2000

    if-eqz v6, :cond_d

    const/4 v6, 0x0

    goto :goto_d

    :cond_d
    move/from16 v6, p20

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    int-to-float v1, v1

    move/from16 p5, v0

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr v0, v1

    goto :goto_e

    :cond_e
    move/from16 p5, v0

    move/from16 v0, p21

    :goto_e
    new-instance v1, Liz0/m;

    const/16 v18, 0x0

    move/from16 p18, p5

    move/from16 p22, v0

    move/from16 p19, v2

    move-object/from16 p15, v3

    move-wide/from16 p16, v4

    move/from16 p21, v6

    move/from16 p20, v7

    move-wide/from16 p7, v8

    move-object/from16 p9, v10

    move-wide/from16 p10, v11

    move/from16 p12, v13

    move-wide/from16 p13, v14

    move-object/from16 p23, v18

    move-wide/from16 p5, p2

    move-wide/from16 p3, v16

    move-object/from16 p2, p1

    move-object/from16 p1, v1

    invoke-direct/range {p1 .. p23}, Liz0/m;-><init>(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p1

    return-object v0
.end method
