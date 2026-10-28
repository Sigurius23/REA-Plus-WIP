.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008*\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008/\u0008\u0087\u0008\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0088\u0001\u0087\u0001B\u0085\u0002\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008$\u0010%B\u00cd\u0002\u0008\u0010\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\'\u00a2\u0006\u0004\u0008$\u0010)J\u0016\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010-J\u0010\u0010/\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00100J\u0010\u00102\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00082\u00100J\u0010\u00103\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00100J\u0010\u00104\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00100J\u0010\u00105\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00100J\u0010\u00106\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00100J\u0010\u00107\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00100J\u0010\u00108\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00100J\u0010\u00109\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00089\u00100J\u0010\u0010:\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u00100J\u0010\u0010;\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u00100J\u0010\u0010<\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u00100J\u0010\u0010=\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u00100J\u0010\u0010>\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u00100J\u0010\u0010?\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u00100J\u0010\u0010@\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u00100J\u0010\u0010A\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u00100J\u0010\u0010B\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u00100J\u0010\u0010C\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u00100J\u0010\u0010D\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u00100J\u0010\u0010E\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008E\u00100J\u0010\u0010F\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u00100J\u0010\u0010G\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008G\u00100J\u0010\u0010H\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u00100J\u0010\u0010I\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008I\u00100J\u0012\u0010J\u001a\u0004\u0018\u00010\"H\u00c6\u0003\u00a2\u0006\u0004\u0008J\u0010KJ\u00c8\u0002\u0010L\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00032\u0008\u0008\u0002\u0010 \u001a\u00020\u00032\u0008\u0008\u0002\u0010!\u001a\u00020\u00032\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u00c6\u0001\u00a2\u0006\u0004\u0008L\u0010MJ\u0010\u0010N\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008N\u00100J\u0010\u0010O\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008O\u0010PJ\u001a\u0010S\u001a\u00020R2\u0008\u0010Q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008S\u0010TJ\'\u0010]\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020XH\u0001\u00a2\u0006\u0004\u0008[\u0010\\R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010^\u001a\u0004\u0008_\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010`\u001a\u0004\u0008a\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010`\u001a\u0004\u0008b\u0010-R\u0017\u0010\u0008\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010c\u001a\u0004\u0008d\u00100R\u0017\u0010\t\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010c\u001a\u0004\u0008e\u00100R\u0017\u0010\n\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010c\u001a\u0004\u0008f\u00100R\u0017\u0010\u000b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010c\u001a\u0004\u0008g\u00100R\u0017\u0010\u000c\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010c\u001a\u0004\u0008h\u00100R\u0017\u0010\r\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010c\u001a\u0004\u0008i\u00100R\u0017\u0010\u000e\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010c\u001a\u0004\u0008j\u00100R \u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010c\u0012\u0004\u0008l\u0010m\u001a\u0004\u0008k\u00100R \u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010c\u0012\u0004\u0008o\u0010m\u001a\u0004\u0008n\u00100R\u0017\u0010\u0011\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010c\u001a\u0004\u0008p\u00100R\u0017\u0010\u0012\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010c\u001a\u0004\u0008q\u00100R\u0017\u0010\u0013\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010c\u001a\u0004\u0008r\u00100R\u0017\u0010\u0014\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010c\u001a\u0004\u0008s\u00100R\u0017\u0010\u0015\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010c\u001a\u0004\u0008t\u00100R\u0017\u0010\u0016\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010c\u001a\u0004\u0008u\u00100R\u0017\u0010\u0017\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010c\u001a\u0004\u0008v\u00100R\u0017\u0010\u0018\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010c\u001a\u0004\u0008w\u00100R\u0017\u0010\u0019\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010c\u001a\u0004\u0008x\u00100R\u0017\u0010\u001a\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010c\u001a\u0004\u0008y\u00100R\u0017\u0010\u001b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010c\u001a\u0004\u0008z\u00100R\u0017\u0010\u001c\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010c\u001a\u0004\u0008{\u00100R \u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010c\u0012\u0004\u0008}\u0010m\u001a\u0004\u0008|\u00100R\u0017\u0010\u001e\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010c\u001a\u0004\u0008~\u00100R\u0017\u0010\u001f\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010c\u001a\u0004\u0008\u007f\u00100R\"\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008 \u0010c\u0012\u0005\u0008\u0081\u0001\u0010m\u001a\u0005\u0008\u0080\u0001\u00100R\"\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008!\u0010c\u0012\u0005\u0008\u0083\u0001\u0010m\u001a\u0005\u0008\u0082\u0001\u00100R%\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008#\u0010\u0084\u0001\u0012\u0005\u0008\u0086\u0001\u0010m\u001a\u0005\u0008\u0085\u0001\u0010K\u00a8\u0006\u0089\u0001"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
        "",
        "",
        "",
        "dataTypes",
        "",
        "additionalDataCollection",
        "bthrAdditionalDataCollection",
        "submittingText",
        "successIcon",
        "successText",
        "successSubtext",
        "successBackgroundUrl",
        "submitErrorTitle",
        "submitErrorBody",
        "errorCta",
        "errorDiscard",
        "submittedText",
        "submittedCta",
        "cancelCta",
        "cancelDialogTitle",
        "cancelDialogBody",
        "cancelDialogPositiveCta",
        "cancelDialogNegativeCta",
        "startErrorTitle",
        "startErrorBody",
        "startErrorPositiveCta",
        "startErrorNegativeCta",
        "startErrorMissingStrapBody",
        "startErrorBtHrFailedBody",
        "webViewErrorTitle",
        "webViewErrorBody",
        "webViewPositiveCta",
        "webViewNegativeCta",
        "Lcom/whoop/navigation/e;",
        "navigationAction",
        "<init>",
        "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Ljava/lang/Integer;",
        "component3",
        "component4",
        "()Ljava/lang/String;",
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
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "component30",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;",
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
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/List;",
        "getDataTypes",
        "Ljava/lang/Integer;",
        "getAdditionalDataCollection",
        "getBthrAdditionalDataCollection",
        "Ljava/lang/String;",
        "getSubmittingText",
        "getSuccessIcon",
        "getSuccessText",
        "getSuccessSubtext",
        "getSuccessBackgroundUrl",
        "getSubmitErrorTitle",
        "getSubmitErrorBody",
        "getErrorCta",
        "getErrorCta$annotations",
        "()V",
        "getErrorDiscard",
        "getErrorDiscard$annotations",
        "getSubmittedText",
        "getSubmittedCta",
        "getCancelCta",
        "getCancelDialogTitle",
        "getCancelDialogBody",
        "getCancelDialogPositiveCta",
        "getCancelDialogNegativeCta",
        "getStartErrorTitle",
        "getStartErrorBody",
        "getStartErrorPositiveCta",
        "getStartErrorNegativeCta",
        "getStartErrorMissingStrapBody",
        "getStartErrorBtHrFailedBody",
        "getStartErrorBtHrFailedBody$annotations",
        "getWebViewErrorTitle",
        "getWebViewErrorBody",
        "getWebViewPositiveCta",
        "getWebViewPositiveCta$annotations",
        "getWebViewNegativeCta",
        "getWebViewNegativeCta$annotations",
        "Lcom/whoop/navigation/e;",
        "getNavigationAction",
        "getNavigationAction$annotations",
        "Companion",
        "$serializer",
        "whooplabs_release"
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

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$Companion;


