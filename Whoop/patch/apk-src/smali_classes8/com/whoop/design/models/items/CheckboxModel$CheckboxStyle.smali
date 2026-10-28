.class public final enum Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/CheckboxModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CheckboxStyle"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0087\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "MARKDOWN",
        "TRADITIONAL",
        "TOGGLE",
        "NO_LABEL",
        "V2",
        "V2_NO_LABEL",
        "Companion",
        "design-models_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle$Companion;

.field public static final enum MARKDOWN:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

.field public static final enum NO_LABEL:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

.field public static final enum TOGGLE:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

.field public static final enum TRADITIONAL:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

.field public static final enum V2:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

.field public static final enum V2_NO_LABEL:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;
    .locals 6

    sget-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->MARKDOWN:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    sget-object v1, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->TRADITIONAL:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    sget-object v2, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->TOGGLE:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    sget-object v3, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->NO_LABEL:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    sget-object v4, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->V2:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    sget-object v5, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->V2_NO_LABEL:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    const-string v1, "MARKDOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->MARKDOWN:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    new-instance v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    const-string v1, "TRADITIONAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->TRADITIONAL:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    new-instance v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    const-string v1, "TOGGLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->TOGGLE:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    new-instance v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    const-string v1, "NO_LABEL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->NO_LABEL:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    new-instance v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    const-string v1, "V2"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->V2:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    new-instance v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    const-string v1, "V2_NO_LABEL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->V2_NO_LABEL:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    invoke-static {}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->$values()[Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->$VALUES:[Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->Companion:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lw91/a;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lw91/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->$cachedSerializer$delegate:Ll83/h;

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

    const-string v0, "com.whoop.design.models.items.CheckboxModel.CheckboxStyle"

    invoke-static {}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->values()[Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->$VALUES:[Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    return-object v0
.end method
