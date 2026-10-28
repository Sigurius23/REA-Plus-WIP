.class public abstract Ldc2/a;
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
        "getLanguageBetaOptOutDesignItemReducer",
        "()Ljb1/a;",
        "languageBetaOptOutDesignItemReducer",
        "Llb1/y0;",
        "b",
        "Ll83/h;",
        "e",
        "()Llb1/y0;",
        "languageBetaOptOutDesignModelMapper",
        "settings_release"
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

    new-instance v0, Ldc0/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ldc0/d;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Ldc2/a;->a:Ljb1/a;

    new-instance v0, Ldb2/a;

    invoke-direct {v0, v1}, Ldb2/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Ldc2/a;->b:Ll83/h;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/settings/language/optout/models/LanguageBetaOptOutModel;)Lcc2/c;
    .locals 0

    invoke-static {p0}, Ldc2/a;->h(Lcom/whoop/settings/language/optout/models/LanguageBetaOptOutModel;)Lcc2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Llb1/y0;
    .locals 1

    invoke-static {}, Ldc2/a;->i()Llb1/y0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldc2/a;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldc2/a;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Ldc2/a;->b:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb1/y0;

    return-object v0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldc0/d;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ldc0/d;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldc0/d;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ldc0/d;-><init>(I)V

    const-class v1, Lcom/whoop/settings/language/optout/models/LanguageBetaOptOutModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ldc2/a$a;

    invoke-direct {v2, v0}, Ldc2/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/settings/language/optout/models/LanguageBetaOptOutModel;)Lcc2/c;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcc2/c;

    invoke-virtual {p0}, Lcom/whoop/settings/language/optout/models/LanguageBetaOptOutModel;->getTypeformUrl()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcc2/c;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final i()Llb1/y0;
    .locals 1

    sget-object v0, Ldc2/a;->a:Ljb1/a;

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    return-object v0
.end method
