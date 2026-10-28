.class public final Lcom/whoop/design/models/items/CheckboxModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/CheckboxModel$$serializer;,
        Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;,
        Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;,
        Lcom/whoop/design/models/items/CheckboxModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0004efgdB\u00b4\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0016\u0008\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012+\u0008\u0002\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\t0\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eB\u00a9\u0001\u0008\u0010\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\u001d\u0010\"J#\u0010%\u001a\u00020\u00022\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\u0015H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0010\u0010*\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u001e\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010:J3\u0010;\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\t0\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010:J\u00c7\u0001\u0010<\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\u0008\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152+\u0008\u0002\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\t0\u001bH\u00c6\u0001\u00a2\u0006\u0004\u0008<\u0010=J\u0010\u0010>\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008>\u0010(J\u0010\u0010?\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008?\u0010@J\u001a\u0010B\u001a\u00020\u00062\u0008\u0010A\u001a\u0004\u0018\u00010#H\u00d6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\'\u0010L\u001a\u00020I2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0001\u00a2\u0006\u0004\u0008J\u0010KR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010M\u001a\u0004\u0008N\u0010(R\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010M\u001a\u0004\u0008O\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010P\u001a\u0004\u0008\u0007\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010Q\u001a\u0004\u0008R\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010Q\u001a\u0004\u0008S\u0010-R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010T\u001a\u0004\u0008U\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010V\u001a\u0004\u0008W\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010X\u001a\u0004\u0008Y\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010Z\u001a\u0004\u0008[\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\\\u001a\u0004\u0008]\u00108R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010^\u001a\u0004\u0008_\u0010:\"\u0004\u0008`\u0010aRE\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\t0\u001b8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010^\u001a\u0004\u0008b\u0010:\"\u0004\u0008c\u0010a\u00a8\u0006h"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CheckboxModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "label",
        "",
        "isToggled",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "toggleOnInteraction",
        "toggleOffInteraction",
        "Lb91/c;",
        "labelStyle",
        "",
        "spacerSize",
        "Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;",
        "alignment",
        "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;",
        "style",
        "Ly81/f;",
        "toggledOnColor",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component5",
        "component6",
        "()Lb91/c;",
        "component7",
        "()Ljava/lang/Integer;",
        "component8",
        "()Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;",
        "component9",
        "()Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;",
        "component10",
        "()Ly81/f;",
        "component11",
        "()Ljava/util/Map;",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CheckboxModel;",
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
        "(Lcom/whoop/design/models/items/CheckboxModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getLabel",
        "Z",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getToggleOnInteraction",
        "getToggleOffInteraction",
        "Lb91/c;",
        "getLabelStyle",
        "Ljava/lang/Integer;",
        "getSpacerSize",
        "Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;",
        "getAlignment",
        "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;",
        "getStyle",
        "Ly81/f;",
        "getToggledOnColor",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "CheckboxAlignment",
        "CheckboxStyle",
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

.field public static final Companion:Lcom/whoop/design/models/items/CheckboxModel$Companion;


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

.field private final alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

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

.field private final id:Ljava/lang/String;

.field private final isToggled:Z

.field private final label:Ljava/lang/String;

.field private final labelStyle:Lb91/c;

.field private final spacerSize:Ljava/lang/Integer;

.field private final style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

