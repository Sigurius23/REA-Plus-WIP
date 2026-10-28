.class public abstract Ld91/e;
.super Lb3/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\'\u00a2\u0006\u0004\u0008\r\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Ld91/e;",
        "Lb3/a;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)V",
        "m",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final J:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lb3/a;->I:I

    sput v0, Ld91/e;->J:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lb3/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic i(Ld91/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ld91/e;->l(Ld91/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ld91/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld91/e;->k(Ld91/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ld91/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    sget p2, Lb3/a;->I:I

    invoke-virtual {p0, p1, p2}, Ld91/e;->m(Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Ld91/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Ld91/e;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, 0x582f96bb

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_2

    and-int/lit8 p1, p2, 0x8

    if-nez p1, :cond_0

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x4

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    or-int/2addr p1, p2

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x1

    if-eq v1, v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    and-int/2addr p1, v2

    invoke-virtual {v5, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object v1, Lfy1/i;->a:Lfy1/i;

    new-instance p1, Lci0/a;

    const/16 v0, 0x13

    invoke-direct {p1, p0, v0}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    const v0, -0x43044620

    invoke-static {v0, v5, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    sget p1, Lfy1/i;->b:I

    shl-int/lit8 p1, p1, 0x3

    or-int/lit16 v6, p1, 0x6000

    const/16 v7, 0xd

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lx81/e;->n(Lcom/whoop/data/repositories/FeatureFlagChecker;Lfy1/l;Ldp0/g;La91/b;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Ld71/c;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public abstract m(Landroidx/compose/runtime/Composer;I)V
.end method
