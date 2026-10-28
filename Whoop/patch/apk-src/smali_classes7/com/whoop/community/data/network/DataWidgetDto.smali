.class public final Lcom/whoop/community/data/network/DataWidgetDto;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/data/network/DataWidgetDto$$serializer;,
        Lcom/whoop/community/data/network/DataWidgetDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@AB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bBE\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001d\u0010$\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0004\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010 J\u0010\u0010)\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010 J\u0016\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J>\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010\'J\u0010\u0010/\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010 J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00105\u0012\u0004\u00087\u00108\u001a\u0004\u00086\u0010\'R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008;\u0010 R&\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010<\u0012\u0004\u0008>\u00108\u001a\u0004\u0008=\u0010+\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/community/data/network/DataWidgetDto;",
        "Landroid/os/Parcelable;",
        "",
        "widgetType",
        "",
        "offset",
        "totalCount",
        "",
        "Lcom/whoop/community/data/network/DataWidgetImageDto;",
        "dataWidgetImages",
        "<init>",
        "(Ljava/lang/String;IILjava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "categoryHeader",
        "localizeCategoryHeaders",
        "(Ljava/lang/String;)I",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_release",
        "(Lcom/whoop/community/data/network/DataWidgetDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lbq0/b;",
        "toDataWidget",
        "()Lbq0/b;",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;IILjava/util/List;)Lcom/whoop/community/data/network/DataWidgetDto;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getWidgetType",
        "getWidgetType$annotations",
        "()V",
        "I",
        "getOffset",
        "getTotalCount",
        "Ljava/util/List;",
        "getDataWidgetImages",
        "getDataWidgetImages$annotations",
        "Companion",
        "$serializer",
        "a",
        "community_release"
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/community/data/network/DataWidgetDto;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/community/data/network/DataWidgetDto$a;


# instance fields
.field private final dataWidgetImages:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/community/data/network/DataWidgetImageDto;",
            ">;"
        }
    .end annotation
.end field

.field private final offset:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "offset"
    .end annotation
.end field

.field private final totalCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_count"
    .end annotation
.end field

.field private final widgetType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "widget_category"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/community/data/network/DataWidgetDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/community/data/network/DataWidgetDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/community/data/network/DataWidgetDto;->Companion:Lcom/whoop/community/data/network/DataWidgetDto$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/community/data/network/DataWidgetDto;->$stable:I

    new-instance v0, Lcom/whoop/community/data/network/DataWidgetDto$b;

    invoke-direct {v0}, Lcom/whoop/community/data/network/DataWidgetDto$b;-><init>()V

    sput-object v0, Lcom/whoop/community/data/network/DataWidgetDto;->CREATOR:Landroid/os/Parcelable$Creator;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lbo2/a;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lbo2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/community/data/network/DataWidgetDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/community/data/network/DataWidgetDto$$serializer;->INSTANCE:Lcom/whoop/community/data/network/DataWidgetDto$$serializer;

    invoke-virtual {p6}, Lcom/whoop/community/data/network/DataWidgetDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    iput p4, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    iput-object p5, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/whoop/community/data/network/DataWidgetImageDto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "widgetType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataWidgetImages"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    .line 5
    iput p3, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    .line 6
    iput-object p4, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/community/data/network/DataWidgetImageDto$$serializer;->INSTANCE:Lcom/whoop/community/data/network/DataWidgetImageDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/community/data/network/DataWidgetDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/community/data/network/DataWidgetDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/community/data/network/DataWidgetDto;Ljava/lang/String;IILjava/util/List;ILjava/lang/Object;)Lcom/whoop/community/data/network/DataWidgetDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/community/data/network/DataWidgetDto;->copy(Ljava/lang/String;IILjava/util/List;)Lcom/whoop/community/data/network/DataWidgetDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDataWidgetImages$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "records"
    .end annotation

    return-void
.end method

.method public static synthetic getWidgetType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "widget_category"
    .end annotation

    return-void
.end method

.method private final localizeCategoryHeaders(Ljava/lang/String;)I
    .locals 3

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "US"

    const-string v2, "toLowerCase(...)"

    invoke-static {v0, v1, p1, v0, v2}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "overview"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget p1, Lxp0/d0;->y:I

    return p1

    :sswitch_1
    const-string v0, "sleep"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget p1, Lxp0/d0;->A:I

    return p1

    :sswitch_2
    const-string v0, "recovery"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget p1, Lxp0/d0;->z:I

    return p1

    :sswitch_3
    const-string v0, "strain"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    sget p1, Lxp0/d0;->w:I

    return p1

    :cond_3
    sget p1, Lxp0/d0;->B:I

    return p1

    :sswitch_data_0
    .sparse-switch
        -0x352abe8b -> :sswitch_3
        -0x2fa1806b -> :sswitch_2
        0x6872ed7 -> :sswitch_1
        0x1f98ed79 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final synthetic write$Self$community_release(Lcom/whoop/community/data/network/DataWidgetDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/community/data/network/DataWidgetDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/community/data/network/DataWidgetImageDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IILjava/util/List;)Lcom/whoop/community/data/network/DataWidgetDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/whoop/community/data/network/DataWidgetImageDto;",
            ">;)",
            "Lcom/whoop/community/data/network/DataWidgetDto;"
        }
    .end annotation

    const-string v0, "widgetType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataWidgetImages"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/community/data/network/DataWidgetDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/community/data/network/DataWidgetDto;-><init>(Ljava/lang/String;IILjava/util/List;)V

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
    instance-of v1, p1, Lcom/whoop/community/data/network/DataWidgetDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/community/data/network/DataWidgetDto;

    iget-object v1, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    iget v3, p1, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    iget v3, p1, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDataWidgetImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/community/data/network/DataWidgetImageDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    return-object v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    return v0
.end method

.method public final getTotalCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    return v0
.end method

.method public final getWidgetType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toDataWidget()Lbq0/b;
    .locals 6

    iget-object v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/whoop/community/data/network/DataWidgetDto;->localizeCategoryHeaders(Ljava/lang/String;)I

    move-result v0

    iget v1, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    iget v2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    iget-object v3, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/community/data/network/DataWidgetImageDto;

    invoke-virtual {v5}, Lcom/whoop/community/data/network/DataWidgetImageDto;->toDataImageWidget()Lbq0/c;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Lbq0/b;

    invoke-direct {v4, v0, v1, v2, v3}, Lbq0/b;-><init>(IIILjava/util/List;)V

    return-object v4
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    iget v2, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    iget-object v3, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    const-string v4, ", offset="

    const-string v5, ", totalCount="

    const-string v6, "DataWidgetDto(widgetType="

    invoke-static {v1, v6, v0, v4, v5}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dataWidgetImages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->widgetType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->offset:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->totalCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/community/data/network/DataWidgetDto;->dataWidgetImages:Ljava/util/List;

    invoke-static {v0, p1}, Ld13/a;->o(Ljava/util/List;Landroid/os/Parcel;)Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/community/data/network/DataWidgetImageDto;

    invoke-virtual {v1, p1, p2}, Lcom/whoop/community/data/network/DataWidgetImageDto;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    return-void
.end method
