.class public final enum Lcom/stripe/android/ui/core/elements/Capitalization;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/Capitalization;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/Capitalization;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "x30/m",
        "None",
        "Characters",
        "Words",
        "Sentences",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/Capitalization;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum Characters:Lcom/stripe/android/ui/core/elements/Capitalization;
    .annotation runtime Lwc3/h;
        value = "characters"
    .end annotation
.end field

.field public static final Companion:Lx30/m;

.field public static final enum None:Lcom/stripe/android/ui/core/elements/Capitalization;
    .annotation runtime Lwc3/h;
        value = "none"
    .end annotation
.end field

.field public static final enum Sentences:Lcom/stripe/android/ui/core/elements/Capitalization;
    .annotation runtime Lwc3/h;
        value = "sentences"
    .end annotation
.end field

.field public static final enum Words:Lcom/stripe/android/ui/core/elements/Capitalization;
    .annotation runtime Lwc3/h;
        value = "words"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/Capitalization;
    .locals 4

    sget-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->None:Lcom/stripe/android/ui/core/elements/Capitalization;

    sget-object v1, Lcom/stripe/android/ui/core/elements/Capitalization;->Characters:Lcom/stripe/android/ui/core/elements/Capitalization;

    sget-object v2, Lcom/stripe/android/ui/core/elements/Capitalization;->Words:Lcom/stripe/android/ui/core/elements/Capitalization;

    sget-object v3, Lcom/stripe/android/ui/core/elements/Capitalization;->Sentences:Lcom/stripe/android/ui/core/elements/Capitalization;

    filled-new-array {v0, v1, v2, v3}, [Lcom/stripe/android/ui/core/elements/Capitalization;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->None:Lcom/stripe/android/ui/core/elements/Capitalization;

    new-instance v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    const-string v1, "Characters"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->Characters:Lcom/stripe/android/ui/core/elements/Capitalization;

    new-instance v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    const-string v1, "Words"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->Words:Lcom/stripe/android/ui/core/elements/Capitalization;

    new-instance v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    const-string v1, "Sentences"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/Capitalization;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->Sentences:Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/Capitalization;->$values()[Lcom/stripe/android/ui/core/elements/Capitalization;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$VALUES:[Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$ENTRIES:Lt83/a;

    new-instance v0, Lx30/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->Companion:Lx30/m;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lwr1/f;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$cachedSerializer$delegate:Ll83/h;

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

    invoke-static {}, Lcom/stripe/android/ui/core/elements/Capitalization;->values()[Lcom/stripe/android/ui/core/elements/Capitalization;

    move-result-object v0

    const-string v1, "words"

    const-string v2, "sentences"

    const-string v3, "none"

    const-string v4, "characters"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    filled-new-array {v2, v2, v2, v2}, [[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const-string v4, "com.stripe.android.ui.core.elements.Capitalization"

    invoke-static {v4, v0, v1, v3, v2}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/Capitalization;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/Capitalization;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/elements/Capitalization;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/Capitalization;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/Capitalization;->$VALUES:[Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/ui/core/elements/Capitalization;

    return-object v0
.end method
