.class public final Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$$serializer;,
        Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000c\u0010\rBU\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$JP\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010,\u001a\u00020\u00022\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008\u0003\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00081\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u00086\u0010$\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;",
        "",
        "",
        "isSelected",
        "",
        "journalEntryStatus",
        "date",
        "",
        "cycleId",
        "Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;",
        "dateDisplay",
        "multiDayCycleDateDisplay",
        "<init>",
        "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$journal_release",
        "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Ljava/lang/Long;",
        "component5",
        "()Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;",
        "component6",
        "copy",
        "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "Ljava/lang/String;",
        "getJournalEntryStatus",
        "getDate",
        "Ljava/lang/Long;",
        "getCycleId",
        "Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;",
        "getDateDisplay",
        "getMultiDayCycleDateDisplay",
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

.field public static final Companion:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$a;


# instance fields
.field private final cycleId:Ljava/lang/Long;

.field private final date:Ljava/lang/String;

.field private final dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

.field private final isSelected:Z

.field private final journalEntryStatus:Ljava/lang/String;

.field private final multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->Companion:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$a;

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$$serializer;->INSTANCE:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$$serializer;

    invoke-virtual {p8}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    iput-object p3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

    iput-object p6, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    iput-object p7, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;)V
    .locals 1

    const-string v0, "journalEntryStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "date"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

    .line 7
    iput-object p5, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    .line 8
    iput-object p6, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;ILjava/lang/Object;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->copy(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$journal_release(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay$$serializer;->INSTANCE:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay$$serializer;

    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object p0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public final component5()Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    return-object v0
.end method

.method public final component6()Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;
    .locals 8

    const-string v0, "journalEntryStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "date"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;

    iget-boolean v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    iget-boolean v3, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    iget-object v3, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    iget-object p1, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCycleId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

    return-object v0
.end method

.method public final getDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateDisplay()Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    return-object v0
.end method

.method public final getJournalEntryStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getMultiDayCycleDateDisplay()Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

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

    iget-object v2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    invoke-virtual {v2}, Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public final isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-boolean v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected:Z

    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->journalEntryStatus:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->date:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->cycleId:Ljava/lang/Long;

    iget-object v4, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->dateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    iget-object v5, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->multiDayCycleDateDisplay:Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    const-string v6, ", journalEntryStatus="

    const-string v7, ", date="

    const-string v8, "JournalDatePickerEntry(isSelected="

    invoke-static {v8, v6, v1, v7, v0}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cycleId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dateDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", multiDayCycleDateDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
