.class final enum Lvz2/e$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvz2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvz2/e$e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lvz2/e$e;

.field public static final enum CAPTURING:Lvz2/e$e;

.field public static final enum LOCKED:Lvz2/e$e;

.field public static final enum LOCKING:Lvz2/e$e;

.field public static final enum PRECAPTURE:Lvz2/e$e;

.field public static final enum PREVIEW:Lvz2/e$e;

.field public static final enum WAITING:Lvz2/e$e;


# direct methods
.method private static synthetic $values()[Lvz2/e$e;
    .locals 6

    sget-object v0, Lvz2/e$e;->PREVIEW:Lvz2/e$e;

    sget-object v1, Lvz2/e$e;->LOCKING:Lvz2/e$e;

    sget-object v2, Lvz2/e$e;->LOCKED:Lvz2/e$e;

    sget-object v3, Lvz2/e$e;->PRECAPTURE:Lvz2/e$e;

    sget-object v4, Lvz2/e$e;->WAITING:Lvz2/e$e;

    sget-object v5, Lvz2/e$e;->CAPTURING:Lvz2/e$e;

    filled-new-array/range {v0 .. v5}, [Lvz2/e$e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvz2/e$e;

    const-string v1, "PREVIEW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvz2/e$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvz2/e$e;->PREVIEW:Lvz2/e$e;

    new-instance v0, Lvz2/e$e;

    const-string v1, "LOCKING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lvz2/e$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvz2/e$e;->LOCKING:Lvz2/e$e;

    new-instance v0, Lvz2/e$e;

    const-string v1, "LOCKED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lvz2/e$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvz2/e$e;->LOCKED:Lvz2/e$e;

    new-instance v0, Lvz2/e$e;

    const-string v1, "PRECAPTURE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lvz2/e$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvz2/e$e;->PRECAPTURE:Lvz2/e$e;

    new-instance v0, Lvz2/e$e;

    const-string v1, "WAITING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lvz2/e$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvz2/e$e;->WAITING:Lvz2/e$e;

    new-instance v0, Lvz2/e$e;

    const-string v1, "CAPTURING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lvz2/e$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvz2/e$e;->CAPTURING:Lvz2/e$e;

    invoke-static {}, Lvz2/e$e;->$values()[Lvz2/e$e;

    move-result-object v0

    sput-object v0, Lvz2/e$e;->$VALUES:[Lvz2/e$e;

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

.method public static valueOf(Ljava/lang/String;)Lvz2/e$e;
    .locals 1

    const-class v0, Lvz2/e$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvz2/e$e;

    return-object p0
.end method

.method public static values()[Lvz2/e$e;
    .locals 1

    sget-object v0, Lvz2/e$e;->$VALUES:[Lvz2/e$e;

    invoke-virtual {v0}, [Lvz2/e$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvz2/e$e;

    return-object v0
.end method