# instance fields
.field private final additionalDataCollection:Ljava/lang/Integer;

.field private final bthrAdditionalDataCollection:Ljava/lang/Integer;

.field private final cancelCta:Ljava/lang/String;

.field private final cancelDialogBody:Ljava/lang/String;

.field private final cancelDialogNegativeCta:Ljava/lang/String;

.field private final cancelDialogPositiveCta:Ljava/lang/String;

.field private final cancelDialogTitle:Ljava/lang/String;

.field private final dataTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final errorCta:Ljava/lang/String;

.field private final errorDiscard:Ljava/lang/String;

.field private final navigationAction:Lcom/whoop/navigation/e;

.field private final startErrorBody:Ljava/lang/String;

.field private final startErrorBtHrFailedBody:Ljava/lang/String;

.field private final startErrorMissingStrapBody:Ljava/lang/String;

.field private final startErrorNegativeCta:Ljava/lang/String;

.field private final startErrorPositiveCta:Ljava/lang/String;

.field private final startErrorTitle:Ljava/lang/String;

.field private final submitErrorBody:Ljava/lang/String;

.field private final submitErrorTitle:Ljava/lang/String;

.field private final submittedCta:Ljava/lang/String;

.field private final submittedText:Ljava/lang/String;

.field private final submittingText:Ljava/lang/String;

