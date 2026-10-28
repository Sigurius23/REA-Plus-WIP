.class public final Li4/h;
.super Li4/c;
.source "SourceFile"


# direct methods
.method public static j(Ljava/lang/String;)Li4/h;
    .locals 3

    new-instance v0, Li4/h;

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    invoke-direct {v0, v1}, Li4/c;-><init>([C)V

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Li4/c;->x:J

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Li4/c;->g(J)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li4/h;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Li4/c;->c()Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Li4/h;

    invoke-virtual {v2}, Li4/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    invoke-super {p0, p1}, Li4/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
