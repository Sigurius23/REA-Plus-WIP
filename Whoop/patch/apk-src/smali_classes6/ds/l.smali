.class public final Lds/l;
.super Lbi/g;
.source "SourceFile"


# static fields
.field public static final b:Lsun/misc/Unsafe;

.field public static final c:J

.field public static final d:J

.field public static final e:J

.field public static final f:J

.field public static final g:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-class v0, Lds/m;

    :try_start_0
    invoke-static {}, Lsun/misc/Unsafe;->getUnsafe()Lsun/misc/Unsafe;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :try_start_1
    new-instance v1, Lds/k;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsun/misc/Unsafe;
    :try_end_1
    .catch Ljava/security/PrivilegedActionException; {:try_start_1 .. :try_end_1} :catch_2

    :goto_0
    :try_start_2
    const-class v2, Lds/n;

    const-string v3, "y"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Lds/l;->d:J

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Lds/l;->c:J

    const-string v3, "w"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Lds/l;->e:J

    const-string v2, "a"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Lds/l;->f:J

    const-string v2, "b"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Lds/l;->g:J

    sput-object v1, Lds/l;->b:Lsun/misc/Unsafe;
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Could not initialize intrinsics"

    invoke-virtual {v0}, Ljava/security/PrivilegedActionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final A(Lds/n;)Lds/c;
    .locals 3

    sget-object v0, Lds/c;->d:Lds/c;

    :cond_0
    iget-object v1, p1, Lds/n;->x:Lds/c;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v1, v0}, Lds/l;->j(Lds/n;Lds/c;Lds/c;)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-object v1
.end method

.method public final B(Lds/n;)Lds/m;
    .locals 3

    sget-object v0, Lds/m;->c:Lds/m;

    :cond_0
    iget-object v1, p1, Lds/n;->y:Lds/m;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v1, v0}, Lds/l;->l(Lds/n;Lds/m;Lds/m;)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-object v1
.end method

.method public final Q(Lds/m;Lds/m;)V
    .locals 3

    sget-object v0, Lds/l;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lds/l;->g:J

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final R(Lds/m;Ljava/lang/Thread;)V
    .locals 3

    sget-object v0, Lds/l;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lds/l;->f:J

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final j(Lds/n;Lds/c;Lds/c;)Z
    .locals 6

    sget-object v0, Lds/l;->b:Lsun/misc/Unsafe;

    sget-wide v2, Lds/l;->c:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lds/i;->a(Lsun/misc/Unsafe;Lds/n;JLds/c;Lds/c;)Z

    move-result p1

    return p1
.end method

.method public final k(Lds/n;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6

    sget-object v0, Lds/l;->b:Lsun/misc/Unsafe;

    sget-wide v2, Lds/l;->e:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lds/j;->a(Lsun/misc/Unsafe;Lds/n;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final l(Lds/n;Lds/m;Lds/m;)Z
    .locals 6

    sget-object v0, Lds/l;->b:Lsun/misc/Unsafe;

    sget-wide v2, Lds/l;->d:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lds/h;->a(Lsun/misc/Unsafe;Lds/n;JLds/m;Lds/m;)Z

    move-result p1

    return p1
.end method
