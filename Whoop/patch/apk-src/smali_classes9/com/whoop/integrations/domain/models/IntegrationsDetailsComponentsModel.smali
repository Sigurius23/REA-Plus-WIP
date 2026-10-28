.class public final Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;,
        Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u00081\u0008\u0087\u0008\u0018\u0000 \u0086\u00012\u00020\u0001:\u0004\u0087\u0001\u0086\u0001B\u00f9\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0010\u0008\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\"\u0010#B\u008f\u0002\u0008\u0010\u0012\u0006\u0010%\u001a\u00020$\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u0008\u0010\'\u001a\u0004\u0018\u00010&\u00a2\u0006\u0004\u0008\"\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*J\u0010\u0010,\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010*J\u0010\u0010-\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010*J\u0010\u0010.\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010*J\u0010\u0010/\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010*J\u0012\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010*J\u0010\u00105\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010*J\u0012\u00106\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010*J\u0012\u00107\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010*J\u0012\u00108\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00088\u0010*J\u0012\u00109\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010*J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010*J\u0012\u0010;\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010*J\u0012\u0010>\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u0018\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010AJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008E\u0010*J\u0012\u0010F\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u0010IJ\u00a6\u0002\u0010J\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\u0008\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 H\u00c6\u0001\u00a2\u0006\u0004\u0008J\u0010KJ\u0010\u0010L\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008L\u0010*J\u0010\u0010M\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008M\u0010NJ\u001a\u0010P\u001a\u00020\u000b2\u0008\u0010O\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008P\u0010QJ\'\u0010Z\u001a\u00020W2\u0006\u0010R\u001a\u00020\u00002\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0001\u00a2\u0006\u0004\u0008X\u0010YR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010[\u001a\u0004\u0008\\\u0010*R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010[\u001a\u0004\u0008]\u0010*R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010[\u001a\u0004\u0008^\u0010*R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010[\u001a\u0004\u0008_\u0010*R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010[\u0012\u0004\u0008a\u0010b\u001a\u0004\u0008`\u0010*R \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010[\u0012\u0004\u0008d\u0010b\u001a\u0004\u0008c\u0010*R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010e\u0012\u0004\u0008g\u0010b\u001a\u0004\u0008f\u00101R\u001a\u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010h\u001a\u0004\u0008i\u00103R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010[\u0012\u0004\u0008k\u0010b\u001a\u0004\u0008j\u0010*R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010[\u0012\u0004\u0008m\u0010b\u001a\u0004\u0008l\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010[\u001a\u0004\u0008n\u0010*R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010[\u0012\u0004\u0008p\u0010b\u001a\u0004\u0008o\u0010*R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010[\u0012\u0004\u0008r\u0010b\u001a\u0004\u0008q\u0010*R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010[\u0012\u0004\u0008t\u0010b\u001a\u0004\u0008s\u0010*R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010[\u0012\u0004\u0008v\u0010b\u001a\u0004\u0008u\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010w\u001a\u0004\u0008x\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010[\u001a\u0004\u0008y\u0010*R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010z\u001a\u0004\u0008{\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010|\u001a\u0004\u0008}\u0010AR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010~\u001a\u0004\u0008\u007f\u0010CR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u001c\u0010|\u001a\u0005\u0008\u0080\u0001\u0010AR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\r\n\u0004\u0008\u001d\u0010[\u001a\u0005\u0008\u0081\u0001\u0010*R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u001f\u0010\u0082\u0001\u001a\u0005\u0008\u0083\u0001\u0010GR\u001e\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008!\u0010\u0084\u0001\u001a\u0005\u0008\u0085\u0001\u0010I\u00a8\u0006\u0088\u0001"
    }
    d2 = {
        "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;",
        "",
        "",
        "id",
        "reportingKey",
        "backgroundImageUrl",
        "iconUrl",
        "title",
        "description",
        "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
        "learnMoreButton",
        "",
        "connected",
        "connectedStatus",
        "buttonText",
        "connectionUrl",
        "disconnectPopupTitle",
        "disconnectPopupDescription",
        "disconnectPopupPrimaryButton",
        "disconnectPopupSecondaryButton",
        "shouldPerformFullOauth",
        "providerId",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "upsellCtaTile",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "overridePrimaryButton",
        "",
        "designItems",
        "footerDisclaimer",
        "lastUpdated",
        "Lcom/whoop/design/models/MarkdownTextModel;",
        "descriptionFootnote",
        "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;",
        "privacyControls",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
        "component8",
        "()Z",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "()Ljava/lang/Boolean;",
        "component17",
        "component18",
        "()Lcom/whoop/design/models/items/CtaTileModel;",
        "component19",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component20",
        "()Ljava/util/List;",
        "component21",
        "component22",
        "component23",
        "()Lcom/whoop/design/models/MarkdownTextModel;",
        "component24",
        "()Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;",
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
        "(Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getReportingKey",
        "getBackgroundImageUrl",
        "getIconUrl",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getDescription",
        "getDescription$annotations",
        "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
        "getLearnMoreButton",
        "getLearnMoreButton$annotations",
        "Z",
        "getConnected",
        "getConnectedStatus",
        "getConnectedStatus$annotations",
        "getButtonText",
        "getButtonText$annotations",
        "getConnectionUrl",
        "getDisconnectPopupTitle",
        "getDisconnectPopupTitle$annotations",
        "getDisconnectPopupDescription",
        "getDisconnectPopupDescription$annotations",
        "getDisconnectPopupPrimaryButton",
        "getDisconnectPopupPrimaryButton$annotations",
        "getDisconnectPopupSecondaryButton",
        "getDisconnectPopupSecondaryButton$annotations",
        "Ljava/lang/Boolean;",
        "getShouldPerformFullOauth",
        "getProviderId",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "getUpsellCtaTile",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getOverridePrimaryButton",
        "Ljava/util/List;",
        "getDesignItems",
        "getFooterDisclaimer",
        "getLastUpdated",
        "Lcom/whoop/design/models/MarkdownTextModel;",
        "getDescriptionFootnote",
        "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;",
        "getPrivacyControls",
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

.field public static final Companion:Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$Companion;


# instance fields
.field private final backgroundImageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "background_image_url"
    .end annotation
.end field

.field private final buttonText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "button_text_display"
    .end annotation
.end field

.field private final connected:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "connected"
    .end annotation
.end field

.field private final connectedStatus:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "connected_status_display"
    .end annotation
.end field

.field private final connectionUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "connection_url"
    .end annotation
.end field

.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description_display"
    .end annotation
.end field

.field private final descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description_footnote"
    .end annotation
.end field

.field private final designItems:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "design_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final disconnectPopupDescription:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disconnect_popup_description_display"
    .end annotation
.end field

.field private final disconnectPopupPrimaryButton:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disconnect_popup_primary_button_display"
    .end annotation
.end field

.field private final disconnectPopupSecondaryButton:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disconnect_popup_secondary_button_display"
    .end annotation
.end field

.field private final disconnectPopupTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "disconnect_popup_title_display"
    .end annotation
.end field

.field private final footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "footer_disclaimer"
    .end annotation
.end field

.field private final iconUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon_url"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final lastUpdated:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last_updated"
    .end annotation
.end field

.field private final learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "learn_more"
    .end annotation
.end field

.field private final overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "override_primary_button"
    .end annotation
.end field

.field private final privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "privacy_controls"
    .end annotation
.end field

.field private final providerId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "provider_id"
    .end annotation
.end field

.field private final reportingKey:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "reporting_key"
    .end annotation
.end field

.field private final shouldPerformFullOauth:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "should_perform_full_oauth"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title_display"
    .end annotation
.end field

.field private final upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "upsell_cta_tile"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->Companion:Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ldq2/a;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Ldq2/a;

    const/4 v6, 0x6

    invoke-direct {v5, v6}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Ldq2/a;

    const/4 v8, 0x7

    invoke-direct {v7, v8}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x18

    new-array v7, v7, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v7, v9

    const/4 v9, 0x1

    aput-object v1, v7, v9

    const/4 v9, 0x2

    aput-object v1, v7, v9

    const/4 v9, 0x3

    aput-object v1, v7, v9

    const/4 v9, 0x4

    aput-object v1, v7, v9

    aput-object v1, v7, v4

    aput-object v1, v7, v6

    aput-object v1, v7, v8

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

    aput-object v1, v7, v0

    const/16 v0, 0x10

    aput-object v1, v7, v0

    const/16 v0, 0x11

    aput-object v1, v7, v0

    const/16 v0, 0x12

    aput-object v3, v7, v0

    const/16 v0, 0x13

    aput-object v5, v7, v0

    const/16 v0, 0x14

    aput-object v2, v7, v0

    const/16 v0, 0x15

    aput-object v1, v7, v0

    const/16 v0, 0x16

    aput-object v1, v7, v0

    const/16 v0, 0x17

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x3ffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;

    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    iput-boolean p9, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    iput-object p10, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_0

    :cond_1
    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    :goto_0
    const/high16 p2, 0x80000

    and-int/2addr p2, p1

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    goto :goto_1

    :cond_2
    move-object/from16 p2, p21

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    :goto_1
    const/high16 p2, 0x100000

    and-int/2addr p2, p1

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_2

    :cond_3
    move-object/from16 p2, p22

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    :goto_2
    const/high16 p2, 0x200000

    and-int/2addr p2, p1

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 p2, p23

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    :goto_3
    const/high16 p2, 0x400000

    and-int/2addr p2, p1

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    goto :goto_4

    :cond_5
    move-object/from16 p2, p24

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    :goto_4
    const/high16 p2, 0x800000

    and-int/2addr p1, p2

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    return-void

    :cond_6
    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CtaTileModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/MarkdownTextModel;",
            "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;",
            ")V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportingKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundImageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonText"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    .line 10
    iput-boolean p8, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    .line 11
    iput-object p9, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    .line 16
    iput-object p14, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    move-object/from16 p1, p24

    .line 26
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 27

    const/high16 v0, 0x40000

    and-int v0, p25, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object/from16 v21, v1

    goto :goto_0

    :cond_0
    move-object/from16 v21, p19

    :goto_0
    const/high16 v0, 0x80000

    and-int v0, p25, v0

    if-eqz v0, :cond_1

    move-object/from16 v22, v1

    goto :goto_1

    :cond_1
    move-object/from16 v22, p20

    :goto_1
    const/high16 v0, 0x100000

    and-int v0, p25, v0

    if-eqz v0, :cond_2

    move-object/from16 v23, v1

    goto :goto_2

    :cond_2
    move-object/from16 v23, p21

    :goto_2
    const/high16 v0, 0x200000

    and-int v0, p25, v0

    if-eqz v0, :cond_3

    move-object/from16 v24, v1

    goto :goto_3

    :cond_3
    move-object/from16 v24, p22

    :goto_3
    const/high16 v0, 0x400000

    and-int v0, p25, v0

    if-eqz v0, :cond_4

    move-object/from16 v25, v1

    goto :goto_4

    :cond_4
    move-object/from16 v25, p23

    :goto_4
    const/high16 v0, 0x800000

    and-int v0, p25, v0

    if-eqz v0, :cond_5

    move-object/from16 v26, v1

    :goto_5
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    move-object/from16 v20, p18

    goto :goto_6

    :cond_5
    move-object/from16 v26, p24

    goto :goto_5

    .line 27
    :goto_6
    invoke-direct/range {v2 .. v26}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;ILjava/lang/Object;)Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p25

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p25, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p25, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p25, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p25, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p25, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p25, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p25, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p25, v16

    if-eqz v16, :cond_17

    move-object/from16 p9, v1

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    move-object/from16 p24, p9

    move-object/from16 p25, v1

    :goto_17
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_18

    :cond_17
    move-object/from16 p25, p24

    move-object/from16 p24, v1

    goto :goto_17

    :goto_18
    invoke-virtual/range {p1 .. p25}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getButtonText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "button_text_display"
    .end annotation

    return-void
