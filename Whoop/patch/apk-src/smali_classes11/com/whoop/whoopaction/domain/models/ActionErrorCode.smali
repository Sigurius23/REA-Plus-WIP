.class public final enum Lcom/whoop/whoopaction/domain/models/ActionErrorCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/ActionErrorCode$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "INVALID_CREDENTIALS",
        "RATE_LIMITED",
        "NETWORK",
        "MFA_REQUIRED",
        "PASSWORD_RESET_REQUIRED",
        "UNKNOWN",
        "Companion",
        "whoop-action_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
    with = Luw2/a;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/ActionErrorCode$Companion;

.field public static final enum INVALID_CREDENTIALS:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

.field public static final enum MFA_REQUIRED:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

.field public static final enum NETWORK:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

.field public static final enum PASSWORD_RESET_REQUIRED:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

.field public static final enum RATE_LIMITED:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

.field public static final enum UNKNOWN:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/whoopaction/domain/models/ActionErrorCode;
    .locals 6

    sget-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->INVALID_CREDENTIALS:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    sget-object v1, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->RATE_LIMITED:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    sget-object v2, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->NETWORK:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    sget-object v3, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->MFA_REQUIRED:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    sget-object v4, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->PASSWORD_RESET_REQUIRED:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    sget-object v5, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    const-string v1, "INVALID_CREDENTIALS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->INVALID_CREDENTIALS:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    const-string v1, "RATE_LIMITED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->RATE_LIMITED:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    const-string v1, "NETWORK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->NETWORK:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    const-string v1, "MFA_REQUIRED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->MFA_REQUIRED:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    const-string v1, "PASSWORD_RESET_REQUIRED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->PASSWORD_RESET_REQUIRED:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->UNKNOWN:Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->$values()[Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    move-result-object v0

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->$VALUES:[Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/ActionErrorCode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->Companion:Lcom/whoop/whoopaction/domain/models/ActionErrorCode$Companion;

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

    sget-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/ActionErrorCode;
    .locals 1

    const-class v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/whoop/whoopaction/domain/models/ActionErrorCode;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/ActionErrorCode;->$VALUES:[Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/whoopaction/domain/models/ActionErrorCode;

    return-object v0
.end method
