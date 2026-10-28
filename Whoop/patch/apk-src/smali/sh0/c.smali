.class public final Lsh0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lsh0/a;",
        "Lsh0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J#\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lsh0/c;",
        "Lod1/g;",
        "Lsh0/a;",
        "Lsh0/b;",
        "Lcom/whoop/aiinsights/domain/AiInsightsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lwm0/a;",
        "scopeCoordinator",
        "Lph0/b;",
        "screenArgs",
        "<init>",
        "(Lcom/whoop/aiinsights/domain/AiInsightsApi;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwm0/a;Lph0/b;)V",
        "Lec3/l;",
        "i",
        "()Lec3/l;",
        "Lsh0/a$b;",
        "action",
        "j",
        "(Lsh0/a$b;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/aiinsights/domain/AiInsightsApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "d",
        "Lwm0/a;",
        "e",
        "Lph0/b;",
        "ai-insights_release"
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
.field private final a:Lcom/whoop/aiinsights/domain/AiInsightsApi;

.field private final b:Ltr2/n;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final d:Lwm0/a;

.field private final e:Lph0/b;


# direct methods
.method public constructor <init>(Lcom/whoop/aiinsights/domain/AiInsightsApi;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwm0/a;Lph0/b;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenArgs"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh0/c;->a:Lcom/whoop/aiinsights/domain/AiInsightsApi;

    iput-object p2, p0, Lsh0/c;->b:Ltr2/n;

    iput-object p3, p0, Lsh0/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p4, p0, Lsh0/c;->d:Lwm0/a;

    iput-object p5, p0, Lsh0/c;->e:Lph0/b;

    return-void
.end method

.method public static final synthetic c(Lsh0/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lsh0/c;->i()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lsh0/c;)Lcom/whoop/aiinsights/domain/AiInsightsApi;
    .locals 0

    iget-object p0, p0, Lsh0/c;->a:Lcom/whoop/aiinsights/domain/AiInsightsApi;

    return-object p0
.end method

.method public static final synthetic e(Lsh0/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lsh0/c;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Lsh0/c;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lsh0/c;->d:Lwm0/a;

    return-object p0
.end method

.method public static final synthetic g(Lsh0/c;)Lph0/b;
    .locals 0

    iget-object p0, p0, Lsh0/c;->e:Lph0/b;

    return-object p0
.end method

.method public static final synthetic h(Lsh0/c;Lsh0/a$b;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lsh0/c;->j(Lsh0/a$b;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final i()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lsh0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lsh0/c$a;-><init>(Lsh0/c;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final j(Lsh0/a$b;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsh0/a$b;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lsh0/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lsh0/c$c;-><init>(Lsh0/c;Lsh0/a$b;Lq83/d;)V

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

    new-instance v0, Lsh0/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lsh0/c$b;-><init>(Lq83/d;Lsh0/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
