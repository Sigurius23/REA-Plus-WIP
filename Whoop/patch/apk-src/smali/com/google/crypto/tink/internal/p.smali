.class public Lcom/google/crypto/tink/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Class;

.field public final c:Lvs/l3;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/p;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/crypto/tink/internal/p;->b:Ljava/lang/Class;

    iput-object p3, p0, Lcom/google/crypto/tink/internal/p;->c:Lvs/l3;

    return-void
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/String;)Lcom/google/crypto/tink/internal/o;
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/internal/o;

    sget-object v1, Lvs/l3;->z:Lvs/l3;

    invoke-direct {v0, p1, p0, v1}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lcom/google/crypto/tink/shaded/protobuf/i;)Lvs/m3;
    .locals 2

    invoke-static {}, Lvs/p3;->G()Lvs/o3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/p;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lvs/o3;->h(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lvs/o3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    sget-object p1, Lvs/h4;->E:Lvs/h4;

    invoke-virtual {v0, p1}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-static {p1}, Lcom/google/crypto/tink/internal/l0;->F(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;

    move-result-object p1

    sget-object v0, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/z;->b(Lcom/google/crypto/tink/internal/l0;)Lfs/k;

    move-result-object p1

    sget-object v1, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/t;->b(Lfs/k;)Lts/o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/z;->g(Lts/o;)Lcom/google/crypto/tink/internal/n0;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/internal/k0;

    invoke-static {}, Lvs/m3;->G()Lvs/k3;

    move-result-object v0

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lvs/k3;->h(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-virtual {v0, v1}, Lvs/k3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p1, p1, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast p1, Lvs/l3;

    invoke-virtual {v0, p1}, Lvs/k3;->g(Lvs/l3;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/m3;

    return-object p1
.end method
