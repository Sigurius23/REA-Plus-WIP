.class public final Lstream/video/sfu/models/Call$Companion$ADAPTER$1;
.super Lcom/squareup/wire/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lstream/video/sfu/models/Call;
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
        "stream/video/sfu/models/Call$Companion$ADAPTER$1",
        "Lcom/squareup/wire/q;",
        "Lstream/video/sfu/models/Call;",
        "value",
        "",
        "encodedSize",
        "(Lstream/video/sfu/models/Call;)I",
        "Lcom/squareup/wire/s;",
        "writer",
        "Ll83/a0;",
        "encode",
        "(Lcom/squareup/wire/s;Lstream/video/sfu/models/Call;)V",
        "Lcom/squareup/wire/v;",
        "(Lcom/squareup/wire/v;Lstream/video/sfu/models/Call;)V",
        "Lcom/squareup/wire/r;",
        "reader",
        "decode",
        "(Lcom/squareup/wire/r;)Lstream/video/sfu/models/Call;",
        "redact",
        "(Lstream/video/sfu/models/Call;)Lstream/video/sfu/models/Call;",
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

    const-string v3, "type.googleapis.com/stream.video.sfu.models.Call"

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
    invoke-virtual {p0, p1}, Lstream/video/sfu/models/Call$Companion$ADAPTER$1;->decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/Call;

    move-result-object p1

    return-object p1
.end method

