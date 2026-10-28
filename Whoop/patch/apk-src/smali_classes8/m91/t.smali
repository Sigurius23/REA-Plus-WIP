.class public final Lm91/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R(\u0010\u000b\u001a\u0016\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0008\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\t0\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lm91/t;",
        "",
        "<init>",
        "()V",
        "Lm91/p;",
        "b",
        "()Lm91/p;",
        "",
        "Lj93/d;",
        "Lm91/f;",
        "Ljava/util/Map;",
        "registeredItems",
        "design_release"
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
.field public static final a:Lm91/t;

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lm91/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm91/t;

    invoke-direct {v0}, Lm91/t;-><init>()V

    sput-object v0, Lm91/t;->a:Lm91/t;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lm91/t;->b:Ljava/util/Map;

    const/16 v0, 0x8

    sput v0, Lm91/t;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm91/t;->c(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lm91/q;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    sget-object v0, Lm91/t;->b:Ljava/util/Map;

    invoke-interface {p0, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized b()Lm91/p;
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lm91/d;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lm91/d;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
