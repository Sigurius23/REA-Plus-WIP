.class public final Lcom/stripe/android/link/serialization/PopupPayload;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/serialization/PopupPayload$$serializer;,
        Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;,
        Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;,
        Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;,
        Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008;\u0008\u0081\u0008\u0018\u0000 |2\u00020\u0001:\u000b}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001B\u00a3\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0014\u0012\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u008d\u0002\u0008\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u0019\u0010#J\r\u0010$\u001a\u00020\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010%J\u0010\u0010(\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010%J\u0010\u0010/\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010%J\u0010\u00100\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010%J\u0010\u00101\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010%J\u0010\u00102\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010%J\u0010\u00103\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u001c\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0016\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010:J\u001c\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u00108J\u00ca\u0001\u0010<\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u00142\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00162\u0014\u0008\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014H\u00c6\u0001\u00a2\u0006\u0004\u0008<\u0010=J\u0010\u0010>\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008>\u0010%J\u0010\u0010?\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008?\u0010@J\u001a\u0010B\u001a\u00020\u00102\u0008\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\'\u0010L\u001a\u00020I2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0001\u00a2\u0006\u0004\u0008J\u0010KR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010M\u0012\u0004\u0008O\u0010P\u001a\u0004\u0008N\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010M\u0012\u0004\u0008R\u0010P\u001a\u0004\u0008Q\u0010%R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010S\u0012\u0004\u0008U\u0010P\u001a\u0004\u0008T\u0010)R \u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010V\u0012\u0004\u0008X\u0010P\u001a\u0004\u0008W\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010Y\u0012\u0004\u0008[\u0010P\u001a\u0004\u0008Z\u0010-R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010M\u0012\u0004\u0008]\u0010P\u001a\u0004\u0008\\\u0010%R \u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010M\u0012\u0004\u0008_\u0010P\u001a\u0004\u0008^\u0010%R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010M\u0012\u0004\u0008a\u0010P\u001a\u0004\u0008`\u0010%R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010M\u0012\u0004\u0008c\u0010P\u001a\u0004\u0008b\u0010%R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010M\u0012\u0004\u0008e\u0010P\u001a\u0004\u0008d\u0010%R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010f\u0012\u0004\u0008h\u0010P\u001a\u0004\u0008g\u00104R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010i\u0012\u0004\u0008k\u0010P\u001a\u0004\u0008j\u00106R,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010l\u0012\u0004\u0008n\u0010P\u001a\u0004\u0008m\u00108R&\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010o\u0012\u0004\u0008q\u0010P\u001a\u0004\u0008p\u0010:R,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010l\u0012\u0004\u0008s\u0010P\u001a\u0004\u0008r\u00108R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087D\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010M\u0012\u0004\u0008u\u0010P\u001a\u0004\u0008t\u0010%R \u0010\u001e\u001a\u00020\u00028\u0006X\u0087D\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010M\u0012\u0004\u0008w\u0010P\u001a\u0004\u0008v\u0010%R,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010l\u0012\u0004\u0008y\u0010P\u001a\u0004\u0008x\u00108R,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008 \u0010l\u0012\u0004\u0008{\u0010P\u001a\u0004\u0008z\u00108\u00a8\u0006\u0084\u0001"
    }
    d2 = {
        "Lcom/stripe/android/link/serialization/PopupPayload;",
        "",
        "",
        "publishableKey",
        "stripeAccount",
        "Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;",
        "merchantInfo",
        "Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;",
        "customerInfo",
        "Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;",
        "paymentInfo",
        "appId",
        "locale",
        "paymentUserAgent",
        "paymentObject",
        "intentMode",
        "",
        "setupFutureUsage",
        "Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;",
        "cardBrandChoice",
        "",
        "flags",
        "",
        "linkFundingSources",
        "clientAttributionMetadata",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V",
        "",
        "seen0",
        "path",
        "integrationType",
        "loggerMetadata",
        "experiments",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "toUrl",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "()Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;",
        "component4",
        "()Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;",
        "component5",
        "()Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Z",
        "component12",
        "()Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;",
        "component13",
        "()Ljava/util/Map;",
        "component14",
        "()Ljava/util/List;",
        "component15",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)Lcom/stripe/android/link/serialization/PopupPayload;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$paymentsheet_release",
        "(Lcom/stripe/android/link/serialization/PopupPayload;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getPublishableKey",
        "getPublishableKey$annotations",
        "()V",
        "getStripeAccount",
        "getStripeAccount$annotations",
        "Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;",
        "getMerchantInfo",
        "getMerchantInfo$annotations",
        "Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;",
        "getCustomerInfo",
        "getCustomerInfo$annotations",
        "Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;",
        "getPaymentInfo",
        "getPaymentInfo$annotations",
        "getAppId",
        "getAppId$annotations",
        "getLocale",
        "getLocale$annotations",
        "getPaymentUserAgent",
        "getPaymentUserAgent$annotations",
        "getPaymentObject",
        "getPaymentObject$annotations",
        "getIntentMode",
        "getIntentMode$annotations",
        "Z",
        "getSetupFutureUsage",
        "getSetupFutureUsage$annotations",
        "Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;",
        "getCardBrandChoice",
        "getCardBrandChoice$annotations",
        "Ljava/util/Map;",
        "getFlags",
        "getFlags$annotations",
        "Ljava/util/List;",
        "getLinkFundingSources",
        "getLinkFundingSources$annotations",
        "getClientAttributionMetadata",
        "getClientAttributionMetadata$annotations",
        "getPath",
        "getPath$annotations",
        "getIntegrationType",
        "getIntegrationType$annotations",
        "getLoggerMetadata",
        "getLoggerMetadata$annotations",
        "getExperiments",
        "getExperiments$annotations",
        "Companion",
        "MerchantInfo",
        "CustomerInfo",
        "PaymentInfo",
        "CardBrandChoice",
        "f00/a",
        "com/stripe/android/link/serialization/b",
        "$serializer",
        "paymentsheet_release"
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

