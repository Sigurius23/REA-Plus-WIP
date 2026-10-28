.class public final Lta0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lta0/a;",
        "Lta0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J#\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lta0/c;",
        "Lod1/g;",
        "Lta0/a;",
        "Lta0/b;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "api",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "",
        "biomarkerId",
        "Lec3/l;",
        "g",
        "(Ljava/lang/String;)Lec3/l;",
        "f",
        "h",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "d",
        "Ltr2/n;",
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


# instance fields
.field private final a:Lnm0/e;

.field private final b:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lta0/c;->a:Lnm0/e;

    .line 3
    iput-object p2, p0, Lta0/c;->b:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    .line 4
    iput-object p3, p0, Lta0/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 5
    iput-object p4, p0, Lta0/c;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "AllRecordingsInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lta0/c;-><init>(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lta0/c;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lta0/c;->g(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lta0/c;)Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;
    .locals 0

    iget-object p0, p0, Lta0/c;->b:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    return-object p0
.end method

.method public static final synthetic e(Lta0/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lta0/c;->d:Ltr2/n;

    return-object p0
.end method

.method private final f(Ljava/lang/String;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/advancedlabs/domain/GetAllRecordingsRequest;

    invoke-direct {v0, p1}, Lcom/whoop/advancedlabs/domain/GetAllRecordingsRequest;-><init>(Ljava/lang/String;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "AdvancedLabsScope"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p1

    iget-object v0, p0, Lta0/c;->a:Lnm0/e;

    new-instance v1, Lta0/c$a;

    invoke-direct {v1, v2, v0}, Lta0/c$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lta0/c$b;

    invoke-direct {v0, p1}, Lta0/c$b;-><init>(Lec3/l;)V

    return-object v0
.end method

.method private final g(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lta0/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "advanced-labs-android-caching"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lta0/c;->f(Ljava/lang/String;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lta0/c;->h(Ljava/lang/String;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final h(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lta0/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lta0/c$c;-><init>(Lta0/c;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
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

    new-instance v0, Lta0/c$d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lta0/c$d;-><init>(Lec3/l;Lta0/c;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method
