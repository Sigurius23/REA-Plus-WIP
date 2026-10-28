.class public final Li2/o0;
.super Li2/p0;
.source "SourceFile"


# instance fields
.field public final a:Lh2/d;

.field public final b:Li2/j;


# direct methods
.method public constructor <init>(Lh2/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/o0;->a:Lh2/d;

    invoke-static {p1}, Lj93/l0;->O(Lh2/d;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    invoke-static {v0, p1}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Li2/o0;->b:Li2/j;

    return-void
.end method


# virtual methods
.method public final a()Lh2/c;
    .locals 5

    new-instance v0, Lh2/c;

    iget-object v1, p0, Li2/o0;->a:Lh2/d;

    iget v2, v1, Lh2/d;->a:F

    iget v3, v1, Lh2/d;->b:F

    iget v4, v1, Lh2/d;->c:F

    iget v1, v1, Lh2/d;->d:F

    invoke-direct {v0, v2, v3, v4, v1}, Lh2/c;-><init>(FFFF)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li2/o0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Li2/o0;

    iget-object p1, p1, Li2/o0;->a:Lh2/d;

    iget-object v1, p0, Li2/o0;->a:Lh2/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Li2/o0;->a:Lh2/d;

    invoke-virtual {v0}, Lh2/d;->hashCode()I

    move-result v0

    return v0
.end method
