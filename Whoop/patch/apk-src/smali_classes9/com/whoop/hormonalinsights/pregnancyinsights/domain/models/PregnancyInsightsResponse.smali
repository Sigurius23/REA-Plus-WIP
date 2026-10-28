.class public final Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;,
        Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0087\u0008\u0018\u0000 w2\u00020\u0001:\u0002xwB\u00eb\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015\u0012\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\r\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008$\u0010%B\u0091\u0002\u0008\u0010\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u00a2\u0006\u0004\u0008$\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0016\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u00088\u00107J\u0010\u00109\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010,J\u0010\u0010:\u001a\u00020\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u001c\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u001c\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010=J\u001e\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010=J\u001e\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010=J\u0016\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\rH\u00c6\u0003\u00a2\u0006\u0004\u0008A\u00107J\u0012\u0010B\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\u0010\u0010D\u001a\u00020 H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\"H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010GJ\u0098\u0002\u0010H\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0010\u0008\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0014\u0008\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00152\u0014\u0008\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00152\u0016\u0008\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0016\u0008\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\r2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0008\u0008\u0002\u0010!\u001a\u00020 2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u00c6\u0001\u00a2\u0006\u0004\u0008H\u0010IJ\u0010\u0010J\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008J\u0010,J\u0010\u0010K\u001a\u00020&H\u00d6\u0001\u00a2\u0006\u0004\u0008K\u0010LJ\u001a\u0010O\u001a\u00020N2\u0008\u0010M\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008O\u0010PJ\'\u0010Y\u001a\u00020V2\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020TH\u0001\u00a2\u0006\u0004\u0008W\u0010XR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010Z\u001a\u0004\u0008[\u0010,R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010Z\u001a\u0004\u0008\\\u0010,R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010]\u001a\u0004\u0008^\u0010/R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010_\u001a\u0004\u0008`\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010a\u001a\u0004\u0008b\u00103R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010c\u001a\u0004\u0008d\u00105R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010e\u001a\u0004\u0008f\u00107R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010e\u001a\u0004\u0008g\u00107R\u0017\u0010\u0012\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010Z\u001a\u0004\u0008h\u0010,R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010i\u001a\u0004\u0008j\u0010;R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010k\u001a\u0004\u0008l\u0010=R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010k\u001a\u0004\u0008m\u0010=R%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010k\u001a\u0004\u0008n\u0010=R%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010k\u001a\u0004\u0008o\u0010=R\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010e\u001a\u0004\u0008p\u00107R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010q\u001a\u0004\u0008r\u0010CR\u0017\u0010!\u001a\u00020 8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010s\u001a\u0004\u0008t\u0010ER\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010u\u001a\u0004\u0008v\u0010G\u00a8\u0006y"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;",
        "",
        "",
        "pregnancyId",
        "navigationTitle",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "datePicker",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;",
        "header",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;",
        "congratulationsHeader",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;",
        "style",
        "",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;",
        "buttons",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
        "segmentedControlDisplays",
        "selectedButtonId",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;",
        "segmentedControlDisplayId",
        "",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
        "currentTrimesterGraphs",
        "overviewGraphs",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "currentTrimesterVows",
        "overviewVows",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "belowGraphContent",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;",
        "bottomSheet",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;",
        "haveYouDeliveredDialog",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;",
        "deletePregnancyDialog",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/DateSelectorModel;",
        "component4",
        "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;",
        "component5",
        "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;",
        "component6",
        "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "component9",
        "component10",
        "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;",
        "component11",
        "()Ljava/util/Map;",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;",
        "component17",
        "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;",
        "component18",
        "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;",
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
        "write$Self$hormonal_insights_release",
        "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getPregnancyId",
        "getNavigationTitle",
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "getDatePicker",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;",
        "getHeader",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;",
        "getCongratulationsHeader",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;",
        "getStyle",
        "Ljava/util/List;",
        "getButtons",
        "getSegmentedControlDisplays",
        "getSelectedButtonId",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;",
        "getSegmentedControlDisplayId",
        "Ljava/util/Map;",
        "getCurrentTrimesterGraphs",
        "getOverviewGraphs",
        "getCurrentTrimesterVows",
        "getOverviewVows",
        "getBelowGraphContent",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;",
        "getBottomSheet",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;",
        "getHaveYouDeliveredDialog",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;",
        "getDeletePregnancyDialog",
        "Companion",
        "$serializer",
        "hormonal-insights_release"
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

