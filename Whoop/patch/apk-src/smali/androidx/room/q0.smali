.class public abstract Landroidx/room/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final onCreate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lwb/a;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lwb/a;

    .line 4
    iget-object p1, p1, Lwb/a;->w:Lub/a;

    .line 5
    invoke-virtual {p0, p1}, Landroidx/room/q0;->onCreate(Lub/a;)V

    :cond_0
    return-void
.end method

.method public final onCreate(Lub/a;)V
    .locals 1

    .line 1
    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onDestructiveMigration(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lwb/a;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lwb/a;

    .line 4
    iget-object p1, p1, Lwb/a;->w:Lub/a;

    .line 5
    invoke-virtual {p0, p1}, Landroidx/room/q0;->onDestructiveMigration(Lub/a;)V

    :cond_0
    return-void
.end method

.method public final onDestructiveMigration(Lub/a;)V
    .locals 1

    .line 1
    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onOpen(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p1, Lwb/a;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Lwb/a;

    .line 3
    iget-object p1, p1, Lwb/a;->w:Lub/a;

    .line 4
    invoke-virtual {p0, p1}, Landroidx/room/q0;->onOpen(Lub/a;)V

    :cond_0
    return-void
.end method

.method public abstract onOpen(Lub/a;)V
.end method