.field public static final $stable:I = 0x8

.field public static final Companion:Lcom/stripe/android/link/serialization/b;

.field private static final MOBILE_SESSION_ID_KEY:Ljava/lang/String; = "mobile_session_id"

.field private static final PopupPayloadJson:Lad3/c;

.field private static final baseUrl:Ljava/lang/String; = "https://checkout.link.com/#"


# instance fields
.field private final appId:Ljava/lang/String;

.field private final cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

.field private final clientAttributionMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

.field private final experiments:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final flags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final integrationType:Ljava/lang/String;

.field private final intentMode:Ljava/lang/String;

.field private final linkFundingSources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final locale:Ljava/lang/String;

.field private final loggerMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

.field private final path:Ljava/lang/String;

.field private final paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

.field private final paymentObject:Ljava/lang/String;

.field private final paymentUserAgent:Ljava/lang/String;

.field private final publishableKey:Ljava/lang/String;

.field private final setupFutureUsage:Z

.field private final stripeAccount:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/stripe/android/link/serialization/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->Companion:Lcom/stripe/android/link/serialization/b;

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    new-instance v2, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-direct {v2, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    new-instance v3, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    invoke-direct {v3, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    new-instance v4, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    invoke-direct {v4, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    new-instance v5, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    invoke-direct {v5, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    const/16 v1, 0x13

    new-array v1, v1, [Lwc3/c;

    const/4 v6, 0x0

    const/4 v7, 0x0

    aput-object v7, v1, v6

    const/4 v6, 0x1

    aput-object v7, v1, v6

    const/4 v6, 0x2

    aput-object v7, v1, v6

    const/4 v6, 0x3

    aput-object v7, v1, v6

    const/4 v6, 0x4

    aput-object v7, v1, v6

    const/4 v6, 0x5

    aput-object v7, v1, v6

    const/4 v6, 0x6

    aput-object v7, v1, v6

    const/4 v6, 0x7

    aput-object v7, v1, v6

    const/16 v6, 0x8

    aput-object v7, v1, v6

    const/16 v6, 0x9

    aput-object v7, v1, v6

    const/16 v6, 0xa

    aput-object v7, v1, v6

    const/16 v6, 0xb

    aput-object v7, v1, v6

    const/16 v6, 0xc

    aput-object v0, v1, v6

    const/16 v0, 0xd

    aput-object v2, v1, v0

    const/16 v0, 0xe

    aput-object v3, v1, v0

    const/16 v2, 0xf

    aput-object v7, v1, v2

    const/16 v2, 0x10

    aput-object v7, v1, v2

    const/16 v2, 0x11

    aput-object v4, v1, v2

    const/16 v2, 0x12

    aput-object v5, v1, v2

    sput-object v1, Lcom/stripe/android/link/serialization/PopupPayload;->$childSerializers:[Lwc3/c;

    new-instance v1, Lev2/b;

    invoke-direct {v1, v0}, Lev2/b;-><init>(I)V

    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-static {v0, v1}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->PopupPayloadJson:Lad3/c;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x7fff

    const/16 v1, 0x7fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$$serializer;

    invoke-virtual {v0}, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    iput-object p5, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    iput-object p6, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    iput-object p7, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    iput-object p8, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    iput-object p9, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    iput-object p10, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    iput-object p11, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    iput-object p13, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_1

    .line 2
    const-string p2, "mobile_pay"

    .line 3
    :goto_0
    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 p2, p17

    goto :goto_0

    :goto_1
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_2

    .line 4
    const-string p2, "mobile"

    .line 5
    :goto_2
    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    goto :goto_3

    :cond_2
    move-object/from16 p2, p18

    goto :goto_2

    :goto_3
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_3

    .line 6
    sget-object p2, Lyy/c;->g:Ljava/util/UUID;

    .line 7
    sget-object p2, Lyy/c;->g:Ljava/util/UUID;

    .line 8
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    .line 9
    const-string p3, "mobile_session_id"

    invoke-static {p3, p2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    .line 10
    :goto_4
    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    goto :goto_5

    :cond_3
    move-object/from16 p2, p19

    goto :goto_4

    :goto_5
    const/high16 p2, 0x40000

    and-int/2addr p1, p2

    if-nez p1, :cond_4

    .line 11
    sget-object p1, Lm83/z;->w:Lm83/z;

    .line 12
    :goto_6
    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    return-void

    :cond_4
    move-object/from16 p1, p20

    goto :goto_6
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;",
            "Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;",
            "Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v0, p6

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    move-object/from16 v3, p9

    move-object/from16 v4, p10

    move-object/from16 v5, p13

    move-object/from16 v6, p14

    move-object/from16 v7, p15

    const-string v8, "publishableKey"

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "merchantInfo"

    invoke-static {p3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "customerInfo"

    invoke-static {p4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "appId"

    invoke-static {p6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "locale"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "paymentUserAgent"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "paymentObject"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "intentMode"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "flags"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "linkFundingSources"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "clientAttributionMetadata"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    .line 19
    iput-object p3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    .line 20
    iput-object p4, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    .line 21
    iput-object p5, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    .line 22
    iput-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    .line 23
    iput-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    .line 24
    iput-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    .line 25
    iput-object v3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    .line 26
    iput-object v4, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    move/from16 p1, p11

    .line 27
    iput-boolean p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    move-object/from16 p1, p12

    .line 28
    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    .line 29
    iput-object v5, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    .line 30
    iput-object v6, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    .line 31
    iput-object v7, p0, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    .line 32
    const-string p1, "mobile_pay"

    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    .line 33
    const-string p1, "mobile"

    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    .line 34
    sget-object p1, Lyy/c;->g:Ljava/util/UUID;

    .line 35
    sget-object p1, Lyy/c;->g:Ljava/util/UUID;

    .line 36
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    .line 37
    const-string p2, "mobile_session_id"

    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    .line 39
    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    return-void
.end method

.method private static final PopupPayloadJson$lambda$0(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->a:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/serialization/PopupPayload;->PopupPayloadJson$lambda$0(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static final synthetic access$getPopupPayloadJson$cp()Lad3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->PopupPayloadJson:Lad3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/serialization/PopupPayload;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/link/serialization/PopupPayload;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    move-object/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_f

    :cond_e
    move-object/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/stripe/android/link/serialization/PopupPayload;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)Lcom/stripe/android/link/serialization/PopupPayload;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAppId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "appId"
    .end annotation

    return-void
.end method

.method public static synthetic getCardBrandChoice$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cardBrandChoice"
    .end annotation

    return-void
.end method

.method public static synthetic getClientAttributionMetadata$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "clientAttributionMetadata"
    .end annotation

    return-void
.end method

.method public static synthetic getCustomerInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "customerInfo"
    .end annotation

    return-void
.end method

.method public static synthetic getExperiments$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "experiments"
    .end annotation

    return-void
.end method

.method public static synthetic getFlags$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "flags"
    .end annotation

    return-void
.end method

.method public static synthetic getIntegrationType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "integrationType"
    .end annotation

    return-void
.end method

.method public static synthetic getIntentMode$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "intentMode"
    .end annotation

    return-void
.end method

.method public static synthetic getLinkFundingSources$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "linkFundingSources"
    .end annotation

    return-void
.end method

.method public static synthetic getLocale$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "locale"
    .end annotation

    return-void
.end method

.method public static synthetic getLoggerMetadata$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "loggerMetadata"
    .end annotation

    return-void
.end method

.method public static synthetic getMerchantInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "merchantInfo"
    .end annotation

    return-void
.end method

.method public static synthetic getPath$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "path"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "paymentInfo"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentObject$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "paymentObject"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentUserAgent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "paymentUserAgent"
    .end annotation

    return-void
.end method

.method public static synthetic getPublishableKey$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "publishableKey"
    .end annotation

    return-void
.end method

.method public static synthetic getSetupFutureUsage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "setupFutureUsage"
    .end annotation

    return-void
.end method

.method public static synthetic getStripeAccount$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "stripeAccount"
    .end annotation

    return-void
.end method

.method public static final write$Self$paymentsheet_release(Lcom/stripe/android/link/serialization/PopupPayload;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xa

    iget-boolean v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    const/16 v3, 0xb

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xc

    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xd

    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xe

    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    const-string v3, "mobile_pay"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/16 v1, 0x10

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    const-string v3, "mobile"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/16 v1, 0x11

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    sget-object v3, Lyy/c;->g:Ljava/util/UUID;

    sget-object v3, Lyy/c;->g:Ljava/util/UUID;

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ll83/k;

    const-string v5, "mobile_session_id"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x12

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    return v0
.end method

.method public final component12()Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    return-object v0
.end method

.method public final component13()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)Lcom/stripe/android/link/serialization/PopupPayload;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;",
            "Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;",
            "Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/serialization/PopupPayload;"
        }
    .end annotation

    const-string v0, "publishableKey"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantInfo"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerInfo"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appId"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentUserAgent"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentObject"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentMode"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flags"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkFundingSources"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientAttributionMetadata"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/link/serialization/PopupPayload;

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/stripe/android/link/serialization/PopupPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/serialization/PopupPayload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/serialization/PopupPayload;

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    iget-object p1, p1, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getAppId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCardBrandChoice()Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    return-object v0
.end method

.method public final getClientAttributionMetadata()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    return-object v0
.end method

.method public final getCustomerInfo()Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    return-object v0
.end method

.method public final getExperiments()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    return-object v0
.end method

.method public final getFlags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    return-object v0
.end method

.method public final getIntegrationType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntentMode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkFundingSources()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    return-object v0
.end method

.method public final getLocale()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    return-object v0
.end method

.method public final getLoggerMetadata()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    return-object v0
.end method

.method public final getMerchantInfo()Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentInfo()Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    return-object v0
.end method

.method public final getPaymentObject()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentUserAgent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSetupFutureUsage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    return v0
.end method

.method public final getStripeAccount()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    invoke-virtual {v2}, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    invoke-virtual {v0}, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    iget-object v3, v0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    iget-object v4, v0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    iget-object v5, v0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    iget-object v6, v0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    iget-object v7, v0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    iget-object v8, v0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    iget-object v9, v0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    iget-object v10, v0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    iget-boolean v11, v0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    iget-object v12, v0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    iget-object v13, v0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    iget-object v14, v0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    iget-object v15, v0, Lcom/stripe/android/link/serialization/PopupPayload;->clientAttributionMetadata:Ljava/util/Map;

    const-string v0, ", stripeAccount="

    move-object/from16 v16, v15

    const-string v15, ", merchantInfo="

    move-object/from16 v17, v14

    const-string v14, "PopupPayload(publishableKey="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customerInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", appId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", locale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentUserAgent="

    const-string v2, ", paymentObject="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", intentMode="

    const-string v2, ", setupFutureUsage="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cardBrandChoice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkFundingSources="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientAttributionMetadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v16

    invoke-static {v0, v2, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toUrl()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->PopupPayloadJson:Lad3/c;

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload;->Companion:Lcom/stripe/android/link/serialization/b;

    invoke-virtual {v1}, Lcom/stripe/android/link/serialization/b;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://checkout.link.com/#"

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
