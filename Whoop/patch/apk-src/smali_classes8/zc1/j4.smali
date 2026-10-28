.class public final synthetic Lzc1/j4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lj71/c;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lj71/c;II)V
    .locals 0

    iput p3, p0, Lzc1/j4;->w:I

    iput-object p1, p0, Lzc1/j4;->x:Lj71/c;

    iput p2, p0, Lzc1/j4;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lzc1/j4;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzc1/j4;->x:Lj71/c;

    iget v1, p0, Lzc1/j4;->y:I

    invoke-static {v0, v1, p1, p2}, Lzc1/z8;->b(Lj71/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzc1/j4;->x:Lj71/c;

    iget v1, p0, Lzc1/j4;->y:I

    invoke-static {v0, v1, p1, p2}, Lzc1/k4;->a(Lj71/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
