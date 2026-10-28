.class public final enum Lcom/whoop/navigation/ChatEntrypointExperience;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/ChatEntrypointExperience$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/navigation/ChatEntrypointExperience;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000f\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/navigation/ChatEntrypointExperience;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "a",
        "STANDARD",
        "FAB_VOICE",
        "QUICK_VOICE",
        "QUICK_KEYBOARD",
        "QUICK_CAMERA_ROLL",
        "QUICK_FILES",
        "QUICK_CAMERA_FRONT",
        "QUICK_CAMERA_BACK",
        "QUICK_HISTORY",
        "FORM_INPUT_ONLY",
        "navigation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/navigation/ChatEntrypointExperience;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/navigation/ChatEntrypointExperience$a;

.field public static final enum FAB_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public static final enum FORM_INPUT_ONLY:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public static final enum QUICK_CAMERA_BACK:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public static final enum QUICK_CAMERA_FRONT:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public static final enum QUICK_CAMERA_ROLL:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public static final enum QUICK_FILES:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public static final enum QUICK_HISTORY:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public static final enum QUICK_KEYBOARD:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public static final enum QUICK_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public static final enum STANDARD:Lcom/whoop/navigation/ChatEntrypointExperience;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/navigation/ChatEntrypointExperience;
    .locals 10

    sget-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->STANDARD:Lcom/whoop/navigation/ChatEntrypointExperience;

    sget-object v1, Lcom/whoop/navigation/ChatEntrypointExperience;->FAB_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

    sget-object v2, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

    sget-object v3, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_KEYBOARD:Lcom/whoop/navigation/ChatEntrypointExperience;

    sget-object v4, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_CAMERA_ROLL:Lcom/whoop/navigation/ChatEntrypointExperience;

    sget-object v5, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_FILES:Lcom/whoop/navigation/ChatEntrypointExperience;

    sget-object v6, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_CAMERA_FRONT:Lcom/whoop/navigation/ChatEntrypointExperience;

    sget-object v7, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_CAMERA_BACK:Lcom/whoop/navigation/ChatEntrypointExperience;

    sget-object v8, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_HISTORY:Lcom/whoop/navigation/ChatEntrypointExperience;

    sget-object v9, Lcom/whoop/navigation/ChatEntrypointExperience;->FORM_INPUT_ONLY:Lcom/whoop/navigation/ChatEntrypointExperience;

    filled-new-array/range {v0 .. v9}, [Lcom/whoop/navigation/ChatEntrypointExperience;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "STANDARD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->STANDARD:Lcom/whoop/navigation/ChatEntrypointExperience;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "FAB_VOICE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->FAB_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "QUICK_VOICE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "QUICK_KEYBOARD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_KEYBOARD:Lcom/whoop/navigation/ChatEntrypointExperience;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "QUICK_CAMERA_ROLL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_CAMERA_ROLL:Lcom/whoop/navigation/ChatEntrypointExperience;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "QUICK_FILES"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_FILES:Lcom/whoop/navigation/ChatEntrypointExperience;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "QUICK_CAMERA_FRONT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_CAMERA_FRONT:Lcom/whoop/navigation/ChatEntrypointExperience;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "QUICK_CAMERA_BACK"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_CAMERA_BACK:Lcom/whoop/navigation/ChatEntrypointExperience;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "QUICK_HISTORY"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_HISTORY:Lcom/whoop/navigation/ChatEntrypointExperience;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    const-string v1, "FORM_INPUT_ONLY"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/whoop/navigation/ChatEntrypointExperience;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->FORM_INPUT_ONLY:Lcom/whoop/navigation/ChatEntrypointExperience;

    invoke-static {}, Lcom/whoop/navigation/ChatEntrypointExperience;->$values()[Lcom/whoop/navigation/ChatEntrypointExperience;

    move-result-object v0

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->$VALUES:[Lcom/whoop/navigation/ChatEntrypointExperience;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/navigation/ChatEntrypointExperience$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/ChatEntrypointExperience$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->Companion:Lcom/whoop/navigation/ChatEntrypointExperience$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lim1/l0;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lim1/l0;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->$cachedSerializer$delegate:Ll83/h;

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

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.navigation.ChatEntrypointExperience"

    invoke-static {}, Lcom/whoop/navigation/ChatEntrypointExperience;->values()[Lcom/whoop/navigation/ChatEntrypointExperience;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/ChatEntrypointExperience;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/navigation/ChatEntrypointExperience;
    .locals 1

    const-class v0, Lcom/whoop/navigation/ChatEntrypointExperience;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/navigation/ChatEntrypointExperience;

    return-object p0
.end method

.method public static values()[Lcom/whoop/navigation/ChatEntrypointExperience;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->$VALUES:[Lcom/whoop/navigation/ChatEntrypointExperience;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/navigation/ChatEntrypointExperience;

    return-object v0
.end method
