.class public final Lka3/c;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final E:Lx93/p;

.field public final w:La3/p;

.field public final x:Lr93/x0;

.field public final y:Lka3/a;

.field public final z:Llb3/q0;


# direct methods
.method public constructor <init>(La3/p;Lr93/x0;Lka3/a;Llb3/q0;Lx93/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka3/c;->w:La3/p;

    iput-object p2, p0, Lka3/c;->x:Lr93/x0;

    iput-object p3, p0, Lka3/c;->y:Lka3/a;

    iput-object p4, p0, Lka3/c;->z:Llb3/q0;

    iput-object p5, p0, Lka3/c;->E:Lx93/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lka3/c;->w:La3/p;

    iget-object v0, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/l0;

    iget-object v1, p0, Lka3/c;->z:Llb3/q0;

    invoke-interface {v1}, Llb3/q0;->d()Lr93/h;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lr93/h;->i()Llb3/c0;

    move-result-object v1

    :goto_0
    move-object v6, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    const/16 v7, 0x1f

    iget-object v2, p0, Lka3/c;->y:Lka3/a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lka3/a;->a(Lka3/a;Lka3/b;ZLjava/util/Set;Llb3/c0;I)Lka3/a;

    move-result-object v1

    iget-object v2, p0, Lka3/c;->E:Lx93/p;

    invoke-virtual {v2}, Lx93/p;->g()Z

    move-result v2

    invoke-virtual {v1, v2}, Lka3/a;->h(Z)Lka3/a;

    move-result-object v1

    iget-object v2, p0, Lka3/c;->x:Lr93/x0;

    invoke-virtual {v0, v2, v1}, Lcom/google/crypto/tink/internal/l0;->P(Lr93/x0;Lka3/a;)Llb3/y;

    move-result-object v0

    return-object v0
.end method
