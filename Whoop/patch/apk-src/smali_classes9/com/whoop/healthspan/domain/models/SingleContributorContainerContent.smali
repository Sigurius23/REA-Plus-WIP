.class public final Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$$serializer;,
        Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 G2\u00020\u0001:\u0002HGBk\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u0095\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001cJ\u0010\u0010%\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010!J\u0016\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001aJ\u008a\u0001\u0010\'\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001cJ\u0010\u0010*\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001\u00a2\u0006\u0004\u00086\u00107R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00109\u001a\u0004\u0008:\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010;\u001a\u0004\u0008<\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010;\u001a\u0004\u0008=\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010;\u001a\u0004\u0008>\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008?\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010@\u001a\u0004\u0008A\u0010!R\u0017\u0010\u000c\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008B\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010;\u001a\u0004\u0008C\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010;\u001a\u0004\u0008D\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010@\u001a\u0004\u0008E\u0010!R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00109\u001a\u0004\u0008F\u0010\u001a\u00a8\u0006I"
    }
    d2 = {
        "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;",
        "",
        "",
        "Lcom/whoop/healthspan/domain/models/ContributorRangeDivision;",
        "rangeDivisions",
        "",
        "rangeLeftLabelDisplay",
        "rangeLeftLabelStyle",
        "rangeRightLabelDisplay",
        "rangeRightLabelStyle",
        "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
        "topRangeValue",
        "impactValueDisplay",
        "impactValueLabelDisplay",
        "impactValueStyle",
        "expandedBottomRangeValue",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "expandedItems",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;)Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$healthspan_release",
        "(Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/List;",
        "getRangeDivisions",
        "Ljava/lang/String;",
        "getRangeLeftLabelDisplay",
        "getRangeLeftLabelStyle",
        "getRangeRightLabelDisplay",
        "getRangeRightLabelStyle",
        "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
        "getTopRangeValue",
        "getImpactValueDisplay",
        "getImpactValueLabelDisplay",
        "getImpactValueStyle",
        "getExpandedBottomRangeValue",
        "getExpandedItems",
        "Companion",
        "$serializer",
        "healthspan_release"
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

.field public static final Companion:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$Companion;


# instance fields
.field private final expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

.field private final expandedItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final impactValueDisplay:Ljava/lang/String;

.field private final impactValueLabelDisplay:Ljava/lang/String;

.field private final impactValueStyle:Ljava/lang/String;

.field private final rangeDivisions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/ContributorRangeDivision;",
            ">;"
        }
    .end annotation
.end field

.field private final rangeLeftLabelDisplay:Ljava/lang/String;

.field private final rangeLeftLabelStyle:Ljava/lang/String;

.field private final rangeRightLabelDisplay:Ljava/lang/String;

.field private final rangeRightLabelStyle:Ljava/lang/String;

.field private final topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->Companion:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lga1/a;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Lga1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lga1/a;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Lga1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0xb

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v1, v4, v3

    const/4 v3, 0x2

    aput-object v1, v4, v3

    const/4 v3, 0x3

    aput-object v1, v4, v3

    const/4 v3, 0x4

    aput-object v1, v4, v3

    const/4 v3, 0x5

    aput-object v1, v4, v3

    const/4 v3, 0x6

    aput-object v1, v4, v3

    const/4 v3, 0x7

    aput-object v1, v4, v3

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    const/16 v0, 0xa

    aput-object v2, v4, v0

    sput-object v4, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$$serializer;

    invoke-virtual {p13}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    iput-object p8, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    iput-object p12, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/ContributorRangeDivision;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "rangeDivisions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeLeftLabelDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeLeftLabelStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeRightLabelDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeRightLabelStyle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topRangeValue"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactValueDisplay"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactValueLabelDisplay"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactValueStyle"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandedBottomRangeValue"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandedItems"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    .line 9
    iput-object p7, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    .line 13
    iput-object p11, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthspan/domain/models/ContributorRangeDivision$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/ContributorRangeDivision$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->copy(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;)Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$healthspan_release(Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/healthspan/domain/models/ContributorRangeValue$$serializer;->INSTANCE:Lcom/whoop/healthspan/domain/models/ContributorRangeValue$$serializer;

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/ContributorRangeDivision;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    return-object v0
.end method

.method public final component10()Lcom/whoop/healthspan/domain/models/ContributorRangeValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/healthspan/domain/models/ContributorRangeValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;)Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/ContributorRangeDivision;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/healthspan/domain/models/ContributorRangeValue;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;"
        }
    .end annotation

    const-string v0, "rangeDivisions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeLeftLabelDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeLeftLabelStyle"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeRightLabelDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rangeRightLabelStyle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topRangeValue"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactValueDisplay"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactValueLabelDisplay"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "impactValueStyle"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandedBottomRangeValue"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandedItems"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v12}, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthspan/domain/models/ContributorRangeValue;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    iget-object v3, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getExpandedBottomRangeValue()Lcom/whoop/healthspan/domain/models/ContributorRangeValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    return-object v0
.end method

.method public final getExpandedItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    return-object v0
.end method

.method public final getImpactValueDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getImpactValueLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getImpactValueStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getRangeDivisions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthspan/domain/models/ContributorRangeDivision;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    return-object v0
.end method

.method public final getRangeLeftLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getRangeLeftLabelStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getRangeRightLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getRangeRightLabelStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTopRangeValue()Lcom/whoop/healthspan/domain/models/ContributorRangeValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    invoke-virtual {v2}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    invoke-virtual {v2}, Lcom/whoop/healthspan/domain/models/ContributorRangeValue;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeDivisions:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeLeftLabelStyle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->rangeRightLabelStyle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->topRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    iget-object v6, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueDisplay:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueLabelDisplay:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->impactValueStyle:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedBottomRangeValue:Lcom/whoop/healthspan/domain/models/ContributorRangeValue;

    iget-object v10, p0, Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;->expandedItems:Ljava/util/List;

    const-string v11, ", rangeLeftLabelDisplay="

    const-string v12, ", rangeLeftLabelStyle="

    const-string v13, "SingleContributorContainerContent(rangeDivisions="

    invoke-static {v13, v11, v1, v12, v0}, Lnh3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rangeRightLabelDisplay="

    const-string v11, ", rangeRightLabelStyle="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", topRangeValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", impactValueDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", impactValueLabelDisplay="

    const-string v2, ", impactValueStyle="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expandedBottomRangeValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expandedItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v10, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
