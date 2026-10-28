.class public final synthetic Ll1/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:F

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JFJIFII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/h3;->w:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Ll1/h3;->x:J

    iput p4, p0, Ll1/h3;->y:F

    iput-wide p5, p0, Ll1/h3;->z:J

    iput p7, p0, Ll1/h3;->E:I

    iput p8, p0, Ll1/h3;->F:F

    iput p9, p0, Ll1/h3;->G:I

    iput p10, p0, Ll1/h3;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll1/h3;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Ll1/h3;->w:Landroidx/compose/ui/Modifier;

    iget-wide v1, p0, Ll1/h3;->x:J

    iget v3, p0, Ll1/h3;->y:F

    iget-wide v4, p0, Ll1/h3;->z:J

    iget v6, p0, Ll1/h3;->E:I

    iget v7, p0, Ll1/h3;->F:F

    iget v10, p0, Ll1/h3;->H:I

    invoke-static/range {v0 .. v10}, Ll1/i3;->a(Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
