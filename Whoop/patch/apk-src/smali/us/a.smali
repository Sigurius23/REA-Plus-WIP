.class public abstract Lus/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/d0;

.field public static final b:Lcom/google/crypto/tink/internal/b0;

.field public static final c:Lcom/google/crypto/tink/internal/m;

.field public static final d:Lcom/google/crypto/tink/internal/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacPrfKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    new-instance v1, Lts/b;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lts/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/d0;

    const-class v3, Lts/d;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v2, Lus/a;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v1, Lts/b;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lts/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v2, Lus/a;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v1, Lts/b;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lts/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lts/a;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lus/a;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lts/b;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lts/b;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lus/a;->d:Lcom/google/crypto/tink/internal/k;

    return-void
.end method
