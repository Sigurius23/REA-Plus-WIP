.class public final Lu93/a0;
.super Lu93/n;
.source "SourceFile"

# interfaces
.implements Lr93/k0;


# static fields
.field public static final synthetic I:[Lj93/z;


# instance fields
.field public final E:Lva3/e;

.field public final F:Lkb3/i;

.field public final G:Lkb3/i;

.field public final H:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;

.field public final z:Lu93/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lu93/a0;

    const-string v2, "fragments"

    const-string v3, "getFragments()Ljava/util/List;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "empty"

    const-string v5, "getEmpty()Z"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lu93/a0;->I:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lu93/e0;Lva3/e;Lkb3/k;)V
    .locals 2

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lva3/f;->e:Lva3/h;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    :goto_0
    sget-object v1, Ls93/g;->a:Ls93/f;

    invoke-direct {p0, v1, v0}, Lu93/n;-><init>(Ls93/i;Lva3/h;)V

    iput-object p1, p0, Lu93/a0;->z:Lu93/e0;

    iput-object p2, p0, Lu93/a0;->E:Lva3/e;

    new-instance p1, Lu93/z;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lu93/z;-><init>(Lu93/a0;I)V

    new-instance p2, Lkb3/i;

    invoke-direct {p2, p3, p1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p2, p0, Lu93/a0;->F:Lkb3/i;

    new-instance p1, Lu93/z;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lu93/z;-><init>(Lu93/a0;I)V

    new-instance p2, Lkb3/i;

    invoke-direct {p2, p3, p1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p2, p0, Lu93/a0;->G:Lkb3/i;

    new-instance p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;

    new-instance p2, Lu93/z;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Lu93/z;-><init>(Lu93/a0;I)V

    invoke-direct {p1, p3, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;-><init>(Lkb3/n;Lc93/a;)V

    iput-object p1, p0, Lu93/a0;->H:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;

    return-void
.end method


# virtual methods
.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitPackageViewDescriptor(Lr93/k0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lr93/k0;

    if-eqz v0, :cond_0

    check-cast p1, Lr93/k0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    check-cast p1, Lu93/a0;

    iget-object v1, p1, Lu93/a0;->E:Lva3/e;

    iget-object v2, p0, Lu93/a0;->E:Lva3/e;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lu93/a0;->z:Lu93/e0;

    iget-object p1, p1, Lu93/a0;->z:Lu93/e0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public final g()Lr93/k;
    .locals 2

    iget-object v0, p0, Lu93/a0;->E:Lva3/e;

    iget-object v1, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v1, p0, Lu93/a0;->z:Lu93/e0;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lu93/e0;->F(Lva3/e;)Lr93/k0;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lu93/a0;->z:Lu93/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu93/a0;->E:Lva3/e;

    invoke-virtual {v1}, Lva3/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
