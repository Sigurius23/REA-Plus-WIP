.class public abstract Lpb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpb1/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;",
        "style",
        "Ll83/k;",
        "Ly81/f;",
        "f",
        "(Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;)Ll83/k;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "impactCalloutMapper",
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

    new-instance v0, Lnm1/g;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lpb1/c;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpb1/c;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutModel;)Lf51/h;
    .locals 0

    invoke-static {p0}, Lpb1/c;->e(Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutModel;)Lf51/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Lpb1/c;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnm1/g;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lpb1/c$b;

    invoke-direct {v2, v0}, Lpb1/c$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutModel;)Lf51/h;
    .locals 7

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;->DEFAULT:Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;

    invoke-static {}, Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;->values()[Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v5

    :goto_2
    invoke-static {v1}, Lpb1/c;->f(Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ly81/f;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ly81/f;

    new-instance v2, Lf51/h;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutModel;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v2, p0, v1, v0}, Lf51/h;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;)V

    return-object v2
.end method

.method private static final f(Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;)Ll83/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/behaviordetails/ImpactCalloutStyle;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    sget-object v0, Lpb1/c$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v0, Ly81/f;->WHITE_70:Ly81/f;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p0, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v0, Ly81/f;->RECOVERY:Ly81/f;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p0, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
