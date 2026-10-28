.class public final Lfc3/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:[Lec3/l;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Ls83/i;

.field public final synthetic J:Lec3/m;

.field public w:Ldc3/l;

.field public x:[B

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)V
    .locals 0

    iput-object p5, p0, Lfc3/o;->G:[Lec3/l;

    iput-object p1, p0, Lfc3/o;->H:Lc93/a;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Lfc3/o;->I:Ls83/i;

    iput-object p2, p0, Lfc3/o;->J:Lec3/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lfc3/o;

    iget-object v3, p0, Lfc3/o;->I:Ls83/i;

    iget-object v2, p0, Lfc3/o;->J:Lec3/m;

    iget-object v1, p0, Lfc3/o;->H:Lc93/a;

    iget-object v5, p0, Lfc3/o;->G:[Lec3/l;

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lfc3/o;-><init>(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)V

    iput-object p1, v0, Lfc3/o;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfc3/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfc3/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfc3/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lfc3/b;->c:Lhc3/x;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lfc3/o;->E:I

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget v3, v0, Lfc3/o;->z:I

    iget v8, v0, Lfc3/o;->y:I

    iget-object v9, v0, Lfc3/o;->x:[B

    iget-object v10, v0, Lfc3/o;->w:Ldc3/l;

    iget-object v11, v0, Lfc3/o;->F:Ljava/lang/Object;

    check-cast v11, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v18, v11

    move v11, v3

    move-object v3, v9

    move-object/from16 v9, v18

    goto :goto_2

    :cond_2
    iget v3, v0, Lfc3/o;->z:I

    iget v8, v0, Lfc3/o;->y:I

    iget-object v9, v0, Lfc3/o;->x:[B

    iget-object v10, v0, Lfc3/o;->w:Ldc3/l;

    iget-object v11, v0, Lfc3/o;->F:Ljava/lang/Object;

    check-cast v11, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v12, p1

    check-cast v12, Ldc3/o;

    iget-object v12, v12, Ldc3/o;->a:Ljava/lang/Object;

    move-object/from16 v18, v11

    move v11, v3

    move-object v3, v9

    move-object/from16 v9, v18

    goto :goto_3

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lfc3/o;->F:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    iget-object v8, v0, Lfc3/o;->G:[Lec3/l;

    array-length v8, v8

    if-nez v8, :cond_4

    goto :goto_4

    :cond_4
    new-array v9, v8, [Ljava/lang/Object;

    invoke-static {v4, v8, v1, v9}, Lm83/n;->n0(IILjava/lang/Object;[Ljava/lang/Object;)V

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static {v8, v10, v11}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v16

    new-instance v15, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v15, v8}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    move v14, v4

    :goto_1
    if-ge v14, v8, :cond_5

    new-instance v12, Lfc3/n;

    iget-object v13, v0, Lfc3/o;->G:[Lec3/l;

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v17}, Lfc3/n;-><init>([Lec3/l;ILjava/util/concurrent/atomic/AtomicInteger;Ldc3/h;Lq83/d;)V

    invoke-static {v3, v11, v11, v12, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_5
    new-array v3, v8, [B

    move v11, v4

    move-object/from16 v10, v16

    :cond_6
    :goto_2
    add-int/2addr v11, v7

    int-to-byte v11, v11

    iput-object v9, v0, Lfc3/o;->F:Ljava/lang/Object;

    iput-object v10, v0, Lfc3/o;->w:Ldc3/l;

    iput-object v3, v0, Lfc3/o;->x:[B

    iput v8, v0, Lfc3/o;->y:I

    iput v11, v0, Lfc3/o;->z:I

    iput v7, v0, Lfc3/o;->E:I

    invoke-interface {v10, v0}, Ldc3/w;->a(Lfc3/o;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v2, :cond_7

    goto :goto_5

    :cond_7
    :goto_3
    invoke-static {v12}, Ldc3/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm83/c0;

    if-nez v12, :cond_8

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_8
    iget v13, v12, Lm83/c0;->a:I

    aget-object v14, v9, v13

    iget-object v12, v12, Lm83/c0;->b:Ljava/lang/Object;

    aput-object v12, v9, v13

    if-ne v14, v1, :cond_9

    add-int/lit8 v8, v8, -0x1

    :cond_9
    aget-byte v12, v3, v13

    if-eq v12, v11, :cond_a

    int-to-byte v12, v11

    aput-byte v12, v3, v13

    invoke-interface {v10}, Ldc3/w;->f()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Ldc3/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lm83/c0;

    if-nez v12, :cond_8

    :cond_a
    if-nez v8, :cond_6

    iget-object v12, v0, Lfc3/o;->H:Lc93/a;

    invoke-interface {v12}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Ljava/lang/Object;

    iget-object v13, v0, Lfc3/o;->J:Lec3/m;

    iget-object v14, v0, Lfc3/o;->I:Ls83/i;

    if-nez v12, :cond_b

    iput-object v9, v0, Lfc3/o;->F:Ljava/lang/Object;

    iput-object v10, v0, Lfc3/o;->w:Ldc3/l;

    iput-object v3, v0, Lfc3/o;->x:[B

    iput v8, v0, Lfc3/o;->y:I

    iput v11, v0, Lfc3/o;->z:I

    iput v6, v0, Lfc3/o;->E:I

    invoke-interface {v14, v13, v9, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v2, :cond_6

    goto :goto_5

    :cond_b
    const/16 v15, 0xe

    invoke-static {v4, v4, v15, v9, v12}, Lm83/n;->i0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    iput-object v9, v0, Lfc3/o;->F:Ljava/lang/Object;

    iput-object v10, v0, Lfc3/o;->w:Ldc3/l;

    iput-object v3, v0, Lfc3/o;->x:[B

    iput v8, v0, Lfc3/o;->y:I

    iput v11, v0, Lfc3/o;->z:I

    iput v5, v0, Lfc3/o;->E:I

    invoke-interface {v14, v13, v12, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v2, :cond_6

    :goto_5
    return-object v2
.end method
