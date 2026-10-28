.class public final Lrw/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/reflect/Field;

.field public final c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/reflect/Method;

.field public final synthetic e:Low/z;

.field public final synthetic f:Low/z;

.field public final synthetic g:Z

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Low/z;Low/z;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lrw/k;->d:Ljava/lang/reflect/Method;

    iput-object p4, p0, Lrw/k;->e:Low/z;

    iput-object p5, p0, Lrw/k;->f:Low/z;

    iput-boolean p6, p0, Lrw/k;->g:Z

    iput-boolean p7, p0, Lrw/k;->h:Z

    iput-object p1, p0, Lrw/k;->a:Ljava/lang/String;

    iput-object p2, p0, Lrw/k;->b:Ljava/lang/reflect/Field;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lrw/k;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lww/b;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lrw/k;->d:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    invoke-static {v0, p2}, Ltw/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    const-string v1, "Accessor "

    const-string v2, " threw exception"

    invoke-static {v1, p2, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lrw/k;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    if-ne v0, p2, :cond_1

    return-void

    :cond_1
    iget-object p2, p0, Lrw/k;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lww/b;->i(Ljava/lang/String;)V

    iget-object p2, p0, Lrw/k;->e:Low/z;

    invoke-virtual {p2, p1, v0}, Low/z;->c(Lww/b;Ljava/lang/Object;)V

    return-void
.end method
