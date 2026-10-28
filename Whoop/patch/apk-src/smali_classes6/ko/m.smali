.class public final Lko/m;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final E:Ljava/lang/Object;

.field public final F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final x:[B

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lko/l;Lko/n;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lko/m;->w:I

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    iput-boolean v0, p0, Lko/m;->y:Z

    .line 3
    iput-boolean v0, p0, Lko/m;->z:Z

    .line 4
    iput-object p1, p0, Lko/m;->E:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Lko/m;->F:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 6
    new-array p1, p1, [B

    iput-object p1, p0, Lko/m;->x:[B

    return-void
.end method

.method public constructor <init>(Lz8/f;Lz8/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lko/m;->w:I

    .line 7
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lko/m;->y:Z

    .line 9
    iput-boolean v0, p0, Lko/m;->z:Z

    .line 10
    iput-object p1, p0, Lko/m;->E:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, Lko/m;->F:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 12
    new-array p1, p1, [B

    iput-object p1, p0, Lko/m;->x:[B

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    iget-boolean v0, p0, Lko/m;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lko/m;->E:Ljava/lang/Object;

    check-cast v0, Lko/l;

    iget-object v1, p0, Lko/m;->F:Ljava/lang/Object;

    check-cast v1, Lko/n;

    invoke-interface {v0, v1}, Lko/l;->z(Lko/n;)J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lko/m;->y:Z

    :cond_0
    return-void
.end method

.method public final close()V
    .locals 1

    iget v0, p0, Lko/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lko/m;->z:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lko/m;->E:Ljava/lang/Object;

    check-cast v0, Lz8/f;

    invoke-interface {v0}, Lz8/f;->close()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lko/m;->z:Z

    :cond_0
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lko/m;->z:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lko/m;->E:Ljava/lang/Object;

    check-cast v0, Lko/l;

    invoke-interface {v0}, Lko/l;->close()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lko/m;->z:Z

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read()I
    .locals 4

    iget v0, p0, Lko/m;->w:I

    packed-switch v0, :pswitch_data_0

    .line 1
    iget-object v0, p0, Lko/m;->x:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Lko/m;->read([BII)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    aget-byte v0, v0, v2

    and-int/lit16 v3, v0, 0xff

    :goto_0
    return v3

    .line 3
    :pswitch_0
    iget-object v0, p0, Lko/m;->x:[B

    array-length v1, v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Lko/m;->read([BII)I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_1

    goto :goto_1

    .line 4
    :cond_1
    aget-byte v0, v0, v2

    and-int/lit16 v3, v0, 0xff

    :goto_1
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read([B)I
    .locals 2

    iget v0, p0, Lko/m;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    .line 5
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lko/m;->read([BII)I

    move-result p1

    return p1

    :pswitch_0
    const/4 v0, 0x0

    .line 6
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lko/m;->read([BII)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read([BII)I
    .locals 3

    iget v0, p0, Lko/m;->w:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Lko/m;->E:Ljava/lang/Object;

    check-cast v0, Lz8/f;

    iget-boolean v1, p0, Lko/m;->z:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Lva3/g;->i(Z)V

    .line 8
    iget-boolean v1, p0, Lko/m;->y:Z

    if-nez v1, :cond_0

    .line 9
    iget-object v1, p0, Lko/m;->F:Ljava/lang/Object;

    check-cast v1, Lz8/g;

    invoke-interface {v0, v1}, Lz8/f;->open(Lz8/g;)J

    .line 10
    iput-boolean v2, p0, Lko/m;->y:Z

    .line 11
    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lu8/h;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    move p1, p2

    :cond_1
    return p1

    .line 12
    :pswitch_0
    iget-boolean v0, p0, Lko/m;->z:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Llo/a;->i(Z)V

    .line 13
    invoke-virtual {p0}, Lko/m;->b()V

    .line 14
    iget-object v0, p0, Lko/m;->E:Ljava/lang/Object;

    check-cast v0, Lko/l;

    invoke-interface {v0, p1, p2, p3}, Lko/i;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    move p1, p2

    :cond_2
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
