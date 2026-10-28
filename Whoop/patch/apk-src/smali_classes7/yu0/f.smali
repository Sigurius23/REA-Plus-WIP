.class public final enum Lyu0/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyu0/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lyu0/f;",
        "",
        "",
        "label",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getLabel",
        "()Ljava/lang/String;",
        "HR",
        "R20",
        "IMU",
        "R10",
        "R11",
        "FILTERED_ECG",
        "connectivity-analytics_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lyu0/f;

.field public static final enum FILTERED_ECG:Lyu0/f;

.field public static final enum HR:Lyu0/f;

.field public static final enum IMU:Lyu0/f;

.field public static final enum R10:Lyu0/f;

.field public static final enum R11:Lyu0/f;

.field public static final enum R20:Lyu0/f;


# instance fields
.field private final label:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lyu0/f;
    .locals 6

    sget-object v0, Lyu0/f;->HR:Lyu0/f;

    sget-object v1, Lyu0/f;->R20:Lyu0/f;

    sget-object v2, Lyu0/f;->IMU:Lyu0/f;

    sget-object v3, Lyu0/f;->R10:Lyu0/f;

    sget-object v4, Lyu0/f;->R11:Lyu0/f;

    sget-object v5, Lyu0/f;->FILTERED_ECG:Lyu0/f;

    filled-new-array/range {v0 .. v5}, [Lyu0/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lyu0/f;

    const/4 v1, 0x0

    const-string v2, "Realtime HR"

    const-string v3, "HR"

    invoke-direct {v0, v3, v1, v2}, Lyu0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyu0/f;->HR:Lyu0/f;

    new-instance v0, Lyu0/f;

    const/4 v1, 0x1

    const-string v2, "Realtime R20"

    const-string v3, "R20"

    invoke-direct {v0, v3, v1, v2}, Lyu0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyu0/f;->R20:Lyu0/f;

    new-instance v0, Lyu0/f;

    const/4 v1, 0x2

    const-string v2, "Realtime IMU"

    const-string v3, "IMU"

    invoke-direct {v0, v3, v1, v2}, Lyu0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyu0/f;->IMU:Lyu0/f;

    new-instance v0, Lyu0/f;

    const/4 v1, 0x3

    const-string v2, "Realtime R10"

    const-string v3, "R10"

    invoke-direct {v0, v3, v1, v2}, Lyu0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyu0/f;->R10:Lyu0/f;

    new-instance v0, Lyu0/f;

    const/4 v1, 0x4

    const-string v2, "Realtime R11"

    const-string v3, "R11"

    invoke-direct {v0, v3, v1, v2}, Lyu0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyu0/f;->R11:Lyu0/f;

    new-instance v0, Lyu0/f;

    const/4 v1, 0x5

    const-string v2, "Realtime Filtered ECG"

    const-string v3, "FILTERED_ECG"

    invoke-direct {v0, v3, v1, v2}, Lyu0/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyu0/f;->FILTERED_ECG:Lyu0/f;

    invoke-static {}, Lyu0/f;->$values()[Lyu0/f;

    move-result-object v0

    sput-object v0, Lyu0/f;->$VALUES:[Lyu0/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lyu0/f;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lyu0/f;->label:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lyu0/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyu0/f;
    .locals 1

    const-class v0, Lyu0/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyu0/f;

    return-object p0
.end method

.method public static values()[Lyu0/f;
    .locals 1

    sget-object v0, Lyu0/f;->$VALUES:[Lyu0/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyu0/f;

    return-object v0
.end method


# virtual methods
.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyu0/f;->label:Ljava/lang/String;

    return-object v0
.end method
