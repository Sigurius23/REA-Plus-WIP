.class public final Lmc3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/k;
.implements Lbc3/o2;


# instance fields
.field public final w:Lbc3/m;

.field public final synthetic x:Lmc3/c;


# direct methods
.method public constructor <init>(Lmc3/c;Lbc3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc3/b;->x:Lmc3/c;

    iput-object p2, p0, Lmc3/b;->w:Lbc3/m;

    return-void
.end method


# virtual methods
.method public final b(Lhc3/v;I)V
    .locals 1

    iget-object v0, p0, Lmc3/b;->w:Lbc3/m;

    invoke-virtual {v0, p1, p2}, Lbc3/m;->b(Lhc3/v;I)V

    return-void
.end method

.method public final c(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lhc3/x;
    .locals 2

    check-cast p1, Ll83/a0;

    new-instance p2, Lbc3/l;

    iget-object v0, p0, Lmc3/b;->x:Lmc3/c;

    invoke-direct {p2, v0, p0}, Lbc3/l;-><init>(Lmc3/c;Lmc3/b;)V

    iget-object v1, p0, Lmc3/b;->w:Lbc3/m;

    invoke-virtual {v1, p1, p2}, Lbc3/m;->E(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lhc3/x;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p2, Lmc3/c;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public final cancel(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lmc3/b;->w:Lbc3/m;

    invoke-virtual {v0, p1}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    check-cast p1, Ll83/a0;

    iget-object v0, p0, Lmc3/b;->w:Lbc3/m;

    invoke-virtual {v0, p1, p2}, Lbc3/m;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V
    .locals 2

    check-cast p1, Ll83/a0;

    sget-object p2, Lmc3/c;->H:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v0, 0x0

    iget-object v1, p0, Lmc3/b;->x:Lmc3/c;

    invoke-virtual {p2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, La6/i;

    invoke-direct {p2, v1, p0}, La6/i;-><init>(Lmc3/c;Lmc3/b;)V

    iget-object v0, p0, Lmc3/b;->w:Lbc3/m;

    invoke-virtual {v0, p1, p2}, Lbc3/m;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lmc3/b;->w:Lbc3/m;

    iget-object v0, v0, Lbc3/m;->E:Lq83/j;

    return-object v0
.end method

.method public final isActive()Z
    .locals 1

    iget-object v0, p0, Lmc3/b;->w:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v0

    return v0
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lmc3/b;->w:Lbc3/m;

    invoke-virtual {v0, p1}, Lbc3/m;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lmc3/b;->w:Lbc3/m;

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
