.class public final La32/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0008J)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0016\u0010\u000bJ/\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ1\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "La32/c;",
        "",
        "<init>",
        "()V",
        "",
        "screen",
        "Ljy1/a;",
        "b",
        "(Ljava/lang/String;)Ljy1/a;",
        "paymentMethodType",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;)Ljy1/a;",
        "",
        "success",
        "h",
        "(Ljava/lang/String;Z)Ljy1/a;",
        "g",
        "status",
        "errorType",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljy1/a;",
        "endpoint",
        "d",
        "",
        "statusCode",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljy1/a;",
        "",
        "latencyMs",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljy1/a;",
        "payments_release"
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
.field public static final a:La32/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La32/c;

    invoke-direct {v0}, La32/c;-><init>()V

    sput-object v0, La32/c;->a:La32/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljy1/a;
    .locals 9

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljy1/a;

    const-string v0, "screen:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "payment_method_type:"

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "mobile.payment.paymentMethodSelected"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final b(Ljava/lang/String;)Ljy1/a;
    .locals 9

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljy1/a;

    const-string v0, "screen:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "mobile.payment.paymentOptionsOpen"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljy1/a;
    .locals 9

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endpoint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    const-string v1, "endpoint:"

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    const-string p2, "error_type:"

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "status_code:"

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string p2, "screen:"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v5

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    new-instance v1, Ljy1/a;

    const/4 v2, 0x0

    const-string v3, "mobile.payment.update.api.error"

    const/4 v4, 0x0

    const/4 v7, 0x5

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)Ljy1/a;
    .locals 9

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endpoint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljy1/a;

    const-string v0, "endpoint:"

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "screen:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "mobile.payment.update.api.success"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljy1/a;
    .locals 9

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    const-string v1, "screen:"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    const-string p1, "status:"

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_0

    const-string p1, "error_type:"

    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v5

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    new-instance v1, Ljy1/a;

    const/4 v2, 0x0

    const-string v3, "mobile.payment.setupIntent.clientTerminal"

    const/4 v4, 0x0

    const/4 v7, 0x5

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljy1/a;
    .locals 8

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    long-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p3

    const-string p4, "screen:"

    invoke-virtual {p4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    const-string p1, "status:"

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    if-eqz p5, :cond_0

    const-string p1, "error_type:"

    invoke-virtual {p1, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {p3}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v4

    sget-object v5, Lcom/whoop/metrics/domain/models/MetricPostType;->HISTOGRAM:Lcom/whoop/metrics/domain/models/MetricPostType;

    new-instance v0, Ljy1/a;

    const/4 v1, 0x0

    const-string v2, "mobile.payment.setupIntent.clientTerminal"

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final g(Ljava/lang/String;)Ljy1/a;
    .locals 9

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljy1/a;

    const-string v0, "screen:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "mobile.payment.setupIntent.confirmAttempt"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final h(Ljava/lang/String;Z)Ljy1/a;
    .locals 9

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljy1/a;

    const-string v0, "screen:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_0

    const-string p2, "success"

    goto :goto_0

    :cond_0
    const-string p2, "failure"

    :goto_0
    const-string v0, "status:"

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "mobile.payment.setupIntent.created"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
