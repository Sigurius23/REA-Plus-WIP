.class public final Lcom/stripe/android/ui/core/elements/AddressSpec;
.super Lcom/stripe/android/ui/core/elements/FormItemSpec;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0002TUBO\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010BM\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015JK\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00162\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00162\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0011\u00a2\u0006\u0004\u0008#\u0010$J\r\u0010%\u001a\u00020\u0011\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0016\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*J\u0010\u0010,\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010-JX\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u00085\u0010&J\u001a\u00108\u001a\u00020\n2\u0008\u00107\u001a\u0004\u0018\u000106H\u00d6\u0003\u00a2\u0006\u0004\u00088\u00109J\'\u0010A\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001\u00a2\u0006\u0004\u0008?\u0010@R \u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010B\u0012\u0004\u0008D\u0010E\u001a\u0004\u0008C\u0010(R&\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010F\u0012\u0004\u0008H\u0010E\u001a\u0004\u0008G\u0010*R&\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010F\u0012\u0004\u0008J\u0010E\u001a\u0004\u0008I\u0010*R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010K\u0012\u0004\u0008M\u0010E\u001a\u0004\u0008L\u0010-R \u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010N\u0012\u0004\u0008P\u0010E\u001a\u0004\u0008O\u0010/R \u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010K\u0012\u0004\u0008R\u0010E\u001a\u0004\u0008Q\u0010-\u00a8\u0006V"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/AddressSpec;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "Landroid/os/Parcelable;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "apiPath",
        "",
        "",
        "allowedCountryCodes",
        "Lcom/stripe/android/ui/core/elements/DisplayField;",
        "displayFields",
        "",
        "showLabel",
        "Lg40/m;",
        "type",
        "hideCountry",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "initialValues",
        "shippingValues",
        "Lg40/z;",
        "autocompleteAddressInteractorFactory",
        "",
        "Lg40/i1;",
        "transform",
        "(Ljava/util/Map;Ljava/util/Map;Lg40/z;)Ljava/util/List;",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "component1",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "component2",
        "()Ljava/util/Set;",
        "component3",
        "component4",
        "()Z",
        "component5",
        "()Lg40/m;",
        "component6",
        "copy",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)Lcom/stripe/android/ui/core/elements/AddressSpec;",
        "toString",
        "()Ljava/lang/String;",
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
        "write$Self$payments_ui_core_release",
        "(Lcom/stripe/android/ui/core/elements/AddressSpec;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath",
        "getApiPath$annotations",
        "()V",
        "Ljava/util/Set;",
        "getAllowedCountryCodes",
        "getAllowedCountryCodes$annotations",
        "getDisplayFields",
        "getDisplayFields$annotations",
        "Z",
        "getShowLabel",
        "getShowLabel$annotations",
        "Lg40/m;",
        "getType",
        "getType$annotations",
        "getHideCountry",
        "getHideCountry$annotations",
        "Companion",
        "$serializer",
        "com/stripe/android/ui/core/elements/a",
        "payments-ui-core_release"
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/ui/core/elements/AddressSpec;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/a;


# instance fields
.field private final allowedCountryCodes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final displayFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;"
        }
    .end annotation
.end field

.field private final hideCountry:Z

.field private final showLabel:Z

