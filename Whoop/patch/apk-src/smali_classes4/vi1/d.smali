.class public final Lvi1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi1/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lvi1/b;",
        "Lvi1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008!\u0010 J\u0010\u0010#\u001a\u00020\"H\u0082@\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0017\u0010\'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J#\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0)2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0)H\u0002\u00a2\u0006\u0004\u0008-\u0010.J#\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0014H\u0016\u00a2\u0006\u0004\u00080\u00101J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0000\u00a2\u0006\u0004\u00085\u00106J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207H\u0000\u00a2\u0006\u0004\u0008:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010L\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR \u0010T\u001a\u00020M8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008N\u0010O\u0012\u0004\u0008R\u0010S\u001a\u0004\u0008P\u0010QR \u0010[\u001a\u00020U8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008V\u0010W\u0012\u0004\u0008Z\u0010S\u001a\u0004\u0008X\u0010YR \u0010`\u001a\u00020\u001d8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\\\u0012\u0004\u0008_\u0010S\u001a\u0004\u0008]\u0010^R \u0010f\u001a\u00020a8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u00085\u0010b\u0012\u0004\u0008e\u0010S\u001a\u0004\u0008c\u0010d\u00a8\u0006g"
    }
    d2 = {
        "Lvi1/d;",
        "Lod1/g;",
        "Lvi1/b;",
        "Lvi1/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lcom/whoop/data/onboarding/OnboardingStatusDao;",
        "onboardingStatusDao",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Ltr2/n;",
        "logger",
        "Lqk1/b;",
        "dao",
        "Ljava/time/ZoneId;",
        "zone",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(Lnm0/e;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lzr2/a;Ltr2/n;Lqk1/b;Ljava/time/ZoneId;Ljava/time/Clock;)V",
        "Lec3/l;",
        "s",
        "()Lec3/l;",
        "Lvi1/c$c;",
        "cacheSuccess",
        "k",
        "(Lvi1/c$c;Lq83/d;)Ljava/lang/Object;",
        "o",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;",
        "cached",
        "v",
        "(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;",
        "u",
        "Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;",
        "t",
        "Lrk1/c;",
        "state",
        "Lhy0/b2;",
        "r",
        "(Lrk1/c;)Lhy0/b2;",
        "",
        "Lsk1/b;",
        "determinations",
        "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;",
        "p",
        "(Ljava/util/List;)Ljava/util/List;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lqk1/a;",
        "reading",
        "Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;",
        "l",
        "(Lqk1/a;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;",
        "Ljava/time/Instant;",
        "timestamp",
        "Lcom/whoop/design/util/TextResource$c;",
        "q",
        "(Ljava/time/Instant;)Lcom/whoop/design/util/TextResource$c;",
        "a",
        "Lnm0/e;",
        "b",
        "Lcom/whoop/data/onboarding/OnboardingStatusDao;",
        "c",
        "Lzr2/a;",
        "d",
        "Ltr2/n;",
        "e",
        "Lqk1/b;",
        "f",
        "Ljava/time/ZoneId;",
        "g",
        "Ljava/time/Clock;",
        "h",
        "Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;",
        "offlineLabradorEnabledCardModel",
        "Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;",
        "i",
        "Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;",
        "n",
        "()Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;",
        "getOfflineShepherdErrorModel$kennel_release$annotations",
        "()V",
        "offlineShepherdErrorModel",
        "Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;",
        "j",
        "Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;",
        "m",
        "()Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;",
        "getOfflineDividerModel$kennel_release$annotations",
        "offlineDividerModel",
        "Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;",
        "getOfflineModel$kennel_release",
        "()Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;",
        "getOfflineModel$kennel_release$annotations",
        "offlineModel",
        "Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;",
        "Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;",
        "getDataBehindTileModel$kennel_release",
        "()Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;",
        "getDataBehindTileModel$kennel_release$annotations",
        "dataBehindTileModel",
        "kennel_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lnm0/e;

.field private final b:Lcom/whoop/data/onboarding/OnboardingStatusDao;

.field private final c:Lzr2/a;

.field private final d:Ltr2/n;

.field private final e:Lqk1/b;

.field private final f:Ljava/time/ZoneId;

.field private final g:Ljava/time/Clock;

.field private final h:Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

.field private final i:Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

.field private final j:Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;

.field private final k:Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

.field private final l:Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;


# direct methods
.method public constructor <init>(Lnm0/e;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lzr2/a;Ltr2/n;Lqk1/b;Ljava/time/ZoneId;Ljava/time/Clock;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    const-string v8, "cachedApiSource"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onboardingStatusDao"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "dateAndTimeProvider"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "logger"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "dao"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "zone"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "clock"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lvi1/d;->a:Lnm0/e;

    .line 3
    iput-object v2, v0, Lvi1/d;->b:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    .line 4
    iput-object v3, v0, Lvi1/d;->c:Lzr2/a;

    .line 5
    iput-object v4, v0, Lvi1/d;->d:Ltr2/n;

    .line 6
    iput-object v5, v0, Lvi1/d;->e:Lqk1/b;

    .line 7
    iput-object v6, v0, Lvi1/d;->f:Ljava/time/ZoneId;

    .line 8
    iput-object v7, v0, Lvi1/d;->g:Ljava/time/Clock;

    .line 9
    new-instance v1, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    .line 10
    new-instance v2, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    .line 11
    sget v3, Lti1/d;->e:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    .line 12
    new-instance v4, Lcom/whoop/navigation/e;

    sget-object v5, Lcom/whoop/navigation/AppScreen$k3;->w:Lcom/whoop/navigation/AppScreen$k3;

    sget-object v6, Lcom/whoop/navigation/LabradorResultsModel;->INSTANCE:Lcom/whoop/navigation/LabradorResultsModel;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 p1, v4

    move-object/from16 p2, v5

    move-object/from16 p3, v6

    move/from16 p5, v7

    move-object/from16 p6, v8

    move-object/from16 p4, v9

    invoke-direct/range {p1 .. p6}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p5, v4

    move/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p3, v7

    move-object/from16 p4, v8

    .line 13
    invoke-direct/range {p1 .. p7}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    new-instance v3, Lcom/whoop/design/models/items/CtaTileModel;

    .line 15
    sget v4, Lti1/d;->p:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    .line 16
    new-instance v19, Lcom/whoop/navigation/e;

    sget-object v5, Lcom/whoop/navigation/AppScreen$i3;->w:Lcom/whoop/navigation/AppScreen$i3;

    new-instance v6, Lcom/whoop/navigation/LabradorReadingModel;

    const/4 v8, 0x1

    invoke-direct {v6, v7, v8, v7}, Lcom/whoop/navigation/LabradorReadingModel;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x4

    const/4 v10, 0x0

    move-object/from16 p2, v5

    move-object/from16 p3, v6

    move/from16 p5, v7

    move-object/from16 p6, v9

    move-object/from16 p4, v10

    move-object/from16 p1, v19

    invoke-direct/range {p1 .. p6}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x7ffe

    const/16 v21, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v0, v22

    .line 17
    invoke-direct/range {v3 .. v21}, Lcom/whoop/design/models/items/CtaTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 19
    invoke-direct {v1, v2, v0, v3}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)V

    move-object/from16 v2, p0

    iput-object v1, v2, Lvi1/d;->h:Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    .line 20
    new-instance v3, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    .line 21
    new-instance v4, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;

    .line 22
    new-instance v5, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    const/16 v16, 0x3ff

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    sget-object v6, Lyi1/n;->ErrorConnection:Lyi1/n;

    invoke-virtual {v6}, Lyi1/n;->getKey()Ljava/lang/String;

    move-result-object v6

    .line 24
    invoke-direct {v4, v5, v6}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;Ljava/lang/String;)V

    .line 25
    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/16 v9, 0x1b

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 26
    invoke-direct/range {v3 .. v10}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v2, Lvi1/d;->i:Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    .line 27
    new-instance v4, Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;

    const-string v5, "INACTIVE"

    invoke-direct {v4, v5}, Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;-><init>(Ljava/lang/String;)V

    iput-object v4, v2, Lvi1/d;->j:Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;

    .line 28
    new-instance v4, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    const/4 v5, 0x2

    new-array v5, v5, [Lcom/whoop/design/models/DesignSystemModel;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    aput-object v3, v5, v0

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;-><init>(Ljava/util/List;)V

    iput-object v4, v2, Lvi1/d;->k:Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    .line 29
    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;

    .line 30
    new-instance v3, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    .line 31
    sget v1, Lti1/d;->a:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/16 v14, 0x3fe

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    .line 32
    invoke-direct/range {v3 .. v15}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    sget-object v1, Lyi1/n;->RecentlyActivated:Lyi1/n;

    invoke-virtual {v1}, Lyi1/n;->getKey()Ljava/lang/String;

    move-result-object v1

    .line 34
    invoke-direct {v0, v3, v1}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;Ljava/lang/String;)V

    iput-object v0, v2, Lvi1/d;->l:Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lzr2/a;Ltr2/n;Lqk1/b;Ljava/time/ZoneId;Ljava/time/Clock;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    .line 35
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "HeartHealthTab"

    invoke-virtual {p4, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p8, 0x20

    if-eqz p4, :cond_1

    .line 36
    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object p6

    const-string p4, "systemDefault(...)"

    invoke-static {p6, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    .line 37
    invoke-direct/range {v0 .. v7}, Lvi1/d;-><init>(Lnm0/e;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lzr2/a;Ltr2/n;Lqk1/b;Ljava/time/ZoneId;Ljava/time/Clock;)V

    return-void
.end method

.method public static final synthetic c(Lvi1/d;Lvi1/c$c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lvi1/d;->k(Lvi1/c$c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lvi1/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lvi1/d;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Lvi1/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lvi1/d;->o(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lvi1/d;)Lcom/whoop/data/onboarding/OnboardingStatusDao;
    .locals 0

    iget-object p0, p0, Lvi1/d;->b:Lcom/whoop/data/onboarding/OnboardingStatusDao;

    return-object p0
.end method

.method public static final synthetic g(Lvi1/d;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lvi1/d;->s()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lvi1/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lvi1/d;->t(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lvi1/d;Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;
    .locals 0

    invoke-direct {p0, p1}, Lvi1/d;->u(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lvi1/d;Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;
    .locals 0

    invoke-direct {p0, p1}, Lvi1/d;->v(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object p0

    return-object p0
.end method

.method private final k(Lvi1/c$c;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi1/c$c;",
            "Lq83/d<",
            "-",
            "Lvi1/c$c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lvi1/d$b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lvi1/d$b;

    iget v3, v2, Lvi1/d$b;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lvi1/d$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Lvi1/d$b;

    invoke-direct {v2, v1, v0}, Lvi1/d$b;-><init>(Lvi1/d;Lq83/d;)V

    :goto_0
    iget-object v0, v2, Lvi1/d$b;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lvi1/d$b;->z:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v7, :cond_1

    iget-object v2, v2, Lvi1/d$b;->w:Ljava/lang/Object;

    check-cast v2, Lvi1/c$c;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v4, v2

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v0, v1, Lvi1/d;->e:Lqk1/b;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v4, p1

    :try_start_2
    iput-object v4, v2, Lvi1/d$b;->w:Ljava/lang/Object;

    iput v7, v2, Lvi1/d$b;->z:I

    invoke-interface {v0, v2}, Lqk1/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1

    if-ne v0, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v4

    :goto_1
    :try_start_3
    check-cast v0, Lqk1/a;
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    move-object/from16 v4, p1

    :goto_2
    iget-object v2, v1, Lvi1/d;->d:Ltr2/n;

    const-string v3, "failed to read latest reading from disk"

    new-array v8, v6, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v8}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move-object v2, v4

    move-object v0, v5

    :goto_3
    if-eqz v0, :cond_d

    invoke-virtual {v1, v0}, Lvi1/d;->l(Lqk1/a;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    move-result-object v0

    invoke-virtual {v2}, Lvi1/c$c;->c()Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;->getItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v3, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v10, v9, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    if-eqz v10, :cond_a

    move-object v11, v9

    check-cast v11, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    invoke-virtual {v11}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->getItems()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v13, v12, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    if-eqz v13, :cond_7

    move-object v13, v12

    check-cast v13, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    invoke-virtual {v13}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getSamples()Ljava/util/List;

    move-result-object v14

    if-eqz v14, :cond_7

    invoke-virtual {v0}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getTrailingTimestamp()Ljava/lang/String;

    move-result-object v7

    const-wide v14, 0x7fffffffffffffffL

    if-eqz v7, :cond_4

    invoke-static {v7}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v16

    goto :goto_6

    :cond_4
    move-wide/from16 v16, v14

    :goto_6
    invoke-virtual {v13}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;->getTrailingTimestamp()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-static {v7}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v14

    :cond_5
    cmp-long v7, v16, v14

    if-lez v7, :cond_6

    move-object v12, v0

    :cond_6
    move v7, v6

    :cond_7
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    if-eqz v7, :cond_9

    invoke-static {v0, v10}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v10

    :cond_9
    move-object v14, v10

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->copy$default(Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;ILjava/lang/Object;)Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    move-result-object v9

    :cond_a
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_b
    invoke-virtual {v2}, Lvi1/c$c;->c()Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;->copy(Ljava/util/List;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object v0

    const/4 v3, 0x2

    invoke-static {v2, v0, v6, v3, v5}, Lvi1/c$c;->b(Lvi1/c$c;Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;ZILjava/lang/Object;)Lvi1/c$c;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_7

    :cond_c
    move-object v2, v0

    :cond_d
    :goto_7
    return-object v2
.end method

.method private final o(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lvi1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lvi1/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lvi1/d$c;-><init>(Lvi1/d;Lq83/d;)V

    invoke-static {v0, p1}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final p(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lsk1/b;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsk1/b;

    new-instance v2, Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;

    invoke-virtual {v1}, Lsk1/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lsk1/b;->b()Lhy0/b2;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdReadingModel;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final r(Lrk1/c;)Lhy0/b2;
    .locals 1

    sget-object v0, Lvi1/d$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    sget-object p1, Lhy0/b2;->CONCERN_RANGE:Lhy0/b2;

    return-object p1

    :cond_0
    sget-object p1, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    return-object p1

    :cond_1
    sget-object p1, Lhy0/b2;->POSITIVE_RANGE:Lhy0/b2;

    return-object p1
.end method

.method private final s()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/health/monitor/medical/domain/HeartHealthBffRequest;

    invoke-direct {v0}, Lcom/whoop/health/monitor/medical/domain/HeartHealthBffRequest;-><init>()V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "labradorrefreshscope"

    const-string v2, "shepherdrefreshscope"

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lvi1/d;->a:Lnm0/e;

    new-instance v2, Lvi1/d$e;

    invoke-direct {v2, v3, v1}, Lvi1/d$e;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lvi1/d$f;

    invoke-direct {v1, v0, p0}, Lvi1/d$f;-><init>(Lec3/l;Lvi1/d;)V

    new-instance v0, Lvi1/d$g;

    invoke-direct {v0, v1, p0}, Lvi1/d$g;-><init>(Lec3/l;Lvi1/d;)V

    return-object v0
.end method

.method private final t(Lq83/d;)Ljava/lang/Object;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lvi1/d$h;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lvi1/d$h;

    iget v3, v2, Lvi1/d$h;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lvi1/d$h;->y:I

    goto :goto_0

    :cond_0
    new-instance v2, Lvi1/d$h;

    invoke-direct {v2, v0, v1}, Lvi1/d$h;-><init>(Lvi1/d;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lvi1/d$h;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lvi1/d$h;->y:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lvi1/d;->e:Lqk1/b;

    iput v5, v2, Lvi1/d$h;->y:I

    invoke-interface {v1, v2}, Lqk1/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    :goto_1
    check-cast v1, Lqk1/a;

    if-eqz v1, :cond_4

    new-instance v6, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    sget v2, Lti1/d;->e:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    new-instance v8, Lcom/whoop/navigation/e;

    sget-object v9, Lcom/whoop/navigation/AppScreen$k3;->w:Lcom/whoop/navigation/AppScreen$k3;

    sget-object v10, Lcom/whoop/navigation/LabradorResultsModel;->INSTANCE:Lcom/whoop/navigation/LabradorResultsModel;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/whoop/design/models/items/CtaTileModel;

    sget v2, Lti1/d;->p:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    new-instance v23, Lcom/whoop/navigation/e;

    sget-object v10, Lcom/whoop/navigation/AppScreen$i3;->w:Lcom/whoop/navigation/AppScreen$i3;

    new-instance v11, Lcom/whoop/navigation/LabradorReadingModel;

    const/4 v2, 0x0

    invoke-direct {v11, v2, v5, v2}, Lcom/whoop/navigation/LabradorReadingModel;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object/from16 v9, v23

    invoke-direct/range {v9 .. v14}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v24, 0x7ffe

    const/16 v25, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v7 .. v25}, Lcom/whoop/design/models/items/CtaTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lvi1/d;->l(Lqk1/a;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/whoop/design/models/DesignSystemModel;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    aput-object v1, v2, v5

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    move-object v7, v6

    new-instance v6, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    const/4 v10, 0x2

    const/4 v8, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_4
    iget-object v1, v0, Lvi1/d;->h:Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    return-object v1
.end method

.method private final u(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;
    .locals 10

    invoke-virtual {p1}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v3, v2, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    if-eqz v3, :cond_2

    move-object v4, v2

    check-cast v4, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    invoke-virtual {v4}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v5, v5, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    if-nez v5, :cond_0

    invoke-interface {v7, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->copy$default(Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;ILjava/lang/Object;)Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    move-result-object v2

    :cond_2
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1, v1}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;->copy(Ljava/util/List;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object p1

    return-object p1
.end method

.method private final v(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;
    .locals 12

    invoke-virtual {p1}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v3, v2, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    if-eqz v3, :cond_4

    move-object v4, v2

    check-cast v4, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    invoke-virtual {v4}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->getLatestProcessedTimestamp()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v3, p0, Lvi1/d;->c:Lzr2/a;

    invoke-interface {v3}, Lzr2/a;->b()J

    move-result-wide v5

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/32 v7, 0x5265c00

    add-long/2addr v2, v7

    cmp-long v2, v5, v2

    if-lez v2, :cond_3

    invoke-virtual {v4}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v7, v6, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;

    if-eqz v7, :cond_1

    check-cast v6, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;

    invoke-virtual {v6}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;->getAfibState()Ljava/lang/String;

    move-result-object v7

    const-string v8, "NOT_DETECTED"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v6}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;->getAfibState()Ljava/lang/String;

    move-result-object v6

    const-string v7, "POSSIBLE_AFIB_DETECTED"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lvi1/d;->l:Lcom/whoop/health/monitor/medical/domain/model/ShepherdTileModel;

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v7

    const/16 v10, 0x1b

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;->copy$default(Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v4

    :cond_4
    :goto_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    invoke-virtual {p1, v1}, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;->copy(Ljava/util/List;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvi1/d$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lvi1/d$d;-><init>(Lq83/d;Lvi1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lqk1/a;)Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;
    .locals 14

    const-string v0, "reading"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqk1/a;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lqk1/a;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    div-int/lit8 v1, v1, 0x3

    invoke-static {v0, v1}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    int-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v7, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lrk1/c;->Companion:Lrk1/c$a;

    invoke-virtual {p1}, Lqk1/a;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lrk1/c$a;->a(I)Lrk1/c;

    move-result-object v0

    sget v1, Lti1/d;->d:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    invoke-virtual {p1}, Lqk1/a;->i()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v1

    const-string v3, "ofEpochMilli(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lvi1/d;->q(Ljava/time/Instant;)Lcom/whoop/design/util/TextResource$c;

    move-result-object v3

    invoke-direct {p0, v0}, Lvi1/d;->r(Lrk1/c;)Lhy0/b2;

    move-result-object v4

    new-instance v6, Lcom/whoop/navigation/e;

    sget-object v9, Lcom/whoop/navigation/AppScreen$f3;->w:Lcom/whoop/navigation/AppScreen$f3;

    new-instance v10, Lcom/whoop/navigation/LabradorDetailsScreenModel;

    const-string v1, ""

    invoke-direct {v10, v1}, Lcom/whoop/navigation/LabradorDetailsScreenModel;-><init>(Ljava/lang/String;)V

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lrk1/c;->getDeterminations()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lvi1/d;->p(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {p1}, Lqk1/a;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    iget-object v0, p0, Lvi1/d;->f:Ljava/time/ZoneId;

    invoke-static {p1, v0}, Ljava/time/OffsetDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/OffsetDateTime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v1, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;

    const-string v5, "CARET_FORWARD"

    invoke-direct/range {v1 .. v9}, Lcom/whoop/health/monitor/medical/domain/model/LabradorResultModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method public final m()Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;
    .locals 1

    iget-object v0, p0, Lvi1/d;->j:Lcom/whoop/health/monitor/medical/domain/model/HorizontalDividerModel;

    return-object v0
.end method

.method public final n()Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;
    .locals 1

    iget-object v0, p0, Lvi1/d;->i:Lcom/whoop/health/monitor/medical/domain/model/ShepherdDetectionModel;

    return-object v0
.end method

.method public final q(Ljava/time/Instant;)Lcom/whoop/design/util/TextResource$c;
    .locals 4

    const-string v0, "timestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/time/temporal/ChronoUnit;->MINUTES:Ljava/time/temporal/ChronoUnit;

    iget-object v1, p0, Lvi1/d;->g:Ljava/time/Clock;

    invoke-static {v1}, Ljava/time/Instant;->now(Ljava/time/Clock;)Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/time/temporal/ChronoUnit;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J

    move-result-wide v0

    long-to-int p1, v0

    sget-object v0, Ljava/time/temporal/ChronoUnit;->DAYS:Ljava/time/temporal/ChronoUnit;

    invoke-virtual {v0}, Ljava/time/temporal/ChronoUnit;->getDuration()Ljava/time/Duration;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/Duration;->toMinutes()J

    move-result-wide v0

    long-to-int v0, v0

    if-lt p1, v0, :cond_0

    new-instance v1, Lcom/whoop/design/util/TextResource$c;

    sget v2, Lti1/c;->a:I

    div-int/2addr p1, v0

    new-instance v0, Lcom/whoop/design/util/TextResource$d$b;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v2, p1, v0}, Lcom/whoop/design/util/TextResource$c;-><init>(IILjava/util/List;)V

    return-object v1

    :cond_0
    const/16 v0, 0x3c

    if-lt p1, v0, :cond_1

    new-instance v1, Lcom/whoop/design/util/TextResource$c;

    sget v2, Lti1/c;->b:I

    div-int/2addr p1, v0

    new-instance v0, Lcom/whoop/design/util/TextResource$d$b;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v2, p1, v0}, Lcom/whoop/design/util/TextResource$c;-><init>(IILjava/util/List;)V

    return-object v1

    :cond_1
    new-instance v0, Lcom/whoop/design/util/TextResource$c;

    sget v1, Lti1/c;->c:I

    new-instance v2, Lcom/whoop/design/util/TextResource$d$b;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Lcom/whoop/design/util/TextResource$c;-><init>(IILjava/util/List;)V

    return-object v0
.end method
