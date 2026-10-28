.class public final Lt23/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Lec3/h2;

.field public final A0:Ll83/p;

.field public final B:Lec3/h2;

.field public final B0:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final C:Lec3/h2;

.field public final D:Lec3/h2;

.field public final E:Lec3/h2;

.field public final F:Lec3/h2;

.field public final G:Lec3/h2;

.field public final H:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final I:Lec3/h2;

.field public final J:Lec3/h2;

.field public final K:Lec3/r1;

.field public final L:Lec3/h2;

.field public final M:Lec3/h2;

.field public final N:Lec3/h2;

.field public final O:Lec3/h2;

.field public final P:Lec3/h2;

.field public final Q:Lec3/h2;

.field public final R:Lec3/h2;

.field public final S:Lec3/h2;

.field public final T:Lec3/h2;

.field public final U:Lec3/h2;

.field public final V:Lec3/h2;

.field public final W:Lec3/h2;

.field public final X:Lec3/h2;

.field public final Y:Lec3/h2;

.field public final Z:Lec3/h2;

.field public final a:Lt23/b4;

.field public final a0:Lec3/h2;

.field public final b:Lt23/c0;

.field public final b0:Lec3/h2;

.field public final c:Lio/getstream/video/android/model/User;

.field public final c0:Lec3/h2;

.field public final d:Lhc3/d;

.field public final d0:Lec3/h2;

.field public final e:Ll83/p;

.field public final e0:Lec3/h2;

.field public final f:Lq30/u0;

.field public final f0:Lec3/h2;

.field public final g:Lec3/h2;

.field public final g0:Lec3/h2;

.field public final h:Lec3/h2;

.field public final h0:Lec3/h2;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i0:Ln53/e;

.field public final j:Lec3/h2;

.field public final j0:Lec3/h2;

.field public final k:Lec3/h2;

.field public final k0:Lec3/h2;

.field public final l:Lec3/h2;

.field public final l0:Lec3/h2;

.field public final m:Ln53/e;

.field public final m0:Lec3/h2;

.field public final n:Lec3/h2;

.field public final n0:Lec3/h2;

.field public final o:Ll83/p;

.field public final o0:Lec3/h2;

.field public final p:Lec3/h2;

.field public final p0:Lec3/h2;

.field public final q:Lec3/h2;

.field public q0:Lbc3/c2;

.field public final r:La30/w0;

.field public r0:Lbc3/c2;

.field public final s:Lt23/t0;

.field public s0:Lbc3/c2;

.field public final t:Li20/q0;

.field public final t0:Ls33/c;

.field public final u:Ln53/g;

.field public final u0:Lro/i;

.field public final v:Lj53/m;

.field public final v0:Ljava/util/concurrent/ConcurrentHashMap;

.field public final w:Lec3/h2;

.field public final w0:Ljava/util/concurrent/atomic/AtomicReference;

.field public final x:Ln53/e;

.field public final x0:Lec3/h2;

.field public final y:Lec3/h2;

.field public final y0:Lec3/h2;

.field public final z:Lec3/h2;

.field public final z0:Lt23/f;


