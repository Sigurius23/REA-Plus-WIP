.class public abstract Lga3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-class v0, Ls93/p;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "PACKAGE"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/p;->y:Ls93/p;

    sget-object v2, Ls93/p;->O:Ls93/p;

    invoke-static {v0, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "TYPE"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/p;->z:Ls93/p;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "ANNOTATION_TYPE"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/p;->E:Ls93/p;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "TYPE_PARAMETER"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/p;->G:Ls93/p;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v5, Ll83/k;

    const-string v6, "FIELD"

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/p;->H:Ls93/p;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v7, "LOCAL_VARIABLE"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/p;->I:Ls93/p;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v7, Ll83/k;

    const-string v8, "PARAMETER"

    invoke-direct {v7, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/p;->J:Ls93/p;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v8, Ll83/k;

    const-string v9, "CONSTRUCTOR"

    invoke-direct {v8, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/p;->K:Ls93/p;

    sget-object v9, Ls93/p;->L:Ls93/p;

    sget-object v10, Ls93/p;->M:Ls93/p;

    invoke-static {v0, v9, v10}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v9, Ll83/k;

    const-string v10, "METHOD"

    invoke-direct {v9, v10, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/p;->N:Ls93/p;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    new-instance v10, Ll83/k;

    const-string v11, "TYPE_USE"

    invoke-direct {v10, v11, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v1 .. v10}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lga3/e;->a:Ljava/lang/Object;

    sget-object v0, Ls93/o;->w:Ls93/o;

    new-instance v1, Ll83/k;

    const-string v2, "RUNTIME"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/o;->x:Ls93/o;

    new-instance v2, Ll83/k;

    const-string v3, "CLASS"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ls93/o;->y:Ls93/o;

    new-instance v3, Ll83/k;

    const-string v4, "SOURCE"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lga3/e;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/util/List;)Lab3/b;
    .locals 6

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lx93/s;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx93/s;

    iget-object v1, v1, Lx93/s;->b:Ljava/lang/Enum;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    invoke-virtual {v1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lga3/e;->a:Ljava/lang/Object;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/EnumSet;

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v1, Lm83/a0;->w:Lm83/a0;

    :goto_2
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {p0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls93/p;

    new-instance v2, Lab3/i;

    sget-object v3, Lo93/m;->u:Lva3/e;

    const-string v4, "topLevelFqName"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lva3/c;

    invoke-virtual {v3}, Lva3/e;->b()Lva3/e;

    move-result-object v5

    iget-object v3, v3, Lva3/e;->a:Lva3/f;

    invoke-virtual {v3}, Lva3/f;->g()Lva3/h;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    invoke-direct {v2, v4, v1}, Lab3/i;-><init>(Lva3/c;Lva3/h;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance p0, Lab3/b;

    sget-object v1, Lga3/d;->w:Lga3/d;

    invoke-direct {p0, v0, v1}, Lab3/b;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    return-object p0
.end method
