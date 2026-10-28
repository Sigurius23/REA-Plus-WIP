.class public final Lug3/c;
.super Lpg3/m;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lug3/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 0

    iget p2, p0, Lug3/c;->a:I

    packed-switch p2, :pswitch_data_0

    instance-of p2, p1, Ljava/lang/Class;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/lang/Class;

    const-class p2, Lcom/squareup/wire/l;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_1

    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lcom/squareup/wire/q;->get(Ljava/lang/Class;)Lcom/squareup/wire/q;

    move-result-object p1

    new-instance p2, Lvg3/a;

    invoke-direct {p2, p1}, Lvg3/a;-><init>(Lcom/squareup/wire/q;)V

    move-object p1, p2

    :goto_1
    return-object p1

    :pswitch_0
    const-class p2, Ljava/lang/String;

    if-eq p1, p2, :cond_3

    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_3

    const-class p2, Ljava/lang/Boolean;

    if-eq p1, p2, :cond_3

    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_3

    const-class p2, Ljava/lang/Byte;

    if-eq p1, p2, :cond_3

    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_3

    const-class p2, Ljava/lang/Character;

    if-eq p1, p2, :cond_3

    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_3

    const-class p2, Ljava/lang/Double;

    if-eq p1, p2, :cond_3

    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_3

    const-class p2, Ljava/lang/Float;

    if-eq p1, p2, :cond_3

    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_3

    const-class p2, Ljava/lang/Integer;

    if-eq p1, p2, :cond_3

    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_3

    const-class p2, Ljava/lang/Long;

    if-eq p1, p2, :cond_3

    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_3

    const-class p2, Ljava/lang/Short;

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    sget-object p1, Lug3/a;->w:Lug3/a;

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 0

    iget p2, p0, Lug3/c;->a:I

    packed-switch p2, :pswitch_data_0

    instance-of p2, p1, Ljava/lang/Class;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/lang/Class;

    const-class p2, Lcom/squareup/wire/l;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_1

    :goto_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lcom/squareup/wire/q;->get(Ljava/lang/Class;)Lcom/squareup/wire/q;

    move-result-object p1

    new-instance p2, Lty/c;

    const/16 p3, 0xb

    invoke-direct {p2, p1, p3}, Lty/c;-><init>(Ljava/lang/Object;I)V

    move-object p1, p2

    :goto_1
    return-object p1

    :pswitch_0
    const-class p2, Ljava/lang/String;

    if-ne p1, p2, :cond_2

    sget-object p1, Lug3/b;->J:Lug3/b;

    goto/16 :goto_a

    :cond_2
    const-class p2, Ljava/lang/Boolean;

    if-eq p1, p2, :cond_12

    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_3

    goto/16 :goto_9

    :cond_3
    const-class p2, Ljava/lang/Byte;

    if-eq p1, p2, :cond_11

    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_4

    goto :goto_8

    :cond_4
    const-class p2, Ljava/lang/Character;

    if-eq p1, p2, :cond_10

    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_5

    goto :goto_7

    :cond_5
    const-class p2, Ljava/lang/Double;

    if-eq p1, p2, :cond_f

    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_6

    goto :goto_6

    :cond_6
    const-class p2, Ljava/lang/Float;

    if-eq p1, p2, :cond_e

    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_7

    goto :goto_5

    :cond_7
    const-class p2, Ljava/lang/Integer;

    if-eq p1, p2, :cond_d

    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_8

    goto :goto_4

    :cond_8
    const-class p2, Ljava/lang/Long;

    if-eq p1, p2, :cond_c

    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_9

    goto :goto_3

    :cond_9
    const-class p2, Ljava/lang/Short;

    if-eq p1, p2, :cond_b

    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_a

    goto :goto_2

    :cond_a
    const/4 p1, 0x0

    goto :goto_a

    :cond_b
    :goto_2
    sget-object p1, Lug3/b;->I:Lug3/b;

    goto :goto_a

    :cond_c
    :goto_3
    sget-object p1, Lug3/b;->H:Lug3/b;

    goto :goto_a

    :cond_d
    :goto_4
    sget-object p1, Lug3/b;->G:Lug3/b;

    goto :goto_a

    :cond_e
    :goto_5
    sget-object p1, Lug3/b;->F:Lug3/b;

    goto :goto_a

    :cond_f
    :goto_6
    sget-object p1, Lug3/b;->E:Lug3/b;

    goto :goto_a

    :cond_10
    :goto_7
    sget-object p1, Lug3/b;->z:Lug3/b;

    goto :goto_a

    :cond_11
    :goto_8
    sget-object p1, Lug3/b;->y:Lug3/b;

    goto :goto_a

    :cond_12
    :goto_9
    sget-object p1, Lug3/b;->x:Lug3/b;

    :goto_a
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
