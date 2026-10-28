.class public final Ly2/v0;
.super Ly2/j1;
.source "SourceFile"


# direct methods
.method public constructor <init>(II)V
    .locals 4

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
.end method


# virtual methods
.method public final c0(Ly2/a;)I
    .locals 0

    const/high16 p1, -0x80000000

    return p1
.end method

.method public final o0(JFLkotlin/jvm/functions/Function1;)V
    .locals 0

    return-void
.end method
