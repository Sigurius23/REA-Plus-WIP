.class public final Lcom/whoop/profile/samples/ProfileSamples;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007R\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0017R\u0011\u0010\u001e\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0017\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/profile/samples/ProfileSamples;",
        "",
        "<init>",
        "()V",
        "sampleProfileViewStateMetadata",
        "Lcom/whoop/profile/presentation/ProfileViewState$Metadata;",
        "getSampleProfileViewStateMetadata",
        "()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;",
        "sampleProfileViewStateMetadataWithLongText",
        "getSampleProfileViewStateMetadataWithLongText",
        "sampleFoundingMemberProfileViewStateMetadata",
        "getSampleFoundingMemberProfileViewStateMetadata",
        "sampleProfileViewStateMetadataWithNullMemberSinceDate",
        "getSampleProfileViewStateMetadataWithNullMemberSinceDate",
        "sampleReportSuccessDialog",
        "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
        "getSampleReportSuccessDialog",
        "()Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;",
        "sampleReportFailureDialog",
        "getSampleReportFailureDialog",
        "sampleLoadingViewState",
        "Lcom/whoop/profile/presentation/ProfileViewState;",
        "getSampleLoadingViewState",
        "()Lcom/whoop/profile/presentation/ProfileViewState;",
        "sampleNetworkErrorViewState",
        "getSampleNetworkErrorViewState",
        "sampleRequestFailedViewState",
        "getSampleRequestFailedViewState",
        "sampleSuccessViewState",
        "getSampleSuccessViewState",
        "sampleProfileViewState",
        "getSampleProfileViewState",
        "profile_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/profile/samples/ProfileSamples;

.field private static final sampleFoundingMemberProfileViewStateMetadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

.field private static final sampleLoadingViewState:Lcom/whoop/profile/presentation/ProfileViewState;

.field private static final sampleNetworkErrorViewState:Lcom/whoop/profile/presentation/ProfileViewState;

.field private static final sampleProfileViewState:Lcom/whoop/profile/presentation/ProfileViewState;

.field private static final sampleProfileViewStateMetadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

.field private static final sampleProfileViewStateMetadataWithLongText:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

.field private static final sampleProfileViewStateMetadataWithNullMemberSinceDate:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

.field private static final sampleReportFailureDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

.field private static final sampleReportSuccessDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

.field private static final sampleRequestFailedViewState:Lcom/whoop/profile/presentation/ProfileViewState;

.field private static final sampleSuccessViewState:Lcom/whoop/profile/presentation/ProfileViewState;


