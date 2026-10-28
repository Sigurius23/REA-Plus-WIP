.class public final La3/t1;
.super Ly2/j1;
.source "SourceFile"


# instance fields
.field public final synthetic F:I


# direct methods
.method public constructor <init>(III)V
    .locals 4

    iput p3, p0, La3/t1;->F:I

    packed-switch p3, :pswitch_data_0

    invoke-direct {p0}, Ly2/j1;-><init>()V

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    int-to-long p1, p2

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ly2/j1;->r0(J)V

    return-void

    :pswitch_0
    invoke-direct {p0}, Ly2/j1;-><init>()V

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    int-to-long p1, p2

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ly2/j1;->r0(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final C0(JFLkotlin/jvm/functions/Function1;)V
    .locals 0

    return-void
.end method

.method private final F0(JFLkotlin/jvm/functions/Function1;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final c0(Ly2/a;)I
    .locals 0

    iget p1, p0, La3/t1;->F:I

    packed-switch p1, :pswitch_data_0

    const/high16 p1, -0x80000000

    return p1

    :pswitch_0
    const/high16 p1, -0x80000000

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o0(JFLkotlin/jvm/functions/Function1;)V
    .locals 0

    iget p1, p0, La3/t1;->F:I

    return-void
.end method
