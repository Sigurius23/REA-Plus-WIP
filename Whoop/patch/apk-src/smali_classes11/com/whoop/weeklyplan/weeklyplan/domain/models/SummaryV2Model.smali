.class public final Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$$serializer;,
        Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 B2\u00020\u0001:\u0002CBBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bk\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+Jj\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010 J\u0010\u0010/\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00105\u001a\u0004\u00087\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00108\u001a\u0004\u00089\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u0008:\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010=\u001a\u0004\u0008>\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010=\u001a\u0004\u0008?\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010@\u001a\u0004\u0008A\u0010+\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;",
        "",
        "",
        "titleDisplay",
        "subtitleDisplay",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
        "headerDisplay",
        "descriptionDisplay",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;",
        "summaryV2",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;",
        "primaryButton",
        "secondaryButton",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;",
        "metadata",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
        "component4",
        "component5",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;",
        "component6",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;",
        "component7",
        "component8",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitleDisplay",
        "getSubtitleDisplay",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;",
        "getHeaderDisplay",
        "getDescriptionDisplay",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;",
        "getSummaryV2",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;",
        "getPrimaryButton",
        "getSecondaryButton",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;",
        "getMetadata",
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

.field public static final Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$Companion;


# instance fields
.field private final descriptionDisplay:Ljava/lang/String;

.field private final headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

.field private final metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

.field private final primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

.field private final secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

.field private final subtitleDisplay:Ljava/lang/String;

.field private final summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

.field private final titleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->Companion:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$$serializer;

    invoke-virtual {p10}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    iput-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    iput-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iput-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    return-void

    :cond_1
    iput-object p9, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)V
    .locals 1

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    .line 8
    iput-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    .line 9
    iput-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    .line 10
    iput-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;ILjava/lang/Object;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData$$serializer;

    iget-object p0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    return-object v0
.end method

.method public final component6()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    return-object v0
.end method

.method public final component7()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;
    .locals 10

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;Ljava/lang/String;Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iget-object v3, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    iget-object p1, p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderDisplay()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    return-object v0
.end method

.method public final getPrimaryButton()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    return-object v0
.end method

.method public final getSecondaryButton()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    return-object v0
.end method

.method public final getSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSummaryV2()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->titleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->subtitleDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->headerDisplay:Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    iget-object v3, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->descriptionDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->summaryV2:Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    iget-object v5, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->primaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iget-object v6, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->secondaryButton:Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    iget-object v7, p0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->metadata:Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    const-string v8, ", subtitleDisplay="

    const-string v9, ", headerDisplay="

    const-string v10, "SummaryV2Model(titleDisplay="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", descriptionDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", summaryV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", primaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