.field public static final Companion:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$Companion;


# instance fields
.field private final belowGraphContent:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

.field private final buttons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;",
            ">;"
        }
    .end annotation
.end field

.field private final congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

.field private final currentTrimesterGraphs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;"
        }
    .end annotation
.end field

.field private final currentTrimesterVows:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;"
        }
    .end annotation
.end field

.field private final datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

.field private final deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

.field private final haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

.field private final header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

.field private final navigationTitle:Ljava/lang/String;

.field private final overviewGraphs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;"
        }
    .end annotation
.end field

.field private final overviewVows:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;"
        }
    .end annotation
.end field

.field private final pregnancyId:Ljava/lang/String;

.field private final segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

.field private final segmentedControlDisplays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedButtonId:Ljava/lang/String;

.field private final style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->Companion:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Llj1/b;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Llj1/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Llj1/b;

    const/16 v6, 0x13

    invoke-direct {v5, v6}, Llj1/b;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Llj1/b;

    const/16 v7, 0x14

    invoke-direct {v6, v7}, Llj1/b;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Llj1/b;

    const/16 v8, 0x15

    invoke-direct {v7, v8}, Llj1/b;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v8, Llj1/b;

    const/16 v9, 0x16

    invoke-direct {v8, v9}, Llj1/b;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    new-instance v9, Llj1/b;

    const/16 v10, 0x17

    invoke-direct {v9, v10}, Llj1/b;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v10, Llj1/b;

    const/16 v11, 0x18

    invoke-direct {v10, v11}, Llj1/b;-><init>(I)V

    invoke-static {v2, v10}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v10

    new-instance v11, Llj1/b;

    const/16 v12, 0x19

    invoke-direct {v11, v12}, Llj1/b;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    new-instance v12, Llj1/b;

    const/16 v13, 0x1a

    invoke-direct {v12, v13}, Llj1/b;-><init>(I)V

    invoke-static {v2, v12}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v4, v4, [Ll83/h;

    const/4 v12, 0x0

    aput-object v1, v4, v12

    const/4 v12, 0x1

    aput-object v1, v4, v12

    const/4 v12, 0x2

    aput-object v1, v4, v12

    const/4 v12, 0x3

    aput-object v1, v4, v12

    const/4 v12, 0x4

    aput-object v1, v4, v12

    const/4 v12, 0x5

    aput-object v3, v4, v12

    const/4 v3, 0x6

    aput-object v5, v4, v3

    const/4 v3, 0x7

    aput-object v6, v4, v3

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v7, v4, v0

    const/16 v0, 0xa

    aput-object v8, v4, v0

    const/16 v0, 0xb

    aput-object v9, v4, v0

    const/16 v0, 0xc

    aput-object v10, v4, v0

    const/16 v0, 0xd

    aput-object v11, v4, v0

    const/16 v0, 0xe

    aput-object v2, v4, v0

    const/16 v0, 0xf

    aput-object v1, v4, v0

    const/16 v0, 0x10

    aput-object v1, v4, v0

    const/16 v0, 0x11

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x3ffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iput-object p5, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    iput-object p6, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    iput-object p7, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    iput-object p8, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    iput-object p10, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    iput-object p12, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    iput-object p13, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;",
            ")V"
        }
    .end annotation

    move-object v0, p7

    move-object/from16 v1, p9

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    move-object/from16 v5, p15

    move-object/from16 v6, p17

    const-string v7, "pregnancyId"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "style"

    invoke-static {p6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "buttons"

    invoke-static {p7, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "selectedButtonId"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "segmentedControlDisplayId"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "currentTrimesterGraphs"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "overviewGraphs"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "belowGraphContent"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "haveYouDeliveredDialog"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    .line 7
    iput-object p5, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    .line 8
    iput-object p6, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    .line 9
    iput-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    move-object/from16 p1, p8

    .line 10
    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    .line 11
    iput-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    .line 12
    iput-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    .line 13
    iput-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    .line 14
    iput-object v4, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    move-object/from16 p1, p13

    .line 15
    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    .line 17
    iput-object v5, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    .line 19
    iput-object v6, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.pregnancyinsights.domain.models.TrimesterStyle"

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;->values()[Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.hormonalinsights.pregnancyinsights.domain.models.GraphType"

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;->values()[Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$5()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$6()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$7()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->_childSerializers$_anonymous_$5()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p19, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p19, v16

    if-eqz v16, :cond_11

    move-object/from16 p3, v1

    iget-object v1, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    move-object/from16 p18, p3

    move-object/from16 p19, v1

    :goto_11
    move-object/from16 p17, p2

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

    goto :goto_12

    :cond_11
    move-object/from16 p19, p18

    move-object/from16 p18, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p19}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->_childSerializers$_anonymous_$7()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->_childSerializers$_anonymous_$6()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$hormonal_insights_release(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/DateSelectorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DateSelectorModel$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader$$serializer;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xc

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xd

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xe

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet$$serializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    const/16 v2, 0xf

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel$$serializer;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    const/16 v2, 0x10

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog$$serializer;->INSTANCE:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog$$serializer;

    iget-object p0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    const/16 v1, 0x11

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    return-object v0
.end method

.method public final component11()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    return-object v0
.end method

.method public final component12()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    return-object v0
.end method

.method public final component13()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    return-object v0
.end method

.method public final component14()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    return-object v0
.end method

.method public final component17()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    return-object v0
.end method

.method public final component18()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    return-object v0
.end method

.method public final component5()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    return-object v0
.end method

.method public final component6()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/DateSelectorModel;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;",
            ")",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;"
        }
    .end annotation

    const-string v0, "pregnancyId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttons"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedButtonId"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentedControlDisplayId"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentTrimesterGraphs"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overviewGraphs"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "belowGraphContent"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "haveYouDeliveredDialog"

    move-object/from16 v3, p17

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v9, p8

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v19, p18

    move-object/from16 v18, v3

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v19}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;

    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    iget-object v3, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    iget-object p1, p1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getBelowGraphContent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    return-object v0
.end method

.method public final getBottomSheet()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    return-object v0
.end method

.method public final getButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    return-object v0
.end method

.method public final getCongratulationsHeader()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    return-object v0
.end method

.method public final getCurrentTrimesterGraphs()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    return-object v0
.end method

.method public final getCurrentTrimesterVows()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    return-object v0
.end method

.method public final getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    return-object v0
.end method

.method public final getDeletePregnancyDialog()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    return-object v0
.end method

.method public final getHaveYouDeliveredDialog()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    return-object v0
.end method

.method public final getNavigationTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getOverviewGraphs()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    return-object v0
.end method

.method public final getOverviewVows()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    return-object v0
.end method

.method public final getPregnancyId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSegmentedControlDisplayId()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    return-object v0
.end method

.method public final getSegmentedControlDisplays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedButtonId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DateSelectorModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    invoke-static {v0, v2, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    if-nez v0, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->pregnancyId:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->navigationTitle:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->datePicker:Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v4, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->header:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    iget-object v5, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->congratulationsHeader:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    iget-object v6, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->style:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    iget-object v7, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->buttons:Ljava/util/List;

    iget-object v8, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplays:Ljava/util/List;

    iget-object v9, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->selectedButtonId:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->segmentedControlDisplayId:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    iget-object v11, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterGraphs:Ljava/util/Map;

    iget-object v12, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewGraphs:Ljava/util/Map;

    iget-object v13, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->currentTrimesterVows:Ljava/util/Map;

    iget-object v14, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->overviewVows:Ljava/util/Map;

    iget-object v15, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->belowGraphContent:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->bottomSheet:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->haveYouDeliveredDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->deletePregnancyDialog:Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    const-string v0, ", navigationTitle="

    move-object/from16 v19, v15

    const-string v15, ", datePicker="

    move-object/from16 v20, v13

    const-string v13, "PregnancyInsightsResponse(pregnancyId="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", header="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", congratulationsHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", segmentedControlDisplays="

    const-string v2, ", selectedButtonId="

    invoke-static {v0, v7, v1, v8, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", segmentedControlDisplayId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentTrimesterGraphs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", overviewGraphs="

    const-string v2, ", currentTrimesterVows="

    invoke-static {v0, v11, v1, v12, v2}, Lc13/a;->x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v1, ", overviewVows="

    const-string v2, ", belowGraphContent="

    move-object/from16 v3, v20

    invoke-static {v0, v3, v1, v14, v2}, Lc13/a;->x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomSheet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", haveYouDeliveredDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deletePregnancyDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
