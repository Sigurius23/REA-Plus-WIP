.class public final Lca3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj93/d;


# direct methods
.method public constructor <init>(Lj93/d;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lca3/d;->a:Lj93/d;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lca3/d;

    if-eqz v0, :cond_0

    check-cast p1, Lca3/d;

    iget-object p1, p1, Lca3/d;->a:Lj93/d;

    iget-object v0, p0, Lca3/d;->a:Lj93/d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lca3/d;->a:Lj93/d;

    invoke-interface {v0}, Lj93/d;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lca3/d;->a:Lj93/d;

    invoke-static {v0}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
