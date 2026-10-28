.class public interface abstract Lcom/whoop/advancedlabs/domain/AdvancedLabsCsvApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsCsvApi;",
        "",
        "Lpg3/v0;",
        "Lud3/a1;",
        "exportBiomarkersCsv",
        "(Lq83/d;)Ljava/lang/Object;",
        "advanced-labs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract exportBiomarkersCsv(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lud3/a1;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/biomarkers/summary/csv"
    .end annotation
.end method
