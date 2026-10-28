.class public abstract Lnc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\"\u001a\u0010\u0011\u001a\u00020\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;",
        "Le21/b;",
        "g",
        "(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;)Le21/b;",
        "Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;",
        "Le21/b$a;",
        "h",
        "(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;)Le21/b$a;",
        "",
        "",
        "f",
        "(Ljava/lang/String;)F",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "hrZonesRowModelMapper",
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

    new-instance v0, Ln72/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ln72/b;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lnc1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnc1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;)Le21/b;
    .locals 0

    invoke-static {p0}, Lnc1/a;->e(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;)Le21/b;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Lnc1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln72/b;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ln72/b;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lnc1/a$a;

    invoke-direct {v2, v0}, Lnc1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;)Le21/b;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lnc1/a;->g(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;)Le21/b;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljava/lang/String;)F
    .locals 4

    const-string v0, ":"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p0, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/high16 v3, 0x42700000    # 60.0f

    mul-float/2addr v1, v3

    invoke-static {v2}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    goto :goto_1

    :cond_0
    move v2, v0

    :goto_1
    add-float/2addr v1, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method private static final g(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;)Le21/b;
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel;->getZones()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;

    invoke-static {v3}, Lnc1/a;->h(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;)Le21/b$a;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Le21/b;

    invoke-direct {p0, v0, v1, v2}, Le21/b;-><init>(Lgz0/m0;Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;)Le21/b$a;
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnc1/a;->f(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    const/4 v2, 0x0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v0

    new-instance v1, Le21/b$a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/hrzonesrow/HrZonesRowModel$HrZone;->getColor()Ly81/f;

    move-result-object p0

    invoke-direct {v1, v2, v3, p0, v0}, Le21/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ly81/f;F)V

    return-object v1

    :cond_1
    return-object v2
.end method
