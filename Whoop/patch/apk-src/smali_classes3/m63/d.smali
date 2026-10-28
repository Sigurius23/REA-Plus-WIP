.class public final Lm63/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/p0;
.implements Lim/b;
.implements Loa3/n;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public G:Ljava/lang/Object;

.field public H:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm63/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, Lm63/d;->w:I

    const/4 p1, 0x0

    iput-object p1, p0, Lm63/d;->x:Ljava/lang/Object;

    iput-object p1, p0, Lm63/d;->y:Ljava/lang/Object;

    iput-object p1, p0, Lm63/d;->z:Ljava/lang/Object;

    iput-object p1, p0, Lm63/d;->E:Ljava/lang/Object;

    iput-object p1, p0, Lm63/d;->F:Ljava/lang/Object;

    iput-object p1, p0, Lm63/d;->G:Ljava/lang/Object;

    iput-object p1, p0, Lm63/d;->H:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lad3/c;Ljava/lang/Object;Ls63/a;Ljava/nio/charset/Charset;Li63/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm63/d;->w:I

    const-string v0, "charset"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p2, p0, Lm63/d;->x:Ljava/lang/Object;

    .line 92
    iput-object p1, p0, Lm63/d;->E:Ljava/lang/Object;

    .line 93
    iput-object p2, p0, Lm63/d;->y:Ljava/lang/Object;

    .line 94
    iput-object p3, p0, Lm63/d;->F:Ljava/lang/Object;

    .line 95
    iput-object p4, p0, Lm63/d;->G:Ljava/lang/Object;

    .line 96
    iput-object p5, p0, Lm63/d;->H:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    const/4 v0, 0x7

    iput v0, p0, Lm63/d;->w:I

    .line 113
    new-instance v0, Lrv/j;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context.applicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lrv/j;-><init>(Landroid/content/Context;)V

    .line 114
    invoke-static {}, Lcom/mapbox/common/location/LocationServiceFactory;->getOrCreate()Lcom/mapbox/common/location/LocationService;

    move-result-object v1

    const-string v2, "getOrCreate()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    .line 116
    sget-object v2, Lhc3/o;->a:Lbc3/w1;

    .line 117
    invoke-virtual {v2}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v2

    .line 118
    const-string v3, "mainCoroutineDispatcher"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    .line 121
    iput-object v2, p0, Lm63/d;->y:Ljava/lang/Object;

    .line 122
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    .line 123
    invoke-static {v0, v2}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    .line 124
    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    .line 125
    sget-object v2, Lev/r;->x:Lev/r;

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, p0, Lm63/d;->E:Ljava/lang/Object;

    .line 126
    new-instance v2, Ln20/j;

    const/16 v3, 0x1b

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4, v3}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object v2

    const/4 v3, 0x1

    const-wide/16 v5, 0x0

    .line 127
    invoke-static {v3, v5, v6}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v7

    invoke-static {v2, v0, v7, v3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object v2

    iput-object v2, p0, Lm63/d;->F:Ljava/lang/Object;

    .line 128
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v2, p0, Lm63/d;->H:Ljava/lang/Object;

    .line 129
    new-instance v2, Lcom/mapbox/common/location/LocationProviderRequest$Builder;

    invoke-direct {v2}, Lcom/mapbox/common/location/LocationProviderRequest$Builder;-><init>()V

    .line 130
    sget-object v7, Lcom/mapbox/common/location/AccuracyLevel;->HIGH:Lcom/mapbox/common/location/AccuracyLevel;

    invoke-virtual {v2, v7}, Lcom/mapbox/common/location/LocationProviderRequest$Builder;->accuracy(Lcom/mapbox/common/location/AccuracyLevel;)Lcom/mapbox/common/location/LocationProviderRequest$Builder;

    move-result-object v2

    .line 131
    new-instance v7, Lcom/mapbox/common/location/IntervalSettings$Builder;

    invoke-direct {v7}, Lcom/mapbox/common/location/IntervalSettings$Builder;-><init>()V

    const-wide/16 v8, 0x3e8

    .line 132
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/mapbox/common/location/IntervalSettings$Builder;->minimumInterval(Ljava/lang/Long;)Lcom/mapbox/common/location/IntervalSettings$Builder;

    move-result-object v7

    .line 133
    invoke-virtual {v7, v8}, Lcom/mapbox/common/location/IntervalSettings$Builder;->interval(Ljava/lang/Long;)Lcom/mapbox/common/location/IntervalSettings$Builder;

    move-result-object v7

    invoke-virtual {v7}, Lcom/mapbox/common/location/IntervalSettings$Builder;->build()Lcom/mapbox/common/location/IntervalSettings;

    move-result-object v7

    .line 134
    invoke-virtual {v2, v7}, Lcom/mapbox/common/location/LocationProviderRequest$Builder;->interval(Lcom/mapbox/common/location/IntervalSettings;)Lcom/mapbox/common/location/LocationProviderRequest$Builder;

    move-result-object v2

    const v7, 0x3dcccccd    # 0.1f

    .line 135
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/mapbox/common/location/LocationProviderRequest$Builder;->displacement(Ljava/lang/Float;)Lcom/mapbox/common/location/LocationProviderRequest$Builder;

    move-result-object v2

    .line 136
    invoke-virtual {v2}, Lcom/mapbox/common/location/LocationProviderRequest$Builder;->build()Lcom/mapbox/common/location/LocationProviderRequest;

    move-result-object v2

    .line 137
    invoke-interface {v1, v2}, Lcom/mapbox/common/location/LocationService;->getDeviceLocationProvider(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;

    move-result-object v1

    .line 138
    invoke-virtual {v1}, Lcom/mapbox/bindgen/Expected;->isValue()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 139
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 140
    invoke-virtual {v1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Lcom/mapbox/common/location/DeviceLocationProvider;

    .line 141
    new-instance v2, Lrv/a;

    invoke-direct {v2, p1, v1, p0, v4}, Lrv/a;-><init>(Landroid/content/Context;Lcom/mapbox/common/location/DeviceLocationProvider;Lm63/d;Lq83/d;)V

    invoke-static {v2}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p1

    .line 142
    invoke-static {v3, v5, v6}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v1

    invoke-static {p1, v0, v1, v3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {v1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lcom/mapbox/common/location/LocationError;

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LocationService error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MapboxLocationProvider"

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    new-instance p1, Lcom/mapbox/common/location/LocationError;

    sget-object v0, Lcom/mapbox/common/location/LocationErrorCode;->NOT_AVAILABLE:Lcom/mapbox/common/location/LocationErrorCode;

    const-string v1, "LiveTrackingClient not available"

    invoke-direct {p1, v0, v1}, Lcom/mapbox/common/location/LocationError;-><init>(Lcom/mapbox/common/location/LocationErrorCode;Ljava/lang/String;)V

    .line 146
    iput-object p1, p0, Lm63/d;->z:Ljava/lang/Object;

    .line 147
    sget-object p1, Lec3/k;->w:Lec3/k;

    .line 148
    :goto_0
    iput-object p1, p0, Lm63/d;->G:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/internal/k0;Lr93/e;Lva3/c;Ljava/util/List;Lr93/s0;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lm63/d;->w:I

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    iput-object p1, p0, Lm63/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lm63/d;->E:Ljava/lang/Object;

    iput-object p3, p0, Lm63/d;->F:Ljava/lang/Object;

    iput-object p4, p0, Lm63/d;->G:Ljava/lang/Object;

    iput-object p5, p0, Lm63/d;->H:Ljava/lang/Object;

    .line 151
    iput-object p1, p0, Lm63/d;->x:Ljava/lang/Object;

    .line 152
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lm63/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld/h1;)V
    .locals 10

    const/4 v0, 0x4

    iput v0, p0, Lm63/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Ld/h1;->o()I

    move-result v2

    if-ge v1, v2, :cond_6

    :try_start_0
    invoke-virtual {p1, v1}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    instance-of v3, v2, Ld/d0;

    if-eqz v3, :cond_5

    check-cast v2, Ld/d0;

    .line 3
    iget-object v3, v2, Ld/d0;->d:Ld/q;

    instance-of v4, v3, Ld/b1;

    if-eqz v4, :cond_0

    check-cast v3, Ld/b1;

    goto :goto_1

    :cond_0
    invoke-interface {v3}, Ld/q;->d()Ld/b1;

    move-result-object v3

    .line 4
    :goto_1
    iget v2, v2, Ld/d0;->c:I

    .line 5
    iget-object v4, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0x2bd

    if-eq v2, v4, :cond_4

    const/16 v4, 0x2c5

    if-eq v2, v4, :cond_1

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    check-cast v3, Ld/j0;

    invoke-virtual {v3}, Ld/j0;->m()Ljava/math/BigInteger;

    move-result-object v2

    iput-object v2, p0, Lm63/d;->H:Ljava/lang/Object;

    goto/16 :goto_4

    :pswitch_1
    check-cast v3, Ld/j0;

    invoke-virtual {v3}, Ld/j0;->m()Ljava/math/BigInteger;

    move-result-object v2

    iput-object v2, p0, Lm63/d;->G:Ljava/lang/Object;

    goto/16 :goto_4

    :pswitch_2
    new-instance v2, La00/g;

    check-cast v3, Ld/h1;

    invoke-direct {v2, v3}, La00/g;-><init>(Ld/h1;)V

    iput-object v2, p0, Lm63/d;->y:Ljava/lang/Object;

    goto :goto_4

    :cond_1
    invoke-static {v3}, Ld/x0;->l(Ld/q;)Ld/x0;

    move-result-object v2

    .line 6
    iget-object v2, v2, Ld/x0;->a:[B

    .line 7
    invoke-static {v2}, Ld/h1;->m(Ljava/lang/Object;)Ld/h1;

    move-result-object v2

    .line 8
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {v2, v0}, Ld/h1;->l(I)Ld/q;

    move-result-object v6

    check-cast v6, Ld/a;

    move v7, v0

    .line 9
    :goto_2
    iget-object v8, v6, Ld/a;->a:[Ld/q;

    .line 10
    array-length v9, v8

    if-ge v7, v9, :cond_2

    .line 11
    aget-object v8, v8, v7

    .line 12
    check-cast v8, Ld/h1;

    invoke-virtual {v8, v0}, Ld/h1;->l(I)Ld/q;

    move-result-object v9

    invoke-static {v9}, Ld/x0;->l(Ld/q;)Ld/x0;

    move-result-object v9

    invoke-virtual {v8, v5}, Ld/h1;->l(I)Ld/q;

    move-result-object v8

    check-cast v8, Ld/j0;

    .line 13
    iget-object v8, v9, Ld/x0;->a:[B

    .line 14
    invoke-static {v8}, Lwg/c;->b([B)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :catch_0
    :cond_2
    :try_start_2
    invoke-virtual {v2, v5}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/a;

    move v5, v0

    .line 15
    :goto_3
    iget-object v6, v2, Ld/a;->a:[Ld/q;

    .line 16
    array-length v7, v6

    if-ge v5, v7, :cond_3

    .line 17
    aget-object v6, v6, v5

    .line 18
    invoke-static {v6}, Ld/x0;->l(Ld/q;)Ld/x0;

    move-result-object v6

    .line 19
    iget-object v6, v6, Ld/x0;->a:[B

    .line 20
    invoke-static {v6, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 21
    :catch_1
    :cond_3
    :try_start_3
    iput-object v3, p0, Lm63/d;->z:Ljava/lang/Object;

    iput-object v4, p0, Lm63/d;->E:Ljava/lang/Object;

    goto :goto_4

    :cond_4
    check-cast v3, Ld/j0;

    invoke-virtual {v3}, Ld/j0;->m()Ljava/math/BigInteger;

    move-result-object v2

    iput-object v2, p0, Lm63/d;->F:Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_5
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2c0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lhc3/d;)V
    .locals 2

    const/16 p1, 0x8

    iput p1, p0, Lm63/d;->w:I

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 106
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    .line 107
    iput-object v0, p0, Lm63/d;->y:Ljava/lang/Object;

    .line 108
    const-string v0, ""

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lm63/d;->z:Ljava/lang/Object;

    .line 109
    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lm63/d;->E:Ljava/lang/Object;

    .line 110
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lm63/d;->F:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 111
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lm63/d;->G:Ljava/lang/Object;

    .line 112
    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lm63/d;->H:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/replay/video/d;Ldg/a;Luf/l;Luf/h;Luf/v;Lb30/m;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lm63/d;->w:I

    const-string v0, "execution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "telemetry"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lm63/d;->x:Ljava/lang/Object;

    .line 80
    iput-object p2, p0, Lm63/d;->y:Ljava/lang/Object;

    .line 81
    iput-object p3, p0, Lm63/d;->z:Ljava/lang/Object;

    .line 82
    iput-object p4, p0, Lm63/d;->E:Ljava/lang/Object;

    .line 83
    iput-object p5, p0, Lm63/d;->F:Ljava/lang/Object;

    .line 84
    iput-object p6, p0, Lm63/d;->G:Ljava/lang/Object;

    .line 85
    sget-object p1, Luf/i;->e:Lgf/a;

    .line 86
    sget-object p3, Lvg/t;->d:[C

    invoke-static {}, Lsb3/a;->q()Lvg/t;

    move-result-object p3

    .line 87
    iget-object p3, p3, Lvg/t;->c:Ljava/lang/String;

    .line 88
    invoke-virtual {p2, p1, p3}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    .line 89
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm63/d;->H:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Li20/s;Li20/j1;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x3

    iput v2, v0, Lm63/d;->w:I

    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v5, p1

    .line 23
    iput-object v5, v0, Lm63/d;->x:Ljava/lang/Object;

    move-object/from16 v2, p3

    .line 24
    iput-object v2, v0, Lm63/d;->y:Ljava/lang/Object;

    .line 25
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "address"

    invoke-static {v2}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    if-eqz v1, :cond_0

    .line 26
    iget-object v2, v1, Li20/s;->y:Ljava/util/LinkedHashSet;

    :goto_0
    move-object v6, v2

    goto :goto_1

    .line 27
    :cond_0
    sget-object v2, Lvy/a;->a:Ljava/util/Set;

    goto :goto_0

    .line 28
    :goto_1
    sget-object v9, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 29
    iget-object v1, v1, Li20/s;->E:Li20/r;

    if-eqz v1, :cond_1

    .line 30
    iget-object v1, v1, Li20/r;->w:Li20/q;

    goto :goto_2

    :cond_1
    move-object v1, v2

    .line 31
    :goto_2
    invoke-static {v1}, Li20/l1;->m(Li20/q;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v8

    .line 32
    new-instance v13, Lhn/p;

    const/4 v1, 0x1

    invoke-direct {v13, v0, v1}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    .line 33
    new-instance v3, Lg40/v;

    const/4 v14, 0x0

    const/16 v15, 0x448

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v15}, Lg40/v;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lg40/r0;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lg40/v2;Ljava/util/Map;Lg40/z;ZI)V

    iput-object v3, v0, Lm63/d;->z:Ljava/lang/Object;

    .line 34
    invoke-static {v3, v2}, Lg40/l0;->b(Lg40/y2;Lzy/c;)Lg40/w2;

    move-result-object v1

    .line 35
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lm63/d;->E:Ljava/lang/Object;

    .line 36
    invoke-virtual {v3}, Lg40/v;->k()Lg40/t;

    move-result-object v1

    .line 37
    iget-object v1, v1, Lg40/t;->p:Ln53/e;

    .line 38
    new-instance v2, Lhu1/g;

    const/16 v4, 0xc

    invoke-direct {v2, v4}, Lhu1/g;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lm63/d;->F:Ljava/lang/Object;

    .line 39
    new-instance v2, Lhu1/g;

    const/16 v4, 0xd

    invoke-direct {v2, v4}, Lhu1/g;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lm63/d;->G:Ljava/lang/Object;

    .line 40
    invoke-virtual {v3}, Lg40/v;->k()Lg40/t;

    move-result-object v1

    .line 41
    iget-object v1, v1, Lg40/t;->q:Ln53/e;

    .line 42
    new-instance v2, Lhu1/g;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lhu1/g;-><init>(I)V

    .line 43
    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lm63/d;->H:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Lg1/u4;Lg1/u4;I)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, Lm63/d;->w:I

    .line 44
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    and-int/lit8 v1, p4, 0x4

    if-eqz v1, :cond_0

    .line 45
    new-instance v1, Lg40/n0;

    const/4 v2, 0x1

    .line 46
    invoke-direct {v1, v2}, Lg40/n0;-><init>(Z)V

    goto :goto_0

    .line 47
    :cond_0
    sget-object v1, Lg40/m0;->a:Lg40/m0;

    :goto_0
    and-int/lit8 v2, p4, 0x10

    if-eqz v2, :cond_1

    .line 48
    new-instance p2, Lg1/u4;

    const/16 v2, 0x14

    invoke-direct {p2, v2}, Lg1/u4;-><init>(I)V

    :cond_1
    and-int/lit8 p4, p4, 0x20

    if-eqz p4, :cond_2

    .line 49
    new-instance p3, Lg1/u4;

    const/16 p4, 0x15

    invoke-direct {p3, p4}, Lg1/u4;-><init>(I)V

    .line 50
    :cond_2
    const-string p4, "onlyShowCountryCodes"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "locale"

    invoke-static {v0, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lm63/d;->x:Ljava/lang/Object;

    .line 53
    iput-object v1, p0, Lm63/d;->y:Ljava/lang/Object;

    .line 54
    iput-object p2, p0, Lm63/d;->z:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 55
    new-array p1, p1, [Ljava/lang/Object;

    .line 56
    sget-object p2, Lm83/y;->w:Lm83/y;

    const p4, 0x7f140f7b

    .line 57
    invoke-static {p4, p1, p2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    .line 58
    iput-object p1, p0, Lm63/d;->E:Ljava/lang/Object;

    .line 59
    sget-object p1, Lvy/a;->a:Ljava/util/Set;

    .line 60
    invoke-static {v0}, Lvy/a;->b(Ljava/util/Locale;)Ljava/util/List;

    move-result-object p1

    .line 61
    check-cast p1, Ljava/lang/Iterable;

    .line 62
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 63
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/core/model/Country;

    .line 64
    iget-object v1, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-virtual {v0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 65
    :cond_4
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 66
    :cond_5
    iput-object p2, p0, Lm63/d;->F:Ljava/lang/Object;

    .line 67
    new-instance p1, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 69
    check-cast v0, Lcom/stripe/android/core/model/Country;

    .line 70
    invoke-virtual {v0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 72
    :cond_6
    iput-object p1, p0, Lm63/d;->G:Ljava/lang/Object;

    .line 73
    iget-object p1, p0, Lm63/d;->F:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    .line 74
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, p4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 76
    invoke-interface {p3, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 77
    :cond_7
    iput-object p2, p0, Lm63/d;->H:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk83/a;Lk83/a;Lk83/a;Lgm/r;Lk83/a;Lk83/a;Lk83/a;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lm63/d;->w:I

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lm63/d;->x:Ljava/lang/Object;

    .line 99
    iput-object p2, p0, Lm63/d;->y:Ljava/lang/Object;

    .line 100
    iput-object p3, p0, Lm63/d;->z:Ljava/lang/Object;

    .line 101
    iput-object p4, p0, Lm63/d;->E:Ljava/lang/Object;

    .line 102
    iput-object p5, p0, Lm63/d;->F:Ljava/lang/Object;

    .line 103
    iput-object p6, p0, Lm63/d;->G:Ljava/lang/Object;

    .line 104
    iput-object p7, p0, Lm63/d;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public H()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public M()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public a()Lws/r;
    .locals 11

    iget-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v0, Lws/s;

    if-eqz v0, :cond_b

    iget-object v1, p0, Lm63/d;->z:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_a

    iget-object v2, p0, Lm63/d;->E:Ljava/lang/Object;

    check-cast v2, Lro/i;

    if-eqz v2, :cond_a

    iget-object v3, p0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v3, Lro/i;

    if-eqz v3, :cond_9

    iget-object v4, p0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v4, Lro/i;

    if-eqz v4, :cond_8

    iget-object v5, p0, Lm63/d;->G:Ljava/lang/Object;

    check-cast v5, Lro/i;

    if-eqz v5, :cond_8

    iget-object v6, p0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v6, Lro/i;

    if-eqz v6, :cond_7

    iget-object v7, v0, Lws/s;->b:Lws/q;

    iget-object v7, v7, Lws/q;->b:Ljava/math/BigInteger;

    iget-object v0, v0, Lws/s;->c:Ljava/math/BigInteger;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Ljava/math/BigInteger;

    iget-object v2, v2, Lro/i;->x:Ljava/lang/Object;

    check-cast v2, Ljava/math/BigInteger;

    iget-object v3, v3, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Ljava/math/BigInteger;

    iget-object v4, v4, Lro/i;->x:Ljava/lang/Object;

    check-cast v4, Ljava/math/BigInteger;

    iget-object v5, v5, Lro/i;->x:Ljava/lang/Object;

    check-cast v5, Ljava/math/BigInteger;

    iget-object v6, v6, Lro/i;->x:Ljava/lang/Object;

    check-cast v6, Ljava/math/BigInteger;

    const/16 v8, 0xa

    invoke-virtual {v1, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {v2, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v7, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v7, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v7, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v6}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lws/r;

    iget-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lws/s;

    iget-object v0, p0, Lm63/d;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lro/i;

    iget-object v0, p0, Lm63/d;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lro/i;

    iget-object v0, p0, Lm63/d;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lro/i;

    iget-object v0, p0, Lm63/d;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lro/i;

    iget-object v0, p0, Lm63/d;->G:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lro/i;

    iget-object v0, p0, Lm63/d;->H:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lro/i;

    invoke-direct/range {v1 .. v8}, Lws/r;-><init>(Lws/s;Lro/i;Lro/i;Lro/i;Lro/i;Lro/i;Lro/i;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "qInv is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dQ is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dP is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "D is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Prime p times prime q is not equal to the public key\'s modulus"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "q is not a prime"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "p is not a prime"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without CRT coefficient"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without prime exponents"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without private exponent"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without prime factors"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without a RSA SSA PKCS1 public key"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const-string v1, "rawValue"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lvy/a;->a:Ljava/util/Set;

    sget-object v1, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/stripe/android/core/model/b;->a(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;

    move-result-object p1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "getDefault(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Lvy/a;->a(Lcom/stripe/android/core/model/CountryCode;Ljava/util/Locale;)Lcom/stripe/android/core/model/Country;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne p1, v2, :cond_0

    move-object v1, v3

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    :cond_1
    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_3

    const-string p1, ""

    :cond_3
    return-object p1
.end method

.method public c()Lws/y;
    .locals 11

    iget-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v0, Lws/z;

    if-eqz v0, :cond_b

    iget-object v1, p0, Lm63/d;->z:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_a

    iget-object v2, p0, Lm63/d;->E:Ljava/lang/Object;

    check-cast v2, Lro/i;

    if-eqz v2, :cond_a

    iget-object v3, p0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v3, Lro/i;

    if-eqz v3, :cond_9

    iget-object v4, p0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v4, Lro/i;

    if-eqz v4, :cond_8

    iget-object v5, p0, Lm63/d;->G:Ljava/lang/Object;

    check-cast v5, Lro/i;

    if-eqz v5, :cond_8

    iget-object v6, p0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v6, Lro/i;

    if-eqz v6, :cond_7

    iget-object v7, v0, Lws/z;->b:Lws/x;

    iget-object v7, v7, Lws/x;->b:Ljava/math/BigInteger;

    iget-object v0, v0, Lws/z;->c:Ljava/math/BigInteger;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Ljava/math/BigInteger;

    iget-object v2, v2, Lro/i;->x:Ljava/lang/Object;

    check-cast v2, Ljava/math/BigInteger;

    iget-object v3, v3, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Ljava/math/BigInteger;

    iget-object v4, v4, Lro/i;->x:Ljava/lang/Object;

    check-cast v4, Ljava/math/BigInteger;

    iget-object v5, v5, Lro/i;->x:Ljava/lang/Object;

    check-cast v5, Ljava/math/BigInteger;

    iget-object v6, v6, Lro/i;->x:Ljava/lang/Object;

    check-cast v6, Ljava/math/BigInteger;

    const/16 v8, 0xa

    invoke-virtual {v1, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {v2, v8}, Ljava/math/BigInteger;->isProbablePrime(I)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v7, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v7, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v7, v5}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v6}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lws/y;

    iget-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lws/z;

    iget-object v0, p0, Lm63/d;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lro/i;

    iget-object v0, p0, Lm63/d;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lro/i;

    iget-object v0, p0, Lm63/d;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lro/i;

    iget-object v0, p0, Lm63/d;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lro/i;

    iget-object v0, p0, Lm63/d;->G:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lro/i;

    iget-object v0, p0, Lm63/d;->H:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lro/i;

    invoke-direct/range {v1 .. v8}, Lws/y;-><init>(Lws/z;Lro/i;Lro/i;Lro/i;Lro/i;Lro/i;Lro/i;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "qInv is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dQ is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dP is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "D is invalid."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Prime p times prime q is not equal to the public key\'s modulus"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "q is not a prime"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "p is not a prime"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without CRT coefficient"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without prime exponents"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without private exponent"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without prime factors"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without a RSA SSA PKCS1 public key"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Ldg/a;
    .locals 1

    iget-object v0, p0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, Ldg/a;

    return-object v0
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {p1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/Country;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lm63/d;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const-string p1, ""

    return-object p1
.end method

.method public f()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public g()Lg40/o0;
    .locals 1

    iget-object v0, p0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, Lg40/o0;

    return-object v0
.end method

.method public get()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v1, Lk83/a;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhm/e;

    iget-object v2, p0, Lm63/d;->z:Ljava/lang/Object;

    check-cast v2, Lk83/a;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnm/d;

    iget-object v3, p0, Lm63/d;->E:Ljava/lang/Object;

    check-cast v3, Lgm/r;

    invoke-virtual {v3}, Lgm/r;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgm/r;

    iget-object v4, p0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v4, Lk83/a;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/Executor;

    iget-object v5, p0, Lm63/d;->G:Ljava/lang/Object;

    check-cast v5, Lk83/a;

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lom/b;

    new-instance v6, Lng3/n;

    const/16 v7, 0xe

    invoke-direct {v6, v7}, Lng3/n;-><init>(I)V

    new-instance v7, Lng3/o;

    const/16 v8, 0xd

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Lng3/o;-><init>(IZ)V

    iget-object v8, p0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v8, Lk83/a;

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnm/c;

    new-instance v9, Lev/i;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    iput-object v0, v9, Lev/i;->a:Ljava/lang/Object;

    iput-object v1, v9, Lev/i;->b:Ljava/lang/Object;

    iput-object v2, v9, Lev/i;->c:Ljava/lang/Object;

    iput-object v3, v9, Lev/i;->d:Ljava/lang/Object;

    iput-object v4, v9, Lev/i;->e:Ljava/lang/Object;

    iput-object v5, v9, Lev/i;->f:Ljava/lang/Object;

    iput-object v6, v9, Lev/i;->g:Ljava/lang/Object;

    iput-object v7, v9, Lev/i;->h:Ljava/lang/Object;

    iput-object v8, v9, Lev/i;->i:Ljava/lang/Object;

    return-object v9
.end method

.method public getLabel()Lzy/c;
    .locals 1

    iget-object v0, p0, Lm63/d;->E:Ljava/lang/Object;

    check-cast v0, Lzy/b;

    return-object v0
.end method

.method public h(Lje/a;)V
    .locals 2

    iget-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/d;

    iget-object v1, v0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v1, Leg/o;

    invoke-virtual {v1}, Leg/o;->f()Lae3/k;

    move-result-object v1

    iget v1, v1, Lae3/k;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p1, Lje/a;->b:Ljava/lang/Integer;

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast v0, Lag/e;

    sget-object v1, Lag/f;->x:Lag/f;

    invoke-virtual {v0, p1, v1}, Lag/e;->c(Lag/b;Lag/f;)V

    return-void
.end method

.method public i(Luf/o;)V
    .locals 1

    const-string v0, "middleware"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Luf/o;->c(Lm63/d;)V

    return-void
.end method

.method public j(Lro/i;)V
    .locals 1

    iget v0, p0, Lm63/d;->w:I

    packed-switch v0, :pswitch_data_0

    iput-object p1, p0, Lm63/d;->H:Ljava/lang/Object;

    return-void

    :pswitch_0
    iput-object p1, p0, Lm63/d;->H:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public k(Lro/i;Lro/i;)V
    .locals 1

    iget v0, p0, Lm63/d;->w:I

    packed-switch v0, :pswitch_data_0

    iput-object p1, p0, Lm63/d;->F:Ljava/lang/Object;

    iput-object p2, p0, Lm63/d;->G:Ljava/lang/Object;

    return-void

    :pswitch_0
    iput-object p1, p0, Lm63/d;->F:Ljava/lang/Object;

    iput-object p2, p0, Lm63/d;->G:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public l()V
    .locals 7

    iget-object v0, p0, Lm63/d;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/k0;

    iget-object v1, p0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v1, Lva3/c;

    iget-object v2, p0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    const-string v3, "arguments"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Ln93/a;->b:Lva3/c;

    invoke-virtual {v1, v3}, Lva3/c;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "value"

    invoke-static {v3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lab3/t;

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    check-cast v3, Lab3/t;

    goto :goto_0

    :cond_1
    move-object v3, v6

    :goto_0
    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, v3, Lab3/g;->a:Ljava/lang/Object;

    instance-of v5, v3, Lab3/r;

    if-eqz v5, :cond_3

    move-object v6, v3

    check-cast v6, Lab3/r;

    :cond_3
    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    iget-object v3, v6, Lab3/r;->a:Lab3/f;

    iget-object v3, v3, Lab3/f;->a:Lva3/c;

    invoke-virtual {v0, v3}, Lcom/google/crypto/tink/internal/k0;->D(Lva3/c;)Z

    move-result v4

    :goto_1
    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/k0;->D(Lva3/c;)Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_2
    return-void

    :cond_6
    iget-object v0, p0, Lm63/d;->G:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    new-instance v1, Ls93/c;

    iget-object v3, p0, Lm63/d;->E:Ljava/lang/Object;

    check-cast v3, Lr93/e;

    invoke-interface {v3}, Lr93/e;->i()Llb3/c0;

    move-result-object v3

    iget-object v4, p0, Lm63/d;->H:Ljava/lang/Object;

    check-cast v4, Lr93/s0;

    invoke-direct {v1, v3, v2, v4}, Ls93/c;-><init>(Llb3/c0;Ljava/util/Map;Lr93/s0;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public m(Lva3/h;)Loa3/o;
    .locals 2

    new-instance v0, La00/g;

    iget-object v1, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v0, v1, p1, p0}, La00/g;-><init>(Lcom/google/crypto/tink/internal/k0;Lva3/h;Lm63/d;)V

    return-object v0
.end method

.method public n(Lva3/h;Lab3/f;)V
    .locals 2

    new-instance v0, Lab3/t;

    new-instance v1, Lab3/r;

    invoke-direct {v1, p2}, Lab3/r;-><init>(Lab3/f;)V

    invoke-direct {v0, v1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    iget-object p2, p0, Lm63/d;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public o(Lro/i;Lro/i;)V
    .locals 1

    iget v0, p0, Lm63/d;->w:I

    packed-switch v0, :pswitch_data_0

    iput-object p1, p0, Lm63/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lm63/d;->E:Ljava/lang/Object;

    return-void

    :pswitch_0
    iput-object p1, p0, Lm63/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lm63/d;->E:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public p(Lva3/h;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/k0;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lu93/e0;

    invoke-static {p2, v0}, Lab3/h;->c(Ljava/lang/Object;Lu93/e0;)Lab3/g;

    move-result-object p2

    if-nez p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported annotation argument: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lup/d;->s(Ljava/lang/String;)Lab3/j;

    move-result-object p2

    :cond_0
    iget-object v0, p0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public q(Lva3/h;Lva3/c;Lva3/h;)V
    .locals 1

    new-instance v0, Lab3/i;

    invoke-direct {v0, p2, p3}, Lab3/i;-><init>(Lva3/c;Lva3/h;)V

    iget-object p2, p0, Lm63/d;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public r(Lro/i;)V
    .locals 1

    iget v0, p0, Lm63/d;->w:I

    packed-switch v0, :pswitch_data_0

    iput-object p1, p0, Lm63/d;->y:Ljava/lang/Object;

    return-void

    :pswitch_0
    iput-object p1, p0, Lm63/d;->y:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public s(Lva3/c;Lva3/h;)Loa3/n;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/internal/k0;

    sget-object v2, Lr93/s0;->q:Lr93/v0;

    invoke-virtual {v1, p1, v2, v0}, Lcom/google/crypto/tink/internal/k0;->F(Lva3/c;Lr93/s0;Ljava/util/List;)Lm63/d;

    move-result-object p1

    new-instance v1, Lb30/m;

    invoke-direct {v1, p1, p0, p2, v0}, Lb30/m;-><init>(Lm63/d;Lm63/d;Lva3/h;Ljava/util/ArrayList;)V

    return-object v1
.end method

.method public t(Lws/s;)V
    .locals 0

    iput-object p1, p0, Lm63/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public u(Lws/z;)V
    .locals 0

    iput-object p1, p0, Lm63/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lm63/d;->G:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method
