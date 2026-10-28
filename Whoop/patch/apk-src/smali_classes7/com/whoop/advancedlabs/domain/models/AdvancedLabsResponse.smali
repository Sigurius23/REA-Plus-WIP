.class public final Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 G2\u00020\u0001:\u0002HGB]\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013Bs\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0016\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/Jr\u00100\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0016\u0008\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010+J\u0010\u00103\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00107\u001a\u0002062\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010;\u001a\u0004\u0008<\u0010%R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010=\u001a\u0004\u0008>\u0010\'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010?\u001a\u0004\u0008@\u0010)R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010A\u001a\u0004\u0008B\u0010+R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008D\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010E\u001a\u0004\u0008F\u0010/\u00a8\u0006I"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
        "",
        "Lcom/whoop/advancedlabs/domain/models/MetaData;",
        "metadata",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "navigationBar",
        "",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
        "sections",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
        "analytics",
        "",
        "initiallySelectedSegmentId",
        "",
        "Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;",
        "bottomStickyItems",
        "Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;",
        "attendedAppointmentDialog",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/advancedlabs/domain/models/MetaData;",
        "component2",
        "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
        "component5",
        "()Ljava/lang/String;",
        "component6",
        "()Ljava/util/Map;",
        "component7",
        "()Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;",
        "copy",
        "(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/advancedlabs/domain/models/MetaData;",
        "getMetadata",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "getNavigationBar",
        "Ljava/util/List;",
        "getSections",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
        "getAnalytics",
        "Ljava/lang/String;",
        "getInitiallySelectedSegmentId",
        "Ljava/util/Map;",
        "getBottomStickyItems",
        "Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;",
        "getAttendedAppointmentDialog",
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$Companion;


# instance fields
.field private final analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

.field private final attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

.field private final bottomStickyItems:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;",
            ">;"
        }
    .end annotation
.end field

.field private final initiallySelectedSegmentId:Ljava/lang/String;

.field private final metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

.field private final navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

.field private final sections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->Companion:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lt91/a;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lt91/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lt91/a;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Lt91/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v0, v3, v2

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7e

    const/16 v0, 0x7e

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;

    invoke-virtual {p9}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    :goto_0
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/MetaData;",
            "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;",
            ")V"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    .line 9
    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p8, p8, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 10
    invoke-direct/range {p2 .. p9}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;-><init>(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->copy(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/MetaData$$serializer;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/advancedlabs/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    return-object v0
.end method

.method public final component2()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/models/MetaData;",
            "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;",
            ")",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;"
        }
    .end annotation

    const-string v0, "navigationBar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;-><init>(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    return-object v0
.end method

.method public final getAttendedAppointmentDialog()Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    return-object v0
.end method

.method public final getBottomStickyItems()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/AdvanceLabsStickyModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    return-object v0
.end method

.method public final getInitiallySelectedSegmentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/advancedlabs/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final getSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/MetaData;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    invoke-static {v3, v2, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->metadata:Lcom/whoop/advancedlabs/domain/models/MetaData;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->sections:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->analytics:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->initiallySelectedSegmentId:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->bottomStickyItems:Ljava/util/Map;

    iget-object v6, p0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->attendedAppointmentDialog:Lcom/whoop/advancedlabs/domain/models/AttendedAppointmentDialogModel;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "AdvancedLabsResponse(metadata="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationBar="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sections="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", analytics="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", initiallySelectedSegmentId="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bottomStickyItems="

    const-string v1, ", attendedAppointmentDialog="

    invoke-static {v7, v4, v0, v5, v1}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
