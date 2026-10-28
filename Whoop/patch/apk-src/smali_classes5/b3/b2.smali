.class public final Lb3/b2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Landroid/os/Parcel;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb3/b2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lb3/b2;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    iput-object v0, p0, Lb3/b2;->b:Landroid/os/Parcel;

    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 5
    array-length v2, p1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 6

    sget v0, Li2/x;->o:I

    iget-object v0, p0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    const-wide/16 v2, 0x3f

    and-long/2addr v2, v0

    const-wide/16 v4, 0x10

    cmp-long v4, v2, v4

    if-gez v4, :cond_0

    return-wide v0

    :cond_0
    const-wide/16 v4, -0x40

    and-long/2addr v0, v4

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public b()J
    .locals 5

    iget-object v0, p0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v0}, Landroid/os/Parcel;->readByte()B

    move-result v1

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    if-ne v1, v2, :cond_0

    const-wide v1, 0x100000000L

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    const-wide v1, 0x200000000L

    goto :goto_0

    :cond_1
    move-wide v1, v3

    :goto_0
    invoke-static {v1, v2, v3, v4}, Ly3/p;->a(JJ)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-wide v0, Ly3/o;->c:J

    return-wide v0

    :cond_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    invoke-static {v0, v1, v2}, Lv63/c;->j(FJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(B)V
    .locals 1

    iget v0, p0, Lb3/b2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeByte(B)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeByte(B)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(F)V
    .locals 1

    iget v0, p0, Lb3/b2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeFloat(F)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeFloat(F)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(J)V
    .locals 8

    iget v0, p0, Lb3/b2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Ly3/o;->b(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const-wide v6, 0x100000000L

    invoke-static {v0, v1, v6, v7}, Ly3/p;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const-wide v6, 0x200000000L

    invoke-static {v0, v1, v6, v7}, Ly3/p;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x2

    :cond_2
    :goto_0
    invoke-virtual {p0, v5}, Lb3/b2;->c(B)V

    invoke-static {p1, p2}, Ly3/o;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    invoke-virtual {p0, p1}, Lb3/b2;->d(F)V

    :cond_3
    return-void

    :pswitch_0
    invoke-static {p1, p2}, Ly3/o;->b(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    const-wide v6, 0x100000000L

    invoke-static {v0, v1, v6, v7}, Ly3/p;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v5, 0x1

    goto :goto_1

    :cond_5
    const-wide v6, 0x200000000L

    invoke-static {v0, v1, v6, v7}, Ly3/p;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v5, 0x2

    :cond_6
    :goto_1
    invoke-virtual {p0, v5}, Lb3/b2;->c(B)V

    invoke-static {p1, p2}, Ly3/o;->b(J)J

    move-result-wide v0

    invoke-static {v0, v1, v2, v3}, Ly3/p;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {p1, p2}, Ly3/o;->c(J)F

    move-result p1

    invoke-virtual {p0, p1}, Lb3/b2;->d(F)V

    :cond_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(J)V
    .locals 4

    const-wide/16 v0, 0x3f

    and-long/2addr v0, p1

    const-wide/16 v2, 0x10

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v2, -0x40

    and-long/2addr p1, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    or-long/2addr p1, v0

    :goto_0
    iget-object v0, p0, Lb3/b2;->b:Landroid/os/Parcel;

    invoke-virtual {v0, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
