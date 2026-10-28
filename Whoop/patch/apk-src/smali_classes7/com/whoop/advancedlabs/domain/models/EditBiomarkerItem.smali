.class public final Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 e2\u00020\u0001:\u0002feB\u00bf\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u001b\u0010\u001cB\u00db\u0001\u0008\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008\u001b\u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010#J\u0010\u0010+\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010#J\u0010\u00103\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010#J\u0012\u00104\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010#J\u0012\u00105\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010#J\u0012\u00106\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010#J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010&J\u0012\u00108\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010&J\u00ec\u0001\u0010;\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00072\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00022\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\u0008\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008;\u0010<J\u0010\u0010=\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008=\u0010#J\u0010\u0010>\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\u0008>\u0010?J\u001a\u0010A\u001a\u00020\u000b2\u0008\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008A\u0010BJ\'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001\u00a2\u0006\u0004\u0008I\u0010JR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010L\u001a\u0004\u0008M\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010L\u001a\u0004\u0008N\u0010#R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010O\u001a\u0004\u0008P\u0010&R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010Q\u001a\u0004\u0008R\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010L\u001a\u0004\u0008S\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010L\u001a\u0004\u0008T\u0010#R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010U\u001a\u0004\u0008V\u0010,R\u0017\u0010\r\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010W\u001a\u0004\u0008X\u0010.R\u0017\u0010\u000e\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010W\u001a\u0004\u0008Y\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010Z\u001a\u0004\u0008[\u00101R\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010L\u001a\u0004\u0008\\\u0010#R\u0017\u0010\u0012\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010L\u001a\u0004\u0008]\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010L\u001a\u0004\u0008^\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010L\u001a\u0004\u0008_\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010L\u001a\u0004\u0008`\u0010#R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010O\u001a\u0004\u0008a\u0010&R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010b\u001a\u0004\u0008c\u00109R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010O\u001a\u0004\u0008d\u0010&\u00a8\u0006g"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
        "",
        "",
        "biomarkerName",
        "biomarkerId",
        "",
        "calculatedFromBiomarkers",
        "",
        "value",
        "valueText",
        "unit",
        "",
        "included",
        "minValue",
        "maxValue",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "infoCallout",
        "valueLabel",
        "unitLabel",
        "subtitle",
        "warning",
        "rightIcon",
        "dependentOnBiomarkers",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
        "dependentOnBiomarkersWarning",
        "Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;",
        "categoricalOptions",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Ljava/lang/Double;",
        "component5",
        "component6",
        "component7",
        "()Z",
        "component8",
        "()D",
        "component9",
        "component10",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
        "component18",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getBiomarkerName",
        "getBiomarkerId",
        "Ljava/util/List;",
        "getCalculatedFromBiomarkers",
        "Ljava/lang/Double;",
        "getValue",
        "getValueText",
        "getUnit",
        "Z",
        "getIncluded",
        "D",
        "getMinValue",
        "getMaxValue",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getInfoCallout",
        "getValueLabel",
        "getUnitLabel",
        "getSubtitle",
        "getWarning",
        "getRightIcon",
        "getDependentOnBiomarkers",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
        "getDependentOnBiomarkersWarning",
        "getCategoricalOptions",
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$Companion;


# instance fields
.field private final biomarkerId:Ljava/lang/String;

.field private final biomarkerName:Ljava/lang/String;

.field private final calculatedFromBiomarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final categoricalOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;",
            ">;"
        }
    .end annotation
.end field

.field private final dependentOnBiomarkers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

.field private final included:Z

.field private final infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final maxValue:D

.field private final minValue:D

.field private final rightIcon:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final unit:Ljava/lang/String;

.field private final unitLabel:Ljava/lang/String;

.field private final value:Ljava/lang/Double;

.field private final valueLabel:Ljava/lang/String;

.field private final valueText:Ljava/lang/String;

