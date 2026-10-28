.class public final Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel$$serializer;,
        Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0081\u0008\u0018\u0000 72\u00020\u0001:\u000287BA\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBM\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JJ\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00082\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010#\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/ai/chat/models/MarkdownTextWidget;",
        "title",
        "summary",
        "Lcom/whoop/design/models/items/FooterModel;",
        "footer",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/ai/chat/models/MarkdownTextWidget;",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/FooterModel;",
        "component5",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/ai/chat/models/MarkdownTextWidget;",
        "getTitle",
        "getSummary",
        "Lcom/whoop/design/models/items/FooterModel;",
        "getFooter",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel$Companion;


# instance fields
.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private final footer:Lcom/whoop/design/models/items/FooterModel;

.field private final id:Ljava/lang/String;

.field private final summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

.field private final title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->Companion:Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    if-nez p7, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p7, 0x0

    if-nez p2, :cond_1

    iput-object p7, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p7, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p7, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p7, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    .line 8
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    .line 9
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    .line 10
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 11
    const-string p1, ""

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p7, v0

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move-object p7, p5

    move-object p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 12
    :goto_0
    invoke-direct/range {p2 .. p7}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->copy(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/ai/chat/models/MarkdownTextWidget$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/MarkdownTextWidget$$serializer;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/ai/chat/models/MarkdownTextWidget$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/MarkdownTextWidget$$serializer;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/items/FooterModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FooterModel$$serializer;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/ai/chat/models/MarkdownTextWidget;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    return-object v0
.end method

.method public final component3()Lcom/whoop/ai/chat/models/MarkdownTextWidget;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/FooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lcom/whoop/design/models/items/FooterModel;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/design/models/items/FooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getSummary()Lcom/whoop/ai/chat/models/MarkdownTextWidget;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/ai/chat/models/MarkdownTextWidget;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/MarkdownTextWidget;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/MarkdownTextWidget;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/FooterModel;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->title:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->summary:Lcom/whoop/ai/chat/models/MarkdownTextWidget;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->footer:Lcom/whoop/design/models/items/FooterModel;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/SummaryConfirmationWidgetModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SummaryConfirmationWidgetModel(id="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", summary="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Ly00/t7;->h(Ljava/lang/StringBuilder;Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
