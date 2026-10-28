.class public final synthetic Li20/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Li20/k0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li20/k0;->z:Ljava/lang/Object;

    iput-object p5, p0, Li20/k0;->E:Ljava/lang/Object;

    iput-wide p3, p0, Li20/k0;->y:J

    iput p1, p0, Li20/k0;->x:I

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;Ll83/e;II)V
    .locals 0

    .line 2
    iput p6, p0, Li20/k0;->w:I

    iput-wide p1, p0, Li20/k0;->y:J

    iput-object p3, p0, Li20/k0;->z:Ljava/lang/Object;

    iput-object p4, p0, Li20/k0;->E:Ljava/lang/Object;

    iput p5, p0, Li20/k0;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li20/v0;Ljava/lang/Integer;JI)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Li20/k0;->w:I

    sget-object v0, Li20/x0;->a:Lx1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li20/k0;->z:Ljava/lang/Object;

    iput-object p2, p0, Li20/k0;->E:Ljava/lang/Object;

    iput-wide p3, p0, Li20/k0;->y:J

    iput p5, p0, Li20/k0;->x:I

    return-void
.end method

.method public synthetic constructor <init>(Ll1/b0;ILandroidx/compose/ui/Modifier;JI)V
    .locals 0

    .line 4
    const/4 p6, 0x1

    iput p6, p0, Li20/k0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li20/k0;->z:Ljava/lang/Object;

    iput p2, p0, Li20/k0;->x:I

    iput-object p3, p0, Li20/k0;->E:Ljava/lang/Object;

    iput-wide p4, p0, Li20/k0;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Li20/k0;->w:I

    iget v2, v0, Li20/k0;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    iget-object v4, v0, Li20/k0;->E:Ljava/lang/Object;

    iget-object v5, v0, Li20/k0;->z:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object v8, v5

    check-cast v8, Lw11/c;

    move-object v9, v4

    check-cast v9, Lkotlin/jvm/functions/Function1;

    move-object/from16 v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-wide v6, v0, Li20/k0;->y:J

    iget v10, v0, Li20/k0;->x:I

    invoke-static/range {v6 .. v12}, Lw11/b;->f(JLw11/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object v9, v5

    check-cast v9, Lp6/u1;

    move-object v8, v4

    check-cast v8, Lc93/m;

    move-object/from16 v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 v1, v2, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v4

    iget-wide v5, v0, Li20/k0;->y:J

    invoke-static/range {v4 .. v9}, Lcom/squareup/wire/n;->f(IJLandroidx/compose/runtime/Composer;Lc93/m;Lp6/u1;)V

    return-object v3

    :pswitch_1
    move-object v12, v5

    check-cast v12, Lmk1/e;

    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function1;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-wide v10, v0, Li20/k0;->y:J

    iget v14, v0, Li20/k0;->x:I

    invoke-static/range {v10 .. v16}, Lmk1/c;->c(JLmk1/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    move-object v2, v5

    check-cast v2, Ljava/lang/String;

    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    move-object/from16 v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-wide v4, v0, Li20/k0;->y:J

    iget v6, v0, Li20/k0;->x:I

    invoke-static/range {v2 .. v8}, Lm03/d;->b(Ljava/lang/String;Ljava/lang/String;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    check-cast v5, Ll1/b0;

    move-object v7, v4

    check-cast v7, Landroidx/compose/ui/Modifier;

    move-object/from16 v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v1, 0xc31

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v10

    move-object v4, v5

    iget-wide v5, v0, Li20/k0;->y:J

    iget v8, v0, Li20/k0;->x:I

    invoke-virtual/range {v4 .. v10}, Ll1/b0;->b(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    return-object v3

    :pswitch_4
    move-object v11, v5

    check-cast v11, Li20/v0;

    move-object v12, v4

    check-cast v12, Ljava/lang/Integer;

    sget-object v1, Li20/x0;->a:Lx1/b;

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 v1, v2, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v16

    iget-wide v13, v0, Li20/k0;->y:J

    invoke-static/range {v11 .. v16}, Li20/l1;->f(Li20/v0;Ljava/lang/Integer;JLandroidx/compose/runtime/Composer;I)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
