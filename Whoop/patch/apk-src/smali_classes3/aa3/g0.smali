.class public final Laa3/g0;
.super Laa3/e0;
.source "SourceFile"


# instance fields
.field public final a:S


# direct methods
.method public constructor <init>(S)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-short p1, p0, Laa3/g0;->a:S

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-short v0, p0, Laa3/g0;->a:S

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Laa3/g0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Laa3/g0;

    iget-short v1, p0, Laa3/g0;->a:S

    iget-short p1, p1, Laa3/g0;->a:S

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-short v0, p0, Laa3/g0;->a:S

    invoke-static {v0}, Ljava/lang/Short;->hashCode(S)I

    move-result v0

    return v0
.end method
