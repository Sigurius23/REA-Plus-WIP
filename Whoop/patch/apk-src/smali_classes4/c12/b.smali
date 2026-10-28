.class public final enum Lc12/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc12/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lc12/b;

.field public static final enum HIGH:Lc12/b;

.field public static final enum LOW:Lc12/b;

.field public static final enum MAX:Lc12/b;

.field public static final enum MEDIUM:Lc12/b;

.field public static final enum URGENT:Lc12/b;


# direct methods
.method private static synthetic $values()[Lc12/b;
    .locals 5

    sget-object v0, Lc12/b;->LOW:Lc12/b;

    sget-object v1, Lc12/b;->MEDIUM:Lc12/b;

    sget-object v2, Lc12/b;->HIGH:Lc12/b;

    sget-object v3, Lc12/b;->URGENT:Lc12/b;

    sget-object v4, Lc12/b;->MAX:Lc12/b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lc12/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc12/b;

    const-string v1, "LOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc12/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc12/b;->LOW:Lc12/b;

    new-instance v0, Lc12/b;

    const-string v1, "MEDIUM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc12/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc12/b;->MEDIUM:Lc12/b;

    new-instance v0, Lc12/b;

    const-string v1, "HIGH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lc12/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc12/b;->HIGH:Lc12/b;

    new-instance v0, Lc12/b;

    const-string v1, "URGENT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lc12/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc12/b;->URGENT:Lc12/b;

    new-instance v0, Lc12/b;

    const-string v1, "MAX"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lc12/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc12/b;->MAX:Lc12/b;

    invoke-static {}, Lc12/b;->$values()[Lc12/b;

    move-result-object v0

    sput-object v0, Lc12/b;->$VALUES:[Lc12/b;

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

.method public static valueOf(Ljava/lang/String;)Lc12/b;
    .locals 1

    const-class v0, Lc12/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc12/b;

    return-object p0
.end method

.method public static values()[Lc12/b;
    .locals 1

    sget-object v0, Lc12/b;->$VALUES:[Lc12/b;

    invoke-virtual {v0}, [Lc12/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc12/b;

    return-object v0
.end method


# virtual methods
.method public hasSound()Z
    .locals 1

    sget-object v0, Lc12/b;->HIGH:Lc12/b;

    if-eq p0, v0, :cond_1

    sget-object v0, Lc12/b;->URGENT:Lc12/b;

    if-eq p0, v0, :cond_1

    sget-object v0, Lc12/b;->MAX:Lc12/b;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
