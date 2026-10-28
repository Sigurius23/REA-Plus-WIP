.class public final Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;
.super Lhj0/f;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0004J;\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00052\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\nJ\u0015\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\nR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u00107\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;",
        "Lhj0/f;",
        "Lbc3/c0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "U",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "user",
        "R",
        "(Lcom/whoop/domain/model/teams/TeamUser;)V",
        "S",
        "",
        "text",
        "g0",
        "(Ljava/lang/String;)V",
        "Y",
        "",
        "delayMs",
        "Lkotlin/Function1;",
        "Landroid/text/Editable;",
        "f",
        "P",
        "(JLkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onStart",
        "a0",
        "d0",
        "",
        "I",
        "Z",
        "isTransfer",
        "Lrq0/i0;",
        "J",
        "Ll83/h;",
        "T",
        "()Lrq0/i0;",
        "viewModel",
        "Lrq0/g0;",
        "K",
        "Lrq0/g0;",
        "listAdapter",
        "Lbc3/u;",
        "L",
        "Lbc3/u;",
        "job",
        "Leq0/i;",
        "M",
        "Leq0/i;",
        "binding",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
        "N",
        "a",
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


# static fields
.field public static final N:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$a;

.field public static final O:I


# instance fields
.field private I:Z

.field private final J:Ll83/h;

.field private K:Lrq0/g0;

.field private final L:Lbc3/u;

