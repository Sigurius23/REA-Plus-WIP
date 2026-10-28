.class public final synthetic Ln71/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JFFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln71/n;->w:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Ln71/n;->x:J

    iput p4, p0, Ln71/n;->y:F

    iput p5, p0, Ln71/n;->z:F

    iput p6, p0, Ln71/n;->E:I

    iput p7, p0, Ln71/n;->F:I

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

    iget-object v0, p0, Ln71/n;->w:Landroidx/compose/ui/Modifier;

    iget-wide v1, p0, Ln71/n;->x:J

    iget v3, p0, Ln71/n;->y:F

    iget v4, p0, Ln71/n;->z:F

    iget v5, p0, Ln71/n;->E:I

    iget v6, p0, Ln71/n;->F:I

    invoke-static/range {v0 .. v8}, Ln71/o;->l(Landroidx/compose/ui/Modifier;JFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
