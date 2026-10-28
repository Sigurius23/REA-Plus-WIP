.class public final Lys/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/l;


# static fields
.field public static final a:Lys/k;

.field public static final b:Lcom/google/crypto/tink/internal/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lys/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lys/k;->a:Lys/k;

    new-instance v0, Lxs/a;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lxs/a;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lcom/google/crypto/tink/internal/q;

    const-class v3, Lfs/q;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lys/k;->b:Lcom/google/crypto/tink/internal/f0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    const-class v0, Lfs/q;

    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    const-class v0, Lfs/q;

    return-object v0
.end method

.method public final c(La33/d;)Ljava/lang/Object;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, La33/d;->o()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/crypto/tink/internal/j0;

    invoke-virtual {v3}, Lcom/google/crypto/tink/internal/j0;->a()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Lcom/google/crypto/tink/internal/j0;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfs/q;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No full primitive set for key id "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/internal/j0;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, La33/d;->u()Lcom/google/crypto/tink/internal/j0;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/google/crypto/tink/internal/j0;->a()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, Lys/j;

    invoke-virtual {p1}, Lcom/google/crypto/tink/internal/j0;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfs/q;

    invoke-direct {v0}, Lys/j;-><init>()V

    return-object v0

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "No primary set"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
