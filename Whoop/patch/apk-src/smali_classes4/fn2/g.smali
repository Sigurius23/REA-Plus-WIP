.class public final Lfn2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lfn2/g;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "",
        "orientation",
        "a",
        "(I)I",
        "Li93/j;",
        "Li93/j;",
        "rightOrientationRange",
        "b",
        "leftOrientationRange",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Li93/j;

.field private final b:Li93/j;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 5

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "android-tilt-angles-fix"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    new-instance v1, Li93/j;

    const/16 v3, 0x104

    const/16 v4, 0x118

    invoke-direct {v1, v3, v4, v2}, Li93/h;-><init>(III)V

    goto :goto_0

    :cond_0
    new-instance v1, Li93/j;

    const/16 v3, 0xfa

    const/16 v4, 0x122

    invoke-direct {v1, v3, v4, v2}, Li93/h;-><init>(III)V

    :goto_0
    iput-object v1, p0, Lfn2/g;->a:Li93/j;

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Li93/j;

    const/16 v0, 0x50

    const/16 v1, 0x64

    invoke-direct {p1, v0, v1, v2}, Li93/h;-><init>(III)V

    goto :goto_1

    :cond_1
    new-instance p1, Li93/j;

    const/16 v0, 0x46

    const/16 v1, 0x6e

    invoke-direct {p1, v0, v1, v2}, Li93/h;-><init>(III)V

    :goto_1
    iput-object p1, p0, Lfn2/g;->b:Li93/j;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    iget-object v0, p0, Lfn2/g;->a:Li93/j;

    iget v1, v0, Li93/h;->w:I

    iget v0, v0, Li93/h;->x:I

    if-gt p1, v0, :cond_0

    if-gt v1, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfn2/g;->b:Li93/j;

    iget v1, v0, Li93/h;->w:I

    iget v0, v0, Li93/h;->x:I

    if-gt p1, v0, :cond_1

    if-gt v1, p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
