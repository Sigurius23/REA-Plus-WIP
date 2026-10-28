.class public final enum Lcom/amplitude/android/engagement/types/IconType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amplitude/android/engagement/types/IconType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0087\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/IconType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "lj/n",
        "HELP_CIRCLE",
        "HELP_SQUARE",
        "INFO_CIRCLE",
        "BOOK_CLOSED",
        "LIGHT_BULB",
        "LIGHTNING",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amplitude/android/engagement/types/IconType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum BOOK_CLOSED:Lcom/amplitude/android/engagement/types/IconType;
    .annotation runtime Lwc3/h;
        value = "bookClosed"
    .end annotation
.end field

.field public static final Companion:Llj/n;

.field public static final enum HELP_CIRCLE:Lcom/amplitude/android/engagement/types/IconType;
    .annotation runtime Lwc3/h;
        value = "helpCircle"
    .end annotation
.end field

.field public static final enum HELP_SQUARE:Lcom/amplitude/android/engagement/types/IconType;
    .annotation runtime Lwc3/h;
        value = "helpSquare"
    .end annotation
.end field

.field public static final enum INFO_CIRCLE:Lcom/amplitude/android/engagement/types/IconType;
    .annotation runtime Lwc3/h;
        value = "infoCircle"
    .end annotation
.end field

.field public static final enum LIGHTNING:Lcom/amplitude/android/engagement/types/IconType;
    .annotation runtime Lwc3/h;
        value = "lightning"
    .end annotation
.end field

.field public static final enum LIGHT_BULB:Lcom/amplitude/android/engagement/types/IconType;
    .annotation runtime Lwc3/h;
        value = "lightBulb"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/amplitude/android/engagement/types/IconType;
    .locals 6

    sget-object v0, Lcom/amplitude/android/engagement/types/IconType;->HELP_CIRCLE:Lcom/amplitude/android/engagement/types/IconType;

    sget-object v1, Lcom/amplitude/android/engagement/types/IconType;->HELP_SQUARE:Lcom/amplitude/android/engagement/types/IconType;

    sget-object v2, Lcom/amplitude/android/engagement/types/IconType;->INFO_CIRCLE:Lcom/amplitude/android/engagement/types/IconType;

    sget-object v3, Lcom/amplitude/android/engagement/types/IconType;->BOOK_CLOSED:Lcom/amplitude/android/engagement/types/IconType;

    sget-object v4, Lcom/amplitude/android/engagement/types/IconType;->LIGHT_BULB:Lcom/amplitude/android/engagement/types/IconType;

    sget-object v5, Lcom/amplitude/android/engagement/types/IconType;->LIGHTNING:Lcom/amplitude/android/engagement/types/IconType;

    filled-new-array/range {v0 .. v5}, [Lcom/amplitude/android/engagement/types/IconType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/amplitude/android/engagement/types/IconType;

    const-string v1, "HELP_CIRCLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/IconType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/IconType;->HELP_CIRCLE:Lcom/amplitude/android/engagement/types/IconType;

    new-instance v0, Lcom/amplitude/android/engagement/types/IconType;

    const-string v1, "HELP_SQUARE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/IconType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/IconType;->HELP_SQUARE:Lcom/amplitude/android/engagement/types/IconType;

    new-instance v0, Lcom/amplitude/android/engagement/types/IconType;

    const-string v1, "INFO_CIRCLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/IconType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/IconType;->INFO_CIRCLE:Lcom/amplitude/android/engagement/types/IconType;

    new-instance v0, Lcom/amplitude/android/engagement/types/IconType;

    const-string v1, "BOOK_CLOSED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/IconType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/IconType;->BOOK_CLOSED:Lcom/amplitude/android/engagement/types/IconType;

    new-instance v0, Lcom/amplitude/android/engagement/types/IconType;

    const-string v1, "LIGHT_BULB"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/IconType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/IconType;->LIGHT_BULB:Lcom/amplitude/android/engagement/types/IconType;

    new-instance v0, Lcom/amplitude/android/engagement/types/IconType;

    const-string v1, "LIGHTNING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/IconType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/IconType;->LIGHTNING:Lcom/amplitude/android/engagement/types/IconType;

    invoke-static {}, Lcom/amplitude/android/engagement/types/IconType;->$values()[Lcom/amplitude/android/engagement/types/IconType;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/IconType;->$VALUES:[Lcom/amplitude/android/engagement/types/IconType;

    new-instance v0, Llj/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/IconType;->Companion:Llj/n;

    sget-object v0, Ll83/i;->x:Ll83/i;

    sget-object v1, Llj/b;->I:Llj/b;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/IconType;->$cachedSerializer$delegate:Ll83/h;

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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/IconType;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amplitude/android/engagement/types/IconType;
    .locals 1

    const-class v0, Lcom/amplitude/android/engagement/types/IconType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amplitude/android/engagement/types/IconType;

    return-object p0
.end method

.method public static values()[Lcom/amplitude/android/engagement/types/IconType;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/IconType;->$VALUES:[Lcom/amplitude/android/engagement/types/IconType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amplitude/android/engagement/types/IconType;

    return-object v0
.end method
