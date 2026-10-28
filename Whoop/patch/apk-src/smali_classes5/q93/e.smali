.class public final Lq93/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Lr93/e;)Lr93/e;
    .locals 3

    invoke-static {p0}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object v0

    sget-object v1, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v0}, Lq93/d;->h(Lva3/f;)Lva3/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object p0

    invoke-virtual {p0, v0}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Given class "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not a read-only collection"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Lva3/e;Lo93/h;)Lr93/e;
    .locals 1

    const-string v0, "builtIns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq93/d;->a:Ljava/lang/String;

    sget-object v0, Lq93/d;->h:Ljava/util/HashMap;

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/c;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lva3/c;->a()Lva3/e;

    move-result-object p0

    invoke-virtual {p1, p0}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
