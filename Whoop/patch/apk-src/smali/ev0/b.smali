.class public final Lev0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001cR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0011\u0010\'\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lev0/b;",
        "",
        "Ltr2/n;",
        "logger",
        "Lbc3/c0;",
        "coroutineScope",
        "Ltd1/b;",
        "whoopStrapProxy",
        "Lzr2/a;",
        "dateTimeProvider",
        "<init>",
        "(Ltr2/n;Lbc3/c0;Ltd1/b;Lzr2/a;)V",
        "Lev0/a;",
        "currentState",
        "",
        "g",
        "(Lev0/a;)J",
        "Ll83/a0;",
        "h",
        "()V",
        "d",
        "a",
        "Ltr2/n;",
        "b",
        "Lbc3/c0;",
        "c",
        "Lzr2/a;",
        "Lbc3/k1;",
        "Lbc3/k1;",
        "monitorStrapStatusJob",
        "Lec3/t1;",
        "e",
        "Lec3/t1;",
        "strapDisconnectedFlow",
        "",
        "f",
        "()I",
        "numberOfDisconnects",
        "()J",
        "durationOfDisconnect",
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
.field private final a:Ltr2/n;

.field private final b:Lbc3/c0;

.field private final c:Lzr2/a;

.field private d:Lbc3/k1;

.field private final e:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltr2/n;Lbc3/c0;Ltd1/b;Lzr2/a;)V
    .locals 9

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProxy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateTimeProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev0/b;->a:Ltr2/n;

    iput-object p2, p0, Lev0/b;->b:Lbc3/c0;

    iput-object p4, p0, Lev0/b;->c:Lzr2/a;

    invoke-interface {p3}, Ltd1/b;->r()Lec3/l;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lev0/a;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lev0/a;-><init>(IJJLtd1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p3, Lev0/b$b;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lev0/b$b;-><init>(Lev0/b;Lq83/d;)V

    new-instance p4, Lec3/l1;

    invoke-direct {p4, v0, p1, p3}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const-wide/16 v0, 0x0

    const/4 p1, 0x3

    invoke-static {p1, v0, v1}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object p1

    const/4 p3, 0x1

    invoke-static {p4, p2, p1, p3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lev0/b;->e:Lec3/t1;

    return-void
.end method

.method public static final synthetic a(Lev0/b;)Lzr2/a;
    .locals 0

    iget-object p0, p0, Lev0/b;->c:Lzr2/a;

    return-object p0
.end method

.method public static final synthetic b(Lev0/b;)Lec3/t1;
    .locals 0

    iget-object p0, p0, Lev0/b;->e:Lec3/t1;

    return-object p0
.end method

.method public static final synthetic c(Lev0/b;Lev0/a;)J
    .locals 0

    invoke-direct {p0, p1}, Lev0/b;->g(Lev0/a;)J

    move-result-wide p0

    return-wide p0
.end method

.method private final g(Lev0/a;)J
    .locals 5

    invoke-virtual {p1}, Lev0/a;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iget-object v2, p0, Lev0/b;->c:Lzr2/a;

    invoke-interface {v2}, Lzr2/a;->b()J

    move-result-wide v2

    sub-long/2addr v2, v0

    :cond_0
    invoke-virtual {p1}, Lev0/a;->d()J

    move-result-wide v0

    add-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Lev0/b;->d:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Lev0/b;->d:Lbc3/k1;

    return-void
.end method

.method public final e()J
    .locals 7

    iget-object v0, p0, Lev0/b;->e:Lec3/t1;

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lev0/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lev0/a;->f()Ltd1/e;

    move-result-object v1

    sget-object v2, Ltd1/e;->NONE:Ltd1/e;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Lev0/a;->f()Ltd1/e;

    move-result-object v1

    sget-object v2, Ltd1/e;->CONNECTION_FAILED:Ltd1/e;

    if-ne v1, v2, :cond_1

    :cond_0
    invoke-virtual {v0}, Lev0/a;->e()J

    move-result-wide v1

    invoke-virtual {v0}, Lev0/a;->d()J

    move-result-wide v3

    iget-object v0, p0, Lev0/b;->c:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->b()J

    move-result-wide v5

    sub-long/2addr v5, v1

    add-long/2addr v5, v3

    return-wide v5

    :cond_1
    iget-object v0, p0, Lev0/b;->e:Lec3/t1;

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lev0/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lev0/a;->d()J

    move-result-wide v0

    return-wide v0

    :cond_2
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lev0/b;->e:Lec3/t1;

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lev0/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lev0/a;->c()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Lev0/b;->d:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lev0/b;->b:Lbc3/c0;

    new-instance v2, Lev0/b$a;

    invoke-direct {v2, p0, v1}, Lev0/b$a;-><init>(Lev0/b;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v1, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lev0/b;->d:Lbc3/k1;

    return-void
.end method
