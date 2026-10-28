.class public abstract Lsz0/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a\u001f\u0010\u0003\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a/\u0010\u0006\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a7\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0017\u0010\u0014\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000e\u001a\u0004\u0008\u0013\u0010\u0010\"\u0017\u0010\u0017\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000e\u001a\u0004\u0008\u0016\u0010\u0010\u00a8\u0006\u0018"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "primaryAction",
        "m",
        "(Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "secondaryAction",
        "i",
        "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lsz0/q0;",
        "state",
        "p",
        "(Lsz0/q0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lsz0/p0$b;",
        "a",
        "Lsz0/p0$b;",
        "v",
        "()Lsz0/p0$b;",
        "offlineProgressModalType",
        "b",
        "t",
        "checkStatusProgressModalType",
        "c",
        "u",
        "notFoundProgressModalType",
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
.field private static final a:Lsz0/p0$b;

.field private static final b:Lsz0/p0$b;

.field private static final c:Lsz0/p0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lsz0/p0$b;

    sget v1, Lgy0/f;->U1:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    new-instance v3, Lkd1/o$a;

    sget v2, Lgy0/a;->c2:I

    invoke-direct {v3, v2}, Lkd1/o$a;-><init>(I)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsz0/n0;->a:Lsz0/p0$b;

    new-instance v1, Lsz0/p0$b;

    sget v0, Lgy0/f;->M1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    new-instance v4, Lkd1/o$a;

    sget v0, Lgy0/a;->U2:I

    invoke-direct {v4, v0}, Lkd1/o$a;-><init>(I)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lsz0/n0;->b:Lsz0/p0$b;

    new-instance v2, Lsz0/p0$b;

    sget v0, Lgy0/f;->S1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lsz0/n0;->c:Lsz0/p0$b;

    return-void
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lsz0/n0;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lsz0/n0;->r()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lsz0/n0;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsz0/n0;->l(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lsz0/n0;->k()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lsz0/n0;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsz0/n0;->o(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lsz0/q0;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsz0/n0;->s(Lsz0/q0;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, -0x3d81999c    # -63.59999f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, v2, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v2, 0x1

    invoke-virtual {v12, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_b

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_7

    new-instance v0, Lsr2/v;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lsr2/v;-><init>(I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Lc93/a;

    move-object v4, v0

    goto :goto_5

    :cond_8
    move-object v4, v1

    :goto_5
    if-eqz v3, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_9

    new-instance v0, Lsr2/v;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lsr2/v;-><init>(I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, Lc93/a;

    move-object v8, v0

    goto :goto_6

    :cond_a
    move-object/from16 v8, p1

    :goto_6
    sget-object v0, Lsz0/n0;->b:Lsz0/p0$b;

    sget v1, Lgy0/f;->L1:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget v3, Lgy0/f;->W1:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v5, Lgy0/f;->K1:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    shl-int/lit8 v5, v2, 0xc

    const v6, 0xe000

    and-int/2addr v5, v6

    const v6, 0x1b0006

    or-int/2addr v5, v6

    shl-int/lit8 v2, v2, 0x15

    const/high16 v6, 0xe000000

    and-int/2addr v2, v6

    or-int v13, v5, v2

    const/4 v14, 0x0

    const/16 v15, 0xe04

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v0 .. v15}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v14, v4

    move-object v15, v8

    goto :goto_7

    :cond_b
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v15, p1

    move-object v14, v1

    :goto_7
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v13, Ldk2/d;

    const/16 v18, 0x5

    move/from16 v16, p3

    move/from16 v17, p4

    invoke-direct/range {v13 .. v18}, Ldk2/d;-><init>(Lc93/a;Lc93/a;III)V

    iput-object v13, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lsz0/n0;->i(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v14, p1

    check-cast v14, Lp1/q;

    const v2, 0x2854cd79

    invoke-virtual {v14, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v5, 0x3

    if-eq v6, v3, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v6, v5, 0x1

    invoke-virtual {v14, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz v2, :cond_5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_4

    new-instance v2, Lsr2/v;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lsr2/v;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lc93/a;

    move-object v6, v2

    goto :goto_3

    :cond_5
    move-object v6, v4

    :goto_3
    sget-object v2, Lsz0/n0;->a:Lsz0/p0$b;

    sget v3, Lgy0/f;->T1:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v4, Lgy0/f;->W1:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    shl-int/lit8 v5, v5, 0xc

    const v7, 0xe000

    and-int/2addr v5, v7

    or-int/lit8 v15, v5, 0x6

    const/16 v16, 0x0

    const/16 v17, 0xfe4

    move-object v5, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v17}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v4, v6

    goto :goto_4

    :cond_6
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lgt1/g;

    const/16 v5, 0xa

    invoke-direct {v3, v4, v0, v1, v5}, Lgt1/g;-><init>(Lc93/a;III)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lsz0/n0;->m(Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final p(Lsz0/q0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsz0/q0;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, -0x1b1c5a2f

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v4, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit16 v8, v2, 0x93

    const/16 v9, 0x92

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v0, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_d

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_9

    new-instance v3, Lsr2/v;

    const/16 v5, 0x11

    invoke-direct {v3, v5}, Lsr2/v;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lc93/a;

    move-object v9, v3

    goto :goto_7

    :cond_a
    move-object v9, v5

    :goto_7
    if-eqz v6, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_b

    new-instance v3, Lsr2/v;

    const/16 v5, 0x12

    invoke-direct {v3, v5}, Lsr2/v;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lc93/a;

    move-object v13, v3

    goto :goto_8

    :cond_c
    move-object v13, v7

    :goto_8
    invoke-virtual {v1}, Lsz0/q0;->e()Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v1}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v5

    invoke-virtual {v1}, Lsz0/q0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lsz0/q0;->f()Lc93/a;

    move-result-object v7

    invoke-virtual {v1}, Lsz0/q0;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lsz0/q0;->k()Z

    move-result v10

    invoke-virtual {v1}, Lsz0/q0;->l()Z

    move-result v11

    invoke-virtual {v1}, Lsz0/q0;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lsz0/q0;->i()Z

    move-result v15

    invoke-virtual {v1}, Lsz0/q0;->g()Z

    move-result v16

    shl-int/lit8 v3, v2, 0x9

    const v17, 0xe000

    and-int v3, v3, v17

    shl-int/lit8 v2, v2, 0x12

    const/high16 v17, 0xe000000

    and-int v2, v2, v17

    or-int v18, v3, v2

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v2, v9

    move-object v3, v13

    goto :goto_9

    :cond_d
    move-object/from16 v17, v0

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    move-object v2, v5

    move-object v3, v7

    :goto_9
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Ls51/b;

    const/16 v6, 0x19

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s(Lsz0/q0;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsz0/n0;->p(Lsz0/q0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t()Lsz0/p0$b;
    .locals 1

    sget-object v0, Lsz0/n0;->b:Lsz0/p0$b;

    return-object v0
.end method

.method public static final u()Lsz0/p0$b;
    .locals 1

    sget-object v0, Lsz0/n0;->c:Lsz0/p0$b;

    return-object v0
.end method

.method public static final v()Lsz0/p0$b;
    .locals 1

    sget-object v0, Lsz0/n0;->a:Lsz0/p0$b;

    return-object v0
.end method
