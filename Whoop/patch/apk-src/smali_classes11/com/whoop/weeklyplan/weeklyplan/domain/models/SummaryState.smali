.class public final Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$$serializer;,
        Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 Q2\u00020\u0001:\u0002RQBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u0012\u0010&\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010)J\u0010\u0010+\u001a\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0086\u0001\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00103\u001a\u00020\u00062\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104J\'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001\u00a2\u0006\u0004\u0008;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010>\u001a\u0004\u0008?\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010>\u001a\u0004\u0008@\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010>\u001a\u0004\u0008A\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010B\u001a\u0004\u0008\u0007\u0010 R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010C\u001a\u0004\u0008D\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010E\u001a\u0004\u0008F\u0010$R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008G\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010H\u001a\u0004\u0008I\u0010\'R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010J\u001a\u0004\u0008K\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010J\u001a\u0004\u0008L\u0010)R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010M\u0012\u0004\u0008O\u0010P\u001a\u0004\u0008N\u0010,\u00a8\u0006S"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;",
        "",
        "",
        "planId",
        "titleDisplay",
        "subtitleDisplay",
        "",
        "isDismissible",
        "Lkotlinx/serialization/json/JsonElement;",
        "animation",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
        "headerDisplay",
        "descriptionDisplay",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;",
        "summaryV2",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;",
        "primaryButton",
        "secondaryButton",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;",
        "summary",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/lang/Boolean;",
        "component5",
        "()Lkotlinx/serialization/json/JsonElement;",
        "component6",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
        "component7",
        "component8",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;",
        "component9",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;",
        "component10",
        "component11",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;",
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
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getPlanId",
        "getTitleDisplay",
        "getSubtitleDisplay",
        "Ljava/lang/Boolean;",
        "Lkotlinx/serialization/json/JsonElement;",
        "getAnimation",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
        "getHeaderDisplay",
        "getDescriptionDisplay",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;",
        "getSummaryV2",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;",
        "getPrimaryButton",
        "getSecondaryButton",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;",
        "getSummary",
        "getSummary$annotations",
        "()V",
        "Companion",
        "$serializer",
        "weekly-plan_release"
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

.field public static final Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$Companion;


# instance fields
.field private final animation:Lkotlinx/serialization/json/JsonElement;

.field private final descriptionDisplay:Ljava/lang/String;

.field private final headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

.field private final isDismissible:Ljava/lang/Boolean;

.field private final planId:Ljava/lang/String;

.field private final primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

.field private final secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

.field private final subtitleDisplay:Ljava/lang/String;

.field private final summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

.field private final summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

.field private final titleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$$serializer;

    invoke-virtual {p13}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    iput-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    iput-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    iput-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    iput-object p10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iput-object p11, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iput-object p12, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;)V
    .locals 1

    const-string v0, "planId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animation"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerDisplay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "summary"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    .line 8
    iput-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    .line 9
    iput-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    .line 11
    iput-object p9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    .line 12
    iput-object p10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    .line 13
    iput-object p11, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;ILjava/lang/Object;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSummary$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lad3/n;->a:Lad3/n;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    const/16 v2, 0x8

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary$$serializer;

    iget-object p0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    return-object v0
.end method

.method public final component11()Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final component6()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    return-object v0
.end method

.method public final component9()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;
    .locals 13

    const-string v0, "planId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animation"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerDisplay"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButton"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "summary"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    iget-object p1, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAnimation()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderDisplay()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    return-object v0
.end method

.method public final getPlanId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrimaryButton()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    return-object v0
.end method

.method public final getSecondaryButton()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    return-object v0
.end method

.method public final getSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSummary()Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    return-object v0
.end method

.method public final getSummaryV2()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final isDismissible()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->planId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->titleDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->isDismissible:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->animation:Lkotlinx/serialization/json/JsonElement;

    iget-object v5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    iget-object v6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->descriptionDisplay:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    iget-object v8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iget-object v9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iget-object v10, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;->summary:Lcom/whoop/weeklyplan/weeklyplan/domain/models/Summary;

    const-string v11, ", titleDisplay="

    const-string v12, ", subtitleDisplay="

    const-string v13, "SummaryState(planId="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isDismissible="

    const-string v11, ", animation="

    invoke-static {v3, v2, v1, v11, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headerDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", descriptionDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", summaryV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", primaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", summary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
