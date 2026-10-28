.class public final Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$$serializer;,
        Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0002=>B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tBc\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000c\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0008\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ#\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u000cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J.\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010!J\u0010\u0010(\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010+\u001a\u00020\u00062\u0008\u0010*\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010-\u001a\u0004\u0008.\u0010!R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010-\u001a\u0004\u0008/\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u0008\u0007\u0010$R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105RE\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cj\u0004\u0018\u0001`6\u00a2\u0006\u000c\u00087\u0012\u0008\u00088\u0012\u0004\u0008\t098\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u00101\u001a\u0004\u0008:\u00103\"\u0004\u0008;\u00105\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "selectedInternalName",
        "",
        "isGpsTrackingEnabled",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Z)V",
        "",
        "seen0",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$start_activity_release",
        "(Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getSelectedInternalName",
        "Z",
        "Ljava/util/Map;",
        "getBindings",
        "()Ljava/util/Map;",
        "setBindings",
        "(Ljava/util/Map;)V",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "a",
        "start-activity_release"
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

.field public static final Companion:Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$a;


# instance fields
.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final isGpsTrackingEnabled:Z

.field private final selectedInternalName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->Companion:Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ltb0/b;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Ltb0/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$$serializer;->INSTANCE:Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 2
    const-string p2, ""

    .line 3
    iput-object p2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    goto :goto_1

    :cond_2
    iput-boolean p4, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    :goto_1
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->bindings:Ljava/util/Map;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->bindings:Ljava/util/Map;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedInternalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    .line 7
    iput-boolean p3, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 8
    const-string p2, ""

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->copy(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$start_activity_release(Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    if-eqz v2, :cond_3

    :goto_1
    iget-boolean v2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->bind(Ljava/util/Map;)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Ltg2/g;->a(Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedInternalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;

    iget-object v1, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    iget-boolean p1, p1, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedInternalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isGpsTrackingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    return v0
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->selectedInternalName:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;->isGpsTrackingEnabled:Z

    const-string v3, ", selectedInternalName="

    const-string v4, ", isGpsTrackingEnabled="

    const-string v5, "SelectActivityPickerModel(id="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
