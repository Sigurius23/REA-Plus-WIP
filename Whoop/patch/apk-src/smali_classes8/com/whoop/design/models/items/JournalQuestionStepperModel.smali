.class public final Lcom/whoop/design/models/items/JournalQuestionStepperModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/JournalQuestionStepperModel$$serializer;,
        Lcom/whoop/design/models/items/JournalQuestionStepperModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9BQ\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB[\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JZ\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001cJ\u0010\u0010(\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00082\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00084\u0010 R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00085\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00086\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00088\u0010$\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/design/models/items/JournalQuestionStepperModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "label",
        "units",
        "",
        "minimumInclusive",
        "maximumInclusive",
        "interval",
        "initial",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/JournalQuestionStepperModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()D",
        "component5",
        "component6",
        "component7",
        "()Ljava/lang/Double;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;)Lcom/whoop/design/models/items/JournalQuestionStepperModel;",
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
        "getLabel",
        "getUnits",
        "D",
        "getMinimumInclusive",
        "getMaximumInclusive",
        "getInterval",
        "Ljava/lang/Double;",
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

.field public static final Companion:Lcom/whoop/design/models/items/JournalQuestionStepperModel$Companion;


# instance fields
.field private final id:Ljava/lang/String;

.field private final initial:Ljava/lang/Double;

.field private final interval:D

.field private final label:Ljava/lang/String;

.field private final maximumInclusive:D

.field private final minimumInclusive:D

.field private final units:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/JournalQuestionStepperModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/JournalQuestionStepperModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->Companion:Lcom/whoop/design/models/items/JournalQuestionStepperModel$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/whoop/design/models/items/JournalQuestionStepperModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    const-string v0, ""

    if-nez p12, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    const-wide/16 v0, 0x0

    if-nez p2, :cond_3

    iput-wide v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    goto :goto_3

    :cond_3
    iput-wide p5, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-wide v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    goto :goto_4

    :cond_4
    iput-wide p7, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    const-wide/high16 p4, 0x3ff0000000000000L    # 1.0

    iput-wide p4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    goto :goto_5

    :cond_5
    iput-wide p9, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    return-void

    :cond_6
    iput-object p11, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    .line 7
    iput-wide p4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    .line 8
    iput-wide p6, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    .line 9
    iput-wide p8, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    .line 10
    iput-object p10, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p12, p11, 0x1

    .line 11
    const-string v0, ""

    if-eqz p12, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    const/4 v0, 0x0

    if-eqz p12, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    const-wide/16 v1, 0x0

    if-eqz p12, :cond_3

    move-wide p4, v1

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move-wide p6, v1

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    const-wide/high16 p8, 0x3ff0000000000000L    # 1.0

    :cond_5
    and-int/lit8 p11, p11, 0x40

    if-eqz p11, :cond_6

    move-object p11, v0

    :goto_0
    move-wide p9, p8

    move-wide p7, p6

    move-wide p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p11, p10

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/design/models/items/JournalQuestionStepperModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/JournalQuestionStepperModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;ILjava/lang/Object;)Lcom/whoop/design/models/items/JournalQuestionStepperModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-wide p4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-wide p6, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-wide p8, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    :cond_5
    and-int/lit8 p11, p11, 0x40

    if-eqz p11, :cond_6

    iget-object p10, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    :cond_6
    move-object p12, p10

    move-wide p10, p8

    move-wide p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;)Lcom/whoop/design/models/items/JournalQuestionStepperModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/JournalQuestionStepperModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-wide v4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    :goto_3
    iget-wide v4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    invoke-interface {p1, p2, v0, v4, v5}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-wide v4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_9

    :goto_4
    iget-wide v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-wide v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_b

    :goto_5
    iget-wide v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    return-wide v0
.end method

.method public final component7()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;)Lcom/whoop/design/models/items/JournalQuestionStepperModel;
    .locals 12

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/design/models/items/JournalQuestionStepperModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLjava/lang/Double;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    iget-object p1, p1, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitial()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    return-object v0
.end method

.method public final getInterval()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    return-wide v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaximumInclusive()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    return-wide v0
.end method

.method public final getMinimumInclusive()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    return-wide v0
.end method

.method public final getUnits()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

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

    iget-wide v4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->units:Ljava/lang/String;

    iget-wide v3, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->minimumInclusive:D

    iget-wide v5, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->maximumInclusive:D

    iget-wide v7, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->interval:D

    iget-object v9, p0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->initial:Ljava/lang/Double;

    const-string v10, ", label="

    const-string v11, ", units="

    const-string v12, "JournalQuestionStepperModel(id="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", minimumInclusive="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", maximumInclusive="

    const-string v2, ", interval="

    invoke-static {v0, v1, v5, v6, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", initial="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
