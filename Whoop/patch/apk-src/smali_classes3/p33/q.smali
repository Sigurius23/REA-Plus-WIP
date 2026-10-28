.class public abstract Lp33/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lorg/webrtc/MediaStreamTrack;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lorg/webrtc/MediaStreamTrack;->kind()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lorg/webrtc/MediaStreamTrack;->enabled()Z

    move-result v2

    invoke-virtual {p0}, Lorg/webrtc/MediaStreamTrack;->state()Lorg/webrtc/MediaStreamTrack$State;

    move-result-object p0

    const-string v3, ", kind="

    const-string v4, ", enabled: "

    const-string v5, "MediaStreamTrack(id="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lstream/video/sfu/models/PeerType;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lp33/p;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const-string p0, "subscriber"

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "publisher"

    return-object p0
.end method
