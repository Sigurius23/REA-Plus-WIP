.class public abstract Lxs/c;
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


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    invoke-static {v1}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v1

    new-instance v2, Lxs/a;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/d0;

    const-class v4, Lws/h;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/d0;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/e0;)V

    sput-object v3, Lxs/c;->a:Lcom/google/crypto/tink/internal/d0;

    new-instance v2, Lxs/a;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/b0;

    invoke-direct {v3, v0, v2}, Lcom/google/crypto/tink/internal/b0;-><init>(Lct/a;Lcom/google/crypto/tink/internal/c0;)V

    sput-object v3, Lxs/c;->b:Lcom/google/crypto/tink/internal/b0;

    new-instance v2, Lxs/a;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/m;

    const-class v4, Lws/k;

    invoke-direct {v3, v4, v2}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v3, Lxs/c;->c:Lcom/google/crypto/tink/internal/m;

    new-instance v2, Lxs/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lxs/a;-><init>(I)V

    new-instance v3, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v3, v1, v2}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v3, Lxs/c;->d:Lcom/google/crypto/tink/internal/k;

    new-instance v1, Lxs/a;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lxs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/m;

    const-class v3, Lws/i;

    invoke-direct {v2, v3, v1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;Lcom/google/crypto/tink/internal/n;)V

    sput-object v2, Lxs/c;->e:Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lxs/a;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lxs/a;-><init>(I)V

    new-instance v2, Lcom/google/crypto/tink/internal/k;

    invoke-direct {v2, v0, v1}, Lcom/google/crypto/tink/internal/k;-><init>(Lct/a;Lcom/google/crypto/tink/internal/l;)V

    sput-object v2, Lxs/c;->f:Lcom/google/crypto/tink/internal/k;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lvs/h4;->E:Lvs/h4;

    sget-object v2, Lws/g;->e:Lws/g;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->y:Lvs/h4;

    sget-object v2, Lws/g;->b:Lws/g;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->F:Lvs/h4;

    sget-object v2, Lws/g;->c:Lws/g;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lvs/h4;->z:Lvs/h4;

    sget-object v2, Lws/g;->d:Lws/g;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lxs/c;->g:Lwe/o;

    return-void
.end method
