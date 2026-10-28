.class public final enum Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "g40/g",
        "HIDDEN",
        "OPTIONAL",
        "REQUIRED",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lg40/g;

.field public static final enum HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .annotation runtime Lwc3/h;
        value = "hidden"
    .end annotation
.end field

.field public static final enum OPTIONAL:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .annotation runtime Lwc3/h;
        value = "optional"
    .end annotation
.end field

.field public static final enum REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .annotation runtime Lwc3/h;
        value = "required"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 3

    sget-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    sget-object v1, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->OPTIONAL:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    sget-object v2, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    const-string v1, "HIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    const-string v1, "OPTIONAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->OPTIONAL:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    const-string v1, "REQUIRED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-static {}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->$values()[Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->$VALUES:[Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->$ENTRIES:Lt83/a;

    new-instance v0, Lg40/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->Companion:Lg40/g;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lfw0/a;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lfw0/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->$cachedSerializer$delegate:Ll83/h;

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
    .locals 5

    invoke-static {}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->values()[Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v0

    const-string v1, "optional"

    const-string v2, "required"

    const-string v3, "hidden"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    filled-new-array {v2, v2, v2}, [[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const-string v4, "com.stripe.android.uicore.elements.AddressFieldConfiguration"

    invoke-static {v4, v0, v1, v3, v2}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    const-class v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->$VALUES:[Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    return-object v0
.end method
