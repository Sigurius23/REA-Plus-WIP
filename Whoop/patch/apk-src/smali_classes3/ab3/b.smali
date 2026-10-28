.class public Lab3/b;
.super Lab3/g;
.source "SourceFile"


# instance fields
.field public final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lab3/b;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a(Lr93/b0;)Llb3/y;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lab3/b;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/y;

    invoke-static {p1}, Lo93/h;->z(Llb3/y;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lo93/h;->s(Lr93/h;)Lo93/j;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    sget-object v0, Lo93/m;->W:Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-static {p1, v0}, Lo93/h;->C(Llb3/y;Lva3/f;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lo93/m;->X:Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-static {p1, v0}, Lo93/h;->C(Llb3/y;Lva3/f;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lo93/m;->Y:Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-static {p1, v0}, Lo93/h;->C(Llb3/y;Lva3/f;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lo93/m;->Z:Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-static {p1, v0}, Lo93/h;->C(Llb3/y;Lva3/f;)Z

    :cond_1
    return-object p1
.end method
