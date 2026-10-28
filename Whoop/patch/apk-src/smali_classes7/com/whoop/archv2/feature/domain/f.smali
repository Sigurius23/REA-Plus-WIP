.class public final Lcom/whoop/archv2/feature/domain/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u00088\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00e9\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0006\u0012\u0014\u0008\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0004\u0008%\u0010&J\u00f2\u0001\u0010\'\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00062\u0014\u0008\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00192\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010#H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010,\u001a\u00020+H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u0010/\u001a\u00020\u00062\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u00101\u001a\u0004\u00082\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00109\u001a\u0004\u0008<\u0010;R\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u00109\u001a\u0004\u0008=\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u0010?\u001a\u0004\u0008>\u0010@R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010A\u001a\u0004\u0008B\u0010CR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008B\u0010A\u001a\u0004\u0008D\u0010CR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010GR\u0017\u0010\u0011\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008H\u00109\u001a\u0004\u0008I\u0010;R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008F\u0010J\u001a\u0004\u00088\u0010KR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008L\u0010M\u001a\u0004\u0008N\u0010OR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008P\u0010Q\u001a\u0004\u0008H\u0010RR\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008S\u0010T\u001a\u0004\u0008P\u0010UR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u001a\u0004\u0008L\u0010XR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008Y\u0010Z\u001a\u0004\u0008Y\u0010[R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008N\u0010\\\u001a\u0004\u0008V\u0010]R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006\u00a2\u0006\u000c\n\u0004\u00086\u0010^\u001a\u0004\u0008S\u0010_R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010`\u001a\u0004\u0008a\u0010b\u00a8\u0006c"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/f;",
        "",
        "Lcom/whoop/archv2/feature/domain/b;",
        "currentDialogType",
        "Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "screenTemplate",
        "",
        "manualRefresh",
        "displayRefreshingSpinner",
        "isStaleFromCache",
        "Lri0/b;",
        "event",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "modal",
        "nestedModal",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "onStartInteraction",
        "systemBackDisabled",
        "",
        "",
        "accumulatedState",
        "Lcom/whoop/cache/api/prefetch/PrefetchList;",
        "prefetchList",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "nextPageRequest",
        "Lcom/whoop/archv2/feature/domain/o;",
        "paginationStatus",
        "Lcom/whoop/archv2/model/template/PaginationErrorState;",
        "paginationErrorState",
        "Lcom/whoop/whoopaction/domain/models/ReloadAction;",
        "pendingReloadAction",
        "Lcom/whoop/archv2/feature/domain/q;",
        "pendingPermissionRequest",
        "Lcom/whoop/archv2/feature/domain/p;",
        "pendingMediaPick",
        "Lcom/whoop/archv2/feature/domain/a;",
        "topItems",
        "<init>",
        "(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;)V",
        "a",
        "(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;)Lcom/whoop/archv2/feature/domain/f;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/archv2/feature/domain/b;",
        "d",
        "()Lcom/whoop/archv2/feature/domain/b;",
        "b",
        "Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "r",
        "()Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "c",
        "Z",
        "g",
        "()Z",
        "e",
        "u",
        "f",
        "Lri0/b;",
        "()Lri0/b;",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "h",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "i",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "k",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "j",
        "s",
        "Ljava/util/Map;",
        "()Ljava/util/Map;",
        "l",
        "Lcom/whoop/cache/api/prefetch/PrefetchList;",
        "q",
        "()Lcom/whoop/cache/api/prefetch/PrefetchList;",
        "m",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "()Lcom/whoop/navigation/models/ApiRequest;",
        "n",
        "Lcom/whoop/archv2/feature/domain/o;",
        "()Lcom/whoop/archv2/feature/domain/o;",
        "o",
        "Lcom/whoop/archv2/model/template/PaginationErrorState;",
        "()Lcom/whoop/archv2/model/template/PaginationErrorState;",
        "p",
        "Lcom/whoop/whoopaction/domain/models/ReloadAction;",
        "()Lcom/whoop/whoopaction/domain/models/ReloadAction;",
        "Lcom/whoop/archv2/feature/domain/q;",
        "()Lcom/whoop/archv2/feature/domain/q;",
        "Lcom/whoop/archv2/feature/domain/p;",
        "()Lcom/whoop/archv2/feature/domain/p;",
        "Lcom/whoop/archv2/feature/domain/a;",
        "t",
        "()Lcom/whoop/archv2/feature/domain/a;",
        "arch-v2_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/archv2/feature/domain/b;