.field private final warning:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->Companion:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ltb0/a;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Ltb0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Ltb0/a;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Ltb0/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Ltb0/a;

    const/4 v8, 0x5

    invoke-direct {v7, v8}, Ltb0/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x12

    new-array v7, v7, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v7, v9

    const/4 v9, 0x1

    aput-object v1, v7, v9

    const/4 v9, 0x2

    aput-object v3, v7, v9

    aput-object v1, v7, v4

    aput-object v1, v7, v6

    aput-object v1, v7, v8

    const/4 v3, 0x6

    aput-object v1, v7, v3

    const/4 v3, 0x7

    aput-object v1, v7, v3

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v1, v7, v0

    const/16 v0, 0xa

    aput-object v1, v7, v0

    const/16 v0, 0xb

    aput-object v1, v7, v0

    const/16 v0, 0xc

    aput-object v1, v7, v0

    const/16 v0, 0xd

    aput-object v1, v7, v0

    const/16 v0, 0xe

    aput-object v1, v7, v0

    const/16 v0, 0xf

    aput-object v5, v7, v0

    const/16 v0, 0x10

    aput-object v1, v7, v0

    const/16 v0, 0x11

    aput-object v2, v7, v0

    sput-object v7, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x3ffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    iput-wide p9, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    iput-wide p11, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    iput-object p13, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZDD",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p13

    move-object/from16 v1, p14

    const-string v2, "biomarkerName"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "biomarkerId"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "valueLabel"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "unitLabel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    .line 10
    iput-wide p8, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    .line 11
    iput-wide p10, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    .line 12
    iput-object p12, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    .line 13
    iput-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    .line 14
    iput-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 15
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 16
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 17
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 18
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    move-object/from16 p1, p19

    .line 19
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    move-object/from16 p1, p20

    .line 20
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/CategoricalMapping$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/CategoricalMapping$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-wide v9, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    goto :goto_7

    :cond_7
    move-wide/from16 v9, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-wide v11, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    goto :goto_8

    :cond_8
    move-wide/from16 v11, p10

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-object v13, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    goto :goto_9

    :cond_9
    move-object/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-object v14, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-object v15, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p14

    :goto_b
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-object v2, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v2, p15

    :goto_c
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p16

    :goto_d
    move-object/from16 p3, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p17

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p18

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p19

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    if-eqz v16, :cond_11

    move-object/from16 p5, v1

    iget-object v1, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    move-object/from16 p20, p5

    move-object/from16 p21, v1

    :goto_11
    move-object/from16 p16, p2

    move-object/from16 p17, p3

    move-object/from16 p19, p4

    move-object/from16 p18, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move-wide/from16 p9, v9

    move-wide/from16 p11, v11

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_12

    :cond_11
    move-object/from16 p21, p20

    move-object/from16 p20, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p21}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-boolean v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v2, 0x7

    iget-wide v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/16 v2, 0x8

    iget-wide v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    sget-object v2, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/16 v4, 0x9

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xf

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    const/16 v3, 0x10

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x11

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    return v0
.end method

.method public final component8()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    return-wide v0
.end method

.method public final component9()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZDD",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;",
            ">;)",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;"
        }
    .end annotation

    const-string v0, "biomarkerName"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "biomarkerId"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "valueLabel"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitLabel"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    invoke-direct/range {v1 .. v21}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ZDDLcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    iget-boolean v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    iget-wide v5, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    iget-wide v5, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getBiomarkerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getBiomarkerName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCalculatedFromBiomarkers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    return-object v0
.end method

.method public final getCategoricalOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/advancedlabs/domain/models/CategoricalMapping;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    return-object v0
.end method

.method public final getDependentOnBiomarkers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    return-object v0
.end method

.method public final getDependentOnBiomarkersWarning()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    return-object v0
.end method

.method public final getIncluded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    return v0
.end method

.method public final getInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getMaxValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    return-wide v0
.end method

.method public final getMinValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    return-wide v0
.end method

.method public final getRightIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnit()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnitLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    return-object v0
.end method

.method public final getValueLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getValueText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    return-object v0
.end method

.method public final getWarning()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerName:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->biomarkerId:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->calculatedFromBiomarkers:Ljava/util/List;

    iget-object v4, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->value:Ljava/lang/Double;

    iget-object v5, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueText:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unit:Ljava/lang/String;

    iget-boolean v7, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->included:Z

    iget-wide v8, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->minValue:D

    iget-wide v10, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->maxValue:D

    iget-object v12, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v13, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->valueLabel:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->unitLabel:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->subtitle:Ljava/lang/String;

    move-object/from16 v16, v14

    iget-object v14, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->warning:Ljava/lang/String;

    move-object/from16 v17, v14

    iget-object v14, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->rightIcon:Ljava/lang/String;

    move-object/from16 v18, v14

    iget-object v14, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkers:Ljava/util/List;

    move-object/from16 v19, v14

    iget-object v14, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->dependentOnBiomarkersWarning:Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;

    move-object/from16 v20, v14

    iget-object v14, v0, Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;->categoricalOptions:Ljava/util/List;

    const-string v0, ", biomarkerId="

    move-object/from16 v21, v14

    const-string v14, ", calculatedFromBiomarkers="

    move-object/from16 v22, v15

    const-string v15, "EditBiomarkerItem(biomarkerName="

    invoke-static {v15, v1, v0, v2, v14}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", valueText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unit="

    const-string v2, ", included="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", minValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", maxValue="

    const-string v2, ", infoCallout="

    invoke-static {v0, v1, v10, v11, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", valueLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unitLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle="

    const-string v2, ", warning="

    move-object/from16 v3, v16

    move-object/from16 v4, v22

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", rightIcon="

    const-string v2, ", dependentOnBiomarkers="

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dependentOnBiomarkersWarning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", categoricalOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v21

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
