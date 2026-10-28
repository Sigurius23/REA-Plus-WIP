.class public final Lyu0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyu0/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0011\u001a\u00020\u00102\u0008\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lyu0/d;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ljt0/a;",
        "connectivityAnalytics",
        "Lci2/b;",
        "whoopStrapProvider",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljt0/a;Lci2/b;)V",
        "Lst0/v;",
        "a",
        "()Lst0/v;",
        "strapGen",
        "Lyu0/e;",
        "packetProfile",
        "Ll83/a0;",
        "b",
        "(Lst0/v;Lyu0/e;)V",
        "",
        "featureFlag",
        "c",
        "(Ljava/lang/String;Lyu0/e;)V",
        "featureName",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ljt0/a;",
        "Lci2/b;",
        "connectivity-analytics_release"
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

.field private final b:Ljt0/a;

.field private final c:Lci2/b;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljt0/a;Lci2/b;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityAnalytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyu0/d;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p2, p0, Lyu0/d;->b:Ljt0/a;

    iput-object p3, p0, Lyu0/d;->c:Lci2/b;

    return-void
.end method

.method private final a()Lst0/v;
    .locals 1

    iget-object v0, p0, Lyu0/d;->c:Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->w0()Lst0/v;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final b(Lst0/v;Lyu0/e;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lyu0/d$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    iget-object p1, p0, Lyu0/d;->b:Ljt0/a;

    invoke-virtual {p2}, Lyu0/e;->gen5PacketTypes()[Ljt0/b;

    move-result-object p2

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljt0/b;

    invoke-interface {p1, p2}, Ljt0/a;->b([Ljt0/b;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lyu0/d;->b:Ljt0/a;

    sget-object p2, Ljt0/b;->REALTIME_R10:Ljt0/b;

    filled-new-array {p2}, [Ljt0/b;

    move-result-object p2

    invoke-interface {p1, p2}, Ljt0/a;->b([Ljt0/b;)V

    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lyu0/e;)V
    .locals 1

    const-string v0, "featureFlag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packetProfile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyu0/d;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {v0, p1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lyu0/d;->a()Lst0/v;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lyu0/d;->b(Lst0/v;Lyu0/e;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "featureFlag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyu0/d;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {v0, p1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lyu0/d;->b:Ljt0/a;

    invoke-interface {p1, p2}, Ljt0/a;->a(Ljava/lang/String;)V

    return-void
.end method
