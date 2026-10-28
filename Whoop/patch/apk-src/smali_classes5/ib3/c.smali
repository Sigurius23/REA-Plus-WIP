.class public final Lib3/c;
.super Lu93/g0;
.source "SourceFile"

# interfaces
.implements Lr93/g0;


# instance fields
.field public final H:Lra3/a;

.field public final I:Lsa3/g;

.field public final J:Lzt/q;

.field public K:Lqa3/i0;

.field public L:Ljb3/r;


# direct methods
.method public constructor <init>(Lva3/e;Lkb3/k;Lr93/b0;Lqa3/i0;Lra3/a;)V
    .locals 1

    const-string p2, "fqName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "module"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p1}, Lu93/g0;-><init>(Lr93/b0;Lva3/e;)V

    iput-object p5, p0, Lib3/c;->H:Lra3/a;

    new-instance p1, Lsa3/g;

    iget-object p2, p4, Lqa3/i0;->z:Lqa3/r0;

    const-string p3, "getStrings(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p4, Lqa3/i0;->E:Lqa3/p0;

    const-string v0, "getQualifiedNames(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p2, p3}, Lsa3/g;-><init>(Lqa3/r0;Lqa3/p0;)V

    iput-object p1, p0, Lib3/c;->I:Lsa3/g;

    new-instance p2, Lzt/q;

    new-instance p3, Lhb3/l;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-direct {p2, p4, p1, p5, p3}, Lzt/q;-><init>(Lqa3/i0;Lsa3/g;Lra3/a;Lhb3/l;)V

    iput-object p2, p0, Lib3/c;->J:Lzt/q;

    iput-object p4, p0, Lib3/c;->K:Lqa3/i0;

    return-void
.end method


# virtual methods
.method public final K0(Lhb3/i;)V
    .locals 11

    const-string v0, "components"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lib3/c;->K:Lqa3/i0;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lib3/c;->K:Lqa3/i0;

    new-instance v2, Ljb3/r;

    iget-object v4, v0, Lqa3/i0;->F:Lqa3/g0;

    const-string v0, "getPackage(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "scope of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lfa3/u;

    const/4 v0, 0x1

    invoke-direct {v10, p0, v0}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    iget-object v5, p0, Lib3/c;->I:Lsa3/g;

    iget-object v6, p0, Lib3/c;->H:Lra3/a;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v8, p1

    invoke-direct/range {v2 .. v10}, Ljb3/r;-><init>(Lr93/g0;Lqa3/g0;Lsa3/f;Lsa3/a;Loa3/h;Lhb3/i;Ljava/lang/String;Lc93/a;)V

    iput-object v2, v3, Lib3/c;->L:Ljb3/r;

    return-void

    :cond_0
    move-object v3, p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Repeated call to DeserializedPackageFragmentImpl::initialize"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "builtins package fragment for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lu93/g0;->F:Lva3/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lib3/c;->L:Ljb3/r;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "_memberScope"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
