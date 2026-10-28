.class public final Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$$serializer;,
        Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEB\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u009d\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0018J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u0018J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u0018J\u009c\u0001\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00107\u001a\u0004\u00089\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u0008:\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00107\u001a\u0004\u0008;\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00107\u001a\u0004\u0008<\u0010\u0018R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u0008=\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u0008>\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u0008?\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u0008@\u0010\u0018R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00107\u001a\u0004\u0008A\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00107\u001a\u0004\u0008B\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00107\u001a\u0004\u0008C\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00107\u001a\u0004\u0008D\u0010\u0018\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;",
        "",
        "",
        "firstName",
        "lastName",
        "line1",
        "line2",
        "line3",
        "country",
        "city",
        "province",
        "state",
        "postalCode",
        "phone",
        "identificationNumber",
        "shortAddress",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getFirstName",
        "getLastName",
        "getLine1",
        "getLine2",
        "getLine3",
        "getCountry",
        "getCity",
        "getProvince",
        "getState",
        "getPostalCode",
        "getPhone",
        "getIdentificationNumber",
        "getShortAddress",
        "Companion",
        "$serializer",
        "universal-checkout_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$Companion;


# instance fields
.field private final city:Ljava/lang/String;

.field private final country:Ljava/lang/String;

.field private final firstName:Ljava/lang/String;

.field private final identificationNumber:Ljava/lang/String;

.field private final lastName:Ljava/lang/String;

.field private final line1:Ljava/lang/String;

.field private final line2:Ljava/lang/String;

.field private final line3:Ljava/lang/String;

.field private final phone:Ljava/lang/String;

.field private final postalCode:Ljava/lang/String;

.field private final province:Ljava/lang/String;

.field private final shortAddress:Ljava/lang/String;

.field private final state:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->Companion:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x6e7

    const/16 v1, 0x6e7

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$$serializer;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    :goto_1
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p10, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    :goto_2
    iput-object p11, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p13, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    :goto_3
    and-int/lit16 p1, p1, 0x1000

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    return-void

    :cond_5
    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "firstName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "line1"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "city"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "province"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postalCode"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phone"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    move-object v12, v2

    goto :goto_2

    :cond_2
    move-object/from16 v12, p9

    :goto_2
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_3

    move-object v15, v2

    goto :goto_3

    :cond_3
    move-object/from16 v15, p12

    :goto_3
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_4

    move-object/from16 v16, v2

    :goto_4
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    goto :goto_5

    :cond_4
    move-object/from16 v16, p13

    goto :goto_4

    .line 16
    :goto_5
    invoke-direct/range {v3 .. v16}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0x9

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xa

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;
    .locals 15

    const-string v0, "firstName"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "line1"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "city"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "province"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "postalCode"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phone"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v10, p9

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getCity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    return-object v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirstName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final getIdentificationNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLine1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    return-object v0
.end method

.method public final getLine2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    return-object v0
.end method

.method public final getLine3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    return-object v0
.end method

.method public final getPhone()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    return-object v0
.end method

.method public final getPostalCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getProvince()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    return-object v0
.end method

.method public final getShortAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->firstName:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->lastName:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line1:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line2:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->line3:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->country:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->city:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->province:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->state:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->postalCode:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->phone:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->identificationNumber:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;->shortAddress:Ljava/lang/String;

    const-string v14, ", lastName="

    const-string v15, ", line1="

    const-string v0, "ShippingAddressRequestBody(firstName="

    invoke-static {v0, v1, v14, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", line2="

    const-string v2, ", line3="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", country="

    const-string v2, ", city="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", province="

    const-string v2, ", state="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", postalCode="

    const-string v2, ", phone="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", identificationNumber="

    const-string v2, ", shortAddress="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v13, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
