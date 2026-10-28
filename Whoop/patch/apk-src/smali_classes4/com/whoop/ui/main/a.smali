.class public final Lcom/whoop/ui/main/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/main/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/ui/main/a;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/domain/model/WhoopUri;",
        "selectedUri",
        "Lcom/whoop/ui/main/a$a;",
        "a",
        "(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/ui/main/a$a;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "app_prodStandardRelease"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/ui/main/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/ui/main/a$a;
    .locals 2

    sget-object v0, Lh92/a;->e:Lh92/a$a;

    invoke-virtual {v0, p1}, Lh92/a$a;->b(Lcom/whoop/domain/model/WhoopUri;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lcom/whoop/ui/main/a$a$c;->a:Lcom/whoop/ui/main/a$a$c;

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Lh92/a$a;->a(Lcom/whoop/domain/model/WhoopUri;)Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lcom/whoop/ui/main/a$a$a;->a:Lcom/whoop/ui/main/a$a$a;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/ui/main/a$a$b;->a:Lcom/whoop/ui/main/a$a$b;

    return-object p1
.end method
