.class public final Lcom/whoop/stress/domain/model/StressCustomizationOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/stress/domain/model/StressCustomizationOptions$$serializer;,
        Lcom/whoop/stress/domain/model/StressCustomizationOptions$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:;B7\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBO\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"JH\u0010#\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010 J\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010,\u0012\u0004\u0008.\u0010/\u001a\u0004\u0008-\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00100\u0012\u0004\u00082\u0010/\u001a\u0004\u00081\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00103\u0012\u0004\u00085\u0010/\u001a\u0004\u00084\u0010 R,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00106\u0012\u0004\u00088\u0010/\u001a\u0004\u00087\u0010\"\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/stress/domain/model/StressCustomizationOptions;",
        "",
        "Lcom/whoop/stress/domain/model/StressCustomizationDrawer;",
        "drawer",
        "Lcom/whoop/stress/domain/model/StressCustomizationPicker;",
        "picker",
        "",
        "currentSelection",
        "",
        "Lcom/whoop/stress/domain/model/StressCustomizationDisplay;",
        "options",
        "<init>",
        "(Lcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stress_release",
        "(Lcom/whoop/stress/domain/model/StressCustomizationOptions;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/stress/domain/model/StressCustomizationDrawer;",
        "component2",
        "()Lcom/whoop/stress/domain/model/StressCustomizationPicker;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/util/Map;",
        "copy",
        "(Lcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/stress/domain/model/StressCustomizationOptions;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/stress/domain/model/StressCustomizationDrawer;",
        "getDrawer",
        "getDrawer$annotations",
        "()V",
        "Lcom/whoop/stress/domain/model/StressCustomizationPicker;",
        "getPicker",
        "getPicker$annotations",
        "Ljava/lang/String;",
        "getCurrentSelection",
        "getCurrentSelection$annotations",
        "Ljava/util/Map;",
        "getOptions",
        "getOptions$annotations",
        "Companion",
        "$serializer",
        "a",
        "stress_release"
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

.field public static final Companion:Lcom/whoop/stress/domain/model/StressCustomizationOptions$a;


# instance fields
.field private final currentSelection:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "current_selection"
    .end annotation
.end field

.field private final drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "drawer"
    .end annotation
.end field

.field private final options:Ljava/util/Map;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "options"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/StressCustomizationDisplay;",
            ">;"
        }
    .end annotation
.end field

.field private final picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "picker"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/stress/domain/model/StressCustomizationOptions$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/stress/domain/model/StressCustomizationOptions$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->Companion:Lcom/whoop/stress/domain/model/StressCustomizationOptions$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lih1/b;

    invoke-direct {v3, v0}, Lih1/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/stress/domain/model/StressCustomizationOptions$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressCustomizationOptions$$serializer;

    invoke-virtual {p6}, Lcom/whoop/stress/domain/model/StressCustomizationOptions$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/stress/domain/model/StressCustomizationDrawer;",
            "Lcom/whoop/stress/domain/model/StressCustomizationPicker;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/StressCustomizationDisplay;",
            ">;)V"
        }
    .end annotation

    const-string v0, "currentSelection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    .line 4
    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    .line 5
    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/stress/domain/model/StressCustomizationDisplay$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressCustomizationDisplay$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/stress/domain/model/StressCustomizationOptions;Lcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/stress/domain/model/StressCustomizationOptions;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->copy(Lcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/stress/domain/model/StressCustomizationOptions;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCurrentSelection$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "current_selection"
    .end annotation

    return-void
.end method

.method public static synthetic getDrawer$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "drawer"
    .end annotation

    return-void
.end method

.method public static synthetic getOptions$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "options"
    .end annotation

    return-void
.end method

.method public static synthetic getPicker$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "picker"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stress_release(Lcom/whoop/stress/domain/model/StressCustomizationOptions;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/stress/domain/model/StressCustomizationDrawer$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressCustomizationDrawer$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/stress/domain/model/StressCustomizationPicker$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressCustomizationPicker$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/stress/domain/model/StressCustomizationDrawer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    return-object v0
.end method

.method public final component2()Lcom/whoop/stress/domain/model/StressCustomizationPicker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/StressCustomizationDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/stress/domain/model/StressCustomizationOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/stress/domain/model/StressCustomizationDrawer;",
            "Lcom/whoop/stress/domain/model/StressCustomizationPicker;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/StressCustomizationDisplay;",
            ">;)",
            "Lcom/whoop/stress/domain/model/StressCustomizationOptions;"
        }
    .end annotation

    const-string v0, "currentSelection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/stress/domain/model/StressCustomizationOptions;-><init>(Lcom/whoop/stress/domain/model/StressCustomizationDrawer;Lcom/whoop/stress/domain/model/StressCustomizationPicker;Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/stress/domain/model/StressCustomizationOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/stress/domain/model/StressCustomizationOptions;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCurrentSelection()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    return-object v0
.end method

.method public final getDrawer()Lcom/whoop/stress/domain/model/StressCustomizationDrawer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    return-object v0
.end method

.method public final getOptions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/StressCustomizationDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    return-object v0
.end method

.method public final getPicker()Lcom/whoop/stress/domain/model/StressCustomizationPicker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/stress/domain/model/StressCustomizationDrawer;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressCustomizationPicker;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->drawer:Lcom/whoop/stress/domain/model/StressCustomizationDrawer;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->picker:Lcom/whoop/stress/domain/model/StressCustomizationPicker;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->currentSelection:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressCustomizationOptions;->options:Ljava/util/Map;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "StressCustomizationOptions(drawer="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", picker="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentSelection="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lq63/c;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
