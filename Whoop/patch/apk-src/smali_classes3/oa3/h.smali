.class public final Loa3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb3/j;


# instance fields
.field public final w:Ldb3/b;

.field public final x:Ldb3/b;

.field public final y:Lw93/b;


# direct methods
.method public constructor <init>(Lw93/b;Lqa3/g0;Lua3/f;ZLjb3/i;)V
    .locals 3

    const-string p4, "kotlinClass"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "packageProto"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "nameResolver"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p1, Lw93/b;->a:Ljava/lang/Class;

    invoke-static {p4}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object p4

    new-instance p5, Ldb3/b;

    invoke-static {p4}, Ldb3/b;->e(Lva3/c;)Ljava/lang/String;

    move-result-object p4

    invoke-direct {p5, p4}, Ldb3/b;-><init>(Ljava/lang/String;)V

    iget-object p4, p1, Lw93/b;->b:Lpa3/b;

    iget-object v0, p4, Lpa3/b;->b:Ljava/lang/String;

    iget-object p4, p4, Lpa3/b;->d:Ljava/lang/Object;

    check-cast p4, Lpa3/a;

    sget-object v1, Lpa3/a;->I:Lpa3/a;

    const/4 v2, 0x0

    if-ne p4, v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p4

    if-lez p4, :cond_1

    invoke-static {v0}, Ldb3/b;->c(Ljava/lang/String;)Ldb3/b;

    move-result-object v2

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Loa3/h;->w:Ldb3/b;

    iput-object v2, p0, Loa3/h;->x:Ldb3/b;

    iput-object p1, p0, Loa3/h;->y:Lw93/b;

    sget-object p1, Lta3/l;->k:Lwa3/o;

    const-string p4, "packageModuleName"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p1}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p3, p1}, Lua3/f;->getString(I)Ljava/lang/String;

    :cond_2
    return-void
.end method


# virtual methods
.method public final a()Lva3/c;
    .locals 5

    new-instance v0, Lva3/c;

    iget-object v1, p0, Loa3/h;->w:Ldb3/b;

    iget-object v1, v1, Ldb3/b;->a:Ljava/lang/String;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    sget-object v1, Lva3/e;->c:Lva3/e;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x9

    invoke-static {v0}, Ldb3/b;->a(I)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    new-instance v3, Lva3/e;

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2f

    const/16 v4, 0x2e

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v1, v3

    :goto_0
    invoke-virtual {p0}, Loa3/h;->d()Lva3/h;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0
.end method

.method public final b()Ldb3/b;
    .locals 1

    iget-object v0, p0, Loa3/h;->x:Ldb3/b;

    return-object v0
.end method

.method public final c()Lw93/b;
    .locals 1

    iget-object v0, p0, Loa3/h;->y:Lw93/b;

    return-object v0
.end method

.method public final d()Lva3/h;
    .locals 2

    iget-object v0, p0, Loa3/h;->w:Ldb3/b;

    invoke-virtual {v0}, Ldb3/b;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getInternalName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x2f

    invoke-static {v1, v0, v0}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Class \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Loa3/h;->a()Lva3/c;

    move-result-object v1

    invoke-virtual {v1}, Lva3/c;->a()Lva3/e;

    move-result-object v1

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    iget-object v1, v1, Lva3/f;->a:Ljava/lang/String;

    const/16 v2, 0x27

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Loa3/h;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Loa3/h;->w:Ldb3/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
