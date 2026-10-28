.class public final Lcom/whoop/design/models/items/CardButtonModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/CardButtonModel$$serializer;,
        Lcom/whoop/design/models/items/CardButtonModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008-\u0008\u0087\u0008\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u0002:\u0004\u0088\u0001\u0087\u0001B\u00a0\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0016\u0008\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012+\u0008\u0002\u0010%\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001ej\u0004\u0018\u0001`!\u00a2\u0006\u000c\u0008\"\u0012\u0008\u0008#\u0012\u0004\u0008\t0$\u00a2\u0006\u0004\u0008&\u0010\'B\u00fb\u0001\u0008\u0010\u0012\u0006\u0010)\u001a\u00020(\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001e\u0012\u0008\u0010+\u001a\u0004\u0018\u00010*\u00a2\u0006\u0004\u0008&\u0010,J#\u0010/\u001a\u00020\u00022\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020-0\u001eH\u0016\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00102J\u0012\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00102J\u0012\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00102J\u0010\u00108\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00102J\u0012\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00089\u00102J\u0012\u0010:\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u00102J\u0012\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u00102J\u0012\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u00102J\u0012\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008E\u00102J\u0012\u0010F\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008H\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0004\u0008J\u0010KJ\u001e\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0004\u0008L\u0010MJ3\u0010N\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001ej\u0004\u0018\u0001`!\u00a2\u0006\u000c\u0008\"\u0012\u0008\u0008#\u0012\u0004\u0008\t0$H\u00c6\u0003\u00a2\u0006\u0004\u0008N\u0010MJ\u00a9\u0002\u0010O\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0016\u0008\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e2+\u0008\u0002\u0010%\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001ej\u0004\u0018\u0001`!\u00a2\u0006\u000c\u0008\"\u0012\u0008\u0008#\u0012\u0004\u0008\t0$H\u00c6\u0001\u00a2\u0006\u0004\u0008O\u0010PJ\u0010\u0010Q\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008Q\u00102J\u0010\u0010R\u001a\u00020(H\u00d6\u0001\u00a2\u0006\u0004\u0008R\u0010SJ\u001a\u0010U\u001a\u00020\u001a2\u0008\u0010T\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u0008U\u0010VJ\'\u0010_\u001a\u00020\\2\u0006\u0010W\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020ZH\u0001\u00a2\u0006\u0004\u0008]\u0010^R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010`\u001a\u0004\u0008a\u00102R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010b\u001a\u0004\u0008c\u00104R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010`\u001a\u0004\u0008d\u00102R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010`\u0012\u0004\u0008f\u0010g\u001a\u0004\u0008e\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010`\u0012\u0004\u0008i\u0010g\u001a\u0004\u0008h\u00102R\u0017\u0010\n\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010`\u001a\u0004\u0008j\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010`\u001a\u0004\u0008k\u00102R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010l\u0012\u0004\u0008n\u0010g\u001a\u0004\u0008m\u0010;R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010o\u0012\u0004\u0008q\u0010g\u001a\u0004\u0008p\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010r\u001a\u0004\u0008s\u0010?R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010t\u001a\u0004\u0008u\u0010AR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010`\u001a\u0004\u0008v\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010`\u001a\u0004\u0008w\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010`\u001a\u0004\u0008x\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010`\u001a\u0004\u0008y\u00102R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010z\u0012\u0004\u0008|\u0010g\u001a\u0004\u0008{\u0010GR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010}\u0012\u0004\u0008~\u0010g\u001a\u0004\u0008\u001b\u0010IR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006\u00a2\u0006\r\n\u0004\u0008\u001d\u0010\u007f\u001a\u0005\u0008\u0080\u0001\u0010KR4\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0016\n\u0005\u0008\u001f\u0010\u0081\u0001\u001a\u0005\u0008\u0082\u0001\u0010M\"\u0006\u0008\u0083\u0001\u0010\u0084\u0001RI\u0010%\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0018\u00010\u001ej\u0004\u0018\u0001`!\u00a2\u0006\u000c\u0008\"\u0012\u0008\u0008#\u0012\u0004\u0008\t0$8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0016\n\u0005\u0008%\u0010\u0081\u0001\u001a\u0005\u0008\u0085\u0001\u0010M\"\u0006\u0008\u0086\u0001\u0010\u0084\u0001\u00a8\u0006\u0089\u0001"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "icon",
        "cardName",
        "featureType",
        "style",
        "backgroundStyle",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "modal",
        "size",
        "textStyle",
        "cornerRadius",
        "iconConfiguration",
        "Lcom/whoop/navigation/DismissEventModel;",
        "dismissEvent",
        "",
        "isEnabled",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "genericInteraction",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/navigation/e;",
        "component9",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component10",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "component11",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "()Lcom/whoop/navigation/DismissEventModel;",
        "component17",
        "()Ljava/lang/Boolean;",
        "component18",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component19",
        "()Ljava/util/Map;",
        "component20",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CardButtonModel;",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/CardButtonModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getIcon",
        "getCardName",
        "getCardName$annotations",
        "()V",
        "getFeatureType",
        "getFeatureType$annotations",
        "getStyle",
        "getBackgroundStyle",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getAction",
        "getAction$annotations",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "getModal",
        "getSize",
        "getTextStyle",
        "getCornerRadius",
        "getIconConfiguration",
        "Lcom/whoop/navigation/DismissEventModel;",
        "getDismissEvent",
        "getDismissEvent$annotations",
        "Ljava/lang/Boolean;",
        "isEnabled$annotations",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getGenericInteraction",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/CardButtonModel$Companion;


