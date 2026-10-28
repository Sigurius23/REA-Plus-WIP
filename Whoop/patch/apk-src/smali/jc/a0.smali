.class public final synthetic Ljc/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lic/v;

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljc/i0;


# direct methods
.method public synthetic constructor <init>(Lic/v;ZLjava/lang/String;Ljc/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljc/a0;->w:Lic/v;

    iput-boolean p2, p0, Ljc/a0;->x:Z

    iput-object p3, p0, Ljc/a0;->y:Ljava/lang/String;

    iput-object p4, p0, Ljc/a0;->z:Ljc/i0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Throwable;

    instance-of v0, p1, Landroidx/work/impl/WorkerStoppedException;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/work/impl/WorkerStoppedException;

    iget p1, p1, Landroidx/work/impl/WorkerStoppedException;->w:I

    iget-object v0, p0, Ljc/a0;->w:Lic/v;

    invoke-virtual {v0, p1}, Lic/v;->stop(I)V

    :cond_0
    iget-boolean p1, p0, Ljc/a0;->x:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ljc/a0;->y:Ljava/lang/String;

    if-eqz p1, :cond_3

    iget-object v0, p0, Ljc/a0;->z:Ljc/i0;

    iget-object v1, v0, Ljc/i0;->f:Lic/b;

    iget-object v1, v1, Lic/b;->m:Lic/y;

    iget-object v0, v0, Ljc/i0;->a:Lqc/q;

    invoke-virtual {v0}, Lqc/q;->hashCode()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_1

    invoke-static {p1}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lac/a;->b(ILjava/lang/String;)V

    goto :goto_2

    :cond_1
    invoke-static {p1}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "asyncTraceEnd"

    :try_start_0
    sget-object v2, Lpf/c;->d:Ljava/lang/reflect/Method;

    if-nez v2, :cond_2

    const-class v2, Landroid/os/Trace;

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v4, v5}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Lpf/c;->d:Ljava/lang/reflect/Method;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v2, Lpf/c;->d:Ljava/lang/reflect/Method;

    sget-wide v3, Lpf/c;->a:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v3, p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {v2, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-static {p1, v1}, Lpf/c;->D(Ljava/lang/Exception;Ljava/lang/String;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
