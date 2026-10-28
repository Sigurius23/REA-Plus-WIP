.class public final Lcom/whoop/strapauth/certificatetransfer/CertificateTransferException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/strapauth/certificatetransfer/CertificateTransferException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "Lsh2/c;",
        "result",
        "<init>",
        "(Lsh2/c;)V",
        "w",
        "Lsh2/c;",
        "a",
        "()Lsh2/c;",
        "strap-auth_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Lsh2/c;


# direct methods
.method public constructor <init>(Lsh2/c;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Certificate transfer did not succeed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/strapauth/certificatetransfer/CertificateTransferException;->w:Lsh2/c;

    return-void
.end method


# virtual methods
.method public final a()Lsh2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strapauth/certificatetransfer/CertificateTransferException;->w:Lsh2/c;

    return-object v0
.end method
