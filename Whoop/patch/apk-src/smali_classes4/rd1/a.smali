.class public final Lrd1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lrd1/a;",
        "",
        "Ltr2/n;",
        "logger",
        "Liy1/c;",
        "metricsInteractor",
        "Lbc3/c0;",
        "coroutineScope",
        "Lz92/a;",
        "userInfoAccessor",
        "Lca2/h;",
        "rawDataTrackingService",
        "<init>",
        "(Ltr2/n;Liy1/c;Lbc3/c0;Lz92/a;Lca2/h;)V",
        "",
        "oldestPacketTimeMillis",
        "Ljava/time/Instant;",
        "nowInstant",
        "Ll83/a0;",
        "e",
        "(JLjava/time/Instant;)V",
        "a",
        "Ltr2/n;",
        "b",
        "Liy1/c;",
        "c",
        "Lbc3/c0;",
        "d",
        "Lz92/a;",
        "Lca2/h;",
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
.field private final a:Ltr2/n;

.field private final b:Liy1/c;

.field private final c:Lbc3/c0;

.field private final d:Lz92/a;

.field private final e:Lca2/h;


# direct methods
.method public constructor <init>(Ltr2/n;Liy1/c;Lbc3/c0;Lz92/a;Lca2/h;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoAccessor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawDataTrackingService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd1/a;->a:Ltr2/n;

    iput-object p2, p0, Lrd1/a;->b:Liy1/c;

    iput-object p3, p0, Lrd1/a;->c:Lbc3/c0;

    iput-object p4, p0, Lrd1/a;->d:Lz92/a;

    iput-object p5, p0, Lrd1/a;->e:Lca2/h;

    return-void
.end method

.method public static final synthetic a(Lrd1/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lrd1/a;->a:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic b(Lrd1/a;)Liy1/c;
    .locals 0

    iget-object p0, p0, Lrd1/a;->b:Liy1/c;

    return-object p0
.end method

.method public static final synthetic c(Lrd1/a;)Lca2/h;
    .locals 0

    iget-object p0, p0, Lrd1/a;->e:Lca2/h;

    return-object p0
.end method

.method public static final synthetic d(Lrd1/a;)Lz92/a;
    .locals 0

    iget-object p0, p0, Lrd1/a;->d:Lz92/a;

    return-object p0
.end method


# virtual methods
.method public final e(JLjava/time/Instant;)V
    .locals 7

    const-string v0, "nowInstant"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrd1/a;->c:Lbc3/c0;

    new-instance v1, Lrd1/a$a;

    const/4 v6, 0x0

    move-object v2, p0

    move-wide v4, p1

    move-object v3, p3

    invoke-direct/range {v1 .. v6}, Lrd1/a$a;-><init>(Lrd1/a;Ljava/time/Instant;JLq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
