.class public final Lde2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000f2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lde2/a;",
        "",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "shepherdApi",
        "Lde2/e;",
        "repository",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/shepherd/domain/ShepherdApi;Lde2/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;",
        "f",
        "()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;",
        "Lec3/l;",
        "Lge2/a;",
        "upstream",
        "Lge2/c;",
        "g",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "b",
        "Lde2/e;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "d",
        "Ltr2/n;",
        "shepherd_release"
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
.field private final a:Lcom/whoop/shepherd/domain/ShepherdApi;

.field private final b:Lde2/e;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/shepherd/domain/ShepherdApi;Lde2/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 1

    const-string v0, "shepherdApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lde2/a;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    .line 3
    iput-object p2, p0, Lde2/a;->b:Lde2/e;

    .line 4
    iput-object p3, p0, Lde2/a;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 5
    iput-object p4, p0, Lde2/a;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/shepherd/domain/ShepherdApi;Lde2/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "ArrhythmiaSubmitTermsOfUseInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lde2/a;-><init>(Lcom/whoop/shepherd/domain/ShepherdApi;Lde2/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lde2/a;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lde2/a;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic b(Lde2/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lde2/a;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c(Lde2/a;)Lde2/e;
    .locals 0

    iget-object p0, p0, Lde2/a;->b:Lde2/e;

    return-object p0
.end method

.method public static final synthetic d(Lde2/a;)Lcom/whoop/shepherd/domain/ShepherdApi;
    .locals 0

    iget-object p0, p0, Lde2/a;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    return-object p0
.end method

.method public static final synthetic e(Lde2/a;)Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;
    .locals 0

    invoke-direct {p0}, Lde2/a;->f()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;

    move-result-object p0

    return-object p0
.end method

.method private final f()Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;
    .locals 2

    new-instance v0, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;-><init>(ZZ)V

    return-object v0
.end method


# virtual methods
.method public final g(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lde2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lde2/a$a;-><init>(Lq83/d;Lde2/a;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
