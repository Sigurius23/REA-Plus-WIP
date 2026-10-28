.class public final Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0018\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u00cb\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0004\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0016\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\u001eJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010(J\u0012\u0010-\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010(J\u00d4\u0001\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00042\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010(J\u0010\u00104\u001a\u000203H\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00108\u001a\u0002072\u0008\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00088\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u001cR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010<\u001a\u0004\u0008=\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010:\u001a\u0004\u0008>\u0010\u001cR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010<\u001a\u0004\u0008?\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008@\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010:\u001a\u0004\u0008A\u0010\u001cR\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008B\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010:\u001a\u0004\u0008C\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010:\u001a\u0004\u0008D\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010:\u001a\u0004\u0008E\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010F\u001a\u0004\u0008G\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010H\u001a\u0004\u0008I\u0010*R\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010<\u001a\u0004\u0008J\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010F\u001a\u0004\u0008K\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010F\u001a\u0004\u0008L\u0010(R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010F\u001a\u0004\u0008M\u0010(R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010F\u001a\u0004\u0008N\u0010(\u00a8\u0006O"
    }
    d2 = {
        "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "timestampTitle",
        "",
        "",
        "samples",
        "determinationTitle",
        "Lsk1/b;",
        "readings",
        "insightBody",
        "averageHr",
        "shareText",
        "disclaimerText",
        "addNotesText",
        "removeReadingText",
        "",
        "id",
        "Ljava/time/Instant;",
        "timestamp",
        "savedSymptoms",
        "savedNotes",
        "pdfPresignedUrl",
        "protectYourPrivacyTitle",
        "protectYourPrivacyDescription",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Ljava/lang/String;",
        "component12",
        "()Ljava/time/Instant;",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getTimestampTitle",
        "Ljava/util/List;",
        "getSamples",
        "getDeterminationTitle",
        "getReadings",
        "getInsightBody",
        "getAverageHr",
        "getShareText",
        "getDisclaimerText",
        "getAddNotesText",
        "getRemoveReadingText",
        "Ljava/lang/String;",
        "getId",
        "Ljava/time/Instant;",
        "getTimestamp",
        "getSavedSymptoms",
        "getSavedNotes",
        "getPdfPresignedUrl",
        "getProtectYourPrivacyTitle",
        "getProtectYourPrivacyDescription",
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
.field private final addNotesText:Lcom/whoop/design/util/TextResource;

.field private final averageHr:Lcom/whoop/design/util/TextResource;

.field private final determinationTitle:Lcom/whoop/design/util/TextResource;

.field private final disclaimerText:Lcom/whoop/design/util/TextResource;

.field private final id:Ljava/lang/String;

.field private final insightBody:Lcom/whoop/design/util/TextResource;

.field private final pdfPresignedUrl:Ljava/lang/String;

.field private final protectYourPrivacyDescription:Ljava/lang/String;

.field private final protectYourPrivacyTitle:Ljava/lang/String;

.field private final readings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;"
        }
    .end annotation
.end field

.field private final removeReadingText:Lcom/whoop/design/util/TextResource;

.field private final samples:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private final savedNotes:Ljava/lang/String;

.field private final savedSymptoms:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final shareText:Lcom/whoop/design/util/TextResource;

.field private final timestamp:Ljava/time/Instant;

.field private final timestampTitle:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>()V
    .locals 20

    .line 1
    const v18, 0x1ffff

    const/16 v19, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v19}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/time/Instant;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    const-string v11, "timestampTitle"

    invoke-static {p1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "samples"

    invoke-static {p2, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "determinationTitle"

    invoke-static {p3, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "readings"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "insightBody"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "averageHr"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "shareText"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "disclaimerText"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "addNotesText"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "removeReadingText"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "id"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "timestamp"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "savedSymptoms"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestampTitle:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->samples:Ljava/util/List;

    .line 5
    iput-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->determinationTitle:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->readings:Ljava/util/List;

    .line 7
    iput-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->insightBody:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object v3, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->averageHr:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object v4, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->shareText:Lcom/whoop/design/util/TextResource;

    .line 10
    iput-object v5, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->disclaimerText:Lcom/whoop/design/util/TextResource;

    .line 11
    iput-object v6, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->addNotesText:Lcom/whoop/design/util/TextResource;

    .line 12
    iput-object v7, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->removeReadingText:Lcom/whoop/design/util/TextResource;

    .line 13
    iput-object v8, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->id:Ljava/lang/String;

    .line 14
    iput-object v9, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestamp:Ljava/time/Instant;

    .line 15
    iput-object v10, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedSymptoms:Ljava/util/List;

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedNotes:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->pdfPresignedUrl:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyTitle:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyDescription:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 20
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    .line 21
    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    .line 22
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move-object v5, v3

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    .line 23
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    .line 24
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    .line 25
    sget v8, Lrs1/f;->q0:I

    invoke-static {v8}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    .line 26
    sget v9, Lrs1/f;->l0:I

    invoke-static {v9}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    .line 27
    sget v10, Lrs1/f;->l:I

    invoke-static {v10}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    .line 28
    sget v11, Lrs1/f;->m0:I

    invoke-static {v11}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    .line 29
    const-string v12, ""

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    .line 30
    sget-object v13, Ljava/time/Instant;->EPOCH:Ljava/time/Instant;

    const-string v14, "EPOCH"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    goto :goto_c

    :cond_c
    move-object/from16 v3, p13

    :goto_c
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_d

    const/4 v14, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v14, p14

    :goto_d
    and-int/lit16 v15, v0, 0x4000

    if-eqz v15, :cond_e

    const/4 v15, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v0, v0, v17

    if-eqz v0, :cond_10

    const/16 p18, 0x0

    :goto_10
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p14, v3

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

    move-object/from16 p15, v14

    move-object/from16 p16, v15

    move-object/from16 p17, v16

    goto :goto_11

    :cond_10
    move-object/from16 p18, p17

    goto :goto_10

    .line 31
    :goto_11
    invoke-direct/range {p1 .. p18}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestampTitle:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->samples:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->determinationTitle:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->readings:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->insightBody:Lcom/whoop/design/util/TextResource;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->averageHr:Lcom/whoop/design/util/TextResource;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->shareText:Lcom/whoop/design/util/TextResource;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->disclaimerText:Lcom/whoop/design/util/TextResource;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->addNotesText:Lcom/whoop/design/util/TextResource;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->removeReadingText:Lcom/whoop/design/util/TextResource;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->id:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestamp:Ljava/time/Instant;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedSymptoms:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedNotes:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->pdfPresignedUrl:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyTitle:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p18, v16

    if-eqz v16, :cond_10

    move-object/from16 p2, v1

    iget-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyDescription:Ljava/lang/String;

    move-object/from16 p17, p2

    move-object/from16 p18, v1

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

    goto :goto_10

    :cond_10
    move-object/from16 p18, p17

    move-object/from16 p17, v1

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

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->copy(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestampTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->removeReadingText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestamp:Ljava/time/Instant;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedSymptoms:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedNotes:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->pdfPresignedUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->samples:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->determinationTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->readings:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->insightBody:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->averageHr:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->shareText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->disclaimerText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->addNotesText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/time/Instant;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;"
        }
    .end annotation

    const-string v0, "timestampTitle"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samples"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "determinationTitle"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readings"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "insightBody"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "averageHr"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareText"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disclaimerText"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addNotesText"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeReadingText"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timestamp"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedSymptoms"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    invoke-direct/range {v1 .. v18}, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;

    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestampTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestampTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->samples:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->samples:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->determinationTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->determinationTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->readings:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->readings:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->insightBody:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->insightBody:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->averageHr:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->averageHr:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->shareText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->shareText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->disclaimerText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->disclaimerText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->addNotesText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->addNotesText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->removeReadingText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->removeReadingText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestamp:Ljava/time/Instant;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestamp:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedSymptoms:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedSymptoms:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedNotes:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedNotes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->pdfPresignedUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->pdfPresignedUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyDescription:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyDescription:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getAddNotesText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->addNotesText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getAverageHr()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->averageHr:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDeterminationTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->determinationTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDisclaimerText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->disclaimerText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInsightBody()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->insightBody:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPdfPresignedUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->pdfPresignedUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getProtectYourPrivacyDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getProtectYourPrivacyTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getReadings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->readings:Ljava/util/List;

    return-object v0
.end method

.method public final getRemoveReadingText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->removeReadingText:Lcom/whoop/design/util/TextResource;

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

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->samples:Ljava/util/List;

    return-object v0
.end method

.method public final getSavedNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedNotes:Ljava/lang/String;

    return-object v0
.end method

.method public final getSavedSymptoms()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedSymptoms:Ljava/util/List;

    return-object v0
.end method

.method public final getShareText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->shareText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTimestamp()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestamp:Ljava/time/Instant;

    return-object v0
.end method

.method public final getTimestampTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestampTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestampTitle:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->samples:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->determinationTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->readings:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->insightBody:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->averageHr:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->shareText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->disclaimerText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->addNotesText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->removeReadingText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestamp:Ljava/time/Instant;

    invoke-static {v2, v0, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedSymptoms:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedNotes:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->pdfPresignedUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyTitle:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyDescription:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestampTitle:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->samples:Ljava/util/List;

    iget-object v3, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->determinationTitle:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->readings:Ljava/util/List;

    iget-object v5, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->insightBody:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->averageHr:Lcom/whoop/design/util/TextResource;

    iget-object v7, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->shareText:Lcom/whoop/design/util/TextResource;

    iget-object v8, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->disclaimerText:Lcom/whoop/design/util/TextResource;

    iget-object v9, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->addNotesText:Lcom/whoop/design/util/TextResource;

    iget-object v10, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->removeReadingText:Lcom/whoop/design/util/TextResource;

    iget-object v11, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->id:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->timestamp:Ljava/time/Instant;

    iget-object v13, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedSymptoms:Ljava/util/List;

    iget-object v14, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->savedNotes:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->pdfPresignedUrl:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyTitle:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/labrador/feature/details/domain/model/LabradorDetailsDomainHolder;->protectYourPrivacyDescription:Ljava/lang/String;

    const-string v0, ", samples="

    move-object/from16 v18, v15

    const-string v15, ", determinationTitle="

    move-object/from16 v19, v13

    const-string v13, "LabradorDetailsDomainHolder(timestampTitle="

    invoke-static {v1, v13, v0, v15, v2}, Lte0/d;->p(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", readings="

    const-string v2, ", insightBody="

    invoke-static {v3, v1, v2, v0, v4}, Ljh3/c;->n(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", averageHr="

    const-string v2, ", shareText="

    invoke-static {v0, v5, v1, v6, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", disclaimerText="

    const-string v2, ", addNotesText="

    invoke-static {v0, v7, v1, v8, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", removeReadingText="

    const-string v2, ", id="

    invoke-static {v0, v9, v1, v10, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", savedSymptoms="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", savedNotes="

    const-string v2, ", pdfPresignedUrl="

    move-object/from16 v3, v19

    invoke-static {v1, v14, v2, v0, v3}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", protectYourPrivacyTitle="

    const-string v2, ", protectYourPrivacyDescription="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    move-object/from16 v2, v18

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
