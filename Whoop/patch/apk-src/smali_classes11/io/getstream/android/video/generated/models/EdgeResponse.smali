.class public final Lio/getstream/android/video/generated/models/EdgeResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u001e\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bi\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003Jm\u0010\'\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0003\u0010\t\u001a\u00020\n2\u0008\u0008\u0003\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0003\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0003\u0010\r\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u000e\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0006H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0011\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0014\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/EdgeResponse;",
        "",
        "continentCode",
        "",
        "countryIsoCode",
        "green",
        "",
        "id",
        "latencyTestUrl",
        "latitude",
        "",
        "longitude",
        "red",
        "subdivisionIsoCode",
        "yellow",
        "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FFILjava/lang/String;I)V",
        "getContinentCode",
        "()Ljava/lang/String;",
        "getCountryIsoCode",
        "getGreen",
        "()I",
        "getId",
        "getLatencyTestUrl",
        "getLatitude",
        "()F",
        "getLongitude",
        "getRed",
        "getSubdivisionIsoCode",
        "getYellow",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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


# instance fields
.field private final continentCode:Ljava/lang/String;

.field private final countryIsoCode:Ljava/lang/String;

.field private final green:I

.field private final id:Ljava/lang/String;

.field private final latencyTestUrl:Ljava/lang/String;

.field private final latitude:F

.field private final longitude:F

.field private final red:I

.field private final subdivisionIsoCode:Ljava/lang/String;

.field private final yellow:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FFILjava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "continent_code"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "country_iso_code"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "green"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "latency_test_url"
        .end annotation
    .end param
    .param p6    # F
        .annotation runtime Lqx/q;
            name = "latitude"
        .end annotation
    .end param
    .param p7    # F
        .annotation runtime Lqx/q;
            name = "longitude"
        .end annotation
    .end param
    .param p8    # I
        .annotation runtime Lqx/q;
            name = "red"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "subdivision_iso_code"
        .end annotation
    .end param
    .param p10    # I
        .annotation runtime Lqx/q;
            name = "yellow"
        .end annotation
    .end param

    const-string v0, "continentCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "countryIsoCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latencyTestUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subdivisionIsoCode"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->continentCode:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->countryIsoCode:Ljava/lang/String;

    iput p3, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->green:I

    iput-object p4, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->id:Ljava/lang/String;

    iput-object p5, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latencyTestUrl:Ljava/lang/String;

    iput p6, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latitude:F

    iput p7, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->longitude:F

    iput p8, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->red:I

    iput-object p9, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->subdivisionIsoCode:Ljava/lang/String;

    iput p10, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->yellow:I

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/EdgeResponse;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FFILjava/lang/String;IILjava/lang/Object;)Lio/getstream/android/video/generated/models/EdgeResponse;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->continentCode:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->countryIsoCode:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->green:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->id:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latencyTestUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latitude:F

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p7, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->longitude:F

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget p8, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->red:I

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->subdivisionIsoCode:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget p10, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->yellow:I

    :cond_9
    move-object p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lio/getstream/android/video/generated/models/EdgeResponse;->copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FFILjava/lang/String;I)Lio/getstream/android/video/generated/models/EdgeResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->continentCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->yellow:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->countryIsoCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->green:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latencyTestUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latitude:F

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->longitude:F

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->red:I

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->subdivisionIsoCode:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FFILjava/lang/String;I)Lio/getstream/android/video/generated/models/EdgeResponse;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "continent_code"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "country_iso_code"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lqx/q;
            name = "green"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "latency_test_url"
        .end annotation
    .end param
    .param p6    # F
        .annotation runtime Lqx/q;
            name = "latitude"
        .end annotation
    .end param
    .param p7    # F
        .annotation runtime Lqx/q;
            name = "longitude"
        .end annotation
    .end param
    .param p8    # I
        .annotation runtime Lqx/q;
            name = "red"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "subdivision_iso_code"
        .end annotation
    .end param
    .param p10    # I
        .annotation runtime Lqx/q;
            name = "yellow"
        .end annotation
    .end param

    const-string v0, "continentCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "countryIsoCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latencyTestUrl"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subdivisionIsoCode"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/EdgeResponse;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lio/getstream/android/video/generated/models/EdgeResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FFILjava/lang/String;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/EdgeResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/EdgeResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->continentCode:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->continentCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->countryIsoCode:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->countryIsoCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->green:I

    iget v3, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->green:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latencyTestUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->latencyTestUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latitude:F

    iget v3, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->latitude:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->longitude:F

    iget v3, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->longitude:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->red:I

    iget v3, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->red:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->subdivisionIsoCode:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->subdivisionIsoCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->yellow:I

    iget p1, p1, Lio/getstream/android/video/generated/models/EdgeResponse;->yellow:I

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getContinentCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->continentCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getCountryIsoCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->countryIsoCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getGreen()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->green:I

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatencyTestUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latencyTestUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatitude()F
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latitude:F

    return v0
.end method

.method public final getLongitude()F
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->longitude:F

    return v0
.end method

.method public final getRed()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->red:I

    return v0
.end method

.method public final getSubdivisionIsoCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->subdivisionIsoCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getYellow()I
    .locals 1

    iget v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->yellow:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->continentCode:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->countryIsoCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->green:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latencyTestUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latitude:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->longitude:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->red:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->subdivisionIsoCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->yellow:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->continentCode:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->countryIsoCode:Ljava/lang/String;

    iget v2, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->green:I

    iget-object v3, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->id:Ljava/lang/String;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latencyTestUrl:Ljava/lang/String;

    iget v5, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->latitude:F

    iget v6, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->longitude:F

    iget v7, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->red:I

    iget-object v8, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->subdivisionIsoCode:Ljava/lang/String;

    iget v9, p0, Lio/getstream/android/video/generated/models/EdgeResponse;->yellow:I

    const-string v10, ", countryIsoCode="

    const-string v11, ", green="

    const-string v12, "EdgeResponse(continentCode="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    const-string v10, ", latencyTestUrl="

    invoke-static {v2, v1, v3, v10, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", red="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", subdivisionIsoCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", yellow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
