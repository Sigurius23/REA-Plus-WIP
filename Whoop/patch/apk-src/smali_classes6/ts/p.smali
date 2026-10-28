.class public final Lts/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lts/m;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lts/p;->a:I

    iput-object p1, p0, Lts/p;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lts/m;I)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lts/p;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lts/p;->b:Ljava/lang/Object;

    return-void
.end method

.method public static b(Lcom/google/crypto/tink/internal/q;)Lts/p;
    .locals 2

    iget-object p0, p0, Lcom/google/crypto/tink/internal/q;->a:Lcom/google/crypto/tink/internal/k0;

    invoke-static {p0}, Lcom/google/crypto/tink/internal/q;->V(Lcom/google/crypto/tink/internal/k0;)V

    invoke-static {}, Lvs/m3;->G()Lvs/k3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lvs/k3;->h(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-virtual {v0, v1}, Lvs/k3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast p0, Lvs/l3;

    invoke-virtual {v0, p0}, Lvs/k3;->g(Lvs/l3;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p0

    check-cast p0, Lvs/m3;

    new-instance v0, Lts/p;

    const-class v1, Lts/m;

    invoke-static {p0, v1}, Lfs/o;->a(Lvs/m3;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lts/m;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lts/p;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static c(Lbt/b;)Lts/p;
    .locals 2

    new-instance v0, Lts/p;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lts/p;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public final a(I[B)[B
    .locals 3

    iget v0, p0, Lts/p;->a:I

    packed-switch v0, :pswitch_data_0

    if-lez p1, :cond_2

    iget-object v0, p0, Lts/p;->b:Ljava/lang/Object;

    check-cast v0, Lbt/b;

    new-instance v1, Lbt/a;

    invoke-direct {v1, v0, p2}, Lbt/a;-><init>(Lbt/b;[B)V

    :try_start_0
    new-array p2, p1, [B

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    sub-int v2, p1, v0

    invoke-virtual {v1, p2, v0, v2}, Lbt/a;->read([BII)I

    move-result v2

    if-lez v2, :cond_0

    add-int/2addr v0, v2

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Provided StreamingPrf terminated before providing requested number of bytes."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    return-object p2

    :goto_1
    new-instance p2, Ljava/security/GeneralSecurityException;

    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid outputLength specified."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lts/p;->b:Ljava/lang/Object;

    check-cast v0, Lts/m;

    invoke-interface {v0, p1, p2}, Lts/m;->a(I[B)[B

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lts/p;->b:Ljava/lang/Object;

    check-cast v0, Lts/m;

    invoke-interface {v0, p1, p2}, Lts/m;->a(I[B)[B

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
