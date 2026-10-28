.class public final Lstream/video/sfu/event/SfuRequest$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/event/SfuRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/wire/q;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "stream/video/sfu/event/SfuRequest$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/event/SfuRequest;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/event/SfuRequest;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/event/SfuRequest;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/event/SfuRequest;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/event/SfuRequest;",
        "redact",
        "(Lstream/video/sfu/event/SfuRequest;)Lstream/video/sfu/event/SfuRequest;",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/wire/d;",
            "Lj93/d;",
            "Lcom/squareup/wire/x;",
            ")V"
        }
    .end annotation

    const/4 v5, 0x0

    const-string v6, "video/sfu/event/events.proto"

    const-string v3, "type.googleapis.com/stream.video.sfu.event.SfuRequest"

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/squareup/wire/q;-><init>(Lcom/squareup/wire/d;Lj93/d;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic decode(Lcom/squareup/wire/r;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lstream/video/sfu/event/SfuRequest$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/SfuRequest;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/SfuRequest;
    .locals 7

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v0

    const/4 v2, 0x0

    move-object v3, v2

    move-object v4, v3

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_3

    const/4 v6, 0x1

    if-eq v5, v6, :cond_2

    const/4 v6, 0x2

    if-eq v5, v6, :cond_1

    const/4 v6, 0x3

    if-eq v5, v6, :cond_0

    .line 4
    invoke-virtual {p1, v5}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_0

    .line 5
    :cond_0
    sget-object v4, Lstream/video/sfu/event/LeaveCallRequest;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v4, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    .line 6
    :cond_1
    sget-object v3, Lstream/video/sfu/event/HealthCheckRequest;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    .line 7
    :cond_2
    sget-object v2, Lstream/video/sfu/event/JoinRequest;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v2, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object p1

    .line 9
    new-instance v0, Lstream/video/sfu/event/SfuRequest;

    .line 10
    check-cast v2, Lstream/video/sfu/event/JoinRequest;

    .line 11
    check-cast v3, Lstream/video/sfu/event/HealthCheckRequest;

    .line 12
    check-cast v4, Lstream/video/sfu/event/LeaveCallRequest;

    .line 13
    invoke-direct {v0, v2, v3, v4, p1}, Lstream/video/sfu/event/SfuRequest;-><init>(Lstream/video/sfu/event/JoinRequest;Lstream/video/sfu/event/HealthCheckRequest;Lstream/video/sfu/event/LeaveCallRequest;Lne3/l;)V

    return-object v0
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/event/SfuRequest;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/SfuRequest$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/SfuRequest;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/SfuRequest;)V
    .locals 3

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lstream/video/sfu/event/JoinRequest;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuRequest;->getJoin_request()Lstream/video/sfu/event/JoinRequest;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 4
    sget-object v0, Lstream/video/sfu/event/HealthCheckRequest;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuRequest;->getHealth_check_request()Lstream/video/sfu/event/HealthCheckRequest;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 5
    sget-object v0, Lstream/video/sfu/event/LeaveCallRequest;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuRequest;->getLeave_call_request()Lstream/video/sfu/event/LeaveCallRequest;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 6
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/event/SfuRequest;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/SfuRequest$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/SfuRequest;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/SfuRequest;)V
    .locals 3

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 8
    sget-object v0, Lstream/video/sfu/event/LeaveCallRequest;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x3

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuRequest;->getLeave_call_request()Lstream/video/sfu/event/LeaveCallRequest;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 9
    sget-object v0, Lstream/video/sfu/event/HealthCheckRequest;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuRequest;->getHealth_check_request()Lstream/video/sfu/event/HealthCheckRequest;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 10
    sget-object v0, Lstream/video/sfu/event/JoinRequest;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/event/SfuRequest;->getJoin_request()Lstream/video/sfu/event/JoinRequest;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/SfuRequest;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/SfuRequest$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/event/SfuRequest;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/event/SfuRequest;)I
    .locals 4

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lne3/l;->d()I

    move-result v0

    .line 4
    sget-object v1, Lstream/video/sfu/event/JoinRequest;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuRequest;->getJoin_request()Lstream/video/sfu/event/JoinRequest;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    .line 5
    sget-object v0, Lstream/video/sfu/event/HealthCheckRequest;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuRequest;->getHealth_check_request()Lstream/video/sfu/event/HealthCheckRequest;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    .line 6
    sget-object v1, Lstream/video/sfu/event/LeaveCallRequest;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x3

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuRequest;->getLeave_call_request()Lstream/video/sfu/event/LeaveCallRequest;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/SfuRequest;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/SfuRequest$Companion$ADAPTER$1;->redact(Lstream/video/sfu/event/SfuRequest;)Lstream/video/sfu/event/SfuRequest;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/event/SfuRequest;)Lstream/video/sfu/event/SfuRequest;
    .locals 4

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lstream/video/sfu/event/SfuRequest;->getJoin_request()Lstream/video/sfu/event/JoinRequest;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Lstream/video/sfu/event/JoinRequest;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v2, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/JoinRequest;

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 3
    :goto_0
    invoke-virtual {p1}, Lstream/video/sfu/event/SfuRequest;->getHealth_check_request()Lstream/video/sfu/event/HealthCheckRequest;

    move-result-object v2

    if-eqz v2, :cond_1

    sget-object v3, Lstream/video/sfu/event/HealthCheckRequest;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v3, v2}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lstream/video/sfu/event/HealthCheckRequest;

    goto :goto_1

    :cond_1
    move-object v2, v1

    .line 4
    :goto_1
    invoke-virtual {p1}, Lstream/video/sfu/event/SfuRequest;->getLeave_call_request()Lstream/video/sfu/event/LeaveCallRequest;

    move-result-object v3

    if-eqz v3, :cond_2

    sget-object v1, Lstream/video/sfu/event/LeaveCallRequest;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v1, v3}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lstream/video/sfu/event/LeaveCallRequest;

    .line 5
    :cond_2
    sget-object v3, Lne3/l;->E:Lne3/l;

    .line 6
    invoke-virtual {p1, v0, v2, v1, v3}, Lstream/video/sfu/event/SfuRequest;->copy(Lstream/video/sfu/event/JoinRequest;Lstream/video/sfu/event/HealthCheckRequest;Lstream/video/sfu/event/LeaveCallRequest;Lne3/l;)Lstream/video/sfu/event/SfuRequest;

    move-result-object p1

    return-object p1
.end method
