.class public final Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;,
        Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0015\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 W2\u00020\u0001:\u0002XWB\u00db\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017B\u00d9\u0001\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001eJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\u001eJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001eJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\u001eJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010\u001eJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010\u001eJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010\u001eJ\u00ec\u0001\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00083\u0010\u001eJ\u0010\u00104\u001a\u00020\u0018H\u00d6\u0001\u00a2\u0006\u0004\u00084\u00105J\u001a\u00108\u001a\u0002072\u0008\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00088\u00109J\'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001\u00a2\u0006\u0004\u0008@\u0010AR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010C\u001a\u0004\u0008D\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010C\u001a\u0004\u0008E\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010C\u001a\u0004\u0008F\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010C\u001a\u0004\u0008G\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010C\u001a\u0004\u0008H\u0010\u001eR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010C\u001a\u0004\u0008I\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010C\u001a\u0004\u0008J\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010C\u001a\u0004\u0008K\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010C\u001a\u0004\u0008L\u0010\u001eR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008M\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010C\u001a\u0004\u0008N\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010C\u001a\u0004\u0008O\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008P\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010C\u001a\u0004\u0008Q\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010C\u001a\u0004\u0008R\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010C\u001a\u0004\u0008S\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010C\u001a\u0004\u0008T\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010C\u001a\u0004\u0008U\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010C\u001a\u0004\u0008V\u0010\u001e\u00a8\u0006Y"
    }
    d2 = {
        "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;",
        "",
        "",
        "state",
        "screenTitleDisplay",
        "headlineDisplay",
        "bodyDisplay",
        "learnMoreTextDisplay",
        "learnMoreLink",
        "updateAccountTextDisplay",
        "updateAccountLink",
        "confirmationTextDisplay",
        "recipientEmailDisplay",
        "recipientEmailLabelDisplay",
        "submitButtonTextDisplay",
        "submissionLoadingTextDisplay",
        "submissionSuccessTextDisplay",
        "exportUnavailableSectionIcon",
        "exportUnavailableSectionHeadlineDisplay",
        "exportUnavailableSectionBodyDisplay",
        "helpLinkTextDisplay",
        "helpLink",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
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
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;",
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
        "write$Self$member_data_export_release",
        "(Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getState",
        "getScreenTitleDisplay",
        "getHeadlineDisplay",
        "getBodyDisplay",
        "getLearnMoreTextDisplay",
        "getLearnMoreLink",
        "getUpdateAccountTextDisplay",
        "getUpdateAccountLink",
        "getConfirmationTextDisplay",
        "getRecipientEmailDisplay",
        "getRecipientEmailLabelDisplay",
        "getSubmitButtonTextDisplay",
        "getSubmissionLoadingTextDisplay",
        "getSubmissionSuccessTextDisplay",
        "getExportUnavailableSectionIcon",
        "getExportUnavailableSectionHeadlineDisplay",
        "getExportUnavailableSectionBodyDisplay",
        "getHelpLinkTextDisplay",
        "getHelpLink",
        "Companion",
        "$serializer",
        "member-data-export_release"
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

.field public static final Companion:Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$Companion;


# instance fields
.field private final bodyDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "body_display"
    .end annotation
.end field

.field private final confirmationTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "confirmation_text_display"
    .end annotation
.end field

.field private final exportUnavailableSectionBodyDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "export_unavailable_section_body_display"
    .end annotation
.end field

.field private final exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "export_unavailable_section_headline_display"
    .end annotation
.end field

.field private final exportUnavailableSectionIcon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "export_unavailable_section_icon"
    .end annotation
.end field

.field private final headlineDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "headline_display"
    .end annotation
.end field

.field private final helpLink:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "help_link"
    .end annotation
.end field

.field private final helpLinkTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "help_link_text_display"
    .end annotation
.end field

.field private final learnMoreLink:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "learn_more_link"
    .end annotation
.end field

.field private final learnMoreTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "learn_more_text_display"
    .end annotation
.end field

.field private final recipientEmailDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recipient_email_display"
    .end annotation
.end field

.field private final recipientEmailLabelDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recipient_email_label_display"
    .end annotation
.end field

.field private final screenTitleDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "screen_title_display"
    .end annotation
.end field

.field private final state:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "state"
    .end annotation
.end field

.field private final submissionLoadingTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "submission_loading_text_display"
    .end annotation
.end field

.field private final submissionSuccessTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "submission_success_text_display"
    .end annotation
.end field

.field private final submitButtonTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "submit_button_text_display"
    .end annotation
.end field

.field private final updateAccountLink:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "update_account_link"
    .end annotation
.end field

.field private final updateAccountTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "update_account_text_display"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->Companion:Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0xf

    const/16 v1, 0xf

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->INSTANCE:Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;

    invoke-virtual {v0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    :goto_2
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    :goto_3
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p10, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p11, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p12, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p13, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_a

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    :goto_9
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_b

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    :goto_a
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_c

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    goto :goto_b

    :cond_c
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    :goto_b
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_d

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    :goto_c
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_e

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    goto :goto_d

    :cond_e
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    :goto_d
    const/high16 p2, 0x40000

    and-int/2addr p1, p2

    if-nez p1, :cond_f

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    return-void

    :cond_f
    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenTitleDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headlineDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    .line 16
    iput-object p14, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object/from16 v10, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move-object v12, v2

    goto :goto_4

    :cond_4
    move-object/from16 v12, p9

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    move-object v13, v2

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_6

    move-object v14, v2

    goto :goto_6

    :cond_6
    move-object/from16 v14, p11

    :goto_6
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_7

    move-object v15, v2

    goto :goto_7

    :cond_7
    move-object/from16 v15, p12

    :goto_7
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_8

    move-object/from16 v16, v2

    goto :goto_8

    :cond_8
    move-object/from16 v16, p13

    :goto_8
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_9

    move-object/from16 v17, v2

    goto :goto_9

    :cond_9
    move-object/from16 v17, p14

    :goto_9
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_a

    move-object/from16 v18, v2

    goto :goto_a

    :cond_a
    move-object/from16 v18, p15

    :goto_a
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v19, v2

    goto :goto_b

    :cond_b
    move-object/from16 v19, p16

    :goto_b
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v20, v2

    goto :goto_c

    :cond_c
    move-object/from16 v20, p17

    :goto_c
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v21, v2

    goto :goto_d

    :cond_d
    move-object/from16 v21, p18

    :goto_d
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_e

    move-object/from16 v22, v2

    :goto_e
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    goto :goto_f

    :cond_e
    move-object/from16 v22, p19

    goto :goto_e

    .line 22
    :goto_f
    invoke-direct/range {v3 .. v22}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

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
    invoke-virtual/range {p1 .. p20}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$member_data_export_release(Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    if-eqz v1, :cond_15

    :goto_a
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    if-eqz v1, :cond_17

    :goto_b
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_18

    goto :goto_c

    :cond_18
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    if-eqz v1, :cond_19

    :goto_c
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    if-eqz v1, :cond_1b

    :goto_d
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1b
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    if-eqz v1, :cond_1d

    :goto_e
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;
    .locals 21

    const-string v0, "state"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenTitleDisplay"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headlineDisplay"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    invoke-direct/range {v1 .. v20}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getBodyDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getConfirmationTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getExportUnavailableSectionBodyDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getExportUnavailableSectionHeadlineDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getExportUnavailableSectionIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeadlineDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getHelpLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    return-object v0
.end method

.method public final getHelpLinkTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getLearnMoreLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    return-object v0
.end method

.method public final getLearnMoreTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecipientEmailDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecipientEmailLabelDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getScreenTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmissionLoadingTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmissionSuccessTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmitButtonTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdateAccountLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdateAccountTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    if-nez v1, :cond_e

    goto :goto_e

    :cond_e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_e
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->state:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->screenTitleDisplay:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->headlineDisplay:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->bodyDisplay:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreTextDisplay:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->learnMoreLink:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountTextDisplay:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->updateAccountLink:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->confirmationTextDisplay:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailDisplay:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->recipientEmailLabelDisplay:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submitButtonTextDisplay:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionLoadingTextDisplay:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->submissionSuccessTextDisplay:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionIcon:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionHeadlineDisplay:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->exportUnavailableSectionBodyDisplay:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLinkTextDisplay:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->helpLink:Ljava/lang/String;

    const-string v0, ", screenTitleDisplay="

    move-object/from16 v20, v15

    const-string v15, ", headlineDisplay="

    move-object/from16 v21, v13

    const-string v13, "IntermediateMemberDataExportDto(state="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bodyDisplay="

    const-string v2, ", learnMoreTextDisplay="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", learnMoreLink="

    const-string v2, ", updateAccountTextDisplay="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", updateAccountLink="

    const-string v2, ", confirmationTextDisplay="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", recipientEmailDisplay="

    const-string v2, ", recipientEmailLabelDisplay="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", submitButtonTextDisplay="

    const-string v2, ", submissionLoadingTextDisplay="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", submissionSuccessTextDisplay="

    const-string v2, ", exportUnavailableSectionIcon="

    move-object/from16 v3, v21

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", exportUnavailableSectionHeadlineDisplay="

    const-string v2, ", exportUnavailableSectionBodyDisplay="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", helpLinkTextDisplay="

    const-string v2, ", helpLink="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    move-object/from16 v2, v20

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