.end method

.method public static synthetic getConnectedStatus$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "connected_status_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDescription$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "description_display"
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

.method public static synthetic getDisconnectPopupPrimaryButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "disconnect_popup_primary_button_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDisconnectPopupSecondaryButton$annotations()V
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

.method public static synthetic getLearnMoreButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "learn_more"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$integrations_release(Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-boolean v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    const/16 v4, 0xf

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x10

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/CtaTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CtaTileModel$$serializer;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    const/16 v4, 0x11

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x12

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v3, :cond_1

    :goto_0
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v2, 0x13

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    if-eqz v3, :cond_3

    :goto_1
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v2, 0x14

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v3, :cond_5

    :goto_2
    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0x15

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v0, 0x16

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/design/models/MarkdownTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/MarkdownTextModel$$serializer;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0x17

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel$$serializer;

    iget-object p0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public final component19()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    return-object v0
.end method

.method public final component21()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Lcom/whoop/design/models/MarkdownTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    return-object v0
.end method

.method public final component24()Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CtaTileModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/MarkdownTextModel;",
            "Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;",
            ")",
            "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportingKey"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundImageUrl"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonText"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    invoke-direct/range {v1 .. v25}, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    iget-boolean v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    iget-object p1, p1, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    return v2

    :cond_19
    return v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getButtonText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    return v0
.end method

.method public final getConnectedStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectionUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptionFootnote()Lcom/whoop/design/models/MarkdownTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    return-object v0
.end method

.method public final getDesignItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    return-object v0
.end method

.method public final getDisconnectPopupDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectPopupPrimaryButton()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectPopupSecondaryButton()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectPopupTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooterDisclaimer()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastUpdated()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    return-object v0
.end method

.method public final getLearnMoreButton()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    return-object v0
.end method

.method public final getOverridePrimaryButton()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getPrivacyControls()Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    return-object v0
.end method

.method public final getProviderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getReportingKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldPerformFullOauth()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpsellCtaTile()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CtaTileModel;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Lcom/whoop/design/models/MarkdownTextModel;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    if-nez v1, :cond_f

    goto :goto_f

    :cond_f
    invoke-virtual {v1}, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;->hashCode()I

    move-result v3

    :goto_f
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->reportingKey:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->iconUrl:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->title:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->description:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    iget-boolean v8, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connected:Z

    iget-object v9, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectedStatus:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->buttonText:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->connectionUrl:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupTitle:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupDescription:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupPrimaryButton:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->disconnectPopupSecondaryButton:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->shouldPerformFullOauth:Ljava/lang/Boolean;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->providerId:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->upsellCtaTile:Lcom/whoop/design/models/items/CtaTileModel;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->overridePrimaryButton:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->designItems:Ljava/util/List;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->lastUpdated:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;->privacyControls:Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsModel;

    const-string v0, ", reportingKey="

    move-object/from16 v25, v15

    const-string v15, ", backgroundImageUrl="

    move-object/from16 v26, v13

    const-string v13, "IntegrationsDetailsComponentsModel(id="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconUrl="

    const-string v2, ", title="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", description="

    const-string v2, ", learnMoreButton="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", connectedStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonText="

    const-string v2, ", connectionUrl="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", disconnectPopupTitle="

    const-string v2, ", disconnectPopupDescription="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", disconnectPopupPrimaryButton="

    const-string v2, ", disconnectPopupSecondaryButton="

    move-object/from16 v3, v26

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", shouldPerformFullOauth="

    const-string v2, ", providerId="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v4, v3, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", upsellCtaTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", overridePrimaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", designItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footerDisclaimer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastUpdated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", descriptionFootnote="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", privacyControls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
