.class public final Ly33/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le53/d;

.field public final b:Lbc3/c0;

.field public final c:Ljava/lang/String;

.field public final d:Landroidx/lifecycle/x;

.field public final e:Ly33/a;

.field public final f:Ll83/p;

.field public final g:Lud3/l0;

.field public final h:Ll83/p;

.field public final i:Ll83/p;

.field public final j:Lf53/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le53/c;Ld33/c;Le53/d;Lbc3/c0;Ljava/lang/String;Ljava/lang/String;JLb43/b;Ljava/lang/String;Landroidx/lifecycle/x;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v11, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-wide/from16 v4, p8

    move-object/from16 v6, p10

    move-object/from16 v7, p11

    move-object/from16 v9, p12

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v8}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    const-string v10, "synchronizedList(...)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "context"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "tokenProvider"

    move-object/from16 v10, p2

    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "tokenRepository"

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "scope"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "apiUrl"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "wssUrl"

    move-object/from16 v12, p7

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "loggingLevel"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "apiKey"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "lifecycle"

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v11, v0, Ly33/c;->a:Le53/d;

    iput-object v2, v0, Ly33/c;->b:Lbc3/c0;

    iput-object v3, v0, Ly33/c;->c:Ljava/lang/String;

    iput-object v9, v0, Ly33/c;->d:Landroidx/lifecycle/x;

    new-instance v3, Ly33/a;

    invoke-direct {v3, v7, v11}, Ly33/a;-><init>(Ljava/lang/String;Le53/d;)V

    iput-object v3, v0, Ly33/c;->e:Ly33/a;

    new-instance v8, Ly33/b;

    const/4 v13, 0x1

    invoke-direct {v8, v0, v13}, Ly33/b;-><init>(Ly33/c;I)V

    invoke-static {v8}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v8

    iput-object v8, v0, Ly33/c;->f:Ll83/p;

    new-instance v8, Lud3/k0;

    invoke-direct {v8}, Lud3/k0;-><init>()V

    new-instance v14, Ly33/d;

    new-instance v15, Lx33/a;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v8, v14}, Lud3/k0;->a(Lud3/g0;)V

    invoke-virtual {v8, v3}, Lud3/k0;->a(Lud3/g0;)V

    new-instance v3, Lme3/c;

    new-instance v14, Lux/f0;

    invoke-direct {v14, v0}, Lux/f0;-><init>(Ly33/c;)V

    invoke-direct {v3, v14}, Lme3/c;-><init>(Lme3/b;)V

    iget-object v6, v6, Lb43/b;->b:Lb43/a;

    iget-object v6, v6, Lb43/a;->w:Lme3/a;

    iput-object v6, v3, Lme3/c;->z:Lme3/a;

    invoke-virtual {v8, v3}, Lud3/k0;->a(Lud3/g0;)V

    iput-boolean v13, v8, Lud3/k0;->f:Z

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v8, v4, v5, v3}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v8, v4, v5, v3}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v8, v4, v5, v3}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    const-string v6, "timeout"

    invoke-static {v6, v4, v5, v3}, Lwd3/h;->b(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result v3

    iput v3, v8, Lud3/k0;->x:I

    new-instance v6, Lud3/l0;

    invoke-direct {v6, v8}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object v6, v0, Ly33/c;->g:Lud3/l0;

    new-instance v3, Lr5/c;

    const/16 v4, 0xa

    invoke-direct {v3, v4, v0, v1}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, v0, Ly33/c;->h:Ll83/p;

    new-instance v3, Ly33/b;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Ly33/b;-><init>(Ly33/c;I)V

    invoke-static {v3}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v3

    iput-object v3, v0, Ly33/c;->i:Ll83/p;

    move-object v3, v1

    new-instance v1, Lf53/k;

    iget-object v4, v11, Le53/d;->a:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz33/b;

    invoke-interface {v2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v2

    sget-object v4, Lbc3/q0;->a:Lkc3/e;

    sget-object v4, Lkc3/d;->w:Lkc3/d;

    const/4 v8, 0x2

    const/4 v14, 0x0

    invoke-static {v4, v13, v14, v8, v14}, Lbc3/z;->limitedParallelism$default(Lbc3/z;ILjava/lang/String;ILjava/lang/Object;)Lbc3/z;

    move-result-object v4

    invoke-interface {v2, v4}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    invoke-static {v14, v2, v13}, Lup/d;->h(Lc53/a;Lq83/j;I)Lc53/a;

    move-result-object v8

    move-object/from16 v4, p3

    move-object v2, v7

    move-object v7, v3

    move-object v3, v12

    invoke-direct/range {v1 .. v11}, Lf53/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ld33/c;Ljava/lang/String;Lud3/l0;Lz33/b;Lc53/a;Landroidx/lifecycle/x;Le53/c;Le53/d;)V

    iput-object v1, v0, Ly33/c;->j:Lf53/k;

    return-void
.end method


# virtual methods
.method public final a()Lio/getstream/android/video/generated/apis/ProductvideoApi;
    .locals 2

    iget-object v0, p0, Ly33/c;->i:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/getstream/android/video/generated/apis/ProductvideoApi;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly33/c;->a:Le53/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Le53/d;->a:Ljava/lang/Object;

    return-void
.end method