# instance fields
.field private final action:Lcom/whoop/whoopaction/domain/models/Action;

.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private final backgroundStyle:Ljava/lang/String;

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final cardName:Ljava/lang/String;

.field private final cornerRadius:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final dismissEvent:Lcom/whoop/navigation/DismissEventModel;

.field private final featureType:Ljava/lang/String;

.field private final genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final icon:Ljava/lang/String;

.field private final iconConfiguration:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final isEnabled:Ljava/lang/Boolean;

.field private final modal:Lcom/whoop/design/models/modal/AnyModal;

.field private final size:Ljava/lang/String;

.field private final style:Ljava/lang/String;

.field private final textStyle:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/whoop/design/models/items/CardButtonModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/CardButtonModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/CardButtonModel;->Companion:Lcom/whoop/design/models/items/CardButtonModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/CardButtonModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lun1/f;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lun1/f;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lun1/f;

    const/16 v6, 0xb

    invoke-direct {v5, v6}, Lun1/f;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lun1/f;

    const/16 v8, 0xc

    invoke-direct {v7, v8}, Lun1/f;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lun1/f;

    const/16 v10, 0xd

    invoke-direct {v9, v10}, Lun1/f;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v9, 0x14

    new-array v9, v9, [Ll83/h;

    const/4 v11, 0x0

    aput-object v1, v9, v11

    const/4 v11, 0x1

    aput-object v1, v9, v11

    const/4 v11, 0x2

    aput-object v1, v9, v11

    const/4 v11, 0x3

    aput-object v1, v9, v11

    const/4 v11, 0x4

    aput-object v1, v9, v11

    const/4 v11, 0x5

    aput-object v1, v9, v11

    const/4 v11, 0x6

    aput-object v1, v9, v11

    const/4 v11, 0x7

    aput-object v3, v9, v11

    aput-object v5, v9, v0

    const/16 v0, 0x9

    aput-object v1, v9, v0

    aput-object v7, v9, v4

    aput-object v1, v9, v6

    aput-object v1, v9, v8

    aput-object v1, v9, v10

    const/16 v0, 0xe

    aput-object v1, v9, v0

    const/16 v0, 0xf

    aput-object v1, v9, v0

    const/16 v0, 0x10

    aput-object v1, v9, v0

    const/16 v0, 0x11

    aput-object v1, v9, v0

    const/16 v0, 0x12

    aput-object v2, v9, v0

    const/16 v0, 0x13

    aput-object v1, v9, v0

    sput-object v9, Lcom/whoop/design/models/items/CardButtonModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 23

    .line 1
    const v21, 0xfffff

    const/16 v22, 0x0

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

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v22}, Lcom/whoop/design/models/items/CardButtonModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    .line 5
    const-string p2, ""

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    goto :goto_9

    :cond_9
    iput-object p11, p0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :goto_9
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_a

    :cond_a
    iput-object p12, p0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    :goto_a
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    goto :goto_b

    :cond_b
    iput-object p13, p0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    :goto_b
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    :goto_c
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_d

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    :goto_d
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_e

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    :goto_e
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_f

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    goto :goto_f

    :cond_f
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    :goto_f
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_10

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    goto :goto_10

    :cond_10
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    :goto_10
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_11

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_11

    :cond_11
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_11
    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    if-nez p2, :cond_12

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    goto :goto_12

    :cond_12
    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    :goto_12
    const/high16 p2, 0x80000

    and-int/2addr p1, p2

    if-nez p1, :cond_13

    iput-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_13
    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/DismissEventModel;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    .line 10
    iput-object p3, p0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    .line 11
    iput-object p4, p0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    .line 12
    iput-object p5, p0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    .line 13
    iput-object p6, p0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    .line 14
    iput-object p7, p0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    .line 15
    iput-object p8, p0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    .line 16
    iput-object p9, p0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    .line 17
    iput-object p10, p0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    .line 18
    iput-object p11, p0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    .line 19
    iput-object p12, p0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    .line 20
    iput-object p13, p0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    .line 21
    iput-object p14, p0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 22
    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 23
    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    move-object/from16 p1, p17

    .line 24
    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    move-object/from16 p1, p18

    .line 25
    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 p1, p19

    .line 26
    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    move-object/from16 p1, p20

    .line 27
    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    .line 28
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    .line 29
    const-string v7, ""

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

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

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v0, v0, v20

    if-eqz v0, :cond_13

    const/16 p21, 0x0

    :goto_13
    move-object/from16 p1, p0

    move-object/from16 p2, v1

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

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move-object/from16 p20, v19

    goto :goto_14

    :cond_13
    move-object/from16 p21, p20

    goto :goto_13

    .line 30
    :goto_14
    invoke-direct/range {p1 .. p21}, Lcom/whoop/design/models/items/CardButtonModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/Action;

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

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/AnyModal;->Companion:Lcom/whoop/design/models/modal/AnyModal$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/AnyModal$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CardButtonModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CardButtonModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CardButtonModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CardButtonModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/CardButtonModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p21, v16

    if-eqz v16, :cond_13

    move-object/from16 p5, v1

    iget-object v1, v0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    move-object/from16 p20, p5

    move-object/from16 p21, v1

    :goto_13
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

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

    goto :goto_14

    :cond_13
    move-object/from16 p21, p20

    move-object/from16 p20, v1

    goto :goto_13

    :goto_14
    invoke-virtual/range {p1 .. p21}, Lcom/whoop/design/models/items/CardButtonModel;->copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CardButtonModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAction$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getCardName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "card_name"
    .end annotation

    return-void
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getDismissEvent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "dismiss_event"
    .end annotation

    return-void
