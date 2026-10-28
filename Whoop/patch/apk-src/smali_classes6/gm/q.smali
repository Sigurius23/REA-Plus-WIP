.class public final Lgm/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile e:Lgm/k;


# instance fields
.field public final a:Lpm/a;

.field public final b:Lpm/a;

.field public final c:Llm/b;

.field public final d:Lev/i;


# direct methods
.method public constructor <init>(Lpm/a;Lpm/a;Llm/b;Lev/i;La00/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/q;->a:Lpm/a;

    iput-object p2, p0, Lgm/q;->b:Lpm/a;

    iput-object p3, p0, Lgm/q;->c:Llm/b;

    iput-object p4, p0, Lgm/q;->d:Lev/i;

    iget-object p1, p5, La00/g;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/Executor;

    new-instance p2, Llr/e;

    const/4 p3, 0x2

    invoke-direct {p2, p5, p3}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a()Lgm/q;
    .locals 2

    sget-object v0, Lgm/q;->e:Lgm/k;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lgm/k;->F:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgm/q;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lgm/q;->e:Lgm/k;

    if-nez v0, :cond_1

    const-class v0, Lgm/q;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lgm/q;->e:Lgm/k;

    if-nez v1, :cond_0

    new-instance v1, Lgm/j;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, v1, Lgm/j;->w:Landroid/content/Context;

    invoke-virtual {v1}, Lgm/j;->b()Lgm/k;

    move-result-object p0

    sput-object p0, Lgm/q;->e:Lgm/k;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    return-void
.end method


# virtual methods
.method public final c(Lgm/l;)Lgm/p;
    .locals 6

    new-instance v0, Lgm/p;

    if-eqz p1, :cond_0

    sget-object v1, Lem/a;->d:Ljava/util/Set;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ldm/c;

    const-string v2, "proto"

    invoke-direct {v1, v2}, Ldm/c;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    :goto_0
    invoke-static {}, Lgm/i;->a()La33/d;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "cct"

    iput-object v3, v2, La33/d;->x:Ljava/lang/Object;

    check-cast p1, Lem/a;

    iget-object v3, p1, Lem/a;->a:Ljava/lang/String;

    iget-object p1, p1, Lem/a;->b:Ljava/lang/String;

    if-nez p1, :cond_1

    if-nez v3, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    const-string p1, ""

    :cond_2
    const-string v4, "1$"

    const-string v5, "\\"

    invoke-static {v4, v3, v5, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "UTF-8"

    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :goto_1
    iput-object p1, v2, La33/d;->y:Ljava/lang/Object;

    invoke-virtual {v2}, La33/d;->d()Lgm/i;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lgm/p;-><init>(Ljava/util/Set;Lgm/i;Lgm/q;)V

    return-object v0
.end method
