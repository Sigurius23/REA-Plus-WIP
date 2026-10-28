.class public final Lbi2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0018R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u001a0\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0018\u00a8\u0006\u001d"
    }
    d2 = {
        "Lbi2/j;",
        "",
        "Lbc3/c0;",
        "scope",
        "Lyh2/d;",
        "watermarkDatabaseProvider",
        "<init>",
        "(Lbc3/c0;Lyh2/d;)V",
        "",
        "serial",
        "Lyh2/a;",
        "type",
        "f",
        "(Ljava/lang/String;Lyh2/a;)Ljava/lang/String;",
        "deviceSerial",
        "Lec3/f2;",
        "",
        "c",
        "(Ljava/lang/String;Lyh2/a;)Lec3/f2;",
        "a",
        "Lbc3/c0;",
        "b",
        "Lyh2/d;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "localStorageWatermarks",
        "Lec3/p1;",
        "d",
        "highWaterMarks",
        "strap-history-sync_release"
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
.field private final a:Lbc3/c0;

.field private final b:Lyh2/d;

.field private final c:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lec3/f2;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lec3/p1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Lyh2/d;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "watermarkDatabaseProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbi2/j;->a:Lbc3/c0;

    iput-object p2, p0, Lbi2/j;->b:Lyh2/d;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lbi2/j;->c:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lbi2/j;->d:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static synthetic a(Lbe1/c;Ljava/lang/Object;)Lec3/f2;
    .locals 0

    invoke-static {p0, p1}, Lbi2/j;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbi2/j;Lyh2/a;Ljava/lang/String;)Lec3/f2;
    .locals 0

    invoke-static {p0, p1, p2}, Lbi2/j;->d(Lbi2/j;Lyh2/a;Ljava/lang/String;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lbi2/j;Lyh2/a;Ljava/lang/String;)Lec3/f2;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lbi2/j;->b:Lyh2/d;

    invoke-interface {p2, p1}, Lyh2/d;->a(Lyh2/a;)Lec3/l;

    move-result-object p1

    iget-object p0, p0, Lbi2/j;->a:Lbc3/c0;

    const/4 p2, 0x3

    const-wide/16 v0, 0x0

    invoke-static {p2, v0, v1}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, p0, p2, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lec3/f2;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lec3/f2;

    return-object p0
.end method

.method private final f(Ljava/lang/String;Lyh2/a;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    const-string v0, ":"

    invoke-static {p1, v0, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lyh2/a;)Lec3/f2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lyh2/a;",
            ")",
            "Lec3/f2;"
        }
    .end annotation

    const-string v0, "deviceSerial"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbi2/j;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p0, p1, p2}, Lbi2/j;->f(Ljava/lang/String;Lyh2/a;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lbe1/c;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0, p2}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Laq0/j;

    const/4 v2, 0x1

    invoke-direct {p2, v1, v2}, Laq0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "computeIfAbsent(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lec3/f2;

    return-object p1
.end method
