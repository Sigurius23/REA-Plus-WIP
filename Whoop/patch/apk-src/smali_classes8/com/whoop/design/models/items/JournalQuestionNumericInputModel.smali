.class public final Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/JournalQuestionNumericInputModel$$serializer;,
        Lcom/whoop/design/models/items/JournalQuestionNumericInputModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298BU\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rB_\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J^\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001cJ\u0010\u0010(\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010#J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u00081\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00084\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00102\u001a\u0004\u00087\u0010 \u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "label",
        "units",
        "",
        "minimumInclusive",
        "maximumInclusive",
        "",
        "decimalPlaces",
        "initial",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/lang/Double;",
        "component5",
        "component6",
        "()I",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;)Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getLabel",
        "getUnits",
        "Ljava/lang/Double;",
        "getMinimumInclusive",
        "getMaximumInclusive",
        "I",
        "getDecimalPlaces",
        "getInitial",
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

.field public static final Companion:Lcom/whoop/design/models/items/JournalQuestionNumericInputModel$Companion;


# instance fields
.field private final decimalPlaces:I

.field private final id:Ljava/lang/String;

.field private final initial:Ljava/lang/Double;

.field private final label:Ljava/lang/String;

.field private final maximumInclusive:Ljava/lang/Double;

.field private final minimumInclusive:Ljava/lang/Double;

.field private final units:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->Companion:Lcom/whoop/design/models/items/JournalQuestionNumericInputModel$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const-string v0, ""

    if-nez p9, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    const/4 p2, 0x0

    iput p2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    goto :goto_5

    :cond_5
    iput p7, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    .line 8
    iput-object p5, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    .line 9
    iput p6, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    .line 10
    iput-object p7, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    .line 11
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    const/4 p6, 0x0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move-object p8, v0

    :goto_0
    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p8, p7

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;ILjava/lang/Object;)Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    :cond_6
    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;)Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    if-eqz v1, :cond_b

    :goto_5
    iget v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    return v0
.end method

.method public final component7()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;)Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Double;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    iget v3, p1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    iget-object p1, p1, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getDecimalPlaces()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitial()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaximumInclusive()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    return-object v0
.end method

.method public final getMinimumInclusive()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    return-object v0
.end method

.method public final getUnits()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->units:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->minimumInclusive:Ljava/lang/Double;

    iget-object v4, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->maximumInclusive:Ljava/lang/Double;

    iget v5, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->decimalPlaces:I

    iget-object v6, p0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->initial:Ljava/lang/Double;

    const-string v7, ", label="

    const-string v8, ", units="

    const-string v9, "JournalQuestionNumericInputModel(id="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", minimumInclusive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maximumInclusive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", decimalPlaces="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", initial="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
