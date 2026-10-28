.class public final Lhb3/t;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final w:Lhb3/x;

.field public final x:Z

.field public final y:Lqa3/k0;


# direct methods
.method public constructor <init>(Lhb3/x;ZLqa3/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb3/t;->w:Lhb3/x;

    iput-boolean p2, p0, Lhb3/t;->x:Z

    iput-object p3, p0, Lhb3/t;->y:Lqa3/k0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lhb3/t;->w:Lhb3/x;

    iget-object v1, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v2, v1, Lhb3/k;->c:Lr93/k;

    iget-object v1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->e:Lhb3/a;

    invoke-virtual {v0, v2}, Lhb3/x;->a(Lr93/k;)Lhb3/a0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v2, p0, Lhb3/t;->x:Z

    iget-object v3, p0, Lhb3/t;->y:Lqa3/k0;

    if-eqz v2, :cond_0

    invoke-interface {v1, v0, v3}, Lhb3/c;->c(Lhb3/a0;Lqa3/k0;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v1, v0, v3}, Lhb3/c;->e(Lhb3/a0;Lqa3/k0;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_2
    return-object v0
.end method
