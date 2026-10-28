.class public abstract Lrq0/o;
.super Lhj0/g;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0004\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0003J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0004\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8DX\u0084\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0014\u0010\'\u001a\u00020$8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0014\u0010)\u001a\u00020$8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010&R\u0014\u0010+\u001a\u00020$8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010&\u00a8\u0006,"
    }
    d2 = {
        "Lrq0/o;",
        "Lhj0/g;",
        "<init>",
        "()V",
        "Lrq0/z;",
        "state",
        "Ll83/a0;",
        "N",
        "(Lrq0/z;)V",
        "",
        "G",
        "()Ljava/lang/String;",
        "H",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "onStart",
        "",
        "enabled",
        "P",
        "(Z)V",
        "O",
        "Q",
        "()Lrq0/z;",
        "Lrq0/y;",
        "F",
        "Ll83/h;",
        "L",
        "()Lrq0/y;",
        "viewModel",
        "",
        "K",
        "()I",
        "titleRes",
        "J",
        "nextButtonRes",
        "I",
        "layoutRes",
        "community_release"
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
.field private final F:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lhj0/g;-><init>()V

    new-instance v0, Lq80/h;

    const/16 v1, 0x11

    invoke-direct {v0, p0, v1}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lrq0/o$b;

    invoke-direct {v1, p0}, Lrq0/o$b;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lrq0/o$c;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4, v1, v0}, Lrq0/o$c;-><init>(Landroidx/fragment/app/m0;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lrq0/o;->F:Ll83/h;

    return-void
.end method

.method public static synthetic E(Lrq0/o;Lrq0/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrq0/o;->M(Lrq0/o;Lrq0/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lrq0/o;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lrq0/o;->R(Lrq0/o;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final M(Lrq0/o;Lrq0/z;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lrq0/o;->N(Lrq0/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lrq0/o;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract G()Ljava/lang/String;
.end method

.method public abstract H()Ljava/lang/String;
.end method

.method public abstract I()I
.end method

.method public abstract J()I
.end method

.method public abstract K()I
.end method

.method public final L()Lrq0/y;
    .locals 1

    iget-object v0, p0, Lrq0/o;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/y;

    return-object v0
.end method

.method public abstract N(Lrq0/z;)V
.end method

.method public O()V
    .locals 0

    return-void
.end method

.method public final P(Z)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/whoop/community/presentation/teams/TeamCreateActivity;

    invoke-virtual {v0, p1}, Lcom/whoop/community/presentation/teams/TeamCreateActivity;->N(Z)V

    return-void
.end method

.method public final Q()Lrq0/z;
    .locals 1

    invoke-virtual {p0}, Lrq0/o;->L()Lrq0/y;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/y;->I()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/z;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lrq0/o;->I()I

    move-result p3

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onStart()V
    .locals 4

    invoke-super {p0}, Landroidx/fragment/app/y;->onStart()V

    invoke-virtual {p0}, Lrq0/o;->L()Lrq0/y;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/y;->I()Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    new-instance v2, Lpf/b;

    const/16 v3, 0x1d

    invoke-direct {v2, p0, v3}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lrq0/o$a;

    invoke-direct {v3, v2}, Lrq0/o$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method
