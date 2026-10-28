.class public final Lrb3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrb3/e;


# static fields
.field public static final b:Lrb3/l;

.field public static final c:Lrb3/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb3/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb3/l;-><init>(I)V

    sput-object v0, Lrb3/l;->b:Lrb3/l;

    new-instance v0, Lrb3/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lrb3/l;-><init>(I)V

    sput-object v0, Lrb3/l;->c:Lrb3/l;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lrb3/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lha3/e;)Z
    .locals 5

    iget v0, p0, Lrb3/l;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object p1

    const-string v0, "getValueParameters(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/a1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lcb3/e;->a(Lr93/a1;)Z

    move-result v1

    if-nez v1, :cond_1

    check-cast v0, Lu93/w0;

    iget-object v0, v0, Lu93/w0;->K:Llb3/y;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1

    :pswitch_0
    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/a1;

    sget-object v0, Lo93/l;->d:Ljc/b;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lo93/m;->R:Lva3/c;

    invoke-static {v1, v0}, Lhg3/i;->L(Lr93/b0;Lva3/c;)Lr93/e;

    move-result-object v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_3

    :cond_3
    sget-object v1, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Llb3/k0;->y:Llb3/k0;

    new-instance v2, Llb3/h0;

    invoke-interface {v0}, Lr93/h;->e()Llb3/q0;

    move-result-object v3

    invoke-interface {v3}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v3

    const-string v4, "getParameters(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "single(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lr93/x0;

    invoke-direct {v2, v3}, Llb3/h0;-><init>(Lr93/x0;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v0, v2}, Llb3/o;->h(Llb3/k0;Lr93/e;Ljava/util/List;)Llb3/c0;

    move-result-object v0

    :goto_3
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    check-cast p1, Lu93/x0;

    invoke-virtual {p1}, Lu93/x0;->getType()Llb3/y;

    move-result-object p1

    const-string v2, "getType(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Llb3/d1;->g(Llb3/y;Z)Llb3/f1;

    move-result-object p1

    sget-object v1, Lmb3/d;->a:Lmb3/l;

    invoke-virtual {v1, v0, p1}, Lmb3/l;->b(Llb3/y;Llb3/y;)Z

    move-result v1

    :cond_4
    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge b(Lha3/e;)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lrb3/l;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1}, Lv8/b;->H(Lrb3/e;Lha3/e;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Lv8/b;->H(Lrb3/e;Lha3/e;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lrb3/l;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "should not have varargs or parameters with default values"

    return-object v0

    :pswitch_0
    const-string v0, "second parameter must be of type KProperty<*> or its supertype"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
