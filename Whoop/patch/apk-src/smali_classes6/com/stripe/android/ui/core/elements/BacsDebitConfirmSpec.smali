.class public final Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;
.super Lcom/stripe/android/ui/core/elements/FormItemSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 &2\u00020\u0001:\u0002\'(B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B%\u0008\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0002\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004\u00a2\u0006\u0004\u0008 \u0010!R \u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\"\u0012\u0004\u0008%\u0010\u0003\u001a\u0004\u0008#\u0010$\u00a8\u0006)"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "<init>",
        "()V",
        "",
        "seen0",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "apiPath",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_ui_core_release",
        "(Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "merchantName",
        "",
        "initialValues",
        "Lg40/e0;",
        "transform",
        "(Ljava/lang/String;Ljava/util/Map;)Lg40/e0;",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath$annotations",
        "Companion",
        "$serializer",
        "com/stripe/android/ui/core/elements/g",
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/g;


# instance fields
.field private final apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->Companion:Lcom/stripe/android/ui/core/elements/g;

    new-instance v0, Lx30/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lx30/a;-><init>(I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    sget v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    sput v0, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getBacsDebitConfirmed$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method

.method public constructor <init>(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    const/4 p3, 0x0

    .line 1
    invoke-direct {p0, p3}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getBacsDebitConfirmed$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    .line 4
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void

    :cond_0
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void
.end method

.method public static synthetic getApiPath$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self$payments_ui_core_release(Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getBacsDebitConfirmed$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final transform(Ljava/lang/String;Ljava/util/Map;)Lg40/e0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lg40/e0;"
        }
    .end annotation

    const-string v0, "merchantName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg40/e0;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    new-instance v2, Lg40/d0;

    new-instance v3, Le10/k0;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/16 v4, 0x12

    invoke-direct {v3, p1, v4}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-direct {v2, v3, p1}, Lg40/d0;-><init>(Le10/k0;Z)V

    invoke-direct {v0, v1, v2}, Lg40/e0;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/d0;)V

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
