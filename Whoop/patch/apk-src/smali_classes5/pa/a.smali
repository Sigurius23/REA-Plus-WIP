.class public final Lpa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/n;


# instance fields
.field public final synthetic a:I

.field public final b:Lt9/n;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, Lpa/a;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    .line 6
    new-instance p1, Lt9/g0;

    const/4 v0, 0x2

    const-string v1, "image/jpeg"

    const v2, 0xffd8

    invoke-direct {p1, v2, v0, v1}, Lt9/g0;-><init>(IILjava/lang/String;)V

    iput-object p1, p0, Lpa/a;->b:Lt9/n;

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Lba/a;

    invoke-direct {p1}, Lba/a;-><init>()V

    iput-object p1, p0, Lpa/a;->b:Lt9/n;

    :goto_0
    return-void
.end method

.method public constructor <init>(IB)V
    .locals 2

    iput p1, p0, Lpa/a;->a:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lt9/g0;

    const/4 p2, 0x2

    const-string v0, "image/png"

    const v1, 0x8950

    invoke-direct {p1, v1, p2, v0}, Lt9/g0;-><init>(IILjava/lang/String;)V

    iput-object p1, p0, Lpa/a;->b:Lt9/n;

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p1, Lt9/g0;

    const/4 p2, 0x2

    const-string v0, "image/bmp"

    const/16 v1, 0x424d

    invoke-direct {p1, v1, p2, v0}, Lt9/g0;-><init>(IILjava/lang/String;)V

    iput-object p1, p0, Lpa/a;->b:Lt9/n;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final a()V
    .locals 0

    return-void
.end method

.method private final c()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final b(JJ)V
    .locals 1

    iget v0, p0, Lpa/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    invoke-interface {v0, p1, p2, p3, p4}, Lt9/n;->b(JJ)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    check-cast v0, Lt9/g0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lt9/g0;->b(JJ)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    check-cast v0, Lt9/g0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lt9/g0;->b(JJ)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lt9/q;)V
    .locals 1

    iget v0, p0, Lpa/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    invoke-interface {v0, p1}, Lt9/n;->g(Lt9/q;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    check-cast v0, Lt9/g0;

    invoke-virtual {v0, p1}, Lt9/g0;->g(Lt9/q;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    check-cast v0, Lt9/g0;

    invoke-virtual {v0, p1}, Lt9/g0;->g(Lt9/q;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lt9/o;)Z
    .locals 1

    iget v0, p0, Lpa/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    invoke-interface {v0, p1}, Lt9/n;->h(Lt9/o;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    check-cast v0, Lt9/g0;

    invoke-virtual {v0, p1}, Lt9/g0;->h(Lt9/o;)Z

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    check-cast v0, Lt9/g0;

    invoke-virtual {v0, p1}, Lt9/g0;->h(Lt9/o;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lt9/o;Lt9/s;)I
    .locals 1

    iget v0, p0, Lpa/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    invoke-interface {v0, p1, p2}, Lt9/n;->i(Lt9/o;Lt9/s;)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    check-cast v0, Lt9/g0;

    invoke-virtual {v0, p1, p2}, Lt9/g0;->i(Lt9/o;Lt9/s;)I

    move-result p1

    return p1

    :pswitch_1
    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    check-cast v0, Lt9/g0;

    invoke-virtual {v0, p1, p2}, Lt9/g0;->i(Lt9/o;Lt9/s;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final release()V
    .locals 1

    iget v0, p0, Lpa/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpa/a;->b:Lt9/n;

    invoke-interface {v0}, Lt9/n;->release()V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
