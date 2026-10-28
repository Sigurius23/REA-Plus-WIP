.class public final Ll03/h;
.super Lp6/g0;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J)\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000e2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Ll03/h;",
        "Lp6/g0;",
        "Lof3/a;",
        "<init>",
        "()V",
        "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;",
        "viewState",
        "",
        "batteryPercentage",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "H",
        "(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;",
        "L",
        "(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V",
        "Ln6/l;",
        "id",
        "l",
        "(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;",
        "G",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Ly6/h;",
        "E",
        "Ly6/h;",
        "R",
        "()Ly6/h;",
        "stateDefinition",
        "Lad3/c;",
        "F",
        "Ll83/h;",
        "Q",
        "()Lad3/c;",
        "json",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final E:Ly6/h;

.field private final F:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lp6/g0;-><init>()V

    sget-object v0, Ly6/h;->a:Ly6/h;

    iput-object v0, p0, Ll03/h;->E:Ly6/h;

    new-instance v0, Lvf3/c;

    const-string v1, "WIDGET_KTX_SERIALIZATION_JSON"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Ll03/h$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Ll03/h$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Ll03/h;->F:Ll83/h;

    return-void
.end method

.method public static synthetic A(Ll03/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ll03/h;->F(Ll03/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll03/h;->O(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll03/h;->S(Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p4, v2

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_1

    sget p3, Ld03/a;->p:I

    new-instance p4, Ln6/a;

    invoke-direct {p4, p3}, Ln6/a;-><init>(I)V

    new-instance p3, Ln6/d;

    invoke-direct {p3, p4}, Ln6/d;-><init>(Ln6/a;)V

    invoke-static {p3}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object p3

    const-string p4, "whoop://com.whoop/healthspan"

    invoke-static {p0, p4}, Lo03/a;->b(Landroid/content/Context;Ljava/lang/String;)Lo6/a;

    move-result-object p4

    invoke-static {p3, p4}, Lx30/s0;->l(Ln6/o;Lo6/a;)Ln6/o;

    move-result-object v1

    new-instance p3, Ll03/g;

    invoke-direct {p3, p1, p0, p2}, Ll03/g;-><init>(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Ll03/h;)V

    const p0, -0x23843f32

    invoke-static {p0, v4, p3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0x180

    const/4 v6, 0x0

    sget-object v2, Lv6/c;->d:Lv6/c;

    invoke-static/range {v1 .. v6}, Lrs/b;->a(Ln6/o;Lv6/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p4, v2

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_3

    if-nez p0, :cond_1

    const p0, -0x5371325d

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-static {p1, v8, v3}, Lm03/e;->b(Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    move-object v7, p1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getLockedContentState()Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;

    move-result-object p3

    if-eqz p3, :cond_2

    const p3, -0x537124b1

    invoke-virtual {v8, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getLockedContentState()Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getBatteryPercentage()Ljava/lang/Integer;

    move-result-object v6

    const/4 v9, 0x0

    move-object v7, p1

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Ll03/h;->L(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    move-object v7, p1

    move-object v4, p2

    const p1, -0x537114ea

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getBatteryPercentage()Ljava/lang/Integer;

    move-result-object v6

    const/4 v9, 0x0

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Ll03/h;->H(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_1
    sget-object p0, Ln6/m;->a:Ln6/m;

    invoke-static {p0}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object p0

    const-string p1, "whoop://com.whoop/healthspan"

    invoke-static {v7, p1}, Lo03/a;->b(Landroid/content/Context;Ljava/lang/String;)Lo6/a;

    move-result-object p1

    invoke-static {p0, p1}, Lx30/s0;->l(Ln6/o;Lo6/a;)Ln6/o;

    move-result-object v4

    sget-object p0, Ll03/e;->a:Ll03/e;

    invoke-virtual {p0}, Ll03/e;->b()Lc93/m;

    move-result-object v6

    move-object v7, v8

    const/16 v8, 0x180

    const/4 v9, 0x2

    const/4 v5, 0x0

    invoke-static/range {v4 .. v9}, Lrs/b;->a(Ln6/o;Lv6/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Ll03/h;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Ll03/h;->G(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final H(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v3, p4

    check-cast v3, Lp1/q;

    const p4, -0x20e2f355

    invoke-virtual {v3, p4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p4, p5, 0x6

    if-nez p4, :cond_1

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x4

    goto :goto_0

    :cond_0
    const/4 p4, 0x2

    :goto_0
    or-int/2addr p4, p5

    goto :goto_1

    :cond_1
    move p4, p5

    :goto_1
    and-int/lit8 v0, p5, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p4, v0

    :cond_3
    and-int/lit16 v0, p5, 0x180

    if-nez v0, :cond_5

    invoke-virtual {v3, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr p4, v0

    :cond_5
    and-int/lit16 v0, p4, 0x93

    const/16 v1, 0x92

    const/4 v2, 0x1

    if-eq v0, v1, :cond_6

    move v0, v2

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    and-int/2addr p4, v2

    invoke-virtual {v3, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_7

    sget-object p4, Ln6/m;->a:Ln6/m;

    invoke-static {p4}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object p4

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {p4, v0}, Ls/s;->u(Ln6/o;F)Ln6/o;

    move-result-object v0

    new-instance p4, Ljp1/k;

    const/4 v1, 0x5

    invoke-direct {p4, p1, p3, p2, v1}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x6f710209

    invoke-static {v1, v3, p4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v4, 0x180

    const/4 v5, 0x0

    sget-object v1, Lv6/c;->d:Lv6/c;

    invoke-static/range {v0 .. v5}, Lrs/b;->a(Ln6/o;Lv6/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_7
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_8

    new-instance v0, Ll01/j;

    const/4 v6, 0x2

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Ll01/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final I(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p4, v3

    move-object v6, p3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p0, p1, v6, v2}, Lm03/b;->e(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getAgeValueDisplay()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_1

    sget p3, Ld03/b;->a:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string p1, "getString(...)"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v3, p3

    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getSubtitleDisplay()Ljava/lang/String;

    move-result-object v4

    sget-object p1, Ll03/c;->a:Ll03/c;

    invoke-virtual {p0}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->getSubtitleStyle()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll03/c;->c(Ljava/lang/String;)J

    move-result-wide p0

    const/4 v8, 0x0

    move-object v7, v6

    move-wide v5, p0

    invoke-static/range {v3 .. v8}, Lm03/d;->c(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V

    move-object v6, v7

    sget-object p0, Ln6/m;->a:Ln6/m;

    invoke-static {p0}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object v3

    new-instance p0, Ll03/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1, p2}, Ll03/f;-><init>(ILjava/lang/Integer;)V

    const p1, 0x7337af6b

    invoke-static {p1, v6, p0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x180

    sget-object v4, Lv6/c;->c:Lv6/c;

    invoke-static/range {v3 .. v8}, Lrs/b;->a(Ln6/o;Lv6/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p0, p1, v2}, Ll03/i;->d(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Ll03/h;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ljava/lang/Integer;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, Ll03/h;->H(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final L(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v3, p4

    check-cast v3, Lp1/q;

    const p4, -0x43fc8f78

    invoke-virtual {v3, p4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p4, p5, 0x6

    if-nez p4, :cond_1

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x4

    goto :goto_0

    :cond_0
    const/4 p4, 0x2

    :goto_0
    or-int/2addr p4, p5

    goto :goto_1

    :cond_1
    move p4, p5

    :goto_1
    and-int/lit8 v0, p5, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p4, v0

    :cond_3
    and-int/lit16 v0, p5, 0x180

    if-nez v0, :cond_5

    invoke-virtual {v3, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr p4, v0

    :cond_5
    and-int/lit16 v0, p4, 0x93

    const/16 v1, 0x92

    const/4 v2, 0x1

    if-eq v0, v1, :cond_6

    move v0, v2

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    and-int/2addr p4, v2

    invoke-virtual {v3, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_7

    sget-object p4, Ln6/m;->a:Ln6/m;

    invoke-static {p4}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object p4

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {p4, v0}, Ls/s;->u(Ln6/o;F)Ln6/o;

    move-result-object v0

    new-instance p4, Ljp1/k;

    const/4 v1, 0x4

    invoke-direct {p4, p3, p1, p2, v1}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x6399ed96

    invoke-static {v1, v3, p4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v4, 0x180

    const/4 v5, 0x0

    sget-object v1, Lv6/c;->d:Lv6/c;

    invoke-static/range {v0 .. v5}, Lrs/b;->a(Ln6/o;Lv6/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_7
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_8

    new-instance v0, Ll01/j;

    const/4 v6, 0x3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Ll01/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final M(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p4, v2

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p3, Ln6/m;->a:Ln6/m;

    invoke-static {p3}, Ls2/d;->l(Ln6/o;)Ln6/o;

    move-result-object v1

    new-instance p4, Lih1/f;

    const/16 v0, 0xb

    invoke-direct {p4, v0, p0, p1}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p0, -0x5355ee20

    invoke-static {p0, v4, p4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p0

    const/16 v6, 0xc00

    const/4 v7, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object v5, v4

    move-object v4, p0

    invoke-static/range {v1 .. v7}, Lrv/n;->a(Ln6/o;IILx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    invoke-static {p3}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object v1

    new-instance p0, Ll03/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ll03/f;-><init>(ILjava/lang/Integer;)V

    const p1, -0x6f4daa38

    invoke-static {p1, v4, p0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0x180

    const/4 v6, 0x0

    sget-object v2, Lv6/c;->c:Lv6/c;

    invoke-static/range {v1 .. v6}, Lrs/b;->a(Ln6/o;Lv6/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Lv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    const-string p4, "$this$Column"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p2, p3, :cond_1

    invoke-virtual {p1}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;->getLockedIconByteArray()[B

    move-result-object p2

    if-eqz p2, :cond_0

    const/4 p3, 0x0

    array-length p4, p2

    invoke-static {p2, p3, p4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Landroid/graphics/Bitmap;

    if-eqz p2, :cond_2

    new-instance p3, Ln6/f;

    invoke-direct {p3, p2}, Ln6/f;-><init>(Landroid/graphics/Bitmap;)V

    :goto_1
    move-object v0, p3

    goto :goto_2

    :cond_2
    sget p2, Ld03/a;->o:I

    new-instance p3, Ln6/a;

    invoke-direct {p3, p2}, Ln6/a;-><init>(I)V

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    const/16 p3, 0xc8

    int-to-float p3, p3

    div-float/2addr p3, p2

    invoke-static {p3}, Ls2/d;->t(F)Ln6/o;

    move-result-object v2

    const/16 v5, 0x30

    const/16 v6, 0x18

    const-string v1, ""

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lo73/a;->d(Ln6/r;Ljava/lang/String;Ln6/o;ILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {p1}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;->getHeaderDisplay()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    sget p1, Ld03/b;->a:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p0, "getString(...)"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    move-object v0, p1

    new-instance v2, Lz6/f;

    sget-wide p0, Li2/x;->f:J

    new-instance v6, La7/f;

    invoke-direct {v6, p0, p1}, La7/f;-><init>(J)V

    const/16 p0, 0x12

    invoke-static {p0}, Lv63/c;->h(I)J

    move-result-wide p0

    new-instance v7, Ly3/o;

    invoke-direct {v7, p0, p1}, Ly3/o;-><init>(J)V

    new-instance v8, Lz6/b;

    const/16 p0, 0x2bc

    invoke-direct {v8, p0}, Lz6/b;-><init>(I)V

    new-instance v9, Lz6/c;

    const/4 p0, 0x3

    invoke-direct {v9, p0}, Lz6/c;-><init>(I)V

    const/16 v10, 0x68

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Lz6/f;-><init>(La7/f;Ly3/o;Lz6/b;Lz6/c;I)V

    const/4 v5, 0x0

    const/16 v6, 0xa

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lrj/o;->e(Ljava/lang/String;Ln6/o;Lz6/f;ILandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p0, p1, v2}, Ll03/i;->d(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Ll03/h;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, Ll03/h;->L(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final Q()Lad3/c;
    .locals 1

    iget-object v0, p0, Ll03/h;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lad3/c;

    return-object v0
.end method

.method private static final S(Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1, v2}, Ll03/h;->G(Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic s(Ll03/h;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ljava/lang/Integer;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ll03/h;->K(Ll03/h;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ljava/lang/Integer;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ll03/h;->I(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll03/h;->J(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ll03/h;->M(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Lv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ll03/h;->N(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Lv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ll03/h;->D(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Ll03/h;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ll03/h;->P(Ll03/h;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;Ljava/lang/Integer;Landroid/content/Context;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3, p4}, Ll03/h;->E(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Landroid/content/Context;Ll03/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final G(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x4ecd0579

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    and-int/2addr p1, v3

    invoke-virtual {v5, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    const p1, -0x1fdef903

    invoke-virtual {v5, p1}, Lp1/q;->f0(I)V

    sget-object p1, Ln6/h;->c:Lp1/b0;

    invoke-virtual {v5, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    check-cast p1, Lf6/f;

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    sget-object v0, Ln6/h;->b:Lp1/u2;

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    const-string v0, "WIDGET_KEY_HEALTHSPAN_VIEW_STATE"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    :try_start_0
    invoke-direct {p0}, Ll03/h;->Q()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->Companion:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState$a;

    invoke-virtual {v4}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState$a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/b;

    invoke-virtual {v0, v4, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, p1

    goto :goto_3

    :catch_0
    move-exception v0

    move-object p1, v0

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "HealthspanWidget"

    invoke-virtual {v0, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    const-string v4, "Failed to decode Healthspan widget state"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v4, p1, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_3
    new-instance p1, Ll03/g;

    invoke-direct {p1, v1, v3, p0}, Ll03/g;-><init>(Landroid/content/Context;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ll03/h;)V

    const v0, 0x16b4d7ec

    invoke-static {v0, v5, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0x6000

    const/16 v7, 0xf

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lx81/e;->n(Lcom/whoop/data/repositories/FeatureFlagChecker;Lfy1/l;Ldp0/g;La91/b;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lk71/i;

    const/4 v1, 0x5

    invoke-direct {v0, p0, p2, v1}, Lk71/i;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public R()Ly6/h;
    .locals 1

    iget-object v0, p0, Ll03/h;->E:Ly6/h;

    return-object v0
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h()Ly6/g;
    .locals 1

    invoke-virtual {p0}, Ll03/h;->R()Ly6/h;

    move-result-object v0

    return-object v0
.end method

.method public l(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ln6/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p3, Ll03/h$a;

    if-eqz p1, :cond_0

    move-object p1, p3

    check-cast p1, Ll03/h$a;

    iget p2, p1, Ll03/h$a;->E:I

    const/high16 v0, -0x80000000

    and-int v1, p2, v0

    if-eqz v1, :cond_0

    sub-int/2addr p2, v0

    iput p2, p1, Ll03/h$a;->E:I

    goto :goto_0

    :cond_0
    new-instance p1, Ll03/h$a;

    invoke-direct {p1, p0, p3}, Ll03/h$a;-><init>(Ll03/h;Lq83/d;)V

    :goto_0
    iget-object p2, p1, Ll03/h$a;->y:Ljava/lang/Object;

    sget-object p3, Lr83/a;->w:Lr83/a;

    iget v0, p1, Ll03/h$a;->E:I

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p3, p1, Ll03/h$a;->x:Ljava/lang/Object;

    check-cast p3, Ln6/l;

    iget-object p1, p1, Ll03/h$a;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lkk1/b;

    const/4 v0, 0x7

    invoke-direct {p2, p0, v0}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lx1/b;

    const v2, -0x6bc7386e

    invoke-direct {v0, p2, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p2, 0x0

    iput-object p2, p1, Ll03/h$a;->w:Ljava/lang/Object;

    iput-object p2, p1, Ll03/h$a;->x:Ljava/lang/Object;

    iput v1, p1, Ll03/h$a;->E:I

    invoke-static {v0, p1}, Lpf/c;->Q(Lx1/b;Ls83/c;)V

    return-object p3
.end method
