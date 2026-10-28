.class public final Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel$$serializer;,
        Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0002MNB\u0084\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u0012+\u0008\u0002\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cj\u0004\u0018\u0001`\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\t0\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u0083\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000c\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u000cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0010\u0010$\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J3\u0010*\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cj\u0004\u0018\u0001`\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\t0\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010)J\u0097\u0001\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c2+\u0008\u0002\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cj\u0004\u0018\u0001`\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\t0\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u0010\u0010.\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010=\u001a\u0004\u0008>\u0010 R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010=\u001a\u0004\u0008?\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008@\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010=\u001a\u0004\u0008A\u0010 R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010B\u001a\u0004\u0008C\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010D\u001a\u0004\u0008E\u0010\'R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010F\u001a\u0004\u0008G\u0010)\"\u0004\u0008H\u0010IRE\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cj\u0004\u0018\u0001`\u000f\u00a2\u0006\u000c\u0008\u0010\u0012\u0008\u0008\u0011\u0012\u0004\u0008\t0\u00128\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010F\u001a\u0004\u0008J\u0010)\"\u0004\u0008K\u0010I\u00a8\u0006O"
    }
    d2 = {
        "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "icon",
        "contentDescription",
        "iconUrl",
        "Lcom/whoop/design/models/items/FabMenuModel;",
        "menu",
        "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
        "style",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/items/FabMenuModel;",
        "component6",
        "()Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
        "component7",
        "()Ljava/util/Map;",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;",
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
        "write$Self$community_moments_release",
        "(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getIcon",
        "getContentDescription",
        "getIconUrl",
        "Lcom/whoop/design/models/items/FabMenuModel;",
        "getMenu",
        "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
        "getStyle",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "a",
        "community-moments_release"
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

.field public static final Companion:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel$a;


# instance fields
.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final contentDescription:Ljava/lang/String;

.field private final icon:Ljava/lang/String;

.field private final iconUrl:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final menu:Lcom/whoop/design/models/items/FabMenuModel;

.field private final style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->Companion:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lur0/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lur0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lur0/a;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lur0/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    aput-object v1, v0, v4

    aput-object v1, v0, v6

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const/4 v4, 0x3

    aput-object v1, v0, v4

    const/4 v4, 0x4

    aput-object v1, v0, v4

    const/4 v4, 0x5

    aput-object v3, v0, v4

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x37

    const/16 v0, 0x37

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel$$serializer;->INSTANCE:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    :goto_0
    iput-object p6, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    iput-object p7, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    goto :goto_1

    :cond_2
    iput-object p8, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    :goto_1
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_3
    iput-object p9, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/FabMenuModel;",
            "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "menu"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    .line 9
    iput-object p7, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    .line 10
    iput-object p8, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x8

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_2

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;->Companion:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle$a;

    invoke-virtual {v0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_moments_release(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    if-eqz v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lcom/whoop/design/models/items/FabMenuModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FabMenuModel$$serializer;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/WithGeneratedBindings;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lur0/b;->a(Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/FabMenuModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

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

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/FabMenuModel;",
            "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "menu"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/FabMenuModel;Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getContentDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMenu()Lcom/whoop/design/models/items/FabMenuModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/FabMenuModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v2, v3

    return v2
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->icon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->contentDescription:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->iconUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->menu:Lcom/whoop/design/models/items/FabMenuModel;

    iget-object v5, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->style:Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonStyle;

    iget-object v6, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->bindings:Ljava/util/Map;

    iget-object v7, p0, Lcom/whoop/communitymoments/domain/models/MenuAnchorButtonModel;->aggregateBindings:Ljava/util/Map;

    const-string v8, ", icon="

    const-string v9, ", contentDescription="

    const-string v10, "MenuAnchorButtonModel(id="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconUrl="

    const-string v8, ", menu="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
