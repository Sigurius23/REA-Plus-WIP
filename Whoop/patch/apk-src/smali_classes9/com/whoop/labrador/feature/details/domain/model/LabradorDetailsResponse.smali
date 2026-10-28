.class public final Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008/\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00db\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\t\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\r0\tH\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0012H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u00dd\u0001\u0010I\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\t2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00032\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00032\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00c6\u0001J\u0014\u0010J\u001a\u00020K2\u0008\u0010L\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010M\u001a\u00020NH\u00d6\u0081\u0004J\n\u0010O\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001fR\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001fR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u001fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010\u001fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;",
        "",
        "id",
        "",
        "pageTitle",
        "navIcon",
        "reportTimestamp",
        "trailingTimestamp",
        "samples",
        "",
        "",
        "arrhythmiaDetermination",
        "arrhythmiaReadings",
        "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;",
        "arrhythmiaInsightInformation",
        "averageHeartRate",
        "averageHeartRateLabel",
        "shareResultTile",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "disclaimerLabel",
        "addSymptomsAndNotesTile",
        "readingSymptomsAndNotesTile",
        "Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;",
        "clearReadingIcon",
        "clearReadingLabel",
        "pdfPresignedUrl",
        "protectYourPrivacy",
        "Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;)V",
        "getId",
        "()Ljava/lang/String;",
        "getPageTitle",
        "getNavIcon",
        "getReportTimestamp",
        "getTrailingTimestamp",
        "getSamples",
        "()Ljava/util/List;",
        "getArrhythmiaDetermination",
        "getArrhythmiaReadings",
        "getArrhythmiaInsightInformation",
        "getAverageHeartRate",
        "getAverageHeartRateLabel",
        "getShareResultTile",
        "()Lcom/whoop/design/models/items/CtaTileModel;",
        "getDisclaimerLabel",
        "getAddSymptomsAndNotesTile",
        "getReadingSymptomsAndNotesTile",
        "()Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;",
        "getClearReadingIcon",
        "getClearReadingLabel",
        "getPdfPresignedUrl",
        "getProtectYourPrivacy",
        "()Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "labrador_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final addSymptomsAndNotesTile:Lcom/whoop/design/models/items/CtaTileModel;

.field private final arrhythmiaDetermination:Ljava/lang/String;

.field private final arrhythmiaInsightInformation:Ljava/lang/String;

.field private final arrhythmiaReadings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;",
            ">;"
        }
    .end annotation
.end field

.field private final averageHeartRate:Ljava/lang/String;

.field private final averageHeartRateLabel:Ljava/lang/String;

.field private final clearReadingIcon:Ljava/lang/String;

.field private final clearReadingLabel:Ljava/lang/String;

.field private final disclaimerLabel:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final navIcon:Ljava/lang/String;

.field private final pageTitle:Ljava/lang/String;

.field private final pdfPresignedUrl:Ljava/lang/String;

.field private final protectYourPrivacy:Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

.field private final readingSymptomsAndNotesTile:Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

.field private final reportTimestamp:Ljava/lang/String;

.field private final samples:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private final shareResultTile:Lcom/whoop/design/models/items/CtaTileModel;

