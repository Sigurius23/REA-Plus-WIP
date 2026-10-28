.class public final synthetic Lt61/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FLd0/e;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lt61/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt61/a;->y:F

    iput-object p2, p0, Lt61/a;->x:Ljava/lang/Object;

    iput p3, p0, Lt61/a;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Lu61/d;FII)V
    .locals 0

    .line 2
    iput p4, p0, Lt61/a;->w:I

    iput-object p1, p0, Lt61/a;->x:Ljava/lang/Object;

    iput p2, p0, Lt61/a;->y:F

    iput p3, p0, Lt61/a;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lt61/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt61/a;->x:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lt61/a;->y:F

    iget v2, p0, Lt61/a;->z:I

    invoke-static {v1, v0, v2, p1, p2}, Lwn1/f;->a(FLd0/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lt61/a;->x:Ljava/lang/Object;

    check-cast v0, Lu61/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lt61/a;->y:F

    iget v2, p0, Lt61/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lt61/b;->a(Lu61/d;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lt61/a;->x:Ljava/lang/Object;

    check-cast v0, Lu61/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lt61/a;->y:F

    iget v2, p0, Lt61/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lt61/b;->b(Lu61/d;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
