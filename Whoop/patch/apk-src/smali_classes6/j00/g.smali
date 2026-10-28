.class public final synthetic Lj00/g;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    check-cast p5, Lq83/d;

    iget-object p5, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast p5, Lj00/h;

    invoke-virtual {p5, p1, p2, p3, p4}, Lj00/h;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lj00/h0;

    move-result-object p1

    return-object p1
.end method