.end method

.method public static synthetic getFeatureType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "feature_type"
    .end annotation

    return-void
.end method

.method public static synthetic isEnabled$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "is_enabled"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/CardButtonModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/CardButtonModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_f

    :goto_7
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v2, :cond_11

    :goto_8
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-eqz v2, :cond_13

    :goto_9
    sget-object v2, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v2, :cond_15

    :goto_a
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_b

    :cond_16
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    if-eqz v2, :cond_17

    :goto_b
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_c

    :cond_18
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    if-eqz v2, :cond_19

    :goto_c
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    if-eqz v2, :cond_1b

    :goto_d
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1b
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    if-eqz v2, :cond_1d

    :goto_e
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1d
    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_1e

    goto :goto_f

    :cond_1e
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    if-eqz v2, :cond_1f

    :goto_f
    sget-object v2, Lcom/whoop/navigation/DismissEventModel$$serializer;->INSTANCE:Lcom/whoop/navigation/DismissEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1f
    const/16 v1, 0x10

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_20

    goto :goto_10

    :cond_20
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    if-eqz v2, :cond_21

    :goto_10
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_21
    const/16 v1, 0x11

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_22

    goto :goto_11

    :cond_22
    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_23

    :goto_11
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_23
    const/16 v1, 0x12

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_24

    goto :goto_12

    :cond_24
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_25

    :goto_12
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_25
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_13

    :cond_26
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_27

    :goto_13
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_27
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/WithGeneratedBindings;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CardButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/CardButtonModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/CardButtonModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Lcom/whoop/navigation/DismissEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    return-object v0
.end method

