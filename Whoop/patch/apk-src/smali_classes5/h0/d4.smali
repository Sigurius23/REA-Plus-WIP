.class public final Lh0/d4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ld0/n;


# instance fields
.field public final a:Ld0/g2;

.field public b:J

.field public c:Ld0/n;

.field public d:Z

.field public e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld0/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld0/n;-><init>(F)V

    sput-object v0, Lh0/d4;->f:Ld0/n;

    return-void
.end method

.method public constructor <init>(Ld0/i1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ld0/f;->i:Ld0/f2;

    invoke-virtual {p1, v0}, Ld0/i1;->a(Ld0/f2;)Ld0/g2;

    move-result-object p1

    iput-object p1, p0, Lh0/d4;->a:Ld0/g2;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lh0/d4;->b:J

    sget-object p1, Lh0/d4;->f:Ld0/n;

    iput-object p1, p0, Lh0/d4;->c:Ld0/n;

    return-void
.end method


# virtual methods
.method public final a(Lep1/g;Ld30/r;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Lh0/c4;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh0/c4;

    iget v1, v0, Lh0/c4;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/c4;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/c4;

    invoke-direct {v0, p0, p3}, Lh0/c4;-><init>(Lh0/d4;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lh0/c4;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/c4;->F:I

    sget-object v3, Lh0/d4;->f:Ld0/n;

    const-wide/high16 v4, -0x8000000000000000L

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v9, :cond_2

    if-ne v2, v7, :cond_1

    iget-object p1, v0, Lh0/c4;->w:Ll83/e;

    check-cast p1, Lc93/a;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lh0/c4;->y:F

    iget-object p2, v0, Lh0/c4;->x:Lc93/a;

    iget-object v2, v0, Lh0/c4;->w:Ll83/e;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    :try_start_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p3, p2

    move-object p2, v2

    goto :goto_3

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p3, p0, Lh0/d4;->d:Z

    if-eqz p3, :cond_4

    const-string p3, "animateToZero called while previous animation is running"

    invoke-static {p3}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_4
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p3

    sget-object v2, Lb2/e;->P:Lb2/e;

    invoke-interface {p3, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p3

    check-cast p3, Lb2/w;

    if-eqz p3, :cond_5

    invoke-interface {p3}, Lb2/w;->h()F

    move-result p3

    goto :goto_1

    :cond_5
    const/high16 p3, 0x3f800000    # 1.0f

    :goto_1
    iput-boolean v9, p0, Lh0/d4;->d:Z

    move-object v11, p2

    move-object p2, p1

    move p1, p3

    move-object p3, v11

    :cond_6
    :try_start_2
    iget v2, p0, Lh0/d4;->e:F

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v10, 0x3c23d70a    # 0.01f

    cmpg-float v2, v2, v10

    if-gez v2, :cond_7

    :goto_2
    move-object p1, p3

    goto :goto_4

    :cond_7
    new-instance v2, Lh0/b4;

    const/4 v10, 0x0

    invoke-direct {v2, p0, p1, p2, v10}, Lh0/b4;-><init>(Ljava/lang/Object;FLjava/lang/Object;I)V

    iput-object p2, v0, Lh0/c4;->w:Ll83/e;

    iput-object p3, v0, Lh0/c4;->x:Lc93/a;

    iput p1, v0, Lh0/c4;->y:F

    iput v9, v0, Lh0/c4;->F:I

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v10

    invoke-static {v10}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v10

    invoke-interface {v10, v2, v0}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_5

    :cond_8
    :goto_3
    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    cmpg-float v2, p1, v6

    if-nez v2, :cond_6

    goto :goto_2

    :goto_4
    iget p3, p0, Lh0/d4;->e:F

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpg-float p3, p3, v6

    if-nez p3, :cond_9

    goto :goto_7

    :cond_9
    new-instance p3, Lfd3/a;

    const/16 v2, 0x1d

    invoke-direct {p3, v2, p0, p2}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, v0, Lh0/c4;->w:Ll83/e;

    const/4 p2, 0x0

    iput-object p2, v0, Lh0/c4;->x:Lc93/a;

    iput v7, v0, Lh0/c4;->F:I

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object p2

    invoke-interface {p2, p3, v0}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a

    :goto_5
    return-object v1

    :cond_a
    :goto_6
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_7
    iput-wide v4, p0, Lh0/d4;->b:J

    iput-object v3, p0, Lh0/d4;->c:Ld0/n;

    iput-boolean v8, p0, Lh0/d4;->d:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_8
    iput-wide v4, p0, Lh0/d4;->b:J

    iput-object v3, p0, Lh0/d4;->c:Ld0/n;

    iput-boolean v8, p0, Lh0/d4;->d:Z

    throw p1
.end method
