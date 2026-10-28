.class public final Lec3/s;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lcom/whoop/data/local/room/dao/persistent/d;

.field public final synthetic G:Lec3/l;

.field public w:Lkotlin/jvm/internal/g0;

.field public x:Lkotlin/jvm/internal/f0;

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/persistent/d;Lec3/l;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lec3/s;->F:Lcom/whoop/data/local/room/dao/persistent/d;

    iput-object p2, p0, Lec3/s;->G:Lec3/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lbc3/c0;

    check-cast p2, Lec3/m;

    check-cast p3, Lq83/d;

    new-instance v0, Lec3/s;

    iget-object v1, p0, Lec3/s;->F:Lcom/whoop/data/local/room/dao/persistent/d;

    iget-object v2, p0, Lec3/s;->G:Lec3/l;

    invoke-direct {v0, v1, v2, p3}, Lec3/s;-><init>(Lcom/whoop/data/local/room/dao/persistent/d;Lec3/l;Lq83/d;)V

    iput-object p1, v0, Lec3/s;->z:Ljava/lang/Object;

    iput-object p2, v0, Lec3/s;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lec3/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/s;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v2, v0, Lec3/s;->w:Lkotlin/jvm/internal/g0;

    iget-object v7, v0, Lec3/s;->E:Ljava/lang/Object;

    check-cast v7, Ldc3/w;

    iget-object v8, v0, Lec3/s;->z:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object v9, v8

    move-object v8, v7

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v2, v0, Lec3/s;->x:Lkotlin/jvm/internal/f0;

    iget-object v7, v0, Lec3/s;->w:Lkotlin/jvm/internal/g0;

    iget-object v8, v0, Lec3/s;->E:Ljava/lang/Object;

    check-cast v8, Ldc3/w;

    iget-object v9, v0, Lec3/s;->z:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lec3/s;->z:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v7, v0, Lec3/s;->E:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    new-instance v8, La6/c;

    iget-object v9, v0, Lec3/s;->G:Lec3/l;

    const/16 v10, 0xc

    invoke-direct {v8, v9, v6, v10}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object v9, Ldc3/a;->w:Ldc3/a;

    sget-object v10, Lbc3/d0;->w:Lbc3/d0;

    const/4 v11, 0x4

    invoke-static {v3, v11, v9}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v9

    sget-object v11, Lq83/k;->w:Lq83/k;

    invoke-static {v2, v11}, Lbc3/f0;->A(Lbc3/c0;Lq83/j;)Lq83/j;

    move-result-object v2

    new-instance v11, Ldc3/t;

    invoke-direct {v11, v2, v9, v5, v5}, Ldc3/t;-><init>(Lq83/j;Ldc3/h;ZZ)V

    invoke-virtual {v11, v10, v11, v8}, Lbc3/a;->b0(Lbc3/d0;Lbc3/a;Lc93/m;)V

    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    move-object v9, v7

    move-object v8, v11

    :goto_0
    move-object v7, v2

    iget-object v2, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v10, Lfc3/b;->d:Lhc3/x;

    if-eq v2, v10, :cond_a

    new-instance v10, Lkotlin/jvm/internal/f0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    if-eqz v2, :cond_6

    sget-object v2, Lfc3/b;->b:Lhc3/x;

    iget-object v11, v0, Lec3/s;->F:Lcom/whoop/data/local/room/dao/persistent/d;

    iget-wide v11, v11, Lcom/whoop/data/local/room/dao/persistent/d;->x:J

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    iput-wide v11, v10, Lkotlin/jvm/internal/f0;->w:J

    const-wide/16 v13, 0x0

    cmp-long v11, v11, v13

    if-ltz v11, :cond_7

    if-nez v11, :cond_6

    iget-object v11, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-ne v11, v2, :cond_4

    move-object v11, v6

    :cond_4
    iput-object v9, v0, Lec3/s;->z:Ljava/lang/Object;

    iput-object v8, v0, Lec3/s;->E:Ljava/lang/Object;

    iput-object v7, v0, Lec3/s;->w:Lkotlin/jvm/internal/g0;

    iput-object v10, v0, Lec3/s;->x:Lkotlin/jvm/internal/f0;

    iput v5, v0, Lec3/s;->y:I

    invoke-interface {v9, v11, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v2, v10

    :goto_1
    iput-object v6, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v10, v2

    :cond_6
    move-object v2, v7

    move-object v7, v8

    move-object v8, v9

    goto :goto_2

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Debounce timeout should not be negative"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_2
    new-instance v12, Llc3/f;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v9

    invoke-direct {v12, v9}, Llc3/f;-><init>(Lq83/j;)V

    iget-object v9, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v9, :cond_8

    iget-wide v9, v10, Lkotlin/jvm/internal/f0;->w:J

    new-instance v11, La6/j0;

    const/4 v13, 0x1

    invoke-direct {v11, v8, v2, v6, v13}, La6/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v12, v9, v10, v11}, Llc3/i;->a(Llc3/f;JLkotlin/jvm/functions/Function1;)V

    :cond_8
    invoke-interface {v7}, Ldc3/w;->d()Lwe/o;

    move-result-object v9

    new-instance v10, Landroidx/lifecycle/e1;

    const/4 v11, 0x5

    invoke-direct {v10, v2, v8, v6, v11}, Landroidx/lifecycle/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    new-instance v11, Llc3/d;

    iget-object v13, v9, Lwe/o;->w:Ljava/lang/Object;

    check-cast v13, Ldc3/h;

    sget-object v14, Ldc3/d;->w:Ldc3/d;

    sget-object v15, Ldc3/e;->w:Ldc3/e;

    iget-object v9, v9, Lwe/o;->x:Ljava/lang/Object;

    move-object/from16 v18, v9

    check-cast v18, Lkotlin/jvm/functions/Function3;

    const/16 v16, 0x0

    move-object/from16 v17, v10

    invoke-direct/range {v11 .. v18}, Llc3/d;-><init>(Llc3/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lhc3/x;Ls83/i;Lkotlin/jvm/functions/Function3;)V

    invoke-virtual {v12, v11, v3}, Llc3/f;->f(Llc3/d;Z)V

    iput-object v8, v0, Lec3/s;->z:Ljava/lang/Object;

    iput-object v7, v0, Lec3/s;->E:Ljava/lang/Object;

    iput-object v2, v0, Lec3/s;->w:Lkotlin/jvm/internal/g0;

    iput-object v6, v0, Lec3/s;->x:Lkotlin/jvm/internal/f0;

    iput v4, v0, Lec3/s;->y:I

    sget-object v9, Llc3/f;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v9, v12}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v9, v9, Llc3/d;

    if-eqz v9, :cond_9

    invoke-virtual {v12, v0}, Llc3/f;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_3

    :cond_9
    invoke-virtual {v12, v0}, Llc3/f;->d(Ls83/c;)Ljava/lang/Object;

    move-result-object v9

    :goto_3
    if-ne v9, v1, :cond_0

    :goto_4
    return-object v1

    :cond_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
