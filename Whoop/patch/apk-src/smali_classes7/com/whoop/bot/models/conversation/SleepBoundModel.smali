.class public final Lcom/whoop/bot/models/conversation/SleepBoundModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/SleepBoundModel$$serializer;,
        Lcom/whoop/bot/models/conversation/SleepBoundModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBa\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JX\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00083\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00084\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00085\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00086\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u00088\u0010%\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/SleepBoundModel;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "label",
        "",
        "icon",
        "predictedTime",
        "timeUnit",
        "typicalTitle",
        "typicalTime",
        "Lcom/whoop/bot/models/conversation/AlarmModel;",
        "alarm",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/SleepBoundModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/bot/models/conversation/AlarmModel;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;)Lcom/whoop/bot/models/conversation/SleepBoundModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getLabel",
        "Ljava/lang/String;",
        "getIcon",
        "getPredictedTime",
        "getTimeUnit",
        "getTypicalTitle",
        "getTypicalTime",
        "Lcom/whoop/bot/models/conversation/AlarmModel;",
        "getAlarm",
        "Companion",
        "$serializer",
        "bot_release"
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/SleepBoundModel$Companion;


# instance fields
.field private final alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

.field private final icon:Ljava/lang/String;

.field private final label:Lcom/whoop/design/util/TextResource;

.field private final predictedTime:Lcom/whoop/design/util/TextResource;

.field private final timeUnit:Lcom/whoop/design/util/TextResource;

.field private final typicalTime:Lcom/whoop/design/util/TextResource;

.field private final typicalTitle:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/SleepBoundModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/SleepBoundModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->Companion:Lcom/whoop/bot/models/conversation/SleepBoundModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/bot/models/conversation/SleepBoundModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/SleepBoundModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/bot/models/conversation/SleepBoundModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predictedTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeUnit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typicalTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typicalTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object p7, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/SleepBoundModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/SleepBoundModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/bot/models/conversation/SleepBoundModel;->copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;)Lcom/whoop/bot/models/conversation/SleepBoundModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/SleepBoundModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/bot/models/conversation/AlarmModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/AlarmModel$$serializer;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component7()Lcom/whoop/bot/models/conversation/AlarmModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;)Lcom/whoop/bot/models/conversation/SleepBoundModel;
    .locals 9

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predictedTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeUnit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typicalTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typicalTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/SleepBoundModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/bot/models/conversation/SleepBoundModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/models/conversation/AlarmModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/SleepBoundModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/SleepBoundModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAlarm()Lcom/whoop/bot/models/conversation/AlarmModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPredictedTime()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTimeUnit()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTypicalTime()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTypicalTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/bot/models/conversation/AlarmModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->label:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->icon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->predictedTime:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->timeUnit:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTitle:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->typicalTime:Lcom/whoop/design/util/TextResource;

    iget-object v6, p0, Lcom/whoop/bot/models/conversation/SleepBoundModel;->alarm:Lcom/whoop/bot/models/conversation/AlarmModel;

    const-string v7, ", icon="

    const-string v8, ", predictedTime="

    const-string v9, "SleepBoundModel(label="

    invoke-static {v9, v0, v7, v1, v8}, Lq63/c;->o(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeUnit="

    const-string v7, ", typicalTitle="

    invoke-static {v0, v2, v1, v3, v7}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", typicalTime="

    const-string v2, ", alarm="

    invoke-static {v0, v4, v1, v5, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
