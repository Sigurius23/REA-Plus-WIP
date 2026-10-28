.class public final Lcom/whoop/educationModels/InsetDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/educationModels/InsetDto$$serializer;,
        Lcom/whoop/educationModels/InsetDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B;\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0007\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\'\u0012\u0004\u0008)\u0010*\u001a\u0004\u0008(\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\'\u0012\u0004\u0008,\u0010*\u001a\u0004\u0008+\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\'\u0012\u0004\u0008.\u0010*\u001a\u0004\u0008-\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\'\u0012\u0004\u00080\u0010*\u001a\u0004\u0008/\u0010\u0018\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/educationModels/InsetDto;",
        "",
        "",
        "top",
        "leading",
        "bottom",
        "trailing",
        "<init>",
        "(DDDD)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$education_models_release",
        "(Lcom/whoop/educationModels/InsetDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()D",
        "component2",
        "component3",
        "component4",
        "copy",
        "(DDDD)Lcom/whoop/educationModels/InsetDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "D",
        "getTop",
        "getTop$annotations",
        "()V",
        "getLeading",
        "getLeading$annotations",
        "getBottom",
        "getBottom$annotations",
        "getTrailing",
        "getTrailing$annotations",
        "Companion",
        "$serializer",
        "education-models_release"
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

.field public static final Companion:Lcom/whoop/educationModels/InsetDto$Companion;


# instance fields
.field private final bottom:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "bottom"
    .end annotation
.end field

.field private final leading:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "leading"
    .end annotation
.end field

.field private final top:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "top"
    .end annotation
.end field

.field private final trailing:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trailing"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/educationModels/InsetDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/educationModels/InsetDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/educationModels/InsetDto;->Companion:Lcom/whoop/educationModels/InsetDto$Companion;

    return-void
.end method

.method public constructor <init>(DDDD)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/whoop/educationModels/InsetDto;->top:D

    .line 3
    iput-wide p3, p0, Lcom/whoop/educationModels/InsetDto;->leading:D

    .line 4
    iput-wide p5, p0, Lcom/whoop/educationModels/InsetDto;->bottom:D

    .line 5
    iput-wide p7, p0, Lcom/whoop/educationModels/InsetDto;->trailing:D

    return-void
.end method

.method public synthetic constructor <init>(IDDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p10, :cond_0

    .line 6
    sget-object p10, Lcom/whoop/educationModels/InsetDto$$serializer;->INSTANCE:Lcom/whoop/educationModels/InsetDto$$serializer;

    invoke-virtual {p10}, Lcom/whoop/educationModels/InsetDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lcom/whoop/educationModels/InsetDto;->top:D

    iput-wide p4, p0, Lcom/whoop/educationModels/InsetDto;->leading:D

    iput-wide p6, p0, Lcom/whoop/educationModels/InsetDto;->bottom:D

    iput-wide p8, p0, Lcom/whoop/educationModels/InsetDto;->trailing:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/educationModels/InsetDto;DDDDILjava/lang/Object;)Lcom/whoop/educationModels/InsetDto;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/educationModels/InsetDto;->top:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/whoop/educationModels/InsetDto;->leading:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-wide p5, p0, Lcom/whoop/educationModels/InsetDto;->bottom:D

    :cond_2
    move-wide v5, p5

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget-wide p1, p0, Lcom/whoop/educationModels/InsetDto;->trailing:D

    move-wide v7, p1

    :goto_0
    move-object v0, p0

    goto :goto_1

    :cond_3
    move-wide/from16 v7, p7

    goto :goto_0

    :goto_1
    invoke-virtual/range {v0 .. v8}, Lcom/whoop/educationModels/InsetDto;->copy(DDDD)Lcom/whoop/educationModels/InsetDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBottom$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bottom"
    .end annotation

    return-void
.end method

.method public static synthetic getLeading$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "leading"
    .end annotation

    return-void
.end method

.method public static synthetic getTop$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "top"
    .end annotation

    return-void
.end method

.method public static synthetic getTrailing$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trailing"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$education_models_release(Lcom/whoop/educationModels/InsetDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-wide v1, p0, Lcom/whoop/educationModels/InsetDto;->top:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x1

    iget-wide v1, p0, Lcom/whoop/educationModels/InsetDto;->leading:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/whoop/educationModels/InsetDto;->bottom:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/whoop/educationModels/InsetDto;->trailing:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    return-void
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->top:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->leading:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->bottom:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->trailing:D

    return-wide v0
.end method

.method public final copy(DDDD)Lcom/whoop/educationModels/InsetDto;
    .locals 9

    new-instance v0, Lcom/whoop/educationModels/InsetDto;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-wide/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/whoop/educationModels/InsetDto;-><init>(DDDD)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/educationModels/InsetDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/educationModels/InsetDto;

    iget-wide v3, p0, Lcom/whoop/educationModels/InsetDto;->top:D

    iget-wide v5, p1, Lcom/whoop/educationModels/InsetDto;->top:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/educationModels/InsetDto;->leading:D

    iget-wide v5, p1, Lcom/whoop/educationModels/InsetDto;->leading:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/educationModels/InsetDto;->bottom:D

    iget-wide v5, p1, Lcom/whoop/educationModels/InsetDto;->bottom:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/educationModels/InsetDto;->trailing:D

    iget-wide v5, p1, Lcom/whoop/educationModels/InsetDto;->trailing:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBottom()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->bottom:D

    return-wide v0
.end method

.method public final getLeading()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->leading:D

    return-wide v0
.end method

.method public final getTop()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->top:D

    return-wide v0
.end method

.method public final getTrailing()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->trailing:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->top:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/educationModels/InsetDto;->leading:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/educationModels/InsetDto;->bottom:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/educationModels/InsetDto;->trailing:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Lcom/whoop/educationModels/InsetDto;->top:D

    iget-wide v2, p0, Lcom/whoop/educationModels/InsetDto;->leading:D

    iget-wide v4, p0, Lcom/whoop/educationModels/InsetDto;->bottom:D

    iget-wide v6, p0, Lcom/whoop/educationModels/InsetDto;->trailing:D

    const-string v8, "InsetDto(top="

    const-string v9, ", leading="

    invoke-static {v8, v0, v1, v9}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", bottom="

    const-string v2, ", trailing="

    invoke-static {v0, v1, v4, v5, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v6, v7, v1, v0}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
