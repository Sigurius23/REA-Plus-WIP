.class public final Lbc3/q;
.super Lbc3/m1;
.source "SourceFile"

# interfaces
.implements Lbc3/p;


# instance fields
.field public final E:Lbc3/r;


# direct methods
.method public constructor <init>(Lbc3/r;)V
    .locals 0

    invoke-direct {p0}, Lhc3/k;-><init>()V

    iput-object p1, p0, Lbc3/q;->E:Lbc3/r;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lbc3/m1;->h()Lbc3/t1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lbc3/t1;->v(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lbc3/q;->E:Lbc3/r;

    invoke-virtual {p0}, Lbc3/m1;->h()Lbc3/t1;

    move-result-object v0

    invoke-interface {p1, v0}, Lbc3/r;->parentCancelled(Lbc3/b2;)V

    return-void
.end method
