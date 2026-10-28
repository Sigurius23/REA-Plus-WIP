.class public final Ll0/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(Ly2/q0;Ly2/q0;J)V
    .locals 2

    sget-object v0, Ll0/c1;->w:Ll0/c1;

    invoke-static {p3, p4, v0}, Ll0/g2;->c(JLl0/c1;)J

    move-result-wide p3

    if-eqz p1, :cond_0

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result v0

    invoke-interface {p1, v0}, Ly2/q0;->O(I)I

    move-result v0

    invoke-interface {p1, v0}, Ly2/q0;->C(I)I

    move-result p1

    invoke-static {v0, p1}, La0/q;->a(II)J

    move-result-wide v0

    new-instance p1, La0/q;

    invoke-direct {p1, v0, v1}, La0/q;-><init>(J)V

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result p1

    invoke-interface {p2, p1}, Ly2/q0;->O(I)I

    move-result p1

    invoke-interface {p2, p1}, Ly2/q0;->C(I)I

    move-result p2

    invoke-static {p1, p2}, La0/q;->a(II)J

    move-result-wide p1

    new-instance p3, La0/q;

    invoke-direct {p3, p1, p2}, La0/q;-><init>(J)V

    :cond_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Ll0/o0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object p1, Ll0/n0;->w:Ll0/n0;

    return v0
.end method

.method public final hashCode()I
    .locals 3

    sget-object v0, Ll0/n0;->w:Ll0/n0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FlowLayoutOverflowState(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ll0/n0;->w:Ll0/n0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
