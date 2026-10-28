.class public final Lcom/google/crypto/tink/internal/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/HashMap;

.field public b:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/internal/i0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/i0;->a:Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/f;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Lcom/google/crypto/tink/internal/i0;->b:Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/f;->b:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Enum;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/f;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/f;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b()Lwe/o;
    .locals 3

    new-instance v0, Lwe/o;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/f;->a:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/google/crypto/tink/internal/f;->b:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lwe/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public c(Lcom/google/crypto/tink/internal/f0;)V
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/internal/f;->a:Ljava/util/HashMap;

    if-eqz p1, :cond_2

    new-instance v1, Lcom/google/crypto/tink/internal/h0;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/f0;->a:Ljava/lang/Class;

    iget-object v3, p1, Lcom/google/crypto/tink/internal/f0;->b:Ljava/lang/Class;

    invoke-direct {v1, v2, v3}, Lcom/google/crypto/tink/internal/h0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/f0;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "primitive constructor must be non-null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
