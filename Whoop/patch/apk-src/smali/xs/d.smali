.class public abstract Lxs/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/d0;

.field public static final b:Lcom/google/crypto/tink/internal/b0;

.field public static final c:Lcom/google/crypto/tink/internal/m;

.field public static final d:Lcom/google/crypto/tink/internal/k;

.field public static final e:Lcom/google/crypto/tink/internal/m;

.field public static final f:Lcom/google/crypto/tink/internal/k;

.field public static final g:Lwe/o;

.field public static final h:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    invoke-static {v1}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v1

    new-instance v2, Lxs/a;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/d0;

    const-class v4, Lws/q;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v3, Lxs/d;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v2, Lxs/a;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v3, v0, v2}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v3, Lxs/d;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v2, Lxs/a;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/m;

    const-class v4, Lws/s;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v3, Lxs/d;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v2, Lxs/a;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v3, v1, v2}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v3, Lxs/d;->d:Lcom/google/crypto/tink/internal/k;

    new-instance v1, Lxs/a;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lxs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lws/r;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lxs/d;->e:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lxs/a;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lxs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lxs/d;->f:Lcom/google/crypto/tink/internal/k;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    sget-object v2, Lws/p;->e:Lws/p;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->y:Lvs/h4;

    sget-object v2, Lws/p;->b:Lws/p;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->F:Lvs/h4;

    sget-object v2, Lws/p;->c:Lws/p;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->z:Lvs/h4;

    sget-object v2, Lws/p;->d:Lws/p;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lxs/d;->g:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/g2;->E:Lvs/g2;

    sget-object v2, Lws/o;->b:Lws/o;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/g2;->z:Lvs/g2;

    sget-object v2, Lws/o;->c:Lws/o;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/g2;->F:Lvs/g2;

    sget-object v2, Lws/o;->d:Lws/o;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lxs/d;->h:Lwe/o;

    return-void
.end method

.method public static a(Lcom/google/crypto/tink/shaded/protobuf/i;)Lro/i;
    .locals 0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 2

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a;->v(Ljava/math/BigInteger;)[B

    move-result-object p0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lws/s;)Lvs/q4;
    .locals 4

    invoke-static {}, Lvs/q4;->I()Lvs/p4;

    move-result-object v0

    iget-object v1, p0, Lws/s;->b:Lws/q;

    invoke-static {}, Lvs/m4;->C()Lvs/l4;

    move-result-object v2

    sget-object v3, Lxs/d;->h:Lwe/o;

    iget-object v1, v1, Lws/q;->d:Lws/o;

    invoke-virtual {v3, v1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/g2;

    invoke-virtual {v2, v1}, Lvs/l4;->g(Lvs/g2;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/m4;

    invoke-virtual {v0, v1}, Lvs/p4;->i(Lvs/m4;)V

    iget-object v1, p0, Lws/s;->c:Ljava/math/BigInteger;

    invoke-static {v1}, Lxs/d;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/p4;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object p0, p0, Lws/s;->b:Lws/q;

    iget-object p0, p0, Lws/q;->b:Ljava/math/BigInteger;

    invoke-static {p0}, Lxs/d;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvs/p4;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/q4;

    return-object p0
.end method
