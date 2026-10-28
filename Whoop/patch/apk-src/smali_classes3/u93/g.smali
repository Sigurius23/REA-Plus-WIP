.class public abstract Lu93/g;
.super Lu93/o;
.source "SourceFile"

# interfaces
.implements Lr93/w0;


# static fields
.field public static final synthetic J:[Lj93/z;


# instance fields
.field public final F:Lkb3/n;

.field public final G:Lr93/r;

.field public H:Ljava/util/List;

.field public final I:Lu93/f;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lu93/g;

    const-string v2, "constructors"

    const-string v3, "getConstructors()Ljava/util/Collection;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lu93/g;->J:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lkb3/n;Lr93/k;Ls93/i;Lva3/h;Lr93/r;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibilityImpl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr93/s0;->q:Lr93/v0;

    invoke-direct {p0, p2, p3, p4, v0}, Lu93/o;-><init>(Lr93/k;Ls93/i;Lva3/h;Lr93/s0;)V

    iput-object p1, p0, Lu93/g;->F:Lkb3/n;

    iput-object p5, p0, Lu93/g;->G:Lr93/r;

    new-instance p2, Lbg/j;

    const/16 p3, 0xe

    invoke-direct {p2, p0, p3}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    check-cast p1, Lkb3/k;

    invoke-virtual {p1, p2}, Lkb3/k;->a(Lc93/a;)Lkb3/i;

    new-instance p1, Lu93/f;

    invoke-direct {p1, p0}, Lu93/f;-><init>(Lu93/g;)V

    iput-object p1, p0, Lu93/g;->I:Lu93/f;

    return-void
.end method


# virtual methods
.method public final I0()Lr93/l;
    .locals 0

    return-object p0
.end method

.method public final L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitTypeAliasDescriptor(Lr93/w0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final U()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a()Lr93/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final a()Lr93/k;
    .locals 0

    .line 2
    return-object p0
.end method

.method public final e()Llb3/q0;
    .locals 1

    iget-object v0, p0, Lu93/g;->I:Lu93/f;

    return-object v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 1

    iget-object v0, p0, Lu93/g;->G:Lr93/r;

    return-object v0
.end method

.method public final isExternal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInner()Z
    .locals 3

    move-object v0, p0

    check-cast v0, Ljb3/u;

    invoke-virtual {v0}, Ljb3/u;->L0()Llb3/c0;

    move-result-object v0

    new-instance v1, Ls;

    const/16 v2, 0x17

    invoke-direct {v1, p0, v2}, Ls;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Llb3/d1;->c(Llb3/y;Lkotlin/jvm/functions/Function1;Lub3/h;)Z

    move-result v0

    return v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu93/g;->H:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "declaredTypeParametersImpl"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "typealias "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/n;->getName()Lva3/h;

    move-result-object v1

    invoke-virtual {v1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