.method public decode(Lcom/squareup/wire/r;)Lstream/video/sfu/models/Call;
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "reader"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lcom/squareup/wire/r;->d()J

    move-result-wide v1

    const-string v3, ""

    const/4 v4, 0x0

    move-object v5, v3

    move-object v6, v5

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v4, v6

    .line 3
    :goto_0
    invoke-virtual {v0}, Lcom/squareup/wire/r;->g()I

    move-result v10

    const/4 v11, -0x1

    if-eq v10, v11, :cond_0

    packed-switch v10, :pswitch_data_0

    .line 4
    invoke-virtual {v0, v10}, Lcom/squareup/wire/r;->j(I)V

    goto :goto_0

    .line 5
    :pswitch_0
    sget-object v9, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    invoke-virtual {v9, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_0

    .line 6
    :pswitch_1
    sget-object v8, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    invoke-virtual {v8, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v8

    goto :goto_0

    .line 7
    :pswitch_2
    sget-object v7, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    invoke-virtual {v7, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_0

    .line 8
    :pswitch_3
    sget-object v6, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v6, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    .line 9
    :pswitch_4
    sget-object v5, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v5, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_0

    .line 10
    :pswitch_5
    sget-object v4, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v4, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    .line 11
    :pswitch_6
    sget-object v3, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    invoke-virtual {v3, v0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/squareup/wire/r;->e(J)Lne3/l;

    move-result-object v18

    .line 13
    new-instance v10, Lstream/video/sfu/models/Call;

    .line 14
    move-object v11, v3

    check-cast v11, Ljava/lang/String;

    .line 15
    move-object v12, v4

    check-cast v12, Ljava/lang/String;

    .line 16
    move-object v13, v5

    check-cast v13, Ljava/lang/String;

    .line 17
    move-object v14, v6

    check-cast v14, Ljava/lang/String;

    .line 18
    move-object v15, v7

    check-cast v15, Ljava/util/Map;

    .line 19
    move-object/from16 v16, v8

    check-cast v16, Ljava/time/Instant;

    .line 20
    move-object/from16 v17, v9

    check-cast v17, Ljava/time/Instant;

    .line 21
    invoke-direct/range {v10 .. v18}, Lstream/video/sfu/models/Call;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/time/Instant;Ljava/time/Instant;Lne3/l;)V

    return-object v10

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lstream/video/sfu/models/Call;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/Call$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/Call;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/s;Lstream/video/sfu/models/Call;)V
    .locals 4

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 4
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 5
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCreated_by_user_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x3

    .line 6
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCreated_by_user_id()Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 8
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getHost_user_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x4

    .line 9
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getHost_user_id()Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 11
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCustom()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    const/4 v1, 0x5

    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCustom()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 12
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCreated_at()Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    .line 13
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCreated_at()Ljava/time/Instant;

    move-result-object v2

    .line 14
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 15
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getUpdated_at()Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v0, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    const/4 v1, 0x7

    .line 16
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getUpdated_at()Ljava/time/Instant;

    move-result-object v2

    .line 17
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    .line 18
    :cond_6
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/squareup/wire/s;->a(Lne3/l;)V

    return-void
.end method

.method public bridge synthetic encode(Lcom/squareup/wire/v;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lstream/video/sfu/models/Call;

    invoke-virtual {p0, p1, p2}, Lstream/video/sfu/models/Call$Companion$ADAPTER$1;->encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/Call;)V

    return-void
.end method

.method public encode(Lcom/squareup/wire/v;Lstream/video/sfu/models/Call;)V
    .locals 4

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p2}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/wire/v;->d(Lne3/l;)V

    .line 20
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getUpdated_at()Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    const/4 v1, 0x7

    .line 21
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getUpdated_at()Ljava/time/Instant;

    move-result-object v2

    .line 22
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 23
    :cond_0
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCreated_at()Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    const/4 v1, 0x6

    .line 24
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCreated_at()Ljava/time/Instant;

    move-result-object v2

    .line 25
    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 26
    :cond_1
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCustom()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    const/4 v1, 0x5

    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCustom()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 27
    :cond_2
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getHost_user_id()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x4

    .line 28
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getHost_user_id()Ljava/lang/String;

    move-result-object v3

    .line 29
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 30
    :cond_3
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCreated_by_user_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x3

    .line 31
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getCreated_by_user_id()Ljava/lang/String;

    move-result-object v3

    .line 32
    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 33
    :cond_4
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x2

    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p1, v2, v3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    .line 34
    :cond_5
    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v1, 0x1

    invoke-virtual {p2}, Lstream/video/sfu/models/Call;->getType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/v;ILjava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public bridge synthetic encodedSize(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/Call;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/Call$Companion$ADAPTER$1;->encodedSize(Lstream/video/sfu/models/Call;)I

    move-result p1

    return p1
.end method

.method public encodedSize(Lstream/video/sfu/models/Call;)I
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lne3/l;->d()I

    move-result v0

    .line 4
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x1

    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x2

    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 6
    :cond_1
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getCreated_by_user_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v3, 0x3

    .line 7
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getCreated_by_user_id()Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-virtual {v1, v3, v4}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 9
    :cond_2
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getHost_user_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lcom/squareup/wire/q;->STRING:Lcom/squareup/wire/q;

    const/4 v2, 0x4

    .line 10
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getHost_user_id()Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 12
    :cond_3
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getCustom()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_4

    sget-object v1, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    const/4 v2, 0x5

    .line 13
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getCustom()Ljava/util/Map;

    move-result-object v3

    .line 14
    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 15
    :cond_4
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getCreated_at()Ljava/time/Instant;

    move-result-object v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    const/4 v2, 0x6

    .line 16
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getCreated_at()Ljava/time/Instant;

    move-result-object v3

    .line 17
    invoke-virtual {v1, v2, v3}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 18
    :cond_5
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getUpdated_at()Ljava/time/Instant;

    move-result-object v1

    if-eqz v1, :cond_6

    sget-object v1, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    const/4 v2, 0x7

    .line 19
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getUpdated_at()Ljava/time/Instant;

    move-result-object p1

    .line 20
    invoke-virtual {v1, v2, p1}, Lcom/squareup/wire/q;->encodedSizeWithTag(ILjava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v0

    return p1

    :cond_6
    return v0
.end method

.method public bridge synthetic redact(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lstream/video/sfu/models/Call;

    invoke-virtual {p0, p1}, Lstream/video/sfu/models/Call$Companion$ADAPTER$1;->redact(Lstream/video/sfu/models/Call;)Lstream/video/sfu/models/Call;

    move-result-object p1

    return-object p1
.end method

.method public redact(Lstream/video/sfu/models/Call;)Lstream/video/sfu/models/Call;
    .locals 13

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getCustom()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Lcom/squareup/wire/q;->STRUCT_MAP:Lcom/squareup/wire/q;

    invoke-virtual {v2, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object v7, v1

    .line 3
    :goto_0
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getCreated_at()Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v2, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    invoke-virtual {v2, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/time/Instant;

    move-object v8, v0

    goto :goto_1

    :cond_1
    move-object v8, v1

    .line 4
    :goto_1
    invoke-virtual {p1}, Lstream/video/sfu/models/Call;->getUpdated_at()Ljava/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v1, Lcom/squareup/wire/q;->INSTANT:Lcom/squareup/wire/q;

    invoke-virtual {v1, v0}, Lcom/squareup/wire/q;->redact(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/time/Instant;

    :cond_2
    move-object v9, v1

    .line 5
    sget-object v10, Lne3/l;->E:Lne3/l;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    .line 6
    invoke-static/range {v2 .. v12}, Lstream/video/sfu/models/Call;->copy$default(Lstream/video/sfu/models/Call;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/time/Instant;Ljava/time/Instant;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/models/Call;

    move-result-object p1

    return-object p1
.end method
