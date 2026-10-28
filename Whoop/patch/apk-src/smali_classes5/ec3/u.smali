.class public final Lec3/u;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lec3/l;

.field public w:J

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lec3/l;JLq83/d;)V
    .locals 0

    iput-wide p2, p0, Lec3/u;->E:J

    iput-object p1, p0, Lec3/u;->F:Lec3/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lbc3/c0;

    check-cast p2, Lec3/m;

    check-cast p3, Lq83/d;

    new-instance v0, Lec3/u;

    iget-wide v1, p0, Lec3/u;->E:J

    iget-object v3, p0, Lec3/u;->F:Lec3/l;

    invoke-direct {v0, v3, v1, v2, p3}, Lec3/u;-><init>(Lec3/l;JLq83/d;)V

    iput-object p1, v0, Lec3/u;->y:Ljava/lang/Object;

    iput-object p2, v0, Lec3/u;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lec3/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/u;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget-wide v6, v0, Lec3/u;->w:J

    iget-object v2, v0, Lec3/u;->z:Ljava/lang/Object;

    check-cast v2, Ldc3/w;

    iget-object v8, v0, Lec3/u;->y:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lec3/u;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v6, v0, Lec3/u;->z:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    sget-object v7, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v7}, Lkotlin/time/Duration$Companion;->getZERO-UwyO8pc()J

    move-result-wide v7

    iget-wide v9, v0, Lec3/u;->E:J

    invoke-static {v9, v10, v7, v8}, Lkotlin/time/Duration;->compareTo-LRDsOJo(JJ)I

    move-result v7

    if-lez v7, :cond_7

    iget-object v7, v0, Lec3/u;->F:Lec3/l;

    const/4 v8, 0x2

    invoke-static {v7, v3, v8}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object v12

    instance-of v7, v12, Lfc3/d;

    if-eqz v7, :cond_2

    move-object v7, v12

    check-cast v7, Lfc3/d;

    goto :goto_0

    :cond_2
    move-object v7, v5

    :goto_0
    if-nez v7, :cond_3

    new-instance v11, Lfc3/h;

    const/4 v15, 0x0

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lfc3/h;-><init>(Lec3/l;Lq83/j;ILdc3/a;I)V

    move-object v7, v11

    :cond_3
    invoke-virtual {v7, v2}, Lfc3/d;->h(Lbc3/c0;)Ldc3/w;

    move-result-object v2

    move-object v8, v6

    move-wide v6, v9

    :cond_4
    new-instance v10, Llc3/f;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v9

    invoke-direct {v10, v9}, Llc3/f;-><init>(Lq83/j;)V

    invoke-interface {v2}, Ldc3/w;->d()Lwe/o;

    move-result-object v9

    new-instance v15, La6/c;

    const/16 v11, 0xd

    invoke-direct {v15, v8, v5, v11}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v11, Llc3/d;

    iget-object v12, v9, Lwe/o;->w:Ljava/lang/Object;

    check-cast v12, Ldc3/h;

    move-object v13, v11

    move-object v11, v12

    sget-object v12, Ldc3/d;->w:Ldc3/d;

    move-object v14, v13

    sget-object v13, Ldc3/e;->w:Ldc3/e;

    iget-object v9, v9, Lwe/o;->x:Ljava/lang/Object;

    move-object/from16 v16, v9

    check-cast v16, Lkotlin/jvm/functions/Function3;

    move-object v9, v14

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Llc3/d;-><init>(Llc3/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lhc3/x;Ls83/i;Lkotlin/jvm/functions/Function3;)V

    invoke-virtual {v10, v9, v3}, Llc3/f;->f(Llc3/d;Z)V

    new-instance v9, Lec3/t;

    invoke-direct {v9, v6, v7, v5}, Lec3/t;-><init>(JLq83/d;)V

    invoke-static {v6, v7}, Lbc3/m0;->e(J)J

    move-result-wide v11

    invoke-static {v10, v11, v12, v9}, Llc3/i;->a(Llc3/f;JLkotlin/jvm/functions/Function1;)V

    iput-object v8, v0, Lec3/u;->y:Ljava/lang/Object;

    iput-object v2, v0, Lec3/u;->z:Ljava/lang/Object;

    iput-wide v6, v0, Lec3/u;->w:J

    iput v4, v0, Lec3/u;->x:I

    sget-object v9, Llc3/f;->F:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v9, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v9, v9, Llc3/d;

    if-eqz v9, :cond_5

    invoke-virtual {v10, v0}, Llc3/f;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_1

    :cond_5
    invoke-virtual {v10, v0}, Llc3/f;->d(Ls83/c;)Ljava/lang/Object;

    move-result-object v9

    :goto_1
    if-ne v9, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_4

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_7
    new-instance v1, Lkotlinx/coroutines/TimeoutCancellationException;

    const-string v2, "Timed out immediately"

    invoke-direct {v1, v2, v5}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;Lbc3/k1;)V

    throw v1
.end method
