.class public final Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/activation/domain/models/ActivationFlowStepModel;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$$serializer;,
        Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RQB\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u00af\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001fJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\"J\u00b2\u0001\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00052\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010\u001fJ\u0010\u00100\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00080\u00101J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u000102H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010@\u001a\u0004\u0008A\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010B\u001a\u0004\u0008C\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010B\u001a\u0004\u0008D\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010E\u001a\u0004\u0008F\u0010\"R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010E\u001a\u0004\u0008G\u0010\"R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010B\u001a\u0004\u0008H\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008I\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010B\u001a\u0004\u0008J\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010B\u001a\u0004\u0008K\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010B\u001a\u0004\u0008L\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010B\u001a\u0004\u0008M\u0010\u001fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010N\u001a\u0004\u0008O\u0010+R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010E\u001a\u0004\u0008P\u0010\"\u00a8\u0006S"
    }
    d2 = {
        "Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;",
        "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "subtitle",
        "imageUrl",
        "",
        "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
        "additionalConsents",
        "consents",
        "selectAllCtaTitle",
        "jumpCtaTitle",
        "acceptCtaTitle",
        "navigationBarText",
        "mobileScreenName",
        "analyticsName",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "progressCircle",
        "footerButtons",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Lcom/whoop/design/models/ProgressButtonModel;",
        "component13",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "write$Self$activation_release",
        "(Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "Ljava/lang/String;",
        "getSubtitle",
        "getImageUrl",
        "Ljava/util/List;",
        "getAdditionalConsents",
        "getConsents",
        "getSelectAllCtaTitle",
        "getJumpCtaTitle",
        "getAcceptCtaTitle",
        "getNavigationBarText",
        "getMobileScreenName",
        "getAnalyticsName",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "getProgressCircle",
        "getFooterButtons",
        "Companion",
        "$serializer",
        "activation_release"
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

.field public static final Companion:Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$Companion;


# instance fields
.field private final acceptCtaTitle:Ljava/lang/String;

.field private final additionalConsents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;"
        }
    .end annotation
.end field

.field private final analyticsName:Ljava/lang/String;

.field private final consents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;"
        }
    .end annotation
.end field

.field private final footerButtons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final imageUrl:Ljava/lang/String;

.field private final jumpCtaTitle:Ljava/lang/String;

.field private final mobileScreenName:Ljava/lang/String;

.field private final navigationBarText:Ljava/lang/String;

.field private final progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

.field private final selectAllCtaTitle:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->Companion:Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lr70/b;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lr70/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lr70/b;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Lr70/b;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lr70/b;

    const/4 v8, 0x3

    invoke-direct {v7, v8}, Lr70/b;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0xd

    new-array v7, v7, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v7, v9

    aput-object v1, v7, v4

    aput-object v1, v7, v6

    aput-object v3, v7, v8

    const/4 v3, 0x4

    aput-object v5, v7, v3

    const/4 v3, 0x5

    aput-object v1, v7, v3

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

    aput-object v2, v7, v0

    sput-object v7, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0xff7

    const/16 v1, 0xff7

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    :goto_0
    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->navigationBarText:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->mobileScreenName:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->analyticsName:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    and-int/lit16 p1, p1, 0x1000

    if-nez p1, :cond_2

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    :goto_1
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->footerButtons:Ljava/util/List;

    return-void

    :cond_2
    move-object/from16 p1, p14

    goto :goto_1
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/ProgressButtonModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consents"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mobileScreenName"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsName"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    .line 9
    iput-object p5, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    .line 10
    iput-object p6, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    .line 13
    iput-object p9, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->navigationBarText:Ljava/lang/String;

    .line 14
    iput-object p10, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->mobileScreenName:Ljava/lang/String;

    .line 15
    iput-object p11, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->analyticsName:Ljava/lang/String;

    .line 16
    iput-object p12, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    .line 17
    iput-object p13, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->footerButtons:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p4

    :goto_0
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_1

    .line 18
    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object v15, v0

    :goto_1
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    goto :goto_2

    :cond_1
    move-object/from16 v15, p13

    goto :goto_1

    .line 19
    :goto_2
    invoke-direct/range {v2 .. v15}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/activation/domain/models/steps/ConsentsModel$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/ConsentsModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/activation/domain/models/steps/ConsentsModel$$serializer;->INSTANCE:Lcom/whoop/activation/domain/models/steps/ConsentsModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->navigationBarText:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->mobileScreenName:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->analyticsName:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->footerButtons:Ljava/util/List;

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
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$activation_release(Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getNavigationBarText()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getMobileScreenName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xa

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getAnalyticsName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getProgressCircle()Lcom/whoop/design/models/ProgressButtonModel;

    move-result-object v2

    const/16 v3, 0xb

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getFooterButtons()Ljava/util/List;

    move-result-object v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->getFooterButtons()Ljava/util/List;

    move-result-object p0

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->mobileScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->analyticsName:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->footerButtons:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/ProgressButtonModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consents"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mobileScreenName"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsName"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->navigationBarText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->navigationBarText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->mobileScreenName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->mobileScreenName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->analyticsName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->analyticsName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v3, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->footerButtons:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->footerButtons:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAcceptCtaTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getAdditionalConsents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    return-object v0
.end method

.method public getAnalyticsName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->analyticsName:Ljava/lang/String;

    return-object v0
.end method

.method public final getConsents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/activation/domain/models/steps/ConsentsModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    return-object v0
.end method

.method public bridge getFooterAlignment()Lcom/whoop/activation/domain/models/FooterAlignment;
    .locals 1

    invoke-super {p0}, Lcom/whoop/activation/domain/models/ActivationFlowStepModel;->getFooterAlignment()Lcom/whoop/activation/domain/models/FooterAlignment;

    move-result-object v0

    return-object v0
.end method

.method public getFooterButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->footerButtons:Ljava/util/List;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getJumpCtaTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getMobileScreenName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->mobileScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public getNavigationBarText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->navigationBarText:Ljava/lang/String;

    return-object v0
.end method

.method public getProgressCircle()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final getSelectAllCtaTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

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

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->navigationBarText:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->mobileScreenName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->analyticsName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/design/models/ProgressButtonModel;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->footerButtons:Ljava/util/List;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->subtitle:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->imageUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->additionalConsents:Ljava/util/List;

    iget-object v5, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->consents:Ljava/util/List;

    iget-object v6, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->selectAllCtaTitle:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->jumpCtaTitle:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->acceptCtaTitle:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->navigationBarText:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->mobileScreenName:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->analyticsName:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->progressCircle:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v13, v0, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;->footerButtons:Ljava/util/List;

    const-string v14, ", subtitle="

    const-string v15, ", imageUrl="

    const-string v0, "PrivacyConsentModel(title="

    invoke-static {v0, v1, v14, v2, v15}, Lq63/c;->o(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", additionalConsents="

    const-string v2, ", consents="

    invoke-static {v3, v1, v2, v0, v4}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", selectAllCtaTitle="

    const-string v2, ", jumpCtaTitle="

    invoke-static {v1, v6, v2, v0, v5}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", acceptCtaTitle="

    const-string v2, ", navigationBarText="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", mobileScreenName="

    const-string v2, ", analyticsName="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", progressCircle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footerButtons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v13, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
