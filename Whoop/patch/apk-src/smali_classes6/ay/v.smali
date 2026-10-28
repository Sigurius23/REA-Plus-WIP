.class public final Lay/v;
.super Lc20/e;
.source "SourceFile"


# instance fields
.field public final a:Lc93/a;

.field public final b:Ljava/util/Set;

.field public final c:Lq83/j;

.field public d:Lj/d;

.field public final e:La1/b;


# direct methods
.method public constructor <init>(Lc93/a;Ljava/util/Set;Lq83/j;)V
    .locals 1

    const-string v0, "publishableKeyProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsageTokens"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lay/v;->a:Lc93/a;

    iput-object p2, p0, Lay/v;->b:Ljava/util/Set;

    iput-object p3, p0, Lay/v;->c:Lq83/j;

    new-instance p1, La1/b;

    const/16 p2, 0xa

    invoke-direct {p1, p0, p2}, La1/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lay/v;->e:La1/b;

    return-void
.end method


# virtual methods
.method public final b(Lj/c;Lj/b;)V
    .locals 3

    new-instance v0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityContract;

    invoke-direct {v0}, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityContract;-><init>()V

    new-instance v1, Laq0/o;

    check-cast p2, Lg20/q;

    const/4 v2, 0x1

    invoke-direct {v1, p2, v2}, Laq0/o;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    iput-object p1, p0, Lay/v;->d:Lj/d;

    return-void
.end method

.method public final d(Ls40/a;Ljava/lang/Object;Lyy/f;Lc20/d;)Ljava/lang/Object;
    .locals 6

    move-object v3, p2

    check-cast v3, Ly00/c8;

    new-instance v0, Lay/u;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iget-object p1, v1, Lay/v;->c:Lq83/j;

    invoke-static {p1, v0, p4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
