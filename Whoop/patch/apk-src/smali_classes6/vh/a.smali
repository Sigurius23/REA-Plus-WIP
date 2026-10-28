.class public final Lvh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/j;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lvh/a;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Luh/h;Lfi/o;)Lsh/k;
    .locals 6

    iget-object v0, p1, Luh/h;->a:Lsh/q;

    invoke-interface {v0}, Lsh/q;->d1()Lne3/j;

    move-result-object v0

    sget-object v1, Lvh/e;->b:Lne3/l;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lvh/e;->a:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lvh/e;->c:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    const-wide/16 v2, 0x8

    if-eqz v1, :cond_1

    sget-object v1, Lvh/e;->d:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-wide/16 v4, 0xc

    sget-object v1, Lvh/e;->e:Lne3/l;

    invoke-interface {v0, v4, v5, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-wide/16 v4, 0x15

    invoke-interface {v0, v4, v5}, Lne3/j;->request(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lne3/j;->f()Lne3/h;

    move-result-object v1

    const-wide/16 v4, 0x14

    invoke-virtual {v1, v4, v5}, Lne3/h;->s(J)B

    move-result v1

    and-int/lit8 v1, v1, 0x2

    int-to-byte v1, v1

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-lt v1, v4, :cond_2

    const-wide/16 v4, 0x4

    sget-object v1, Lvh/e;->f:Lne3/l;

    invoke-interface {v0, v4, v5, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lvh/e;->g:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lvh/e;->h:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Lvh/e;->i:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1

    :cond_3
    :goto_0
    new-instance v0, Lvh/d;

    iget-object p1, p1, Luh/h;->a:Lsh/q;

    iget-boolean v1, p0, Lvh/a;->a:Z

    invoke-direct {v0, p1, p2, v1}, Lvh/d;-><init>(Lsh/q;Lfi/o;Z)V

    return-object v0
.end method
