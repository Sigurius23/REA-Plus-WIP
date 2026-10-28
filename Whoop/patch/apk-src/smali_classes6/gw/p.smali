.class public Lgw/p;
.super Lgw/g;
.source "SourceFile"


# instance fields
.field public final E:Ljava/util/concurrent/atomic/AtomicReference;

.field public final x:Lgw/n;

.field public final y:Ljava/lang/String;

.field public final z:Lxw/b;


# direct methods
.method public constructor <init>(Lxw/b;Lxw/b;Lxw/b;)V
    .locals 7

    new-instance v0, Lgw/r;

    invoke-direct {v0, p2}, Lgw/r;-><init>(Lxw/b;)V

    invoke-direct {p0}, Lgw/g;-><init>()V

    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p2, p0, Lgw/p;->E:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1}, Lgw/n;->c(Lxw/b;)Lgw/n;

    move-result-object p1

    iget-boolean v2, p1, Lgw/n;->O:Z

    iput-object p1, p0, Lgw/p;->x:Lgw/n;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    iput-object v0, p0, Lgw/g;->w:Lgw/r;

    const/4 v3, 0x0

    const/16 v4, 0x2e

    if-eqz v2, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lgw/c;->a()Lxw/b;

    move-result-object p1

    iget-object p1, p1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lgw/g;->w:Lgw/r;

    iget-object v4, p1, Lgw/r;->y:Lxw/b;

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v6, p1, Lgw/r;->x:[B

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lxw/a;->a()[B

    move-result-object v6

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lgw/r;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v4, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    goto :goto_0

    :cond_3
    move-object v6, v3

    :goto_0
    invoke-static {v6}, Lxw/b;->c([B)Lxw/b;

    move-result-object v4

    :goto_1
    iget-object p1, v4, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lgw/c;->a()Lxw/b;

    move-result-object p1

    iget-object p1, p1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lgw/g;->w:Lgw/r;

    invoke-virtual {p1}, Lgw/r;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lgw/p;->y:Ljava/lang/String;

    iget-object p1, p3, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    iput-object p3, p0, Lgw/p;->z:Lxw/b;

    sget-object p1, Lgw/o;->w:Lgw/o;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    if-eqz v2, :cond_8

    iget-object p1, v0, Lgw/r;->y:Lxw/b;

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lxw/a;->a()[B

    move-result-object v3

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Lgw/r;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    sget-object p2, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    :cond_7
    :goto_3
    invoke-static {v3}, Lxw/b;->c([B)Lxw/b;

    :cond_8
    :goto_4
    return-void

    :cond_9
    new-instance p1, Ljava/text/ParseException;

    const-string p2, "The signature must not be empty"

    invoke-direct {p1, p2, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/text/ParseException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Invalid JWS header: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p2
.end method
