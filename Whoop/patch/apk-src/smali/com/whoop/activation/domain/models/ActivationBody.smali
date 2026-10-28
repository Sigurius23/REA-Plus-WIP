.class public final Lcom/whoop/activation/domain/models/ActivationBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/ActivationBody$$serializer;,
        Lcom/whoop/activation/domain/models/ActivationBody$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B?\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBQ\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJR\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010*\u001a\u00020\u00052\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00080\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00081\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00083\u0010\"R\u0017\u0010\n\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010/\u001a\u0004\u00084\u0010\u001f\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/ActivationBody;",
        "",
        "",
        "stripeToken",
        "zipCode",
        "",
        "consentsAccepted",
        "marketingOptIn",
        "Lr80/a;",
        "billingFrequency",
        "recommendationOptIn",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZZLr80/a;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$activation_release",
        "(Lcom/whoop/activation/domain/models/ActivationBody;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "component5",
        "()Lr80/a;",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;Z)Lcom/whoop/activation/domain/models/ActivationBody;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getStripeToken",
        "getZipCode",
        "Z",
        "getConsentsAccepted",
        "getMarketingOptIn",
        "Lr80/a;",
        "getBillingFrequency",
        "getRecommendationOptIn",
        "Companion",
        "$serializer",
        "activation_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/activation/domain/models/ActivationBody$Companion;


# instance fields
.field private final billingFrequency:Lr80/a;

.field private final consentsAccepted:Z

.field private final marketingOptIn:Z

.field private final recommendationOptIn:Z

.field private final stripeToken:Ljava/lang/String;

.field private final zipCode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/activation/domain/models/ActivationBody$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/domain/models/ActivationBody$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/domain/models/ActivationBody;->Companion:Lcom/whoop/activation/domain/models/ActivationBody$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lq41/a;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lq41/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v0, v2, v3

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/activation/domain/models/ActivationBody;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZZLr80/a;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3d

    const/16 v0, 0x3d

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/activation/domain/models/ActivationBody$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/ActivationBody$$serializer;

    invoke-virtual {p8}, Lcom/whoop/activation/domain/models/ActivationBody$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    :goto_0
    iput-boolean p4, p0, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    iput-boolean p5, p0, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    iput-object p6, p0, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    iput-boolean p7, p0, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/whoop/activation/domain/models/ActivationBody;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.activation.view.screens.billingfrequency.BillingFrequency"

    invoke-static {}, Lr80/a;->values()[Lr80/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/ActivationBody;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/ActivationBody;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/activation/domain/models/ActivationBody;Ljava/lang/String;Ljava/lang/String;ZZLr80/a;ZILjava/lang/Object;)Lcom/whoop/activation/domain/models/ActivationBody;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/activation/domain/models/ActivationBody;->copy(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;Z)Lcom/whoop/activation/domain/models/ActivationBody;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$activation_release(Lcom/whoop/activation/domain/models/ActivationBody;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/activation/domain/models/ActivationBody;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    if-eqz v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-boolean p0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    return v0
.end method

.method public final component5()Lr80/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;Z)Lcom/whoop/activation/domain/models/ActivationBody;
    .locals 7

    new-instance v0, Lcom/whoop/activation/domain/models/ActivationBody;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/whoop/activation/domain/models/ActivationBody;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLr80/a;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activation/domain/models/ActivationBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activation/domain/models/ActivationBody;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    iget-boolean v3, p1, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    iget-boolean v3, p1, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    iget-boolean p1, p1, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBillingFrequency()Lr80/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    return-object v0
.end method

.method public final getConsentsAccepted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    return v0
.end method

.method public final getMarketingOptIn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    return v0
.end method

.method public final getRecommendationOptIn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    return v0
.end method

.method public final getStripeToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getZipCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/activation/domain/models/ActivationBody;->stripeToken:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/ActivationBody;->zipCode:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/activation/domain/models/ActivationBody;->consentsAccepted:Z

    iget-boolean v3, p0, Lcom/whoop/activation/domain/models/ActivationBody;->marketingOptIn:Z

    iget-object v4, p0, Lcom/whoop/activation/domain/models/ActivationBody;->billingFrequency:Lr80/a;

    iget-boolean v5, p0, Lcom/whoop/activation/domain/models/ActivationBody;->recommendationOptIn:Z

    const-string v6, ", zipCode="

    const-string v7, ", consentsAccepted="

    const-string v8, "ActivationBody(stripeToken="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", marketingOptIn="

    const-string v6, ", billingFrequency="

    invoke-static {v0, v2, v1, v3, v6}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recommendationOptIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
