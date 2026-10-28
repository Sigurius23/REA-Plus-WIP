.class public final Lcom/stripe/android/ui/core/elements/OTPSpec;
.super Lcom/stripe/android/ui/core/elements/FormItemSpec;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/OTPSpec;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "<init>",
        "()V",
        "Lg40/o1;",
        "transform",
        "()Lg40/o1;",
        "Landroid/os/Parcel;",
        "dest",
        "",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "apiPath",
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
.field private static final synthetic $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/ui/core/elements/OTPSpec;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/ui/core/elements/OTPSpec;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/OTPSpec;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/OTPSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;

    new-instance v0, Lx30/a;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lx30/a;-><init>(I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/OTPSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lwr1/f;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/OTPSpec;->$cachedSerializer$delegate:Ll83/h;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/ui/core/elements/OTPSpec;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lkotlinx/serialization/internal/ObjectSerializer;

    sget-object v1, Lcom/stripe/android/ui/core/elements/OTPSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    const-string v3, "com.stripe.android.ui.core.elements.OTPSpec"

    invoke-direct {v0, v3, v1, v2}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/OTPSpec;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private final synthetic get$cachedSerializer()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/OTPSpec;->$cachedSerializer$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/stripe/android/ui/core/elements/OTPSpec;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "otp"

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x3f3e7949

    return v0
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/ui/core/elements/OTPSpec;->get$cachedSerializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "OTPSpec"

    return-object v0
.end method

.method public final transform()Lg40/o1;
    .locals 3

    new-instance v0, Lg40/o1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/OTPSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    new-instance v2, Lg40/m1;

    invoke-direct {v2}, Lg40/m1;-><init>()V

    invoke-direct {v0, v1, v2}, Lg40/o1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/m1;)V

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
