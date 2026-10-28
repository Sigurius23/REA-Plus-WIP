.class public final Lai2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lai2/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lai2/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001bR \u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lai2/b;",
        "Lai2/h;",
        "Leu0/a;",
        "repository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Leu0/a;Ltr2/n;)V",
        "Loh2/a;",
        "acquisitionInfo",
        "Ll83/a0;",
        "b",
        "(Loh2/a;)V",
        "Llt0/m;",
        "receivedPacket",
        "Llt0/f;",
        "dataPacket",
        "c",
        "(Llt0/m;Llt0/f;)V",
        "",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "reset",
        "()V",
        "Leu0/a;",
        "Ltr2/n;",
        "Lai2/b$a;",
        "Lai2/b$a;",
        "burst",
        "",
        "Llt0/g;",
        "d",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "supportedFormatRevisions",
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
.field private final a:Leu0/a;

.field private final b:Ltr2/n;

.field private c:Lai2/b$a;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Llt0/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Leu0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lai2/b;->a:Leu0/a;

    .line 3
    iput-object p2, p0, Lai2/b;->b:Ltr2/n;

    .line 4
    new-instance p1, Llt0/g$c;

    sget-object p2, Lhk0/p;->DATA_SETTINGS:Lhk0/p;

    invoke-direct {p1, p2}, Llt0/g$c;-><init>(Lhk0/p;)V

    invoke-static {p1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lai2/b;->d:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Leu0/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "DataSettingsCollector"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lai2/b;-><init>(Leu0/a;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lai2/b;->c:Lai2/b$a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lai2/b$a;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lai2/b;->b:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "No data settings frames to flush"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object v1, p0, Lai2/b;->a:Leu0/a;

    invoke-virtual {v0}, Lai2/b$a;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Leu0/a;->c(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "flush() called before startBurst()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Loh2/a;)V
    .locals 1

    const-string v0, "acquisitionInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lai2/b;->reset()V

    new-instance v0, Lai2/b$a;

    invoke-direct {v0, p1}, Lai2/b$a;-><init>(Loh2/a;)V

    iput-object v0, p0, Lai2/b;->c:Lai2/b$a;

    return-void
.end method

.method public c(Llt0/m;Llt0/f;)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "receivedPacket"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "dataPacket"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lai2/b;->c:Lai2/b$a;

    if-eqz v1, :cond_1

    invoke-static {v3}, Lai2/c;->a(Llt0/f;)Lhk0/e;

    move-result-object v3

    invoke-virtual {v3}, Lhk0/e;->a0()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v1, v0, Lai2/b;->b:Ltr2/n;

    invoke-virtual {v3}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    const-string v3, "Dropping data settings frame too short for its header: "

    const-string v4, " bytes"

    invoke-static {v2, v3, v4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Lai2/b$a;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    new-instance v5, Lgu0/a;

    invoke-virtual {v3}, Lhk0/b;->X()Lfk2/a;

    move-result-object v6

    invoke-virtual {v6}, Lfk2/a;->j()J

    move-result-wide v8

    invoke-virtual {v3}, Lhk0/b;->W()J

    move-result-wide v10

    invoke-virtual {v1}, Lai2/b$a;->a()Loh2/a;

    move-result-object v1

    invoke-virtual {v3}, Lhk0/b;->R()I

    move-result v6

    invoke-static {v1, v6}, Lai2/c;->b(Loh2/a;I)Lcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;

    move-result-object v12

    invoke-virtual {v3}, Lhk0/e;->Y()I

    move-result v13

    invoke-virtual {v2}, Llt0/k;->a()Lmt0/b;

    move-result-object v1

    invoke-virtual {v1}, Lmt0/b;->f()Ljava/nio/ByteBuffer;

    move-result-object v14

    const/4 v15, 0x1

    const/16 v16, 0x0

    const-wide/16 v6, 0x0

    invoke-direct/range {v5 .. v16}, Lgu0/a;-><init>(JJJLcom/whoop/connectivityDataPacketsModels/firmware/rawdata/rev2/dto/Rev2DataSettingsMetadata;ILjava/nio/ByteBuffer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "collect() called before startBurst()"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llt0/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lai2/b;->d:Ljava/util/Set;

    return-object v0
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lai2/b;->c:Lai2/b$a;

    return-void
.end method
