.class public final Llb3/k0;
.super Lrb3/d;
.source "SourceFile"


# static fields
.field public static final x:Lwe/o;

.field public static final y:Llb3/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwe/o;

    const/16 v1, 0x1a

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwe/o;-><init>(IZ)V

    sput-object v0, Llb3/k0;->x:Lwe/o;

    new-instance v0, Llb3/k0;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1}, Llb3/k0;-><init>(Ljava/util/List;)V

    sput-object v0, Llb3/k0;->y:Llb3/k0;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lrb3/k;->w:Lrb3/k;

    iput-object v0, p0, Lrb3/d;->w:Lrb3/a;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Llb3/g;->b()Lj93/d;

    move-result-object v1

    const-string v2, "tClass"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v2, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v2, v1}, Lwe/o;->I(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v2}, Lrb3/a;->a()I

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lrb3/d;->w:Lrb3/a;

    :try_start_0
    const-string v4, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lrb3/q;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Lrb3/q;->d()I

    move-result v3

    if-ne v3, v1, :cond_1

    new-instance v2, Lrb3/q;

    invoke-direct {v2, v0, v1}, Lrb3/q;-><init>(Llb3/g;I)V

    iput-object v2, p0, Lrb3/d;->w:Lrb3/a;

    goto :goto_0

    :cond_1
    new-instance v3, Lrb3/c;

    invoke-direct {v3}, Lrb3/c;-><init>()V

    invoke-virtual {v2}, Lrb3/q;->d()I

    move-result v4

    invoke-virtual {v2}, Lrb3/q;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lrb3/c;->c(ILjava/lang/Object;)V

    iput-object v3, p0, Lrb3/d;->w:Lrb3/a;

    :goto_1
    iget-object v2, p0, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v2, v1, v0}, Lrb3/a;->c(ILjava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OneElementArrayMap"

    invoke-static {v2, v3, v1}, Lrb3/d;->a(Lrb3/a;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    iget-object v2, p0, Lrb3/d;->w:Lrb3/a;

    instance-of v3, v2, Lrb3/k;

    if-eqz v3, :cond_3

    new-instance v2, Lrb3/q;

    invoke-direct {v2, v0, v1}, Lrb3/q;-><init>(Llb3/g;I)V

    iput-object v2, p0, Lrb3/d;->w:Lrb3/a;

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 v0, 0x0

    const-string v1, "EmptyArrayMap"

    invoke-static {v2, v0, v1}, Lrb3/d;->a(Lrb3/a;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method
