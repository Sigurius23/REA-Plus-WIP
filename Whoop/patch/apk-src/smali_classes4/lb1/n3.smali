.class public abstract Llb1/n3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/OptionCommitPanelModel;",
        "Lb31/c;",
        "g",
        "(Lcom/whoop/design/models/items/OptionCommitPanelModel;)Lb31/c;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "optionCommitPanelMapper",
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

    new-instance v0, Llb1/j3;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/n3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/OptionCommitPanelModel;)Lb31/c;
    .locals 0

    invoke-static {p0}, Llb1/n3;->f(Lcom/whoop/design/models/items/OptionCommitPanelModel;)Lb31/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/n3;->h(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/n3;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/n3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/j3;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/OptionCommitPanelModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/n3$a;

    invoke-direct {v2, v0}, Llb1/n3$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/OptionCommitPanelModel;)Lb31/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/n3;->g(Lcom/whoop/design/models/items/OptionCommitPanelModel;)Lb31/c;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/OptionCommitPanelModel;)Lb31/c;
    .locals 9

    new-instance v0, Llb1/z2;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    new-instance v1, Lb31/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionCommitPanelModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionCommitPanelModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionCommitPanelModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->m(Ljava/lang/String;)Lcom/whoop/design/util/TextResource$e;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionCommitPanelModel;->getSubtitleSupportsMarkdown()Z

    move-result v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionCommitPanelModel;->getOptions()Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v0, v6, v8, v7, v8}, Ljb1/a;->k(Ljb1/a;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionCommitPanelModel;->getPrimaryButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v8, v0, v8}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lb31/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/util/List;Lny0/h;)V

    return-object v1
.end method

.method private static final h(Ljb1/b;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lry0/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/n3$b;

    invoke-direct {v2}, Llb1/n3$b;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Lny0/p0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Llb1/n3$c;

    invoke-direct {v1}, Llb1/n3$c;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
