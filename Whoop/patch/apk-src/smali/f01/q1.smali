.class public enum Lf01/q1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf01/q1$a;,
        Lf01/q1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf01/q1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lf01/q1;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Landroidx/compose/ui/Modifier;",
        "styleModifier",
        "Landroidx/compose/ui/Modifier;",
        "getStyleModifier",
        "()Landroidx/compose/ui/Modifier;",
        "ONBOARDING_WITH_BORDER",
        "ONBOARDING",
        "OUTLINED",
        "ADVANCED_LABS",
        "HAL",
        "PROMO_LINEAR",
        "SUFFICIENT_WITH_BORDER",
        "ELEVATED",
        "NONE",
        "design_release"
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

.field private static final synthetic $VALUES:[Lf01/q1;

.field public static final enum ADVANCED_LABS:Lf01/q1;

.field public static final enum ELEVATED:Lf01/q1;

.field public static final enum HAL:Lf01/q1;

.field public static final enum NONE:Lf01/q1;

.field public static final enum ONBOARDING:Lf01/q1;

.field public static final enum ONBOARDING_WITH_BORDER:Lf01/q1;

.field public static final enum OUTLINED:Lf01/q1;

.field public static final enum PROMO_LINEAR:Lf01/q1;

.field public static final enum SUFFICIENT_WITH_BORDER:Lf01/q1;


# instance fields
.field private final styleModifier:Landroidx/compose/ui/Modifier;


# direct methods
.method private static final synthetic $values()[Lf01/q1;
    .locals 9

    sget-object v0, Lf01/q1;->ONBOARDING_WITH_BORDER:Lf01/q1;

    sget-object v1, Lf01/q1;->ONBOARDING:Lf01/q1;

    sget-object v2, Lf01/q1;->OUTLINED:Lf01/q1;

    sget-object v3, Lf01/q1;->ADVANCED_LABS:Lf01/q1;

    sget-object v4, Lf01/q1;->HAL:Lf01/q1;

    sget-object v5, Lf01/q1;->PROMO_LINEAR:Lf01/q1;

    sget-object v6, Lf01/q1;->SUFFICIENT_WITH_BORDER:Lf01/q1;

    sget-object v7, Lf01/q1;->ELEVATED:Lf01/q1;

    sget-object v8, Lf01/q1;->NONE:Lf01/q1;

    filled-new-array/range {v0 .. v8}, [Lf01/q1;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf01/q1;

    const-string v1, "ONBOARDING_WITH_BORDER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf01/q1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf01/q1;->ONBOARDING_WITH_BORDER:Lf01/q1;

    new-instance v0, Lf01/q1;

    const-string v1, "ONBOARDING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf01/q1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf01/q1;->ONBOARDING:Lf01/q1;

    new-instance v0, Lf01/q1$b;

    const-string v1, "OUTLINED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf01/q1$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf01/q1;->OUTLINED:Lf01/q1;

    new-instance v0, Lf01/q1;

    const-string v1, "ADVANCED_LABS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf01/q1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf01/q1;->ADVANCED_LABS:Lf01/q1;

    new-instance v0, Lf01/q1$a;

    const-string v1, "HAL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lf01/q1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf01/q1;->HAL:Lf01/q1;

    new-instance v0, Lf01/q1;

    const-string v1, "PROMO_LINEAR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lf01/q1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf01/q1;->PROMO_LINEAR:Lf01/q1;

    new-instance v0, Lf01/q1;

    const-string v1, "SUFFICIENT_WITH_BORDER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lf01/q1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf01/q1;->SUFFICIENT_WITH_BORDER:Lf01/q1;

    new-instance v0, Lf01/q1;

    const-string v1, "ELEVATED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lf01/q1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf01/q1;->ELEVATED:Lf01/q1;

    new-instance v0, Lf01/q1;

    const-string v1, "NONE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lf01/q1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf01/q1;->NONE:Lf01/q1;

    invoke-static {}, Lf01/q1;->$values()[Lf01/q1;

    move-result-object v0

    sput-object v0, Lf01/q1;->$VALUES:[Lf01/q1;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lf01/q1;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    sget-object p1, Lb2/t;->w:Lb2/t;

    iput-object p1, p0, Lf01/q1;->styleModifier:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf01/q1;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lf01/q1;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf01/q1;
    .locals 1

    const-class v0, Lf01/q1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf01/q1;

    return-object p0
.end method

.method public static values()[Lf01/q1;
    .locals 1

    sget-object v0, Lf01/q1;->$VALUES:[Lf01/q1;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf01/q1;

    return-object v0
.end method


# virtual methods
.method public getStyleModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    iget-object v0, p0, Lf01/q1;->styleModifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method