.field private final b:Lcom/whoop/archv2/model/template/ScreenTemplate;

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Lri0/b;

.field private final g:Lcom/whoop/design/models/modal/AnyModal;

.field private final h:Lcom/whoop/design/models/modal/AnyModal;

.field private final i:Lcom/whoop/navigation/models/GenericInteraction;

.field private final j:Z

.field private final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/whoop/cache/api/prefetch/PrefetchList;

.field private final m:Lcom/whoop/navigation/models/ApiRequest;

.field private final n:Lcom/whoop/archv2/feature/domain/o;

.field private final o:Lcom/whoop/archv2/model/template/PaginationErrorState;

.field private final p:Lcom/whoop/whoopaction/domain/models/ReloadAction;

.field private final q:Lcom/whoop/archv2/feature/domain/q;

.field private final r:Lcom/whoop/archv2/feature/domain/p;

.field private final s:Lcom/whoop/archv2/feature/domain/a;


# direct methods
.method public constructor <init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/b;",
            "Lcom/whoop/archv2/model/template/ScreenTemplate;",
            "ZZZ",
            "Lri0/b;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/whoop/cache/api/prefetch/PrefetchList;",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lcom/whoop/archv2/feature/domain/o;",
            "Lcom/whoop/archv2/model/template/PaginationErrorState;",
            "Lcom/whoop/whoopaction/domain/models/ReloadAction;",
            "Lcom/whoop/archv2/feature/domain/q;",
            "Lcom/whoop/archv2/feature/domain/p;",
            "Lcom/whoop/archv2/feature/domain/a;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p14

    const-string v1, "accumulatedState"

    invoke-static {p11, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "prefetchList"

    invoke-static {p12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "paginationStatus"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/f;->a:Lcom/whoop/archv2/feature/domain/b;

    .line 3
    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/f;->b:Lcom/whoop/archv2/model/template/ScreenTemplate;

    .line 4
    iput-boolean p3, p0, Lcom/whoop/archv2/feature/domain/f;->c:Z

    .line 5
    iput-boolean p4, p0, Lcom/whoop/archv2/feature/domain/f;->d:Z

    .line 6
    iput-boolean p5, p0, Lcom/whoop/archv2/feature/domain/f;->e:Z

    .line 7
    iput-object p6, p0, Lcom/whoop/archv2/feature/domain/f;->f:Lri0/b;

    .line 8
    iput-object p7, p0, Lcom/whoop/archv2/feature/domain/f;->g:Lcom/whoop/design/models/modal/AnyModal;

    .line 9
    iput-object p8, p0, Lcom/whoop/archv2/feature/domain/f;->h:Lcom/whoop/design/models/modal/AnyModal;

    .line 10
    iput-object p9, p0, Lcom/whoop/archv2/feature/domain/f;->i:Lcom/whoop/navigation/models/GenericInteraction;

    .line 11
    iput-boolean p10, p0, Lcom/whoop/archv2/feature/domain/f;->j:Z

    .line 12
    iput-object p11, p0, Lcom/whoop/archv2/feature/domain/f;->k:Ljava/util/Map;

    .line 13
    iput-object p12, p0, Lcom/whoop/archv2/feature/domain/f;->l:Lcom/whoop/cache/api/prefetch/PrefetchList;

    move-object p1, p13

    .line 14
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/f;->m:Lcom/whoop/navigation/models/ApiRequest;

    .line 15
    iput-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->n:Lcom/whoop/archv2/feature/domain/o;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/f;->o:Lcom/whoop/archv2/model/template/PaginationErrorState;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/f;->p:Lcom/whoop/whoopaction/domain/models/ReloadAction;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/f;->q:Lcom/whoop/archv2/feature/domain/q;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/f;->r:Lcom/whoop/archv2/feature/domain/p;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/f;->s:Lcom/whoop/archv2/feature/domain/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    move v6, v5

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    move v7, v5

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    move-object v8, v2

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    move-object v9, v2

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    move-object v10, v2

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    move-object v11, v2

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    goto :goto_9

    :cond_9
    move/from16 v5, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    .line 21
    sget-object v12, Lm83/z;->w:Lm83/z;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    .line 22
    new-instance v13, Lcom/whoop/cache/api/prefetch/PrefetchList;

    const/4 v14, 0x1

    invoke-direct {v13, v2, v14, v2}, Lcom/whoop/cache/api/prefetch/PrefetchList;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    move-object v14, v2

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    .line 23
    sget-object v15, Lcom/whoop/archv2/feature/domain/o;->IDLE:Lcom/whoop/archv2/feature/domain/o;

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

    and-int v0, v0, v19

    if-eqz v0, :cond_12

    const/16 p20, 0x0

    :goto_12
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move/from16 p4, v4

    move/from16 p11, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    goto :goto_12

    .line 24
    :goto_13
    invoke-direct/range {p1 .. p20}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;ILjava/lang/Object;)Lcom/whoop/archv2/feature/domain/f;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/archv2/feature/domain/f;->a:Lcom/whoop/archv2/feature/domain/b;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/archv2/feature/domain/f;->b:Lcom/whoop/archv2/model/template/ScreenTemplate;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/whoop/archv2/feature/domain/f;->c:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/whoop/archv2/feature/domain/f;->d:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/whoop/archv2/feature/domain/f;->e:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/archv2/feature/domain/f;->f:Lri0/b;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/archv2/feature/domain/f;->g:Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/archv2/feature/domain/f;->h:Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/archv2/feature/domain/f;->i:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/whoop/archv2/feature/domain/f;->j:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/archv2/feature/domain/f;->k:Ljava/util/Map;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/archv2/feature/domain/f;->l:Lcom/whoop/cache/api/prefetch/PrefetchList;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/archv2/feature/domain/f;->m:Lcom/whoop/navigation/models/ApiRequest;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/archv2/feature/domain/f;->n:Lcom/whoop/archv2/feature/domain/o;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/archv2/feature/domain/f;->o:Lcom/whoop/archv2/model/template/PaginationErrorState;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/archv2/feature/domain/f;->p:Lcom/whoop/whoopaction/domain/models/ReloadAction;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/archv2/feature/domain/f;->q:Lcom/whoop/archv2/feature/domain/q;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/archv2/feature/domain/f;->r:Lcom/whoop/archv2/feature/domain/p;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/whoop/archv2/feature/domain/f;->s:Lcom/whoop/archv2/feature/domain/a;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lcom/whoop/archv2/feature/domain/f;->a(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;)Lcom/whoop/archv2/feature/domain/f;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;)Lcom/whoop/archv2/feature/domain/f;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/feature/domain/b;",
            "Lcom/whoop/archv2/model/template/ScreenTemplate;",
            "ZZZ",
            "Lri0/b;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/whoop/cache/api/prefetch/PrefetchList;",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lcom/whoop/archv2/feature/domain/o;",
            "Lcom/whoop/archv2/model/template/PaginationErrorState;",
            "Lcom/whoop/whoopaction/domain/models/ReloadAction;",
            "Lcom/whoop/archv2/feature/domain/q;",
            "Lcom/whoop/archv2/feature/domain/p;",
            "Lcom/whoop/archv2/feature/domain/a;",
            ")",
            "Lcom/whoop/archv2/feature/domain/f;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefetchList"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paginationStatus"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/archv2/feature/domain/f;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    invoke-direct/range {v1 .. v20}, Lcom/whoop/archv2/feature/domain/f;-><init>(Lcom/whoop/archv2/feature/domain/b;Lcom/whoop/archv2/model/template/ScreenTemplate;ZZZLri0/b;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/util/Map;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/o;Lcom/whoop/archv2/model/template/PaginationErrorState;Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/archv2/feature/domain/q;Lcom/whoop/archv2/feature/domain/p;Lcom/whoop/archv2/feature/domain/a;)V

    return-object v1
