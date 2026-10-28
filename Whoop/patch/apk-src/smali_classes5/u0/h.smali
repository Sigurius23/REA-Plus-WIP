.class public final synthetic Lu0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ll3/v0;

.field public final synthetic G:Lu0/r0;

.field public final synthetic H:Lu0/q0;

.field public final synthetic I:Z

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic L:Lq3/g0;

.field public final synthetic M:Lkotlin/jvm/functions/Function1;

.field public final synthetic N:Lj0/i;

.field public final synthetic O:I

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic R:Ljava/lang/Object;

.field public final synthetic S:Li2/t;

.field public final synthetic T:Lkotlin/jvm/functions/Function3;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lkotlin/jvm/functions/Function3;IIII)V
    .locals 1

    move/from16 v0, p20

    iput v0, p0, Lu0/h;->w:I

    iput-object p1, p0, Lu0/h;->R:Ljava/lang/Object;

    iput-object p2, p0, Lu0/h;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lu0/h;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lu0/h;->z:Z

    iput-boolean p5, p0, Lu0/h;->E:Z

    iput-object p6, p0, Lu0/h;->F:Ll3/v0;

    iput-object p7, p0, Lu0/h;->G:Lu0/r0;

    iput-object p8, p0, Lu0/h;->H:Lu0/q0;

    iput-boolean p9, p0, Lu0/h;->I:Z

    iput p10, p0, Lu0/h;->J:I

    iput p11, p0, Lu0/h;->K:I

    iput-object p12, p0, Lu0/h;->L:Lq3/g0;

    iput-object p13, p0, Lu0/h;->M:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, Lu0/h;->N:Lj0/i;

    move-object/from16 p1, p15

    iput-object p1, p0, Lu0/h;->S:Li2/t;

    move-object/from16 p1, p16

    iput-object p1, p0, Lu0/h;->T:Lkotlin/jvm/functions/Function3;

    move/from16 p1, p17

    iput p1, p0, Lu0/h;->O:I

    move/from16 p1, p18

    iput p1, p0, Lu0/h;->P:I

    move/from16 p1, p19

    iput p1, p0, Lu0/h;->Q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lu0/h;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lu0/h;->R:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    iget-object v1, v0, Lu0/h;->T:Lkotlin/jvm/functions/Function3;

    move-object/from16 v17, v1

    check-cast v17, Lx1/b;

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lu0/h;->O:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget v1, v0, Lu0/h;->P:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v20

    iget-object v3, v0, Lu0/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lu0/h;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v5, v0, Lu0/h;->z:Z

    iget-boolean v6, v0, Lu0/h;->E:Z

    iget-object v7, v0, Lu0/h;->F:Ll3/v0;

    iget-object v8, v0, Lu0/h;->G:Lu0/r0;

    iget-object v9, v0, Lu0/h;->H:Lu0/q0;

    iget-boolean v10, v0, Lu0/h;->I:Z

    iget v11, v0, Lu0/h;->J:I

    iget v12, v0, Lu0/h;->K:I

    iget-object v13, v0, Lu0/h;->L:Lq3/g0;

    iget-object v14, v0, Lu0/h;->M:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lu0/h;->N:Lj0/i;

    iget-object v1, v0, Lu0/h;->S:Li2/t;

    move-object/from16 v16, v1

    iget v1, v0, Lu0/h;->Q:I

    move/from16 v21, v1

    invoke-static/range {v2 .. v21}, Lu0/i;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lu0/h;->R:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lq3/y;

    iget-object v1, v0, Lu0/h;->S:Li2/t;

    move-object/from16 v16, v1

    check-cast v16, Li2/c1;

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v0, Lu0/h;->O:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v19

    iget v1, v0, Lu0/h;->P:I

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v20

    iget-object v3, v0, Lu0/h;->x:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lu0/h;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v5, v0, Lu0/h;->z:Z

    iget-boolean v6, v0, Lu0/h;->E:Z

    iget-object v7, v0, Lu0/h;->F:Ll3/v0;

    iget-object v8, v0, Lu0/h;->G:Lu0/r0;

    iget-object v9, v0, Lu0/h;->H:Lu0/q0;

    iget-boolean v10, v0, Lu0/h;->I:Z

    iget v11, v0, Lu0/h;->J:I

    iget v12, v0, Lu0/h;->K:I

    iget-object v13, v0, Lu0/h;->L:Lq3/g0;

    iget-object v14, v0, Lu0/h;->M:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lu0/h;->N:Lj0/i;

    iget-object v1, v0, Lu0/h;->T:Lkotlin/jvm/functions/Function3;

    move-object/from16 v17, v1

    iget v1, v0, Lu0/h;->Q:I

    move/from16 v21, v1

    invoke-static/range {v2 .. v21}, Lu0/i;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/c1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
