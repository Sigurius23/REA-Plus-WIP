.class public final Le1/h;
.super La3/o;
.source "SourceFile"

# interfaces
.implements La3/c0;
.implements La3/r;
.implements La3/s;


# instance fields
.field public Q:Le1/j;

.field public final R:Le1/p;


# direct methods
.method public constructor <init>(Ll3/g;Ll3/v0;Lp3/h;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lu0/z0;)V
    .locals 16

    move-object/from16 v0, p0

    invoke-direct {v0}, La3/o;-><init>()V

    move-object/from16 v12, p11

    iput-object v12, v0, Le1/h;->Q:Le1/j;

    new-instance v1, Le1/p;

    const/4 v15, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v15}, Le1/p;-><init>(Ll3/g;Ll3/v0;Lp3/h;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Le1/j;Li2/a0;Lu0/z0;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, La3/o;->X0(La3/n;)La3/n;

    iput-object v1, v0, Le1/h;->R:Le1/p;

    iget-object v1, v0, Le1/h;->Q:Le1/j;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const-string v1, "Do not use SelectionCapableStaticTextModifier unless selectionController != null"

    invoke-static {v1}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1
.end method


# virtual methods
.method public final E(La3/w0;Ly2/q0;I)I
    .locals 1

    iget-object v0, p0, Le1/h;->R:Le1/p;

    invoke-virtual {v0, p1, p2, p3}, Le1/p;->E(La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final I0(Landroidx/compose/ui/node/NodeCoordinator;)V
    .locals 4

    iget-object v0, p0, Le1/h;->Q:Le1/j;

    if-eqz v0, :cond_0

    iget-object v1, v0, Le1/j;->z:Le1/l;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, p1, v2, v3}, Le1/l;->a(Le1/l;Landroidx/compose/ui/node/NodeCoordinator;Ll3/r0;I)Le1/l;

    move-result-object p1

    iput-object p1, v0, Le1/j;->z:Le1/l;

    iget-object p1, v0, Le1/j;->x:Lf1/a1;

    iget-wide v0, v0, Le1/j;->w:J

    check-cast p1, Lf1/b1;

    const/4 v2, 0x0

    iput-boolean v2, p1, Lf1/b1;->a:Z

    iget-object p1, p1, Lf1/b1;->e:Lf1/c0;

    if-eqz p1, :cond_0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf1/c0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final M0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final O(La3/p0;)V
    .locals 1

    iget-object v0, p0, Le1/h;->R:Le1/p;

    invoke-virtual {v0, p1}, Le1/p;->O(La3/p0;)V

    return-void
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 1

    iget-object v0, p0, Le1/h;->R:Le1/p;

    invoke-virtual {v0, p1, p2, p3, p4}, Le1/p;->b(Ly2/t0;Ly2/q0;J)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public final g0(La3/w0;Ly2/q0;I)I
    .locals 1

    iget-object v0, p0, Le1/h;->R:Le1/p;

    invoke-virtual {v0, p1, p2, p3}, Le1/p;->g0(La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final o(La3/w0;Ly2/q0;I)I
    .locals 1

    iget-object v0, p0, Le1/h;->R:Le1/p;

    invoke-virtual {v0, p1, p2, p3}, Le1/p;->o(La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method

.method public final y(La3/w0;Ly2/q0;I)I
    .locals 1

    iget-object v0, p0, Le1/h;->R:Le1/p;

    invoke-virtual {v0, p1, p2, p3}, Le1/p;->y(La3/w0;Ly2/q0;I)I

    move-result p1

    return p1
.end method
