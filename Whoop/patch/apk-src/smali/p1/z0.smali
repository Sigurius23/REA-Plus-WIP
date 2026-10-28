.class public interface abstract Lp1/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/c1;
.implements Lp1/t2;


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    move-object v0, p0

    check-cast v0, Lp1/g1;

    invoke-virtual {v0, p1}, Lp1/g1;->y(F)V

    return-void
.end method
