.class public final Lcom/google/crypto/tink/internal/q;
.super Lts/o;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/crypto/tink/internal/k0;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/internal/k0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v0, Lvs/l3;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    iput-object p1, p0, Lcom/google/crypto/tink/internal/q;->a:Lcom/google/crypto/tink/internal/k0;

    return-void
.end method

.method public static V(Lcom/google/crypto/tink/internal/k0;)V
    .locals 0

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast p0, Lvs/l3;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    return-void
.end method


# virtual methods
.method public final z()Ljava/lang/Integer;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
