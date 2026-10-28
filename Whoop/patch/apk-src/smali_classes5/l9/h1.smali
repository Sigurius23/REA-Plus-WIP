.class public abstract Ll9/h1;
.super Ll9/j;
.source "SourceFile"


# instance fields
.field public final k:Ll9/a;


# direct methods
.method public constructor <init>(Ll9/a;)V
    .locals 0

    invoke-direct {p0}, Ll9/j;-><init>()V

    iput-object p1, p0, Ll9/h1;->k:Ll9/a;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 0

    invoke-virtual {p0}, Ll9/h1;->z()V

    return-void
.end method

.method public final f()Lu8/o0;
    .locals 1

    iget-object v0, p0, Ll9/h1;->k:Ll9/a;

    invoke-virtual {v0}, Ll9/a;->f()Lu8/o0;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lu8/x;
    .locals 1

    iget-object v0, p0, Ll9/h1;->k:Ll9/a;

    invoke-virtual {v0}, Ll9/a;->g()Lu8/x;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Ll9/h1;->k:Ll9/a;

    invoke-virtual {v0}, Ll9/a;->h()Z

    move-result v0

    return v0
.end method

.method public final k(Lz8/n;)V
    .locals 0

    iput-object p1, p0, Ll9/j;->j:Lz8/n;

    const/4 p1, 0x0

    invoke-static {p1}, Lx8/t;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Ll9/j;->i:Landroid/os/Handler;

    invoke-virtual {p0}, Ll9/h1;->A()V

    return-void
.end method

.method public r(Lu8/x;)V
    .locals 1

    iget-object v0, p0, Ll9/h1;->k:Ll9/a;

    invoke-virtual {v0, p1}, Ll9/a;->r(Lu8/x;)V

    return-void
.end method

.method public final s(Ljava/lang/Object;Ll9/c0;)Ll9/c0;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p2}, Ll9/h1;->x(Ll9/c0;)Ll9/c0;

    move-result-object p1

    return-object p1
.end method

.method public final t(JLjava/lang/Object;)J
    .locals 0

    check-cast p3, Ljava/lang/Void;

    return-wide p1
.end method

.method public final u(ILjava/lang/Object;)I
    .locals 0

    check-cast p2, Ljava/lang/Void;

    return p1
.end method

.method public final v(Ljava/lang/Object;Ll9/a;Lu8/o0;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p3}, Ll9/h1;->y(Lu8/o0;)V

    return-void
.end method

.method public x(Ll9/c0;)Ll9/c0;
    .locals 0

    return-object p1
.end method

.method public abstract y(Lu8/o0;)V
.end method

.method public final z()V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Ll9/h1;->k:Ll9/a;

    invoke-virtual {p0, v0, v1}, Ll9/j;->w(Ljava/lang/Object;Ll9/a;)V

    return-void
.end method
