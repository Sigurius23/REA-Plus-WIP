.class public abstract Llb1/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/ContentBlockListCardModel;",
        "model",
        "Lf01/h0;",
        "c",
        "(Lcom/whoop/design/models/cards/ContentBlockListCardModel;)Lf01/h0;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "contentBlockListCardMapper",
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

    new-instance v0, Llb1/i0;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/q0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/cards/ContentBlockListCardModel;)Lf01/h0;
    .locals 0

    invoke-static {p0}, Llb1/q0;->e(Lcom/whoop/design/models/cards/ContentBlockListCardModel;)Lf01/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/q0;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/cards/ContentBlockListCardModel;)Lf01/h0;
    .locals 5

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/cards/ContentBlockListCardModel;->getContentBlocks()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/cards/ContentBlock;

    new-instance v2, Lf01/e0;

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ContentBlock;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/cards/ContentBlock;->getContent()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    invoke-direct {v2, v3, v1, v4}, Lf01/e0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lf01/h0;

    invoke-direct {p0, v0}, Lf01/h0;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/cards/ContentBlockListCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/q0$a;

    invoke-direct {v2, v0}, Llb1/q0$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/cards/ContentBlockListCardModel;)Lf01/h0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/q0;->c(Lcom/whoop/design/models/cards/ContentBlockListCardModel;)Lf01/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/q0;->a:Llb1/y0;

    return-object v0
.end method
