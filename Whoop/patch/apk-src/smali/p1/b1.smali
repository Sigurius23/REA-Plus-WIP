.class public interface abstract Lp1/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/c1;
.implements Lp1/t2;


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    check-cast v0, Lp1/i1;

    invoke-virtual {v0}, Lp1/i1;->x()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    move-object p1, p0

    check-cast p1, Lp1/i1;

    invoke-virtual {p1, v0, v1}, Lp1/i1;->y(J)V

    return-void
.end method
