.class public final synthetic Landroidx/room/v0;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Landroidx/room/v0;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Landroidx/room/v0;->w:I

    const-string v7, "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v3, 0x1

    const/4 v2, 0x2

    .line 2
    const-class v4, Landroidx/room/c1;

    const-string v6, "compatTransactionCoroutineExecute"

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Landroidx/room/v0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Lwz/g0;

    move-object v2, p2

    check-cast v2, Lv00/c0;

    const-string p1, "p0"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p1"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkActivity;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lcom/stripe/android/link/LinkActivity;->y:Lj/d;

    if-eqz p1, :cond_0

    new-instance v1, Lwz/k;

    sget-object v5, Lwz/h0;->w:Lwz/h0;

    new-instance v3, Lwz/d;

    const/4 p2, 0x0

    invoke-direct {v3, p2, p2}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    sget-object v6, Lwz/l0;->w:Lwz/l0;

    invoke-direct/range {v1 .. v6}, Lwz/k;-><init>(Lv00/c0;Lwz/d;Lwz/g0;Lwz/h0;Lwz/n0;)V

    invoke-virtual {p1, v1, p2}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lzy/c;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh20/z;

    invoke-virtual {v0, p1, p2}, Lh20/z;->a(Lzy/c;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lo20/b;

    check-cast p2, Ljava/lang/String;

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh20/g;

    invoke-virtual {v0, p1, p2}, Lh20/g;->d(Lo20/b;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lq5/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "CREATE_CANCELED"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Landroidx/credentials/exceptions/CreateCredentialCancellationException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/CreateCredentialCancellationException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "CREATE_INTERRUPTED"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Landroidx/credentials/exceptions/CreateCredentialInterruptedException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/CreateCredentialInterruptedException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance p1, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lq5/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x5d754ec3

    if-eq v0, v1, :cond_7

    const v1, -0x936ed67

    if-eq v0, v1, :cond_5

    const v1, 0x77034d87

    if-eq v0, v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "GET_NO_CREDENTIALS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Landroidx/credentials/exceptions/NoCredentialException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/NoCredentialException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    const-string v0, "GET_INTERRUPTED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    new-instance p1, Landroidx/credentials/exceptions/GetCredentialInterruptedException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/GetCredentialInterruptedException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    const-string v0, "GET_CANCELED_TAG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p1, Landroidx/credentials/exceptions/GetCredentialCancellationException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/GetCredentialCancellationException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    :goto_1
    new-instance p1, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/String;)V

    :goto_2
    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lc93/a;

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lpg/a;

    invoke-virtual {v0, p1, p2}, La2/a;->s(Ljava/lang/Throwable;Lc93/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lc93/a;

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lpg/a;

    invoke-virtual {v0, p1, p2}, La2/a;->u(Ljava/lang/Throwable;Lc93/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lc93/a;

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lpg/a;

    iget-object v1, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v1, Lfg3/b;

    const-string v2, "msg"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Log/b;->y:Log/b;

    invoke-virtual {v0, v2}, La2/a;->j(Log/b;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_3

    :cond_9
    if-eqz p1, :cond_a

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v1, p2, p1}, Lfg3/b;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_a
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v1, p1}, Lfg3/b;->info(Ljava/lang/String;)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lc93/a;

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lpg/a;

    invoke-virtual {v0, p1, p2}, La2/a;->n(Ljava/lang/Throwable;Lc93/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lc93/a;

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lpg/a;

    iget-object v1, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v1, Lfg3/b;

    sget-object v2, Log/b;->w:Log/b;

    invoke-virtual {v0, v2}, La2/a;->j(Log/b;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_4

    :cond_b
    if-eqz p1, :cond_c

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v1, p2, p1}, Lfg3/b;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_c
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v1, p1}, Lfg3/b;->error(Ljava/lang/String;)V

    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    check-cast p1, Ln23/h;

    check-cast p2, Lq83/d;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lo23/q;

    invoke-static {v0, p1, p2}, Lo23/q;->a(Lo23/q;Ln23/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Llb3/y;

    check-cast p2, Llb3/y;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lmb3/l;

    invoke-virtual {v0, p1, p2}, Lmb3/l;->a(Llb3/y;Llb3/y;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Llb3/y;

    check-cast p2, Llb3/y;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lmb3/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lmb3/k;->b:Lmb3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lmb3/j;->b:Lmb3/l;

    invoke-virtual {v0, p1, p2}, Lmb3/l;->b(Llb3/y;Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {v0, p2, p1}, Lmb3/l;->b(Llb3/y;Llb3/y;)Z

    move-result p1

    if-nez p1, :cond_d

    const/4 p1, 0x1

    goto :goto_5

    :cond_d
    const/4 p1, 0x0

    :goto_5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lm23/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    int-to-float p2, p2

    const/high16 v1, 0x3f800000    # 1.0f

    div-float p2, v1, p2

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr p2, v2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    mul-float/2addr p1, p2

    sub-float/2addr v1, p1

    iget-object p1, v0, Lm23/d;->H:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, v0, Lm23/d;->F:Landroid/view/View;

    if-eqz p1, :cond_e

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_e
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    check-cast p1, Ly00/o4;

    check-cast p2, Lq83/d;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh20/z4;

    invoke-virtual {v0, p1, p2}, Lh20/z4;->d(Ly00/o4;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_f

    goto :goto_6

    :cond_f
    new-instance p2, Ll83/n;

    invoke-direct {p2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    move-object p1, p2

    :goto_6
    return-object p1

    :pswitch_e
    check-cast p1, Lyc3/g;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Led3/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p2}, Lyc3/g;->isElementOptional(I)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_12

    invoke-interface {p1, p2}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p2

    sget-object v1, Lyc3/l;->c:Lyc3/l;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_11

    sget-object v1, Lyc3/l;->b:Lyc3/l;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_10

    goto :goto_8

    :cond_10
    invoke-interface {p1}, Lyc3/g;->isNullable()Z

    move-result p1

    if-eqz p1, :cond_12

    iput-boolean v3, v0, Led3/m;->i:Z

    :goto_7
    move v2, v3

    goto :goto_9

    :cond_11
    :goto_8
    iput-boolean v2, v0, Led3/m;->i:Z

    goto :goto_7

    :cond_12
    :goto_9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lio/getstream/video/android/core/model/IceCandidate;

    check-cast p2, Lc43/v;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    invoke-static {v0, p1, p2}, Ld33/h1;->f(Ld33/h1;Lio/getstream/video/android/core/model/IceCandidate;Lc43/v;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    check-cast p1, Lio/getstream/video/android/core/model/IceCandidate;

    check-cast p2, Lc43/v;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    invoke-static {v0, p1, p2}, Ld33/h1;->f(Ld33/h1;Lio/getstream/video/android/core/model/IceCandidate;Lc43/v;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    check-cast p1, Lo20/b;

    check-cast p2, Ljava/lang/String;

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh20/g;

    invoke-virtual {v0, p1, p2}, Lh20/g;->d(Lo20/b;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    check-cast p1, Lo20/b;

    check-cast p2, Ljava/lang/String;

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh20/g;

    invoke-virtual {v0, p1, p2}, Lh20/g;->d(Lo20/b;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    check-cast p1, Ly00/o4;

    check-cast p2, Lq83/d;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lcz/n0;

    invoke-static {v0, p1, p2}, Lcz/n0;->j(Lcz/n0;Ly00/o4;Lq83/d;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_14
    check-cast p1, Lo20/b;

    check-cast p2, Ljava/lang/String;

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh20/g;

    invoke-virtual {v0, p1, p2}, Lh20/g;->d(Lo20/b;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    check-cast p1, Lkotlin/jvm/functions/Function1;

    check-cast p2, Lq83/d;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Landroidx/room/z0;

    invoke-static {v0, p1, p2}, Lpf/c;->q(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
