.class public final Lls/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/l;


# static fields
.field public static final a:Lls/g;

.field public static final b:Lcom/google/crypto/tink/internal/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lls/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lls/g;->a:Lls/g;

    new-instance v0, Lio/sentry/okhttp/b;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lcom/google/crypto/tink/internal/q;

    const-class v3, Lfs/c;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lls/g;->b:Lcom/google/crypto/tink/internal/f0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    const-class v0, Lfs/c;

    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    const-class v0, Lfs/c;

    return-object v0
.end method

.method public final c(La33/d;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lls/f;

    invoke-direct {v0, p1}, Lls/f;-><init>(La33/d;)V

    return-object v0
.end method
