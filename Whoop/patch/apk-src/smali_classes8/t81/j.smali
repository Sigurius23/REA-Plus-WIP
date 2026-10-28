.class public final synthetic Lt81/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:J

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FJZLl83/k;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lt81/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt81/j;->G:Ljava/lang/Object;

    iput p2, p0, Lt81/j;->x:F

    iput-wide p3, p0, Lt81/j;->y:J

    iput-boolean p5, p0, Lt81/j;->z:Z

    iput-object p6, p0, Lt81/j;->H:Ljava/lang/Object;

    iput p7, p0, Lt81/j;->E:I

    iput p8, p0, Lt81/j;->F:I

    return-void
.end method

.method public synthetic constructor <init>(ZLt81/r;FIJLc93/n;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lt81/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lt81/j;->z:Z

    iput-object p2, p0, Lt81/j;->G:Ljava/lang/Object;

    iput p3, p0, Lt81/j;->x:F

    iput p4, p0, Lt81/j;->E:I

    iput-wide p5, p0, Lt81/j;->y:J

    iput-object p7, p0, Lt81/j;->H:Ljava/lang/Object;

    iput p8, p0, Lt81/j;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lt81/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt81/j;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lt81/j;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ll83/k;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v2, p0, Lt81/j;->x:F

    iget-wide v3, p0, Lt81/j;->y:J

    iget-boolean v5, p0, Lt81/j;->z:Z

    iget v7, p0, Lt81/j;->E:I

    iget v8, p0, Lt81/j;->F:I

    invoke-static/range {v1 .. v10}, Ly11/g;->a(Landroidx/compose/ui/Modifier;FJZLl83/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lt81/j;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lt81/r;

    iget-object v0, p0, Lt81/j;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/n;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v1, p0, Lt81/j;->z:Z

    iget v3, p0, Lt81/j;->x:F

    iget v4, p0, Lt81/j;->E:I

    iget-wide v5, p0, Lt81/j;->y:J

    iget v8, p0, Lt81/j;->F:I

    invoke-static/range {v1 .. v10}, Lt81/l;->c(ZLt81/r;FIJLc93/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
