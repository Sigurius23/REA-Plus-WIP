.class public final Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBU\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,JR\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010$J\u0010\u00100\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00103\u001a\u00020\u00022\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u00088\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008<\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010=\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008>\u0010*R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010A\u0012\u0004\u0008C\u0010@\u001a\u0004\u0008B\u0010,\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;",
        "",
        "",
        "showGradient",
        "",
        "headerText",
        "Lcom/whoop/data/remote/domain/dto/JournalBounds;",
        "journalBounds",
        "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;",
        "subtitleCallout",
        "Lcom/whoop/data/remote/domain/dto/DatePickerInfo;",
        "datePickerInfo",
        "Lcom/whoop/data/remote/domain/dto/NavigationButton;",
        "navigationButton",
        "<init>",
        "(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;",
        "toJournalEntryMetadata",
        "()Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;",
        "component1",
        "()Z",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lcom/whoop/data/remote/domain/dto/JournalBounds;",
        "component4",
        "()Lcom/whoop/data/remote/domain/dto/SubtitleCallout;",
        "component5",
        "()Lcom/whoop/data/remote/domain/dto/DatePickerInfo;",
        "component6",
        "()Lcom/whoop/data/remote/domain/dto/NavigationButton;",
        "copy",
        "(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;)Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getShowGradient",
        "Ljava/lang/String;",
        "getHeaderText",
        "Lcom/whoop/data/remote/domain/dto/JournalBounds;",
        "getJournalBounds",
        "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;",
        "getSubtitleCallout",
        "Lcom/whoop/data/remote/domain/dto/DatePickerInfo;",
        "getDatePickerInfo",
        "getDatePickerInfo$annotations",
        "()V",
        "Lcom/whoop/data/remote/domain/dto/NavigationButton;",
        "getNavigationButton",
        "getNavigationButton$annotations",
        "Companion",
        "$serializer",
        "core_release"
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$Companion;


# instance fields
.field private final datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "date_picker"
    .end annotation
.end field

.field private final headerText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "header_text"
    .end annotation
.end field

.field private final journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "journal_bounds"
    .end annotation
.end field

.field private final navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "button"
    .end annotation
.end field

.field private final showGradient:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "show_gradient"
    .end annotation
.end field

.field private final subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle_callout"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->Companion:Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$$serializer;

    invoke-virtual {p8}, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;)V
    .locals 1

    const-string v0, "headerText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "journalBounds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->copy(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;)Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDatePickerInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "date_picker"
    .end annotation

    return-void
.end method

.method public static synthetic getNavigationButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "button"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/JournalBounds$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/JournalBounds$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SubtitleCallout$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/SubtitleCallout$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/DatePickerInfo$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/DatePickerInfo$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/NavigationButton$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/NavigationButton$$serializer;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/data/remote/domain/dto/JournalBounds;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    return-object v0
.end method

.method public final component4()Lcom/whoop/data/remote/domain/dto/SubtitleCallout;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    return-object v0
.end method

.method public final component5()Lcom/whoop/data/remote/domain/dto/DatePickerInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    return-object v0
.end method

.method public final component6()Lcom/whoop/data/remote/domain/dto/NavigationButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;)Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;
    .locals 8

    const-string v0, "headerText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "journalBounds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;-><init>(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDatePickerInfo()Lcom/whoop/data/remote/domain/dto/DatePickerInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    return-object v0
.end method

.method public final getHeaderText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    return-object v0
.end method

.method public final getJournalBounds()Lcom/whoop/data/remote/domain/dto/JournalBounds;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    return-object v0
.end method

.method public final getNavigationButton()Lcom/whoop/data/remote/domain/dto/NavigationButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    return-object v0
.end method

.method public final getShowGradient()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    return v0
.end method

.method public final getSubtitleCallout()Lcom/whoop/data/remote/domain/dto/SubtitleCallout;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/JournalBounds;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/SubtitleCallout;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/DatePickerInfo;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/NavigationButton;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    return v2
.end method

.method public final toJournalEntryMetadata()Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;
    .locals 7

    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    invoke-direct/range {v0 .. v6}, Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;-><init>(ZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lcom/whoop/data/remote/domain/dto/DatePickerInfo;Lcom/whoop/data/remote/domain/dto/NavigationButton;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->showGradient:Z

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->headerText:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->journalBounds:Lcom/whoop/data/remote/domain/dto/JournalBounds;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->subtitleCallout:Lcom/whoop/data/remote/domain/dto/SubtitleCallout;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->datePickerInfo:Lcom/whoop/data/remote/domain/dto/DatePickerInfo;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/JournalEntryMetadataDto;->navigationButton:Lcom/whoop/data/remote/domain/dto/NavigationButton;

    const-string v6, ", headerText="

    const-string v7, ", journalBounds="

    const-string v8, "JournalEntryMetadataDto(showGradient="

    invoke-static {v8, v6, v1, v7, v0}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitleCallout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", datePickerInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", navigationButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
