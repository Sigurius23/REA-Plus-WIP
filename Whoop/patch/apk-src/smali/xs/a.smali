.class public final synthetic Lxs/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/internal/n;
.implements Lcom/google/crypto/tink/internal/l;
.implements Lcom/google/crypto/tink/internal/e0;
.implements Lcom/google/crypto/tink/internal/c0;
.implements Lio/sentry/p6;
.implements Lcom/google/crypto/tink/internal/g0;
.implements Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lxs/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lfs/k;)Lcom/google/crypto/tink/internal/l0;
    .locals 5

    iget v0, p0, Lxs/a;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lys/d;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/r;->D()Lvs/q;

    move-result-object v1

    iget-object v2, p1, Lys/d;->a:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lvs/q;->g(I)V

    invoke-static {p1}, Lzs/b;->d(Lys/d;)Lvs/t;

    move-result-object p1

    invoke-virtual {v1, p1}, Lvs/q;->h(Lvs/t;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/r;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object p1, Lvs/h4;->E:Lvs/h4;

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lws/x;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/s4;->F()Lvs/r4;

    move-result-object v1

    invoke-static {p1}, Lxs/e;->c(Lws/x;)Lvs/u4;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/r4;->h(Lvs/u4;)V

    iget v2, p1, Lws/x;->a:I

    invoke-virtual {v1, v2}, Lvs/r4;->g(I)V

    iget-object v2, p1, Lws/x;->b:Ljava/math/BigInteger;

    invoke-static {v2}, Lxs/e;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/r4;->i(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/s4;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object v1, Lxs/e;->g:Lwe/o;

    iget-object p1, p1, Lws/x;->c:Lws/w;

    invoke-virtual {v1, p1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p1

    check-cast p1, Lvs/h4;

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lws/q;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/k4;->F()Lvs/j4;

    move-result-object v1

    invoke-static {}, Lvs/m4;->C()Lvs/l4;

    move-result-object v2

    sget-object v3, Lxs/d;->h:Lwe/o;

    iget-object v4, p1, Lws/q;->d:Lws/o;

    invoke-virtual {v3, v4}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v3

    check-cast v3, Lvs/g2;

    invoke-virtual {v2, v3}, Lvs/l4;->g(Lvs/g2;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v2

    check-cast v2, Lvs/m4;

    invoke-virtual {v1, v2}, Lvs/j4;->h(Lvs/m4;)V

    iget v2, p1, Lws/q;->a:I

    invoke-virtual {v1, v2}, Lvs/j4;->g(I)V

    iget-object v2, p1, Lws/q;->b:Ljava/math/BigInteger;

    invoke-static {v2}, Lxs/d;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/j4;->i(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/k4;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object v1, Lxs/d;->g:Lwe/o;

    iget-object p1, p1, Lws/q;->c:Lws/p;

    invoke-virtual {v1, p1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p1

    check-cast p1, Lvs/h4;

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_2
    check-cast p1, Lws/h;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/y1;->z()Lvs/y1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object v1, Lxs/c;->g:Lwe/o;

    iget-object p1, p1, Lws/h;->a:Lws/g;

    invoke-virtual {v1, p1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p1

    check-cast p1, Lvs/h4;

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_2
        0xa -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public d(Lts/o;)Lcom/google/crypto/tink/internal/k0;
    .locals 5

    iget v0, p0, Lxs/a;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lys/a;

    invoke-static {}, Lvs/p;->F()Lvs/o;

    move-result-object v0

    iget-object v1, p1, Lys/a;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object p1, p1, Lys/a;->b:Lys/d;

    invoke-static {p1}, Lzs/b;->d(Lys/d;)Lvs/t;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o;->h(Lvs/t;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lvs/h4;->E:Lvs/h4;

    const/4 v1, 0x0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, p1, v3, v0, v1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lws/y;

    invoke-static {}, Lvs/w4;->Q()Lvs/v4;

    move-result-object v0

    invoke-virtual {v0}, Lvs/v4;->o()V

    iget-object v1, p1, Lws/y;->b:Lws/z;

    invoke-static {v1}, Lxs/e;->d(Lws/z;)Lvs/y4;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/v4;->l(Lvs/y4;)V

    iget-object v1, p1, Lws/y;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/e;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/v4;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/y;->d:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/e;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/v4;->k(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/y;->e:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/e;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/v4;->n(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/y;->f:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/e;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/v4;->i(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/y;->g:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/e;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/v4;->j(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/y;->h:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/e;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/v4;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/w4;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Lxs/e;->g:Lwe/o;

    iget-object v2, p1, Lws/y;->b:Lws/z;

    iget-object v2, v2, Lws/z;->b:Lws/x;

    iget-object v2, v2, Lws/x;->c:Lws/w;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    invoke-virtual {p1}, Lgs/b;->z()Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    sget-object v3, Lvs/l3;->z:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lws/z;

    invoke-static {p1}, Lxs/e;->d(Lws/z;)Lvs/y4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Lxs/e;->g:Lwe/o;

    iget-object v2, p1, Lws/z;->b:Lws/x;

    iget-object v2, v2, Lws/x;->c:Lws/w;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    iget-object p1, p1, Lws/z;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    sget-object v3, Lvs/l3;->E:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_2
    check-cast p1, Lws/r;

    invoke-static {}, Lvs/o4;->Q()Lvs/n4;

    move-result-object v0

    invoke-virtual {v0}, Lvs/n4;->o()V

    iget-object v1, p1, Lws/r;->b:Lws/s;

    invoke-static {v1}, Lxs/d;->c(Lws/s;)Lvs/q4;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/n4;->l(Lvs/q4;)V

    iget-object v1, p1, Lws/r;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/d;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/n4;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/r;->d:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/d;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/n4;->k(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/r;->e:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/d;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/n4;->n(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/r;->f:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/d;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/n4;->i(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/r;->g:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/d;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/n4;->j(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object v1, p1, Lws/r;->h:Lro/i;

    invoke-virtual {v1, v2}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lxs/d;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/n4;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/o4;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Lxs/d;->g:Lwe/o;

    iget-object v2, p1, Lws/r;->b:Lws/s;

    iget-object v2, v2, Lws/s;->b:Lws/q;

    iget-object v2, v2, Lws/q;->c:Lws/p;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    invoke-virtual {p1}, Lgs/b;->z()Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    sget-object v3, Lvs/l3;->z:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_3
    check-cast p1, Lws/s;

    invoke-static {p1}, Lxs/d;->c(Lws/s;)Lvs/q4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Lxs/d;->g:Lwe/o;

    iget-object v2, p1, Lws/s;->b:Lws/q;

    iget-object v2, v2, Lws/q;->c:Lws/p;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    iget-object p1, p1, Lws/s;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    sget-object v3, Lvs/l3;->E:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_4
    check-cast p1, Lws/i;

    invoke-static {}, Lvs/a2;->F()Lvs/z1;

    move-result-object v0

    iget-object v1, p1, Lws/i;->b:Lws/k;

    invoke-static {}, Lvs/c2;->E()Lvs/b2;

    move-result-object v2

    iget-object v1, v1, Lws/k;->c:Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v1, v4, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v2, v1}, Lvs/b2;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/c2;

    invoke-virtual {v0, v1}, Lvs/z1;->h(Lvs/c2;)V

    iget-object v1, p1, Lws/i;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    array-length v2, v1

    invoke-static {v1, v4, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/z1;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/a2;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Lxs/c;->g:Lwe/o;

    iget-object v2, p1, Lws/i;->b:Lws/k;

    iget-object v2, v2, Lws/k;->b:Lws/h;

    iget-object v2, v2, Lws/h;->a:Lws/g;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    invoke-virtual {p1}, Lgs/b;->z()Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    sget-object v3, Lvs/l3;->z:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_5
    check-cast p1, Lws/k;

    invoke-static {}, Lvs/c2;->E()Lvs/b2;

    move-result-object v0

    iget-object v1, p1, Lws/k;->c:Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/b2;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/c2;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Lxs/c;->g:Lwe/o;

    iget-object v2, p1, Lws/k;->b:Lws/h;

    iget-object v2, v2, Lws/h;->a:Lws/g;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    iget-object p1, p1, Lws/k;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    sget-object v3, Lvs/l3;->E:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_6
    check-cast p1, Lws/d;

    iget-object v0, p1, Lws/d;->b:Lws/e;

    iget-object v0, v0, Lws/e;->b:Lws/c;

    iget-object v0, v0, Lws/c;->b:Lws/a;

    invoke-static {v0}, Lxs/b;->a(Lws/a;)I

    move-result v0

    invoke-static {}, Lvs/i1;->F()Lvs/h1;

    move-result-object v1

    iget-object v2, p1, Lws/d;->b:Lws/e;

    invoke-static {v2}, Lxs/b;->c(Lws/e;)Lvs/k1;

    move-result-object v3

    invoke-virtual {v1, v3}, Lvs/h1;->h(Lvs/k1;)V

    iget-object v3, p1, Lws/d;->c:Lro/i;

    sget-object v4, Lfs/p;->a:Lfs/p;

    invoke-virtual {v3, v4}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/crypto/tink/internal/a;->w(ILjava/math/BigInteger;)[B

    move-result-object v0

    const/4 v3, 0x0

    array-length v4, v0

    invoke-static {v0, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v1, v0}, Lvs/h1;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/i1;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, v2, Lws/e;->b:Lws/c;

    iget-object v1, v1, Lws/c;->d:Lws/b;

    invoke-static {v1}, Lxs/b;->f(Lws/b;)Lvs/h4;

    move-result-object v1

    invoke-virtual {p1}, Lgs/b;->z()Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    sget-object v3, Lvs/l3;->z:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_7
    check-cast p1, Lws/e;

    invoke-static {p1}, Lxs/b;->c(Lws/e;)Lvs/k1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lws/e;->b:Lws/c;

    iget-object v1, v1, Lws/c;->d:Lws/b;

    invoke-static {v1}, Lxs/b;->f(Lws/b;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lws/e;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"

    sget-object v3, Lvs/l3;->E:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_7
        0x2 -> :sswitch_6
        0x6 -> :sswitch_5
        0x8 -> :sswitch_4
        0xc -> :sswitch_3
        0xe -> :sswitch_2
        0x12 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Lcom/google/crypto/tink/internal/k0;)Lts/o;
    .locals 8

    iget v0, p0, Lxs/a;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/w4;->R(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/w4;

    move-result-object v0

    invoke-virtual {v0}, Lvs/w4;->P()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lvs/w4;->N()Lvs/y4;

    move-result-object v1

    invoke-virtual {v1}, Lvs/y4;->G()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    invoke-virtual {v1}, Lvs/y4;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v4

    invoke-static {v4}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {}, Lws/x;->b()Lws/u;

    move-result-object v5

    sget-object v6, Lxs/e;->h:Lwe/o;

    invoke-virtual {v1}, Lvs/y4;->H()Lvs/u4;

    move-result-object v7

    invoke-virtual {v7}, Lvs/u4;->F()Lvs/g2;

    move-result-object v7

    invoke-virtual {v6, v7}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lws/v;

    iput-object v7, v5, Lws/u;->c:Lws/v;

    invoke-virtual {v1}, Lvs/y4;->H()Lvs/u4;

    move-result-object v7

    invoke-virtual {v7}, Lvs/u4;->D()Lvs/g2;

    move-result-object v7

    invoke-virtual {v6, v7}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lws/v;

    iput-object v6, v5, Lws/u;->d:Lws/v;

    iput-object v4, v5, Lws/u;->b:Ljava/math/BigInteger;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v5, Lws/u;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Lvs/y4;->H()Lvs/u4;

    move-result-object v1

    invoke-virtual {v1}, Lvs/u4;->E()I

    move-result v1

    invoke-virtual {v5, v1}, Lws/u;->b(I)V

    sget-object v1, Lxs/e;->g:Lwe/o;

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-virtual {v1, v3}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lws/w;

    iput-object v1, v5, Lws/u;->f:Lws/w;

    invoke-virtual {v5}, Lws/u;->a()Lws/x;

    move-result-object v1

    new-instance v3, Lq30/w0;

    const/16 v4, 0x18

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v3, v1}, Lq30/w0;->J(Lws/x;)V

    invoke-virtual {v3, v2}, Lq30/w0;->E(Ljava/math/BigInteger;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v3}, Lq30/w0;->l()Lws/z;

    move-result-object p1

    new-instance v1, Lm63/d;

    const/16 v2, 0xc

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lm63/d;-><init>(IZ)V

    invoke-virtual {v1, p1}, Lm63/d;->u(Lws/z;)V

    invoke-virtual {v0}, Lvs/w4;->M()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {p1}, Lxs/e;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object p1

    invoke-virtual {v0}, Lvs/w4;->O()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-static {v2}, Lxs/e;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lm63/d;->o(Lro/i;Lro/i;)V

    invoke-virtual {v0}, Lvs/w4;->J()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {p1}, Lxs/e;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm63/d;->r(Lro/i;)V

    invoke-virtual {v0}, Lvs/w4;->K()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {p1}, Lxs/e;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object p1

    invoke-virtual {v0}, Lvs/w4;->L()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-static {v2}, Lxs/e;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lm63/d;->k(Lro/i;Lro/i;)V

    invoke-virtual {v0}, Lvs/w4;->I()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {p1}, Lxs/e;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm63/d;->j(Lro/i;)V

    invoke-virtual {v1}, Lm63/d;->c()Lws/y;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing RsaSsaPssPrivateKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_0
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_1
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/y4;->K(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/y4;

    move-result-object v0

    invoke-virtual {v0}, Lvs/y4;->I()I

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lvs/y4;->G()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    invoke-static {}, Lws/x;->b()Lws/u;

    move-result-object v3

    sget-object v4, Lxs/e;->h:Lwe/o;

    invoke-virtual {v0}, Lvs/y4;->H()Lvs/u4;

    move-result-object v5

    invoke-virtual {v5}, Lvs/u4;->F()Lvs/g2;

    move-result-object v5

    invoke-virtual {v4, v5}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lws/v;

    iput-object v5, v3, Lws/u;->c:Lws/v;

    invoke-virtual {v0}, Lvs/y4;->H()Lvs/u4;

    move-result-object v5

    invoke-virtual {v5}, Lvs/u4;->D()Lvs/g2;

    move-result-object v5

    invoke-virtual {v4, v5}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lws/v;

    iput-object v4, v3, Lws/u;->d:Lws/v;

    invoke-virtual {v0}, Lvs/y4;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v4

    invoke-static {v4}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v4

    iput-object v4, v3, Lws/u;->b:Ljava/math/BigInteger;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v3, Lws/u;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Lvs/y4;->H()Lvs/u4;

    move-result-object v0

    invoke-virtual {v0}, Lvs/u4;->E()I

    move-result v0

    invoke-virtual {v3, v0}, Lws/u;->b(I)V

    sget-object v0, Lxs/e;->g:Lwe/o;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v2, Lvs/h4;

    invoke-virtual {v0, v2}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lws/w;

    iput-object v0, v3, Lws/u;->f:Lws/w;

    invoke-virtual {v3}, Lws/u;->a()Lws/x;

    move-result-object v0

    new-instance v2, Lq30/w0;

    const/16 v3, 0x18

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v2, v0}, Lq30/w0;->J(Lws/x;)V

    invoke-virtual {v2, v1}, Lq30/w0;->E(Ljava/math/BigInteger;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v2, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v2}, Lq30/w0;->l()Lws/z;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing RsaSsaPssPublicKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_1
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :try_start_2
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/o4;->R(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/o4;

    move-result-object v0

    invoke-virtual {v0}, Lvs/o4;->P()I

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lvs/o4;->N()Lvs/q4;

    move-result-object v1

    invoke-virtual {v1}, Lvs/q4;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    invoke-virtual {v1}, Lvs/q4;->E()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v4

    invoke-static {v4}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {}, Lws/q;->b()Lws/n;

    move-result-object v5

    sget-object v6, Lxs/d;->h:Lwe/o;

    invoke-virtual {v1}, Lvs/q4;->G()Lvs/m4;

    move-result-object v1

    invoke-virtual {v1}, Lvs/m4;->B()Lvs/g2;

    move-result-object v1

    invoke-virtual {v6, v1}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lws/o;

    iput-object v1, v5, Lws/n;->c:Lws/o;

    iput-object v4, v5, Lws/n;->b:Ljava/math/BigInteger;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v5, Lws/n;->a:Ljava/lang/Integer;

    sget-object v1, Lxs/d;->g:Lwe/o;

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-virtual {v1, v3}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lws/p;

    iput-object v1, v5, Lws/n;->d:Lws/p;

    invoke-virtual {v5}, Lws/n;->a()Lws/q;

    move-result-object v1

    new-instance v3, Lq30/w0;

    const/16 v4, 0x17

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v3, v1}, Lq30/w0;->I(Lws/q;)V

    invoke-virtual {v3, v2}, Lq30/w0;->E(Ljava/math/BigInteger;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v3}, Lq30/w0;->k()Lws/s;

    move-result-object p1

    new-instance v1, Lm63/d;

    const/16 v2, 0xb

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lm63/d;-><init>(IZ)V

    invoke-virtual {v1, p1}, Lm63/d;->t(Lws/s;)V

    invoke-virtual {v0}, Lvs/o4;->M()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {p1}, Lxs/d;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object p1

    invoke-virtual {v0}, Lvs/o4;->O()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-static {v2}, Lxs/d;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lm63/d;->o(Lro/i;Lro/i;)V

    invoke-virtual {v0}, Lvs/o4;->J()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {p1}, Lxs/d;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm63/d;->r(Lro/i;)V

    invoke-virtual {v0}, Lvs/o4;->K()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {p1}, Lxs/d;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object p1

    invoke-virtual {v0}, Lvs/o4;->L()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-static {v2}, Lxs/d;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lm63/d;->k(Lro/i;Lro/i;)V

    invoke-virtual {v0}, Lvs/o4;->I()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {p1}, Lxs/d;->a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm63/d;->j(Lro/i;)V

    invoke-virtual {v1}, Lm63/d;->a()Lws/r;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing RsaSsaPkcs1PrivateKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_2
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :try_start_3
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/q4;->J(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/q4;

    move-result-object v0

    invoke-virtual {v0}, Lvs/q4;->H()I

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lvs/q4;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    invoke-static {}, Lws/q;->b()Lws/n;

    move-result-object v3

    sget-object v4, Lxs/d;->h:Lwe/o;

    invoke-virtual {v0}, Lvs/q4;->G()Lvs/m4;

    move-result-object v5

    invoke-virtual {v5}, Lvs/m4;->B()Lvs/g2;

    move-result-object v5

    invoke-virtual {v4, v5}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lws/o;

    iput-object v4, v3, Lws/n;->c:Lws/o;

    invoke-virtual {v0}, Lvs/q4;->E()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, v3, Lws/n;->b:Ljava/math/BigInteger;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v3, Lws/n;->a:Ljava/lang/Integer;

    sget-object v0, Lxs/d;->g:Lwe/o;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v2, Lvs/h4;

    invoke-virtual {v0, v2}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lws/p;

    iput-object v0, v3, Lws/n;->d:Lws/p;

    invoke-virtual {v3}, Lws/n;->a()Lws/q;

    move-result-object v0

    new-instance v2, Lq30/w0;

    const/16 v3, 0x17

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v2, v0}, Lq30/w0;->I(Lws/q;)V

    invoke-virtual {v2, v1}, Lq30/w0;->E(Ljava/math/BigInteger;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v2, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v2}, Lq30/w0;->k()Lws/s;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing RsaSsaPkcs1PublicKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_3
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    :try_start_4
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/a2;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/a2;

    move-result-object v1

    invoke-virtual {v1}, Lvs/a2;->E()I

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v1}, Lvs/a2;->D()Lvs/c2;

    move-result-object v2

    sget-object v3, Lxs/c;->g:Lwe/o;

    iget-object v4, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v4, Lvs/h4;

    invoke-virtual {v3, v4}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lws/g;

    invoke-virtual {v2}, Lvs/c2;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v2

    invoke-static {v2}, Lct/a;->a([B)Lct/a;

    move-result-object v2

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v3, v2, p1}, Lws/k;->Y(Lws/g;Lct/a;Ljava/lang/Integer;)Lws/k;

    move-result-object p1

    invoke-virtual {v1}, Lvs/a2;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-static {p1, v0}, Lws/i;->Y(Lws/k;Lro/i;)Lws/i;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing Ed25519PrivateKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_4
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    :try_start_5
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/c2;->F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/c2;

    move-result-object v0

    invoke-virtual {v0}, Lvs/c2;->D()I

    move-result v1

    if-nez v1, :cond_a

    sget-object v1, Lxs/c;->g:Lwe/o;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v2, Lvs/h4;

    invoke-virtual {v1, v2}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lws/g;

    invoke-virtual {v0}, Lvs/c2;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v0

    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    move-result-object v0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v1, v0, p1}, Lws/k;->Y(Lws/g;Lct/a;Ljava/lang/Integer;)Lws/k;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing Ed25519PublicKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_5
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :try_start_6
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/i1;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/i1;

    move-result-object v0

    invoke-virtual {v0}, Lvs/i1;->E()I

    move-result v1

    if-nez v1, :cond_c

    invoke-virtual {v0}, Lvs/i1;->D()Lvs/k1;

    move-result-object v1

    invoke-static {}, Lws/c;->b()Lzt/q;

    move-result-object v2

    invoke-virtual {v1}, Lvs/k1;->E()Lvs/g1;

    move-result-object v3

    invoke-virtual {v3}, Lvs/g1;->F()Lvs/g2;

    move-result-object v3

    invoke-static {v3}, Lxs/b;->e(Lvs/g2;)Lws/b;

    move-result-object v3

    iput-object v3, v2, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v1}, Lvs/k1;->E()Lvs/g1;

    move-result-object v3

    invoke-virtual {v3}, Lvs/g1;->E()Lvs/l1;

    move-result-object v3

    invoke-static {v3}, Lxs/b;->g(Lvs/l1;)Lws/b;

    move-result-object v3

    iput-object v3, v2, Lzt/q;->x:Ljava/lang/Object;

    invoke-virtual {v1}, Lvs/k1;->E()Lvs/g1;

    move-result-object v3

    invoke-virtual {v3}, Lvs/g1;->C()Lvs/d2;

    move-result-object v3

    invoke-static {v3}, Lxs/b;->d(Lvs/d2;)Lws/a;

    move-result-object v3

    iput-object v3, v2, Lzt/q;->y:Ljava/lang/Object;

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-static {v3}, Lxs/b;->h(Lvs/h4;)Lws/b;

    move-result-object v3

    iput-object v3, v2, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v2}, Lzt/q;->o()Lws/c;

    move-result-object v2

    new-instance v3, Lq30/w0;

    const/16 v4, 0x16

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v3, v2}, Lq30/w0;->H(Lws/c;)V

    new-instance v2, Ljava/security/spec/ECPoint;

    invoke-virtual {v1}, Lvs/k1;->G()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v4

    invoke-static {v4}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v1}, Lvs/k1;->H()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v2, v4, v1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v3, v2}, Lq30/w0;->K(Ljava/security/spec/ECPoint;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v3}, Lq30/w0;->j()Lws/e;

    move-result-object p1

    new-instance v1, Lpg3/p;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lpg3/p;-><init>(I)V

    invoke-virtual {v1, p1}, Lpg3/p;->k(Lws/e;)V

    invoke-virtual {v0}, Lvs/i1;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lpg3/p;->j(Lro/i;)V

    invoke-virtual {v1}, Lpg3/p;->e()Lws/d;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing EcdsaPrivateKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_6
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :try_start_7
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/k1;->J(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/k1;

    move-result-object v0

    invoke-virtual {v0}, Lvs/k1;->F()I

    move-result v1

    if-nez v1, :cond_e

    invoke-static {}, Lws/c;->b()Lzt/q;

    move-result-object v1

    invoke-virtual {v0}, Lvs/k1;->E()Lvs/g1;

    move-result-object v2

    invoke-virtual {v2}, Lvs/g1;->F()Lvs/g2;

    move-result-object v2

    invoke-static {v2}, Lxs/b;->e(Lvs/g2;)Lws/b;

    move-result-object v2

    iput-object v2, v1, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v0}, Lvs/k1;->E()Lvs/g1;

    move-result-object v2

    invoke-virtual {v2}, Lvs/g1;->E()Lvs/l1;

    move-result-object v2

    invoke-static {v2}, Lxs/b;->g(Lvs/l1;)Lws/b;

    move-result-object v2

    iput-object v2, v1, Lzt/q;->x:Ljava/lang/Object;

    invoke-virtual {v0}, Lvs/k1;->E()Lvs/g1;

    move-result-object v2

    invoke-virtual {v2}, Lvs/g1;->C()Lvs/d2;

    move-result-object v2

    invoke-static {v2}, Lxs/b;->d(Lvs/d2;)Lws/a;

    move-result-object v2

    iput-object v2, v1, Lzt/q;->y:Ljava/lang/Object;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v2, Lvs/h4;

    invoke-static {v2}, Lxs/b;->h(Lvs/h4;)Lws/b;

    move-result-object v2

    iput-object v2, v1, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v1}, Lzt/q;->o()Lws/c;

    move-result-object v1

    new-instance v2, Lq30/w0;

    const/16 v3, 0x16

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v2, v1}, Lq30/w0;->H(Lws/c;)V

    new-instance v1, Ljava/security/spec/ECPoint;

    invoke-virtual {v0}, Lvs/k1;->G()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v3

    invoke-static {v3}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0}, Lvs/k1;->H()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v2, v1}, Lq30/w0;->K(Ljava/security/spec/ECPoint;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v2, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v2}, Lq30/w0;->j()Lws/e;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_7
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing EcdsaPublicKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_6
        0x3 -> :sswitch_5
        0x7 -> :sswitch_4
        0x9 -> :sswitch_3
        0xd -> :sswitch_2
        0xf -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public g(Lcom/google/crypto/tink/internal/l0;)Lfs/k;
    .locals 4

    iget v0, p0, Lxs/a;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvs/r;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/r;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lvs/r;->C()Lvs/t;

    move-result-object v0

    invoke-virtual {p1}, Lvs/r;->B()I

    move-result p1

    invoke-static {v0, p1}, Lzs/b;->b(Lvs/t;I)Lys/d;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesCtrHmacStreamingParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/s4;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/s4;

    move-result-object v0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-static {}, Lws/x;->b()Lws/u;

    move-result-object v1

    sget-object v2, Lxs/e;->h:Lwe/o;

    invoke-virtual {v0}, Lvs/s4;->D()Lvs/u4;

    move-result-object v3

    invoke-virtual {v3}, Lvs/u4;->F()Lvs/g2;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lws/v;

    iput-object v3, v1, Lws/u;->c:Lws/v;

    invoke-virtual {v0}, Lvs/s4;->D()Lvs/u4;

    move-result-object v3

    invoke-virtual {v3}, Lvs/u4;->D()Lvs/g2;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lws/v;

    iput-object v2, v1, Lws/u;->d:Lws/v;

    invoke-virtual {v0}, Lvs/s4;->E()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v2

    iput-object v2, v1, Lws/u;->b:Ljava/math/BigInteger;

    invoke-virtual {v0}, Lvs/s4;->C()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lws/u;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Lvs/s4;->D()Lvs/u4;

    move-result-object v0

    invoke-virtual {v0}, Lvs/u4;->E()I

    move-result v0

    invoke-virtual {v1, v0}, Lws/u;->b(I)V

    sget-object v0, Lxs/e;->g:Lwe/o;

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lws/w;

    iput-object p1, v1, Lws/u;->f:Lws/w;

    invoke-virtual {v1}, Lws/u;->a()Lws/x;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing RsaSsaPssParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_1
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_2
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/k4;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/k4;

    move-result-object v0
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_2

    invoke-static {}, Lws/q;->b()Lws/n;

    move-result-object v1

    sget-object v2, Lxs/d;->h:Lwe/o;

    invoke-virtual {v0}, Lvs/k4;->D()Lvs/m4;

    move-result-object v3

    invoke-virtual {v3}, Lvs/m4;->B()Lvs/g2;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lws/o;

    iput-object v2, v1, Lws/n;->c:Lws/o;

    invoke-virtual {v0}, Lvs/k4;->E()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v2

    iput-object v2, v1, Lws/n;->b:Ljava/math/BigInteger;

    invoke-virtual {v0}, Lvs/k4;->C()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v1, Lws/n;->a:Ljava/lang/Integer;

    sget-object v0, Lxs/d;->g:Lwe/o;

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lws/p;

    iput-object p1, v1, Lws/n;->d:Lws/p;

    invoke-virtual {v1}, Lws/n;->a()Lws/q;

    move-result-object p1

    return-object p1

    :catch_2
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing RsaSsaPkcs1Parameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_2
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :try_start_3
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/y1;->B(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/y1;

    move-result-object v0

    invoke-virtual {v0}, Lvs/y1;->A()I

    move-result v0
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_3

    if-nez v0, :cond_3

    sget-object v0, Lxs/c;->g:Lwe/o;

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lws/g;

    new-instance v0, Lws/h;

    invoke-direct {v0, p1}, Lws/h;-><init>(Lws/g;)V

    return-object v0

    :cond_3
    :try_start_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing Ed25519Parameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_2
        0xb -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public h(Lts/o;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxs/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/google/crypto/tink/internal/q;

    invoke-static {p1}, Lys/j;->a(Lcom/google/crypto/tink/internal/q;)Lys/j;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lys/e;

    invoke-static {p1}, Lat/a;->b(Lys/e;)Lat/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lys/a;

    invoke-static {p1}, Lat/a;->a(Lys/a;)Lat/a;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public navigate(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)Z
    .locals 0

    invoke-static {p1}, Lio/getstream/chat/android/ui/navigation/ChatNavigator;->a(Lio/getstream/chat/android/ui/navigation/destinations/ChatDestination;)V

    const/4 p1, 0x0

    return p1
.end method
