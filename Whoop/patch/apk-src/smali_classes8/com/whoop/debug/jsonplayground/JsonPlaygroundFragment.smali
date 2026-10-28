.class public final Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR!\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0018\u00b2\u0006\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "La6/g;",
        "Lf6/f;",
        "w",
        "Ll83/h;",
        "C",
        "()La6/g;",
        "dataStore",
        "x",
        "a",
        "",
        "initialJson",
        "debug-tools_release"
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
.field private static final x:Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$a;

.field public static final y:I


# instance fields
.field private final w:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->x:Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->G(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;)La6/g;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->C()La6/g;

    move-result-object p0

    return-object p0
.end method

.method private final C()La6/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La6/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g;

    return-object v0
.end method

.method private static final D(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

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

    move-object v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    invoke-direct {p0}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->C()La6/g;

    move-result-object p1

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    new-instance v0, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$c;

    invoke-direct {v0, p1}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$c;-><init>(Lec3/l;)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p1, v0

    :cond_1
    move-object v1, p1

    check-cast v1, Lec3/l;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->E(Lp1/t2;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_2

    if-ne v0, p2, :cond_3

    :cond_2
    new-instance v0, Lrq0/x;

    const/4 p1, 0x6

    invoke-direct {v0, p0, p1}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_4

    if-ne v0, p2, :cond_5

    :cond_4
    new-instance v0, Lq80/h;

    const/16 p1, 0x14

    invoke-direct {v0, p0, p1}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v3, v0

    check-cast v3, Lc93/a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lrx0/g;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lp1/t2;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final F(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Ljava/lang/String;)Ll83/a0;
    .locals 3

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment$b;-><init>(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Ljava/lang/String;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->D(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->F(Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/debug/jsonplayground/JsonPlaygroundFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lr12/a;

    const/16 p2, 0xc

    invoke-direct {p1, p0, p2}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x60aa9feb

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
