.class public final Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$$serializer;,
        Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u00029:B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000eBY\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$JP\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00084\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010$R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00105\u001a\u0004\u00087\u0010$\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;",
        "",
        "",
        "selectionDisplay",
        "Lcom/whoop/design/models/DateDisplay;",
        "dateDisplay",
        "Lh11/g;",
        "style",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "topItems",
        "Lcom/whoop/clinicianintheloop/api/VideoScheduleSection;",
        "scheduleSections",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$clinician_in_the_loop_release",
        "(Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/DateDisplay;",
        "component3",
        "()Lh11/g;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;)Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getSelectionDisplay",
        "Lcom/whoop/design/models/DateDisplay;",
        "getDateDisplay",
        "Lh11/g;",
        "getStyle",
        "Ljava/util/List;",
        "getTopItems",
        "getScheduleSections",
        "Companion",
        "$serializer",
        "a",
        "clinician-in-the-loop_release"
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

.field public static final Companion:Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$a;


# instance fields
.field private final dateDisplay:Lcom/whoop/design/models/DateDisplay;

.field private final scheduleSections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/clinicianintheloop/api/VideoScheduleSection;",
            ">;"
        }
    .end annotation
.end field

.field private final selectionDisplay:Ljava/lang/String;

.field private final style:Lh11/g;

.field private final topItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->Companion:Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lgm2/a;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lgm2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lgm2/a;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Lgm2/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lgm2/a;

    const/16 v5, 0x12

    invoke-direct {v4, v5}, Lgm2/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x5

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v1, 0x2

    aput-object v2, v4, v1

    const/4 v1, 0x3

    aput-object v3, v4, v1

    const/4 v1, 0x4

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    iput-object p4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    iput-object p5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DateDisplay;",
            "Lh11/g;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/clinicianintheloop/api/VideoScheduleSection;",
            ">;)V"
        }
    .end annotation

    const-string v0, "selectionDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleSections"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    .line 5
    iput-object p3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    .line 6
    iput-object p4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.molecule.datepill.DatePillStyle"

    invoke-static {}, Lh11/g;->values()[Lh11/g;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/clinicianintheloop/api/VideoScheduleSection$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/api/VideoScheduleSection$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;)Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$clinician_in_the_loop_release(Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/DateDisplay$$serializer;->INSTANCE:Lcom/whoop/design/models/DateDisplay$$serializer;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    return-object v0
.end method

.method public final component3()Lh11/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/clinicianintheloop/api/VideoScheduleSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;)Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DateDisplay;",
            "Lh11/g;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/clinicianintheloop/api/VideoScheduleSection;",
            ">;)",
            "Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;"
        }
    .end annotation

    const-string v0, "selectionDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scheduleSections"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDateDisplay()Lcom/whoop/design/models/DateDisplay;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    return-object v0
.end method

.method public final getScheduleSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/clinicianintheloop/api/VideoScheduleSection;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Lh11/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    return-object v0
.end method

.method public final getTopItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    invoke-virtual {v1}, Lcom/whoop/design/models/DateDisplay;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->selectionDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->dateDisplay:Lcom/whoop/design/models/DateDisplay;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->style:Lh11/g;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->topItems:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;->scheduleSections:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "VideoSchedulePillModel(selectionDisplay="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dateDisplay="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", topItems="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scheduleSections="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
