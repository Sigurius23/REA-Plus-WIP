.class public Lcom/nimbusds/jose/KeyTypeException;
.super Lcom/nimbusds/jose/KeyException;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "Invalid key: Must be an instance of "

    invoke-static {p1, v0}, Ld;->m(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method