.field private final toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final toggledOnColor:Ly81/f;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/design/models/items/CheckboxModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/CheckboxModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/CheckboxModel;->Companion:Lcom/whoop/design/models/items/CheckboxModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/CheckboxModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/a;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lw91/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/a;

    const/16 v5, 0x18

    invoke-direct {v4, v5}, Lw91/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lw91/a;

    const/16 v6, 0x19

    invoke-direct {v5, v6}, Lw91/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lw91/a;

    const/16 v7, 0x1a

    invoke-direct {v6, v7}, Lw91/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lw91/a;

    const/16 v8, 0x1b

    invoke-direct {v7, v8}, Lw91/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0xc

    new-array v7, v7, [Ll83/h;

    const/4 v8, 0x0

    aput-object v1, v7, v8

    const/4 v8, 0x1

    aput-object v1, v7, v8

    const/4 v8, 0x2

    aput-object v1, v7, v8

    const/4 v8, 0x3

    aput-object v1, v7, v8

    const/4 v8, 0x4

    aput-object v1, v7, v8

    const/4 v8, 0x5

    aput-object v3, v7, v8

    const/4 v3, 0x6

    aput-object v1, v7, v3

    const/4 v3, 0x7

    aput-object v4, v7, v3

    aput-object v5, v7, v0

    const/16 v0, 0x9

    aput-object v6, v7, v0

    const/16 v0, 0xa

    aput-object v2, v7, v0

    const/16 v0, 0xb

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/design/models/items/CheckboxModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p1, 0x67

    const/16 v0, 0x67

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/design/models/items/CheckboxModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CheckboxModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/design/models/items/CheckboxModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_1
    iput-object p7, p0, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    iput-object p8, p0, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    goto :goto_2

    :cond_3
    iput-object p9, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    :goto_2
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    goto :goto_3

    :cond_4
    iput-object p10, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    :goto_3
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    goto :goto_4

    :cond_5
    iput-object p11, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    :goto_4
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    goto :goto_5

    :cond_6
    iput-object p12, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    :goto_5
    and-int/lit16 p1, p1, 0x800

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_7
    iput-object p13, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lb91/c;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;",
            "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;",
            "Ly81/f;",
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

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x8

    const/4 v0, 0x0

    if-eqz p14, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_2

    move-object p8, v0

    :cond_2
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_3

    move-object p9, v0

    :cond_3
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_4

    move-object p10, v0

    :cond_4
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_5

    move-object p11, v0

    :cond_5
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_6

    move-object p13, v0

    :goto_0
    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move-object p13, p12

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p13}, Lcom/whoop/design/models/items/CheckboxModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.typography.WhoopTextStyle"

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;->Companion:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;->Companion:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CheckboxModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/CheckboxModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CheckboxModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CheckboxModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/CheckboxModel;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/CheckboxModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-boolean p3, p0, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/design/models/items/CheckboxModel;->copy(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CheckboxModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CheckboxModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/CheckboxModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/CheckboxModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/CheckboxModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_d

    :goto_6
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
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

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/CheckboxModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/CheckboxModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CheckboxModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    return-object v0
.end method

.method public final component11()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component12()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

    return v0
.end method

.method public final component4()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component6()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CheckboxModel;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Lb91/c;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;",
            "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;",
            "Ly81/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/CheckboxModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/CheckboxModel;

    move-object v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/design/models/items/CheckboxModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/CheckboxModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/CheckboxModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
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

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getAlignment()Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabelStyle()Lb91/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    return-object v0
.end method

.method public final getSpacerSize()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    return-object v0
.end method

.method public final getToggleOffInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getToggleOnInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getToggledOnColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    return v0
.end method

.method public final isToggled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

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

    iput-object p1, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/design/models/items/CheckboxModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/CheckboxModel;->label:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/design/models/items/CheckboxModel;->isToggled:Z

    iget-object v3, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOnInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v4, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggleOffInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v5, p0, Lcom/whoop/design/models/items/CheckboxModel;->labelStyle:Lb91/c;

    iget-object v6, p0, Lcom/whoop/design/models/items/CheckboxModel;->spacerSize:Ljava/lang/Integer;

    iget-object v7, p0, Lcom/whoop/design/models/items/CheckboxModel;->alignment:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    iget-object v8, p0, Lcom/whoop/design/models/items/CheckboxModel;->style:Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    iget-object v9, p0, Lcom/whoop/design/models/items/CheckboxModel;->toggledOnColor:Ly81/f;

    iget-object v10, p0, Lcom/whoop/design/models/items/CheckboxModel;->bindings:Ljava/util/Map;

    iget-object v11, p0, Lcom/whoop/design/models/items/CheckboxModel;->aggregateBindings:Ljava/util/Map;

    const-string v12, ", label="

    const-string v13, ", isToggled="

    const-string v14, "CheckboxModel(id="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", toggleOnInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toggleOffInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", labelStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spacerSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", toggledOnColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
