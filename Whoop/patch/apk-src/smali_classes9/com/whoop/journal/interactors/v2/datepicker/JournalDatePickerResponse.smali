.class public final Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$$serializer;,
        Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289B9\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JL\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00084\u0010!R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010$\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;",
        "",
        "Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;",
        "todayCta",
        "",
        "todayDate",
        "Lgz0/m0;",
        "leftCalendarDisplayIcon",
        "rightCalendarDisplayIcon",
        "",
        "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;",
        "items",
        "<init>",
        "(Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$journal_release",
        "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lgz0/m0;",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;",
        "getTodayCta",
        "Ljava/lang/String;",
        "getTodayDate",
        "Lgz0/m0;",
        "getLeftCalendarDisplayIcon",
        "getRightCalendarDisplayIcon",
        "Ljava/util/List;",
        "getItems",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$a;


# instance fields
.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final leftCalendarDisplayIcon:Lgz0/m0;

.field private final rightCalendarDisplayIcon:Lgz0/m0;

.field private final todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

.field private final todayDate:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->Companion:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwr1/f;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lwr1/f;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Lwr1/f;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Lwr1/f;-><init>(I)V

    invoke-static {v0, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v6, 0x5

    new-array v6, v6, [Ll83/h;

    aput-object v1, v6, v3

    aput-object v1, v6, v5

    aput-object v2, v6, v7

    const/4 v1, 0x3

    aput-object v4, v6, v1

    const/4 v1, 0x4

    aput-object v0, v6, v1

    sput-object v6, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$$serializer;->INSTANCE:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    iput-object p3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    iput-object p5, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    iput-object p6, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Lgz0/m0;",
            "Ljava/util/List<",
            "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "todayDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftCalendarDisplayIcon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    .line 4
    iput-object p2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    .line 6
    iput-object p4, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    .line 7
    iput-object p5, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$$serializer;->INSTANCE:Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->copy(Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$journal_release(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/journal/interactors/v2/datepicker/TodayCta$$serializer;->INSTANCE:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta$$serializer;

    iget-object v2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    return-object v0
.end method

.method public final component4()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;)Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Lgz0/m0;",
            "Ljava/util/List<",
            "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;",
            ">;)",
            "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;"
        }
    .end annotation

    const-string v0, "todayDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftCalendarDisplayIcon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;-><init>(Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;

    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    iget-object v3, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getLeftCalendarDisplayIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    return-object v0
.end method

.method public final getRightCalendarDisplayIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    return-object v0
.end method

.method public final getTodayCta()Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    return-object v0
.end method

.method public final getTodayDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    invoke-static {v3, v0, v2}, Lhc3/i;->b(Lgz0/m0;II)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayCta:Lcom/whoop/journal/interactors/v2/datepicker/TodayCta;

    iget-object v1, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->todayDate:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->leftCalendarDisplayIcon:Lgz0/m0;

    iget-object v3, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->rightCalendarDisplayIcon:Lgz0/m0;

    iget-object v4, p0, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerResponse;->items:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "JournalDatePickerResponse(todayCta="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", todayDate="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", leftCalendarDisplayIcon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rightCalendarDisplayIcon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
