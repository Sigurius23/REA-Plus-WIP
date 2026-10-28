.class public abstract Lfa3/c;
.super Lfa3/g0;
.source "SourceFile"


# static fields
.field public static final synthetic l:I


# direct methods
.method public static a(Lu93/q0;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "removeAt"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lio/sentry/config/a;->p(Lr93/b;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lfa3/g0;->g:Lfa3/c0;

    iget-object v0, v0, Lfa3/c0;->e:Ljava/lang/String;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