.end method

.method public final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->k:Ljava/util/Map;

    return-object v0
.end method

.method public final d()Lcom/whoop/archv2/feature/domain/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->a:Lcom/whoop/archv2/feature/domain/b;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/archv2/feature/domain/f;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/archv2/feature/domain/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/archv2/feature/domain/f;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->a:Lcom/whoop/archv2/feature/domain/b;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->a:Lcom/whoop/archv2/feature/domain/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->b:Lcom/whoop/archv2/model/template/ScreenTemplate;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->b:Lcom/whoop/archv2/model/template/ScreenTemplate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/archv2/feature/domain/f;->c:Z

    iget-boolean v3, p1, Lcom/whoop/archv2/feature/domain/f;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/archv2/feature/domain/f;->d:Z

    iget-boolean v3, p1, Lcom/whoop/archv2/feature/domain/f;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/archv2/feature/domain/f;->e:Z

    iget-boolean v3, p1, Lcom/whoop/archv2/feature/domain/f;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->f:Lri0/b;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->f:Lri0/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->g:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->g:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->h:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->h:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->i:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->i:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/archv2/feature/domain/f;->j:Z

    iget-boolean v3, p1, Lcom/whoop/archv2/feature/domain/f;->j:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->k:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->k:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->l:Lcom/whoop/cache/api/prefetch/PrefetchList;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->l:Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->m:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->m:Lcom/whoop/navigation/models/ApiRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->n:Lcom/whoop/archv2/feature/domain/o;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->n:Lcom/whoop/archv2/feature/domain/o;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->o:Lcom/whoop/archv2/model/template/PaginationErrorState;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->o:Lcom/whoop/archv2/model/template/PaginationErrorState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->p:Lcom/whoop/whoopaction/domain/models/ReloadAction;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->p:Lcom/whoop/whoopaction/domain/models/ReloadAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->q:Lcom/whoop/archv2/feature/domain/q;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->q:Lcom/whoop/archv2/feature/domain/q;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->r:Lcom/whoop/archv2/feature/domain/p;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/f;->r:Lcom/whoop/archv2/feature/domain/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/f;->s:Lcom/whoop/archv2/feature/domain/a;

    iget-object p1, p1, Lcom/whoop/archv2/feature/domain/f;->s:Lcom/whoop/archv2/feature/domain/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final f()Lri0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->f:Lri0/b;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/archv2/feature/domain/f;->c:Z

    return v0
