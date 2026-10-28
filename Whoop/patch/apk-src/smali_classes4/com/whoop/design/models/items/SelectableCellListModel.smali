.class public final Lcom/whoop/design/models/items/SelectableCellListModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/SearchFilterableModel;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/SelectableCellListModel$$serializer;,
        Lcom/whoop/design/models/items/SelectableCellListModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0002cbB\u00ba\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0008\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012+\u0008\u0002\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\t0\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cB\u00a1\u0001\u0008\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008\u001b\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J#\u0010&\u001a\u00020\u00022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0\u0013H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010+J\u0016\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010)J\u0012\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010)J\u0012\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010)J\u0012\u00102\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010)J\u001e\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J3\u00109\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\t0\u0019H\u00c6\u0003\u00a2\u0006\u0004\u00089\u00108J\u00c9\u0001\u0010:\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0016\u0008\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00132+\u0008\u0002\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\t0\u0019H\u00c6\u0001\u00a2\u0006\u0004\u0008:\u0010;J\u0010\u0010<\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008<\u0010)J\u0010\u0010=\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008=\u0010+J\u001a\u0010?\u001a\u00020\u00102\u0008\u0010>\u001a\u0004\u0018\u00010$H\u00d6\u0003\u00a2\u0006\u0004\u0008?\u0010@J#\u0010A\u001a\u00020\u00002\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0\u0013H\u0002\u00a2\u0006\u0004\u0008A\u0010BJ\'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001\u00a2\u0006\u0004\u0008I\u0010JR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010L\u001a\u0004\u0008M\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010N\u001a\u0004\u0008O\u0010+R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010N\u001a\u0004\u0008P\u0010+R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010Q\u001a\u0004\u0008R\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010L\u001a\u0004\u0008S\u0010)R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010L\u001a\u0004\u0008T\u0010)R\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010L\u0012\u0004\u0008V\u0010W\u001a\u0004\u0008U\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010X\u001a\u0004\u0008Y\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010Z\u001a\u0004\u0008\u0011\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010L\u001a\u0004\u0008[\u0010)R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\\\u001a\u0004\u0008]\u00108\"\u0004\u0008^\u0010_RE\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\t0\u00198\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\\\u001a\u0004\u0008`\u00108\"\u0004\u0008a\u0010_\u00a8\u0006d"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SelectableCellListModel;",
        "Lcom/whoop/design/models/SearchFilterableModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "",
        "maxSelection",
        "minSelection",
        "",
        "Lcom/whoop/design/models/items/SelectableCellModel;",
        "cells",
        "stateUpdateValueKey",
        "stateUpdateSearchKey",
        "searchQuery",
        "Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;",
        "searchBehavior",
        "",
        "isDisabled",
        "disabledStateKey",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "query",
        "filteredForSearch",
        "(Ljava/lang/String;)Lcom/whoop/design/models/items/SelectableCellListModel;",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;",
        "component9",
        "()Z",
        "component10",
        "component11",
        "()Ljava/util/Map;",
        "component12",
        "copy",
        "(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellListModel;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "withResolvedDisabled",
        "(Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellListModel;",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/SelectableCellListModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "I",
        "getMaxSelection",
        "getMinSelection",
        "Ljava/util/List;",
        "getCells",
        "getStateUpdateValueKey",
        "getStateUpdateSearchKey",
        "getSearchQuery",
        "getSearchQuery$annotations",
        "()V",
        "Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;",
        "getSearchBehavior",
        "Z",
        "getDisabledStateKey",
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

.field public static final Companion:Lcom/whoop/design/models/items/SelectableCellListModel$Companion;


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

.field private final cells:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/SelectableCellModel;",
            ">;"
        }
    .end annotation
.end field

.field private final disabledStateKey:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final isDisabled:Z

.field private final maxSelection:I

.field private final minSelection:I

.field private final searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

.field private final searchQuery:Ljava/lang/String;

.field private final stateUpdateSearchKey:Ljava/lang/String;