.field private M:Leq0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->N:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->O:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/f;-><init>()V

    new-instance v0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$f;

    invoke-direct {v0, p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$f;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$g;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->J:Ll83/h;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->L:Lbc3/u;

    return-void
.end method

.method public static synthetic D(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lrq0/j0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->V(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lrq0/j0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->e0(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic F(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lib/n;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->Z(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lib/n;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Landroid/text/Editable;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->X(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Landroid/text/Editable;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->b0(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic I(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->W(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Landroid/view/View;Z)V

    return-void
.end method

.method public static synthetic J(Lkotlin/jvm/internal/g0;Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;JLkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->Q(Lkotlin/jvm/internal/g0;Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;JLkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lib/n;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->h0(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lib/n;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->c0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic M(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->f0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final synthetic N(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;)Lrq0/i0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->Y()V

    return-void
.end method

.method private final P(JLkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf0/r;

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lf0/r;-><init>(Lkotlin/jvm/internal/g0;Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;JLkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method private static final Q(Lkotlin/jvm/internal/g0;Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;JLkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;
    .locals 6

    iget-object v0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lbc3/k1;->isCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance v0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$b;

    const/4 v5, 0x0

    move-wide v1, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$b;-><init>(JLkotlin/jvm/functions/Function1;Landroid/text/Editable;Lq83/d;)V

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, p3, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final R(Lcom/whoop/domain/model/teams/TeamUser;)V
    .locals 2

    new-instance v0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final S(Lcom/whoop/domain/model/teams/TeamUser;)V
    .locals 2

    new-instance v0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$d;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final T()Lrq0/i0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/i0;

    return-object v0
.end method

.method private final U()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/i0;->o()Le50/c;

    move-result-object v0

    new-instance v1, Lrq0/d0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lrq0/d0;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;I)V

    invoke-virtual {v0, p0, v1}, Le50/c;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final V(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lrq0/j0;)Ll83/a0;
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lrq0/j0;->c()Z

    move-result p1

    const/4 v0, 0x0

    const/16 v1, 0x8

    const/4 v2, 0x0

    const-string v3, "binding"

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    if-eqz p1, :cond_2

    iget-object p1, p1, Leq0/i;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    if-eqz p1, :cond_1

    iget-object p1, p1, Leq0/i;->a:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    if-eqz p0, :cond_0

    iget-object p0, p0, Leq0/i;->e:Lcom/whoop/ui/ThrobberView;

    invoke-virtual {p0}, Lcom/whoop/ui/ThrobberView;->f()V

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    if-eqz p1, :cond_6

    iget-object p1, p1, Leq0/i;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    if-eqz p1, :cond_5

    iget-object p1, p1, Leq0/i;->a:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    if-eqz p0, :cond_4

    iget-object p0, p0, Leq0/i;->e:Lcom/whoop/ui/ThrobberView;

    invoke-virtual {p0}, Lcom/whoop/ui/ThrobberView;->g()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private static final W(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Landroid/view/View;Z)V
    .locals 0

    iget-object p0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    if-eqz p0, :cond_0

    iget-object p0, p0, Leq0/i;->c:Landroid/widget/ImageView;

    xor-int/lit8 p1, p2, 0x1

    invoke-static {p0, p1}, Lse/h;->T(Landroid/view/View;Z)V

    return-void

    :cond_0
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final X(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Landroid/text/Editable;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->g0(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final Y()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/i0;->l()Landroidx/lifecycle/p0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/p0;->removeObservers(Landroidx/lifecycle/g0;)V

    :cond_0
    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/i0;->q()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/i0;->l()Landroidx/lifecycle/p0;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lrq0/d0;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lrq0/d0;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;I)V

    new-instance v2, Lcom/whoop/community/presentation/teams/g;

    invoke-direct {v2, v1}, Lcom/whoop/community/presentation/teams/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    :cond_1
    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->K:Lrq0/g0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void

    :cond_2
    const-string v0, "listAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final Z(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lib/n;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->K:Lrq0/g0;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lib/p;->c(Lib/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    const-string p0, "listAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final b0(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->R(Lcom/whoop/domain/model/teams/TeamUser;)V

    return-void
.end method

.method private static final c0(Landroid/content/DialogInterface;I)V
    .locals 0

    return-void
.end method

.method private static final e0(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->S(Lcom/whoop/domain/model/teams/TeamUser;)V

    return-void
.end method

.method private static final f0(Landroid/content/DialogInterface;I)V
    .locals 0

    return-void
.end method

.method private final g0(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/i0;->l()Landroidx/lifecycle/p0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/p0;->removeObservers(Landroidx/lifecycle/g0;)V

    :cond_0
    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrq0/i0;->y(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object p1

    invoke-virtual {p1}, Lrq0/i0;->l()Landroidx/lifecycle/p0;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Lrq0/d0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lrq0/d0;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;I)V

    new-instance v1, Lcom/whoop/community/presentation/teams/g;

    invoke-direct {v1, v0}, Lcom/whoop/community/presentation/teams/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    :cond_1
    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->K:Lrq0/g0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void

    :cond_2
    const-string p1, "listAdapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private static final h0(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lib/n;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->K:Lrq0/g0;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lib/p;->c(Lib/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    const-string p0, "listAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final a0(Lcom/whoop/domain/model/teams/TeamUser;)V
    .locals 4

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    sget v1, Lvu1/i;->b:I

    invoke-direct {v0, p0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    sget v1, Lxp0/d0;->M0:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lxp0/d0;->L0:I

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getFullName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lxp0/d0;->s:I

    new-instance v2, Lrq0/f0;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lrq0/f0;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;I)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget v0, Lxp0/d0;->r:I

    new-instance v1, Lio/getstream/chat/android/ui/utils/c;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/utils/c;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final d0(Lcom/whoop/domain/model/teams/TeamUser;)V
    .locals 4

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    sget v1, Lvu1/i;->b:I

    invoke-direct {v0, p0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    sget v1, Lxp0/d0;->O0:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lxp0/d0;->N0:I

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getFullName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lxp0/d0;->s:I

    new-instance v2, Lrq0/f0;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p1, v3}, Lrq0/f0;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;I)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    sget v0, Lxp0/d0;->r:I

    new-instance v1, Lio/getstream/chat/android/ui/utils/c;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/utils/c;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 2

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    iget-object v1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->L:Lbc3/u;

    invoke-virtual {v0, v1}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lhj0/f;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lxp0/b0;->g:I

    invoke-static {p0, p1}, Landroidx/databinding/g;->d(Lm/m;I)Landroidx/databinding/a0;

    move-result-object p1

    const-string v0, "setContentView(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Leq0/i;

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "isTransfer"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->I:Z

    if-eqz p1, :cond_0

    sget p1, Lxp0/d0;->j2:I

    goto :goto_0

    :cond_0
    sget p1, Lxp0/d0;->i2:I

    :goto_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(I)V

    invoke-virtual {p0}, Lhj0/f;->z()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "teamid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/whoop/domain/model/teams/Team;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrq0/i0;->p(Lcom/whoop/domain/model/teams/Team;)V

    :cond_1
    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    const/4 v0, 0x0

    const-string v1, "binding"

    if-eqz p1, :cond_4

    iget-object p1, p1, Leq0/i;->d:Landroid/widget/EditText;

    new-instance v2, Lrq0/e0;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lrq0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    new-instance p1, Lrq0/d0;

    const/4 v2, 0x1

    invoke-direct {p1, p0, v2}, Lrq0/d0;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;I)V

    const-wide/16 v2, 0x1f4

    invoke-direct {p0, v2, v3, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->P(JLkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    if-eqz v2, :cond_3

    iget-object v2, v2, Leq0/i;->d:Landroid/widget/EditText;

    new-instance v3, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$e;

    invoke-direct {v3, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance p1, Lrq0/g0;

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->T()Lrq0/i0;

    move-result-object v2

    iget-boolean v3, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->I:Z

    invoke-direct {p1, p0, v2, v3}, Lrq0/g0;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lrq0/i0;Z)V

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->K:Lrq0/g0;

    iget-object v2, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M:Leq0/i;

    if-eqz v2, :cond_2

    iget-object v0, v2, Leq0/i;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    const-string p1, ""

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->g0(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0
.end method

.method public onStart()V
    .locals 0

    invoke-super {p0}, Lm/m;->onStart()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->U()V

    return-void
.end method
