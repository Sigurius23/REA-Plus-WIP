.class public final Lya3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lr93/e;

    invoke-static {p1}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object p1

    iget-object p1, p1, Lva3/e;->a:Lva3/f;

    iget-object p1, p1, Lva3/f;->a:Ljava/lang/String;

    check-cast p2, Lr93/e;

    invoke-static {p2}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object p2

    iget-object p2, p2, Lva3/e;->a:Lva3/f;

    iget-object p2, p2, Lva3/f;->a:Ljava/lang/String;

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
