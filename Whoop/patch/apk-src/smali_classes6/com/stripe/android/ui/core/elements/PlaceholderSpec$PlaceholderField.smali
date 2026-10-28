.class public final enum Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/PlaceholderSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PlaceholderField"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "com/stripe/android/ui/core/elements/w",
        "Name",
        "Email",
        "Phone",
        "BillingAddress",
        "BillingAddressWithoutCountry",
        "SepaMandate",
        "Unknown",
        "payments-ui-core_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lwc3/h;
        value = "billing_address"
    .end annotation
.end field

.field public static final enum BillingAddressWithoutCountry:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lwc3/h;
        value = "billing_address_without_country"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/w;

.field public static final enum Email:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lwc3/h;
        value = "email"
    .end annotation
.end field

.field public static final enum Name:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lwc3/h;
        value = "name"
    .end annotation
.end field

.field public static final enum Phone:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lwc3/h;
        value = "phone"
    .end annotation
.end field

.field public static final enum SepaMandate:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lwc3/h;
        value = "sepa_mandate"
    .end annotation
.end field

.field public static final enum Unknown:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .annotation runtime Lwc3/h;
        value = "unknown"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .locals 7

    sget-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Name:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v1, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Email:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v2, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Phone:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v3, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v4, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddressWithoutCountry:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v5, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->SepaMandate:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    sget-object v6, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Unknown:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    filled-new-array/range {v0 .. v6}, [Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "Name"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Name:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "Email"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Email:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "Phone"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Phone:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "BillingAddress"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "BillingAddressWithoutCountry"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddressWithoutCountry:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "SepaMandate"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->SepaMandate:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    const-string v1, "Unknown"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Unknown:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$values()[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$VALUES:[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/stripe/android/ui/core/elements/w;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Companion:Lcom/stripe/android/ui/core/elements/w;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lwr1/f;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$cachedSerializer$delegate:Ll83/h;

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
    .locals 9

    invoke-static {}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->values()[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object v0

    const-string v6, "sepa_mandate"

    const-string v7, "unknown"

    const-string v1, "name"

    const-string v2, "email"

    const-string v3, "phone"

    const-string v4, "billing_address"

    const-string v5, "billing_address_without_country"

    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    filled-new-array/range {v2 .. v8}, [[Ljava/lang/annotation/Annotation;

    move-result-object v2

    const-string v4, "com.stripe.android.ui.core.elements.PlaceholderSpec.PlaceholderField"

    invoke-static {v4, v0, v1, v2, v3}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->$VALUES:[Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    return-object v0
.end method
