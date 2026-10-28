.class public final Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$$serializer;,
        Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0087\u0008\u0018\u0000 e2\u00020\u0001:\u0002feB\u00af\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u00cb\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0018\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010 J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010 J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010 J\u0010\u0010&\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\"J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010 J\u0012\u00103\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010 J\u0012\u00104\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010 J\u0012\u00105\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010 J\u00dc\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00088\u0010 J\u0010\u00109\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u001a\u0010<\u001a\u00020\u00042\u0008\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001\u00a2\u0006\u0004\u0008D\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010G\u001a\u0004\u0008H\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010I\u001a\u0004\u0008\u0005\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010G\u0012\u0004\u0008K\u0010L\u001a\u0004\u0008J\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010G\u001a\u0004\u0008M\u0010 R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010G\u001a\u0004\u0008N\u0010 R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010I\u0012\u0004\u0008P\u0010L\u001a\u0004\u0008O\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010G\u001a\u0004\u0008Q\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010G\u001a\u0004\u0008R\u0010 R\"\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010G\u0012\u0004\u0008T\u0010L\u001a\u0004\u0008S\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010U\u001a\u0004\u0008V\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010G\u001a\u0004\u0008W\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010X\u001a\u0004\u0008Y\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010X\u001a\u0004\u0008Z\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010[\u001a\u0004\u0008\\\u00101R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010G\u0012\u0004\u0008^\u0010L\u001a\u0004\u0008]\u0010 R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010G\u0012\u0004\u0008`\u0010L\u001a\u0004\u0008_\u0010 R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010G\u0012\u0004\u0008b\u0010L\u001a\u0004\u0008a\u0010 R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010G\u0012\u0004\u0008d\u0010L\u001a\u0004\u0008c\u0010 \u00a8\u0006g"
    }
    d2 = {
        "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;",
        "",
        "",
        "id",
        "",
        "isWhoopBuilt",
        "integrationId3P",
        "sectionTitle",
        "ctaTitle",
        "connected",
        "connectedStatusDisplay",
        "ctaConnectionUrl",
        "ctaDeepLinkUrl",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "infoCallout",
        "bottomDescriptionText",
        "showConnectedStatusIcon",
        "canShowDisconnectModal",
        "Lny0/p;",
        "ctaButtonStyle",
        "disconnectPopupTitle",
        "disconnectPopupDescription",
        "disconnectPopupPrimaryButtonTitle",
        "disconnectPopupSecondaryButtonTitle",
        "<init>",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Z",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "component11",
        "component12",
        "()Ljava/lang/Boolean;",
        "component13",
        "component14",
        "()Lny0/p;",
        "component15",
        "component16",
        "component17",
        "component18",
        "copy",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;",
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
        "write$Self$integrations_release",
        "(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Z",
        "getIntegrationId3P",
        "getIntegrationId3P$annotations",
        "()V",
        "getSectionTitle",
        "getCtaTitle",
        "getConnected",
        "getConnected$annotations",
        "getConnectedStatusDisplay",
        "getCtaConnectionUrl",
        "getCtaDeepLinkUrl",
        "getCtaDeepLinkUrl$annotations",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getInfoCallout",
        "getBottomDescriptionText",
        "Ljava/lang/Boolean;",
        "getShowConnectedStatusIcon",
        "getCanShowDisconnectModal",
        "Lny0/p;",
        "getCtaButtonStyle",
        "getDisconnectPopupTitle",
        "getDisconnectPopupTitle$annotations",
        "getDisconnectPopupDescription",
        "getDisconnectPopupDescription$annotations",
        "getDisconnectPopupPrimaryButtonTitle",
        "getDisconnectPopupPrimaryButtonTitle$annotations",
        "getDisconnectPopupSecondaryButtonTitle",
        "getDisconnectPopupSecondaryButtonTitle$annotations",
        "Companion",
        "$serializer",
        "integrations_release"
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

.field public static final Companion:Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$Companion;


# instance fields
.field private final bottomDescriptionText:Ljava/lang/String;

.field private final canShowDisconnectModal:Ljava/lang/Boolean;

.field private final connected:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "section_connected"
    .end annotation
.end field

.field private final connectedStatusDisplay:Ljava/lang/String;

.field private final ctaButtonStyle:Lny0/p;

.field private final ctaConnectionUrl:Ljava/lang/String;

.field private final ctaDeepLinkUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta_deeplink_url"
    .end annotation
.end field

.field private final ctaTitle:Ljava/lang/String;

.field private final disconnectPopupDescription:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disconnect_popup_description_display"
    .end annotation
.end field

.field private final disconnectPopupPrimaryButtonTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disconnect_popup_primary_button_display"
    .end annotation
.end field

.field private final disconnectPopupSecondaryButtonTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disconnect_popup_secondary_button_display"
    .end annotation
.end field

.field private final disconnectPopupTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disconnect_popup_title_display"
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final integrationId3P:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "integration_id_3p"
    .end annotation
.end field

.field private final isWhoopBuilt:Z

.field private final sectionTitle:Ljava/lang/String;

.field private final showConnectedStatusIcon:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->Companion:Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$Companion;

    sget v0, Lcom/whoop/design/models/InfoCalloutTileModel;->$stable:I

    sput v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lej1/a;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lej1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x12

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v1, v2, v3

    const/4 v3, 0x7

    aput-object v1, v2, v3

    const/16 v3, 0x8

    aput-object v1, v2, v3

    const/16 v3, 0x9

    aput-object v1, v2, v3

    const/16 v3, 0xa

    aput-object v1, v2, v3

    const/16 v3, 0xb

    aput-object v1, v2, v3

    const/16 v3, 0xc

    aput-object v1, v2, v3

    const/16 v3, 0xd

    aput-object v0, v2, v3

    const/16 v0, 0xe

    aput-object v1, v2, v0

    const/16 v0, 0xf

    aput-object v1, v2, v0

    const/16 v0, 0x10

    aput-object v1, v2, v0

    const/16 v0, 0x11

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x3ffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$$serializer;

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    iput-object p4, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    iput-object p8, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iput-object p12, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedStatusDisplay"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    .line 9
    iput-object p7, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    .line 13
    iput-object p11, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    .line 15
    iput-object p13, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    .line 16
    iput-object p14, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.button.IconButtonStyle"

    invoke-static {}, Lny0/p;->values()[Lny0/p;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p19, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p19, v16

    if-eqz v16, :cond_11

    move-object/from16 p3, v1

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    move-object/from16 p18, p3

    move-object/from16 p19, v1

    :goto_11
    move-object/from16 p17, p2

    move-object/from16 p16, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

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

    goto :goto_12

    :cond_11
    move-object/from16 p19, p18

    move-object/from16 p18, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p19}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->copy(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getConnected$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "section_connected"
    .end annotation

    return-void
.end method

.method public static synthetic getCtaDeepLinkUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cta_deeplink_url"
    .end annotation

    return-void
.end method

.method public static synthetic getDisconnectPopupDescription$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "disconnect_popup_description_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDisconnectPopupPrimaryButtonTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "disconnect_popup_primary_button_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDisconnectPopupSecondaryButtonTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "disconnect_popup_secondary_button_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDisconnectPopupTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "disconnect_popup_title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getIntegrationId3P$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "integration_id_3p"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$integrations_release(Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x5

    iget-boolean v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/16 v4, 0x9

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    const/16 v4, 0xb

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xc

    iget-object v4, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xe

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xf

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x10

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x11

    iget-object p0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component13()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component14()Lny0/p;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;
    .locals 20

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionTitle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaTitle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectedStatusDisplay"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v7, p6

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

    invoke-direct/range {v1 .. v19}, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lny0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    iget-boolean v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    iget-boolean v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getBottomDescriptionText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    return-object v0
.end method

.method public final getCanShowDisconnectModal()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getConnected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    return v0
.end method

.method public final getConnectedStatusDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaButtonStyle()Lny0/p;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    return-object v0
.end method

.method public final getCtaConnectionUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaDeepLinkUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectPopupDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectPopupPrimaryButtonTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectPopupSecondaryButtonTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectPopupTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInfoCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getIntegrationId3P()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

    return-object v0
.end method

.method public final getSectionTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowConnectedStatusIcon()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    if-nez v1, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    return v0
.end method

.method public final isWhoopBuilt()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->id:Ljava/lang/String;

    iget-boolean v2, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->isWhoopBuilt:Z

    iget-object v3, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->integrationId3P:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->sectionTitle:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaTitle:Ljava/lang/String;

    iget-boolean v6, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connected:Z

    iget-object v7, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->connectedStatusDisplay:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaConnectionUrl:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaDeepLinkUrl:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->infoCallout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object v11, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->bottomDescriptionText:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->showConnectedStatusIcon:Ljava/lang/Boolean;

    iget-object v13, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->canShowDisconnectModal:Ljava/lang/Boolean;

    iget-object v14, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->ctaButtonStyle:Lny0/p;

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupTitle:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupDescription:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupPrimaryButtonTitle:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;->disconnectPopupSecondaryButtonTitle:Ljava/lang/String;

    const-string v0, ", isWhoopBuilt="

    move-object/from16 v19, v15

    const-string v15, ", integrationId3P="

    move-object/from16 v20, v14

    const-string v14, "IntegrationsConnectionSectionRowModel(id="

    invoke-static {v14, v1, v0, v15, v2}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sectionTitle="

    const-string v2, ", ctaTitle="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", connected="

    const-string v2, ", connectedStatusDisplay="

    invoke-static {v0, v5, v1, v6, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", ctaConnectionUrl="

    const-string v2, ", ctaDeepLinkUrl="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", infoCallout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomDescriptionText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", showConnectedStatusIcon="

    const-string v2, ", canShowDisconnectModal="

    invoke-static {v12, v11, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaButtonStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disconnectPopupTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", disconnectPopupDescription="

    const-string v2, ", disconnectPopupPrimaryButtonTitle="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", disconnectPopupSecondaryButtonTitle="

    const-string v2, ")"

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
