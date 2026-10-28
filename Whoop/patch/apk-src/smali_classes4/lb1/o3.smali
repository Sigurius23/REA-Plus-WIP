.class public abstract Llb1/o3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/OptionInfoModel;",
        "Lhy0/p0;",
        "d",
        "(Lcom/whoop/design/models/items/OptionInfoModel;)Lhy0/p0;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "optionInfoMapper",
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

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/o3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/o3;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/OptionInfoModel;)Lhy0/p0;
    .locals 0

    invoke-static {p0}, Llb1/o3;->f(Lcom/whoop/design/models/items/OptionInfoModel;)Lhy0/p0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/o3;->a:Llb1/y0;

    return-object v0
.end method

.method public static final d(Lcom/whoop/design/models/items/OptionInfoModel;)Lhy0/p0;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionInfoModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionInfoModel;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionInfoModel;->isChecked()Z

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/OptionInfoModel;->getStyle()Ljava/lang/String;

    move-result-object p0

    sget-object v3, Lhy0/o0;->CHECKBOX:Lhy0/o0;

    invoke-static {}, Lhy0/o0;->values()[Lhy0/o0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_1
    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v7

    :goto_2
    new-instance p0, Lhy0/p0;

    invoke-direct {p0, v0, v1, v2, v3}, Lhy0/p0;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLhy0/o0;)V

    return-object p0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/j3;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/OptionInfoModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/o3$a;

    invoke-direct {v2, v0}, Llb1/o3$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/OptionInfoModel;)Lhy0/p0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/o3;->d(Lcom/whoop/design/models/items/OptionInfoModel;)Lhy0/p0;

    move-result-object p0

    return-object p0
.end method
