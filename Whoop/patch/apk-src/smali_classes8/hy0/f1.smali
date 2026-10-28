.class public final synthetic Lhy0/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li2/t;

.field public final synthetic F:Z

.field public final synthetic G:Ly71/g;

.field public final synthetic H:Li2/t;

.field public final synthetic I:F

.field public final synthetic J:Lhy0/o1;

.field public final synthetic K:Li2/a1;

.field public final synthetic L:F

.field public final synthetic M:F

.field public final synthetic N:Ly71/g;

.field public final synthetic O:Li2/x;

.field public final synthetic P:F

.field public final synthetic Q:Lhy0/c1;

.field public final synthetic R:Lkd1/o;

.field public final synthetic S:Ljava/util/List;

.field public final synthetic T:I

.field public final synthetic U:I

.field public final synthetic V:Landroidx/compose/ui/Modifier;

.field public final synthetic W:Lc93/a;

.field public final synthetic X:I

.field public final synthetic Y:I

.field public final synthetic Z:I

.field public final synthetic a0:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:J

.field public final synthetic y:Li91/d;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/f1;->w:Lcom/whoop/design/util/TextResource;

    iput-wide p2, p0, Lhy0/f1;->x:J

    iput-object p4, p0, Lhy0/f1;->y:Li91/d;

    iput-wide p5, p0, Lhy0/f1;->z:J

    iput-object p7, p0, Lhy0/f1;->E:Li2/t;

    iput-boolean p8, p0, Lhy0/f1;->F:Z

    iput-object p9, p0, Lhy0/f1;->G:Ly71/g;

    iput-object p10, p0, Lhy0/f1;->H:Li2/t;

    iput p11, p0, Lhy0/f1;->I:F

    iput-object p12, p0, Lhy0/f1;->J:Lhy0/o1;

    iput-object p13, p0, Lhy0/f1;->K:Li2/a1;

    iput p14, p0, Lhy0/f1;->L:F

    iput p15, p0, Lhy0/f1;->M:F

    move-object/from16 p1, p16

    iput-object p1, p0, Lhy0/f1;->N:Ly71/g;

    move-object/from16 p1, p17

    iput-object p1, p0, Lhy0/f1;->O:Li2/x;

    move/from16 p1, p18

    iput p1, p0, Lhy0/f1;->P:F

    move-object/from16 p1, p19

    iput-object p1, p0, Lhy0/f1;->Q:Lhy0/c1;

    move-object/from16 p1, p20

    iput-object p1, p0, Lhy0/f1;->R:Lkd1/o;

    move-object/from16 p1, p21

    iput-object p1, p0, Lhy0/f1;->S:Ljava/util/List;

    move/from16 p1, p22

    iput p1, p0, Lhy0/f1;->T:I

    move/from16 p1, p23

    iput p1, p0, Lhy0/f1;->U:I

    move-object/from16 p1, p24

    iput-object p1, p0, Lhy0/f1;->V:Landroidx/compose/ui/Modifier;

    move-object/from16 p1, p25

    iput-object p1, p0, Lhy0/f1;->W:Lc93/a;

    move/from16 p1, p26

    iput p1, p0, Lhy0/f1;->X:I

    move/from16 p1, p27

    iput p1, p0, Lhy0/f1;->Y:I

    move/from16 p1, p28

    iput p1, p0, Lhy0/f1;->Z:I

    move/from16 p1, p29

    iput p1, p0, Lhy0/f1;->a0:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v30, p1

    check-cast v30, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v31

    iget-object v1, v0, Lhy0/f1;->w:Lcom/whoop/design/util/TextResource;

    iget-wide v2, v0, Lhy0/f1;->x:J

    iget-object v4, v0, Lhy0/f1;->y:Li91/d;

    iget-wide v5, v0, Lhy0/f1;->z:J

    iget-object v7, v0, Lhy0/f1;->E:Li2/t;

    iget-boolean v8, v0, Lhy0/f1;->F:Z

    iget-object v9, v0, Lhy0/f1;->G:Ly71/g;

    iget-object v10, v0, Lhy0/f1;->H:Li2/t;

    iget v11, v0, Lhy0/f1;->I:F

    iget-object v12, v0, Lhy0/f1;->J:Lhy0/o1;

    iget-object v13, v0, Lhy0/f1;->K:Li2/a1;

    iget v14, v0, Lhy0/f1;->L:F

    iget v15, v0, Lhy0/f1;->M:F

    move-object/from16 v16, v1

    iget-object v1, v0, Lhy0/f1;->N:Ly71/g;

    move-object/from16 v17, v1

    iget-object v1, v0, Lhy0/f1;->O:Li2/x;

    move-object/from16 v18, v1

    iget v1, v0, Lhy0/f1;->P:F

    move/from16 v19, v1

    iget-object v1, v0, Lhy0/f1;->Q:Lhy0/c1;

    move-object/from16 v20, v1

    iget-object v1, v0, Lhy0/f1;->R:Lkd1/o;

    move-object/from16 v21, v1

    iget-object v1, v0, Lhy0/f1;->S:Ljava/util/List;

    move-object/from16 v22, v1

    iget v1, v0, Lhy0/f1;->T:I

    move/from16 v23, v1

    iget v1, v0, Lhy0/f1;->U:I

    move/from16 v24, v1

    iget-object v1, v0, Lhy0/f1;->V:Landroidx/compose/ui/Modifier;

    move-object/from16 v25, v1

    iget-object v1, v0, Lhy0/f1;->W:Lc93/a;

    move-object/from16 v26, v1

    iget v1, v0, Lhy0/f1;->X:I

    move/from16 v27, v1

    iget v1, v0, Lhy0/f1;->Y:I

    move/from16 v28, v1

    iget v1, v0, Lhy0/f1;->Z:I

    move/from16 v29, v1

    iget v1, v0, Lhy0/f1;->a0:I

    move/from16 v32, v29

    move/from16 v29, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move/from16 v22, v23

    move/from16 v23, v24

    move-object/from16 v24, v25

    move-object/from16 v25, v26

    move/from16 v26, v27

    move/from16 v27, v28

    move/from16 v28, v32

    invoke-static/range {v1 .. v31}, Lhy0/g1;->a(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
