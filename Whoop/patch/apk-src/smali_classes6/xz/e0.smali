.class public final Lxz/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb00/a;

.field public final b:Le00/w;

.field public final c:Lt40/f;

.field public final d:Lb20/f;

.field public final e:Lwz/g0;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lb00/a;Le00/w;Lt40/f;Lb20/f;Lwz/g0;Ljava/lang/String;)V
    .locals 1

    const-string v0, "linkGate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrityRequestManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxz/e0;->a:Lb00/a;

    iput-object p2, p0, Lxz/e0;->b:Le00/w;

    iput-object p3, p0, Lxz/e0;->c:Lt40/f;

    iput-object p4, p0, Lxz/e0;->d:Lb20/f;

    iput-object p5, p0, Lxz/e0;->e:Lwz/g0;

    iput-object p6, p0, Lxz/e0;->f:Ljava/lang/String;

    return-void
.end method

.method public static a(Lj00/e0;)Ly00/l0;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Ly00/l0;->K:Ly00/l0;

    return-object p0

    :pswitch_1
    sget-object p0, Ly00/l0;->J:Ly00/l0;

    return-object p0

    :pswitch_2
    sget-object p0, Ly00/l0;->I:Ly00/l0;

    return-object p0

    :pswitch_3
    sget-object p0, Ly00/l0;->H:Ly00/l0;

    return-object p0

    :pswitch_4
    sget-object p0, Ly00/l0;->G:Ly00/l0;

    return-object p0

    :pswitch_5
    sget-object p0, Ly00/l0;->F:Ly00/l0;

    return-object p0

    :pswitch_6
    sget-object p0, Ly00/l0;->E:Ly00/l0;

    return-object p0

    :pswitch_7
    sget-object p0, Ly00/l0;->z:Ly00/l0;

    return-object p0

    :pswitch_8
    sget-object p0, Ly00/l0;->y:Ly00/l0;

    return-object p0

    :pswitch_9
    sget-object p0, Ly00/l0;->x:Ly00/l0;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 10

    move-object/from16 v0, p7

    instance-of v1, v0, Lxz/z;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lxz/z;

    iget v2, v1, Lxz/z;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lxz/z;->y:I

    :goto_0
    move-object v8, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lxz/z;

    invoke-direct {v1, p0, v0}, Lxz/z;-><init>(Lxz/e0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v8, Lxz/z;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v8, Lxz/z;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object p1, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object p1, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    move v2, v4

    goto :goto_2

    :cond_4
    move v2, v0

    :goto_2
    if-eqz p3, :cond_5

    move v0, v4

    :cond_5
    if-nez v2, :cond_6

    if-nez v0, :cond_6

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Either email+emailSource, linkAuthIntentId, or linkAuthTokenClientSecret must be provided"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object v0, p0, Lxz/e0;->a:Lb00/a;

    invoke-virtual {v0}, Lb00/a;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    iput v4, v8, Lxz/z;->y:I

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v9, v8

    move-object/from16 v8, p6

    invoke-virtual/range {v2 .. v9}, Lxz/e0;->c(Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    return-object p1

    :cond_8
    iput v3, v8, Lxz/z;->y:I

    iget-object v2, p0, Lxz/e0;->b:Le00/w;

    move-object v3, p1

    move-object v4, p3

    move-object v6, p4

    move-object v5, p5

    move-object/from16 v7, p6

    invoke-virtual/range {v2 .. v8}, Le00/w;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    return-object p1
.end method

.method public final c(Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 14

    move-object/from16 v0, p7

    instance-of v1, v0, Lxz/a0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lxz/a0;

    iget v2, v1, Lxz/a0;->K:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lxz/a0;->K:I

    :goto_0
    move-object v12, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lxz/a0;

    invoke-direct {v1, p0, v0}, Lxz/a0;-><init>(Lxz/e0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v12, Lxz/a0;->I:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v12, Lxz/a0;->K:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v12, Lxz/a0;->x:Ljava/lang/String;

    iget-object v1, v12, Lxz/a0;->w:Lxz/e0;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v12, Lxz/a0;->H:Lxz/e0;

    iget-object v2, v12, Lxz/a0;->G:Ljava/util/List;

    check-cast v2, Ljava/util/List;

    iget-object v4, v12, Lxz/a0;->F:Ljava/lang/String;

    iget-object v5, v12, Lxz/a0;->E:Ljava/lang/String;

    iget-object v6, v12, Lxz/a0;->z:Ljava/lang/String;

    iget-object v7, v12, Lxz/a0;->y:Ly00/c2;

    iget-object v8, v12, Lxz/a0;->x:Ljava/lang/String;

    iget-object v9, v12, Lxz/a0;->w:Lxz/e0;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v10, v7

    move-object v7, v4

    move-object v4, v10

    move-object v10, v2

    move-object v13, v9

    move-object v9, v5

    move-object v5, v6

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v8

    move-object v1, v9

    goto/16 :goto_6

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, p0, Lxz/e0;->c:Lt40/f;

    iput-object p0, v12, Lxz/a0;->w:Lxz/e0;

    iput-object p1, v12, Lxz/a0;->x:Ljava/lang/String;

    move-object/from16 v2, p2

    iput-object v2, v12, Lxz/a0;->y:Ly00/c2;

    move-object/from16 v5, p3

    iput-object v5, v12, Lxz/a0;->z:Ljava/lang/String;

    move-object/from16 v6, p4

    iput-object v6, v12, Lxz/a0;->E:Ljava/lang/String;

    move-object/from16 v7, p5

    iput-object v7, v12, Lxz/a0;->F:Ljava/lang/String;

    move-object/from16 v8, p6

    check-cast v8, Ljava/util/List;

    iput-object v8, v12, Lxz/a0;->G:Ljava/util/List;

    iput-object p0, v12, Lxz/a0;->H:Lxz/e0;

    iput v4, v12, Lxz/a0;->K:I

    invoke-virtual {v0, v12}, Lt40/f;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    if-ne v0, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v13, p0

    move-object v8, p1

    move-object/from16 v10, p6

    move-object v4, v2

    move-object v9, v6

    move-object p1, v13

    :goto_2
    :try_start_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    iget-object v2, p1, Lxz/e0;->b:Le00/w;

    iget-object p1, p1, Lxz/e0;->f:Ljava/lang/String;

    iput-object v13, v12, Lxz/a0;->w:Lxz/e0;

    iput-object v8, v12, Lxz/a0;->x:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, v12, Lxz/a0;->y:Ly00/c2;

    iput-object v0, v12, Lxz/a0;->z:Ljava/lang/String;

    iput-object v0, v12, Lxz/a0;->E:Ljava/lang/String;

    iput-object v0, v12, Lxz/a0;->F:Ljava/lang/String;

    iput-object v0, v12, Lxz/a0;->G:Ljava/util/List;

    iput-object v0, v12, Lxz/a0;->H:Lxz/e0;

    iput v3, v12, Lxz/a0;->K:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    const/4 v11, 0x0

    move-object v3, v8

    move-object v8, v7

    move-object v7, p1

    :try_start_4
    invoke-virtual/range {v2 .. v12}, Le00/w;->n(Ljava/lang/String;Ly00/c2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v0, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object p1, v3

    move-object v1, v13

    :goto_4
    :try_start_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/model/ConsumerSessionLookup;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_7

    :catchall_2
    move-exception v0

    :goto_5
    move-object p1, v3

    move-object v1, v13

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v3, v8

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v1, p0

    :goto_6
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_7
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_7

    if-eqz p1, :cond_6

    const-string p1, "lookup"

    goto :goto_8

    :cond_6
    const-string p1, "lookupByAuthIntent"

    :goto_8
    invoke-virtual {v1, p1, v2}, Lxz/e0;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-object v0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p7

    instance-of v2, v0, Lxz/b0;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lxz/b0;

    iget v3, v2, Lxz/b0;->K:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxz/b0;->K:I

    :goto_0
    move-object v14, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lxz/b0;

    invoke-direct {v2, v1, v0}, Lxz/b0;-><init>(Lxz/e0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v14, Lxz/b0;->I:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v14, Lxz/b0;->K:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v14, Lxz/b0;->w:Lxz/e0;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v3, v14, Lxz/b0;->H:Lxz/e0;

    iget-object v5, v14, Lxz/b0;->G:Lj00/e0;

    iget-object v6, v14, Lxz/b0;->F:Ljava/lang/String;

    iget-object v7, v14, Lxz/b0;->E:Ljava/lang/String;

    iget-object v8, v14, Lxz/b0;->z:Ljava/lang/String;

    iget-object v9, v14, Lxz/b0;->y:Ljava/lang/String;

    iget-object v10, v14, Lxz/b0;->x:Ljava/lang/String;

    iget-object v11, v14, Lxz/b0;->w:Lxz/e0;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v15, v10

    move-object v10, v5

    move-object v5, v15

    move-object v15, v9

    move-object v9, v6

    move-object v6, v15

    move-object v15, v8

    move-object v8, v7

    move-object v7, v15

    move-object v15, v11

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v11

    goto/16 :goto_6

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, v1, Lxz/e0;->c:Lt40/f;

    iput-object v1, v14, Lxz/b0;->w:Lxz/e0;

    move-object/from16 v3, p1

    iput-object v3, v14, Lxz/b0;->x:Ljava/lang/String;

    move-object/from16 v6, p2

    iput-object v6, v14, Lxz/b0;->y:Ljava/lang/String;

    move-object/from16 v7, p3

    iput-object v7, v14, Lxz/b0;->z:Ljava/lang/String;

    move-object/from16 v8, p4

    iput-object v8, v14, Lxz/b0;->E:Ljava/lang/String;

    move-object/from16 v9, p5

    iput-object v9, v14, Lxz/b0;->F:Ljava/lang/String;

    move-object/from16 v10, p6

    iput-object v10, v14, Lxz/b0;->G:Lj00/e0;

    iput-object v1, v14, Lxz/b0;->H:Lxz/e0;

    iput v5, v14, Lxz/b0;->K:I

    invoke-virtual {v0, v14}, Lt40/f;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne v0, v2, :cond_4

    goto :goto_4

    :cond_4
    move-object v15, v1

    move-object v5, v3

    move-object v3, v15

    :goto_2
    :try_start_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    iget-object v0, v3, Lxz/e0;->b:Le00/w;

    iget-object v11, v3, Lxz/e0;->e:Lwz/g0;

    invoke-static {v10}, Lxz/e0;->a(Lj00/e0;)Ly00/l0;

    move-result-object v10

    iget-object v13, v3, Lxz/e0;->f:Ljava/lang/String;

    iget-object v3, v11, Lwz/g0;->w:Ly00/c8;

    const-string v4, "<this>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v4, v3, Ly00/l3;

    move-object/from16 p1, v0

    const/4 v0, 0x0

    if-eqz v4, :cond_5

    check-cast v3, Ly00/l3;

    iget-object v3, v3, Ly00/l3;->y:Ljava/lang/Long;

    goto :goto_3

    :cond_5
    move-object v3, v0

    :goto_3
    iget-object v4, v11, Lwz/g0;->w:Ly00/c8;

    invoke-static {v4}, Luf/c0;->P(Ly00/c8;)Ljava/lang/String;

    move-result-object v11

    iput-object v15, v14, Lxz/b0;->w:Lxz/e0;

    iput-object v0, v14, Lxz/b0;->x:Ljava/lang/String;

    iput-object v0, v14, Lxz/b0;->y:Ljava/lang/String;

    iput-object v0, v14, Lxz/b0;->z:Ljava/lang/String;

    iput-object v0, v14, Lxz/b0;->E:Ljava/lang/String;

    iput-object v0, v14, Lxz/b0;->F:Ljava/lang/String;

    iput-object v0, v14, Lxz/b0;->G:Lj00/e0;

    iput-object v0, v14, Lxz/b0;->H:Lxz/e0;

    const/4 v0, 0x2

    iput v0, v14, Lxz/b0;->K:I

    move-object v4, v9

    move-object v9, v10

    move-object v10, v3

    move-object/from16 v3, p1

    invoke-virtual/range {v3 .. v14}, Le00/w;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/l0;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v2, :cond_6

    :goto_4
    return-object v2

    :cond_6
    move-object v2, v15

    :goto_5
    :try_start_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Lcom/stripe/android/model/ConsumerSessionSignup;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object v2, v15

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v2, v1

    :goto_6
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_7
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_7

    const-string v4, "signup"

    invoke-virtual {v2, v4, v3}, Lxz/e0;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-object v0
.end method

.method public final e(Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lxz/c0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lxz/c0;

    iget v1, v0, Lxz/c0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxz/c0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxz/c0;

    invoke-direct {v0, p0, p3}, Lxz/c0;-><init>(Lxz/e0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lxz/c0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxz/c0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lxz/c0;->y:I

    iget-object p3, p0, Lxz/e0;->b:Le00/w;

    iget-object v2, p0, Lxz/e0;->f:Ljava/lang/String;

    invoke-virtual {p3, v2, p1, p2, v0}, Le00/w;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final f(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {p2}, Ls30/b;->p(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lb20/c;->N:Lb20/c;

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lcom/stripe/attestation/AttestationError;

    if-eqz v0, :cond_1

    sget-object v0, Lb20/c;->M:Lb20/c;

    :goto_0
    new-instance v1, Lcom/stripe/android/link/LinkEventException;

    invoke-direct {v1, p2}, Lcom/stripe/android/link/LinkEventException;-><init>(Ljava/lang/Throwable;)V

    const-string p2, "operation"

    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lxz/e0;->d:Lb20/f;

    invoke-virtual {p2, v0, v1, p1}, Lb20/f;->a(Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ls83/c;)Ljava/lang/Object;
    .locals 10

    move-object/from16 v0, p7

    instance-of v1, v0, Lxz/d0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lxz/d0;

    iget v2, v1, Lxz/d0;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lxz/d0;->y:I

    :goto_0
    move-object v9, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lxz/d0;

    invoke-direct {v1, p0, v0}, Lxz/d0;-><init>(Lxz/e0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v9, Lxz/d0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v9, Lxz/d0;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ll83/n;

    iget-object p1, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lxz/e0;->a:Lb00/a;

    invoke-virtual {v0}, Lb00/a;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    iput v4, v9, Lxz/d0;->y:I

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    invoke-virtual/range {v2 .. v9}, Lxz/e0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    return-object p1

    :cond_5
    invoke-static/range {p6 .. p6}, Lxz/e0;->a(Lj00/e0;)Ly00/l0;

    move-result-object v8

    iput v3, v9, Lxz/d0;->y:I

    iget-object v2, p0, Lxz/e0;->b:Le00/w;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v2 .. v9}, Le00/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/l0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method
