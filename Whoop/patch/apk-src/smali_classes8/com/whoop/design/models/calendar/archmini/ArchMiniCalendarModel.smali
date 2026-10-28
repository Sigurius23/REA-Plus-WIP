.class public final Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;,
        Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 F2\u00020\u0001:\u0002GFBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bg\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010\'Jh\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010\'J\u0010\u00102\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010)J\u001a\u00105\u001a\u00020\u000c2\u0008\u00104\u001a\u0004\u0018\u000103H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010;\u001a\u0004\u0008<\u0010%R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010=\u001a\u0004\u0008>\u0010\'R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010?\u001a\u0004\u0008@\u0010)R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008B\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008D\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010=\u001a\u0004\u0008E\u0010\'\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "request",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "cachePolicy",
        "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;",
        "content",
        "",
        "selectedDate",
        "",
        "futureMonthsShown",
        "",
        "showsDefaultDateSelector",
        "",
        "pageHeightRatio",
        "heightConfiguration",
        "<init>",
        "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/navigation/models/ApiRequest;",
        "component2",
        "()Lcom/whoop/navigation/CachePolicyModel;",
        "component3",
        "()Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "()I",
        "component6",
        "()Z",
        "component7",
        "()Ljava/lang/Float;",
        "component8",
        "copy",
        "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;)Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "getRequest",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "getCachePolicy",
        "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;",
        "getContent",
        "Ljava/lang/String;",
        "getSelectedDate",
        "I",
        "getFutureMonthsShown",
        "Z",
        "getShowsDefaultDateSelector",
        "Ljava/lang/Float;",
        "getPageHeightRatio",
        "getHeightConfiguration",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$Companion;


# instance fields
.field private final cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

.field private final content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

.field private final futureMonthsShown:I

.field private final heightConfiguration:Ljava/lang/String;

.field private final pageHeightRatio:Ljava/lang/Float;

.field private final request:Lcom/whoop/navigation/models/ApiRequest;

.field private final selectedDate:Ljava/lang/String;

.field private final showsDefaultDateSelector:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->Companion:Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xcf

    const/16 v0, 0xcf

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    iput-object p3, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    iput-object p4, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    iput-object p5, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput p2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    goto :goto_0

    :cond_1
    iput p6, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    :goto_0
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    goto :goto_1

    :cond_2
    iput-boolean p7, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    :goto_1
    iput-object p8, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    iput-object p9, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    .line 7
    iput p5, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    .line 8
    iput-boolean p6, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    and-int/lit8 p5, p9, 0x20

    if-eqz p5, :cond_1

    const/4 p5, 0x1

    move v6, p5

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    goto :goto_1

    :cond_1
    move v6, p6

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {v0 .. v8}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-boolean p6, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->copy(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;)Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/navigation/models/ApiRequest$$serializer;->INSTANCE:Lcom/whoop/navigation/models/ApiRequest$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/CachePolicyModel$$serializer;->INSTANCE:Lcom/whoop/navigation/CachePolicyModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    if-eqz v1, :cond_1

    :goto_0
    iget v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    if-eq v1, v2, :cond_3

    :goto_1
    iget-boolean v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    sget-object v0, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/navigation/models/ApiRequest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    return-object v0
.end method

.method public final component2()Lcom/whoop/navigation/CachePolicyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    return v0
.end method

.method public final component7()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;)Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;
    .locals 10

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    iget v3, p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCachePolicy()Lcom/whoop/navigation/CachePolicyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    return-object v0
.end method

.method public final getContent()Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    return-object v0
.end method

.method public final getFutureMonthsShown()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    return v0
.end method

.method public final getHeightConfiguration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    return-object v0
.end method

.method public final getPageHeightRatio()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    return-object v0
.end method

.method public final getRequest()Lcom/whoop/navigation/models/ApiRequest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    return-object v0
.end method

.method public final getSelectedDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowsDefaultDateSelector()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    invoke-virtual {v0}, Lcom/whoop/navigation/models/ApiRequest;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/navigation/CachePolicyModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    iget-object v2, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->content:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->selectedDate:Ljava/lang/String;

    iget v4, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->futureMonthsShown:I

    iget-boolean v5, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->showsDefaultDateSelector:Z

    iget-object v6, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->pageHeightRatio:Ljava/lang/Float;

    iget-object v7, p0, Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;->heightConfiguration:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "ArchMiniCalendarModel(request="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cachePolicy="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedDate="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", futureMonthsShown="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showsDefaultDateSelector="

    const-string v1, ", pageHeightRatio="

    invoke-static {v4, v0, v1, v8, v5}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", heightConfiguration="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
