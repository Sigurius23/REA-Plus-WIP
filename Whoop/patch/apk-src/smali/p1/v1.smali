.class public final Lp1/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lp1/w;

.field public b:I

.field public c:Lp1/a;

.field public d:Lc93/m;

.field public e:I

.field public f:La0/m0;

.field public g:La0/v0;


# direct methods
.method public constructor <init>(Lp1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/v1;->a:Lp1/w;

    return-void
.end method

.method public static a(Lp1/f0;La0/v0;)Z
    .locals 2

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lp1/f0;->y:Lp1/o2;

    if-nez v0, :cond_0

    sget-object v0, Lp1/v0;->F:Lp1/v0;

    :cond_0
    invoke-virtual {p0}, Lp1/f0;->y()Lp1/e0;

    move-result-object v1

    iget-object v1, v1, Lp1/e0;->f:Ljava/lang/Object;

    invoke-virtual {p1, p0}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Lp1/o2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public final b()Z
    .locals 2

    iget-object v0, p0, Lp1/v1;->a:Lp1/w;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp1/v1;->c:Lp1/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp1/a;->a()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final c(Ljava/lang/Object;)Lp1/p0;
    .locals 1

    iget-object v0, p0, Lp1/v1;->a:Lp1/w;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0, p1}, Lp1/w;->r(Lp1/v1;Ljava/lang/Object;)Lp1/p0;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lp1/p0;->w:Lp1/p0;

    return-object p1
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lp1/v1;->a:Lp1/w;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lp1/w;->O:Z

    iget-object v0, v0, Lp1/w;->T:Lbu/c;

    invoke-virtual {v0}, Lbu/c;->A()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lp1/v1;->a:Lp1/w;

    iput-object v0, p0, Lp1/v1;->f:La0/m0;

    iput-object v0, p0, Lp1/v1;->g:La0/v0;

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public final e(Z)V
    .locals 1

    iget v0, p0, Lp1/v1;->b:I

    if-eqz p1, :cond_0

    or-int/lit8 p1, v0, 0x20

    goto :goto_0

    :cond_0
    and-int/lit8 p1, v0, -0x21

    :goto_0
    iput p1, p0, Lp1/v1;->b:I

    return-void
.end method

.method public final f(Lc93/m;)V
    .locals 0

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    return-void
.end method
