.class public final Lcom/stripe/android/ui/core/elements/EmptyFormSpec;
.super Lcom/stripe/android/ui/core/elements/FormItemSpec;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00000\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u000cJ\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R \u0010\u001a\u001a\u00020\u00198\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u0012\u0004\u0008\u001e\u0010\u0003\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/EmptyFormSpec;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "<init>",
        "()V",
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
        "apiPath",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath$annotations",
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
            "Lcom/stripe/android/ui/core/elements/EmptyFormSpec;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

.field private static final apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "empty"

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    new-instance v0, Lx30/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lx30/a;-><init>(I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lwr1/f;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->$cachedSerializer$delegate:Ll83/h;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->$stable:I

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

    sget-object v1, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    const-string v3, "com.stripe.android.ui.core.elements.EmptyFormSpec"

    invoke-direct {v0, v3, v1, v2}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private final synthetic get$cachedSerializer()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->$cachedSerializer$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/c;

    return-object v0
.end method

.method public static synthetic getApiPath$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "api_path"
    .end annotation

    return-void
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
    instance-of p1, p1, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x2e80577d

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

    invoke-direct {p0}, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->get$cachedSerializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyFormSpec"

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
