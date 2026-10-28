.class public final enum Lvs/l1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/z;


# static fields
.field public static final enum E:Lvs/l1;

.field public static final synthetic F:[Lvs/l1;

.field public static final enum x:Lvs/l1;

.field public static final enum y:Lvs/l1;

.field public static final enum z:Lvs/l1;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lvs/l1;

    const-string v1, "UNKNOWN_ENCODING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lvs/l1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lvs/l1;->x:Lvs/l1;

    new-instance v1, Lvs/l1;

    const-string v2, "IEEE_P1363"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lvs/l1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lvs/l1;->y:Lvs/l1;

    new-instance v2, Lvs/l1;

    const-string v3, "DER"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lvs/l1;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lvs/l1;->z:Lvs/l1;

    new-instance v3, Lvs/l1;

    const/4 v4, 0x3

    const/4 v5, -0x1

    const-string v6, "UNRECOGNIZED"

    invoke-direct {v3, v6, v4, v5}, Lvs/l1;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lvs/l1;->E:Lvs/l1;

    filled-new-array {v0, v1, v2, v3}, [Lvs/l1;

    move-result-object v0

    sput-object v0, Lvs/l1;->F:[Lvs/l1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lvs/l1;->w:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lvs/l1;
    .locals 1

    const-class v0, Lvs/l1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvs/l1;

    return-object p0
.end method

.method public static values()[Lvs/l1;
    .locals 1

    sget-object v0, Lvs/l1;->F:[Lvs/l1;

    invoke-virtual {v0}, [Lvs/l1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvs/l1;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lvs/l1;->E:Lvs/l1;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lvs/l1;->w:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
