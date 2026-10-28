.class public final enum Lvz2/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvz2/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lvz2/g;

.field public static final enum AUTO:Lvz2/g;

.field public static final enum OFF:Lvz2/g;

.field public static final enum ON:Lvz2/g;


# direct methods
.method private static synthetic $values()[Lvz2/g;
    .locals 3

    sget-object v0, Lvz2/g;->OFF:Lvz2/g;

    sget-object v1, Lvz2/g;->ON:Lvz2/g;

    sget-object v2, Lvz2/g;->AUTO:Lvz2/g;

    filled-new-array {v0, v1, v2}, [Lvz2/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvz2/g;

    const-string v1, "OFF"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvz2/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvz2/g;->OFF:Lvz2/g;

    new-instance v0, Lvz2/g;

    const-string v1, "ON"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lvz2/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvz2/g;->ON:Lvz2/g;

    new-instance v0, Lvz2/g;

    const-string v1, "AUTO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lvz2/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvz2/g;->AUTO:Lvz2/g;

    invoke-static {}, Lvz2/g;->$values()[Lvz2/g;

    move-result-object v0

    sput-object v0, Lvz2/g;->$VALUES:[Lvz2/g;

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

.method public static valueOf(Ljava/lang/String;)Lvz2/g;
    .locals 1

    const-class v0, Lvz2/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvz2/g;

    return-object p0
.end method

.method public static values()[Lvz2/g;
    .locals 1

    sget-object v0, Lvz2/g;->$VALUES:[Lvz2/g;

    invoke-virtual {v0}, [Lvz2/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvz2/g;

    return-object v0
.end method
