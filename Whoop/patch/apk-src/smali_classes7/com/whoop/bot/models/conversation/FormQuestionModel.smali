.class public final Lcom/whoop/bot/models/conversation/FormQuestionModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/FormQuestionModel$$serializer;,
        Lcom/whoop/bot/models/conversation/FormQuestionModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0081\u0008\u0018\u0000 Q2\u00020\u0001:\u0002RQB\u0093\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u009d\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0008\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0008\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0016\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0016\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\u001dJ\u0010\u0010.\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010#J\u009c\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010\u001dJ\u0010\u00102\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010#J\u001a\u00104\u001a\u00020\n2\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105J\'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001\u00a2\u0006\u0004\u0008<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010?\u001a\u0004\u0008@\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010?\u001a\u0004\u0008A\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010?\u001a\u0004\u0008B\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010C\u001a\u0004\u0008D\u0010!R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010E\u001a\u0004\u0008F\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010G\u001a\u0004\u0008\u000b\u0010%R\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010H\u001a\u0004\u0008I\u0010\'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010J\u001a\u0004\u0008K\u0010)R\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010?\u001a\u0004\u0008L\u0010\u001dR\u0017\u0010\u0012\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010?\u001a\u0004\u0008M\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010?\u001a\u0004\u0008N\u0010\u001dR\u0017\u0010\u0014\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010?\u001a\u0004\u0008O\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010E\u001a\u0004\u0008P\u0010#\u00a8\u0006S"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/FormQuestionModel;",
        "",
        "",
        "id",
        "prompt",
        "type",
        "Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;",
        "answerDisplayStyle",
        "",
        "maxSelections",
        "",
        "isRequired",
        "",
        "Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;",
        "answers",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "onAnswer",
        "userVisibleProgressIndicator",
        "userVisibleSubmitButtonText",
        "userVisibleCompletedButtonText",
        "placeholder",
        "userInputTextMaxLength",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;",
        "component5",
        "()I",
        "component6",
        "()Z",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/bot/models/conversation/FormQuestionModel;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/FormQuestionModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getPrompt",
        "getType",
        "Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;",
        "getAnswerDisplayStyle",
        "I",
        "getMaxSelections",
        "Z",
        "Ljava/util/List;",
        "getAnswers",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getOnAnswer",
        "getUserVisibleProgressIndicator",
        "getUserVisibleSubmitButtonText",
        "getUserVisibleCompletedButtonText",
        "getPlaceholder",
        "getUserInputTextMaxLength",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/bot/models/conversation/FormQuestionModel$Companion;


# instance fields
.field private final answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

.field private final answers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final isRequired:Z

.field private final maxSelections:I

.field private final onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

.field private final placeholder:Ljava/lang/String;

.field private final prompt:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final userInputTextMaxLength:I

.field private final userVisibleCompletedButtonText:Ljava/lang/String;

.field private final userVisibleProgressIndicator:Ljava/lang/String;

