.class public interface abstract Lp1/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/c1;
.implements Lp1/t2;


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    move-object v0, p0

    check-cast v0, Lp1/h1;

    invoke-virtual {v0, p1}, Lp1/h1;->y(I)V

    return-void
.end method
