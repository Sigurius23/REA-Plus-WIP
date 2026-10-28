.class public final La1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, La1/f;->w:I

    iput-object p1, p0, La1/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v11, p2

    iget v1, v0, La1/f;->w:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    iget-object v6, v0, La1/f;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ln20/j;

    check-cast v6, Lq0/y;

    const/16 v3, 0x10

    invoke-direct {v1, v2, v6, v5, v3}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v11}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_0

    move-object v12, v1

    :cond_0
    return-object v12

    :pswitch_0
    check-cast v6, Lh0/z3;

    iget-boolean v1, v6, Lh0/z3;->S:Z

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lg20/p;

    const/16 v3, 0xd

    invoke-direct {v1, v2, v6, v5, v3}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v11}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_2

    move-object v12, v1

    :cond_2
    :goto_0
    return-object v12

    :pswitch_1
    new-instance v1, Lv2/c;

    invoke-direct {v1}, Lv2/c;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/f0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    check-cast v6, Lh0/f1;

    invoke-static {v6}, La3/g;->o(La3/n;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v7

    const-wide/16 v8, 0x0

    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/node/NodeCoordinator;->S(J)J

    move-result-wide v7

    iput-wide v7, v5, Lkotlin/jvm/internal/f0;->w:J

    new-instance v7, Ll;

    const/16 v8, 0x1a

    invoke-direct {v7, v8, v6, v1}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Lep1/g;

    const/16 v9, 0x13

    invoke-direct {v8, v1, v2, v6, v9}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v9, Lh0/a1;

    invoke-direct {v9, v6, v3}, Lh0/a1;-><init>(Lh0/f1;I)V

    move-object v3, v7

    new-instance v7, Lh0/a1;

    invoke-direct {v7, v6, v4}, Lh0/a1;-><init>(Lh0/f1;I)V

    move-object v4, v8

    new-instance v8, La01/d;

    const/16 v10, 0x12

    invoke-direct {v8, v6, v5, v1, v10}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v1, La30/q;

    move-object v5, v4

    move-object v4, v3

    move-object v3, v6

    move-object v6, v9

    const/4 v9, 0x0

    const/4 v10, 0x2

    invoke-direct/range {v1 .. v10}, La30/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v11}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_3

    move-object v12, v1

    :cond_3
    return-object v12

    :pswitch_2
    new-instance v1, Lf1/m0;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-direct {v1, v3, v6, v5}, Lf1/m0;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    move-object/from16 v2, p1

    check-cast v2, Lu2/h0;

    invoke-virtual {v2, v1, v11}, Lu2/h0;->X0(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_4

    move-object v12, v1

    :cond_4
    return-object v12

    :pswitch_3
    check-cast v6, Lf0/c0;

    iget-boolean v1, v6, Lf0/h;->V:Z

    const/4 v5, 0x0

    if-eqz v1, :cond_5

    iget-object v1, v6, Lf0/c0;->k0:Lc93/a;

    if-eqz v1, :cond_5

    new-instance v1, Lf0/a0;

    invoke-direct {v1, v6, v3}, Lf0/a0;-><init>(Lf0/c0;I)V

    goto :goto_1

    :cond_5
    move-object v1, v5

    :goto_1
    new-instance v3, Lf0/b0;

    invoke-direct {v3, v6, v5}, Lf0/b0;-><init>(Lf0/c0;Lq83/d;)V

    new-instance v2, Lf0/a0;

    invoke-direct {v2, v6, v4}, Lf0/a0;-><init>(Lf0/c0;I)V

    sget-object v4, Lh0/o3;->a:Lh0/d3;

    move-object v4, v1

    new-instance v1, La30/s;

    const/4 v7, 0x0

    const/4 v8, 0x2

    move-object v6, v2

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v8}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v11}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_6

    goto :goto_2

    :cond_6
    move-object v1, v12

    :goto_2
    if-ne v1, v2, :cond_7

    move-object v12, v1

    :cond_7
    return-object v12

    :pswitch_4
    new-instance v1, Lbc3/r1;

    check-cast v6, Lc1/a;

    invoke-direct {v1, v6, v5, v4}, Lbc3/r1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v1, v11}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_8

    move-object v12, v1

    :cond_8
    return-object v12

    :pswitch_5
    new-instance v13, La1/e;

    move-object v15, v6

    check-cast v15, La1/i;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/4 v14, 0x1

    const-class v16, La1/i;

    const-string v17, "tryShowContextMenu"

    const-string v18, "tryShowContextMenu-k-4lQ0M(J)V"

    invoke-direct/range {v13 .. v20}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v1, Lf1/m0;

    invoke-direct {v1, v4, v13, v5}, Lf1/m0;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v2, v1, v11}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_9

    goto :goto_3

    :cond_9
    move-object v1, v12

    :goto_3
    if-ne v1, v2, :cond_a

    move-object v12, v1

    :cond_a
    return-object v12

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
