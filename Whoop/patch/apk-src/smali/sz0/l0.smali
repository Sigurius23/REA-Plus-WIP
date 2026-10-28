.class public final synthetic Lsz0/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Lc93/a;

.field public final synthetic J:Landroidx/compose/ui/Modifier;

.field public final synthetic K:Z

.field public final synthetic L:Z

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Lsz0/p0;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsz0/l0;->w:Lsz0/p0;

    iput-object p2, p0, Lsz0/l0;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lsz0/l0;->y:Lc93/a;

    iput-object p4, p0, Lsz0/l0;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lsz0/l0;->E:Lc93/a;

    iput-boolean p6, p0, Lsz0/l0;->F:Z

    iput-boolean p7, p0, Lsz0/l0;->G:Z

    iput-object p8, p0, Lsz0/l0;->H:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lsz0/l0;->I:Lc93/a;

    iput-object p10, p0, Lsz0/l0;->J:Landroidx/compose/ui/Modifier;

    iput-boolean p11, p0, Lsz0/l0;->K:Z

    iput-boolean p12, p0, Lsz0/l0;->L:Z

    iput p13, p0, Lsz0/l0;->M:I

    iput p14, p0, Lsz0/l0;->N:I

    iput p15, p0, Lsz0/l0;->O:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v1, v0, Lsz0/l0;->w:Lsz0/p0;

    iget-object v2, v0, Lsz0/l0;->x:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lsz0/l0;->y:Lc93/a;

    iget-object v4, v0, Lsz0/l0;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lsz0/l0;->E:Lc93/a;

    iget-boolean v6, v0, Lsz0/l0;->F:Z

    iget-boolean v7, v0, Lsz0/l0;->G:Z

    iget-object v8, v0, Lsz0/l0;->H:Lcom/whoop/design/util/TextResource;

    iget-object v9, v0, Lsz0/l0;->I:Lc93/a;

    iget-object v10, v0, Lsz0/l0;->J:Landroidx/compose/ui/Modifier;

    iget-boolean v11, v0, Lsz0/l0;->K:Z

    iget-boolean v12, v0, Lsz0/l0;->L:Z

    iget v13, v0, Lsz0/l0;->M:I

    iget v14, v0, Lsz0/l0;->N:I

    iget v15, v0, Lsz0/l0;->O:I

    invoke-static/range {v1 .. v17}, Lsz0/m0;->p(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
