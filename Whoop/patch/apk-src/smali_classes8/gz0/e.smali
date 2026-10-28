.class public final synthetic Lgz0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Z

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lb2/h;

.field public final synthetic y:Lo2/e;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lb2/h;Lo2/e;FFZLc93/m;Lc93/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgz0/e;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lgz0/e;->x:Lb2/h;

    iput-object p3, p0, Lgz0/e;->y:Lo2/e;

    iput p4, p0, Lgz0/e;->z:F

    iput p5, p0, Lgz0/e;->E:F

    iput-boolean p6, p0, Lgz0/e;->F:Z

    iput-object p7, p0, Lgz0/e;->G:Lc93/m;

    iput-object p8, p0, Lgz0/e;->H:Lc93/m;

    iput p9, p0, Lgz0/e;->I:I

    iput p10, p0, Lgz0/e;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lgz0/e;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lgz0/e;->x:Lb2/h;

    iget-object v2, p0, Lgz0/e;->y:Lo2/e;

    iget v3, p0, Lgz0/e;->z:F

    iget v4, p0, Lgz0/e;->E:F

    iget-boolean v5, p0, Lgz0/e;->F:Z

    iget-object v6, p0, Lgz0/e;->G:Lc93/m;

    iget-object v7, p0, Lgz0/e;->H:Lc93/m;

    iget v8, p0, Lgz0/e;->I:I

    iget v9, p0, Lgz0/e;->J:I

    invoke-static/range {v0 .. v11}, Lgz0/g;->c(Landroidx/compose/ui/Modifier;Lb2/h;Lo2/e;FFZLc93/m;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
