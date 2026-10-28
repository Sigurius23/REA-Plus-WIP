.class public abstract Lw23/v;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/webrtc/PeerConnection$IceConnectionState;)Lw23/t;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lw23/u;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    sget-object p0, Lw23/t;->z:Lw23/t;

    return-object p0

    :cond_1
    sget-object p0, Lw23/t;->y:Lw23/t;

    return-object p0

    :cond_2
    sget-object p0, Lw23/t;->x:Lw23/t;

    return-object p0
.end method
