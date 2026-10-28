.class public final enum Lcom/amplitude/android/engagement/types/FormFactorType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amplitude/android/engagement/types/FormFactorType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0087\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/FormFactorType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "lj/k",
        "MODAL",
        "POPOVER",
        "BANNER",
        "PIN",
        "TOOLTIP",
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
.field private static final synthetic $VALUES:[Lcom/amplitude/android/engagement/types/FormFactorType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum BANNER:Lcom/amplitude/android/engagement/types/FormFactorType;
    .annotation runtime Lwc3/h;
        value = "banner"
    .end annotation
.end field

.field public static final Companion:Llj/k;

.field public static final enum MODAL:Lcom/amplitude/android/engagement/types/FormFactorType;
    .annotation runtime Lwc3/h;
        value = "modal"
    .end annotation
.end field

.field public static final enum PIN:Lcom/amplitude/android/engagement/types/FormFactorType;
    .annotation runtime Lwc3/h;
        value = "pin"
    .end annotation
.end field

.field public static final enum POPOVER:Lcom/amplitude/android/engagement/types/FormFactorType;
    .annotation runtime Lwc3/h;
        value = "popover"
    .end annotation
.end field

.field public static final enum TOOLTIP:Lcom/amplitude/android/engagement/types/FormFactorType;
    .annotation runtime Lwc3/h;
        value = "tooltip"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/amplitude/android/engagement/types/FormFactorType;
    .locals 5

    sget-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->MODAL:Lcom/amplitude/android/engagement/types/FormFactorType;

    sget-object v1, Lcom/amplitude/android/engagement/types/FormFactorType;->POPOVER:Lcom/amplitude/android/engagement/types/FormFactorType;

    sget-object v2, Lcom/amplitude/android/engagement/types/FormFactorType;->BANNER:Lcom/amplitude/android/engagement/types/FormFactorType;

    sget-object v3, Lcom/amplitude/android/engagement/types/FormFactorType;->PIN:Lcom/amplitude/android/engagement/types/FormFactorType;

    sget-object v4, Lcom/amplitude/android/engagement/types/FormFactorType;->TOOLTIP:Lcom/amplitude/android/engagement/types/FormFactorType;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/amplitude/android/engagement/types/FormFactorType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/amplitude/android/engagement/types/FormFactorType;

    const-string v1, "MODAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/FormFactorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->MODAL:Lcom/amplitude/android/engagement/types/FormFactorType;

    new-instance v0, Lcom/amplitude/android/engagement/types/FormFactorType;

    const-string v1, "POPOVER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/FormFactorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->POPOVER:Lcom/amplitude/android/engagement/types/FormFactorType;

    new-instance v0, Lcom/amplitude/android/engagement/types/FormFactorType;

    const-string v1, "BANNER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/FormFactorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->BANNER:Lcom/amplitude/android/engagement/types/FormFactorType;

    new-instance v0, Lcom/amplitude/android/engagement/types/FormFactorType;

    const-string v1, "PIN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/FormFactorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->PIN:Lcom/amplitude/android/engagement/types/FormFactorType;

    new-instance v0, Lcom/amplitude/android/engagement/types/FormFactorType;

    const-string v1, "TOOLTIP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/FormFactorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->TOOLTIP:Lcom/amplitude/android/engagement/types/FormFactorType;

    invoke-static {}, Lcom/amplitude/android/engagement/types/FormFactorType;->$values()[Lcom/amplitude/android/engagement/types/FormFactorType;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->$VALUES:[Lcom/amplitude/android/engagement/types/FormFactorType;

    new-instance v0, Llj/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->Companion:Llj/k;

    sget-object v0, Ll83/i;->x:Ll83/i;

    sget-object v1, Llj/b;->G:Llj/b;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amplitude/android/engagement/types/FormFactorType;
    .locals 1

    const-class v0, Lcom/amplitude/android/engagement/types/FormFactorType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amplitude/android/engagement/types/FormFactorType;

    return-object p0
.end method

.method public static values()[Lcom/amplitude/android/engagement/types/FormFactorType;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/FormFactorType;->$VALUES:[Lcom/amplitude/android/engagement/types/FormFactorType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amplitude/android/engagement/types/FormFactorType;

    return-object v0
.end method
