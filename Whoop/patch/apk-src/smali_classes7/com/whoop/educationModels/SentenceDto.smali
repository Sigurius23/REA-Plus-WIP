.class public final Lcom/whoop/educationModels/SentenceDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/educationModels/SentenceDto$$serializer;,
        Lcom/whoop/educationModels/SentenceDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 M2\u00020\u0001:\u0002NMBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bq\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#Jp\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001bJ\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u0017J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001\u00a2\u0006\u0004\u00082\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00105\u0012\u0004\u00087\u00108\u001a\u0004\u00086\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00109\u0012\u0004\u0008;\u00108\u001a\u0004\u0008:\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010<\u0012\u0004\u0008>\u00108\u001a\u0004\u0008=\u0010\u001bR \u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010<\u0012\u0004\u0008@\u00108\u001a\u0004\u0008?\u0010\u001bR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010<\u0012\u0004\u0008B\u00108\u001a\u0004\u0008A\u0010\u001bR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00105\u0012\u0004\u0008D\u00108\u001a\u0004\u0008C\u0010\u0017R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010E\u0012\u0004\u0008G\u00108\u001a\u0004\u0008F\u0010 R\"\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010<\u0012\u0004\u0008I\u00108\u001a\u0004\u0008H\u0010\u001bR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010J\u0012\u0004\u0008L\u00108\u001a\u0004\u0008K\u0010#\u00a8\u0006O"
    }
    d2 = {
        "Lcom/whoop/educationModels/SentenceDto;",
        "",
        "",
        "sentenceId",
        "Lcom/whoop/educationModels/ScreenTextStyleDto;",
        "style",
        "",
        "createdAt",
        "updatedAt",
        "text",
        "paragraphId",
        "Lcom/whoop/educationModels/Divider;",
        "divider",
        "clickableTextUrl",
        "Lcom/whoop/educationModels/InlineIcon;",
        "inlineIcon",
        "<init>",
        "(ILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "()Lcom/whoop/educationModels/ScreenTextStyleDto;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/educationModels/Divider;",
        "component8",
        "component9",
        "()Lcom/whoop/educationModels/InlineIcon;",
        "copy",
        "(ILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;)Lcom/whoop/educationModels/SentenceDto;",
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
        "write$Self$education_models_release",
        "(Lcom/whoop/educationModels/SentenceDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getSentenceId",
        "getSentenceId$annotations",
        "()V",
        "Lcom/whoop/educationModels/ScreenTextStyleDto;",
        "getStyle",
        "getStyle$annotations",
        "Ljava/lang/String;",
        "getCreatedAt",
        "getCreatedAt$annotations",
        "getUpdatedAt",
        "getUpdatedAt$annotations",
        "getText",
        "getText$annotations",
        "getParagraphId",
        "getParagraphId$annotations",
        "Lcom/whoop/educationModels/Divider;",
        "getDivider",
        "getDivider$annotations",
        "getClickableTextUrl",
        "getClickableTextUrl$annotations",
        "Lcom/whoop/educationModels/InlineIcon;",
        "getInlineIcon",
        "getInlineIcon$annotations",
        "Companion",
        "$serializer",
        "education-models_release"
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

.field public static final Companion:Lcom/whoop/educationModels/SentenceDto$Companion;


# instance fields
.field private final clickableTextUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "clickable_text_url"
    .end annotation
.end field

.field private final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final divider:Lcom/whoop/educationModels/Divider;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "divider"
    .end annotation
.end field

.field private final inlineIcon:Lcom/whoop/educationModels/InlineIcon;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "inline_icon"
    .end annotation
.end field

.field private final paragraphId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "paragraph_id"
    .end annotation
.end field

.field private final sentenceId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final style:Lcom/whoop/educationModels/ScreenTextStyleDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "text_style"
    .end annotation
.end field

.field private final text:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "text"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/educationModels/SentenceDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/educationModels/SentenceDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/educationModels/SentenceDto;->Companion:Lcom/whoop/educationModels/SentenceDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/educationModels/SentenceDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/SentenceDto$$serializer;

    invoke-virtual {p11}, Lcom/whoop/educationModels/SentenceDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    iput-object p3, p0, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    iput-object p4, p0, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    iput p7, p0, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    iput-object p8, p0, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    iput-object p9, p0, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    return-void
.end method

.method public constructor <init>(ILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    .line 4
    iput-object p2, p0, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    .line 5
    iput-object p3, p0, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    .line 8
    iput p6, p0, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    .line 9
    iput-object p7, p0, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    .line 10
    iput-object p8, p0, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/educationModels/SentenceDto;ILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;ILjava/lang/Object;)Lcom/whoop/educationModels/SentenceDto;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/educationModels/SentenceDto;->copy(ILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;)Lcom/whoop/educationModels/SentenceDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getClickableTextUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "clickable_text_url"
    .end annotation

    return-void
.end method

.method public static synthetic getCreatedAt$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "created_at"
    .end annotation

    return-void
.end method

.method public static synthetic getDivider$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "divider"
    .end annotation

    return-void
.end method

.method public static synthetic getInlineIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "inline_icon"
    .end annotation

    return-void
.end method

.method public static synthetic getParagraphId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "paragraph_id"
    .end annotation

    return-void
.end method

.method public static synthetic getSentenceId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getStyle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "text_style"
    .end annotation

    return-void
.end method

.method public static synthetic getText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "text"
    .end annotation

    return-void
.end method

.method public static synthetic getUpdatedAt$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "updated_at"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$education_models_release(Lcom/whoop/educationModels/SentenceDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lcom/whoop/educationModels/ScreenTextStyleDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/ScreenTextStyleDto$$serializer;

    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget v1, p0, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lcom/whoop/educationModels/Divider$$serializer;->INSTANCE:Lcom/whoop/educationModels/Divider$$serializer;

    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/educationModels/InlineIcon$$serializer;->INSTANCE:Lcom/whoop/educationModels/InlineIcon$$serializer;

    iget-object p0, p0, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    return v0
.end method

.method public final component2()Lcom/whoop/educationModels/ScreenTextStyleDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    return v0
.end method

.method public final component7()Lcom/whoop/educationModels/Divider;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/educationModels/InlineIcon;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    return-object v0
.end method

.method public final copy(ILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;)Lcom/whoop/educationModels/SentenceDto;
    .locals 11

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/educationModels/SentenceDto;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/educationModels/SentenceDto;-><init>(ILcom/whoop/educationModels/ScreenTextStyleDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/Divider;Ljava/lang/String;Lcom/whoop/educationModels/InlineIcon;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/educationModels/SentenceDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/educationModels/SentenceDto;

    iget v1, p0, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    iget v3, p1, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    iget-object v3, p1, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    iget v3, p1, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    iget-object v3, p1, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    iget-object p1, p1, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getClickableTextUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getDivider()Lcom/whoop/educationModels/Divider;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    return-object v0
.end method

.method public final getInlineIcon()Lcom/whoop/educationModels/InlineIcon;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    return-object v0
.end method

.method public final getParagraphId()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    return v0
.end method

.method public final getSentenceId()I
    .locals 1

    iget v0, p0, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    return v0
.end method

.method public final getStyle()Lcom/whoop/educationModels/ScreenTextStyleDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    invoke-virtual {v2}, Lcom/whoop/educationModels/ScreenTextStyleDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/educationModels/Divider;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/educationModels/InlineIcon;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/whoop/educationModels/SentenceDto;->sentenceId:I

    iget-object v1, p0, Lcom/whoop/educationModels/SentenceDto;->style:Lcom/whoop/educationModels/ScreenTextStyleDto;

    iget-object v2, p0, Lcom/whoop/educationModels/SentenceDto;->createdAt:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/educationModels/SentenceDto;->updatedAt:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/educationModels/SentenceDto;->text:Ljava/lang/String;

    iget v5, p0, Lcom/whoop/educationModels/SentenceDto;->paragraphId:I

    iget-object v6, p0, Lcom/whoop/educationModels/SentenceDto;->divider:Lcom/whoop/educationModels/Divider;

    iget-object v7, p0, Lcom/whoop/educationModels/SentenceDto;->clickableTextUrl:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/educationModels/SentenceDto;->inlineIcon:Lcom/whoop/educationModels/InlineIcon;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "SentenceDto(sentenceId="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updatedAt="

    const-string v1, ", text="

    invoke-static {v9, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", paragraphId="

    const-string v1, ", divider="

    invoke-static {v5, v4, v0, v1, v9}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", clickableTextUrl="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", inlineIcon="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
