.class public final Lcom/whoop/design/models/calendar/CalendarDateModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/calendar/CalendarDateModel$$serializer;,
        Lcom/whoop/design/models/calendar/CalendarDateModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 T2\u00020\u0001:\u0002UTB\u0085\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u0087\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u008e\u0001\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010-J\u0010\u00103\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00106\u001a\u00020\u00042\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00086\u00107J\'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001\u00a2\u0006\u0004\u0008>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010A\u001a\u0004\u0008B\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010C\u001a\u0004\u0008D\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010E\u001a\u0004\u0008F\u0010!R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010G\u001a\u0004\u0008H\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010I\u001a\u0004\u0008J\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010K\u001a\u0004\u0008L\u0010\'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010K\u001a\u0004\u0008M\u0010\'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010N\u001a\u0004\u0008O\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010K\u001a\u0004\u0008\u0010\u0010\'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010P\u001a\u0004\u0008Q\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010R\u001a\u0004\u0008S\u0010/\u00a8\u0006V"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "dateValueDisplay",
        "",
        "hasData",
        "",
        "cycleId",
        "Lcom/whoop/design/models/calendar/CalendarDayState;",
        "dayState",
        "Lcom/whoop/design/models/calendar/CalendarPhase;",
        "phase",
        "firstDayOfPhase",
        "lastDayOfPhase",
        "Lcom/whoop/design/models/calendar/CalendarDayBottomState;",
        "bottomState",
        "isHidden",
        "",
        "date",
        "Lcom/whoop/design/models/calendar/CalendarOverlay;",
        "overlay",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Z",
        "component3",
        "()Ljava/lang/Long;",
        "component4",
        "()Lcom/whoop/design/models/calendar/CalendarDayState;",
        "component5",
        "()Lcom/whoop/design/models/calendar/CalendarPhase;",
        "component6",
        "()Ljava/lang/Boolean;",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/calendar/CalendarDayBottomState;",
        "component9",
        "component10",
        "()Ljava/lang/String;",
        "component11",
        "()Lcom/whoop/design/models/calendar/CalendarOverlay;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "toString",
        "hashCode",
        "()I",
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
        "(Lcom/whoop/design/models/calendar/CalendarDateModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getDateValueDisplay",
        "Z",
        "getHasData",
        "Ljava/lang/Long;",
        "getCycleId",
        "Lcom/whoop/design/models/calendar/CalendarDayState;",
        "getDayState",
        "Lcom/whoop/design/models/calendar/CalendarPhase;",
        "getPhase",
        "Ljava/lang/Boolean;",
        "getFirstDayOfPhase",
        "getLastDayOfPhase",
        "Lcom/whoop/design/models/calendar/CalendarDayBottomState;",
        "getBottomState",
        "Ljava/lang/String;",
        "getDate",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/calendar/CalendarDateModel$Companion;


# instance fields
.field private final bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

.field private final cycleId:Ljava/lang/Long;

.field private final date:Ljava/lang/String;

.field private final dateValueDisplay:Lcom/whoop/design/util/TextResource;

.field private final dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

.field private final firstDayOfPhase:Ljava/lang/Boolean;

.field private final hasData:Z

.field private final isHidden:Ljava/lang/Boolean;

.field private final lastDayOfPhase:Ljava/lang/Boolean;

.field private final overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

