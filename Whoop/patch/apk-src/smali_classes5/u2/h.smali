.class public abstract Lu2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/view/MotionEvent;I)J
    .locals 4

    invoke-virtual {p0, p1}, Landroid/view/MotionEvent;->getRawX(I)F

    move-result v0

    invoke-virtual {p0, p1}, Landroid/view/MotionEvent;->getRawY(I)F

    move-result p0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v0, p1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method
