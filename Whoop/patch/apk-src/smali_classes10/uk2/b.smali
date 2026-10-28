.class public abstract Luk2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "e",
        "()Ljb1/a;",
        "trackSessionMiniArchDesignItemReducer",
        "Lm91/p;",
        "b",
        "Lm91/p;",
        "f",
        "()Lm91/p;",
        "trackSessionMiniArchDesignItemViewFactory",
        "track-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljb1/a;

.field private static final b:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu71/c;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lu71/c;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Luk2/b;->a:Ljb1/a;

    new-instance v0, Lu71/c;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lu71/c;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Luk2/b;->b:Lm91/p;

    return-void
.end method

.method public static synthetic a(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luk2/b;->j(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luk2/b;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luk2/b;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;)Lyk2/e;
    .locals 0

    invoke-static {p0}, Luk2/b;->i(Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;)Lyk2/e;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Ljb1/a;
    .locals 1

    sget-object v0, Luk2/b;->a:Ljb1/a;

    return-object v0
.end method

.method public static final f()Lm91/p;
    .locals 1

    sget-object v0, Luk2/b;->b:Lm91/p;

    return-object v0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu71/c;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lu71/c;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Luk2/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Luk2/a;-><init>(I)V

    const-class v1, Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Luk2/b$a;

    invoke-direct {v2, v0}, Luk2/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;)Lyk2/e;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyk2/e;

    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;->getSelectedActivityInternalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;->getGpsTrackingEnabled()Z

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;->getRestoreSessionDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lyk2/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)V

    return-object v0
.end method

.method private static final j(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lyk2/e;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lyk2/d;

    invoke-direct {v1}, Lyk2/d;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
