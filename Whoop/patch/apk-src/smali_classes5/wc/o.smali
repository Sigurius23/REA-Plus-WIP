.class public final Lwc/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/util/ArrayList;

.field public final synthetic F:J

.field public final synthetic G:J

.field public w:Ljava/lang/Process;

.field public x:Ljava/io/BufferedReader;

.field public y:Ljava/lang/StringBuilder;

.field public z:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;JJLq83/d;)V
    .locals 0

    iput-object p1, p0, Lwc/o;->E:Ljava/util/ArrayList;

    iput-wide p2, p0, Lwc/o;->F:J

    iput-wide p4, p0, Lwc/o;->G:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lwc/o;

    iget-wide v2, p0, Lwc/o;->F:J

    iget-wide v4, p0, Lwc/o;->G:J

    iget-object v1, p0, Lwc/o;->E:Ljava/util/ArrayList;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lwc/o;-><init>(Ljava/util/ArrayList;JJLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwc/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwc/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwc/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwc/o;->z:I

    const/16 v2, 0x2000

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lwc/o;->y:Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwc/o;->x:Ljava/io/BufferedReader;

    iget-object v3, p0, Lwc/o;->w:Ljava/lang/Process;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/ProcessBuilder;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    iget-object v1, p0, Lwc/o;->E:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/lang/ProcessBuilder;->command(Ljava/util/List;)Ljava/lang/ProcessBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    const-string v1, "getInputStream(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, p1, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v5, Ljava/io/BufferedReader;

    invoke-direct {v5, v4, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p1, 0x400

    new-array v6, p1, [C

    new-instance v4, Lrv/a;

    iget-wide v8, p0, Lwc/o;->G:J

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v11}, Lrv/a;-><init>(Ljava/io/BufferedReader;[CLjava/lang/StringBuilder;JLjava/lang/Process;Lq83/d;)V

    iput-object v10, p0, Lwc/o;->w:Ljava/lang/Process;

    iput-object v5, p0, Lwc/o;->x:Ljava/io/BufferedReader;

    iput-object v7, p0, Lwc/o;->y:Ljava/lang/StringBuilder;

    iput v3, p0, Lwc/o;->z:I

    iget-wide v8, p0, Lwc/o;->F:J

    invoke-static {v8, v9, v4, p0}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v1, v5

    move-object v0, v7

    move-object v3, v10

    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v3}, Ljava/lang/Process;->exitValue()I

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Process;->getErrorStream()Ljava/io/InputStream;

    move-result-object p1

    const-string v0, "getErrorStream(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance p1, Ljava/io/BufferedReader;

    invoke-direct {p1, v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    :try_start_0
    invoke-static {p1}, Lvf3/b;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    move-object p1, v0

    :goto_1
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Process;->exitValue()I

    move-result v0

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, v1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method
