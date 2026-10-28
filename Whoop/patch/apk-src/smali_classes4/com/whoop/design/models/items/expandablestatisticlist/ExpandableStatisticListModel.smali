.class public final Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$$serializer;,
        Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>=B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBQ\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%JJ\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001fJ\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00101\u0012\u0004\u00083\u00104\u001a\u0004\u00082\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u00086\u0010!R&\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00107\u0012\u0004\u00089\u00104\u001a\u0004\u00088\u0010#R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010:\u0012\u0004\u0008<\u00104\u001a\u0004\u0008;\u0010%\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "",
        "collapsedCount",
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;",
        "header",
        "",
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;",
        "expandableListItems",
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;",
        "toggleCardButton",
        "<init>",
        "(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;",
        "copy",
        "(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "I",
        "getCollapsedCount",
        "getCollapsedCount$annotations",
        "()V",
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;",
        "getHeader",
        "Ljava/util/List;",
        "getExpandableListItems",
        "getExpandableListItems$annotations",
        "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;",
        "getToggleCardButton",
        "getToggleCardButton$annotations",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$Companion;


# instance fields
.field private final collapsedCount:I

.field private final expandableListItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

.field private final id:Ljava/lang/String;

.field private final toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->Companion:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldx2/a;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Ldx2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ldx2/a;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Ldx2/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v1, 0x3

    aput-object v2, v3, v1

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    iput-object p4, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    iput-object p5, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    return-void

    :cond_1
    iput-object p6, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;",
            ">;",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandableListItems"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;-><init>(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lwc3/c;

    invoke-direct {v0, v1, v2, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->copy(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCollapsedCount$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "collapsed_count"
    .end annotation

    return-void
.end method

.method public static synthetic getExpandableListItems$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "expandable_list_items"
    .end annotation

    return-void
.end method

.method public static synthetic getToggleCardButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "toggle_card_button"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    return v0
.end method

.method public final component3()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;",
            ">;",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;",
            ")",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandableListItems"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;-><init>(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    iget v3, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCollapsedCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    return v0
.end method

.method public final getExpandableListItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getToggleCardButton()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->id:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->collapsedCount:I

    iget-object v2, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->header:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;

    iget-object v3, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->expandableListItems:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;->toggleCardButton:Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;

    const-string v5, ", collapsedCount="

    const-string v6, ", header="

    const-string v7, "ExpandableStatisticListModel(id="

    invoke-static {v1, v7, v0, v5, v6}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expandableListItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toggleCardButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
