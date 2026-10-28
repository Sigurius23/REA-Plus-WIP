.class public final synthetic Lg1/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:F

.field public final synthetic G:Lx1/b;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:I

.field public final synthetic J:Lkotlin/jvm/functions/Function3;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(ILandroidx/compose/ui/Modifier;JJFLx1/b;Lc93/m;Lx1/b;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg1/h0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/h0;->x:I

    iput-object p2, p0, Lg1/h0;->y:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Lg1/h0;->z:J

    iput-wide p5, p0, Lg1/h0;->E:J

    iput p7, p0, Lg1/h0;->F:F

    iput-object p8, p0, Lg1/h0;->G:Lx1/b;

    iput-object p9, p0, Lg1/h0;->H:Lc93/m;

    iput-object p10, p0, Lg1/h0;->J:Lkotlin/jvm/functions/Function3;

    iput p11, p0, Lg1/h0;->I:I

    return-void
.end method

.method public synthetic constructor <init>(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lg1/h0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/h0;->G:Lx1/b;

    iput-object p2, p0, Lg1/h0;->y:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lg1/h0;->H:Lc93/m;

    iput-object p4, p0, Lg1/h0;->J:Lkotlin/jvm/functions/Function3;

    iput-wide p5, p0, Lg1/h0;->z:J

    iput-wide p7, p0, Lg1/h0;->E:J

    iput p9, p0, Lg1/h0;->F:F

    iput p10, p0, Lg1/h0;->x:I

    iput p11, p0, Lg1/h0;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lg1/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/h0;->J:Lkotlin/jvm/functions/Function3;

    move-object v10, v0

    check-cast v10, Lx1/b;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/h0;->I:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget v1, p0, Lg1/h0;->x:I

    iget-object v2, p0, Lg1/h0;->y:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lg1/h0;->z:J

    iget-wide v5, p0, Lg1/h0;->E:J

    iget v7, p0, Lg1/h0;->F:F

    iget-object v8, p0, Lg1/h0;->G:Lx1/b;

    iget-object v9, p0, Lg1/h0;->H:Lc93/m;

    invoke-static/range {v1 .. v12}, Lg1/c8;->a(ILandroidx/compose/ui/Modifier;JJFLx1/b;Lc93/m;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/h0;->x:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v0, p0, Lg1/h0;->G:Lx1/b;

    iget-object v1, p0, Lg1/h0;->y:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lg1/h0;->H:Lc93/m;

    iget-object v3, p0, Lg1/h0;->J:Lkotlin/jvm/functions/Function3;

    iget-wide v4, p0, Lg1/h0;->z:J

    iget-wide v6, p0, Lg1/h0;->E:J

    iget v8, p0, Lg1/h0;->F:F

    iget v11, p0, Lg1/h0;->I:I

    invoke-static/range {v0 .. v11}, Lg1/n0;->d(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
