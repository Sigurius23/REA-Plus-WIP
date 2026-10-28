.class public final Lhu1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhu1/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u0000 +2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ&\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@\u00a2\u0006\u0004\u0008 \u0010!J\u001e\u0010#\u001a\u00020\u00142\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086@\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\'R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lhu1/i;",
        "",
        "Ltr2/n;",
        "logger",
        "Lhu1/d;",
        "labradorPacketsDao",
        "Lmh2/a;",
        "strapMetadataDaoInteractor",
        "Lfi0/a;",
        "baseAnalytics",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(Ltr2/n;Lhu1/d;Lmh2/a;Lfi0/a;Ljava/time/Clock;)V",
        "",
        "action",
        "",
        "timeDiff",
        "",
        "numberOfPackets",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/String;JI)V",
        "Lhu1/c;",
        "labradorPacketsBatch",
        "",
        "c",
        "(Lhu1/c;Lq83/d;)Ljava/lang/Object;",
        "",
        "packetRevision",
        "",
        "Lhu1/b;",
        "b",
        "(ISLq83/d;)Ljava/lang/Object;",
        "labradorPacketDtoList",
        "a",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "Lhu1/d;",
        "Lmh2/a;",
        "Lfi0/a;",
        "e",
        "Ljava/time/Clock;",
        "f",
        "labrador-service_release"
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
.field private static final f:Lhu1/i$a;


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lhu1/d;

.field private final c:Lmh2/a;

.field private final d:Lfi0/a;

.field private final e:Ljava/time/Clock;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhu1/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhu1/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhu1/i;->f:Lhu1/i$a;

    return-void
.end method

