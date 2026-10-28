.class public final Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$$serializer;,
        Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tBC\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0010\u0010!\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008,\u0010\u001b\u00a8\u0006/"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;",
        "",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;",
        "address",
        "",
        "email",
        "name",
        "phone",
        "<init>",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "copy",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;",
        "getAddress",
        "Ljava/lang/String;",
        "getEmail",
        "getName",
        "getPhone",
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$Companion;


# instance fields
.field private final address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

.field private final email:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final phone:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$$serializer;

    invoke-virtual {p6}, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->copy(Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/Address$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address$$serializer;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;
    .locals 1

    new-instance v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;-><init>(Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAddress()Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    return-object v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPhone()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->address:Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->email:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->name:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;->phone:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "BillingDetails(address="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", email="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", phone="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
