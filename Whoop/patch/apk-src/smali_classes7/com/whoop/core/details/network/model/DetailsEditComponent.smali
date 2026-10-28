.class public final Lcom/whoop/core/details/network/model/DetailsEditComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;,
        Lcom/whoop/core/details/network/model/DetailsEditComponent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 K2\u00020\u0001:\u0002LKBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010 J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001aJ\u0088\u0001\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101J\'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001\u00a2\u0006\u0004\u00088\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010;\u001a\u0004\u0008<\u0010\u001aR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008>\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010;\u001a\u0004\u0008?\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010;\u001a\u0004\u0008@\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008B\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010C\u001a\u0004\u0008D\u0010\"R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008E\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010;\u001a\u0004\u0008F\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010G\u001a\u0004\u0008H\u0010&R\u0017\u0010\u0010\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010A\u001a\u0004\u0008I\u0010 R\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010;\u001a\u0004\u0008J\u0010\u001a\u00a8\u0006M"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/DetailsEditComponent;",
        "",
        "",
        "activityTypeInternalName",
        "",
        "Lcom/whoop/core/details/network/model/StrapLocation;",
        "allowedStrapLocations",
        "callToActionDisplay",
        "editActivityTitleDisplay",
        "Lcom/whoop/core/details/network/model/TimeSelectorSection;",
        "endTimeSelector",
        "location",
        "locationDividerTitleDisplay",
        "locationPromptDisplay",
        "Lcom/whoop/core/details/network/model/SingleScoreType;",
        "singleScoreType",
        "startTimeSelector",
        "timeDividerTitleDisplay",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/core/details/network/model/TimeSelectorSection;",
        "component6",
        "()Lcom/whoop/core/details/network/model/StrapLocation;",
        "component7",
        "component8",
        "component9",
        "()Lcom/whoop/core/details/network/model/SingleScoreType;",
        "component10",
        "component11",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;)Lcom/whoop/core/details/network/model/DetailsEditComponent;",
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
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/DetailsEditComponent;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getActivityTypeInternalName",
        "Ljava/util/List;",
        "getAllowedStrapLocations",
        "getCallToActionDisplay",
        "getEditActivityTitleDisplay",
        "Lcom/whoop/core/details/network/model/TimeSelectorSection;",
        "getEndTimeSelector",
        "Lcom/whoop/core/details/network/model/StrapLocation;",
        "getLocation",
        "getLocationDividerTitleDisplay",
        "getLocationPromptDisplay",
        "Lcom/whoop/core/details/network/model/SingleScoreType;",
        "getSingleScoreType",
        "getStartTimeSelector",
        "getTimeDividerTitleDisplay",
        "Companion",
        "$serializer",
        "core-details_release"
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

.field public static final Companion:Lcom/whoop/core/details/network/model/DetailsEditComponent$Companion;


# instance fields
.field private final activityTypeInternalName:Ljava/lang/String;

.field private final allowedStrapLocations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/StrapLocation;",
            ">;"
        }
    .end annotation
.end field

.field private final callToActionDisplay:Ljava/lang/String;

.field private final editActivityTitleDisplay:Ljava/lang/String;

.field private final endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

.field private final location:Lcom/whoop/core/details/network/model/StrapLocation;

.field private final locationDividerTitleDisplay:Ljava/lang/String;

.field private final locationPromptDisplay:Ljava/lang/String;

.field private final singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

.field private final startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

