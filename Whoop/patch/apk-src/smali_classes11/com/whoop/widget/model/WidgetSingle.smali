.class public final Lcom/whoop/widget/model/WidgetSingle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/widget/model/WidgetSingle$$serializer;,
        Lcom/whoop/widget/model/WidgetSingle$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBK\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"JF\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010)\u001a\u00020\u00082\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010.\u0012\u0004\u00080\u00101\u001a\u0004\u0008/\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00102\u0012\u0004\u00084\u00101\u001a\u0004\u00083\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00086\u0010\"\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/widget/model/WidgetSingle;",
        "",
        "",
        "icon",
        "text",
        "",
        "percentage",
        "targetPercentage",
        "",
        "calibrating",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$widget_release",
        "(Lcom/whoop/widget/model/WidgetSingle;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()F",
        "component4",
        "()Ljava/lang/Float;",
        "component5",
        "()Ljava/lang/Boolean;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;)Lcom/whoop/widget/model/WidgetSingle;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getIcon",
        "getText",
        "F",
        "getPercentage",
        "getPercentage$annotations",
        "()V",
        "Ljava/lang/Float;",
        "getTargetPercentage",
        "getTargetPercentage$annotations",
        "Ljava/lang/Boolean;",
        "getCalibrating",
        "Companion",
        "$serializer",
        "a",
        "widget_release"
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

.field public static final Companion:Lcom/whoop/widget/model/WidgetSingle$a;


# instance fields
.field private final calibrating:Ljava/lang/Boolean;

.field private final icon:Ljava/lang/String;

.field private final percentage:F

.field private final targetPercentage:Ljava/lang/Float;

.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/widget/model/WidgetSingle$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/widget/model/WidgetSingle$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/widget/model/WidgetSingle;->Companion:Lcom/whoop/widget/model/WidgetSingle$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/widget/model/WidgetSingle$$serializer;->INSTANCE:Lcom/whoop/widget/model/WidgetSingle$$serializer;

    invoke-virtual {p7}, Lcom/whoop/widget/model/WidgetSingle$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    iput p4, p0, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    iput-object p5, p0, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

    iput-object p6, p0, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    .line 6
    iput-object p4, p0, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

    .line 7
    iput-object p5, p0, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/widget/model/WidgetSingle;Ljava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/widget/model/WidgetSingle;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/widget/model/WidgetSingle;->copy(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;)Lcom/whoop/widget/model/WidgetSingle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getPercentage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "percentage_around"
    .end annotation

    return-void
.end method

.method public static synthetic getTargetPercentage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "target_percentage_around"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$widget_release(Lcom/whoop/widget/model/WidgetSingle;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    sget-object v0, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    return v0
.end method

.method public final component4()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;)Lcom/whoop/widget/model/WidgetSingle;
    .locals 7

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/widget/model/WidgetSingle;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/widget/model/WidgetSingle;-><init>(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Float;Ljava/lang/Boolean;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/widget/model/WidgetSingle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/widget/model/WidgetSingle;

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    iget v3, p1, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCalibrating()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getPercentage()F
    .locals 1

    iget v0, p0, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    return v0
.end method

.method public final getTargetPercentage()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

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

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/widget/model/WidgetSingle;->icon:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/widget/model/WidgetSingle;->text:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/widget/model/WidgetSingle;->percentage:F

    iget-object v3, p0, Lcom/whoop/widget/model/WidgetSingle;->targetPercentage:Ljava/lang/Float;

    iget-object v4, p0, Lcom/whoop/widget/model/WidgetSingle;->calibrating:Ljava/lang/Boolean;

    const-string v5, ", text="

    const-string v6, ", percentage="

    const-string v7, "WidgetSingle(icon="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", targetPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", calibrating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Ld13/a;->j(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
