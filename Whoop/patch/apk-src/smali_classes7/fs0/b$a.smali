.class final Lfs0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfs0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u001d\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020 0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Lfs0/b$a;",
        "",
        "Lec3/f2;",
        "Lds0/f;",
        "reactionsState",
        "<init>",
        "(Lfs0/b;Lec3/f2;)V",
        "Lfs0/a$a;",
        "request",
        "Lec3/l;",
        "Lds0/e;",
        "a",
        "(Lfs0/a$a;Lq83/d;)Ljava/lang/Object;",
        "Lfs0/a;",
        "upstream",
        "h",
        "(Lec3/l;)Lec3/l;",
        "g",
        "()Lec3/l;",
        "Lec3/f2;",
        "Lec3/o1;",
        "b",
        "Lec3/o1;",
        "f",
        "()Lec3/o1;",
        "announcements",
        "Lec3/p1;",
        "",
        "Lds0/b;",
        "c",
        "Lec3/p1;",
        "inFlight",
        "Ll83/a0;",
        "d",
        "refreshes",
        "community-reactions-arch-mini_release"
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
.field private final a:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final b:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final c:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final d:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field final synthetic e:Lfs0/b;


# direct methods
.method public constructor <init>(Lfs0/b;Lec3/f2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            ")V"
        }
    .end annotation

    const-string v0, "reactionsState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lfs0/b$a;->e:Lfs0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lfs0/b$a;->a:Lec3/f2;

    const/4 p1, 0x5

    const/4 p2, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p2, v0, v1, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lfs0/b$a;->b:Lec3/o1;

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lfs0/b$a;->c:Lec3/p1;

    const/4 p1, 0x6

    invoke-static {v0, p2, v1, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lfs0/b$a;->d:Lec3/o1;

    return-void
.end method

.method private final a(Lfs0/a$a;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfs0/a$a;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lfs0/b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lfs0/b$a$a;

    iget v1, v0, Lfs0/b$a$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lfs0/b$a$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lfs0/b$a$a;

    invoke-direct {v0, p0, p2}, Lfs0/b$a$a;-><init>(Lfs0/b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lfs0/b$a$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lfs0/b$a$a;->F:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lfs0/b$a$a;->y:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    iget-object v1, v0, Lfs0/b$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lds0/b;

    iget-object v0, v0, Lfs0/b$a$a;->w:Ljava/lang/Object;

    check-cast v0, Lfs0/a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lfs0/a$a;->a()Lds0/b;

    move-result-object p2

    invoke-virtual {p1}, Lfs0/a$a;->b()Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_3

    iget-object p1, p0, Lfs0/b$a;->e:Lfs0/b;

    invoke-static {p1}, Lfs0/b;->d(Lfs0/b;)Ltr2/n;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " has no action this bar can perform, ignoring"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v4

    :cond_3
    iget-object v5, p0, Lfs0/b$a;->e:Lfs0/b;

    iget-object v6, p0, Lfs0/b$a;->c:Lec3/p1;

    invoke-static {v5, v6, p2}, Lfs0/b;->a(Lfs0/b;Lec3/p1;Lds0/b;)Z

    move-result v5

    if-nez v5, :cond_4

    iget-object p1, p0, Lfs0/b$a;->e:Lfs0/b;

    invoke-static {p1}, Lfs0/b;->d(Lfs0/b;)Ltr2/n;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " ignored, an identical one is already sending"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v4

    :cond_4
    iget-object v2, p0, Lfs0/b$a;->b:Lec3/o1;

    new-instance v5, Lds0/e$h;

    invoke-direct {v5, p2}, Lds0/e$h;-><init>(Lds0/b;)V

    iput-object v4, v0, Lfs0/b$a$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lfs0/b$a$a;->x:Ljava/lang/Object;

    iput-object p1, v0, Lfs0/b$a$a;->y:Ljava/lang/Object;

    iput v3, v0, Lfs0/b$a$a;->F:I

    invoke-interface {v2, v5, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v1, p2

    :goto_1
    iget-object p2, p0, Lfs0/b$a;->e:Lfs0/b;

    invoke-static {p2, v1, p1}, Lfs0/b;->g(Lfs0/b;Lds0/b;Lcom/whoop/whoopaction/domain/models/UpdateAction;)Lec3/l;

    move-result-object p1

    new-instance p2, Lfs0/b$a$b;

    iget-object v0, p0, Lfs0/b$a;->e:Lfs0/b;

    invoke-direct {p2, v0, p0, v4}, Lfs0/b$a$b;-><init>(Lfs0/b;Lfs0/b$a;Lq83/d;)V

    new-instance v0, Lec3/j1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    new-instance p1, Lfs0/b$a$c;

    iget-object p2, p0, Lfs0/b$a;->e:Lfs0/b;

    invoke-direct {p1, p2, p0, v1, v4}, Lfs0/b$a$c;-><init>(Lfs0/b;Lfs0/b$a;Lds0/b;Lq83/d;)V

    new-instance p2, Lec3/y;

    invoke-direct {p2, v0, p1}, Lec3/y;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object p2
.end method

.method public static final synthetic b(Lfs0/b$a;Lfs0/a$a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lfs0/b$a;->a(Lfs0/a$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lfs0/b$a;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lfs0/b$a;->c:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic d(Lfs0/b$a;)Lec3/f2;
    .locals 0

    iget-object p0, p0, Lfs0/b$a;->a:Lec3/f2;

    return-object p0
.end method

.method public static final synthetic e(Lfs0/b$a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lfs0/b$a;->d:Lec3/o1;

    return-object p0
.end method


# virtual methods
.method public final f()Lec3/o1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/o1;"
        }
    .end annotation

    iget-object v0, p0, Lfs0/b$a;->b:Lec3/o1;

    return-object v0
.end method

.method public final g()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lfs0/b$a;->d:Lec3/o1;

    iget-object v1, p0, Lfs0/b$a;->e:Lfs0/b;

    new-instance v2, Lfs0/b$a$d;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0, v1}, Lfs0/b$a$d;-><init>(Lq83/d;Lfs0/b$a;Lfs0/b;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    return-object v0
.end method

.method public final h(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfs0/b$a$f;

    invoke-direct {v0, p1, p0}, Lfs0/b$a$f;-><init>(Lec3/l;Lfs0/b$a;)V

    const/4 p1, 0x0

    const/4 v1, 0x3

    invoke-static {v0, p1, v1}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p1

    sget v0, Lec3/w0;->a:I

    new-instance v0, Lch/o;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lch/o;-><init>(Lec3/l;I)V

    return-object v0
.end method
