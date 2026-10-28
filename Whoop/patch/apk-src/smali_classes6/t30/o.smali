.class public final Lt30/o;
.super Landroidx/fragment/app/w0;
.source "SourceFile"


# instance fields
.field public final b:Lm30/h;

.field public final c:Lq30/g0;

.field public final d:Lq30/v0;

.field public final e:Ln30/d;

.field public final f:Lq30/k;

.field public final g:Lr30/j;

.field public final h:Lq30/n0;


# direct methods
.method public constructor <init>(Lm30/h;Lq30/g0;Lq30/v0;Ln30/d;Lq30/k;Lr30/j;Lq30/n0;)V
    .locals 1

    const-string v0, "uiCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionTimer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorRequestExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeActionHandler"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentData"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt30/o;->b:Lm30/h;

    iput-object p2, p0, Lt30/o;->c:Lq30/g0;

    iput-object p3, p0, Lt30/o;->d:Lq30/v0;

    iput-object p4, p0, Lt30/o;->e:Ln30/d;

    iput-object p5, p0, Lt30/o;->f:Lq30/k;

    iput-object p6, p0, Lt30/o;->g:Lr30/j;

    iput-object p7, p0, Lt30/o;->h:Lq30/n0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/m0;
    .locals 9

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "className"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lt30/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lt30/n;

    iget-object v7, p0, Lt30/o;->g:Lr30/j;

    iget-object v8, p0, Lt30/o;->h:Lq30/n0;

    iget-object v2, p0, Lt30/o;->b:Lm30/h;

    iget-object v3, p0, Lt30/o;->c:Lq30/g0;

    iget-object v4, p0, Lt30/o;->d:Lq30/v0;

    iget-object v5, p0, Lt30/o;->e:Ln30/d;

    iget-object v6, p0, Lt30/o;->f:Lq30/k;

    invoke-direct/range {v1 .. v8}, Lt30/n;-><init>(Lm30/h;Lq30/g0;Lq30/v0;Ln30/d;Lq30/k;Lr30/j;Lq30/n0;)V

    return-object v1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/w0;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method
