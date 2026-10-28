.class public final Lbd3/m;
.super Lbd3/k;
.source "SourceFile"


# instance fields
.field public final d:Z


# direct methods
.method public constructor <init>(Lbd3/v;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lbd3/k;-><init>(Lbd3/v;)V

    iput-boolean p2, p0, Lbd3/m;->d:Z

    return-void
.end method


# virtual methods
.method public final f(B)V
    .locals 1

    iget-boolean v0, p0, Lbd3/m;->d:Z

    invoke-static {p1}, Ll83/r;->a(B)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lbd3/k;->l(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lbd3/k;->j(Ljava/lang/String;)V

    return-void
.end method

.method public final h(I)V
    .locals 1

    iget-boolean v0, p0, Lbd3/m;->d:Z

    invoke-static {p1}, Ljava/lang/Integer;->toUnsignedString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lbd3/k;->l(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lbd3/k;->j(Ljava/lang/String;)V

    return-void
.end method

.method public final i(J)V
    .locals 1

    iget-boolean v0, p0, Lbd3/m;->d:Z

    invoke-static {p1, p2}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lbd3/k;->l(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lbd3/k;->j(Ljava/lang/String;)V

    return-void
.end method

.method public final k(S)V
    .locals 2

    iget-boolean v0, p0, Lbd3/m;->d:Z

    const v1, 0xffff

    if-eqz v0, :cond_0

    and-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/k;->l(Ljava/lang/String;)V

    return-void

    :cond_0
    and-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/k;->j(Ljava/lang/String;)V

    return-void
.end method
