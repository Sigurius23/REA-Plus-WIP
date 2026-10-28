.class public final Lts/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/l;


# static fields
.field public static final a:Lts/r;

.field public static final b:Lcom/google/crypto/tink/internal/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lts/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lts/r;->a:Lts/r;

    new-instance v0, Lts/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lcom/google/crypto/tink/internal/q;

    const-class v3, Lts/m;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lts/r;->b:Lcom/google/crypto/tink/internal/f0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    const-class v0, Lts/m;

    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    const-class v0, Lts/o;

    return-object v0
.end method

.method public final c(La33/d;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lts/q;

    invoke-direct {v0, p1}, Lts/q;-><init>(La33/d;)V

    return-object v0
.end method
