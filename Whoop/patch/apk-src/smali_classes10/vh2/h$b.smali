.class public final enum Lvh2/h$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvh2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvh2/h$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lvh2/h$b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "FORBIDDEN",
        "BACKEND_FAIL",
        "NO_NETWORK",
        "STRAP_REJECT",
        "TRANSFER_FAILED",
        "INTERRUPTED",
        "UNKNOWN",
        "strap-auth_release"
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

.field private static final synthetic $VALUES:[Lvh2/h$b;

.field public static final enum BACKEND_FAIL:Lvh2/h$b;

.field public static final enum FORBIDDEN:Lvh2/h$b;

.field public static final enum INTERRUPTED:Lvh2/h$b;

.field public static final enum NO_NETWORK:Lvh2/h$b;

.field public static final enum STRAP_REJECT:Lvh2/h$b;

.field public static final enum TRANSFER_FAILED:Lvh2/h$b;

.field public static final enum UNKNOWN:Lvh2/h$b;


# direct methods
.method private static final synthetic $values()[Lvh2/h$b;
    .locals 7

    sget-object v0, Lvh2/h$b;->FORBIDDEN:Lvh2/h$b;

    sget-object v1, Lvh2/h$b;->BACKEND_FAIL:Lvh2/h$b;

    sget-object v2, Lvh2/h$b;->NO_NETWORK:Lvh2/h$b;

    sget-object v3, Lvh2/h$b;->STRAP_REJECT:Lvh2/h$b;

    sget-object v4, Lvh2/h$b;->TRANSFER_FAILED:Lvh2/h$b;

    sget-object v5, Lvh2/h$b;->INTERRUPTED:Lvh2/h$b;

    sget-object v6, Lvh2/h$b;->UNKNOWN:Lvh2/h$b;

    filled-new-array/range {v0 .. v6}, [Lvh2/h$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvh2/h$b;

    const-string v1, "FORBIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lvh2/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvh2/h$b;->FORBIDDEN:Lvh2/h$b;

    new-instance v0, Lvh2/h$b;

    const-string v1, "BACKEND_FAIL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lvh2/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvh2/h$b;->BACKEND_FAIL:Lvh2/h$b;

    new-instance v0, Lvh2/h$b;

    const-string v1, "NO_NETWORK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lvh2/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvh2/h$b;->NO_NETWORK:Lvh2/h$b;

    new-instance v0, Lvh2/h$b;

    const-string v1, "STRAP_REJECT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lvh2/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvh2/h$b;->STRAP_REJECT:Lvh2/h$b;

    new-instance v0, Lvh2/h$b;

    const-string v1, "TRANSFER_FAILED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lvh2/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvh2/h$b;->TRANSFER_FAILED:Lvh2/h$b;

    new-instance v0, Lvh2/h$b;

    const-string v1, "INTERRUPTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lvh2/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvh2/h$b;->INTERRUPTED:Lvh2/h$b;

    new-instance v0, Lvh2/h$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lvh2/h$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvh2/h$b;->UNKNOWN:Lvh2/h$b;

    invoke-static {}, Lvh2/h$b;->$values()[Lvh2/h$b;

    move-result-object v0

    sput-object v0, Lvh2/h$b;->$VALUES:[Lvh2/h$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lvh2/h$b;->$ENTRIES:Lt83/a;

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

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lvh2/h$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvh2/h$b;
    .locals 1

    const-class v0, Lvh2/h$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvh2/h$b;

    return-object p0
.end method

.method public static values()[Lvh2/h$b;
    .locals 1

    sget-object v0, Lvh2/h$b;->$VALUES:[Lvh2/h$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvh2/h$b;

    return-object v0
.end method
