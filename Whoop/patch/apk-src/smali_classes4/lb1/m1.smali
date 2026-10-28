.class public abstract Llb1/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001b\u0010\r\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ExpandableCardModel;",
        "Lp11/f;",
        "i",
        "(Lcom/whoop/design/models/items/ExpandableCardModel;)Lp11/f;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "model",
        "j",
        "(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;",
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "h",
        "()Ljb1/a;",
        "expandableCardNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "g",
        "()Llb1/y0;",
        "expandableCardMapper",
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
.field private static final a:Ll83/h;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/w;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Llb1/m1;->a:Ll83/h;

    new-instance v0, Llb1/e1;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/m1;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/m1;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ljb1/a;
    .locals 1

    invoke-static {}, Llb1/m1;->f()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/ExpandableCardModel;)Lp11/f;
    .locals 0

    invoke-static {p0}, Llb1/m1;->e(Lcom/whoop/design/models/items/ExpandableCardModel;)Lp11/f;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/e1;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ExpandableCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/m1$a;

    invoke-direct {v2, v0}, Llb1/m1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/ExpandableCardModel;)Lp11/f;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/m1;->i(Lcom/whoop/design/models/items/ExpandableCardModel;)Lp11/f;

    move-result-object p0

    return-object p0
.end method

.method private static final f()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static final g()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/m1;->b:Llb1/y0;

    return-object v0
.end method

.method private static final h()Ljb1/a;
    .locals 1

    sget-object v0, Llb1/m1;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final i(Lcom/whoop/design/models/items/ExpandableCardModel;)Lp11/f;
    .locals 5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExpandableCardModel;->getHeaderContent()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    invoke-static {v0}, Llb1/m1;->j(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;

    invoke-static {v0}, Llb1/l1;->f(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;)Ln11/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Llb1/m1;->h()Ljb1/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lm91/c0;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Lm91/c0;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    :goto_0
    new-instance v1, Lp11/f;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExpandableCardModel;->getIconCollapsed()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExpandableCardModel;->getIconExpanded()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Llb1/m1;->h()Ljb1/a;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExpandableCardModel;->getExpandedContent()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, v2, v3, v0, p0}, Lp11/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lm91/u;Ljava/util/List;)V

    return-object v1
.end method

.method private static final j(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    instance-of v0, p0, Lcom/whoop/design/models/DesignModelWrapper;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/design/models/DesignModelWrapper;

    invoke-virtual {p0}, Lcom/whoop/design/models/DesignModelWrapper;->getModel()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    :cond_0
    return-object p0
.end method
