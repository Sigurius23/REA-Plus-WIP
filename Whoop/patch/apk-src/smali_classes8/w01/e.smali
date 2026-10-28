.class public final synthetic Lw01/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lw01/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lw01/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lwd3/c;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lwd3/c;->c:Lv63/c;

    instance-of v0, p1, Lwd3/c;

    if-eqz v0, :cond_0

    check-cast p1, Lwd3/c;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Lj93/d;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lvb/g;->j(Lj93/d;)Lwc3/c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-static {p1}, Lkotlinx/serialization/internal/PlatformKt;->isInterface(Lj93/d;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lwc3/e;

    invoke-direct {v0, p1}, Lwc3/e;-><init>(Lj93/d;)V

    goto :goto_1

    :cond_1
    move-object v0, v1

    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    :cond_3
    return-object v1

    :pswitch_1
    check-cast p1, Lj93/d;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lvb/g;->j(Lj93/d;)Lwc3/c;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {p1}, Lkotlinx/serialization/internal/PlatformKt;->isInterface(Lj93/d;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lwc3/e;

    invoke-direct {v0, p1}, Lwc3/e;-><init>(Lj93/d;)V

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :cond_5
    :goto_2
    return-object v0

    :pswitch_2
    check-cast p1, Lta2/a;

    invoke-static {p1}, Lwa2/a;->d(Lta2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lra2/a;

    invoke-static {p1}, Lwa2/a;->b(Lra2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lw90/b;->e(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Lw90/b;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lw90/b;->a(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lw81/d;

    invoke-static {p1}, Lw81/c;->a(Lw81/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lw81/c;->f(I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Lw80/b;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lv61/a;

    invoke-static {p1}, Lw61/c;->b(Lv61/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lgv1/m;

    invoke-static {p1}, Lw60/f;->d(Lgv1/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lu60/a;

    invoke-static {p1}, Lw60/f;->e(Lu60/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lw60/e;->j(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1}, Lw60/e;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lgv1/m;

    invoke-static {p1}, Lw60/e;->e(Lgv1/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lu60/a;

    invoke-static {p1}, Lw60/e;->c(Lu60/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lu60/a;

    invoke-static {p1}, Lw60/c;->a(Lu60/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lu60/a;

    invoke-static {p1}, Lw60/b;->g(Lu60/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1}, Lw51/g;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lad3/g;

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lad3/g;->c:Z

    iput-boolean v0, p1, Lad3/g;->d:Z

    iput-boolean v0, p1, Lad3/g;->a:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    check-cast p1, Lw20/y;

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lw20/y;->c:Lw20/z;

    iget-boolean v0, p1, Lw20/z;->c:Z

    if-eqz v0, :cond_6

    new-instance v0, Lw20/d;

    iget-object p1, p1, Lw20/z;->a:Ljava/lang/String;

    invoke-direct {v0, p1}, Lw20/d;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    sget-object v0, Lw20/e;->a:Lw20/e;

    :goto_3
    return-object v0

    :pswitch_16
    check-cast p1, Lcom/whoop/onboardingpersonalization/dayzero/header/models/ConversationProgressBarModel;

    invoke-static {p1}, Lw12/d;->b(Lcom/whoop/onboardingpersonalization/dayzero/header/models/ConversationProgressBarModel;)Lw12/c;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lw12/d;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lw12/d;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lw12/d;->d(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lw11/b;->c(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1}, Lw11/b;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1}, Lw01/g;->p(Ljava/lang/Object;)Ll83/a0;

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
