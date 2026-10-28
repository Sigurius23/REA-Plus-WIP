.class public final synthetic Ln71/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:J

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(JFFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ln71/l;->w:J

    iput p3, p0, Ln71/l;->x:F

    iput p4, p0, Ln71/l;->y:F

    iput p5, p0, Ln71/l;->z:I

    iput p6, p0, Ln71/l;->E:I

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

    iget-wide v0, p0, Ln71/l;->w:J

    iget v2, p0, Ln71/l;->x:F

    iget v3, p0, Ln71/l;->y:F

    iget v4, p0, Ln71/l;->z:I

    iget v5, p0, Ln71/l;->E:I

    invoke-static/range {v0 .. v7}, Ln71/o;->p(JFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