.field private final phase:Lcom/whoop/design/models/calendar/CalendarPhase;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/design/models/calendar/CalendarDateModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/calendar/CalendarDateModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/calendar/CalendarDateModel;->Companion:Lcom/whoop/design/models/calendar/CalendarDateModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/design/models/calendar/CalendarDateModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ls52/d;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ls52/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Ls52/d;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Ls52/d;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Ls52/d;

    const/4 v7, 0x4

    invoke-direct {v6, v7}, Ls52/d;-><init>(I)V

    invoke-static {v0, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v6, 0xb

    new-array v6, v6, [Ll83/h;

    const/4 v8, 0x0

    aput-object v1, v6, v8

    const/4 v8, 0x1

    aput-object v1, v6, v8

    aput-object v1, v6, v3

    aput-object v2, v6, v5

    aput-object v4, v6, v7

    const/4 v2, 0x5

    aput-object v1, v6, v2

    const/4 v2, 0x6

    aput-object v1, v6, v2

    const/4 v2, 0x7

    aput-object v0, v6, v2

    const/16 v0, 0x8

    aput-object v1, v6, v0

    const/16 v0, 0x9

    aput-object v1, v6, v0

    const/16 v0, 0xa

    aput-object v1, v6, v0

    sput-object v6, Lcom/whoop/design/models/calendar/CalendarDateModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/design/models/calendar/CalendarDateModel;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p13, p1, 0x1

    if-nez p13, :cond_0

    .line 3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    goto :goto_0

    :cond_1
    iput-boolean p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    const-wide/16 p2, 0x0

    .line 5
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 7
    sget-object p2, Lcom/whoop/design/models/calendar/CalendarDayState;->NO_DATA:Lcom/whoop/design/models/calendar/CalendarDayState;

    .line 8
    iput-object p2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    goto :goto_8

    :cond_9
    iput-object p11, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    :goto_8
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_a

    iput-object p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    return-void

    :cond_a
    iput-object p12, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V
    .locals 1

    const-string v0, "dateValueDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    .line 11
    iput-boolean p2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    .line 12
    iput-object p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    .line 13
    iput-object p4, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    .line 14
    iput-object p5, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    .line 15
    iput-object p6, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    .line 16
    iput-object p7, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    .line 17
    iput-object p8, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    .line 18
    iput-object p9, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    .line 19
    iput-object p10, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    .line 20
    iput-object p11, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    .line 21
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    const-wide/16 v0, 0x0

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    .line 23
    sget-object p4, Lcom/whoop/design/models/calendar/CalendarDayState;->NO_DATA:Lcom/whoop/design/models/calendar/CalendarDayState;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    const/4 v0, 0x0

    if-eqz p13, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move-object p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move-object p13, v0

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_a
    move-object p13, p11

    move-object p12, p10

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 24
    :goto_0
    invoke-direct/range {p2 .. p13}, Lcom/whoop/design/models/calendar/CalendarDateModel;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.calendar.CalendarDayState"

    invoke-static {}, Lcom/whoop/design/models/calendar/CalendarDayState;->values()[Lcom/whoop/design/models/calendar/CalendarDayState;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.calendar.CalendarPhase"

    invoke-static {}, Lcom/whoop/design/models/calendar/CalendarPhase;->values()[Lcom/whoop/design/models/calendar/CalendarPhase;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.calendar.CalendarDayBottomState"

    invoke-static {}, Lcom/whoop/design/models/calendar/CalendarDayBottomState;->values()[Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/calendar/CalendarDateModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/CalendarDateModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/calendar/CalendarDateModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/calendar/CalendarDateModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/calendar/CalendarDateModel;Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;ILjava/lang/Object;)Lcom/whoop/design/models/calendar/CalendarDateModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-boolean p2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/calendar/CalendarDateModel;->copy(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)Lcom/whoop/design/models/calendar/CalendarDateModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/calendar/CalendarDateModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/design/models/calendar/CalendarDateModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    if-eqz v2, :cond_3

    :goto_1
    iget-boolean v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_6

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_6
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    sget-object v3, Lcom/whoop/design/models/calendar/CalendarDayState;->NO_DATA:Lcom/whoop/design/models/calendar/CalendarDayState;

    if-eq v2, v3, :cond_8

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_8
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_4

    :cond_9
    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    if-eqz v2, :cond_a

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_a
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_5

    :cond_b
    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    if-eqz v2, :cond_c

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_c
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_6

    :cond_d
    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    if-eqz v2, :cond_e

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_e
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_7

    :cond_f
    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    if-eqz v2, :cond_10

    :goto_7
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_10
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_8

    :cond_11
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    if-eqz v1, :cond_12

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_12
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_13

    goto :goto_9

    :cond_13
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    if-eqz v1, :cond_14

    :goto_9
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_14
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_15

    goto :goto_a

    :cond_15
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    if-eqz v1, :cond_16

    :goto_a
    sget-object v1, Lcom/whoop/design/models/calendar/CalendarOverlay$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/CalendarOverlay$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_16
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/calendar/CalendarOverlay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    return v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/calendar/CalendarDayState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/calendar/CalendarPhase;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/calendar/CalendarDayBottomState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)Lcom/whoop/design/models/calendar/CalendarDateModel;
    .locals 13

    const-string v0, "dateValueDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayState"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/calendar/CalendarDateModel;

    move-object v2, p1

    move v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/calendar/CalendarDateModel;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/calendar/CalendarDateModel;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    iget-object p1, p1, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getBottomState()Lcom/whoop/design/models/calendar/CalendarDayBottomState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    return-object v0
.end method

.method public final getCycleId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public final getDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateValueDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDayState()Lcom/whoop/design/models/calendar/CalendarDayState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    return-object v0
.end method

.method public final getFirstDayOfPhase()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getHasData()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    return v0
.end method

.method public final getLastDayOfPhase()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getOverlay()Lcom/whoop/design/models/calendar/CalendarOverlay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    return-object v0
.end method

.method public final getPhase()Lcom/whoop/design/models/calendar/CalendarPhase;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    if-nez v0, :cond_4

    move v0, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    move v0, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    if-nez v0, :cond_6

    move v0, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    if-nez v0, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/design/models/calendar/CalendarOverlay;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v2, v3

    return v2
.end method

.method public final isHidden()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dateValueDisplay:Lcom/whoop/design/util/TextResource;

    iget-boolean v1, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->hasData:Z

    iget-object v2, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->cycleId:Ljava/lang/Long;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->dayState:Lcom/whoop/design/models/calendar/CalendarDayState;

    iget-object v4, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->phase:Lcom/whoop/design/models/calendar/CalendarPhase;

    iget-object v5, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->firstDayOfPhase:Ljava/lang/Boolean;

    iget-object v6, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->lastDayOfPhase:Ljava/lang/Boolean;

    iget-object v7, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->bottomState:Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    iget-object v8, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->isHidden:Ljava/lang/Boolean;

    iget-object v9, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->date:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/design/models/calendar/CalendarDateModel;->overlay:Lcom/whoop/design/models/calendar/CalendarOverlay;

    const-string v11, ", hasData="

    const-string v12, ", cycleId="

    const-string v13, "CalendarDateModel(dateValueDisplay="

    invoke-static {v13, v0, v11, v1, v12}, Lq63/c;->p(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dayState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", phase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", firstDayOfPhase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastDayOfPhase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isHidden="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", date="

    const-string v2, ", overlay="

    invoke-static {v8, v1, v9, v2, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
