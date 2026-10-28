.class public interface abstract Ltb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# virtual methods
.method public B0()Z
    .locals 5

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public abstract J0(I)Ljava/lang/String;
.end method

.method public abstract L(ILjava/lang/String;)V
.end method

.method public abstract e1()Z
.end method

.method public abstract getBlob(I)[B
.end method

.method public abstract getColumnCount()I
.end method

.method public abstract getColumnName(I)Ljava/lang/String;
.end method

.method public abstract getDouble(I)D
.end method

.method public abstract getLong(I)J
.end method

.method public abstract isNull(I)Z
.end method

.method public abstract p(IJ)V
.end method

.method public abstract q(I[B)V
.end method

.method public abstract reset()V
.end method

.method public abstract t(DI)V
.end method

.method public abstract u(I)V
.end method

.method public abstract w()V
.end method
