.class public final Lcom/google/crypto/tink/internal/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/internal/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/f;->a:Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/i0;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Lcom/google/crypto/tink/internal/f;->b:Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/i0;->b:Ljava/util/HashMap;

    return-void
.end method
