.class public final Lt23/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt23/c0;

.field public final b:Ll83/p;

.field public final c:Lm63/d;

.field public final d:Lm63/d;

.field public final e:Lec3/h2;


# direct methods
.method public constructor <init>(Lt23/c0;Lhc3/d;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/t0;->a:Lt23/c0;

    const-string p1, "CallStats"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt23/t0;->b:Ll83/p;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    iget-object p2, p2, Lhc3/d;->w:Lq83/j;

    invoke-interface {p2, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance p2, Lm63/d;

    invoke-direct {p2, p1}, Lm63/d;-><init>(Lhc3/d;)V

    iput-object p2, p0, Lt23/t0;->c:Lm63/d;

    new-instance p2, Lm63/d;

    invoke-direct {p2, p1}, Lm63/d;-><init>(Lhc3/d;)V

    iput-object p2, p0, Lt23/t0;->d:Lm63/d;

    const/4 p2, 0x0

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lt23/t0;->e:Lec3/h2;

    const-wide/16 v1, 0x0

    const/4 v3, 0x3

    invoke-static {v3, v1, v2}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v1

    invoke-static {v0, p1, v1, p2}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    return-void
.end method


# virtual methods
.method public final a(Ln33/q;Z)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lt23/t0;->a:Lt23/c0;

    iget-object v2, v2, Lt23/c0;->C:Lec3/h2;

    if-nez v1, :cond_0

    goto/16 :goto_25

    :cond_0
    const-string v3, "certificate"

    const-string v4, "data-channel"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld33/h1;

    sget-object v5, Lm83/z;->w:Lm83/z;

    if-eqz v4, :cond_1

    iget-object v4, v4, Ld33/h1;->z:Lec3/h2;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le33/v0;

    if-eqz v4, :cond_1

    iget-object v4, v4, Le33/v0;->M:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v4}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v5

    :goto_0
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld33/h1;

    if-eqz v2, :cond_2

    iget-object v2, v2, Ld33/h1;->z:Lec3/h2;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le33/v0;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Le33/v0;->s()Ljava/util/LinkedHashMap;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v5

    :goto_1
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, v1, Ln33/q;->a:Lorg/webrtc/RTCStatsReport;

    invoke-virtual {v1}, Lorg/webrtc/RTCStatsReport;->getStatsMap()Ljava/util/Map;

    move-result-object v1

    const-string v7, "getStatsMap(...)"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    iget-object v8, v0, Lt23/t0;->b:Ll83/p;

    const-string v9, ":"

    if-eqz v7, :cond_3a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/webrtc/RTCStats;

    invoke-virtual {v7}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v3, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_39

    const-string v13, "/"

    const-string v14, "mimeType"

    const-string v15, ""

    if-eqz v11, :cond_4

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v16

    const-string v10, "kind"

    sparse-switch v16, :sswitch_data_0

    :goto_3
    goto :goto_4

    :sswitch_0
    const-string v12, "track"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    :cond_4
    :goto_4
    move-object/from16 v17, v1

    goto/16 :goto_7

    :sswitch_1
    const-string v9, "codec"

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v7}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/lang/String;

    if-eqz v10, :cond_6

    check-cast v9, Ljava/lang/String;

    goto :goto_5

    :cond_6
    const/4 v9, 0x0

    :goto_5
    if-eqz v9, :cond_7

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x6

    invoke-static {v9, v10, v11}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v9

    invoke-static {v9}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_7

    const-string v10, "codec:"

    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_4

    :cond_7
    move-object/from16 v17, v1

    const/4 v11, 0x0

    goto :goto_7

    :sswitch_2
    const-string v12, "outbound-rtp"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {v7}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    move-object/from16 v17, v1

    const-string v1, "rid"

    invoke-interface {v12, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v7}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v1, :cond_9

    invoke-static {v1, v9}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_9
    move-object v1, v15

    :goto_6
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    goto :goto_7

    :sswitch_3
    move-object/from16 v17, v1

    const-string v1, "inbound-rtp"

    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v7}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    :goto_7
    if-eqz v11, :cond_c

    invoke-interface {v6, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    invoke-virtual {v6, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_c

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    const-string v1, " @ "

    const-string v7, " x "

    iget-object v10, v0, Lt23/t0;->c:Lm63/d;

    if-eqz p2, :cond_1c

    const-string v11, "outbound-rtp:video:f"

    invoke-virtual {v6, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    const-string v12, "getMembers(...)"

    if-eqz v11, :cond_d

    invoke-static {v11}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lorg/webrtc/RTCStats;

    if-eqz v11, :cond_d

    invoke-virtual {v11}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Lrg/a;->l(Ljava/util/Map;)Lt23/y1;

    move-result-object v11

    goto :goto_8

    :cond_d
    const/4 v11, 0x0

    :goto_8
    const-string v9, "outbound-rtp:video:h"

    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    if-eqz v9, :cond_e

    invoke-static {v9}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lorg/webrtc/RTCStats;

    if-eqz v9, :cond_e

    invoke-virtual {v9}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lrg/a;->l(Ljava/util/Map;)Lt23/y1;

    move-result-object v9

    :goto_9
    move-object/from16 v18, v3

    goto :goto_a

    :cond_e
    const/4 v9, 0x0

    goto :goto_9

    :goto_a
    const-string v3, "outbound-rtp:video:q"

    invoke-virtual {v6, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_f

    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/webrtc/RTCStats;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lrg/a;->l(Ljava/util/Map;)Lt23/y1;

    move-result-object v3

    goto :goto_b

    :cond_f
    const/4 v3, 0x0

    :goto_b
    if-eqz v11, :cond_12

    iget-object v12, v11, Lt23/y1;->c:Ljava/lang/Long;

    if-eqz v12, :cond_10

    iget-object v12, v11, Lt23/y1;->d:Ljava/lang/Long;

    if-eqz v12, :cond_10

    iget-object v12, v11, Lt23/y1;->e:Ljava/lang/Double;

    if-eqz v12, :cond_10

    goto :goto_c

    :cond_10
    const/4 v11, 0x0

    :goto_c
    if-nez v11, :cond_11

    goto :goto_d

    :cond_11
    move-object v3, v11

    goto :goto_f

    :cond_12
    :goto_d
    if-eqz v9, :cond_13

    iget-object v11, v9, Lt23/y1;->c:Ljava/lang/Long;

    if-eqz v11, :cond_13

    iget-object v11, v9, Lt23/y1;->d:Ljava/lang/Long;

    if-eqz v11, :cond_13

    iget-object v11, v9, Lt23/y1;->e:Ljava/lang/Double;

    if-eqz v11, :cond_13

    goto :goto_e

    :cond_13
    const/4 v9, 0x0

    :goto_e
    if-nez v9, :cond_15

    if-eqz v3, :cond_14

    iget-object v9, v3, Lt23/y1;->c:Ljava/lang/Long;

    if-eqz v9, :cond_14

    iget-object v9, v3, Lt23/y1;->d:Ljava/lang/Long;

    if-eqz v9, :cond_14

    iget-object v9, v3, Lt23/y1;->e:Ljava/lang/Double;

    if-eqz v9, :cond_14

    goto :goto_f

    :cond_14
    const/4 v3, 0x0

    goto :goto_f

    :cond_15
    move-object v3, v9

    :goto_f
    iget-object v9, v10, Lm63/d;->E:Ljava/lang/Object;

    check-cast v9, Lec3/h2;

    if-eqz v3, :cond_16

    iget-object v11, v3, Lt23/y1;->a:Ljava/lang/String;

    if-nez v11, :cond_17

    :cond_16
    move-object v11, v15

    :cond_17
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x0

    invoke-virtual {v9, v12, v11}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v9, v10, Lm63/d;->F:Ljava/lang/Object;

    check-cast v9, Lec3/h2;

    if-eqz v3, :cond_18

    iget-object v11, v3, Lt23/y1;->b:Ljava/lang/Double;

    if-eqz v11, :cond_18

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    move-object/from16 v19, v5

    move-wide/from16 v20, v11

    const/16 v5, 0x3e8

    int-to-double v11, v5

    mul-double v11, v11, v20

    double-to-int v5, v11

    goto :goto_10

    :cond_18
    move-object/from16 v19, v5

    const/4 v5, 0x0

    :goto_10
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x0

    invoke-virtual {v9, v12, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v3, :cond_1b

    iget-object v5, v3, Lt23/y1;->c:Ljava/lang/Long;

    if-eqz v5, :cond_19

    iget-object v5, v3, Lt23/y1;->d:Ljava/lang/Long;

    if-eqz v5, :cond_19

    iget-object v5, v3, Lt23/y1;->e:Ljava/lang/Double;

    if-nez v5, :cond_1a

    :cond_19
    const/4 v3, 0x0

    :cond_1a
    if-eqz v3, :cond_1b

    iget-object v5, v3, Lt23/y1;->c:Ljava/lang/Long;

    iget-object v9, v3, Lt23/y1;->d:Ljava/lang/Long;

    iget-object v3, v3, Lt23/y1;->e:Ljava/lang/Double;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "fps"

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_11

    :cond_1b
    const/4 v3, 0x0

    :goto_11
    if-eqz v3, :cond_1d

    iget-object v5, v10, Lm63/d;->z:Ljava/lang/Object;

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x0

    invoke-virtual {v5, v12, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_12

    :cond_1c
    move-object/from16 v18, v3

    move-object/from16 v19, v5

    :cond_1d
    :goto_12
    const-string v3, "outbound-rtp:video"

    invoke-virtual {v6, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const-string v5, " fps"

    const-string v9, "framesPerSecond"

    const-string v11, "jitter"

    const-string v12, "frameHeight"

    move-object/from16 v20, v3

    const-string v3, "frameWidth"

    if-eqz v20, :cond_26

    invoke-static/range {v20 .. v20}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lorg/webrtc/RTCStats;

    if-eqz v20, :cond_26

    move-object/from16 v21, v8

    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v22, v13

    instance-of v13, v8, Ljava/lang/Double;

    if-eqz v13, :cond_1e

    check-cast v8, Ljava/lang/Double;

    goto :goto_13

    :cond_1e
    const/4 v8, 0x0

    :goto_13
    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v23, v8

    instance-of v8, v13, Ljava/lang/Long;

    if-eqz v8, :cond_1f

    move-object v8, v13

    check-cast v8, Ljava/lang/Long;

    goto :goto_14

    :cond_1f
    const/4 v8, 0x0

    :goto_14
    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v24, v15

    instance-of v15, v13, Ljava/lang/Long;

    if-eqz v15, :cond_20

    check-cast v13, Ljava/lang/Long;

    goto :goto_15

    :cond_20
    const/4 v13, 0x0

    :goto_15
    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v25, v14

    instance-of v14, v15, Ljava/lang/Double;

    if-eqz v14, :cond_21

    move-object v14, v15

    check-cast v14, Ljava/lang/Double;

    goto :goto_16

    :cond_21
    const/4 v14, 0x0

    :goto_16
    invoke-virtual/range {v20 .. v20}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v15

    move-object/from16 v20, v2

    const-string v2, "qualityLimitationReason"

    invoke-interface {v15, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v15, v2, Ljava/lang/String;

    if-eqz v15, :cond_22

    check-cast v2, Ljava/lang/String;

    goto :goto_17

    :cond_22
    const/4 v2, 0x0

    :goto_17
    iget-object v15, v10, Lm63/d;->E:Ljava/lang/Object;

    check-cast v15, Lec3/h2;

    if-nez v2, :cond_23

    move-object/from16 v2, v24

    :cond_23
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v24, v4

    const/4 v4, 0x0

    invoke-virtual {v15, v4, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v23, :cond_24

    iget-object v2, v10, Lm63/d;->F:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v26

    move-object/from16 v23, v5

    const/16 v15, 0x3e8

    int-to-double v4, v15

    mul-double v4, v4, v26

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_18

    :cond_24
    move-object/from16 v23, v5

    :goto_18
    if-eqz v8, :cond_25

    if-eqz v13, :cond_25

    if-eqz v14, :cond_25

    iget-object v2, v10, Lm63/d;->z:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v23

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_19

    :cond_25
    move-object/from16 v5, v23

    goto :goto_19

    :cond_26
    move-object/from16 v20, v2

    move-object/from16 v24, v4

    move-object/from16 v21, v8

    move-object/from16 v22, v13

    move-object/from16 v25, v14

    :goto_19
    const-string v2, "inbound-rtp:video"

    invoke-virtual {v6, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object v4, v0, Lt23/t0;->d:Lm63/d;

    if-eqz v2, :cond_2a

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/RTCStats;

    if-eqz v2, :cond_2a

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const-string v11, "null cannot be cast to non-null type kotlin.Double"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/Double;

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    instance-of v11, v8, Ljava/lang/Long;

    if-eqz v11, :cond_27

    check-cast v8, Ljava/lang/Long;

    goto :goto_1a

    :cond_27
    const/4 v8, 0x0

    :goto_1a
    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v15, v11, Ljava/lang/Long;

    if-eqz v15, :cond_28

    check-cast v11, Ljava/lang/Long;

    goto :goto_1b

    :cond_28
    const/4 v11, 0x0

    :goto_1b
    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v9, v2, Ljava/lang/Double;

    if-eqz v9, :cond_29

    check-cast v2, Ljava/lang/Double;

    goto :goto_1c

    :cond_29
    const/4 v2, 0x0

    :goto_1c
    iget-object v9, v4, Lm63/d;->F:Ljava/lang/Object;

    check-cast v9, Lec3/h2;

    move-wide/from16 v26, v13

    const/16 v15, 0x3e8

    int-to-double v13, v15

    mul-double v13, v13, v26

    double-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x0

    invoke-virtual {v9, v14, v13}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v8, :cond_2a

    if-eqz v11, :cond_2a

    if-eqz v2, :cond_2a

    iget-object v9, v4, Lm63/d;->z:Ljava/lang/Object;

    check-cast v9, Lec3/h2;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_2a
    const-string v1, "candidate-pair"

    invoke-virtual {v6, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_30

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/RTCStats;

    if-eqz v1, :cond_30

    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    const-string v5, "currentRoundTripTime"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/lang/Double;

    if-eqz v5, :cond_2b

    check-cast v2, Ljava/lang/Double;

    goto :goto_1d

    :cond_2b
    const/4 v2, 0x0

    :goto_1d
    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    const-string v7, "availableOutgoingBitrate"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/Double;

    if-eqz v7, :cond_2c

    check-cast v5, Ljava/lang/Double;

    goto :goto_1e

    :cond_2c
    const/4 v5, 0x0

    :goto_1e
    invoke-virtual {v1}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v1

    const-string v7, "availableIncomingBitrate"

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v7, v1, Ljava/lang/Double;

    if-eqz v7, :cond_2d

    check-cast v1, Ljava/lang/Double;

    goto :goto_1f

    :cond_2d
    const/4 v1, 0x0

    :goto_1f
    if-eqz v2, :cond_2e

    iget-object v7, v10, Lm63/d;->x:Ljava/lang/Object;

    check-cast v7, Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    const/16 v15, 0x3e8

    int-to-double v13, v15

    mul-double/2addr v8, v13

    double-to-int v2, v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x0

    invoke-virtual {v7, v14, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2e
    if-eqz v5, :cond_2f

    iget-object v2, v10, Lm63/d;->G:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    const/16 v15, 0x3e8

    int-to-double v13, v15

    div-double/2addr v7, v13

    double-to-float v5, v7

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x0

    invoke-virtual {v2, v14, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2f
    if-eqz v1, :cond_30

    iget-object v2, v4, Lm63/d;->G:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    const/16 v15, 0x3e8

    int-to-double v13, v15

    div-double/2addr v7, v13

    double-to-float v1, v7

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x0

    invoke-virtual {v2, v14, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_30
    const-string v1, "track:video"

    invoke-virtual {v6, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_35

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_35

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/RTCStats;

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v5

    const-string v7, "trackIdentifier"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v7, v24

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object/from16 v8, v20

    invoke-interface {v8, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    if-nez v9, :cond_31

    move-object/from16 v9, v19

    :cond_31
    sget-object v11, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_34

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    const-string v11, "totalFreezesDuration"

    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v11, v9, Ljava/lang/Long;

    if-eqz v11, :cond_32

    check-cast v9, Ljava/lang/Long;

    goto :goto_21

    :cond_32
    const/4 v9, 0x0

    :goto_21
    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    const-string v13, "framesReceived"

    invoke-interface {v11, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v11

    const-string v13, "totalFramesDuration"

    invoke-interface {v11, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v5, :cond_33

    invoke-virtual/range {v21 .. v21}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lb23/k;

    iget-object v13, v11, Lb23/k;->c:Lb23/e;

    iget-object v14, v11, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->x:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_33

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v0, "[stats] #manual-quality-selection; receiving video for "

    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " at "

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " and rendering it at null visible: null"

    invoke-static {v13, v0, v2}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-interface {v11, v15, v14, v0, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_33
    move-object/from16 v0, p0

    move-object/from16 v24, v7

    move-object/from16 v20, v8

    goto/16 :goto_20

    :cond_34
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_35
    move-object/from16 v8, v20

    move-object/from16 v7, v24

    const-string v0, "codec:video"

    invoke-virtual {v6, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_38

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/RTCStats;

    if-eqz v0, :cond_38

    invoke-virtual {v0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_36

    check-cast v0, Ljava/lang/String;

    goto :goto_22

    :cond_36
    const/4 v0, 0x0

    :goto_22
    if-eqz v0, :cond_38

    filled-new-array/range {v22 .. v22}, [Ljava/lang/String;

    move-result-object v1

    const/4 v11, 0x6

    invoke-static {v0, v1, v11}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_38

    if-eqz p2, :cond_37

    iget-object v1, v10, Lm63/d;->H:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x0

    invoke-virtual {v1, v14, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_23

    :cond_37
    const/4 v14, 0x0

    iget-object v1, v4, Lm63/d;->H:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v14, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_38
    :goto_23
    move-object/from16 v0, p0

    move-object v4, v7

    move-object v2, v8

    move-object/from16 v1, v17

    move-object/from16 v3, v18

    move-object/from16 v5, v19

    goto/16 :goto_2

    :cond_39
    move-object/from16 v0, p0

    goto/16 :goto_2

    :cond_3a
    move-object/from16 v21, v8

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-virtual/range {v21 .. v21}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3b

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "statgroup "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v14, 0x0

    invoke-interface {v2, v5, v4, v1, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_24

    :cond_3b
    const/4 v14, 0x0

    goto :goto_24

    :cond_3c
    :goto_25
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x3b4999e6 -> :sswitch_3
        -0x30d1ddef -> :sswitch_2
        0x5a71016 -> :sswitch_1
        0x697f14b -> :sswitch_0
    .end sparse-switch
.end method

.method public final b()V
    .locals 11

    iget-object v0, p0, Lt23/t0;->a:Lt23/c0;

    iget-object v1, v0, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld33/h1;

    if-eqz v2, :cond_0

    iget-object v2, v2, Ld33/h1;->z:Lec3/h2;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le33/v0;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Le33/v0;->s()Ljava/util/LinkedHashMap;

    :cond_0
    invoke-virtual {v0}, Lt23/c0;->e()Lt23/e1;

    move-result-object v2

    iget-object v2, v2, Lt23/e1;->q:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-virtual {v0}, Lt23/c0;->e()Lt23/e1;

    move-result-object v0

    iget-object v0, v0, Lt23/e1;->s:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    move-object v0, v5

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v10, 0x0

    if-nez v2, :cond_1

    move-object v2, v10

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v3, v2

    check-cast v3, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget v6, v3, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget v3, v3, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    mul-int/2addr v6, v3

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget v8, v7, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget v7, v7, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    mul-int/2addr v8, v7

    if-ge v6, v8, :cond_4

    move-object v2, v3

    move v6, v8

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    :goto_0
    move-object v6, v2

    check-cast v6, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld33/h1;

    if-eqz v0, :cond_5

    iget-object v0, v0, Ld33/h1;->e:Ljava/lang/String;

    goto :goto_1

    :cond_5
    move-object v0, v10

    :goto_1
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v2, ""

    if-nez v1, :cond_6

    move-object v8, v2

    goto :goto_2

    :cond_6
    move-object v8, v1

    :goto_2
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v1, :cond_7

    move-object v1, v2

    :cond_7
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-nez v3, :cond_8

    move-object v3, v2

    :cond_8
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v3, Lt23/s1;

    if-nez v0, :cond_9

    move-object v7, v2

    goto :goto_3

    :cond_9
    move-object v7, v0

    :goto_3
    invoke-direct/range {v3 .. v9}, Lt23/s1;-><init>(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/util/List;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lt23/t0;->e:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v10, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
