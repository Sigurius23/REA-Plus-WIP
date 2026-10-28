.class public abstract Lix0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;",
        "",
        "",
        "b",
        "(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;)Ljava/util/Map;",
        "data-sync-service_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lix0/f;->b(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ll83/k;

    const-string v1, "Content-Encoding"

    const-string v2, "gzip"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;->getStrapId()Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    new-instance v1, Ll83/k;

    const-string v3, "X-WHOOP-Strap-ID"

    invoke-direct {v1, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;->getHardwareVersion()Ljava/lang/String;

    move-result-object v2

    move-object v3, v2

    new-instance v2, Ll83/k;

    const-string v4, "X-WHOOP-HW-Version"

    invoke-direct {v2, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v3

    move-object v4, v3

    new-instance v3, Ll83/k;

    const-string v5, "X-WHOOP-FW-Version"

    invoke-direct {v3, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;->getSigProcVersion()Ljava/lang/String;

    move-result-object v4

    move-object v5, v4

    new-instance v4, Ll83/k;

    const-string v6, "X-WHOOP-DSP-Version"

    invoke-direct {v4, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;->getBinaryVersion()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    move-object v6, v5

    new-instance v5, Ll83/k;

    const-string v7, "X-WHOOP-Binary-Version"

    invoke-direct {v5, v7, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2RawDataMetadata;->getBinaryFlags()I

    move-result p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    new-instance v6, Ll83/k;

    const-string v7, "X-WHOOP-Binary-Flags"

    invoke-direct {v6, v7, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v0 .. v6}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method
