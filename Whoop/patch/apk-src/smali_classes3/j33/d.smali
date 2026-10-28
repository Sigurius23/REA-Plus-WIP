.class public abstract Lj33/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Lb23/i;->a:Lb23/i;

    const-string v1, "VideoLayers"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    const v0, 0x493e0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "q"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xb71b0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "h"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x1312d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "f"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lj33/d;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Lstream/video/sfu/models/VideoDimension;Lstream/video/sfu/models/PublishOption;)Ljava/util/ArrayList;
    .locals 32

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lstream/video/sfu/models/VideoDimension;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lstream/video/sfu/models/VideoDimension;->getHeight()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lstream/video/sfu/models/PublishOption;->getBitrate()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lstream/video/sfu/models/PublishOption;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lstream/video/sfu/models/Codec;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Lj33/d;->c(Ljava/lang/String;)Z

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lstream/video/sfu/models/PublishOption;->getFps()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lstream/video/sfu/models/PublishOption;->getMax_spatial_layers()I

    move-result v7

    const/4 v8, 0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lstream/video/sfu/models/PublishOption;->getMax_temporal_layers()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lstream/video/sfu/models/PublishOption;->getVideo_dimension()Lstream/video/sfu/models/VideoDimension;

    move-result-object v10

    if-nez v10, :cond_1

    move-object/from16 v10, p0

    :cond_1
    invoke-virtual {v10}, Lstream/video/sfu/models/VideoDimension;->getHeight()I

    move-result v11

    invoke-virtual {v10}, Lstream/video/sfu/models/VideoDimension;->getWidth()I

    move-result v10

    if-lt v2, v11, :cond_2

    if-ge v1, v10, :cond_3

    :cond_2
    mul-int v12, v2, v1

    mul-int/2addr v11, v10

    int-to-double v12, v12

    int-to-double v10, v11

    div-double/2addr v12, v10

    int-to-double v10, v3

    mul-double/2addr v10, v12

    double-to-int v3, v10

    :cond_3
    const-string v10, "f"

    const-string v11, "h"

    const-string v12, "q"

    filled-new-array {v10, v11, v12}, [Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    invoke-static {v13, v7}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    move-wide/from16 v16, v14

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    const/16 v19, 0x0

    if-eqz v18, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v5, v18

    check-cast v5, Ljava/lang/String;

    move/from16 v30, v9

    int-to-double v8, v1

    div-double/2addr v8, v14

    double-to-int v8, v8

    move/from16 v23, v8

    int-to-double v8, v2

    div-double/2addr v8, v14

    double-to-int v8, v8

    move v9, v1

    move/from16 v31, v2

    int-to-double v1, v3

    div-double v1, v1, v16

    double-to-int v1, v1

    if-lez v1, :cond_4

    :goto_2
    move/from16 v25, v1

    goto :goto_3

    :cond_4
    sget-object v1, Lj33/d;->a:Ljava/lang/Object;

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_2

    :cond_5
    const v1, 0x1312d0

    goto :goto_2

    :goto_3
    new-instance v20, Lj33/c;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v26

    const/16 v21, 0x1

    const/16 v29, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v22, v5

    move/from16 v24, v8

    invoke-direct/range {v20 .. v29}, Lj33/c;-><init>(ZLjava/lang/String;IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Z)V

    move-object/from16 v1, v20

    if-eqz v4, :cond_7

    const/4 v2, 0x1

    if-le v7, v2, :cond_6

    const-string v2, "_KEY"

    goto :goto_4

    :cond_6
    const-string v2, ""

    :goto_4
    const-string v5, "L"

    const-string v8, "T"

    move/from16 v20, v3

    move/from16 v3, v30

    invoke-static {v7, v3, v5, v8, v2}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lj33/c;->g:Ljava/lang/String;

    goto :goto_5

    :cond_7
    move/from16 v20, v3

    move/from16 v3, v30

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lj33/c;->h:Ljava/lang/Double;

    :goto_5
    const/4 v2, 0x2

    move/from16 v30, v3

    int-to-double v2, v2

    mul-double/2addr v14, v2

    mul-double v16, v16, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move v1, v9

    move/from16 v3, v20

    move/from16 v9, v30

    move/from16 v2, v31

    const/4 v8, 0x1

    goto/16 :goto_1

    :cond_8
    const/4 v2, 0x0

    invoke-virtual/range {p0 .. p0}, Lstream/video/sfu/models/VideoDimension;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lstream/video/sfu/models/VideoDimension;->getHeight()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/16 v3, 0x140

    if-gt v1, v3, :cond_b

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lj33/c;

    iget-object v4, v4, Lj33/c;->b:Ljava/lang/String;

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    move-object v0, v1

    goto :goto_8

    :cond_b
    const/16 v3, 0x280

    if-gt v1, v3, :cond_d

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lj33/c;

    iget-object v4, v4, Lj33/c;->b:Ljava/lang/String;

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    :goto_8
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v5, v2

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v5, 0x1

    if-ltz v5, :cond_10

    check-cast v2, Lj33/c;

    if-eqz v5, :cond_f

    const/4 v4, 0x1

    if-eq v5, v4, :cond_e

    move-object v5, v10

    goto :goto_a

    :cond_e
    move-object v5, v11

    goto :goto_a

    :cond_f
    const/4 v4, 0x1

    move-object v5, v12

    :goto_a
    const/16 v6, 0x1fd

    invoke-static {v2, v5, v6}, Lj33/c;->a(Lj33/c;Ljava/lang/String;I)Lj33/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v3

    goto :goto_9

    :cond_10
    invoke-static {}, Lwb3/f;->d0()V

    throw v19

    :cond_11
    return-object v1
.end method

.method public static final b(Lstream/video/sfu/models/TrackType;)Z
    .locals 1

    const-string v0, "trackType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    if-eq p0, v0, :cond_1

    sget-object v0, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE_AUDIO:Lstream/video/sfu/models/TrackType;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final c(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "toLowerCase(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "vp9"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "av1"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "video/vp9"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "video/av1"

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final d(Lorg/webrtc/RtpParameters$Encoding;)Ljava/lang/String;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/RtpParameters$Encoding;->rid:Ljava/lang/String;

    iget-boolean v1, p0, Lorg/webrtc/RtpParameters$Encoding;->active:Z

    iget-object v2, p0, Lorg/webrtc/RtpParameters$Encoding;->scaleResolutionDownBy:Ljava/lang/Double;

    iget-object v3, p0, Lorg/webrtc/RtpParameters$Encoding;->maxBitrateBps:Ljava/lang/Integer;

    iget-object v4, p0, Lorg/webrtc/RtpParameters$Encoding;->maxFramerate:Ljava/lang/Integer;

    iget-object p0, p0, Lorg/webrtc/RtpParameters$Encoding;->scalabilityMode:Ljava/lang/String;

    const-string v5, ", active="

    const-string v6, ", scaleResolutionDownBy="

    const-string v7, "Encoding(rid="

    invoke-static {v7, v0, v5, v6, v1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxBitrateBps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxFramerate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scalabilityMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;)Lstream/video/sfu/models/VideoDimension;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/models/VideoDimension;

    iget v2, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget v3, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
