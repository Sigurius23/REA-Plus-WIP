.class public final synthetic Lv6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    const/16 p1, 0xa

    iput p1, p0, Lv6/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput p1, p0, Lv6/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lv6/q;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/String;

    new-instance v0, Ll40/a;

    invoke-direct {v0, p2, p1}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/String;

    new-instance v0, Ll40/a;

    invoke-direct {v0, p2, p1}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lg40/s3;

    const-string v0, "fieldState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lg40/s3;->f()Lg40/h1;

    move-result-object p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2

    :pswitch_2
    check-cast p1, Ljava/util/List;

    check-cast p2, Ly00/i;

    const-string v0, "choices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/i;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, p1

    :goto_1
    return-object p2

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll40/a;

    invoke-direct {v0, p2, p1}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/String;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll40/a;

    invoke-direct {v0, p2, p1}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lg40/s3;

    const-string v0, "fieldState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lg40/s3;->f()Lg40/h1;

    move-result-object p2

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    return-object p2

    :pswitch_6
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/Set;

    const-string v0, "fields"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/y2;

    instance-of v2, v1, Lg40/t2;

    if-eqz v2, :cond_4

    check-cast v1, Lg40/t2;

    iget-object v1, v1, Lg40/t2;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lg40/b3;

    invoke-virtual {v4}, Lg40/b3;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1}, Lg40/y2;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    move-object v2, v1

    :goto_5
    if-nez v2, :cond_6

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_6
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_3

    :cond_7
    return-object v0

    :pswitch_7
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lwt0/a;->a(Lxf3/c;Luf3/a;)Leu0/a;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lwt0/a;->b(Lxf3/c;Luf3/a;)Leu0/b;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lwq1/e;->c(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lwo1/t;->a(ILjava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lwo1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Lwi0/e;->o(Ljava/lang/String;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lj93/d;

    check-cast p2, Ljava/util/List;

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcd3/i;->a:Lcd3/d;

    const/4 v1, 0x1

    invoke-static {v0, p2, v1}, Lvb/g;->k(Lcd3/f;Ljava/util/List;Z)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Lh02/z;

    const/4 v2, 0x5

    invoke-direct {v1, p2, v2}, Lh02/z;-><init>(Ljava/util/List;I)V

    invoke-static {p1, v0, v1}, Lvb/g;->g(Lj93/d;Ljava/util/ArrayList;Lc93/a;)Lwc3/c;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-static {p1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object p1

    goto :goto_6

    :cond_8
    const/4 p1, 0x0

    :goto_6
    return-object p1

    :pswitch_e
    check-cast p1, Lj93/d;

    check-cast p2, Ljava/util/List;

    const-string v0, "clazz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcd3/i;->a:Lcd3/d;

    const/4 v1, 0x1

    invoke-static {v0, p2, v1}, Lvb/g;->k(Lcd3/f;Ljava/util/List;Z)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Lh02/z;

    const/4 v2, 0x4

    invoke-direct {v1, p2, v2}, Lh02/z;-><init>(Ljava/util/List;I)V

    invoke-static {p1, v0, v1}, Lvb/g;->g(Lj93/d;Ljava/util/ArrayList;Lc93/a;)Lwc3/c;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lw60/h;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lw60/g;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lw31/b;

    check-cast p2, Lw31/b;

    invoke-static {p1, p2}, Lw31/e;->c(Lw31/b;Lw31/b;)Lg1/g9;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p1, p2}, Ls2/d;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lvy0/r;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lvy0/r;->b(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ly3/l;

    check-cast p2, Ly3/l;

    invoke-static {p1, p2}, Lvy0/p;->u(Ly3/l;Ly3/l;)Ld0/c0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lvo1/d;->s(ILjava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lvo1/a;->b(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lvn1/b;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lv6/m;

    check-cast p2, Ln6/o;

    iput-object p2, p1, Lv6/m;->a:Ln6/o;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    check-cast p1, Lv6/l;

    check-cast p2, Lv6/a;

    iget p2, p2, Lv6/a;->a:I

    iput p2, p1, Lv6/l;->d:I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    check-cast p1, Lv6/l;

    check-cast p2, Lv6/b;

    iget p2, p2, Lv6/b;->a:I

    iput p2, p1, Lv6/l;->e:I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1c
    check-cast p1, Lv6/l;

    check-cast p2, Ln6/o;

    iput-object p2, p1, Lv6/l;->c:Ln6/o;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
