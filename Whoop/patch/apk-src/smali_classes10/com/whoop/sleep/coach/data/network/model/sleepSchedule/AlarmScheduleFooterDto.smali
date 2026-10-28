.class public final Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$$serializer;,
        Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nBG\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJB\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010&\u001a\u00020\u00052\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010(\u001a\u0004\u0008*\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010+\u001a\u0004\u0008,\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u0008-\u0010\u001dR\u001a\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010+\u001a\u0004\u0008.\u0010\u001d\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;",
        "",
        "",
        "descriptionTextDisplay",
        "calloutTextHeaderDisplay",
        "",
        "scheduleComplete",
        "shouldShowCalloutText",
        "shouldShowDescriptionText",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZZZ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sleep_coach_release",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getDescriptionTextDisplay",
        "getCalloutTextHeaderDisplay",
        "Z",
        "getScheduleComplete",
        "getShouldShowCalloutText",
        "getShouldShowDescriptionText",
        "Companion",
        "$serializer",
        "sleep-coach_release"
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

.field public static final Companion:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$Companion;


# instance fields
.field private final calloutTextHeaderDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "callout_text_header_display"
    .end annotation
.end field

.field private final descriptionTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description_text_display"
    .end annotation
.end field

.field private final scheduleComplete:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_complete"
    .end annotation
.end field

.field private final shouldShowCalloutText:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "should_show_callout_text"
    .end annotation
.end field

.field private final shouldShowDescriptionText:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "should_show_description_text"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->Companion:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$$serializer;->INSTANCE:Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$$serializer;

    invoke-virtual {p7}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    iput-boolean p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    iput-boolean p6, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 1

    const-string v0, "descriptionTextDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calloutTextHeaderDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    .line 7
    iput-boolean p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Ljava/lang/String;Ljava/lang/String;ZZZILjava/lang/Object;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->copy(Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sleep_coach_release(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x3

    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x4

    iget-boolean p0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;
    .locals 7

    const-string v0, "descriptionTextDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "calloutTextHeaderDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    iget-boolean v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    iget-boolean v3, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    iget-boolean p1, p1, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCalloutTextHeaderDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptionTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getScheduleComplete()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    return v0
.end method

.method public final getShouldShowCalloutText()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    return v0
.end method

.method public final getShouldShowDescriptionText()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->descriptionTextDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->calloutTextHeaderDisplay:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->scheduleComplete:Z

    iget-boolean v3, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowCalloutText:Z

    iget-boolean v4, p0, Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;->shouldShowDescriptionText:Z

    const-string v5, ", calloutTextHeaderDisplay="

    const-string v6, ", scheduleComplete="

    const-string v7, "AlarmScheduleFooterDto(descriptionTextDisplay="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldShowCalloutText="

    const-string v5, ", shouldShowDescriptionText="

    invoke-static {v0, v2, v1, v3, v5}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
