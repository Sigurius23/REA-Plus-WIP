.class public final synthetic Lev2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lev2/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lev2/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lyb3/k;

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->a(Lyb3/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lyb3/k;

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->b(Lyb3/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lk2/c;

    invoke-static {p1}, Lf11/d;->a(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lf11/d;->g(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    new-instance p1, Lf1/b1;

    invoke-direct {p1, v0, v1}, Lf1/b1;-><init>(J)V

    return-object p1

    :pswitch_4
    check-cast p1, Ld0/o;

    iget v0, p1, Ld0/o;->a:F

    iget p1, p1, Ld0/o;->b:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v2, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    new-instance p1, Lh2/b;

    invoke-direct {p1, v0, v1}, Lh2/b;-><init>(J)V

    return-object p1

    :pswitch_5
    check-cast p1, Lh2/b;

    iget-wide v0, p1, Lh2/b;->a:J

    const-wide v2, 0x7fffffff7fffffffL

    and-long/2addr v2, v0

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    new-instance v2, Ld0/o;

    const/16 v3, 0x20

    shr-long/2addr v0, v3

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget-wide v3, p1, Lh2/b;->a:J

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int p1, v3

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-direct {v2, v0, p1}, Ld0/o;-><init>(FF)V

    goto :goto_0

    :cond_0
    sget-object v2, Lf1/s0;->a:Ld0/o;

    :goto_0
    return-object v2

    :pswitch_6
    invoke-static {p1}, Lf01/t1;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1}, Lf01/o1;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lk2/c;

    invoke-static {p1}, Lf01/n0;->k(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Lf01/d0;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1}, Lf01/z;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-static {p1}, Lf01/t;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1}, Lf01/n;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1}, Lf01/g;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lcom/stripe/android/link/serialization/PopupPayload;->a(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    check-cast p1, Lk2/c;

    check-cast p1, La3/p0;

    invoke-virtual {p1}, La3/p0;->a()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lez2/a;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lcy0/a;

    invoke-static {p1}, Ley0/i;->a(Lcy0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lcy0/a;

    invoke-static {p1}, Ley0/i;->d(Lcy0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lm91/q;

    invoke-static {p1}, Ley0/g;->k(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {p1}, Ley0/g;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lew1/a;->a(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lk2/c;

    invoke-static {p1}, Lev2/u;->B(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lo11/m$c$b;

    invoke-static {p1}, Lev2/u;->E(Lo11/m$c$b;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lm91/a;

    invoke-static {p1}, Lev2/u;->Q(Lm91/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ldv2/b;

    invoke-static {p1}, Lev2/u;->H(Ldv2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lo11/m$c$b;

    invoke-static {p1}, Lev2/n;->c(Lo11/m$c$b;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lm91/a;

    invoke-static {p1}, Lev2/n;->f(Lm91/a;)Ljava/lang/Object;

    move-result-object p1

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
