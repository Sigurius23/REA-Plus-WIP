.class public abstract Llb1/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AiChatEntryModel;",
        "model",
        "Lo01/c;",
        "d",
        "(Lcom/whoop/design/models/items/AiChatEntryModel;)Lo01/c;",
        "Lcom/whoop/design/models/cards/VowCardModel;",
        "Lf01/u1;",
        "i",
        "(Lcom/whoop/design/models/cards/VowCardModel;)Lf01/u1;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "h",
        "()Llb1/y0;",
        "chatMapper",
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

    new-instance v0, Llb1/v;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/c0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/c0;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/AiChatEntryModel;)Lo01/c;
    .locals 0

    invoke-static {p0}, Llb1/c0;->f(Lcom/whoop/design/models/items/AiChatEntryModel;)Lo01/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/cards/VowCardModel;)Lf01/u1;
    .locals 0

    invoke-static {p0}, Llb1/c0;->g(Lcom/whoop/design/models/cards/VowCardModel;)Lf01/u1;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/models/items/AiChatEntryModel;)Lo01/c;
    .locals 14

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lo01/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AiChatEntryModel;->getHint()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AiChatEntryModel;->getSuggestionCategory()Lo01/e;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AiChatEntryModel;->getContextualMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v5, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AiChatEntryModel;->getEducationType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AiChatEntryModel;->getConversationSeedId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AiChatEntryModel;->getSourceType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AiChatEntryModel;->getSourceId()Ljava/lang/String;

    move-result-object v9

    const/16 v12, 0x301

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lo01/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/v;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/AiChatEntryModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/c0$a;

    invoke-direct {v3, v0}, Llb1/c0$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/v;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Llb1/v;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/cards/VowCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/c0$b;

    invoke-direct {v2, v0}, Llb1/c0$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/AiChatEntryModel;)Lo01/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/c0;->d(Lcom/whoop/design/models/items/AiChatEntryModel;)Lo01/c;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/cards/VowCardModel;)Lf01/u1;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/c0;->i(Lcom/whoop/design/models/cards/VowCardModel;)Lf01/u1;

    move-result-object p0

    return-object p0
.end method

.method public static final h()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/c0;->a:Llb1/y0;

    return-object v0
.end method

.method public static final i(Lcom/whoop/design/models/cards/VowCardModel;)Lf01/u1;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/VowCardModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/VowCardModel;->getBody()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    new-instance v1, Lf01/u1;

    invoke-direct {v1, p0, v0}, Lf01/u1;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method
