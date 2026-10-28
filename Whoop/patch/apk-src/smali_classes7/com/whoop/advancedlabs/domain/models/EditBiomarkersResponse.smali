.class public final Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 U2\u00020\u0001:\u0002VUB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u00a3\u0001\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0010\u0010)\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001eJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\u001eJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u009e\u0001\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010\u001eJ\u0010\u00103\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00107\u001a\u0002062\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00087\u00108J\'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001\u00a2\u0006\u0004\u0008?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010B\u001a\u0004\u0008C\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010B\u001a\u0004\u0008D\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010B\u001a\u0004\u0008E\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010F\u001a\u0004\u0008G\u0010\"R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010F\u001a\u0004\u0008H\u0010\"R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010I\u001a\u0004\u0008J\u0010%R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010K\u001a\u0004\u0008L\u0010\'R\u0017\u0010\u000e\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010K\u001a\u0004\u0008M\u0010\'R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010N\u001a\u0004\u0008O\u0010*R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010N\u001a\u0004\u0008P\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010B\u001a\u0004\u0008Q\u0010\u001eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010B\u001a\u0004\u0008R\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010S\u001a\u0004\u0008T\u0010/\u00a8\u0006W"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;",
        "",
        "",
        "navigationTitle",
        "title",
        "searchPlaceholder",
        "Lcom/whoop/design/models/items/DividerModel;",
        "includedItemsHeader",
        "notIncludedItemsHeader",
        "",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
        "items",
        "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
        "button",
        "bottomSheetButton",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
        "exitDialog",
        "deleteDialog",
        "calculationEducationTitle",
        "calculationEducationDescription",
        "Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;",
        "testDeletedModal",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/DividerModel;",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
        "component8",
        "component9",
        "()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
        "component10",
        "component11",
        "component12",
        "component13",
        "()Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;",
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
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getNavigationTitle",
        "getTitle",
        "getSearchPlaceholder",
        "Lcom/whoop/design/models/items/DividerModel;",
        "getIncludedItemsHeader",
        "getNotIncludedItemsHeader",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
        "getButton",
        "getBottomSheetButton",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
        "getExitDialog",
        "getDeleteDialog",
        "getCalculationEducationTitle",
        "getCalculationEducationDescription",
        "Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;",
        "getTestDeletedModal",
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$Companion;


# instance fields
.field private final bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

.field private final button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

.field private final calculationEducationDescription:Ljava/lang/String;

.field private final calculationEducationTitle:Ljava/lang/String;

.field private final deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

.field private final exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

.field private final includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationTitle:Ljava/lang/String;

.field private final notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

.field private final searchPlaceholder:Ljava/lang/String;

.field private final testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->Companion:Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ltb0/a;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Ltb0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xd

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v1, v3, v5

    const/4 v5, 0x4

    aput-object v1, v3, v5

    const/4 v5, 0x5

    aput-object v2, v3, v5

    aput-object v1, v3, v4

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

    sput-object v3, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x1fff

    const/16 v1, 0x1fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$$serializer;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    iput-object p10, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    iput-object p11, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    iput-object p12, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/DividerModel;",
            "Lcom/whoop/design/models/items/DividerModel;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
            "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;",
            ")V"
        }
    .end annotation

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchPlaceholder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "includedItemsHeader"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notIncludedItemsHeader"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomSheetButton"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exitDialog"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteDialog"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    .line 12
    iput-object p10, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    .line 13
    iput-object p11, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/items/DividerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DividerModel$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    const/4 v2, 0x6

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    const/16 v2, 0x8

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

    const/16 v2, 0xa

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    const/16 v1, 0xc

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/DividerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/DividerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/DividerModel;",
            "Lcom/whoop/design/models/items/DividerModel;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
            "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;",
            ")",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;"
        }
    .end annotation

    const-string v0, "navigationTitle"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchPlaceholder"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "includedItemsHeader"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notIncludedItemsHeader"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomSheetButton"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exitDialog"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deleteDialog"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getBottomSheetButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    return-object v0
.end method

.method public final getButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    return-object v0
.end method

.method public final getCalculationEducationDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getCalculationEducationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeleteDialog()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    return-object v0
.end method

.method public final getExitDialog()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    return-object v0
.end method

.method public final getIncludedItemsHeader()Lcom/whoop/design/models/items/DividerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotIncludedItemsHeader()Lcom/whoop/design/models/items/DividerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    return-object v0
.end method

.method public final getSearchPlaceholder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    return-object v0
.end method

.method public final getTestDeletedModal()Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/DividerModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DividerModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->navigationTitle:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->title:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->searchPlaceholder:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->includedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    iget-object v5, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->notIncludedItemsHeader:Lcom/whoop/design/models/items/DividerModel;

    iget-object v6, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->items:Ljava/util/List;

    iget-object v7, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    iget-object v8, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->bottomSheetButton:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    iget-object v9, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->exitDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    iget-object v10, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->deleteDialog:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    iget-object v11, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationTitle:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->calculationEducationDescription:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;->testDeletedModal:Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;

    const-string v14, ", title="

    const-string v15, ", searchPlaceholder="

    const-string v0, "EditBiomarkersResponse(navigationTitle="

    invoke-static {v0, v1, v14, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", includedItemsHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", notIncludedItemsHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", button="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomSheetButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exitDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deleteDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", calculationEducationTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", calculationEducationDescription="

    const-string v2, ", testDeletedModal="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