.end method

.method public final h()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->g:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->a:Lcom/whoop/archv2/feature/domain/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->b:Lcom/whoop/archv2/model/template/ScreenTemplate;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/archv2/feature/domain/f;->c:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/archv2/feature/domain/f;->d:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/archv2/feature/domain/f;->e:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->f:Lri0/b;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->g:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->h:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->i:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/archv2/feature/domain/f;->j:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->k:Ljava/util/Map;

    invoke-static {v3, v0, v2}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->l:Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-virtual {v3}, Lcom/whoop/cache/api/prefetch/PrefetchList;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->m:Lcom/whoop/navigation/models/ApiRequest;

    if-nez v0, :cond_6

    move v0, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Lcom/whoop/navigation/models/ApiRequest;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->n:Lcom/whoop/archv2/feature/domain/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->o:Lcom/whoop/archv2/model/template/PaginationErrorState;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Lcom/whoop/archv2/model/template/PaginationErrorState;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->p:Lcom/whoop/whoopaction/domain/models/ReloadAction;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Lcom/whoop/whoopaction/domain/models/ReloadAction;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->q:Lcom/whoop/archv2/feature/domain/q;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Lcom/whoop/archv2/feature/domain/q;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/f;->r:Lcom/whoop/archv2/feature/domain/p;

    if-nez v3, :cond_a

    move v3, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Lcom/whoop/archv2/feature/domain/p;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/f;->s:Lcom/whoop/archv2/feature/domain/a;

    if-nez v2, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Lcom/whoop/archv2/feature/domain/a;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->h:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final j()Lcom/whoop/navigation/models/ApiRequest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->m:Lcom/whoop/navigation/models/ApiRequest;

    return-object v0
