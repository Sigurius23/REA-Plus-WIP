.class public final Lcom/whoop/straphistorysync/sync/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbi2/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/straphistorysync/sync/j$a;,
        Lcom/whoop/straphistorysync/sync/j$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u0000 42\u00020\u0001:\u0001DB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J \u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJA\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J1\u0010*\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008,\u0010-J\'\u00100\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.H\u0002\u00a2\u0006\u0004\u00080\u00101J\'\u00104\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\u00084\u00105J\u001f\u00108\u001a\u0002072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00106\u001a\u00020#H\u0002\u00a2\u0006\u0004\u00088\u00109J\u001f\u0010<\u001a\u00020%2\u0006\u0010;\u001a\u00020:2\u0006\u0010/\u001a\u00020.H\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u001f\u0010?\u001a\u00020%2\u0006\u0010;\u001a\u00020:2\u0006\u0010/\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008?\u0010@J#\u0010D\u001a\u0008\u0012\u0004\u0012\u00020C0A2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00100AH\u0016\u00a2\u0006\u0004\u0008D\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010L\u00a8\u0006M"
    }
    d2 = {
        "Lcom/whoop/straphistorysync/sync/j;",
        "Lbi2/h;",
        "Lzh2/d;",
        "packetSink",
        "Lcom/whoop/domain/model/WhoopStrapInfo;",
        "strapInfo",
        "Lwh2/a;",
        "analytics",
        "Lca2/h;",
        "rawDataTrackingService",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lzh2/d;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;Lca2/h;Ltr2/n;)V",
        "Lcom/whoop/straphistorysync/sync/b;",
        "state",
        "Llt0/k;",
        "parsedPacket",
        "l",
        "(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lq83/d;)Ljava/lang/Object;",
        "Ldk0/e;",
        "packet",
        "j",
        "(Lcom/whoop/straphistorysync/sync/b;Ldk0/e;)Lcom/whoop/straphistorysync/sync/b;",
        "Ldk0/c;",
        "i",
        "(Lcom/whoop/straphistorysync/sync/b;Ldk0/c;Lq83/d;)Ljava/lang/Object;",
        "",
        "isSuccess",
        "",
        "burstDurationMs",
        "expectedCount",
        "actualCount",
        "",
        "consecutiveFailures",
        "Lzh2/b;",
        "sequenceInfo",
        "Ll83/a0;",
        "d",
        "(ZJLjava/lang/Long;JILzh2/b;)V",
        "Loh2/a;",
        "metadata",
        "g",
        "(Lcom/whoop/straphistorysync/sync/b;Loh2/a;Ljava/lang/Long;J)Lcom/whoop/straphistorysync/sync/b;",
        "h",
        "(Lcom/whoop/straphistorysync/sync/b;)Lcom/whoop/straphistorysync/sync/b;",
        "Llt0/f;",
        "dataPacket",
        "e",
        "(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Llt0/f;)Lcom/whoop/straphistorysync/sync/b;",
        "Lot0/b;",
        "eventPacket",
        "f",
        "(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lot0/b;)Lcom/whoop/straphistorysync/sync/b;",
        "burstInfo",
        "Lbi2/k;",
        "k",
        "(Lcom/whoop/straphistorysync/sync/b;Lzh2/b;)Lbi2/k;",
        "Llt0/m;",
        "receivedPacket",
        "m",
        "(Llt0/m;Llt0/f;)V",
        "Llt0/b;",
        "n",
        "(Llt0/m;Llt0/b;)V",
        "Lec3/l;",
        "upstream",
        "Lcom/whoop/straphistorysync/sync/f;",
        "a",
        "(Lec3/l;)Lec3/l;",
        "Lzh2/d;",
        "b",
        "Lcom/whoop/domain/model/WhoopStrapInfo;",
        "c",
        "Lwh2/a;",
        "Lca2/h;",
        "Ltr2/n;",
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


# static fields
.field public static final f:Lcom/whoop/straphistorysync/sync/j$a;


# instance fields
.field private final a:Lzh2/d;

.field private final b:Lcom/whoop/domain/model/WhoopStrapInfo;

.field private final c:Lwh2/a;

.field private final d:Lca2/h;

.field private final e:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/straphistorysync/sync/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/straphistorysync/sync/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/straphistorysync/sync/j;->f:Lcom/whoop/straphistorysync/sync/j$a;

    return-void