.field private final type:Lg40/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/stripe/android/ui/core/elements/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->Companion:Lcom/stripe/android/ui/core/elements/a;

    new-instance v0, Lx30/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx30/a;-><init>(I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashSetSerializer;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v2}, Lkotlinx/serialization/internal/LinkedHashSetSerializer;-><init>(Lwc3/c;)V

    new-instance v2, Lkotlinx/serialization/internal/LinkedHashSetSerializer;

    sget-object v3, Lcom/stripe/android/ui/core/elements/DisplayField;->Companion:Lx30/q0;

    invoke-virtual {v3}, Lx30/q0;->serializer()Lwc3/c;

    move-result-object v3

    invoke-direct {v2, v3}, Lkotlinx/serialization/internal/LinkedHashSetSerializer;-><init>(Lwc3/c;)V

    const/4 v3, 0x4

    new-array v3, v3, [Lwc3/c;

    const/4 v4, 0x0

    aput-object v4, v3, v1

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const/4 v0, 0x3

    aput-object v4, v3, v0

    sput-object v3, Lcom/stripe/android/ui/core/elements/AddressSpec;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    const/4 p6, 0x0

    .line 2
    invoke-direct {p0, p6}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    .line 3
    sget-object p2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "billing_details[address]"

    invoke-static {p2}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p2

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    sget-object p2, Lvy/a;->a:Ljava/util/Set;

    .line 6
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 7
    sget-object p2, Lm83/a0;->w:Lm83/a0;

    .line 8
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    goto :goto_2

    :cond_3
    iput-boolean p5, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    .line 9
    :goto_2
    new-instance p1, Lg40/l;

    const/4 p2, 0x7

    invoke-direct {p1, p6, p6, p2}, Lg40/l;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;I)V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;Z",
            "Lg40/m;",
            "Z)V"
        }
    .end annotation

    const-string v0, "apiPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedCountryCodes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayFields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 18
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    .line 19
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    .line 20
    iput-boolean p4, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    .line 21
    iput-object p5, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    .line 22
    iput-boolean p6, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 11
    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "billing_details[address]"

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 12
    sget-object p2, Lvy/a;->a:Ljava/util/Set;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 13
    sget-object p3, Lm83/a0;->w:Lm83/a0;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    const/4 p4, 0x1

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    .line 14
    new-instance p5, Lg40/l;

    const/4 p8, 0x7

    const/4 v0, 0x0

    invoke-direct {p5, v0, v0, p8}, Lg40/l;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;I)V

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    const/4 p6, 0x0

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 15
    invoke-direct/range {p2 .. p8}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/AddressSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;ZILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/AddressSpec;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/ui/core/elements/AddressSpec;->copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)Lcom/stripe/android/ui/core/elements/AddressSpec;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAllowedCountryCodes$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "allowed_country_codes"
    .end annotation

    return-void
.end method

.method public static synthetic getApiPath$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "api_path"
    .end annotation

    return-void
.end method

.method public static synthetic getDisplayFields$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "display_fields"
    .end annotation

    return-void
.end method

.method public static synthetic getHideCountry$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShowLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "show_label"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self$payments_ui_core_release(Lcom/stripe/android/ui/core/elements/AddressSpec;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->$childSerializers:[Lwc3/c;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "billing_details[address]"

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    sget-object v3, Lvy/a;->a:Ljava/util/Set;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :goto_2
    aget-object v0, v0, v2

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    if-eq v2, v1, :cond_7

    :goto_3
    iget-boolean p0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final component2()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    return-object v0
.end method

.method public final component3()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    return v0
.end method

.method public final component5()Lg40/m;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)Lcom/stripe/android/ui/core/elements/AddressSpec;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;Z",
            "Lg40/m;",
            "Z)",
            "Lcom/stripe/android/ui/core/elements/AddressSpec;"
        }
    .end annotation

    const-string v0, "apiPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedCountryCodes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayFields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/ui/core/elements/AddressSpec;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;Z)V

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
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/AddressSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    iget-boolean v3, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    iget-boolean p1, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAllowedCountryCodes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    return-object v0
.end method

.method public getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getDisplayFields()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    return-object v0
.end method

.method public final getHideCountry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    return v0
.end method

.method public final getShowLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    return v0
.end method

