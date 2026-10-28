.class public final Lcom/whoop/design/models/items/NavigationButtonModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/NavigationButtonModel$$serializer;,
        Lcom/whoop/design/models/items/NavigationButtonModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 Q2\u00020\u0001:\u0002RQBu\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u007f\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0086\u0001\u0010-\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00104\u001a\u0002032\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105J\'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001\u00a2\u0006\u0004\u0008<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010?\u001a\u0004\u0008@\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010A\u001a\u0004\u0008B\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010?\u001a\u0004\u0008C\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010?\u001a\u0004\u0008D\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010E\u001a\u0004\u0008F\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010G\u001a\u0004\u0008H\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010I\u001a\u0004\u0008J\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010K\u001a\u0004\u0008L\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010M\u001a\u0004\u0008N\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010O\u001a\u0004\u0008P\u0010,\u00a8\u0006S"
    }
    d2 = {
        "Lcom/whoop/design/models/items/NavigationButtonModel;",
        "",
        "",
        "text",
        "Lgz0/m0;",
        "icon",
        "iconUrl",
        "contentDescription",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "Lcom/whoop/navigation/DismissEventModel;",
        "dismissEvent",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "dismissModal",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "Lcom/whoop/design/models/items/GlowModel;",
        "glow",
        "<init>",
        "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lgz0/m0;",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/navigation/e;",
        "component6",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component7",
        "()Lcom/whoop/navigation/DismissEventModel;",
        "component8",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "component9",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "component10",
        "()Lcom/whoop/design/models/items/GlowModel;",
        "copy",
        "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;)Lcom/whoop/design/models/items/NavigationButtonModel;",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/NavigationButtonModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getText",
        "Lgz0/m0;",
        "getIcon",
        "getIconUrl",
        "getContentDescription",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getAction",
        "Lcom/whoop/navigation/DismissEventModel;",
        "getDismissEvent",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "getDismissModal",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "Lcom/whoop/design/models/items/GlowModel;",
        "getGlow",
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

.field public static final Companion:Lcom/whoop/design/models/items/NavigationButtonModel$Companion;


# instance fields
.field private final action:Lcom/whoop/whoopaction/domain/models/Action;

.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private final contentDescription:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final dismissEvent:Lcom/whoop/navigation/DismissEventModel;

.field private final dismissModal:Lcom/whoop/design/models/modal/AnyModal;

.field private final glow:Lcom/whoop/design/models/items/GlowModel;

.field private final icon:Lgz0/m0;

.field private final iconUrl:Ljava/lang/String;

.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/whoop/design/models/items/NavigationButtonModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/NavigationButtonModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/NavigationButtonModel;->Companion:Lcom/whoop/design/models/items/NavigationButtonModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/NavigationButtonModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/h;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lw91/h;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/h;

    const/4 v6, 0x5

    invoke-direct {v5, v6}, Lw91/h;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/h;

    const/4 v8, 0x6

    invoke-direct {v7, v8}, Lw91/h;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lw91/h;

    const/4 v10, 0x7

    invoke-direct {v9, v10}, Lw91/h;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v9, 0xa

    new-array v9, v9, [Ll83/h;

    const/4 v11, 0x0

    aput-object v1, v9, v11

    const/4 v11, 0x1

    aput-object v3, v9, v11

    const/4 v3, 0x2

    aput-object v1, v9, v3

    const/4 v3, 0x3

    aput-object v1, v9, v3

    aput-object v5, v9, v4

    aput-object v7, v9, v6

    aput-object v1, v9, v8

    aput-object v2, v9, v10

    aput-object v1, v9, v0

    const/16 v0, 0x9

    aput-object v1, v9, v0

    sput-object v9, Lcom/whoop/design/models/items/NavigationButtonModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p1, 0x3a

    const/16 v0, 0x3a

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/design/models/items/NavigationButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NavigationButtonModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/design/models/items/NavigationButtonModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    const/4 v0, 0x0

    if-nez p12, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    :goto_0
    iput-object p3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    :goto_1
    iput-object p5, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    iput-object p7, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    :goto_2
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    :goto_3
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    goto :goto_4

    :cond_5
    iput-object p10, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :goto_4
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_6

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    return-void

    :cond_6
    iput-object p11, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_2

    move-object p7, v0

    :cond_2
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_3

    move-object p8, v0

    :cond_3
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_4

    move-object p9, v0

    :cond_4
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_5

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/design/models/items/NavigationButtonModel;-><init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/AnyModal;->Companion:Lcom/whoop/design/models/modal/AnyModal$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/AnyModal$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/NavigationButtonModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/NavigationButtonModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/NavigationButtonModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/NavigationButtonModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/NavigationButtonModel;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/NavigationButtonModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/design/models/items/NavigationButtonModel;->copy(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;)Lcom/whoop/design/models/items/NavigationButtonModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/NavigationButtonModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/NavigationButtonModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/NavigationButtonModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/navigation/DismissEventModel$$serializer;->INSTANCE:Lcom/whoop/navigation/DismissEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/items/GlowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/GlowModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/items/GlowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    return-object v0
.end method

.method public final component2()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component6()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/DismissEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final component9()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;)Lcom/whoop/design/models/items/NavigationButtonModel;
    .locals 12

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/NavigationButtonModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/design/models/items/NavigationButtonModel;-><init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/items/GlowModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/NavigationButtonModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/NavigationButtonModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final getContentDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getDismissEvent()Lcom/whoop/navigation/DismissEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    return-object v0
.end method

.method public final getDismissModal()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final getGlow()Lcom/whoop/design/models/items/GlowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    return-object v0
.end method

.method public final getIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    invoke-static {v3, v0, v2}, Lhc3/i;->b(Lgz0/m0;II)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Lcom/whoop/navigation/DismissEventModel;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/design/models/items/GlowModel;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->text:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->icon:Lgz0/m0;

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->iconUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->contentDescription:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->destination:Lcom/whoop/navigation/e;

    iget-object v5, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v6, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    iget-object v7, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->dismissModal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v8, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v9, p0, Lcom/whoop/design/models/items/NavigationButtonModel;->glow:Lcom/whoop/design/models/items/GlowModel;

    const-string v10, ", icon="

    const-string v11, ", iconUrl="

    const-string v12, "NavigationButtonModel(text="

    invoke-static {v12, v0, v10, v1, v11}, Ljh3/c;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", contentDescription="

    const-string v10, ", destination="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", action="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dismissEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dismissModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", glow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
