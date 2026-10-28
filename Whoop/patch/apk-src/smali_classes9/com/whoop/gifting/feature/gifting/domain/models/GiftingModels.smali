.class public final Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$$serializer;,
        Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BABo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0016\u0008\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u007f\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u001e\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010&J~\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\u0008\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010!J\u0010\u0010/\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00105\u001a\u0004\u00087\u0010!R\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00108\u001a\u0004\u00089\u0010$R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008;\u0010&R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010<\u001a\u0004\u0008=\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010>\u001a\u0004\u0008?\u0010*R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010:\u001a\u0004\u0008@\u0010&\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;",
        "",
        "",
        "toolBarTitle",
        "initiallySelectedSegmentId",
        "",
        "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;",
        "sections",
        "",
        "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;",
        "bottomStickyItems",
        "Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;",
        "bottomCommonStickyItems",
        "Lcom/whoop/design/models/items/CountrySelectorModel;",
        "countrySelector",
        "analytics",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$gifting_release",
        "(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Ljava/util/Map;",
        "component5",
        "()Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;",
        "component6",
        "()Lcom/whoop/design/models/items/CountrySelectorModel;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;)Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getToolBarTitle",
        "getInitiallySelectedSegmentId",
        "Ljava/util/List;",
        "getSections",
        "Ljava/util/Map;",
        "getBottomStickyItems",
        "Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;",
        "getBottomCommonStickyItems",
        "Lcom/whoop/design/models/items/CountrySelectorModel;",
        "getCountrySelector",
        "getAnalytics",
        "Companion",
        "$serializer",
        "gifting_release"
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

.field public static final Companion:Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$Companion;


# instance fields
.field private final analytics:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

.field private final bottomStickyItems:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;",
            ">;"
        }
    .end annotation
.end field

.field private final countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

.field private final initiallySelectedSegmentId:Ljava/lang/String;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final toolBarTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->Companion:Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ll72/f;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Ll72/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ll72/f;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Ll72/f;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Ll72/f;

    const/16 v5, 0x1c

    invoke-direct {v4, v5}, Ll72/f;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x7

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v2, v4, v5

    const/4 v2, 0x3

    aput-object v3, v4, v2

    const/4 v2, 0x4

    aput-object v1, v4, v2

    const/4 v2, 0x5

    aput-object v1, v4, v2

    const/4 v1, 0x6

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$$serializer;->INSTANCE:Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$$serializer;

    invoke-virtual {p9}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    :goto_1
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    :goto_2
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    return-void

    :cond_4
    iput-object p8, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;",
            ">;",
            "Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;",
            "Lcom/whoop/design/models/items/CountrySelectorModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "toolBarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    .line 7
    iput-object p5, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_2

    move-object p6, v0

    :cond_2
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_3

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-object p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel$$serializer;->INSTANCE:Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel$$serializer;->INSTANCE:Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;)Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$gifting_release(Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel$$serializer;->INSTANCE:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel$$serializer;

    iget-object v3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/design/models/items/CountrySelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CountrySelectorModel$$serializer;

    iget-object v3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/CountrySelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    return-object v0
.end method

.method public final component7()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;)Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;",
            ">;",
            "Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;",
            "Lcom/whoop/design/models/items/CountrySelectorModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;"
        }
    .end annotation

    const-string v0, "toolBarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;Lcom/whoop/design/models/items/CountrySelectorModel;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    iget-object v3, p1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    iget-object v3, p1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnalytics()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    return-object v0
.end method

.method public final getBottomCommonStickyItems()Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    return-object v0
.end method

.method public final getBottomStickyItems()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingStickyModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    return-object v0
.end method

.method public final getCountrySelector()Lcom/whoop/design/models/items/CountrySelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    return-object v0
.end method

.method public final getInitiallySelectedSegmentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/gifting/feature/gifting/domain/models/GiftingSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final getToolBarTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CountrySelectorModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->toolBarTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->initiallySelectedSegmentId:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->sections:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomStickyItems:Ljava/util/Map;

    iget-object v4, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->bottomCommonStickyItems:Lcom/whoop/gifting/feature/gifting/domain/models/BottomStickyItemsModel;

    iget-object v5, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->countrySelector:Lcom/whoop/design/models/items/CountrySelectorModel;

    iget-object v6, p0, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->analytics:Ljava/util/Map;

    const-string v7, ", initiallySelectedSegmentId="

    const-string v8, ", sections="

    const-string v9, "GiftingModels(toolBarTitle="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomStickyItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomCommonStickyItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countrySelector="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analytics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
