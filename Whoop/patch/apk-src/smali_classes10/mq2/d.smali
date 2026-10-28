.class final enum Lmq2/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmq2/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lmq2/d;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "WAITING_TO_ENTER",
        "ENTERING",
        "ENTERED",
        "WAITING_TO_EXIT",
        "EXITING",
        "user-journey_release"
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

.field private static final synthetic $VALUES:[Lmq2/d;

.field public static final enum ENTERED:Lmq2/d;

.field public static final enum ENTERING:Lmq2/d;

.field public static final enum EXITING:Lmq2/d;

.field public static final enum WAITING_TO_ENTER:Lmq2/d;

.field public static final enum WAITING_TO_EXIT:Lmq2/d;


# direct methods
.method private static final synthetic $values()[Lmq2/d;
    .locals 5

    sget-object v0, Lmq2/d;->WAITING_TO_ENTER:Lmq2/d;

    sget-object v1, Lmq2/d;->ENTERING:Lmq2/d;

    sget-object v2, Lmq2/d;->ENTERED:Lmq2/d;

    sget-object v3, Lmq2/d;->WAITING_TO_EXIT:Lmq2/d;

    sget-object v4, Lmq2/d;->EXITING:Lmq2/d;

    filled-new-array {v0, v1, v2, v3, v4}, [Lmq2/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmq2/d;

    const-string v1, "WAITING_TO_ENTER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmq2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmq2/d;->WAITING_TO_ENTER:Lmq2/d;

    new-instance v0, Lmq2/d;

    const-string v1, "ENTERING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmq2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmq2/d;->ENTERING:Lmq2/d;

    new-instance v0, Lmq2/d;

    const-string v1, "ENTERED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmq2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmq2/d;->ENTERED:Lmq2/d;

    new-instance v0, Lmq2/d;

    const-string v1, "WAITING_TO_EXIT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lmq2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmq2/d;->WAITING_TO_EXIT:Lmq2/d;

    new-instance v0, Lmq2/d;

    const-string v1, "EXITING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lmq2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmq2/d;->EXITING:Lmq2/d;

    invoke-static {}, Lmq2/d;->$values()[Lmq2/d;

    move-result-object v0

    sput-object v0, Lmq2/d;->$VALUES:[Lmq2/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lmq2/d;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lmq2/d;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmq2/d;
    .locals 1

    const-class v0, Lmq2/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmq2/d;

    return-object p0
.end method

.method public static values()[Lmq2/d;
    .locals 1

    sget-object v0, Lmq2/d;->$VALUES:[Lmq2/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmq2/d;

    return-object v0
.end method
