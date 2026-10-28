.class public final Lxk0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u00020\u00062\n\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lxk0/c;",
        "",
        "<init>",
        "()V",
        "",
        "statusCode",
        "Lxk0/d;",
        "d",
        "(I)Lxk0/d;",
        "Lpm0/a$b;",
        "error",
        "b",
        "(Lpm0/a$b;)Lxk0/d;",
        "Lu02/a$b;",
        "c",
        "(Lu02/a$b;)Lxk0/d;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "exception",
        "a",
        "(Ljava/lang/Exception;)Lxk0/d;",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lxk0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxk0/c;

    invoke-direct {v0}, Lxk0/c;-><init>()V

    sput-object v0, Lxk0/c;->a:Lxk0/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(I)Lxk0/d;
    .locals 2

    const/16 v0, 0x191

    if-ne p1, v0, :cond_0

    sget-object p1, Lxk0/d$g;->b:Lxk0/d$g;

    return-object p1

    :cond_0
    const/16 v0, 0x1ad

    if-ne p1, v0, :cond_1

    sget-object p1, Lxk0/d$d;->b:Lxk0/d$d;

    return-object p1

    :cond_1
    const/16 v0, 0x190

    const/16 v1, 0x1f4

    if-gt v0, p1, :cond_2

    if-ge p1, v1, :cond_2

    new-instance v0, Lxk0/d$a;

    invoke-direct {v0, p1}, Lxk0/d$a;-><init>(I)V

    return-object v0

    :cond_2
    if-gt v1, p1, :cond_3

    const/16 v0, 0x258

    if-ge p1, v0, :cond_3

    new-instance v0, Lxk0/d$e;

    invoke-direct {v0, p1}, Lxk0/d$e;-><init>(I)V

    return-object v0

    :cond_3
    sget-object p1, Lxk0/d$h;->b:Lxk0/d$h;

    return-object p1
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)Lxk0/d;
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkotlinx/serialization/SerializationException;

    if-eqz v0, :cond_0

    sget-object p1, Lxk0/d$c;->b:Lxk0/d$c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_1

    check-cast p1, Lretrofit2/HttpException;

    iget p1, p1, Lretrofit2/HttpException;->w:I

    invoke-direct {p0, p1}, Lxk0/c;->d(I)Lxk0/d;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lio/ktor/client/plugins/ResponseException;

    if-eqz v0, :cond_2

    check-cast p1, Lio/ktor/client/plugins/ResponseException;

    iget-object p1, p1, Lio/ktor/client/plugins/ResponseException;->w:Lf63/c;

    invoke-virtual {p1}, Lf63/c;->e()Li63/v;

    move-result-object p1

    iget p1, p1, Li63/v;->a:I

    invoke-direct {p0, p1}, Lxk0/c;->d(I)Lxk0/d;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_3

    sget-object p1, Lxk0/d$f;->b:Lxk0/d$f;

    return-object p1

    :cond_3
    instance-of v0, p1, Ljava/net/ConnectException;

    if-eqz v0, :cond_4

    sget-object p1, Lxk0/d$b;->b:Lxk0/d$b;

    return-object p1

    :cond_4
    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_5

    sget-object p1, Lxk0/d$b;->b:Lxk0/d$b;

    return-object p1

    :cond_5
    instance-of p1, p1, Ljava/io/IOException;

    if-eqz p1, :cond_6

    sget-object p1, Lxk0/d$b;->b:Lxk0/d$b;

    return-object p1

    :cond_6
    sget-object p1, Lxk0/d$h;->b:Lxk0/d$h;

    return-object p1
.end method

.method public final b(Lpm0/a$b;)Lxk0/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$b<",
            "*>;)",
            "Lxk0/d;"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpm0/a$b;->b()I

    move-result p1

    invoke-direct {p0, p1}, Lxk0/c;->d(I)Lxk0/d;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lu02/a$b;)Lxk0/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu02/a$b<",
            "*>;)",
            "Lxk0/d;"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lu02/a$b$a$a;

    if-eqz v0, :cond_0

    sget-object p1, Lxk0/d$c;->b:Lxk0/d$c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lu02/a$b$a;

    if-eqz v0, :cond_1

    check-cast p1, Lu02/a$b$a;

    invoke-virtual {p1}, Lu02/a$b$a;->d()I

    move-result p1

    invoke-direct {p0, p1}, Lxk0/c;->d(I)Lxk0/d;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lu02/a$b$b;

    if-eqz v0, :cond_2

    check-cast p1, Lu02/a$b$b;

    invoke-virtual {p1}, Lu02/a$b$b;->b()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p0, p1}, Lxk0/c;->a(Ljava/lang/Exception;)Lxk0/d;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
