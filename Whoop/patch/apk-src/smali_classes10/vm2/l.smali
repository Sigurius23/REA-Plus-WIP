.class public final Lvm2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lvm2/l;",
        "",
        "Liy1/c;",
        "metricWriter",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Liy1/c;Ltr2/n;)V",
        "",
        "source",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;)V",
        "tabId",
        "a",
        "Liy1/c;",
        "Ltr2/n;",
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
.field private final a:Liy1/c;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Liy1/c;Ltr2/n;)V
    .locals 1

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvm2/l;->a:Liy1/c;

    .line 3
    iput-object p2, p0, Lvm2/l;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Liy1/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "NavigationMetricsReporter"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lvm2/l;-><init>(Liy1/c;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 9

    const-string v0, "tabId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvm2/l;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    const-string v2, "tab:"

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "bff_bottom_nav.legacy_tab_mapping_used"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lvm2/l;->b:Ltr2/n;

    if-nez p1, :cond_0

    const-string p1, "none"

    :cond_0
    const-string v1, "Unexpected home_fragment landing; redirecting to BFF default tab. source="

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lvm2/l;->a:Liy1/c;

    new-instance v0, Ljy1/a;

    const/16 v6, 0x15

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v2, "bff_bottom_nav.unexpected_home_redirect"

    const/4 v3, 0x0

    sget-object v4, Lm83/y;->w:Lm83/y;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method
