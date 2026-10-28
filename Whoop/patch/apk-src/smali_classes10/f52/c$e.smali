.class final Lf52/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf52/c;->l(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0008\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/k;",
        "Ljava/nio/file/Path;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Ll83/k;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.sync.BatteryPackRelativeEventsFileExporter$writePacketsToTempFile$2"
    f = "BatteryPackRelativeEventsFileExporter.kt"
    l = {
        0x5c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lf52/c;

.field final synthetic F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpu0/e;",
            ">;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLf52/c;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lf52/c;",
            "Ljava/util/List<",
            "+",
            "Lpu0/e;",
            ">;",
            "Lq83/d<",
            "-",
            "Lf52/c$e;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lf52/c$e;->z:Z

    iput-object p2, p0, Lf52/c$e;->E:Lf52/c;

    iput-object p3, p0, Lf52/c$e;->F:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lf52/c$e;

    iget-boolean v0, p0, Lf52/c$e;->z:Z

    iget-object v1, p0, Lf52/c$e;->E:Lf52/c;

    iget-object v2, p0, Lf52/c$e;->F:Ljava/util/List;

    invoke-direct {p1, v0, v1, v2, p2}, Lf52/c$e;-><init>(ZLf52/c;Ljava/util/List;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lf52/c$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf52/c$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf52/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf52/c$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lf52/c$e;->y:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lf52/c$e;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/IOException;

    iget-object v0, p0, Lf52/c$e;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lf52/c$e;->z:Z

    if-eqz p1, :cond_2

    const-string p1, "bp_console_packets"

    :goto_0
    move-object v6, p1

    goto :goto_1

    :cond_2
    const-string p1, "bp_firmware_packets"

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lf52/c$e;->E:Lf52/c;

    invoke-static {v0}, Lf52/c;->d(Lf52/c;)Lor2/b0;

    move-result-object v4

    iget-object v0, p0, Lf52/c$e;->E:Lf52/c;

    invoke-static {v0}, Lf52/c;->a(Lf52/c;)Ljava/nio/file/Path;

    move-result-object v5

    new-array v8, p1, [Ljava/nio/file/attribute/FileAttribute;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lor2/b0;->a(Lor2/b0;Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;ILjava/lang/Object;)Ljava/nio/file/Path;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-static {}, Lf52/c;->f()[Ljava/nio/file/StandardOpenOption;

    move-result-object v0

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/file/OpenOption;

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/nio/file/OpenOption;

    invoke-static {p1, v0}, Ljava/nio/file/Files;->newOutputStream(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;

    move-result-object v0

    const-string v2, "newOutputStream(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    iget-object v0, p0, Lf52/c$e;->E:Lf52/c;

    iget-object v2, p0, Lf52/c$e;->F:Ljava/util/List;

    :try_start_1
    invoke-static {v0, v2, v1}, Lf52/c;->g(Lf52/c;Ljava/util/List;Ljava/io/OutputStream;)[J

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :catch_0
    move-exception v0

    iget-object v4, p0, Lf52/c$e;->E:Lf52/c;

    invoke-static {v4}, Lf52/c;->e(Lf52/c;)Ltr2/n;

    move-result-object v4

    const-string v5, "Error creating temp file for "

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v4, v5, v0, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lf52/c$e;->E:Lf52/c;

    invoke-static {p1}, Lf52/c;->b(Lf52/c;)Lx42/b;

    move-result-object p1

    iput-object v3, p0, Lf52/c$e;->w:Ljava/lang/Object;

    iput-object v3, p0, Lf52/c$e;->x:Ljava/lang/Object;

    iput v2, p0, Lf52/c$e;->y:I

    invoke-virtual {p1, p0}, Lx42/b;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    return-object v3
.end method
