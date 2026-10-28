.class public abstract Lud3/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final Companion:Lud3/u0;

.field public static final EMPTY:Lud3/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lud3/u0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lud3/v0;->Companion:Lud3/u0;

    sget-object v0, Lne3/l;->E:Lne3/l;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lud3/r0;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lud3/r0;-><init>(Lud3/h0;Lne3/l;)V

    sput-object v1, Lud3/v0;->EMPTY:Lud3/v0;

    return-void
.end method

.method public static final create(Ljava/io/File;Lud3/h0;)Lud3/v0;
    .locals 1

    .line 1
    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Lud3/u0;->a(Ljava/io/File;Lud3/h0;)Lud3/p0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Ljava/io/FileDescriptor;Lud3/h0;)Lud3/v0;
    .locals 1

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lud3/s0;

    invoke-direct {v0, p0, p1}, Lud3/s0;-><init>(Ljava/io/FileDescriptor;Lud3/h0;)V

    return-object v0
.end method

.method public static final create(Ljava/lang/String;Lud3/h0;)Lud3/v0;
    .locals 1

    .line 4
    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, p1}, Lud3/u0;->b(Ljava/lang/String;Lud3/h0;)Lud3/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lne3/e0;Lne3/p;Lud3/h0;)Lud3/v0;
    .locals 1

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lud3/q0;

    invoke-direct {v0, p0, p1, p2}, Lud3/q0;-><init>(Lne3/e0;Lne3/p;Lud3/h0;)V

    return-object v0
.end method

.method public static final create(Lne3/l;Lud3/h0;)Lud3/v0;
    .locals 1

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    new-instance v0, Lud3/r0;

    invoke-direct {v0, p1, p0}, Lud3/r0;-><init>(Lud3/h0;Lne3/l;)V

    return-object v0
.end method

.method public static final create(Lud3/h0;Ljava/io/File;)Lud3/v0;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-static {p1, p0}, Lud3/u0;->a(Ljava/io/File;Lud3/h0;)Lud3/p0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lud3/h0;Ljava/lang/String;)Lud3/v0;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-static {p1, p0}, Lud3/u0;->b(Ljava/lang/String;Lud3/h0;)Lud3/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lud3/h0;Lne3/l;)Lud3/v0;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lud3/r0;

    invoke-direct {v0, p0, p1}, Lud3/r0;-><init>(Lud3/h0;Lne3/l;)V

    return-object v0
.end method

.method public static final create(Lud3/h0;[B)Lud3/v0;
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 14
    array-length v1, p1

    .line 15
    invoke-static {p0, p1, v0, v1}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lud3/h0;[BI)Lud3/v0;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    array-length v0, p1

    .line 18
    invoke-static {p0, p1, p2, v0}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Lud3/h0;[BII)Lud3/v0;
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-static {p0, p1, p2, p3}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([B)Lud3/v0;
    .locals 4

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-static {v0, p0, v3, v1, v2}, Lud3/u0;->d(Lud3/u0;[BLud3/h0;II)Lud3/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLud3/h0;)Lud3/v0;
    .locals 3

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {v0, p0, p1, v1, v2}, Lud3/u0;->d(Lud3/u0;[BLud3/h0;II)Lud3/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLud3/h0;I)Lud3/v0;
    .locals 2

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x4

    invoke-static {v0, p0, p1, p2, v1}, Lud3/u0;->d(Lud3/u0;[BLud3/h0;II)Lud3/t0;

    move-result-object p0

    return-object p0
.end method

.method public static final create([BLud3/h0;II)Lud3/v0;
    .locals 1

    .line 22
    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p0, p2, p3}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public abstract contentType()Lud3/h0;
.end method

.method public isDuplex()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isOneShot()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final sha256()Lne3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lne3/e;

    invoke-direct {v0}, Lne3/e;-><init>()V

    invoke-static {v0}, Ldc/a;->O(Lne3/e;)Lne3/w;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v1

    :try_start_0
    invoke-virtual {p0, v1}, Lud3/v0;->writeTo(Lne3/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lne3/h0;->close()V

    invoke-virtual {v0}, Lne3/w;->b()Lne3/l;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public abstract writeTo(Lne3/i;)V
.end method
