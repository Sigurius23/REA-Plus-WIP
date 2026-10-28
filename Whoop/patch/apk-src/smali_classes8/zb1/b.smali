.class public abstract Lzb1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzb1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;",
        "style",
        "Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;",
        "theme",
        "Li91/a;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)Li91/a;",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)Li91/a;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;->getBarColor()Ly81/f;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, -0x1

    goto :goto_0

    :cond_1
    sget-object p1, Lzb1/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    sget-object p0, Lzb1/b$y;->w:Lzb1/b$y;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_0
    sget-object p0, Lzb1/b$x;->w:Lzb1/b$x;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_1
    sget-object p0, Lzb1/b$w;->w:Lzb1/b$w;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_2
    sget-object p0, Lzb1/b$u;->w:Lzb1/b$u;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_3
    sget-object p0, Lzb1/b$t;->w:Lzb1/b$t;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_4
    sget-object p0, Lzb1/b$s;->w:Lzb1/b$s;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_5
    sget-object p0, Lzb1/b$r;->w:Lzb1/b$r;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_6
    sget-object p0, Lzb1/b$q;->w:Lzb1/b$q;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_7
    sget-object p0, Lzb1/b$p;->w:Lzb1/b$p;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_8
    sget-object p0, Lzb1/b$o;->w:Lzb1/b$o;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_9
    sget-object p0, Lzb1/b$n;->w:Lzb1/b$n;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_a
    sget-object p0, Lzb1/b$m;->w:Lzb1/b$m;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_b
    sget-object p0, Lzb1/b$l;->w:Lzb1/b$l;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_c
    sget-object p0, Lzb1/b$k;->w:Lzb1/b$k;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_d
    sget-object p0, Lzb1/b$j;->w:Lzb1/b$j;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_e
    sget-object p0, Lzb1/b$i;->w:Lzb1/b$i;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_f
    sget-object p0, Lzb1/b$h;->w:Lzb1/b$h;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_10
    sget-object p0, Lzb1/b$g;->w:Lzb1/b$g;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_11
    sget-object p0, Lzb1/b$f;->w:Lzb1/b$f;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_12
    sget-object p0, Lzb1/b$e;->w:Lzb1/b$e;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_13
    sget-object p0, Lzb1/b$d;->w:Lzb1/b$d;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_14
    sget-object p0, Lzb1/b$c;->w:Lzb1/b$c;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_15
    sget-object p0, Lzb1/b$b;->w:Lzb1/b$b;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_16
    sget-object p0, Lzb1/b$f0;->w:Lzb1/b$f0;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_17
    sget-object p0, Lzb1/b$e0;->w:Lzb1/b$e0;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_18
    sget-object p0, Lzb1/b$d0;->w:Lzb1/b$d0;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_19
    sget-object p0, Lzb1/b$c0;->w:Lzb1/b$c0;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_1a
    sget-object p0, Lzb1/b$b0;->w:Lzb1/b$b0;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_1b
    sget-object p0, Lzb1/b$a0;->w:Lzb1/b$a0;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_1c
    sget-object p0, Lzb1/b$z;->w:Lzb1/b$z;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    :pswitch_1d
    sget-object p0, Lzb1/b$v;->w:Lzb1/b$v;

    invoke-static {p0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1d
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
