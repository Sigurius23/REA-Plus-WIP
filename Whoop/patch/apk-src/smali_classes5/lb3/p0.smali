.class public Llb3/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lob3/o;

.field public final d:Lmb3/e;

.field public final e:Lmb3/f;

.field public f:I

.field public g:Ljava/util/ArrayDeque;

.field public h:Lub3/h;


# direct methods
.method public constructor <init>(ZZLmb3/b;Lmb3/e;Lmb3/f;)V
    .locals 1

    const-string v0, "typeSystemContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypePreparator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llb3/p0;->a:Z

    iput-boolean p2, p0, Llb3/p0;->b:Z

    iput-object p3, p0, Llb3/p0;->c:Lob3/o;

    iput-object p4, p0, Llb3/p0;->d:Lmb3/e;

    iput-object p5, p0, Llb3/p0;->e:Lmb3/f;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Llb3/p0;->g:Ljava/util/ArrayDeque;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    iget-object v0, p0, Llb3/p0;->h:Lub3/h;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lub3/h;->clear()V

    return-void
.end method

.method public b(Lob3/g;Lob3/g;)Z
    .locals 0

    const-string p2, "subType"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Llb3/p0;->g:Ljava/util/ArrayDeque;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Llb3/p0;->g:Ljava/util/ArrayDeque;

    :cond_0
    iget-object v0, p0, Llb3/p0;->h:Lub3/h;

    if-nez v0, :cond_1

    sget v0, Lub3/h;->y:I

    invoke-static {}, Lub3/j;->c()Lub3/h;

    move-result-object v0

    iput-object v0, p0, Llb3/p0;->h:Lub3/h;

    :cond_1
    return-void
.end method

.method public final d(Lob3/g;)Llb3/f1;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/p0;->d:Lmb3/e;

    invoke-virtual {v0, p1}, Lmb3/e;->a(Lob3/g;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lob3/g;)Llb3/y;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/p0;->e:Lmb3/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Llb3/y;

    return-object p1
.end method
