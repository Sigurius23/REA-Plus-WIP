.class public final Le00/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic H:Ljava/lang/String;

.field public final synthetic I:Ljava/lang/String;

.field public final synthetic J:Ljava/lang/String;

.field public synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Enum;

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Le00/w;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Le00/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ly00/l0;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le00/o;->w:I

    .line 1
    iput-object p1, p0, Le00/o;->y:Le00/w;

    iput-object p2, p0, Le00/o;->z:Ljava/lang/String;

    iput-object p3, p0, Le00/o;->E:Ljava/lang/String;

    iput-object p4, p0, Le00/o;->F:Ljava/lang/String;

    iput-object p5, p0, Le00/o;->G:Ljava/lang/String;

    iput-object p6, p0, Le00/o;->H:Ljava/lang/String;

    iput-object p7, p0, Le00/o;->K:Ljava/lang/Object;

    iput-object p8, p0, Le00/o;->I:Ljava/lang/String;

    iput-object p9, p0, Le00/o;->L:Ljava/lang/Enum;

    iput-object p10, p0, Le00/o;->J:Ljava/lang/String;

    iput-object p11, p0, Le00/o;->M:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p12}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Le00/w;Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le00/o;->w:I

    .line 2
    iput-object p1, p0, Le00/o;->y:Le00/w;

    iput-object p2, p0, Le00/o;->z:Ljava/lang/String;

    iput-object p3, p0, Le00/o;->L:Ljava/lang/Enum;

    iput-object p4, p0, Le00/o;->E:Ljava/lang/String;

    iput-object p5, p0, Le00/o;->F:Ljava/lang/String;

    iput-object p6, p0, Le00/o;->G:Ljava/lang/String;

    iput-object p7, p0, Le00/o;->M:Ljava/lang/Object;

    iput-object p8, p0, Le00/o;->H:Ljava/lang/String;

    iput-object p9, p0, Le00/o;->I:Ljava/lang/String;

    iput-object p10, p0, Le00/o;->J:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p11}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 14

    iget v0, p0, Le00/o;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Le00/o;

    iget-object p1, p0, Le00/o;->K:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ljava/lang/Long;

    iget-object p1, p0, Le00/o;->L:Ljava/lang/Enum;

    move-object v10, p1

    check-cast v10, Ly00/l0;

    iget-object p1, p0, Le00/o;->M:Ljava/lang/Object;

    move-object v12, p1

    check-cast v12, Ljava/lang/String;

    iget-object v2, p0, Le00/o;->y:Le00/w;

    iget-object v3, p0, Le00/o;->z:Ljava/lang/String;

    iget-object v4, p0, Le00/o;->E:Ljava/lang/String;

    iget-object v5, p0, Le00/o;->F:Ljava/lang/String;

    iget-object v6, p0, Le00/o;->G:Ljava/lang/String;

    iget-object v7, p0, Le00/o;->H:Ljava/lang/String;

    iget-object v9, p0, Le00/o;->I:Ljava/lang/String;

    iget-object v11, p0, Le00/o;->J:Ljava/lang/String;

    move-object/from16 v13, p2

    invoke-direct/range {v1 .. v13}, Le00/o;-><init>(Le00/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ly00/l0;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object v1

    :pswitch_0
    new-instance v2, Le00/o;

    iget-object v0, p0, Le00/o;->L:Ljava/lang/Enum;

    move-object v5, v0

    check-cast v5, Ly00/c2;

    iget-object v0, p0, Le00/o;->M:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ljava/util/List;

    iget-object v11, p0, Le00/o;->I:Ljava/lang/String;

    iget-object v12, p0, Le00/o;->J:Ljava/lang/String;

    iget-object v3, p0, Le00/o;->y:Le00/w;

    iget-object v4, p0, Le00/o;->z:Ljava/lang/String;

    iget-object v6, p0, Le00/o;->E:Ljava/lang/String;

    iget-object v7, p0, Le00/o;->F:Ljava/lang/String;

    iget-object v8, p0, Le00/o;->G:Ljava/lang/String;

    iget-object v10, p0, Le00/o;->H:Ljava/lang/String;

    move-object/from16 v13, p2

    invoke-direct/range {v2 .. v13}, Le00/o;-><init>(Le00/w;Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v2, Le00/o;->K:Ljava/lang/Object;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le00/o;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Le00/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Le00/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v12, p0

    iget v0, v12, Le00/o;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v12, Le00/o;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v12, Le00/o;->y:Le00/w;

    iget-object v3, v1, Le00/w;->e:Lg30/g;

    iget-object v4, v1, Le00/w;->g:Ljava/util/Locale;

    iget-object v5, v1, Le00/w;->a:Lb10/d;

    iget-object v5, v5, Lb10/d;->w:Ljava/lang/String;

    new-instance v13, Ly00/k6;

    iget-object v6, v12, Le00/o;->K:Ljava/lang/Object;

    move-object/from16 v20, v6

    check-cast v20, Ljava/lang/Long;

    iget-object v6, v12, Le00/o;->L:Ljava/lang/Enum;

    move-object/from16 v23, v6

    check-cast v23, Ly00/l0;

    iget-object v6, v12, Le00/o;->M:Ljava/lang/Object;

    move-object/from16 v25, v6

    check-cast v25, Ljava/lang/String;

    iget-object v14, v12, Le00/o;->z:Ljava/lang/String;

    iget-object v15, v12, Le00/o;->E:Ljava/lang/String;

    iget-object v6, v12, Le00/o;->F:Ljava/lang/String;

    iget-object v7, v12, Le00/o;->G:Ljava/lang/String;

    iget-object v8, v12, Le00/o;->H:Ljava/lang/String;

    iget-object v9, v12, Le00/o;->I:Ljava/lang/String;

    iget-object v10, v12, Le00/o;->J:Ljava/lang/String;

    move-object/from16 v19, v4

    move-object/from16 v22, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move-object/from16 v21, v9

    move-object/from16 v24, v10

    invoke-direct/range {v13 .. v25}, Ly00/k6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ly00/l0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Le00/w;->b()Lyy/f;

    move-result-object v1

    iput v2, v12, Le00/o;->x:I

    invoke-virtual {v3, v13, v1, v12}, Lg30/g;->f(Ly00/k6;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_0
    new-instance v1, Ll83/n;

    invoke-direct {v1, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v13, Lr83/a;->w:Lr83/a;

    iget v0, v12, Le00/o;->x:I

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    if-ne v0, v1, :cond_3

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v12, Le00/o;->K:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v0, v12, Le00/o;->y:Le00/w;

    iget-object v2, v12, Le00/o;->z:Ljava/lang/String;

    iget-object v3, v12, Le00/o;->L:Ljava/lang/Enum;

    check-cast v3, Ly00/c2;

    move-object v4, v2

    move-object v2, v3

    iget-object v3, v12, Le00/o;->E:Ljava/lang/String;

    iget-object v5, v12, Le00/o;->F:Ljava/lang/String;

    iget-object v6, v12, Le00/o;->G:Ljava/lang/String;

    iget-object v7, v12, Le00/o;->M:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v9, v12, Le00/o;->H:Ljava/lang/String;

    iget-object v10, v12, Le00/o;->I:Ljava/lang/String;

    iget-object v11, v12, Le00/o;->J:Ljava/lang/String;

    :try_start_1
    iget-object v8, v0, Le00/w;->e:Lg30/g;

    iget-object v14, v0, Le00/w;->a:Lb10/d;

    iget-object v14, v14, Lb10/d;->w:Ljava/lang/String;

    invoke-virtual {v0}, Le00/w;->b()Lyy/f;

    move-result-object v0

    iput v1, v12, Le00/o;->x:I

    move-object v1, v8

    move-object v8, v0

    move-object v0, v1

    move-object v1, v4

    move-object v4, v14

    invoke-virtual/range {v0 .. v12}, Lg30/g;->e(Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lyy/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le00/o;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_5

    goto :goto_5

    :cond_5
    :goto_2
    check-cast v0, Lcom/stripe/android/model/ConsumerSessionLookup;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_4
    new-instance v13, Ll83/n;

    invoke-direct {v13, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_5
    return-object v13

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
