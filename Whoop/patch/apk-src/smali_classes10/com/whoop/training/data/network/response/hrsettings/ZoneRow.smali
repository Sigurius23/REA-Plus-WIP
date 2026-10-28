.class public final Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$$serializer;,
        Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nBI\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJB\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008)\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008*\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u0008,\u0010\u001dR\u001a\u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010+\u001a\u0004\u0008-\u0010\u001d\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
        "",
        "",
        "style",
        "label",
        "id",
        "",
        "min",
        "max",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$training_release",
        "(Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()I",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getStyle",
        "getLabel",
        "getId",
        "I",
        "getMin",
        "getMax",
        "Companion",
        "$serializer",
        "a",
        "training_release"
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

.field public static final Companion:Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$a;


# instance fields
.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final label:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "label"
    .end annotation
.end field

.field private final max:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max"
    .end annotation
.end field

.field private final min:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "min"
    .end annotation
.end field

.field private final style:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "style"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->Companion:Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$$serializer;->INSTANCE:Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$$serializer;

    invoke-virtual {p7}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    iput p5, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    iput p6, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    .line 7
    iput p5, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$training_release(Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget p0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;
    .locals 7

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    iget v3, p1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    iget p1, p1, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMax()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    return v0
.end method

.method public final getMin()I
    .locals 1

    iget v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    return v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->style:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->id:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->min:I

    iget v4, p0, Lcom/whoop/training/data/network/response/hrsettings/ZoneRow;->max:I

    const-string v5, ", label="

    const-string v6, ", id="

    const-string v7, "ZoneRow(style="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", min="

    const-string v5, ", max="

    invoke-static {v3, v2, v1, v5, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
