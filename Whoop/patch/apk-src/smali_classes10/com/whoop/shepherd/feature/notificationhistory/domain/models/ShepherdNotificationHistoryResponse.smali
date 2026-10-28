.class public final Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$$serializer;,
        Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008.\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002JIBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bs\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\"J\u0010\u0010%\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010.Jn\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010\"J\u0010\u00103\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00106\u001a\u00020\n2\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00086\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00108\u001a\u0004\u00089\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00108\u001a\u0004\u0008:\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00108\u001a\u0004\u0008;\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010<\u001a\u0004\u0008=\u0010&R\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010>\u001a\u0004\u0008?\u0010(R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010@\u001a\u0004\u0008A\u0010*R \u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010B\u0012\u0004\u0008D\u0010E\u001a\u0004\u0008C\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010F\u001a\u0004\u0008G\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010F\u001a\u0004\u0008H\u0010.\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
        "",
        "",
        "icon",
        "pageTitle",
        "body",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;",
        "pageHeader",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "settingsCta",
        "",
        "detectionOn",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;",
        "shepherdHistory",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;",
        "clearHistoryDialog",
        "clearRecordDialog",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$shepherd_release",
        "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;",
        "component5",
        "()Lcom/whoop/design/models/items/CtaTileModel;",
        "component6",
        "()Z",
        "component7",
        "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;",
        "component8",
        "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getIcon",
        "getPageTitle",
        "getBody",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;",
        "getPageHeader",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "getSettingsCta",
        "Z",
        "getDetectionOn",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;",
        "getShepherdHistory",
        "getShepherdHistory$annotations",
        "()V",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;",
        "getClearHistoryDialog",
        "getClearRecordDialog",
        "Companion",
        "$serializer",
        "shepherd_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$Companion;


# instance fields
.field private final body:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "body"
    .end annotation
.end field

.field private final clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "clear_history_dialog"
    .end annotation
.end field

.field private final clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "clear_record_dialog"
    .end annotation
.end field

.field private final detectionOn:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "detection_on"
    .end annotation
.end field

.field private final icon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon"
    .end annotation
.end field

.field private final pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "page_header"
    .end annotation
.end field

.field private final pageTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "page_title"
    .end annotation
.end field

.field private final settingsCta:Lcom/whoop/design/models/items/CtaTileModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "settings_cta"
    .end annotation
.end field

.field private final shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "afib_history_box"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->Companion:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    and-int/lit16 v2, v1, 0x1ef

    const/16 v3, 0x1ef

    if-eq v3, v2, :cond_0

    .line 1
    sget-object v2, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$$serializer;

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v2, p2

    iput-object v2, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    move-object/from16 v2, p3

    iput-object v2, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    move-object/from16 v2, p4

    iput-object v2, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    move-object/from16 v2, p5

    iput-object v2, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    and-int/lit8 v1, v1, 0x10

    if-nez v1, :cond_1

    .line 2
    new-instance v2, Lcom/whoop/design/models/items/CtaTileModel;

    const v19, 0xffff

    const/16 v20, 0x0

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

    invoke-direct/range {v2 .. v20}, Lcom/whoop/design/models/items/CtaTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object v2, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    :goto_0
    move/from16 v1, p7

    goto :goto_1

    :cond_1
    move-object/from16 v1, p6

    iput-object v1, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    goto :goto_0

    :goto_1
    iput-boolean v1, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    move-object/from16 v1, p8

    iput-object v1, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-object/from16 v1, p9

    iput-object v1, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    move-object/from16 v1, p10

    iput-object v1, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageHeader"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsCta"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shepherdHistory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    .line 9
    iput-object p5, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    .line 10
    iput-boolean p6, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    .line 11
    iput-object p7, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    .line 12
    iput-object p8, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    .line 13
    iput-object p9, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_0

    .line 14
    new-instance v1, Lcom/whoop/design/models/items/CtaTileModel;

    const v18, 0xffff

    const/16 v19, 0x0

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

    invoke-direct/range {v1 .. v19}, Lcom/whoop/design/models/items/CtaTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v1

    :goto_0
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    goto :goto_1

    :cond_0
    move-object/from16 v7, p5

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {v2 .. v11}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;ILjava/lang/Object;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-boolean p6, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getShepherdHistory$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "afib_history_box"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$shepherd_release(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;Lzc3/c;Lyc3/g;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    iget-object v4, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v3, 0x1

    iget-object v4, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v3, 0x2

    iget-object v4, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v3, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse$$serializer;

    iget-object v4, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    const/4 v5, 0x3

    invoke-interface {v1, v2, v5, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x4

    invoke-interface {v1, v2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    new-instance v5, Lcom/whoop/design/models/items/CtaTileModel;

    const v22, 0xffff

    const/16 v23, 0x0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v5 .. v23}, Lcom/whoop/design/models/items/CtaTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    :goto_0
    sget-object v4, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    iget-object v5, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-interface {v1, v2, v3, v4, v5}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v3, 0x5

    iget-boolean v4, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    invoke-interface {v1, v2, v3, v4}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v3, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;

    iget-object v4, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    const/4 v5, 0x6

    invoke-interface {v1, v2, v5, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v3, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse$$serializer;

    iget-object v4, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    const/4 v5, 0x7

    invoke-interface {v1, v2, v5, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v4, 0x8

    iget-object v0, v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    invoke-interface {v1, v2, v4, v3, v0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    return v0
.end method

.method public final component7()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    return-object v0
.end method

.method public final component8()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-object v0
.end method

.method public final component9()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;
    .locals 11

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pageHeader"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsCta"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shepherdHistory"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;Lcom/whoop/design/models/items/CtaTileModel;ZLcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    iget-boolean v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    iget-object p1, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getClearHistoryDialog()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-object v0
.end method

.method public final getClearRecordDialog()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    return-object v0
.end method

.method public final getDetectionOn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    return v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getPageHeader()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    return-object v0
.end method

.method public final getPageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSettingsCta()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final getShepherdHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CtaTileModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    invoke-virtual {v2}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->icon:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->body:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->pageHeader:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/PageHeaderResponse;

    iget-object v4, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->settingsCta:Lcom/whoop/design/models/items/CtaTileModel;

    iget-boolean v5, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->detectionOn:Z

    iget-object v6, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->shepherdHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    iget-object v7, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearHistoryDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    iget-object v8, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;->clearRecordDialog:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdClearHistoryDialogResponse;

    const-string v9, ", pageTitle="

    const-string v10, ", body="

    const-string v11, "ShepherdNotificationHistoryResponse(icon="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pageHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", settingsCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detectionOn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shepherdHistory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clearHistoryDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clearRecordDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
