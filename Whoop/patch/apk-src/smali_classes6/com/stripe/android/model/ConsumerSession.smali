.class public final Lcom/stripe/android/model/ConsumerSession;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvy/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ConsumerSession$$serializer;,
        Lcom/stripe/android/model/ConsumerSession$VerificationSession;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u0000 M2\u00020\u0001:\u0003NOPB]\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBq\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'Jl\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u001cJ\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00108\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00086\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00109\u0012\u0004\u0008;\u0010<\u001a\u0004\u0008:\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00109\u0012\u0004\u0008>\u0010<\u001a\u0004\u0008=\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00109\u0012\u0004\u0008@\u0010<\u001a\u0004\u0008?\u0010\u001eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00109\u0012\u0004\u0008B\u0010<\u001a\u0004\u0008A\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00109\u0012\u0004\u0008D\u0010<\u001a\u0004\u0008C\u0010\u001eR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00109\u0012\u0004\u0008F\u0010<\u001a\u0004\u0008E\u0010\u001eR&\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010G\u0012\u0004\u0008I\u0010<\u001a\u0004\u0008H\u0010%R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010J\u0012\u0004\u0008L\u0010<\u001a\u0004\u0008K\u0010\'\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerSession;",
        "Lvy/b;",
        "",
        "clientSecret",
        "emailAddress",
        "redactedFormattedPhoneNumber",
        "redactedPhoneNumber",
        "unredactedPhoneNumber",
        "phoneNumberCountry",
        "",
        "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
        "verificationSessions",
        "Lcom/stripe/android/model/MobileFallbackWebviewParams;",
        "mobileFallbackWebviewParams",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "()Lcom/stripe/android/model/MobileFallbackWebviewParams;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)Lcom/stripe/android/model/ConsumerSession;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "write$Self$payments_model_release",
        "(Lcom/stripe/android/model/ConsumerSession;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getClientSecret",
        "getClientSecret$annotations",
        "()V",
        "getEmailAddress",
        "getEmailAddress$annotations",
        "getRedactedFormattedPhoneNumber",
        "getRedactedFormattedPhoneNumber$annotations",
        "getRedactedPhoneNumber",
        "getRedactedPhoneNumber$annotations",
        "getUnredactedPhoneNumber",
        "getUnredactedPhoneNumber$annotations",
        "getPhoneNumberCountry",
        "getPhoneNumberCountry$annotations",
        "Ljava/util/List;",
        "getVerificationSessions",
        "getVerificationSessions$annotations",
        "Lcom/stripe/android/model/MobileFallbackWebviewParams;",
        "getMobileFallbackWebviewParams",
        "getMobileFallbackWebviewParams$annotations",
        "Companion",
        "VerificationSession",
        "$serializer",
        "com/stripe/android/model/m",
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
.field private static final $childSerializers:[Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lwc3/c;"
        }
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/ConsumerSession;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/m;


# instance fields
.field private final clientSecret:Ljava/lang/String;

.field private final emailAddress:Ljava/lang/String;

.field private final mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

.field private final phoneNumberCountry:Ljava/lang/String;

.field private final redactedFormattedPhoneNumber:Ljava/lang/String;

.field private final redactedPhoneNumber:Ljava/lang/String;

.field private final unredactedPhoneNumber:Ljava/lang/String;

