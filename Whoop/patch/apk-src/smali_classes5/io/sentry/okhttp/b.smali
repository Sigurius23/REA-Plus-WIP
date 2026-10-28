.class public final synthetic Lio/sentry/okhttp/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/network/d;
.implements Lio/sentry/util/e;
.implements Lj2/i;
.implements Lgt/e;
.implements Lcom/google/crypto/tink/internal/g0;
.implements Lcom/google/crypto/tink/internal/e0;
.implements Lcom/google/crypto/tink/internal/c0;
.implements Lcom/google/crypto/tink/internal/n;
.implements Lcom/google/crypto/tink/internal/l;
.implements Lbh3/g;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lio/sentry/okhttp/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/okhttp/d;)V
    .locals 0

    .line 2
    const/4 p1, 0x0

    iput p1, p0, Lio/sentry/okhttp/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/util/LinkedHashMap;
    .locals 1

    check-cast p1, Lud3/x0;

    const-string v0, "resp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lud3/x0;->F:Lud3/d0;

    invoke-static {p1}, Lio/sentry/okhttp/d;->c(Lud3/d0;)Ljava/util/LinkedHashMap;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lod1/u$a;

    invoke-static {p1}, Lod1/x;->a(Lod1/u$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public c(Lfs/k;)Lcom/google/crypto/tink/internal/l0;
    .locals 3

    iget v0, p0, Lio/sentry/okhttp/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lns/m;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/d3;->B()Lvs/c3;

    move-result-object v1

    invoke-static {p1}, Lns/o;->b(Lns/m;)Lvs/f3;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvs/c3;->g(Lvs/f3;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/d3;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object v1, Lns/o;->g:Lwe/o;

    iget-object p1, p1, Lns/m;->d:Lns/l;

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

    :pswitch_0
    check-cast p1, Lls/d;

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesSivKey"

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-static {}, Lvs/x0;->C()Lvs/w0;

    move-result-object v1

    iget v2, p1, Lls/d;->a:I

    invoke-virtual {v1, v2}, Lvs/w0;->g(I)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/x0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lls/d;->b:Lls/c;

    invoke-static {p1}, Lms/a;->a(Lls/c;)Lvs/h4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lts/o;)Lcom/google/crypto/tink/internal/k0;
    .locals 4

    iget v0, p0, Lio/sentry/okhttp/b;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lns/n;

    invoke-static {}, Lvs/h3;->G()Lvs/g3;

    move-result-object v0

    invoke-virtual {v0}, Lvs/g3;->i()V

    iget-object v1, p1, Lns/n;->b:Lns/p;

    invoke-static {v1}, Lns/o;->c(Lns/p;)Lvs/j3;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/g3;->h(Lvs/j3;)V

    iget-object v1, p1, Lns/n;->c:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/g3;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/h3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Lns/o;->g:Lwe/o;

    iget-object v2, p1, Lns/n;->b:Lns/p;

    iget-object v2, v2, Lns/p;->b:Lns/m;

    iget-object v2, v2, Lns/m;->d:Lns/l;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    invoke-virtual {p1}, Lgs/b;->z()Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    sget-object v3, Lvs/l3;->z:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lns/p;

    invoke-static {p1}, Lns/o;->c(Lns/p;)Lvs/j3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    sget-object v1, Lns/o;->g:Lwe/o;

    iget-object v2, p1, Lns/p;->b:Lns/m;

    iget-object v2, v2, Lns/m;->d:Lns/l;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/h4;

    iget-object p1, p1, Lns/p;->e:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.HpkePublicKey"

    sget-object v3, Lvs/l3;->E:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lls/a;

    invoke-static {}, Lvs/v0;->D()Lvs/u0;

    move-result-object v0

    iget-object v1, p1, Lls/a;->b:Lro/i;

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {v1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/u0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/v0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iget-object v1, p1, Lls/a;->a:Lls/d;

    iget-object v1, v1, Lls/d;->b:Lls/c;

    invoke-static {v1}, Lms/a;->a(Lls/c;)Lvs/h4;

    move-result-object v1

    iget-object p1, p1, Lls/a;->d:Ljava/lang/Integer;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesSivKey"

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-static {v2, v0, v3, v1, p1}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Lcom/google/crypto/tink/internal/k0;)Lts/o;
    .locals 6

    iget v0, p0, Lio/sentry/okhttp/b;->w:I

    sparse-switch v0, :sswitch_data_0

    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_0
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/h3;->H(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/h3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/h3;->F()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lvs/h3;->E()Lvs/j3;

    move-result-object v2

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-virtual {v2}, Lvs/j3;->E()Lvs/f3;

    move-result-object v4

    invoke-static {v3, v4}, Lns/o;->a(Lvs/h4;Lvs/f3;)Lns/m;

    move-result-object v3

    iget-object v4, v3, Lns/m;->a:Lns/k;

    invoke-virtual {v2}, Lvs/j3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v4}, Los/d;->b(Lns/k;)I

    move-result v5

    invoke-static {v5, v2}, Lcom/google/crypto/tink/internal/a;->w(ILjava/math/BigInteger;)[B

    move-result-object v2

    invoke-static {v2}, Lct/a;->a([B)Lct/a;

    move-result-object v2

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v3, v2, p1}, Lns/p;->Y(Lns/m;Lct/a;Ljava/lang/Integer;)Lns/p;

    move-result-object p1

    invoke-virtual {v1}, Lvs/h3;->D()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v4}, Los/d;->a(Lns/k;)I

    move-result v2

    invoke-static {v2, v1}, Lcom/google/crypto/tink/internal/a;->w(ILjava/math/BigInteger;)[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-static {p1, v0}, Lns/n;->Y(Lns/p;Lro/i;)Lns/n;

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

    const-string v0, "Parsing HpkePrivateKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_0
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.HpkePublicKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_1
    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/j3;->I(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/j3;

    move-result-object v0

    invoke-virtual {v0}, Lvs/j3;->G()I

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v1, Lvs/h4;

    invoke-virtual {v0}, Lvs/j3;->E()Lvs/f3;

    move-result-object v2

    invoke-static {v1, v2}, Lns/o;->a(Lvs/h4;Lvs/f3;)Lns/m;

    move-result-object v1

    iget-object v2, v1, Lns/m;->a:Lns/k;

    invoke-virtual {v0}, Lvs/j3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v2}, Los/d;->b(Lns/k;)I

    move-result v2

    invoke-static {v2, v0}, Lcom/google/crypto/tink/internal/a;->w(ILjava/math/BigInteger;)[B

    move-result-object v0

    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    move-result-object v0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v1, v0, p1}, Lns/p;->Y(Lns/m;Lct/a;Ljava/lang/Integer;)Lns/p;

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

    const-string v0, "Parsing HpkePublicKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_1
    sget-object v0, Lfs/p;->a:Lfs/p;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesSivKey"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    :try_start_2
    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/v0;->E(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/v0;

    move-result-object v1

    invoke-virtual {v1}, Lvs/v0;->C()I

    move-result v2

    if-nez v2, :cond_4

    invoke-static {}, Lls/d;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v2

    invoke-virtual {v1}, Lvs/v0;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    iget-object v3, p1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v3, Lvs/h4;

    invoke-static {v3}, Lms/a;->b(Lvs/h4;)Lls/c;

    move-result-object v3

    iput-object v3, v2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/google/crypto/tink/internal/l0;->D()Lls/d;

    move-result-object v2

    new-instance v3, Lgm/r;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lgm/r;-><init>(I)V

    invoke-virtual {v3, v2}, Lgm/r;->U(Lls/d;)V

    invoke-virtual {v1}, Lvs/v0;->B()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    invoke-static {v1, v0}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-virtual {v3, v0}, Lgm/r;->Q(Lro/i;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {v3, p1}, Lgm/r;->P(Ljava/lang/Integer;)V

    invoke-virtual {v3}, Lgm/r;->z()Lls/a;

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

    const-string v0, "Parsing AesSivKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesSivParameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public f(Laa3/i1;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/sentry/okhttp/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->a(Laa3/i1;)Ldm/e;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->b(Laa3/i1;)Ldm/e;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lcom/google/firebase/datatransport/TransportRegistrar;->c(Laa3/i1;)Ldm/e;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lcom/google/crypto/tink/internal/l0;)Lfs/k;
    .locals 3

    iget v0, p0, Lio/sentry/okhttp/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/d3;->C(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/d3;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-virtual {v0}, Lvs/d3;->A()Lvs/f3;

    move-result-object v0

    invoke-static {p1, v0}, Lns/o;->a(Lvs/h4;Lvs/f3;)Lns/m;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing HpkeParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to HpkeProtoSerialization.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesSivKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/x0;->D(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvs/x0;

    move-result-object v0

    invoke-virtual {v0}, Lvs/x0;->B()I

    move-result v1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v1, :cond_1

    invoke-static {}, Lls/d;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v1

    invoke-virtual {v0}, Lvs/x0;->A()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    invoke-static {p1}, Lms/a;->b(Lvs/h4;)Lls/c;

    move-result-object p1

    iput-object p1, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/l0;->D()Lls/d;

    move-result-object p1

    return-object p1

    :cond_1
    :try_start_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesSivParameters failed: "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong type URL in call to AesSivParameters.parseParameters: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lev/n;->m(Lvs/p3;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lts/o;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/sentry/okhttp/b;->w:I

    sparse-switch v0, :sswitch_data_0

    check-cast p1, Lcom/google/crypto/tink/internal/q;

    invoke-static {p1}, Lns/s;->a(Lcom/google/crypto/tink/internal/q;)Lns/s;

    move-result-object p1

    return-object p1

    :sswitch_0
    check-cast p1, Lcom/google/crypto/tink/internal/q;

    invoke-static {p1}, Lat/k;->a(Lcom/google/crypto/tink/internal/q;)Lat/k;

    move-result-object p1

    return-object p1

    :sswitch_1
    check-cast p1, Lns/h;

    invoke-static {p1}, Lat/l;->a(Lns/h;)Lat/l;

    move-result-object p1

    return-object p1

    :sswitch_2
    check-cast p1, Lns/g;

    invoke-static {p1}, Lat/k;->b(Lns/g;)Lat/k;

    move-result-object p1

    return-object p1

    :sswitch_3
    check-cast p1, Lcom/google/crypto/tink/internal/q;

    invoke-static {p1}, Lls/f;->c(Lcom/google/crypto/tink/internal/q;)Lls/f;

    move-result-object p1

    return-object p1

    :sswitch_4
    check-cast p1, Lls/a;

    iget-object v0, p1, Lls/a;->a:Lls/d;

    invoke-static {v0}, Lls/b;->a(Lls/d;)V

    invoke-static {p1}, Lat/f;->c(Lls/a;)Lat/f;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_4
        0xd -> :sswitch_3
        0x12 -> :sswitch_2
        0x13 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public i(D)D
    .locals 11

    iget v0, p0, Lio/sentry/okhttp/b;->w:I

    const-wide/16 v1, 0x0

    const-wide v3, 0x3fb3d0722149b580L    # 0.07739938080495357

    const-wide v5, 0x3faab1232f514a03L    # 0.05213270142180095

    const-wide v7, 0x3fee54edcd0aeb60L    # 0.9478672985781991

    packed-switch v0, :pswitch_data_0

    return-wide p1

    :pswitch_0
    sget-object v0, Lj2/d;->a:[F

    sget-object v0, Lj2/d;->d:Lj2/r;

    invoke-static {v0, p1, p2}, Lj2/d;->c(Lj2/r;D)D

    move-result-wide p1

    return-wide p1

    :pswitch_1
    sget-object v0, Lj2/d;->a:[F

    sget-object v0, Lj2/d;->d:Lj2/r;

    invoke-static {v0, p1, p2}, Lj2/d;->d(Lj2/r;D)D

    move-result-wide p1

    return-wide p1

    :pswitch_2
    sget-object v0, Lj2/d;->a:[F

    sget-object v0, Lj2/d;->c:Lj2/r;

    invoke-static {v0, p1, p2}, Lj2/d;->a(Lj2/r;D)D

    move-result-wide p1

    return-wide p1

    :pswitch_3
    sget-object v0, Lj2/d;->a:[F

    sget-object v0, Lj2/d;->c:Lj2/r;

    invoke-static {v0, p1, p2}, Lj2/d;->b(Lj2/r;D)D

    move-result-wide p1

    return-wide p1

    :pswitch_4
    cmpg-double v0, p1, v1

    if-gez v0, :cond_0

    neg-double v0, p1

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    const-wide v9, 0x3fa4b5dcc63f1412L    # 0.04045

    cmpl-double v2, v0, v9

    if-ltz v2, :cond_1

    mul-double/2addr v7, v0

    add-double/2addr v7, v5

    const-wide v0, 0x4003333333333333L    # 2.4

    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    goto :goto_1

    :cond_1
    mul-double/2addr v0, v3

    :goto_1
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->copySign(DD)D

    move-result-wide p1

    return-wide p1

    :pswitch_5
    cmpg-double v0, p1, v1

    if-gez v0, :cond_2

    neg-double v0, p1

    goto :goto_2

    :cond_2
    move-wide v0, p1

    :goto_2
    const-wide v9, 0x3f69a5c61c57a063L    # 0.0031308049535603718

    cmpl-double v2, v0, v9

    if-ltz v2, :cond_3

    const-wide v2, 0x3fdaaaaaaaaaaaabL    # 0.4166666666666667

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    sub-double/2addr v0, v5

    div-double/2addr v0, v7

    goto :goto_3

    :cond_3
    div-double/2addr v0, v3

    :goto_3
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->copySign(DD)D

    move-result-wide p1

    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lq83/g;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/Object;
    .locals 6

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v1

    invoke-virtual {v1}, Lzt/q;->I()V

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lzt/q;->K(I)V

    invoke-virtual {v1}, Lzt/q;->L()V

    sget-object v3, Lgs/j;->p:Lgs/j;

    iput-object v3, v1, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v1}, Lzt/q;->j()Lgs/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lgs/q;->b()Lzt/q;

    move-result-object v1

    invoke-virtual {v1}, Lzt/q;->I()V

    const/16 v4, 0x20

    invoke-virtual {v1, v4}, Lzt/q;->K(I)V

    invoke-virtual {v1}, Lzt/q;->L()V

    iput-object v3, v1, Lzt/q;->E:Ljava/lang/Object;

    invoke-virtual {v1}, Lzt/q;->j()Lgs/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v1, v4}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    sget-object v3, Lgs/j;->e:Lgs/j;

    iput-object v3, v1, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    sget-object v5, Lgs/j;->j:Lgs/j;

    iput-object v5, v1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lgs/k;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/google/crypto/tink/internal/k0;->M(I)V

    invoke-virtual {v1, v4}, Lcom/google/crypto/tink/internal/k0;->P(I)V

    invoke-virtual {v1, v4}, Lcom/google/crypto/tink/internal/k0;->S(I)V

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/k0;->Q(I)V

    iput-object v3, v1, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    iput-object v5, v1, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/k0;->f()Lgs/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v1, Lgs/k0;

    sget-object v2, Lgs/j;->y:Lgs/j;

    invoke-direct {v1, v2}, Lgs/k0;-><init>(Lgs/j;)V

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lls/d;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v1

    const/16 v2, 0x40

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    sget-object v2, Lls/c;->d:Lls/c;

    iput-object v2, v1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/l0;->D()Lls/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
