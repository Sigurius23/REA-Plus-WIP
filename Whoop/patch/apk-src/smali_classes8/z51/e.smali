.class public final synthetic Lz51/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll83/k;

.field public final synthetic F:F

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Lz51/k;

.field public final synthetic I:F

.field public final synthetic J:Lcom/whoop/design/util/TextResource;

.field public final synthetic K:F

.field public final synthetic L:Lcom/whoop/design/util/TextResource;

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic N:Ljava/lang/Object;

.field public final synthetic O:Z

.field public final synthetic P:Lc93/a;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(ZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;FLcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lz51/a;Lz51/a;ZLc93/a;III)V
    .locals 1

    .line 1
    move/from16 v0, p18

    iput v0, p0, Lz51/e;->w:I

    iput-boolean p1, p0, Lz51/e;->x:Z

    iput-boolean p2, p0, Lz51/e;->y:Z

    iput p3, p0, Lz51/e;->z:F

    iput-object p4, p0, Lz51/e;->E:Ll83/k;

    iput p5, p0, Lz51/e;->F:F

    iput-object p6, p0, Lz51/e;->G:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lz51/e;->H:Lz51/k;

    iput p8, p0, Lz51/e;->I:F

    iput-object p9, p0, Lz51/e;->J:Lcom/whoop/design/util/TextResource;

    iput p10, p0, Lz51/e;->K:F

    iput-object p11, p0, Lz51/e;->L:Lcom/whoop/design/util/TextResource;

    iput-object p12, p0, Lz51/e;->M:Ljava/lang/Object;

    iput-object p13, p0, Lz51/e;->N:Ljava/lang/Object;

    iput-boolean p14, p0, Lz51/e;->O:Z

    move-object/from16 p1, p15

    iput-object p1, p0, Lz51/e;->P:Lc93/a;

    move/from16 p1, p16

    iput p1, p0, Lz51/e;->Q:I

    move/from16 p1, p17

    iput p1, p0, Lz51/e;->R:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLc93/a;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lz51/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lz51/e;->x:Z

    iput-boolean p2, p0, Lz51/e;->y:Z

    iput p3, p0, Lz51/e;->z:F

    iput-object p4, p0, Lz51/e;->E:Ll83/k;

    iput p5, p0, Lz51/e;->F:F

    iput-object p6, p0, Lz51/e;->G:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lz51/e;->H:Lz51/k;

    iput-object p8, p0, Lz51/e;->J:Lcom/whoop/design/util/TextResource;

    iput p9, p0, Lz51/e;->I:F

    iput-object p10, p0, Lz51/e;->L:Lcom/whoop/design/util/TextResource;

    iput-object p11, p0, Lz51/e;->M:Ljava/lang/Object;

    iput p12, p0, Lz51/e;->K:F

    iput-object p13, p0, Lz51/e;->N:Ljava/lang/Object;

    iput-boolean p14, p0, Lz51/e;->O:Z

    move-object/from16 p1, p15

    iput-object p1, p0, Lz51/e;->P:Lc93/a;

    move/from16 p1, p16

    iput p1, p0, Lz51/e;->Q:I

    move/from16 p1, p17

    iput p1, p0, Lz51/e;->R:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, Lz51/e;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lz51/e;->M:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lz51/e;->N:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Lcom/whoop/design/util/TextResource;

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v20

    iget-boolean v2, v0, Lz51/e;->x:Z

    iget-boolean v3, v0, Lz51/e;->y:Z

    iget v4, v0, Lz51/e;->z:F

    iget-object v5, v0, Lz51/e;->E:Ll83/k;

    iget v6, v0, Lz51/e;->F:F

    iget-object v7, v0, Lz51/e;->G:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lz51/e;->H:Lz51/k;

    iget-object v9, v0, Lz51/e;->J:Lcom/whoop/design/util/TextResource;

    iget v10, v0, Lz51/e;->I:F

    iget-object v11, v0, Lz51/e;->L:Lcom/whoop/design/util/TextResource;

    iget v13, v0, Lz51/e;->K:F

    iget-boolean v15, v0, Lz51/e;->O:Z

    iget-object v1, v0, Lz51/e;->P:Lc93/a;

    move-object/from16 v16, v1

    iget v1, v0, Lz51/e;->Q:I

    move/from16 v17, v1

    iget v1, v0, Lz51/e;->R:I

    move/from16 v18, v1

    invoke-static/range {v2 .. v20}, Lz51/h;->i(ZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lz51/e;->M:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Lz51/a;

    iget-object v1, v0, Lz51/e;->N:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Lz51/a;

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v20

    iget-boolean v2, v0, Lz51/e;->x:Z

    iget-boolean v3, v0, Lz51/e;->y:Z

    iget v4, v0, Lz51/e;->z:F

    iget-object v5, v0, Lz51/e;->E:Ll83/k;

    iget v6, v0, Lz51/e;->F:F

    iget-object v7, v0, Lz51/e;->G:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lz51/e;->H:Lz51/k;

    iget v9, v0, Lz51/e;->I:F

    iget-object v10, v0, Lz51/e;->J:Lcom/whoop/design/util/TextResource;

    iget v11, v0, Lz51/e;->K:F

    iget-object v12, v0, Lz51/e;->L:Lcom/whoop/design/util/TextResource;

    iget-boolean v15, v0, Lz51/e;->O:Z

    iget-object v1, v0, Lz51/e;->P:Lc93/a;

    move-object/from16 v16, v1

    iget v1, v0, Lz51/e;->Q:I

    move/from16 v17, v1

    iget v1, v0, Lz51/e;->R:I

    move/from16 v18, v1

    invoke-static/range {v2 .. v20}, Lz51/h;->o(ZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;FLcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lz51/a;Lz51/a;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    iget-object v1, v0, Lz51/e;->M:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Lz51/a;

    iget-object v1, v0, Lz51/e;->N:Ljava/lang/Object;

    move-object v14, v1

    check-cast v14, Lz51/a;

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v20

    iget-boolean v2, v0, Lz51/e;->x:Z

    iget-boolean v3, v0, Lz51/e;->y:Z

    iget v4, v0, Lz51/e;->z:F

    iget-object v5, v0, Lz51/e;->E:Ll83/k;

    iget v6, v0, Lz51/e;->F:F

    iget-object v7, v0, Lz51/e;->G:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lz51/e;->H:Lz51/k;

    iget v9, v0, Lz51/e;->I:F

    iget-object v10, v0, Lz51/e;->J:Lcom/whoop/design/util/TextResource;

    iget v11, v0, Lz51/e;->K:F

    iget-object v12, v0, Lz51/e;->L:Lcom/whoop/design/util/TextResource;

    iget-boolean v15, v0, Lz51/e;->O:Z

    iget-object v1, v0, Lz51/e;->P:Lc93/a;

    move-object/from16 v16, v1

    iget v1, v0, Lz51/e;->Q:I

    move/from16 v17, v1

    iget v1, v0, Lz51/e;->R:I

    move/from16 v18, v1

    invoke-static/range {v2 .. v20}, Lz51/h;->f(ZZFLl83/k;FLcom/whoop/design/util/TextResource;Lz51/k;FLcom/whoop/design/util/TextResource;FLcom/whoop/design/util/TextResource;Lz51/a;Lz51/a;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
