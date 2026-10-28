.class public final synthetic Lg1/x7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lx1/b;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Lx1/b;

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(ILandroidx/compose/ui/Modifier;JJLx1/b;Lc93/m;Lx1/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/x7;->w:I

    iput-object p2, p0, Lg1/x7;->x:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Lg1/x7;->y:J

    iput-wide p5, p0, Lg1/x7;->z:J

    iput-object p7, p0, Lg1/x7;->E:Lx1/b;

    iput-object p8, p0, Lg1/x7;->F:Lc93/m;

    iput-object p9, p0, Lg1/x7;->G:Lx1/b;

    iput p10, p0, Lg1/x7;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/x7;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget v0, p0, Lg1/x7;->w:I

    iget-object v1, p0, Lg1/x7;->x:Landroidx/compose/ui/Modifier;

    iget-wide v2, p0, Lg1/x7;->y:J

    iget-wide v4, p0, Lg1/x7;->z:J

    iget-object v6, p0, Lg1/x7;->E:Lx1/b;

    iget-object v7, p0, Lg1/x7;->F:Lc93/m;

    iget-object v8, p0, Lg1/x7;->G:Lx1/b;

    invoke-static/range {v0 .. v10}, Lg1/c8;->b(ILandroidx/compose/ui/Modifier;JJLx1/b;Lc93/m;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
