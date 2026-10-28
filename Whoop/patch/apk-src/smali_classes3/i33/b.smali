.class public final Li33/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lstream/video/sfu/models/PublishOption;

.field public final b:Lorg/webrtc/RtpTransceiver;


# direct methods
.method public constructor <init>(Lorg/webrtc/RtpTransceiver;Lstream/video/sfu/models/PublishOption;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    iput-object p1, p0, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li33/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Li33/b;

    iget-object v1, p0, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    iget-object v3, p1, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    iget-object p1, p1, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v0}, Lstream/video/sfu/models/PublishOption;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TransceiverId(publishOption="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transceiver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
