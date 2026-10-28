.class public final enum Lcom/stripe/hcaptcha/config/HCaptchaOrientation;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "v40/b",
        "PORTRAIT",
        "LANDSCAPE",
        "hcaptcha_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lv40/b;

.field public static final enum LANDSCAPE:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;
    .annotation runtime Lwc3/h;
        value = "landscape"
    .end annotation
.end field

.field public static final enum PORTRAIT:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;
    .annotation runtime Lwc3/h;
        value = "portrait"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/hcaptcha/config/HCaptchaOrientation;
    .locals 2

    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->PORTRAIT:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->LANDSCAPE:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    filled-new-array {v0, v1}, [Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    const-string v1, "PORTRAIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->PORTRAIT:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    new-instance v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    const-string v1, "LANDSCAPE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->LANDSCAPE:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    invoke-static {}, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->$values()[Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    move-result-object v0

    sput-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->$VALUES:[Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->$ENTRIES:Lt83/a;

    new-instance v0, Lv40/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->Companion:Lv40/b;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lut2/a;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lut2/a;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->$cachedSerializer$delegate:Ll83/h;

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

    invoke-static {}, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->values()[Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    move-result-object v0

    const-string v1, "portrait"

    const-string v2, "landscape"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    filled-new-array {v2, v2}, [[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const-string v4, "com.stripe.hcaptcha.config.HCaptchaOrientation"

    invoke-static {v4, v0, v1, v3, v2}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/hcaptcha/config/HCaptchaOrientation;
    .locals 1

    const-class v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    return-object p0
.end method

.method public static values()[Lcom/stripe/hcaptcha/config/HCaptchaOrientation;
    .locals 1

    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->$VALUES:[Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    return-object v0
.end method
