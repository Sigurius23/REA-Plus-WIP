.class public abstract Lgs/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/d0;

.field public static final b:Lcom/google/crypto/tink/internal/b0;

.field public static final c:Lcom/google/crypto/tink/internal/m;

.field public static final d:Lcom/google/crypto/tink/internal/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    new-instance v1, Lb23/h;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lb23/h;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/d0;

    const-class v3, Lgs/f0;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v2, Lgs/g0;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v1, Lb23/h;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lb23/h;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v2, Lgs/g0;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v1, Lb23/h;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lb23/h;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lgs/e0;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lgs/g0;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lb23/h;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lb23/h;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lgs/g0;->d:Lcom/google/crypto/tink/internal/k;

    return-void
.end method

.method public static a(Lvs/g4;Lvs/h4;)Lgs/f0;
    .locals 5

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    invoke-virtual {p0}, Lvs/g4;->C()Lvs/p3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-virtual {p0}, Lvs/g4;->C()Lvs/p3;

    move-result-object v1

    invoke-virtual {v1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    invoke-virtual {v0, v1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/p3;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object v0

    invoke-static {v0}, Lfs/b;->b([B)Lfs/k;

    move-result-object v0

    instance-of v1, v0, Lgs/q;

    if-eqz v1, :cond_0

    sget-object v1, Lgs/b0;->e:Lgs/b0;

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lgs/w;

    if-eqz v1, :cond_1

    sget-object v1, Lgs/b0;->g:Lgs/b0;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lgs/k0;

    if-eqz v1, :cond_2

    sget-object v1, Lgs/b0;->f:Lgs/b0;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lgs/k;

    if-eqz v1, :cond_3

    sget-object v1, Lgs/b0;->h:Lgs/b0;

    goto :goto_0

    :cond_3
    instance-of v1, v0, Lgs/n;

    if-eqz v1, :cond_4

    sget-object v1, Lgs/b0;->i:Lgs/b0;

    goto :goto_0

    :cond_4
    instance-of v1, v0, Lgs/t;

    if-eqz v1, :cond_7

    sget-object v1, Lgs/b0;->j:Lgs/b0;

    :goto_0
    new-instance v2, La00/g;

    const/16 v3, 0xb

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, La00/g;-><init>(IZ)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_6

    const/4 v4, 0x3

    if-ne v3, v4, :cond_5

    sget-object p1, Lgs/b0;->l:Lgs/b0;

    goto :goto_1

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to parse OutputPrefixType: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lvs/h4;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    sget-object p1, Lgs/b0;->k:Lgs/b0;

    :goto_1
    invoke-virtual {v2, p1}, La00/g;->M(Lgs/b0;)V

    invoke-virtual {p0}, Lvs/g4;->D()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, La00/g;->J(Ljava/lang/String;)V

    check-cast v0, Lgs/d;

    invoke-virtual {v2, v0}, La00/g;->E(Lgs/d;)V

    invoke-virtual {v2, v1}, La00/g;->F(Lgs/b0;)V

    invoke-virtual {v2}, La00/g;->g()Lgs/f0;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported DEK parameters when parsing "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lgs/f0;)Lvs/g4;
    .locals 2

    iget-object v0, p0, Lgs/f0;->d:Lgs/d;

    invoke-static {v0}, Lfs/b;->c(Lfs/k;)[B

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvs/p3;->I([BLcom/google/crypto/tink/shaded/protobuf/p;)Lvs/p3;

    move-result-object v0

    invoke-static {}, Lvs/g4;->E()Lvs/f4;

    move-result-object v1

    iget-object p0, p0, Lgs/f0;->b:Ljava/lang/String;

    invoke-virtual {v1, p0}, Lvs/f4;->h(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lvs/f4;->g(Lvs/p3;)V

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/g4;
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing KmsEnvelopeAeadKeyFormat failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static c(Lgs/b0;)Lvs/h4;
    .locals 3

    sget-object v0, Lgs/b0;->k:Lgs/b0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lvs/h4;->y:Lvs/h4;

    return-object p0

    :cond_0
    sget-object v0, Lgs/b0;->l:Lgs/b0;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lvs/h4;->E:Lvs/h4;

    return-object p0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to serialize variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
