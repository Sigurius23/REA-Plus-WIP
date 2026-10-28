.class public final Lnb3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lnb3/l;

.field public static final b:Lnb3/e;

.field public static final c:Lnb3/a;

.field public static final d:Lnb3/i;

.field public static final e:Lnb3/i;

.field public static final f:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnb3/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lnb3/l;->a:Lnb3/l;

    sget-object v0, Lnb3/e;->w:Lnb3/e;

    sput-object v0, Lnb3/l;->b:Lnb3/e;

    new-instance v0, Lnb3/a;

    sget-object v1, Lnb3/b;->w:[Lnb3/b;

    const-string v1, "unknown class"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "<Error class: %s>"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lva3/h;->g(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    invoke-direct {v0, v1}, Lnb3/a;-><init>(Lva3/h;)V

    sput-object v0, Lnb3/l;->c:Lnb3/a;

    sget-object v0, Lnb3/k;->H:Lnb3/k;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-static {v0, v2}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v0

    sput-object v0, Lnb3/l;->d:Lnb3/i;

    sget-object v0, Lnb3/k;->U:Lnb3/k;

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v0

    sput-object v0, Lnb3/l;->e:Lnb3/i;

    new-instance v0, Lnb3/f;

    invoke-direct {v0}, Lnb3/f;-><init>()V

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lnb3/l;->f:Ljava/util/Set;

    return-void
.end method

.method public static final varargs a(Lnb3/h;Z[Ljava/lang/String;)Lnb3/g;
    .locals 1

    const-string v0, "formatParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    new-instance p1, Lnb3/m;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {p1, p0, p2}, Lnb3/m;-><init>(Lnb3/h;[Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance p1, Lnb3/g;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {p1, p0, p2}, Lnb3/g;-><init>(Lnb3/h;[Ljava/lang/String;)V

    return-object p1
.end method

.method public static final varargs b(Lnb3/h;[Ljava/lang/String;)Lnb3/g;
    .locals 1

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lnb3/l;->a(Lnb3/h;Z[Ljava/lang/String;)Lnb3/g;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;
    .locals 2

    const-string v0, "kind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const-string v0, "formatParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {p0, v0}, Lnb3/l;->d(Lnb3/k;[Ljava/lang/String;)Lnb3/j;

    move-result-object v0

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-static {p0, v1, v0, p1}, Lnb3/l;->e(Lnb3/k;Ljava/util/List;Llb3/q0;[Ljava/lang/String;)Lnb3/i;

    move-result-object p0

    return-object p0
.end method

.method public static varargs d(Lnb3/k;[Ljava/lang/String;)Lnb3/j;
    .locals 2

    const-string v0, "kind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnb3/j;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-direct {v0, p0, p1}, Lnb3/j;-><init>(Lnb3/k;[Ljava/lang/String;)V

    return-object v0
.end method

.method public static varargs e(Lnb3/k;Ljava/util/List;Llb3/q0;[Ljava/lang/String;)Lnb3/i;
    .locals 8

    const-string v0, "kind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lnb3/i;

    sget-object v0, Lnb3/h;->E:Lnb3/h;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lnb3/l;->b(Lnb3/h;[Ljava/lang/String;)Lnb3/g;

    move-result-object v3

    array-length v0, p3

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    check-cast v7, [Ljava/lang/String;

    const/4 v6, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v2, p2

    invoke-direct/range {v1 .. v7}, Lnb3/i;-><init>(Llb3/q0;Lnb3/g;Lnb3/k;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v1
.end method

.method public static final f(Lr93/k;)Z
    .locals 1

    if-eqz p0, :cond_1

    instance-of v0, p0, Lnb3/a;

    if-nez v0, :cond_0

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v0, v0, Lnb3/a;

    if-nez v0, :cond_0

    sget-object v0, Lnb3/l;->b:Lnb3/e;

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
