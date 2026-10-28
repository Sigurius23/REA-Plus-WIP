.class public final Lyn/g;
.super Lxn/h;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public J:J


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 6

    check-cast p1, Lyn/g;

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, La9/a;->f(I)Z

    move-result v1

    invoke-virtual {p1, v0}, La9/a;->f(I)Z

    move-result v2

    if-eq v1, v2, :cond_0

    invoke-virtual {p0, v0}, La9/a;->f(I)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lum/c;->F:J

    iget-wide v2, p1, Lum/c;->F:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    iget-wide v0, p0, Lyn/g;->J:J

    iget-wide v4, p1, Lyn/g;->J:J

    sub-long/2addr v0, v4

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    cmp-long p1, v0, v2

    if-lez p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, -0x1

    return p1
.end method
