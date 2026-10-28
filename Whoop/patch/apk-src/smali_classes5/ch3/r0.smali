.class public final Lch3/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:Lcom/google/crypto/tink/internal/l0;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/internal/l0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch3/r0;->x:Lcom/google/crypto/tink/internal/l0;

    iput-wide p2, p0, Lch3/r0;->w:J

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 3

    iget-object v0, p0, Lch3/r0;->x:Lcom/google/crypto/tink/internal/l0;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lxg3/i;

    iget-wide v1, p0, Lch3/r0;->w:J

    invoke-interface {v0, v1, v2}, Lxg3/i;->request(J)V

    return-void
.end method
