.class public final synthetic Ll0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb2/f;


# direct methods
.method public synthetic constructor <init>(Lb2/f;I)V
    .locals 0

    iput p2, p0, Ll0/c;->w:I

    iput-object p1, p0, Ll0/c;->x:Lb2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ll0/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly3/l;

    check-cast p2, Ly3/m;

    iget-wide v0, p1, Ly3/l;->a:J

    const/16 p1, 0x20

    shr-long/2addr v0, p1

    long-to-int v0, v0

    iget-object v1, p0, Ll0/c;->x:Lb2/f;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0, p2}, Lb2/f;->a(IILy3/m;)I

    move-result p2

    int-to-long v0, p2

    shl-long p1, v0, p1

    int-to-long v0, v2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long/2addr p1, v0

    new-instance v0, Ly3/j;

    invoke-direct {v0, p1, p2}, Ly3/j;-><init>(J)V

    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ly3/m;

    const/4 v0, 0x0

    iget-object v1, p0, Ll0/c;->x:Lb2/f;

    invoke-interface {v1, v0, p1, p2}, Lb2/f;->a(IILy3/m;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
