.class public final Lt9/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/e0;


# virtual methods
.method public final c(J)Lt9/d0;
    .locals 4

    new-instance v0, Lt9/d0;

    new-instance v1, Lt9/f0;

    const-wide/16 v2, 0x0

    invoke-direct {v1, p1, p2, v2, v3}, Lt9/f0;-><init>(JJ)V

    invoke-direct {v0, v1, v1}, Lt9/d0;-><init>(Lt9/f0;Lt9/f0;)V

    return-object v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method
