.class public abstract Los/b;
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

.field public static final i:Lwe/o;

.field public static final j:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"

    invoke-static {v1}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v1

    new-instance v2, Los/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Los/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/d0;

    const-class v4, Lns/f;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v3, Los/b;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v2, Los/a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Los/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v3, v0, v2}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v3, Los/b;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v2, Los/a;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Los/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/m;

    const-class v4, Lns/h;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v3, Los/b;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v2, Los/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Los/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v3, v1, v2}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v3, Los/b;->d:Lcom/google/crypto/tink/internal/k;

    new-instance v1, Los/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Los/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lns/g;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Los/b;->e:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Los/a;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Los/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Los/b;->f:Lcom/google/crypto/tink/internal/k;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    sget-object v2, Lns/e;->d:Lns/e;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->y:Lvs/h4;

    sget-object v2, Lns/e;->b:Lns/e;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->z:Lvs/h4;

    sget-object v2, Lns/e;->c:Lns/e;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->F:Lvs/h4;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Los/b;->g:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/g2;->y:Lvs/g2;

    sget-object v2, Lns/c;->b:Lns/c;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/g2;->G:Lvs/g2;

    sget-object v2, Lns/c;->c:Lns/c;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/g2;->E:Lvs/g2;

    sget-object v2, Lns/c;->d:Lns/c;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/g2;->z:Lvs/g2;

    sget-object v2, Lns/c;->e:Lns/c;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/g2;->F:Lvs/g2;

    sget-object v2, Lns/c;->f:Lns/c;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Los/b;->h:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/d2;->y:Lvs/d2;

    sget-object v2, Lns/b;->b:Lns/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/d2;->z:Lvs/d2;

    sget-object v2, Lns/b;->c:Lns/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/d2;->E:Lvs/d2;

    sget-object v2, Lns/b;->d:Lns/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/d2;->F:Lvs/d2;

    sget-object v2, Lns/b;->e:Lns/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Los/b;->i:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/c1;->y:Lvs/c1;

    sget-object v2, Lns/d;->c:Lns/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/c1;->z:Lvs/c1;

    sget-object v2, Lns/d;->b:Lns/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/c1;->E:Lvs/c1;

    sget-object v2, Lns/d;->d:Lns/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Los/b;->j:Lwe/o;

    return-void
.end method

