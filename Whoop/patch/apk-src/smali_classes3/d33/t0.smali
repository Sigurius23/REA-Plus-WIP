.class public final Ld33/t0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Z

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld33/h1;Lstream/video/sfu/models/TrackType;ZLjava/util/Map;Ljava/lang/String;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld33/t0;->w:I

    .line 1
    iput-object p1, p0, Ld33/t0;->z:Ljava/lang/Object;

    iput-object p2, p0, Ld33/t0;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Ld33/t0;->y:Z

    iput-object p4, p0, Ld33/t0;->F:Ljava/lang/Object;

    iput-object p5, p0, Ld33/t0;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Le33/v0;ZLjava/util/List;Ljava/util/List;Lbi/p;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld33/t0;->w:I

    .line 2
    iput-object p1, p0, Ld33/t0;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Ld33/t0;->y:Z

    iput-object p3, p0, Ld33/t0;->E:Ljava/lang/Object;

    iput-object p4, p0, Ld33/t0;->F:Ljava/lang/Object;

    iput-object p5, p0, Ld33/t0;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lz20/g;Lz20/h;ZLq83/d;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Ld33/t0;->w:I

    .line 3
    iput-object p1, p0, Ld33/t0;->E:Ljava/lang/Object;

    iput-object p2, p0, Ld33/t0;->F:Ljava/lang/Object;

    iput-object p3, p0, Ld33/t0;->G:Ljava/lang/Object;

    iput-boolean p4, p0, Ld33/t0;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ln20/p;La30/q0;Lh20/x1;ZLjo2/d;Lq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ld33/t0;->w:I

    .line 4
    iput-object p1, p0, Ld33/t0;->z:Ljava/lang/Object;

    iput-object p2, p0, Ld33/t0;->E:Ljava/lang/Object;

    iput-object p3, p0, Ld33/t0;->F:Ljava/lang/Object;

    iput-boolean p4, p0, Ld33/t0;->y:Z

    iput-object p5, p0, Ld33/t0;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(ZLt23/f;Lt23/c0;Lr5/c;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ld33/t0;->w:I

    .line 5
    iput-boolean p1, p0, Ld33/t0;->y:Z

    iput-object p2, p0, Ld33/t0;->E:Ljava/lang/Object;

    iput-object p3, p0, Ld33/t0;->F:Ljava/lang/Object;

    iput-object p4, p0, Ld33/t0;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget v0, p0, Ld33/t0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Ld33/t0;

    iget-object v0, p0, Ld33/t0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Ld33/t0;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lz20/g;

    iget-object v0, p0, Ld33/t0;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lz20/h;

    iget-boolean v5, p0, Ld33/t0;->y:Z

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Ld33/t0;-><init>(Ljava/util/List;Lz20/g;Lz20/h;ZLq83/d;)V

    iput-object p1, v1, Ld33/t0;->z:Ljava/lang/Object;

    return-object v1

    :pswitch_0
    move-object v8, p2

    new-instance v2, Ld33/t0;

    iget-object p2, p0, Ld33/t0;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lt23/f;

    iget-object p2, p0, Ld33/t0;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lt23/c0;

    iget-object p2, p0, Ld33/t0;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lr5/c;

    iget-boolean v3, p0, Ld33/t0;->y:Z

    move-object v7, v8

    invoke-direct/range {v2 .. v7}, Ld33/t0;-><init>(ZLt23/f;Lt23/c0;Lr5/c;Lq83/d;)V

    iput-object p1, v2, Ld33/t0;->z:Ljava/lang/Object;

    return-object v2

    :pswitch_1
    move-object v8, p2

    new-instance v2, Ld33/t0;

    iget-object p1, p0, Ld33/t0;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ln20/p;

    iget-object p1, p0, Ld33/t0;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, La30/q0;

    iget-object p1, p0, Ld33/t0;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lh20/x1;

    iget-object p1, p0, Ld33/t0;->G:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljo2/d;

    iget-boolean v6, p0, Ld33/t0;->y:Z

    invoke-direct/range {v2 .. v8}, Ld33/t0;-><init>(Ln20/p;La30/q0;Lh20/x1;ZLjo2/d;Lq83/d;)V

    return-object v2

    :pswitch_2
    move-object v8, p2

    new-instance v2, Ld33/t0;

    iget-object p1, p0, Ld33/t0;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Le33/v0;

    iget-object p1, p0, Ld33/t0;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/util/List;

    iget-object p1, p0, Ld33/t0;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/util/List;

    iget-object p1, p0, Ld33/t0;->G:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lbi/p;

    iget-boolean v4, p0, Ld33/t0;->y:Z

    invoke-direct/range {v2 .. v8}, Ld33/t0;-><init>(Le33/v0;ZLjava/util/List;Ljava/util/List;Lbi/p;Lq83/d;)V

    return-object v2

    :pswitch_3
    move-object v8, p2

    new-instance v2, Ld33/t0;

    iget-object p1, p0, Ld33/t0;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ld33/h1;

    iget-object p1, p0, Ld33/t0;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lstream/video/sfu/models/TrackType;

    iget-object p1, p0, Ld33/t0;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/util/Map;

    iget-object p1, p0, Ld33/t0;->G:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget-boolean v5, p0, Ld33/t0;->y:Z

    invoke-direct/range {v2 .. v8}, Ld33/t0;-><init>(Ld33/h1;Lstream/video/sfu/models/TrackType;ZLjava/util/Map;Ljava/lang/String;Lq83/d;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld33/t0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ld33/t0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/t0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ld33/t0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/t0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ld33/t0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/t0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Ld33/t0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/t0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Ld33/t0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/t0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v5, p0

    iget v0, v5, Ld33/t0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v5, Ld33/t0;->F:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lz20/g;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ld33/t0;->x:I

    const/4 v10, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, v5, Ld33/t0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v5, Ld33/t0;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v3, v5, Ld33/t0;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Ly00/f4;

    sget-object v9, Ly00/f4;->I:Ly00/f4;

    sget-object v11, Ly00/f4;->l0:Ly00/f4;

    sget-object v12, Ly00/f4;->L:Ly00/f4;

    filled-new-array {v9, v11, v12}, [Ly00/f4;

    move-result-object v9

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object v3, v5, Ld33/t0;->G:Ljava/lang/Object;

    move-object v8, v3

    check-cast v8, Lz20/h;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Ly00/f4;

    new-instance v6, Lx30/k0;

    const/4 v11, 0x4

    invoke-direct/range {v6 .. v11}, Lx30/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v9, 0x3

    invoke-static {v1, v10, v6, v9}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v5, Ld33/t0;->z:Ljava/lang/Object;

    iput v2, v5, Ld33/t0;->x:I

    invoke-static {v3, v5}, Lbc3/f0;->f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_5

    goto/16 :goto_e

    :cond_5
    move-object v0, v1

    :goto_2
    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_13

    check-cast v2, Ljava/util/List;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_7
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ly00/o4;

    iget-object v9, v8, Ly00/o4;->E:Ly00/f4;

    sget-object v11, Ly00/f4;->I:Ly00/f4;

    if-ne v9, v11, :cond_7

    iget-object v8, v8, Ly00/o4;->H:Ly00/z3;

    if-eqz v8, :cond_8

    iget-object v8, v8, Ly00/z3;->J:La10/j;

    if-eqz v8, :cond_8

    iget-object v8, v8, La10/j;->w:La10/h;

    goto :goto_5

    :cond_8
    move-object v8, v10

    :goto_5
    sget-object v9, La10/h;->I:La10/h;

    if-ne v8, v9, :cond_7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_a
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ly00/o4;

    iget-object v9, v9, Ly00/o4;->H:Ly00/z3;

    if-eqz v9, :cond_b

    iget-object v11, v9, Ly00/z3;->H:Ljava/lang/String;

    goto :goto_7

    :cond_b
    move-object v11, v10

    :goto_7
    if-eqz v9, :cond_c

    iget-object v12, v9, Ly00/z3;->z:Ljava/lang/Integer;

    goto :goto_8

    :cond_c
    move-object v12, v10

    :goto_8
    if-eqz v9, :cond_d

    iget-object v13, v9, Ly00/z3;->E:Ljava/lang/Integer;

    goto :goto_9

    :cond_d
    move-object v13, v10

    :goto_9
    if-eqz v9, :cond_e

    iget-object v9, v9, Ly00/z3;->w:Ly00/i;

    if-eqz v9, :cond_e

    iget-object v9, v9, Ly00/i;->w:Ljava/lang/String;

    goto :goto_a

    :cond_e
    move-object v9, v10

    :goto_a
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "-"

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v4, La10/h;->z:La10/h;

    sget-object v6, La10/h;->E:La10/h;

    sget-object v7, La10/h;->G:La10/h;

    sget-object v8, La10/h;->I:La10/h;

    filled-new-array {v4, v6, v7, v8}, [La10/h;

    move-result-object v4

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ly00/o4;

    iget-object v9, v8, Ly00/o4;->E:Ly00/f4;

    sget-object v11, Ly00/f4;->I:Ly00/f4;

    if-ne v9, v11, :cond_11

    move-object v9, v4

    check-cast v9, Ljava/lang/Iterable;

    iget-object v8, v8, Ly00/o4;->H:Ly00/z3;

    if-eqz v8, :cond_10

    iget-object v8, v8, Ly00/z3;->J:La10/j;

    if-eqz v8, :cond_10

    iget-object v8, v8, La10/j;->w:La10/h;

    goto :goto_c

    :cond_10
    move-object v8, v10

    :goto_c
    invoke-static {v9, v8}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    goto :goto_b

    :cond_11
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_12
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    :cond_13
    iget-boolean v2, v5, Ld33/t0;->y:Z

    if-nez v2, :cond_6

    invoke-static {v3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    new-instance v1, Ll83/n;

    invoke-direct {v1, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_d
    move-object v0, v1

    goto :goto_e

    :cond_14
    new-instance v1, Ll83/n;

    invoke-direct {v1, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    goto :goto_d

    :goto_e
    return-object v0

    :pswitch_0
    iget-object v0, v5, Ld33/t0;->F:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    iget-object v1, v5, Ld33/t0;->E:Ljava/lang/Object;

    check-cast v1, Lt23/f;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v5, Ld33/t0;->x:I

    const/4 v4, 0x2

    const/4 v6, 0x1

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    if-eqz v3, :cond_17

    if-eq v3, v6, :cond_16

    if-ne v3, v4, :cond_15

    iget-object v0, v5, Ld33/t0;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v0

    move-object/from16 v0, p1

    goto :goto_10

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    iget-object v3, v5, Ld33/t0;->z:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_17
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v5, Ld33/t0;->z:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    iget-boolean v8, v5, Ld33/t0;->y:Z

    if-eqz v8, :cond_19

    iput-object v3, v5, Ld33/t0;->z:Ljava/lang/Object;

    iput v6, v5, Ld33/t0;->x:I

    invoke-static {v1, v0, v5}, Lt23/f;->a(Lt23/f;Lt23/c0;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_18

    goto :goto_12

    :cond_18
    :goto_f
    invoke-static {v3}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v6

    if-nez v6, :cond_19

    goto :goto_11

    :cond_19
    iput-object v3, v5, Ld33/t0;->z:Ljava/lang/Object;

    iput v4, v5, Ld33/t0;->x:I

    invoke-static {v1, v0, v5}, Lt23/f;->b(Lt23/f;Lt23/c0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1a

    goto :goto_12

    :cond_1a
    :goto_10
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v3}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v2

    if-nez v2, :cond_1b

    :goto_11
    move-object v2, v7

    goto :goto_12

    :cond_1b
    if-eqz v0, :cond_1c

    iget-object v0, v5, Ld33/t0;->G:Ljava/lang/Object;

    check-cast v0, Lr5/c;

    invoke-virtual {v0}, Lr5/c;->invoke()Ljava/lang/Object;

    :cond_1c
    invoke-virtual {v1}, Lt23/f;->c()V

    goto :goto_11

    :goto_12
    return-object v2

    :pswitch_1
    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Ld33/t0;->x:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1e

    if-ne v0, v1, :cond_1d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_13

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Ld33/t0;->z:Ljava/lang/Object;

    check-cast v0, Ln20/p;

    iget-object v2, v5, Ld33/t0;->E:Ljava/lang/Object;

    check-cast v2, La30/q0;

    iget-object v3, v5, Ld33/t0;->F:Ljava/lang/Object;

    check-cast v3, Lh20/x1;

    iget-object v4, v5, Ld33/t0;->G:Ljava/lang/Object;

    check-cast v4, Ljo2/d;

    iput v1, v5, Ld33/t0;->x:I

    move-object v1, v2

    move-object v2, v3

    iget-boolean v3, v5, Ld33/t0;->y:Z

    invoke-static/range {v0 .. v5}, Ln20/p;->a(Ln20/p;La30/q0;Lh20/x1;ZLjo2/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_1f

    goto :goto_14

    :cond_1f
    :goto_13
    sget-object v6, Ll83/a0;->a:Ll83/a0;

    :goto_14
    return-object v6

    :pswitch_2
    iget-object v0, v5, Ld33/t0;->z:Ljava/lang/Object;

    check-cast v0, Le33/v0;

    iget-object v1, v0, Le33/v0;->w:Ljava/lang/String;

    iget-object v2, v0, Le33/v0;->H:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, v0, Le33/v0;->G:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v6, v5, Ld33/t0;->x:I

    const/4 v7, 0x0

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v6, :cond_22

    if-eq v6, v10, :cond_21

    if-ne v6, v9, :cond_20

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto/16 :goto_1f

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_15

    :cond_22
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v10, v5, Ld33/t0;->x:I

    const-wide/16 v10, 0x12c

    invoke-static {v10, v11, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_23

    goto/16 :goto_20

    :cond_23
    :goto_15
    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v6

    iget-object v10, v6, Lb23/k;->c:Lb23/e;

    iget-object v11, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->y:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    iget-boolean v13, v5, Ld33/t0;->y:Z

    if-eqz v10, :cond_24

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    const-string v10, "[setVideoSubscriptions] #sfu; #track; useDefaults: "

    invoke-static {v10, v13}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v6, v12, v11, v10, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_24
    const/16 v6, 0xa

    if-eqz v13, :cond_29

    iget-object v10, v5, Ld33/t0;->E:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    check-cast v10, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_25
    :goto_16
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_26

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lt23/g2;

    iget-object v13, v13, Lt23/g2;->a:Ljava/lang/String;

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_25

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_26
    const/4 v1, 0x5

    invoke-static {v11, v1}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_27
    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lt23/g2;

    iget-object v12, v11, Lt23/g2;->l:Lec3/h2;

    iget-object v13, v11, Lt23/g2;->y:Lec3/h2;

    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-eqz v12, :cond_28

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v12

    move-object v15, v12

    check-cast v15, Ljava/lang/String;

    sget-object v17, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    sget-object v18, Le33/v0;->Q:Lstream/video/sfu/models/VideoDimension;

    iget-object v12, v11, Lt23/g2;->a:Ljava/lang/String;

    new-instance v14, Lstream/video/sfu/signal/TrackSubscriptionDetails;

    const/16 v20, 0x10

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v12

    invoke-direct/range {v14 .. v21}, Lstream/video/sfu/signal/TrackSubscriptionDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/VideoDimension;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_28
    iget-object v12, v11, Lt23/g2;->s:Lec3/h2;

    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    if-eqz v12, :cond_27

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    sget-object v16, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    sget-object v17, Le33/v0;->Q:Lstream/video/sfu/models/VideoDimension;

    iget-object v15, v11, Lt23/g2;->a:Ljava/lang/String;

    new-instance v13, Lstream/video/sfu/signal/TrackSubscriptionDetails;

    const/16 v19, 0x10

    const/16 v20, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lstream/video/sfu/signal/TrackSubscriptionDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/VideoDimension;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_29
    iget-object v10, v5, Ld33/t0;->F:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v0, Le33/v0;->F:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v10, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v10, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_18
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_2e

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lt23/g2;

    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v11}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_2d

    invoke-virtual {v14}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_2c

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v15, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v14, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2a

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v3, v13, Lt23/g2;->a:Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    const-string v9, " subscribing "

    const-string v10, " to : "

    const-string v11, "[visibleTracks] "

    invoke-static {v11, v1, v9, v3, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v6, v4, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2a
    iget-object v0, v13, Lt23/g2;->y:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_2b
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v9, 0x2

    goto/16 :goto_18

    :cond_2c
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_2d
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_2e
    invoke-static {v12}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v10

    :cond_2f
    iget-object v1, v5, Ld33/t0;->G:Ljava/lang/Object;

    check-cast v1, Lbi/p;

    iget-object v1, v1, Lbi/p;->a:Ljava/util/LinkedHashMap;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_19
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_32

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lstream/video/sfu/signal/TrackSubscriptionDetails;

    invoke-virtual {v11}, Lstream/video/sfu/signal/TrackSubscriptionDetails;->getSession_id()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_31

    const-string v12, "all"

    invoke-virtual {v1, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_30

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_30
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_31
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_32
    invoke-static {v9, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v6, 0x10

    if-ge v1, v6, :cond_33

    move v1, v6

    :cond_33
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_34

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lstream/video/sfu/signal/TrackSubscriptionDetails;

    invoke-virtual {v10}, Lstream/video/sfu/signal/TrackSubscriptionDetails;->getSession_id()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Lstream/video/sfu/signal/TrackSubscriptionDetails;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v10

    new-instance v12, Ll83/k;

    invoke-direct {v12, v11, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v6, v12, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1a

    :cond_34
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v9

    if-ne v1, v9, :cond_39

    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_35

    goto :goto_1b

    :cond_35
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_36
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_37

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll83/k;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lstream/video/sfu/signal/TrackSubscriptionDetails;

    invoke-virtual {v2, v9}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lstream/video/sfu/signal/TrackSubscriptionDetails;

    if-eqz v9, :cond_39

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_36

    goto :goto_1d

    :cond_37
    :goto_1b
    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_38

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[setVideoSubscriptions] Skipped \u2014 subscriptions unchanged."

    invoke-interface {v0, v3, v2, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_38
    :goto_1c
    move-object v4, v8

    goto/16 :goto_20

    :cond_39
    :goto_1d
    iget-object v10, v0, Le33/v0;->w:Ljava/lang/String;

    new-instance v11, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lstream/video/sfu/signal/TrackSubscriptionDetails;

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1e

    :cond_3a
    new-instance v9, Lstream/video/sfu/signal/UpdateSubscriptionsRequest;

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Lstream/video/sfu/signal/UpdateSubscriptionsRequest;-><init>(Ljava/lang/String;Ljava/util/List;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v6, v1, Lb23/k;->c:Lb23/e;

    iget-object v10, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3b

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v6

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "[setVideoSubscriptions] #sfu; #track; subscriptions: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " -> "

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v11, v10, v6, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3b
    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v6, v1, Lb23/k;->c:Lb23/e;

    iget-object v10, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3c

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v12, "[setVideoSubscriptions] #sfu; #track; request: "

    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v11, v10, v6, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3c
    iget-object v1, v0, Le33/v0;->x:Lio/getstream/video/android/core/api/SignalServerService;

    const/4 v6, 0x2

    iput v6, v5, Ld33/t0;->x:I

    invoke-interface {v1, v9, v5}, Lio/getstream/video/android/core/api/SignalServerService;->updateSubscriptions(Lstream/video/sfu/signal/UpdateSubscriptionsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_3d

    goto :goto_20

    :cond_3d
    :goto_1f
    check-cast v1, Lstream/video/sfu/signal/UpdateSubscriptionsResponse;

    invoke-virtual {v1}, Lstream/video/sfu/signal/UpdateSubscriptionsResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    if-nez v1, :cond_38

    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3e

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[setVideoSubscriptions] #sfu; #track; no error, remembering subscriptions"

    invoke-interface {v0, v6, v4, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3e
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    goto/16 :goto_1c

    :goto_20
    return-object v4

    :pswitch_3
    iget-object v0, v5, Ld33/t0;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Ld33/t0;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_40

    if-ne v2, v3, :cond_3f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_21

    :cond_3f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_40
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, La30/u;

    iget-object v4, v5, Ld33/t0;->E:Ljava/lang/Object;

    check-cast v4, Lstream/video/sfu/models/TrackType;

    iget-boolean v6, v5, Ld33/t0;->y:Z

    const/4 v7, 0x0

    invoke-direct {v2, v0, v4, v6, v7}, La30/u;-><init>(Ld33/h1;Lstream/video/sfu/models/TrackType;ZLq83/d;)V

    new-instance v4, Lec3/s1;

    invoke-direct {v4, v2}, Lec3/s1;-><init>(Lc93/m;)V

    sget-object v2, Lt33/a;->b:Lkc3/d;

    invoke-static {v4, v2}, Lec3/v;->F(Lec3/l;Lq83/j;)Lec3/l;

    move-result-object v2

    new-instance v4, Ld33/s0;

    iget-object v6, v5, Ld33/t0;->F:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    iget-object v8, v5, Ld33/t0;->G:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-direct {v4, v6, v0, v8, v7}, Ld33/s0;-><init>(Ljava/util/Map;Ld33/h1;Ljava/lang/String;Lq83/d;)V

    new-instance v0, Lec3/a0;

    invoke-direct {v0, v2, v4}, Lec3/a0;-><init>(Lec3/l;Lc93/n;)V

    iput v3, v5, Ld33/t0;->x:I

    invoke-static {v0, v5}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_41

    goto :goto_22

    :cond_41
    :goto_21
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_22
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
