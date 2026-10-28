.class public final Lfm2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lfm2/b;",
        "Lfm2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lfm2/d;",
        "Lod1/g;",
        "Lfm2/b;",
        "Lfm2/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;",
        "response",
        "e",
        "(Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)Lfm2/c;",
        "La12/a;",
        "parsedPath",
        "Lec3/l;",
        "f",
        "(La12/a;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "trends-mini-arch_release"
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


# direct methods
.method public constructor <init>(Lnm0/e;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfm2/d;->a:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Lfm2/d;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)Lfm2/c;
    .locals 0

    invoke-direct {p0, p1}, Lfm2/d;->e(Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)Lfm2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lfm2/d;La12/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lfm2/d;->f(La12/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;)Lfm2/c;
    .locals 3

    new-instance v0, Lfm2/c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2, v1}, Lfm2/c;-><init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final f(La12/a;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La12/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/trendsminiarch/domain/GetTrendsMiniArchModelsRequest;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whoop/trendsminiarch/domain/GetTrendsMiniArchModelsRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "home"

    const-string v2, "cycle"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lfm2/d;->a:Lnm0/e;

    new-instance v2, Lfm2/d$a;

    invoke-direct {v2, v3, v1}, Lfm2/d$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lfm2/d$b;

    invoke-direct {v1, v0, p0, p1}, Lfm2/d$b;-><init>(Lec3/l;Lfm2/d;La12/a;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 4
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

    new-instance v0, Lfm2/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lfm2/d$c;-><init>(Lq83/d;Lfm2/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lfm2/c;

    sget-object v2, Lfm2/a$a;->a:Lfm2/a$a;

    const/4 v3, 0x2

    invoke-direct {v0, v2, v1, v3, v1}, Lfm2/c;-><init>(Lfm2/a;Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchModels;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lfm2/d$f;

    invoke-direct {v2, v1}, Lfm2/d$f;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
