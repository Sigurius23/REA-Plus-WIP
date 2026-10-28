.class public final Laa3/k0;
.super Laa3/e0;
.source "SourceFile"


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Laa3/k0;->a:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    new-instance v0, Ll83/v;

    iget-wide v1, p0, Laa3/k0;->a:J

    invoke-direct {v0, v1, v2}, Ll83/v;-><init>(J)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Laa3/k0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Laa3/k0;

    iget-wide v3, p0, Laa3/k0;->a:J

    iget-wide v5, p1, Laa3/k0;->a:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-wide v0, p0, Laa3/k0;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method
