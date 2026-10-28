.class public final Lji0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;
.implements Lji0/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji0/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0001(BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0086@\u00a2\u0006\u0004\u0008\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0019\u0010*\u001a\u0004\u0018\u00010$2\u0006\u0010\'\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0004\u0008.\u0010-J\u0018\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0004\u00080\u0010\u001fJ\u0018\u00101\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0004\u00081\u0010\u001fJ\u0010\u00102\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0004\u00082\u0010-J\u0017\u00103\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0002\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u0017H\u0082@\u00a2\u0006\u0004\u00085\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u001f\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0J8\u0006\u00a2\u0006\u000c\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010NR \u0010R\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0P0F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010HR&\u0010U\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0P0J8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008S\u0010L\u001a\u0004\u0008T\u0010NR\u0016\u0010X\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR \u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u001d0Y8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]\u00a8\u0006`"
    }
    d2 = {
        "Lji0/e;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lji0/f;",
        "Lji0/a;",
        "cacheDao",
        "Lad3/c;",
        "json",
        "Liy1/c;",
        "metricWriter",
        "Lcom/whoop/appconfiguration/AppConfigurationApi;",
        "api",
        "Lcom/whoop/data/repositories/ActiveSessionChecker;",
        "activeSessionChecker",
        "Ljava/time/Clock;",
        "clock",
        "Lze1/c;",
        "lifecycleScopeProvider",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lji0/a;Lad3/c;Liy1/c;Lcom/whoop/appconfiguration/AppConfigurationApi;Lcom/whoop/data/repositories/ActiveSessionChecker;Ljava/time/Clock;Lze1/c;Ltr2/n;)V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "onStart",
        "",
        "source",
        "",
        "refresh",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/appconfiguration/AppConfigurationResponse;",
        "response",
        "t",
        "(Lcom/whoop/appconfiguration/AppConfigurationResponse;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/appconfiguration/TabConfiguration;",
        "b",
        "()Lcom/whoop/appconfiguration/TabConfiguration;",
        "tabId",
        "a",
        "(Ljava/lang/String;)Z",
        "c",
        "(Ljava/lang/String;)Lcom/whoop/appconfiguration/TabConfiguration;",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
        "n",
        "reason",
        "q",
        "r",
        "p",
        "l",
        "(Lcom/whoop/appconfiguration/AppConfigurationResponse;)V",
        "o",
        "w",
        "Lji0/a;",
        "x",
        "Lad3/c;",
        "y",
        "Liy1/c;",
        "z",
        "Lcom/whoop/appconfiguration/AppConfigurationApi;",
        "E",
        "Lcom/whoop/data/repositories/ActiveSessionChecker;",
        "F",
        "Ljava/time/Clock;",
        "G",
        "Lze1/c;",
        "H",
        "Ltr2/n;",
        "Lec3/p1;",
        "I",
        "Lec3/p1;",
        "configurationState",
        "Lec3/f2;",
        "J",
        "Lec3/f2;",
        "getConfigurationFlow",
        "()Lec3/f2;",
        "configurationFlow",
        "",
        "K",
        "tabsState",
        "L",
        "d",
        "tabsFlow",
        "M",
        "Z",
        "wasExplicitlyCleared",
        "Lec3/l;",
        "N",
        "Lec3/l;",
        "e",
        "()Lec3/l;",
        "shouldFetchAiContextFlow",
        "O",
        "app-configuration_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final O:Lji0/e$a;


# instance fields
.field private final E:Lcom/whoop/data/repositories/ActiveSessionChecker;

.field private final F:Ljava/time/Clock;

.field private final G:Lze1/c;

.field private final H:Ltr2/n;

.field private final I:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final J:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final K:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final L:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private M:Z

.field private final N:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final w:Lji0/a;

.field private final x:Lad3/c;

.field private final y:Liy1/c;

.field private final z:Lcom/whoop/appconfiguration/AppConfigurationApi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lji0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lji0/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lji0/e;->O:Lji0/e$a;

    return-void
