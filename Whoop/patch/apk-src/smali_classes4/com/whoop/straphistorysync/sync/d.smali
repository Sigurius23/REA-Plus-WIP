.class public final Lcom/whoop/straphistorysync/sync/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\rR&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/straphistorysync/sync/d;",
        "",
        "<init>",
        "()V",
        "",
        "deviceSerial",
        "Lcom/whoop/straphistorysync/sync/a;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/straphistorysync/sync/a;",
        "Lec3/p1;",
        "Lcom/whoop/straphistorysync/sync/f;",
        "b",
        "(Ljava/lang/String;)Lec3/p1;",
        "Ljava/lang/Object;",
        "lock",
        "",
        "Ljava/util/Map;",
        "stateMachine",
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
.field private final a:Ljava/lang/Object;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lec3/p1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/whoop/straphistorysync/sync/d;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/whoop/straphistorysync/sync/d;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/whoop/straphistorysync/sync/a;
    .locals 9

    const-string v0, "deviceSerial"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/d;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lec3/p1;

    if-nez v0, :cond_0

    new-instance v2, Lcom/whoop/straphistorysync/sync/f$a;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/straphistorysync/sync/f$a;-><init>(Lcom/whoop/straphistorysync/sync/c;Lbi2/l;ILbi2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/d;->b:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lcom/whoop/straphistorysync/sync/a$b;

    invoke-direct {p1, v0}, Lcom/whoop/straphistorysync/sync/a$b;-><init>(Lec3/p1;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    move-object v2, v0

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/whoop/straphistorysync/sync/f$a;

    if-eqz v2, :cond_1

    new-instance p1, Lcom/whoop/straphistorysync/sync/a$a;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/whoop/straphistorysync/sync/a$a;-><init>(Lec3/f2;)V

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/whoop/straphistorysync/sync/f$a;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/straphistorysync/sync/f$a;-><init>(Lcom/whoop/straphistorysync/sync/c;Lbi2/l;ILbi2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/d;->b:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lcom/whoop/straphistorysync/sync/a$b;

    invoke-direct {p1, v0}, Lcom/whoop/straphistorysync/sync/a$b;-><init>(Lec3/p1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v1

    return-object p1

    :goto_1
    monitor-exit v1

    throw p1
.end method

.method public final b(Ljava/lang/String;)Lec3/p1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/p1;"
        }
    .end annotation

    const-string v0, "deviceSerial"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/d;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/d;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lec3/p1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
