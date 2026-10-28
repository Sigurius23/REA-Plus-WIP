.class public final Ln20/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg40/z;Lc93/a;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ln20/t;->a:I

    const-string v0, "argsSupplier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ln20/t;->b:Ljava/lang/Object;

    .line 12
    iput-object p2, p0, Ln20/t;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ln20/t;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln20/t;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Ln20/t;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsz/t;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Ln20/t;->a:I

    .line 4
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    .line 5
    sget-object v0, Lkc3/d;->w:Lkc3/d;

    .line 6
    const-string v1, "args"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "workContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Ln20/t;->b:Ljava/lang/Object;

    .line 9
    iput-object v0, p0, Ln20/t;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget v2, v0, Ln20/t;->a:I

    const-string v3, "extras"

    iget-object v4, v0, Ln20/t;->b:Ljava/lang/Object;

    iget-object v5, v0, Ln20/t;->c:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch v2, :pswitch_data_0

    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v2

    new-instance v3, Lq/f;

    new-instance v6, Lt9/c0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-direct {v3, v6, v2}, Lq/f;-><init>(Lt9/c0;Landroid/app/Application;)V

    iget-object v2, v3, Lq/f;->z:Ljava/lang/Object;

    check-cast v2, Ln20/a;

    invoke-virtual {v2}, Ln20/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lty/c;

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v10

    check-cast v5, Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lt20/v;

    move-object v11, v4

    check-cast v11, Lg40/z;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v2, Lty/c;->x:Ljava/lang/Object;

    check-cast v1, Lq/f;

    new-instance v6, Lt20/w;

    iget-object v2, v1, Lq/f;->x:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Landroid/app/Application;

    iget-object v1, v1, Lq/f;->E:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lb10/c;

    invoke-direct/range {v6 .. v11}, Lt20/w;-><init>(Lt20/v;Landroid/app/Application;Lb10/c;Landroidx/lifecycle/k1;Lg40/z;)V

    return-object v6

    :pswitch_0
    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v8

    move-object v2, v4

    check-cast v2, Lsz/t;

    invoke-virtual {v2}, Lsz/t;->b()Lsz/k;

    move-result-object v3

    iget-object v3, v3, Lsz/k;->w:Lsz/g;

    sget-object v6, Lux/y;->y:Lux/y;

    if-nez v6, :cond_2

    new-instance v6, Lux/x;

    invoke-direct {v6, v8}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v6, v6, Lux/x;->a:Landroid/content/SharedPreferences;

    const-string v7, "key_publishable_key"

    const/4 v9, 0x0

    invoke-interface {v6, v7, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_0

    new-instance v10, Lux/y;

    const-string v11, "key_account_id"

    invoke-interface {v6, v11, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v10, v7, v6}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v10

    goto :goto_0

    :cond_0
    move-object v6, v9

    :goto_0
    if-eqz v6, :cond_1

    sput-object v6, Lux/y;->y:Lux/y;

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_1
    iget-object v7, v6, Lux/y;->w:Ljava/lang/String;

    iget-object v6, v6, Lux/y;->x:Ljava/lang/String;

    const-string v9, "GooglePayLauncher"

    invoke-static {v9}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v13

    new-instance v15, Lb10/b;

    invoke-direct {v15, v8, v13, v7}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)V

    new-instance v20, Lb10/z0;

    new-instance v9, Lar0/a;

    const/16 v10, 0xb

    invoke-direct {v9, v7, v10}, Lar0/a;-><init>(Ljava/lang/String;I)V

    sget-object v11, Lb10/c1;->a:Lb10/b1;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v11, v10

    sget-object v10, Lb10/b1;->b:Lb10/d;

    move-object v12, v5

    check-cast v12, Lq83/j;

    const/16 v16, 0x0

    const v17, 0xf788

    sget-object v14, Lqy/e;->b:Lqy/d;

    move/from16 v18, v11

    move-object v11, v14

    const/4 v14, 0x0

    move-object/from16 p1, v2

    move-object v0, v7

    move/from16 v2, v18

    move-object/from16 v7, v20

    invoke-direct/range {v7 .. v17}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lqy/d;Lq83/j;Ljava/util/Set;Lyy/j;Lb10/b;Ljava/util/Set;I)V

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    const-string v9, "getApplicationContext(...)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lb20/f;

    new-instance v10, Lyy/j;

    sget-object v12, Lbc3/q0;->a:Lkc3/e;

    sget-object v12, Lkc3/d;->w:Lkc3/d;

    invoke-static {v12}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-direct {v10, v11, v12}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v12, Lb10/b;

    new-instance v14, Lal0/f;

    const/4 v15, 0x1

    invoke-direct {v14, v7, v15}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v12, v7, v13, v14}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-direct {v9, v10, v12}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    invoke-virtual/range {p1 .. p1}, Lsz/t;->b()Lsz/k;

    move-result-object v7

    iget-object v7, v7, Lsz/k;->w:Lsz/g;

    invoke-virtual/range {p1 .. p1}, Lsz/t;->b()Lsz/k;

    move-result-object v10

    iget-object v10, v10, Lsz/k;->E:Lsz/j;

    const-string v12, "<this>"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Lux/j;

    iget-boolean v13, v10, Lsz/j;->w:Z

    iget-object v14, v10, Lsz/j;->x:Lsz/i;

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    if-eqz v14, :cond_4

    if-ne v14, v15, :cond_3

    sget-object v14, Lux/i;->y:Lux/i;

    goto :goto_2

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    sget-object v14, Lux/i;->x:Lux/i;

    :goto_2
    iget-boolean v10, v10, Lsz/j;->y:Z

    invoke-direct {v12, v13, v14, v10}, Lux/j;-><init>(ZLux/i;Z)V

    invoke-virtual/range {p1 .. p1}, Lsz/t;->b()Lsz/k;

    move-result-object v10

    iget-boolean v10, v10, Lsz/k;->F:Z

    invoke-virtual/range {p1 .. p1}, Lsz/t;->b()Lsz/k;

    move-result-object v13

    iget-boolean v13, v13, Lsz/k;->G:Z

    new-instance v23, Lsz/d;

    sget-object v28, Lux/f;->w:Lux/f;

    sget-object v29, Lux/h;->w:Lux/h;

    move-object v14, v11

    move-object/from16 v15, v28

    move-object/from16 v16, v29

    move v11, v10

    move-object v10, v12

    move v12, v13

    move-object v13, v9

    move-object v9, v7

    move-object/from16 v7, v23

    invoke-direct/range {v7 .. v16}, Lsz/d;-><init>(Landroid/content/Context;Lsz/g;Lux/j;ZZLb20/f;Lqy/d;Lux/a;Lux/b;)V

    new-instance v16, Lsz/z;

    const-string v7, "environment"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ld0/o2;

    const/4 v9, 0x2

    invoke-direct {v7, v9}, Ld0/o2;-><init>(I)V

    iget v3, v3, Lsz/g;->w:I

    invoke-virtual {v7, v3}, Ld0/o2;->o(I)V

    new-instance v11, Ldq/t;

    invoke-direct {v11, v7}, Ldq/t;-><init>(Ld0/o2;)V

    new-instance v17, Ldq/p;

    sget-object v10, Ldq/u;->a:Lcom/google/android/gms/common/api/f;

    sget-object v12, Lcom/google/android/gms/common/api/g;->c:Lcom/google/android/gms/common/api/g;

    const/4 v9, 0x0

    move-object/from16 v7, v17

    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/g;)V

    new-instance v3, Lyy/f;

    const/4 v7, 0x4

    invoke-direct {v3, v0, v6, v7}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object/from16 v19, v4

    check-cast v19, Lsz/t;

    new-instance v21, Lux/s0;

    new-instance v9, Lar0/a;

    invoke-direct {v9, v0, v2}, Lar0/a;-><init>(Ljava/lang/String;I)V

    move-object v11, v5

    check-cast v11, Lq83/j;

    const/16 v12, 0x1e0

    move-object/from16 v10, v20

    move-object/from16 v7, v21

    invoke-direct/range {v7 .. v12}, Lux/s0;-><init>(Landroid/content/Context;Lc93/a;Lb10/z0;Lq83/j;I)V

    new-instance v22, Lux/q;

    new-instance v2, Lcd/a;

    invoke-direct {v2, v0, v6}, Lcd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lsz/t;->b()Lsz/k;

    move-result-object v0

    iget-object v0, v0, Lsz/k;->x:Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->JAPAN:Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x1

    invoke-static {v0, v4, v6}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v26

    invoke-virtual/range {p1 .. p1}, Lsz/t;->b()Lsz/k;

    move-result-object v0

    iget-object v0, v0, Lsz/k;->H:Ljava/util/List;

    const-string v4, "additionalEnabledNetworks"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v27, v0

    move-object/from16 v25, v2

    move-object/from16 v24, v22

    invoke-direct/range {v24 .. v29}, Lux/q;-><init>(Lcd/a;ZLjava/util/List;Lux/a;Lux/b;)V

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v24

    move-object/from16 v26, v5

    check-cast v26, Lq83/j;

    move-object/from16 v18, v3

    move-object/from16 v25, v13

    invoke-direct/range {v16 .. v26}, Lsz/z;-><init>(Ldq/p;Lyy/f;Lsz/t;Lb10/z0;Lux/s0;Lux/q;Lsz/d;Landroidx/lifecycle/k1;Lb20/f;Lq83/j;)V

    return-object v16

    :pswitch_1
    new-instance v0, Ln20/u;

    invoke-static {v1}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object v2

    invoke-static {v1}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object v1

    check-cast v5, Ljava/lang/String;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v0, v2, v1, v5, v4}, Ln20/u;-><init>(Landroid/app/Application;Landroidx/lifecycle/k1;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
