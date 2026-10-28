.class public final Lja3/q;
.super Lu93/g0;
.source "SourceFile"


# static fields
.field public static final synthetic N:[Lj93/z;


# instance fields
.field public final H:Lx93/x;

.field public final I:Lzt/q;

.field public final J:Lkb3/i;

.field public final K:Lja3/d;

.field public final L:Lkb3/c;

.field public final M:Ls93/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lja3/q;

    const-string v2, "binaryClasses"

    const-string v3, "getBinaryClasses$descriptors_jvm()Ljava/util/Map;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "partToFacade"

    const-string v5, "getPartToFacade()Ljava/util/HashMap;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lja3/q;->N:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lzt/q;Lx93/x;)V
    .locals 5

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v1, v0, Lia3/a;->o:Lr93/b0;

    iget-object v2, p2, Lx93/x;->a:Lva3/e;

    invoke-direct {p0, v1, v2}, Lu93/g0;-><init>(Lr93/b0;Lva3/e;)V

    iput-object p2, p0, Lja3/q;->H:Lx93/x;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p1, p0, v1, v2}, Lge3/g;->l(Lzt/q;Lr93/g;Lx93/n;I)Lzt/q;

    move-result-object p1

    iput-object p1, p0, Lja3/q;->I:Lzt/q;

    iget-object v0, v0, Lia3/a;->d:Loa3/f;

    invoke-virtual {v0}, Loa3/f;->c()Lhb3/i;

    move-result-object v0

    iget-object v0, v0, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lsa3/e;->g:Lsa3/e;

    iget-object v0, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v1, v0, Lia3/a;->a:Lkb3/n;

    new-instance v2, Lja3/p;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lja3/p;-><init>(Lja3/q;I)V

    move-object v3, v1

    check-cast v3, Lkb3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lkb3/i;

    invoke-direct {v4, v3, v2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v4, p0, Lja3/q;->J:Lkb3/i;

    new-instance v2, Lja3/d;

    invoke-direct {v2, p1, p2, p0}, Lja3/d;-><init>(Lzt/q;Lx93/x;Lja3/q;)V

    iput-object v2, p0, Lja3/q;->K:Lja3/d;

    new-instance v2, Lja3/p;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lja3/p;-><init>(Lja3/q;I)V

    move-object v3, v1

    check-cast v3, Lkb3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lkb3/c;

    invoke-direct {v4, v3, v2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v4, p0, Lja3/q;->L:Lkb3/c;

    iget-object v0, v0, Lia3/a;->v:Lch3/h;

    iget-boolean v0, v0, Lch3/h;->y:Z

    if-eqz v0, :cond_0

    sget-object p1, Ls93/g;->a:Ls93/f;

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lhg3/i;->j0(Lzt/q;Lma3/b;)Lia3/c;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lja3/q;->M:Ls93/i;

    new-instance p1, Lja3/p;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lja3/p;-><init>(Lja3/q;I)V

    check-cast v1, Lkb3/k;

    invoke-virtual {v1, p1}, Lkb3/k;->a(Lc93/a;)Lkb3/i;

    return-void
.end method


# virtual methods
.method public final getAnnotations()Ls93/i;
    .locals 1

    iget-object v0, p0, Lja3/q;->M:Ls93/i;

    return-object v0
.end method

.method public final getSource()Lr93/s0;
    .locals 2

    new-instance v0, Lla/b;

    const/16 v1, 0x16

    invoke-direct {v0, p0, v1}, Lla/b;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Lazy Java package fragment: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lu93/g0;->F:Lva3/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " of module "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lja3/q;->I:Lzt/q;

    iget-object v1, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->o:Lr93/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lja3/q;->K:Lja3/d;

    return-object v0
.end method