.field private final stateUpdateValueKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/whoop/design/models/items/SelectableCellListModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/SelectableCellListModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/SelectableCellListModel;->Companion:Lcom/whoop/design/models/items/SelectableCellListModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/SelectableCellListModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/j;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lw91/j;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/j;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Lw91/j;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/j;

    const/4 v8, 0x5

    invoke-direct {v7, v8}, Lw91/j;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0xb

    new-array v7, v7, [Ll83/h;

    const/4 v9, 0x0

    aput-object v1, v7, v9

    const/4 v9, 0x1

    aput-object v1, v7, v9

    const/4 v9, 0x2

    aput-object v1, v7, v9

    aput-object v3, v7, v4

    aput-object v1, v7, v6

    aput-object v1, v7, v8

    const/4 v3, 0x6

    aput-object v5, v7, v3

    const/4 v3, 0x7

    aput-object v1, v7, v3

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v2, v7, v0

    const/16 v0, 0xa

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/design/models/items/SelectableCellListModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p1, 0xb

    const/16 v0, 0xb

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/design/models/items/SelectableCellListModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SelectableCellListModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/design/models/items/SelectableCellListModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput p3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    goto :goto_0

    :cond_1
    iput p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    :goto_0
    iput-object p5, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    and-int/lit8 p2, p1, 0x10

    const/4 p4, 0x0

    if-nez p2, :cond_2

    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    :goto_2
    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchQuery:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_4

    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    :goto_3
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_5

    iput-boolean p3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    goto :goto_4

    :cond_5
    iput-boolean p9, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    :goto_4
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_6

    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p10, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_7

    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    goto :goto_6

    :cond_7
    iput-object p11, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    :goto_6
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_8

    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_8
    iput-object p12, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/SelectableCellModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;",
            "Z",
            "Ljava/lang/String;",
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

    const-string v0, "cells"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    .line 5
    iput p3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchQuery:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    .line 11
    iput-boolean p9, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v6, v2

    goto :goto_0

    :cond_0
    move/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x10

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move-object v8, v3

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v3

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v3

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v3

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move v12, v2

    goto :goto_5

    :cond_5
    move/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v3

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v14, v3

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_8

    move-object v15, v3

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v7, p4

    move-object/from16 v3, p0

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v7, p4

    .line 15
    :goto_8
    invoke-direct/range {v3 .. v15}, Lcom/whoop/design/models/items/SelectableCellListModel;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/SelectableCellModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/SelectableCellModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.SelectableCellListSearchBehavior"

    invoke-static {}, Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;->values()[Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SelectableCellListModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/SelectableCellListModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SelectableCellListModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/SelectableCellListModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/SelectableCellListModel;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SelectableCellListModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchQuery:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-boolean p9, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/design/models/items/SelectableCellListModel;->copy(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellListModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSearchQuery$annotations()V
    .locals 0

    return-void
.end method

.method private final withResolvedDisabled(Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellListModel;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/items/SelectableCellListModel;"
        }
    .end annotation

    iget-boolean v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    if-nez v1, :cond_1

    :goto_0
    return-object p0

    :cond_1
    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    :catch_0
    :cond_2
    move-object v1, v2

    goto/16 :goto_2

    :cond_3
    instance-of v3, v1, Lkotlinx/serialization/json/JsonElement;

    if-eqz v3, :cond_4

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v4

    invoke-virtual {v4, v3, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :cond_4
    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_5

    goto/16 :goto_2

    :cond_5
    instance-of v3, v1, Ljava/lang/Number;

    if-eqz v3, :cond_b

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto/16 :goto_2

    :cond_6
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto/16 :goto_2

    :cond_7
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_2

    :cond_8
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_2

    :cond_9
    sget-object v5, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->shortValue()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_2

    :cond_a
    sget-object v5, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    move-result v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    goto :goto_2

    :cond_b
    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_2

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v1

    :try_start_1
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v4

    invoke-virtual {v4, v3, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_2

    :goto_2
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    const/16 v13, 0xeff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v14}, Lcom/whoop/design/models/items/SelectableCellListModel;->copy$default(Lcom/whoop/design/models/items/SelectableCellListModel;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SelectableCellListModel;

    move-result-object v1

    move-object v0, v1

    goto :goto_3

    :cond_c
    move-object v0, p0

    :goto_3
    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/SelectableCellListModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/SelectableCellListModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    if-eqz v2, :cond_1

    :goto_0
    iget v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-boolean v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    if-eqz v2, :cond_9

    :goto_4
    iget-boolean v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_9
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 33
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

    move-object/from16 v0, p1

    const-string v1, "accumulatedState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getBindings()Ljava/util/Map;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/SelectableCellListModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v2

    move-object/from16 v3, p0

    invoke-static {v3, v1, v2, v0}, Lcom/whoop/design/models/items/SelectableCellListModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/SelectableCellListModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellListModel;

    move-result-object v1

    invoke-direct {v1, v0}, Lcom/whoop/design/models/items/SelectableCellListModel;->withResolvedDisabled(Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellListModel;

    move-result-object v4

    iget-object v1, v4, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/models/items/SelectableCellListModelKt;->access$toSelectedCellIdsOrNull(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/16 v5, 0xa

    if-nez v1, :cond_4

    iget-object v1, v4, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/SelectableCellModel;->getSelected()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v6, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-virtual {v7}, Lcom/whoop/design/models/items/SelectableCellModel;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    :cond_4
    iget-object v6, v4, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_5

    move-object v11, v0

    goto :goto_3

    :cond_5
    move-object v11, v2

    :goto_3
    iget-object v0, v4, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    if-nez v11, :cond_6

    goto :goto_5

    :cond_6
    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-virtual {v9}, Lcom/whoop/design/models/items/SelectableCellModel;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    move-object v0, v7

    :goto_5
    check-cast v0, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-virtual {v12}, Lcom/whoop/design/models/items/SelectableCellModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v20

    if-nez v11, :cond_9

    invoke-virtual {v12}, Lcom/whoop/design/models/items/SelectableCellModel;->getSectionTitle()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v27, v5

    goto :goto_7

    :cond_9
    move-object/from16 v27, v2

    :goto_7
    const v31, 0x3bf7f

    const/16 v32, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v12 .. v32}, Lcom/whoop/design/models/items/SelectableCellModel;->copy$default(Lcom/whoop/design/models/items/SelectableCellModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SelectableCellModel;

    move-result-object v5

    invoke-interface {v8, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    const/16 v17, 0xfb7

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Lcom/whoop/design/models/items/SelectableCellListModel;->copy$default(Lcom/whoop/design/models/items/SelectableCellListModel;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SelectableCellListModel;

    move-result-object v0

    return-object v0
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/SelectableCellModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchQuery:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SelectableCellListModel;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/SelectableCellModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/SelectableCellListModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cells"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/SelectableCellListModel;

    move-object v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/design/models/items/SelectableCellListModel;-><init>(Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/SelectableCellListModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/SelectableCellListModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    iget v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    iget v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchQuery:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->searchQuery:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public bridge synthetic filteredForSearch(Ljava/lang/String;)Lcom/whoop/design/models/SearchFilterableModel;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/SelectableCellListModel;->filteredForSearch(Ljava/lang/String;)Lcom/whoop/design/models/items/SelectableCellListModel;

    move-result-object p1

    return-object p1
.end method

.method public filteredForSearch(Ljava/lang/String;)Lcom/whoop/design/models/items/SelectableCellListModel;
    .locals 15

    move-object/from16 v1, p1

    const-string v2, "query"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    .line 3
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    .line 4
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/whoop/design/models/items/SelectableCellModel;

    .line 6
    invoke-static {v5, v1}, Lcom/whoop/design/models/items/SelectableCellListModelKt;->matchesSearch(Lcom/whoop/design/models/items/SelectableCellModel;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v5}, Lcom/whoop/design/models/items/SelectableCellModel;->getSelected()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 7
    :cond_3
    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const/16 v13, 0xff7

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    .line 8
    invoke-static/range {v0 .. v14}, Lcom/whoop/design/models/items/SelectableCellListModel;->copy$default(Lcom/whoop/design/models/items/SelectableCellListModel;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SelectableCellListModel;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    return-object v1

    :cond_5
    const/4 v0, 0x0

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

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getCells()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/SelectableCellModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    return-object v0
.end method

.method public final getDisabledStateKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxSelection()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    return v0
.end method

.method public final getMinSelection()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    return v0
.end method

.method public final getSearchBehavior()Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    return-object v0
.end method

.method public final getSearchQuery()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchQuery:Ljava/lang/String;

    return-object v0
.end method

.method public final getStateUpdateSearchKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getStateUpdateValueKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchQuery:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public final isDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

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

    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->id:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->maxSelection:I

    iget v2, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->minSelection:I

    iget-object v3, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->cells:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateValueKey:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->stateUpdateSearchKey:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchQuery:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->searchBehavior:Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;

    iget-boolean v8, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->isDisabled:Z

    iget-object v9, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->disabledStateKey:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->bindings:Ljava/util/Map;

    iget-object v11, p0, Lcom/whoop/design/models/items/SelectableCellListModel;->aggregateBindings:Ljava/util/Map;

    const-string v12, ", maxSelection="

    const-string v13, ", minSelection="

    const-string v14, "SelectableCellListModel(id="

    invoke-static {v1, v14, v0, v12, v13}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", cells="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stateUpdateValueKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", stateUpdateSearchKey="

    const-string v2, ", searchQuery="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", searchBehavior="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isDisabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", disabledStateKey="

    const-string v2, ", bindings="

    invoke-static {v0, v8, v1, v9, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", aggregateBindings="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
