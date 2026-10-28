.class public final Lcom/whoop/journal/api/TalkTextWidgetResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/journal/api/TalkTextWidgetResponse$$serializer;,
        Lcom/whoop/journal/api/TalkTextWidgetResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000267BA\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBK\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"JJ\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\"J\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010*\u001a\u00020\u00062\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00081\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00083\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00102\u001a\u0004\u00084\u0010\"\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/journal/api/TalkTextWidgetResponse;",
        "",
        "Lcom/whoop/design/models/items/AiChatTalkTextModel;",
        "widget",
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "",
        "autoSaveEnabled",
        "",
        "bottomButtonText",
        "autoSaveInstructionText",
        "<init>",
        "(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$journal_release",
        "(Lcom/whoop/journal/api/TalkTextWidgetResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/AiChatTalkTextModel;",
        "component2",
        "()Lcom/whoop/navigation/AiAction;",
        "component3",
        "()Z",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "copy",
        "(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/journal/api/TalkTextWidgetResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/AiChatTalkTextModel;",
        "getWidget",
        "Lcom/whoop/navigation/AiAction;",
        "getAiAction",
        "Z",
        "getAutoSaveEnabled",
        "Ljava/lang/String;",
        "getBottomButtonText",
        "getAutoSaveInstructionText",
        "Companion",
        "$serializer",
        "a",
        "journal_release"
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

.field public static final Companion:Lcom/whoop/journal/api/TalkTextWidgetResponse$a;


# instance fields
.field private final aiAction:Lcom/whoop/navigation/AiAction;

.field private final autoSaveEnabled:Z

.field private final autoSaveInstructionText:Ljava/lang/String;

.field private final bottomButtonText:Ljava/lang/String;

.field private final widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/journal/api/TalkTextWidgetResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/journal/api/TalkTextWidgetResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->Companion:Lcom/whoop/journal/api/TalkTextWidgetResponse$a;

    sget v0, Lcom/whoop/navigation/AiAction;->$stable:I

    sget v1, Lcom/whoop/design/models/items/AiChatTalkTextModel;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->$stable:I

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

    invoke-direct/range {v0 .. v7}, Lcom/whoop/journal/api/TalkTextWidgetResponse;-><init>(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x0

    if-nez p7, :cond_0

    iput-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    goto :goto_2

    :cond_2
    iput-boolean p4, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    .line 5
    iput-object p2, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    .line 6
    iput-boolean p3, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    .line 7
    iput-object p4, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/journal/api/TalkTextWidgetResponse;-><init>(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/journal/api/TalkTextWidgetResponse;Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/journal/api/TalkTextWidgetResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/journal/api/TalkTextWidgetResponse;->copy(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/journal/api/TalkTextWidgetResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$journal_release(Lcom/whoop/journal/api/TalkTextWidgetResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/design/models/items/AiChatTalkTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AiChatTalkTextModel$$serializer;

    iget-object v2, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/navigation/AiAction$$serializer;->INSTANCE:Lcom/whoop/navigation/AiAction$$serializer;

    iget-object v2, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    if-eqz v1, :cond_5

    :goto_2
    iget-boolean v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/AiChatTalkTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/journal/api/TalkTextWidgetResponse;
    .locals 6

    new-instance v0, Lcom/whoop/journal/api/TalkTextWidgetResponse;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/journal/api/TalkTextWidgetResponse;-><init>(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/journal/api/TalkTextWidgetResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/journal/api/TalkTextWidgetResponse;

    iget-object v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    iget-object v3, p1, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    iget-object v3, p1, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAiAction()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final getAutoSaveEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    return v0
.end method

.method public final getAutoSaveInstructionText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    return-object v0
.end method

.method public final getBottomButtonText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getWidget()Lcom/whoop/design/models/items/AiChatTalkTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/AiChatTalkTextModel;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/navigation/AiAction;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->widget:Lcom/whoop/design/models/items/AiChatTalkTextModel;

    iget-object v1, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->aiAction:Lcom/whoop/navigation/AiAction;

    iget-boolean v2, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveEnabled:Z

    iget-object v3, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->bottomButtonText:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/journal/api/TalkTextWidgetResponse;->autoSaveInstructionText:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "TalkTextWidgetResponse(widget="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aiAction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", autoSaveEnabled="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bottomButtonText="

    const-string v1, ", autoSaveInstructionText="

    invoke-static {v5, v2, v0, v3, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
