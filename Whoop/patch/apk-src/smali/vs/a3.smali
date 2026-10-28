.class public final enum Lvs/a3;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/z;


# static fields
.field public static final enum E:Lvs/a3;

.field public static final enum F:Lvs/a3;

.field public static final synthetic G:[Lvs/a3;

.field public static final enum x:Lvs/a3;

.field public static final enum y:Lvs/a3;

.field public static final enum z:Lvs/a3;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lvs/a3;

    const-string v1, "KDF_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lvs/a3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lvs/a3;->x:Lvs/a3;

    new-instance v1, Lvs/a3;

    const-string v2, "HKDF_SHA256"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lvs/a3;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lvs/a3;->y:Lvs/a3;

    new-instance v2, Lvs/a3;

    const-string v3, "HKDF_SHA384"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lvs/a3;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lvs/a3;->z:Lvs/a3;

    new-instance v3, Lvs/a3;

    const-string v4, "HKDF_SHA512"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lvs/a3;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lvs/a3;->E:Lvs/a3;

    new-instance v4, Lvs/a3;

    const/4 v5, 0x4

    const/4 v6, -0x1

    const-string v7, "UNRECOGNIZED"

    invoke-direct {v4, v7, v5, v6}, Lvs/a3;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lvs/a3;->F:Lvs/a3;

    filled-new-array {v0, v1, v2, v3, v4}, [Lvs/a3;

    move-result-object v0

    sput-object v0, Lvs/a3;->G:[Lvs/a3;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lvs/a3;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lvs/a3;
    .locals 1

    const-class v0, Lvs/a3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvs/a3;

    return-object p0
.end method

.method public static values()[Lvs/a3;
    .locals 1

    sget-object v0, Lvs/a3;->G:[Lvs/a3;

    invoke-virtual {v0}, [Lvs/a3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvs/a3;

    return-object v0
.end method
