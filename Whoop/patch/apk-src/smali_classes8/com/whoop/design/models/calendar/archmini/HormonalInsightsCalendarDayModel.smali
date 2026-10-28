.class public final Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$$serializer;,
        Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 P2\u00020\u0001:\u0002QPBw\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014B\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001bJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0098\u0001\u0010,\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010\u001bJ\u0010\u0010/\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u00020\u00052\u0008\u00102\u001a\u0004\u0018\u000101H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104J\'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001\u00a2\u0006\u0004\u0008;\u0010<R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010>\u001a\u0004\u0008?\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010>\u001a\u0004\u0008@\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010A\u001a\u0004\u0008B\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010A\u001a\u0004\u0008C\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010D\u001a\u0004\u0008E\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010F\u001a\u0004\u0008G\u0010#R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008H\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008I\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010J\u001a\u0004\u0008K\u0010\'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010J\u001a\u0004\u0008L\u0010\'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010>\u001a\u0004\u0008M\u0010\u001bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010N\u001a\u0004\u0008O\u0010+\u00a8\u0006R"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;",
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "",
        "date",
        "dateValueDisplay",
        "",
        "hasData",
        "hidden",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "",
        "cycleId",
        "dayState",
        "phase",
        "firstDayOfPhase",
        "lastDayOfPhase",
        "bottomState",
        "Lcom/whoop/design/models/calendar/CalendarOverlay;",
        "overlay",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "component5",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component6",
        "()Ljava/lang/Long;",
        "component7",
        "component8",
        "component9",
        "()Ljava/lang/Boolean;",
        "component10",
        "component11",
        "component12",
        "()Lcom/whoop/design/models/calendar/CalendarOverlay;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getDate",
        "getDateValueDisplay",
        "Z",
        "getHasData",
        "getHidden",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
        "Ljava/lang/Long;",
        "getCycleId",
        "getDayState",
        "getPhase",
        "Ljava/lang/Boolean;",
        "getFirstDayOfPhase",
        "getLastDayOfPhase",
        "getBottomState",
        "Lcom/whoop/design/models/calendar/CalendarOverlay;",
        "getOverlay",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$Companion;


# instance fields
.field private final bottomState:Ljava/lang/String;

.field private final cycleId:Ljava/lang/Long;

.field private final date:Ljava/lang/String;

.field private final dateValueDisplay:Ljava/lang/String;

.field private final dayState:Ljava/lang/String;

.field private final firstDayOfPhase:Ljava/lang/Boolean;

.field private final hasData:Z

.field private final hidden:Z

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final lastDayOfPhase:Ljava/lang/Boolean;

.field private final overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

.field private final phase:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->Companion:Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$Companion;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xfff

    const/16 v0, 0xfff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->date:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hasData:Z

    iput-boolean p5, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hidden:Z

    iput-object p6, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p7, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    iput-object p8, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    iput-object p11, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    iput-object p12, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V
    .locals 1

    const-string v0, "dateValueDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayState"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->date:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hasData:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hidden:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;ILjava/lang/Object;)Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->date:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-boolean p3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hasData:Z

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-boolean p4, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hidden:Z

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->copy(Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getDate()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getDateValueDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getHasData()Z

    move-result v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getHidden()Z

    move-result v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v2

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/calendar/CalendarOverlay$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/CalendarOverlay$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    const/16 v1, 0xb

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/calendar/CalendarOverlay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hasData:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hidden:Z

    return v0
.end method

.method public final component5()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component6()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;
    .locals 14

    const-string v0, "dateValueDisplay"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayState"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;

    move-object v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLcom/whoop/navigation/models/GenericInteraction;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->date:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->date:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hasData:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hasData:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hidden:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hidden:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    iget-object p1, p1, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBottomState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    return-object v0
.end method

.method public final getCycleId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public getDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public getDateValueDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirstDayOfPhase()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getHasData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hasData:Z

    return v0
.end method

.method public getHidden()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hidden:Z

    return v0
.end method

.method public getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getLastDayOfPhase()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getOverlay()Lcom/whoop/design/models/calendar/CalendarOverlay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    return-object v0
.end method

.method public final getPhase()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->date:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hasData:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hidden:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/design/models/calendar/CalendarOverlay;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->date:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hasData:Z

    iget-boolean v3, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->hidden:Z

    iget-object v4, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v5, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->cycleId:Ljava/lang/Long;

    iget-object v6, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->dayState:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->phase:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->firstDayOfPhase:Ljava/lang/Boolean;

    iget-object v9, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->lastDayOfPhase:Ljava/lang/Boolean;

    iget-object v10, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->bottomState:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    const-string v12, ", dateValueDisplay="

    const-string v13, ", hasData="

    const-string v14, "HormonalInsightsCalendarDayModel(date="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hidden="

    const-string v12, ", interaction="

    invoke-static {v0, v2, v1, v3, v12}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cycleId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dayState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", phase="

    const-string v2, ", firstDayOfPhase="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", lastDayOfPhase="

    const-string v2, ", bottomState="

    invoke-static {v0, v8, v1, v9, v2}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", overlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
