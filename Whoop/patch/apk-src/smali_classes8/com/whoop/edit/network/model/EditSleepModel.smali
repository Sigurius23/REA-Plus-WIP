.class public final Lcom/whoop/edit/network/model/EditSleepModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/edit/network/model/EditSleepModel$$serializer;,
        Lcom/whoop/edit/network/model/EditSleepModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000223B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJH\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010\'\u001a\u00020\u00072\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010,\u001a\u0004\u0008-\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010.\u001a\u0004\u00080\u0010\u001f\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/edit/network/model/EditSleepModel;",
        "",
        "",
        "startTime",
        "endTime",
        "",
        "garmentId",
        "",
        "resolveOverlaps",
        "gdcFlow",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$add_activity_release",
        "(Lcom/whoop/edit/network/model/EditSleepModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/lang/Integer;",
        "component4",
        "()Ljava/lang/Boolean;",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/edit/network/model/EditSleepModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getStartTime",
        "getEndTime",
        "Ljava/lang/Integer;",
        "getGarmentId",
        "Ljava/lang/Boolean;",
        "getResolveOverlaps",
        "getGdcFlow",
        "Companion",
        "$serializer",
        "a",
        "add-activity_release"
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

.field public static final Companion:Lcom/whoop/edit/network/model/EditSleepModel$a;


# instance fields
.field private final endTime:Ljava/lang/String;

.field private final garmentId:Ljava/lang/Integer;

.field private final gdcFlow:Ljava/lang/Boolean;

.field private final resolveOverlaps:Ljava/lang/Boolean;

.field private final startTime:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/edit/network/model/EditSleepModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/edit/network/model/EditSleepModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/edit/network/model/EditSleepModel;->Companion:Lcom/whoop/edit/network/model/EditSleepModel$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/edit/network/model/EditSleepModel$$serializer;->INSTANCE:Lcom/whoop/edit/network/model/EditSleepModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/edit/network/model/EditSleepModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    iput-object p6, p0, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "startTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    .line 7
    iput-object p5, p0, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/edit/network/model/EditSleepModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/edit/network/model/EditSleepModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/edit/network/model/EditSleepModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/edit/network/model/EditSleepModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$add_activity_release(Lcom/whoop/edit/network/model/EditSleepModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object p0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/edit/network/model/EditSleepModel;
    .locals 7

    const-string v0, "startTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/edit/network/model/EditSleepModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/edit/network/model/EditSleepModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/edit/network/model/EditSleepModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/edit/network/model/EditSleepModel;

    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEndTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getGarmentId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getGdcFlow()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getResolveOverlaps()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStartTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

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

    iget-object v2, p0, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/edit/network/model/EditSleepModel;->startTime:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/edit/network/model/EditSleepModel;->endTime:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/edit/network/model/EditSleepModel;->garmentId:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/edit/network/model/EditSleepModel;->resolveOverlaps:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/whoop/edit/network/model/EditSleepModel;->gdcFlow:Ljava/lang/Boolean;

    const-string v5, ", endTime="

    const-string v6, ", garmentId="

    const-string v7, "EditSleepModel(startTime="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", resolveOverlaps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gdcFlow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
