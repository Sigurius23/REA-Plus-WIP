.class public abstract enum Lyu0/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyu0/e$a;,
        Lyu0/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyu0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lyu0/e;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "Ljt0/b;",
        "gen5PacketTypes",
        "()[Ljt0/b;",
        "REALTIME_HEART_RATE",
        "REALTIME_ECG",
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

.field private static final synthetic $VALUES:[Lyu0/e;

.field public static final enum REALTIME_ECG:Lyu0/e;

.field public static final enum REALTIME_HEART_RATE:Lyu0/e;


# direct methods
.method private static final synthetic $values()[Lyu0/e;
    .locals 2

    sget-object v0, Lyu0/e;->REALTIME_HEART_RATE:Lyu0/e;

    sget-object v1, Lyu0/e;->REALTIME_ECG:Lyu0/e;

    filled-new-array {v0, v1}, [Lyu0/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyu0/e$b;

    const-string v1, "REALTIME_HEART_RATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lyu0/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyu0/e;->REALTIME_HEART_RATE:Lyu0/e;

    new-instance v0, Lyu0/e$a;

    const-string v1, "REALTIME_ECG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lyu0/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyu0/e;->REALTIME_ECG:Lyu0/e;

    invoke-static {}, Lyu0/e;->$values()[Lyu0/e;

    move-result-object v0

    sput-object v0, Lyu0/e;->$VALUES:[Lyu0/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lyu0/e;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lyu0/e;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lyu0/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyu0/e;
    .locals 1

    const-class v0, Lyu0/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyu0/e;

    return-object p0
.end method

.method public static values()[Lyu0/e;
    .locals 1

    sget-object v0, Lyu0/e;->$VALUES:[Lyu0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyu0/e;

    return-object v0
.end method


# virtual methods
.method public abstract gen5PacketTypes()[Ljt0/b;
.end method