# direct methods
.method public constructor <init>(Lt23/b4;Lt23/c0;Lio/getstream/video/android/model/User;Lhc3/d;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    const-string v4, "user"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v4, p1

    iput-object v4, v0, Lt23/s0;->a:Lt23/b4;

    iput-object v3, v0, Lt23/s0;->b:Lt23/c0;

    iput-object v1, v0, Lt23/s0;->c:Lio/getstream/video/android/model/User;

    iput-object v2, v0, Lt23/s0;->d:Lhc3/d;

    const-string v1, "CallState"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->e:Ll83/p;

    new-instance v1, Lq30/u0;

    const/16 v4, 0x13

    invoke-direct {v1, v0, v4}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Lt23/s0;->f:Lq30/u0;

    sget-object v1, Lt23/n2;->a:Lt23/n2;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->g:Lec3/h2;

    iput-object v1, v0, Lt23/s0;->h:Lec3/h2;

    sget-object v4, Lt23/l0;->E:Lt23/l0;

    invoke-static {v1, v4}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v7, Lm83/z;->w:Lm83/z;

    invoke-static {v7}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->j:Lec3/h2;

    const/4 v8, 0x0

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->k:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->l:Lec3/h2;

    sget-object v5, Lt23/l0;->I:Lt23/l0;

    invoke-static {v1, v5}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    new-instance v1, Lt23/q0;

    const/4 v9, 0x1

    invoke-direct {v1, v0, v9}, Lt23/q0;-><init>(Lt23/s0;I)V

    invoke-static {v4, v1}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->m:Ln53/e;

    sget-object v10, Lm83/y;->w:Lm83/y;

    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->n:Lec3/h2;

    new-instance v1, Lt23/n0;

    const/4 v5, 0x3

    invoke-direct {v1, v0, v5}, Lt23/n0;-><init>(Lt23/s0;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->o:Ll83/p;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->p:Lec3/h2;

    iput-object v1, v0, Lt23/s0;->q:Lec3/h2;

    new-instance v1, La30/w0;

    new-instance v6, Lt23/n0;

    const/4 v11, 0x2

    invoke-direct {v6, v0, v11}, Lt23/n0;-><init>(Lt23/s0;I)V

    invoke-direct {v1, v6}, La30/w0;-><init>(Lt23/n0;)V

    iput-object v1, v0, Lt23/s0;->r:La30/w0;

    iget-object v6, v1, La30/w0;->E:Ljava/lang/Object;

    check-cast v6, Lec3/h2;

    iget-object v1, v1, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    new-instance v12, Lt23/m0;

    invoke-direct {v12, v5, v8}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v13, Lec3/l1;

    invoke-direct {v13, v6, v1, v12, v9}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    sget-object v1, Lec3/z1;->a:Lec3/b2;

    invoke-static {v13, v2, v1, v7}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    sget-object v6, Lt23/l0;->x:Lt23/l0;

    invoke-static {v1, v6}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    new-instance v6, Lt23/t0;

    invoke-direct {v6, v3, v2}, Lt23/t0;-><init>(Lt23/c0;Lhc3/d;)V

    iput-object v6, v0, Lt23/s0;->s:Lt23/t0;

    new-instance v6, Li20/q0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v6, v0, Lt23/s0;->t:Li20/q0;

    new-instance v6, Ln53/g;

    new-instance v12, Lt23/n0;

    invoke-direct {v12, v0, v9}, Lt23/n0;-><init>(Lt23/s0;I)V

    invoke-direct {v6, v12}, Ln53/g;-><init>(Lt23/n0;)V

    iput-object v6, v0, Lt23/s0;->u:Ln53/g;

    new-instance v6, Lt23/k0;

    invoke-direct {v6, v0, v8, v11}, Lt23/k0;-><init>(Lt23/s0;Lq83/d;I)V

    invoke-static {v6}, Lec3/v;->l(Lc93/m;)Lec3/h;

    move-result-object v6

    const-wide/16 v12, 0x3e8

    invoke-static {v6, v12, v13}, Lec3/v;->r(Lec3/l;J)Lec3/l;

    move-result-object v6

    const-wide/16 v12, 0x2710

    invoke-static {v11, v12, v13}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v14

    invoke-static {v6, v2, v14, v8}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move v6, v5

    move-object v5, v1

    new-instance v1, Lj53/m;

    iget-object v14, v3, Lt23/c0;->b:Ljava/lang/String;

    const-string v15, "name"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v15, 0x5

    new-array v15, v15, [Ld33/e;

    sget-object v16, Ld33/d;->g:Ld33/d;

    move/from16 p1, v9

    const/4 v9, 0x0

    aput-object v16, v15, v9

    sget-object v16, Ld33/d;->e:Ld33/d;

    aput-object v16, v15, p1

    sget-object v16, Ld33/d;->d:Ld33/d;

    aput-object v16, v15, v11

    sget-object v16, Ld33/d;->f:Ld33/d;

    aput-object v16, v15, v6

    sget-object v6, Ld33/d;->c:Ld33/d;

    const/16 v16, 0x4

    aput-object v6, v15, v16

    invoke-static {v15}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v11, v15

    check-cast v11, Ld33/e;

    iget-object v11, v11, Ld33/e;->a:Ljava/lang/String;

    invoke-virtual {v11, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_1

    :cond_0
    const/4 v11, 0x2

    goto :goto_0

    :cond_1
    move-object v15, v8

    :goto_1
    check-cast v15, Ld33/e;

    if-eqz v15, :cond_2

    invoke-virtual {v15}, Ld33/e;->a()Lj53/f;

    move-result-object v6

    goto :goto_2

    :cond_2
    sget-object v6, Lj53/c;->a:Lj53/c;

    :goto_2
    invoke-direct/range {v1 .. v6}, Lj53/m;-><init>(Lhc3/d;Lt23/c0;Lec3/h2;Lec3/r1;Lj53/f;)V

    iput-object v1, v0, Lt23/s0;->v:Lj53/m;

    invoke-static {v7}, Lm83/g0;->n0(Ljava/util/Map;)Ljava/util/TreeMap;

    move-result-object v4

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->w:Lec3/h2;

    sget-object v5, Lt23/l0;->H:Lt23/l0;

    invoke-static {v4, v5}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->x:Ln53/e;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->y:Lec3/h2;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v5

    iput-object v5, v0, Lt23/s0;->z:Lec3/h2;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v5

    iput-object v5, v0, Lt23/s0;->A:Lec3/h2;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v5

    iput-object v5, v0, Lt23/s0;->B:Lec3/h2;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v5

    iput-object v5, v0, Lt23/s0;->C:Lec3/h2;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v5

    iput-object v5, v0, Lt23/s0;->D:Lec3/h2;

    sget-object v5, Lm83/a0;->w:Lm83/a0;

    invoke-static {v5}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v6

    iput-object v6, v0, Lt23/s0;->E:Lec3/h2;

    sget-object v6, Lt23/y2;->a:Lt23/y2;

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v6

    iput-object v6, v0, Lt23/s0;->F:Lec3/h2;

    iput-object v6, v0, Lt23/s0;->G:Lec3/h2;

    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    move-result-object v6

    iput-object v6, v0, Lt23/s0;->H:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v11

    iput-object v11, v0, Lt23/s0;->I:Lec3/h2;

    iput-object v11, v0, Lt23/s0;->J:Lec3/h2;

    new-instance v11, Lt23/k0;

    invoke-direct {v11, v0, v8, v9}, Lt23/k0;-><init>(Lt23/s0;Lq83/d;I)V

    new-instance v14, Lec3/s1;

    invoke-direct {v14, v11}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance v11, Ls40/c0;

    const/16 v15, 0x8

    invoke-direct {v11, v14, v8, v15}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v15, Lec3/s1;

    invoke-direct {v15, v11}, Lec3/s1;-><init>(Lc93/m;)V

    const/4 v11, 0x2

    invoke-static {v11, v12, v13}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v9

    invoke-static {v15, v2, v9, v8}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v9

    iput-object v9, v0, Lt23/s0;->K:Lec3/r1;

    invoke-static {v11, v12, v13}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v9

    invoke-static {v14, v2, v9, v8}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v9

    sget-object v11, Lt23/l0;->y:Lt23/l0;

    invoke-static {v9, v11}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lt23/s0;->L:Lec3/h2;

    iput-object v9, v0, Lt23/s0;->M:Lec3/h2;

    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lt23/s0;->N:Lec3/h2;

    invoke-static {v7}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lt23/s0;->O:Lec3/h2;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lt23/s0;->P:Lec3/h2;

    iput-object v9, v0, Lt23/s0;->Q:Lec3/h2;

    sget-object v11, Lt23/l0;->F:Lt23/l0;

    invoke-static {v9, v11}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    new-instance v9, Lt23/k0;

    move/from16 v11, p1

    invoke-direct {v9, v0, v8, v11}, Lt23/k0;-><init>(Lt23/s0;Lq83/d;I)V

    new-instance v11, Lec3/s1;

    invoke-direct {v11, v9}, Lec3/s1;-><init>(Lc93/m;)V

    invoke-static {v11}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v9

    const/4 v11, 0x2

    invoke-static {v11, v12, v13}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v11

    invoke-static {v9, v2, v11, v8}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v9

    sget-object v11, Lt23/l0;->G:Lt23/l0;

    invoke-static {v9, v11}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lt23/s0;->R:Lec3/h2;

    sget-object v11, Lt23/l0;->z:Lt23/l0;

    invoke-static {v9, v11}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v9

    iput-object v9, v0, Lt23/s0;->S:Lec3/h2;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->T:Lec3/h2;

    invoke-static {v5}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->U:Lec3/h2;

    iput-object v4, v0, Lt23/s0;->V:Lec3/h2;

    invoke-static {v5}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->W:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->X:Lec3/h2;

    iput-object v4, v0, Lt23/s0;->Y:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->Z:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->a0:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->b0:Lec3/h2;

    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->c0:Lec3/h2;

    invoke-static {v7}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->d0:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->e0:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->f0:Lec3/h2;

    iput-object v4, v0, Lt23/s0;->g0:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v4

    iput-object v4, v0, Lt23/s0;->h0:Lec3/h2;

    new-instance v5, Lt23/q0;

    const/4 v9, 0x0

    invoke-direct {v5, v0, v9}, Lt23/q0;-><init>(Lt23/s0;I)V

    invoke-static {v4, v5}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    iget-object v1, v1, Lj53/m;->j:Lec3/h2;

    sget-object v4, Lt23/l0;->K:Lt23/l0;

    invoke-static {v1, v4}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->i0:Ln53/e;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->j0:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->k0:Lec3/h2;

    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->l0:Lec3/h2;

    invoke-static {v10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->m0:Lec3/h2;

    iput-object v1, v0, Lt23/s0;->n0:Lec3/h2;

    invoke-static {v7}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->o0:Lec3/h2;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->p0:Lec3/h2;

    new-instance v1, Ls33/c;

    invoke-direct {v1}, Ls33/c;-><init>()V

    iput-object v1, v0, Lt23/s0;->t0:Ls33/c;

    new-instance v1, Lro/i;

    const/16 v4, 0x17

    invoke-direct {v1, v3, v4}, Lro/i;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, Lt23/s0;->u0:Lro/i;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Lt23/s0;->v0:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1, v8}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lt23/s0;->w0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v8}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->x0:Lec3/h2;

    iput-object v1, v0, Lt23/s0;->y0:Lec3/h2;

    new-instance v1, Lt23/f;

    const-string v3, "previousRingingStates"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lt23/c4;->w:Lt23/c4;

    invoke-direct {v1, v2, v6}, Lt23/f;-><init>(Lhc3/d;Ljava/util/concurrent/ConcurrentHashMap$KeySetView;)V

    iput-object v1, v0, Lt23/s0;->z0:Lt23/f;

    const-string v1, "RingingState"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->A0:Ll83/p;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v9, 0x0

    invoke-direct {v1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, v0, Lt23/s0;->B0:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static j(Lt23/s0;Lio/getstream/android/video/generated/models/CallSessionResponse;Lv33/v;I)V
    .locals 2

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p1, v1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v1

    :cond_1
    iget-object p3, p0, Lt23/s0;->l:Lec3/h2;

    if-eqz p2, :cond_2

    iget-object p0, p2, Lv33/v;->a:Lv33/o;

    invoke-virtual {p3, p0}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_2
    if-eqz p1, :cond_6

    iget-object p0, p0, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt23/q2;

    instance-of p2, p0, Lt23/l2;

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    move p2, v0

    goto :goto_0

    :cond_3
    instance-of p2, p0, Lt23/h2;

    :goto_0
    if-eqz p2, :cond_4

    move p2, v0

    goto :goto_1

    :cond_4
    instance-of p2, p0, Lt23/o2;

    :goto_1
    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    instance-of v0, p0, Lt23/m2;

    :goto_2
    if-nez v0, :cond_6

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getParticipantsCountByRole()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->v1(Ljava/lang/Iterable;)I

    move-result p0

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getParticipants()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    new-instance p2, Lv33/o;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getAnonymousParticipantCount()I

    move-result v0

    add-int/2addr v0, p0

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getAnonymousParticipantCount()I

    move-result p0

    invoke-direct {p2, v0, p0}, Lv33/o;-><init>(II)V

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v1, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lt23/s0;->s0:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Lt23/s0;->s0:Lbc3/c2;

    return-void
.end method

.method public final b()Lb23/k;
    .locals 1

    iget-object v0, p0, Lt23/s0;->e:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final c(Ljava/util/List;)V
    .locals 13

    const-string v0, "members"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/s0;->w:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Lm83/g0;->n0(Ljava/util/Map;)Ljava/util/TreeMap;

    move-result-object v1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/android/video/generated/models/MemberResponse;

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/MemberResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Lt23/z1;

    goto :goto_1

    :cond_0
    new-instance v5, Lt23/z1;

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/MemberResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v6

    invoke-static {v6}, Lvd/f;->V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;

    move-result-object v6

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/MemberResponse;->getCustom()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/MemberResponse;->getRole()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/MemberResponse;->getCreatedAt()Ljg3/i;

    move-result-object v9

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/MemberResponse;->getUpdatedAt()Ljg3/i;

    move-result-object v10

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/MemberResponse;->getDeletedAt()Ljg3/i;

    move-result-object v11

    const/16 v12, 0xc0

    invoke-direct/range {v5 .. v12}, Lt23/z1;-><init>(Lio/getstream/video/android/model/User;Ljava/util/Map;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;I)V

    invoke-virtual {v1, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Lt23/s0;->k(Ltx/f;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;
    .locals 6

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lt23/g2;

    return-object p1

    :cond_0
    new-instance v0, Lt23/g2;

    iget-object v2, p0, Lt23/s0;->d:Lhc3/d;

    iget-object v3, p0, Lt23/s0;->f:Lq30/u0;

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lt23/g2;-><init>(Ljava/lang/String;Lhc3/d;Lq30/u0;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)V

    return-object v0
.end method

.method public final e(Lstream/video/sfu/models/Participant;)Lt23/g2;
    .locals 6

    const-string v0, "participant"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lt23/s0;->b()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object v1

    const-string v4, "A user [id:"

    const-string v5, "] is in the call with empty session_id"

    invoke-static {v4, v1, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getSource()Lstream/video/sfu/models/ParticipantSource;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lt23/s0;->d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lt23/g2;->b(Lstream/video/sfu/models/Participant;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt23/s0;->l(Ljava/util/List;)V

    return-object v0
.end method

.method public final f(Lio/getstream/android/video/generated/models/VideoEvent;)V
    .locals 42

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget-object v0, v1, Lt23/s0;->N:Lec3/h2;

    iget-object v3, v1, Lt23/s0;->O:Lec3/h2;

    iget-object v4, v1, Lt23/s0;->j0:Lec3/h2;

    iget-object v5, v1, Lt23/s0;->W:Lec3/h2;

    iget-object v6, v1, Lt23/s0;->f0:Lec3/h2;

    iget-object v7, v1, Lt23/s0;->F:Lec3/h2;

    iget-object v8, v1, Lt23/s0;->T:Lec3/h2;

    iget-object v9, v1, Lt23/s0;->Y:Lec3/h2;

    iget-object v10, v1, Lt23/s0;->D:Lec3/h2;

    iget-object v11, v1, Lt23/s0;->C:Lec3/h2;

    iget-object v12, v1, Lt23/s0;->B:Lec3/h2;

    iget-object v13, v1, Lt23/s0;->U:Lec3/h2;

    iget-object v14, v1, Lt23/s0;->w:Lec3/h2;

    iget-object v15, v1, Lt23/s0;->a:Lt23/b4;

    move-object/from16 v16, v9

    iget-object v9, v1, Lt23/s0;->r:La30/w0;

    move-object/from16 v17, v8

    iget-object v8, v1, Lt23/s0;->E:Lec3/h2;

    move-object/from16 v18, v7

    iget-object v7, v1, Lt23/s0;->y:Lec3/h2;

    move-object/from16 v19, v7

    iget-object v7, v1, Lt23/s0;->b:Lt23/c0;

    move-object/from16 v20, v10

    iget-object v10, v1, Lt23/s0;->X:Lec3/h2;

    move-object/from16 v21, v10

    const-string v10, "event"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lt23/s0;->b()Lb23/k;

    move-result-object v10

    move-object/from16 v22, v11

    iget-object v11, v10, Lb23/k;->c:Lb23/e;

    move-object/from16 v23, v12

    sget-object v12, Lb23/g;->y:Lb23/g;

    move-object/from16 v24, v0

    iget-object v0, v10, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v11, v12, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v10, Lb23/k;->b:Lb23/j;

    iget-object v10, v10, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v25, "."

    move-object/from16 v27, v3

    filled-new-array/range {v25 .. v25}, [Ljava/lang/String;

    move-result-object v3

    move-object/from16 v25, v14

    const/4 v14, 0x6

    invoke-static {v11, v3, v14}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    const-string v11, "[handleEvent] "

    invoke-static {v3, v11}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x0

    invoke-interface {v0, v12, v10, v3, v11}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move-object/from16 v27, v3

    move-object/from16 v25, v14

    :goto_0
    instance-of v0, v2, Lio/getstream/android/video/generated/models/BlockedUserEvent;

    if-eqz v0, :cond_1

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    check-cast v2, Lio/getstream/android/video/generated/models/BlockedUserEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/BlockedUserEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v8, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_1
    instance-of v0, v2, Lv33/t;

    if-eqz v0, :cond_2

    move-object v0, v2

    check-cast v0, Lv33/t;

    iget-object v0, v0, Lv33/t;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v0}, La30/w0;->G(Ljava/util/List;)V

    return-void

    :cond_2
    instance-of v0, v2, Lio/getstream/android/video/generated/models/UnblockedUserEvent;

    if-eqz v0, :cond_3

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    check-cast v2, Lio/getstream/android/video/generated/models/UnblockedUserEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UnblockedUserEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v8, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_3
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallAcceptedEvent;

    const/4 v3, 0x3

    const/4 v8, 0x1

    if-eqz v0, :cond_8

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    check-cast v2, Lio/getstream/android/video/generated/models/CallAcceptedEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallAcceptedEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v13, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v1, v11}, Lt23/s0;->k(Ltx/f;)V

    invoke-virtual/range {v18 .. v18}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/d3;

    instance-of v4, v0, Lt23/a3;

    if-eqz v4, :cond_6

    move-object v4, v0

    check-cast v4, Lt23/a3;

    iget-boolean v4, v4, Lt23/a3;->a:Z

    if-eqz v4, :cond_6

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :cond_4
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v15}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    move-object v5, v6

    goto :goto_1

    :cond_5
    if-nez v5, :cond_6

    iget-object v4, v15, Lt23/b4;->U:Lt23/g1;

    iget-object v4, v4, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_6

    iget-object v4, v1, Lt23/s0;->r0:Lbc3/c2;

    if-nez v4, :cond_6

    iget-object v0, v1, Lt23/s0;->d:Lhc3/d;

    new-instance v4, Lt23/p0;

    const/4 v11, 0x0

    invoke-direct {v4, v1, v11, v8}, Lt23/p0;-><init>(Lt23/s0;Lq83/d;I)V

    invoke-static {v0, v11, v11, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, v1, Lt23/s0;->r0:Lbc3/c2;

    goto :goto_2

    :cond_6
    instance-of v0, v0, Lt23/z2;

    if-eqz v0, :cond_7

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallAcceptedEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lt23/g0;

    sget-object v3, Lt23/g3;->z:Lt23/g3;

    const-string v4, "accepted-on-another-device"

    invoke-direct {v0, v3, v4}, Lt23/g0;-><init>(Lt23/g3;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lt23/c0;->p(Lt23/i0;)V

    :cond_7
    :goto_2
    new-instance v8, Lio/getstream/android/video/generated/models/LocalCallAcceptedPostEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallAcceptedEvent;->getCallCid()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallAcceptedEvent;->getCreatedAt()Ljg3/i;

    move-result-object v10

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallAcceptedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v11

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallAcceptedEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v12

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallAcceptedEvent;->getType()Ljava/lang/String;

    move-result-object v13

    invoke-direct/range {v8 .. v13}, Lio/getstream/android/video/generated/models/LocalCallAcceptedPostEvent;-><init>(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Lt23/c0;->c(Lio/getstream/android/video/generated/models/VideoEvent;)V

    return-void

    :cond_8
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallMissedEvent;

    if-eqz v0, :cond_9

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallMissedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallMissedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    invoke-static {v0}, Lvd/f;->V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v6, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_9
    const/4 v11, 0x0

    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallRejectedEvent;

    if-eqz v0, :cond_e

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallRejectedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRejectedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v2

    invoke-static {v2}, Lvd/f;->V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRejectedEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRejectedEvent;->getReason()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_d

    sget-object v3, Lc43/p;->a:Lc43/p;

    const-string v4, "busy"

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    :goto_3
    move-object v11, v3

    goto :goto_4

    :cond_a
    sget-object v3, Lc43/q;->a:Lc43/q;

    const-string v4, "cancel"

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_3

    :cond_b
    sget-object v3, Lc43/s;->a:Lc43/s;

    const-string v4, "decline"

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    goto :goto_3

    :cond_c
    new-instance v3, Lc43/r;

    invoke-direct {v3, v2}, Lc43/r;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_d
    const/4 v11, 0x0

    :goto_4
    invoke-virtual {v1, v11}, Lt23/s0;->k(Ltx/f;)V

    new-instance v12, Lio/getstream/android/video/generated/models/LocalCallRejectedPostEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRejectedEvent;->getCallCid()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRejectedEvent;->getCreatedAt()Ljg3/i;

    move-result-object v14

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRejectedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v15

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRejectedEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v16

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRejectedEvent;->getType()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRejectedEvent;->getReason()Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v12 .. v18}, Lio/getstream/android/video/generated/models/LocalCallRejectedPostEvent;-><init>(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v12}, Lt23/c0;->c(Lio/getstream/android/video/generated/models/VideoEvent;)V

    return-void

    :cond_e
    instance-of v0, v2, Lio/getstream/android/video/generated/models/LocalCallMissedEvent;

    if-eqz v0, :cond_f

    iget-object v0, v1, Lt23/s0;->d:Lhc3/d;

    new-instance v2, La13/h;

    const/16 v4, 0x12

    const/4 v11, 0x0

    invoke-direct {v2, v1, v11, v4}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v11, v11, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_f
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallEndedEvent;

    const v5, 0xf4240

    const/16 v6, 0x3e8

    const-wide/16 v10, 0x3e8

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Lt23/s0;->a()V

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallEndedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallEndedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v2

    invoke-virtual {v1, v2}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    sget-object v2, Ljg3/p;->F:Ljg3/p;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sget-object v3, Ljg3/c;->H:Ljg3/c;

    invoke-static {v8, v9, v10, v11}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v10

    invoke-static {v6, v8, v9}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v3

    mul-int/2addr v3, v5

    invoke-static {v3, v10, v11}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object v3

    invoke-virtual {v2}, Ljg3/o;->k()Log3/h;

    move-result-object v2

    invoke-virtual {v2, v3}, Log3/h;->a(Ljg3/c;)Ljg3/p;

    move-result-object v2

    invoke-static {v3, v2}, Ljg3/i;->q0(Ljg3/c;Ljg3/o;)Ljg3/i;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v4, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v2, v1, Lt23/s0;->k0:Lec3/h2;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallEndedEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-static {v0}, Lvd/f;->V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;

    move-result-object v26

    move-object/from16 v0, v26

    goto :goto_5

    :cond_10
    move-object v0, v11

    :goto_5
    invoke-virtual {v2, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v1, v11}, Lt23/s0;->k(Ltx/f;)V

    new-instance v0, Lt23/d0;

    sget-object v2, Lt23/g;->z:Lt23/g;

    const-string v3, "CallEndedEvent"

    invoke-direct {v0, v2, v3}, Lt23/d0;-><init>(Lt23/g;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lt23/c0;->p(Lt23/i0;)V

    return-void

    :cond_11
    instance-of v0, v2, Lv33/b;

    if-eqz v0, :cond_12

    sget-object v0, Ljg3/p;->F:Ljg3/p;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v8, Ljg3/c;->H:Ljg3/c;

    invoke-static {v2, v3, v10, v11}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v8

    invoke-static {v6, v2, v3}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v2

    mul-int/2addr v2, v5

    invoke-static {v2, v8, v9}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object v2

    invoke-virtual {v0}, Ljg3/o;->k()Log3/h;

    move-result-object v0

    invoke-virtual {v0, v2}, Log3/h;->a(Ljg3/c;)Ljg3/p;

    move-result-object v0

    invoke-static {v2, v0}, Ljg3/i;->q0(Ljg3/c;Ljg3/o;)Ljg3/i;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v4, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v0, Lt23/d0;

    sget-object v2, Lt23/g;->E:Lt23/g;

    const-string v3, "CallEndedSfuEvent"

    invoke-direct {v0, v2, v3}, Lt23/d0;-><init>(Lt23/g;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lt23/c0;->p(Lt23/i0;)V

    return-void

    :cond_12
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallMemberUpdatedEvent;

    if-eqz v0, :cond_13

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallMemberUpdatedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallMemberUpdatedEvent;->getMembers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lt23/s0;->c(Ljava/util/List;)V

    return-void

    :cond_13
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallMemberRemovedEvent;

    if-eqz v0, :cond_15

    invoke-virtual/range {v25 .. v25}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lm83/g0;->n0(Ljava/util/Map;)Ljava/util/TreeMap;

    move-result-object v0

    check-cast v2, Lio/getstream/android/video/generated/models/CallMemberRemovedEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallMemberRemovedEvent;->getMembers()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_14
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v4, v25

    const/4 v11, 0x0

    invoke-virtual {v4, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_15
    move-object/from16 v4, v25

    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallCreatedEvent;

    if-eqz v0, :cond_16

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallCreatedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallCreatedEvent;->getMembers()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lt23/s0;->c(Ljava/util/List;)V

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallCreatedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v0

    invoke-virtual {v1, v0}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    return-void

    :cond_16
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallRingEvent;

    if-eqz v0, :cond_17

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallRingEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRingEvent;->getMembers()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lt23/s0;->c(Ljava/util/List;)V

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRingEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v2

    invoke-virtual {v1, v2}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {v2}, Lm83/g0;->n0(Ljava/util/Map;)Ljava/util/TreeMap;

    move-result-object v2

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRingEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_63

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRingEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRingEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v5

    invoke-static {v5}, Lvd/f;->V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;

    move-result-object v7

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRingEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/UserResponse;->getRole()Ljava/lang/String;

    move-result-object v9

    sget-object v8, Lm83/z;->w:Lm83/z;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRingEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedAt()Ljg3/i;

    move-result-object v10

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRingEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallResponse;->getUpdatedAt()Ljg3/i;

    move-result-object v11

    new-instance v6, Lt23/z1;

    const/4 v12, 0x0

    const/16 v13, 0xe0

    invoke-direct/range {v6 .. v13}, Lt23/z1;-><init>(Lio/getstream/video/android/model/User;Ljava/util/Map;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;I)V

    invoke-virtual {v2, v3, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v4, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_17
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallUpdatedEvent;

    if-eqz v0, :cond_18

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallUpdatedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallUpdatedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v2

    invoke-virtual {v1, v2}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallUpdatedEvent;->getCapabilitiesByRole()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v4, v27

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_18
    move-object/from16 v4, v27

    instance-of v0, v2, Lio/getstream/android/video/generated/models/UpdatedCallPermissionsEvent;

    if-eqz v0, :cond_19

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/UpdatedCallPermissionsEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/UpdatedCallPermissionsEvent;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_63

    iget-object v2, v1, Lt23/s0;->L:Lec3/h2;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/UpdatedCallPermissionsEvent;->getOwnCapabilities()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_19
    instance-of v0, v2, Lio/getstream/android/video/generated/models/ConnectedEvent;

    if-nez v0, :cond_63

    instance-of v5, v2, Lio/getstream/android/video/generated/models/CustomVideoEvent;

    if-nez v5, :cond_63

    instance-of v5, v2, Lio/getstream/android/video/generated/models/HealthCheckEvent;

    if-nez v5, :cond_63

    instance-of v5, v2, Lio/getstream/android/video/generated/models/PermissionRequestEvent;

    if-eqz v5, :cond_1a

    invoke-virtual/range {v24 .. v24}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v3, Lt43/a;

    check-cast v2, Lio/getstream/android/video/generated/models/PermissionRequestEvent;

    invoke-direct {v3, v7, v2}, Lt43/a;-><init>(Lt23/c0;Lio/getstream/android/video/generated/models/PermissionRequestEvent;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v2, v24

    const/4 v11, 0x0

    invoke-virtual {v2, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_1a
    instance-of v5, v2, Lio/getstream/android/video/generated/models/CallMemberUpdatedPermissionEvent;

    if-eqz v5, :cond_1b

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallMemberUpdatedPermissionEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallMemberUpdatedPermissionEvent;->getCapabilitiesByRole()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_1b
    instance-of v4, v2, Lio/getstream/android/video/generated/models/CallMemberAddedEvent;

    if-eqz v4, :cond_1c

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallMemberAddedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallMemberAddedEvent;->getMembers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lt23/s0;->c(Ljava/util/List;)V

    return-void

    :cond_1c
    instance-of v4, v2, Lio/getstream/android/video/generated/models/CallReactionEvent;

    if-eqz v4, :cond_1d

    iget-object v0, v1, Lt23/s0;->l0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast v2, Lio/getstream/android/video/generated/models/CallReactionEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallReactionEvent;->getReaction()Lio/getstream/android/video/generated/models/ReactionResponse;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, Lt23/s0;->l0:Lec3/h2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v3, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallReactionEvent;->getReaction()Lio/getstream/android/video/generated/models/ReactionResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/ReactionResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    iget-object v3, v1, Lt23/s0;->i0:Ln53/e;

    iget-object v3, v3, Ln53/e;->y:Ll83/e;

    check-cast v3, Lkotlin/jvm/internal/m;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_63

    iget-object v3, v1, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/g2;

    if-eqz v0, :cond_63

    iget-object v3, v0, Lt23/g2;->I:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    new-instance v4, Lc43/o;

    const-string v5, "toString(...)"

    invoke-static {v5}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallReactionEvent;->getReaction()Lio/getstream/android/video/generated/models/ReactionResponse;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct {v4, v5, v2, v6, v7}, Lc43/o;-><init>(Ljava/lang/String;Lio/getstream/android/video/generated/models/ReactionResponse;J)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lt23/g2;->I:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v0, v11, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_1d
    const/4 v11, 0x0

    instance-of v4, v2, Lio/getstream/android/video/generated/models/CallRecordingStartedEvent;

    if-eqz v4, :cond_20

    iget-object v0, v1, Lt23/s0;->A:Lec3/h2;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v11, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallRecordingStartedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRecordingStartedEvent;->getRecordingType()Lio/getstream/android/video/generated/models/CallRecordingStartedEvent$RecordingType;

    move-result-object v0

    sget-object v2, Lio/getstream/android/video/generated/models/CallRecordingStartedEvent$RecordingType$Individual;->INSTANCE:Lio/getstream/android/video/generated/models/CallRecordingStartedEvent$RecordingType$Individual;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v4, v23

    invoke-virtual {v4, v11, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_1e
    sget-object v2, Lio/getstream/android/video/generated/models/CallRecordingStartedEvent$RecordingType$Raw;->INSTANCE:Lio/getstream/android/video/generated/models/CallRecordingStartedEvent$RecordingType$Raw;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v5, v22

    invoke-virtual {v5, v11, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_1f
    sget-object v2, Lio/getstream/android/video/generated/models/CallRecordingStartedEvent$RecordingType$Composite;->INSTANCE:Lio/getstream/android/video/generated/models/CallRecordingStartedEvent$RecordingType$Composite;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_63

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v6, v20

    invoke-virtual {v6, v11, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_20
    move-object/from16 v6, v20

    move-object/from16 v5, v22

    move-object/from16 v4, v23

    instance-of v7, v2, Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent;

    const/4 v10, 0x0

    if-eqz v7, :cond_26

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent;->getRecordingType()Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent$RecordingType;

    move-result-object v0

    sget-object v2, Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent$RecordingType$Individual;->INSTANCE:Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent$RecordingType$Individual;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v4, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_7

    :cond_21
    const/4 v11, 0x0

    sget-object v2, Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent$RecordingType$Raw;->INSTANCE:Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent$RecordingType$Raw;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_22

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_7

    :cond_22
    sget-object v2, Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent$RecordingType$Composite;->INSTANCE:Lio/getstream/android/video/generated/models/CallRecordingStoppedEvent$RecordingType$Composite;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_23
    :goto_7
    iget-object v0, v1, Lt23/s0;->A:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_25

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_25

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_24

    goto :goto_8

    :cond_24
    move v8, v10

    :cond_25
    :goto_8
    const/4 v11, 0x0

    invoke-static {v8, v0, v11}, Lev/n;->B(ZLec3/h2;Ljava/lang/Object;)V

    return-void

    :cond_26
    instance-of v4, v2, Lio/getstream/android/video/generated/models/CallLiveStartedEvent;

    if-eqz v4, :cond_27

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallLiveStartedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallLiveStartedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v0

    invoke-virtual {v1, v0}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    return-void

    :cond_27
    instance-of v4, v2, Lv33/a;

    if-eqz v4, :cond_2b

    move-object v0, v2

    check-cast v0, Lv33/a;

    iget-object v0, v0, Lv33/a;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo53/b;

    iget-object v5, v5, Lo53/b;->a:Ljava/lang/String;

    sget-object v6, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v1, v4, v5, v6}, Lt23/s0;->d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;

    move-result-object v4

    iget-object v5, v4, Lt23/g2;->G:Lec3/h2;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo53/b;

    iget-boolean v6, v6, Lo53/b;->b:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v5, v11, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo53/b;

    iget v2, v2, Lo53/b;->c:F

    invoke-virtual {v4, v2}, Lt23/g2;->a(F)V

    goto :goto_9

    :cond_28
    iget-object v0, v1, Lt23/s0;->n:Lec3/h2;

    iget-object v2, v1, Lt23/s0;->v:Lj53/m;

    iget-object v2, v2, Lj53/m;->j:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_29
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lt23/g2;

    iget-object v6, v6, Lt23/g2;->H:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_29

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_2a
    new-instance v2, Lqx/d0;

    invoke-direct {v2, v3}, Lqx/d0;-><init>(I)V

    invoke-static {v4, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v0, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_2b
    instance-of v4, v2, Lv33/g;

    if-eqz v4, :cond_2f

    iget-object v0, v1, Lt23/s0;->q:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/g2;

    if-eqz v0, :cond_2c

    iget-object v3, v0, Lt23/g2;->a:Ljava/lang/String;

    goto :goto_b

    :cond_2c
    const/4 v3, 0x0

    :goto_b
    check-cast v2, Lv33/g;

    iget-object v4, v2, Lv33/g;->b:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_63

    iget-object v3, v2, Lv33/g;->b:Ljava/lang/String;

    iget-object v2, v2, Lv33/g;->a:Ljava/lang/String;

    sget-object v4, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v1, v3, v2, v4}, Lt23/s0;->d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;

    move-result-object v2

    iget-object v3, v2, Lt23/g2;->E:Lec3/h2;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v3, v11, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v3, v1, Lt23/s0;->p:Lec3/h2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v0, :cond_2d

    iget-object v0, v0, Lt23/g2;->E:Lec3/h2;

    goto :goto_c

    :cond_2d
    move-object v0, v11

    :goto_c
    if-nez v0, :cond_2e

    goto/16 :goto_1e

    :cond_2e
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_2f
    instance-of v4, v2, Lv33/f;

    const/4 v5, 0x2

    if-eqz v4, :cond_34

    move-object v0, v2

    check-cast v0, Lv33/f;

    iget-object v0, v0, Lv33/f;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_63

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lstream/video/sfu/event/ConnectionQualityInfo;

    invoke-virtual {v2}, Lstream/video/sfu/event/ConnectionQualityInfo;->getSession_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lstream/video/sfu/event/ConnectionQualityInfo;->getUser_id()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v1, v4, v6, v7}, Lt23/s0;->d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;

    move-result-object v4

    iget-object v4, v4, Lt23/g2;->D:Lec3/h2;

    invoke-virtual {v2}, Lstream/video/sfu/event/ConnectionQualityInfo;->getConnection_quality()Lstream/video/sfu/models/ConnectionQuality;

    move-result-object v2

    const-string v6, "connectionQuality"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lc43/h;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v6, v2

    if-eq v2, v8, :cond_33

    if-eq v2, v5, :cond_32

    if-eq v2, v3, :cond_31

    const/4 v6, 0x4

    if-ne v2, v6, :cond_30

    new-instance v2, Lc43/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_e

    :cond_30
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_31
    new-instance v2, Lc43/j;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_e

    :cond_32
    new-instance v2, Lc43/k;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    goto :goto_e

    :cond_33
    new-instance v2, Lc43/l;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    :goto_e
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v4, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_d

    :cond_34
    const/4 v11, 0x0

    instance-of v4, v2, Lv33/h;

    if-eqz v4, :cond_35

    iget-object v0, v1, Lt23/s0;->m0:Lec3/h2;

    iget-object v3, v1, Lt23/s0;->n0:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-static {v2, v3}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_35
    instance-of v4, v2, Lv33/v;

    if-eqz v4, :cond_36

    move-object v0, v2

    check-cast v0, Lv33/v;

    invoke-static {v1, v11, v0, v8}, Lt23/s0;->j(Lt23/s0;Lio/getstream/android/video/generated/models/CallSessionResponse;Lv33/v;I)V

    return-void

    :cond_36
    instance-of v4, v2, Lv33/k;

    if-nez v4, :cond_63

    instance-of v4, v2, Lv33/n;

    if-eqz v4, :cond_3a

    move-object v0, v2

    check-cast v0, Lv33/n;

    iget-object v2, v1, Lt23/s0;->l:Lec3/h2;

    iget-object v3, v0, Lv33/n;->b:Lv33/o;

    invoke-virtual {v2, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v2, v0, Lv33/n;->a:Lstream/video/sfu/models/CallState;

    invoke-virtual {v2}, Lstream/video/sfu/models/CallState;->getParticipants()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_37

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lstream/video/sfu/models/Participant;

    invoke-virtual {v1, v5}, Lt23/s0;->e(Lstream/video/sfu/models/Participant;)Lt23/g2;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_37
    invoke-virtual {v1, v3}, Lt23/s0;->l(Ljava/util/List;)V

    iget-object v2, v1, Lt23/s0;->B0:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_38

    const/4 v11, 0x0

    invoke-virtual {v1, v11}, Lt23/s0;->k(Ltx/f;)V

    goto :goto_10

    :cond_38
    const/4 v11, 0x0

    new-instance v2, Lt23/a3;

    invoke-direct {v2, v8}, Lt23/a3;-><init>(Z)V

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v3, v18

    invoke-virtual {v3, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_10
    iget-object v0, v0, Lv33/n;->a:Lstream/video/sfu/models/CallState;

    invoke-virtual {v0}, Lstream/video/sfu/models/CallState;->getPins()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_39

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lstream/video/sfu/models/Pin;

    new-instance v4, Lv33/s;

    invoke-virtual {v3}, Lstream/video/sfu/models/Pin;->getUser_id()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lstream/video/sfu/models/Pin;->getSession_id()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lv33/s;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_39
    invoke-virtual {v9, v2}, La30/w0;->G(Ljava/util/List;)V

    return-void

    :cond_3a
    instance-of v4, v2, Lv33/p;

    const/16 v6, 0x8

    if-eqz v4, :cond_3d

    :try_start_0
    iget-object v0, v1, Lt23/s0;->v:Lj53/m;

    iget-object v0, v0, Lj53/m;->j:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, v6, :cond_3b

    move-object v0, v2

    check-cast v0, Lv33/p;

    iget-object v0, v0, Lv33/p;->a:Lstream/video/sfu/models/Participant;

    invoke-virtual {v1, v0}, Lt23/s0;->e(Lstream/video/sfu/models/Participant;)Lt23/g2;

    move-object v0, v2

    check-cast v0, Lv33/p;

    invoke-virtual {v9, v0}, La30/w0;->D(Lv33/p;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_12

    :cond_3b
    iget-object v0, v1, Lt23/s0;->v0:Ljava/util/concurrent/ConcurrentHashMap;

    move-object v3, v2

    check-cast v3, Lv33/p;

    iget-object v3, v3, Lv33/p;->a:Lstream/video/sfu/models/Participant;

    invoke-virtual {v3}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ll83/k;

    move-object v5, v2

    check-cast v5, Lv33/p;

    iget-object v5, v5, Lv33/p;->a:Lstream/video/sfu/models/Participant;

    move-object v6, v2

    check-cast v6, Lv33/p;

    iget-boolean v6, v6, Lv33/p;->c:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lt23/s0;->t:Li20/q0;

    iget-object v3, v1, Lt23/s0;->d:Lhc3/d;

    iget-object v4, v1, Lt23/s0;->u:Ln53/g;

    new-instance v5, Lt23/n0;

    invoke-direct {v5, v1, v10}, Lt23/n0;-><init>(Lt23/s0;I)V

    invoke-virtual {v0, v3, v4, v5}, Li20/q0;->a(Lhc3/d;Ln53/g;Lt23/n0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_12
    invoke-virtual {v1}, Lt23/s0;->b()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->F:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3c

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    const-string v6, "[ParticipantJoinedEvent] #participants; #debounce; Failed to debounce, processing as usual."

    invoke-interface {v4, v5, v3, v6, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3c
    move-object v0, v2

    check-cast v0, Lv33/p;

    iget-object v0, v0, Lv33/p;->a:Lstream/video/sfu/models/Participant;

    invoke-virtual {v1, v0}, Lt23/s0;->e(Lstream/video/sfu/models/Participant;)Lt23/g2;

    goto/16 :goto_1e

    :cond_3d
    instance-of v4, v2, Lv33/q;

    if-eqz v4, :cond_44

    :try_start_1
    iget-object v0, v1, Lt23/s0;->v0:Ljava/util/concurrent/ConcurrentHashMap;

    move-object v3, v2

    check-cast v3, Lv33/q;

    iget-object v3, v3, Lv33/q;->a:Lstream/video/sfu/models/Participant;

    invoke-virtual {v3}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_13

    :catch_1
    move-exception v0

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    const-string v5, "SafeCall"

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3e

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Exception occurred: "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v5, v6, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3e
    :goto_13
    move-object v0, v2

    check-cast v0, Lv33/q;

    iget-object v0, v0, Lv33/q;->a:Lstream/video/sfu/models/Participant;

    invoke-virtual {v0}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object v0

    const-string v2, "sessionId"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v1, Lt23/s0;->j:Lec3/h2;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v3, v11, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual/range {v19 .. v19}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc43/t;

    if-eqz v2, :cond_3f

    iget-object v2, v2, Lc43/t;->a:Lt23/g2;

    if-eqz v2, :cond_3f

    iget-object v2, v2, Lt23/g2;->a:Ljava/lang/String;

    goto :goto_14

    :cond_3f
    const/4 v2, 0x0

    :goto_14
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_40

    move-object/from16 v4, v19

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_40
    iget-object v2, v9, La30/w0;->G:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    iget-object v3, v9, La30/w0;->E:Ljava/lang/Object;

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_41

    iget-object v4, v9, La30/w0;->z:Ljava/lang/Object;

    check-cast v4, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-static {v0, v3}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v4, v11, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_41
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_63

    iget-object v3, v9, La30/w0;->F:Ljava/lang/Object;

    check-cast v3, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_42
    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_43

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_42

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_15

    :cond_43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v3, v11, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_1e

    :cond_44
    move-object/from16 v4, v19

    instance-of v7, v2, Lv33/y;

    if-nez v7, :cond_63

    instance-of v7, v2, Lv33/z;

    if-eqz v7, :cond_47

    move-object v0, v2

    check-cast v0, Lv33/z;

    iget-object v2, v0, Lv33/z;->b:Ljava/lang/String;

    iget-object v3, v0, Lv33/z;->a:Ljava/lang/String;

    sget-object v5, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v1, v2, v3, v5}, Lt23/s0;->d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;

    move-result-object v2

    iget-object v0, v0, Lv33/z;->c:Lstream/video/sfu/models/TrackType;

    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    if-ne v0, v3, :cond_45

    iget-object v0, v2, Lt23/g2;->o:Lec3/h2;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v11, 0x0

    invoke-virtual {v0, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_45
    const/4 v11, 0x0

    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    if-ne v0, v3, :cond_46

    iget-object v0, v2, Lt23/g2;->k:Lec3/h2;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v11, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_46
    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    if-ne v0, v3, :cond_63

    iget-object v0, v2, Lt23/g2;->r:Lec3/h2;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    new-instance v0, Lc43/t;

    invoke-direct {v0, v2}, Lc43/t;-><init>(Lt23/g2;)V

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_47
    instance-of v7, v2, Lv33/a0;

    if-eqz v7, :cond_4b

    move-object v0, v2

    check-cast v0, Lv33/a0;

    iget-object v2, v0, Lv33/a0;->b:Ljava/lang/String;

    iget-object v3, v0, Lv33/a0;->a:Ljava/lang/String;

    sget-object v5, Lstream/video/sfu/models/ParticipantSource;->PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v1, v2, v3, v5}, Lt23/s0;->d(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ParticipantSource;)Lt23/g2;

    move-result-object v2

    iget-object v0, v0, Lv33/a0;->c:Lstream/video/sfu/models/TrackType;

    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    if-ne v0, v3, :cond_48

    iget-object v0, v2, Lt23/g2;->o:Lec3/h2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_48
    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    if-ne v0, v3, :cond_49

    iget-object v0, v2, Lt23/g2;->k:Lec3/h2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_49
    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    if-ne v0, v3, :cond_63

    iget-object v0, v2, Lt23/g2;->r:Lec3/h2;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc43/t;

    if-eqz v0, :cond_4a

    iget-object v0, v0, Lc43/t;->a:Lt23/g2;

    if-eqz v0, :cond_4a

    iget-object v0, v0, Lt23/g2;->a:Ljava/lang/String;

    goto :goto_16

    :cond_4a
    const/4 v0, 0x0

    :goto_16
    iget-object v2, v2, Lt23/g2;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_63

    const/4 v11, 0x0

    invoke-virtual {v4, v11}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_4b
    if-nez v0, :cond_63

    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallSessionStartedEvent;

    if-eqz v0, :cond_4d

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallSessionStartedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionStartedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallResponse;->getSession()Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object v2

    if-eqz v2, :cond_4c

    move-object/from16 v4, v21

    invoke-virtual {v4, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_4c
    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionStartedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v0

    invoke-virtual {v1, v0}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    return-void

    :cond_4d
    move-object/from16 v4, v21

    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallSessionEndedEvent;

    if-eqz v0, :cond_4e

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallSessionEndedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionEndedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallResponse;->getSession()Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object v2

    invoke-virtual {v4, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionEndedEvent;->getCall()Lio/getstream/android/video/generated/models/CallResponse;

    move-result-object v0

    invoke-virtual {v1, v0}, Lt23/s0;->h(Lio/getstream/android/video/generated/models/CallResponse;)V

    return-void

    :cond_4e
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;

    if-eqz v0, :cond_50

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Lio/getstream/android/video/generated/models/CallSessionResponse;

    if-eqz v27, :cond_4f

    move-object v0, v2

    check-cast v0, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->getParticipantsCountByRole()Ljava/util/Map;

    move-result-object v33

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionParticipantCountsUpdatedEvent;->getAnonymousParticipantCount()I

    move-result v28

    const/16 v40, 0xfde

    const/16 v41, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-static/range {v27 .. v41}, Lio/getstream/android/video/generated/models/CallSessionResponse;->copy$default(Lio/getstream/android/video/generated/models/CallSessionResponse;ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object v0

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_4f
    invoke-virtual/range {v16 .. v16}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/android/video/generated/models/CallSessionResponse;

    const/4 v11, 0x0

    invoke-static {v1, v0, v11, v5}, Lt23/s0;->j(Lt23/s0;Lio/getstream/android/video/generated/models/CallSessionResponse;Lv33/v;I)V

    return-void

    :cond_50
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallSessionParticipantLeftEvent;

    if-eqz v0, :cond_54

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Lio/getstream/android/video/generated/models/CallSessionResponse;

    if-eqz v27, :cond_53

    invoke-virtual/range {v27 .. v27}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getParticipants()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v3, Lf53/e;

    invoke-direct {v3, v2, v8}, Lf53/e;-><init>(Lio/getstream/android/video/generated/models/VideoEvent;I)V

    new-instance v7, Laq0/i;

    invoke-direct {v7, v3, v6}, Laq0/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    invoke-virtual/range {v27 .. v27}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getParticipantsCountByRole()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    check-cast v2, Lio/getstream/android/video/generated/models/CallSessionParticipantLeftEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSessionParticipantLeftEvent;->getParticipant()Lio/getstream/android/video/generated/models/CallParticipantResponse;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getRole()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lt23/j0;

    invoke-direct {v7, v10}, Lt23/j0;-><init>(I)V

    invoke-interface {v3, v6, v7}, Ljava/util/Map;->computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-nez v6, :cond_51

    goto :goto_17

    :cond_51
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-nez v6, :cond_52

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSessionParticipantLeftEvent;->getParticipant()Lio/getstream/android/video/generated/models/CallParticipantResponse;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getRole()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_52
    :goto_17
    const/16 v40, 0xfdb

    const/16 v41, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    move-object/from16 v30, v0

    move-object/from16 v33, v3

    invoke-static/range {v27 .. v41}, Lio/getstream/android/video/generated/models/CallSessionResponse;->copy$default(Lio/getstream/android/video/generated/models/CallSessionResponse;ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object v0

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_53
    invoke-virtual/range {v16 .. v16}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/android/video/generated/models/CallSessionResponse;

    const/4 v11, 0x0

    invoke-static {v1, v0, v11, v5}, Lt23/s0;->j(Lt23/s0;Lio/getstream/android/video/generated/models/CallSessionResponse;Lv33/v;I)V

    return-void

    :cond_54
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallSessionParticipantJoinedEvent;

    if-eqz v0, :cond_59

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Lio/getstream/android/video/generated/models/CallSessionResponse;

    if-eqz v27, :cond_58

    invoke-virtual/range {v27 .. v27}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getParticipants()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    check-cast v2, Lio/getstream/android/video/generated/models/CallSessionParticipantJoinedEvent;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSessionParticipantJoinedEvent;->getParticipant()Lio/getstream/android/video/generated/models/CallParticipantResponse;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v3

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSessionParticipantJoinedEvent;->getCreatedAt()Ljg3/i;

    move-result-object v6

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSessionParticipantJoinedEvent;->getParticipant()Lio/getstream/android/video/generated/models/CallParticipantResponse;

    move-result-object v7

    invoke-virtual {v7}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v7

    invoke-virtual {v7}, Lio/getstream/android/video/generated/models/UserResponse;->getRole()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSessionParticipantJoinedEvent;->getParticipant()Lio/getstream/android/video/generated/models/CallParticipantResponse;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getUserSessionId()Ljava/lang/String;

    move-result-object v9

    new-instance v11, Lio/getstream/android/video/generated/models/CallParticipantResponse;

    invoke-direct {v11, v6, v7, v9, v3}, Lio/getstream/android/video/generated/models/CallParticipantResponse;-><init>(Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UserResponse;)V

    invoke-virtual/range {v27 .. v27}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getParticipantsCountByRole()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSessionParticipantJoinedEvent;->getParticipant()Lio/getstream/android/video/generated/models/CallParticipantResponse;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getRole()Ljava/lang/String;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    sget-object v9, Lt23/o0;->w:Lt23/o0;

    new-instance v9, Lt23/j0;

    invoke-direct {v9, v8}, Lt23/j0;-><init>(I)V

    invoke-interface {v3, v6, v7, v9}, Ljava/util/Map;->merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_18
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, -0x1

    if-eqz v7, :cond_56

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/android/video/generated/models/CallParticipantResponse;

    iget-object v7, v1, Lt23/s0;->c:Lio/getstream/video/android/model/User;

    invoke-virtual {v7}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CallSessionParticipantJoinedEvent;->getParticipant()Lio/getstream/android/video/generated/models/CallParticipantResponse;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_55

    goto :goto_19

    :cond_55
    add-int/lit8 v10, v10, 0x1

    goto :goto_18

    :cond_56
    move v10, v8

    :goto_19
    if-ne v10, v8, :cond_57

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_57
    invoke-virtual {v0, v10, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_1a
    const/16 v40, 0xfdb

    const/16 v41, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    move-object/from16 v30, v0

    move-object/from16 v33, v3

    invoke-static/range {v27 .. v41}, Lio/getstream/android/video/generated/models/CallSessionResponse;->copy$default(Lio/getstream/android/video/generated/models/CallSessionResponse;ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object v0

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_58
    invoke-virtual/range {v16 .. v16}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/android/video/generated/models/CallSessionResponse;

    const/4 v11, 0x0

    invoke-static {v1, v0, v11, v5}, Lt23/s0;->j(Lt23/s0;Lio/getstream/android/video/generated/models/CallSessionResponse;Lv33/v;I)V

    invoke-virtual {v1, v11}, Lt23/s0;->k(Ltx/f;)V

    return-void

    :cond_59
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallTranscriptionStartedEvent;

    if-eqz v0, :cond_5a

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v4, v17

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_5a
    move-object/from16 v4, v17

    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallTranscriptionStoppedEvent;

    if-eqz v0, :cond_5b

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_5b
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallTranscriptionFailedEvent;

    if-eqz v0, :cond_5c

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_5c
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallClosedCaptionsStartedEvent;

    if-eqz v0, :cond_5d

    move v0, v8

    goto :goto_1b

    :cond_5d
    instance-of v0, v2, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;

    :goto_1b
    if-eqz v0, :cond_5e

    goto :goto_1c

    :cond_5e
    instance-of v8, v2, Lio/getstream/android/video/generated/models/CallClosedCaptionsStoppedEvent;

    :goto_1c
    if-eqz v8, :cond_62

    iget-object v0, v1, Lt23/s0;->t0:Ls33/c;

    iget-object v4, v0, Ls33/c;->e:Lec3/h2;

    const-string v5, "videoEvent"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v5, v2, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;

    if-eqz v5, :cond_5f

    check-cast v2, Lio/getstream/android/video/generated/models/ClosedCaptionEvent;

    iget-object v5, v0, Ls33/c;->g:Lhc3/d;

    new-instance v6, Lcz/d;

    const/16 v7, 0xd

    const/4 v11, 0x0

    invoke-direct {v6, v0, v2, v11, v7}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v5, v11, v11, v6, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_5f
    const/4 v11, 0x0

    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallClosedCaptionsStartedEvent;

    if-eqz v0, :cond_60

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_60
    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallClosedCaptionsStoppedEvent;

    if-eqz v0, :cond_61

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v11, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_61
    :goto_1d
    return-void

    :cond_62
    const/4 v11, 0x0

    instance-of v0, v2, Lio/getstream/android/video/generated/models/CallModerationBlurEvent;

    if-eqz v0, :cond_63

    iget-object v0, v1, Lt23/s0;->d:Lhc3/d;

    new-instance v2, Lt23/p0;

    invoke-direct {v2, v1, v11, v10}, Lt23/p0;-><init>(Lt23/s0;Lq83/d;I)V

    invoke-static {v0, v11, v11, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_63
    :goto_1e
    return-void
.end method

.method public final g()V
    .locals 4

    iget-object v0, p0, Lt23/s0;->s0:Lbc3/c2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    invoke-static {}, Lc53/c;->a()Lc53/a;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lup/d;->h(Lc53/a;Lq83/j;I)Lc53/a;

    move-result-object v0

    new-instance v2, Lt23/p0;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v1, v3}, Lt23/p0;-><init>(Lt23/s0;Lq83/d;I)V

    invoke-static {v0, v1, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lt23/s0;->s0:Lbc3/c2;

    return-void
.end method

.method public final h(Lio/getstream/android/video/generated/models/CallResponse;)V
    .locals 5

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getBackstage()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lt23/s0;->P:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lt23/s0;->c0:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getBlockedUserIds()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lt23/s0;->R:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getEgress()Lio/getstream/android/video/generated/models/EgressResponse;

    move-result-object v1

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getEgress()Lio/getstream/android/video/generated/models/EgressResponse;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/EgressResponse;->getBroadcasting()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lt23/s0;->S:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getSession()Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object v0

    iget-object v1, p0, Lt23/s0;->X:Lec3/h2;

    invoke-virtual {v1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getSession()Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object v0

    sget-object v3, Lm83/a0;->w:Lm83/a0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getRejectedBy()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    iget-object v4, p0, Lt23/s0;->W:Lec3/h2;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getSession()Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getAcceptedBy()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    :cond_1
    iget-object v0, p0, Lt23/s0;->V:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    iget-object v3, p0, Lt23/s0;->U:Lec3/h2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lt23/s0;->b0:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedAt()Ljg3/i;

    move-result-object v3

    invoke-virtual {v0, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lt23/s0;->a0:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getUpdatedAt()Ljg3/i;

    move-result-object v3

    invoke-virtual {v0, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getEndedAt()Ljg3/i;

    move-result-object v0

    iget-object v3, p0, Lt23/s0;->j0:Lec3/h2;

    invoke-virtual {v3, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lt23/s0;->Z:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getStartsAt()Ljg3/i;

    move-result-object v4

    invoke-virtual {v0, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getCreatedBy()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v0

    invoke-static {v0}, Lvd/f;->V(Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/video/android/model/User;

    move-result-object v0

    iget-object v4, p0, Lt23/s0;->f0:Lec3/h2;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lt23/s0;->d0:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getCustom()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v0, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lt23/s0;->h0:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getIngress()Lio/getstream/android/video/generated/models/CallIngressResponse;

    move-result-object v4

    invoke-virtual {v0, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getRecording()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v4, p0, Lt23/s0;->A:Lec3/h2;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lt23/s0;->I:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getSettings()Lio/getstream/android/video/generated/models/CallSettingsResponse;

    move-result-object v4

    invoke-virtual {v0, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getTranscribing()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v4, p0, Lt23/s0;->T:Lec3/h2;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lt23/s0;->e0:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getTeam()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getThumbnails()Lio/getstream/android/video/generated/models/ThumbnailResponse;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/ThumbnailResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    iget-object v4, p0, Lt23/s0;->p0:Lec3/h2;

    invoke-virtual {v4, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getSession()Lio/getstream/android/video/generated/models/CallSessionResponse;

    move-result-object v0

    invoke-virtual {v1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getStartedAt()Ljg3/i;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v2

    :goto_2
    iget-object v4, p0, Lt23/s0;->k:Lec3/h2;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getStartedAt()Ljg3/i;

    move-result-object v1

    invoke-virtual {v4, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getLiveStartedAt()Ljg3/i;

    move-result-object v1

    goto :goto_3

    :cond_5
    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getLiveStartedAt()Ljg3/i;

    move-result-object v1

    invoke-virtual {v4, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getLiveEndedAt()Ljg3/i;

    move-result-object v1

    goto :goto_5

    :cond_7
    move-object v1, v2

    :goto_5
    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getLiveEndedAt()Ljg3/i;

    move-result-object v1

    invoke-virtual {v3, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_8
    const/4 v1, 0x2

    invoke-static {p0, v0, v2, v1}, Lt23/s0;->j(Lt23/s0;Lio/getstream/android/video/generated/models/CallSessionResponse;Lv33/v;I)V

    invoke-virtual {p0, v2}, Lt23/s0;->k(Ltx/f;)V

    iget-object v0, p0, Lt23/s0;->t0:Ls33/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Ls33/c;->e:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getCaptioning()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, v0, Ls33/c;->d:Lec3/h2;

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallResponse;->getSettings()Lio/getstream/android/video/generated/models/CallSettingsResponse;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getTranscription()Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse;->getClosedCaptionMode()Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;

    move-result-object p1

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(ILandroid/app/Notification;)V
    .locals 2

    const-string v0, "notification"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lt23/s0;->x0:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Lt23/s0;->w0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Ltx/f;)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v4, v0, Lt23/s0;->b:Lt23/c0;

    iget-object v2, v4, Lt23/c0;->v:Ljava/lang/String;

    iget-object v3, v4, Lt23/c0;->c:Ljava/lang/String;

    iget-object v5, v0, Lt23/s0;->a:Lt23/b4;

    iget-object v6, v5, Lt23/b4;->U:Lt23/g1;

    iget-object v7, v0, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt23/d3;

    sget-object v9, Lt23/c3;->a:Lt23/c3;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    sget-object v11, Lt23/b3;->a:Lt23/b3;

    if-eqz v10, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    :goto_0
    if-eqz v8, :cond_1

    return-void

    :cond_1
    iget-object v8, v0, Lt23/s0;->W:Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Set;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Set;

    invoke-virtual {v5}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v8, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    iget-object v13, v0, Lt23/s0;->U:Lec3/h2;

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Set;

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Set;

    invoke-virtual {v5}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v13, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    iget-object v15, v0, Lt23/s0;->f0:Lec3/h2;

    invoke-virtual {v15}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lio/getstream/video/android/model/User;

    iget-object v12, v6, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v16, v5

    if-eqz v12, :cond_3

    iget-object v12, v6, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lt23/c0;

    if-eqz v12, :cond_2

    iget-object v12, v12, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    :goto_1
    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    const/4 v12, 0x1

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    :goto_2
    iget-object v5, v6, Lt23/g1;->g:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_5

    iget-object v5, v6, Lt23/g1;->g:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt23/c0;

    if-eqz v5, :cond_4

    iget-object v5, v5, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v3, 0x1

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    iget-object v5, v0, Lt23/s0;->X:Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/android/video/generated/models/CallSessionResponse;

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/CallSessionResponse;->getParticipants()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_8

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v17, v6

    check-cast v17, Lio/getstream/android/video/generated/models/CallParticipantResponse;

    invoke-virtual/range {v17 .. v17}, Lio/getstream/android/video/generated/models/CallParticipantResponse;->getUser()Lio/getstream/android/video/generated/models/UserResponse;

    move-result-object v17

    move-object/from16 v18, v5

    invoke-virtual/range {v17 .. v17}, Lio/getstream/android/video/generated/models/UserResponse;->getId()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v17, v6

    invoke-virtual/range {v16 .. v16}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v5, v18

    goto :goto_5

    :cond_7
    const/16 v17, 0x0

    :goto_6
    move-object/from16 v5, v17

    check-cast v5, Lio/getstream/android/video/generated/models/CallParticipantResponse;

    goto :goto_7

    :cond_8
    const/4 v5, 0x0

    :goto_7
    if-eqz v5, :cond_9

    const/4 v5, 0x1

    goto :goto_8

    :cond_9
    const/4 v5, 0x0

    :goto_8
    iget-object v6, v0, Lt23/s0;->w:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    move-object/from16 v17, v6

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface/range {v17 .. v17}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_9
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_b

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/util/Map$Entry;

    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v7

    move-object/from16 v7, v19

    check-cast v7, Lt23/z1;

    iget-object v7, v7, Lt23/z1;->a:Lio/getstream/video/android/model/User;

    invoke-virtual {v7}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v19, v9

    invoke-virtual/range {v16 .. v16}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v6, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    move-object/from16 v9, v19

    move-object/from16 v7, v20

    goto :goto_9

    :cond_b
    move-object/from16 v20, v7

    move-object/from16 v19, v9

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v6

    iget-object v7, v0, Lt23/s0;->j0:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_c

    const/4 v7, 0x1

    goto :goto_a

    :cond_c
    const/4 v7, 0x0

    :goto_a
    if-eqz v15, :cond_d

    invoke-virtual {v15}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v9

    :goto_b
    move-object/from16 v17, v10

    goto :goto_c

    :cond_d
    const/4 v9, 0x0

    goto :goto_b

    :goto_c
    invoke-virtual/range {v16 .. v16}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v9, v0, Lt23/s0;->A0:Ll83/p;

    invoke-virtual {v9}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lb23/k;

    move-object/from16 v18, v9

    iget-object v9, v10, Lb23/k;->c:Lb23/e;

    move-object/from16 v21, v11

    iget-object v11, v10, Lb23/k;->a:Ljava/lang/String;

    move-object/from16 v22, v15

    sget-object v15, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v15, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    move/from16 v23, v9

    iget-object v9, v0, Lt23/s0;->F:Lec3/h2;

    if-eqz v23, :cond_e

    iget-object v10, v10, Lb23/k;->b:Lb23/j;

    move-object/from16 v23, v9

    invoke-virtual/range {v23 .. v23}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v24, v14

    new-instance v14, Ljava/lang/StringBuilder;

    move/from16 v25, v6

    const-string v6, "Current: "

    invoke-direct {v14, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", call_id: "

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x0

    invoke-interface {v10, v15, v11, v6, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_d

    :cond_e
    move/from16 v25, v6

    move-object/from16 v23, v9

    move-object/from16 v24, v14

    :goto_d
    const-string v6, "acceptedByMe: "

    invoke-static {v6, v13}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v26

    const-string v6, "isRejectedByMe: "

    invoke-static {v6, v8}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v27

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "rejectReason: "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    const-string v6, "hasActiveCall: "

    invoke-static {v6, v12}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v29

    const-string v6, "hasRingingCall: "

    invoke-static {v6, v3}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v30

    const-string v6, "userIsParticipant: "

    invoke-static {v6, v5}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v31

    const-string v6, "isCallEnded: "

    invoke-static {v6, v7}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v32

    filled-new-array/range {v26 .. v32}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v26

    sget-object v30, Lt23/l0;->J:Lt23/l0;

    const/16 v31, 0x1e

    const-string v27, ""

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v26 .. v31}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v18 .. v18}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb23/k;

    iget-object v10, v9, Lb23/k;->c:Lb23/e;

    iget-object v11, v9, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v15, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_f

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    const-string v10, "call_id: "

    const-string v14, ", Flags: "

    invoke-static {v10, v2, v14, v6}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    invoke-interface {v9, v15, v11, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    iget-object v2, v0, Lt23/s0;->B0:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v6, Lt23/x2;->a:Lt23/x2;

    if-eqz v12, :cond_10

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v9

    if-nez v9, :cond_10

    invoke-virtual {v0}, Lt23/s0;->a()V

    :goto_e
    move-object v9, v6

    :goto_f
    const/4 v1, 0x0

    goto/16 :goto_16

    :cond_10
    if-eqz v3, :cond_12

    if-eqz v7, :cond_12

    invoke-virtual {v0}, Lt23/s0;->a()V

    :cond_11
    :goto_10
    move-object/from16 v9, v21

    goto :goto_f

    :cond_12
    if-eqz v8, :cond_13

    new-instance v1, Lt23/h0;

    sget-object v2, Lt23/d4;->x:Lt23/d4;

    const-string v3, "updateRingingState-rejected-self"

    invoke-direct {v1, v2, v3}, Lt23/h0;-><init>(Lt23/d4;Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Lt23/c0;->p(Lt23/i0;)V

    invoke-virtual {v0}, Lt23/s0;->a()V

    goto :goto_10

    :cond_13
    move-object/from16 v10, v17

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_14

    invoke-interface/range {v17 .. v17}, Ljava/util/Set;->size()I

    move-result v7

    move/from16 v8, v25

    if-ge v7, v8, :cond_16

    :cond_14
    move-object/from16 v10, v17

    check-cast v10, Ljava/lang/Iterable;

    if-eqz v22, :cond_15

    invoke-virtual/range {v22 .. v22}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_11

    :cond_15
    const/4 v7, 0x0

    :goto_11
    invoke-static {v10, v7}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_18

    if-eqz v3, :cond_18

    :cond_16
    new-instance v2, Lt23/g0;

    sget-object v3, Lt23/g3;->F:Lt23/g3;

    const-string v5, "All participants rejected the call"

    invoke-direct {v2, v3, v5}, Lt23/g0;-><init>(Lt23/g3;Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Lt23/c0;->p(Lt23/i0;)V

    invoke-virtual {v0}, Lt23/s0;->a()V

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Ltx/f;->M()Ljava/lang/String;

    move-result-object v1

    goto :goto_12

    :cond_17
    const/4 v1, 0x0

    :goto_12
    const-string v2, "timeout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    move-object/from16 v9, v19

    goto :goto_f

    :cond_18
    if-eqz v3, :cond_1b

    if-eqz v22, :cond_19

    invoke-virtual/range {v22 .. v22}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_13

    :cond_19
    const/4 v1, 0x0

    :goto_13
    invoke-virtual/range {v16 .. v16}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    if-eqz v5, :cond_1a

    invoke-virtual {v0}, Lt23/s0;->a()V

    goto/16 :goto_e

    :cond_1a
    new-instance v9, Lt23/z2;

    invoke-direct {v9, v13}, Lt23/z2;-><init>(Z)V

    goto/16 :goto_f

    :cond_1b
    if-eqz v3, :cond_20

    if-eqz v22, :cond_1c

    invoke-virtual/range {v22 .. v22}, Lio/getstream/video/android/model/User;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_14

    :cond_1c
    const/4 v1, 0x0

    :goto_14
    invoke-virtual/range {v16 .. v16}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-virtual/range {v18 .. v18}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb23/k;

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v7, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v15, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1d

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "acceptedBy: "

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v14, v24

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ", userIsParticipant: "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    invoke-interface {v1, v15, v7, v3, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_15

    :cond_1d
    move-object/from16 v14, v24

    :goto_15
    invoke-interface {v14}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1e

    new-instance v9, Lt23/a3;

    const/4 v1, 0x0

    invoke-direct {v9, v1}, Lt23/a3;-><init>(Z)V

    goto :goto_16

    :cond_1e
    const/4 v1, 0x0

    if-nez v5, :cond_1f

    new-instance v9, Lt23/a3;

    const/4 v2, 0x1

    invoke-direct {v9, v2}, Lt23/a3;-><init>(Z)V

    goto :goto_16

    :cond_1f
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v0}, Lt23/s0;->a()V

    move-object v9, v6

    goto :goto_16

    :cond_20
    const/4 v1, 0x0

    invoke-virtual/range {v23 .. v23}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lt23/z2;

    if-eqz v2, :cond_21

    move-object/from16 v9, v19

    goto :goto_16

    :cond_21
    sget-object v9, Lt23/y2;->a:Lt23/y2;

    :goto_16
    invoke-virtual/range {v23 .. v23}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_25

    invoke-virtual/range {v18 .. v18}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_22

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {v23 .. v23}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Updating ringing state "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v2, v15, v5, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_22
    instance-of v2, v9, Lt23/a3;

    if-eqz v2, :cond_23

    move-object v2, v9

    check-cast v2, Lt23/a3;

    iget-boolean v2, v2, Lt23/a3;->a:Z

    if-nez v2, :cond_23

    invoke-virtual {v0}, Lt23/s0;->g()V

    goto :goto_17

    :cond_23
    instance-of v2, v9, Lt23/z2;

    if-eqz v2, :cond_24

    move-object v2, v9

    check-cast v2, Lt23/z2;

    iget-boolean v2, v2, Lt23/z2;->a:Z

    if-nez v2, :cond_24

    invoke-virtual {v0}, Lt23/s0;->g()V

    goto :goto_17

    :cond_24
    invoke-virtual {v0}, Lt23/s0;->a()V

    :cond_25
    :goto_17
    invoke-virtual/range {v18 .. v18}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v15, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_26

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Update: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v2, v15, v5, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_26
    instance-of v2, v9, Lt23/x2;

    iget-object v3, v0, Lt23/s0;->z0:Lt23/f;

    if-eqz v2, :cond_30

    invoke-virtual/range {v20 .. v20}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/d3;

    new-instance v5, Lr5/c;

    move-object v6, v9

    check-cast v6, Lt23/x2;

    const/4 v7, 0x7

    invoke-direct {v5, v7, v0, v6}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "currentRingingState"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v2, Lt23/x2;

    if-eqz v6, :cond_27

    goto/16 :goto_1a

    :cond_27
    invoke-virtual {v3}, Lt23/f;->d()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    iget-object v8, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v15, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_28

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v10, "[awaitAndTransition], ringingState: "

    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    invoke-interface {v6, v15, v8, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_18

    :cond_28
    const/4 v7, 0x0

    :goto_18
    iget-object v2, v3, Lt23/f;->c:Lt23/c4;

    sget-object v6, Lt23/c4;->w:Lt23/c4;

    if-ne v2, v6, :cond_2a

    iget-object v1, v3, Lt23/f;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    if-eqz v1, :cond_29

    invoke-interface {v1}, Lbc3/k1;->isActive()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_29

    goto :goto_1a

    :cond_29
    invoke-virtual {v5}, Lr5/c;->invoke()Ljava/lang/Object;

    goto :goto_1a

    :cond_2a
    iget-object v2, v3, Lt23/f;->b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    if-eqz v2, :cond_2c

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2c

    :cond_2b
    move v2, v1

    goto :goto_19

    :cond_2c
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt23/d3;

    instance-of v8, v6, Lt23/z2;

    if-nez v8, :cond_2e

    instance-of v6, v6, Lt23/a3;

    if-eqz v6, :cond_2d

    :cond_2e
    const/4 v2, 0x1

    :goto_19
    iget-object v8, v3, Lt23/f;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    if-eqz v1, :cond_2f

    invoke-interface {v1}, Lbc3/k1;->isActive()Z

    move-result v1

    const/4 v6, 0x1

    if-ne v1, v6, :cond_2f

    goto :goto_1a

    :cond_2f
    iget-object v10, v3, Lt23/f;->a:Lhc3/d;

    new-instance v1, Ld33/t0;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Ld33/t0;-><init>(ZLt23/f;Lt23/c0;Lr5/c;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v10, v7, v7, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_1a

    :cond_30
    const/4 v7, 0x0

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v1, v23

    invoke-virtual {v1, v7, v9}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lt23/f;->c()V

    :goto_1a
    iget-object v1, v0, Lt23/s0;->H:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {v1, v9}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final l(Ljava/util/List;)V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/g2;

    iget-object v3, v1, Lt23/g2;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lt23/g2;->s:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v1, p0, Lt23/s0;->j:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    new-instance p1, Lc43/t;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/g2;

    invoke-direct {p1, v0}, Lc43/t;-><init>(Lt23/g2;)V

    iget-object v0, p0, Lt23/s0;->y:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