# direct methods
.method static constructor <clinit>()V
    .locals 32

    new-instance v0, Lcom/whoop/profile/samples/ProfileSamples;

    invoke-direct {v0}, Lcom/whoop/profile/samples/ProfileSamples;-><init>()V

    sput-object v0, Lcom/whoop/profile/samples/ProfileSamples;->INSTANCE:Lcom/whoop/profile/samples/ProfileSamples;

    new-instance v2, Lkd1/o$a;

    sget-object v0, Lgz0/m0;->WHOOP_LOGO_TEXT:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-direct {v2, v0}, Lkd1/o$a;-><init>(I)V

    new-instance v3, Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0}, Ldc/b;->d(Lx81/d;)I

    move-result v8

    invoke-static {v0}, Ldc/b;->d(Lx81/d;)I

    move-result v7

    new-instance v4, Lkd1/o$c;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const-string v5, "https://lh3.googleusercontent.com/a/ACg8ocI_8VJzPzDcn_3YPD_DHsF_D-6N0SzKpQbuu7ObOHueb4Vodqk=s576-c-no"

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "Boston, US"

    const-string v5, "Kimberly"

    const-string v6, "Taylor"

    const-string v7, "kimberlytaylor"

    invoke-direct/range {v3 .. v9}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    new-instance v4, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;

    sget-object v9, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    const/16 v14, 0x1f0

    const/4 v15, 0x0

    const/4 v5, 0x0

    const-string v6, "Member since"

    const-string v7, "June 2014"

    move-object v8, v9

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v15}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;-><init>(ZLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v8

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    const/16 v9, 0x48

    move-object v6, v3

    const/4 v3, 0x1

    move-object v7, v4

    const-string v4, "EDIT"

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;-><init>(Lkd1/o;ZLjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/profile/presentation/ProfileViewState$UserData;Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/whoop/profile/samples/ProfileSamples;->sampleProfileViewStateMetadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    new-instance v17, Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    invoke-static {v0}, Ldc/b;->d(Lx81/d;)I

    move-result v6

    invoke-static {v0}, Ldc/b;->d(Lx81/d;)I

    move-result v5

    new-instance v2, Lkd1/o$c;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-string v3, "https://lh3.googleusercontent.com/a/ACg8ocI_8VJzPzDcn_3YPD_DHsF_D-6N0SzKpQbuu7ObOHueb4Vodqk=s576-c-no"

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v3, 0x2a

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "San Francisco Bay Area, California, United States"

    const-string v4, "Alexander"

    const-string v5, "Montgomery-Wellington"

    const-string v6, "alexander.montgomery.wellington.thethird"

    move-object v3, v2

    move-object/from16 v2, v17

    invoke-direct/range {v2 .. v8}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    new-instance v18, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;

    const/16 v15, 0x1f0

    const/16 v16, 0x0

    const/4 v6, 0x0

    const-string v7, "Member since"

    const-string v8, "June 2014"

    move-object v9, v11

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-object/from16 v5, v18

    invoke-direct/range {v5 .. v16}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;-><init>(ZLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x49

    const/16 v21, 0x0

    const/4 v14, 0x1

    const-string v15, "EDIT"

    const/16 v19, 0x0

    move-object v12, v1

    invoke-direct/range {v12 .. v21}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;-><init>(Lkd1/o;ZLjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/profile/presentation/ProfileViewState$UserData;Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v12, Lcom/whoop/profile/samples/ProfileSamples;->sampleProfileViewStateMetadataWithLongText:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    new-instance v18, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    invoke-static {v0}, Ldc/b;->d(Lx81/d;)I

    move-result v6

    invoke-static {v0}, Ldc/b;->d(Lx81/d;)I

    move-result v5

    new-instance v2, Lkd1/o$c;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-string v3, "https://lh3.googleusercontent.com/a/ACg8ocI_8VJzPzDcn_3YPD_DHsF_D-6N0SzKpQbuu7ObOHueb4Vodqk=s576-c-no"

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v3, 0x1c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "Austin, TX"

    const-string v3, "Sarah"

    const-string v4, "Johnson"

    const-string v5, "sarahjohnson"

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    new-instance v19, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;

    sget-object v23, Lgz0/m0;->FOUNDING_MEMBER:Lgz0/m0;

    new-instance v2, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    new-instance v10, Lkd1/o$c;

    const/16 v15, 0xe

    const-string v11, "https://example.com/founding-member-icon.png"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "Founding Member"

    const-string v4, "Founding members joined WHOOP when we first launched. A big thank you to them for their early support!"

    invoke-direct {v2, v10, v3, v4}, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v29, 0x1e0

    const/16 v30, 0x0

    const/16 v20, 0x1

    const-string v21, "Member since"

    const-string v22, "February 2012"

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v24, v2

    invoke-direct/range {v19 .. v30}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;-><init>(ZLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x49

    const/16 v22, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const-string v16, "EDIT"

    const/16 v17, 0x0

    const/16 v20, 0x0

    move-object/from16 v13, v18

    move-object/from16 v18, v1

    invoke-direct/range {v13 .. v22}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;-><init>(Lkd1/o;ZLjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/profile/presentation/ProfileViewState$UserData;Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v13

    sput-object v18, Lcom/whoop/profile/samples/ProfileSamples;->sampleFoundingMemberProfileViewStateMetadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    new-instance v19, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    new-instance v24, Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    invoke-static {v0}, Ldc/b;->d(Lx81/d;)I

    move-result v14

    invoke-static {v0}, Ldc/b;->d(Lx81/d;)I

    move-result v13

    new-instance v10, Lkd1/o$c;

    const/4 v15, 0x2

    const/16 v16, 0x0

    const-string v11, "https://lh3.googleusercontent.com/a/ACg8ocI_8VJzPzDcn_3YPD_DHsF_D-6N0SzKpQbuu7ObOHueb4Vodqk=s576-c-no"

    invoke-direct/range {v10 .. v16}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v14, "sarahjohnson"

    const-string v16, "Austin, TX"

    const-string v12, "Sarah"

    const-string v13, "Johnson"

    move-object v15, v6

    move-object v11, v10

    move-object/from16 v10, v24

    invoke-direct/range {v10 .. v16}, Lcom/whoop/profile/presentation/ProfileViewState$UserData;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    new-instance v5, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;

    const/16 v15, 0x1f0

    const/16 v16, 0x0

    const/4 v6, 0x0

    const-string v7, "Member since"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v16}, Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;-><init>(ZLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v27, 0x49

    const/16 v20, 0x0

    const/16 v21, 0x1

    const-string v22, "EDIT"

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v5

    invoke-direct/range {v19 .. v28}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;-><init>(Lkd1/o;ZLjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/profile/presentation/ProfileViewState$UserData;Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v19, Lcom/whoop/profile/samples/ProfileSamples;->sampleProfileViewStateMetadataWithNullMemberSinceDate:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    sget v0, Lcom/whoop/profile/R$string;->profile_report_success_title:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget v0, Lcom/whoop/profile/R$string;->profile_report_success_description:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v0, Lcom/whoop/profile/R$string;->profile_report_dialog_dismiss:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget-object v10, Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$DismissReportDialog;

    new-instance v1, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    const/16 v12, 0xac

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v11, v10

    invoke-direct/range {v1 .. v13}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/whoop/profile/samples/ProfileSamples;->sampleReportSuccessDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    sget v0, Lcom/whoop/profile/R$string;->profile_report_failure_title:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v20

    sget v0, Lcom/whoop/profile/R$string;->profile_report_failure_description:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v24

    sget v0, Lcom/whoop/profile/R$string;->profile_report_dialog_dismiss:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v21

    new-instance v19, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    const/16 v30, 0xac

    const/16 v31, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1

    const/16 v27, 0x0

    move-object/from16 v29, v10

    move-object/from16 v28, v10

    invoke-direct/range {v19 .. v31}, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v19, Lcom/whoop/profile/samples/ProfileSamples;->sampleReportFailureDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    new-instance v13, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    sget-object v7, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v7}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v1

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x2d

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object v15, v0

    invoke-direct/range {v13 .. v21}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Lcom/whoop/profile/samples/ProfileSamples;->sampleLoadingViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v13, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    invoke-virtual {v7}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v1

    sget-object v2, Lcom/whoop/profile/presentation/ProfileEvent$Refresh;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$Refresh;

    sget-object v4, Lcom/whoop/profile/presentation/ProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$GoBack;

    const/4 v5, 0x4

    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v0

    invoke-direct/range {v13 .. v21}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Lcom/whoop/profile/samples/ProfileSamples;->sampleNetworkErrorViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v13, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v19, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    invoke-virtual {v7}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v20

    const/16 v24, 0x4

    const/16 v25, 0x0

    move-object/from16 v21, v2

    move-object/from16 v23, v4

    invoke-direct/range {v19 .. v25}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x2d

    const/16 v21, 0x0

    move-object/from16 v15, v19

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v21}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Lcom/whoop/profile/samples/ProfileSamples;->sampleRequestFailedViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v13, Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    invoke-virtual {v7}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v1

    const/16 v5, 0xe

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;Lcom/whoop/profile/presentation/ProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v0

    invoke-direct/range {v13 .. v21}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Lcom/whoop/profile/samples/ProfileSamples;->sampleSuccessViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    new-instance v0, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/whoop/profile/presentation/ProfileViewState;

    const/16 v20, 0xd

    const/4 v15, 0x0

    move-object/from16 v19, v0

    invoke-direct/range {v13 .. v21}, Lcom/whoop/profile/presentation/ProfileViewState;-><init>(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Lcom/whoop/profile/samples/ProfileSamples;->sampleProfileViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/profile/samples/ProfileSamples;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getSampleFoundingMemberProfileViewStateMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleFoundingMemberProfileViewStateMetadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    return-object v0
.end method

.method public final getSampleLoadingViewState()Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleLoadingViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    return-object v0
.end method

.method public final getSampleNetworkErrorViewState()Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleNetworkErrorViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    return-object v0
.end method

.method public final getSampleProfileViewState()Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleProfileViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    return-object v0
.end method

.method public final getSampleProfileViewStateMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleProfileViewStateMetadata:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    return-object v0
.end method

.method public final getSampleProfileViewStateMetadataWithLongText()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleProfileViewStateMetadataWithLongText:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    return-object v0
.end method

.method public final getSampleProfileViewStateMetadataWithNullMemberSinceDate()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleProfileViewStateMetadataWithNullMemberSinceDate:Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    return-object v0
.end method

.method public final getSampleReportFailureDialog()Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleReportFailureDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    return-object v0
.end method

.method public final getSampleReportSuccessDialog()Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleReportSuccessDialog:Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    return-object v0
.end method

.method public final getSampleRequestFailedViewState()Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleRequestFailedViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    return-object v0
.end method

.method public final getSampleSuccessViewState()Lcom/whoop/profile/presentation/ProfileViewState;
    .locals 1

    sget-object v0, Lcom/whoop/profile/samples/ProfileSamples;->sampleSuccessViewState:Lcom/whoop/profile/presentation/ProfileViewState;

    return-object v0
.end method
