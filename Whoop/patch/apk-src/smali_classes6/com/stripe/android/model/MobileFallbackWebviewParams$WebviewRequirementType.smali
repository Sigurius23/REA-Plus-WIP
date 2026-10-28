.class public final enum Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/MobileFallbackWebviewParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "WebviewRequirementType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "Companion",
        "com/stripe/android/model/d0",
        "Unknown",
        "Required",
        "NotRequired",
        "payments-model_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/d0;

.field public static final enum NotRequired:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

.field public static final enum Required:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

.field public static final enum Unknown:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;
    .locals 3

    sget-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->Unknown:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    sget-object v1, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->Required:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    sget-object v2, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->NotRequired:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    const/4 v1, 0x0

    const-string v2, ""

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->Unknown:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    new-instance v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    const/4 v1, 0x1

    const-string v2, "required"

    const-string v3, "Required"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->Required:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    new-instance v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    const/4 v1, 0x2

    const-string v2, "notrequired"

    const-string v3, "NotRequired"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->NotRequired:Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    invoke-static {}, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->$values()[Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->$VALUES:[Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/stripe/android/model/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->Companion:Lcom/stripe/android/model/d0;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lxo1/a;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lxo1/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->value:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.stripe.android.model.MobileFallbackWebviewParams.WebviewRequirementType"

    invoke-static {}, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->values()[Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;
    .locals 1

    const-class v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->$VALUES:[Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;->value:Ljava/lang/String;

    return-object v0
.end method
