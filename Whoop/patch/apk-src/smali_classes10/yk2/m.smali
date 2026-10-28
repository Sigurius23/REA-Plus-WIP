.class public final synthetic Lyk2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:Ly81/f;

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Ly81/f;FFLandroidx/compose/ui/Modifier;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyk2/m;->w:Ly81/f;

    iput p2, p0, Lyk2/m;->x:F

    iput p3, p0, Lyk2/m;->y:F

    iput-object p4, p0, Lyk2/m;->z:Landroidx/compose/ui/Modifier;

    iput p5, p0, Lyk2/m;->E:I

    iput p6, p0, Lyk2/m;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lyk2/m;->w:Ly81/f;

    iget v1, p0, Lyk2/m;->x:F

    iget v2, p0, Lyk2/m;->y:F

    iget-object v3, p0, Lyk2/m;->z:Landroidx/compose/ui/Modifier;

    iget v4, p0, Lyk2/m;->E:I

    iget v5, p0, Lyk2/m;->F:I

    invoke-static/range {v0 .. v7}, Lyk2/n;->d(Ly81/f;FFLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