.end method

.method public constructor <init>(Lzh2/d;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;Lca2/h;Ltr2/n;)V
    .locals 1

    const-string v0, "packetSink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawDataTrackingService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    .line 3
    iput-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->b:Lcom/whoop/domain/model/WhoopStrapInfo;

    .line 4
    iput-object p3, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    .line 5
    iput-object p4, p0, Lcom/whoop/straphistorysync/sync/j;->d:Lca2/h;

    .line 6
    iput-object p5, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lzh2/d;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;Lca2/h;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "SensorSyncProcessor"

    invoke-virtual {p5, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/whoop/straphistorysync/sync/j;-><init>(Lzh2/d;Lcom/whoop/domain/model/WhoopStrapInfo;Lwh2/a;Lca2/h;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic b(Lcom/whoop/straphistorysync/sync/j;Lcom/whoop/straphistorysync/sync/b;Ldk0/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/straphistorysync/sync/j;->i(Lcom/whoop/straphistorysync/sync/b;Ldk0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/straphistorysync/sync/j;Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/straphistorysync/sync/j;->l(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(ZJLjava/lang/Long;JILzh2/b;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {v0, p1, p7}, Lwh2/a;->t(ZI)V

    iget-object p7, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {p7, p1, p2, p3}, Lwh2/a;->q(ZJ)V

    move p2, p1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide p3

    invoke-virtual/range {p1 .. p6}, Lwh2/a;->s(ZJJ)V

    :cond_0
    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {p1, p2, p8}, Lwh2/a;->r(ZLzh2/b;)V

    return-void
.end method

.method private final e(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Llt0/f;)Lcom/whoop/straphistorysync/sync/b;
    .locals 4

    instance-of v0, p3, Llt0/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Llt0/b;

    invoke-virtual {v0}, Llt0/b;->Z()I

    move-result v2

    const/16 v3, 0x2f

    if-eq v2, v3, :cond_0

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    invoke-virtual {v0}, Llt0/b;->Z()I

    move-result p3

    const-string v0, "Dropping non-historical packet (type="

    const-string v2, "); skipping HPS pipeline"

    invoke-static {p3, v0, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p2, p3, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->k()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    const-string p3, "Data packet received while not syncing"

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p2, p3, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    const-string p3, "data"

    invoke-virtual {p2, p3}, Lwh2/a;->v(Ljava/lang/String;)V

    new-instance p2, Lcom/whoop/straphistorysync/sync/f$b$c;

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->h()Lbi2/l;

    move-result-object p3

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v0

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v1

    invoke-direct {p2, p3, v0, v1}, Lcom/whoop/straphistorysync/sync/f$b$c;-><init>(Lbi2/l;ILbi2/k;)V

    invoke-virtual {p1, p2}, Lcom/whoop/straphistorysync/sync/b;->a(Lcom/whoop/straphistorysync/sync/f$b;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p2, Llt0/m;

    if-eqz v0, :cond_2

    check-cast p2, Llt0/m;

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_3

    return-object p1

    :cond_3
    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {p2}, Llt0/k;->a()Lmt0/b;

    move-result-object v1

    invoke-virtual {v1}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {v0, v1}, Lwh2/a;->e(I)V

    invoke-direct {p0, p2, p3}, Lcom/whoop/straphistorysync/sync/j;->m(Llt0/m;Llt0/f;)V

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    invoke-interface {v0, p2, p3}, Lzh2/d;->c(Llt0/m;Llt0/f;)V

    return-object p1
.end method

.method private final f(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lot0/b;)Lcom/whoop/straphistorysync/sync/b;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    const-string v0, "Event packet received while not syncing"

    invoke-interface {p2, v0, p3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    const-string p3, "event"

    invoke-virtual {p2, p3}, Lwh2/a;->v(Ljava/lang/String;)V

    new-instance p2, Lcom/whoop/straphistorysync/sync/f$b$c;

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->h()Lbi2/l;

    move-result-object p3

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v0

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v1

    invoke-direct {p2, p3, v0, v1}, Lcom/whoop/straphistorysync/sync/f$b$c;-><init>(Lbi2/l;ILbi2/k;)V

    invoke-virtual {p1, p2}, Lcom/whoop/straphistorysync/sync/b;->a(Lcom/whoop/straphistorysync/sync/f$b;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p2, Llt0/m;

    if-eqz v0, :cond_1

    check-cast p2, Llt0/m;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_2

    return-object p1

    :cond_2
    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {p2}, Llt0/k;->a()Lmt0/b;

    move-result-object v1

    invoke-virtual {v1}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {v0, v1}, Lwh2/a;->e(I)V

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    invoke-interface {v0, p2, p3}, Lzh2/d;->g(Llt0/m;Lot0/b;)V

    return-object p1
.end method

.method private final g(Lcom/whoop/straphistorysync/sync/b;Loh2/a;Ljava/lang/Long;J)Lcom/whoop/straphistorysync/sync/b;
    .locals 12

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->d()I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    invoke-interface {v1}, Lzh2/d;->d()Lzh2/c;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Burst validation failed (attempt "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "): expected="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", actual="

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v3, p4

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, ", breakdown="

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {v0, p3, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p3, p0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    invoke-interface {p3}, Lzh2/d;->reset()V

    const/16 p3, 0xf

    if-lt v7, p3, :cond_0

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    const-string p3, "Stuck: "

    const-string v0, " consecutive burst validation failures"

    invoke-static {v7, p3, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p2, p3, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {p2}, Lwh2/a;->A()V

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->h()Lbi2/l;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result p3

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v0

    sget-object v1, Lbi2/a;->Stuck:Lbi2/a;

    new-instance v2, Lcom/whoop/straphistorysync/sync/f$b$b;

    invoke-direct {v2, v1, p2, p3, v0}, Lcom/whoop/straphistorysync/sync/f$b$b;-><init>(Lbi2/a;Lbi2/l;ILbi2/k;)V

    invoke-virtual {p1, v2}, Lcom/whoop/straphistorysync/sync/b;->a(Lcom/whoop/straphistorysync/sync/f$b;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v2, Lcom/whoop/straphistorysync/sync/f$a;

    new-instance p3, Lcom/whoop/straphistorysync/sync/c$a;

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->b:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v0

    invoke-static {v0}, Lxj0/r;->c(Lst0/v;)Lxj0/q;

    move-result-object v0

    invoke-direct {p3, p2, v0}, Lcom/whoop/straphistorysync/sync/c$a;-><init>(Loh2/a;Lxj0/q;)V

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->h()Lbi2/l;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v0

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v1

    invoke-direct {v2, p3, p2, v0, v1}, Lcom/whoop/straphistorysync/sync/f$a;-><init>(Lcom/whoop/straphistorysync/sync/c;Lbi2/l;ILbi2/k;)V

    const/16 v10, 0xc6

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v11}, Lcom/whoop/straphistorysync/sync/b;->c(Lcom/whoop/straphistorysync/sync/b;Lcom/whoop/straphistorysync/sync/f;Lbi2/l;IZLoh2/a;ILjava/util/Map;Lbi2/k;ILjava/lang/Object;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    return-object p1
.end method

.method private final h(Lcom/whoop/straphistorysync/sync/b;)Lcom/whoop/straphistorysync/sync/b;
    .locals 6

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->h()Lbi2/l;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "HistoryComplete received: successfulBurstCount="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", totalSaved="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gaps="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {v0}, Lwh2/a;->D()V

    :cond_0
    new-instance v0, Lcom/whoop/straphistorysync/sync/f$b$d;

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->h()Lbi2/l;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/straphistorysync/sync/f$b$d;-><init>(Lbi2/l;ILbi2/k;)V

    invoke-virtual {p1, v0}, Lcom/whoop/straphistorysync/sync/b;->a(Lcom/whoop/straphistorysync/sync/f$b;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    return-object p1
.end method

.method private final i(Lcom/whoop/straphistorysync/sync/b;Ldk0/c;Lq83/d;)Ljava/lang/Object;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/b;",
            "Ldk0/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/whoop/straphistorysync/sync/j$c;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/whoop/straphistorysync/sync/j$c;

    iget v4, v3, Lcom/whoop/straphistorysync/sync/j$c;->M:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/whoop/straphistorysync/sync/j$c;->M:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/whoop/straphistorysync/sync/j$c;

    invoke-direct {v3, v0, v2}, Lcom/whoop/straphistorysync/sync/j$c;-><init>(Lcom/whoop/straphistorysync/sync/j;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lcom/whoop/straphistorysync/sync/j$c;->K:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lcom/whoop/straphistorysync/sync/j$c;->M:I

    const-string v9, ", breakdown="

    const-string v10, ", actual="

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v12, :cond_1

    iget-wide v4, v3, Lcom/whoop/straphistorysync/sync/j$c;->H:J

    iget-wide v6, v3, Lcom/whoop/straphistorysync/sync/j$c;->G:J

    iget-wide v13, v3, Lcom/whoop/straphistorysync/sync/j$c;->F:J

    iget-object v1, v3, Lcom/whoop/straphistorysync/sync/j$c;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    iget-object v8, v3, Lcom/whoop/straphistorysync/sync/j$c;->z:Ljava/lang/Object;

    check-cast v8, Loh2/a;

    iget-object v15, v3, Lcom/whoop/straphistorysync/sync/j$c;->y:Ljava/lang/Object;

    check-cast v15, Lzh2/b;

    iget-object v12, v3, Lcom/whoop/straphistorysync/sync/j$c;->x:Ljava/lang/Object;

    check-cast v12, Ldk0/c;

    iget-object v3, v3, Lcom/whoop/straphistorysync/sync/j$c;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/straphistorysync/sync/b;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide/from16 v26, v4

    move-object v4, v1

    move-object v1, v15

    move-wide v14, v13

    move-object v13, v8

    move-wide v7, v6

    move-wide/from16 v5, v26

    move-object v11, v3

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/whoop/straphistorysync/sync/b;->k()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, v0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    const-string v3, "HistoryEnd received while not syncing, dropping duplicate"

    new-array v4, v11, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v2, v0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    const-string v3, "history_end"

    invoke-virtual {v2, v3}, Lwh2/a;->v(Ljava/lang/String;)V

    return-object v1

    :cond_3
    iget-object v2, v0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {v2}, Lwh2/a;->f()J

    move-result-wide v13

    iget-object v2, v0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    invoke-interface {v2}, Lzh2/d;->f()Lzh2/b;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/straphistorysync/sync/b;->e()Loh2/a;

    move-result-object v2

    if-nez v2, :cond_4

    sget-object v2, Loh2/a;->g:Loh2/a$a;

    invoke-virtual {v2}, Loh2/a$a;->a()Loh2/a$b;

    move-result-object v2

    invoke-virtual {v2}, Loh2/a$b;->b()Loh2/a;

    move-result-object v2

    :cond_4
    move-object v8, v2

    invoke-interface/range {p2 .. p2}, Ldk0/c;->J()Ljava/lang/Long;

    move-result-object v2

    iget-object v5, v0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    invoke-interface {v5}, Lzh2/d;->e()I

    move-result v5

    int-to-long v6, v5

    iget-object v5, v0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    iget-object v12, v0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    invoke-interface {v12}, Lzh2/d;->d()Lzh2/c;

    move-result-object v12

    invoke-interface/range {p2 .. p2}, Ldk0/c;->z()[B

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lze1/b;->c([B)Ljava/lang/String;

    move-result-object v11

    invoke-interface/range {p2 .. p2}, Ldk0/c;->n()[B

    move-result-object v16

    move-object/from16 v17, v4

    invoke-static/range {v16 .. v16}, Lze1/b;->c([B)Ljava/lang/String;

    move-result-object v4

    move-wide/from16 v18, v13

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "HistoryEnd received: expected="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, ", trim="

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ":"

    invoke-static {v11, v4, v13}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v4

    const/4 v11, 0x0

    new-array v12, v11, [Lqr2/a$a;

    invoke-interface {v5, v4, v12}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v1}, Lcom/whoop/straphistorysync/sync/b;->d()I

    move-result v4

    const/4 v5, 0x3

    if-lt v4, v5, :cond_5

    const/4 v11, 0x2

    goto :goto_1

    :cond_5
    const/4 v11, 0x0

    :goto_1
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    int-to-long v12, v11

    sub-long/2addr v4, v12

    cmp-long v4, v4, v6

    if-gtz v4, :cond_6

    const/4 v4, 0x1

    goto :goto_2

    :cond_6
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_b

    iget-object v5, v0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {v5}, Lwh2/a;->j()J

    move-result-wide v12

    iget-object v5, v0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    iput-object v1, v3, Lcom/whoop/straphistorysync/sync/j$c;->w:Ljava/lang/Object;

    move-object/from16 v14, p2

    iput-object v14, v3, Lcom/whoop/straphistorysync/sync/j$c;->x:Ljava/lang/Object;

    iput-object v15, v3, Lcom/whoop/straphistorysync/sync/j$c;->y:Ljava/lang/Object;

    iput-object v8, v3, Lcom/whoop/straphistorysync/sync/j$c;->z:Ljava/lang/Object;

    iput-object v2, v3, Lcom/whoop/straphistorysync/sync/j$c;->E:Ljava/lang/Object;

    move-object/from16 v16, v2

    move-wide/from16 v1, v18

    iput-wide v1, v3, Lcom/whoop/straphistorysync/sync/j$c;->F:J

    iput-wide v6, v3, Lcom/whoop/straphistorysync/sync/j$c;->G:J

    iput v11, v3, Lcom/whoop/straphistorysync/sync/j$c;->I:I

    iput v4, v3, Lcom/whoop/straphistorysync/sync/j$c;->J:I

    iput-wide v12, v3, Lcom/whoop/straphistorysync/sync/j$c;->H:J

    const/4 v4, 0x1

    iput v4, v3, Lcom/whoop/straphistorysync/sync/j$c;->M:I

    invoke-interface {v5, v3}, Lzh2/d;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v17

    if-ne v3, v4, :cond_7

    return-object v4

    :cond_7
    move-wide/from16 v26, v12

    move-object v13, v8

    move-wide v7, v6

    move-wide/from16 v5, v26

    move-object/from16 v11, p1

    move-object v12, v14

    move-object/from16 v4, v16

    move-wide/from16 v26, v1

    move-object v2, v3

    move-object v1, v15

    move-wide/from16 v14, v26

    :goto_3
    check-cast v2, Lzh2/a;

    iget-object v3, v0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {v3}, Lwh2/a;->j()J

    move-result-wide v17

    sub-long v17, v17, v5

    const-wide/16 v5, 0x0

    cmp-long v3, v17, v5

    if-gez v3, :cond_8

    goto :goto_4

    :cond_8
    move-wide/from16 v5, v17

    :goto_4
    iget-object v3, v0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    move-object/from16 p1, v1

    invoke-virtual {v2}, Lzh2/a;->e()Z

    move-result v1

    invoke-virtual {v3, v5, v6, v1}, Lwh2/a;->u(JZ)V

    invoke-virtual {v2}, Lzh2/a;->e()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/whoop/straphistorysync/sync/j;->b:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-virtual {v1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v1

    invoke-static {v12, v1}, Lxj0/r;->d(Ldk0/c;Lst0/v;)Lxj0/q;

    move-result-object v12

    if-eqz v12, :cond_a

    const/4 v1, 0x1

    move-wide v5, v7

    invoke-virtual {v11}, Lcom/whoop/straphistorysync/sync/b;->d()I

    move-result v7

    move-wide/from16 v26, v14

    move-object v14, v2

    move-wide/from16 v2, v26

    move-object/from16 v8, p1

    invoke-direct/range {v0 .. v8}, Lcom/whoop/straphistorysync/sync/j;->d(ZJLjava/lang/Long;JILzh2/b;)V

    invoke-virtual {v14}, Lzh2/a;->d()Lzh2/b;

    move-result-object v1

    invoke-direct {v0, v11, v1}, Lcom/whoop/straphistorysync/sync/j;->k(Lcom/whoop/straphistorysync/sync/b;Lzh2/b;)Lbi2/k;

    move-result-object v1

    iget-object v2, v0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    invoke-virtual {v11}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v3

    const/4 v7, 0x1

    add-int/2addr v3, v7

    iget-object v7, v0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    invoke-interface {v7}, Lzh2/d;->d()Lzh2/c;

    move-result-object v7

    invoke-virtual {v14}, Lzh2/a;->d()Lzh2/b;

    move-result-object v8

    invoke-virtual {v8}, Lzh2/b;->e()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v14}, Lzh2/a;->d()Lzh2/b;

    move-result-object v8

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v0, ", sequenceGaps="

    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_9
    const-string v0, ""

    :goto_5
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v15, "Burst validation succeeded (burst "

    invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "): expected="

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v2, v0, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v11}, Lcom/whoop/straphistorysync/sync/b;->h()Lbi2/l;

    move-result-object v0

    invoke-virtual {v0, v14}, Lbi2/l;->d(Lzh2/a;)Lbi2/l;

    move-result-object v0

    invoke-virtual {v11}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v2

    const/4 v4, 0x1

    add-int/2addr v2, v4

    new-instance v3, Lcom/whoop/straphistorysync/sync/f$a;

    new-instance v4, Lcom/whoop/straphistorysync/sync/c$c;

    invoke-direct {v4, v13, v12}, Lcom/whoop/straphistorysync/sync/c$c;-><init>(Loh2/a;Lxj0/q;)V

    invoke-direct {v3, v4, v0, v2, v1}, Lcom/whoop/straphistorysync/sync/f$a;-><init>(Lcom/whoop/straphistorysync/sync/c;Lbi2/l;ILbi2/k;)V

    invoke-virtual {v11}, Lcom/whoop/straphistorysync/sync/b;->g()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v14}, Lzh2/a;->d()Lzh2/b;

    move-result-object v5

    invoke-virtual {v5}, Lzh2/b;->f()Ljava/util/Map;

    move-result-object v5

    invoke-static {v4, v5}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v24

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v19, v0

    move-object/from16 v25, v1

    move/from16 v20, v2

    move-object/from16 v18, v3

    move-object/from16 v17, v11

    invoke-virtual/range {v17 .. v25}, Lcom/whoop/straphistorysync/sync/b;->b(Lcom/whoop/straphistorysync/sync/f;Lbi2/l;IZLoh2/a;ILjava/util/Map;Lbi2/k;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object v0

    return-object v0

    :cond_a
    move-wide v5, v7

    move-object/from16 v17, v11

    move-wide v2, v14

    move-object/from16 v8, p1

    move-wide v1, v2

    move-object v3, v4

    move-wide v4, v5

    goto :goto_6

    :cond_b
    move-object/from16 v16, v2

    move-wide/from16 v1, v18

    move-object/from16 v17, p1

    move-wide v4, v6

    move-object v13, v8

    move-object v8, v15

    move-object/from16 v3, v16

    :goto_6
    const/4 v0, 0x0

    invoke-virtual/range {v17 .. v17}, Lcom/whoop/straphistorysync/sync/b;->d()I

    move-result v7

    move-wide v5, v4

    move-object v4, v3

    move-wide v2, v1

    move v1, v0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/whoop/straphistorysync/sync/j;->d(ZJLjava/lang/Long;JILzh2/b;)V

    move-object v3, v4

    move-wide v4, v5

    move-object v2, v13

    move-object/from16 v1, v17

    invoke-direct/range {v0 .. v5}, Lcom/whoop/straphistorysync/sync/j;->g(Lcom/whoop/straphistorysync/sync/b;Loh2/a;Ljava/lang/Long;J)Lcom/whoop/straphistorysync/sync/b;

    move-result-object v1

    return-object v1
.end method

.method private final j(Lcom/whoop/straphistorysync/sync/b;Ldk0/e;)Lcom/whoop/straphistorysync/sync/b;
    .locals 13

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    const-string v2, "HistoryStart received during active burst, discarding partial burst"

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    sget-object v0, Loh2/a;->g:Loh2/a$a;

    invoke-virtual {v0}, Loh2/a$a;->a()Loh2/a$b;

    move-result-object v0

    invoke-interface {p2}, Ldk0/e;->a()Loh2/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Loh2/a$b;->d(Loh2/c;)Loh2/a$b;

    move-result-object v0

    invoke-interface {p2}, Ldk0/e;->d()Loh2/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Loh2/a$b;->c(Loh2/b;)Loh2/a$b;

    move-result-object v0

    invoke-interface {p2}, Ldk0/e;->f()Loh2/e;

    move-result-object p2

    invoke-virtual {v0, p2}, Loh2/a$b;->e(Loh2/e;)Loh2/a$b;

    move-result-object p2

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->b:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getBluetoothVersion()Loh2/b;

    move-result-object v0

    invoke-virtual {p2, v0}, Loh2/a$b;->a(Loh2/b;)Loh2/a$b;

    move-result-object p2

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->b:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Loh2/a$b;->f(Ljava/lang/String;)Loh2/a$b;

    move-result-object p2

    sget-object v0, Lst0/v;->Companion:Lst0/v$a;

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/j;->b:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-virtual {v2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, Lst0/v$a;->d(Lst0/v;)B

    move-result v0

    invoke-virtual {p2, v0}, Loh2/a$b;->g(B)Loh2/a$b;

    move-result-object p2

    invoke-virtual {p2}, Loh2/a$b;->b()Loh2/a;

    move-result-object v7

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const-string v2, "HistoryStart received, beginning burst (burst "

    const-string v3, ")"

    invoke-static {v0, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {p2}, Lwh2/a;->m()V

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->c:Lwh2/a;

    invoke-virtual {p2}, Lwh2/a;->k()V

    iget-object p2, p0, Lcom/whoop/straphistorysync/sync/j;->a:Lzh2/d;

    invoke-interface {p2, v7}, Lzh2/d;->b(Loh2/a;)V

    new-instance v3, Lcom/whoop/straphistorysync/sync/f$a;

    new-instance p2, Lcom/whoop/straphistorysync/sync/c$b;

    invoke-direct {p2, v7}, Lcom/whoop/straphistorysync/sync/c$b;-><init>(Loh2/a;)V

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->h()Lbi2/l;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->j()I

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v2

    invoke-direct {v3, p2, v0, v1, v2}, Lcom/whoop/straphistorysync/sync/f$a;-><init>(Lcom/whoop/straphistorysync/sync/c;Lbi2/l;ILbi2/k;)V

    const/16 v11, 0xe6

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v12}, Lcom/whoop/straphistorysync/sync/b;->c(Lcom/whoop/straphistorysync/sync/b;Lcom/whoop/straphistorysync/sync/f;Lbi2/l;IZLoh2/a;ILjava/util/Map;Lbi2/k;ILjava/lang/Object;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    return-object p1
.end method

.method private final k(Lcom/whoop/straphistorysync/sync/b;Lzh2/b;)Lbi2/k;
    .locals 12

    invoke-virtual {p2}, Lzh2/b;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->shortValue()S

    move-result v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->g()Ljava/util/Map;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const-wide/16 v8, 0x1

    add-long v10, v4, v8

    cmp-long v10, v6, v10

    if-lez v10, :cond_0

    add-int/lit8 v1, v1, 0x1

    sub-long/2addr v6, v4

    sub-long/2addr v6, v8

    add-long/2addr v2, v6

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v0

    invoke-virtual {v0}, Lbi2/k;->f()I

    move-result v0

    invoke-virtual {p2}, Lzh2/b;->d()I

    move-result v5

    add-int/2addr v5, v0

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v0

    invoke-virtual {v0}, Lbi2/k;->c()I

    move-result v0

    add-int v6, v0, v1

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object v0

    invoke-virtual {v0}, Lbi2/k;->d()J

    move-result-wide v0

    invoke-virtual {p2}, Lzh2/b;->b()J

    move-result-wide v7

    add-long/2addr v7, v0

    add-long/2addr v7, v2

    invoke-virtual {p1}, Lcom/whoop/straphistorysync/sync/b;->i()Lbi2/k;

    move-result-object p1

    invoke-virtual {p1}, Lbi2/k;->b()I

    move-result p1

    invoke-virtual {p2}, Lzh2/b;->a()I

    move-result p2

    add-int v9, p2, p1

    invoke-virtual/range {v4 .. v9}, Lbi2/k;->a(IIJI)Lbi2/k;

    move-result-object p1

    return-object p1
.end method

.method private final l(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/b;",
            "Llt0/k;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p2}, Llt0/k;->b()Llt0/c;

    move-result-object v0

    instance-of v1, v0, Ldk0/e;

    if-eqz v1, :cond_0

    check-cast v0, Ldk0/e;

    invoke-direct {p0, p1, v0}, Lcom/whoop/straphistorysync/sync/j;->j(Lcom/whoop/straphistorysync/sync/b;Ldk0/e;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v1, v0, Ldk0/c;

    if-eqz v1, :cond_1

    check-cast v0, Ldk0/c;

    invoke-direct {p0, p1, v0, p3}, Lcom/whoop/straphistorysync/sync/j;->i(Lcom/whoop/straphistorysync/sync/b;Ldk0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p3, v0, Ldk0/a;

    if-eqz p3, :cond_2

    invoke-direct {p0, p1}, Lcom/whoop/straphistorysync/sync/j;->h(Lcom/whoop/straphistorysync/sync/b;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p3, v0, Llt0/f;

    if-eqz p3, :cond_3

    check-cast v0, Llt0/f;

    invoke-direct {p0, p1, p2, v0}, Lcom/whoop/straphistorysync/sync/j;->e(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Llt0/f;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p3, v0, Lot0/b;

    if-eqz p3, :cond_4

    check-cast v0, Lot0/b;

    invoke-direct {p0, p1, p2, v0}, Lcom/whoop/straphistorysync/sync/j;->f(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lot0/b;)Lcom/whoop/straphistorysync/sync/b;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method private final m(Llt0/m;Llt0/f;)V
    .locals 3

    invoke-interface {p2}, Llt0/f;->g()Llt0/g;

    move-result-object v0

    instance-of v1, v0, Llt0/g$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    instance-of v0, p2, Llt0/b;

    if-eqz v0, :cond_0

    move-object v2, p2

    check-cast v2, Llt0/b;

    :cond_0
    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, v2}, Lcom/whoop/straphistorysync/sync/j;->n(Llt0/m;Llt0/b;)V

    return-void

    :cond_2
    instance-of p1, v0, Llt0/g$c;

    if-eqz p1, :cond_7

    instance-of p1, p2, Lhk0/d;

    if-eqz p1, :cond_3

    move-object v2, p2

    check-cast v2, Lhk0/d;

    :cond_3
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lhk0/b;->X()Lfk2/a;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lfk2/a;->j()J

    move-result-wide p1

    check-cast v0, Llt0/g$c;

    invoke-virtual {v0}, Llt0/g$c;->c()Lhk0/p;

    move-result-object v0

    sget-object v1, Lcom/whoop/straphistorysync/sync/j$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->d:Lca2/h;

    invoke-interface {v0, p1, p2}, Lca2/h;->b(J)V

    return-void

    :cond_5
    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->d:Lca2/h;

    invoke-interface {v0, p1, p2}, Lca2/h;->a(J)V

    :cond_6
    :goto_0
    return-void

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final n(Llt0/m;Llt0/b;)V
    .locals 3

    :try_start_0
    sget-object v0, Lnt0/h;->u:Lnt0/h$a;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/j;->b:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-virtual {v1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lnt0/h$a;->a(Lst0/v;Llt0/m;Llt0/b;)Lnt0/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lnt0/h;->f0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Llt0/b;->Z()I

    move-result v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->d:Lca2/h;

    invoke-virtual {p1}, Lnt0/h;->e0()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lca2/h;->a(J)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/j;->d:Lca2/h;

    invoke-virtual {p2}, Llt0/b;->Y()Lfk2/a;

    move-result-object v0

    invoke-virtual {v0}, Lfk2/a;->j()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lca2/h;->b(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j;->e:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to parse raw data packet for tracking"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/j;->d:Lca2/h;

    invoke-virtual {p2}, Llt0/b;->Y()Lfk2/a;

    move-result-object p2

    invoke-virtual {p2}, Lfk2/a;->j()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lca2/h;->b(J)V

    return-void
.end method


# virtual methods
.method public a(Lec3/l;)Lec3/l;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "upstream"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/straphistorysync/sync/j$e;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/whoop/straphistorysync/sync/j$e;-><init>(Lq83/d;)V

    new-instance v3, Lec3/a0;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v1, v0}, Lec3/a0;-><init>(ILc93/m;Lec3/l;)V

    new-instance v5, Lcom/whoop/straphistorysync/sync/b;

    const/16 v14, 0xff

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/whoop/straphistorysync/sync/b;-><init>(Lcom/whoop/straphistorysync/sync/f;Lbi2/l;IZLoh2/a;ILjava/util/Map;Lbi2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/whoop/straphistorysync/sync/j$f;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v2}, Lcom/whoop/straphistorysync/sync/j$f;-><init>(Lcom/whoop/straphistorysync/sync/j;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v5, v3, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v0, Lcom/whoop/straphistorysync/sync/j$d;

    invoke-direct {v0, v2}, Lcom/whoop/straphistorysync/sync/j$d;-><init>(Lec3/l;)V

    return-object v0
.end method
