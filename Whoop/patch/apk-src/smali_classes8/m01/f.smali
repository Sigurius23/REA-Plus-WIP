.class public final synthetic Lm01/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Z

.field public final synthetic G:Lc93/a;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm01/f;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lm01/f;->x:F

    iput p3, p0, Lm01/f;->y:F

    iput-object p4, p0, Lm01/f;->z:Ljava/util/List;

    iput p5, p0, Lm01/f;->E:I

    iput-boolean p6, p0, Lm01/f;->F:Z

    iput-object p7, p0, Lm01/f;->G:Lc93/a;

    iput p8, p0, Lm01/f;->H:I

    iput p9, p0, Lm01/f;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lm01/f;->w:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lm01/f;->x:F

    iget v2, p0, Lm01/f;->y:F

    iget-object v3, p0, Lm01/f;->z:Ljava/util/List;

    iget v4, p0, Lm01/f;->E:I

    iget-boolean v5, p0, Lm01/f;->F:Z

    iget-object v6, p0, Lm01/f;->G:Lc93/a;

    iget v7, p0, Lm01/f;->H:I

    iget v8, p0, Lm01/f;->I:I

    invoke-static/range {v0 .. v10}, Lm01/g;->c(Landroidx/compose/ui/Modifier;FFLjava/util/List;IZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
