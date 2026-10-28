.class public final Lio/getstream/android/video/generated/models/SFULocationResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJB\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\nH\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/SFULocationResponse;",
        "",
        "datacenter",
        "",
        "id",
        "coordinates",
        "Lio/getstream/android/video/generated/models/CoordinatesResponse;",
        "location",
        "Lio/getstream/android/video/generated/models/LocationResponse;",
        "count",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;)V",
        "getCoordinates",
        "()Lio/getstream/android/video/generated/models/CoordinatesResponse;",
        "getCount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getDatacenter",
        "()Ljava/lang/String;",
        "getId",
        "getLocation",
        "()Lio/getstream/android/video/generated/models/LocationResponse;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/SFULocationResponse;",
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
.field private final coordinates:Lio/getstream/android/video/generated/models/CoordinatesResponse;

.field private final count:Ljava/lang/Integer;

.field private final datacenter:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final location:Lio/getstream/android/video/generated/models/LocationResponse;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "datacenter"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/CoordinatesResponse;
        .annotation runtime Lqx/q;
            name = "coordinates"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/LocationResponse;
        .annotation runtime Lqx/q;
            name = "location"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "count"
        .end annotation
    .end param

    const-string v0, "datacenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinates"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->datacenter:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->id:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->coordinates:Lio/getstream/android/video/generated/models/CoordinatesResponse;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->location:Lio/getstream/android/video/generated/models/LocationResponse;

    .line 6
    iput-object p5, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->count:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 7
    invoke-direct/range {v0 .. v5}, Lio/getstream/android/video/generated/models/SFULocationResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/SFULocationResponse;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/SFULocationResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->datacenter:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->id:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->coordinates:Lio/getstream/android/video/generated/models/CoordinatesResponse;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->location:Lio/getstream/android/video/generated/models/LocationResponse;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->count:Ljava/lang/Integer;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/getstream/android/video/generated/models/SFULocationResponse;->copy(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/SFULocationResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->datacenter:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/CoordinatesResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->coordinates:Lio/getstream/android/video/generated/models/CoordinatesResponse;

    return-object v0
.end method

.method public final component4()Lio/getstream/android/video/generated/models/LocationResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->location:Lio/getstream/android/video/generated/models/LocationResponse;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/SFULocationResponse;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "datacenter"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lqx/q;
            name = "id"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/CoordinatesResponse;
        .annotation runtime Lqx/q;
            name = "coordinates"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/LocationResponse;
        .annotation runtime Lqx/q;
            name = "location"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation runtime Lqx/q;
            name = "count"
        .end annotation
    .end param

    const-string v0, "datacenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinates"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/android/video/generated/models/SFULocationResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lio/getstream/android/video/generated/models/SFULocationResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/SFULocationResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/SFULocationResponse;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->datacenter:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SFULocationResponse;->datacenter:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SFULocationResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->coordinates:Lio/getstream/android/video/generated/models/CoordinatesResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SFULocationResponse;->coordinates:Lio/getstream/android/video/generated/models/CoordinatesResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->location:Lio/getstream/android/video/generated/models/LocationResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/SFULocationResponse;->location:Lio/getstream/android/video/generated/models/LocationResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->count:Ljava/lang/Integer;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/SFULocationResponse;->count:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCoordinates()Lio/getstream/android/video/generated/models/CoordinatesResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->coordinates:Lio/getstream/android/video/generated/models/CoordinatesResponse;

    return-object v0
.end method

.method public final getCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDatacenter()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->datacenter:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocation()Lio/getstream/android/video/generated/models/LocationResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->location:Lio/getstream/android/video/generated/models/LocationResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->datacenter:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->coordinates:Lio/getstream/android/video/generated/models/CoordinatesResponse;

    invoke-virtual {v2}, Lio/getstream/android/video/generated/models/CoordinatesResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->location:Lio/getstream/android/video/generated/models/LocationResponse;

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/LocationResponse;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->count:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->datacenter:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->id:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->coordinates:Lio/getstream/android/video/generated/models/CoordinatesResponse;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->location:Lio/getstream/android/video/generated/models/LocationResponse;

    iget-object v4, p0, Lio/getstream/android/video/generated/models/SFULocationResponse;->count:Ljava/lang/Integer;

    const-string v5, ", id="

    const-string v6, ", coordinates="

    const-string v7, "SFULocationResponse(datacenter="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
