.class public final Lab3/a;
.super Lab3/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ls93/b;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lr93/b0;)Llb3/y;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lab3/g;->a:Ljava/lang/Object;

    check-cast p1, Ls93/b;

    invoke-interface {p1}, Ls93/b;->getType()Llb3/y;

    move-result-object p1

    return-object p1
.end method
