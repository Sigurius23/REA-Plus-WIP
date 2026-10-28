.class public abstract Llb1/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\u000c\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "",
        "Lgz0/m0;",
        "f",
        "(Ljava/lang/String;)Lgz0/m0;",
        "Lb91/a;",
        "g",
        "(Ljava/lang/String;)Lb91/a;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "endpointButtonMapper",
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

    new-instance v0, Llb1/e1;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/j1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/EndpointButtonModel;)Ll11/e;
    .locals 0

    invoke-static {p0}, Llb1/j1;->d(Lcom/whoop/design/models/items/EndpointButtonModel;)Ll11/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/j1;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/e1;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/EndpointButtonModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/j1$a;

    invoke-direct {v2, v0}, Llb1/j1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/EndpointButtonModel;)Ll11/e;
    .locals 16

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getButtonText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getSuccessText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getLeadingIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/j1;->f(Ljava/lang/String;)Lgz0/m0;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getSuccessIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v6, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    const/4 v10, 0x0

    if-ge v9, v8, :cond_1

    aget-object v11, v7, v9

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    move-object v11, v10

    :goto_1
    if-nez v11, :cond_2

    goto :goto_2

    :cond_2
    move-object v6, v11

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getErrorIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/j1;->f(Ljava/lang/String;)Lgz0/m0;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getErrorText()Ljava/lang/String;

    move-result-object v7

    move-object v0, v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getShowLoading()Z

    move-result v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getPath()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getPrefixText()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/EndpointButtonModel;->getTextStyle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Llb1/j1;->g(Ljava/lang/String;)Lb91/a;

    move-result-object v0

    :cond_3
    move-object v13, v0

    new-instance v1, Ll11/e;

    const/16 v14, 0x80

    const/4 v15, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v15}, Ll11/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/j1;->a:Llb1/y0;

    return-object v0
.end method

.method private static final f(Ljava/lang/String;)Lgz0/m0;
    .locals 6

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    return-object v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private static final g(Ljava/lang/String;)Lb91/a;
    .locals 6

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_1
    if-eqz v4, :cond_2

    sget-object p0, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {p0, v4}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v3
.end method
