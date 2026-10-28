.class public final Lcom/stripe/android/uicore/address/CountryAddressSchema;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0007\u0018\u0000 %2\u00020\u0001:\u0002&\'B%\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB7\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0018\u0012\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u001d\u0012\u0004\u0008 \u0010\u001c\u001a\u0004\u0008\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010!\u0012\u0004\u0008$\u0010\u001c\u001a\u0004\u0008\"\u0010#\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/CountryAddressSchema;",
        "",
        "Lcom/stripe/android/uicore/address/FieldType;",
        "type",
        "",
        "required",
        "Lcom/stripe/android/uicore/address/FieldSchema;",
        "schema",
        "<init>",
        "(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stripe_ui_core_release",
        "(Lcom/stripe/android/uicore/address/CountryAddressSchema;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/stripe/android/uicore/address/FieldType;",
        "getType",
        "()Lcom/stripe/android/uicore/address/FieldType;",
        "getType$annotations",
        "()V",
        "Z",
        "getRequired",
        "()Z",
        "getRequired$annotations",
        "Lcom/stripe/android/uicore/address/FieldSchema;",
        "getSchema",
        "()Lcom/stripe/android/uicore/address/FieldSchema;",
        "getSchema$annotations",
        "Companion",
        "$serializer",
        "com/stripe/android/uicore/address/a",
        "stripe-ui-core_release"
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

.field public static final Companion:Lcom/stripe/android/uicore/address/a;


# instance fields
.field private final required:Z

.field private final schema:Lcom/stripe/android/uicore/address/FieldSchema;

.field private final type:Lcom/stripe/android/uicore/address/FieldType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/uicore/address/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->Companion:Lcom/stripe/android/uicore/address/a;

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->Companion:Le40/d;

    invoke-virtual {v0}, Le40/d;->serializer()Lwc3/c;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    const/4 v2, 0x0

    aput-object v2, v1, v0

    const/4 v0, 0x2

    aput-object v2, v1, v0

    sput-object v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;->INSTANCE:Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;

    invoke-virtual {p5}, Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    iput-boolean p3, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-void

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    .line 4
    iput-boolean p2, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    .line 5
    iput-object p3, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic getRequired$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "required"
    .end annotation

    return-void
.end method

.method public static synthetic getSchema$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "schema"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "type"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stripe_ui_core_release(Lcom/stripe/android/uicore/address/CountryAddressSchema;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/uicore/address/FieldSchema$$serializer;->INSTANCE:Lcom/stripe/android/uicore/address/FieldSchema$$serializer;

    iget-object p0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final getRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    return v0
.end method

.method public final getSchema()Lcom/stripe/android/uicore/address/FieldSchema;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-object v0
.end method

.method public final getType()Lcom/stripe/android/uicore/address/FieldType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    return-object v0
.end method
