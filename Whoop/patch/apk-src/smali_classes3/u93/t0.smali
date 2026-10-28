.class public final Lu93/t0;
.super Lu93/x;
.source "SourceFile"

# interfaces
.implements Lu93/s0;


# static fields
.field public static final h0:Lt9/c0;

.field public static final synthetic i0:[Lj93/z;


# instance fields
.field public final e0:Lkb3/n;

.field public final f0:Lr93/w0;

.field public g0:Lu93/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lu93/t0;

    const-string v2, "withDispatchReceiver"

    const-string v3, "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lu93/t0;->i0:[Lj93/z;

    new-instance v0, Lt9/c0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu93/t0;->h0:Lt9/c0;

    return-void
.end method

.method public constructor <init>(Lkb3/n;Lr93/w0;Lu93/j;Lu93/s0;Ls93/i;ILr93/s0;)V
    .locals 7

    sget-object v6, Lva3/j;->e:Lva3/h;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p4

    move-object v5, p5

    move v1, p6

    move-object v4, p7

    invoke-direct/range {v0 .. v6}, Lu93/x;-><init>(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)V

    iput-object p1, v0, Lu93/t0;->e0:Lkb3/n;

    iput-object v2, v0, Lu93/t0;->f0:Lr93/w0;

    new-instance p2, Lce/d;

    const/16 p4, 0xd

    invoke-direct {p2, p4, p0, p3}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    check-cast p1, Lkb3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p4, Lkb3/h;

    invoke-direct {p4, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, v0, Lu93/t0;->g0:Lu93/j;

    return-void
.end method


# virtual methods
.method public final bridge synthetic I0()Lr93/l;
    .locals 1

    invoke-virtual {p0}, Lu93/t0;->U0()Lu93/s0;

    move-result-object v0

    return-object v0
.end method

.method public final L0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/x;
    .locals 8

    const-string p3, "newOwner"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "kind"

    invoke-static {p1, p2}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string p2, "annotations"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    if-eq p1, v6, :cond_0

    const/4 p2, 0x4

    :cond_0
    new-instance v0, Lu93/t0;

    iget-object v2, p0, Lu93/t0;->f0:Lr93/w0;

    iget-object v3, p0, Lu93/t0;->g0:Lu93/j;

    iget-object v1, p0, Lu93/t0;->e0:Lkb3/n;

    move-object v4, p0

    move-object v7, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v7}, Lu93/t0;-><init>(Lkb3/n;Lr93/w0;Lu93/j;Lu93/s0;Ls93/i;ILr93/s0;)V

    return-object v0
.end method

.method public final O()Z
    .locals 1

    iget-object v0, p0, Lu93/t0;->g0:Lu93/j;

    iget-boolean v0, v0, Lu93/j;->e0:Z

    return v0
.end method

.method public final P()Lr93/e;
    .locals 2

    iget-object v0, p0, Lu93/t0;->g0:Lu93/j;

    invoke-virtual {v0}, Lu93/j;->P()Lr93/e;

    move-result-object v0

    const-string v1, "getConstructedClass(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final U0()Lu93/s0;
    .locals 2

    invoke-super {p0}, Lu93/x;->a()Lr93/w;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lu93/s0;

    return-object v0
.end method

.method public final V0()Lu93/j;
    .locals 1

    iget-object v0, p0, Lu93/t0;->g0:Lu93/j;

    return-object v0
.end method

.method public final W0(Llb3/a1;)Lu93/t0;
    .locals 2

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lu93/x;->d(Llb3/a1;)Lr93/w;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lu93/t0;

    iget-object v0, p1, Lu93/x;->H:Llb3/y;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Llb3/a1;->d(Llb3/y;)Llb3/a1;

    move-result-object v0

    iget-object v1, p0, Lu93/t0;->g0:Lu93/j;

    invoke-virtual {v1}, Lu93/j;->W0()Lu93/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lu93/j;->Z0(Llb3/a1;)Lu93/j;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iput-object v0, p1, Lu93/t0;->g0:Lu93/j;

    return-object p1
.end method

.method public final bridge synthetic a()Lr93/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu93/t0;->U0()Lu93/s0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/c;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lu93/t0;->U0()Lu93/s0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/k;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lu93/t0;->U0()Lu93/s0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/w;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lu93/t0;->U0()Lu93/s0;

    move-result-object v0

    return-object v0
.end method

.method public final a0(Lr93/e;Lr93/a0;Lr93/o;)Lr93/c;
    .locals 2

    const-string v0, "newOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibility"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    sget-object v0, Llb3/a1;->b:Llb3/a1;

    invoke-virtual {p0, v0}, Lu93/x;->P0(Llb3/a1;)Lu93/w;

    move-result-object v0

    iput-object p1, v0, Lu93/w;->x:Lr93/k;

    iput-object p2, v0, Lu93/w;->y:Lr93/a0;

    iput-object p3, v0, Lu93/w;->z:Lr93/r;

    iput v1, v0, Lu93/w;->F:I

    const/4 p1, 0x0

    iput-boolean p1, v0, Lu93/w;->M:Z

    iget-object p1, v0, Lu93/w;->X:Lu93/x;

    invoke-virtual {p1, v0}, Lu93/x;->M0(Lu93/w;)Lu93/x;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lu93/s0;

    return-object p1
.end method

.method public final bridge synthetic d(Llb3/a1;)Lr93/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lu93/t0;->W0(Llb3/a1;)Lu93/t0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic d(Llb3/a1;)Lr93/w;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lu93/t0;->W0(Llb3/a1;)Lu93/t0;

    move-result-object p1

    return-object p1
.end method

.method public final g()Lr93/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lu93/t0;->f0:Lr93/w0;

    return-object v0
.end method

.method public final g()Lr93/k;
    .locals 1

    .line 2
    iget-object v0, p0, Lu93/t0;->f0:Lr93/w0;

    return-object v0
.end method

.method public final getReturnType()Llb3/y;
    .locals 1

    iget-object v0, p0, Lu93/x;->H:Llb3/y;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method
