.class public final Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;:B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBS\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&JJ\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010$J\u0010\u0010*\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00083\u0010 R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u00085\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00087\u0010$R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00108\u001a\u0004\u00089\u0010&\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;",
        "",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "navigationBar",
        "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;",
        "header",
        "",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
        "sections",
        "",
        "label",
        "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;",
        "footer",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "component2",
        "()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;",
        "copy",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;)Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "getNavigationBar",
        "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;",
        "getHeader",
        "Ljava/util/List;",
        "getSections",
        "Ljava/lang/String;",
        "getLabel",
        "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;",
        "getFooter",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$Companion;


# instance fields
.field private final footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

.field private final header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

.field private final label:Ljava/lang/String;

.field private final navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->Companion:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ltb0/a;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Ltb0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
            "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;",
            ")V"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->copy(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;)Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;)Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
            "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;",
            ")",
            "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;-><init>(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getFooter()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->header:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->sections:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->label:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;->footer:Lcom/whoop/advancedlabs/domain/models/SchedulePrimerFooterModel;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SchedulePrimerResponse(navigationBar="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", header="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sections="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    const-string v1, ", footer="

    invoke-static {v0, v3, v1, v5, v2}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
