.class public final enum Lnw/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lnw/e;

.field public static final enum F:Lnw/e;

.field public static final enum G:Lnw/e;

.field public static final synthetic H:[Lnw/e;

.field public static final enum x:Lnw/e;

.field public static final enum y:Lnw/e;

.field public static final enum z:Lnw/e;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lnw/e;

    const/4 v1, 0x0

    const-string v2, "sign"

    const-string v3, "SIGN"

    invoke-direct {v0, v3, v1, v2}, Lnw/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lnw/e;->x:Lnw/e;

    new-instance v1, Lnw/e;

    const/4 v2, 0x1

    const-string v3, "verify"

    const-string v4, "VERIFY"

    invoke-direct {v1, v4, v2, v3}, Lnw/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lnw/e;->y:Lnw/e;

    new-instance v2, Lnw/e;

    const/4 v3, 0x2

    const-string v4, "encrypt"

    const-string v5, "ENCRYPT"

    invoke-direct {v2, v5, v3, v4}, Lnw/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lnw/e;->z:Lnw/e;

    new-instance v3, Lnw/e;

    const/4 v4, 0x3

    const-string v5, "decrypt"

    const-string v6, "DECRYPT"

    invoke-direct {v3, v6, v4, v5}, Lnw/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lnw/e;->E:Lnw/e;

    new-instance v4, Lnw/e;

    const/4 v5, 0x4

    const-string v6, "wrapKey"

    const-string v7, "WRAP_KEY"

    invoke-direct {v4, v7, v5, v6}, Lnw/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lnw/e;->F:Lnw/e;

    new-instance v5, Lnw/e;

    const/4 v6, 0x5

    const-string v7, "unwrapKey"

    const-string v8, "UNWRAP_KEY"

    invoke-direct {v5, v8, v6, v7}, Lnw/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lnw/e;->G:Lnw/e;

    new-instance v6, Lnw/e;

    const/4 v7, 0x6

    const-string v8, "deriveKey"

    const-string v9, "DERIVE_KEY"

    invoke-direct {v6, v9, v7, v8}, Lnw/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v7, Lnw/e;

    const/4 v8, 0x7

    const-string v9, "deriveBits"

    const-string v10, "DERIVE_BITS"

    invoke-direct {v7, v10, v8, v9}, Lnw/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array/range {v0 .. v7}, [Lnw/e;

    move-result-object v0

    sput-object v0, Lnw/e;->H:[Lnw/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lnw/e;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnw/e;
    .locals 1

    const-class v0, Lnw/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnw/e;

    return-object p0
.end method

.method public static values()[Lnw/e;
    .locals 1

    sget-object v0, Lnw/e;->H:[Lnw/e;

    invoke-virtual {v0}, [Lnw/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnw/e;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnw/e;->w:Ljava/lang/String;

    return-object v0
.end method
