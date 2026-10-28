.class public abstract Lxs/e;
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

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    invoke-static {v1}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v1

    new-instance v2, Lxs/a;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/d0;

    const-class v4, Lws/x;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v3, Lxs/e;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v2, Lxs/a;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v3, v0, v2}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v3, Lxs/e;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v2, Lxs/a;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/m;

    const-class v4, Lws/z;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v3, Lxs/e;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v2, Lxs/a;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v3, v1, v2}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v3, Lxs/e;->d:Lcom/google/crypto/tink/internal/k;

    new-instance v1, Lxs/a;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lxs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lws/y;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lxs/e;->e:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lxs/a;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Lxs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lxs/e;->f:Lcom/google/crypto/tink/internal/k;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    sget-object v2, Lws/w;->e:Lws/w;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->y:Lvs/h4;

    sget-object v2, Lws/w;->b:Lws/w;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->F:Lvs/h4;

    sget-object v2, Lws/w;->c:Lws/w;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->z:Lvs/h4;

    sget-object v2, Lws/w;->d:Lws/w;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lxs/e;->g:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/g2;->E:Lvs/g2;

    sget-object v2, Lws/v;->b:Lws/v;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/g2;->z:Lvs/g2;

    sget-object v2, Lws/v;->c:Lws/v;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/g2;->F:Lvs/g2;

    sget-object v2, Lws/v;->d:Lws/v;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lxs/e;->h:Lwe/o;

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

.method public static c(Lws/x;)Lvs/u4;
    .locals 3

    invoke-static {}, Lvs/u4;->G()Lvs/t4;

    move-result-object v0

    iget-object v1, p0, Lws/x;->d:Lws/v;

    sget-object v2, Lxs/e;->h:Lwe/o;

    invoke-virtual {v2, v1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/g2;

    invoke-virtual {v0, v1}, Lvs/t4;->i(Lvs/g2;)V

    iget-object v1, p0, Lws/x;->e:Lws/v;

    invoke-virtual {v2, v1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/g2;

    invoke-virtual {v0, v1}, Lvs/t4;->g(Lvs/g2;)V

    iget p0, p0, Lws/x;->f:I

    invoke-virtual {v0, p0}, Lvs/t4;->h(I)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/u4;

    return-object p0
.end method

.method public static d(Lws/z;)Lvs/y4;
    .locals 2

    invoke-static {}, Lvs/y4;->J()Lvs/x4;

    move-result-object v0

    iget-object v1, p0, Lws/z;->b:Lws/x;

    invoke-static {v1}, Lxs/e;->c(Lws/x;)Lvs/u4;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/x4;->i(Lvs/u4;)V

    iget-object v1, p0, Lws/z;->c:Ljava/math/BigInteger;

    invoke-static {v1}, Lxs/e;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/x4;->h(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    iget-object p0, p0, Lws/z;->b:Lws/x;

    iget-object p0, p0, Lws/x;->b:Ljava/math/BigInteger;

    invoke-static {p0}, Lxs/e;->b(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvs/x4;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {v0}, Lvs/x4;->j()V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/y4;

    return-object p0
.end method
