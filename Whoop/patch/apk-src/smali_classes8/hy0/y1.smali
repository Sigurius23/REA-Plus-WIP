.class public final synthetic Lhy0/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lgz0/m0;

.field public final synthetic F:F

.field public final synthetic G:Lhy0/s0;

.field public final synthetic H:Z

.field public final synthetic I:F

.field public final synthetic J:Ll0/k1;

.field public final synthetic K:Z

.field public final synthetic L:I

.field public final synthetic M:I

.field public final synthetic N:Lb91/a;

.field public final synthetic O:Ljava/lang/Float;

.field public final synthetic P:I

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Z

.field public final synthetic y:Lhy0/b2;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/y1;->w:Lcom/whoop/design/util/TextResource;

    iput-boolean p2, p0, Lhy0/y1;->x:Z

    iput-object p3, p0, Lhy0/y1;->y:Lhy0/b2;

    iput-boolean p4, p0, Lhy0/y1;->z:Z

    iput-object p5, p0, Lhy0/y1;->E:Lgz0/m0;

    iput p6, p0, Lhy0/y1;->F:F

    iput-object p7, p0, Lhy0/y1;->G:Lhy0/s0;

    iput-boolean p8, p0, Lhy0/y1;->H:Z

    iput p9, p0, Lhy0/y1;->I:F

    iput-object p10, p0, Lhy0/y1;->J:Ll0/k1;

    iput-boolean p11, p0, Lhy0/y1;->K:Z

    iput p12, p0, Lhy0/y1;->L:I

    iput p13, p0, Lhy0/y1;->M:I

    iput-object p14, p0, Lhy0/y1;->N:Lb91/a;

    iput-object p15, p0, Lhy0/y1;->O:Ljava/lang/Float;

    move/from16 p1, p16

    iput p1, p0, Lhy0/y1;->P:I

    move/from16 p1, p17

    iput p1, p0, Lhy0/y1;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lhy0/y1;->R:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v20

    iget-object v1, v0, Lhy0/y1;->w:Lcom/whoop/design/util/TextResource;

    iget-boolean v2, v0, Lhy0/y1;->x:Z

    iget-object v3, v0, Lhy0/y1;->y:Lhy0/b2;

    iget-boolean v4, v0, Lhy0/y1;->z:Z

    iget-object v5, v0, Lhy0/y1;->E:Lgz0/m0;

    iget v6, v0, Lhy0/y1;->F:F

    iget-object v7, v0, Lhy0/y1;->G:Lhy0/s0;

    iget-boolean v8, v0, Lhy0/y1;->H:Z

    iget v9, v0, Lhy0/y1;->I:F

    iget-object v10, v0, Lhy0/y1;->J:Ll0/k1;

    iget-boolean v11, v0, Lhy0/y1;->K:Z

    iget v12, v0, Lhy0/y1;->L:I

    iget v13, v0, Lhy0/y1;->M:I

    iget-object v14, v0, Lhy0/y1;->N:Lb91/a;

    iget-object v15, v0, Lhy0/y1;->O:Ljava/lang/Float;

    move-object/from16 v16, v1

    iget v1, v0, Lhy0/y1;->P:I

    move/from16 v17, v1

    iget v1, v0, Lhy0/y1;->Q:I

    move/from16 v18, v1

    iget v1, v0, Lhy0/y1;->R:I

    move/from16 v21, v18

    move/from16 v18, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move/from16 v17, v21

    invoke-static/range {v1 .. v20}, Lhy0/z1;->a(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
