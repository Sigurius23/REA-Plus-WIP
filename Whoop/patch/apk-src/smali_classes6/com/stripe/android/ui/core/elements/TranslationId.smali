.class public final enum Lcom/stripe/android/ui/core/elements/TranslationId;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/ui/core/elements/TranslationId;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/TranslationId;",
        "",
        "",
        "resourceId",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getResourceId",
        "()I",
        "Companion",
        "x30/s1",
        "IdealBank",
        "P24Bank",
        "EpsBank",
        "FpxBank",
        "AddressName",
        "AuBecsAccountName",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/ui/core/elements/TranslationId;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum AddressName:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lwc3/h;
        value = "address.label.name"
    .end annotation
.end field

.field public static final enum AuBecsAccountName:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lwc3/h;
        value = "upe.labels.name.onAccount"
    .end annotation
.end field

.field public static final Companion:Lx30/s1;

.field public static final enum EpsBank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lwc3/h;
        value = "upe.labels.eps.bank"
    .end annotation
.end field

.field public static final enum FpxBank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lwc3/h;
        value = "upe.labels.fpx.bank"
    .end annotation
.end field

.field public static final enum IdealBank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lwc3/h;
        value = "upe.labels.ideal.bank"
    .end annotation
.end field

.field public static final enum P24Bank:Lcom/stripe/android/ui/core/elements/TranslationId;
    .annotation runtime Lwc3/h;
        value = "upe.labels.p24.bank"
    .end annotation
.end field


# instance fields
.field private final resourceId:I


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 6

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->IdealBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v1, Lcom/stripe/android/ui/core/elements/TranslationId;->P24Bank:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v2, Lcom/stripe/android/ui/core/elements/TranslationId;->EpsBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v3, Lcom/stripe/android/ui/core/elements/TranslationId;->FpxBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v4, Lcom/stripe/android/ui/core/elements/TranslationId;->AddressName:Lcom/stripe/android/ui/core/elements/TranslationId;

    sget-object v5, Lcom/stripe/android/ui/core/elements/TranslationId;->AuBecsAccountName:Lcom/stripe/android/ui/core/elements/TranslationId;

    filled-new-array/range {v0 .. v5}, [Lcom/stripe/android/ui/core/elements/TranslationId;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x0

    const v2, 0x7f141014

    const-string v3, "IdealBank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->IdealBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x1

    const v2, 0x7f14104c

    const-string v3, "P24Bank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->P24Bank:Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x2

    const v2, 0x7f140ff7

    const-string v3, "EpsBank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->EpsBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x3

    const v2, 0x7f14100a

    const-string v3, "FpxBank"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->FpxBank:Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x4

    const v2, 0x7f140f80

    const-string v3, "AddressName"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->AddressName:Lcom/stripe/android/ui/core/elements/TranslationId;

    new-instance v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    const/4 v1, 0x5

    const v2, 0x7f140fb3

    const-string v3, "AuBecsAccountName"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/ui/core/elements/TranslationId;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->AuBecsAccountName:Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-static {}, Lcom/stripe/android/ui/core/elements/TranslationId;->$values()[Lcom/stripe/android/ui/core/elements/TranslationId;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$VALUES:[Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$ENTRIES:Lt83/a;

    new-instance v0, Lx30/s1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->Companion:Lx30/s1;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lwr1/f;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/stripe/android/ui/core/elements/TranslationId;->resourceId:I

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 8

    invoke-static {}, Lcom/stripe/android/ui/core/elements/TranslationId;->values()[Lcom/stripe/android/ui/core/elements/TranslationId;

    move-result-object v0

    const-string v5, "address.label.name"

    const-string v6, "upe.labels.name.onAccount"

    const-string v1, "upe.labels.ideal.bank"

    const-string v2, "upe.labels.p24.bank"

    const-string v3, "upe.labels.eps.bank"

    const-string v4, "upe.labels.fpx.bank"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    filled-new-array/range {v2 .. v7}, [[Ljava/lang/annotation/Annotation;

    move-result-object v2

    const-string v4, "com.stripe.android.ui.core.elements.TranslationId"

    invoke-static {v4, v0, v1, v2, v3}, Lkotlinx/serialization/internal/EnumsKt;->createAnnotatedEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/TranslationId;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$cachedSerializer$delegate:Ll83/h;

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

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 1

    const-class v0, Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/ui/core/elements/TranslationId;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->$VALUES:[Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/ui/core/elements/TranslationId;

    return-object v0
.end method


# virtual methods
.method public final getResourceId()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/TranslationId;->resourceId:I

    return v0
.end method
