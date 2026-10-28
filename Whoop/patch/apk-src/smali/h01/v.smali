.class public abstract Lh01/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lm91/p;",
        "a",
        "Lm91/p;",
        "b",
        "()Lm91/p;",
        "notificationCardItemViewFactory",
        "design_release"
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
.field private static final a:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh01/u;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh01/u;-><init>(I)V

    invoke-static {v0}, Lm91/r;->a(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lh01/v;->a:Lm91/p;

    return-void
.end method

.method public static synthetic a(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh01/v;->c(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b()Lm91/p;
    .locals 1

    sget-object v0, Lh01/v;->a:Lm91/p;

    return-object v0
.end method

.method private static final c(Lm91/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$itemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lh01/a0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lh01/y;

    invoke-direct {v3}, Lh01/y;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v2, Lh01/q;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lh01/h;

    invoke-direct {v3}, Lh01/h;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v2, Lh01/t;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lh01/g;

    invoke-direct {v3}, Lh01/g;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lf01/d;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lf01/a;

    invoke-direct {v1}, Lf01/a;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
