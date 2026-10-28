.class public abstract Ll32/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "event",
        "",
        "updatePath",
        "screenName",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onViewEvent",
        "Lj32/i;",
        "sendViewEvent",
        "a",
        "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "payments_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sendViewEvent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Le32/d$c;

    if-eqz v0, :cond_0

    new-instance p1, Lj32/b;

    check-cast p0, Le32/d$c;

    invoke-virtual {p0}, Le32/d$c;->a()Lb32/a;

    move-result-object p2

    invoke-virtual {p0}, Le32/d$c;->b()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p2, p0}, Lj32/b;-><init>(Lb32/a;Ljava/lang/String;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    instance-of v0, p0, Le32/d$b;

    if-eqz v0, :cond_1

    sget-object p0, Lj32/a;->a:Lj32/a;

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    instance-of v0, p0, Le32/d$d;

    if-eqz v0, :cond_2

    new-instance p1, Lj32/c;

    check-cast p0, Le32/d$d;

    invoke-virtual {p0}, Le32/d$d;->a()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {p1, p0}, Lj32/c;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    instance-of v0, p0, Le32/d$g;

    if-eqz v0, :cond_3

    sget-object p0, Lc31/e;->DISABLE:Lc31/e;

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lj32/h;->a:Lj32/h;

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    instance-of v0, p0, Le32/d$e;

    if-eqz v0, :cond_4

    sget-object p1, Lc31/e;->DISABLE:Lc31/e;

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lj32/f;

    check-cast p0, Le32/d$e;

    invoke-virtual {p0}, Le32/d$e;->a()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {p1, p0}, Lj32/f;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    instance-of p0, p0, Le32/d$f;

    if-eqz p0, :cond_5

    new-instance p0, Lj32/g;

    invoke-direct {p0, p1, p2}, Lj32/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p4, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-void
.end method
