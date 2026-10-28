.class public final Lcom/whoop/domain/model/RecordsDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/RecordsDto$$serializer;,
        Lcom/whoop/domain/model/RecordsDto$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 0*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u000210B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB;\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0008\u0010\rJG\u0010\u0018\u001a\u00020\u0015\"\n\u0008\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J:\u0010!\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010$\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001dJ\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008,\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008-\u0010\u001dR \u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u0008/\u0010 \u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/domain/model/RecordsDto;",
        "F",
        "",
        "",
        "offset",
        "totalCount",
        "",
        "records",
        "<init>",
        "(IILjava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Lwc3/c;",
        "typeSerial0",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/domain/model/RecordsDto;Lzc3/c;Lyc3/g;Lwc3/c;)V",
        "write$Self",
        "Lcom/whoop/domain/model/Records;",
        "toRecords",
        "()Lcom/whoop/domain/model/Records;",
        "component1",
        "()I",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(IILjava/util/List;)Lcom/whoop/domain/model/RecordsDto;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getOffset",
        "getTotalCount",
        "Ljava/util/List;",
        "getRecords",
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
.field private static final $cachedDescriptor:Lyc3/g;

.field public static final Companion:Lcom/whoop/domain/model/RecordsDto$Companion;


# instance fields
.field private final offset:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "offset"
    .end annotation
.end field

.field private final records:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TF;>;"
        }
    .end annotation
.end field

.field private final totalCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_count"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/domain/model/RecordsDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/RecordsDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/RecordsDto;->Companion:Lcom/whoop/domain/model/RecordsDto$Companion;

    new-instance v0, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.domain.model.RecordsDto"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v1, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v1, "offset"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v1, "totalCount"

    invoke-virtual {v0, v1, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v1, "records"

    invoke-virtual {v0, v1, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v0, Lcom/whoop/domain/model/RecordsDto;->$cachedDescriptor:Lyc3/g;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/domain/model/RecordsDto;->$cachedDescriptor:Lyc3/g;

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    iput p3, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    iput-object p4, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "+TF;>;)V"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    .line 4
    iput p2, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    .line 5
    iput-object p3, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/domain/model/RecordsDto;IILjava/util/List;ILjava/lang/Object;)Lcom/whoop/domain/model/RecordsDto;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/domain/model/RecordsDto;->copy(IILjava/util/List;)Lcom/whoop/domain/model/RecordsDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/domain/model/RecordsDto;Lzc3/c;Lyc3/g;Lwc3/c;)V
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    invoke-direct {v0, p3}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    iget-object p0, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    const/4 p3, 0x2

    invoke-interface {p1, p2, p3, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TF;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IILjava/util/List;)Lcom/whoop/domain/model/RecordsDto;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "+TF;>;)",
            "Lcom/whoop/domain/model/RecordsDto<",
            "TF;>;"
        }
    .end annotation

    const-string v0, "records"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/domain/model/RecordsDto;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/domain/model/RecordsDto;-><init>(IILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/domain/model/RecordsDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    iget v1, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    iget v3, p1, Lcom/whoop/domain/model/RecordsDto;->offset:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    iget v3, p1, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getOffset()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    return v0
.end method

.method public final getRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TF;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toRecords()Lcom/whoop/domain/model/Records;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/whoop/domain/model/Records<",
            "TF;>;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/domain/model/Records;

    iget v1, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    iget v2, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    iget-object v3, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/domain/model/Records;-><init>(IILjava/util/List;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/whoop/domain/model/RecordsDto;->offset:I

    iget v1, p0, Lcom/whoop/domain/model/RecordsDto;->totalCount:I

    iget-object v2, p0, Lcom/whoop/domain/model/RecordsDto;->records:Ljava/util/List;

    const-string v3, ", totalCount="

    const-string v4, ", records="

    const-string v5, "RecordsDto(offset="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
