.class public final Lvs/z1;
.super Lcom/google/crypto/tink/shaded/protobuf/v;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/p0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lvs/a2;->z()Lvs/a2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->d()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v0, Lvs/a2;

    invoke-static {v0, p1}, Lvs/a2;->A(Lvs/a2;Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public final h(Lvs/c2;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v0, Lvs/a2;

    invoke-static {v0, p1}, Lvs/a2;->B(Lvs/a2;Lvs/c2;)V

    return-void
.end method
