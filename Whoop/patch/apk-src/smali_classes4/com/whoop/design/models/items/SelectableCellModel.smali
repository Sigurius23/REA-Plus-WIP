.class public final Lcom/whoop/design/models/items/SelectableCellModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/SelectableCellModel$$serializer;,
        Lcom/whoop/design/models/items/SelectableCellModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\u0008\u0087\u0008\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0002rqB\u00f8\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0014\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0016\u0008\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019\u0012+\u0008\u0002\u0010 \u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001c\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\t0\u001f\u00a2\u0006\u0004\u0008!\u0010\"B\u00e5\u0001\u0008\u0010\u0012\u0006\u0010$\u001a\u00020#\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019\u0012\u0008\u0010&\u001a\u0004\u0018\u00010%\u00a2\u0006\u0004\u0008!\u0010\'J#\u0010*\u001a\u00020\u00022\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020(0\u0019H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010-J\u0012\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010-J\u0010\u00102\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010-J\u0010\u00105\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u00085\u00103J\u0010\u00106\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u00086\u00103J\u0010\u00107\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u00087\u00103J\u0012\u00108\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008<\u00109J\u0016\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010-J\u0012\u0010@\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u001e\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ3\u0010D\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001c\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\t0\u001fH\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010CJ\u008d\u0002\u0010E\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\t2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0016\u0008\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00192+\u0008\u0002\u0010 \u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001c\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\t0\u001fH\u00c6\u0001\u00a2\u0006\u0004\u0008E\u0010FJ\u0010\u0010G\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008G\u0010-J\u0010\u0010H\u001a\u00020#H\u00d6\u0001\u00a2\u0006\u0004\u0008H\u0010IJ\u001a\u0010K\u001a\u00020\t2\u0008\u0010J\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008K\u0010LJ\'\u0010U\u001a\u00020R2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0001\u00a2\u0006\u0004\u0008S\u0010TR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010V\u001a\u0004\u0008W\u0010-R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010V\u001a\u0004\u0008X\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010V\u001a\u0004\u0008Y\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010V\u001a\u0004\u0008Z\u0010-R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010V\u001a\u0004\u0008[\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\\\u001a\u0004\u0008]\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010V\u001a\u0004\u0008^\u0010-R\u0017\u0010\u000c\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\\\u001a\u0004\u0008_\u00103R\u0017\u0010\r\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\\\u001a\u0004\u0008`\u00103R\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\\\u001a\u0004\u0008\u000e\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010a\u001a\u0004\u0008b\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010c\u001a\u0004\u0008d\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010a\u001a\u0004\u0008e\u00109R\u001d\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010f\u001a\u0004\u0008g\u0010>R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010V\u001a\u0004\u0008h\u0010-R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010i\u001a\u0004\u0008j\u0010AR0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010k\u001a\u0004\u0008l\u0010C\"\u0004\u0008m\u0010nRE\u0010 \u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001c\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\t0\u001f8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010k\u001a\u0004\u0008o\u0010C\"\u0004\u0008p\u0010n\u00a8\u0006s"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SelectableCellModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "title",
        "subtitle",
        "leftIcon",
        "leftImageUrl",
        "",
        "shouldTintLeftImage",
        "selectionStyle",
        "selected",
        "showCheckbox",
        "isDisabled",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "deselectAction",
        "",
        "searchKeys",
        "sectionTitle",
        "",
        "fixedHeightSize",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Z",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component12",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component13",
        "component14",
        "()Ljava/util/List;",
        "component15",
        "component16",
        "()Ljava/lang/Double;",
        "component17",
        "()Ljava/util/Map;",
        "component18",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellModel;",
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
        "(Lcom/whoop/design/models/items/SelectableCellModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getTitle",
        "getSubtitle",
        "getLeftIcon",
        "getLeftImageUrl",
        "Z",
        "getShouldTintLeftImage",
        "getSelectionStyle",
        "getSelected",
        "getShowCheckbox",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getAction",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
        "getDeselectAction",
        "Ljava/util/List;",
        "getSearchKeys",
        "getSectionTitle",
        "Ljava/lang/Double;",
        "getFixedHeightSize",
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

.field public static final Companion:Lcom/whoop/design/models/items/SelectableCellModel$Companion;


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

.field private final deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

.field private final fixedHeightSize:Ljava/lang/Double;

.field private final id:Ljava/lang/String;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final isDisabled:Z

.field private final leftIcon:Ljava/lang/String;

.field private final leftImageUrl:Ljava/lang/String;

.field private final searchKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sectionTitle:Ljava/lang/String;

.field private final selected:Z

.field private final selectionStyle:Ljava/lang/String;

.field private final shouldTintLeftImage:Z

