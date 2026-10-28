.class public final synthetic Lz51/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll83/k;

.field public final synthetic F:F

.field public final synthetic G:Lz51/k;

.field public final synthetic H:F

.field public final synthetic I:F

.field public final synthetic J:Lcom/whoop/design/util/TextResource;

.field public final synthetic K:Z

.field public final synthetic L:Lc93/a;

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZZFLl83/k;FLz51/k;FFLcom/whoop/design/util/TextResource;ZLc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz51/f;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lz51/f;->x:Z

    iput-boolean p3, p0, Lz51/f;->y:Z

    iput p4, p0, Lz51/f;->z:F

    iput-object p5, p0, Lz51/f;->E:Ll83/k;

    iput p6, p0, Lz51/f;->F:F

    iput-object p7, p0, Lz51/f;->G:Lz51/k;

    iput p8, p0, Lz51/f;->H:F

    iput p9, p0, Lz51/f;->I:F

    iput-object p10, p0, Lz51/f;->J:Lcom/whoop/design/util/TextResource;

    iput-boolean p11, p0, Lz51/f;->K:Z

    iput-object p12, p0, Lz51/f;->L:Lc93/a;

    iput p13, p0, Lz51/f;->M:I

    iput p14, p0, Lz51/f;->N:I

    iput p15, p0, Lz51/f;->O:I

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

    iget-object v1, v0, Lz51/f;->w:Landroidx/compose/ui/Modifier;

    iget-boolean v2, v0, Lz51/f;->x:Z

    iget-boolean v3, v0, Lz51/f;->y:Z

    iget v4, v0, Lz51/f;->z:F

    iget-object v5, v0, Lz51/f;->E:Ll83/k;

    iget v6, v0, Lz51/f;->F:F

    iget-object v7, v0, Lz51/f;->G:Lz51/k;

    iget v8, v0, Lz51/f;->H:F

    iget v9, v0, Lz51/f;->I:F

    iget-object v10, v0, Lz51/f;->J:Lcom/whoop/design/util/TextResource;

    iget-boolean v11, v0, Lz51/f;->K:Z

    iget-object v12, v0, Lz51/f;->L:Lc93/a;

    iget v13, v0, Lz51/f;->M:I

    iget v14, v0, Lz51/f;->N:I

    iget v15, v0, Lz51/f;->O:I

    invoke-static/range {v1 .. v17}, Lz51/h;->p(Landroidx/compose/ui/Modifier;ZZFLl83/k;FLz51/k;FFLcom/whoop/design/util/TextResource;ZLc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
