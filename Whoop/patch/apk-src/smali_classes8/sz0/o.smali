.class public final synthetic Lsz0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Lsz0/h1;

.field public final synthetic G:Lsz0/g1;

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Z

.field public final synthetic J:J

.field public final synthetic K:J

.field public final synthetic L:Lb91/a;

.field public final synthetic M:Lb91/a;

.field public final synthetic N:Lb91/a;

.field public final synthetic O:Z

.field public final synthetic P:Lc93/a;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lsz0/f1;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsz0/o;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lsz0/o;->x:Lsz0/f1;

    iput-object p3, p0, Lsz0/o;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lsz0/o;->z:Ljava/lang/Integer;

    iput-object p5, p0, Lsz0/o;->E:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lsz0/o;->F:Lsz0/h1;

    iput-object p7, p0, Lsz0/o;->G:Lsz0/g1;

    iput-object p8, p0, Lsz0/o;->H:Lcom/whoop/design/util/TextResource;

    iput-boolean p9, p0, Lsz0/o;->I:Z

    iput-wide p10, p0, Lsz0/o;->J:J

    iput-wide p12, p0, Lsz0/o;->K:J

    iput-object p14, p0, Lsz0/o;->L:Lb91/a;

    iput-object p15, p0, Lsz0/o;->M:Lb91/a;

    move-object/from16 p1, p16

    iput-object p1, p0, Lsz0/o;->N:Lb91/a;

    move/from16 p1, p17

    iput-boolean p1, p0, Lsz0/o;->O:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Lsz0/o;->P:Lc93/a;

    move/from16 p1, p19

    iput p1, p0, Lsz0/o;->Q:I

    move/from16 p1, p20

    iput p1, p0, Lsz0/o;->R:I

    move/from16 p1, p21

    iput p1, p0, Lsz0/o;->S:I

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

    iget-object v1, v0, Lsz0/o;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Lsz0/o;->x:Lsz0/f1;

    iget-object v3, v0, Lsz0/o;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lsz0/o;->z:Ljava/lang/Integer;

    iget-object v5, v0, Lsz0/o;->E:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Lsz0/o;->F:Lsz0/h1;

    iget-object v7, v0, Lsz0/o;->G:Lsz0/g1;

    iget-object v8, v0, Lsz0/o;->H:Lcom/whoop/design/util/TextResource;

    iget-boolean v9, v0, Lsz0/o;->I:Z

    iget-wide v10, v0, Lsz0/o;->J:J

    iget-wide v12, v0, Lsz0/o;->K:J

    iget-object v14, v0, Lsz0/o;->L:Lb91/a;

    iget-object v15, v0, Lsz0/o;->M:Lb91/a;

    move-object/from16 v16, v1

    iget-object v1, v0, Lsz0/o;->N:Lb91/a;

    move-object/from16 v17, v1

    iget-boolean v1, v0, Lsz0/o;->O:Z

    move/from16 v18, v1

    iget-object v1, v0, Lsz0/o;->P:Lc93/a;

    move-object/from16 v19, v1

    iget v1, v0, Lsz0/o;->Q:I

    move/from16 v20, v1

    iget v1, v0, Lsz0/o;->R:I

    move/from16 v21, v1

    iget v1, v0, Lsz0/o;->S:I

    move/from16 v24, v21

    move/from16 v21, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move/from16 v17, v18

    move-object/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v24

    invoke-static/range {v1 .. v23}, Lsz0/p;->d(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
