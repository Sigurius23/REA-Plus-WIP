.class public abstract Landroidx/fragment/app/c2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/fragment/app/w0;

.field public final b:Ljava/lang/ClassLoader;

.field public final c:Ljava/util/ArrayList;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Ljava/lang/String;

.field public l:I

.field public m:Ljava/lang/CharSequence;

.field public n:I

.field public o:Ljava/lang/CharSequence;

.field public p:Ljava/util/ArrayList;

.field public q:Ljava/util/ArrayList;

.field public r:Z

.field public s:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/w0;Ljava/lang/ClassLoader;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/c2;->j:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/c2;->r:Z

    iput-object p1, p0, Landroidx/fragment/app/c2;->a:Landroidx/fragment/app/w0;

    iput-object p2, p0, Landroidx/fragment/app/c2;->b:Ljava/lang/ClassLoader;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/fragment/app/b2;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p0, Landroidx/fragment/app/c2;->d:I

    iput v0, p1, Landroidx/fragment/app/b2;->d:I

    iget v0, p0, Landroidx/fragment/app/c2;->e:I

    iput v0, p1, Landroidx/fragment/app/b2;->e:I

    iget v0, p0, Landroidx/fragment/app/c2;->f:I

    iput v0, p1, Landroidx/fragment/app/b2;->f:I

    iget v0, p0, Landroidx/fragment/app/c2;->g:I

    iput v0, p1, Landroidx/fragment/app/b2;->g:I

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/c2;->j:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/c2;->i:Z

    iput-object p1, p0, Landroidx/fragment/app/c2;->k:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This FragmentTransaction is not allowed to be added to the back stack."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V
.end method

.method public final e(ILandroidx/fragment/app/m0;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/fragment/app/c2;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must use non-zero containerViewId"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(IIII)V
    .locals 0

    iput p1, p0, Landroidx/fragment/app/c2;->d:I

    iput p2, p0, Landroidx/fragment/app/c2;->e:I

    iput p3, p0, Landroidx/fragment/app/c2;->f:I

    iput p4, p0, Landroidx/fragment/app/c2;->g:I

    return-void
.end method

.method public abstract g(Landroidx/fragment/app/m0;Landroidx/lifecycle/w;)Landroidx/fragment/app/a;
.end method
