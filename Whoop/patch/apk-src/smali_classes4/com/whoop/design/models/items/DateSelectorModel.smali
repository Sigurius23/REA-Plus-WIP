.class public final Lcom/whoop/design/models/items/DateSelectorModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/DateSelectorModel$$serializer;,
        Lcom/whoop/design/models/items/DateSelectorModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 >2\u00020\u0001:\u0002?>BS\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBa\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%Jb\u0010&\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00100\u0012\u0004\u00082\u00103\u001a\u0004\u00081\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u00100\u0012\u0004\u00085\u00103\u001a\u0004\u00084\u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00100\u0012\u0004\u00087\u00103\u001a\u0004\u00086\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00108\u001a\u0004\u00089\u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00108\u001a\u0004\u0008:\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u0008;\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010<\u001a\u0004\u0008=\u0010%\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "nextDateTime",
        "prevDateTime",
        "currentDateRange",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "previousInteraction",
        "nextInteraction",
        "labelInteraction",
        "Lcom/whoop/design/models/items/DateStripModel;",
        "dateStrip",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/DateSelectorModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/items/DateStripModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;)Lcom/whoop/design/models/items/DateSelectorModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNextDateTime",
        "getNextDateTime$annotations",
        "()V",
        "getPrevDateTime",
        "getPrevDateTime$annotations",
        "getCurrentDateRange",
        "getCurrentDateRange$annotations",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getPreviousInteraction",
        "getNextInteraction",
        "getLabelInteraction",
        "Lcom/whoop/design/models/items/DateStripModel;",
        "getDateStrip",
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

.field public static final Companion:Lcom/whoop/design/models/items/DateSelectorModel$Companion;


# instance fields
.field private final currentDateRange:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "current_date_range_display"
    .end annotation
.end field

.field private final dateStrip:Lcom/whoop/design/models/items/DateStripModel;

.field private final labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final nextDateTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "next_date_time"
    .end annotation
.end field

.field private final nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final prevDateTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "previous_date_time"
    .end annotation
.end field

.field private final previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/DateSelectorModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/DateSelectorModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/DateSelectorModel;->Companion:Lcom/whoop/design/models/items/DateSelectorModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/DateSelectorModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_1
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_2
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    return-void

    :cond_4
    iput-object p8, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;)V
    .locals 1

    const-string v0, "currentDateRange"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_2

    move-object p6, v0

    :cond_2
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_3

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-object p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/design/models/items/DateSelectorModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/DateSelectorModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;)Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCurrentDateRange$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "current_date_range_display"
    .end annotation

    return-void
.end method

.method public static synthetic getNextDateTime$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "next_date_time"
    .end annotation

    return-void
.end method

.method public static synthetic getPrevDateTime$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "previous_date_time"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/DateSelectorModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/items/DateStripModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateStripModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component6()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/DateStripModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;)Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 9

    const-string v0, "currentDateRange"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/DateSelectorModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/DateSelectorModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/DateStripModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCurrentDateRange()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateStrip()Lcom/whoop/design/models/items/DateStripModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    return-object v0
.end method

.method public final getLabelInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getNextDateTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getPrevDateTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreviousInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DateStripModel;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextDateTime:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/DateSelectorModel;->prevDateTime:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/DateSelectorModel;->currentDateRange:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/DateSelectorModel;->previousInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v4, p0, Lcom/whoop/design/models/items/DateSelectorModel;->nextInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v5, p0, Lcom/whoop/design/models/items/DateSelectorModel;->labelInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v6, p0, Lcom/whoop/design/models/items/DateSelectorModel;->dateStrip:Lcom/whoop/design/models/items/DateStripModel;

    const-string v7, ", prevDateTime="

    const-string v8, ", currentDateRange="

    const-string v9, "DateSelectorModel(nextDateTime="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", previousInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", labelInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dateStrip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
