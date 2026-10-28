.class public final Lrw2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrw2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J#\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0010R(\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00130\u00120\u00118\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u000e\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lrw2/g;",
        "Lrw2/a;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "Lec3/l;",
        "Lqw2/a;",
        "upstream",
        "Lqw2/b;",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "",
        "Lj93/d;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "c",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "actionTypes",
        "whoop-action_release"
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

.field private final b:Ltr2/n;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 4

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrw2/g;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 3
    iput-object p2, p0, Lrw2/g;->b:Ltr2/n;

    .line 4
    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class p2, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-virtual {p1, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    .line 5
    const-class v0, Lcom/whoop/whoopaction/domain/models/StateClearAction;

    .line 6
    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    .line 7
    const-class v1, Lcom/whoop/whoopaction/domain/models/StatePushAction;

    .line 8
    invoke-virtual {p1, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    .line 9
    const-class v2, Lcom/whoop/whoopaction/domain/models/StatePopAction;

    .line 10
    invoke-virtual {p1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v2, 0x4

    .line 11
    new-array v2, v2, [Lj93/d;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 p2, 0x1

    aput-object v0, v2, p2

    const/4 p2, 0x2

    aput-object v1, v2, p2

    const/4 p2, 0x3

    aput-object p1, v2, p2

    .line 12
    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    .line 13
    iput-object p1, p0, Lrw2/g;->c:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 14
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "JdslState"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2}, Lrw2/g;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lrw2/g;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lrw2/g;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic d(Lrw2/g;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lrw2/g;->b:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrw2/g;->c:Ljava/util/Set;

    return-object v0
.end method

.method public b(Lec3/l;)Lec3/l;
    .locals 1
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

    new-instance v0, Lrw2/g$a;

    invoke-direct {v0, p1, p0}, Lrw2/g$a;-><init>(Lec3/l;Lrw2/g;)V

    return-object v0
.end method

.method public bridge interact(Lec3/l;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-super {p0, p1}, Lrw2/a;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
