.class public final Lstream/video/sfu/event/HealthCheckRequest$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/event/HealthCheckRequest;
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
        "stream/video/sfu/event/HealthCheckRequest$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/event/HealthCheckRequest;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/event/HealthCheckRequest;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/event/HealthCheckRequest;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/event/HealthCheckRequest;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/event/HealthCheckRequest;",
        "redact",
        "(Lstream/video/sfu/event/HealthCheckRequest;)Lstream/video/sfu/event/HealthCheckRequest;",
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

    const-string v3, "type.googleapis.com/stream.video.sfu.event.HealthCheckRequest"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/event/HealthCheckRequest$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/HealthCheckRequest;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/event/HealthCheckRequest;
    .locals 4

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/squareup/wire/r;->g()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 4
    invoke-virtual {p1, v2}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1, v0, v1}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object p1

    .line 6
    new-instance v0, Lstream/video/sfu/event/HealthCheckRequest;

    invoke-direct {v0, p1}, Lstream/video/sfu/event/HealthCheckRequest;-><init>(Lne3/l;)V

    return-object v0
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/event/HealthCheckRequest;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/HealthCheckRequest$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/HealthCheckRequest;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/event/HealthCheckRequest;)V
    .locals 1

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/event/HealthCheckRequest;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/event/HealthCheckRequest$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/HealthCheckRequest;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/event/HealthCheckRequest;)V
    .locals 1

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/HealthCheckRequest;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/HealthCheckRequest$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/event/HealthCheckRequest;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/event/HealthCheckRequest;)I
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lne3/l;->d()I

    move-result p1

    return p1
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/event/HealthCheckRequest;

    invoke-virtual {p0, p1}, Lstream/video/sfu/event/HealthCheckRequest$Companion$ADAPTER$1;->redact(Lstream/video/sfu/event/HealthCheckRequest;)Lstream/video/sfu/event/HealthCheckRequest;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/event/HealthCheckRequest;)Lstream/video/sfu/event/HealthCheckRequest;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lne3/l;->E:Lne3/l;

    .line 3
    invoke-virtual {p1, v0}, Lstream/video/sfu/event/HealthCheckRequest;->copy(Lne3/l;)Lstream/video/sfu/event/HealthCheckRequest;

    move-result-object p1

    return-object p1
.end method
