.class public final Lab3/i;
.super Lab3/g;
.source "SourceFile"


# instance fields
.field public final b:Lva3/c;

.field public final c:Lva3/h;


# direct methods
.method public constructor <init>(Lva3/c;Lva3/h;)V
    .locals 1

    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lab3/g;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lab3/i;->b:Lva3/c;

    iput-object p2, p0, Lab3/i;->c:Lva3/h;

    return-void
.end method


# virtual methods
.method public final a(Lr93/b0;)Llb3/y;
    .locals 3

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lab3/i;->b:Lva3/c;

    invoke-static {p1, v0}, Lhg3/i;->L(Lr93/b0;Lva3/c;)Lr93/e;

    move-result-object p1

    if-eqz p1, :cond_1

    sget v1, Lya3/f;->a:I

    sget-object v1, Lr93/f;->y:Lr93/f;

    invoke-static {p1, v1}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Lr93/e;->i()Llb3/c0;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lnb3/k;->a0:Lnb3/k;

    invoke-virtual {v0}, Lva3/c;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lab3/i;->c:Lva3/h;

    iget-object v1, v1, Lva3/h;->w:Ljava/lang/String;

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lva3/h;
    .locals 1

    iget-object v0, p0, Lab3/i;->c:Lva3/h;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lab3/i;->b:Lva3/c;

    invoke-virtual {v1}, Lva3/c;->f()Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lab3/i;->c:Lva3/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
