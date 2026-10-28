.class public final synthetic Lc30/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lc30/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc30/a;->y:F

    iput p2, p0, Lc30/a;->x:I

    iput p3, p0, Lc30/a;->z:I

    return-void
.end method

.method public synthetic constructor <init>(IFI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lc30/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc30/a;->x:I

    iput p2, p0, Lc30/a;->y:F

    iput p3, p0, Lc30/a;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lc30/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v0, p0, Lc30/a;->x:I

    iget v1, p0, Lc30/a;->y:F

    iget v2, p0, Lc30/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lhy0/t1;->a(IFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lc30/a;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v0, p0, Lc30/a;->y:F

    iget v1, p0, Lc30/a;->z:I

    invoke-static {v0, p2, p1, v1}, Lds/p;->e(FILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
