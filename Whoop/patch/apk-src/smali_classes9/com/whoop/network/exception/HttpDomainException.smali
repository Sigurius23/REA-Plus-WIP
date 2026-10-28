.class public final Lcom/whoop/network/exception/HttpDomainException;
.super Lcom/whoop/network/exception/DomainException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/network/exception/HttpDomainException;",
        "Lcom/whoop/network/exception/DomainException;",
        "exception",
        "Lretrofit2/HttpException;",
        "<init>",
        "(Lretrofit2/HttpException;)V",
        "network_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Lretrofit2/HttpException;)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/network/exception/DomainException$c;->HTTP_ERROR:Lcom/whoop/network/exception/DomainException$c;

    invoke-direct {p0, v0, p1}, Lcom/whoop/network/exception/DomainException;-><init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;)V

    return-void
.end method
