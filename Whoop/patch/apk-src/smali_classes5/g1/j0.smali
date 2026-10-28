.class public final synthetic Lg1/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lx1/b;

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(JJFLl0/k1;Ll0/b2;Landroidx/compose/ui/Modifier;Lx1/b;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lg1/j0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg1/j0;->y:J

    iput-wide p3, p0, Lg1/j0;->z:J

    iput p5, p0, Lg1/j0;->E:F

    iput-object p6, p0, Lg1/j0;->H:Ljava/lang/Object;

    iput-object p7, p0, Lg1/j0;->I:Ljava/lang/Object;

    iput-object p8, p0, Lg1/j0;->x:Landroidx/compose/ui/Modifier;

    iput-object p9, p0, Lg1/j0;->F:Lx1/b;

    iput p10, p0, Lg1/j0;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lc93/m;Li2/a1;JJFLx1/b;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lg1/j0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/j0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg1/j0;->H:Ljava/lang/Object;

    iput-object p3, p0, Lg1/j0;->I:Ljava/lang/Object;

    iput-wide p4, p0, Lg1/j0;->y:J

    iput-wide p6, p0, Lg1/j0;->z:J

    iput p8, p0, Lg1/j0;->E:F

    iput-object p9, p0, Lg1/j0;->F:Lx1/b;

    iput p10, p0, Lg1/j0;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lg1/j0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/j0;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/m;

    iget-object v0, p0, Lg1/j0;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Li2/a1;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/j0;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v1, p0, Lg1/j0;->x:Landroidx/compose/ui/Modifier;

    iget-wide v4, p0, Lg1/j0;->y:J

    iget-wide v6, p0, Lg1/j0;->z:J

    iget v8, p0, Lg1/j0;->E:F

    iget-object v9, p0, Lg1/j0;->F:Lx1/b;

    invoke-static/range {v1 .. v11}, Lg1/s6;->b(Landroidx/compose/ui/Modifier;Lc93/m;Li2/a1;JJFLx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/j0;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ll0/k1;

    iget-object v0, p0, Lg1/j0;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ll0/b2;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/j0;->G:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-wide v1, p0, Lg1/j0;->y:J

    iget-wide v3, p0, Lg1/j0;->z:J

    iget v5, p0, Lg1/j0;->E:F

    iget-object v8, p0, Lg1/j0;->x:Landroidx/compose/ui/Modifier;

    iget-object v9, p0, Lg1/j0;->F:Lx1/b;

    invoke-static/range {v1 .. v11}, Lg1/n0;->a(JJFLl0/k1;Ll0/b2;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
