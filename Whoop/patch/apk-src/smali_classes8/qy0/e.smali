.class public final synthetic Lqy0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly81/e;

.field public final synthetic F:Ly3/f;

.field public final synthetic G:Lqy0/g;

.field public final synthetic H:Ly81/e;

.field public final synthetic I:Ly81/e;

.field public final synthetic J:Ly81/e;

.field public final synthetic K:Z

.field public final synthetic L:Ljava/lang/Float;

.field public final synthetic M:Ly81/e;

.field public final synthetic N:Ly81/e;

.field public final synthetic O:F

.field public final synthetic P:Z

.field public final synthetic Q:F

.field public final synthetic R:Z

.field public final synthetic S:Z

.field public final synthetic T:Lc93/a;

.field public final synthetic U:I

.field public final synthetic V:I

.field public final synthetic W:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Ly81/e;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqy0/e;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lqy0/e;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lqy0/e;->y:Ly81/e;

    iput-object p4, p0, Lqy0/e;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lqy0/e;->E:Ly81/e;

    iput-object p6, p0, Lqy0/e;->F:Ly3/f;

    iput-object p7, p0, Lqy0/e;->G:Lqy0/g;

    iput-object p8, p0, Lqy0/e;->H:Ly81/e;

    iput-object p9, p0, Lqy0/e;->I:Ly81/e;

    iput-object p10, p0, Lqy0/e;->J:Ly81/e;

    iput-boolean p11, p0, Lqy0/e;->K:Z

    iput-object p12, p0, Lqy0/e;->L:Ljava/lang/Float;

    iput-object p13, p0, Lqy0/e;->M:Ly81/e;

    iput-object p14, p0, Lqy0/e;->N:Ly81/e;

    iput p15, p0, Lqy0/e;->O:F

    move/from16 p1, p16

    iput-boolean p1, p0, Lqy0/e;->P:Z

    move/from16 p1, p17

    iput p1, p0, Lqy0/e;->Q:F

    move/from16 p1, p18

    iput-boolean p1, p0, Lqy0/e;->R:Z

    move/from16 p1, p19

    iput-boolean p1, p0, Lqy0/e;->S:Z

    move-object/from16 p1, p20

    iput-object p1, p0, Lqy0/e;->T:Lc93/a;

    move/from16 p1, p21

    iput p1, p0, Lqy0/e;->U:I

    move/from16 p1, p22

    iput p1, p0, Lqy0/e;->V:I

    move/from16 p1, p23

    iput p1, p0, Lqy0/e;->W:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v24, p1

    check-cast v24, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v25

    iget-object v1, v0, Lqy0/e;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lqy0/e;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lqy0/e;->y:Ly81/e;

    iget-object v4, v0, Lqy0/e;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lqy0/e;->E:Ly81/e;

    iget-object v6, v0, Lqy0/e;->F:Ly3/f;

    iget-object v7, v0, Lqy0/e;->G:Lqy0/g;

    iget-object v8, v0, Lqy0/e;->H:Ly81/e;

    iget-object v9, v0, Lqy0/e;->I:Ly81/e;

    iget-object v10, v0, Lqy0/e;->J:Ly81/e;

    iget-boolean v11, v0, Lqy0/e;->K:Z

    iget-object v12, v0, Lqy0/e;->L:Ljava/lang/Float;

    iget-object v13, v0, Lqy0/e;->M:Ly81/e;

    iget-object v14, v0, Lqy0/e;->N:Ly81/e;

    iget v15, v0, Lqy0/e;->O:F

    move-object/from16 v16, v1

    iget-boolean v1, v0, Lqy0/e;->P:Z

    move/from16 v17, v1

    iget v1, v0, Lqy0/e;->Q:F

    move/from16 v18, v1

    iget-boolean v1, v0, Lqy0/e;->R:Z

    move/from16 v19, v1

    iget-boolean v1, v0, Lqy0/e;->S:Z

    move/from16 v20, v1

    iget-object v1, v0, Lqy0/e;->T:Lc93/a;

    move-object/from16 v21, v1

    iget v1, v0, Lqy0/e;->U:I

    move/from16 v22, v1

    iget v1, v0, Lqy0/e;->V:I

    move/from16 v23, v1

    iget v1, v0, Lqy0/e;->W:I

    move/from16 v26, v23

    move/from16 v23, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move-object/from16 v20, v21

    move/from16 v21, v22

    move/from16 v22, v26

    invoke-static/range {v1 .. v25}, Lqy0/f;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
