.class public final enum Lwe/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum x:Lwe/e;

.field public static final enum y:Lwe/e;

.field public static final synthetic z:[Lwe/e;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lwe/e;

    const/4 v1, 0x0

    const-string v2, "AWS4-HMAC-SHA256"

    const-string v3, "SIGV4"

    invoke-direct {v0, v3, v1, v2}, Lwe/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lwe/e;->x:Lwe/e;

    new-instance v1, Lwe/e;

    const/4 v2, 0x1

    const-string v3, "AWS4-ECDSA-P256-SHA256"

    const-string v4, "SIGV4_ASYMMETRIC"

    invoke-direct {v1, v4, v2, v3}, Lwe/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lwe/e;->y:Lwe/e;

    filled-new-array {v0, v1}, [Lwe/e;

    move-result-object v0

    sput-object v0, Lwe/e;->z:[Lwe/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lwe/e;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwe/e;
    .locals 1

    const-class v0, Lwe/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwe/e;

    return-object p0
.end method

.method public static values()[Lwe/e;
    .locals 1

    sget-object v0, Lwe/e;->z:[Lwe/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwe/e;

    return-object v0
.end method