.end method

.method public constructor <init>(Lji0/a;Lad3/c;Liy1/c;Lcom/whoop/appconfiguration/AppConfigurationApi;Lcom/whoop/data/repositories/ActiveSessionChecker;Ljava/time/Clock;Lze1/c;Ltr2/n;)V
    .locals 1

    const-string v0, "cacheDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeSessionChecker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleScopeProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lji0/e;->w:Lji0/a;

    .line 3
    iput-object p2, p0, Lji0/e;->x:Lad3/c;

    .line 4
    iput-object p3, p0, Lji0/e;->y:Liy1/c;

    .line 5
    iput-object p4, p0, Lji0/e;->z:Lcom/whoop/appconfiguration/AppConfigurationApi;

    .line 6
    iput-object p5, p0, Lji0/e;->E:Lcom/whoop/data/repositories/ActiveSessionChecker;

    .line 7
    iput-object p6, p0, Lji0/e;->F:Ljava/time/Clock;

    .line 8
    iput-object p7, p0, Lji0/e;->G:Lze1/c;

    .line 9
    iput-object p8, p0, Lji0/e;->H:Ltr2/n;

    const/4 p1, 0x0

    .line 10
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lji0/e;->I:Lec3/p1;

    .line 11
    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lji0/e;->J:Lec3/f2;

    .line 12
    sget-object p2, Lm83/y;->w:Lm83/y;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lji0/e;->K:Lec3/p1;

    .line 13
    invoke-static {p2}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lji0/e;->L:Lec3/f2;

    .line 14
    new-instance p2, Lji0/e$i;

    invoke-direct {p2, p1}, Lji0/e$i;-><init>(Lec3/l;)V

    .line 15
    invoke-static {p2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lji0/e;->N:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lji0/a;Lad3/c;Liy1/c;Lcom/whoop/appconfiguration/AppConfigurationApi;Lcom/whoop/data/repositories/ActiveSessionChecker;Ljava/time/Clock;Lze1/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_0

    .line 16
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v1

    const-string v2, "systemDefaultZone(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object/from16 v9, p6

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    .line 17
    new-instance v1, Lze1/c;

    invoke-direct {v1}, Lze1/c;-><init>()V

    move-object v10, v1

    goto :goto_1

    :cond_1
    move-object/from16 v10, p7

    :goto_1
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_2

    .line 18
    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AppConfigurationRepository"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    move-object v11, v0

    :goto_2
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    goto :goto_3

    :cond_2
    move-object/from16 v11, p8

    goto :goto_2

    .line 19
    :goto_3
    invoke-direct/range {v3 .. v11}, Lji0/e;-><init>(Lji0/a;Lad3/c;Liy1/c;Lcom/whoop/appconfiguration/AppConfigurationApi;Lcom/whoop/data/repositories/ActiveSessionChecker;Ljava/time/Clock;Lze1/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic f(Lji0/e;)Lcom/whoop/appconfiguration/AppConfigurationApi;
    .locals 0

    iget-object p0, p0, Lji0/e;->z:Lcom/whoop/appconfiguration/AppConfigurationApi;

    return-object p0
.end method

.method public static final synthetic g(Lji0/e;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lji0/e;->H:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic j(Lji0/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lji0/e;->n(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lcom/whoop/appconfiguration/AppConfigurationResponse;)V
    .locals 2

    iget-object v0, p0, Lji0/e;->K:Lec3/p1;

    invoke-virtual {p1}, Lcom/whoop/appconfiguration/AppConfigurationResponse;->getTabs()Lcom/whoop/appconfiguration/TabsConfiguration;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/appconfiguration/TabsConfiguration;->getItems()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_1
    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method private final n(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lji0/e$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lji0/e$c;

    iget v1, v0, Lji0/e$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lji0/e$c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lji0/e$c;

    invoke-direct {v0, p0, p1}, Lji0/e$c;-><init>(Lji0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lji0/e$c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lji0/e$c;->E:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lji0/e$c;->x:Ljava/lang/Object;

    check-cast v1, Lkotlinx/serialization/SerializationException;

    iget-object v0, v0, Lji0/e$c;->w:Ljava/lang/Object;

    check-cast v0, Lji0/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v0, Lji0/e$c;->w:Ljava/lang/Object;

    check-cast v0, Landroid/database/sqlite/SQLiteException;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lji0/e;->w:Lji0/a;

    iput v5, v0, Lji0/e$c;->E:I

    invoke-interface {p1, v0}, Lji0/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_1
    check-cast p1, Lji0/d;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    if-nez p1, :cond_6

    iget-object p1, p0, Lji0/e;->H:Ltr2/n;

    const-string v0, "No cached app configuration found on disk"

    new-array v1, v8, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v7

    :cond_6
    :try_start_2
    iget-object v2, p0, Lji0/e;->x:Lad3/c;

    invoke-virtual {p1}, Lji0/d;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/whoop/appconfiguration/AppConfigurationResponse;->Companion:Lcom/whoop/appconfiguration/AppConfigurationResponse$a;

    invoke-virtual {v4}, Lcom/whoop/appconfiguration/AppConfigurationResponse$a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/b;

    invoke-virtual {v2, v4, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/appconfiguration/AppConfigurationResponse;
    :try_end_2
    .catch Lkotlinx/serialization/SerializationException; {:try_start_2 .. :try_end_2} :catch_1

    iget-object v0, p0, Lji0/e;->I:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lji0/e;->I:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lji0/e;->l(Lcom/whoop/appconfiguration/AppConfigurationResponse;)V

    goto :goto_2

    :cond_7
    iget-object p1, p0, Lji0/e;->H:Ltr2/n;

    const-string v0, "hydrateFromCache skipped \u2014 fresher data already in state"

    new-array v1, v8, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_2
    return-object v7

    :catch_1
    move-exception p1

    iget-object v2, p0, Lji0/e;->H:Ltr2/n;

    const-string v4, "Failed to deserialize cached app configuration"

    new-array v5, v8, [Lqr2/a$a;

    invoke-interface {v2, v4, p1, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iput-object v6, v0, Lji0/e$c;->w:Ljava/lang/Object;

    iput-object v6, v0, Lji0/e$c;->x:Ljava/lang/Object;

    iput v3, v0, Lji0/e$c;->E:I

    const-string p1, "serialization"

    invoke-direct {p0, p1, v0}, Lji0/e;->q(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_5

    :cond_8
    :goto_3
    return-object v7

    :goto_4
    iget-object v2, p0, Lji0/e;->H:Ltr2/n;

    const-string v3, "Failed to read app configuration from DB"

    new-array v5, v8, [Lqr2/a$a;

    invoke-interface {v2, v3, p1, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iput-object v6, v0, Lji0/e$c;->w:Ljava/lang/Object;

    iput v4, v0, Lji0/e$c;->E:I

    const-string p1, "sqlite"

    invoke-direct {p0, p1, v0}, Lji0/e;->q(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_5
    return-object v1

    :cond_9
    :goto_6
    return-object v7
.end method

.method private final o(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lji0/e;->y:Liy1/c;

    new-instance v1, Ljy1/a;

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "applied_app_configuration"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final p(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lji0/e;->y:Liy1/c;

    new-instance v1, Ljy1/a;

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "failed_to_clear_app_configuration"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final q(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lji0/e;->y:Liy1/c;

    new-instance v1, Ljy1/a;

    const-string v2, "reason:"

    invoke-static {v2, p1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "failed_to_read_app_configuration_on_disk"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final r(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lji0/e;->y:Liy1/c;

    new-instance v1, Ljy1/a;

    const-string v2, "reason:"

    invoke-static {v2, p1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "failed_to_persist_app_configuration"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "tabId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lji0/e;->d()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/appconfiguration/TabConfiguration;

    invoke-virtual {v1}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()Lcom/whoop/appconfiguration/TabConfiguration;
    .locals 6

    iget-object v0, p0, Lji0/e;->J:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/appconfiguration/AppConfigurationResponse;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/appconfiguration/AppConfigurationResponse;->getTabs()Lcom/whoop/appconfiguration/TabsConfiguration;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/appconfiguration/TabsConfiguration;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/appconfiguration/TabConfiguration;

    invoke-virtual {v4}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/appconfiguration/TabsConfiguration;->getDefaultTabId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v1, v3

    :cond_2
    check-cast v1, Lcom/whoop/appconfiguration/TabConfiguration;

    :cond_3
    :goto_0
    return-object v1
.end method

.method public c(Ljava/lang/String;)Lcom/whoop/appconfiguration/TabConfiguration;
    .locals 3

    const-string v0, "tabId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lji0/e;->d()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/appconfiguration/TabConfiguration;

    invoke-virtual {v2}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/whoop/appconfiguration/TabConfiguration;

    return-object v1
.end method

.method public clear(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lji0/e$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lji0/e$b;

    iget v1, v0, Lji0/e$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lji0/e$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lji0/e$b;

    invoke-direct {v0, p0, p1}, Lji0/e$b;-><init>(Lji0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lji0/e$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lji0/e$b;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lji0/e$b;->w:Ljava/lang/Object;

    check-cast v0, Landroid/database/sqlite/SQLiteException;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-boolean v5, p0, Lji0/e;->M:Z

    iget-object p1, p0, Lji0/e;->I:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lji0/e;->K:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {p1, v4, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :try_start_1
    iget-object p1, p0, Lji0/e;->w:Lji0/a;

    iput v5, v0, Lji0/e$b;->z:I

    invoke-interface {p1, v0}, Lji0/a;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_4

    goto :goto_2

    :goto_1
    iget-object v2, p0, Lji0/e;->H:Ltr2/n;

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    const-string v6, "Failed to clear app configuration from DB"

    invoke-interface {v2, v6, p1, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iput-object v4, v0, Lji0/e$b;->w:Ljava/lang/Object;

    iput v3, v0, Lji0/e$b;->z:I

    invoke-direct {p0, v0}, Lji0/e;->p(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_2
    return-object v1

    :cond_4
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public d()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lji0/e;->L:Lec3/f2;

    return-object v0
.end method

.method public e()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lji0/e;->N:Lec3/l;

    return-object v0
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lji0/e;->G:Lze1/c;

    invoke-virtual {v0, p1}, Lze1/c;->a(Landroidx/lifecycle/g0;)Lbc3/c0;

    move-result-object p1

    new-instance v0, Lji0/e$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lji0/e$d;-><init>(Lji0/e;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lji0/e;->I:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lji0/e;->M:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lji0/e;->G:Lze1/c;

    invoke-virtual {v0, p1}, Lze1/c;->a(Landroidx/lifecycle/g0;)Lbc3/c0;

    move-result-object p1

    new-instance v0, Lji0/e$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lji0/e$e;-><init>(Lji0/e;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public refresh(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lji0/e$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lji0/e$g;

    iget v1, v0, Lji0/e$g;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lji0/e$g;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lji0/e$g;

    invoke-direct {v0, p0, p2}, Lji0/e$g;-><init>(Lji0/e;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lji0/e$g;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lji0/e$g;->E:I

    const/4 v7, 0x3

    const/4 v2, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v9, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    iget-object p1, v6, Lji0/e$g;->x:Ljava/lang/Object;

    check-cast p1, Lu02/a;

    iget-object p1, v6, Lji0/e$g;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lji0/e$g;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v6, Lji0/e$g;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lji0/e;->E:Lcom/whoop/data/repositories/ActiveSessionChecker;

    iput-object p1, v6, Lji0/e$g;->w:Ljava/lang/Object;

    iput v9, v6, Lji0/e$g;->E:I

    invoke-interface {p2, v6}, Lcom/whoop/data/repositories/ActiveSessionChecker;->hasSession(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    goto :goto_4

    :cond_5
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_6

    iget-object p2, p0, Lji0/e;->H:Ltr2/n;

    const-string v0, "Skipping refresh ("

    const-string v1, ") \u2014 no active or pending session"

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v10, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_6
    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lji0/e;->H:Ltr2/n;

    new-instance v5, Lji0/e$h;

    invoke-direct {v5, p0, v8}, Lji0/e$h;-><init>(Lji0/e;Lq83/d;)V

    iput-object p1, v6, Lji0/e$g;->w:Ljava/lang/Object;

    iput p2, v6, Lji0/e$g;->E:I

    const/4 v3, 0x0

    const-string v4, "failed to fetch app configuration"

    invoke-virtual/range {v1 .. v6}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    check-cast p2, Lu02/a;

    instance-of v1, p2, Lu02/a$c;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lji0/e;->H:Ltr2/n;

    const-string v2, "Refresh success ("

    const-string v3, ")"

    invoke-static {v2, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v1, p1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/appconfiguration/AppConfigurationResponse;

    iput-object v8, v6, Lji0/e$g;->w:Ljava/lang/Object;

    iput-object v8, v6, Lji0/e$g;->x:Ljava/lang/Object;

    iput v7, v6, Lji0/e$g;->E:I

    invoke-virtual {p0, p1, v6}, Lji0/e;->t(Lcom/whoop/appconfiguration/AppConfigurationResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_4
    return-object v0

    :cond_8
    return-object p1

    :cond_9
    instance-of p2, p2, Lu02/a$b;

    if-eqz p2, :cond_c

    iget-object p2, p0, Lji0/e;->I:Lec3/p1;

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_a

    goto :goto_5

    :cond_a
    move v9, v10

    :goto_5
    const-string p2, "Fetch failed ("

    if-eqz v9, :cond_b

    iget-object v0, p0, Lji0/e;->H:Ltr2/n;

    const-string v1, "), falling back to cached config"

    invoke-static {p2, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v10, [Lqr2/a$a;

    invoke-interface {v0, p1, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_6

    :cond_b
    iget-object v0, p0, Lji0/e;->H:Ltr2/n;

    const-string v1, ") and no cached config available"

    invoke-static {p2, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v10, [Lqr2/a$a;

    invoke-interface {v0, p1, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_6
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final t(Lcom/whoop/appconfiguration/AppConfigurationResponse;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/appconfiguration/AppConfigurationResponse;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lji0/e$f;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lji0/e$f;

    iget v4, v3, Lji0/e$f;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lji0/e$f;->E:I

    goto :goto_0

    :cond_0
    new-instance v3, Lji0/e$f;

    invoke-direct {v3, v1, v2}, Lji0/e$f;-><init>(Lji0/e;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lji0/e$f;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lji0/e$f;->E:I

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v5, :cond_5

    if-eq v5, v9, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lji0/e$f;->x:Ljava/lang/Object;

    check-cast v0, Lkotlinx/serialization/SerializationException;

    :goto_1
    iget-object v0, v3, Lji0/e$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/appconfiguration/AppConfigurationResponse;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v3, Lji0/e$f;->x:Ljava/lang/Object;

    check-cast v0, Landroid/database/sqlite/SQLiteException;

    goto :goto_1

    :cond_3
    iget-object v0, v3, Lji0/e$f;->x:Ljava/lang/Object;

    check-cast v0, Lji0/d;

    iget-object v0, v3, Lji0/e$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/appconfiguration/AppConfigurationResponse;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :catch_1
    move-exception v0

    goto/16 :goto_8

    :cond_4
    iget-object v0, v3, Lji0/e$f;->x:Ljava/lang/Object;

    check-cast v0, Lji0/d;

    iget-object v0, v3, Lji0/e$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/appconfiguration/AppConfigurationResponse;

    :try_start_1
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    new-instance v12, Lji0/d;

    iget-object v2, v1, Lji0/e;->x:Lad3/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/whoop/appconfiguration/AppConfigurationResponse;->Companion:Lcom/whoop/appconfiguration/AppConfigurationResponse$a;

    invoke-virtual {v5}, Lcom/whoop/appconfiguration/AppConfigurationResponse$a;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/j;

    invoke-virtual {v2, v5, v0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    iget-object v2, v1, Lji0/e;->F:Ljava/time/Clock;

    invoke-virtual {v2}, Ljava/time/Clock;->millis()J

    move-result-wide v15

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v12 .. v18}, Lji0/d;-><init>(ILjava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v1, Lji0/e;->w:Lji0/a;

    iput-object v0, v3, Lji0/e$f;->w:Ljava/lang/Object;

    iput-object v11, v3, Lji0/e$f;->x:Ljava/lang/Object;

    iput v9, v3, Lji0/e$f;->E:I

    invoke-interface {v2, v12, v3}, Lji0/a;->b(Lji0/d;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    goto/16 :goto_9

    :cond_6
    :goto_2
    iget-object v2, v1, Lji0/e;->I:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Lji0/e;->l(Lcom/whoop/appconfiguration/AppConfigurationResponse;)V

    iput-object v0, v3, Lji0/e$f;->w:Ljava/lang/Object;

    iput-object v11, v3, Lji0/e$f;->x:Ljava/lang/Object;

    iput v8, v3, Lji0/e$f;->E:I

    invoke-direct {v1, v3}, Lji0/e;->o(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    goto/16 :goto_9

    :cond_7
    :goto_3
    iget-object v2, v1, Lji0/e;->H:Ltr2/n;

    invoke-virtual {v0}, Lcom/whoop/appconfiguration/AppConfigurationResponse;->getTabs()Lcom/whoop/appconfiguration/TabsConfiguration;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Lcom/whoop/appconfiguration/TabsConfiguration;->getItems()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_8

    check-cast v5, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v5, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/appconfiguration/TabConfiguration;

    invoke-virtual {v12}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    move-object v8, v11

    :cond_9
    invoke-virtual {v0}, Lcom/whoop/appconfiguration/AppConfigurationResponse;->getTabs()Lcom/whoop/appconfiguration/TabsConfiguration;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lcom/whoop/appconfiguration/TabsConfiguration;->getDefaultTabId()Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_a
    move-object v5, v11

    :goto_5
    invoke-virtual {v0}, Lcom/whoop/appconfiguration/AppConfigurationResponse;->getShouldFetchAiContext()Ljava/lang/Boolean;

    move-result-object v0

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Persisted config: tabs="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ", defaultTabId="

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", shouldFetchAiContext="

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v5, v10, [Lqr2/a$a;

    invoke-interface {v2, v0, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_a

    :goto_6
    iget-object v2, v1, Lji0/e;->H:Ltr2/n;

    const-string v5, "Failed to serialize app configuration for DB"

    new-array v7, v10, [Lqr2/a$a;

    invoke-interface {v2, v5, v0, v7}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iput-object v11, v3, Lji0/e$f;->w:Ljava/lang/Object;

    iput-object v11, v3, Lji0/e$f;->x:Ljava/lang/Object;

    iput v6, v3, Lji0/e$f;->E:I

    const-string v0, "serialization"

    invoke-direct {v1, v0, v3}, Lji0/e;->r(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_b

    goto :goto_9

    :cond_b
    :goto_7
    move v9, v10

    goto :goto_a

    :goto_8
    iget-object v2, v1, Lji0/e;->H:Ltr2/n;

    const-string v5, "Failed to persist app configuration to DB"

    new-array v6, v10, [Lqr2/a$a;

    invoke-interface {v2, v5, v0, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iput-object v11, v3, Lji0/e$f;->w:Ljava/lang/Object;

    iput-object v11, v3, Lji0/e$f;->x:Ljava/lang/Object;

    iput v7, v3, Lji0/e$f;->E:I

    const-string v0, "sqlite"

    invoke-direct {v1, v0, v3}, Lji0/e;->r(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_b

    :goto_9
    return-object v4

    :goto_a
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
