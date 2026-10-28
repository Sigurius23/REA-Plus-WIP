.class public final Le82/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Le82/a;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lci2/b;Lbc3/c0;)V",
        "Ljk0/d;",
        "strap",
        "Llt0/k;",
        "parsed",
        "Lnt0/i;",
        "e",
        "(Ljk0/d;Llt0/k;)Lnt0/i;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "onDestroy",
        "w",
        "Lci2/b;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "mutableFlow",
        "Lec3/t1;",
        "z",
        "Lec3/t1;",
        "d",
        "()Lec3/t1;",
        "flow",
        "Lbc3/k1;",
        "E",
        "Lbc3/k1;",
        "collectorJob",
        "connectivity_release"
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
.field private E:Lbc3/k1;

.field private final w:Lci2/b;

.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final z:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lci2/b;Lbc3/c0;)V
    .locals 1

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le82/a;->w:Lci2/b;

    iput-object p2, p0, Le82/a;->x:Lbc3/c0;

    const/4 p1, 0x1

    sget-object p2, Ldc3/a;->x:Ldc3/a;

    const/4 v0, 0x0

    invoke-static {v0, p1, p2, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Le82/a;->y:Lec3/o1;

    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Le82/a;->z:Lec3/t1;

    return-void
.end method

.method public static final synthetic a(Le82/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Le82/a;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic b(Le82/a;)Lci2/b;
    .locals 0

    iget-object p0, p0, Le82/a;->w:Lci2/b;

    return-object p0
.end method

.method public static final synthetic c(Le82/a;Ljk0/d;Llt0/k;)Lnt0/i;
    .locals 0

    invoke-direct {p0, p1, p2}, Le82/a;->e(Ljk0/d;Llt0/k;)Lnt0/i;

    move-result-object p0

    return-object p0
.end method

.method private final e(Ljk0/d;Llt0/k;)Lnt0/i;
    .locals 4

    instance-of v0, p2, Llt0/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p2}, Llt0/k;->b()Llt0/c;

    move-result-object v0

    instance-of v2, v0, Llt0/b;

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Llt0/c;->L()Llt0/c$a;

    move-result-object v2

    sget-object v3, Llt0/c$a;->REALTIME_RAW_DATA:Llt0/c$a;

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Lnt0/h;->u:Lnt0/h$a;

    invoke-interface {p1}, Ljk0/d;->w0()Lst0/v;

    move-result-object p1

    check-cast p2, Llt0/m;

    check-cast v0, Llt0/b;

    invoke-virtual {v2, p1, p2, v0}, Lnt0/h$a;->a(Lst0/v;Llt0/m;Llt0/b;)Lnt0/h;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    instance-of p2, p1, Lnt0/a;

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lnt0/h;->f0()Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    check-cast p1, Lnt0/a;

    invoke-virtual {p1, v0}, Lnt0/a;->p0(Llt0/b;)Lnt0/i;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    return-object v1
.end method


# virtual methods
.method public final d()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Le82/a;->z:Lec3/t1;

    return-object v0
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le82/a;->x:Lbc3/c0;

    new-instance v0, Le82/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le82/a$a;-><init>(Le82/a;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Le82/a;->E:Lbc3/k1;

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le82/a;->E:Lbc3/k1;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v0, p0, Le82/a;->E:Lbc3/k1;

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
