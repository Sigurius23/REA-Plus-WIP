.class public final synthetic Lh00/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FIIJJLandroidx/compose/ui/Modifier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p8, p0, Lh00/g0;->w:Landroidx/compose/ui/Modifier;

    iput-wide p4, p0, Lh00/g0;->x:J

    iput-wide p6, p0, Lh00/g0;->y:J

    iput p1, p0, Lh00/g0;->z:F

    iput p2, p0, Lh00/g0;->E:I

    iput p3, p0, Lh00/g0;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lh00/g0;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v1

    iget v0, p0, Lh00/g0;->z:F

    iget v2, p0, Lh00/g0;->F:I

    iget-wide v3, p0, Lh00/g0;->x:J

    iget-wide v5, p0, Lh00/g0;->y:J

    iget-object v8, p0, Lh00/g0;->w:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v8}, Lup/d;->f(FIIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