.end method

.method public final k()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->i:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final l()Lcom/whoop/archv2/model/template/PaginationErrorState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->o:Lcom/whoop/archv2/model/template/PaginationErrorState;

    return-object v0
.end method

.method public final m()Lcom/whoop/archv2/feature/domain/o;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->n:Lcom/whoop/archv2/feature/domain/o;

    return-object v0
.end method

.method public final n()Lcom/whoop/archv2/feature/domain/p;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->r:Lcom/whoop/archv2/feature/domain/p;

    return-object v0
.end method

.method public final o()Lcom/whoop/archv2/feature/domain/q;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->q:Lcom/whoop/archv2/feature/domain/q;

    return-object v0
.end method

.method public final p()Lcom/whoop/whoopaction/domain/models/ReloadAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->p:Lcom/whoop/whoopaction/domain/models/ReloadAction;

    return-object v0
.end method

.method public q()Lcom/whoop/cache/api/prefetch/PrefetchList;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->l:Lcom/whoop/cache/api/prefetch/PrefetchList;

    return-object v0
.end method

.method public final r()Lcom/whoop/archv2/model/template/ScreenTemplate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->b:Lcom/whoop/archv2/model/template/ScreenTemplate;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/archv2/feature/domain/f;->j:Z

    return v0
.end method

.method public final t()Lcom/whoop/archv2/feature/domain/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/f;->s:Lcom/whoop/archv2/feature/domain/a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/archv2/feature/domain/f;->a:Lcom/whoop/archv2/feature/domain/b;

    iget-object v2, v0, Lcom/whoop/archv2/feature/domain/f;->b:Lcom/whoop/archv2/model/template/ScreenTemplate;

    iget-boolean v3, v0, Lcom/whoop/archv2/feature/domain/f;->c:Z

    iget-boolean v4, v0, Lcom/whoop/archv2/feature/domain/f;->d:Z

    iget-boolean v5, v0, Lcom/whoop/archv2/feature/domain/f;->e:Z

    iget-object v6, v0, Lcom/whoop/archv2/feature/domain/f;->f:Lri0/b;

    iget-object v7, v0, Lcom/whoop/archv2/feature/domain/f;->g:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v8, v0, Lcom/whoop/archv2/feature/domain/f;->h:Lcom/whoop/design/models/modal/AnyModal;

    iget-object v9, v0, Lcom/whoop/archv2/feature/domain/f;->i:Lcom/whoop/navigation/models/GenericInteraction;

    iget-boolean v10, v0, Lcom/whoop/archv2/feature/domain/f;->j:Z

    iget-object v11, v0, Lcom/whoop/archv2/feature/domain/f;->k:Ljava/util/Map;

    iget-object v12, v0, Lcom/whoop/archv2/feature/domain/f;->l:Lcom/whoop/cache/api/prefetch/PrefetchList;

    iget-object v13, v0, Lcom/whoop/archv2/feature/domain/f;->m:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v14, v0, Lcom/whoop/archv2/feature/domain/f;->n:Lcom/whoop/archv2/feature/domain/o;

    iget-object v15, v0, Lcom/whoop/archv2/feature/domain/f;->o:Lcom/whoop/archv2/model/template/PaginationErrorState;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/archv2/feature/domain/f;->p:Lcom/whoop/whoopaction/domain/models/ReloadAction;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/archv2/feature/domain/f;->q:Lcom/whoop/archv2/feature/domain/q;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/archv2/feature/domain/f;->r:Lcom/whoop/archv2/feature/domain/p;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/archv2/feature/domain/f;->s:Lcom/whoop/archv2/feature/domain/a;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v20, v15

    const-string v15, "GenericDomainState(currentDialogType="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", screenTemplate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", manualRefresh="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", displayRefreshingSpinner="

    const-string v2, ", isStaleFromCache="

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nestedModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onStartInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", systemBackDisabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", accumulatedState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", prefetchList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextPageRequest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paginationStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paginationErrorState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pendingReloadAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pendingPermissionRequest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pendingMediaPick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", topItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/archv2/feature/domain/f;->e:Z

    return v0
.end method
