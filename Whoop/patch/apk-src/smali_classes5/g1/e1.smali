.class public final Lg1/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final E:Lg1/e1;

.field public static final F:Lg1/e1;

.field public static final G:Lg1/e1;

.field public static final x:Lg1/e1;

.field public static final y:Lg1/e1;

.field public static final z:Lg1/e1;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lg1/e1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg1/e1;-><init>(I)V

    sput-object v0, Lg1/e1;->x:Lg1/e1;

    new-instance v0, Lg1/e1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg1/e1;-><init>(I)V

    sput-object v0, Lg1/e1;->y:Lg1/e1;

    new-instance v0, Lg1/e1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg1/e1;-><init>(I)V

    sput-object v0, Lg1/e1;->z:Lg1/e1;

    new-instance v0, Lg1/e1;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lg1/e1;-><init>(I)V

    sput-object v0, Lg1/e1;->E:Lg1/e1;

    new-instance v0, Lg1/e1;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lg1/e1;-><init>(I)V

    sput-object v0, Lg1/e1;->F:Lg1/e1;

    new-instance v0, Lg1/e1;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lg1/e1;-><init>(I)V

    sput-object v0, Lg1/e1;->G:Lg1/e1;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg1/e1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Lg1/e1;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ld0/t1;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    check-cast v2, Lp1/q;

    const v3, 0x6e392619

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lg1/g3;->w:Lg1/g3;

    sget-object v4, Lg1/g3;->x:Lg1/g3;

    invoke-interface {v1, v3, v4}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    const/16 v7, 0x43

    if-eqz v5, :cond_0

    sget-object v1, Ld0/b0;->c:Lb23/h;

    const/4 v3, 0x2

    invoke-static {v7, v6, v1, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-interface {v1, v4, v3}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lg1/g3;->y:Lg1/g3;

    invoke-interface {v1, v3, v4}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v3, v1, v4}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v1

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v1, Ld0/b0;->c:Lb23/h;

    new-instance v3, Ld0/e2;

    const/16 v4, 0x53

    invoke-direct {v3, v4, v7, v1}, Ld0/e2;-><init>(IILd0/z;)V

    move-object v1, v3

    :goto_1
    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    return-object v1

    :pswitch_0
    move-object/from16 v7, p1

    check-cast v7, Lg1/l6;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_5

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_3

    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_3
    move-object v3, v1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_4

    const/4 v3, 0x4

    goto :goto_3

    :cond_4
    const/4 v3, 0x2

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-eq v3, v4, :cond_6

    const/4 v3, 0x1

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    :goto_4
    and-int/lit8 v4, v2, 0x1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    and-int/lit8 v18, v2, 0xe

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v7 .. v18}, Lg1/s6;->c(Lg1/l6;Landroidx/compose/ui/Modifier;Li2/a1;JJJFLandroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_7
    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v2, p1

    check-cast v2, Lg1/n6;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_9

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, 0x4

    goto :goto_6

    :cond_8
    const/4 v4, 0x2

    :goto_6
    or-int/2addr v3, v4

    :cond_9
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-eq v4, v5, :cond_a

    const/4 v4, 0x1

    goto :goto_7

    :cond_a
    const/4 v4, 0x0

    :goto_7
    and-int/lit8 v5, v3, 0x1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    and-int/lit8 v6, v3, 0xe

    const/4 v7, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v1

    invoke-static/range {v2 .. v7}, Lse/g;->h(Lg1/n6;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_b
    move-object v5, v1

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    move-object/from16 v2, p1

    check-cast v2, Lg1/n6;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_d

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/4 v4, 0x4

    goto :goto_9

    :cond_c
    const/4 v4, 0x2

    :goto_9
    or-int/2addr v3, v4

    :cond_d
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-eq v4, v5, :cond_e

    const/4 v4, 0x1

    goto :goto_a

    :cond_e
    const/4 v4, 0x0

    :goto_a
    and-int/lit8 v5, v3, 0x1

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_f

    and-int/lit8 v6, v3, 0xe

    const/4 v7, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v1

    invoke-static/range {v2 .. v7}, Lse/g;->h(Lg1/n6;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_b

    :cond_f
    move-object v5, v1

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_b
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x11

    const/16 v4, 0x10

    const/4 v5, 0x1

    if-eq v3, v4, :cond_10

    move v3, v5

    goto :goto_c

    :cond_10
    const/4 v3, 0x0

    :goto_c
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_d

    :cond_11
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_d
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x11

    const/16 v4, 0x10

    const/4 v5, 0x1

    if-eq v3, v4, :cond_12

    move v3, v5

    goto :goto_e

    :cond_12
    const/4 v3, 0x0

    :goto_e
    and-int/2addr v2, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_f

    :cond_13
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_f
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
