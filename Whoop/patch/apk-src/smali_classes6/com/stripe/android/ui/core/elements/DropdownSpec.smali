.class public final Lcom/stripe/android/ui/core/elements/DropdownSpec;
.super Lcom/stripe/android/ui/core/elements/FormItemSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/DropdownSpec$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002ABB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u001c2\u0016\u0008\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\"\u0010#J\r\u0010$\u001a\u00020\u000b\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0016\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J4\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010%J\u001a\u00104\u001a\u0002032\u0008\u00102\u001a\u0004\u0018\u000101H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00106\u0012\u0004\u00088\u00109\u001a\u0004\u00087\u0010\'R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010:\u0012\u0004\u0008<\u00109\u001a\u0004\u0008;\u0010)R&\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010=\u0012\u0004\u0008?\u00109\u001a\u0004\u0008>\u0010+\u00a8\u0006C"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/DropdownSpec;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "apiPath",
        "Lcom/stripe/android/ui/core/elements/TranslationId;",
        "labelTranslationId",
        "",
        "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;",
        "items",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$payments_ui_core_release",
        "(Lcom/stripe/android/ui/core/elements/DropdownSpec;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "",
        "initialValues",
        "Lg40/w2;",
        "transform",
        "(Ljava/util/Map;)Lg40/w2;",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "component1",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "component2",
        "()Lcom/stripe/android/ui/core/elements/TranslationId;",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)Lcom/stripe/android/ui/core/elements/DropdownSpec;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath",
        "getApiPath$annotations",
        "()V",
        "Lcom/stripe/android/ui/core/elements/TranslationId;",
        "getLabelTranslationId",
        "getLabelTranslationId$annotations",
        "Ljava/util/List;",
        "getItems",
        "getItems$annotations",
        "Companion",
        "$serializer",
        "com/stripe/android/ui/core/elements/l",
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
            "Lcom/stripe/android/ui/core/elements/DropdownSpec;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/l;


# instance fields
.field private final apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/stripe/android/ui/core/elements/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->Companion:Lcom/stripe/android/ui/core/elements/l;

    new-instance v0, Lx30/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lx30/a;-><init>(I)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Lcom/stripe/android/ui/core/elements/TranslationId;->Companion:Lx30/s1;

    invoke-virtual {v0}, Lx30/s1;->serializer()Lwc3/c;

    move-result-object v0

    new-instance v1, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v2, Lcom/stripe/android/ui/core/elements/DropdownItemSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/DropdownItemSpec$$serializer;

    invoke-direct {v1, v2}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    const/4 v2, 0x3

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/stripe/android/ui/core/elements/DropdownSpec;->$childSerializers:[Lwc3/c;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/stripe/android/ui/core/elements/DropdownSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/DropdownSpec$$serializer;

    invoke-virtual {p5}, Lcom/stripe/android/ui/core/elements/DropdownSpec$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/ui/core/elements/TranslationId;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;",
            ">;)V"
        }
    .end annotation

    const-string v0, "apiPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelTranslationId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 4
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    .line 5
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lwc3/c;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->$childSerializers:[Lwc3/c;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/DropdownSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/DropdownSpec;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/DropdownSpec;->copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)Lcom/stripe/android/ui/core/elements/DropdownSpec;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getApiPath$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "api_path"
    .end annotation

    return-void
.end method

.method public static synthetic getItems$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "items"
    .end annotation

    return-void
.end method

.method public static synthetic getLabelTranslationId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "translation_id"
    .end annotation

    return-void
.end method

.method public static synthetic transform$default(Lcom/stripe/android/ui/core/elements/DropdownSpec;Ljava/util/Map;ILjava/lang/Object;)Lg40/w2;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lm83/z;->w:Lm83/z;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/DropdownSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$payments_ui_core_release(Lcom/stripe/android/ui/core/elements/DropdownSpec;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->$childSerializers:[Lwc3/c;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DropdownSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)Lcom/stripe/android/ui/core/elements/DropdownSpec;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/ui/core/elements/TranslationId;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;",
            ">;)",
            "Lcom/stripe/android/ui/core/elements/DropdownSpec;"
        }
    .end annotation

    const-string v0, "apiPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelTranslationId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/DropdownSpec;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/ui/core/elements/DropdownSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/DropdownSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/DropdownSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getLabelTranslationId()Lcom/stripe/android/ui/core/elements/TranslationId;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DropdownSpec(apiPath="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", labelTranslationId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final transform(Ljava/util/Map;)Lg40/w2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lg40/w2;"
        }
    .end annotation

    const-string v0, "initialValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx30/p1;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DropdownSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    new-instance v2, Lg40/r0;

    new-instance v3, Lq/f;

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/TranslationId;->getResourceId()I

    move-result v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    sget-object v6, Lm83/y;->w:Lm83/y;

    invoke-static {v4, v5, v6}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v4

    iget-object v5, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    invoke-direct {v3, v4, v5}, Lq/f;-><init>(Lzy/b;Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/DropdownSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v2, v3, p1}, Lg40/r0;-><init>(Lg40/p0;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lx30/p1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lg40/r0;)V

    const/4 p1, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, p1, v1}, Lcom/stripe/android/ui/core/elements/FormItemSpec;->createSectionElement$payments_ui_core_release$default(Lcom/stripe/android/ui/core/elements/FormItemSpec;Lg40/y2;Lzy/c;ILjava/lang/Object;)Lg40/w2;

    move-result-object p1

    return-object p1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->labelTranslationId:Lcom/stripe/android/ui/core/elements/TranslationId;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DropdownSpec;->items:Ljava/util/List;

    invoke-static {v0, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {p1, v1, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
