.class public abstract Li4/b;
.super Li4/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>([C)V
    .locals 0

    invoke-direct {p0, p1}, Li4/c;-><init>([C)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Li4/b;->E:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final A()Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li4/c;

    instance-of v3, v2, Li4/d;

    if-eqz v3, :cond_0

    check-cast v2, Li4/d;

    invoke-virtual {v2}, Li4/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final B(Ljava/lang/String;Li4/c;)V
    .locals 5

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li4/c;

    check-cast v1, Li4/d;

    invoke-virtual {v1}, Li4/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p1, v1, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, v1, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1, v2, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    iget-object p1, v1, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance v0, Li4/d;

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    invoke-direct {v0, v1}, Li4/b;-><init>([C)V

    const-wide/16 v3, 0x0

    iput-wide v3, v0, Li4/c;->x:J

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    int-to-long v3, p1

    invoke-virtual {v0, v3, v4}, Li4/c;->g(J)V

    iget-object p1, v0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_3

    iget-object p1, v0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1, v2, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    iget-object p1, v0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object p1, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic a()Li4/c;
    .locals 1

    invoke-virtual {p0}, Li4/b;->l()Li4/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li4/b;->l()Li4/b;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Li4/b;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    check-cast p1, Li4/b;

    iget-object p1, p1, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-super {p0}, Li4/c;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final j(Li4/c;)V
    .locals 1

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public l()Li4/b;
    .locals 4

    invoke-super {p0}, Li4/c;->a()Li4/c;

    move-result-object v0

    check-cast v0, Li4/b;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li4/c;

    invoke-virtual {v3}, Li4/c;->a()Li4/c;

    move-result-object v3

    iput-object v0, v3, Li4/c;->z:Li4/b;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v1, v0, Li4/b;->E:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final n(I)Li4/c;
    .locals 2

    if-ltz p1, :cond_0

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li4/c;

    return-object p1

    :cond_0
    new-instance v0, Landroidx/constraintlayout/core/parser/CLParsingException;

    const-string v1, "no element at index "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v0
.end method

.method public final o(Ljava/lang/String;)Li4/c;
    .locals 3

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li4/c;

    check-cast v1, Li4/d;

    invoke-virtual {v1}, Li4/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, v1, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, v1, Li4/b;->E:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li4/c;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance v0, Landroidx/constraintlayout/core/parser/CLParsingException;

    const-string v1, "no element for key <"

    const-string v2, ">"

    invoke-static {v1, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v0
.end method

.method public final p(I)F
    .locals 2

    invoke-virtual {p0, p1}, Li4/b;->n(I)Li4/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li4/c;->d()F

    move-result p1

    return p1

    :cond_0
    new-instance v0, Landroidx/constraintlayout/core/parser/CLParsingException;

    const-string v1, "no float at index "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v0
.end method

.method public final q(Ljava/lang/String;)F
    .locals 4

    invoke-virtual {p0, p1}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li4/c;->d()F

    move-result p1

    return p1

    :cond_0
    new-instance v1, Landroidx/constraintlayout/core/parser/CLParsingException;

    const-string v2, "no float found for key <"

    const-string v3, ">, found ["

    invoke-static {v2, p1, v3}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Li4/c;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] : "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v1
.end method

.method public final r(I)I
    .locals 2

    invoke-virtual {p0, p1}, Li4/b;->n(I)Li4/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li4/c;->e()I

    move-result p1

    return p1

    :cond_0
    new-instance v0, Landroidx/constraintlayout/core/parser/CLParsingException;

    const-string v1, "no int at index "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v0
.end method

.method public final t(I)Li4/c;
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li4/c;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li4/c;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_0

    const-string v3, "; "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Li4/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " = <"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " >"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Ljava/lang/String;)Li4/c;
    .locals 4

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li4/c;

    check-cast v1, Li4/d;

    invoke-virtual {v1}, Li4/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p1, v1, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_1

    iget-object p1, v1, Li4/b;->E:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li4/c;

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final v(I)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1}, Li4/b;->n(I)Li4/c;

    move-result-object v0

    instance-of v1, v0, Li4/h;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Li4/c;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Landroidx/constraintlayout/core/parser/CLParsingException;

    const-string v1, "no string at index "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v0
.end method

.method public final w(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p0, p1}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    instance-of v1, v0, Li4/h;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Li4/c;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li4/c;->f()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Landroidx/constraintlayout/core/parser/CLParsingException;

    const-string v3, ">, found ["

    const-string v4, "] : "

    const-string v5, "no string found for key <"

    invoke-static {v5, p1, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, p0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v2
.end method

.method public final y(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object p1

    instance-of v0, p1, Li4/h;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Li4/c;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final z(Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li4/c;

    instance-of v2, v1, Li4/d;

    if-eqz v2, :cond_0

    check-cast v1, Li4/d;

    invoke-virtual {v1}, Li4/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
