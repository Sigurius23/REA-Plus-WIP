.class public final enum Lmp0/d0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmp0/d0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\n\u0010\tj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lmp0/d0;",
        "",
        "",
        "eventName",
        "objectName",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "Ljava/lang/String;",
        "getEventName",
        "()Ljava/lang/String;",
        "getObjectName",
        "SAVING",
        "SAVED",
        "FAILED",
        "sleep-coach_release"
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

.field private static final synthetic $VALUES:[Lmp0/d0;

.field public static final enum FAILED:Lmp0/d0;

.field public static final enum SAVED:Lmp0/d0;

.field public static final enum SAVING:Lmp0/d0;


# instance fields
.field private final eventName:Ljava/lang/String;

.field private final objectName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lmp0/d0;
    .locals 3

    sget-object v0, Lmp0/d0;->SAVING:Lmp0/d0;

    sget-object v1, Lmp0/d0;->SAVED:Lmp0/d0;

    sget-object v2, Lmp0/d0;->FAILED:Lmp0/d0;

    filled-new-array {v0, v1, v2}, [Lmp0/d0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lmp0/d0;

    const-string v1, "Sleep Coach - View Alarm Settings Saving"

    const-string v2, "Alarm Settings Saving"

    const-string v3, "SAVING"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lmp0/d0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lmp0/d0;->SAVING:Lmp0/d0;

    new-instance v0, Lmp0/d0;

    const-string v1, "Sleep Coach - View Alarm Settings Saved"

    const-string v2, "Alarm Saved"

    const-string v3, "SAVED"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lmp0/d0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lmp0/d0;->SAVED:Lmp0/d0;

    new-instance v0, Lmp0/d0;

    const-string v1, "Sleep Coach - View Alarm Settings Saving Failed"

    const-string v2, "Alarm Settings Saving Failed"

    const-string v3, "FAILED"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lmp0/d0;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lmp0/d0;->FAILED:Lmp0/d0;

    invoke-static {}, Lmp0/d0;->$values()[Lmp0/d0;

    move-result-object v0

    sput-object v0, Lmp0/d0;->$VALUES:[Lmp0/d0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lmp0/d0;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lmp0/d0;->eventName:Ljava/lang/String;

    iput-object p4, p0, Lmp0/d0;->objectName:Ljava/lang/String;

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

    sget-object v0, Lmp0/d0;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmp0/d0;
    .locals 1

    const-class v0, Lmp0/d0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmp0/d0;

    return-object p0
.end method

.method public static values()[Lmp0/d0;
    .locals 1

    sget-object v0, Lmp0/d0;->$VALUES:[Lmp0/d0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmp0/d0;

    return-object v0
.end method


# virtual methods
.method public final getEventName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmp0/d0;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public final getObjectName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmp0/d0;->objectName:Ljava/lang/String;

    return-object v0
.end method