.field private final trailingTimestamp:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 22

    .line 1
    const v20, 0x7ffff

    const/16 v21, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v21}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CtaTileModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CtaTileModel;",
            "Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p13

    move-object/from16 v12, p16

    move-object/from16 v13, p17

    move-object/from16 v14, p18

    const-string v15, "id"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "pageTitle"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "navIcon"

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "reportTimestamp"

    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "trailingTimestamp"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "samples"

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "arrhythmiaReadings"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "arrhythmiaInsightInformation"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "averageHeartRateLabel"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "shareResultTile"

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "disclaimerLabel"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "clearReadingIcon"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "clearReadingLabel"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "pdfPresignedUrl"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->id:Ljava/lang/String;

    .line 4
    iput-object v2, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pageTitle:Ljava/lang/String;

    .line 5
    iput-object v3, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->navIcon:Ljava/lang/String;

    .line 6
    iput-object v4, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->reportTimestamp:Ljava/lang/String;

    .line 7
    iput-object v5, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->trailingTimestamp:Ljava/lang/String;

    .line 8
    iput-object v6, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->samples:Ljava/util/List;

    move-object/from16 v1, p7

    .line 9
    iput-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaDetermination:Ljava/lang/String;

    .line 10
    iput-object v7, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaReadings:Ljava/util/List;

    .line 11
    iput-object v8, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaInsightInformation:Ljava/lang/String;

    move-object/from16 v1, p10

    .line 12
    iput-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRate:Ljava/lang/String;

    .line 13
    iput-object v9, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRateLabel:Ljava/lang/String;

    .line 14
    iput-object v10, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->shareResultTile:Lcom/whoop/design/models/items/CtaTileModel;

    .line 15
    iput-object v11, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->disclaimerLabel:Ljava/lang/String;

    move-object/from16 v1, p14

    .line 16
    iput-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->addSymptomsAndNotesTile:Lcom/whoop/design/models/items/CtaTileModel;

    move-object/from16 v1, p15

    .line 17
    iput-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->readingSymptomsAndNotesTile:Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    .line 18
    iput-object v12, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingIcon:Ljava/lang/String;

    .line 19
    iput-object v13, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingLabel:Ljava/lang/String;

    .line 20
    iput-object v14, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pdfPresignedUrl:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 21
    iput-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->protectYourPrivacy:Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 34

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x1

    .line 22
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v2

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move-object v6, v2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    sget-object v8, Lm83/y;->w:Lm83/y;

    if-eqz v7, :cond_5

    move-object v7, v8

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    move-object v11, v2

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    move-object v13, v2

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    .line 23
    new-instance v15, Lcom/whoop/design/models/items/CtaTileModel;

    const v32, 0xffff

    const/16 v33, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v15 .. v33}, Lcom/whoop/design/models/items/CtaTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    move-object v14, v2

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v10, v0, 0x2000

    if-eqz v10, :cond_d

    const/4 v10, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v10, p14

    :goto_d
    move-object/from16 p21, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v1, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    move-object/from16 v16, v2

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    move-object/from16 v17, v2

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    goto :goto_11

    :cond_11
    move-object/from16 v2, p18

    :goto_11
    const/high16 v18, 0x40000

    and-int v0, v0, v18

    if-eqz v0, :cond_12

    const/16 p20, 0x0

    :goto_12
    move-object/from16 p1, p0

    move-object/from16 p2, p21

    move-object/from16 p16, v1

    move-object/from16 p19, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p9, v8

    move-object/from16 p8, v9

    move-object/from16 p15, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p14, v14

    move-object/from16 p13, v15

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    goto :goto_12

    .line 24
    :goto_13
    invoke-direct/range {p1 .. p20}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;ILjava/lang/Object;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pageTitle:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->navIcon:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->reportTimestamp:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->trailingTimestamp:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->samples:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaDetermination:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaReadings:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaInsightInformation:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRate:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRateLabel:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->shareResultTile:Lcom/whoop/design/models/items/CtaTileModel;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->disclaimerLabel:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->addSymptomsAndNotesTile:Lcom/whoop/design/models/items/CtaTileModel;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->readingSymptomsAndNotesTile:Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingIcon:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingLabel:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pdfPresignedUrl:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->protectYourPrivacy:Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRate:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->shareResultTile:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->disclaimerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->addSymptomsAndNotesTile:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final component15()Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->readingSymptomsAndNotesTile:Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pdfPresignedUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->protectYourPrivacy:Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->navIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->reportTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->trailingTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->samples:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaDetermination:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaReadings:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaInsightInformation:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CtaTileModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CtaTileModel;",
            "Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;",
            ")",
            "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageTitle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navIcon"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportTimestamp"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingTimestamp"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samples"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arrhythmiaReadings"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arrhythmiaInsightInformation"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "averageHeartRateLabel"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareResultTile"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimerLabel"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clearReadingIcon"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clearReadingLabel"

    move-object/from16 v8, p17

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pdfPresignedUrl"

    move-object/from16 v11, p18

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v20, p19

    move-object/from16 v18, v8

    move-object/from16 v19, v11

    move-object/from16 v8, p7

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v20}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;

    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pageTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pageTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->navIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->navIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->reportTimestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->reportTimestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->trailingTimestamp:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->trailingTimestamp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->samples:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->samples:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaDetermination:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaDetermination:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaReadings:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaReadings:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaInsightInformation:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaInsightInformation:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRateLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRateLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->shareResultTile:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->shareResultTile:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->disclaimerLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->disclaimerLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->addSymptomsAndNotesTile:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->addSymptomsAndNotesTile:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->readingSymptomsAndNotesTile:Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->readingSymptomsAndNotesTile:Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pdfPresignedUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pdfPresignedUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->protectYourPrivacy:Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    iget-object p1, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->protectYourPrivacy:Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getAddSymptomsAndNotesTile()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->addSymptomsAndNotesTile:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final getArrhythmiaDetermination()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaDetermination:Ljava/lang/String;

    return-object v0
