.class public final Lcom/whoop/design/models/items/TextInputModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/WithGeneratedBindings;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/TextInputModel$$serializer;,
        Lcom/whoop/design/models/items/TextInputModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0002qpB\u00af\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00d9\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001c\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\u0019\u0010\"J#\u0010%\u001a\u00020\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\u001cH\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010(J\u0012\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010(J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00085\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010(J\u0012\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010(J\u0012\u00108\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010(J\u00c8\u0001\u0010=\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008=\u0010>J\u0010\u0010?\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008?\u0010(J\u0010\u0010@\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008@\u0010AJ\u001a\u0010C\u001a\u00020\u000f2\u0008\u0010B\u001a\u0004\u0018\u00010#H\u00d6\u0003\u00a2\u0006\u0004\u0008C\u0010DJ\'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001\u00a2\u0006\u0004\u0008K\u0010LR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010N\u001a\u0004\u0008O\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010N\u001a\u0004\u0008P\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010N\u001a\u0004\u0008Q\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010N\u001a\u0004\u0008R\u0010(R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010N\u001a\u0004\u0008S\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010N\u001a\u0004\u0008T\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010N\u001a\u0004\u0008U\u0010(R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010V\u001a\u0004\u0008W\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010X\u001a\u0004\u0008Y\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010Z\u001a\u0004\u0008\u0010\u00104R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010Z\u001a\u0004\u0008\u0011\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010N\u001a\u0004\u0008[\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010N\u001a\u0004\u0008\\\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010]\u001a\u0004\u0008^\u00109R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010_\u0012\u0004\u0008a\u0010b\u001a\u0004\u0008`\u0010;R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010N\u0012\u0004\u0008d\u0010b\u001a\u0004\u0008c\u0010(R0\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010e\u001a\u0004\u0008f\u0010g\"\u0004\u0008h\u0010iRE\u0010\u001f\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cj\u0004\u0018\u0001`j\u00a2\u0006\u000c\u0008k\u0012\u0008\u0008l\u0012\u0004\u0008\t0m8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010e\u001a\u0004\u0008n\u0010g\"\u0004\u0008o\u0010i\u00a8\u0006r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TextInputModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "label",
        "placeholder",
        "text",
        "icon",
        "suffix",
        "caption",
        "",
        "maxLength",
        "Lcom/whoop/design/models/items/TextInputKeyboardType;",
        "keyboardType",
        "",
        "isSecure",
        "isDisabled",
        "stateUpdateValueKey",
        "errorStateKey",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "overrideTapInteraction",
        "Lcom/whoop/design/models/items/TextInputValidation;",
        "textInputValidation",
        "errorMessage",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)V",
        "seen0",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
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
        "component7",
        "component8",
        "()Ljava/lang/Integer;",
        "component9",
        "()Lcom/whoop/design/models/items/TextInputKeyboardType;",
        "component10",
        "()Z",
        "component11",
        "component12",
        "component13",
        "component14",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component15",
        "()Lcom/whoop/design/models/items/TextInputValidation;",
        "component16",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)Lcom/whoop/design/models/items/TextInputModel;",
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
        "(Lcom/whoop/design/models/items/TextInputModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getLabel",
        "getPlaceholder",
        "getText",
        "getIcon",
        "getSuffix",
        "getCaption",
        "Ljava/lang/Integer;",
        "getMaxLength",
        "Lcom/whoop/design/models/items/TextInputKeyboardType;",
        "getKeyboardType",
        "Z",
        "getStateUpdateValueKey",
        "getErrorStateKey",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getOverrideTapInteraction",
        "Lcom/whoop/design/models/items/TextInputValidation;",
        "getTextInputValidation",
        "getTextInputValidation$annotations",
        "()V",
        "getErrorMessage",
        "getErrorMessage$annotations",
        "Ljava/util/Map;",
        "getBindings",
        "()Ljava/util/Map;",
        "setBindings",
        "(Ljava/util/Map;)V",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
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

.field public static final Companion:Lcom/whoop/design/models/items/TextInputModel$Companion;


# instance fields
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

.field private final caption:Ljava/lang/String;

.field private final errorMessage:Ljava/lang/String;

.field private final errorStateKey:Ljava/lang/String;

.field private final icon:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final isDisabled:Z

.field private final isSecure:Z

.field private final keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

.field private final label:Ljava/lang/String;

.field private final maxLength:Ljava/lang/Integer;

.field private final overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final placeholder:Ljava/lang/String;

.field private final stateUpdateValueKey:Ljava/lang/String;

.field private final suffix:Ljava/lang/String;

.field private final text:Ljava/lang/String;

