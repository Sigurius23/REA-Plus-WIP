.class public final synthetic Ly11/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:J

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Ljava/util/List;

.field public final synthetic K:Z

.field public final synthetic L:Ll83/k;

.field public final synthetic M:Ld0/z1;

.field public final synthetic N:Z

.field public final synthetic O:Z

.field public final synthetic P:Lcom/whoop/design/models/items/graph/LayoutDirection;

.field public final synthetic Q:Lc93/a;

.field public final synthetic R:I

.field public final synthetic S:I

.field public final synthetic T:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly11/i;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ly11/i;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Ly11/i;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Ly11/i;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Ly11/i;->E:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Ly11/i;->F:Lcom/whoop/design/util/TextResource;

    iput-wide p7, p0, Ly11/i;->G:J

    iput-boolean p9, p0, Ly11/i;->H:Z

    iput-boolean p10, p0, Ly11/i;->I:Z

    iput-object p11, p0, Ly11/i;->J:Ljava/util/List;

    iput-boolean p12, p0, Ly11/i;->K:Z

    iput-object p13, p0, Ly11/i;->L:Ll83/k;

    iput-object p14, p0, Ly11/i;->M:Ld0/z1;

    iput-boolean p15, p0, Ly11/i;->N:Z

    move/from16 p1, p16

    iput-boolean p1, p0, Ly11/i;->O:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Ly11/i;->P:Lcom/whoop/design/models/items/graph/LayoutDirection;

    move-object/from16 p1, p18

    iput-object p1, p0, Ly11/i;->Q:Lc93/a;

    move/from16 p1, p19

    iput p1, p0, Ly11/i;->R:I

    move/from16 p1, p20

    iput p1, p0, Ly11/i;->S:I

    move/from16 p1, p21

    iput p1, p0, Ly11/i;->T:I

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

    iget-object v1, v0, Ly11/i;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Ly11/i;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Ly11/i;->y:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Ly11/i;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Ly11/i;->E:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Ly11/i;->F:Lcom/whoop/design/util/TextResource;

    iget-wide v7, v0, Ly11/i;->G:J

    iget-boolean v9, v0, Ly11/i;->H:Z

    iget-boolean v10, v0, Ly11/i;->I:Z

    iget-object v11, v0, Ly11/i;->J:Ljava/util/List;

    iget-boolean v12, v0, Ly11/i;->K:Z

    iget-object v13, v0, Ly11/i;->L:Ll83/k;

    iget-object v14, v0, Ly11/i;->M:Ld0/z1;

    iget-boolean v15, v0, Ly11/i;->N:Z

    move-object/from16 v16, v1

    iget-boolean v1, v0, Ly11/i;->O:Z

    move/from16 v17, v1

    iget-object v1, v0, Ly11/i;->P:Lcom/whoop/design/models/items/graph/LayoutDirection;

    move-object/from16 v18, v1

    iget-object v1, v0, Ly11/i;->Q:Lc93/a;

    move-object/from16 v19, v1

    iget v1, v0, Ly11/i;->R:I

    move/from16 v20, v1

    iget v1, v0, Ly11/i;->S:I

    move/from16 v21, v1

    iget v1, v0, Ly11/i;->T:I

    move/from16 v24, v21

    move/from16 v21, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v24

    invoke-static/range {v1 .. v23}, Ly11/k;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JZZLjava/util/List;ZLl83/k;Ld0/z1;ZZLcom/whoop/design/models/items/graph/LayoutDirection;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
