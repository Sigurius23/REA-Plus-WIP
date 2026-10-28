.class public final Lcom/amplitude/android/engagement/types/SurveyResponseSelect;
.super Llj/e0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amplitude/android/engagement/types/SurveyResponseSelect$$serializer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/0B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tBK\u0008\u0017\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u00c7\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J:\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u0018J\u0010\u0010!\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008+\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\'\u001a\u0004\u0008,\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\'\u001a\u0004\u0008-\u0010\u0018\u00a8\u00061"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/SurveyResponseSelect;",
        "Llj/e0;",
        "",
        "blockId",
        "",
        "value",
        "stringResponse",
        "otherText",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "seen1",
        "type",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lzc3/c;Lyc3/g;)V",
        "toJSONString",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "()I",
        "component3",
        "component4",
        "copy",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/SurveyResponseSelect;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getBlockId",
        "I",
        "getValue",
        "getStringResponse",
        "getOtherText",
        "getType",
        "Companion",
        "$serializer",
        "com/amplitude/android/engagement/types/s1",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/amplitude/android/engagement/types/s1;


# instance fields
.field private final blockId:Ljava/lang/String;

.field private final otherText:Ljava/lang/String;

.field private final stringResponse:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/amplitude/android/engagement/types/s1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->Companion:Lcom/amplitude/android/engagement/types/s1;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    and-int/lit8 p7, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p7, :cond_0

    .line 7
    sget-object p7, Lcom/amplitude/android/engagement/types/SurveyResponseSelect$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/SurveyResponseSelect$$serializer;

    invoke-virtual {p7}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    .line 8
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p2, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->blockId:Ljava/lang/String;

    iput p3, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    iput-object p4, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_2

    .line 10
    const-string p1, "string"

    .line 11
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->type:Ljava/lang/String;

    return-void

    :cond_2
    iput-object p6, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->type:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "blockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stringResponse"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->blockId:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    .line 4
    iput-object p3, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    .line 6
    const-string p1, "string"

    iput-object p1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->type:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/amplitude/android/engagement/types/SurveyResponseSelect;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->blockId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->getBlockId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "string"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->getType()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->blockId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/amplitude/android/engagement/types/SurveyResponseSelect;
    .locals 1

    const-string v0, "blockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stringResponse"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->blockId:Ljava/lang/String;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->blockId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    iget v3, p1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    iget-object v3, p1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    iget-object p1, p1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getBlockId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->blockId:Ljava/lang/String;

    return-object v0
.end method

.method public final getOtherText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    return-object v0
.end method

.method public final getStringResponse()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->blockId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toJSONString()Ljava/lang/String;
    .locals 4

    :try_start_0
    sget-object v0, Lwj/b;->a:Lad3/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->Companion:Lcom/amplitude/android/engagement/types/s1;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/s1;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to serialize to JSON string: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SurveyResponseSelect(blockId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->blockId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->value:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", stringResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->stringResponse:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", otherText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->otherText:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
