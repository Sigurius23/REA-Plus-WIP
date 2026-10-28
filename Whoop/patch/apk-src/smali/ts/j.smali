.class public abstract Lts/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/f0;

.field public static final b:Lcom/google/crypto/tink/internal/p;

.field public static final c:Lcom/google/crypto/tink/internal/s;

.field public static final d:Lgs/h;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lts/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lts/i;

    const-class v3, Lts/m;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lts/j;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {}, Lvs/u2;->H()Lcom/google/crypto/tink/shaded/protobuf/v0;

    new-instance v0, Lcom/google/crypto/tink/internal/p;

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacPrfKey"

    sget-object v2, Lvs/l3;->y:Lvs/l3;

    invoke-direct {v0, v1, v3, v2}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    sput-object v0, Lts/j;->b:Lcom/google/crypto/tink/internal/p;

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/s;-><init>(I)V

    sput-object v0, Lts/j;->c:Lcom/google/crypto/tink/internal/s;

    new-instance v0, Lgs/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lts/j;->d:Lgs/h;

    const/4 v0, 0x2

    sput v0, Lts/j;->e:I

    return-void
.end method
