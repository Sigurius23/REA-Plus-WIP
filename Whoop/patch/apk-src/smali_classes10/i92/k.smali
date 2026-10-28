.class public Li92/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/whoop/network/exception/DomainException$b;

.field private final b:Ljava/lang/Throwable;

.field private c:Ltr2/n;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->d()Ltr2/n;

    move-result-object v1

    const-string v2, "RetrofitExceptionConverter"

    invoke-direct {v0, v1, v2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Li92/k;-><init>(Ljava/lang/Throwable;Ltr2/n;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ltr2/n;)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lcom/whoop/network/exception/DomainException$c;->UNKNOWN:Lcom/whoop/network/exception/DomainException$c;

    iput-object v0, p0, Li92/k;->a:Lcom/whoop/network/exception/DomainException$b;

    .line 4
    new-instance v0, Ltr2/o;

    const-string v1, "RetrofitExceptionConverter"

    invoke-direct {v0, p2, v1}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object v0, p0, Li92/k;->c:Ltr2/n;

    .line 5
    iput-object p1, p0, Li92/k;->b:Ljava/lang/Throwable;

    .line 6
    instance-of p2, p1, Ljava/io/IOException;

    if-eqz p2, :cond_0

    .line 7
    sget-object p2, Lcom/whoop/network/exception/DomainException$c;->NETWORK_ERROR:Lcom/whoop/network/exception/DomainException$c;

    iput-object p2, p0, Li92/k;->a:Lcom/whoop/network/exception/DomainException$b;

    .line 8
    :cond_0
    instance-of p2, p1, Lretrofit2/HttpException;

    if-eqz p2, :cond_2

    .line 9
    check-cast p1, Lretrofit2/HttpException;

    .line 10
    iget p2, p1, Lretrofit2/HttpException;->w:I

    const/16 v0, 0x1ac

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    .line 11
    sget-object p1, Lcom/whoop/network/exception/DomainException$c;->MEMBERSHIP_ERROR:Lcom/whoop/network/exception/DomainException$c;

    iput-object p1, p0, Li92/k;->a:Lcom/whoop/network/exception/DomainException$b;

    .line 12
    invoke-virtual {p0}, Li92/k;->b()Ltr2/n;

    move-result-object p1

    const-string p2, "Network error: Check Membership Status"

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    .line 13
    :cond_1
    sget-object v0, Lcom/whoop/network/exception/DomainException$c;->HTTP_ERROR:Lcom/whoop/network/exception/DomainException$c;

    iput-object v0, p0, Li92/k;->a:Lcom/whoop/network/exception/DomainException$b;

    .line 14
    invoke-virtual {p0}, Li92/k;->b()Ltr2/n;

    move-result-object v0

    const-string v2, "Response status = "

    const-string v3, ",  response body = "

    .line 15
    invoke-static {p2, v2, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 16
    invoke-direct {p0, p1}, Li92/k;->a(Lretrofit2/HttpException;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Lqr2/a$a;

    .line 17
    invoke-interface {v0, p1, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    return-void
.end method

.method private a(Lretrofit2/HttpException;)Ljava/lang/String;
    .locals 0

    :try_start_0
    iget-object p1, p1, Lretrofit2/HttpException;->y:Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->c:Lud3/a1;

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "could not read response body"

    return-object p1
.end method


# virtual methods
.method public b()Ltr2/n;
    .locals 1

    iget-object v0, p0, Li92/k;->c:Ltr2/n;

    return-object v0
.end method

.method public c()Lcom/whoop/network/exception/DomainException$b;
    .locals 1

    iget-object v0, p0, Li92/k;->a:Lcom/whoop/network/exception/DomainException$b;

    return-object v0
.end method

.method public d()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Li92/k;->b:Ljava/lang/Throwable;

    return-object v0
.end method

.method public e()Lcom/whoop/network/exception/DomainException;
    .locals 3

    invoke-virtual {p0}, Li92/k;->d()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Lretrofit2/HttpException;

    if-eqz v1, :cond_0

    new-instance v1, Lcom/whoop/network/exception/HttpDomainException;

    check-cast v0, Lretrofit2/HttpException;

    invoke-direct {v1, v0}, Lcom/whoop/network/exception/HttpDomainException;-><init>(Lretrofit2/HttpException;)V

    return-object v1

    :cond_0
    new-instance v0, Lcom/whoop/network/exception/DomainException;

    invoke-virtual {p0}, Li92/k;->c()Lcom/whoop/network/exception/DomainException$b;

    move-result-object v1

    invoke-virtual {p0}, Li92/k;->d()Ljava/lang/Throwable;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whoop/network/exception/DomainException;-><init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;)V

    return-object v0
.end method
