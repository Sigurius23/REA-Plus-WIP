.class public final Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$$serializer;,
        Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBI\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J>\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010\u001eR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00084\u0010\"\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;",
        "header",
        "",
        "Lcom/whoop/user/journey/model/yearinreview/ComparisonRow;",
        "comparisons",
        "Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;",
        "footer",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$user_journey_release",
        "(Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;)Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;",
        "getHeader",
        "Ljava/util/List;",
        "getComparisons",
        "Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;",
        "getFooter",
        "Companion",
        "$serializer",
        "user-journey_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$Companion;


# instance fields
.field private final comparisons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/ComparisonRow;",
            ">;"
        }
    .end annotation
.end field

.field private final footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

.field private final header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->Companion:Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcq2/a;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lcq2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    iput-object p4, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/ComparisonRow;",
            ">;",
            "Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparisons"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    .line 5
    iput-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/user/journey/model/yearinreview/ComparisonRow$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/ComparisonRow$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;ILjava/lang/Object;)Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->copy(Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;)Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$user_journey_release(Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader$$serializer;

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter$$serializer;

    iget-object p0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/ComparisonRow;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;)Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/ComparisonRow;",
            ">;",
            "Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;",
            ")",
            "Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comparisons"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;-><init>(Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    iget-object p1, p1, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getComparisons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/ComparisonRow;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->header:Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->comparisons:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;->footer:Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "YearInReviewComparisonModel(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", header="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", comparisons="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
