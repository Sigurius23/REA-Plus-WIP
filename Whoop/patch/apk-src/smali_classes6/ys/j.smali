.class public final Lys/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/q;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/crypto/tink/internal/q;)Lys/j;
    .locals 2

    iget-object p0, p0, Lcom/google/crypto/tink/internal/q;->a:Lcom/google/crypto/tink/internal/k0;

    invoke-static {p0}, Lcom/google/crypto/tink/internal/q;->V(Lcom/google/crypto/tink/internal/k0;)V

    invoke-static {}, Lvs/m3;->G()Lvs/k3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lvs/k3;->h(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-virtual {v0, v1}, Lvs/k3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast p0, Lvs/l3;

    invoke-virtual {v0, p0}, Lvs/k3;->g(Lvs/l3;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/m3;

    new-instance v0, Lys/j;

    const-class v1, Lfs/q;

    invoke-static {p0, v1}, Lfs/o;->a(Lvs/m3;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfs/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method
