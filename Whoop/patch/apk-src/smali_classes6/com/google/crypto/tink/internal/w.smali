.class public final Lcom/google/crypto/tink/internal/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/crypto/tink/internal/w;

.field public static final c:Lcom/google/crypto/tink/internal/v;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/crypto/tink/internal/w;

    invoke-direct {v0}, Lcom/google/crypto/tink/internal/w;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/internal/w;->b:Lcom/google/crypto/tink/internal/w;

    new-instance v0, Lcom/google/crypto/tink/internal/v;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/internal/w;->c:Lcom/google/crypto/tink/internal/v;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/crypto/tink/internal/v;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/w;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/internal/v;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/internal/w;->c:Lcom/google/crypto/tink/internal/v;

    :cond_0
    return-object v0
.end method
