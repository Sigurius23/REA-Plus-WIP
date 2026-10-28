.class public abstract Lhs0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;",
        "Lis0/y0;",
        "k",
        "(Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;)Lis0/y0;",
        "Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;",
        "Lis0/e;",
        "j",
        "(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;)Lis0/e;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "e",
        "()Ljb1/a;",
        "reactionsDesignItemReducer",
        "community-reactions-arch-mini_release"
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhb1/h;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lhb1/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lhs0/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lhs0/a;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;)Lis0/e;
    .locals 0

    invoke-static {p0}, Lhs0/a;->i(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;)Lis0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lhs0/a;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;)Lis0/y0;
    .locals 0

    invoke-static {p0}, Lhs0/a;->h(Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;)Lis0/y0;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Ljb1/a;
    .locals 1

    sget-object v0, Lhs0/a;->a:Ljb1/a;

    return-object v0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhb1/h;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lhb1/h;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhb1/h;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lhb1/h;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lhs0/a$a;

    invoke-direct {v3, v0}, Lhs0/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhb1/h;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lhb1/h;-><init>(I)V

    const-class v2, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lhs0/a$b;

    invoke-direct {v2, v0}, Lhs0/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;)Lis0/y0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lhs0/a;->k(Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;)Lis0/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;)Lis0/e;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lhs0/a;->j(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;)Lis0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;)Lis0/e;
    .locals 9

    new-instance v0, Lis0/e;

    invoke-virtual {p0}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->getAvatar()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->getBadge()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->getRenderStyle()Les0/a;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->getLongPressAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v7

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lis0/e;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;Z)V

    return-object v0
.end method

.method private static final k(Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;)Lis0/y0;
    .locals 4

    new-instance v0, Lis0/y0;

    invoke-virtual {p0}, Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/communityreactions/domain/model/ReactionsArchMiniModel;->getFetchDelayMs()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lis0/y0;-><init>(Ljava/lang/String;J)V

    return-object v0
.end method
