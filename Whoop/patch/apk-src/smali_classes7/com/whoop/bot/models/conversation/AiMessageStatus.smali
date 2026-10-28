.class public final enum Lcom/whoop/bot/models/conversation/AiMessageStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/AiMessageStatus;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ACTIVE",
        "FAILED",
        "FLAGGED",
        "COMPLETE",
        "STOPPED",
        "bot_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/bot/models/conversation/AiMessageStatus;

.field public static final enum ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

.field public static final enum COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

.field public static final enum FAILED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

.field public static final enum FLAGGED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

.field public static final enum STOPPED:Lcom/whoop/bot/models/conversation/AiMessageStatus;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/bot/models/conversation/AiMessageStatus;
    .locals 5

    sget-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    sget-object v1, Lcom/whoop/bot/models/conversation/AiMessageStatus;->FAILED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    sget-object v2, Lcom/whoop/bot/models/conversation/AiMessageStatus;->FLAGGED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    sget-object v3, Lcom/whoop/bot/models/conversation/AiMessageStatus;->COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    sget-object v4, Lcom/whoop/bot/models/conversation/AiMessageStatus;->STOPPED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/bot/models/conversation/AiMessageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->ACTIVE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    new-instance v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;

    const-string v1, "FAILED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/bot/models/conversation/AiMessageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->FAILED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    new-instance v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;

    const-string v1, "FLAGGED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/bot/models/conversation/AiMessageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->FLAGGED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    new-instance v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;

    const-string v1, "COMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/bot/models/conversation/AiMessageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->COMPLETE:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    new-instance v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;

    const-string v1, "STOPPED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/bot/models/conversation/AiMessageStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->STOPPED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-static {}, Lcom/whoop/bot/models/conversation/AiMessageStatus;->$values()[Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object v0

    sput-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->$VALUES:[Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/bot/models/conversation/AiMessageStatus;
    .locals 1

    const-class v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/models/conversation/AiMessageStatus;

    return-object p0
.end method

.method public static values()[Lcom/whoop/bot/models/conversation/AiMessageStatus;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/conversation/AiMessageStatus;->$VALUES:[Lcom/whoop/bot/models/conversation/AiMessageStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/bot/models/conversation/AiMessageStatus;

    return-object v0
.end method
