.class public final Ljw0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u001e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Ljw0/d;",
        "",
        "Lin2/d;",
        "dispatcher",
        "Llw0/a;",
        "sleepRepository",
        "Lwm0/a;",
        "scopeCoordinator",
        "<init>",
        "(Lin2/d;Llw0/a;Lwm0/a;)V",
        "",
        "sleepIdV2",
        "Lec3/l;",
        "Ljw0/c;",
        "f",
        "(Ljava/lang/String;)Lec3/l;",
        "h",
        "Lmw0/b;",
        "viewEvent",
        "g",
        "(Lmw0/b;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lin2/d;",
        "b",
        "Llw0/a;",
        "c",
        "Lwm0/a;",
        "",
        "d",
        "J",
        "successScreenVisibilityLength",
        "core-details_release"
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
.field private final a:Lin2/d;

.field private final b:Llw0/a;

.field private final c:Lwm0/a;

.field private final d:J


# direct methods
.method public constructor <init>(Lin2/d;Llw0/a;Lwm0/a;)V
    .locals 1

    const-string v0, "dispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljw0/d;->a:Lin2/d;

    iput-object p2, p0, Ljw0/d;->b:Llw0/a;

    iput-object p3, p0, Ljw0/d;->c:Lwm0/a;

    const-wide/16 p1, 0x7d0

    iput-wide p1, p0, Ljw0/d;->d:J

    return-void
.end method

.method public static final synthetic a(Ljw0/d;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Ljw0/d;->f(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljw0/d;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Ljw0/d;->c:Lwm0/a;

    return-object p0
.end method

.method public static final synthetic c(Ljw0/d;)Llw0/a;
    .locals 0

    iget-object p0, p0, Ljw0/d;->b:Llw0/a;

    return-object p0
.end method

.method public static final synthetic d(Ljw0/d;)J
    .locals 2

    iget-wide v0, p0, Ljw0/d;->d:J

    return-wide v0
.end method

.method public static final synthetic e(Ljw0/d;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Ljw0/d;->h(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ljw0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ljw0/d$a;-><init>(Ljw0/d;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final h(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ljw0/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ljw0/d$c;-><init>(Ljw0/d;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public final g(Lmw0/b;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmw0/b;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljw0/d;->a:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Ljw0/d$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Ljw0/d$b;-><init>(Lmw0/b;Ljw0/d;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
