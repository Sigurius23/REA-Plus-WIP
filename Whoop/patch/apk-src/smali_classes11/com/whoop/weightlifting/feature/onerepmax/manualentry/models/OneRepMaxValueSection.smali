.class public final Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$$serializer;,
        Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000278BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB]\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000b\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JX\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001bJ\u0010\u0010\'\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00081\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00100\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010,\u001a\u0004\u00083\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010#\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;",
        "",
        "",
        "title",
        "valueTitle",
        "unit",
        "",
        "minValue",
        "maxValue",
        "errorMessage",
        "value",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()I",
        "component5",
        "component6",
        "component7",
        "()Ljava/lang/Integer;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getValueTitle",
        "getUnit",
        "I",
        "getMinValue",
        "getMaxValue",
        "getErrorMessage",
        "Ljava/lang/Integer;",
        "getValue",
        "Companion",
        "$serializer",
        "a",
        "weightlifting_release"
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

.field public static final Companion:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$a;


# instance fields
.field private final errorMessage:Ljava/lang/String;

.field private final maxValue:I

.field private final minValue:I

.field private final title:Ljava/lang/String;

.field private final unit:Ljava/lang/String;

.field private final value:Ljava/lang/Integer;

.field private final valueTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->Companion:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$$serializer;->INSTANCE:Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$$serializer;

    invoke-virtual {p9}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    iput p5, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    iput p6, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    iput-object p7, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    .line 7
    iput p5, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    .line 8
    iput-object p6, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;
    .locals 9

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    iget v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    iget v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    return v0
.end method

.method public final getMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnit()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getValueTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->valueTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->unit:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->minValue:I

    iget v4, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->maxValue:I

    iget-object v5, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->errorMessage:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->value:Ljava/lang/Integer;

    const-string v7, ", valueTitle="

    const-string v8, ", unit="

    const-string v9, "OneRepMaxValueSection(title="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minValue="

    const-string v7, ", maxValue="

    invoke-static {v3, v2, v1, v7, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", errorMessage="

    const-string v2, ", value="

    invoke-static {v4, v1, v5, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
