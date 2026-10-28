.class public final Lp93/c;
.super Lu93/b;
.source "SourceFile"


# static fields
.field public static final L:Lva3/c;

.field public static final M:Lva3/c;


# instance fields
.field public final E:Lkb3/k;

.field public final F:Lr93/g0;

.field public final G:Lp93/k;

.field public final H:I

.field public final I:Lp93/b;

.field public final J:Lp93/e;

.field public final K:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lva3/c;

    sget-object v1, Lo93/n;->k:Lva3/e;

    const-string v2, "Function"

    invoke-static {v2}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    sput-object v0, Lp93/c;->L:Lva3/c;

    new-instance v0, Lva3/c;

    sget-object v1, Lo93/n;->i:Lva3/e;

    const-string v2, "KFunction"

    invoke-static {v2}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    sput-object v0, Lp93/c;->M:Lva3/c;

    return-void
.end method

.method public constructor <init>(Lkb3/k;Lib3/c;Lp93/k;I)V
    .locals 3

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionTypeKind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Lp93/k;->a(I)Lva3/h;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lu93/b;-><init>(Lkb3/n;Lva3/h;)V

    iput-object p1, p0, Lp93/c;->E:Lkb3/k;

    iput-object p2, p0, Lp93/c;->F:Lr93/g0;

    iput-object p3, p0, Lp93/c;->G:Lp93/k;

    iput p4, p0, Lp93/c;->H:I

    new-instance p2, Lp93/b;

    invoke-direct {p2, p0}, Lp93/b;-><init>(Lp93/c;)V

    iput-object p2, p0, Lp93/c;->I:Lp93/b;

    new-instance p2, Lp93/e;

    invoke-direct {p2, p1, p0}, Lp93/e;-><init>(Lkb3/k;Lp93/c;)V

    iput-object p2, p0, Lp93/c;->J:Lp93/e;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance p2, Li93/j;

    const/4 p3, 0x1

    invoke-direct {p2, p3, p4, p3}, Li93/h;-><init>(III)V

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    move-object p4, p2

    check-cast p4, Li93/i;

    iget-boolean p4, p4, Li93/i;->y:Z

    if-eqz p4, :cond_0

    move-object p4, p2

    check-cast p4, Lm83/e0;

    invoke-virtual {p4}, Lm83/e0;->nextInt()I

    move-result p4

    sget-object v0, Llb3/g1;->z:Llb3/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "P"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p4

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p0, Lp93/c;->E:Lkb3/k;

    invoke-static {p0, v0, p4, v1, v2}, Lu93/u0;->N0(Lu93/b;Llb3/g1;Lva3/h;ILkb3/n;)Lu93/u0;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p2, Llb3/g1;->E:Llb3/g1;

    const-string p3, "R"

    invoke-static {p3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p4

    iget-object v0, p0, Lp93/c;->E:Lkb3/k;

    invoke-static {p0, p2, p3, p4, v0}, Lu93/u0;->N0(Lu93/b;Llb3/g1;Lva3/h;ILkb3/n;)Lu93/u0;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lp93/c;->K:Ljava/util/List;

    sget-object p1, Lp93/d;->w:Lng3/n;

    iget-object p2, p0, Lp93/c;->G:Lp93/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lng3/n;->m(Lp93/k;)V

    return-void
.end method


# virtual methods
.method public final I()Lr93/y0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final N()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final U()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    return-object v0
.end method

.method public final e()Llb3/q0;
    .locals 1

    iget-object v0, p0, Lp93/c;->I:Lp93/b;

    return-object v0
.end method

.method public final g()Lr93/k;
    .locals 1

    iget-object v0, p0, Lp93/c;->F:Lr93/g0;

    return-object v0
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    sget-object v0, Ls93/g;->a:Ls93/f;

    return-object v0
.end method

.method public final bridge synthetic getConstructors()Ljava/util/Collection;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final getKind()Lr93/f;
    .locals 1

    sget-object v0, Lr93/f;->x:Lr93/f;

    return-object v0
.end method

.method public final getSource()Lr93/s0;
    .locals 1

    sget-object v0, Lr93/s0;->q:Lr93/v0;

    return-object v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 2

    sget-object v0, Lr93/q;->e:Lr93/p;

    const-string v1, "PUBLIC"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final isExternal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInner()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isValue()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lp93/c;->K:Ljava/util/List;

    return-object v0
.end method

.method public final k()Lr93/a0;
    .locals 1

    sget-object v0, Lr93/a0;->E:Lr93/a0;

    return-object v0
.end method

.method public final l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 0

    iget-object p1, p0, Lp93/c;->J:Lp93/e;

    return-object p1
.end method

.method public final o0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic s()Lu93/j;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lu93/b;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
