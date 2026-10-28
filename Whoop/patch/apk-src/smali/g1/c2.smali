.class public final synthetic Lg1/c2;
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

    iput-object p1, p0, Lg1/c2;->w:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Lg1/c2;->x:J

    iput p4, p0, Lg1/c2;->y:F

    iput p5, p0, Lg1/c2;->z:F

    iput p6, p0, Lg1/c2;->E:I

    iput p7, p0, Lg1/c2;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/c2;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v0, p0, Lg1/c2;->w:Landroidx/compose/ui/Modifier;

    iget-wide v1, p0, Lg1/c2;->x:J

    iget v3, p0, Lg1/c2;->y:F

    iget v4, p0, Lg1/c2;->z:F

    iget v7, p0, Lg1/c2;->F:I

    invoke-static/range {v0 .. v7}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
