.class public final Lcs2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcs2/a$a;,
        Lcs2/a$b;,
        Lcs2/a$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u001d\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lcs2/a;",
        "",
        "Liy1/c;",
        "metricWriter",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lcs2/a$c;",
        "provider",
        "<init>",
        "(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcs2/a$c;)V",
        "",
        "name",
        "",
        "tags",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "",
        "success",
        "Lcs2/a$b;",
        "failure",
        "e",
        "(ZLcs2/a$b;)V",
        "c",
        "(Z)V",
        "d",
        "()V",
        "Lfs2/a;",
        "reason",
        "b",
        "(Lfs2/a;)V",
        "Liy1/c;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lcs2/a$c;",
        "video-call_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Lcs2/a$a;

.field public static final e:I


# instance fields
.field private final a:Liy1/c;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Lcs2/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcs2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcs2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcs2/a;->d:Lcs2/a$a;

    const/16 v0, 0x8

    sput v0, Lcs2/a;->e:I

    return-void
.end method

.method public constructor <init>(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcs2/a$c;)V
    .locals 1

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcs2/a;->a:Liy1/c;

    iput-object p2, p0, Lcs2/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lcs2/a;->c:Lcs2/a$c;

    return-void
.end method

.method private final a(Ljava/lang/String;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcs2/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "loop-video-call-observability"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcs2/a;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    iget-object v2, p0, Lcs2/a;->c:Lcs2/a$c;

    invoke-virtual {v2}, Lcs2/a$c;->getTag()Ljava/lang/String;

    move-result-object v2

    const-string v3, "provider:"

    invoke-static {v3, v2}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v2, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method

.method public static synthetic f(Lcs2/a;ZLcs2/a$b;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcs2/a;->e(ZLcs2/a$b;)V

    return-void
.end method


# virtual methods
.method public final b(Lfs2/a;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lfs2/a;->getTag()Ljava/lang/String;

    move-result-object p1

    const-string v0, "reason:"

    invoke-static {v0, p1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    const-string v0, "video_call.end"

    invoke-direct {p0, v0, p1}, Lcs2/a;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public final c(Z)V
    .locals 1

    if-eqz p1, :cond_0

    const-string p1, "success"

    goto :goto_0

    :cond_0
    const-string p1, "failure"

    :goto_0
    const-string v0, "result:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string v0, "video_call.join"

    invoke-direct {p0, v0, p1}, Lcs2/a;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public final d()V
    .locals 2

    const-string v0, "video_call.reconnect"

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-direct {p0, v0, v1}, Lcs2/a;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public final e(ZLcs2/a$b;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "success"

    goto :goto_0

    :cond_0
    const-string v0, "failure"

    :goto_0
    const-string v1, "result:"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcs2/a$b;->getTag()Ljava/lang/String;

    move-result-object p1

    const-string p2, "reason:"

    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string p2, "video_call.start"

    invoke-direct {p0, p2, p1}, Lcs2/a;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method
