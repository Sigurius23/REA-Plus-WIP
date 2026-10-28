.class public Lcom/mapbox/common/ResourceDescription;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final domain:Lcom/mapbox/common/TileDataDomain;

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;

    invoke-static {v0}, Lcom/mapbox/common/BaseMapboxInitializer;->init(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/common/TileDataDomain;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/ResourceDescription;->domain:Lcom/mapbox/common/TileDataDomain;

    iput-object p2, p0, Lcom/mapbox/common/ResourceDescription;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/mapbox/common/ResourceDescription;

    iget-object v2, p0, Lcom/mapbox/common/ResourceDescription;->domain:Lcom/mapbox/common/TileDataDomain;

    iget-object v3, p1, Lcom/mapbox/common/ResourceDescription;->domain:Lcom/mapbox/common/TileDataDomain;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcom/mapbox/common/ResourceDescription;->url:Ljava/lang/String;

    iget-object p1, p1, Lcom/mapbox/common/ResourceDescription;->url:Ljava/lang/String;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public getDomain()Lcom/mapbox/common/TileDataDomain;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/ResourceDescription;->domain:Lcom/mapbox/common/TileDataDomain;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/ResourceDescription;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/mapbox/common/ResourceDescription;->domain:Lcom/mapbox/common/TileDataDomain;

    iget-object v1, p0, Lcom/mapbox/common/ResourceDescription;->url:Ljava/lang/String;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[domain: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mapbox/common/ResourceDescription;->domain:Lcom/mapbox/common/TileDataDomain;

    invoke-static {v1}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/mapbox/common/ResourceDescription;->url:Ljava/lang/String;

    const-string v2, "]"

    invoke-static {v1, v2, v0}, Lc13/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
