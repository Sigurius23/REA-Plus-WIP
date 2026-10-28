.class public final enum Lrd1/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrd1/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lrd1/b;

.field public static final enum DISABLED:Lrd1/b;

.field public static final enum ENABLED:Lrd1/b;

.field public static final enum ENABLING:Lrd1/b;


# direct methods
.method private static synthetic $values()[Lrd1/b;
    .locals 3

    sget-object v0, Lrd1/b;->DISABLED:Lrd1/b;

    sget-object v1, Lrd1/b;->ENABLING:Lrd1/b;

    sget-object v2, Lrd1/b;->ENABLED:Lrd1/b;

    filled-new-array {v0, v1, v2}, [Lrd1/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrd1/b;

    const-string v1, "DISABLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrd1/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/b;->DISABLED:Lrd1/b;

    new-instance v0, Lrd1/b;

    const-string v1, "ENABLING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrd1/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/b;->ENABLING:Lrd1/b;

    new-instance v0, Lrd1/b;

    const-string v1, "ENABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrd1/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd1/b;->ENABLED:Lrd1/b;

    invoke-static {}, Lrd1/b;->$values()[Lrd1/b;

    move-result-object v0

    sput-object v0, Lrd1/b;->$VALUES:[Lrd1/b;

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

.method public static valueOf(Ljava/lang/String;)Lrd1/b;
    .locals 1

    const-class v0, Lrd1/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrd1/b;

    return-object p0
.end method

.method public static values()[Lrd1/b;
    .locals 1

    sget-object v0, Lrd1/b;->$VALUES:[Lrd1/b;

    invoke-virtual {v0}, [Lrd1/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrd1/b;

    return-object v0
.end method
