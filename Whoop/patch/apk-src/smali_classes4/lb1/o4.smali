.class public abstract Llb1/o4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "splitColumnMapper",
        "design-models_release"
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
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/m4;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb1/m4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/o4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/o4;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/o4;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/SplitColumnModel;)Ll81/e;
    .locals 0

    invoke-static {p0}, Llb1/o4;->f(Lcom/whoop/design/models/items/SplitColumnModel;)Ll81/e;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/o4;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m4;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Llb1/m4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/SplitColumnModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/o4$a;

    invoke-direct {v2, v0}, Llb1/o4$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/SplitColumnModel;)Ll81/e;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    new-instance v1, Ll81/e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SplitColumnModel;->getTopContent()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SplitColumnModel;->getBottomContent()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SplitColumnModel;->getTopChildPadding()Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SplitColumnModel;->getBottomChildPadding()Ljava/lang/Double;

    move-result-object p0

    invoke-direct {v1, v2, v0, v3, p0}, Ll81/e;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)V

    return-object v1
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
