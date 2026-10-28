.class public final enum Lpm2/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpm2/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpm2/g;",
        "",
        "",
        "eventType",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getEventType",
        "()I",
        "FIRMWARE_SHOW_UPDATE_DIALOG",
        "FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED",
        "CHARGE_STRAP_PROMPT",
        "NO_NETWORK_CONNECTED_PROMPT",
        "NO_STRAP_CONNECTED",
        "FIRMWARE_HIDE_COMPOSE_DIALOG",
        "FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATE_STARTED",
        "app_prodStandardRelease"
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

.field private static final synthetic $VALUES:[Lpm2/g;

.field public static final enum CHARGE_STRAP_PROMPT:Lpm2/g;

.field public static final enum FIRMWARE_HIDE_COMPOSE_DIALOG:Lpm2/g;

.field public static final enum FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED:Lpm2/g;

.field public static final enum FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATE_STARTED:Lpm2/g;

.field public static final enum FIRMWARE_SHOW_UPDATE_DIALOG:Lpm2/g;

.field public static final enum NO_NETWORK_CONNECTED_PROMPT:Lpm2/g;

.field public static final enum NO_STRAP_CONNECTED:Lpm2/g;


# instance fields
.field private final eventType:I


# direct methods
.method private static final synthetic $values()[Lpm2/g;
    .locals 7

    sget-object v0, Lpm2/g;->FIRMWARE_SHOW_UPDATE_DIALOG:Lpm2/g;

    sget-object v1, Lpm2/g;->FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED:Lpm2/g;

    sget-object v2, Lpm2/g;->CHARGE_STRAP_PROMPT:Lpm2/g;

    sget-object v3, Lpm2/g;->NO_NETWORK_CONNECTED_PROMPT:Lpm2/g;

    sget-object v4, Lpm2/g;->NO_STRAP_CONNECTED:Lpm2/g;

    sget-object v5, Lpm2/g;->FIRMWARE_HIDE_COMPOSE_DIALOG:Lpm2/g;

    sget-object v6, Lpm2/g;->FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATE_STARTED:Lpm2/g;

    filled-new-array/range {v0 .. v6}, [Lpm2/g;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lpm2/g;

    const-string v1, "FIRMWARE_SHOW_UPDATE_DIALOG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lpm2/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpm2/g;->FIRMWARE_SHOW_UPDATE_DIALOG:Lpm2/g;

    new-instance v0, Lpm2/g;

    const-string v1, "FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lpm2/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpm2/g;->FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED:Lpm2/g;

    new-instance v0, Lpm2/g;

    const-string v1, "CHARGE_STRAP_PROMPT"

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lpm2/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpm2/g;->CHARGE_STRAP_PROMPT:Lpm2/g;

    new-instance v0, Lpm2/g;

    const-string v1, "NO_NETWORK_CONNECTED_PROMPT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lpm2/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpm2/g;->NO_NETWORK_CONNECTED_PROMPT:Lpm2/g;

    new-instance v0, Lpm2/g;

    const-string v1, "NO_STRAP_CONNECTED"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lpm2/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpm2/g;->NO_STRAP_CONNECTED:Lpm2/g;

    new-instance v0, Lpm2/g;

    const-string v1, "FIRMWARE_HIDE_COMPOSE_DIALOG"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lpm2/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpm2/g;->FIRMWARE_HIDE_COMPOSE_DIALOG:Lpm2/g;

    new-instance v0, Lpm2/g;

    const-string v1, "FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATE_STARTED"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lpm2/g;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpm2/g;->FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATE_STARTED:Lpm2/g;

    invoke-static {}, Lpm2/g;->$values()[Lpm2/g;

    move-result-object v0

    sput-object v0, Lpm2/g;->$VALUES:[Lpm2/g;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lpm2/g;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lpm2/g;->eventType:I

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

    sget-object v0, Lpm2/g;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpm2/g;
    .locals 1

    const-class v0, Lpm2/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpm2/g;

    return-object p0
.end method

.method public static values()[Lpm2/g;
    .locals 1

    sget-object v0, Lpm2/g;->$VALUES:[Lpm2/g;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpm2/g;

    return-object v0
.end method


# virtual methods
.method public final getEventType()I
    .locals 1

    iget v0, p0, Lpm2/g;->eventType:I

    return v0
.end method