.field private final showCheckbox:Z

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/whoop/design/models/items/SelectableCellModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/SelectableCellModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/SelectableCellModel;->Companion:Lcom/whoop/design/models/items/SelectableCellModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/SelectableCellModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/j;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lw91/j;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/j;

    const/4 v6, 0x7

    invoke-direct {v5, v6}, Lw91/j;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/j;

    invoke-direct {v7, v0}, Lw91/j;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v8, Lw91/j;

    const/16 v9, 0x9

    invoke-direct {v8, v9}, Lw91/j;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v8, 0x12

    new-array v8, v8, [Ll83/h;

    const/4 v10, 0x0

    aput-object v1, v8, v10

    const/4 v10, 0x1

    aput-object v1, v8, v10

    const/4 v10, 0x2

    aput-object v1, v8, v10

    const/4 v10, 0x3

    aput-object v1, v8, v10

    const/4 v10, 0x4

    aput-object v1, v8, v10

    const/4 v10, 0x5

    aput-object v1, v8, v10

    aput-object v1, v8, v4

    aput-object v1, v8, v6

    aput-object v1, v8, v0

    aput-object v1, v8, v9

    const/16 v0, 0xa

    aput-object v3, v8, v0

    const/16 v0, 0xb

    aput-object v1, v8, v0

    const/16 v0, 0xc

    aput-object v5, v8, v0

    const/16 v0, 0xd

    aput-object v7, v8, v0

    const/16 v0, 0xe

    aput-object v1, v8, v0

    const/16 v0, 0xf

    aput-object v1, v8, v0

    const/16 v0, 0x10

    aput-object v2, v8, v0

    const/16 v0, 0x11

    aput-object v1, v8, v0

    sput-object v8, Lcom/whoop/design/models/items/SelectableCellModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0xcf

    const/16 v1, 0xcf

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/SelectableCellModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SelectableCellModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SelectableCellModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    const/4 p4, 0x0

    if-nez p2, :cond_2

    iput-boolean p4, p0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    goto :goto_1

    :cond_2
    iput-boolean p7, p0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    :goto_1
    iput-object p8, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    iput-boolean p9, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_3

    iput-boolean p4, p0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    goto :goto_2

    :cond_3
    iput-boolean p10, p0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    :goto_2
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_4

    iput-boolean p4, p0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    goto :goto_3

    :cond_4
    iput-boolean p11, p0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    :goto_3
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_4

    :cond_5
    iput-object p12, p0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    :goto_4
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_5

    :cond_6
    iput-object p13, p0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_5
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_6

    :cond_7
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    :goto_6
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_8

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    :goto_7
    iput-object p2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 p2, p15

    goto :goto_7

    :goto_8
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    :goto_9
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_a

    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    goto :goto_a

    :cond_a
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    :goto_a
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_b

    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    goto :goto_b

    :cond_b
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    :goto_b
    const/high16 p2, 0x20000

    and-int/2addr p1, p2

    if-nez p1, :cond_c

    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_c
    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "ZZZ",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
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

    move-object/from16 v0, p14

    const-string v1, "id"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "searchKeys"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    .line 10
    iput-boolean p6, p0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    .line 12
    iput-boolean p8, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    .line 13
    iput-boolean p9, p0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    .line 14
    iput-boolean p10, p0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    .line 15
    iput-object p11, p0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    .line 16
    iput-object p12, p0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 17
    iput-object p13, p0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    .line 18
    iput-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    move-object/from16 p1, p15

    .line 19
    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 20
    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    move-object/from16 p1, p17

    .line 21
    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    move-object/from16 p1, p18

    .line 22
    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move v9, v3

    goto :goto_1

    :cond_1
    move/from16 v9, p6

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    move v12, v3

    goto :goto_2

    :cond_2
    move/from16 v12, p9

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move v13, v3

    goto :goto_3

    :cond_3
    move/from16 v13, p10

    :goto_3
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_4

    move-object v14, v2

    goto :goto_4

    :cond_4
    move-object/from16 v14, p11

    :goto_4
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_5

    move-object v15, v2

    goto :goto_5

    :cond_5
    move-object/from16 v15, p12

    :goto_5
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_6

    move-object/from16 v16, v2

    goto :goto_6

    :cond_6
    move-object/from16 v16, p13

    :goto_6
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_7

    .line 23
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object/from16 v17, v1

    goto :goto_7

    :cond_7
    move-object/from16 v17, p14

    :goto_7
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_8

    move-object/from16 v18, v2

    goto :goto_8

    :cond_8
    move-object/from16 v18, p15

    :goto_8
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    move-object/from16 v19, v2

    goto :goto_9

    :cond_9
    move-object/from16 v19, p16

    :goto_9
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    move-object/from16 v20, v2

    goto :goto_a

    :cond_a
    move-object/from16 v20, p17

    :goto_a
    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_b

    move-object/from16 v21, v2

    :goto_b
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v10, p7

    move/from16 v11, p8

    goto :goto_c

    :cond_b
    move-object/from16 v21, p18

    goto :goto_b

    .line 24
    :goto_c
    invoke-direct/range {v3 .. v21}, Lcom/whoop/design/models/items/SelectableCellModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

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

    invoke-static {}, Lcom/whoop/design/models/items/SelectableCellModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/SelectableCellModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SelectableCellModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SelectableCellModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/SelectableCellModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SelectableCellModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p19, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p19, v16

    if-eqz v16, :cond_11

    move-object/from16 p3, v1

    iget-object v1, v0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

    move-object/from16 p18, p3

    move-object/from16 p19, v1

    :goto_11
    move-object/from16 p17, p2

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

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
    invoke-virtual/range {p1 .. p19}, Lcom/whoop/design/models/items/SelectableCellModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SelectableCellModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/SelectableCellModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/SelectableCellModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    if-eqz v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    if-eqz v3, :cond_3

    :goto_1
    iget-boolean v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-boolean v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v2, 0x8

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    if-eqz v3, :cond_5

    :goto_2
    iget-boolean v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/16 v2, 0x9

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    if-eqz v3, :cond_7

    :goto_3
    iget-boolean v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_7
    const/16 v2, 0xa

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v3, :cond_9

    :goto_4
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v2, 0xb

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v3, :cond_b

    :goto_5
    sget-object v3, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v2, 0xc

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_6

    :cond_c
    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v3, :cond_d

    :goto_6
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v2, 0xd

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_7

    :cond_e
    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :goto_7
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v2, 0xe

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_8

    :cond_10
    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    if-eqz v3, :cond_11

    :goto_8
    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    if-eqz v2, :cond_13

    :goto_9
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0x10

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_15

    :goto_a
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_17

    :goto_b
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
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

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/SelectableCellModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/SelectableCellModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    return v0
.end method

.method public final component11()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component12()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component13()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    return-object v0
.end method

.method public final component17()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component18()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellModel;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "ZZZ",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/SelectableCellModel;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchKeys"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/SelectableCellModel;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    invoke-direct/range {v1 .. v19}, Lcom/whoop/design/models/items/SelectableCellModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/SelectableCellModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/SelectableCellModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getDeselectAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getFixedHeightSize()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getLeftIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeftImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSearchKeys()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    return-object v0
.end method

.method public final getSectionTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    return v0
.end method

.method public final getSelectionStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldTintLeftImage()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    return v0
.end method

.method public final getShowCheckbox()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    return v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    return v0
.end method

.method public final isDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    return v0
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

    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/SelectableCellModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/SelectableCellModel;->title:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/SelectableCellModel;->subtitle:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/SelectableCellModel;->leftIcon:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/SelectableCellModel;->leftImageUrl:Ljava/lang/String;

    iget-boolean v6, v0, Lcom/whoop/design/models/items/SelectableCellModel;->shouldTintLeftImage:Z

    iget-object v7, v0, Lcom/whoop/design/models/items/SelectableCellModel;->selectionStyle:Ljava/lang/String;

    iget-boolean v8, v0, Lcom/whoop/design/models/items/SelectableCellModel;->selected:Z

    iget-boolean v9, v0, Lcom/whoop/design/models/items/SelectableCellModel;->showCheckbox:Z

    iget-boolean v10, v0, Lcom/whoop/design/models/items/SelectableCellModel;->isDisabled:Z

    iget-object v11, v0, Lcom/whoop/design/models/items/SelectableCellModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v12, v0, Lcom/whoop/design/models/items/SelectableCellModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v13, v0, Lcom/whoop/design/models/items/SelectableCellModel;->deselectAction:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v14, v0, Lcom/whoop/design/models/items/SelectableCellModel;->searchKeys:Ljava/util/List;

    iget-object v15, v0, Lcom/whoop/design/models/items/SelectableCellModel;->sectionTitle:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/SelectableCellModel;->fixedHeightSize:Ljava/lang/Double;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/SelectableCellModel;->bindings:Ljava/util/Map;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/SelectableCellModel;->aggregateBindings:Ljava/util/Map;

    const-string v0, ", title="

    move-object/from16 v19, v15

    const-string v15, ", subtitle="

    move-object/from16 v20, v14

    const-string v14, "SelectableCellModel(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", leftIcon="

    const-string v2, ", leftImageUrl="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", shouldTintLeftImage="

    const-string v2, ", selectionStyle="

    invoke-static {v0, v5, v1, v6, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", selected="

    const-string v2, ", showCheckbox="

    invoke-static {v0, v7, v1, v8, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", isDisabled="

    const-string v2, ", action="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interaction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deselectAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", searchKeys="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sectionTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fixedHeightSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    const-string v2, ")"

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