.field private final textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "validation"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/design/models/items/TextInputModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/TextInputModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/TextInputModel;->Companion:Lcom/whoop/design/models/items/TextInputModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/TextInputModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/k;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lw91/k;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/k;

    const/16 v6, 0xd

    invoke-direct {v5, v6}, Lw91/k;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x11

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    const/4 v7, 0x1

    aput-object v1, v5, v7

    const/4 v7, 0x2

    aput-object v1, v5, v7

    const/4 v7, 0x3

    aput-object v1, v5, v7

    const/4 v7, 0x4

    aput-object v1, v5, v7

    const/4 v7, 0x5

    aput-object v1, v5, v7

    const/4 v7, 0x6

    aput-object v1, v5, v7

    const/4 v7, 0x7

    aput-object v1, v5, v7

    aput-object v3, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    const/16 v0, 0xb

    aput-object v1, v5, v0

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    const/16 v0, 0xe

    aput-object v1, v5, v0

    const/16 v0, 0xf

    aput-object v2, v5, v0

    const/16 v0, 0x10

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/design/models/items/TextInputModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0xff

    const/16 v1, 0xff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/TextInputModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TextInputModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TextInputModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lcom/whoop/design/models/items/TextInputKeyboardType;->DEFAULT:Lcom/whoop/design/models/items/TextInputKeyboardType;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    goto :goto_0

    :cond_1
    iput-object p10, p0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    :goto_0
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_2

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    goto :goto_1

    :cond_2
    iput-boolean p11, p0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    :goto_1
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_3

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    goto :goto_2

    :cond_3
    iput-boolean p12, p0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    :goto_2
    and-int/lit16 p2, p1, 0x800

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p13, p0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    :goto_3
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_5

    :cond_6
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_5
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    goto :goto_6

    :cond_7
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    :goto_6
    iput-object p3, p0, Lcom/whoop/design/models/items/TextInputModel;->errorMessage:Ljava/lang/String;

    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/design/models/items/TextInputModel;->bindings:Ljava/util/Map;

    goto :goto_7

    :cond_8
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/design/models/items/TextInputModel;->bindings:Ljava/util/Map;

    :goto_7
    const/high16 p2, 0x10000

    and-int/2addr p1, p2

    if-nez p1, :cond_9

    iput-object p3, p0, Lcom/whoop/design/models/items/TextInputModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_9
    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/design/models/items/TextInputModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyboardType"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    .line 13
    iput-object p9, p0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    .line 14
    iput-boolean p10, p0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    .line 15
    iput-boolean p11, p0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    .line 16
    iput-object p12, p0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    .line 17
    iput-object p13, p0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    .line 18
    iput-object p14, p0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    move-object/from16 p1, p15

    .line 19
    iput-object p1, p0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    move-object/from16 p1, p16

    .line 20
    iput-object p1, p0, Lcom/whoop/design/models/items/TextInputModel;->errorMessage:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p17

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_0

    .line 21
    sget-object v1, Lcom/whoop/design/models/items/TextInputKeyboardType;->DEFAULT:Lcom/whoop/design/models/items/TextInputKeyboardType;

    move-object v11, v1

    goto :goto_0

    :cond_0
    move-object/from16 v11, p9

    :goto_0
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v12, v1

    goto :goto_1

    :cond_1
    move/from16 v12, p10

    :goto_1
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    move v13, v1

    goto :goto_2

    :cond_2
    move/from16 v13, p11

    :goto_2
    and-int/lit16 v1, v0, 0x800

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object v14, v2

    goto :goto_3

    :cond_3
    move-object/from16 v14, p12

    :goto_3
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_4

    move-object v15, v2

    goto :goto_4

    :cond_4
    move-object/from16 v15, p13

    :goto_4
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_5

    move-object/from16 v16, v2

    goto :goto_5

    :cond_5
    move-object/from16 v16, p14

    :goto_5
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_6

    move-object/from16 v17, v2

    goto :goto_6

    :cond_6
    move-object/from16 v17, p15

    :goto_6
    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_7

    move-object/from16 v18, v2

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v2, p0

    goto :goto_7

    :cond_7
    move-object/from16 v18, p16

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    .line 22
    :goto_7
    invoke-direct/range {v2 .. v18}, Lcom/whoop/design/models/items/TextInputModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.TextInputKeyboardType"

    invoke-static {}, Lcom/whoop/design/models/items/TextInputKeyboardType;->values()[Lcom/whoop/design/models/items/TextInputKeyboardType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/TextInputModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/TextInputModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/TextInputModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/TextInputModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/TextInputModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/TextInputModel;->errorMessage:Ljava/lang/String;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lcom/whoop/design/models/items/TextInputModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)Lcom/whoop/design/models/items/TextInputModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getErrorMessage$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getTextInputValidation$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "validation"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/TextInputModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/design/models/items/TextInputModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v4, p0, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v4, p0, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v4, p0, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v4, p0, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v4, p0, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    const/4 v5, 0x7

    invoke-interface {p1, p2, v5, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    sget-object v5, Lcom/whoop/design/models/items/TextInputKeyboardType;->DEFAULT:Lcom/whoop/design/models/items/TextInputKeyboardType;

    if-eq v4, v5, :cond_1

    :goto_0
    aget-object v4, v0, v2

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwc3/j;

    iget-object v5, p0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    invoke-interface {p1, p2, v2, v4, v5}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v2, 0x9

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v4, p0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    if-eqz v4, :cond_3

    :goto_1
    iget-boolean v4, p0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    invoke-interface {p1, p2, v2, v4}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/16 v2, 0xa

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v4, p0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    if-eq v4, v3, :cond_5

    :goto_2
    iget-boolean v3, p0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/16 v2, 0xb

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    iget-object v3, p0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    if-eqz v3, :cond_7

    :goto_3
    iget-object v3, p0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v2, 0xc

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    iget-object v3, p0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    if-eqz v3, :cond_9

    :goto_4
    iget-object v3, p0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v1, 0xd

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lcom/whoop/design/models/items/TextInputValidation$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TextInputValidation$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_f

    :goto_7
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 23
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "accumulatedState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TextInputModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TextInputModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v3

    invoke-static {v0, v2, v3, v1}, Lcom/whoop/design/models/items/TextInputModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/TextInputModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/TextInputModel;

    move-result-object v4

    iget-object v2, v0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/TextInputValidation;->getValidityKey()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/Boolean;

    if-eqz v6, :cond_0

    check-cast v5, Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    move-object v5, v3

    :goto_0
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    if-eqz v5, :cond_2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/TextInputValidation;->getInvalidMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v3

    :goto_2
    if-nez v2, :cond_3

    goto :goto_4

    :cond_3
    :goto_3
    move-object/from16 v20, v2

    goto :goto_5

    :cond_4
    :goto_4
    iget-object v2, v0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    if-eqz v2, :cond_6

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/lang/String;

    if-eqz v5, :cond_5

    check-cast v2, Ljava/lang/String;

    goto :goto_3

    :cond_5
    move-object v2, v3

    goto :goto_3

    :cond_6
    move-object/from16 v20, v3

    :goto_5
    iget-object v2, v0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TextInputModel;->getBindings()Ljava/util/Map;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_7

    const-string v7, "text"

    invoke-interface {v5, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    const/4 v7, 0x1

    if-ne v5, v7, :cond_7

    move v6, v7

    :cond_7
    if-nez v6, :cond_8

    goto :goto_6

    :cond_8
    move-object v2, v3

    :goto_6
    if-eqz v2, :cond_9

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/models/items/TextInputModelKt;->access$toStateText(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :cond_9
    if-nez v3, :cond_a

    iget-object v3, v4, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    :cond_a
    move-object v8, v3

    const/16 v21, 0x7ff7

    const/16 v22, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    invoke-static/range {v4 .. v22}, Lcom/whoop/design/models/items/TextInputModel;->copy$default(Lcom/whoop/design/models/items/TextInputModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/TextInputModel;

    move-result-object v1

    return-object v1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    return v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component15()Lcom/whoop/design/models/items/TextInputValidation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/TextInputKeyboardType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)Lcom/whoop/design/models/items/TextInputModel;
    .locals 18

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyboardType"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/TextInputModel;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/whoop/design/models/items/TextInputModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/TextInputKeyboardType;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/TextInputModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/TextInputModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    iget-object v3, p1, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->errorMessage:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/TextInputModel;->errorMessage:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
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

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getCaption()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorStateKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getKeyboardType()Lcom/whoop/design/models/items/TextInputKeyboardType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxLength()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getOverrideTapInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getPlaceholder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    return-object v0
.end method

.method public final getStateUpdateValueKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextInputValidation()Lcom/whoop/design/models/items/TextInputValidation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TextInputValidation;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/TextInputModel;->errorMessage:Ljava/lang/String;

    if-nez v1, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    return v0
.end method

.method public final isDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    return v0
.end method

.method public final isSecure()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

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

    iput-object p1, p0, Lcom/whoop/design/models/items/TextInputModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/TextInputModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/TextInputModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/TextInputModel;->label:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/TextInputModel;->placeholder:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/TextInputModel;->text:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/TextInputModel;->icon:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/TextInputModel;->suffix:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/TextInputModel;->caption:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/TextInputModel;->maxLength:Ljava/lang/Integer;

    iget-object v9, v0, Lcom/whoop/design/models/items/TextInputModel;->keyboardType:Lcom/whoop/design/models/items/TextInputKeyboardType;

    iget-boolean v10, v0, Lcom/whoop/design/models/items/TextInputModel;->isSecure:Z

    iget-boolean v11, v0, Lcom/whoop/design/models/items/TextInputModel;->isDisabled:Z

    iget-object v12, v0, Lcom/whoop/design/models/items/TextInputModel;->stateUpdateValueKey:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/design/models/items/TextInputModel;->errorStateKey:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/design/models/items/TextInputModel;->overrideTapInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v15, v0, Lcom/whoop/design/models/items/TextInputModel;->textInputValidation:Lcom/whoop/design/models/items/TextInputValidation;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/TextInputModel;->errorMessage:Ljava/lang/String;

    const-string v0, ", label="

    move-object/from16 v17, v15

    const-string v15, ", placeholder="

    move-object/from16 v18, v14

    const-string v14, "TextInputModel(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", text="

    const-string v2, ", icon="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", suffix="

    const-string v2, ", caption="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", maxLength="

    const-string v2, ", keyboardType="

    invoke-static {v8, v7, v1, v2, v0}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSecure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isDisabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", stateUpdateValueKey="

    const-string v2, ", errorStateKey="

    invoke-static {v0, v11, v1, v12, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", overrideTapInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textInputValidation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
