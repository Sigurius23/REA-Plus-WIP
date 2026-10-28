.class public final synthetic Lz71/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:J

.field public final synthetic H:J

.field public final synthetic I:Lcom/whoop/design/util/TextResource;

.field public final synthetic J:Lcom/whoop/design/util/TextResource;

.field public final synthetic K:Lcom/whoop/design/util/TextResource;

.field public final synthetic L:Ljava/lang/String;

.field public final synthetic M:Z

.field public final synthetic N:Lcom/whoop/design/util/TextResource;

.field public final synthetic O:Z

.field public final synthetic P:Lc93/a;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Li91/a;

.field public final synthetic x:Li91/a;

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Li91/a;Li91/a;ZFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ZLc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz71/h;->w:Li91/a;

    iput-object p2, p0, Lz71/h;->x:Li91/a;

    iput-boolean p3, p0, Lz71/h;->y:Z

    iput p4, p0, Lz71/h;->z:F

    iput-object p5, p0, Lz71/h;->E:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lz71/h;->F:Lcom/whoop/design/util/TextResource;

    iput-wide p7, p0, Lz71/h;->G:J

    iput-wide p9, p0, Lz71/h;->H:J

    iput-object p11, p0, Lz71/h;->I:Lcom/whoop/design/util/TextResource;

    iput-object p12, p0, Lz71/h;->J:Lcom/whoop/design/util/TextResource;

    iput-object p13, p0, Lz71/h;->K:Lcom/whoop/design/util/TextResource;

    iput-object p14, p0, Lz71/h;->L:Ljava/lang/String;

    iput-boolean p15, p0, Lz71/h;->M:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Lz71/h;->N:Lcom/whoop/design/util/TextResource;

    move/from16 p1, p17

    iput-boolean p1, p0, Lz71/h;->O:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Lz71/h;->P:Lc93/a;

    move/from16 p1, p19

    iput p1, p0, Lz71/h;->Q:I

    move/from16 p1, p20

    iput p1, p0, Lz71/h;->R:I

    move/from16 p1, p21

    iput p1, p0, Lz71/h;->S:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v22, p1

    check-cast v22, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v23

    iget-object v1, v0, Lz71/h;->w:Li91/a;

    iget-object v2, v0, Lz71/h;->x:Li91/a;

    iget-boolean v3, v0, Lz71/h;->y:Z

    iget v4, v0, Lz71/h;->z:F

    iget-object v5, v0, Lz71/h;->E:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Lz71/h;->F:Lcom/whoop/design/util/TextResource;

    iget-wide v7, v0, Lz71/h;->G:J

    iget-wide v9, v0, Lz71/h;->H:J

    iget-object v11, v0, Lz71/h;->I:Lcom/whoop/design/util/TextResource;

    iget-object v12, v0, Lz71/h;->J:Lcom/whoop/design/util/TextResource;

    iget-object v13, v0, Lz71/h;->K:Lcom/whoop/design/util/TextResource;

    iget-object v14, v0, Lz71/h;->L:Ljava/lang/String;

    iget-boolean v15, v0, Lz71/h;->M:Z

    move-object/from16 v16, v1

    iget-object v1, v0, Lz71/h;->N:Lcom/whoop/design/util/TextResource;

    move-object/from16 v17, v1

    iget-boolean v1, v0, Lz71/h;->O:Z

    move/from16 v18, v1

    iget-object v1, v0, Lz71/h;->P:Lc93/a;

    move-object/from16 v19, v1

    iget v1, v0, Lz71/h;->Q:I

    move/from16 v20, v1

    iget v1, v0, Lz71/h;->R:I

    move/from16 v21, v1

    iget v1, v0, Lz71/h;->S:I

    move/from16 v24, v21

    move/from16 v21, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move/from16 v17, v18

    move-object/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v24

    invoke-static/range {v1 .. v23}, Lz71/l;->f(Li91/a;Li91/a;ZFLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;ZLc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
