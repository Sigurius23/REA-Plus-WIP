.class public final enum Luz2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Luz2/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Luz2/a;

.field public static final enum DARK:Luz2/a;

.field public static final enum LIGHT:Luz2/a;

.field public static final enum TINTED:Luz2/a;


# direct methods
.method private static synthetic $values()[Luz2/a;
    .locals 3

    sget-object v0, Luz2/a;->LIGHT:Luz2/a;

    sget-object v1, Luz2/a;->DARK:Luz2/a;

    sget-object v2, Luz2/a;->TINTED:Luz2/a;

    filled-new-array {v0, v1, v2}, [Luz2/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Luz2/a;

    const-string v1, "LIGHT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Luz2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luz2/a;->LIGHT:Luz2/a;

    new-instance v0, Luz2/a;

    const-string v1, "DARK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Luz2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luz2/a;->DARK:Luz2/a;

    new-instance v0, Luz2/a;

    const-string v1, "TINTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Luz2/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Luz2/a;->TINTED:Luz2/a;

    invoke-static {}, Luz2/a;->$values()[Luz2/a;

    move-result-object v0

    sput-object v0, Luz2/a;->$VALUES:[Luz2/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Luz2/a;
    .locals 1

    const-class v0, Luz2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Luz2/a;

    return-object p0
.end method

.method public static values()[Luz2/a;
    .locals 1

    sget-object v0, Luz2/a;->$VALUES:[Luz2/a;

    invoke-virtual {v0}, [Luz2/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Luz2/a;

    return-object v0
.end method
