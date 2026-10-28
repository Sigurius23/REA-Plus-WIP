.class final Lmz2/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmz2/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lmz2/c;


# direct methods
.method public constructor <init>(Lmz2/c;)V
    .locals 0

    iput-object p1, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lmz2/c;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lmz2/c$a$a;->e(Lmz2/c;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lmz2/c;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lmz2/c;->g(Lmz2/c;)Lbc3/c0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-virtual {p2}, Lmz2/c;->m()Ltr2/n;

    move-result-object p2

    const-string v0, "BTHR new state: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p2, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p2}, Lmz2/c;->h(Lmz2/c;)Z

    move-result p2

    const-string v0, "Connection Disconnected; will wait and rescan"

    const/4 v2, 0x0

    if-eqz p2, :cond_3

    iget-object p2, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p2}, Lmz2/c;->c(Lmz2/c;)Lmz2/d;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lmz2/d;->p()V

    :cond_0
    iget-object p2, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p2}, Lmz2/c;->g(Lmz2/c;)Lbc3/c0;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p2, v2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_1
    if-nez p1, :cond_2

    iget-object p1, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-virtual {p1}, Lmz2/c;->m()Ltr2/n;

    move-result-object p1

    new-array p2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p1}, Lmz2/c;->f(Lmz2/c;)Lq83/j;

    move-result-object p2

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    invoke-interface {p2, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p2

    invoke-static {p1, p2}, Lmz2/c;->j(Lmz2/c;Lbc3/c0;)V

    iget-object p1, p0, Lmz2/c$a$a;->w:Lmz2/c;

    new-instance p2, Lmz2/b;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lmz2/b;-><init>(Lmz2/c;I)V

    invoke-interface {p1}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p1

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    const-class v0, Lmz2/d;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmz2/d;

    iget-object p2, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p2, p1}, Lmz2/c;->i(Lmz2/c;Lmz2/d;)V

    iget-object p2, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p2, p1}, Lmz2/c;->k(Lmz2/c;Lmz2/d;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p1, v2}, Lmz2/c;->j(Lmz2/c;Lbc3/c0;)V

    iget-object p1, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p1, v2}, Lmz2/c;->i(Lmz2/c;Lmz2/d;)V

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p2}, Lmz2/c;->g(Lmz2/c;)Lbc3/c0;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-static {p2, v2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_4
    if-nez p1, :cond_5

    iget-object p1, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-virtual {p1}, Lmz2/c;->m()Ltr2/n;

    move-result-object p1

    new-array p2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p1}, Lmz2/c;->f(Lmz2/c;)Lq83/j;

    move-result-object p2

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    invoke-interface {p2, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p2

    invoke-static {p1, p2}, Lmz2/c;->j(Lmz2/c;Lbc3/c0;)V

    iget-object p1, p0, Lmz2/c$a$a;->w:Lmz2/c;

    invoke-static {p1}, Lmz2/c;->e(Lmz2/c;)Lmz2/d;

    move-result-object p2

    invoke-static {p1, p2}, Lmz2/c;->k(Lmz2/c;Lmz2/d;)V

    :cond_5
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lmz2/c$a$a;->c(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
