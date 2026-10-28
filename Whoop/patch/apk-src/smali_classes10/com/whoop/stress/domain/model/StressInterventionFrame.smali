.class public final Lcom/whoop/stress/domain/model/StressInterventionFrame;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/stress/domain/model/StressInterventionFrame$$serializer;,
        Lcom/whoop/stress/domain/model/StressInterventionFrame$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:;B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBG\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J@\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010,\u0012\u0004\u0008.\u0010/\u001a\u0004\u0008-\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00100\u0012\u0004\u00082\u0010/\u001a\u0004\u00081\u0010\u001eR&\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00103\u0012\u0004\u00085\u0010/\u001a\u0004\u00084\u0010 R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00106\u0012\u0004\u00088\u0010/\u001a\u0004\u00087\u0010\"\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/stress/domain/model/StressInterventionFrame;",
        "",
        "",
        "time",
        "",
        "overlay",
        "",
        "Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;",
        "bottomDisplay",
        "Lcom/whoop/stress/domain/model/BreathType;",
        "breathType",
        "<init>",
        "(JLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IJLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stress_release",
        "(Lcom/whoop/stress/domain/model/StressInterventionFrame;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()J",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/stress/domain/model/BreathType;",
        "copy",
        "(JLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;)Lcom/whoop/stress/domain/model/StressInterventionFrame;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "J",
        "getTime",
        "getTime$annotations",
        "()V",
        "Ljava/lang/String;",
        "getOverlay",
        "getOverlay$annotations",
        "Ljava/util/List;",
        "getBottomDisplay",
        "getBottomDisplay$annotations",
        "Lcom/whoop/stress/domain/model/BreathType;",
        "getBreathType",
        "getBreathType$annotations",
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

.field public static final Companion:Lcom/whoop/stress/domain/model/StressInterventionFrame$a;


# instance fields
.field private final bottomDisplay:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "bottom_display"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;",
            ">;"
        }
    .end annotation
.end field

.field private final breathType:Lcom/whoop/stress/domain/model/BreathType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "breath_type"
    .end annotation
.end field

.field private final overlay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "overlay_text_display"
    .end annotation
.end field

.field private final time:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "visible_time_ms"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/stress/domain/model/StressInterventionFrame$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/stress/domain/model/StressInterventionFrame$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->Companion:Lcom/whoop/stress/domain/model/StressInterventionFrame$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lih1/b;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lih1/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lih1/b;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lih1/b;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x4

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v1, 0x2

    aput-object v2, v3, v1

    const/4 v1, 0x3

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/stress/domain/model/StressInterventionFrame;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IJLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/stress/domain/model/StressInterventionFrame$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressInterventionFrame$$serializer;

    invoke-virtual {p7}, Lcom/whoop/stress/domain/model/StressInterventionFrame$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;",
            ">;",
            "Lcom/whoop/stress/domain/model/BreathType;",
            ")V"
        }
    .end annotation

    const-string v0, "bottomDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "breathType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    .line 4
    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    .line 6
    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/BreathType;->Companion:Lcom/whoop/stress/domain/model/BreathType$a;

    invoke-virtual {v0}, Lcom/whoop/stress/domain/model/BreathType$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressInterventionFrame;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressInterventionFrame;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/stress/domain/model/StressInterventionFrame;JLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;ILjava/lang/Object;)Lcom/whoop/stress/domain/model/StressInterventionFrame;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-wide p1, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    :cond_3
    move-object v0, p0

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/whoop/stress/domain/model/StressInterventionFrame;->copy(JLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;)Lcom/whoop/stress/domain/model/StressInterventionFrame;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBottomDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bottom_display"
    .end annotation

    return-void
.end method

.method public static synthetic getBreathType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "breath_type"
    .end annotation

    return-void
.end method

.method public static synthetic getOverlay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "overlay_text_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTime$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "visible_time_ms"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stress_release(Lcom/whoop/stress/domain/model/StressInterventionFrame;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/stress/domain/model/BreathType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;)Lcom/whoop/stress/domain/model/StressInterventionFrame;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;",
            ">;",
            "Lcom/whoop/stress/domain/model/BreathType;",
            ")",
            "Lcom/whoop/stress/domain/model/StressInterventionFrame;"
        }
    .end annotation

    const-string v0, "bottomDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "breathType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/stress/domain/model/StressInterventionFrame;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/stress/domain/model/StressInterventionFrame;-><init>(JLjava/lang/String;Ljava/util/List;Lcom/whoop/stress/domain/model/BreathType;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/stress/domain/model/StressInterventionFrame;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/stress/domain/model/StressInterventionFrame;

    iget-wide v3, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    iget-wide v5, p1, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    iget-object p1, p1, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBottomDisplay()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    return-object v0
.end method

.method public final getBreathType()Lcom/whoop/stress/domain/model/BreathType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    return-object v0
.end method

.method public final getOverlay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->time:J

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->overlay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->bottomDisplay:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/stress/domain/model/StressInterventionFrame;->breathType:Lcom/whoop/stress/domain/model/BreathType;

    const-string v5, "StressInterventionFrame(time="

    const-string v6, ", overlay="

    invoke-static {v5, v6, v0, v1, v2}, Lvl/b;->m(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bottomDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", breathType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
