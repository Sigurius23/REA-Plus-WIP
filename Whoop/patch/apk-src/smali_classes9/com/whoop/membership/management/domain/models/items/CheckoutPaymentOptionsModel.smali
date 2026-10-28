.class public final Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$$serializer;,
        Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 ,2\u00020\u0001:\u0002-,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tBA\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0010\u0010!\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010$\u001a\u00020\u00062\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010&\u001a\u0004\u0008\'\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010&\u001a\u0004\u0008(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010&\u001a\u0004\u0008)\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010*\u001a\u0004\u0008+\u0010\u001d\u00a8\u0006."
    }
    d2 = {
        "Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;",
        "",
        "",
        "title",
        "existingLabel",
        "alternateLabel",
        "",
        "zipCodeRequired",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$membership_release",
        "(Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Z",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getExistingLabel",
        "getAlternateLabel",
        "Z",
        "getZipCodeRequired",
        "Companion",
        "$serializer",
        "membership_release"
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

.field public static final Companion:Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$Companion;


# instance fields
.field private final alternateLabel:Ljava/lang/String;

.field private final existingLabel:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final zipCodeRequired:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->Companion:Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$$serializer;->INSTANCE:Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alternateLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-boolean p0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alternateLabel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    iget-boolean p1, p1, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAlternateLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getExistingLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getZipCodeRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->existingLabel:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->alternateLabel:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/whoop/membership/management/domain/models/items/CheckoutPaymentOptionsModel;->zipCodeRequired:Z

    const-string v4, ", existingLabel="

    const-string v5, ", alternateLabel="

    const-string v6, "CheckoutPaymentOptionsModel(title="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", zipCodeRequired="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
