.class public Ljb3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls93/i;


# static fields
.field public static final synthetic x:[Lj93/z;


# instance fields
.field public final w:Lkb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Ljb3/a;

    const-string v2, "annotations"

    const-string v3, "getAnnotations()Ljava/util/List;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Ljb3/a;->x:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lkb3/n;Lc93/a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lkb3/k;

    new-instance v0, Lkb3/i;

    invoke-direct {v0, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v0, p0, Ljb3/a;->w:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final bridge J(Lva3/e;)Z
    .locals 0

    invoke-static {p0, p1}, Ls93/h;->p(Ls93/i;Lva3/e;)Z

    move-result p1

    return p1
.end method

.method public final bridge T(Lva3/e;)Ls93/b;
    .locals 0

    invoke-static {p0, p1}, Ls93/h;->n(Ls93/i;Lva3/e;)Ls93/b;

    move-result-object p1

    return-object p1
.end method

.method public isEmpty()Z
    .locals 2

    sget-object v0, Ljb3/a;->x:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Ljb3/a;->w:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    sget-object v0, Ljb3/a;->x:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Ljb3/a;->w:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
