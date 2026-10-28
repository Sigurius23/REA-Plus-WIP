.class public final Lbb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method public synthetic constructor <init>(IJB)V
    .locals 0

    .line 1
    iput p1, p0, Lbb/f;->a:I

    iput-wide p2, p0, Lbb/f;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IJI)V
    .locals 2

    packed-switch p4, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long p4, p2, v0

    if-ltz p4, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    .line 3
    :goto_0
    invoke-static {p4}, Llo/a;->e(Z)V

    .line 4
    iput p1, p0, Lbb/f;->a:I

    .line 5
    iput-wide p2, p0, Lbb/f;->b:J

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long p4, p2, v0

    if-ltz p4, :cond_1

    const/4 p4, 0x1

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    .line 7
    :goto_1
    invoke-static {p4}, Lva3/g;->d(Z)V

    .line 8
    iput p1, p0, Lbb/f;->a:I

    .line 9
    iput-wide p2, p0, Lbb/f;->b:J

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public static a(Lt9/o;Lx8/n;)Lbb/f;
    .locals 3

    iget-object v0, p1, Lx8/n;->a:[B

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {p0, v0, v2, v1}, Lt9/o;->p([BII)V

    invoke-virtual {p1, v2}, Lx8/n;->F(I)V

    invoke-virtual {p1}, Lx8/n;->g()I

    move-result p0

    invoke-virtual {p1}, Lx8/n;->k()J

    move-result-wide v0

    new-instance p1, Lbb/f;

    invoke-direct {p1, p0, v0, v1, v2}, Lbb/f;-><init>(IJB)V

    return-object p1
.end method

.method public static b(Lwm/j;Led3/a;)Lbb/f;
    .locals 3

    iget-object v0, p1, Led3/a;->a:[B

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-interface {p0, v0, v2, v1}, Lwm/j;->p([BII)V

    invoke-virtual {p1, v2}, Led3/a;->K(I)V

    invoke-virtual {p1}, Led3/a;->i()I

    move-result p0

    invoke-virtual {p1}, Led3/a;->m()J

    move-result-wide v0

    new-instance p1, Lbb/f;

    invoke-direct {p1, p0, v0, v1, v2}, Lbb/f;-><init>(IJB)V

    return-object p1
.end method