.field private final timeDividerTitleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/core/details/network/model/DetailsEditComponent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/DetailsEditComponent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->Companion:Lcom/whoop/core/details/network/model/DetailsEditComponent$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcom/whoop/core/details/network/model/a;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lcom/whoop/core/details/network/model/a;

    const/4 v6, 0x7

    invoke-direct {v5, v6}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xb

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    const/4 v7, 0x1

    aput-object v3, v5, v7

    const/4 v3, 0x2

    aput-object v1, v5, v3

    const/4 v3, 0x3

    aput-object v1, v5, v3

    const/4 v3, 0x4

    aput-object v1, v5, v3

    const/4 v3, 0x5

    aput-object v1, v5, v3

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    aput-object v2, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/core/details/network/model/DetailsEditComponent;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7fd

    const/16 v0, 0x7fd

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;

    invoke-virtual {p13}, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    :goto_0
    iput-object p4, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    iput-object p7, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    iput-object p8, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    iput-object p11, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    iput-object p12, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/StrapLocation;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/core/details/network/model/TimeSelectorSection;",
            "Lcom/whoop/core/details/network/model/StrapLocation;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/core/details/network/model/SingleScoreType;",
            "Lcom/whoop/core/details/network/model/TimeSelectorSection;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "activityTypeInternalName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedStrapLocations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callToActionDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editActivityTitleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTimeSelector"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationDividerTitleDisplay"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationPromptDisplay"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startTimeSelector"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeDividerTitleDisplay"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    .line 7
    iput-object p3, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    .line 10
    iput-object p6, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    .line 11
    iput-object p7, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    .line 13
    iput-object p9, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    .line 14
    iput-object p10, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    .line 15
    iput-object p11, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    and-int/lit8 v0, p12, 0x2

    if-eqz v0, :cond_0

    .line 16
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    .line 17
    invoke-direct/range {v0 .. v11}, Lcom/whoop/core/details/network/model/DetailsEditComponent;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/StrapLocation$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/StrapLocation$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/SingleScoreType;->Companion:Lcom/whoop/core/details/network/model/SingleScoreType$Companion;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/SingleScoreType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/DetailsEditComponent;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

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

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;)Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/DetailsEditComponent;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/core/details/network/model/TimeSelectorSection$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TimeSelectorSection$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/core/details/network/model/StrapLocation$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/StrapLocation$$serializer;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    const/4 v4, 0x5

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0x8

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x9

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xa

    iget-object p0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/core/details/network/model/TimeSelectorSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/StrapLocation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/core/details/network/model/TimeSelectorSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    return-object v0
.end method

.method public final component6()Lcom/whoop/core/details/network/model/StrapLocation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/core/details/network/model/SingleScoreType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;)Lcom/whoop/core/details/network/model/DetailsEditComponent;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/StrapLocation;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/core/details/network/model/TimeSelectorSection;",
            "Lcom/whoop/core/details/network/model/StrapLocation;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/core/details/network/model/SingleScoreType;",
            "Lcom/whoop/core/details/network/model/TimeSelectorSection;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/core/details/network/model/DetailsEditComponent;"
        }
    .end annotation

    const-string v0, "activityTypeInternalName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedStrapLocations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callToActionDisplay"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editActivityTitleDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTimeSelector"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationDividerTitleDisplay"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationPromptDisplay"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startTimeSelector"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeDividerTitleDisplay"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v12}, Lcom/whoop/core/details/network/model/DetailsEditComponent;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/TimeSelectorSection;Lcom/whoop/core/details/network/model/StrapLocation;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/core/details/network/model/SingleScoreType;Lcom/whoop/core/details/network/model/TimeSelectorSection;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getActivityTypeInternalName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    return-object v0
.end method

.method public final getAllowedStrapLocations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/StrapLocation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    return-object v0
.end method

.method public final getCallToActionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getEditActivityTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndTimeSelector()Lcom/whoop/core/details/network/model/TimeSelectorSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    return-object v0
.end method

.method public final getLocation()Lcom/whoop/core/details/network/model/StrapLocation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    return-object v0
.end method

.method public final getLocationDividerTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocationPromptDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSingleScoreType()Lcom/whoop/core/details/network/model/SingleScoreType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    return-object v0
.end method

.method public final getStartTimeSelector()Lcom/whoop/core/details/network/model/TimeSelectorSection;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    return-object v0
.end method

.method public final getTimeDividerTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/TimeSelectorSection;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/StrapLocation;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/TimeSelectorSection;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->activityTypeInternalName:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->allowedStrapLocations:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->callToActionDisplay:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->editActivityTitleDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->endTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->location:Lcom/whoop/core/details/network/model/StrapLocation;

    iget-object v6, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationDividerTitleDisplay:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->locationPromptDisplay:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->singleScoreType:Lcom/whoop/core/details/network/model/SingleScoreType;

    iget-object v9, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->startTimeSelector:Lcom/whoop/core/details/network/model/TimeSelectorSection;

    iget-object v10, p0, Lcom/whoop/core/details/network/model/DetailsEditComponent;->timeDividerTitleDisplay:Ljava/lang/String;

    const-string v11, ", allowedStrapLocations="

    const-string v12, ", callToActionDisplay="

    const-string v13, "DetailsEditComponent(activityTypeInternalName="

    invoke-static {v13, v0, v11, v12, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", editActivityTitleDisplay="

    const-string v11, ", endTimeSelector="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", locationDividerTitleDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", locationPromptDisplay="

    const-string v2, ", singleScoreType="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startTimeSelector="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeDividerTitleDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v10, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
