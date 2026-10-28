.class public final synthetic Lts/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/internal/g0;
.implements Lgt/e;
.implements Lcom/google/crypto/tink/internal/e0;
.implements Lcom/google/crypto/tink/internal/c0;
.implements Lcom/google/crypto/tink/internal/n;
.implements Lcom/google/crypto/tink/internal/l;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lts/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lfs/k;)Lcom/google/crypto/tink/internal/l0;
    .locals 3

    iget v0, p0, Lts/b;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lws/c;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/e1;->B()Lvs/d1;

    move-result-object v1

    invoke-static {p1}, Lxs/b;->b(Lws/c;)Lvs/g1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/d1;->g(Lvs/g1;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/e1;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lws/c;->d:Lws/b;

    invoke-static {p1}, Lxs/b;->f(Lws/b;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lts/k;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacPrfKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/w2;->E()Lvs/v2;

    move-result-object v1

    invoke-static {p1}, Lus/c;->a(Lts/k;)Lvs/y2;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/v2;->h(Lvs/y2;)V

    iget p1, p1, Lts/k;->a:I

    invoke-virtual {v1, p1}, Lvs/v2;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/w2;

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

    :sswitch_1
    check-cast p1, Lts/h;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HkdfPrfKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/k2;->E()Lvs/j2;

    move-result-object v1

    invoke-static {p1}, Lus/b;->a(Lts/h;)Lvs/m2;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/j2;->h(Lvs/m2;)V

    iget p1, p1, Lts/h;->a:I

    invoke-virtual {v1, p1}, Lvs/j2;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/k2;

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

    :sswitch_2
    check-cast p1, Lts/d;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacPrfKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/j;->C()Lvs/i;

    move-result-object v1

    iget p1, p1, Lts/d;->a:I

    invoke-virtual {v1, p1}, Lvs/i;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/j;

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

    nop

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_2
        0xa -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public d(Lts/o;)Lcom/google/crypto/tink/internal/k0;
    .locals 4

    iget v0, p0, Lts/b;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lts/i;

    invoke-static {}, Lvs/u2;->F()Lvs/t2;

    move-result-object v0

    iget-object v1, p1, Lts/i;->b:Lts/k;

    invoke-static {v1}, Lus/c;->a(Lts/k;)Lvs/y2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/t2;->h(Lvs/y2;)V

    iget-object p1, p1, Lts/i;->c:Lro/i;

    sget-object v1, Lfs/p;->a:Lfs/p;

    invoke-virtual {p1, v1}, Lro/i;->F(Lfs/p;)[B

    move-result-object p1

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/t2;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/u2;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lvs/h4;->E:Lvs/h4;

    const/4 v1, 0x0

    const-string v2, "type.googleapis.com/google.crypto.tink.HmacPrfKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, p1, v3, v0, v1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lts/e;

    invoke-static {}, Lvs/i2;->F()Lvs/h2;

    move-result-object v0

    iget-object v1, p1, Lts/e;->b:Lts/h;

    invoke-static {v1}, Lus/b;->a(Lts/h;)Lvs/m2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/h2;->h(Lvs/m2;)V

    iget-object p1, p1, Lts/e;->c:Lro/i;

    sget-object v1, Lfs/p;->a:Lfs/p;

    invoke-virtual {p1, v1}, Lro/i;->F(Lfs/p;)[B

    move-result-object p1

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/h2;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/i2;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lvs/h4;->E:Lvs/h4;

    const/4 v1, 0x0

    const-string v2, "type.googleapis.com/google.crypto.tink.HkdfPrfKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, p1, v3, v0, v1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lts/a;

    invoke-static {}, Lvs/h;->D()Lvs/g;

    move-result-object v0

    iget-object p1, p1, Lts/a;->c:Lro/i;

    sget-object v1, Lfs/p;->a:Lfs/p;

    invoke-virtual {p1, v1}, Lro/i;->F(Lfs/p;)[B

    move-result-object p1

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/g;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/h;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lvs/h4;->E:Lvs/h4;

    const/4 v1, 0x0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacPrfKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, p1, v3, v0, v1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Lcom/google/crypto/tink/internal/k0;)Lts/o;
    .locals 4

    iget v0, p0, Lts/b;->w:I

    sparse-switch v0, :sswitch_data_0

    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.HmacPrfKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :try_start_0
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/u2;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/u2;

    move-result-object v1

    invoke-virtual {v1}, Lvs/u2;->E()I

    move-result v2

    if-nez v2, :cond_1

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    invoke-static {}, Lts/k;->b()Lp0/n0;

    move-result-object p1

    invoke-virtual {v1}, Lvs/u2;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Lp0/n0;->l(I)V

    invoke-virtual {v1}, Lvs/u2;->D()Lvs/y2;

    move-result-object v2

    invoke-virtual {v2}, Lvs/y2;->B()Lvs/g2;

    move-result-object v2

    invoke-static {v2}, Lus/c;->b(Lvs/g2;)Lts/g;

    move-result-object v2

    iput-object v2, p1, Lp0/n0;->y:Ljava/lang/Object;

    invoke-virtual {p1}, Lp0/n0;->d()Lts/k;

    move-result-object p1

    new-instance v2, Lt9/u;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lt9/u;-><init>(I)V

    invoke-virtual {v2, p1}, Lt9/u;->g(Lts/k;)V

    invoke-virtual {v1}, Lvs/u2;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object p1

    invoke-static {p1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object p1

    invoke-virtual {v2, p1}, Lt9/u;->e(Lro/i;)V

    invoke-virtual {v2}, Lt9/u;->a()Lts/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "ID requirement must be null."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing HmacPrfKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to HmacPrfProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_0
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.HkdfPrfKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :try_start_1
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/i2;->G(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/i2;

    move-result-object v1

    invoke-virtual {v1}, Lvs/i2;->E()I

    move-result v2

    if-nez v2, :cond_5

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_4

    invoke-static {}, Lts/h;->b()Ls/m2;

    move-result-object p1

    invoke-virtual {v1}, Lvs/i2;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ls/m2;->t(I)V

    invoke-virtual {v1}, Lvs/i2;->D()Lvs/m2;

    move-result-object v2

    invoke-virtual {v2}, Lvs/m2;->C()Lvs/g2;

    move-result-object v2

    invoke-static {v2}, Lus/b;->b(Lvs/g2;)Lts/g;

    move-result-object v2

    iput-object v2, p1, Ls/m2;->x:Ljava/lang/Object;

    invoke-virtual {v1}, Lvs/i2;->D()Lvs/m2;

    move-result-object v2

    invoke-virtual {v2}, Lvs/m2;->D()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v2

    invoke-static {v2}, Lct/a;->a([B)Lct/a;

    move-result-object v2

    iget-object v3, v2, Lct/a;->a:[B

    array-length v3, v3

    if-nez v3, :cond_3

    const/4 v2, 0x0

    iput-object v2, p1, Ls/m2;->y:Ljava/lang/Object;

    goto :goto_0

    :cond_3
    iput-object v2, p1, Ls/m2;->y:Ljava/lang/Object;

    :goto_0
    invoke-virtual {p1}, Ls/m2;->c()Lts/h;

    move-result-object p1

    new-instance v2, Lso/q;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lso/q;-><init>(I)V

    invoke-virtual {v2, p1}, Lso/q;->h(Lts/h;)V

    invoke-virtual {v1}, Lvs/i2;->C()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object p1

    invoke-static {p1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object p1

    invoke-virtual {v2, p1}, Lso/q;->f(Lro/i;)V

    invoke-virtual {v2}, Lso/q;->b()Lts/e;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "ID requirement must be null."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing HkdfPrfKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to HkdfPrfProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_1
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacPrfKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :try_start_2
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/h;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/h;

    move-result-object v1

    invoke-virtual {v1}, Lvs/h;->C()I

    move-result v2

    if-nez v2, :cond_9

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_8

    invoke-virtual {v1}, Lvs/h;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p1

    invoke-static {p1}, Lts/d;->b(I)Lts/d;

    move-result-object p1

    invoke-virtual {v1}, Lvs/h;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    iget v1, p1, Lts/d;->a:I

    invoke-virtual {v0}, Lro/i;->E()I

    move-result v2

    if-ne v1, v2, :cond_7

    new-instance v1, Lts/a;

    invoke-direct {v1, p1, v0}, Lts/a;-><init>(Lts/d;Lro/i;)V

    return-object v1

    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Key size mismatch"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "ID requirement must be null."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesCmacPrfKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesCmacPrfProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method public f(Laa3/i1;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->a(Laa3/i1;)Ltt/d;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/internal/l0;)Lfs/k;
    .locals 3

    iget v0, p0, Lts/b;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/e1;->C(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/e1;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lws/c;->b()Lzt/q;

    move-result-object v1

    invoke-virtual {v0}, Lvs/e1;->A()Lvs/g1;

    move-result-object v2

    invoke-virtual {v2}, Lvs/g1;->F()Lvs/g2;

    move-result-object v2

    invoke-static {v2}, Lxs/b;->e(Lvs/g2;)Lws/b;

    move-result-object v2

    iput-object v2, v1, Lzt/q;->z:Ljava/lang/Object;

    invoke-virtual {v0}, Lvs/e1;->A()Lvs/g1;

    move-result-object v2

    invoke-virtual {v2}, Lvs/g1;->E()Lvs/l1;

    move-result-object v2

    invoke-static {v2}, Lxs/b;->g(Lvs/l1;)Lws/b;

    move-result-object v2

    iput-object v2, v1, Lzt/q;->x:Ljava/lang/Object;

    invoke-virtual {v0}, Lvs/e1;->A()Lvs/g1;

    move-result-object v0

    invoke-virtual {v0}, Lvs/g1;->C()Lvs/d2;

    move-result-object v0

    invoke-static {v0}, Lxs/b;->d(Lvs/d2;)Lws/a;

    move-result-object v0

    iput-object v0, v1, Lzt/q;->y:Ljava/lang/Object;

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lxs/b;->h(Lvs/h4;)Lws/b;

    move-result-object p1

    iput-object p1, v1, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v1}, Lzt/q;->o()Lws/c;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing EcdsaParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to EcdsaProtoSerialization.parseParameters: "

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

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacPrfKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_1
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/w2;->F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/w2;

    move-result-object v0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {v0}, Lvs/w2;->D()I

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    if-ne p1, v1, :cond_1

    invoke-static {}, Lts/k;->b()Lp0/n0;

    move-result-object p1

    invoke-virtual {v0}, Lvs/w2;->B()I

    move-result v1

    invoke-virtual {p1, v1}, Lp0/n0;->l(I)V

    invoke-virtual {v0}, Lvs/w2;->C()Lvs/y2;

    move-result-object v0

    invoke-virtual {v0}, Lvs/y2;->B()Lvs/g2;

    move-result-object v0

    invoke-static {v0}, Lus/c;->b(Lvs/g2;)Lts/g;

    move-result-object v0

    iput-object v0, p1, Lp0/n0;->y:Ljava/lang/Object;

    invoke-virtual {p1}, Lp0/n0;->d()Lts/k;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing HmacPrfParameters failed: only RAW output prefix type is accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Parsing HmacPrfParameters failed: unknown Version "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lvs/w2;->D()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing HmacPrfParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to HmacPrfProtoSerialization.parseParameters: "

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

    const-string v1, "type.googleapis.com/google.crypto.tink.HkdfPrfKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :try_start_2
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/k2;->F(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/k2;

    move-result-object v0
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_2

    invoke-virtual {v0}, Lvs/k2;->D()I

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    if-ne p1, v1, :cond_5

    invoke-static {}, Lts/h;->b()Ls/m2;

    move-result-object p1

    invoke-virtual {v0}, Lvs/k2;->B()I

    move-result v1

    invoke-virtual {p1, v1}, Ls/m2;->t(I)V

    invoke-virtual {v0}, Lvs/k2;->C()Lvs/m2;

    move-result-object v1

    invoke-virtual {v1}, Lvs/m2;->C()Lvs/g2;

    move-result-object v1

    invoke-static {v1}, Lus/b;->b(Lvs/g2;)Lts/g;

    move-result-object v1

    iput-object v1, p1, Ls/m2;->x:Ljava/lang/Object;

    invoke-virtual {v0}, Lvs/k2;->C()Lvs/m2;

    move-result-object v0

    invoke-virtual {v0}, Lvs/m2;->D()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v0

    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    move-result-object v0

    iget-object v1, v0, Lct/a;->a:[B

    array-length v1, v1

    if-nez v1, :cond_4

    const/4 v0, 0x0

    iput-object v0, p1, Ls/m2;->y:Ljava/lang/Object;

    goto :goto_0

    :cond_4
    iput-object v0, p1, Ls/m2;->y:Ljava/lang/Object;

    :goto_0
    invoke-virtual {p1}, Ls/m2;->c()Lts/h;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing HkdfPrfParameters failed: only RAW output prefix type is accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Parsing HkdfPrfParameters failed: unknown Version "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lvs/k2;->D()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_2
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing HkdfPrfParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to HkdfPrfProtoSerialization.parseParameters: "

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

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacPrfKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    :try_start_3
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/j;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/j;

    move-result-object v0
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_3

    invoke-virtual {v0}, Lvs/j;->B()I

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    if-ne p1, v1, :cond_8

    invoke-virtual {v0}, Lvs/j;->A()I

    move-result p1

    invoke-static {p1}, Lts/d;->b(I)Lts/d;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesCmacPrfParameters failed: only RAW output prefix type is accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Parsing AesCmacPrfParameters failed: unknown Version "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lvs/j;->B()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_3
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesCmacPrfParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to AesCmacPrfProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_2
        0xb -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method

.method public h(Lts/o;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lts/b;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast p1, Lws/z;

    invoke-static {p1}, Lat/b0;->a(Lws/z;)Lat/b0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lws/y;

    invoke-static {p1}, Lat/n;->c(Lws/y;)Lat/n;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lws/s;

    invoke-static {p1}, Lat/a0;->a(Lws/s;)Lat/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lws/r;

    invoke-static {p1}, Lat/i;->b(Lws/r;)Lat/i;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lcom/google/crypto/tink/internal/q;

    invoke-static {p1}, Lat/o;->a(Lcom/google/crypto/tink/internal/q;)Lat/o;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lcom/google/crypto/tink/internal/q;

    invoke-static {p1}, Lat/n;->a(Lcom/google/crypto/tink/internal/q;)Lat/n;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lws/k;

    invoke-static {p1}, Lat/o;->b(Lws/k;)Lat/o;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lws/i;

    invoke-static {p1}, Lat/n;->b(Lws/i;)Lat/n;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lws/e;

    invoke-static {p1}, Lat/j;->a(Lws/e;)Lat/j;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lws/d;

    invoke-static {p1}, Lat/i;->a(Lws/d;)Lat/i;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/google/crypto/tink/internal/q;

    invoke-static {p1}, Lts/p;->b(Lcom/google/crypto/tink/internal/q;)Lts/p;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lts/i;

    invoke-static {p1}, Lat/y;->b(Lts/i;)Lat/y;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lts/e;

    iget-object v0, p1, Lts/e;->b:Lts/h;

    invoke-static {v0}, Lts/f;->a(Lts/h;)V

    invoke-static {p1}, Lbt/b;->b(Lts/e;)Lbt/b;

    move-result-object p1

    invoke-static {p1}, Lts/p;->c(Lbt/b;)Lts/p;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lts/e;

    iget-object v0, p1, Lts/e;->b:Lts/h;

    invoke-static {v0}, Lts/f;->a(Lts/h;)V

    invoke-static {p1}, Lbt/b;->b(Lts/e;)Lbt/b;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lts/a;

    iget-object v0, p1, Lts/a;->b:Lts/d;

    iget v0, v0, Lts/d;->a:I

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lat/x;->b(Lts/a;)Lat/x;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Key size must be 32 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
