.class public abstract Llb1/n4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/items/SpecificationTableModel;",
        "Lsz0/e1;",
        "e",
        "(Lcom/whoop/design/models/items/SpecificationTableModel;)Lsz0/e1;",
        "Lcom/whoop/design/models/items/InformationItemModel;",
        "",
        "index",
        "Lsz0/x;",
        "d",
        "(Lcom/whoop/design/models/items/InformationItemModel;I)Lsz0/x;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "specificationTableMapper",
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

    new-instance v0, Llb1/x3;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Llb1/x3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/n4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/SpecificationTableModel;)Lsz0/e1;
    .locals 0

    invoke-static {p0}, Llb1/n4;->g(Lcom/whoop/design/models/items/SpecificationTableModel;)Lsz0/e1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/n4;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/n4;->a:Llb1/y0;

    return-object v0
.end method

.method public static final d(Lcom/whoop/design/models/items/InformationItemModel;I)Lsz0/x;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/InformationItemModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_"

    invoke-static {p1, v0, v1}, Lm4/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/InformationItemModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/InformationItemModel;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/InformationItemModel;->getIcon()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    move-object v5, p1

    goto :goto_0

    :cond_0
    move-object v5, v0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/InformationItemModel;->getStyle()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/whoop/design/atomic/molecule/InformationItemStyle;->INLINE:Lcom/whoop/design/atomic/molecule/InformationItemStyle;

    invoke-static {}, Lcom/whoop/design/atomic/molecule/InformationItemStyle;->values()[Lcom/whoop/design/atomic/molecule/InformationItemStyle;

    move-result-object v2

    array-length v6, v2

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v6, :cond_2

    aget-object v9, v2, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    move-object v0, v9

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-nez v0, :cond_3

    move-object v6, v1

    goto :goto_3

    :cond_3
    move-object v6, v0

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/InformationItemModel;->getDescriptionColor()Ly81/f;

    move-result-object v8

    new-instance v2, Lsz0/x;

    invoke-direct/range {v2 .. v8}, Lsz0/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/atomic/molecule/InformationItemStyle;Ljava/lang/String;Ly81/f;)V

    return-object v2
.end method

.method public static final e(Lcom/whoop/design/models/items/SpecificationTableModel;)Lsz0/e1;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SpecificationTableModel;->getItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-ltz v1, :cond_0

    check-cast v2, Lcom/whoop/design/models/items/InformationItemModel;

    invoke-static {v2, v1}, Llb1/n4;->d(Lcom/whoop/design/models/items/InformationItemModel;I)Lsz0/x;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_1
    new-instance p0, Lsz0/e1;

    invoke-direct {p0, v0}, Lsz0/e1;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m4;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llb1/m4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/SpecificationTableModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/n4$a;

    invoke-direct {v2, v0}, Llb1/n4$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/SpecificationTableModel;)Lsz0/e1;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/n4;->e(Lcom/whoop/design/models/items/SpecificationTableModel;)Lsz0/e1;

    move-result-object p0

    return-object p0
.end method
