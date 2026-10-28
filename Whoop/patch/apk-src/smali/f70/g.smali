.class public final Lf70/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lf70/g;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "Lbc3/c0;",
        "scope",
        "Lq83/j;",
        "coroutineContext",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lq83/j;Ltr2/n;)V",
        "Ll83/a0;",
        "c",
        "()V",
        "a",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "b",
        "Lbc3/c0;",
        "Lq83/j;",
        "d",
        "Ltr2/n;",
        "activation_release"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final b:Lbc3/c0;

.field private final c:Lq83/j;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lq83/j;Ltr2/n;)V
    .locals 1

    const-string v0, "featureFlagRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/g;->a:Lcom/whoop/data/repositories/FeatureFlagRepository;

    .line 3
    iput-object p2, p0, Lf70/g;->b:Lbc3/c0;

    .line 4
    iput-object p3, p0, Lf70/g;->c:Lq83/j;

    .line 5
    iput-object p4, p0, Lf70/g;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lq83/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 6
    sget-object p3, Lq83/k;->w:Lq83/k;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 7
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "ActivationFeatureFlagFetcher"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lf70/g;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lq83/j;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf70/g;)Lcom/whoop/data/repositories/FeatureFlagRepository;
    .locals 0

    iget-object p0, p0, Lf70/g;->a:Lcom/whoop/data/repositories/FeatureFlagRepository;

    return-object p0
.end method

.method public static final synthetic b(Lf70/g;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lf70/g;->d:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public final c()V
    .locals 5

    iget-object v0, p0, Lf70/g;->b:Lbc3/c0;

    iget-object v1, p0, Lf70/g;->c:Lq83/j;

    new-instance v2, Lf70/g$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lf70/g$a;-><init>(Lf70/g;Lq83/d;)V

    const/4 v4, 0x2

    invoke-static {v0, v1, v3, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
