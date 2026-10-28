.class public final Lja3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lha3/g;


# static fields
.field public static final synthetic h:[Lj93/z;


# instance fields
.field public final a:Lzt/q;

.field public final b:Lx93/d;

.field public final c:Lkb3/h;

.field public final d:Lkb3/i;

.field public final e:Lw93/f;

.field public final f:Lkb3/i;

.field public final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lja3/f;

    const-string v2, "fqName"

    const-string v3, "getFqName()Lorg/jetbrains/kotlin/name/FqName;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "type"

    const-string v5, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v3

    const-string v5, "allValueArguments"

    const-string v6, "getAllValueArguments()Ljava/util/Map;"

    invoke-static {v1, v5, v6, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lja3/f;->h:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lx93/d;Lzt/q;Z)V
    .locals 4

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaAnnotation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lja3/f;->a:Lzt/q;

    iput-object p1, p0, Lja3/f;->b:Lx93/d;

    iget-object p2, p2, Lzt/q;->x:Ljava/lang/Object;

    check-cast p2, Lia3/a;

    iget-object v0, p2, Lia3/a;->a:Lkb3/n;

    new-instance v1, Lja3/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lja3/e;-><init>(Lja3/f;I)V

    move-object v2, v0

    check-cast v2, Lkb3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lkb3/h;

    invoke-direct {v3, v2, v1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v3, p0, Lja3/f;->c:Lkb3/h;

    new-instance v1, Lja3/e;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lja3/e;-><init>(Lja3/f;I)V

    move-object v2, v0

    check-cast v2, Lkb3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lkb3/i;

    invoke-direct {v3, v2, v1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v3, p0, Lja3/f;->d:Lkb3/i;

    iget-object p2, p2, Lia3/a;->j:Lw93/d;

    invoke-virtual {p2, p1}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object p1

    iput-object p1, p0, Lja3/f;->e:Lw93/f;

    new-instance p1, Lja3/e;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lja3/e;-><init>(Lja3/f;I)V

    check-cast v0, Lkb3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lkb3/i;

    invoke-direct {p2, v0, p1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p2, p0, Lja3/f;->f:Lkb3/i;

    iput-boolean p3, p0, Lja3/f;->g:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 2

    sget-object v0, Lja3/f;->h:[Lj93/z;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lja3/f;->f:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final b()Lva3/e;
    .locals 3

    sget-object v0, Lja3/f;->h:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v1, "<this>"

    iget-object v2, p0, Lja3/f;->c:Lkb3/h;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "p"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lkb3/h;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lva3/e;

    return-object v0
.end method

.method public final c(Lma3/a;)Lab3/g;
    .locals 6

    instance-of v0, p1, Lx93/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lx93/u;

    iget-object p1, p1, Lx93/u;->b:Ljava/lang/Object;

    invoke-static {p1, v1}, Lab3/h;->c(Ljava/lang/Object;Lu93/e0;)Lab3/g;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lx93/s;

    if-eqz v0, :cond_2

    check-cast p1, Lx93/s;

    iget-object p1, p1, Lx93/s;->b:Ljava/lang/Enum;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p1

    new-instance v1, Lab3/i;

    invoke-direct {v1, v0, p1}, Lab3/i;-><init>(Lva3/c;Lva3/h;)V

    return-object v1

    :cond_2
    instance-of v0, p1, Lx93/g;

    const/4 v2, 0x0

    iget-object v3, p0, Lja3/f;->a:Lzt/q;

    if-eqz v0, :cond_9

    check-cast p1, Lx93/g;

    move-object v0, p1

    check-cast v0, Lx93/e;

    iget-object v0, v0, Lx93/e;->a:Lva3/h;

    if-nez v0, :cond_3

    sget-object v0, Lfa3/x;->b:Lva3/h;

    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lx93/g;->a()Ljava/util/ArrayList;

    move-result-object p1

    sget-object v4, Lja3/f;->h:[Lj93/z;

    const/4 v5, 0x1

    aget-object v4, v4, v5

    iget-object v5, p0, Lja3/f;->d:Lkb3/i;

    invoke-static {v5, v4}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/c0;

    invoke-static {v4}, Llb3/o;->e(Llb3/y;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    invoke-static {p0}, Lcb3/e;->d(Ls93/b;)Lr93/e;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0, v4}, Lbi/g;->C(Lva3/h;Lr93/e;)Lr93/a1;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Lu93/x0;

    invoke-virtual {v0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v0

    if-nez v0, :cond_6

    :cond_5
    iget-object v0, v3, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->o:Lr93/b0;

    invoke-interface {v0}, Lr93/b0;->c()Lo93/h;

    move-result-object v0

    sget-object v3, Llb3/g1;->y:Llb3/g1;

    sget-object v3, Lnb3/k;->d0:Lnb3/k;

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v3, v2}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v2

    invoke-virtual {v0, v2}, Lo93/h;->h(Llb3/y;)Llb3/c0;

    move-result-object v0

    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lma3/a;

    invoke-virtual {p0, v3}, Lja3/f;->c(Lma3/a;)Lab3/g;

    move-result-object v3

    if-nez v3, :cond_7

    new-instance v3, Lab3/v;

    invoke-direct {v3, v1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    :cond_7
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    new-instance p1, Lab3/y;

    invoke-direct {p1, v2, v0}, Lab3/y;-><init>(Ljava/util/List;Llb3/y;)V

    return-object p1

    :cond_9
    instance-of v0, p1, Lx93/f;

    if-eqz v0, :cond_a

    check-cast p1, Lx93/f;

    new-instance v0, Lx93/d;

    iget-object p1, p1, Lx93/f;->b:Ljava/lang/annotation/Annotation;

    invoke-direct {v0, p1}, Lx93/d;-><init>(Ljava/lang/annotation/Annotation;)V

    new-instance p1, Lab3/a;

    new-instance v1, Lja3/f;

    invoke-direct {v1, v0, v3, v2}, Lja3/f;-><init>(Lx93/d;Lzt/q;Z)V

    invoke-direct {p1, v1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_a
    instance-of v0, p1, Lx93/o;

    if-eqz v0, :cond_13

    check-cast p1, Lx93/o;

    iget-object p1, p1, Lx93/o;->b:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Lx93/y;

    invoke-direct {v0, p1}, Lx93/y;-><init>(Ljava/lang/Class;)V

    goto :goto_3

    :cond_b
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_e

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_2

    :cond_c
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_d

    new-instance v0, Lx93/d0;

    check-cast p1, Ljava/lang/reflect/WildcardType;

    invoke-direct {v0, p1}, Lx93/d0;-><init>(Ljava/lang/reflect/WildcardType;)V

    goto :goto_3

    :cond_d
    new-instance v0, Lx93/p;

    invoke-direct {v0, p1}, Lx93/p;-><init>(Ljava/lang/reflect/Type;)V

    goto :goto_3

    :cond_e
    :goto_2
    new-instance v0, Lx93/h;

    invoke-direct {v0, p1}, Lx93/h;-><init>(Ljava/lang/reflect/Type;)V

    :goto_3
    iget-object p1, v3, Lzt/q;->E:Ljava/lang/Object;

    check-cast p1, La3/p;

    sget-object v3, Llb3/b1;->x:Llb3/b1;

    const/4 v4, 0x7

    invoke-static {v3, v2, v1, v4}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object p1

    invoke-static {p1}, Llb3/o;->e(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_5

    :cond_f
    move-object v0, p1

    move v3, v2

    :goto_4
    invoke-static {v0}, Lo93/h;->z(Llb3/y;)Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-virtual {v0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/u0;

    invoke-virtual {v0}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    const-string v4, "getType(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_10
    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v4, v0, Lr93/e;

    if-eqz v4, :cond_12

    invoke-static {v0}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object v0

    if-nez v0, :cond_11

    new-instance v0, Lab3/t;

    new-instance v1, Lab3/q;

    invoke-direct {v1, p1}, Lab3/q;-><init>(Llb3/y;)V

    invoke-direct {v0, v1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_11
    new-instance p1, Lab3/t;

    invoke-direct {p1, v0, v3}, Lab3/t;-><init>(Lva3/c;I)V

    return-object p1

    :cond_12
    instance-of p1, v0, Lr93/x0;

    if-eqz p1, :cond_13

    new-instance p1, Lab3/t;

    sget-object v0, Lo93/m;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->i()Lva3/e;

    move-result-object v0

    new-instance v1, Lva3/c;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v3

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-direct {p1, v1, v2}, Lab3/t;-><init>(Lva3/c;I)V

    return-object p1

    :cond_13
    :goto_5
    return-object v1
.end method

.method public final getSource()Lr93/s0;
    .locals 1

    iget-object v0, p0, Lja3/f;->e:Lw93/f;

    return-object v0
.end method

.method public final getType()Llb3/y;
    .locals 2

    sget-object v0, Lja3/f;->h:[Lj93/z;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lja3/f;->d:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/c0;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lxa3/i;->c:Lxa3/i;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lxa3/i;->x(Ls93/b;Ls93/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
