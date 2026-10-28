.class public final Lr8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    iget v0, p0, Lr8/b;->c:I

    iget-object v1, p0, Lr8/b;->a:Ljava/lang/String;

    iget v2, p0, Lr8/b;->b:I

    const/4 v3, 0x1

    if-ne p0, p1, :cond_0

    return v3

    :cond_0
    instance-of v4, p1, Lr8/b;

    const/4 v5, 0x0

    if-nez v4, :cond_1

    return v5

    :cond_1
    check-cast p1, Lr8/b;

    iget v4, p1, Lr8/b;->c:I

    iget-object v6, p1, Lr8/b;->a:Ljava/lang/String;

    iget p1, p1, Lr8/b;->b:I

    if-ltz v2, :cond_4

    if-gez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v1, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-ne v2, p1, :cond_3

    if-ne v0, v4, :cond_3

    return v3

    :cond_3
    return v5

    :cond_4
    :goto_0
    invoke-static {v1, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    if-ne v0, v4, :cond_5

    return v3

    :cond_5
    return v5
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lr8/b;->a:Ljava/lang/String;

    iget v1, p0, Lr8/b;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
