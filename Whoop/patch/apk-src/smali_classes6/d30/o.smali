.class public final Ld30/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/textclassifier/TextClassifier;Lc93/m;Lq83/d;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Ld30/o;->w:I

    .line 1
    iput-object p1, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Ld30/o;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ld30/u;Le30/c;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld30/o;->w:I

    .line 2
    iput-object p1, p0, Ld30/o;->y:Ljava/lang/Object;

    iput-object p2, p0, Ld30/o;->z:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p4, p0, Ld30/o;->w:I

    iput-object p1, p0, Ld30/o;->z:Ljava/lang/Object;

    iput-object p2, p0, Ld30/o;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 4
    iput p3, p0, Ld30/o;->w:I

    iput-object p1, p0, Ld30/o;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Ld30/o;->w:I

    .line 5
    check-cast p1, Ls83/i;

    iput-object p1, p0, Ld30/o;->y:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld30/o;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast p1, Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function3;

    if-eqz p1, :cond_2

    iget-object p1, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast p1, Lh40/k;

    iput v2, p0, Ld30/o;->x:I

    invoke-virtual {p1, p0}, Lh40/k;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Ld30/o;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lh20/x;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lwz/g0;

    const/16 v2, 0x1d

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x1c

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lh40/k;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0x1b

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_2
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lh0/h2;

    const/16 v2, 0x1a

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_3
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lh0/c3;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    const/16 v2, 0x19

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_4
    new-instance v0, Ld30/o;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ld30/f0;

    const/16 v2, 0x18

    invoke-direct {v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ld30/o;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_5
    new-instance v0, Ld30/o;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ldc3/l;

    const/16 v2, 0x17

    invoke-direct {v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ld30/o;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_6
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/e0;

    const/16 v2, 0x16

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_7
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v0, Ls83/i;

    invoke-direct {p1, v0, p2}, Ld30/o;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object p1

    :pswitch_8
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lg20/r;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lv10/b;

    const/16 v2, 0x14

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_9
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lg1/l6;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lb3/g;

    const/16 v2, 0x13

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_a
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lh0/n1;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    const/16 v2, 0x12

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_b
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lg1/z2;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lj0/h;

    const/16 v2, 0x11

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_c
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lg1/z2;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lg1/t1;

    const/16 v2, 0x10

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_d
    new-instance v0, Ld30/o;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    const/16 v2, 0xf

    invoke-direct {v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ld30/o;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_e
    new-instance v0, Ld30/o;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lfc3/g;

    const/16 v2, 0xe

    invoke-direct {v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ld30/o;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_f
    new-instance v0, Ld30/o;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lf53/j;

    const/16 v2, 0xd

    invoke-direct {v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ld30/o;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_10
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lb3/r1;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ll3/g;

    const/16 v2, 0xc

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_11
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Landroid/view/textclassifier/TextClassifier;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p1, v0, v1, p2}, Ld30/o;-><init>(Landroid/view/textclassifier/TextClassifier;Lc93/m;Lq83/d;)V

    return-object p1

    :pswitch_12
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lj0/i;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lj0/g;

    const/16 v2, 0xa

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_13
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lj0/i;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lj0/f;

    const/16 v2, 0x9

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_14
    new-instance v0, Ld30/o;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lfc3/y;

    const/16 v2, 0x8

    invoke-direct {v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ld30/o;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_15
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Le10/r0;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Le10/k;

    const/4 v2, 0x7

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_16
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Le10/r0;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Le10/i;

    const/4 v2, 0x6

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_17
    new-instance v0, Ld30/o;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ld33/h1;

    const/4 v2, 0x5

    invoke-direct {v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ld30/o;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_18
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/android/video/generated/models/VideoEvent;

    const/4 v2, 0x4

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_19
    new-instance v0, Ld30/o;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ld30/f0;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Ld30/o;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_1a
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lec3/t1;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ld30/v;

    const/4 v2, 0x2

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object p1

    :pswitch_1b
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v0, Ld30/u;

    iget-object v1, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Le30/c;

    invoke-direct {p1, v0, v1, p2}, Ld30/o;-><init>(Ld30/u;Le30/c;Lq83/d;)V

    return-object p1

    :pswitch_1c
    new-instance p1, Ld30/o;

    iget-object v0, p0, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lec3/f2;

    iget-object v1, p0, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ld30/u;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p2, v2}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld30/o;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lx43/p;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_15
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lt23/q1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_1b
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_1c
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld30/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v6, p0

    iget v0, v6, Ld30/o;->w:I

    const-string v1, "Exception occurred: "

    const-string v2, "SafeCall"

    const/16 v3, 0x8

    const/4 v4, 0x7

    const/4 v5, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x2

    const-string v10, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v11, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_1

    if-ne v1, v11, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lh20/x;

    iget-object v1, v1, Lh20/x;->a:Lwz/l1;

    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Lwz/g0;

    iput v11, v6, Ld30/o;->x:I

    invoke-virtual {v1, v2, v6}, Lwz/l1;->c(Lwz/g0;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_4

    if-ne v1, v11, :cond_3

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iput v11, v6, Ld30/o;->x:I

    invoke-interface {v1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    iget-object v0, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    sget-object v1, Lwz/g;->a:Lwz/g;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_1
    invoke-direct/range {p0 .. p1}, Ld30/o;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_8

    if-eq v1, v11, :cond_7

    if-ne v1, v9, :cond_6

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/k1;

    iput v11, v6, Ld30/o;->x:I

    invoke-interface {v1, v6}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_9

    goto :goto_6

    :cond_9
    :goto_4
    iget-object v1, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lh0/h2;

    iput v9, v6, Ld30/o;->x:I

    invoke-virtual {v1, v6}, Lh0/h2;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    goto :goto_6

    :cond_a
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_c

    if-ne v1, v11, :cond_b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lh0/c3;

    sget-object v2, Lf0/z0;->x:Lf0/z0;

    iget-object v3, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v3, Lc93/m;

    iput v11, v6, Ld30/o;->x:I

    invoke-virtual {v1, v2, v3, v6}, Lh0/c3;->f(Lf0/z0;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_d

    goto :goto_8

    :cond_d
    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object v0

    :pswitch_4
    iget-object v0, v6, Ld30/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld30/f0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v6, Ld30/o;->x:I

    if-eqz v2, :cond_11

    if-eq v2, v11, :cond_f

    if-ne v2, v9, :cond_e

    iget-object v2, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_9

    :catchall_0
    move-exception v0

    goto :goto_c

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    iget-object v2, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v3, p1

    :cond_10
    move-object v7, v2

    goto :goto_a

    :cond_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    :goto_9
    :try_start_2
    invoke-interface {v2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v3

    invoke-static {v3}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v3

    if-eqz v3, :cond_13

    iget-object v3, v1, Ld30/f0;->g:Ljava/lang/Object;

    check-cast v3, Ldc3/h;

    iput-object v2, v6, Ld30/o;->z:Ljava/lang/Object;

    iput v11, v6, Ld30/o;->x:I

    invoke-virtual {v3, v6}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_10

    goto :goto_b

    :goto_a
    check-cast v3, Lh0/x1;

    iget-object v2, v1, Ld30/f0;->f:Ljava/lang/Object;

    check-cast v2, Ly3/c;

    sget v4, Lh0/w1;->a:F

    invoke-interface {v2, v4}, Ly3/c;->q0(F)F

    move-result v4

    iget-object v2, v1, Ld30/f0;->f:Ljava/lang/Object;

    check-cast v2, Ly3/c;

    sget v5, Lh0/w1;->b:F

    invoke-interface {v2, v5}, Ly3/c;->q0(F)F

    move-result v5

    iget-object v2, v1, Ld30/f0;->c:Ljava/lang/Object;

    check-cast v2, Lh0/c3;

    iput-object v7, v6, Ld30/o;->z:Ljava/lang/Object;

    iput v9, v6, Ld30/o;->x:I

    invoke-static/range {v1 .. v6}, Ld30/f0;->a(Ld30/f0;Lh0/c3;Lh0/x1;FFLs83/c;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v2, v0, :cond_12

    goto :goto_b

    :cond_12
    move-object v2, v7

    goto :goto_9

    :cond_13
    iput-object v8, v1, Ld30/f0;->b:Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v0

    :goto_c
    iput-object v8, v1, Ld30/f0;->b:Ljava/lang/Object;

    throw v0

    :pswitch_5
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_15

    if-ne v1, v11, :cond_14

    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/k1;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object/from16 v2, p1

    goto :goto_d

    :catchall_1
    move-exception v0

    goto :goto_f

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    new-instance v2, Lh0/y1;

    invoke-direct {v2, v9, v7, v8}, Lh0/y1;-><init>(IILq83/d;)V

    invoke-static {v1, v8, v8, v2, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    :try_start_4
    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Ldc3/l;

    iput-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    iput v11, v6, Ld30/o;->x:I

    invoke-interface {v2, v6}, Ldc3/w;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_16

    goto :goto_e

    :cond_16
    :goto_d
    move-object v0, v2

    check-cast v0, Lh0/x1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-interface {v1, v8}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :goto_e
    return-object v0

    :goto_f
    invoke-interface {v1, v8}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    throw v0

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_18

    if-ne v1, v11, :cond_17

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lf0/r1;

    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/e0;

    iget v2, v2, Lkotlin/jvm/internal/e0;->w:I

    iput v11, v6, Ld30/o;->x:I

    invoke-virtual {v1, v2, v6}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_19

    goto :goto_11

    :cond_19
    :goto_10
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_11
    return-object v0

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v6, Ld30/o;->x:I

    if-eqz v3, :cond_1c

    if-eq v3, v11, :cond_1b

    if-ne v3, v9, :cond_1a

    :try_start_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_14

    :catch_0
    move-exception v0

    goto :goto_13

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    iget-object v3, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v3, Ls83/i;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    :try_start_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_12

    :cond_1c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v3, Ls83/i;

    :try_start_7
    iput-object v3, v6, Ld30/o;->z:Ljava/lang/Object;

    iput v11, v6, Ld30/o;->x:I

    const-wide/16 v4, 0xbb8

    invoke-static {v4, v5, v6}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_1d

    goto :goto_15

    :cond_1d
    :goto_12
    iput-object v8, v6, Ld30/o;->z:Ljava/lang/Object;

    iput v9, v6, Ld30/o;->x:I

    invoke-interface {v3, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    if-ne v1, v0, :cond_1e

    goto :goto_15

    :goto_13
    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1e

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v4, v2, v1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1e
    :goto_14
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_15
    return-object v0

    :pswitch_8
    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lg20/r;

    iget-object v1, v0, Lg20/r;->J:Lq83/j;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v7, v6, Ld30/o;->x:I

    if-eqz v7, :cond_22

    if-eq v7, v11, :cond_21

    if-eq v7, v9, :cond_20

    if-ne v7, v5, :cond_1f

    goto :goto_16

    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    :goto_16
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_19

    :cond_21
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    check-cast v7, Ll83/n;

    iget-object v7, v7, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_18

    :cond_22
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean v7, v0, Lg20/r;->w:Z

    if-eqz v7, :cond_23

    iget-object v7, v0, Lg20/r;->F:Lu03/a;

    invoke-interface {v7}, Lu03/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lv10/g;

    goto :goto_17

    :cond_23
    iget-object v7, v0, Lg20/r;->G:Lu03/a;

    invoke-interface {v7}, Lu03/a;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lv10/g;

    :goto_17
    iget-object v10, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v10, Lv10/b;

    iput v11, v6, Ld30/o;->x:I

    invoke-virtual {v7, v10, v6}, Lv10/g;->e(Lv10/b;Ls83/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_24

    goto :goto_1a

    :cond_24
    :goto_18
    invoke-static {v7}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v10

    if-nez v10, :cond_25

    check-cast v7, Lux/m0;

    new-instance v3, Landroidx/room/e;

    invoke-direct {v3, v0, v7, v8, v4}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v9, v6, Ld30/o;->x:I

    invoke-static {v1, v3, v6}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_26

    goto :goto_1a

    :cond_25
    new-instance v4, Landroidx/room/e;

    invoke-direct {v4, v0, v10, v8, v3}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v5, v6, Ld30/o;->x:I

    invoke-static {v1, v4, v6}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_26

    goto :goto_1a

    :cond_26
    :goto_19
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_1a
    return-object v2

    :pswitch_9
    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Lg1/l6;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v6, Ld30/o;->x:I

    if-eqz v2, :cond_28

    if-ne v2, v11, :cond_27

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1f

    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v0, :cond_34

    iget-object v2, v0, Lg1/l6;->c:Lg1/h6;

    iget-object v3, v0, Lg1/l6;->b:Ljava/lang/String;

    if-eqz v3, :cond_29

    move v7, v11

    :cond_29
    iget-object v3, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v3, Lb3/g;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const-wide v12, 0x7fffffffffffffffL

    if-eqz v2, :cond_2c

    if-eq v2, v11, :cond_2b

    if-ne v2, v9, :cond_2a

    move-wide v8, v12

    goto :goto_1b

    :cond_2a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2b
    const-wide/16 v8, 0x2710

    goto :goto_1b

    :cond_2c
    const-wide/16 v8, 0xfa0

    :goto_1b
    if-nez v3, :cond_2d

    goto :goto_1d

    :cond_2d
    check-cast v3, Lb3/h;

    iget-object v2, v3, Lb3/h;->a:Landroid/view/accessibility/AccessibilityManager;

    const-wide/32 v14, 0x7fffffff

    cmp-long v3, v8, v14

    if-ltz v3, :cond_2e

    goto :goto_1d

    :cond_2e
    if-eqz v7, :cond_2f

    goto :goto_1c

    :cond_2f
    move v4, v5

    :goto_1c
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v3, v5, :cond_31

    long-to-int v3, v8

    invoke-static {v2, v3, v4}, La4/a;->u(Landroid/view/accessibility/AccessibilityManager;II)I

    move-result v2

    const v3, 0x7fffffff

    if-ne v2, v3, :cond_30

    goto :goto_1e

    :cond_30
    int-to-long v12, v2

    goto :goto_1e

    :cond_31
    if-eqz v7, :cond_32

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v2

    if-eqz v2, :cond_32

    goto :goto_1e

    :cond_32
    :goto_1d
    move-wide v12, v8

    :goto_1e
    iput v11, v6, Ld30/o;->x:I

    invoke-static {v12, v13, v6}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_33

    goto :goto_20

    :cond_33
    :goto_1f
    iget-object v0, v0, Lg1/l6;->d:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v1

    if-eqz v1, :cond_34

    sget-object v1, Lg1/t6;->w:Lg1/t6;

    invoke-virtual {v0, v1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_34
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_20
    return-object v1

    :pswitch_a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_36

    if-ne v1, v11, :cond_35

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_21

    :cond_35
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_36
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lh0/n1;

    sget-object v2, Lf0/z0;->x:Lf0/z0;

    new-instance v3, Ld33/x;

    invoke-direct {v3, v9, v5, v8}, Ld33/x;-><init>(IILq83/d;)V

    iput v11, v6, Ld30/o;->x:I

    invoke-interface {v1, v2, v3, v6}, Lh0/n1;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_37

    goto :goto_22

    :cond_37
    :goto_21
    iget-object v0, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v1, Ljava/lang/Float;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_22
    return-object v0

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_39

    if-ne v1, v11, :cond_38

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_23

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lg1/z2;

    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Lj0/h;

    iput v11, v6, Ld30/o;->x:I

    invoke-virtual {v1, v2, v6}, Lg1/z2;->a(Lj0/h;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3a

    goto :goto_24

    :cond_3a
    :goto_23
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_24
    return-object v0

    :pswitch_c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v6, Ld30/o;->x:I

    if-eqz v2, :cond_3c

    if-ne v2, v11, :cond_3b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_26

    :cond_3b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v2, Lg1/z2;

    iget-object v3, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v3, Lg1/t1;

    iget v4, v3, Lg1/t1;->a:F

    iget v5, v3, Lg1/t1;->b:F

    iget v7, v3, Lg1/t1;->c:F

    iget v3, v3, Lg1/t1;->d:F

    iput v11, v6, Ld30/o;->x:I

    iput v4, v2, Lg1/z2;->a:F

    iput v5, v2, Lg1/z2;->b:F

    iput v7, v2, Lg1/z2;->c:F

    iput v3, v2, Lg1/z2;->d:F

    invoke-virtual {v2, v6}, Lg1/z2;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3d

    goto :goto_25

    :cond_3d
    move-object v2, v0

    :goto_25
    if-ne v2, v1, :cond_3e

    move-object v0, v1

    :cond_3e
    :goto_26
    return-object v0

    :pswitch_d
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_40

    if-ne v1, v11, :cond_3f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_27

    :cond_3f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_40
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iput v11, v6, Ld30/o;->x:I

    invoke-interface {v2, v1, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_41

    goto :goto_28

    :cond_41
    :goto_27
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_28
    return-object v0

    :pswitch_e
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_43

    if-ne v1, v11, :cond_42

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_29

    :cond_42
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Lfc3/g;

    iput v11, v6, Ld30/o;->x:I

    invoke-virtual {v2, v1, v6}, Lfc3/g;->i(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_44

    goto :goto_2a

    :cond_44
    :goto_29
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2a
    return-object v0

    :pswitch_f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Lf53/j;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v4, v6, Ld30/o;->x:I

    if-eqz v4, :cond_47

    if-eq v4, v11, :cond_45

    if-eq v4, v9, :cond_45

    if-ne v4, v5, :cond_46

    :cond_45
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_32

    :cond_46
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_47
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v4, Lx43/p;

    instance-of v10, v4, Lx43/m;

    if-eqz v10, :cond_48

    check-cast v4, Lx43/m;

    iput v11, v6, Ld30/o;->x:I

    invoke-static {v1, v4, v6}, Lf53/j;->b(Lf53/j;Lx43/m;Ld30/o;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_54

    goto/16 :goto_31

    :cond_48
    instance-of v10, v4, Lx43/o;

    if-eqz v10, :cond_53

    check-cast v4, Lx43/o;

    iget-object v4, v4, Lx43/o;->a:Lio/getstream/android/video/generated/models/VideoEvent;

    instance-of v10, v4, Lio/getstream/android/video/generated/models/ConnectionErrorEvent;

    if-eqz v10, :cond_4d

    new-instance v5, Lx43/m;

    check-cast v4, Lio/getstream/android/video/generated/models/ConnectionErrorEvent;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/ConnectionErrorEvent;->getError()Lio/getstream/android/video/generated/models/APIError;

    move-result-object v4

    if-eqz v4, :cond_4c

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/APIError;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/APIError;->getMoreInfo()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v11

    const-string v12, ""

    if-nez v11, :cond_49

    const-string v11, "\nMore information available at "

    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_2b

    :cond_49
    move-object v10, v12

    :goto_2b
    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/APIError;->getDetails()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v11, v14}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v14

    new-instance v15, Lx43/q;

    invoke-static {v12}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-direct {v15, v14, v8}, Lx43/q;-><init>(ILjava/util/List;)V

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x0

    goto :goto_2c

    :cond_4a
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_4b

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v11, "\nError details: "

    invoke-direct {v8, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    :cond_4b
    invoke-static {v7, v10, v12}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/APIError;->getCode()I

    move-result v8

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/APIError;->getStatusCode()I

    move-result v4

    new-instance v10, Ln23/c;

    invoke-direct {v10, v7, v8, v4, v3}, Ln23/c;-><init>(Ljava/lang/String;III)V

    const/4 v4, 0x0

    goto :goto_2d

    :cond_4c
    sget-object v3, Lu33/e;->I:Lu33/e;

    const/4 v4, 0x0

    invoke-static {v3, v4, v9}, Ls4/a;->d(Lu33/e;Ljava/lang/Throwable;I)Ln23/c;

    move-result-object v10

    :goto_2d
    invoke-direct {v5, v10, v4}, Lx43/m;-><init>(Ln23/e;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    iput v9, v6, Ld30/o;->x:I

    invoke-static {v1, v5, v6}, Lf53/j;->b(Lf53/j;Lx43/m;Ld30/o;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_54

    goto/16 :goto_31

    :cond_4d
    iput v5, v6, Ld30/o;->x:I

    instance-of v3, v4, Lio/getstream/android/video/generated/models/ConnectedEvent;

    if-eqz v3, :cond_51

    iget-object v1, v1, Lf53/j;->l:Lio/sentry/internal/debugmeta/c;

    check-cast v4, Lio/getstream/android/video/generated/models/ConnectedEvent;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v3, Lio/sentry/internal/debugmeta/c;->z:I

    sput v3, Lio/sentry/internal/debugmeta/c;->E:I

    sput v7, Lio/sentry/internal/debugmeta/c;->z:I

    invoke-virtual {v1}, Lio/sentry/internal/debugmeta/c;->t()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v7, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->z:Lb23/g;

    invoke-interface {v5, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4e

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/ConnectedEvent;->getMe()Lio/getstream/android/video/generated/models/OwnUserResponse;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/android/video/generated/models/OwnUserResponse;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lio/getstream/android/video/generated/models/ConnectedEvent;->getConnectionId()Ljava/lang/String;

    move-result-object v9

    const-string v10, "[onConnected] user.id: \'"

    const-string v11, "\', connectionId: "

    invoke-static {v10, v5, v11, v9}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x0

    invoke-interface {v3, v8, v7, v5, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4e
    invoke-virtual {v1}, Lio/sentry/internal/debugmeta/c;->w()Ly43/b;

    move-result-object v1

    new-instance v3, Lg53/o;

    invoke-direct {v3, v4}, Lg53/o;-><init>(Lio/getstream/android/video/generated/models/ConnectedEvent;)V

    invoke-virtual {v1, v3, v6}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4f

    goto :goto_2e

    :cond_4f
    move-object v1, v0

    :goto_2e
    if-ne v1, v2, :cond_50

    goto :goto_30

    :cond_50
    :goto_2f
    move-object v1, v0

    goto :goto_30

    :cond_51
    instance-of v3, v4, Lio/getstream/android/video/generated/models/HealthCheckEvent;

    if-eqz v3, :cond_52

    iget-object v1, v1, Lf53/j;->n:Lx43/h;

    invoke-virtual {v1}, Lx43/h;->a()V

    goto :goto_2f

    :cond_52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lf53/e;

    invoke-direct {v3, v4, v7}, Lf53/e;-><init>(Lio/getstream/android/video/generated/models/VideoEvent;I)V

    invoke-virtual {v1, v3}, Lf53/j;->e(Lkotlin/jvm/functions/Function1;)V

    goto :goto_2f

    :goto_30
    if-ne v1, v2, :cond_54

    :goto_31
    move-object v0, v2

    goto :goto_32

    :cond_53
    instance-of v2, v4, Lx43/n;

    if-eqz v2, :cond_54

    invoke-virtual {v1}, Lf53/j;->f()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_54

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "Received [SFUMessage] in coordinator socket. Ignoring"

    const/4 v9, 0x0

    invoke-interface {v1, v4, v3, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_54
    :goto_32
    return-object v0

    :pswitch_10
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v6, Ld30/o;->x:I

    if-eqz v2, :cond_56

    if-ne v2, v11, :cond_55

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_33

    :cond_55
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_56
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v2, Lb3/r1;

    iget-object v3, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v3, Ll3/g;

    invoke-static {v3}, Lse/a;->f0(Ll3/g;)Lb3/q1;

    move-result-object v3

    iput v11, v6, Ld30/o;->x:I

    check-cast v2, Lb3/i;

    invoke-virtual {v2, v3}, Lb3/i;->a(Lb3/q1;)V

    if-ne v0, v1, :cond_57

    move-object v0, v1

    :cond_57
    :goto_33
    return-object v0

    :pswitch_11
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_59

    if-ne v1, v11, :cond_58

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_34

    :cond_58
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_59
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Landroid/view/textclassifier/TextClassifier;

    if-eqz v1, :cond_5b

    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    iput v11, v6, Ld30/o;->x:I

    invoke-interface {v2, v1, v6}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5a

    goto :goto_34

    :cond_5a
    move-object v0, v1

    goto :goto_34

    :cond_5b
    const/4 v0, 0x0

    :goto_34
    return-object v0

    :pswitch_12
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_5d

    if-ne v1, v11, :cond_5c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_35

    :cond_5c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lj0/i;

    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Lj0/g;

    iput v11, v6, Ld30/o;->x:I

    check-cast v1, Lj0/j;

    invoke-virtual {v1, v2, v6}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5e

    goto :goto_36

    :cond_5e
    :goto_35
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_36
    return-object v0

    :pswitch_13
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_60

    if-ne v1, v11, :cond_5f

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_37

    :cond_5f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_60
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lj0/i;

    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Lj0/f;

    iput v11, v6, Ld30/o;->x:I

    check-cast v1, Lj0/j;

    invoke-virtual {v1, v2, v6}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_61

    goto :goto_38

    :cond_61
    :goto_37
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_38
    return-object v0

    :pswitch_14
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_63

    if-eq v1, v11, :cond_62

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_62
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_63
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    new-instance v2, Lkotlin/jvm/internal/b0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v3, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v3, Lfc3/y;

    new-instance v4, Landroidx/room/x;

    invoke-direct {v4, v2, v1}, Landroidx/room/x;-><init>(Lkotlin/jvm/internal/b0;Lec3/m;)V

    iput v11, v6, Ld30/o;->x:I

    invoke-virtual {v3, v4, v6}, Lec3/w1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_15
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Le10/r0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v6, Ld30/o;->x:I

    if-eqz v3, :cond_65

    if-ne v3, v11, :cond_64

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_39

    :cond_64
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_65
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Le10/r0;->j:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le10/b0;

    instance-of v3, v3, Le10/z;

    if-eqz v3, :cond_66

    goto :goto_39

    :cond_66
    iget-object v3, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v3, Le10/k;

    iput v11, v6, Ld30/o;->x:I

    invoke-static {v1, v3, v6}, Le10/r0;->a(Le10/r0;Le10/k;Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_67

    move-object v0, v2

    :cond_67
    :goto_39
    return-object v0

    :pswitch_16
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_69

    if-ne v1, v11, :cond_68

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3a

    :cond_68
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_69
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Le10/r0;

    iget-object v2, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v2, Le10/i;

    check-cast v2, Le10/g;

    iget-object v3, v2, Le10/g;->b:Le10/k;

    iget-object v2, v2, Le10/g;->a:Le10/l;

    iget-object v3, v3, Le10/k;->x:Lv00/c0;

    const-string v4, "confirmationOption"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "paymentMethodMetadata"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Le10/k;

    invoke-direct {v4, v2, v3}, Le10/k;-><init>(Le10/l;Lv00/c0;)V

    iput v11, v6, Ld30/o;->x:I

    invoke-static {v1, v4, v6}, Le10/r0;->a(Le10/r0;Le10/k;Ls83/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6a

    goto :goto_3b

    :cond_6a
    :goto_3a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3b
    return-object v0

    :pswitch_17
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ld33/h1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v6, Ld30/o;->x:I

    if-eqz v3, :cond_6d

    if-eq v3, v11, :cond_6b

    if-ne v3, v9, :cond_6c

    :cond_6b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3d

    :cond_6c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v3, Lt23/q1;

    sget-object v4, Lt23/o1;->a:Lt23/o1;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6e

    iput v11, v6, Ld30/o;->x:I

    invoke-static {v1, v6}, Ld33/h1;->a(Ld33/h1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_6f

    goto :goto_3c

    :cond_6e
    sget-object v3, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    invoke-virtual {v1, v7, v3}, Ld33/h1;->F(ZLstream/video/sfu/models/TrackType;)V

    iget-object v1, v1, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le33/n;

    if-eqz v1, :cond_6f

    iput v9, v6, Ld30/o;->x:I

    invoke-virtual {v1, v3}, Le33/n;->A(Lstream/video/sfu/models/TrackType;)V

    if-ne v0, v2, :cond_6f

    :goto_3c
    move-object v0, v2

    :cond_6f
    :goto_3d
    return-object v0

    :pswitch_18
    sget-object v7, Ll83/a0;->a:Ll83/a0;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v6, Ld30/o;->x:I

    if-eqz v0, :cond_73

    if-eq v0, v11, :cond_72

    if-eq v0, v9, :cond_71

    if-ne v0, v5, :cond_70

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_44

    :cond_70
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_71
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_42

    :cond_72
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_41

    :cond_73
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v0

    iget-object v10, v0, Lb23/k;->c:Lb23/e;

    sget-object v12, Lb23/g;->y:Lb23/g;

    iget-object v13, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v10, v12, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_74

    iget-object v10, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v13, "JoinCallResponseEvent sfuConnectionModule.socketConnection.whenConnected"

    const/4 v14, 0x0

    invoke-interface {v10, v12, v0, v13, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_74
    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    iget-object v0, v0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_7b

    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    iget-object v0, v0, Ld33/h1;->b:Lt23/c0;

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v0, v0, Lt23/s0;->M:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v10, v0, Ljava/util/Collection;

    if-eqz v10, :cond_75

    move-object v10, v0

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_75

    goto/16 :goto_3f

    :cond_75
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_76
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/android/video/generated/models/OwnCapability;

    sget-object v12, Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$SendAudio;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_77

    sget-object v12, Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_77

    sget-object v12, Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_76

    :cond_77
    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    iget-object v10, v0, Ld33/h1;->A:Lec3/h2;

    iget-object v12, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v12, Lio/getstream/android/video/generated/models/VideoEvent;

    check-cast v12, Lv33/n;

    iget-object v12, v12, Lv33/n;->e:Ljava/util/List;

    const-string v13, "publishOptions"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v13, v0, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v13}, Lt23/c0;->j()Le33/j0;

    move-result-object v13

    iget-object v14, v0, Ld33/h1;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ld33/h1;->t()Ly33/e;

    move-result-object v15

    iget-object v15, v15, Ly33/e;->d:Lp33/o;

    iget-object v3, v0, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v3}, Lt23/c0;->h()Lt23/x1;

    move-result-object v3

    invoke-virtual {v0}, Ld33/h1;->q()Lorg/webrtc/PeerConnection$RTCConfiguration;

    move-result-object v5

    iget-object v4, v0, Ld33/h1;->k:Lbc3/c0;

    sget-object v11, Ln53/c;->a:Lorg/webrtc/MediaConstraints;

    iget-object v9, v0, Ld33/h1;->s:Ll53/m;

    new-instance v16, Landroidx/room/v0;

    const/16 v22, 0x0

    const/16 v23, 0x5

    const/16 v17, 0x2

    const-class v19, Ld33/h1;

    const-string v20, "sendIceCandidate"

    const-string v21, "sendIceCandidate(Lio/getstream/video/android/core/model/IceCandidate;Lio/getstream/video/android/core/model/StreamPeerType;)V"

    move-object/from16 v18, v0

    invoke-direct/range {v16 .. v23}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v19, v12

    iget-object v12, v0, Ld33/h1;->b:Lt23/c0;

    iget-object v12, v12, Lt23/c0;->p:Lt23/s0;

    iget-object v12, v12, Lt23/s0;->J:Lec3/h2;

    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/getstream/android/video/generated/models/CallSettingsResponse;

    if-eqz v12, :cond_78

    invoke-virtual {v12}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getAudio()Lio/getstream/android/video/generated/models/AudioSettingsResponse;

    move-result-object v12

    if-eqz v12, :cond_78

    invoke-virtual {v12}, Lio/getstream/android/video/generated/models/AudioSettingsResponse;->getHifiAudioEnabled()Z

    :cond_78
    new-instance v12, Ld33/r;

    move-object/from16 v18, v13

    const/4 v13, 0x2

    invoke-direct {v12, v0, v13}, Ld33/r;-><init>(Ld33/h1;I)V

    sget-object v26, Ld33/b0;->x:Ld33/b0;

    const-string v0, "iceServers="

    const-string v13, "mediaManager"

    invoke-static {v3, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "coroutineScope"

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "mediaConstraints"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "sfuClient"

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "sessionId"

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "tracer"

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, Lc43/v;->w:Lc43/v;

    move-object/from16 v22, v16

    new-instance v16, Le33/n;

    move-object/from16 v17, v3

    move-object/from16 v20, v4

    move-object/from16 v27, v9

    move-object/from16 v21, v11

    move-object/from16 v25, v12

    move-object/from16 v24, v14

    move-object/from16 v23, v15

    invoke-direct/range {v16 .. v27}, Le33/n;-><init>(Lt23/x1;Le33/j0;Ljava/util/List;Lbc3/c0;Lorg/webrtc/MediaConstraints;Landroidx/room/v0;Lio/getstream/video/android/core/api/SignalServerService;Ljava/lang/String;Lc93/a;Lc93/a;Ll53/m;)V

    move-object/from16 v4, v16

    move-object/from16 v3, v18

    invoke-virtual {v3, v5, v4}, Le33/j0;->d(Lorg/webrtc/PeerConnection$RTCConfiguration;Le33/u;)Lorg/webrtc/PeerConnection;

    move-result-object v9

    invoke-virtual {v3}, Le33/j0;->c()Lb23/k;

    move-result-object v3

    iget-object v11, v3, Lb23/k;->c:Lb23/e;

    sget-object v12, Lb23/g;->y:Lb23/g;

    iget-object v14, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v11, v12, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_79

    iget-object v11, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "type "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, " "

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, " is now monitoring "

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    invoke-interface {v11, v12, v3, v13, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_79
    invoke-virtual {v4, v9}, Le33/u;->h(Lorg/webrtc/PeerConnection;)V

    :try_start_8
    iget-object v3, v5, Lorg/webrtc/PeerConnection$RTCConfiguration;->iceServers:Ljava/util/List;

    const-string v9, "iceServers"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v3

    check-cast v16, Ljava/lang/Iterable;

    sget-object v20, Le33/f0;->w:Le33/f0;

    const/16 v21, 0x1f

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v3

    iget-object v9, v5, Lorg/webrtc/PeerConnection$RTCConfiguration;->bundlePolicy:Lorg/webrtc/PeerConnection$BundlePolicy;

    iget-object v5, v5, Lorg/webrtc/PeerConnection$RTCConfiguration;->sdpSemantics:Lorg/webrtc/PeerConnection$SdpSemantics;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " , budlePolicy="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sdpSemantics="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    goto :goto_3e

    :catch_1
    move-exception v0

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7a

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v5, v2, v1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7a
    const/4 v0, 0x0

    :goto_3e
    iget-object v1, v4, Le33/u;->j:Ll53/m;

    sget-object v2, Ll53/a;->x:[Ll53/a;

    const-string v2, "create"

    invoke-virtual {v1, v0, v2}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, 0x0

    invoke-virtual {v10, v14, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_7b
    :goto_3f
    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    const/4 v1, 0x1

    iput v1, v6, Ld30/o;->x:I

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7c

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "[connectRtc] #sfu; #track; no args"

    const/4 v14, 0x0

    invoke-interface {v2, v3, v1, v4, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7c
    iget-object v1, v0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le33/n;

    if-eqz v1, :cond_81

    iget-object v1, v0, Ld33/h1;->H:Lhc3/d;

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v3, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7d

    iget-object v4, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    const-string v5, "[trackPublishing] listenToMediaChanges"

    const/4 v14, 0x0

    invoke-interface {v4, v3, v2, v5, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_40

    :cond_7d
    const/4 v14, 0x0

    :goto_40
    iget-object v2, v0, Ld33/h1;->I:Lbc3/c2;

    if-eqz v2, :cond_7e

    invoke-virtual {v2, v14}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_7e
    new-instance v2, Ld33/m;

    const/4 v3, 0x7

    invoke-direct {v2, v0, v14, v3}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v1, v14, v14, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v2

    iput-object v2, v0, Ld33/h1;->I:Lbc3/c2;

    iget-object v2, v0, Ld33/h1;->J:Lbc3/c2;

    if-eqz v2, :cond_7f

    invoke-virtual {v2, v14}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_7f
    new-instance v2, Ld33/m;

    const/16 v4, 0x8

    invoke-direct {v2, v0, v14, v4}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v1, v14, v14, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v2

    iput-object v2, v0, Ld33/h1;->J:Lbc3/c2;

    iget-object v2, v0, Ld33/h1;->K:Lbc3/c2;

    if-eqz v2, :cond_80

    invoke-virtual {v2, v14}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_80
    new-instance v2, Ld33/m;

    const/16 v4, 0x9

    invoke-direct {v2, v0, v14, v4}, Ld33/m;-><init>(Ld33/h1;Lq83/d;I)V

    invoke-static {v1, v14, v14, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v0, Ld33/h1;->K:Lbc3/c2;

    :cond_81
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ld33/h1;->H(Z)V

    if-ne v7, v8, :cond_82

    goto :goto_43

    :cond_82
    :goto_41
    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    const/4 v13, 0x2

    iput v13, v6, Ld30/o;->x:I

    invoke-static {v0, v0, v6}, Ld33/h1;->c(Ld33/h1;Ld33/h1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_83

    goto :goto_43

    :cond_83
    :goto_42
    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    iget-object v0, v0, Ld33/h1;->A:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/n;

    if-eqz v0, :cond_84

    iget-object v0, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    const/4 v3, 0x3

    iput v3, v6, Ld30/o;->x:I

    invoke-static {v0, v0, v6}, Ld33/h1;->b(Ld33/h1;Ld33/h1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_84

    :goto_43
    move-object v7, v8

    :cond_84
    :goto_44
    return-object v7

    :pswitch_19
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ld30/f0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v6, Ld30/o;->x:I

    if-eqz v3, :cond_86

    const/4 v4, 0x1

    if-ne v3, v4, :cond_85

    iget-object v2, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 v4, 0x1

    goto :goto_45

    :cond_85
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_86
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    iput-object v3, v6, Ld30/o;->z:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v6, Ld30/o;->x:I

    const-wide/16 v7, 0x32

    invoke-static {v7, v8, v6}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_87

    move-object v0, v2

    goto/16 :goto_48

    :cond_87
    move-object v2, v3

    :goto_45
    invoke-static {v2}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v2

    if-nez v2, :cond_88

    goto/16 :goto_48

    :cond_88
    iput-boolean v4, v1, Ld30/f0;->a:Z

    iget-object v2, v1, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashMap;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_89
    :goto_46
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_89

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v3, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_46

    :cond_8a
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8b
    :goto_47
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_8b

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_47

    :cond_8c
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    iget-object v1, v1, Ld30/f0;->d:Ljava/lang/Object;

    check-cast v1, Ld30/i;

    invoke-virtual {v1, v3, v2}, Ld30/i;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_48
    return-object v0

    :pswitch_1a
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_8e

    const/4 v4, 0x1

    if-eq v1, v4, :cond_8d

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_49

    :cond_8e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lec3/t1;

    new-instance v2, Lu;

    iget-object v3, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v3, Ld30/v;

    const/4 v4, 0x6

    invoke-direct {v2, v3, v4}, Lu;-><init>(Ljava/lang/Object;I)V

    const/4 v4, 0x1

    iput v4, v6, Ld30/o;->x:I

    invoke-interface {v1, v2, v6}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_8f

    return-object v0

    :cond_8f
    :goto_49
    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :pswitch_1b
    move v4, v11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_91

    if-eq v1, v4, :cond_90

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_90
    invoke-static/range {p1 .. p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_91
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v1, Ld30/u;

    iget-object v1, v1, Ld30/u;->s:Ln53/e;

    new-instance v2, Ld11/h;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ld11/h;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    new-instance v2, Ld30/s;

    iget-object v3, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v3, Le30/c;

    invoke-direct {v2, v3, v7}, Ld30/s;-><init>(Le30/c;I)V

    const/4 v4, 0x1

    iput v4, v6, Ld30/o;->x:I

    invoke-virtual {v1, v2, v6}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    :pswitch_1c
    move v4, v11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ld30/o;->x:I

    if-eqz v1, :cond_93

    if-eq v1, v4, :cond_92

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_92
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4a

    :cond_93
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v6, Ld30/o;->z:Ljava/lang/Object;

    check-cast v1, Lec3/f2;

    new-instance v2, Ld30/n;

    iget-object v3, v6, Ld30/o;->y:Ljava/lang/Object;

    check-cast v3, Ld30/u;

    invoke-direct {v2, v3, v7}, Ld30/n;-><init>(Ld30/u;I)V

    const/4 v4, 0x1

    iput v4, v6, Ld30/o;->x:I

    invoke-interface {v1, v2, v6}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_94

    return-object v0

    :cond_94
    :goto_4a
    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

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
