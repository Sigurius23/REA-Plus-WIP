.class public final synthetic Lz71/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Li91/a;

.field public final synthetic H:Li91/a;

.field public final synthetic I:Lcom/whoop/design/util/TextResource;

.field public final synthetic J:Lcom/whoop/design/util/TextResource;

.field public final synthetic K:Lcom/whoop/design/util/TextResource;

.field public final synthetic L:Lcom/whoop/design/util/TextResource;

.field public final synthetic M:J

.field public final synthetic N:J

.field public final synthetic O:Lcom/whoop/design/util/TextResource;

.field public final synthetic P:Lcom/whoop/design/util/TextResource;

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(ZZZFLjava/lang/String;Lc93/a;Li91/a;Li91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lz71/g;->w:Z

    iput-boolean p2, p0, Lz71/g;->x:Z

    iput-boolean p3, p0, Lz71/g;->y:Z

    iput p4, p0, Lz71/g;->z:F

    iput-object p5, p0, Lz71/g;->E:Ljava/lang/String;

    iput-object p6, p0, Lz71/g;->F:Lc93/a;

    iput-object p7, p0, Lz71/g;->G:Li91/a;

    iput-object p8, p0, Lz71/g;->H:Li91/a;

    iput-object p9, p0, Lz71/g;->I:Lcom/whoop/design/util/TextResource;

    iput-object p10, p0, Lz71/g;->J:Lcom/whoop/design/util/TextResource;

    iput-object p11, p0, Lz71/g;->K:Lcom/whoop/design/util/TextResource;

    iput-object p12, p0, Lz71/g;->L:Lcom/whoop/design/util/TextResource;

    iput-wide p13, p0, Lz71/g;->M:J

    move-wide p1, p15

    iput-wide p1, p0, Lz71/g;->N:J

    move-object/from16 p1, p17

    iput-object p1, p0, Lz71/g;->O:Lcom/whoop/design/util/TextResource;

    move-object/from16 p1, p18

    iput-object p1, p0, Lz71/g;->P:Lcom/whoop/design/util/TextResource;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v19, p1

    check-cast v19, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v20

    iget-boolean v1, v0, Lz71/g;->w:Z

    iget-boolean v2, v0, Lz71/g;->x:Z

    iget-boolean v3, v0, Lz71/g;->y:Z

    iget v4, v0, Lz71/g;->z:F

    iget-object v5, v0, Lz71/g;->E:Ljava/lang/String;

    iget-object v6, v0, Lz71/g;->F:Lc93/a;

    iget-object v7, v0, Lz71/g;->G:Li91/a;

    iget-object v8, v0, Lz71/g;->H:Li91/a;

    iget-object v9, v0, Lz71/g;->I:Lcom/whoop/design/util/TextResource;

    iget-object v10, v0, Lz71/g;->J:Lcom/whoop/design/util/TextResource;

    iget-object v11, v0, Lz71/g;->K:Lcom/whoop/design/util/TextResource;

    iget-object v12, v0, Lz71/g;->L:Lcom/whoop/design/util/TextResource;

    iget-wide v13, v0, Lz71/g;->M:J

    move v15, v1

    move/from16 v16, v2

    iget-wide v1, v0, Lz71/g;->N:J

    move-wide/from16 v17, v1

    iget-object v1, v0, Lz71/g;->O:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lz71/g;->P:Lcom/whoop/design/util/TextResource;

    move-wide/from16 v21, v17

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move v1, v15

    move/from16 v2, v16

    move-wide/from16 v15, v21

    invoke-static/range {v1 .. v20}, Lz71/l;->c(ZZZFLjava/lang/String;Lc93/a;Li91/a;Li91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
