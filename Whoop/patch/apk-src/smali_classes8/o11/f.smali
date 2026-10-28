.class public final synthetic Lo11/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Lcom/whoop/design/util/TextResource;

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Ljava/util/List;

.field public final synthetic J:Z

.field public final synthetic K:Z

.field public final synthetic L:Lcom/whoop/design/util/TextResource;

.field public final synthetic M:Lcom/whoop/design/util/TextResource;

.field public final synthetic N:Lcom/whoop/design/util/TextResource;

.field public final synthetic O:Lcom/whoop/design/util/TextResource;

.field public final synthetic P:Lcom/whoop/design/util/TextResource;

.field public final synthetic Q:I

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo11/f;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lo11/f;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lo11/f;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lo11/f;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lo11/f;->E:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lo11/f;->F:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lo11/f;->G:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lo11/f;->H:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lo11/f;->I:Ljava/util/List;

    iput-boolean p10, p0, Lo11/f;->J:Z

    iput-boolean p11, p0, Lo11/f;->K:Z

    iput-object p12, p0, Lo11/f;->L:Lcom/whoop/design/util/TextResource;

    iput-object p13, p0, Lo11/f;->M:Lcom/whoop/design/util/TextResource;

    iput-object p14, p0, Lo11/f;->N:Lcom/whoop/design/util/TextResource;

    iput-object p15, p0, Lo11/f;->O:Lcom/whoop/design/util/TextResource;

    move-object/from16 p1, p16

    iput-object p1, p0, Lo11/f;->P:Lcom/whoop/design/util/TextResource;

    move/from16 p1, p17

    iput p1, p0, Lo11/f;->Q:I

    move/from16 p1, p18

    iput p1, p0, Lo11/f;->R:I

    move/from16 p1, p19

    iput p1, p0, Lo11/f;->S:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v20, p1

    check-cast v20, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v21

    iget-object v1, v0, Lo11/f;->w:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lo11/f;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lo11/f;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lo11/f;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lo11/f;->E:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Lo11/f;->F:Lcom/whoop/design/util/TextResource;

    iget-object v7, v0, Lo11/f;->G:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lo11/f;->H:Lcom/whoop/design/util/TextResource;

    iget-object v9, v0, Lo11/f;->I:Ljava/util/List;

    iget-boolean v10, v0, Lo11/f;->J:Z

    iget-boolean v11, v0, Lo11/f;->K:Z

    iget-object v12, v0, Lo11/f;->L:Lcom/whoop/design/util/TextResource;

    iget-object v13, v0, Lo11/f;->M:Lcom/whoop/design/util/TextResource;

    iget-object v14, v0, Lo11/f;->N:Lcom/whoop/design/util/TextResource;

    iget-object v15, v0, Lo11/f;->O:Lcom/whoop/design/util/TextResource;

    move-object/from16 v16, v1

    iget-object v1, v0, Lo11/f;->P:Lcom/whoop/design/util/TextResource;

    move-object/from16 v17, v1

    iget v1, v0, Lo11/f;->Q:I

    move/from16 v18, v1

    iget v1, v0, Lo11/f;->R:I

    move/from16 v19, v1

    iget v1, v0, Lo11/f;->S:I

    move/from16 v22, v19

    move/from16 v19, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v22

    invoke-static/range {v1 .. v21}, Lo11/g;->n(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
