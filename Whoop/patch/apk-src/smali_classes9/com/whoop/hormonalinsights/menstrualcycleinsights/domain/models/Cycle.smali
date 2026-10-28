.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$$serializer;,
        Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 22\u00020\u0001:\u000232B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBA\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J8\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010(\u001a\u00020\u00062\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u0008/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00100\u001a\u0004\u00081\u0010!\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;",
        "",
        "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "cycle",
        "",
        "icon",
        "",
        "hidden",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;",
        "bottomSheet",
        "<init>",
        "(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Z",
        "component4",
        "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;",
        "copy",
        "(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "getCycle",
        "Ljava/lang/String;",
        "getIcon",
        "Z",
        "getHidden",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;",
        "getBottomSheet",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$Companion;


# instance fields
.field private final bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

.field private final cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

.field private final hidden:Z

.field private final icon:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->Companion:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$$serializer;

    invoke-virtual {p6}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    iput-object p5, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;)V
    .locals 1

    const-string v0, "cycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomSheet"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->copy(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$$serializer;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    return v0
.end method

.method public final component4()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;
    .locals 1

    const-string v0, "cycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomSheet"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;-><init>(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Ljava/lang/String;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    iget-boolean v3, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBottomSheet()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    return-object v0
.end method

.method public final getCycle()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    return-object v0
.end method

.method public final getHidden()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    return v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->cycle:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->icon:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->hidden:Z

    iget-object v3, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/Cycle;->bottomSheet:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Cycle(cycle="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", hidden="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", bottomSheet="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
