.class public final Lio/seon/androidsdk/service/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[Ljava/lang/String;

.field public b:[Ljava/lang/String;

.field public c:Ljava/util/HashMap;

.field public d:[Ljava/lang/String;

.field public e:Ljava/util/HashMap;

.field public f:[Ljava/lang/String;

.field public g:[Ljava/lang/String;

.field public h:[Ljava/lang/String;

.field public i:[Ljava/lang/String;

.field public j:[Ljava/lang/String;

.field public k:[Ljava/lang/String;

.field public l:[Ljava/lang/String;

.field public m:[Ljava/lang/String;

.field public n:[Ljava/lang/String;

.field public o:[Ljava/lang/String;

.field public p:[Ljava/lang/String;

.field public q:[Ljava/lang/String;

.field public r:[Ljava/lang/String;

.field public s:[Ljava/lang/String;

.field public t:[Ljava/lang/String;

.field public u:[Ljava/lang/String;

.field public v:[Ljava/lang/String;

.field public w:[Ljava/lang/String;

.field public x:[Ljava/lang/String;

.field public y:[Ljava/lang/String;


# direct methods
.method public static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p0, Ljava/util/HashMap;

    if-eqz v0, :cond_1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    instance-of v0, p0, Ljava/lang/Iterable;

    if-eqz v0, :cond_3

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lio/seon/androidsdk/service/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    return-object p0
.end method

.method public static b([Ljava/lang/Object;)Lorg/json/JSONArray;
    .locals 4

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    if-nez p0, :cond_0

    sget-object p0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    return-object v0

    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "processNames"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->b:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "qemuDrivers"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->d:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "propertiesWithSeekValues"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "packageNames"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->f:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ipValues"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->g:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "ssidValues"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->h:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildFingerprintFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->i:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildModelFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->j:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildDeviceFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->k:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildManufacturerFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->l:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildDisplayFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->m:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildHardwareFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->n:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildProductFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->o:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildBoardFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->p:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildBootloaderFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->q:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildHostFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->r:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildRadioFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->s:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildBrandFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->t:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "buildFlavorFilters"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->u:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "cpuTypes"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->v:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "kernelArchitectures"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->w:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "kernelVersions"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->x:[Ljava/lang/String;

    invoke-static {v2}, Lio/seon/androidsdk/service/m0;->b([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "minPropertiesThreshold"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "checkTelephony"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "checkPackageNames"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "sensorNames"

    iget-object v2, p0, Lio/seon/androidsdk/service/m0;->y:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
