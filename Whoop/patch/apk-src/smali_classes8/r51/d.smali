.class public final synthetic Lr51/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lr51/d;->w:I

    iput-object p1, p0, Lr51/d;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lr51/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Landroid/webkit/WebView;

    invoke-static {v0, p1}, Lzo2/f;->a(Ljava/lang/String;Landroid/webkit/WebView;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lzi1/o;->c(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Li93/j;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    invoke-static {v0, p1}, Lyb3/r;->B0(Ljava/lang/CharSequence;Li93/j;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    iget-object v1, p0, Lr51/d;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-static {v1, p1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Ly31/d;->e(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lxo1/b;->i(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lyc/e;

    const-string v0, "$this$fromEnvironment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    iput-object v0, p1, Lyc/e;->d:Ljava/lang/String;

    iget-object p1, p1, Lyc/e;->a:Lzt/q;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lzt/q;->G(Lpf/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    invoke-static {p1, v0}, Lv41/d0;->h(ILjava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/cache/persistence/a;->m(Ljava/lang/String;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/cache/persistence/a;->w(Ljava/lang/String;Ltb/a;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/cache/persistence/a;->u(Ljava/lang/String;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/cache/persistence/a;->r(Ljava/lang/String;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lsy0/o;->a(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lsy0/j;->b(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lrf2/c;->l(Ljava/lang/String;Ltb/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Landroidx/work/impl/WorkDatabase;

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lqc/q;->A:Los/a;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "name"

    iget-object v2, p0, Lr51/d;->x:Ljava/lang/String;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lqc/u;->a:Landroidx/room/z0;

    new-instance v3, Lq11/c;

    const/4 v4, 0x6

    invoke-direct {v3, v4, v2, p1}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    invoke-static {v1, p1, p1, v3}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Los/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "apply(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lr51/d;->x:Ljava/lang/String;

    check-cast p1, Ll83/k;

    invoke-static {v0, p1}, Lr51/e;->d(Ljava/lang/String;Ll83/k;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
