.class public abstract Lj33/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lstream/video/sfu/models/DegradationPreference;)Lorg/webrtc/RtpParameters$DegradationPreference;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj33/a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lorg/webrtc/RtpParameters$DegradationPreference;->MAINTAIN_FRAMERATE_AND_RESOLUTION:Lorg/webrtc/RtpParameters$DegradationPreference;

    return-object p0

    :cond_2
    sget-object p0, Lorg/webrtc/RtpParameters$DegradationPreference;->MAINTAIN_RESOLUTION:Lorg/webrtc/RtpParameters$DegradationPreference;

    return-object p0

    :cond_3
    sget-object p0, Lorg/webrtc/RtpParameters$DegradationPreference;->MAINTAIN_FRAMERATE:Lorg/webrtc/RtpParameters$DegradationPreference;

    return-object p0

    :cond_4
    sget-object p0, Lorg/webrtc/RtpParameters$DegradationPreference;->BALANCED:Lorg/webrtc/RtpParameters$DegradationPreference;

    return-object p0
.end method
