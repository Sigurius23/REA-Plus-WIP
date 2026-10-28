.class public final Lck/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkk/e;


# instance fields
.field public w:Lfj/a;


# virtual methods
.method public final a(Ljk/a;)Ljk/a;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Lgj/d;)V
    .locals 4

    iget-object v0, p1, Lgj/d;->a:Lgj/g;

    iget-object v0, v0, Lgj/g;->e:Ljava/lang/String;

    sget-object v1, Lfj/a;->c:Ljava/lang/Object;

    invoke-static {v0}, Lq83/g;->z(Ljava/lang/String;)Lfj/a;

    move-result-object v0

    iput-object v0, p0, Lck/a;->w:Lfj/a;

    iget-object v0, v0, Lfj/a;->a:Lzt/q;

    new-instance v1, Lfj/b;

    iget-object p1, p1, Lgj/d;->b:La3/p;

    iget-object v2, p1, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object p1, p1, La3/p;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const/4 v3, 0x4

    invoke-direct {v1, v2, p1, v3}, Lfj/b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lzt/q;->H(Lfj/b;)V

    return-void
.end method

.method public final getType()Lkk/d;
    .locals 1

    sget-object v0, Lkk/d;->E:Lkk/d;

    return-object v0
.end method