.field private final verificationSessions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/model/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ConsumerSession;->Companion:Lcom/stripe/android/model/m;

    new-instance v0, Lcom/stripe/android/model/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/ConsumerSession;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/stripe/android/model/ConsumerSession$VerificationSession$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsumerSession$VerificationSession$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    const/16 v1, 0x8

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object v3, v1, v2

    const/4 v2, 0x3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    aput-object v3, v1, v2

    const/4 v2, 0x5

    aput-object v3, v1, v2

    const/4 v2, 0x6

    aput-object v0, v1, v2

    const/4 v0, 0x7

    aput-object v3, v1, v0

    sput-object v1, Lcom/stripe/android/model/ConsumerSession;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0xe

    const/16 v0, 0xe

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/stripe/android/model/ConsumerSession$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsumerSession$$serializer;

    invoke-virtual {p10}, Lcom/stripe/android/model/ConsumerSession$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    if-nez p10, :cond_1

    .line 2
    const-string p2, ""

    .line 3
    :cond_1
    iput-object p2, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iput-object p6, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    goto :goto_1

    :cond_3
    iput-object p7, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_4

    .line 4
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 5
    iput-object p2, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    goto :goto_2

    :cond_4
    iput-object p8, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    :goto_2
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    return-void

    :cond_5
    iput-object p9, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
            ">;",
            "Lcom/stripe/android/model/MobileFallbackWebviewParams;",
            ")V"
        }
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailAddress"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "redactedFormattedPhoneNumber"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "redactedPhoneNumber"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verificationSessions"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    .line 11
    iput-object p5, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    .line 12
    iput-object p6, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    .line 13
    iput-object p7, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    .line 14
    iput-object p8, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    .line 15
    const-string p1, ""

    :cond_0
    and-int/lit8 p10, p9, 0x10

    const/4 v0, 0x0

    if-eqz p10, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_2

    move-object p6, v0

    :cond_2
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_3

    .line 16
    sget-object p7, Lm83/y;->w:Lm83/y;

    :cond_3
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_4

    move-object p10, v0

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    goto :goto_0

    :cond_4
    move-object p10, p8

    move-object p9, p7

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 17
    :goto_0
    invoke-direct/range {p2 .. p10}, Lcom/stripe/android/model/ConsumerSession;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/ConsumerSession;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerSession;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/stripe/android/model/ConsumerSession;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)Lcom/stripe/android/model/ConsumerSession;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getClientSecret$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "client_secret"
    .end annotation

    return-void
.end method

.method public static synthetic getEmailAddress$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "email_address"
    .end annotation

    return-void
.end method

.method public static synthetic getMobileFallbackWebviewParams$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "mobile_fallback_webview_params"
    .end annotation

    return-void
.end method

.method public static synthetic getPhoneNumberCountry$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "phone_number_country"
    .end annotation

    return-void
.end method

.method public static synthetic getRedactedFormattedPhoneNumber$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "redacted_formatted_phone_number"
    .end annotation

    return-void
.end method

.method public static synthetic getRedactedPhoneNumber$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "redacted_phone_number"
    .end annotation

    return-void
.end method

.method public static synthetic getUnredactedPhoneNumber$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "unredacted_phone_number"
    .end annotation

    return-void
.end method

.method public static synthetic getVerificationSessions$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "verification_sessions"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$payments_model_release(Lcom/stripe/android/model/ConsumerSession;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/stripe/android/model/ConsumerSession;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/stripe/android/model/MobileFallbackWebviewParams$$serializer;->INSTANCE:Lcom/stripe/android/model/MobileFallbackWebviewParams$$serializer;

    iget-object p0, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/stripe/android/model/MobileFallbackWebviewParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)Lcom/stripe/android/model/ConsumerSession;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
            ">;",
            "Lcom/stripe/android/model/MobileFallbackWebviewParams;",
            ")",
            "Lcom/stripe/android/model/ConsumerSession;"
        }
    .end annotation

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailAddress"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "redactedFormattedPhoneNumber"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "redactedPhoneNumber"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verificationSessions"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/model/ConsumerSession;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/model/ConsumerSession;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/MobileFallbackWebviewParams;)V

    return-object v1
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
    instance-of v1, p1, Lcom/stripe/android/model/ConsumerSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ConsumerSession;

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    iget-object p1, p1, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getEmailAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getMobileFallbackWebviewParams()Lcom/stripe/android/model/MobileFallbackWebviewParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    return-object v0
.end method

.method public final getPhoneNumberCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    return-object v0
.end method

.method public final getRedactedFormattedPhoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getRedactedPhoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnredactedPhoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getVerificationSessions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/model/MobileFallbackWebviewParams;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    iget-object v7, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    const-string v8, ", emailAddress="

    const-string v9, ", redactedFormattedPhoneNumber="

    const-string v10, "ConsumerSession(clientSecret="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", redactedPhoneNumber="

    const-string v8, ", unredactedPhoneNumber="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", phoneNumberCountry="

    const-string v2, ", verificationSessions="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mobileFallbackWebviewParams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->clientSecret:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->emailAddress:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->redactedFormattedPhoneNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->redactedPhoneNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->unredactedPhoneNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->phoneNumberCountry:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->verificationSessions:Ljava/util/List;

    invoke-static {v0, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-virtual {v1, p1, p2}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession;->mobileFallbackWebviewParams:Lcom/stripe/android/model/MobileFallbackWebviewParams;

    if-nez v0, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/MobileFallbackWebviewParams;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
