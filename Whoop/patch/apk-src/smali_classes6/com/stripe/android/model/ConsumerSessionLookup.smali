.class public final Lcom/stripe/android/model/ConsumerSessionLookup;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ConsumerSessionLookup$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000 M2\u00020\u0001:\u0002NOBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB_\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\"Jb\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\"J\u0010\u0010,\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001cJ\u001a\u0010/\u001a\u00020\u00022\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00108\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00086\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00109\u0012\u0004\u0008;\u0010<\u001a\u0004\u0008:\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010=\u0012\u0004\u0008?\u0010<\u001a\u0004\u0008>\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010@\u0012\u0004\u0008B\u0010<\u001a\u0004\u0008A\u0010\"R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010@\u0012\u0004\u0008D\u0010<\u001a\u0004\u0008C\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010E\u0012\u0004\u0008G\u0010<\u001a\u0004\u0008F\u0010%R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010H\u0012\u0004\u0008J\u0010<\u001a\u0004\u0008I\u0010\'R\"\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010@\u0012\u0004\u0008L\u0010<\u001a\u0004\u0008K\u0010\"\u00a8\u0006P"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerSessionLookup;",
        "Lvy/b;",
        "",
        "exists",
        "Lcom/stripe/android/model/ConsumerSession;",
        "consumerSession",
        "",
        "errorMessage",
        "publishableKey",
        "Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "displayablePaymentDetails",
        "Lcom/stripe/android/model/ConsentUi;",
        "consentUi",
        "suggestedEmail",
        "<init>",
        "(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "component1",
        "()Z",
        "component2",
        "()Lcom/stripe/android/model/ConsumerSession;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "()Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "component6",
        "()Lcom/stripe/android/model/ConsentUi;",
        "component7",
        "copy",
        "(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)Lcom/stripe/android/model/ConsumerSessionLookup;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "write$Self$payments_model_release",
        "(Lcom/stripe/android/model/ConsumerSessionLookup;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Z",
        "getExists",
        "getExists$annotations",
        "()V",
        "Lcom/stripe/android/model/ConsumerSession;",
        "getConsumerSession",
        "getConsumerSession$annotations",
        "Ljava/lang/String;",
        "getErrorMessage",
        "getErrorMessage$annotations",
        "getPublishableKey",
        "getPublishableKey$annotations",
        "Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "getDisplayablePaymentDetails",
        "getDisplayablePaymentDetails$annotations",
        "Lcom/stripe/android/model/ConsentUi;",
        "getConsentUi",
        "getConsentUi$annotations",
        "getSuggestedEmail",
        "getSuggestedEmail$annotations",
        "Companion",
        "$serializer",
        "com/stripe/android/model/w",
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
            "Lcom/stripe/android/model/ConsumerSessionLookup;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/w;


# instance fields
.field private final consentUi:Lcom/stripe/android/model/ConsentUi;

.field private final consumerSession:Lcom/stripe/android/model/ConsumerSession;

.field private final displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

.field private final errorMessage:Ljava/lang/String;

.field private final exists:Z

.field private final publishableKey:Ljava/lang/String;

.field private final suggestedEmail:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/w;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ConsumerSessionLookup;->Companion:Lcom/stripe/android/model/w;

    new-instance v0, Ly00/k;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Ly00/k;-><init>(I)V

    sput-object v0, Lcom/stripe/android/model/ConsumerSessionLookup;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(IZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/stripe/android/model/ConsumerSessionLookup$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsumerSessionLookup$$serializer;

    invoke-virtual {p9}, Lcom/stripe/android/model/ConsumerSessionLookup$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    and-int/lit8 p2, p1, 0x2

    const/4 p9, 0x0

    if-nez p2, :cond_1

    iput-object p9, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p9, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p9, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p9, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p9, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    :goto_4
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p9, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    .line 4
    iput-object p2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    .line 5
    iput-object p3, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    .line 8
    iput-object p6, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    .line 9
    iput-object p7, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_5

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/stripe/android/model/ConsumerSessionLookup;-><init>(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ConsumerSessionLookup;ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerSessionLookup;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/model/ConsumerSessionLookup;->copy(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)Lcom/stripe/android/model/ConsumerSessionLookup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getConsentUi$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "consent_ui"
    .end annotation

    return-void
.end method

.method public static synthetic getConsumerSession$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "consumer_session"
    .end annotation

    return-void
.end method

.method public static synthetic getDisplayablePaymentDetails$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "displayable_payment_details"
    .end annotation

    return-void
.end method

.method public static synthetic getErrorMessage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "error_message"
    .end annotation

    return-void
.end method

.method public static synthetic getExists$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "exists"
    .end annotation

    return-void
.end method

.method public static synthetic getPublishableKey$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "publishable_key"
    .end annotation

    return-void
.end method

.method public static synthetic getSuggestedEmail$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "suggested_email"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$payments_model_release(Lcom/stripe/android/model/ConsumerSessionLookup;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/model/ConsumerSession$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsumerSession$$serializer;

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/stripe/android/model/DisplayablePaymentDetails$$serializer;->INSTANCE:Lcom/stripe/android/model/DisplayablePaymentDetails$$serializer;

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/stripe/android/model/ConsentUi$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsentUi$$serializer;

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    return v0
.end method

.method public final component2()Lcom/stripe/android/model/ConsumerSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/model/DisplayablePaymentDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/model/ConsentUi;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)Lcom/stripe/android/model/ConsumerSessionLookup;
    .locals 8

    new-instance v0, Lcom/stripe/android/model/ConsumerSessionLookup;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/model/ConsumerSessionLookup;-><init>(ZLcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DisplayablePaymentDetails;Lcom/stripe/android/model/ConsentUi;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/model/ConsumerSessionLookup;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ConsumerSessionLookup;

    iget-boolean v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    iget-boolean v3, p1, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getConsentUi()Lcom/stripe/android/model/ConsentUi;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    return-object v0
.end method

.method public final getConsumerSession()Lcom/stripe/android/model/ConsumerSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    return-object v0
.end method

.method public final getDisplayablePaymentDetails()Lcom/stripe/android/model/DisplayablePaymentDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    return-object v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getExists()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    return v0
.end method

.method public final getPublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuggestedEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/stripe/android/model/DisplayablePaymentDetails;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsentUi;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    iget-object v5, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    iget-object v6, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "ConsumerSessionLookup(exists="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", consumerSession="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", publishableKey="

    const-string v1, ", displayablePaymentDetails="

    invoke-static {v7, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", consentUi="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", suggestedEmail="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->exists:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consumerSession:Lcom/stripe/android/model/ConsumerSession;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ConsumerSession;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->errorMessage:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->publishableKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->displayablePaymentDetails:Lcom/stripe/android/model/DisplayablePaymentDetails;

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/DisplayablePaymentDetails;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->consentUi:Lcom/stripe/android/model/ConsentUi;

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ConsentUi;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object p2, p0, Lcom/stripe/android/model/ConsumerSessionLookup;->suggestedEmail:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
