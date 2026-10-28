.class public interface abstract Lyf/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/t;
.implements Ljava/nio/channels/WritableByteChannel;


# direct methods
.method public static synthetic B(Lyf/l;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p0, v0, p1}, Lyf/l;->z(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic X(Lyf/k;[B)V
    .locals 2

    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lyf/k;->write([BII)V

    return-void
.end method


# virtual methods
.method public abstract C(Lyf/u;)J
.end method

.method public abstract e()V
.end method

.method public abstract f()Lyf/k;
.end method

.method public abstract z(ILjava/lang/String;)V
.end method
