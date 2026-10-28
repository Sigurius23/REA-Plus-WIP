.class public final Lcom/whoop/design/models/ProgressButtonModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/ProgressButtonModel$$serializer;,
        Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;,
        Lcom/whoop/design/models/ProgressButtonModel$ButtonType;,
        Lcom/whoop/design/models/ProgressButtonModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0087\u0008\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0004fgheB\u00a4\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0016\u0008\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015\u0012+\u0008\u0002\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\t0\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eB\u00a1\u0001\u0008\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u001d\u0010#J#\u0010&\u001a\u00020\u00022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$0\u0015H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u001e\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J3\u0010<\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\t0\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010;J\u00b7\u0001\u0010=\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\u0008\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152+\u0008\u0002\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\t0\u001bH\u00c6\u0001\u00a2\u0006\u0004\u0008=\u0010>J\u0010\u0010?\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008?\u0010-J\u0010\u0010@\u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008@\u0010AJ\u001a\u0010C\u001a\u00020\u00112\u0008\u0010B\u001a\u0004\u0018\u00010$H\u00d6\u0003\u00a2\u0006\u0004\u0008C\u0010DJ\'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001\u00a2\u0006\u0004\u0008K\u0010LR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010N\u001a\u0004\u0008O\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010P\u001a\u0004\u0008Q\u0010+R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010R\u001a\u0004\u0008S\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010T\u001a\u0004\u0008U\u0010/R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010V\u001a\u0004\u0008W\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010X\u001a\u0004\u0008Y\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010Z\u001a\u0004\u0008[\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\\\u001a\u0004\u0008\u0012\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010]\u001a\u0004\u0008^\u00109R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010_\u001a\u0004\u0008`\u0010;\"\u0004\u0008a\u0010bRE\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018\u00a2\u0006\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\t0\u001b8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010_\u001a\u0004\u0008c\u0010;\"\u0004\u0008d\u0010b\u00a8\u0006i"
    }
    d2 = {
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/design/models/ProgressButtonModel$ButtonType;",
        "buttonType",
        "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;",
        "style",
        "",
        "icon",
        "Ly81/f;",
        "iconColor",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lcom/whoop/design/atomic/atom/icon/GlowStyle;",
        "glowStyle",
        "",
        "fillPercentage",
        "",
        "isEnabled",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Lcom/whoop/design/models/ProgressButtonModel$ButtonType;",
        "component2",
        "()Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ly81/f;",
        "component5",
        "()Lcom/whoop/design/util/TextResource;",
        "component6",
        "()Lcom/whoop/design/atomic/atom/icon/GlowStyle;",
        "component7",
        "()Ljava/lang/Float;",
        "component8",
        "()Ljava/lang/Boolean;",
        "component9",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component10",
        "()Ljava/util/Map;",
        "component11",
        "copy",
        "(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/ProgressButtonModel;",
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
        "(Lcom/whoop/design/models/ProgressButtonModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/models/ProgressButtonModel$ButtonType;",
        "getButtonType",
        "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;",
        "getStyle",
        "Ljava/lang/String;",
        "getIcon",
        "Ly81/f;",
        "getIconColor",
        "Lcom/whoop/design/util/TextResource;",
        "getText",
        "Lcom/whoop/design/atomic/atom/icon/GlowStyle;",
        "getGlowStyle",
        "Ljava/lang/Float;",
        "getFillPercentage",
        "Ljava/lang/Boolean;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "ButtonType",
        "ButtonStyle",
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

.field public static final Companion:Lcom/whoop/design/models/ProgressButtonModel$Companion;


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

.field private final buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

.field private final fillPercentage:Ljava/lang/Float;

.field private final glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

.field private final icon:Ljava/lang/String;

.field private final iconColor:Ly81/f;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final isEnabled:Ljava/lang/Boolean;

.field private final style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

.field private final text:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/design/models/ProgressButtonModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/ProgressButtonModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/ProgressButtonModel;->Companion:Lcom/whoop/design/models/ProgressButtonModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/ProgressButtonModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcom/whoop/design/models/a;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcom/whoop/design/models/a;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lcom/whoop/design/models/a;

    const/16 v6, 0x11

    invoke-direct {v5, v6}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lcom/whoop/design/models/a;

    const/16 v7, 0x12

    invoke-direct {v6, v7}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lcom/whoop/design/models/a;

    const/16 v8, 0x13

    invoke-direct {v7, v8}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0xb

    new-array v7, v7, [Ll83/h;

    const/4 v8, 0x0

    aput-object v3, v7, v8

    const/4 v3, 0x1

    aput-object v4, v7, v3

    const/4 v3, 0x2

    aput-object v1, v7, v3

    const/4 v3, 0x3

    aput-object v5, v7, v3

    const/4 v3, 0x4

    aput-object v1, v7, v3

    const/4 v3, 0x5

    aput-object v6, v7, v3

    const/4 v3, 0x6

    aput-object v1, v7, v3

    const/4 v3, 0x7

    aput-object v1, v7, v3

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v2, v7, v0

    const/16 v0, 0xa

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/design/models/ProgressButtonModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    iput-object p3, p0, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    iput-object p4, p0, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    iput-object p6, p0, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    :goto_0
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    goto :goto_1

    :cond_2
    iput-object p8, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    :goto_1
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    iput-object p9, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    :goto_2
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_3

    :cond_4
    iput-object p10, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_3
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    goto :goto_4

    :cond_5
    iput-object p11, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    :goto_4
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_6
    iput-object p12, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/ProgressButtonModel$ButtonType;",
            "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;",
            "Ljava/lang/String;",
            "Ly81/f;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/atomic/atom/icon/GlowStyle;",
            "Ljava/lang/Float;",
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

    const-string v0, "buttonType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x20

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p6, v0

    :cond_0
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_2

    move-object p8, v0

    :cond_2
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_3

    move-object p9, v0

    :cond_3
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_4

    move-object p10, v0

    :cond_4
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_5

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p12, p11

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/design/models/ProgressButtonModel;-><init>(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/ProgressButtonModel$ButtonType;->Companion:Lcom/whoop/design/models/ProgressButtonModel$ButtonType$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/ProgressButtonModel$ButtonType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;->Companion:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/atomic/atom/icon/GlowStyle;->Companion:Lcom/whoop/design/atomic/atom/icon/GlowStyle$a;

    invoke-virtual {v0}, Lcom/whoop/design/atomic/atom/icon/GlowStyle$a;->serializer()Lwc3/c;

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

    invoke-static {}, Lcom/whoop/design/models/ProgressButtonModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/ProgressButtonModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/ProgressButtonModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/ProgressButtonModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/ProgressButtonModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/design/models/ProgressButtonModel;->copy(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/ProgressButtonModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/ProgressButtonModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/ProgressButtonModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/ProgressButtonModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/ProgressButtonModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
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

    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressButtonModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressButtonModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/ProgressButtonModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/ProgressButtonModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Lcom/whoop/design/models/ProgressButtonModel$ButtonType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    return-object v0
.end method

.method public final component10()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component11()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/atomic/atom/icon/GlowStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    return-object v0
.end method

.method public final component7()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/ProgressButtonModel;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/ProgressButtonModel$ButtonType;",
            "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;",
            "Ljava/lang/String;",
            "Ly81/f;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/atomic/atom/icon/GlowStyle;",
            "Ljava/lang/Float;",
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
            "Lcom/whoop/design/models/ProgressButtonModel;"
        }
    .end annotation

    const-string v0, "buttonType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconColor"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/ProgressButtonModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/ProgressButtonModel;-><init>(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/ProgressButtonModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
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

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getButtonType()Lcom/whoop/design/models/ProgressButtonModel$ButtonType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    return-object v0
.end method

.method public final getFillPercentage()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final getGlowStyle()Lcom/whoop/design/atomic/atom/icon/GlowStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getIconColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    return-object v0
.end method

.method public final getText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

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

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public final isEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

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

    iput-object p1, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/design/models/ProgressButtonModel;->buttonType:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    iget-object v1, p0, Lcom/whoop/design/models/ProgressButtonModel;->style:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    iget-object v2, p0, Lcom/whoop/design/models/ProgressButtonModel;->icon:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/ProgressButtonModel;->iconColor:Ly81/f;

    iget-object v4, p0, Lcom/whoop/design/models/ProgressButtonModel;->text:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/design/models/ProgressButtonModel;->glowStyle:Lcom/whoop/design/atomic/atom/icon/GlowStyle;

    iget-object v6, p0, Lcom/whoop/design/models/ProgressButtonModel;->fillPercentage:Ljava/lang/Float;

    iget-object v7, p0, Lcom/whoop/design/models/ProgressButtonModel;->isEnabled:Ljava/lang/Boolean;

    iget-object v8, p0, Lcom/whoop/design/models/ProgressButtonModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v9, p0, Lcom/whoop/design/models/ProgressButtonModel;->bindings:Ljava/util/Map;

    iget-object v10, p0, Lcom/whoop/design/models/ProgressButtonModel;->aggregateBindings:Ljava/util/Map;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "ProgressButtonModel(buttonType="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", iconColor="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", text="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", glowStyle="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fillPercentage="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isEnabled="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", interaction="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bindings="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aggregateBindings="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v11, v10, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
