.class public abstract Lga3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lva3/h;

.field public static final b:Lva3/h;

.field public static final c:Lva3/h;

.field public static final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "message"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Lga3/c;->a:Lva3/h;

    const-string v0, "allowedTargets"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Lga3/c;->b:Lva3/h;

    const-string v0, "value"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Lga3/c;->c:Lva3/h;

    sget-object v0, Lo93/m;->t:Lva3/e;

    sget-object v1, Lfa3/x;->c:Lva3/e;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/m;->w:Lva3/e;

    sget-object v1, Lfa3/x;->d:Lva3/e;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/m;->x:Lva3/e;

    sget-object v1, Lfa3/x;->f:Lva3/e;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lga3/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lva3/e;Lma3/b;Lzt/q;)Lha3/g;
    .locals 2

    const-string v0, "kotlinName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo93/m;->m:Lva3/e;

    invoke-virtual {p0, v0}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lfa3/x;->e:Lva3/e;

    const-string v1, "DEPRECATED_ANNOTATION"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lma3/b;->a(Lva3/e;)Lx93/d;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lga3/g;

    invoke-direct {p0, v0, p2}, Lga3/g;-><init>(Lx93/d;Lzt/q;)V

    return-object p0

    :cond_1
    :goto_0
    sget-object v0, Lga3/c;->d:Ljava/lang/Object;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/e;

    if-eqz p0, :cond_2

    invoke-interface {p1, p0}, Lma3/b;->a(Lva3/e;)Lx93/d;

    move-result-object p0

    if-eqz p0, :cond_2

    const/4 p1, 0x0

    invoke-static {p0, p2, p1}, Lga3/c;->b(Lx93/d;Lzt/q;Z)Lha3/g;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Lx93/d;Lzt/q;Z)Lha3/g;
    .locals 3

    const-string v0, "annotation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx93/d;->a:Ljava/lang/annotation/Annotation;

    invoke-static {v0}, Ljc/x;->K(Ljava/lang/annotation/Annotation;)Lj93/d;

    move-result-object v0

    invoke-static {v0}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v0

    sget-object v1, Lfa3/x;->c:Lva3/e;

    const-string v2, "TARGET_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lva3/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p2, Lga3/j;

    invoke-direct {p2, p0, p1}, Lga3/j;-><init>(Lx93/d;Lzt/q;)V

    return-object p2

    :cond_0
    sget-object v1, Lfa3/x;->d:Lva3/e;

    const-string v2, "RETENTION_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lva3/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p2, Lga3/i;

    invoke-direct {p2, p0, p1}, Lga3/i;-><init>(Lx93/d;Lzt/q;)V

    return-object p2

    :cond_1
    sget-object v1, Lfa3/x;->f:Lva3/e;

    const-string v2, "DOCUMENTED_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lva3/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p2, Lga3/b;

    sget-object v0, Lo93/m;->x:Lva3/e;

    invoke-direct {p2, p1, p0, v0}, Lga3/b;-><init>(Lzt/q;Lx93/d;Lva3/e;)V

    return-object p2

    :cond_2
    sget-object v1, Lfa3/x;->e:Lva3/e;

    const-string v2, "DEPRECATED_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lva3/b;->k(Lva3/e;)Lva3/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lva3/c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p0, 0x0

    return-object p0

    :cond_3
    new-instance v0, Lja3/f;

    invoke-direct {v0, p0, p1, p2}, Lja3/f;-><init>(Lx93/d;Lzt/q;Z)V

    return-object v0
.end method
