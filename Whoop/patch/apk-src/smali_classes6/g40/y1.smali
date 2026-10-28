.class public final synthetic Lg40/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg40/y1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg40/y1;->w:I

    const-string v1, "$this$semantics"

    const/4 v2, 0x1

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lgo1/b;->b(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lgj0/a;->o0(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lgf1/i;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Lgf1/i;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lgf1/g;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1}, Lgf1/g;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lge0/b;

    invoke-static {p1}, Lge0/e;->e(Lge0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    const-string v3, "true"

    invoke-static {v1, v3, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/lang/String;

    const-string v1, "md"

    invoke-static {v1, v0, p1}, Lge/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lgd1/b;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lk2/e;

    invoke-static {p1}, Lgb1/b0;->e(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lk2/e;

    invoke-static {p1}, Lgb1/b0;->f(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lk2/e;

    invoke-static {p1}, Lgb1/b0;->b(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lk2/e;

    invoke-static {p1}, Lgb1/b0;->g(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1}, Lg90/f;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lg80/b;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1}, Lg51/b;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lk2/c;

    invoke-static {p1}, Lg41/d;->f(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lg41/d;->i(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lk2/c;

    invoke-static {p1}, Lg41/d;->h(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lg41/d;->d(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1}, Lg41/d;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Li3/z;

    const-string v0, "$this$clearAndSetSemantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v3

    :pswitch_15
    check-cast p1, Lg40/s3;

    sget-object p1, Lg40/j4;->a:Lp1/u2;

    return-object v3

    :pswitch_16
    check-cast p1, Lg2/m;

    const-string v0, "$this$focusProperties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lg2/m;->b(Z)V

    return-object v3

    :pswitch_17
    check-cast p1, Ljava/lang/String;

    const-string v0, "autofillType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LocalAutofillEventReporter "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " event not reported"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v3

    :pswitch_18
    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v3

    :pswitch_19
    check-cast p1, Li3/z;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->h:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v3

    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    new-instance v0, Ll40/a;

    invoke-direct {v0, p1, v2}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    return-object v0

    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ll83/k;

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-object p1

    nop

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
