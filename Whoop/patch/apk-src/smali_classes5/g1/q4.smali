.class public final synthetic Lg1/q4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FIIJJLandroidx/compose/ui/Modifier;)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    iput p3, p0, Lg1/q4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p8, p0, Lg1/q4;->x:Landroidx/compose/ui/Modifier;

    iput-wide p4, p0, Lg1/q4;->y:J

    iput p1, p0, Lg1/q4;->z:F

    iput-wide p6, p0, Lg1/q4;->E:J

    iput p2, p0, Lg1/q4;->F:I

    return-void
.end method

.method public synthetic constructor <init>(FLandroidx/compose/ui/Modifier;JJI)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lg1/q4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/q4;->z:F

    iput-object p2, p0, Lg1/q4;->x:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Lg1/q4;->y:J

    iput-wide p5, p0, Lg1/q4;->E:J

    iput p7, p0, Lg1/q4;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JFJIIB)V
    .locals 0

    .line 3
    iput p8, p0, Lg1/q4;->w:I

    iput-object p1, p0, Lg1/q4;->x:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Lg1/q4;->y:J

    iput p4, p0, Lg1/q4;->z:F

    iput-wide p5, p0, Lg1/q4;->E:J

    iput p7, p0, Lg1/q4;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lg1/q4;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/q4;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v2

    iget v1, p0, Lg1/q4;->z:F

    iget-wide v3, p0, Lg1/q4;->y:J

    iget-wide v5, p0, Lg1/q4;->E:J

    iget-object v8, p0, Lg1/q4;->x:Landroidx/compose/ui/Modifier;

    invoke-static/range {v1 .. v8}, Ls4/g;->a(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x187

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v2

    iget v0, p0, Lg1/q4;->z:F

    iget v1, p0, Lg1/q4;->F:I

    iget-wide v3, p0, Lg1/q4;->y:J

    iget-wide v5, p0, Lg1/q4;->E:J

    iget-object v8, p0, Lg1/q4;->x:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v8}, Ll1/i3;->b(FIIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_0

    :pswitch_1
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/q4;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v1

    iget v0, p0, Lg1/q4;->z:F

    iget-wide v2, p0, Lg1/q4;->y:J

    iget-wide v4, p0, Lg1/q4;->E:J

    iget-object v7, p0, Lg1/q4;->x:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v7}, Lg1/v4;->a(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_0

    :pswitch_2
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/q4;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v1

    iget v0, p0, Lg1/q4;->z:F

    iget-wide v2, p0, Lg1/q4;->y:J

    iget-wide v4, p0, Lg1/q4;->E:J

    iget-object v7, p0, Lg1/q4;->x:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v7}, Lg1/v4;->d(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
