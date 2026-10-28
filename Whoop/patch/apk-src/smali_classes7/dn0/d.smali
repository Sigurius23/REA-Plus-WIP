.class public final synthetic Ldn0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Ly81/e;

.field public final synthetic G:Lqy0/g;

.field public final synthetic H:Ly81/e;

.field public final synthetic I:Ly81/e;

.field public final synthetic J:F

.field public final synthetic K:Z

.field public final synthetic L:Z

.field public final synthetic M:Ly81/e;

.field public final synthetic N:Ly81/e;

.field public final synthetic O:Ly81/e;

.field public final synthetic P:Ljava/lang/Float;

.field public final synthetic Q:F

.field public final synthetic R:Z

.field public final synthetic S:Lc93/a;

.field public final synthetic T:I

.field public final synthetic U:I

.field public final synthetic V:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Ly81/e;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lqy0/g;Ly81/e;Ly81/e;FZZLy81/e;Ly81/e;Ly81/e;Ljava/lang/Float;FZLc93/a;IIII)V
    .locals 1

    move/from16 v0, p22

    iput v0, p0, Ldn0/d;->w:I

    iput-object p1, p0, Ldn0/d;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ldn0/d;->y:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Ldn0/d;->z:Ly81/e;

    iput-object p4, p0, Ldn0/d;->E:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Ldn0/d;->F:Ly81/e;

    iput-object p6, p0, Ldn0/d;->G:Lqy0/g;

    iput-object p7, p0, Ldn0/d;->H:Ly81/e;

    iput-object p8, p0, Ldn0/d;->I:Ly81/e;

    iput p9, p0, Ldn0/d;->J:F

    iput-boolean p10, p0, Ldn0/d;->K:Z

    iput-boolean p11, p0, Ldn0/d;->L:Z

    iput-object p12, p0, Ldn0/d;->M:Ly81/e;

    iput-object p13, p0, Ldn0/d;->N:Ly81/e;

    iput-object p14, p0, Ldn0/d;->O:Ly81/e;

    move-object/from16 p1, p15

    iput-object p1, p0, Ldn0/d;->P:Ljava/lang/Float;

    move/from16 p1, p16

    iput p1, p0, Ldn0/d;->Q:F

    move/from16 p1, p17

    iput-boolean p1, p0, Ldn0/d;->R:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Ldn0/d;->S:Lc93/a;

    move/from16 p1, p19

    iput p1, p0, Ldn0/d;->T:I

    move/from16 p1, p20

    iput p1, p0, Ldn0/d;->U:I

    move/from16 p1, p21

    iput p1, p0, Ldn0/d;->V:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    iget v1, v0, Ldn0/d;->w:I

    move-object/from16 v23, p1

    check-cast v23, Landroidx/compose/runtime/Composer;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v24

    iget-object v2, v0, Ldn0/d;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Ldn0/d;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Ldn0/d;->z:Ly81/e;

    iget-object v5, v0, Ldn0/d;->E:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Ldn0/d;->F:Ly81/e;

    iget-object v7, v0, Ldn0/d;->G:Lqy0/g;

    iget-object v8, v0, Ldn0/d;->H:Ly81/e;

    iget-object v9, v0, Ldn0/d;->I:Ly81/e;

    iget v10, v0, Ldn0/d;->J:F

    iget-boolean v11, v0, Ldn0/d;->K:Z

    iget-boolean v12, v0, Ldn0/d;->L:Z

    iget-object v13, v0, Ldn0/d;->M:Ly81/e;

    iget-object v14, v0, Ldn0/d;->N:Ly81/e;

    iget-object v15, v0, Ldn0/d;->O:Ly81/e;

    iget-object v1, v0, Ldn0/d;->P:Ljava/lang/Float;

    move-object/from16 v16, v1

    iget v1, v0, Ldn0/d;->Q:F

    move/from16 v17, v1

    iget-boolean v1, v0, Ldn0/d;->R:Z

    move/from16 v18, v1

    iget-object v1, v0, Ldn0/d;->S:Lc93/a;

    move-object/from16 v19, v1

    iget v1, v0, Ldn0/d;->T:I

    move/from16 v20, v1

    iget v1, v0, Ldn0/d;->U:I

    move/from16 v21, v1

    iget v1, v0, Ldn0/d;->V:I

    move/from16 v22, v1

    invoke-static/range {v2 .. v24}, Lxo1/b;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lqy0/g;Ly81/e;Ly81/e;FZZLy81/e;Ly81/e;Ly81/e;Ljava/lang/Float;FZLc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v24

    iget-object v2, v0, Ldn0/d;->x:Landroidx/compose/ui/Modifier;

    iget-object v3, v0, Ldn0/d;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Ldn0/d;->z:Ly81/e;

    iget-object v5, v0, Ldn0/d;->E:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Ldn0/d;->F:Ly81/e;

    iget-object v7, v0, Ldn0/d;->G:Lqy0/g;

    iget-object v8, v0, Ldn0/d;->H:Ly81/e;

    iget-object v9, v0, Ldn0/d;->I:Ly81/e;

    iget v10, v0, Ldn0/d;->J:F

    iget-boolean v11, v0, Ldn0/d;->K:Z

    iget-boolean v12, v0, Ldn0/d;->L:Z

    iget-object v13, v0, Ldn0/d;->M:Ly81/e;

    iget-object v14, v0, Ldn0/d;->N:Ly81/e;

    iget-object v15, v0, Ldn0/d;->O:Ly81/e;

    iget-object v1, v0, Ldn0/d;->P:Ljava/lang/Float;

    move-object/from16 v16, v1

    iget v1, v0, Ldn0/d;->Q:F

    move/from16 v17, v1

    iget-boolean v1, v0, Ldn0/d;->R:Z

    move/from16 v18, v1

    iget-object v1, v0, Ldn0/d;->S:Lc93/a;

    move-object/from16 v19, v1

    iget v1, v0, Ldn0/d;->T:I

    move/from16 v20, v1

    iget v1, v0, Ldn0/d;->U:I

    move/from16 v21, v1

    iget v1, v0, Ldn0/d;->V:I

    move/from16 v22, v1

    invoke-static/range {v2 .. v24}, Ldn0/h;->h(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lqy0/g;Ly81/e;Ly81/e;FZZLy81/e;Ly81/e;Ly81/e;Ljava/lang/Float;FZLc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
