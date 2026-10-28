.class public final Lcom/stripe/android/model/DisplayablePaymentDetails;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/DisplayablePaymentDetails$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:;B7\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tBC\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J@\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010 J\u0010\u0010(\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001eJ\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010.\u0012\u0004\u00080\u00101\u001a\u0004\u0008/\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010.\u0012\u0004\u00083\u00101\u001a\u0004\u00082\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010.\u0012\u0004\u00085\u00101\u001a\u0004\u00084\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00106\u0012\u0004\u00088\u00101\u001a\u0004\u00087\u0010$\u00a8\u0006<"
    }
    d2 = {
        "Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "Lvy/b;",
        "",
        "defaultCardBrand",
        "defaultPaymentType",
        "last4",
        "",
        "numberOfSavedPaymentDetails",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_model_release",
        "(Lcom/stripe/android/model/DisplayablePaymentDetails;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/lang/Long;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getDefaultCardBrand",
        "getDefaultCardBrand$annotations",
        "()V",
        "getDefaultPaymentType",
        "getDefaultPaymentType$annotations",
        "getLast4",
        "getLast4$annotations",
        "Ljava/lang/Long;",
        "getNumberOfSavedPaymentDetails",
        "getNumberOfSavedPaymentDetails$annotations",
        "Companion",
        "$serializer",
        "com/stripe/android/model/z",
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/DisplayablePaymentDetails;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/z;


# instance fields
.field private final defaultCardBrand:Ljava/lang/String;

.field private final defaultPaymentType:Ljava/lang/String;

.field private final last4:Ljava/lang/String;

.field private final numberOfSavedPaymentDetails:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/DisplayablePaymentDetails;->Companion:Lcom/stripe/android/model/z;

    new-instance v0, Ly00/x0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ly00/x0;-><init>(I)V

    sput-object v0, Lcom/stripe/android/model/DisplayablePaymentDetails;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/model/DisplayablePaymentDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x0

    if-nez p6, :cond_0

    iput-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/model/DisplayablePaymentDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/DisplayablePaymentDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)Lcom/stripe/android/model/DisplayablePaymentDetails;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/model/DisplayablePaymentDetails;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDefaultCardBrand$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "default_card_brand"
    .end annotation

    return-void
.end method

.method public static synthetic getDefaultPaymentType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "default_payment_type"
    .end annotation

    return-void
.end method

.method public static synthetic getLast4$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "last_4"
    .end annotation

    return-void
.end method

.method public static synthetic getNumberOfSavedPaymentDetails$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "number_of_saved_payment_details"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$payments_model_release(Lcom/stripe/android/model/DisplayablePaymentDetails;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object p0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/stripe/android/model/DisplayablePaymentDetails;
    .locals 1

    new-instance v0, Lcom/stripe/android/model/DisplayablePaymentDetails;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/model/DisplayablePaymentDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/DisplayablePaymentDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/DisplayablePaymentDetails;

    iget-object v1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    iget-object p1, p1, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDefaultCardBrand()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefaultPaymentType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getLast4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    return-object v0
.end method

.method public final getNumberOfSavedPaymentDetails()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    const-string v4, ", defaultPaymentType="

    const-string v5, ", last4="

    const-string v6, "DisplayablePaymentDetails(defaultCardBrand="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", numberOfSavedPaymentDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultCardBrand:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->defaultPaymentType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->last4:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/model/DisplayablePaymentDetails;->numberOfSavedPaymentDetails:Ljava/lang/Long;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
