.class public final synthetic Li40/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Lj0/i;

.field public final synthetic I:Lc93/m;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic N:Ljava/lang/Object;

.field public final synthetic O:Ljava/lang/Object;

.field public final synthetic P:Ljava/lang/Object;

.field public final synthetic Q:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lx1/b;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/l1;Li2/a1;Lg1/e8;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Li40/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li40/b;->L:Ljava/lang/Object;

    iput-object p2, p0, Li40/b;->M:Ljava/lang/Object;

    iput-object p3, p0, Li40/b;->N:Ljava/lang/Object;

    iput-object p4, p0, Li40/b;->x:Lc93/m;

    iput-object p5, p0, Li40/b;->y:Lc93/m;

    iput-object p6, p0, Li40/b;->z:Lc93/m;

    iput-object p7, p0, Li40/b;->I:Lc93/m;

    iput-boolean p8, p0, Li40/b;->E:Z

    iput-boolean p9, p0, Li40/b;->F:Z

    iput-boolean p10, p0, Li40/b;->G:Z

    iput-object p11, p0, Li40/b;->H:Lj0/i;

    iput-object p12, p0, Li40/b;->O:Ljava/lang/Object;

    iput-object p13, p0, Li40/b;->P:Ljava/lang/Object;

    iput-object p14, p0, Li40/b;->Q:Ljava/lang/Object;

    move/from16 p1, p15

    iput p1, p0, Li40/b;->J:I

    move/from16 p1, p16

    iput p1, p0, Li40/b;->K:I

    return-void
.end method

.method public synthetic constructor <init>(Lm1/m0;Ljava/lang/CharSequence;Lc93/m;Ll1/k4;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Ll1/e4;Lc93/m;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Li40/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li40/b;->L:Ljava/lang/Object;

    iput-object p2, p0, Li40/b;->M:Ljava/lang/Object;

    iput-object p3, p0, Li40/b;->x:Lc93/m;

    iput-object p4, p0, Li40/b;->N:Ljava/lang/Object;

    iput-object p5, p0, Li40/b;->O:Ljava/lang/Object;

    iput-object p6, p0, Li40/b;->y:Lc93/m;

    iput-object p7, p0, Li40/b;->z:Lc93/m;

    iput-boolean p8, p0, Li40/b;->E:Z

    iput-boolean p9, p0, Li40/b;->F:Z

    iput-boolean p10, p0, Li40/b;->G:Z

    iput-object p11, p0, Li40/b;->H:Lj0/i;

    iput-object p12, p0, Li40/b;->P:Ljava/lang/Object;

    iput-object p13, p0, Li40/b;->Q:Ljava/lang/Object;

    iput-object p14, p0, Li40/b;->I:Lc93/m;

    move/from16 p1, p15

    iput p1, p0, Li40/b;->J:I

    move/from16 p1, p16

    iput p1, p0, Li40/b;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Li40/b;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Li40/b;->L:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lm1/m0;

    iget-object v1, v0, Li40/b;->M:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    iget-object v1, v0, Li40/b;->N:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ll1/k4;

    iget-object v1, v0, Li40/b;->O:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function3;

    iget-object v1, v0, Li40/b;->P:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Ll0/k1;

    iget-object v1, v0, Li40/b;->Q:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Ll1/e4;

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Li40/b;->J:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v17

    iget v1, v0, Li40/b;->K:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v18

    iget-object v4, v0, Li40/b;->x:Lc93/m;

    iget-object v7, v0, Li40/b;->y:Lc93/m;

    iget-object v8, v0, Li40/b;->z:Lc93/m;

    iget-boolean v9, v0, Li40/b;->E:Z

    iget-boolean v10, v0, Li40/b;->F:Z

    iget-boolean v11, v0, Li40/b;->G:Z

    iget-object v12, v0, Li40/b;->H:Lj0/i;

    iget-object v15, v0, Li40/b;->I:Lc93/m;

    invoke-static/range {v2 .. v18}, Lm1/l0;->a(Lm1/m0;Ljava/lang/CharSequence;Lc93/m;Ll1/k4;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Ll1/e4;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Li40/b;->L:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    iget-object v1, v0, Li40/b;->M:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lx1/b;

    iget-object v1, v0, Li40/b;->N:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lq3/g0;

    iget-object v1, v0, Li40/b;->O:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Ll0/l1;

    iget-object v1, v0, Li40/b;->P:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Li2/a1;

    iget-object v1, v0, Li40/b;->Q:Ljava/lang/Object;

    move-object v15, v1

    check-cast v15, Lg1/e8;

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Li40/b;->J:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v17

    iget v1, v0, Li40/b;->K:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v18

    iget-object v5, v0, Li40/b;->x:Lc93/m;

    iget-object v6, v0, Li40/b;->y:Lc93/m;

    iget-object v7, v0, Li40/b;->z:Lc93/m;

    iget-object v8, v0, Li40/b;->I:Lc93/m;

    iget-boolean v9, v0, Li40/b;->E:Z

    iget-boolean v10, v0, Li40/b;->F:Z

    iget-boolean v11, v0, Li40/b;->G:Z

    iget-object v12, v0, Li40/b;->H:Lj0/i;

    invoke-static/range {v2 .. v18}, Lvp/c;->f(Ljava/lang/String;Lx1/b;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/l1;Li2/a1;Lg1/e8;Landroidx/compose/runtime/Composer;II)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
