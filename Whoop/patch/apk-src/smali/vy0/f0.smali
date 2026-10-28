.class public final synthetic Lvy0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lvy0/j0;

.field public final synthetic y:F

.field public final synthetic z:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lvy0/j0;FLjava/lang/Integer;Lc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvy0/f0;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lvy0/f0;->x:Lvy0/j0;

    iput p3, p0, Lvy0/f0;->y:F

    iput-object p4, p0, Lvy0/f0;->z:Ljava/lang/Integer;

    iput-object p5, p0, Lvy0/f0;->E:Lc93/a;

    iput p6, p0, Lvy0/f0;->F:I

    iput p7, p0, Lvy0/f0;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lvy0/f0;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lvy0/f0;->x:Lvy0/j0;

    iget v2, p0, Lvy0/f0;->y:F

    iget-object v3, p0, Lvy0/f0;->z:Ljava/lang/Integer;

    iget-object v4, p0, Lvy0/f0;->E:Lc93/a;

    iget v5, p0, Lvy0/f0;->F:I

    iget v6, p0, Lvy0/f0;->G:I

    invoke-static/range {v0 .. v8}, Lvy0/h0;->d(Landroidx/compose/ui/Modifier;Lvy0/j0;FLjava/lang/Integer;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
