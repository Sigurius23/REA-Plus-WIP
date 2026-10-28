.class public final synthetic Lh01/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Z

.field public final synthetic I:Lc93/a;

.field public final synthetic J:Lc93/a;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:I

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh01/e;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lh01/e;->x:I

    iput p3, p0, Lh01/e;->y:F

    iput p4, p0, Lh01/e;->z:I

    iput-boolean p5, p0, Lh01/e;->E:Z

    iput-boolean p6, p0, Lh01/e;->F:Z

    iput-boolean p7, p0, Lh01/e;->G:Z

    iput-boolean p8, p0, Lh01/e;->H:Z

    iput-object p9, p0, Lh01/e;->I:Lc93/a;

    iput-object p10, p0, Lh01/e;->J:Lc93/a;

    iput p11, p0, Lh01/e;->K:I

    iput p12, p0, Lh01/e;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Lh01/e;->w:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lh01/e;->x:I

    iget v2, p0, Lh01/e;->y:F

    iget v3, p0, Lh01/e;->z:I

    iget-boolean v4, p0, Lh01/e;->E:Z

    iget-boolean v5, p0, Lh01/e;->F:Z

    iget-boolean v6, p0, Lh01/e;->G:Z

    iget-boolean v7, p0, Lh01/e;->H:Z

    iget-object v8, p0, Lh01/e;->I:Lc93/a;

    iget-object v9, p0, Lh01/e;->J:Lc93/a;

    iget v10, p0, Lh01/e;->K:I

    iget v11, p0, Lh01/e;->L:I

    invoke-static/range {v0 .. v13}, Lh01/f;->d(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
