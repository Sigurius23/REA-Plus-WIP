.class public final Lxm1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lxm1/a;",
        "",
        "<init>",
        "()V",
        "Lfm1/d;",
        "metaData",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "",
        "a",
        "(Lfm1/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljava/lang/String;",
        "home_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lfm1/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljava/lang/String;
    .locals 3

    const-string v0, "metaData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android-journal-cycleId-fix"

    invoke-interface {p2, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p2

    const-wide/16 v0, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lfm1/d;->g()Lfm1/e;

    move-result-object p2

    invoke-virtual {p2}, Lfm1/e;->c()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lfm1/d;->b()Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Ljava/time/LocalDate;->minusDays(J)Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lfm1/d;->b()Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lfm1/d;->g()Lfm1/e;

    move-result-object p2

    invoke-virtual {p2}, Lfm1/e;->c()Z

    move-result p2

    const-string v2, "toString(...)"

    invoke-virtual {p1}, Lfm1/d;->b()Ljava/time/LocalDate;

    move-result-object p1

    if-eqz p2, :cond_2

    invoke-virtual {p1, v0, v1}, Ljava/time/LocalDate;->minusDays(J)Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
