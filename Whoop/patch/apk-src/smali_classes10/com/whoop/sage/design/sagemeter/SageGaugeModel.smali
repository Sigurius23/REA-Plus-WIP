.class public final Lcom/whoop/sage/design/sagemeter/SageGaugeModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sage/design/sagemeter/SageGaugeModel$$serializer;,
        Lcom/whoop/sage/design/sagemeter/SageGaugeModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289B;\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBW\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JP\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u00081\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010 R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00084\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010#\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/sage/design/sagemeter/SageGaugeModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "gaugeLastUpdatedDisplay",
        "gaugeSubtextDisplay",
        "gaugeLastUpdatedDisplayStyle",
        "Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;",
        "gaugeLeftSubtext",
        "gaugeRightSubtext",
        "",
        "gaugeFillPercentage",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sage_release",
        "(Lcom/whoop/sage/design/sagemeter/SageGaugeModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;",
        "component5",
        "component6",
        "()Ljava/lang/Float;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;)Lcom/whoop/sage/design/sagemeter/SageGaugeModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getGaugeLastUpdatedDisplay",
        "getGaugeSubtextDisplay",
        "getGaugeLastUpdatedDisplayStyle",
        "Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;",
        "getGaugeLeftSubtext",
        "getGaugeRightSubtext",
        "Ljava/lang/Float;",
        "getGaugeFillPercentage",
        "Companion",
        "$serializer",
        "a",
        "sage_release"
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

.field public static final Companion:Lcom/whoop/sage/design/sagemeter/SageGaugeModel$a;


# instance fields
.field private final gaugeFillPercentage:Ljava/lang/Float;

.field private final gaugeLastUpdatedDisplay:Ljava/lang/String;

.field private final gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

.field private final gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

.field private final gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

.field private final gaugeSubtextDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->Companion:Lcom/whoop/sage/design/sagemeter/SageGaugeModel$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/sage/design/sagemeter/SageGaugeModel$$serializer;->INSTANCE:Lcom/whoop/sage/design/sagemeter/SageGaugeModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    iput-object p6, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    iput-object p7, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;)V
    .locals 1

    const-string v0, "gaugeSubtextDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gaugeLastUpdatedDisplayStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gaugeLeftSubtext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gaugeRightSubtext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/sage/design/sagemeter/SageGaugeModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;ILjava/lang/Object;)Lcom/whoop/sage/design/sagemeter/SageGaugeModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;)Lcom/whoop/sage/design/sagemeter/SageGaugeModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sage_release(Lcom/whoop/sage/design/sagemeter/SageGaugeModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel$$serializer;->INSTANCE:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel$$serializer;

    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object p0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    return-object v0
.end method

.method public final component6()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;)Lcom/whoop/sage/design/sagemeter/SageGaugeModel;
    .locals 8

    const-string v0, "gaugeSubtextDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gaugeLastUpdatedDisplayStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gaugeLeftSubtext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gaugeRightSubtext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;Ljava/lang/Float;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;

    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    iget-object v3, p1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    iget-object v3, p1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    iget-object p1, p1, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getGaugeFillPercentage()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final getGaugeLastUpdatedDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getGaugeLastUpdatedDisplayStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getGaugeLeftSubtext()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    return-object v0
.end method

.method public final getGaugeRightSubtext()Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    return-object v0
.end method

.method public final getGaugeSubtextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    invoke-virtual {v3}, Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    invoke-virtual {v0}, Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeSubtextDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLastUpdatedDisplayStyle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeLeftSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    iget-object v4, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeRightSubtext:Lcom/whoop/sage/design/sagemeter/SageGaugeSubtextModel;

    iget-object v5, p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;->gaugeFillPercentage:Ljava/lang/Float;

    const-string v6, ", gaugeSubtextDisplay="

    const-string v7, ", gaugeLastUpdatedDisplayStyle="

    const-string v8, "SageGaugeModel(gaugeLastUpdatedDisplay="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gaugeLeftSubtext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gaugeRightSubtext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gaugeFillPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
