.class public final Ldh/b;
.super Lne3/s;
.source "SourceFile"


# instance fields
.field public final synthetic x:I

.field public y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lne3/p0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ldh/b;->x:I

    invoke-direct {p0, p1}, Lne3/s;-><init>(Lne3/p0;)V

    return-void
.end method

.method public constructor <init>(Lpg3/z;Lne3/j;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldh/b;->x:I

    .line 2
    iput-object p1, p0, Ldh/b;->y:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lne3/s;-><init>(Lne3/p0;)V

    return-void
.end method


# virtual methods
.method public final h1(Lne3/h;J)J
    .locals 1

    iget v0, p0, Ldh/b;->x:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lne3/s;->h1(Lne3/h;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Ldh/b;->y:Ljava/lang/Object;

    check-cast p2, Lpg3/z;

    iput-object p1, p2, Lpg3/z;->E:Ljava/io/IOException;

    throw p1

    :pswitch_0
    :try_start_1
    invoke-super {p0, p1, p2, p3}, Lne3/s;->h1(Lne3/h;J)J

    move-result-wide p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-wide p1

    :catch_1
    move-exception p1

    iput-object p1, p0, Ldh/b;->y:Ljava/lang/Object;

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
