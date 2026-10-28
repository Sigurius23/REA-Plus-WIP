.class public final synthetic Lg1/s4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JFJIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/s4;->w:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Lg1/s4;->x:J

    iput p4, p0, Lg1/s4;->y:F

    iput-wide p5, p0, Lg1/s4;->z:J

    iput p7, p0, Lg1/s4;->E:I

    iput p8, p0, Lg1/s4;->F:I

    iput p9, p0, Lg1/s4;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/s4;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Lg1/s4;->w:Landroidx/compose/ui/Modifier;

    iget-wide v1, p0, Lg1/s4;->x:J

    iget v3, p0, Lg1/s4;->y:F

    iget-wide v4, p0, Lg1/s4;->z:J

    iget v6, p0, Lg1/s4;->E:I

    iget v9, p0, Lg1/s4;->G:I

    invoke-static/range {v0 .. v9}, Lg1/v4;->b(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