.field private final successBackgroundUrl:Ljava/lang/String;

.field private final successIcon:Ljava/lang/String;

.field private final successSubtext:Ljava/lang/String;

.field private final successText:Ljava/lang/String;

.field private final webViewErrorBody:Ljava/lang/String;

.field private final webViewErrorTitle:Ljava/lang/String;

.field private final webViewNegativeCta:Ljava/lang/String;

.field private final webViewPositiveCta:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ldq2/a;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Ldq2/a;

    const/16 v6, 0x1c

    invoke-direct {v5, v6}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x1e

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v3, v5, v7

    const/4 v3, 0x1

    aput-object v1, v5, v3

    const/4 v3, 0x2

    aput-object v1, v5, v3

    const/4 v3, 0x3

    aput-object v1, v5, v3

    const/4 v3, 0x4

    aput-object v1, v5, v3

    const/4 v3, 0x5

    aput-object v1, v5, v3

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v1, v5, v3

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    const/16 v0, 0xb

    aput-object v1, v5, v0

    const/16 v0, 0xc

    aput-object v1, v5, v0

    const/16 v0, 0xd

    aput-object v1, v5, v0

    const/16 v0, 0xe

    aput-object v1, v5, v0

    const/16 v0, 0xf

    aput-object v1, v5, v0

    const/16 v0, 0x10

    aput-object v1, v5, v0

    const/16 v0, 0x11

    aput-object v1, v5, v0

    const/16 v0, 0x12

    aput-object v1, v5, v0

    const/16 v0, 0x13

    aput-object v1, v5, v0

    const/16 v0, 0x14

    aput-object v1, v5, v0

    const/16 v0, 0x15

    aput-object v1, v5, v0

    const/16 v0, 0x16

    aput-object v1, v5, v0

    const/16 v0, 0x17

    aput-object v1, v5, v0

    const/16 v0, 0x18

    aput-object v1, v5, v0

    const/16 v0, 0x19

    aput-object v1, v5, v0

    const/16 v0, 0x1a

    aput-object v1, v5, v0

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    const/16 v0, 0x1d

    aput-object v2, v5, v0

    sput-object v5, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x3ffffffe    # 1.9999998f

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    :goto_0
    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    move-object/from16 p1, p26

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    move-object/from16 p1, p27

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    move-object/from16 p1, p28

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    move-object/from16 p1, p29

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    move-object/from16 p1, p30

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    move-object/from16 p1, p31

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p13

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    move-object/from16 v14, p16

    move-object/from16 v15, p17

    const-string v0, "dataTypes"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittingText"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successIcon"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successText"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successSubtext"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successBackgroundUrl"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submitErrorTitle"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submitErrorBody"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorCta"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorDiscard"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedText"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedCta"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelCta"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelDialogTitle"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelDialogBody"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelDialogPositiveCta"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelDialogNegativeCta"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorTitle"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorBody"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorPositiveCta"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorNegativeCta"

    move-object/from16 v15, p23

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorMissingStrapBody"

    move-object/from16 v15, p24

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorBtHrFailedBody"

    move-object/from16 v15, p25

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewErrorTitle"

    move-object/from16 v15, p26

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewErrorBody"

    move-object/from16 v15, p27

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewPositiveCta"

    move-object/from16 v15, p28

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewNegativeCta"

    move-object/from16 v15, p29

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 5
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    move-object/from16 v1, p2

    .line 6
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

    move-object/from16 v1, p3

    .line 7
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    .line 8
    iput-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    .line 9
    iput-object v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    .line 10
    iput-object v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    .line 11
    iput-object v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    .line 12
    iput-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    .line 13
    iput-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    .line 14
    iput-object v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    .line 15
    iput-object v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    .line 16
    iput-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    .line 17
    iput-object v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    .line 18
    iput-object v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    .line 19
    iput-object v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    .line 20
    iput-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    move-object/from16 v1, p17

    .line 21
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    move-object/from16 v1, p18

    .line 22
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    move-object/from16 v1, p19

    .line 23
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    move-object/from16 v1, p20

    .line 24
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    move-object/from16 v1, p21

    .line 25
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    move-object/from16 v1, p22

    .line 26
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    move-object/from16 v1, p23

    .line 27
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    move-object/from16 v1, p24

    .line 28
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    move-object/from16 v1, p25

    .line 29
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    move-object/from16 v1, p26

    .line 30
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    move-object/from16 v1, p27

    .line 31
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    move-object/from16 v1, p28

    .line 32
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    .line 33
    iput-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    move-object/from16 v1, p30

    .line 34
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 32

    and-int/lit8 v0, p31, 0x1

    if-eqz v0, :cond_0

    .line 35
    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object v2, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

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

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v31, p30

    goto :goto_1

    :cond_0
    move-object/from16 v2, p1

    goto :goto_0

    .line 36
    :goto_1
    invoke-direct/range {v1 .. v31}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;-><init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p31

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p31, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p31, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p31, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p31, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p31, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p31, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p31, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p31, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p31, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p31, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p31, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p31, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1b

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p31, v16

    move-object/from16 p14, v1

    if-eqz v16, :cond_1c

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p31, v16

    if-eqz v16, :cond_1d

    move-object/from16 p15, v1

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    move-object/from16 p30, p15

    move-object/from16 p31, v1

    :goto_1d
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p27, p12

    move-object/from16 p28, p13

    move-object/from16 p29, p14

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

    goto :goto_1e

    :cond_1d
    move-object/from16 p31, p30

    move-object/from16 p30, v1

    goto :goto_1d

    :goto_1e
    invoke-virtual/range {p1 .. p31}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->copy(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getErrorCta$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "submit_error_positive_cta"
    .end annotation

    return-void
.end method

.method public static synthetic getErrorDiscard$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "submit_error_negative_cta"
    .end annotation

    return-void
.end method

.method public static synthetic getNavigationAction$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "navigation"
    .end annotation

    return-void
.end method

.method public static synthetic getStartErrorBtHrFailedBody$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "start_error_bthr_failed_body"
    .end annotation

    return-void
.end method

.method public static synthetic getWebViewNegativeCta$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "web_view_error_negative_cta"
    .end annotation

    return-void
.end method

.method public static synthetic getWebViewPositiveCta$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "web_view_error_positive_cta"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xd

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xe

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0xf

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x10

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x11

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x12

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x13

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x14

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x15

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x16

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x17

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x18

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x19

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x1a

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x1b

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x1c

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x1d

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component30()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;"
        }
    .end annotation

    const-string v0, "dataTypes"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittingText"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successIcon"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successText"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successSubtext"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successBackgroundUrl"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submitErrorTitle"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submitErrorBody"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorCta"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorDiscard"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedText"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submittedCta"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelCta"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelDialogTitle"

    move-object/from16 v3, p16

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelDialogBody"

    move-object/from16 v4, p17

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelDialogPositiveCta"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelDialogNegativeCta"

    move-object/from16 v1, p19

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorTitle"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorBody"

    move-object/from16 v1, p21

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorPositiveCta"

    move-object/from16 v1, p22

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorNegativeCta"

    move-object/from16 v1, p23

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorMissingStrapBody"

    move-object/from16 v1, p24

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startErrorBtHrFailedBody"

    move-object/from16 v1, p25

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewErrorTitle"

    move-object/from16 v1, p26

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewErrorBody"

    move-object/from16 v1, p27

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewPositiveCta"

    move-object/from16 v1, p28

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webViewNegativeCta"

    move-object/from16 v1, p29

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    move-object/from16 v16, p15

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v31, p30

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v31}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;-><init>(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    return v2

    :cond_1f
    return v0
.end method

.method public final getAdditionalDataCollection()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getBthrAdditionalDataCollection()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCancelCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getCancelDialogBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getCancelDialogNegativeCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getCancelDialogPositiveCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getCancelDialogTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDataTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getErrorCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorDiscard()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationAction()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getStartErrorBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartErrorBtHrFailedBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartErrorMissingStrapBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartErrorNegativeCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartErrorPositiveCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartErrorTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmitErrorBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmitErrorTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittedCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittedText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubmittingText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuccessBackgroundUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuccessIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuccessSubtext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuccessText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebViewErrorBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebViewErrorTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebViewNegativeCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebViewPositiveCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

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

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 32

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->dataTypes:Ljava/util/List;

    iget-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->additionalDataCollection:Ljava/lang/Integer;

    iget-object v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->bthrAdditionalDataCollection:Ljava/lang/Integer;

    iget-object v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittingText:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successIcon:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successText:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successSubtext:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->successBackgroundUrl:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorTitle:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submitErrorBody:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorCta:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->errorDiscard:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedText:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->submittedCta:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelCta:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogTitle:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogBody:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogPositiveCta:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->cancelDialogNegativeCta:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorTitle:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBody:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorPositiveCta:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorNegativeCta:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorMissingStrapBody:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->startErrorBtHrFailedBody:Ljava/lang/String;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorTitle:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewErrorBody:Ljava/lang/String;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewPositiveCta:Ljava/lang/String;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->webViewNegativeCta:Ljava/lang/String;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->navigationAction:Lcom/whoop/navigation/e;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v31, v15

    const-string v15, "CampaignStepConfigResponse(dataTypes="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", additionalDataCollection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bthrAdditionalDataCollection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", submittingText="

    const-string v2, ", successIcon="

    invoke-static {v3, v1, v4, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", successText="

    const-string v2, ", successSubtext="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", successBackgroundUrl="

    const-string v2, ", submitErrorTitle="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", submitErrorBody="

    const-string v2, ", errorCta="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", errorDiscard="

    const-string v2, ", submittedText="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", submittedCta="

    const-string v2, ", cancelCta="

    invoke-static {v0, v13, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", cancelDialogTitle="

    const-string v2, ", cancelDialogBody="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", cancelDialogPositiveCta="

    const-string v2, ", cancelDialogNegativeCta="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", startErrorTitle="

    const-string v2, ", startErrorBody="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", startErrorPositiveCta="

    const-string v2, ", startErrorNegativeCta="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", startErrorMissingStrapBody="

    const-string v2, ", startErrorBtHrFailedBody="

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", webViewErrorTitle="

    const-string v2, ", webViewErrorBody="

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", webViewPositiveCta="

    const-string v2, ", webViewNegativeCta="

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", navigationAction="

    const-string v2, ")"

    move-object/from16 v3, v30

    move-object/from16 v4, v31

    invoke-static {v0, v3, v1, v4, v2}, Lev/n;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
