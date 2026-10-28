.class public final Lcom/whoop/stress/domain/model/StressIntervention;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/stress/domain/model/StressIntervention$$serializer;,
        Lcom/whoop/stress/domain/model/StressIntervention$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 X2\u00020\u0001:\u0002YZBl\u0012\u0019\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\t0\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018By\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0008\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0017\u0010\u001cJ#\u0010\u001d\u001a\u00150\u0002j\u0002`\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\t0\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\"J\u0010\u0010%\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0087\u0001\u0010-\u001a\u00020\u00002\u001b\u0008\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\t0\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\"J\u0010\u00100\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010 J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104J\'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001\u00a2\u0006\u0004\u0008;\u0010<R3\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003\u00a2\u0006\u000c\u0008\u0004\u0012\u0008\u0008\u0005\u0012\u0004\u0008\t0\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010>\u0012\u0004\u0008@\u0010A\u001a\u0004\u0008?\u0010\u001eR \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010B\u0012\u0004\u0008D\u0010A\u001a\u0004\u0008C\u0010 R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010E\u0012\u0004\u0008G\u0010A\u001a\u0004\u0008F\u0010\"R \u0010\u000c\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010E\u0012\u0004\u0008I\u0010A\u001a\u0004\u0008H\u0010\"R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010E\u0012\u0004\u0008K\u0010A\u001a\u0004\u0008J\u0010\"R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010L\u0012\u0004\u0008N\u0010A\u001a\u0004\u0008M\u0010&R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010O\u0012\u0004\u0008Q\u0010A\u001a\u0004\u0008P\u0010(R&\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010R\u0012\u0004\u0008T\u0010A\u001a\u0004\u0008S\u0010*R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010U\u0012\u0004\u0008W\u0010A\u001a\u0004\u0008V\u0010,\u00a8\u0006["
    }
    d2 = {
        "Lcom/whoop/stress/domain/model/StressIntervention;",
        "",
        "Lcom/google/gson/JsonObject;",
        "Lcom/whoop/design/json/serializers/SerializableJsonObject;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "animationJson",
        "",
        "repeatCount",
        "",
        "title",
        "button",
        "sessionDone",
        "Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;",
        "finishDialog",
        "Lcom/whoop/stress/domain/model/DisclaimerScreen;",
        "disclaimerScreen",
        "",
        "Lcom/whoop/stress/domain/model/StressInterventionFrame;",
        "frames",
        "Lcom/whoop/stress/domain/model/HoldingFrame;",
        "holdingFrame",
        "<init>",
        "(Lcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/google/gson/JsonObject;",
        "component2",
        "()I",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;",
        "component7",
        "()Lcom/whoop/stress/domain/model/DisclaimerScreen;",
        "component8",
        "()Ljava/util/List;",
        "component9",
        "()Lcom/whoop/stress/domain/model/HoldingFrame;",
        "copy",
        "(Lcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;)Lcom/whoop/stress/domain/model/StressIntervention;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stress_release",
        "(Lcom/whoop/stress/domain/model/StressIntervention;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/google/gson/JsonObject;",
        "getAnimationJson",
        "getAnimationJson$annotations",
        "()V",
        "I",
        "getRepeatCount",
        "getRepeatCount$annotations",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "getButton",
        "getButton$annotations",
        "getSessionDone",
        "getSessionDone$annotations",
        "Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;",
        "getFinishDialog",
        "getFinishDialog$annotations",
        "Lcom/whoop/stress/domain/model/DisclaimerScreen;",
        "getDisclaimerScreen",
        "getDisclaimerScreen$annotations",
        "Ljava/util/List;",
        "getFrames",
        "getFrames$annotations",
        "Lcom/whoop/stress/domain/model/HoldingFrame;",
        "getHoldingFrame",
        "getHoldingFrame$annotations",
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

.field public static final Companion:Lcom/whoop/stress/domain/model/StressIntervention$a;


# instance fields
.field private final animationJson:Lcom/google/gson/JsonObject;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "animation"
    .end annotation
.end field

.field private final button:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "button_display"
    .end annotation
.end field

.field private final disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "intro_screen"
    .end annotation
.end field

.field private final finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "finish_dialogue"
    .end annotation
.end field

.field private final frames:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "frames"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionFrame;",
            ">;"
        }
    .end annotation
.end field

.field private final holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "holding_frame"
    .end annotation
.end field

.field private final repeatCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "repeat_count"
    .end annotation
.end field

.field private final sessionDone:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "session_done_display"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title_display"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/stress/domain/model/StressIntervention$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/stress/domain/model/StressIntervention$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/stress/domain/model/StressIntervention;->Companion:Lcom/whoop/stress/domain/model/StressIntervention$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/stress/domain/model/StressIntervention;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lih1/b;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lih1/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0x9

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v2, v3, v4

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/stress/domain/model/StressIntervention;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/stress/domain/model/StressIntervention$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressIntervention$$serializer;

    invoke-virtual {p11}, Lcom/whoop/stress/domain/model/StressIntervention$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    iput p3, p0, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    iput-object p8, p0, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    iput-object p9, p0, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    iput-object p10, p0, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    return-void
