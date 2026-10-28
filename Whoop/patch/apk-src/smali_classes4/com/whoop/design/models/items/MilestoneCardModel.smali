.class public final Lcom/whoop/design/models/items/MilestoneCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/MilestoneCardModel$$serializer;,
        Lcom/whoop/design/models/items/MilestoneCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u0000 f2\u00020\u0001:\u0002gfB\u00a1\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cB\u00b9\u0001\u0008\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008\u001b\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010%J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010+J\u0010\u0010-\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010%J\u0012\u00106\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u00c8\u0001\u0010:\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001\u00a2\u0006\u0004\u0008:\u0010;J\u0010\u0010<\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008<\u0010%J\u0010\u0010=\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008=\u0010>J\u001a\u0010A\u001a\u00020\u000e2\u0008\u0010@\u001a\u0004\u0018\u00010?H\u00d6\u0003\u00a2\u0006\u0004\u0008A\u0010BJ\'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001\u00a2\u0006\u0004\u0008I\u0010JR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010L\u001a\u0004\u0008M\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010L\u001a\u0004\u0008N\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010O\u001a\u0004\u0008P\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010O\u001a\u0004\u0008Q\u0010%R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010L\u001a\u0004\u0008R\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010S\u0012\u0004\u0008U\u0010V\u001a\u0004\u0008T\u0010)R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010W\u001a\u0004\u0008X\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010W\u001a\u0004\u0008Y\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010Z\u001a\u0004\u0008\u000f\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010O\u001a\u0004\u0008[\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010O\u001a\u0004\u0008\\\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010]\u001a\u0004\u0008^\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010_\u001a\u0004\u0008`\u00104R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010O\u001a\u0004\u0008a\u0010%R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010b\u001a\u0004\u0008c\u00107R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010d\u001a\u0004\u0008e\u00109\u00a8\u0006h"
    }
    d2 = {
        "Lcom/whoop/design/models/items/MilestoneCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "",
        "id",
        "imageUrl",
        "cta",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "",
        "filledCount",
        "totalCount",
        "",
        "isUnlocked",
        "color",
        "type",
        "Lcom/whoop/design/models/items/DialogInfo;",
        "dialogInfo",
        "Lcom/whoop/design/models/items/TagModel;",
        "navigationTag",
        "progressStyle",
        "Lcom/whoop/design/models/items/MilestoneAnalytics;",
        "analytics",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/navigation/e;",
        "component7",
        "()Ljava/lang/Integer;",
        "component8",
        "component9",
        "()Z",
        "component10",
        "component11",
        "component12",
        "()Lcom/whoop/design/models/items/DialogInfo;",
        "component13",
        "()Lcom/whoop/design/models/items/TagModel;",
        "component14",
        "component15",
        "()Lcom/whoop/design/models/items/MilestoneAnalytics;",
        "component16",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/MilestoneCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/MilestoneCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getSubtitle",
        "Ljava/lang/String;",
        "getId",
        "getImageUrl",
        "getCta",
        "Lcom/whoop/navigation/e;",
        "getNavigation",
        "getNavigation$annotations",
        "()V",
        "Ljava/lang/Integer;",
        "getFilledCount",
        "getTotalCount",
        "Z",
        "getColor",
        "getType",
        "Lcom/whoop/design/models/items/DialogInfo;",
        "getDialogInfo",
        "Lcom/whoop/design/models/items/TagModel;",
        "getNavigationTag",
        "getProgressStyle",
        "Lcom/whoop/design/models/items/MilestoneAnalytics;",
        "getAnalytics",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
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

.field public static final Companion:Lcom/whoop/design/models/items/MilestoneCardModel$Companion;


# instance fields
.field private final analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

.field private final color:Ljava/lang/String;

.field private final cta:Lcom/whoop/design/util/TextResource;

.field private final dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

.field private final filledCount:Ljava/lang/Integer;

.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final isUnlocked:Z

.field private final navigation:Lcom/whoop/navigation/e;

.field private final navigationTag:Lcom/whoop/design/models/items/TagModel;

.field private final progressStyle:Ljava/lang/String;

.field private final subtitle:Lcom/whoop/design/util/TextResource;

.field private final title:Lcom/whoop/design/util/TextResource;

.field private final totalCount:Ljava/lang/Integer;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/MilestoneCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/MilestoneCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/MilestoneCardModel;->Companion:Lcom/whoop/design/models/items/MilestoneCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/MilestoneCardModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/g;

    const/16 v4, 0x13

    invoke-direct {v3, v4}, Lw91/g;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0x10

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

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    const/16 v0, 0xd

    aput-object v1, v3, v0

    const/16 v0, 0xe

    aput-object v1, v3, v0

    const/16 v0, 0xf

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/MilestoneCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x7fff

    const/16 v1, 0x7fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/MilestoneCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MilestoneCardModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/MilestoneCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    iput-object p8, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    iput-object p9, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    iput-boolean p10, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    iput-object p11, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    const p2, 0x8000

    and-int/2addr p1, p2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void

    :cond_1
    move-object/from16 p1, p17

    goto :goto_0
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    .line 11
    iput-boolean p9, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    .line 16
    iput-object p14, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    const v0, 0x8000

    and-int v0, p17, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object/from16 v17, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    goto :goto_1

    :cond_0
    move-object/from16 v17, p16

    goto :goto_0

    .line 19
    :goto_1
    invoke-direct/range {v1 .. v17}, Lcom/whoop/design/models/items/MilestoneCardModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/MilestoneCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/MilestoneCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/MilestoneCardModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/design/models/items/MilestoneCardModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lcom/whoop/design/models/items/MilestoneCardModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/MilestoneCardModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getNavigation$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/MilestoneCardModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/MilestoneCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

    const/4 v4, 0x2

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v4}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v3, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-boolean v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0x9

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xa

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/DialogInfo$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DialogInfo$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    const/16 v3, 0xb

    invoke-interface {p1, p2, v3, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    const/16 v3, 0xc

    invoke-interface {p1, p2, v3, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xd

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/MilestoneAnalytics$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MilestoneAnalytics$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    const/16 v2, 0xe

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/items/DialogInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Lcom/whoop/design/models/items/MilestoneAnalytics;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    return-object v0
.end method

.method public final component16()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    return v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/MilestoneCardModel;
    .locals 18

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/MilestoneCardModel;

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/whoop/design/models/items/MilestoneCardModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DialogInfo;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/design/models/items/MilestoneAnalytics;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/MilestoneCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/MilestoneCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    iget-object v3, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getAnalytics()Lcom/whoop/design/models/items/MilestoneAnalytics;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    return-object v0
.end method

.method public final getColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    return-object v0
.end method

.method public final getCta()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDialogInfo()Lcom/whoop/design/models/items/DialogInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    return-object v0
.end method

.method public final getFilledCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getNavigation()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getNavigationTag()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getProgressStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTotalCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DialogInfo;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/design/models/items/MilestoneAnalytics;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    return v0
.end method

.method public final isUnlocked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->subtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->id:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->imageUrl:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->cta:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigation:Lcom/whoop/navigation/e;

    iget-object v7, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->filledCount:Ljava/lang/Integer;

    iget-object v8, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->totalCount:Ljava/lang/Integer;

    iget-boolean v9, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->isUnlocked:Z

    iget-object v10, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->color:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->type:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->dialogInfo:Lcom/whoop/design/models/items/DialogInfo;

    iget-object v13, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->navigationTag:Lcom/whoop/design/models/items/TagModel;

    iget-object v14, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->progressStyle:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->analytics:Lcom/whoop/design/models/items/MilestoneAnalytics;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/MilestoneCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    const-string v0, ", subtitle="

    move-object/from16 v17, v15

    const-string v15, ", id="

    move-object/from16 v18, v14

    const-string v14, "MilestoneCardModel(title="

    invoke-static {v14, v1, v0, v2, v15}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl="

    const-string v2, ", cta="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", navigation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", filledCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", totalCount="

    const-string v2, ", isUnlocked="

    invoke-static {v0, v7, v1, v8, v2}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v1, ", color="

    const-string v2, ", type="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dialogInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", navigationTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progressStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", analytics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interaction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
