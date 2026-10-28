.class public final Lmb3/a;
.super Llb3/n0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lmb3/b;

.field public final synthetic b:Llb3/a1;


# direct methods
.method public constructor <init>(Lmb3/b;Llb3/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmb3/a;->a:Lmb3/b;

    iput-object p2, p0, Lmb3/a;->b:Llb3/a1;

    return-void
.end method


# virtual methods
.method public final i0(Llb3/p0;Lob3/g;)Lob3/h;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "type"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lmb3/a;->a:Lmb3/b;

    invoke-interface {p1, p2}, Lob3/o;->f(Lob3/g;)Lob3/h;

    move-result-object p2

    check-cast p2, Llb3/y;

    sget-object v0, Llb3/g1;->y:Llb3/g1;

    iget-object v1, p0, Lmb3/a;->b:Llb3/a1;

    invoke-virtual {v1, p2, v0}, Llb3/a1;->g(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p2

    invoke-interface {p1, p2}, Lmb3/b;->L(Llb3/y;)Llb3/c0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method
