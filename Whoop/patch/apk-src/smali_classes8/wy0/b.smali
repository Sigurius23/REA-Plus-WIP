.class public final synthetic Lwy0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Z

.field public final synthetic G:F

.field public final synthetic H:I

.field public final synthetic I:Lwy0/d;

.field public final synthetic J:I

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Li91/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwy0/b;->w:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lwy0/b;->x:F

    iput p3, p0, Lwy0/b;->y:F

    iput-object p4, p0, Lwy0/b;->z:Li91/a;

    iput p5, p0, Lwy0/b;->E:F

    iput-boolean p6, p0, Lwy0/b;->F:Z

    iput p7, p0, Lwy0/b;->G:F

    iput p8, p0, Lwy0/b;->H:I

    iput-object p9, p0, Lwy0/b;->I:Lwy0/d;

    iput p10, p0, Lwy0/b;->J:I

    iput p11, p0, Lwy0/b;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lwy0/b;->w:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lwy0/b;->x:F

    iget v2, p0, Lwy0/b;->y:F

    iget-object v3, p0, Lwy0/b;->z:Li91/a;

    iget v4, p0, Lwy0/b;->E:F

    iget-boolean v5, p0, Lwy0/b;->F:Z

    iget v6, p0, Lwy0/b;->G:F

    iget v7, p0, Lwy0/b;->H:I

    iget-object v8, p0, Lwy0/b;->I:Lwy0/d;

    iget v9, p0, Lwy0/b;->J:I

    iget v10, p0, Lwy0/b;->K:I

    invoke-static/range {v0 .. v12}, Lwy0/c;->a(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
