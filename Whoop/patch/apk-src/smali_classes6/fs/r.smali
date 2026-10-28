.class public abstract Lfs/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    return-void
.end method

.method public static a(Lvs/u3;)Lvs/y3;
    .locals 5

    invoke-static {}, Lvs/y3;->C()Lvs/v3;

    move-result-object v0

    invoke-virtual {p0}, Lvs/u3;->E()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v2, Lvs/y3;

    invoke-static {v2, v1}, Lvs/y3;->z(Lvs/y3;I)V

    invoke-virtual {p0}, Lvs/u3;->D()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvs/t3;

    invoke-static {}, Lvs/x3;->E()Lvs/w3;

    move-result-object v2

    invoke-virtual {v1}, Lvs/t3;->D()Lvs/m3;

    move-result-object v3

    invoke-virtual {v3}, Lvs/m3;->E()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v4, Lvs/x3;

    invoke-static {v4, v3}, Lvs/x3;->z(Lvs/x3;Ljava/lang/String;)V

    invoke-virtual {v1}, Lvs/t3;->G()Lvs/n3;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v4, Lvs/x3;

    invoke-static {v4, v3}, Lvs/x3;->B(Lvs/x3;Lvs/n3;)V

    invoke-virtual {v1}, Lvs/t3;->F()Lvs/h4;

    move-result-object v3

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v4, v2, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v4, Lvs/x3;

    invoke-static {v4, v3}, Lvs/x3;->A(Lvs/x3;Lvs/h4;)V

    invoke-virtual {v1}, Lvs/t3;->E()I

    move-result v1

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v3, v2, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v3, Lvs/x3;

    invoke-static {v3, v1}, Lvs/x3;->C(Lvs/x3;I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/x3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->e()V

    iget-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/v;->x:Lcom/google/crypto/tink/shaded/protobuf/x;

    check-cast v2, Lvs/y3;

    invoke-static {v2, v1}, Lvs/y3;->A(Lvs/y3;Lvs/x3;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/y3;

    return-object p0
.end method
