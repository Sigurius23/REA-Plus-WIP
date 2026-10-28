.class public final enum Lcom/whoop/whooplabs/data/domain/ProtocolStepType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "INSTRUCTION",
        "TYPEFORM",
        "BP",
        "BTHR",
        "SELECTION",
        "NUMBER_INPUT",
        "TEXT_INPUT",
        "TIME_PICKER",
        "DATETIME_PICKER",
        "whooplabs_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

.field public static final enum BP:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

.field public static final enum BTHR:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

.field public static final enum DATETIME_PICKER:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

.field public static final enum INSTRUCTION:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

.field public static final enum NUMBER_INPUT:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

.field public static final enum SELECTION:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

.field public static final enum TEXT_INPUT:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

.field public static final enum TIME_PICKER:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

.field public static final enum TYPEFORM:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/whooplabs/data/domain/ProtocolStepType;
    .locals 9

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->INSTRUCTION:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    sget-object v1, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->TYPEFORM:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    sget-object v2, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->BP:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    sget-object v3, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->BTHR:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    sget-object v4, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->SELECTION:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    sget-object v5, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->NUMBER_INPUT:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    sget-object v6, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->TEXT_INPUT:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    sget-object v7, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->TIME_PICKER:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    sget-object v8, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->DATETIME_PICKER:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    filled-new-array/range {v0 .. v8}, [Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    const-string v1, "INSTRUCTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->INSTRUCTION:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    const-string v1, "TYPEFORM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->TYPEFORM:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    const-string v1, "BP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->BP:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    const-string v1, "BTHR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->BTHR:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    const-string v1, "SELECTION"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->SELECTION:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    const-string v1, "NUMBER_INPUT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->NUMBER_INPUT:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    const-string v1, "TEXT_INPUT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->TEXT_INPUT:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    const-string v1, "TIME_PICKER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->TIME_PICKER:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    new-instance v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    const-string v1, "DATETIME_PICKER"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->DATETIME_PICKER:Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    invoke-static {}, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->$values()[Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    move-result-object v0

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->$VALUES:[Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/whooplabs/data/domain/ProtocolStepType;
    .locals 1

    const-class v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/whooplabs/data/domain/ProtocolStepType;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepType;->$VALUES:[Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    return-object v0
.end method
