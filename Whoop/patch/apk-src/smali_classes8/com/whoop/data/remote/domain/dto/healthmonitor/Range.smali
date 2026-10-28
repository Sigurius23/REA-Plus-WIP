.class public final Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$$serializer;,
        Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tBC\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0010\u0010!\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008+\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010)\u001a\u0004\u0008,\u0010\u001b\u00a8\u0006/"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;",
        "",
        "",
        "lower_bound_type",
        "",
        "lower_endpoint",
        "upper_bound_type",
        "upper_endpoint",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/lang/Double;",
        "component3",
        "component4",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getLower_bound_type",
        "Ljava/lang/Double;",
        "getLower_endpoint",
        "getUpper_bound_type",
        "getUpper_endpoint",
        "Companion",
        "$serializer",
        "core_release"
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
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$Companion;


# instance fields
.field private final lower_bound_type:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "lower_bound_type"
    .end annotation
.end field

.field private final lower_endpoint:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "lower_endpoint"
    .end annotation
.end field

.field private final upper_bound_type:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "upper_bound_type"
    .end annotation
.end field

.field private final upper_endpoint:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "upper_endpoint"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->Companion:Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$$serializer;

    invoke-virtual {p6}, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->copy(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;
    .locals 1

    new-instance v0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;-><init>(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getLower_bound_type()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    return-object v0
.end method

.method public final getLower_endpoint()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    return-object v0
.end method

.method public final getUpper_bound_type()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpper_endpoint()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_bound_type:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->lower_endpoint:Ljava/lang/Double;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_bound_type:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;->upper_endpoint:Ljava/lang/Double;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Range(lower_bound_type="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", lower_endpoint="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", upper_bound_type="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", upper_endpoint="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
