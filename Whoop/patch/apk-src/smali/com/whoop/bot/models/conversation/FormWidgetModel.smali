.class public final Lcom/whoop/bot/models/conversation/FormWidgetModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/FormWidgetModel$$serializer;,
        Lcom/whoop/bot/models/conversation/FormWidgetModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0081\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@Bc\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bq\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001fJl\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00087\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00104\u001a\u0004\u00088\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008:\u0010$R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008>\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00104\u001a\u0004\u0008?\u0010\u001f\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/FormWidgetModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "userFormId",
        "authoritativeFormId",
        "key",
        "status",
        "",
        "version",
        "",
        "Lcom/whoop/bot/models/conversation/FormQuestionModel;",
        "questions",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "onComplete",
        "completedAnswerDisplay",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/FormWidgetModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Integer;",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/FormWidgetModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getUserFormId",
        "getAuthoritativeFormId",
        "getKey",
        "getStatus",
        "Ljava/lang/Integer;",
        "getVersion",
        "Ljava/util/List;",
        "getQuestions",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getOnComplete",
        "getCompletedAnswerDisplay",
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/FormWidgetModel$Companion;


# instance fields
.field private final authoritativeFormId:Ljava/lang/String;

.field private final completedAnswerDisplay:Ljava/lang/String;

.field private final key:Ljava/lang/String;

.field private final onComplete:Lcom/whoop/whoopaction/domain/models/Action;

.field private final questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormQuestionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final status:Ljava/lang/String;

.field private final userFormId:Ljava/lang/String;

.field private final version:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/bot/models/conversation/FormWidgetModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/FormWidgetModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->Companion:Lcom/whoop/bot/models/conversation/FormWidgetModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ljl0/a;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Ljl0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Ljl0/a;

    invoke-direct {v5, v0}, Ljl0/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const/4 v5, 0x1

    aput-object v1, v0, v5

    const/4 v5, 0x2

    aput-object v1, v0, v5

    const/4 v5, 0x3

    aput-object v1, v0, v5

    const/4 v5, 0x4

    aput-object v1, v0, v5

    const/4 v5, 0x5

    aput-object v3, v0, v5

    const/4 v3, 0x6

    aput-object v2, v0, v3

    aput-object v1, v0, v4

    sput-object v0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/bot/models/conversation/FormWidgetModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    const-string v0, ""

    if-nez p10, :cond_0

    iput-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    .line 3
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormQuestionModel;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "userFormId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authoritativeFormId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "questions"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    .line 11
    iput-object p6, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    .line 12
    iput-object p7, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    .line 13
    iput-object p8, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    .line 14
    const-string v0, ""

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    const/4 v0, 0x0

    if-eqz p10, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    .line 15
    sget-object p6, Lm83/y;->w:Lm83/y;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p9, p8

    goto :goto_0

    .line 16
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/whoop/bot/models/conversation/FormWidgetModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/bot/models/conversation/FormQuestionModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/FormQuestionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/FormWidgetModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/FormWidgetModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/FormWidgetModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/FormWidgetModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormQuestionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/FormWidgetModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormQuestionModel;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/bot/models/conversation/FormWidgetModel;"
        }
    .end annotation

    const-string v0, "userFormId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authoritativeFormId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "questions"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/FormWidgetModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/bot/models/conversation/FormWidgetModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAuthoritativeFormId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCompletedAnswerDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnComplete()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getQuestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/FormQuestionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserFormId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

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

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->userFormId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->authoritativeFormId:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->key:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->status:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->version:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->questions:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->onComplete:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v7, p0, Lcom/whoop/bot/models/conversation/FormWidgetModel;->completedAnswerDisplay:Ljava/lang/String;

    const-string v8, ", authoritativeFormId="

    const-string v9, ", key="

    const-string v10, "FormWidgetModel(userFormId="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    const-string v8, ", version="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", questions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onComplete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", completedAnswerDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