.method public final getType()Lg40/m;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-boolean v2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    iget-boolean v3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    iget-boolean v5, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AddressSpec(apiPath="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", allowedCountryCodes="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", displayFields="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showLabel="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hideCountry="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final transform(Ljava/util/Map;Ljava/util/Map;Lg40/z;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lg40/z;",
            ")",
            "Ljava/util/List<",
            "Lg40/i1;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v8, p2

    const-string v1, "initialValues"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    const/4 v14, 0x0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    new-array v1, v14, [Ljava/lang/Object;

    sget-object v4, Lm83/y;->w:Lm83/y;

    const v5, 0x7f140fcc

    invoke-static {v5, v1, v4}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v1

    move-object v15, v1

    goto :goto_0

    :cond_0
    move-object v15, v2

    :goto_0
    iget-object v1, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    const/4 v4, 0x1

    if-ne v1, v4, :cond_2

    iget-object v1, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    sget-object v5, Lcom/stripe/android/ui/core/elements/DisplayField;->Country:Lcom/stripe/android/ui/core/elements/DisplayField;

    if-ne v1, v5, :cond_2

    new-instance v1, Lg40/i0;

    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "billing_details[address][country]"

    invoke-static {v4}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    new-instance v5, Lg40/r0;

    new-instance v6, Lm63/d;

    iget-object v7, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    const/16 v8, 0x3e

    invoke-direct {v6, v7, v2, v2, v8}, Lm63/d;-><init>(Ljava/util/Set;Lg1/u4;Lg1/u4;I)V

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v5, v6, v3}, Lg40/r0;-><init>(Lg40/p0;Ljava/lang/String;)V

    invoke-direct {v1, v4, v5}, Lg40/i0;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/r0;)V

    invoke-virtual {v0, v1, v15}, Lcom/stripe/android/ui/core/elements/FormItemSpec;->createSectionElement$payments_ui_core_release(Lg40/y2;Lzy/c;)Lg40/w2;

    move-result-object v1

    iget-boolean v3, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    if-nez v3, :cond_1

    move-object v2, v1

    :cond_1
    invoke-static {v2}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1

    :cond_2
    if-eqz v8, :cond_3

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSameAsShipping$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-static {v1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    new-instance v2, Lg40/v2;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getSameAsShipping$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    new-instance v6, Lg40/u2;

    invoke-direct {v6, v1}, Lg40/u2;-><init>(Z)V

    invoke-direct {v2, v5, v6}, Lg40/v2;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/u2;)V

    :cond_3
    move-object v7, v2

    if-eqz p3, :cond_4

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    move v1, v4

    iget-object v4, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    iget-boolean v12, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    move v5, v1

    new-instance v1, Lg40/v;

    const/4 v8, 0x0

    const/16 v13, 0x78

    move v6, v5

    const/4 v5, 0x0

    move v9, v6

    const/4 v6, 0x0

    move v10, v9

    move-object v9, v7

    const/4 v7, 0x0

    move-object/from16 v11, p3

    move/from16 v16, v10

    move-object/from16 v10, p2

    invoke-direct/range {v1 .. v13}, Lg40/v;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lg40/r0;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lg40/v2;Ljava/util/Map;Lg40/z;ZI)V

    goto :goto_1

    :cond_4
    move/from16 v16, v4

    move-object v9, v7

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    iget-object v5, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    iget-object v4, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    iget-boolean v10, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    new-instance v1, Lg40/f;

    const/4 v9, 0x0

    const/16 v11, 0x90

    const/4 v6, 0x0

    move-object/from16 v3, p1

    move-object/from16 v8, p2

    invoke-direct/range {v1 .. v11}, Lg40/f;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lg40/m;Ljava/util/Set;Lg40/i0;Lg40/v2;Ljava/util/Map;ZZI)V

    move-object v9, v7

    :goto_1
    invoke-virtual {v0, v1, v15}, Lcom/stripe/android/ui/core/elements/FormItemSpec;->createSectionElement$payments_ui_core_release(Lg40/y2;Lzy/c;)Lg40/w2;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lg40/i1;

    aput-object v1, v2, v14

    aput-object v9, v2, v16

    invoke-static {v2}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/ui/core/elements/DisplayField;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lg40/m;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->hideCountry:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
