.class public final Le6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/c;


# instance fields
.field public volatile E:Lf6/b;

.field public final w:Ljava/lang/String;

.field public final x:Lkotlin/jvm/functions/Function1;

.field public final y:Lbc3/c0;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le6/a;->w:Ljava/lang/String;

    iput-object p3, p0, Le6/a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Le6/a;->y:Lbc3/c0;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le6/a;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Landroid/content/Context;

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Le6/a;->E:Lf6/b;

    if-nez p2, :cond_1

    iget-object p2, p0, Le6/a;->z:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Le6/a;->E:Lf6/b;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Le6/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Le6/a;->y:Lbc3/c0;

    new-instance v2, La11/l;

    const/16 v3, 0x10

    invoke-direct {v2, v3, p1, p0}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "migrations"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, La6/m0;

    sget-object v3, Lf6/c;->a:Lf6/c;

    new-instance v4, Le61/e;

    const/4 v5, 0x3

    invoke-direct {v4, v2, v5}, Le61/e;-><init>(Lc93/a;I)V

    invoke-direct {p1, v3, v4}, La6/m0;-><init>(La6/y0;Lc93/a;)V

    new-instance v2, Lf6/b;

    new-instance v3, Lio/sentry/hints/j;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lio/sentry/hints/j;-><init>(I)V

    new-instance v4, La6/c;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v4, v0, v6, v5}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v4, La6/i0;

    invoke-direct {v4, p1, v0, v3, v1}, La6/i0;-><init>(La6/f1;Ljava/util/List;Lio/sentry/hints/j;Lbc3/c0;)V

    invoke-direct {v2, v4}, Lf6/b;-><init>(La6/g;)V

    new-instance p1, Lf6/b;

    invoke-direct {p1, v2}, Lf6/b;-><init>(La6/g;)V

    iput-object p1, p0, Le6/a;->E:Lf6/b;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Le6/a;->E:Lf6/b;

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
