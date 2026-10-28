.class public final Lca2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u001d\u0010*\u001a\u0008\u0012\u0004\u0012\u00020!0%8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lca2/b;",
        "",
        "Lzr2/a;",
        "timeProvider",
        "Ltr2/n;",
        "logger",
        "Lbc3/c0;",
        "coroutineScope",
        "Ldt0/d;",
        "dataSyncService",
        "<init>",
        "(Lzr2/a;Ltr2/n;Lbc3/c0;Ldt0/d;)V",
        "Lcom/whoop/domain/model/MetricsProcessedTime;",
        "metricsProcessedTime",
        "Lca2/c;",
        "h",
        "(Lcom/whoop/domain/model/MetricsProcessedTime;)Lca2/c;",
        "",
        "j",
        "(Lcom/whoop/domain/model/MetricsProcessedTime;)Z",
        "Lorg/joda/time/DateTime;",
        "i",
        "(Lcom/whoop/domain/model/MetricsProcessedTime;)Lorg/joda/time/DateTime;",
        "timestamp",
        "",
        "f",
        "(Lorg/joda/time/DateTime;)I",
        "a",
        "Lzr2/a;",
        "b",
        "Ltr2/n;",
        "c",
        "Ldt0/d;",
        "Lca2/a;",
        "d",
        "Lca2/a;",
        "initial",
        "Lec3/l;",
        "e",
        "Lec3/l;",
        "g",
        "()Lec3/l;",
        "dataCatchingUpDomainResultFlow",
        "core_release"
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
.field private final a:Lzr2/a;

.field private final b:Ltr2/n;

.field private final c:Ldt0/d;

.field private final d:Lca2/a;

.field private final e:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lzr2/a;Ltr2/n;Lbc3/c0;Ldt0/d;)V
    .locals 8

    const-string v0, "timeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSyncService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca2/b;->a:Lzr2/a;

    iput-object p2, p0, Lca2/b;->b:Ltr2/n;

    iput-object p4, p0, Lca2/b;->c:Ldt0/d;

    new-instance v1, Lca2/a;

    invoke-interface {p1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lca2/a;-><init>(ZLorg/joda/time/DateTime;Lca2/c;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lca2/b;->d:Lca2/a;

    invoke-interface {p4}, Ldt0/d;->a()Lec3/f2;

    move-result-object p1

    new-instance p2, Lca2/b$b;

    invoke-direct {p2, p1, p0}, Lca2/b$b;-><init>(Lec3/l;Lca2/b;)V

    new-instance p1, Lca2/b$c;

    const/4 p4, 0x0

    invoke-direct {p1, p2, p4, p0}, Lca2/b$c;-><init>(Lec3/l;Lq83/d;Lca2/b;)V

    new-instance p2, Lec3/s1;

    invoke-direct {p2, p1}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance p1, Lca2/b$a;

    invoke-direct {p1, p0, p4}, Lca2/b$a;-><init>(Lca2/b;Lq83/d;)V

    new-instance p4, Lec3/l1;

    invoke-direct {p4, v1, p2, p1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 p2, 0x1

    invoke-static {p4, p3, p1, p2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lca2/b;->e:Lec3/l;

    return-void
.end method

.method public static final synthetic a(Lca2/b;Lorg/joda/time/DateTime;)I
    .locals 0

    invoke-direct {p0, p1}, Lca2/b;->f(Lorg/joda/time/DateTime;)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lca2/b;Lcom/whoop/domain/model/MetricsProcessedTime;)Lca2/c;
    .locals 0

    invoke-direct {p0, p1}, Lca2/b;->h(Lcom/whoop/domain/model/MetricsProcessedTime;)Lca2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lca2/b;)Lca2/a;
    .locals 0

    iget-object p0, p0, Lca2/b;->d:Lca2/a;

    return-object p0
.end method

.method public static final synthetic d(Lca2/b;Lcom/whoop/domain/model/MetricsProcessedTime;)Lorg/joda/time/DateTime;
    .locals 0

    invoke-direct {p0, p1}, Lca2/b;->i(Lcom/whoop/domain/model/MetricsProcessedTime;)Lorg/joda/time/DateTime;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lca2/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lca2/b;->b:Ltr2/n;

    return-object p0
.end method

.method private final f(Lorg/joda/time/DateTime;)I
    .locals 4

    iget-object v0, p0, Lca2/b;->a:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 p1, 0x1

    sget-object v2, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    invoke-static {p1, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v2

    div-long/2addr v0, v2

    long-to-int p1, v0

    return p1
.end method

.method private final h(Lcom/whoop/domain/model/MetricsProcessedTime;)Lca2/c;
    .locals 0

    invoke-direct {p0, p1}, Lca2/b;->j(Lcom/whoop/domain/model/MetricsProcessedTime;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lca2/c;->CATCHING_UP:Lca2/c;

    return-object p1

    :cond_0
    sget-object p1, Lca2/c;->CAUGHT_UP:Lca2/c;

    return-object p1
.end method

.method private final i(Lcom/whoop/domain/model/MetricsProcessedTime;)Lorg/joda/time/DateTime;
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/domain/model/MetricsProcessedTime;->getTime()Lorg/joda/time/LocalDateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/LocalDateTime;->toDateTime()Lorg/joda/time/DateTime;

    move-result-object p1

    const-string v0, "toDateTime(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final j(Lcom/whoop/domain/model/MetricsProcessedTime;)Z
    .locals 4

    invoke-virtual {p1}, Lcom/whoop/domain/model/MetricsProcessedTime;->getTime()Lorg/joda/time/LocalDateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/LocalDateTime;->toDateTime()Lorg/joda/time/DateTime;

    move-result-object p1

    iget-object v0, p0, Lca2/b;->a:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sget-object p1, Lor2/u;->b:Lor2/u$a;

    invoke-virtual {p1}, Lor2/u$a;->h()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final g()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lca2/b;->e:Lec3/l;

    return-object v0
.end method
