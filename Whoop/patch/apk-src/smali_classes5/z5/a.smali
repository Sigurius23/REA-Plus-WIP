.class public final Lz5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/c;


# instance fields
.field public volatile E:La6/i0;

.field public final w:Lz5/b;

.field public final x:Lkotlin/jvm/functions/Function1;

.field public final y:Lbc3/c0;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lz5/b;Lkotlin/jvm/functions/Function1;Lbc3/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/a;->w:Lz5/b;

    iput-object p2, p0, Lz5/a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lz5/a;->y:Lbc3/c0;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/a;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Landroid/content/Context;

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lz5/a;->E:La6/i0;

    if-nez p2, :cond_1

    iget-object p2, p0, Lz5/a;->z:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lz5/a;->E:La6/i0;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Lc6/e;

    sget-object v1, Lne3/p;->w:Lne3/a0;

    iget-object v2, p0, Lz5/a;->w:Lz5/b;

    new-instance v3, Lal0/f;

    const/16 v4, 0x13

    invoke-direct {v3, p0, p1, v4}, Lal0/f;-><init>(Ljava/lang/Object;Landroid/content/Context;I)V

    invoke-direct {v0, v1, v2, v3}, Lc6/e;-><init>(Lne3/p;Lz5/b;Lal0/f;)V

    iget-object v1, p0, Lz5/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, Lz5/a;->y:Lbc3/c0;

    const-string v2, "migrations"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lio/sentry/hints/j;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lio/sentry/hints/j;-><init>(I)V

    new-instance v3, La6/c;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, p1, v5, v4}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v3, La6/i0;

    invoke-direct {v3, v0, p1, v2, v1}, La6/i0;-><init>(La6/f1;Ljava/util/List;Lio/sentry/hints/j;Lbc3/c0;)V

    iput-object v3, p0, Lz5/a;->E:La6/i0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lz5/a;->E:La6/i0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    return-object p1

    :goto_1
    monitor-exit p2

    throw p1

    :cond_1
    return-object p2
.end method
