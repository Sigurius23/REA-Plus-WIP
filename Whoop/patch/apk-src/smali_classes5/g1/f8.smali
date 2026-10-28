.class public final synthetic Lg1/f8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:Z

.field public final synthetic L:Lj0/i;

.field public final synthetic M:Ll0/k1;

.field public final synthetic N:Li2/a1;

.field public final synthetic O:Lg1/e8;

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic R:Ljava/lang/Object;

.field public final synthetic S:Lc93/m;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lq3/g0;


# direct methods
.method public synthetic constructor <init>(Lg1/b9;Ljava/lang/String;Lc93/m;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Li2/a1;Lg1/e8;Lc93/m;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lg1/f8;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/f8;->R:Ljava/lang/Object;

    iput-object p2, p0, Lg1/f8;->x:Ljava/lang/String;

    iput-object p3, p0, Lg1/f8;->y:Lc93/m;

    iput-object p4, p0, Lg1/f8;->z:Lq3/g0;

    iput-object p5, p0, Lg1/f8;->E:Lc93/m;

    iput-object p6, p0, Lg1/f8;->F:Lc93/m;

    iput-object p7, p0, Lg1/f8;->G:Lc93/m;

    iput-object p8, p0, Lg1/f8;->H:Lc93/m;

    iput-boolean p9, p0, Lg1/f8;->I:Z

    iput-boolean p10, p0, Lg1/f8;->J:Z

    iput-boolean p11, p0, Lg1/f8;->K:Z

    iput-object p12, p0, Lg1/f8;->L:Lj0/i;

    iput-object p13, p0, Lg1/f8;->M:Ll0/k1;

    iput-object p14, p0, Lg1/f8;->N:Li2/a1;

    move-object/from16 p1, p15

    iput-object p1, p0, Lg1/f8;->O:Lg1/e8;

    move-object/from16 p1, p16

    iput-object p1, p0, Lg1/f8;->S:Lc93/m;

    move/from16 p1, p17

    iput p1, p0, Lg1/f8;->P:I

    move/from16 p1, p18

    iput p1, p0, Lg1/f8;->Q:I

    return-void
.end method

.method public synthetic constructor <init>(Lg1/i8;Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/e8;Ll0/k1;Lx1/b;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lg1/f8;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/f8;->R:Ljava/lang/Object;

    iput-object p2, p0, Lg1/f8;->x:Ljava/lang/String;

    iput-object p3, p0, Lg1/f8;->y:Lc93/m;

    iput-boolean p4, p0, Lg1/f8;->I:Z

    iput-boolean p5, p0, Lg1/f8;->J:Z

    iput-object p6, p0, Lg1/f8;->z:Lq3/g0;

    iput-object p7, p0, Lg1/f8;->L:Lj0/i;

    iput-boolean p8, p0, Lg1/f8;->K:Z

    iput-object p9, p0, Lg1/f8;->E:Lc93/m;

    iput-object p10, p0, Lg1/f8;->F:Lc93/m;

    iput-object p11, p0, Lg1/f8;->G:Lc93/m;

    iput-object p12, p0, Lg1/f8;->H:Lc93/m;

    iput-object p13, p0, Lg1/f8;->N:Li2/a1;

    iput-object p14, p0, Lg1/f8;->O:Lg1/e8;

    move-object/from16 p1, p15

    iput-object p1, p0, Lg1/f8;->M:Ll0/k1;

    move-object/from16 p1, p16

    iput-object p1, p0, Lg1/f8;->S:Lc93/m;

    move/from16 p1, p17

    iput p1, p0, Lg1/f8;->P:I

    move/from16 p1, p18

    iput p1, p0, Lg1/f8;->Q:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lg1/f8;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lg1/f8;->R:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lg1/b9;

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    iget v1, v0, Lg1/f8;->P:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget v1, v0, Lg1/f8;->Q:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v20

    iget-object v3, v0, Lg1/f8;->x:Ljava/lang/String;

    iget-object v4, v0, Lg1/f8;->y:Lc93/m;

    iget-object v5, v0, Lg1/f8;->z:Lq3/g0;

    iget-object v6, v0, Lg1/f8;->E:Lc93/m;

    iget-object v7, v0, Lg1/f8;->F:Lc93/m;

    iget-object v8, v0, Lg1/f8;->G:Lc93/m;

    iget-object v9, v0, Lg1/f8;->H:Lc93/m;

    iget-boolean v10, v0, Lg1/f8;->I:Z

    iget-boolean v11, v0, Lg1/f8;->J:Z

    iget-boolean v12, v0, Lg1/f8;->K:Z

    iget-object v13, v0, Lg1/f8;->L:Lj0/i;

    iget-object v14, v0, Lg1/f8;->M:Ll0/k1;

    iget-object v15, v0, Lg1/f8;->N:Li2/a1;

    iget-object v1, v0, Lg1/f8;->O:Lg1/e8;

    move-object/from16 v16, v1

    iget-object v1, v0, Lg1/f8;->S:Lc93/m;

    move-object/from16 v17, v1

    invoke-static/range {v2 .. v20}, Lg1/p8;->a(Lg1/b9;Ljava/lang/String;Lc93/m;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Li2/a1;Lg1/e8;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lg1/f8;->R:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lg1/i8;

    iget-object v1, v0, Lg1/f8;->S:Lc93/m;

    move-object/from16 v17, v1

    check-cast v17, Lx1/b;

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lg1/f8;->P:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget-object v3, v0, Lg1/f8;->x:Ljava/lang/String;

    iget-object v4, v0, Lg1/f8;->y:Lc93/m;

    iget-boolean v5, v0, Lg1/f8;->I:Z

    iget-boolean v6, v0, Lg1/f8;->J:Z

    iget-object v7, v0, Lg1/f8;->z:Lq3/g0;

    iget-object v8, v0, Lg1/f8;->L:Lj0/i;

    iget-boolean v9, v0, Lg1/f8;->K:Z

    iget-object v10, v0, Lg1/f8;->E:Lc93/m;

    iget-object v11, v0, Lg1/f8;->F:Lc93/m;

    iget-object v12, v0, Lg1/f8;->G:Lc93/m;

    iget-object v13, v0, Lg1/f8;->H:Lc93/m;

    iget-object v14, v0, Lg1/f8;->N:Li2/a1;

    iget-object v15, v0, Lg1/f8;->O:Lg1/e8;

    iget-object v1, v0, Lg1/f8;->M:Ll0/k1;

    move-object/from16 v16, v1

    iget v1, v0, Lg1/f8;->Q:I

    move/from16 v20, v1

    invoke-virtual/range {v2 .. v20}, Lg1/i8;->b(Ljava/lang/String;Lc93/m;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/e8;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
