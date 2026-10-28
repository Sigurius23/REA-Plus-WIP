.class public final Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 A2\u00020\u0001:\u0002BABW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B{\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010 J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*Jr\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010 J\u0010\u0010.\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u000100H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00105\u001a\u0004\u00087\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00088\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00089\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u0008:\u0010 R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010;\u001a\u0004\u0008<\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u0008=\u0010 R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00105\u001a\u0004\u0008>\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010?\u001a\u0004\u0008@\u0010*\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "siteCode",
        "titleDisplay",
        "subtitleDisplay",
        "distanceDisplay",
        "distanceIcon",
        "",
        "Lcom/whoop/design/models/AppointmentButtonModel;",
        "appointmentButtons",
        "collapsedTextDisplay",
        "expandedTextDisplay",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "infoCallout",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "component8",
        "component9",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getSiteCode",
        "getTitleDisplay",
        "getSubtitleDisplay",
        "getDistanceDisplay",
        "getDistanceIcon",
        "Ljava/util/List;",
        "getAppointmentButtons",
        "getCollapsedTextDisplay",
        "getExpandedTextDisplay",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getInfoCallout",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$Companion;


# instance fields
.field private final appointmentButtons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/AppointmentButtonModel;",
            ">;"
        }
    .end annotation
.end field

.field private final collapsedTextDisplay:Ljava/lang/String;

.field private final distanceDisplay:Ljava/lang/String;

.field private final distanceIcon:Ljava/lang/String;

.field private final expandedTextDisplay:Ljava/lang/String;

.field private final infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final siteCode:Ljava/lang/String;

.field private final subtitleDisplay:Ljava/lang/String;

.field private final titleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->Companion:Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ltb0/a;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Ltb0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0x9

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v2, v3, v4

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/AppointmentButtonModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ")V"
        }
    .end annotation

    const-string v0, "siteCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "distanceDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "distanceIcon"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appointmentButtons"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collapsedTextDisplay"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandedTextDisplay"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/AppointmentButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/AppointmentButtonModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    :cond_8
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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/AppointmentButtonModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/AppointmentButtonModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ")",
            "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;"
        }
    .end annotation

    const-string v0, "siteCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "distanceDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "distanceIcon"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appointmentButtons"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "collapsedTextDisplay"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandedTextDisplay"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAppointmentButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/AppointmentButtonModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    return-object v0
.end method

.method public final getCollapsedTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDistanceDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDistanceIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpandedTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getSiteCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->siteCode:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->distanceIcon:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->appointmentButtons:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->collapsedTextDisplay:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->expandedTextDisplay:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const-string v9, ", titleDisplay="

    const-string v10, ", subtitleDisplay="

    const-string v11, "SchedulingTileModel(siteCode="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distanceDisplay="

    const-string v9, ", distanceIcon="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", appointmentButtons="

    const-string v2, ", collapsedTextDisplay="

    invoke-static {v4, v1, v2, v0, v5}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", expandedTextDisplay="

    const-string v2, ", infoCallout="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
