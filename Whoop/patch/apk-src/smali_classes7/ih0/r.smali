.class public final synthetic Lih0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lnl0/f;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lsl0/y0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lc93/m;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Lih0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/r;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lih0/r;->x:Z

    iput-object p3, p0, Lih0/r;->y:Ljava/lang/Object;

    iput-object p4, p0, Lih0/r;->z:Ljava/lang/Object;

    iput-object p5, p0, Lih0/r;->F:Ljava/lang/Object;

    iput-object p6, p0, Lih0/r;->G:Ljava/lang/Object;

    iput-object p7, p0, Lih0/r;->H:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Ljava/util/concurrent/atomic/AtomicReference;ZLkotlin/jvm/functions/Function1;Lsl0/v1;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lih0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/r;->G:Ljava/lang/Object;

    iput-object p2, p0, Lih0/r;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lih0/r;->x:Z

    iput-object p4, p0, Lih0/r;->y:Ljava/lang/Object;

    iput-object p5, p0, Lih0/r;->E:Ljava/lang/Object;

    iput-object p6, p0, Lih0/r;->F:Ljava/lang/Object;

    iput-object p7, p0, Lih0/r;->H:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Lah0/c;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lp1/c1;Lz1/s;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lih0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lih0/r;->x:Z

    iput-object p2, p0, Lih0/r;->y:Ljava/lang/Object;

    iput-object p3, p0, Lih0/r;->E:Ljava/lang/Object;

    iput-object p4, p0, Lih0/r;->F:Ljava/lang/Object;

    iput-object p5, p0, Lih0/r;->z:Ljava/lang/Object;

    iput-object p6, p0, Lih0/r;->G:Ljava/lang/Object;

    iput-object p7, p0, Lih0/r;->H:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLl1/w3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Lbc3/c0;)V
    .locals 1

    .line 4
    const/4 v0, 0x1

    iput v0, p0, Lih0/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lih0/r;->x:Z

    iput-object p2, p0, Lih0/r;->y:Ljava/lang/Object;

    iput-object p3, p0, Lih0/r;->z:Ljava/lang/Object;

    iput-object p4, p0, Lih0/r;->E:Ljava/lang/Object;

    iput-object p5, p0, Lih0/r;->F:Ljava/lang/Object;

    iput-object p6, p0, Lih0/r;->G:Ljava/lang/Object;

    iput-object p7, p0, Lih0/r;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lih0/r;->w:I

    iget-object v2, v0, Lih0/r;->H:Ljava/lang/Object;

    iget-object v3, v0, Lih0/r;->G:Ljava/lang/Object;

    iget-object v4, v0, Lih0/r;->F:Ljava/lang/Object;

    iget-object v5, v0, Lih0/r;->z:Ljava/lang/Object;

    iget-object v6, v0, Lih0/r;->y:Ljava/lang/Object;

    iget-object v7, v0, Lih0/r;->E:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object v8, v7

    check-cast v8, Lnl0/f;

    move-object v10, v6

    check-cast v10, Lkotlin/jvm/functions/Function1;

    move-object v11, v5

    check-cast v11, Lkotlin/jvm/functions/Function1;

    move-object v12, v4

    check-cast v12, Lsl0/y0;

    move-object v13, v3

    check-cast v13, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object v14, v2

    check-cast v14, Lc93/m;

    move-object/from16 v15, p1

    check-cast v15, Ln0/q;

    iget-boolean v9, v0, Lih0/r;->x:Z

    invoke-static/range {v8 .. v15}, Lsl0/r3;->a(Lnl0/f;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lsl0/y0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lc93/m;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v3, Lp1/c1;

    check-cast v5, Ljava/util/concurrent/atomic/AtomicReference;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lsl0/v1;

    check-cast v4, Lp1/c1;

    move-object v8, v2

    check-cast v8, Lp1/c1;

    move-object/from16 v9, p1

    check-cast v9, Ln0/q;

    move-object v2, v3

    move-object v3, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v4

    iget-boolean v4, v0, Lih0/r;->x:Z

    invoke-static/range {v2 .. v9}, Lsl0/u1;->a(Lp1/c1;Ljava/util/concurrent/atomic/AtomicReference;ZLkotlin/jvm/functions/Function1;Lsl0/v1;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    check-cast v6, Ll1/w3;

    check-cast v5, Ljava/lang/String;

    check-cast v7, Ljava/lang/String;

    check-cast v4, Ljava/lang/String;

    check-cast v3, Lc93/a;

    check-cast v2, Lbc3/c0;

    move-object/from16 v1, p1

    check-cast v1, Li3/z;

    iget-boolean v8, v0, Lih0/r;->x:Z

    if-eqz v8, :cond_1

    new-instance v8, Liy0/a;

    const/16 v9, 0x17

    invoke-direct {v8, v3, v9}, Liy0/a;-><init>(Lc93/a;I)V

    sget-object v3, Li3/w;->a:[Lj93/z;

    sget-object v3, Li3/k;->u:Li3/y;

    new-instance v9, Li3/a;

    invoke-direct {v9, v5, v8}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast v1, Li3/l;

    invoke-virtual {v1, v3, v9}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    invoke-virtual {v6}, Ll1/w3;->c()Ll1/x3;

    move-result-object v3

    sget-object v5, Ll1/x3;->y:Ll1/x3;

    if-ne v3, v5, :cond_0

    new-instance v3, Lim1/a0;

    const/16 v4, 0x12

    invoke-direct {v3, v6, v2, v6, v4}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object v2, Li3/k;->s:Li3/y;

    new-instance v4, Li3/a;

    invoke-direct {v4, v7, v3}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {v1, v2, v4}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v3, v6, Ll1/w3;->e:Lm1/g;

    invoke-virtual {v3}, Lm1/g;->d()Lm1/b0;

    move-result-object v3

    iget-object v3, v3, Lm1/b0;->a:Ljava/util/Map;

    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Ll01/q;

    const/4 v5, 0x1

    invoke-direct {v3, v5, v6, v2}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Li3/k;->t:Li3/y;

    new-instance v5, Li3/a;

    invoke-direct {v5, v4, v3}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {v1, v2, v5}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_2
    check-cast v6, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lah0/c;

    check-cast v4, Ljava/util/Set;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    check-cast v3, Lp1/c1;

    move-object v8, v2

    check-cast v8, Lz1/s;

    move-object/from16 v9, p1

    check-cast v9, Ljava/lang/String;

    iget-boolean v2, v0, Lih0/r;->x:Z

    move-object/from16 v16, v7

    move-object v7, v3

    move-object v3, v6

    move-object v6, v5

    move-object v5, v4

    move-object/from16 v4, v16

    invoke-static/range {v2 .. v9}, Lih0/e0;->B(ZLkotlin/jvm/functions/Function1;Lah0/c;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lp1/c1;Lz1/s;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
