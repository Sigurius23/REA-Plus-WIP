.class public abstract Loh3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Loh3/d;->a:Ljava/lang/ThreadLocal;

    return-void
.end method


# virtual methods
.method public varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, Loh3/d;->l(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, Loh3/d;->l(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, p1, v0}, Loh3/d;->l(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "args"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p3

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    const/4 v0, 0x6

    invoke-virtual {p0, v0, p2, p1, p3}, Loh3/d;->l(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic f()Ljava/lang/ThreadLocal;
    .locals 1

    iget-object v0, p0, Loh3/d;->a:Ljava/lang/ThreadLocal;

    return-object v0
.end method

.method public synthetic g()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Loh3/d;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Loh3/d;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_0
    return-object v0
.end method

.method public varargs h(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, Loh3/d;->l(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public i(I)Z
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method public j(Ljava/lang/String;I)Z
    .locals 0

    invoke-virtual {p0, p2}, Loh3/d;->i(I)Z

    move-result p1

    return p1
.end method

.method public abstract k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public final varargs l(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    .locals 5

    invoke-virtual {p0}, Loh3/d;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Loh3/d;->j(Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const-string v1, "sw.toString()"

    const/4 v2, 0x0

    const/16 v3, 0x100

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    array-length v4, p4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p2, p4}, Loh3/d;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    if-eqz p3, :cond_5

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0xa

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance p2, Ljava/io/StringWriter;

    invoke-direct {p2, v3}, Ljava/io/StringWriter;-><init>(I)V

    new-instance v3, Ljava/io/PrintWriter;

    invoke-direct {v3, p2, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    invoke-virtual {p3, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {v3}, Ljava/io/PrintWriter;->flush()V

    invoke-virtual {p2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_3
    :goto_1
    if-nez p3, :cond_4

    :goto_2
    return-void

    :cond_4
    new-instance p2, Ljava/io/StringWriter;

    invoke-direct {p2, v3}, Ljava/io/StringWriter;-><init>(I)V

    new-instance p4, Ljava/io/PrintWriter;

    invoke-direct {p4, p2, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V

    invoke-virtual {p3, p4}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {p4}, Ljava/io/PrintWriter;->flush()V

    invoke-virtual {p2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    :goto_3
    invoke-virtual {p0, p1, v0, p2, p3}, Loh3/d;->k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public varargs m(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, Loh3/d;->l(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs n(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, Loh3/d;->l(ILjava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-void
.end method
