.class public final Ldv0/b$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv0/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic x:Ldv0/b;


# direct methods
.method public constructor <init>(Lec3/m;Ldv0/b;)V
    .locals 0

    iput-object p2, p0, Ldv0/b$e$a;->x:Ldv0/b;

    iput-object p1, p0, Ldv0/b$e$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Ldv0/b$e$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ldv0/b$e$a$a;

    iget v3, v2, Ldv0/b$e$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ldv0/b$e$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Ldv0/b$e$a$a;

    invoke-direct {v2, v0, v1}, Ldv0/b$e$a$a;-><init>(Ldv0/b$e$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Ldv0/b$e$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Ldv0/b$e$a$a;->x:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-eq v4, v6, :cond_4

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v2, Ldv0/b$e$a$a;->I:Ljava/lang/Object;

    check-cast v3, Ldk0/j;

    goto :goto_1

    :cond_3
    iget-object v3, v2, Ldv0/b$e$a$a;->I:Ljava/lang/Object;

    check-cast v3, Ldk0/k;

    :cond_4
    :goto_1
    iget-object v3, v2, Ldv0/b$e$a$a;->H:Ljava/lang/Object;

    check-cast v3, Llt0/c;

    iget-object v3, v2, Ldv0/b$e$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v3, v2, Ldv0/b$e$a$a;->F:Ljava/lang/Object;

    check-cast v3, Llt0/k;

    iget-object v2, v2, Ldv0/b$e$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Ldv0/b$e$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Llt0/k;

    invoke-virtual {v4}, Llt0/k;->b()Llt0/c;

    move-result-object v4

    iget-object v9, v0, Ldv0/b$e$a;->x:Ldv0/b;

    invoke-static {v9}, Ldv0/b;->j(Ldv0/b;)Lyu0/f;

    move-result-object v9

    sget-object v10, Lyu0/f;->HR:Lyu0/f;

    const/16 v11, 0x3e8

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-ne v9, v10, :cond_6

    invoke-virtual {v4}, Llt0/c;->L()Llt0/c$a;

    move-result-object v9

    sget-object v10, Llt0/c$a;->REALTIME_DATA:Llt0/c$a;

    if-ne v9, v10, :cond_6

    move-object v5, v4

    check-cast v5, Ldk0/k;

    new-instance v14, Ldv0/e;

    invoke-virtual {v4}, Llt0/c;->N()B

    move-result v4

    int-to-long v6, v4

    invoke-virtual {v5}, Ldk0/k;->Q()Lfk2/a;

    move-result-object v4

    invoke-virtual {v4}, Lfk2/a;->j()J

    move-result-wide v4

    long-to-double v4, v4

    int-to-double v9, v11

    div-double v18, v4, v9

    const/16 v17, 0x0

    move-wide v15, v6

    invoke-direct/range {v14 .. v19}, Ldv0/e;-><init>(JID)V

    iput-object v12, v2, Ldv0/b$e$a$a;->z:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->G:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->I:Ljava/lang/Object;

    iput v13, v2, Ldv0/b$e$a$a;->J:I

    iput v8, v2, Ldv0/b$e$a$a;->x:I

    invoke-interface {v1, v14, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    goto/16 :goto_2

    :cond_6
    instance-of v8, v4, Llt0/b;

    const/16 v9, 0x2b

    if-eqz v8, :cond_7

    move-object v10, v4

    check-cast v10, Llt0/b;

    invoke-virtual {v10}, Llt0/b;->Z()I

    move-result v14

    if-ne v14, v9, :cond_7

    invoke-virtual {v10}, Llt0/b;->U()S

    move-result v10

    const/16 v14, 0x11

    if-ne v10, v14, :cond_7

    iget-object v10, v0, Ldv0/b$e$a;->x:Ldv0/b;

    invoke-static {v10}, Ldv0/b;->j(Ldv0/b;)Lyu0/f;

    move-result-object v10

    sget-object v14, Lyu0/f;->FILTERED_ECG:Lyu0/f;

    if-ne v10, v14, :cond_7

    check-cast v4, Ldk0/j;

    new-instance v14, Ldv0/e;

    invoke-virtual {v4}, Ldk0/j;->Q()J

    move-result-wide v15

    invoke-virtual {v4}, Llt0/b;->Y()Lfk2/a;

    move-result-object v4

    invoke-virtual {v4}, Lfk2/a;->j()J

    move-result-wide v4

    long-to-double v4, v4

    int-to-double v8, v11

    div-double v18, v4, v8

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Ldv0/e;-><init>(JID)V

    iput-object v12, v2, Ldv0/b$e$a$a;->z:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->G:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->H:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->I:Ljava/lang/Object;

    iput v13, v2, Ldv0/b$e$a$a;->J:I

    iput v7, v2, Ldv0/b$e$a$a;->x:I

    invoke-interface {v1, v14, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    goto/16 :goto_2

    :cond_7
    if-eqz v8, :cond_a

    invoke-virtual {v4}, Llt0/c;->L()Llt0/c$a;

    move-result-object v7

    sget-object v10, Llt0/c$a;->REALTIME_RAW_DATA:Llt0/c$a;

    if-ne v7, v10, :cond_a

    iget-object v7, v0, Ldv0/b$e$a;->x:Ldv0/b;

    invoke-static {v7}, Ldv0/b;->j(Ldv0/b;)Lyu0/f;

    move-result-object v7

    sget-object v10, Lyu0/f;->R10:Lyu0/f;

    if-ne v7, v10, :cond_8

    move-object v7, v4

    check-cast v7, Llt0/b;

    invoke-virtual {v7}, Llt0/b;->U()S

    move-result v7

    const/16 v10, 0xa

    if-eq v7, v10, :cond_9

    :cond_8
    iget-object v7, v0, Ldv0/b$e$a;->x:Ldv0/b;

    invoke-static {v7}, Ldv0/b;->j(Ldv0/b;)Lyu0/f;

    move-result-object v7

    sget-object v10, Lyu0/f;->R11:Lyu0/f;

    if-ne v7, v10, :cond_a

    move-object v7, v4

    check-cast v7, Llt0/b;

    invoke-virtual {v7}, Llt0/b;->U()S

    move-result v7

    const/16 v10, 0xb

    if-ne v7, v10, :cond_a

    :cond_9
    new-instance v14, Ldv0/e;

    check-cast v4, Llt0/b;

    invoke-virtual {v4}, Llt0/b;->Q()J

    move-result-wide v15

    invoke-virtual {v4}, Llt0/b;->Y()Lfk2/a;

    move-result-object v4

    invoke-virtual {v4}, Lfk2/a;->j()J

    move-result-wide v4

    long-to-double v4, v4

    int-to-double v7, v11

    div-double v18, v4, v7

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Ldv0/e;-><init>(JID)V

    iput-object v12, v2, Ldv0/b$e$a$a;->z:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->G:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->H:Ljava/lang/Object;

    iput v13, v2, Ldv0/b$e$a$a;->J:I

    iput v6, v2, Ldv0/b$e$a$a;->x:I

    invoke-interface {v1, v14, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    goto :goto_2

    :cond_a
    if-eqz v8, :cond_d

    check-cast v4, Llt0/b;

    invoke-virtual {v4}, Llt0/b;->Z()I

    move-result v6

    if-ne v6, v9, :cond_d

    iget-object v6, v0, Ldv0/b$e$a;->x:Ldv0/b;

    invoke-static {v6}, Ldv0/b;->j(Ldv0/b;)Lyu0/f;

    move-result-object v6

    sget-object v7, Lyu0/f;->IMU:Lyu0/f;

    if-ne v6, v7, :cond_b

    invoke-virtual {v4}, Llt0/b;->U()S

    move-result v6

    const/16 v7, 0x15

    if-eq v6, v7, :cond_c

    :cond_b
    iget-object v6, v0, Ldv0/b$e$a;->x:Ldv0/b;

    invoke-static {v6}, Ldv0/b;->j(Ldv0/b;)Lyu0/f;

    move-result-object v6

    sget-object v7, Lyu0/f;->R20:Lyu0/f;

    if-ne v6, v7, :cond_d

    invoke-virtual {v4}, Llt0/b;->U()S

    move-result v6

    const/16 v7, 0x14

    if-ne v6, v7, :cond_d

    :cond_c
    new-instance v14, Ldv0/e;

    invoke-virtual {v4}, Llt0/b;->Q()J

    move-result-wide v15

    invoke-virtual {v4}, Llt0/b;->Y()Lfk2/a;

    move-result-object v4

    invoke-virtual {v4}, Lfk2/a;->j()J

    move-result-wide v6

    long-to-double v6, v6

    int-to-double v8, v11

    div-double v18, v6, v8

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Ldv0/e;-><init>(JID)V

    iput-object v12, v2, Ldv0/b$e$a$a;->z:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->E:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->F:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->G:Ljava/lang/Object;

    iput-object v12, v2, Ldv0/b$e$a$a;->H:Ljava/lang/Object;

    iput v13, v2, Ldv0/b$e$a$a;->J:I

    iput v5, v2, Ldv0/b$e$a$a;->x:I

    invoke-interface {v1, v14, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    :goto_2
    return-object v3

    :cond_d
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
