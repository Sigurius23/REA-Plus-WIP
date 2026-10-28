.class public final Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$$serializer;,
        Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FGBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011Bu\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0010\u0010$\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010!J\u0012\u0010*\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-Jt\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010!J\u0010\u00101\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00107\u001a\u0004\u00089\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00107\u001a\u0004\u0008:\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010;\u001a\u0004\u0008<\u0010%R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010=\u001a\u0004\u0008>\u0010\'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u0008?\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u0008@\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008B\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008D\u0010-\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;",
        "",
        "",
        "navigationTitle",
        "title",
        "subtitle",
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;",
        "formContent",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "nextButton",
        "savingTitle",
        "savingSubtitle",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "callout",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$clinician_in_the_loop_release",
        "(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;",
        "component5",
        "()Lcom/whoop/design/models/ProgressButtonModel;",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "component9",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNavigationTitle",
        "getTitle",
        "getSubtitle",
        "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;",
        "getFormContent",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "getNextButton",
        "getSavingTitle",
        "getSavingSubtitle",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getCallout",
        "Companion",
        "$serializer",
        "a",
        "clinician-in-the-loop_release"
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

.field public static final Companion:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$a;


# instance fields
.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private final callout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

.field private final navigationTitle:Ljava/lang/String;

.field private final nextButton:Lcom/whoop/design/models/ProgressButtonModel;

.field private final savingSubtitle:Ljava/lang/String;

.field private final savingTitle:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->Companion:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$$serializer;

    invoke-virtual {p11}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    iput-object p6, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    iput-object p7, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iput-object p10, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V
    .locals 1

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formContent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextButton"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    .line 7
    iput-object p5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;ILjava/lang/Object;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    :cond_8
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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$clinician_in_the_loop_release(Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent$$serializer;->INSTANCE:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent$$serializer;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object p0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;
    .locals 11

    const-string v0, "navigationTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formContent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextButton"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;Lcom/whoop/design/models/ProgressButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object p1, p1, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getFormContent()Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextButton()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final getSavingSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSavingTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    invoke-virtual {v2}, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/ProgressButtonModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->navigationTitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->formContent:Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormContent;

    iget-object v4, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->nextButton:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v5, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingTitle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->savingSubtitle:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v8, p0, Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const-string v9, ", title="

    const-string v10, ", subtitle="

    const-string v11, "VideoSchedulingFormResponse(navigationTitle="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", formContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", savingTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", savingSubtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
