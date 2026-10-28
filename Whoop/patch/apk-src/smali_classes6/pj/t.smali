.class public final synthetic Lpj/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amplitude/quickjs/wrapper/JSCallFunction;


# instance fields
.field public final synthetic a:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj/t;->a:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const-string v0, "$pinNudgePosition$delegate"

    iget-object v1, p0, Lpj/t;->a:Lp1/c1;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    const-string v2, "null cannot be cast to non-null type com.amplitude.quickjs.wrapper.QuickJSObject"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/amplitude/quickjs/wrapper/QuickJSObject;

    const-string v2, "x"

    invoke-virtual {p1, v2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.Number"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Number;

    const-string v5, "y"

    invoke-virtual {p1, v5}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Number;

    const-string v4, "arrow"

    invoke-virtual {p1, v4}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/amplitude/quickjs/wrapper/QuickJSObject;

    const/4 v7, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v4, v2}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v7

    :goto_0
    check-cast v2, Ljava/lang/Number;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v5}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v7

    :goto_1
    check-cast v4, Ljava/lang/Number;

    const-string v5, "placement"

    invoke-virtual {p1, v5}, Lcom/amplitude/quickjs/wrapper/QuickJSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v5, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v5, "toLowerCase(...)"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v5, "left-end"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_2

    :cond_2
    const/16 v0, 0xc

    goto/16 :goto_2

    :sswitch_1
    const-string v5, "bottom-start"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_2

    :cond_3
    const/16 v0, 0x9

    goto/16 :goto_2

    :sswitch_2
    const-string v5, "left-start"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_2

    :cond_4
    const/16 v0, 0xb

    goto/16 :goto_2

    :sswitch_3
    const-string v5, "right"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_2

    :cond_5
    const/4 v0, 0x2

    goto/16 :goto_2

    :sswitch_4
    const-string v5, "left"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x4

    goto :goto_2

    :sswitch_5
    const-string v5, "top"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x1

    goto :goto_2

    :sswitch_6
    const-string v5, "top-end"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_2

    :cond_8
    const/4 v0, 0x6

    goto :goto_2

    :sswitch_7
    const-string v5, "top-start"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_2

    :cond_9
    const/4 v0, 0x5

    goto :goto_2

    :sswitch_8
    const-string v5, "bottom"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    const/4 v0, 0x3

    goto :goto_2

    :sswitch_9
    const-string v5, "right-start"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_2

    :cond_b
    const/4 v0, 0x7

    goto :goto_2

    :sswitch_a
    const-string v5, "right-end"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_2

    :cond_c
    const/16 v0, 0x8

    goto :goto_2

    :sswitch_b
    const-string v5, "bottom-end"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_2

    :cond_d
    const/16 v0, 0xa

    :goto_2
    new-instance p1, Lpj/p;

    new-instance v5, Lpj/f;

    invoke-direct {v5, v3, v6}, Lpj/f;-><init>(Ljava/lang/Number;Ljava/lang/Number;)V

    new-instance v3, Lpj/f;

    invoke-direct {v3, v2, v4}, Lpj/f;-><init>(Ljava/lang/Number;Ljava/lang/Number;)V

    invoke-direct {p1, v5, v0, v3}, Lpj/p;-><init>(Lpj/f;ILpj/f;)V

    invoke-interface {v1, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v7

    :sswitch_data_0
    .sparse-switch
        -0x645b75c7 -> :sswitch_b
        -0x5d98ae56 -> :sswitch_a
        -0x595e6a8f -> :sswitch_9
        -0x527265d5 -> :sswitch_8
        -0x4e4c7a16 -> :sswitch_7
        -0x4402f39d -> :sswitch_6
        0x1c155 -> :sswitch_5
        0x32a007 -> :sswitch_4
        0x677c21c -> :sswitch_3
        0x3d5b171c -> :sswitch_2
        0x4572e640 -> :sswitch_1
        0x665b4215 -> :sswitch_0
    .end sparse-switch
.end method
