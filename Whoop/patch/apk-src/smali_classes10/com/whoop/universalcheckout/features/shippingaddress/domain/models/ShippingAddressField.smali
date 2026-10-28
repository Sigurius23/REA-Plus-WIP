.class public final Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$$serializer;,
        Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 M2\u00020\u0001:\u0002MNB\u00a7\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u00a7\u0001\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0014\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001bJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001bJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010!J\u00b4\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010\u001bJ\u0010\u0010/\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00102\u001a\u00020\u00082\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010=\u001a\u0004\u0008>\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010=\u001a\u0004\u0008?\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008@\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008A\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010=\u001a\u0004\u0008B\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010C\u001a\u0004\u0008\t\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010D\u001a\u0004\u0008E\u0010#R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010D\u001a\u0004\u0008F\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008G\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010=\u001a\u0004\u0008H\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010=\u001a\u0004\u0008I\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010=\u001a\u0004\u0008J\u0010\u001bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010K\u001a\u0004\u0008L\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010C\u001a\u0004\u0008\u0013\u0010!\u00a8\u0006O"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;",
        "",
        "",
        "type",
        "label",
        "labelExtension",
        "prefillText",
        "fieldType",
        "",
        "isRequired",
        "",
        "maxLength",
        "minLength",
        "pattern",
        "example",
        "autoCompleteField",
        "customErrorKey",
        "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;",
        "dropdownLookup",
        "isReadOnly",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/lang/Boolean;",
        "component7",
        "()Ljava/lang/Integer;",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "()Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;",
        "component14",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;",
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
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getType",
        "getLabel",
        "getLabelExtension",
        "getPrefillText",
        "getFieldType",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Integer;",
        "getMaxLength",
        "getMinLength",
        "getPattern",
        "getExample",
        "getAutoCompleteField",
        "getCustomErrorKey",
        "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;",
        "getDropdownLookup",
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$Companion;

.field public static final DROPDOWN_FIELD_TYPE:Ljava/lang/String; = "DROPDOWN"

.field public static final TEXT_FIELD_TYPE:Ljava/lang/String; = "TEXT"


# instance fields
.field private final autoCompleteField:Ljava/lang/String;

.field private final customErrorKey:Ljava/lang/String;

.field private final dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

.field private final example:Ljava/lang/String;

.field private final fieldType:Ljava/lang/String;

.field private final isReadOnly:Ljava/lang/Boolean;

.field private final isRequired:Ljava/lang/Boolean;

.field private final label:Ljava/lang/String;

.field private final labelExtension:Ljava/lang/String;

.field private final maxLength:Ljava/lang/Integer;

.field private final minLength:Ljava/lang/Integer;

.field private final pattern:Ljava/lang/String;

.field private final prefillText:Ljava/lang/String;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->Companion:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$$serializer;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    :goto_4
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    goto :goto_5

    :cond_6
    iput-object p9, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    :goto_5
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p10, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p11, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    goto :goto_8

    :cond_9
    iput-object p12, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_a

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    goto :goto_9

    :cond_a
    iput-object p13, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    :goto_9
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_b

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    goto :goto_a

    :cond_b
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    :goto_a
    and-int/lit16 p1, p1, 0x2000

    if-nez p1, :cond_c

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    return-void

    :cond_c
    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    .line 9
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    .line 10
    iput-object p8, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    .line 11
    iput-object p9, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    .line 16
    iput-object p14, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-object v12, v2

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move-object v14, v2

    goto :goto_8

    :cond_8
    move-object/from16 v14, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move-object v15, v2

    goto :goto_9

    :cond_9
    move-object/from16 v15, p12

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    move-object/from16 v16, v2

    goto :goto_a

    :cond_a
    move-object/from16 v16, p13

    :goto_a
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_b

    move-object/from16 v17, v2

    :goto_b
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    goto :goto_c

    :cond_b
    move-object/from16 v17, p14

    goto :goto_b

    .line 17
    :goto_c
    invoke-direct/range {v3 .. v17}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    if-eqz v1, :cond_15

    :goto_a
    sget-object v1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup$$serializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    if-eqz v1, :cond_17

    :goto_b
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    return-object v0
.end method

.method public final component14()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;)Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;
    .locals 16

    const-string v0, "type"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getAutoCompleteField()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomErrorKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getDropdownLookup()Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    return-object v0
.end method

.method public final getExample()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    return-object v0
.end method

.method public final getFieldType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabelExtension()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxLength()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMinLength()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrefillText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    if-nez v1, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    return v0
.end method

.method public final isReadOnly()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isRequired()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->type:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->label:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->labelExtension:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->prefillText:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->fieldType:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isRequired:Ljava/lang/Boolean;

    iget-object v7, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->maxLength:Ljava/lang/Integer;

    iget-object v8, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->minLength:Ljava/lang/Integer;

    iget-object v9, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->pattern:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->example:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->autoCompleteField:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->customErrorKey:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->dropdownLookup:Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/DropdownLookup;

    iget-object v14, v0, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressField;->isReadOnly:Ljava/lang/Boolean;

    const-string v15, ", label="

    const-string v0, ", labelExtension="

    move-object/from16 v16, v14

    const-string v14, "ShippingAddressField(type="

    invoke-static {v14, v1, v15, v2, v0}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", prefillText="

    const-string v2, ", fieldType="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isRequired="

    const-string v2, ", maxLength="

    invoke-static {v6, v5, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", minLength="

    const-string v2, ", pattern="

    invoke-static {v0, v7, v1, v8, v2}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v1, ", example="

    const-string v2, ", autoCompleteField="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", customErrorKey="

    const-string v2, ", dropdownLookup="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isReadOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