.field private final userVisibleSubmitButtonText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/bot/models/conversation/FormQuestionModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/FormQuestionModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->Companion:Lcom/whoop/bot/models/conversation/FormQuestionModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ljl0/a;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Ljl0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Ljl0/a;

    const/4 v6, 0x5

    invoke-direct {v5, v6}, Ljl0/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Ljl0/a;

    const/4 v8, 0x6

    invoke-direct {v7, v8}, Ljl0/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0xd

    new-array v7, v7, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v7, v9

    const/4 v9, 0x1

    aput-object v1, v7, v9

    const/4 v9, 0x2

    aput-object v1, v7, v9

    const/4 v9, 0x3

    aput-object v3, v7, v9

    aput-object v1, v7, v4

    aput-object v1, v7, v6

    aput-object v5, v7, v8

    const/4 v3, 0x7

    aput-object v2, v7, v3

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v1, v7, v0

    const/16 v0, 0xa

    aput-object v1, v7, v0

    const/16 v0, 0xb

    aput-object v1, v7, v0

    const/16 v0, 0xc

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/bot/models/conversation/FormQuestionModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 16

    .line 1
    const/16 v14, 0x1fff

    const/4 v15, 0x0

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

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lcom/whoop/bot/models/conversation/FormQuestionModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const-string v1, ""

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    const/4 p4, 0x1

    if-nez p2, :cond_4

    iput p4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    goto :goto_4

    :cond_4
    iput p6, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-boolean p4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    goto :goto_5

    :cond_5
    iput-boolean p7, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    .line 3
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    goto :goto_9

    :cond_9
    iput-object p11, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    :goto_9
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    goto :goto_a

    :cond_a
    iput-object p12, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    :goto_a
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    goto :goto_b

    :cond_b
    iput-object p13, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    :goto_b
    and-int/lit16 p1, p1, 0x1000

    if-nez p1, :cond_c

    const/16 p1, 0x7d0

    :goto_c
    iput p1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    return-void

    :cond_c
    move/from16 p1, p14

    goto :goto_c
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;",
            "IZ",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prompt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answers"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userVisibleProgressIndicator"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userVisibleSubmitButtonText"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userVisibleCompletedButtonText"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholder"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    .line 10
    iput p5, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    .line 11
    iput-boolean p6, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    .line 12
    iput-object p7, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    .line 13
    iput-object p8, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    .line 14
    iput-object p9, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    .line 15
    iput-object p10, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    .line 16
    iput-object p11, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    .line 17
    iput-object p12, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    .line 18
    iput p13, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    .line 19
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    move-object v3, v2

    goto :goto_1

    :cond_2
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    move-object v4, v5

    goto :goto_2

    :cond_3
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v6, v0, 0x10

    const/4 v7, 0x1

    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_3

    :cond_4
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    goto :goto_4

    :cond_5
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    .line 20
    sget-object v8, Lm83/y;->w:Lm83/y;

    goto :goto_5

    :cond_6
    move-object/from16 v8, p7

    :goto_5
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    goto :goto_6

    :cond_7
    move-object/from16 v5, p8

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    move-object v9, v2

    goto :goto_7

    :cond_8
    move-object/from16 v9, p9

    :goto_7
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    move-object v10, v2

    goto :goto_8

    :cond_9
    move-object/from16 v10, p10

    :goto_8
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    move-object v11, v2

    goto :goto_9

    :cond_a
    move-object/from16 v11, p11

    :goto_9
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    goto :goto_a

    :cond_b
    move-object/from16 v2, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    const/16 v0, 0x7d0

    move/from16 p14, v0

    :goto_b
    move-object p2, p1

    move-object/from16 p3, v1

    move-object/from16 p13, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p9, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object p1, p0

    goto :goto_c

    :cond_c
    move/from16 p14, p13

    goto :goto_b

    .line 21
    :goto_c
    invoke-direct/range {p1 .. p14}, Lcom/whoop/bot/models/conversation/FormQuestionModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.bot.models.conversation.AnswerDisplayStyle"

    invoke-static {}, Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;->values()[Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/FormAnswerOptionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/FormQuestionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/whoop/bot/models/conversation/FormQuestionModel;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget v4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    goto :goto_3

    :cond_4
    move/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-boolean v5, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    goto :goto_4

    :cond_5
    move/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    move/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move/from16 p7, v4

    move/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/bot/models/conversation/FormQuestionModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/FormQuestionModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :goto_2
    iget-object v4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v4}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    iget-object v4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    if-eqz v4, :cond_7

    :goto_3
    aget-object v4, v0, v2

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/j;

    iget-object v5, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    invoke-interface {p1, p2, v2, v4, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    iget v4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    if-eq v4, v1, :cond_9

    :goto_4
    iget v4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    invoke-interface {p1, p2, v2, v4}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_9
    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_5

    :cond_a
    iget-boolean v4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    if-eq v4, v1, :cond_b

    :goto_5
    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    invoke-interface {p1, p2, v2, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :goto_6
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v2, :cond_f

    :goto_7
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    :goto_8
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :goto_9
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_13
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    :goto_a
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_15
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :goto_b
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_17
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_18

    goto :goto_c

    :cond_18
    iget v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    const/16 v2, 0x7d0

    if-eq v1, v2, :cond_19

    :goto_c
    iget p0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_19
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/bot/models/conversation/FormQuestionModel;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;",
            "IZ",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lcom/whoop/bot/models/conversation/FormQuestionModel;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prompt"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answers"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userVisibleProgressIndicator"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userVisibleSubmitButtonText"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userVisibleCompletedButtonText"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholder"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/FormQuestionModel;

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v9, p8

    move/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/bot/models/conversation/FormQuestionModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;IZLjava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    iget v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    iget-boolean v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    iget p1, p1, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    if-eq v1, p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAnswerDisplayStyle()Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    return-object v0
.end method

.method public final getAnswers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxSelections()I
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    return v0
.end method

.method public final getOnAnswer()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getPlaceholder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrompt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserInputTextMaxLength()I
    .locals 1

    iget v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    return v0
.end method

.method public final getUserVisibleCompletedButtonText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserVisibleProgressIndicator()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserVisibleSubmitButtonText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

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

    iget v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v1, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->prompt:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->type:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answerDisplayStyle:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    iget v5, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->maxSelections:I

    iget-boolean v6, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired:Z

    iget-object v7, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->answers:Ljava/util/List;

    iget-object v8, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->onAnswer:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v9, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleProgressIndicator:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleSubmitButtonText:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userVisibleCompletedButtonText:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->placeholder:Ljava/lang/String;

    iget v13, v0, Lcom/whoop/bot/models/conversation/FormQuestionModel;->userInputTextMaxLength:I

    const-string v14, ", prompt="

    const-string v15, ", type="

    const-string v0, "FormQuestionModel(id="

    invoke-static {v0, v1, v14, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", answerDisplayStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxSelections="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isRequired="

    const-string v2, ", answers="

    invoke-static {v5, v1, v2, v0, v6}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onAnswer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userVisibleProgressIndicator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", userVisibleSubmitButtonText="

    const-string v2, ", userVisibleCompletedButtonText="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", placeholder="

    const-string v2, ", userInputTextMaxLength="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v13, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
