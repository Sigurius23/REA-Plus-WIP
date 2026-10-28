.class public abstract Ll73/c;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a(Ll73/g;)Lw73/p;
    .locals 2

    sget v0, Ll73/a;->w:I

    const-string v1, "scheduler is null"

    invoke-static {p1, v1}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "bufferSize"

    invoke-static {v0, v1}, Lr73/a;->b(ILjava/lang/String;)V

    new-instance v1, Lw73/p;

    invoke-direct {v1, p0, p1, v0}, Lw73/p;-><init>(Ll73/c;Ll73/g;I)V

    return-object v1
.end method

.method public final c(Ll73/d;)V
    .locals 2

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Lr73/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Ll73/c;->d(Ll73/d;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Actually not, but can\'t throw other exceptions due to RS"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :catch_0
    move-exception p1

    throw p1
.end method

.method public abstract d(Ll73/d;)V
.end method
