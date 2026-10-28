.class public Lxg3/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lxg3/o;


# direct methods
.method public constructor <init>(Lxg3/o;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->f()Ljh3/h;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lxg3/p;->a:Lxg3/o;

    return-void
.end method

.method public static a(Lxg3/p;)Lxg3/g;
    .locals 2

    new-instance v0, Lch3/n;

    iget-object p0, p0, Lxg3/p;->a:Lxg3/o;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lch3/n;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lbh3/b;)Lxg3/p;
    .locals 1

    new-instance v0, Lch3/x0;

    invoke-direct {v0, p0}, Lch3/x0;-><init>(Lbh3/b;)V

    new-instance p0, Lxg3/p;

    invoke-direct {p0, v0}, Lxg3/p;-><init>(Lxg3/o;)V

    return-object p0
.end method


# virtual methods
.method public final c(Lxg3/r;)Lxg3/t;
    .locals 5

    :try_start_0
    iget-object v0, p0, Lxg3/p;->a:Lxg3/o;

    sget-object v1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v1}, Ljh3/f;->f()Ljh3/h;

    move-result-object v1

    sget-object v2, Ljh3/h;->a:Ljh3/h;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lch3/s;

    new-instance v3, Lch3/n;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lch3/n;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    invoke-direct {v2, v3, v0}, Lch3/s;-><init>(Ljava/lang/Object;I)V

    move-object v0, v2

    :goto_0
    invoke-interface {v0, p1}, Lbh3/b;->b(Ljava/lang/Object;)V

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->f()Ljh3/h;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    :try_start_1
    sget-object v1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v1}, Ljh3/f;->f()Ljh3/h;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0}, Lxg3/r;->d(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    new-instance p1, Lmh3/b;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lmh3/b;-><init>(I)V

    return-object p1

    :catchall_1
    move-exception p1

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error occurred attempting to subscribe ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] and then again while trying to pass to onError."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->f()Ljh3/h;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v1
.end method

.method public final d(Lbh3/b;Lbh3/b;)V
    .locals 1

    new-instance v0, Lxg3/l;

    invoke-direct {v0, p2, p1}, Lxg3/l;-><init>(Lbh3/b;Lbh3/b;)V

    invoke-virtual {p0, v0}, Lxg3/p;->c(Lxg3/r;)Lxg3/t;

    return-void
.end method
