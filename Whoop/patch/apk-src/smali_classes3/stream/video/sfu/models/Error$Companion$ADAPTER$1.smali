.class public final Lstream/video/sfu/models/Error$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/models/Error;
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
        "stream/video/sfu/models/Error$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/models/Error;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/models/Error;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/models/Error;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/models/Error;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/models/Error;",
        "redact",
        "(Lstream/video/sfu/models/Error;)Lstream/video/sfu/models/Error;",
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

    const-string v6, "video/sfu/models/models.proto"

    const-string v3, "type.googleapis.com/stream.video.sfu.models.Error"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/models/Error$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/Error;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/Error;
    .locals 8

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNSPECIFIED:Lstream/video/sfu/models/ErrorCode;

    .line 3
    invoke-virtual {p1}, Lcom/squareup/wire/r;->d()J

    move-result-wide v1

    const-string v3, ""

    const/4 v4, 0x0

    .line 4
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

    .line 5
    invoke-virtual {p1, v5}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_0

    .line 6
    :cond_0
    sget-object v4, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    invoke-virtual {v4, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    goto :goto_0

    .line 7
    :cond_1
    sget-object v3, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v3, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    .line 8
    :cond_2
    :try_start_0
    sget-object v6, Lstream/video/sfu/models/ErrorCode;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v6, p1}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    .line 9
    iget v6, v6, Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;->w:I

    int-to-long v6, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    sget-object v7, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    invoke-virtual {p1, v5, v7, v6}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p1, v1, v2}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object p1

    .line 11
    new-instance v1, Lstream/video/sfu/models/Error;

    .line 12
    check-cast v0, Lstream/video/sfu/models/ErrorCode;

    .line 13
    check-cast v3, Ljava/lang/String;

    .line 14
    invoke-direct {v1, v0, v3, v4, p1}, Lstream/video/sfu/models/Error;-><init>(Lstream/video/sfu/models/ErrorCode;Ljava/lang/String;ZLne3/l;)V

    return-object v1
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/models/Error;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/Error$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/Error;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/Error;)V
    .locals 3

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNSPECIFIED:Lstream/video/sfu/models/ErrorCode;

    if-eq v0, v1, :cond_0

    sget-object v0, Lstream/video/sfu/models/ErrorCode;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    .line 4
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v2

    .line 5
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 6
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 7
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getShould_retry()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 8
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getShould_retry()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    .line 9
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 10
    :cond_2
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/models/Error;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/Error$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/Error;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/Error;)V
    .locals 3

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 12
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getShould_retry()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 13
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getShould_retry()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    .line 14
    invoke-virtual {v0, p1, v2, v1}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 15
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 16
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v0

    sget-object v1, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNSPECIFIED:Lstream/video/sfu/models/ErrorCode;

    if-eq v0, v1, :cond_2

    sget-object v0, Lstream/video/sfu/models/ErrorCode;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    .line 17
    invoke-virtual {p2}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object p2

    .line 18
    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/Error;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/Error$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/models/Error;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/models/Error;)I
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
    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v1

    sget-object v2, Lstream/video/sfu/models/ErrorCode;->ERROR_CODE_UNSPECIFIED:Lstream/video/sfu/models/ErrorCode;

    if-eq v1, v2, :cond_0

    .line 5
    sget-object v1, Lstream/video/sfu/models/ErrorCode;->ADAPTER:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 6
    :cond_0
    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 7
    :cond_1
    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getShould_retry()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lcom/squareup/wire/q;->BOOL:Lcom/squareup/wire/q;

    .line 8
    invoke-virtual {p1}, Lstream/video/sfu/models/Error;->getShould_retry()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v2, 0x3

    .line 9
    invoke-virtual {v1, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v0

    return p1

    :cond_2
    return v0
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/Error;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/Error$Companion$ADAPTER$1;->redact(Lstream/video/sfu/models/Error;)Lstream/video/sfu/models/Error;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/models/Error;)Lstream/video/sfu/models/Error;
    .locals 8

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v5, Lne3/l;->E:Lne3/l;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    .line 3
    invoke-static/range {v1 .. v7}, Lstream/video/sfu/models/Error;->copy$default(Lstream/video/sfu/models/Error;Lstream/video/sfu/models/ErrorCode;Ljava/lang/String;ZLne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/Error;

    move-result-object p1

    return-object p1
.end method