.method public final component17()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component18()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component19()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component20()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component9()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CardButtonModel;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/DismissEventModel;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/CardButtonModel;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/CardButtonModel;

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

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

    invoke-direct/range {v1 .. v21}, Lcom/whoop/design/models/items/CardButtonModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final getBackgroundStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getCardName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCornerRadius()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getDismissEvent()Lcom/whoop/navigation/DismissEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    return-object v0
.end method

.method public final getFeatureType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    return-object v0
.end method

.method public final getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getIconConfiguration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getModal()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final getSize()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    if-nez v3, :cond_a

    move v3, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    if-nez v3, :cond_b

    move v3, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    if-nez v3, :cond_c

    move v3, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    if-nez v3, :cond_d

    move v3, v1

    goto :goto_d

    :cond_d
    invoke-virtual {v3}, Lcom/whoop/navigation/DismissEventModel;->hashCode()I

    move-result v3

    :goto_d
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    if-nez v3, :cond_e

    move v3, v1

    goto :goto_e

    :cond_e
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_e
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v3, :cond_f

    move v3, v1

    goto :goto_f

    :cond_f
    invoke-virtual {v3}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_f
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    if-nez v3, :cond_10

    move v3, v1

    goto :goto_10

    :cond_10
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_10
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    if-nez v2, :cond_11

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    return v0
.end method

.method public final isEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/CardButtonModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/CardButtonModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lcom/whoop/design/models/items/CardButtonModel;->icon:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/CardButtonModel;->cardName:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/CardButtonModel;->featureType:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/CardButtonModel;->style:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/CardButtonModel;->backgroundStyle:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/CardButtonModel;->destination:Lcom/whoop/navigation/e;

    iget-object v9, v0, Lcom/whoop/design/models/items/CardButtonModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v10, v0, Lcom/whoop/design/models/items/CardButtonModel;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v11, v0, Lcom/whoop/design/models/items/CardButtonModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v12, v0, Lcom/whoop/design/models/items/CardButtonModel;->size:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/design/models/items/CardButtonModel;->textStyle:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/design/models/items/CardButtonModel;->cornerRadius:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/design/models/items/CardButtonModel;->iconConfiguration:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CardButtonModel;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled:Ljava/lang/Boolean;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CardButtonModel;->genericInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CardButtonModel;->bindings:Ljava/util/Map;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/CardButtonModel;->aggregateBindings:Ljava/util/Map;

    const-string v0, ", title="

    move-object/from16 v21, v15

    const-string v15, ", icon="

    move-object/from16 v22, v13

    const-string v13, "CardButtonModel(id="

    invoke-static {v13, v1, v0, v2, v15}, Lq63/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardName="

    const-string v2, ", featureType="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", style="

    const-string v2, ", backgroundStyle="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", destination="

    const-string v2, ", action="

    invoke-static {v0, v7, v1, v8, v2}, Lq63/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", textStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cornerRadius="

    const-string v2, ", iconConfiguration="

    move-object/from16 v3, v22

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dismissEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", genericInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    const-string v2, ")"

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
