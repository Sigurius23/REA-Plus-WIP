.class public final enum Lil1/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lil1/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lil1/j;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SLEEP_NEED_LEARN_MORE",
        "WHOOP_SERVER_OUTAGE",
        "home_release"
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

.field private static final synthetic $VALUES:[Lil1/j;

.field public static final enum SLEEP_NEED_LEARN_MORE:Lil1/j;

.field public static final enum WHOOP_SERVER_OUTAGE:Lil1/j;


# direct methods
.method private static final synthetic $values()[Lil1/j;
    .locals 2

    sget-object v0, Lil1/j;->SLEEP_NEED_LEARN_MORE:Lil1/j;

    sget-object v1, Lil1/j;->WHOOP_SERVER_OUTAGE:Lil1/j;

    filled-new-array {v0, v1}, [Lil1/j;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lil1/j;

    const-string v1, "SLEEP_NEED_LEARN_MORE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lil1/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lil1/j;->SLEEP_NEED_LEARN_MORE:Lil1/j;

    new-instance v0, Lil1/j;

    const-string v1, "WHOOP_SERVER_OUTAGE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lil1/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lil1/j;->WHOOP_SERVER_OUTAGE:Lil1/j;

    invoke-static {}, Lil1/j;->$values()[Lil1/j;

    move-result-object v0

    sput-object v0, Lil1/j;->$VALUES:[Lil1/j;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lil1/j;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lil1/j;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lil1/j;
    .locals 1

    const-class v0, Lil1/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lil1/j;

    return-object p0
.end method

.method public static values()[Lil1/j;
    .locals 1

    sget-object v0, Lil1/j;->$VALUES:[Lil1/j;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lil1/j;

    return-object v0
.end method
