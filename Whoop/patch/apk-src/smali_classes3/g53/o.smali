.class public final Lg53/o;
.super Lg53/x;
.source "SourceFile"


# instance fields
.field public final a:Lio/getstream/android/video/generated/models/ConnectedEvent;


# direct methods
.method public constructor <init>(Lio/getstream/android/video/generated/models/ConnectedEvent;)V
    .locals 1

    const-string v0, "connectedEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg53/o;->a:Lio/getstream/android/video/generated/models/ConnectedEvent;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg53/o;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lg53/o;

    iget-object v1, p0, Lg53/o;->a:Lio/getstream/android/video/generated/models/ConnectedEvent;

    iget-object p1, p1, Lg53/o;->a:Lio/getstream/android/video/generated/models/ConnectedEvent;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lg53/o;->a:Lio/getstream/android/video/generated/models/ConnectedEvent;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/ConnectedEvent;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ConnectionEstablished(connectedEvent="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lg53/o;->a:Lio/getstream/android/video/generated/models/ConnectedEvent;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
