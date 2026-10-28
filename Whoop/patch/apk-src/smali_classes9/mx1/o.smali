.class public final synthetic Lmx1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lmx1/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILn0/n;)V
    .locals 0

    .line 2
    const/4 p1, 0x5

    iput p1, p0, Lmx1/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lmx1/o;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Llb1/z0;

    invoke-static {p1}, Ln72/c;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ln71/r;->c(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ln71/r;->e(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ln71/r;->a(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ln71/r;->f(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ln71/r;->b(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ly81/i;

    invoke-static {p1}, Ln71/r;->d(Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lk2/c;

    invoke-static {p1}, Ln71/o;->i(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ld0/o0;

    invoke-static {p1}, Ln71/o;->b(Ld0/o0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Ln51/g;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Ln31/h;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {p1}, Ln31/b;->a(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1}, Ln31/b;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ln31/b;->c(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ll83/k;

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const-string v1, "="

    invoke-static {v0, v1, p1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ld0/o0;

    invoke-static {p1}, Ln22/b;->d(Ld0/o0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Ln21/h;->b(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Ln21/e;->a(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lyb3/k;

    invoke-static {p1}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->b(Lyb3/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lyb3/k;

    invoke-static {p1}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->a(Lyb3/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ln1/o;

    new-instance v1, Ld0/e;

    sget-object v2, Ld0/f;->i:Ld0/f2;

    const/4 v3, 0x0

    const/16 v4, 0xc

    invoke-direct {v1, p1, v2, v3, v4}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Ln1/o;-><init>(Ld0/e;)V

    return-object v0

    :pswitch_14
    check-cast p1, Lk2/c;

    check-cast p1, La3/p0;

    invoke-virtual {p1}, La3/p0;->t0()La3/p;

    move-result-object v1

    invoke-virtual {v1}, La3/p;->A()J

    move-result-wide v2

    invoke-virtual {v1}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_0
    iget-object v0, v1, La3/p;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Laj/d;

    const v5, -0x800001

    const/4 v6, 0x0

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    const v8, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v9, 0x1

    invoke-virtual/range {v4 .. v9}, Laj/d;->d(FFFFI)V

    invoke-virtual {p1}, La3/p0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2, v3}, Ld;->z(La3/p;J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {v1, v2, v3}, Ld;->z(La3/p;J)V

    throw p1

    :pswitch_15
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ln01/d;->d(Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Li3/z;

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CircularProgressIndicator"

    invoke-static {v0, p1}, Li3/w;->k(Ljava/lang/String;Li3/z;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_17
    check-cast p1, Lp0/k0;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    check-cast p1, Lad3/g;

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lad3/g;->c:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    check-cast p1, Lmx2/f$a;

    invoke-static {p1}, Lmx2/h;->f(Lmx2/f$a;)Lmx2/f$a;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lmx2/f$a;

    invoke-static {p1}, Lmx2/h;->c(Lmx2/f$a;)Lmx2/f$a;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lmx1/p;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Lmx1/p;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

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