.end method

.method public constructor <init>(Lcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;",
            "Lcom/whoop/stress/domain/model/DisclaimerScreen;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionFrame;",
            ">;",
            "Lcom/whoop/stress/domain/model/HoldingFrame;",
            ")V"
        }
    .end annotation

    const-string v0, "animationJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionDone"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finishDialog"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frames"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    .line 4
    iput p2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    .line 5
    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    .line 9
    iput-object p7, p0, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    .line 10
    iput-object p8, p0, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/stress/domain/model/StressInterventionFrame$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressInterventionFrame$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressIntervention;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/StressIntervention;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/stress/domain/model/StressIntervention;Lcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;ILjava/lang/Object;)Lcom/whoop/stress/domain/model/StressIntervention;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    :cond_8
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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/stress/domain/model/StressIntervention;->copy(Lcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;)Lcom/whoop/stress/domain/model/StressIntervention;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAnimationJson$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "animation"
    .end annotation

    return-void
.end method

.method public static synthetic getButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "button_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDisclaimerScreen$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "intro_screen"
    .end annotation

    return-void
.end method

.method public static synthetic getFinishDialog$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "finish_dialogue"
    .end annotation

    return-void
.end method

.method public static synthetic getFrames$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "frames"
    .end annotation

    return-void
.end method

.method public static synthetic getHoldingFrame$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "holding_frame"
    .end annotation

    return-void
.end method

.method public static synthetic getRepeatCount$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "repeat_count"
    .end annotation

    return-void
.end method

.method public static synthetic getSessionDone$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "session_done_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stress_release(Lcom/whoop/stress/domain/model/StressIntervention;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/stress/domain/model/StressIntervention;->$childSerializers:[Ll83/h;

    sget-object v1, Lo91/f;->a:Lo91/f;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/stress/domain/model/StressInterventionFinishDialog$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/stress/domain/model/DisclaimerScreen$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/DisclaimerScreen$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/stress/domain/model/HoldingFrame$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/HoldingFrame$$serializer;

    iget-object p0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/google/gson/JsonObject;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    return-object v0
.end method

.method public final component7()Lcom/whoop/stress/domain/model/DisclaimerScreen;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionFrame;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Lcom/whoop/stress/domain/model/HoldingFrame;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    return-object v0
.end method

.method public final copy(Lcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;)Lcom/whoop/stress/domain/model/StressIntervention;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;",
            "Lcom/whoop/stress/domain/model/DisclaimerScreen;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionFrame;",
            ">;",
            "Lcom/whoop/stress/domain/model/HoldingFrame;",
            ")",
            "Lcom/whoop/stress/domain/model/StressIntervention;"
        }
    .end annotation

    const-string v0, "animationJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionDone"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finishDialog"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frames"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/stress/domain/model/StressIntervention;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/stress/domain/model/StressIntervention;-><init>(Lcom/google/gson/JsonObject;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;Lcom/whoop/stress/domain/model/DisclaimerScreen;Ljava/util/List;Lcom/whoop/stress/domain/model/HoldingFrame;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/stress/domain/model/StressIntervention;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/stress/domain/model/StressIntervention;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    iget v3, p1, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    iget-object p1, p1, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAnimationJson()Lcom/google/gson/JsonObject;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    return-object v0
.end method

.method public final getButton()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisclaimerScreen()Lcom/whoop/stress/domain/model/DisclaimerScreen;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    return-object v0
.end method

.method public final getFinishDialog()Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    return-object v0
.end method

.method public final getFrames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressInterventionFrame;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    return-object v0
.end method

.method public final getHoldingFrame()Lcom/whoop/stress/domain/model/HoldingFrame;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    return-object v0
.end method

.method public final getRepeatCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    return v0
.end method

.method public final getSessionDone()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    invoke-virtual {v0}, Lcom/google/gson/JsonObject;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/stress/domain/model/DisclaimerScreen;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/HoldingFrame;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressIntervention;->animationJson:Lcom/google/gson/JsonObject;

    iget v1, p0, Lcom/whoop/stress/domain/model/StressIntervention;->repeatCount:I

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressIntervention;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressIntervention;->button:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/stress/domain/model/StressIntervention;->sessionDone:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/stress/domain/model/StressIntervention;->finishDialog:Lcom/whoop/stress/domain/model/StressInterventionFinishDialog;

    iget-object v6, p0, Lcom/whoop/stress/domain/model/StressIntervention;->disclaimerScreen:Lcom/whoop/stress/domain/model/DisclaimerScreen;

    iget-object v7, p0, Lcom/whoop/stress/domain/model/StressIntervention;->frames:Ljava/util/List;

    iget-object v8, p0, Lcom/whoop/stress/domain/model/StressIntervention;->holdingFrame:Lcom/whoop/stress/domain/model/HoldingFrame;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "StressIntervention(animationJson="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", repeatCount="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", button="

    const-string v1, ", sessionDone="

    invoke-static {v9, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", finishDialog="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", disclaimerScreen="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", frames="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", holdingFrame="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