.method public constructor <init>(Ltr2/n;Lhu1/d;Lmh2/a;Lfi0/a;Ljava/time/Clock;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labradorPacketsDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapMetadataDaoInteractor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseAnalytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhu1/i;->a:Ltr2/n;

    iput-object p2, p0, Lhu1/i;->b:Lhu1/d;

    iput-object p3, p0, Lhu1/i;->c:Lmh2/a;

    iput-object p4, p0, Lhu1/i;->d:Lfi0/a;

    iput-object p5, p0, Lhu1/i;->e:Ljava/time/Clock;

    return-void
.end method

.method private final d(Ljava/lang/String;JI)V
    .locals 9

    new-instance v0, Ll83/k;

    const-string v1, "Feature"

    const-string v2, "ECG"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p4

    new-instance v1, Ll83/k;

    const-string v2, "Number Of Records"

    invoke-direct {v1, v2, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ll83/k;

    invoke-direct {p3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, p3}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v6

    iget-object v0, p0, Lhu1/i;->d:Lfi0/a;

    const/16 v7, 0x16

    const/4 v8, 0x0

    const-string v1, "Connectivity"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "DB Query Performance"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lhu1/b;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lhu1/i$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lhu1/i$b;

    iget v1, v0, Lhu1/i$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhu1/i$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhu1/i$b;

    invoke-direct {v0, p0, p2}, Lhu1/i$b;-><init>(Lhu1/i;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lhu1/i$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhu1/i$b;->E:I

    const/4 v3, 0x1

    const-string v4, "Delete"

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide v1, v0, Lhu1/i$b;->x:J

    iget-object p1, v0, Lhu1/i$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lhu1/i;->e:Ljava/time/Clock;

    invoke-virtual {p2}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    :try_start_1
    iget-object p2, p0, Lhu1/i;->b:Lhu1/d;

    iput-object p1, v0, Lhu1/i$b;->w:Ljava/lang/Object;

    iput-wide v5, v0, Lhu1/i$b;->x:J

    iput v3, v0, Lhu1/i$b;->E:I

    invoke-interface {p2, p1, v0}, Lhu1/d;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-wide v1, v5

    :goto_1
    iget-object p2, p0, Lhu1/i;->e:Ljava/time/Clock;

    invoke-virtual {p2}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    sub-long/2addr v5, v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {p0, v4, v5, v6, p1}, Lhu1/i;->d(Ljava/lang/String;JI)V

    goto :goto_2

    :catchall_1
    move-exception p2

    move-wide v1, v5

    goto :goto_3

    :catch_0
    move-wide v1, v5

    :catch_1
    :try_start_2
    iget-object p2, p0, Lhu1/i;->a:Ltr2/n;

    const-string v0, "Error deleting ECG packets from database"

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p2, v0, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    iget-object v0, p0, Lhu1/i;->e:Ljava/time/Clock;

    invoke-virtual {v0}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    sub-long/2addr v5, v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {p0, v4, v5, v6, p1}, Lhu1/i;->d(Ljava/lang/String;JI)V

    throw p2
.end method

.method public final b(ISLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IS",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lhu1/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lhu1/i$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lhu1/i$c;

    iget v1, v0, Lhu1/i$c;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhu1/i$c;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhu1/i$c;

    invoke-direct {v0, p0, p3}, Lhu1/i$c;-><init>(Lhu1/i;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lhu1/i$c;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhu1/i$c;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lhu1/i$c;->y:J

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_5

    :catch_0
    move-exception p3

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lhu1/i;->e:Ljava/time/Clock;

    invoke-virtual {p3}, Ljava/time/Clock;->millis()J

    move-result-wide v4

    :try_start_1
    iget-object p3, p0, Lhu1/i;->b:Lhu1/d;

    iput p1, v0, Lhu1/i$c;->w:I

    iput-short p2, v0, Lhu1/i$c;->x:S

    iput-wide v4, v0, Lhu1/i$c;->y:J

    const-wide/16 v6, 0x0

    iput-wide v6, v0, Lhu1/i$c;->z:J

    iput v3, v0, Lhu1/i$c;->G:I

    invoke-interface {p3, p1, p2, v0}, Lhu1/d;->b(IILq83/d;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-wide p1, v4

    :goto_1
    :try_start_2
    check-cast p3, Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    iget-object v0, p0, Lhu1/i;->e:Ljava/time/Clock;

    invoke-virtual {v0}, Ljava/time/Clock;->millis()J

    move-result-wide v0

    goto :goto_4

    :catch_1
    move-exception p3

    move-wide p1, v4

    :goto_3
    :try_start_3
    iget-object v0, p0, Lhu1/i;->a:Ltr2/n;

    const-string v1, "Could not read from ecg database"

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, p3, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p3, Lm83/y;->w:Lm83/y;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :goto_4
    sub-long/2addr v0, p1

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    const-string p2, "Get"

    invoke-direct {p0, p2, v0, v1, p1}, Lhu1/i;->d(Ljava/lang/String;JI)V

    return-object p3

    :goto_5
    iget-object p2, p0, Lhu1/i;->e:Ljava/time/Clock;

    invoke-virtual {p2}, Ljava/time/Clock;->millis()J

    throw p1
.end method

.method public final c(Lhu1/c;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhu1/c;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Failed to save "

    instance-of v1, p2, Lhu1/i$d;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lhu1/i$d;

    iget v2, v1, Lhu1/i$d;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lhu1/i$d;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lhu1/i$d;

    invoke-direct {v1, p0, p2}, Lhu1/i$d;-><init>(Lhu1/i;Lq83/d;)V

    :goto_0
    iget-object p2, v1, Lhu1/i$d;->E:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lhu1/i$d;->G:I

    const-string v4, "Save"

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-wide v2, v1, Lhu1/i$d;->y:J

    iget-object p1, v1, Lhu1/i$d;->x:Ljava/lang/Object;

    check-cast p1, Loh2/d;

    iget-object p1, v1, Lhu1/i$d;->w:Ljava/lang/Object;

    check-cast p1, Lhu1/c;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lhu1/c;->c()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    iget-object p2, p0, Lhu1/i;->e:Ljava/time/Clock;

    invoke-virtual {p2}, Ljava/time/Clock;->millis()J

    move-result-wide v6

    :try_start_1
    invoke-virtual {p1}, Lhu1/c;->b()Loh2/a;

    move-result-object p2

    invoke-static {p2}, Loh2/d;->i(Loh2/a;)Loh2/d;

    move-result-object p2

    iget-object v3, p0, Lhu1/i;->c:Lmh2/a;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, p2}, Lmh2/a;->j(Loh2/d;)I

    move-result p2

    iget-object v3, p0, Lhu1/i;->b:Lhu1/d;

    invoke-virtual {p1}, Lhu1/c;->c()Ljava/util/List;

    move-result-object v8

    invoke-static {v8, p2}, Lhu1/j;->a(Ljava/util/List;I)Ljava/util/List;

    move-result-object v8

    iput-object p1, v1, Lhu1/i$d;->w:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v1, Lhu1/i$d;->x:Ljava/lang/Object;

    iput-wide v6, v1, Lhu1/i$d;->y:J

    iput p2, v1, Lhu1/i$d;->z:I

    iput v5, v1, Lhu1/i$d;->G:I

    invoke-interface {v3, v8, v1}, Lhu1/d;->insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v2, :cond_4

    return-object v2

    :cond_4
    move-wide v2, v6

    :goto_1
    iget-object p2, p0, Lhu1/i;->e:Ljava/time/Clock;

    invoke-virtual {p2}, Ljava/time/Clock;->millis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    invoke-virtual {p1}, Lhu1/c;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {p0, v4, v0, v1, p1}, Lhu1/i;->d(Ljava/lang/String;JI)V

    goto :goto_2

    :catchall_1
    move-exception p2

    move-wide v2, v6

    goto :goto_3

    :catch_0
    move-wide v2, v6

    :catch_1
    :try_start_2
    iget-object p2, p0, Lhu1/i;->a:Ltr2/n;

    invoke-virtual {p1}, Lhu1/c;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " number of Raw ECG packets in the database"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :goto_3
    iget-object v0, p0, Lhu1/i;->e:Ljava/time/Clock;

    invoke-virtual {v0}, Ljava/time/Clock;->millis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    invoke-virtual {p1}, Lhu1/c;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {p0, v4, v0, v1, p1}, Lhu1/i;->d(Ljava/lang/String;JI)V

    throw p2
.end method
