.class public final Lcom/whoop/data/repositories/FeatureFlagRepository$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/repositories/FeatureFlagRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static getFeatureFlagsFlow(Lcom/whoop/data/repositories/FeatureFlagRepository;)Lec3/t1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/FeatureFlagRepository;",
            ")",
            "Lec3/t1;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/whoop/data/repositories/FeatureFlagRepository;->access$getFeatureFlagsFlow$jd(Lcom/whoop/data/repositories/FeatureFlagRepository;)Lec3/t1;

    move-result-object p0

    return-object p0
.end method
