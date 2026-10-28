.class public final Llb3/c;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final w:Ljava/util/AbstractCollection;

.field public final x:Llb3/p0;

.field public final y:Lob3/o;

.field public final z:Lob3/h;


# direct methods
.method public constructor <init>(Ljava/util/AbstractCollection;Llb3/p0;Lob3/o;Lob3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/c;->w:Ljava/util/AbstractCollection;

    iput-object p2, p0, Llb3/c;->x:Llb3/p0;

    iput-object p3, p0, Llb3/c;->y:Lob3/o;

    iput-object p4, p0, Llb3/c;->z:Lob3/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Llb3/l0;

    const-string v0, "$this$runForkingPoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/c;->w:Ljava/util/AbstractCollection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lob3/h;

    iget-boolean v2, p1, Llb3/l0;->a:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "c"

    iget-object v3, p0, Llb3/c;->y:Lob3/o;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v1}, Lob3/o;->M(Lob3/h;)Lob3/j;

    move-result-object v1

    iget-object v2, p0, Llb3/c;->x:Llb3/p0;

    iget-object v4, p0, Llb3/c;->z:Lob3/h;

    invoke-static {v2, v3, v1, v4}, Llb3/d;->j(Llb3/p0;Lob3/o;Lob3/j;Lob3/h;)Z

    move-result v1

    iput-boolean v1, p1, Llb3/l0;->a:Z

    goto :goto_0

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
