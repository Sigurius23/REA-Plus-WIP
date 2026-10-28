.class public final synthetic Lg1/u6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lf0/t;

.field public final synthetic F:F

.field public final synthetic G:Lc93/m;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Li2/a1;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/u6;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg1/u6;->x:Li2/a1;

    iput-wide p3, p0, Lg1/u6;->y:J

    iput-wide p5, p0, Lg1/u6;->z:J

    iput-object p7, p0, Lg1/u6;->E:Lf0/t;

    iput p8, p0, Lg1/u6;->F:F

    iput-object p9, p0, Lg1/u6;->G:Lc93/m;

    iput p10, p0, Lg1/u6;->H:I

    iput p11, p0, Lg1/u6;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/u6;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v0, p0, Lg1/u6;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lg1/u6;->x:Li2/a1;

    iget-wide v2, p0, Lg1/u6;->y:J

    iget-wide v4, p0, Lg1/u6;->z:J

    iget-object v6, p0, Lg1/u6;->E:Lf0/t;

    iget v7, p0, Lg1/u6;->F:F

    iget-object v8, p0, Lg1/u6;->G:Lc93/m;

    iget v11, p0, Lg1/u6;->I:I

    invoke-static/range {v0 .. v11}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
