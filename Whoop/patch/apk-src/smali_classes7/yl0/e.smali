.class public final enum Lyl0/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyl0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lyl0/e;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "IDLE",
        "LOADING",
        "SUCCESS",
        "RETRYABLE_ERROR",
        "TERMINAL_ERROR",
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

.field private static final synthetic $VALUES:[Lyl0/e;

.field public static final enum IDLE:Lyl0/e;

.field public static final enum LOADING:Lyl0/e;

.field public static final enum RETRYABLE_ERROR:Lyl0/e;

.field public static final enum SUCCESS:Lyl0/e;

.field public static final enum TERMINAL_ERROR:Lyl0/e;


# direct methods
.method private static final synthetic $values()[Lyl0/e;
    .locals 5

    sget-object v0, Lyl0/e;->IDLE:Lyl0/e;

    sget-object v1, Lyl0/e;->LOADING:Lyl0/e;

    sget-object v2, Lyl0/e;->SUCCESS:Lyl0/e;

    sget-object v3, Lyl0/e;->RETRYABLE_ERROR:Lyl0/e;

    sget-object v4, Lyl0/e;->TERMINAL_ERROR:Lyl0/e;

    filled-new-array {v0, v1, v2, v3, v4}, [Lyl0/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyl0/e;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lyl0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyl0/e;->IDLE:Lyl0/e;

    new-instance v0, Lyl0/e;

    const-string v1, "LOADING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lyl0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyl0/e;->LOADING:Lyl0/e;

    new-instance v0, Lyl0/e;

    const-string v1, "SUCCESS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lyl0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyl0/e;->SUCCESS:Lyl0/e;

    new-instance v0, Lyl0/e;

    const-string v1, "RETRYABLE_ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lyl0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyl0/e;->RETRYABLE_ERROR:Lyl0/e;

    new-instance v0, Lyl0/e;

    const-string v1, "TERMINAL_ERROR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lyl0/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lyl0/e;->TERMINAL_ERROR:Lyl0/e;

    invoke-static {}, Lyl0/e;->$values()[Lyl0/e;

    move-result-object v0

    sput-object v0, Lyl0/e;->$VALUES:[Lyl0/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lyl0/e;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lyl0/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyl0/e;
    .locals 1

    const-class v0, Lyl0/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyl0/e;

    return-object p0
.end method

.method public static values()[Lyl0/e;
    .locals 1

    sget-object v0, Lyl0/e;->$VALUES:[Lyl0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyl0/e;

    return-object v0
.end method
