.class public final enum Li01/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li01/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Li01/i;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "DEFAULT",
        "SAVINGS",
        "CURRENT",
        "CURRENT_WITH_CHECKMARK",
        "BLUE",
        "CHROMATIC",
        "BLUE_SIMPLE",
        "BLUE_SIMPLE_SELECTED",
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

.field private static final synthetic $VALUES:[Li01/i;

.field public static final enum BLUE:Li01/i;

.field public static final enum BLUE_SIMPLE:Li01/i;

.field public static final enum BLUE_SIMPLE_SELECTED:Li01/i;

.field public static final enum CHROMATIC:Li01/i;

.field public static final enum CURRENT:Li01/i;

.field public static final enum CURRENT_WITH_CHECKMARK:Li01/i;

.field public static final enum DEFAULT:Li01/i;

.field public static final enum SAVINGS:Li01/i;


# direct methods
.method private static final synthetic $values()[Li01/i;
    .locals 8

    sget-object v0, Li01/i;->DEFAULT:Li01/i;

    sget-object v1, Li01/i;->SAVINGS:Li01/i;

    sget-object v2, Li01/i;->CURRENT:Li01/i;

    sget-object v3, Li01/i;->CURRENT_WITH_CHECKMARK:Li01/i;

    sget-object v4, Li01/i;->BLUE:Li01/i;

    sget-object v5, Li01/i;->CHROMATIC:Li01/i;

    sget-object v6, Li01/i;->BLUE_SIMPLE:Li01/i;

    sget-object v7, Li01/i;->BLUE_SIMPLE_SELECTED:Li01/i;

    filled-new-array/range {v0 .. v7}, [Li01/i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li01/i;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li01/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li01/i;->DEFAULT:Li01/i;

    new-instance v0, Li01/i;

    const-string v1, "SAVINGS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li01/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li01/i;->SAVINGS:Li01/i;

    new-instance v0, Li01/i;

    const-string v1, "CURRENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Li01/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li01/i;->CURRENT:Li01/i;

    new-instance v0, Li01/i;

    const-string v1, "CURRENT_WITH_CHECKMARK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Li01/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li01/i;->CURRENT_WITH_CHECKMARK:Li01/i;

    new-instance v0, Li01/i;

    const-string v1, "BLUE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Li01/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li01/i;->BLUE:Li01/i;

    new-instance v0, Li01/i;

    const-string v1, "CHROMATIC"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li01/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li01/i;->CHROMATIC:Li01/i;

    new-instance v0, Li01/i;

    const-string v1, "BLUE_SIMPLE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Li01/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li01/i;->BLUE_SIMPLE:Li01/i;

    new-instance v0, Li01/i;

    const-string v1, "BLUE_SIMPLE_SELECTED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Li01/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li01/i;->BLUE_SIMPLE_SELECTED:Li01/i;

    invoke-static {}, Li01/i;->$values()[Li01/i;

    move-result-object v0

    sput-object v0, Li01/i;->$VALUES:[Li01/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Li01/i;->$ENTRIES:Lt83/a;

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

    sget-object v0, Li01/i;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li01/i;
    .locals 1

    const-class v0, Li01/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li01/i;

    return-object p0
.end method

.method public static values()[Li01/i;
    .locals 1

    sget-object v0, Li01/i;->$VALUES:[Li01/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li01/i;

    return-object v0
.end method