.end method

.method public final getArrhythmiaInsightInformation()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaInsightInformation:Ljava/lang/String;

    return-object v0
.end method

.method public final getArrhythmiaReadings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/labrador/feature/details/domain/model/ShepherdReading;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaReadings:Ljava/util/List;

    return-object v0
.end method

.method public final getAverageHeartRate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRate:Ljava/lang/String;

    return-object v0
.end method

.method public final getAverageHeartRateLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getClearReadingIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getClearReadingLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisclaimerLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->disclaimerLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->navIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getPageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getPdfPresignedUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pdfPresignedUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getProtectYourPrivacy()Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->protectYourPrivacy:Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    return-object v0
.end method

.method public final getReadingSymptomsAndNotesTile()Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->readingSymptomsAndNotesTile:Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    return-object v0
.end method

.method public final getReportTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->reportTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public final getSamples()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->samples:Ljava/util/List;

    return-object v0
.end method

.method public final getShareResultTile()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->shareResultTile:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final getTrailingTimestamp()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->trailingTimestamp:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pageTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->navIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->reportTimestamp:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->trailingTimestamp:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->samples:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaDetermination:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaReadings:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaInsightInformation:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRate:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRateLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->shareResultTile:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/CtaTileModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->disclaimerLabel:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->addSymptomsAndNotesTile:Lcom/whoop/design/models/items/CtaTileModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CtaTileModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->readingSymptomsAndNotesTile:Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pdfPresignedUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->protectYourPrivacy:Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pageTitle:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->navIcon:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->reportTimestamp:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->trailingTimestamp:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->samples:Ljava/util/List;

    iget-object v7, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaDetermination:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaReadings:Ljava/util/List;

    iget-object v9, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->arrhythmiaInsightInformation:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRate:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->averageHeartRateLabel:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->shareResultTile:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v13, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->disclaimerLabel:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->addSymptomsAndNotesTile:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->readingSymptomsAndNotesTile:Lcom/whoop/labrador/feature/details/domain/model/LabradorReadingNotesSymptomsModel;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingIcon:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->clearReadingLabel:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->pdfPresignedUrl:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsResponse;->protectYourPrivacy:Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;

    const-string v0, ", pageTitle="

    move-object/from16 v20, v15

    const-string v15, ", navIcon="

    move-object/from16 v21, v14

    const-string v14, "LabradorDetailsResponse(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reportTimestamp="

    const-string v2, ", trailingTimestamp="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", samples="

    const-string v2, ", arrhythmiaDetermination="

    invoke-static {v5, v1, v2, v0, v6}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", arrhythmiaReadings="

    const-string v2, ", arrhythmiaInsightInformation="

    invoke-static {v7, v1, v2, v0, v8}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", averageHeartRate="

    const-string v2, ", averageHeartRateLabel="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shareResultTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disclaimerLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", addSymptomsAndNotesTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", readingSymptomsAndNotesTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clearReadingIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", clearReadingLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pdfPresignedUrl="

    const-string v2, ", protectYourPrivacy="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
