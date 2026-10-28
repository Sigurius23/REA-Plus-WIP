.class public final Lcom/whoop/service/rearchitect/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/rearchitect/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR!\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/service/rearchitect/c$c;",
        "Ltj0/a;",
        "<init>",
        "(Lcom/whoop/service/rearchitect/c;)V",
        "Ll73/c;",
        "Ltj0/b;",
        "c",
        "()Ll73/c;",
        "Ll83/a0;",
        "b",
        "()V",
        "a",
        "Lzj0/t;",
        "packet",
        "g",
        "(Lzj0/t;)V",
        "Lg83/b;",
        "Ll83/h;",
        "f",
        "()Lg83/b;",
        "stateSubject",
        "",
        "Ljava/lang/Object;",
        "lock",
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
.field private final a:Ll83/h;

.field private final b:Ljava/lang/Object;

.field final synthetic c:Lcom/whoop/service/rearchitect/c;


# direct methods
.method public constructor <init>(Lcom/whoop/service/rearchitect/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$c;->c:Lcom/whoop/service/rearchitect/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lma1/a;

    const/16 v0, 0x12

    invoke-direct {p1, v0}, Lma1/a;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$c;->a:Ll83/h;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/service/rearchitect/c$c;->b:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic d()Lg83/b;
    .locals 1

    invoke-static {}, Lcom/whoop/service/rearchitect/c$c;->h()Lg83/b;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic e(Lcom/whoop/service/rearchitect/c$c;)Lg83/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/c$c;->f()Lg83/b;

    move-result-object p0

    return-object p0
.end method

.method private final f()Lg83/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg83/b;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$c;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lg83/b;

    return-object v0
.end method

.method private static final h()Lg83/b;
    .locals 1

    new-instance v0, Lg83/b;

    invoke-direct {v0}, Lg83/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$c;->b:Ljava/lang/Object;

    iget-object v1, p0, Lcom/whoop/service/rearchitect/c$c;->c:Lcom/whoop/service/rearchitect/c;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v2

    const-string v3, "Disabling Generic HR profile"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/whoop/service/rearchitect/c;->I2(Lcom/whoop/service/rearchitect/c;)Lbc3/c0;

    move-result-object v2

    new-instance v3, Lcom/whoop/service/rearchitect/c$c$a;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4}, Lcom/whoop/service/rearchitect/c$c$a;-><init>(Lcom/whoop/service/rearchitect/c;Lcom/whoop/service/rearchitect/c$c;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {v2, v4, v4, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public b()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$c;->b:Ljava/lang/Object;

    iget-object v1, p0, Lcom/whoop/service/rearchitect/c$c;->c:Lcom/whoop/service/rearchitect/c;

    monitor-enter v0

    :try_start_0
    invoke-static {v1}, Lcom/whoop/service/rearchitect/c;->G2(Lcom/whoop/service/rearchitect/c;)Loh3/d;

    move-result-object v2

    const-string v3, "Enabling Generic HR profile"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4}, Loh3/d;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/whoop/service/rearchitect/c;->I2(Lcom/whoop/service/rearchitect/c;)Lbc3/c0;

    move-result-object v2

    new-instance v3, Lcom/whoop/service/rearchitect/c$c$b;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4}, Lcom/whoop/service/rearchitect/c$c$b;-><init>(Lcom/whoop/service/rearchitect/c;Lcom/whoop/service/rearchitect/c$c;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {v2, v4, v4, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public c()Ll73/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll73/c;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/whoop/service/rearchitect/c$c;->f()Lg83/b;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lzj0/t;)V
    .locals 2

    const-string v0, "packet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/service/rearchitect/c$c;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/whoop/service/rearchitect/c$c;->f()Lg83/b;

    move-result-object v1

    invoke-interface {p1}, Lzj0/t;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ltj0/b;->ENABLED:Ltj0/b;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object p1, Ltj0/b;->DISABLED:Ltj0/b;

    :goto_0
    invoke-virtual {v1, p1}, Lg83/b;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
