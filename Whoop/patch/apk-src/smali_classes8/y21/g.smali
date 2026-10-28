.class public final synthetic Ly21/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:F

.field public final synthetic G:F

.field public final synthetic H:F

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic K:F

.field public final synthetic L:I

.field public final synthetic M:J

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;FZFFFIIFIJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly21/g;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ly21/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ly21/g;->y:Lc93/a;

    iput p4, p0, Ly21/g;->z:F

    iput-boolean p5, p0, Ly21/g;->E:Z

    iput p6, p0, Ly21/g;->F:F

    iput p7, p0, Ly21/g;->G:F

    iput p8, p0, Ly21/g;->H:F

    iput p9, p0, Ly21/g;->I:I

    iput p10, p0, Ly21/g;->J:I

    iput p11, p0, Ly21/g;->K:F

    iput p12, p0, Ly21/g;->L:I

    iput-wide p13, p0, Ly21/g;->M:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Ly21/g;->w:Landroidx/compose/ui/Modifier;

    iget-object v2, v0, Ly21/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Ly21/g;->y:Lc93/a;

    iget v4, v0, Ly21/g;->z:F

    iget-boolean v5, v0, Ly21/g;->E:Z

    iget v6, v0, Ly21/g;->F:F

    iget v7, v0, Ly21/g;->G:F

    iget v8, v0, Ly21/g;->H:F

    iget v9, v0, Ly21/g;->I:I

    iget v10, v0, Ly21/g;->J:I

    iget v11, v0, Ly21/g;->K:F

    iget v12, v0, Ly21/g;->L:I

    iget-wide v13, v0, Ly21/g;->M:J

    invoke-static/range {v1 .. v16}, Ly21/i;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;FZFFFIIFIJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
