.class public final synthetic Lz72/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkd1/o;

.field public final synthetic y:F

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lkd1/o;FII)V
    .locals 0

    iput p4, p0, Lz72/e;->w:I

    iput-object p1, p0, Lz72/e;->x:Lkd1/o;

    iput p2, p0, Lz72/e;->y:F

    iput p3, p0, Lz72/e;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lz72/e;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lz72/e;->x:Lkd1/o;

    iget v1, p0, Lz72/e;->y:F

    iget v2, p0, Lz72/e;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lzd0/b;->i(Lkd1/o;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lz72/e;->x:Lkd1/o;

    iget v1, p0, Lz72/e;->y:F

    iget v2, p0, Lz72/e;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lz72/g;->A(Lkd1/o;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
