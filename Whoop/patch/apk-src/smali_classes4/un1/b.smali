.class public final synthetic Lun1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:Lun1/h;

.field public final synthetic J:Lc93/a;

.field public final synthetic K:Lc0/c1;

.field public final synthetic L:Lc93/a;

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:I

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun1/b;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lun1/b;->x:I

    iput-boolean p3, p0, Lun1/b;->y:Z

    iput p4, p0, Lun1/b;->z:F

    iput-boolean p5, p0, Lun1/b;->E:Z

    iput-boolean p6, p0, Lun1/b;->F:Z

    iput-boolean p7, p0, Lun1/b;->G:Z

    iput-boolean p8, p0, Lun1/b;->H:Z

    iput-object p9, p0, Lun1/b;->I:Lun1/h;

    iput-object p10, p0, Lun1/b;->J:Lc93/a;

    iput-object p11, p0, Lun1/b;->K:Lc0/c1;

    iput-object p12, p0, Lun1/b;->L:Lc93/a;

    iput p13, p0, Lun1/b;->M:I

    iput p14, p0, Lun1/b;->N:I

    iput p15, p0, Lun1/b;->O:I

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

    iget-object v1, v0, Lun1/b;->w:Landroidx/compose/ui/Modifier;

    iget v2, v0, Lun1/b;->x:I

    iget-boolean v3, v0, Lun1/b;->y:Z

    iget v4, v0, Lun1/b;->z:F

    iget-boolean v5, v0, Lun1/b;->E:Z

    iget-boolean v6, v0, Lun1/b;->F:Z

    iget-boolean v7, v0, Lun1/b;->G:Z

    iget-boolean v8, v0, Lun1/b;->H:Z

    iget-object v9, v0, Lun1/b;->I:Lun1/h;

    iget-object v10, v0, Lun1/b;->J:Lc93/a;

    iget-object v11, v0, Lun1/b;->K:Lc0/c1;

    iget-object v12, v0, Lun1/b;->L:Lc93/a;

    iget v13, v0, Lun1/b;->M:I

    iget v14, v0, Lun1/b;->N:I

    iget v15, v0, Lun1/b;->O:I

    invoke-static/range {v1 .. v17}, Lun1/c;->a(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
