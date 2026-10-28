.class public final synthetic Ll0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb2/g;


# direct methods
.method public synthetic constructor <init>(Lb2/g;I)V
    .locals 0

    iput p2, p0, Ll0/d;->w:I

    iput-object p1, p0, Ll0/d;->x:Lb2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ll0/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly3/l;

    check-cast p2, Ly3/m;

    iget-wide p1, p1, Ly3/l;->a:J

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p1, p1

    iget-object p2, p0, Ll0/d;->x:Lb2/g;

    check-cast p2, Lb2/l;

    const/4 v2, 0x0

    invoke-virtual {p2, v2, p1}, Lb2/l;->a(II)I

    move-result p1

    int-to-long v2, v2

    const/16 p2, 0x20

    shl-long/2addr v2, p2

    int-to-long p1, p1

    and-long/2addr p1, v0

    or-long/2addr p1, v2

    new-instance v0, Ly3/j;

    invoke-direct {v0, p1, p2}, Ly3/j;-><init>(J)V

    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ly3/m;

    const/4 p2, 0x0

    iget-object v0, p0, Ll0/d;->x:Lb2/g;

    check-cast v0, Lb2/l;

    invoke-virtual {v0, p2, p1}, Lb2/l;->a(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
