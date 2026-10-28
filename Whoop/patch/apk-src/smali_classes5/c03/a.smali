.class public abstract Lc03/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001b\u0010\u000b\u001a\u00020\u00068@X\u0080\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "getWhoopStatusDesignItemReducer",
        "()Ljb1/a;",
        "whoopStatusDesignItemReducer",
        "Llb1/y0;",
        "b",
        "Ll83/h;",
        "e",
        "()Llb1/y0;",
        "whoopStatusDesignModelMapper",
        "whoop-status_release"
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

.field private static final b:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La11/g;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, La11/g;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lc03/a;->a:Ljb1/a;

    new-instance v0, La13/f;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, La13/f;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lc03/a;->b:Ll83/h;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc03/a;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc03/a;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Llb1/y0;
    .locals 1

    invoke-static {}, Lc03/a;->i()Llb1/y0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;)Lt41/a;
    .locals 0

    invoke-static {p0}, Lc03/a;->h(Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;)Lt41/a;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Lc03/a;->b:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb1/y0;

    return-object v0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La11/g;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, La11/g;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La11/g;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, La11/g;-><init>(I)V

    const-class v1, Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lc03/a$a;

    invoke-direct {v2, v0}, Lc03/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/whoopstatus/models/WhoopStatusArchMiniModel;)Lt41/a;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lt41/a;

    invoke-direct {p0}, Lt41/a;-><init>()V

    return-object p0
.end method

.method private static final i()Llb1/y0;
    .locals 1

    sget-object v0, Lc03/a;->a:Ljb1/a;

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    return-object v0
.end method
