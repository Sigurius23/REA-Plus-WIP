.class public final Ly33/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La0/a1;

.field public final c:Lud3/l0;

.field public final d:Lp33/o;

.field public final e:Lh53/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le53/d;Lb30/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/x;Ll53/m;La0/a1;)V
    .locals 10

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sfuAnalytics"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "apiKey"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "apiUrl"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "wssUrl"

    move-object/from16 v3, p6

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "lifecycle"

    move-object/from16 v6, p7

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Ly33/e;->a:Ljava/lang/String;

    move-object/from16 v0, p9

    iput-object v0, p0, Ly33/e;->b:La0/a1;

    new-instance v0, Ly33/a;

    invoke-direct {v0, p4, p2}, Ly33/a;-><init>(Ljava/lang/String;Le53/d;)V

    new-instance v2, Lud3/k0;

    invoke-direct {v2}, Lud3/k0;-><init>()V

    invoke-virtual {v2, v0}, Lud3/k0;->a(Lud3/g0;)V

    new-instance v0, Lme3/c;

    sget-object v4, Lme3/b;->m:Lg73/a;

    invoke-direct {v0, v4}, Lme3/c;-><init>(Lme3/b;)V

    sget-object v4, Lb23/g;->x:Lb23/g;

    sget-object v4, Lb43/a;->x:Lb43/a;

    sget-object v5, Lorg/webrtc/Logging$Severity;->LS_NONE:Lorg/webrtc/Logging$Severity;

    const-string v7, "httpLoggingLevel"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "webRtcLoggingLevel"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v4, Lb43/a;->w:Lme3/a;

    iput-object v4, v0, Lme3/c;->z:Lme3/a;

    invoke-virtual {v2, v0}, Lud3/k0;->a(Lud3/g0;)V

    const/4 v0, 0x1

    iput-boolean v0, v2, Lud3/k0;->f:Z

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2710

    invoke-virtual {v2, v4, v5, v0}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v2, v4, v5, v0}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v2, v4, v5, v0}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    const-string v7, "timeout"

    invoke-static {v7, v4, v5, v0}, Lwd3/h;->b(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result v0

    iput v0, v2, Lud3/k0;->x:I

    new-instance v3, Lud3/l0;

    invoke-direct {v3, v2}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object v3, p0, Ly33/e;->c:Lud3/l0;

    new-instance v0, Lm5/k;

    const/16 v2, 0x13

    invoke-direct {v0, p0, v2}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    new-instance v2, Lp33/o;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v4, "getValue(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lpg3/y0;

    const-class v4, Lio/getstream/video/android/core/api/SignalServerService;

    invoke-virtual {v0, v4}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/video/android/core/api/SignalServerService;

    new-instance v4, Ll53/j;

    move-object/from16 v5, p8

    invoke-direct {v4, v5, v0}, Ll53/j;-><init>(Ll53/m;Lio/getstream/video/android/core/api/SignalServerService;)V

    new-instance v0, Lj43/a;

    const/16 v5, 0x17

    invoke-direct {v0, p0, v5}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v2, v4, v0}, Lp33/o;-><init>(Ll53/j;Lj43/a;)V

    iput-object v2, p0, Ly33/e;->d:Lp33/o;

    new-instance v0, Lm5/k;

    invoke-direct {v0, p0, p1}, Lm5/k;-><init>(Ly33/e;Landroid/content/Context;)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    invoke-static {}, Lc53/c;->a()Lc53/a;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v4}, Lup/d;->h(Lc53/a;Lq83/j;I)Lc53/a;

    move-result-object v5

    new-instance v7, Ldb/j0;

    iget-object v0, p2, Le53/d;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-direct {v7, v0, v4}, Ldb/j0;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lz33/b;

    new-instance v0, Lh53/f;

    move-object v8, p2

    move-object v9, p3

    move-object v1, p4

    move-object/from16 v2, p6

    invoke-direct/range {v0 .. v9}, Lh53/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lud3/l0;Lz33/b;Lc53/a;Landroidx/lifecycle/x;Ldb/j0;Le53/d;Lb30/m;)V

    iput-object v0, p0, Ly33/e;->e:Lh53/f;

    return-void
.end method
