.class public final Lno/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:[F

.field public final d:[F


# direct methods
.method public constructor <init>(I[F[FII)V
    .locals 6

    packed-switch p5, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lno/f;->a:I

    array-length p1, p2

    int-to-long v0, p1

    const-wide/16 v2, 0x2

    mul-long/2addr v0, v2

    array-length p1, p3

    int-to-long v2, p1

    const-wide/16 v4, 0x3

    mul-long/2addr v2, v4

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Llo/a;->e(Z)V

    iput-object p2, p0, Lno/f;->c:[F

    iput-object p3, p0, Lno/f;->d:[F

    iput p4, p0, Lno/f;->b:I

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lno/f;->a:I

    array-length p1, p2

    int-to-long v0, p1

    const-wide/16 v2, 0x2

    mul-long/2addr v0, v2

    array-length p1, p3

    int-to-long v2, p1

    const-wide/16 v4, 0x3

    mul-long/2addr v2, v4

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Lva3/g;->d(Z)V

    iput-object p2, p0, Lno/f;->c:[F

    iput-object p3, p0, Lno/f;->d:[F

    iput p4, p0, Lno/f;->b:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
