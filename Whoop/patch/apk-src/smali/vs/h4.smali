.class public final enum Lvs/h4;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/z;


# static fields
.field public static final enum E:Lvs/h4;

.field public static final enum F:Lvs/h4;

.field public static final enum G:Lvs/h4;

.field public static final synthetic H:[Lvs/h4;

.field public static final enum x:Lvs/h4;

.field public static final enum y:Lvs/h4;

.field public static final enum z:Lvs/h4;


# instance fields
.field public final w:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lvs/h4;

    const-string v1, "UNKNOWN_PREFIX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lvs/h4;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lvs/h4;->x:Lvs/h4;

    new-instance v1, Lvs/h4;

    const-string v2, "TINK"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lvs/h4;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lvs/h4;->y:Lvs/h4;

    new-instance v2, Lvs/h4;

    const-string v3, "LEGACY"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lvs/h4;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lvs/h4;->z:Lvs/h4;

    new-instance v3, Lvs/h4;

    const-string v4, "RAW"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lvs/h4;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lvs/h4;->E:Lvs/h4;

    new-instance v4, Lvs/h4;

    const-string v5, "CRUNCHY"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lvs/h4;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lvs/h4;->F:Lvs/h4;

    new-instance v5, Lvs/h4;

    const/4 v6, 0x5

    const/4 v7, -0x1

    const-string v8, "UNRECOGNIZED"

    invoke-direct {v5, v8, v6, v7}, Lvs/h4;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lvs/h4;->G:Lvs/h4;

    filled-new-array/range {v0 .. v5}, [Lvs/h4;

    move-result-object v0

    sput-object v0, Lvs/h4;->H:[Lvs/h4;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lvs/h4;->w:I

    return-void
.end method

.method public static a(I)Lvs/h4;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lvs/h4;->F:Lvs/h4;

    return-object p0

    :cond_1
    sget-object p0, Lvs/h4;->E:Lvs/h4;

    return-object p0

    :cond_2
    sget-object p0, Lvs/h4;->z:Lvs/h4;

    return-object p0

    :cond_3
    sget-object p0, Lvs/h4;->y:Lvs/h4;

    return-object p0

    :cond_4
    sget-object p0, Lvs/h4;->x:Lvs/h4;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lvs/h4;
    .locals 1

    const-class v0, Lvs/h4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvs/h4;

    return-object p0
.end method

.method public static values()[Lvs/h4;
    .locals 1

    sget-object v0, Lvs/h4;->H:[Lvs/h4;

    invoke-virtual {v0}, [Lvs/h4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvs/h4;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 2

    sget-object v0, Lvs/h4;->G:Lvs/h4;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lvs/h4;->w:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
