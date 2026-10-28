.class public final Lgl1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000c*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lgl1/a;",
        "",
        "Lgl1/b;",
        "analyticsHelper",
        "Liy1/c;",
        "metricWriter",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lgl1/b;Liy1/c;Ltr2/n;)V",
        "Ley1/a;",
        "action",
        "Ley1/b;",
        "screen",
        "Ll83/a0;",
        "c",
        "(Ley1/a;Ley1/b;)V",
        "Lcom/whoop/navigation/AppScreen;",
        "a",
        "(Lcom/whoop/navigation/AppScreen;)Ley1/b;",
        "",
        "autoPopId",
        "",
        "hijackDetected",
        "b",
        "(Lcom/whoop/navigation/AppScreen;Ljava/lang/String;Z)V",
        "Lgl1/b;",
        "Liy1/c;",
        "Ltr2/n;",
        "home_release"
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
.field private final a:Lgl1/b;

.field private final b:Liy1/c;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lgl1/b;Liy1/c;Ltr2/n;)V
    .locals 1

    const-string v0, "analyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lgl1/a;->a:Lgl1/b;

    .line 3
    iput-object p2, p0, Lgl1/a;->b:Liy1/c;

    .line 4
    iput-object p3, p0, Lgl1/a;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lgl1/b;Liy1/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "AutoPopTracker"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lgl1/a;-><init>(Lgl1/b;Liy1/c;Ltr2/n;)V

    return-void
.end method

.method private final a(Lcom/whoop/navigation/AppScreen;)Ley1/b;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/AppScreen$b3;->w:Lcom/whoop/navigation/AppScreen$b3;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ley1/b;->JOURNAL:Ley1/b;

    return-object p1

    :cond_0
    sget-object v0, Lcom/whoop/navigation/AppScreen$u0;->w:Lcom/whoop/navigation/AppScreen$u0;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Ley1/b;->COACH:Ley1/b;

    return-object p1

    :cond_1
    sget-object v0, Lcom/whoop/navigation/AppScreen$b;->w:Lcom/whoop/navigation/AppScreen$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Ley1/b;->ACHIEVEMENT:Ley1/b;

    return-object p1

    :cond_2
    sget-object v0, Lcom/whoop/navigation/AppScreen$t5;->w:Lcom/whoop/navigation/AppScreen$t5;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Ley1/b;->STREAK_CELEBRATION:Ley1/b;

    return-object p1

    :cond_3
    sget-object v0, Lcom/whoop/navigation/AppScreen$s3;->w:Lcom/whoop/navigation/AppScreen$s3;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p1, Ley1/b;->MARKETING_CONSENT:Ley1/b;

    return-object p1

    :cond_4
    sget-object v0, Lcom/whoop/navigation/AppScreen$k2;->w:Lcom/whoop/navigation/AppScreen$k2;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p1, Ley1/b;->GENERIC:Ley1/b;

    return-object p1

    :cond_5
    sget-object v0, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Ley1/b;->HOME:Ley1/b;

    return-object p1

    :cond_6
    sget-object v0, Lcom/whoop/navigation/AppScreen$w1;->w:Lcom/whoop/navigation/AppScreen$w1;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Ley1/b;->DAY_ZERO_SPLASH:Ley1/b;

    return-object p1

    :cond_7
    sget-object p1, Ley1/b;->OTHER:Ley1/b;

    return-object p1
.end method

.method private final c(Ley1/a;Ley1/b;)V
    .locals 9

    iget-object v0, p0, Lgl1/a;->b:Liy1/c;

    new-instance v1, Ljy1/a;

    invoke-virtual {p1}, Ley1/a;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Ley1/b;->getTag()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/whoop/navigation/AppScreen;Ljava/lang/String;Z)V
    .locals 5

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoPopId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lgl1/a;->a(Lcom/whoop/navigation/AppScreen;)Ley1/b;

    move-result-object v0

    sget-object v1, Ley1/a;->PRESENTED:Ley1/a;

    invoke-direct {p0, v1, v0}, Lgl1/a;->c(Ley1/a;Ley1/b;)V

    if-eqz p3, :cond_0

    iget-object p3, p0, Lgl1/a;->c:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, ":"

    const-string v3, " over a non-Home destination"

    const-string v4, "hijack detected: presented "

    invoke-static {v4, v1, v2, p2, v3}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p3, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p3, Ley1/a;->HIJACK_DETECTED:Ley1/a;

    invoke-direct {p0, p3, v0}, Lgl1/a;->c(Ley1/a;Ley1/b;)V

    :cond_0
    iget-object p3, p0, Lgl1/a;->a:Lgl1/b;

    invoke-virtual {p1}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, Lgl1/b;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