.method public static a(Lvs/h4;Lvs/r1;)Lns/f;
    .locals 3

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    invoke-virtual {p1}, Lvs/r1;->D()Lvs/n1;

    move-result-object v1

    invoke-virtual {v1}, Lvs/n1;->A()Lvs/p3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    invoke-virtual {v0, v1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {p1}, Lvs/r1;->D()Lvs/n1;

    move-result-object v1

    invoke-virtual {v1}, Lvs/n1;->A()Lvs/p3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/p3;

    invoke-static {}, Lns/f;->b()Lcom/google/crypto/tink/internal/k0;

    move-result-object v1

    sget-object v2, Los/b;->g:Lwe/o;

    invoke-virtual {v2, p0}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lns/e;

    iput-object p0, v1, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    invoke-virtual {p1}, Lvs/r1;->F()Lvs/x1;

    move-result-object p0

    invoke-virtual {p0}, Lvs/x1;->C()Lvs/d2;

    move-result-object p0

    sget-object v2, Los/b;->i:Lwe/o;

    invoke-virtual {v2, p0}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lns/b;

    iput-object p0, v1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    invoke-virtual {p1}, Lvs/r1;->F()Lvs/x1;

    move-result-object p0

    invoke-virtual {p0}, Lvs/x1;->E()Lvs/g2;

    move-result-object p0

    sget-object v2, Los/b;->h:Lwe/o;

    invoke-virtual {v2, p0}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lns/c;

    iput-object p0, v1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object p0

    invoke-static {p0}, Lfs/b;->b([B)Lfs/k;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/crypto/tink/internal/k0;->O(Lfs/k;)V

    invoke-virtual {p1}, Lvs/r1;->F()Lvs/x1;

    move-result-object p0

    invoke-virtual {p0}, Lvs/x1;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object p0

    invoke-static {p0}, Lct/a;->a([B)Lct/a;

    move-result-object p0

    iget-object v0, p0, Lct/a;->a:[B

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    iput-object p0, v1, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p0, v1, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    :goto_0
    invoke-virtual {p1}, Lvs/r1;->F()Lvs/x1;

    move-result-object p0

    invoke-virtual {p0}, Lvs/x1;->C()Lvs/d2;

    move-result-object p0

    sget-object v0, Lvs/d2;->F:Lvs/d2;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    sget-object p0, Los/b;->j:Lwe/o;

    invoke-virtual {p1}, Lvs/r1;->E()Lvs/c1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwe/o;->F(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lns/d;

    iput-object p0, v1, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lvs/r1;->E()Lvs/c1;

    move-result-object p0

    sget-object p1, Lvs/c1;->z:Lvs/c1;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :goto_1
    invoke-virtual {v1}, Lcom/google/crypto/tink/internal/k0;->j()Lns/f;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For CURVE25519 EcPointFormat must be compressed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lns/b;)I
    .locals 3

    sget-object v0, Lns/b;->b:Lns/b;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0x21

    return p0

    :cond_0
    sget-object v0, Lns/b;->c:Lns/b;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p0, 0x31

    return p0

    :cond_1
    sget-object v0, Lns/b;->d:Lns/b;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p0, 0x43

    return p0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to serialize CurveType "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Lns/f;)Lvs/r1;
    .locals 5

    invoke-static {}, Lvs/x1;->G()Lvs/w1;

    move-result-object v0

    sget-object v1, Los/b;->i:Lwe/o;

    iget-object v2, p0, Lns/f;->a:Lns/b;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/d2;

    invoke-virtual {v0, v1}, Lvs/w1;->g(Lvs/d2;)V

    sget-object v1, Los/b;->h:Lwe/o;

    iget-object v2, p0, Lns/f;->b:Lns/c;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lvs/g2;

    invoke-virtual {v0, v1}, Lvs/w1;->h(Lvs/g2;)V

    iget-object v1, p0, Lns/f;->f:Lct/a;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lct/a;->a:[B

    array-length v2, v2

    if-lez v2, :cond_0

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/w1;->i(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    :cond_0
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/x1;

    :try_start_0
    iget-object v1, p0, Lns/f;->e:Lfs/k;

    invoke-static {v1}, Lfs/b;->c(Lfs/k;)[B

    move-result-object v1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v2

    invoke-static {v1, v2}, Lvs/p3;->I([BLcom/google/crypto/tink/shaded/protobuf/p;)Lvs/p3;

    move-result-object v1

    invoke-static {}, Lvs/n1;->C()Lvs/m1;

    move-result-object v2

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v3

    invoke-virtual {v1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lvs/o3;->h(Ljava/lang/String;)V

    sget-object v4, Lvs/h4;->y:Lvs/h4;

    invoke-virtual {v3, v4}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v3, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/p3;

    invoke-virtual {v2, v1}, Lvs/m1;->g(Lvs/p3;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v1

    check-cast v1, Lvs/n1;
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p0, p0, Lns/f;->c:Lns/d;

    if-nez p0, :cond_1

    sget-object p0, Lns/d;->b:Lns/d;

    :cond_1
    invoke-static {}, Lvs/r1;->G()Lvs/q1;

    move-result-object v2

    invoke-virtual {v2, v0}, Lvs/q1;->i(Lvs/x1;)V

    invoke-virtual {v2, v1}, Lvs/q1;->g(Lvs/n1;)V

    sget-object v0, Los/b;->j:Lwe/o;

    invoke-virtual {v0, p0}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvs/c1;

    invoke-virtual {v2, p0}, Lvs/q1;->h(Lvs/c1;)V

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/r1;

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing EciesParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static d(Lns/h;)Lvs/v1;
    .locals 5

    iget-object v0, p0, Lns/h;->b:Lns/f;

    iget-object v1, v0, Lns/f;->a:Lns/b;

    sget-object v2, Lns/b;->e:Lns/b;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lvs/v1;->J()Lvs/u1;

    move-result-object v1

    invoke-virtual {v1}, Lvs/u1;->h()V

    invoke-static {v0}, Los/b;->c(Lns/f;)Lvs/r1;

    move-result-object v0

    invoke-virtual {v1, v0}, Lvs/u1;->g(Lvs/r1;)V

    iget-object p0, p0, Lns/h;->d:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    array-length v0, p0

    invoke-static {p0, v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v1, p0}, Lvs/u1;->i(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    sget-object p0, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1, p0}, Lvs/u1;->j(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/v1;

    return-object p0

    :cond_0
    iget-object v1, v0, Lns/f;->a:Lns/b;

    invoke-static {v1}, Los/b;->b(Lns/b;)I

    move-result v1

    iget-object p0, p0, Lns/h;->c:Ljava/security/spec/ECPoint;

    if-eqz p0, :cond_1

    invoke-static {}, Lvs/v1;->J()Lvs/u1;

    move-result-object v3

    invoke-virtual {v3}, Lvs/u1;->h()V

    invoke-static {v0}, Los/b;->c(Lns/f;)Lvs/r1;

    move-result-object v0

    invoke-virtual {v3, v0}, Lvs/u1;->g(Lvs/r1;)V

    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/crypto/tink/internal/a;->w(ILjava/math/BigInteger;)[B

    move-result-object v0

    array-length v4, v0

    invoke-static {v0, v2, v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v3, v0}, Lvs/u1;->i(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/google/crypto/tink/internal/a;->w(ILjava/math/BigInteger;)[B

    move-result-object p0

    array-length v0, p0

    invoke-static {p0, v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v3, p0}, Lvs/u1;->j(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/v1;

    return-object p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "NistCurvePoint was null for NIST curve"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
