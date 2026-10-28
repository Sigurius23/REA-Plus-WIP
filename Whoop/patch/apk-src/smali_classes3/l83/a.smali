.class public abstract Ll83/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr83/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    sput-object v0, Ll83/a;->a:Lr83/a;

    return-void
.end method

.method public static final a(Lhm/d;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Ll83/b;

    iget-object p0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast p0, Lbd3/a0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Ll83/b;->w:Lbd3/a0;

    iput-object v0, v0, Ll83/b;->x:Lq83/d;

    sget-object p0, Ll83/a;->a:Lr83/a;

    iput-object p0, v0, Ll83/b;->y:Ljava/lang/Object;

    :cond_0
    :goto_0
    iget-object v1, v0, Ll83/b;->y:Ljava/lang/Object;

    iget-object v2, v0, Ll83/b;->x:Lq83/d;

    if-nez v2, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :try_start_0
    iget-object v1, v0, Ll83/b;->w:Lbd3/a0;

    const/4 v3, 0x3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    new-instance v3, Lbd3/a0;

    iget-object v1, v1, Lbd3/a0;->z:Lbd3/c0;

    invoke-direct {v3, v1, v2}, Lbd3/a0;-><init>(Lbd3/c0;Lq83/d;)V

    iput-object v0, v3, Lbd3/a0;->y:Ll83/b;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v3, v1}, Lbd3/a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v3, Lr83/a;->w:Lr83/a;

    if-eq v1, v3, :cond_0

    invoke-interface {v2, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    invoke-interface {v2, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iput-object p0, v0, Ll83/b;->y:Ljava/lang/Object;

    invoke-interface {v2, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0
.end method
