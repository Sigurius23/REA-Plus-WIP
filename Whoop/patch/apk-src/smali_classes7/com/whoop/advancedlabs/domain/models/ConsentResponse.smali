.class public final Lcom/whoop/advancedlabs/domain/models/ConsentResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/ConsentResponse$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/ConsentResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rB]\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JR\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00101\u001a\u0004\u00083\u0010\u001fR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u00085\u0010\"R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00086\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u00088\u0010%\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/ConsentResponse;",
        "",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "navigationBar",
        "",
        "title",
        "description",
        "",
        "checkboxes",
        "buttonLabel",
        "Lcom/whoop/advancedlabs/domain/models/ButtonModel;",
        "button",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/ConsentResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "()Lcom/whoop/advancedlabs/domain/models/ButtonModel;",
        "copy",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;)Lcom/whoop/advancedlabs/domain/models/ConsentResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "getNavigationBar",
        "Ljava/lang/String;",
        "getTitle",
        "getDescription",
        "Ljava/util/List;",
        "getCheckboxes",
        "getButtonLabel",
        "Lcom/whoop/advancedlabs/domain/models/ButtonModel;",
        "getButton",
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/ConsentResponse$Companion;


# instance fields
.field private final button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

.field private final buttonLabel:Ljava/lang/String;

.field private final checkboxes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final description:Ljava/lang/String;

.field private final navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->Companion:Lcom/whoop/advancedlabs/domain/models/ConsentResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ltb0/a;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ltb0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/advancedlabs/domain/models/ConsentResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/ConsentResponse$$serializer;

    invoke-virtual {p8}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/ButtonModel;",
            ")V"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkboxes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/ConsentResponse;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/ConsentResponse;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->copy(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;)Lcom/whoop/advancedlabs/domain/models/ConsentResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/ConsentResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/ButtonModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/ButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/advancedlabs/domain/models/ButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;)Lcom/whoop/advancedlabs/domain/models/ConsentResponse;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/ButtonModel;",
            ")",
            "Lcom/whoop/advancedlabs/domain/models/ConsentResponse;"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkboxes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;-><init>(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getButton()Lcom/whoop/advancedlabs/domain/models/ButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    return-object v0
.end method

.method public final getButtonLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getCheckboxes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/ButtonModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->description:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->checkboxes:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->buttonLabel:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/ConsentResponse;->button:Lcom/whoop/advancedlabs/domain/models/ButtonModel;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "ConsentResponse(navigationBar="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", checkboxes="

    const-string v1, ", buttonLabel="

    invoke-static {v2, v0, v1, v6, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", button="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
