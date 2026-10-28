.class public final Lrw/m;
.super Lrw/l;
.source "SourceFile"


# instance fields
.field public final b:Lqw/o;


# direct methods
.method public constructor <init>(Lqw/o;Lrw/n;)V
    .locals 0

    invoke-direct {p0, p2}, Lrw/l;-><init>(Lrw/n;)V

    iput-object p1, p0, Lrw/m;->b:Lqw/o;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrw/m;->b:Lqw/o;

    invoke-interface {v0}, Lqw/o;->construct()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final f(Ljava/lang/Object;Lww/a;Lrw/k;)V
    .locals 2

    iget-object v0, p3, Lrw/k;->b:Ljava/lang/reflect/Field;

    iget-object v1, p3, Lrw/k;->f:Low/z;

    invoke-virtual {v1, p2}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_1

    iget-boolean v1, p3, Lrw/k;->g:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-boolean p3, p3, Lrw/k;->h:Z

    if-nez p3, :cond_2

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_2
    const/4 p1, 0x0

    invoke-static {v0, p1}, Ltw/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    const-string p3, "Cannot set value of \'static final\' "

    invoke-static {p3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
