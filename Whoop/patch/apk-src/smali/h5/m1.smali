.class public final synthetic Lh5/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/internal/e0;
.implements Lcom/google/crypto/tink/internal/c0;
.implements Lcom/google/crypto/tink/internal/n;
.implements Lcom/google/crypto/tink/internal/l;
.implements Lgt/e;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lh5/m1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lfs/k;)Lcom/google/crypto/tink/internal/l0;
    .locals 5

    iget v0, p0, Lh5/m1;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lgs/k0;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/b5;->z()Lvs/b5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lgs/k0;->a:Lgs/j;

    invoke-static {p1}, Lhs/k;->a(Lgs/j;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lgs/w;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/b1;->z()Lvs/b1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lgs/w;->a:Lgs/j;

    invoke-static {p1}, Lhs/f;->a(Lgs/j;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lgs/t;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/t0;->C()Lvs/s0;

    move-result-object v1

    iget v2, p1, Lgs/t;->a:I

    invoke-virtual {v1, v2}, Lvs/s0;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/t0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lgs/t;->b:Lgs/j;

    invoke-static {p1}, Lhs/d;->a(Lgs/j;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_2
    check-cast p1, Lgs/q;

    invoke-static {p1}, Lhs/c;->c(Lgs/q;)V

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/p0;->C()Lvs/o0;

    move-result-object v1

    iget v2, p1, Lgs/q;->a:I

    invoke-virtual {v1, v2}, Lvs/o0;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/p0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lgs/q;->d:Lgs/j;

    invoke-static {p1}, Lhs/c;->a(Lgs/j;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_3
    check-cast p1, Lgs/n;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/d0;->D()Lvs/c0;

    move-result-object v1

    invoke-static {p1}, Lhs/b;->a(Lgs/n;)Lvs/f0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/c0;->h(Lvs/f0;)V

    iget v2, p1, Lgs/n;->a:I

    invoke-virtual {v1, v2}, Lvs/c0;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/d0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lgs/n;->d:Lgs/j;

    invoke-static {p1}, Lhs/b;->b(Lgs/j;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_4
    check-cast p1, Lgs/k;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/n;->D()Lvs/m;

    move-result-object v1

    invoke-static {}, Lvs/x;->E()Lvs/w;

    move-result-object v2

    invoke-static {}, Lvs/z;->C()Lvs/y;

    move-result-object v3

    iget v4, p1, Lgs/k;->c:I

    invoke-virtual {v3, v4}, Lvs/y;->g(I)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v3

    check-cast v3, Lvs/z;

    invoke-virtual {v2, v3}, Lvs/w;->h(Lvs/z;)V

    iget v3, p1, Lgs/k;->a:I

    invoke-virtual {v2, v3}, Lvs/w;->g(I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v2

    check-cast v2, Lvs/x;

    invoke-virtual {v1, v2}, Lvs/m;->g(Lvs/x;)V

    invoke-static {}, Lvs/q2;->F()Lvs/p2;

    move-result-object v2

    invoke-static {p1}, Lhs/a;->a(Lgs/k;)Lvs/s2;

    move-result-object v3

    invoke-virtual {v2, v3}, Lvs/p2;->h(Lvs/s2;)V

    iget v3, p1, Lgs/k;->b:I

    invoke-virtual {v2, v3}, Lvs/p2;->g(I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v2

    check-cast v2, Lvs/q2;

    invoke-virtual {v1, v2}, Lvs/m;->h(Lvs/q2;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/n;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lgs/k;->e:Lgs/j;

    invoke-static {p1}, Lhs/a;->c(Lgs/j;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_4
        0x5 -> :sswitch_3
        0x9 -> :sswitch_2
        0xd -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public d(Lts/o;)Lcom/google/crypto/tink/internal/k0;
    .locals 6

    iget v0, p0, Lh5/m1;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lgs/i0;

    invoke-static {}, Lvs/a5;->D()Lvs/z4;

    move-result-object v0

    iget-object v1, p1, Lgs/i0;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/z4;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/a5;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lgs/i0;->b:Lgs/k0;

    iget-object v1, v1, Lgs/k0;->a:Lgs/j;

    invoke-static {v1}, Lhs/k;->a(Lgs/j;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lgs/i0;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lgs/u;

    invoke-static {}, Lvs/z0;->D()Lvs/y0;

    move-result-object v0

    iget-object v1, p1, Lgs/u;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/y0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/z0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lgs/u;->b:Lgs/w;

    iget-object v1, v1, Lgs/w;->a:Lgs/j;

    invoke-static {v1}, Lhs/f;->a(Lgs/j;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lgs/u;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lgs/r;

    invoke-static {}, Lvs/r0;->D()Lvs/q0;

    move-result-object v0

    iget-object v1, p1, Lgs/r;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/q0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/r0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lgs/r;->b:Lgs/t;

    iget-object v1, v1, Lgs/t;->b:Lgs/j;

    invoke-static {v1}, Lhs/d;->a(Lgs/j;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lgs/r;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_2
    check-cast p1, Lgs/o;

    iget-object v0, p1, Lgs/o;->b:Lgs/q;

    invoke-static {v0}, Lhs/c;->c(Lgs/q;)V

    invoke-static {}, Lvs/n0;->D()Lvs/m0;

    move-result-object v0

    iget-object v1, p1, Lgs/o;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/m0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/n0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lgs/o;->b:Lgs/q;

    iget-object v1, v1, Lgs/q;->d:Lgs/j;

    invoke-static {v1}, Lhs/c;->a(Lgs/j;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lgs/o;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_3
    check-cast p1, Lgs/l;

    invoke-static {}, Lvs/b0;->F()Lvs/a0;

    move-result-object v0

    iget-object v1, p1, Lgs/l;->b:Lgs/n;

    invoke-static {v1}, Lhs/b;->a(Lgs/n;)Lvs/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/a0;->h(Lvs/f0;)V

    iget-object v1, p1, Lgs/l;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/a0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/b0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lgs/l;->b:Lgs/n;

    iget-object v1, v1, Lgs/n;->d:Lgs/j;

    invoke-static {v1}, Lhs/b;->b(Lgs/j;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lgs/l;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_4
    check-cast p1, Lgs/g;

    invoke-static {}, Lvs/l;->F()Lvs/k;

    move-result-object v0

    invoke-static {}, Lvs/v;->F()Lvs/u;

    move-result-object v1

    invoke-static {}, Lvs/z;->C()Lvs/y;

    move-result-object v2

    iget-object v3, p1, Lgs/g;->b:Lgs/k;

    iget v3, v3, Lgs/k;->c:I

    invoke-virtual {v2, v3}, Lvs/y;->g(I)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v2

    check-cast v2, Lvs/z;

    invoke-virtual {v1, v2}, Lvs/u;->h(Lvs/z;)V

    iget-object v2, p1, Lgs/g;->c:Lro/i;

    sget-object v3, Lfs/p;->a:Lfs/p;

    invoke-virtual {v2, v3}, Lro/i;->F(Lfs/p;)[B

    move-result-object v2

    array-length v4, v2

    const/4 v5, 0x0

    invoke-static {v2, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/u;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/v;

    invoke-virtual {v0, v1}, Lvs/k;->g(Lvs/v;)V

    invoke-static {}, Lvs/o2;->G()Lvs/n2;

    move-result-object v1

    iget-object v2, p1, Lgs/g;->b:Lgs/k;

    invoke-static {v2}, Lhs/a;->a(Lgs/k;)Lvs/s2;

    move-result-object v4

    invoke-virtual {v1, v4}, Lvs/n2;->h(Lvs/s2;)V

    iget-object v4, p1, Lgs/g;->d:Lro/i;

    invoke-virtual {v4, v3}, Lro/i;->F(Lfs/p;)[B

    move-result-object v3

    array-length v4, v3

    invoke-static {v3, v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v3

    invoke-virtual {v1, v3}, Lvs/n2;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/o2;

    invoke-virtual {v0, v1}, Lvs/k;->h(Lvs/o2;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/l;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, v2, Lgs/k;->e:Lgs/j;

    invoke-static {v1}, Lhs/a;->c(Lgs/j;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lgs/g;->f:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_4
        0x7 -> :sswitch_3
        0xb -> :sswitch_2
        0xf -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Lcom/google/crypto/tink/internal/k0;)Lts/o;
    .locals 5

    iget v0, p0, Lh5/m1;->w:I

    sparse-switch v0, :sswitch_data_0

    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/a5;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/a5;

    move-result-object v1

    invoke-virtual {v1}, Lvs/a5;->C()I

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v2, Lvs/h4;

    invoke-static {v2}, Lhs/k;->b(Lvs/h4;)Lgs/j;

    move-result-object v2

    invoke-virtual {v1}, Lvs/a5;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v2, v0, p1}, Lgs/i0;->Y(Lgs/j;Lro/i;Ljava/lang/Integer;)Lgs/i0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing XChaCha20Poly1305Key failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_0
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_1
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/z0;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/z0;

    move-result-object v1

    invoke-virtual {v1}, Lvs/z0;->C()I

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v2, Lvs/h4;

    invoke-static {v2}, Lhs/f;->b(Lvs/h4;)Lgs/j;

    move-result-object v2

    invoke-virtual {v1}, Lvs/z0;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v2, v0, p1}, Lgs/u;->Y(Lgs/j;Lro/i;Ljava/lang/Integer;)Lgs/u;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing ChaCha20Poly1305Key failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_1
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :try_start_2
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/r0;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/r0;

    move-result-object v1

    invoke-virtual {v1}, Lvs/r0;->C()I

    move-result v2

    if-nez v2, :cond_4

    invoke-static {}, Lgs/t;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v2

    invoke-virtual {v1}, Lvs/r0;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-static {v3}, Lhs/d;->b(Lvs/h4;)Lgs/j;

    move-result-object v3

    iput-object v3, v2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/crypto/tink/internal/l0;->C()Lgs/t;

    move-result-object v2

    new-instance v3, Lgm/r;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lgm/r;-><init>(I)V

    invoke-virtual {v3, v2}, Lgm/r;->T(Lgs/t;)V

    invoke-virtual {v1}, Lvs/r0;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-virtual {v3, v0}, Lgm/r;->Q(Lro/i;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, Lgm/r;->P(Ljava/lang/Integer;)V

    invoke-virtual {v3}, Lgm/r;->y()Lgs/r;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesGcmSivKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesGcmSivProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_2
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :try_start_3
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/n0;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/n0;

    move-result-object v1

    invoke-virtual {v1}, Lvs/n0;->C()I

    move-result v2

    if-nez v2, :cond_6

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v2

    invoke-virtual {v1}, Lvs/n0;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Lzt/q;->K(I)V

    invoke-virtual {v2}, Lzt/q;->I()V

    invoke-virtual {v2}, Lzt/q;->L()V

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-static {v3}, Lhs/c;->b(Lvs/h4;)Lgs/j;

    move-result-object v3

    iput-object v3, v2, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v2}, Lzt/q;->j()Lgs/q;

    move-result-object v2

    new-instance v3, Lgm/r;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lgm/r;-><init>(I)V

    invoke-virtual {v3, v2}, Lgm/r;->S(Lgs/q;)V

    invoke-virtual {v1}, Lvs/n0;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-virtual {v3, v0}, Lgm/r;->Q(Lro/i;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, Lgm/r;->P(Ljava/lang/Integer;)V

    invoke-virtual {v3}, Lgm/r;->x()Lgs/o;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesGcmKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesGcmProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_3
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :try_start_4
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/b0;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/b0;

    move-result-object v1

    invoke-virtual {v1}, Lvs/b0;->E()I

    move-result v2

    if-nez v2, :cond_8

    invoke-static {}, Lgs/n;->b()Lzt/q;

    move-result-object v2

    invoke-virtual {v1}, Lvs/b0;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Lzt/q;->K(I)V

    invoke-virtual {v1}, Lvs/b0;->D()Lvs/f0;

    move-result-object v3

    invoke-virtual {v3}, Lvs/f0;->B()I

    move-result v3

    invoke-virtual {v2, v3}, Lzt/q;->J(I)V

    invoke-virtual {v2}, Lzt/q;->L()V

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-static {v3}, Lhs/b;->c(Lvs/h4;)Lgs/j;

    move-result-object v3

    iput-object v3, v2, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v2}, Lzt/q;->g()Lgs/n;

    move-result-object v2

    new-instance v3, Lgm/r;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lgm/r;-><init>(I)V

    invoke-virtual {v3, v2}, Lgm/r;->R(Lgs/n;)V

    invoke-virtual {v1}, Lvs/b0;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-virtual {v3, v0}, Lgm/r;->Q(Lro/i;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, Lgm/r;->P(Ljava/lang/Integer;)V

    invoke-virtual {v3}, Lgm/r;->w()Lgs/l;

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

    const-string v0, "Parsing AesEaxcKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesEaxProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_4
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :try_start_5
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/l;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/l;

    move-result-object v1

    invoke-virtual {v1}, Lvs/l;->E()I

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {v1}, Lvs/l;->C()Lvs/v;

    move-result-object v2

    invoke-virtual {v2}, Lvs/v;->E()I

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {v1}, Lvs/l;->D()Lvs/o2;

    move-result-object v2

    invoke-virtual {v2}, Lvs/o2;->F()I

    move-result v2

    if-nez v2, :cond_a

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v2

    invoke-virtual {v1}, Lvs/l;->C()Lvs/v;

    move-result-object v3

    invoke-virtual {v3}, Lvs/v;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v1}, Lvs/l;->D()Lvs/o2;

    move-result-object v3

    invoke-virtual {v3}, Lvs/o2;->D()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v1}, Lvs/l;->C()Lvs/v;

    move-result-object v3

    invoke-virtual {v3}, Lvs/v;->D()Lvs/z;

    move-result-object v3

    invoke-virtual {v3}, Lvs/z;->B()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    invoke-virtual {v1}, Lvs/l;->D()Lvs/o2;

    move-result-object v3

    invoke-virtual {v3}, Lvs/o2;->E()Lvs/s2;

    move-result-object v3

    invoke-virtual {v3}, Lvs/s2;->D()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v1}, Lvs/l;->D()Lvs/o2;

    move-result-object v3

    invoke-virtual {v3}, Lvs/o2;->E()Lvs/s2;

    move-result-object v3

    invoke-virtual {v3}, Lvs/s2;->C()Lvs/g2;

    move-result-object v3

    invoke-static {v3}, Lhs/a;->b(Lvs/g2;)Lgs/j;

    move-result-object v3

    iput-object v3, v2, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-static {v3}, Lhs/a;->d(Lvs/h4;)Lgs/j;

    move-result-object v3

    iput-object v3, v2, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v2

    new-instance v3, La00/g;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, La00/g;-><init>(I)V

    invoke-virtual {v3, v2}, La00/g;->K(Lgs/k;)V

    invoke-virtual {v1}, Lvs/l;->C()Lvs/v;

    move-result-object v2

    invoke-virtual {v2}, Lvs/v;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v2

    invoke-static {v2, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v2

    invoke-virtual {v3, v2}, La00/g;->D(Lro/i;)V

    invoke-virtual {v1}, Lvs/l;->D()Lvs/o2;

    move-result-object v1

    invoke-virtual {v1}, Lvs/o2;->D()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-virtual {v3, v0}, La00/g;->H(Lro/i;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, La00/g;->I(Ljava/lang/Integer;)V

    invoke-virtual {v3}, La00/g;->f()Lgs/g;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys inner HMAC keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys inner AES CTR keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesCtrHmacAeadKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_4
        0x8 -> :sswitch_3
        0xc -> :sswitch_2
        0x10 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public f(Laa3/i1;)Ljava/lang/Object;
    .locals 0

    iget p1, p0, Lh5/m1;->w:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lgt/l;

    sget-object p1, Lht/k;->w:Lht/k;

    return-object p1

    :pswitch_0
    sget-object p1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Lgt/l;

    invoke-virtual {p1}, Lgt/l;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p1

    :pswitch_1
    sget-object p1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Lgt/l;

    invoke-virtual {p1}, Lgt/l;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Lgt/l;

    invoke-virtual {p1}, Lgt/l;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lcom/google/crypto/tink/internal/l0;)Lfs/k;
    .locals 3

    iget v0, p0, Lh5/m1;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/b5;->B(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/b5;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lvs/b5;->A()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lhs/k;->b(Lvs/h4;)Lgs/j;

    move-result-object p1

    new-instance v0, Lgs/k0;

    invoke-direct {v0, p1}, Lgs/k0;-><init>(Lgs/j;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 parameters are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing XChaCha20Poly1305Parameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: "

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

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/b1;->A(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)V
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lhs/f;->b(Lvs/h4;)Lgs/j;

    move-result-object p1

    new-instance v0, Lgs/w;

    invoke-direct {v0, p1}, Lgs/w;-><init>(Lgs/j;)V

    return-object v0

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing ChaCha20Poly1305Parameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: "

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

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :try_start_2
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/t0;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/t0;

    move-result-object v0
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_2

    invoke-virtual {v0}, Lvs/t0;->B()I

    move-result v1

    if-nez v1, :cond_3

    invoke-static {}, Lgs/t;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v1

    invoke-virtual {v0}, Lvs/t0;->A()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lhs/d;->b(Lvs/h4;)Lgs/j;

    move-result-object p1

    iput-object p1, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/l0;->C()Lgs/t;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 parameters are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_2
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesGcmSivParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: "

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

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :try_start_3
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/p0;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/p0;

    move-result-object v0
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_3

    invoke-virtual {v0}, Lvs/p0;->B()I

    move-result v1

    if-nez v1, :cond_5

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v1

    invoke-virtual {v0}, Lvs/p0;->A()I

    move-result v0

    invoke-virtual {v1, v0}, Lzt/q;->K(I)V

    invoke-virtual {v1}, Lzt/q;->I()V

    invoke-virtual {v1}, Lzt/q;->L()V

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lhs/c;->b(Lvs/h4;)Lgs/j;

    move-result-object p1

    iput-object p1, v1, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v1}, Lzt/q;->j()Lgs/q;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 parameters are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_3
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesGcmParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to AesGcmProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_3
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :try_start_4
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/d0;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/d0;

    move-result-object v0
    :try_end_4
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_4 .. :try_end_4} :catch_4

    invoke-static {}, Lgs/n;->b()Lzt/q;

    move-result-object v1

    invoke-virtual {v0}, Lvs/d0;->B()I

    move-result v2

    invoke-virtual {v1, v2}, Lzt/q;->K(I)V

    invoke-virtual {v0}, Lvs/d0;->C()Lvs/f0;

    move-result-object v0

    invoke-virtual {v0}, Lvs/f0;->B()I

    move-result v0

    invoke-virtual {v1, v0}, Lzt/q;->J(I)V

    invoke-virtual {v1}, Lzt/q;->L()V

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lhs/b;->c(Lvs/h4;)Lgs/j;

    move-result-object p1

    iput-object p1, v1, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v1}, Lzt/q;->g()Lgs/n;

    move-result-object p1

    return-object p1

    :catch_4
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesEaxParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to AesEaxProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_4
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :try_start_5
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/n;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/n;

    move-result-object v0
    :try_end_5
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_5 .. :try_end_5} :catch_5

    invoke-virtual {v0}, Lvs/n;->C()Lvs/q2;

    move-result-object v1

    invoke-virtual {v1}, Lvs/q2;->E()I

    move-result v1

    if-nez v1, :cond_8

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v1

    invoke-virtual {v0}, Lvs/n;->B()Lvs/x;

    move-result-object v2

    invoke-virtual {v2}, Lvs/x;->C()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v0}, Lvs/n;->C()Lvs/q2;

    move-result-object v2

    invoke-virtual {v2}, Lvs/q2;->C()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v0}, Lvs/n;->B()Lvs/x;

    move-result-object v2

    invoke-virtual {v2}, Lvs/x;->D()Lvs/z;

    move-result-object v2

    invoke-virtual {v2}, Lvs/z;->B()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    invoke-virtual {v0}, Lvs/n;->C()Lvs/q2;

    move-result-object v2

    invoke-virtual {v2}, Lvs/q2;->D()Lvs/s2;

    move-result-object v2

    invoke-virtual {v2}, Lvs/s2;->D()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v0}, Lvs/n;->C()Lvs/q2;

    move-result-object v0

    invoke-virtual {v0}, Lvs/q2;->D()Lvs/s2;

    move-result-object v0

    invoke-virtual {v0}, Lvs/s2;->C()Lvs/g2;

    move-result-object v0

    invoke-static {v0}, Lhs/a;->b(Lvs/g2;)Lgs/j;

    move-result-object v0

    iput-object v0, v1, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lhs/a;->d(Lvs/h4;)Lgs/j;

    move-result-object p1

    iput-object p1, v1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_5
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesCtrHmacAeadParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_4
        0x6 -> :sswitch_3
        0xa -> :sswitch_2
        0xe -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
.end method
