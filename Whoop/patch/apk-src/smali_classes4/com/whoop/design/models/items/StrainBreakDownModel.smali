.class public final Lcom/whoop/design/models/items/StrainBreakDownModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;,
        Lcom/whoop/design/models/items/StrainBreakDownModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBK\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJB\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u00081\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u00082\u0010\u001a\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/design/models/items/StrainBreakDownModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "cardioPercentDisplay",
        "cardioTitleDisplay",
        "",
        "cardioTotalPercent",
        "mskPercentDisplay",
        "mskTitleDisplay",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/StrainBreakDownModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "()D",
        "component4",
        "component5",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/models/items/StrainBreakDownModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getCardioPercentDisplay",
        "getCardioTitleDisplay",
        "D",
        "getCardioTotalPercent",
        "getMskPercentDisplay",
        "getMskTitleDisplay",
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

.field public static final Companion:Lcom/whoop/design/models/items/StrainBreakDownModel$Companion;


# instance fields
.field private final cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

.field private final cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

.field private final cardioTotalPercent:D

.field private final mskPercentDisplay:Lcom/whoop/design/util/TextResource;

.field private final mskTitleDisplay:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/StrainBreakDownModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/StrainBreakDownModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/StrainBreakDownModel;->Companion:Lcom/whoop/design/models/items/StrainBreakDownModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/design/models/items/StrainBreakDownModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/design/models/items/StrainBreakDownModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    iput-wide p4, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    iput-object p6, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "cardioPercentDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardioTitleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mskPercentDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mskTitleDisplay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-wide p3, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    .line 6
    iput-object p5, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p6, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/StrainBreakDownModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lcom/whoop/design/models/items/StrainBreakDownModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-wide p3, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p5, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    :cond_4
    move-object p7, p5

    move-object p8, p6

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/design/models/items/StrainBreakDownModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/models/items/StrainBreakDownModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/StrainBreakDownModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object v1, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object p0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    return-wide v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/models/items/StrainBreakDownModel;
    .locals 8

    const-string v0, "cardioPercentDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardioTitleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mskPercentDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mskTitleDisplay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/StrainBreakDownModel;

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/design/models/items/StrainBreakDownModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/StrainBreakDownModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/StrainBreakDownModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCardioPercentDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getCardioTitleDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getCardioTotalPercent()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    return-wide v0
.end method

.method public final getMskPercentDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getMskTitleDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioPercentDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-wide v2, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->cardioTotalPercent:D

    iget-object v4, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskPercentDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/design/models/items/StrainBreakDownModel;->mskTitleDisplay:Lcom/whoop/design/util/TextResource;

    const-string v6, ", cardioTitleDisplay="

    const-string v7, ", cardioTotalPercent="

    const-string v8, "StrainBreakDownModel(cardioPercentDisplay="

    invoke-static {v8, v0, v6, v1, v7}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mskPercentDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mskTitleDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
