.class public final Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$$serializer;,
        Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000243B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bBS\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 JN\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010+\u001a\u0004\u0008/\u0010\u001bR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00100\u001a\u0004\u00081\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00100\u001a\u0004\u00082\u0010 \u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;",
        "",
        "",
        "title",
        "firstTextFieldUnits",
        "secondTextFieldUnits",
        "errorMessage",
        "",
        "minValueG",
        "maxValueG",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()D",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getFirstTextFieldUnits",
        "getSecondTextFieldUnits",
        "getErrorMessage",
        "D",
        "getMinValueG",
        "getMaxValueG",
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

.field public static final Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$Companion;


# instance fields
.field private final errorMessage:Ljava/lang/String;

.field private final firstTextFieldUnits:Ljava/lang/String;

.field private final maxValueG:D

.field private final minValueG:D

.field private final secondTextFieldUnits:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->Companion:Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$$serializer;

    invoke-virtual {p10}, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    iput-wide p6, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    iput-wide p8, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstTextFieldUnits"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    .line 8
    iput-wide p7, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDILjava/lang/Object;)Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-wide p5, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    :cond_4
    and-int/lit8 p9, p9, 0x20

    if-eqz p9, :cond_5

    iget-wide p7, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    :cond_5
    move-wide p9, p7

    move-wide p7, p5

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-wide v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x5

    iget-wide v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;
    .locals 10

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstTextFieldUnits"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide v6, p5

    move-wide/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    iget-wide v5, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    iget-wide v5, p1, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirstTextFieldUnits()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxValueG()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    return-wide v0
.end method

.method public final getMinValueG()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    return-wide v0
.end method

.method public final getSecondTextFieldUnits()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->firstTextFieldUnits:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->secondTextFieldUnits:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->errorMessage:Ljava/lang/String;

    iget-wide v4, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->minValueG:D

    iget-wide v6, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;->maxValueG:D

    const-string v8, ", firstTextFieldUnits="

    const-string v9, ", secondTextFieldUnits="

    const-string v10, "TextInputField(title="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorMessage="

    const-string v8, ", minValueG="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", maxValueG="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
