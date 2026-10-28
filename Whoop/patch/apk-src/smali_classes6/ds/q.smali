.class public abstract Lds/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lo2/e;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lds/q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Lkotlin/jvm/functions/Function1;)Lbe/g;
    .locals 2

    new-instance v0, Lbe/g;

    new-instance v1, Lbe/c;

    invoke-direct {v1}, Lbe/c;-><init>()V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v1}, Lbe/g;-><init>(Lbe/c;)V

    return-object v0
.end method

.method public static B(B)Z
    .locals 1

    const/16 v0, -0x41

    if-le p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final C(Lpf/a;)Lpf/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lqf/c;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Lpf/a;

    if-eqz v0, :cond_1

    new-instance v0, Lqf/c;

    check-cast p0, Lpf/a;

    invoke-direct {v0, p0}, Lqf/c;-><init>(Lpf/a;)V

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static D(D)Lr7/d;
    .locals 2

    new-instance v0, Lr7/d;

    sget-object v1, Lr7/c;->w:Lr7/b;

    invoke-direct {v0, p0, p1, v1}, Lr7/d;-><init>(DLr7/c;)V

    return-object v0
.end method

.method public static final E(Lbi/t;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lci/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lci/c;

    iget v1, v0, Lci/c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lci/c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lci/c;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lci/c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lci/c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lci/c;->x:Lne3/h;

    iget-object v0, v0, Lci/c;->w:Lbi/t;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, Lci/c;->w:Lbi/t;

    iput-object p1, v0, Lci/c;->x:Lne3/h;

    iput v3, v0, Lci/c;->z:I

    iget-object v0, p0, Lbi/t;->w:Lne3/j;

    invoke-interface {v0, p1}, Lne3/j;->P0(Lne3/i;)J

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object p0, p1

    :goto_1
    const/4 p1, 0x0

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object p0

    :goto_2
    move-object v0, p0

    move-object p0, p1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_3
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception p1

    invoke-static {v0, p0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static F(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    goto/16 :goto_0

    :pswitch_0
    const-string v0, "kotlin.jvm.functions.Function9"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string p0, "Function9"

    return-object p0

    :pswitch_1
    const-string v0, "kotlin.jvm.functions.Function8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string p0, "Function8"

    return-object p0

    :pswitch_2
    const-string v0, "kotlin.jvm.functions.Function7"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string p0, "Function7"

    return-object p0

    :pswitch_3
    const-string v0, "kotlin.jvm.functions.Function6"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const-string p0, "Function6"

    return-object p0

    :pswitch_4
    const-string v0, "kotlin.jvm.functions.Function5"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const-string p0, "Function5"

    return-object p0

    :pswitch_5
    const-string v0, "kotlin.jvm.functions.Function4"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const-string p0, "Function4"

    return-object p0

    :pswitch_6
    const-string v0, "kotlin.jvm.functions.Function3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const-string p0, "Function3"

    return-object p0

    :pswitch_7
    const-string v0, "kotlin.jvm.functions.Function2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const-string p0, "Function2"

    return-object p0

    :pswitch_8
    const-string v0, "kotlin.jvm.functions.Function1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const-string p0, "Function1"

    return-object p0

    :pswitch_9
    const-string v0, "kotlin.jvm.functions.Function0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const-string p0, "Function0"

    return-object p0

    :pswitch_a
    const-string v0, "kotlin.jvm.functions.Function22"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const-string p0, "Function22"

    return-object p0

    :pswitch_b
    const-string v0, "kotlin.jvm.functions.Function21"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const-string p0, "Function21"

    return-object p0

    :pswitch_c
    const-string v0, "kotlin.jvm.functions.Function20"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const-string p0, "Function20"

    return-object p0

    :pswitch_d
    const-string v0, "kotlin.jvm.functions.Function19"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const-string p0, "Function19"

    return-object p0

    :pswitch_e
    const-string v0, "kotlin.jvm.functions.Function18"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto/16 :goto_0

    :cond_e
    const-string p0, "Function18"

    return-object p0

    :pswitch_f
    const-string v0, "kotlin.jvm.functions.Function17"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_0

    :cond_f
    const-string p0, "Function17"

    return-object p0

    :pswitch_10
    const-string v0, "kotlin.jvm.functions.Function16"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto/16 :goto_0

    :cond_10
    const-string p0, "Function16"

    return-object p0

    :pswitch_11
    const-string v0, "kotlin.jvm.functions.Function15"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto/16 :goto_0

    :cond_11
    const-string p0, "Function15"

    return-object p0

    :pswitch_12
    const-string v0, "kotlin.jvm.functions.Function14"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto/16 :goto_0

    :cond_12
    const-string p0, "Function14"

    return-object p0

    :pswitch_13
    const-string v0, "kotlin.jvm.functions.Function13"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto/16 :goto_0

    :cond_13
    const-string p0, "Function13"

    return-object p0

    :pswitch_14
    const-string v0, "kotlin.jvm.functions.Function12"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto/16 :goto_0

    :cond_14
    const-string p0, "Function12"

    return-object p0

    :pswitch_15
    const-string v0, "kotlin.jvm.functions.Function11"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto/16 :goto_0

    :cond_15
    const-string p0, "Function11"

    return-object p0

    :pswitch_16
    const-string v0, "kotlin.jvm.functions.Function10"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto/16 :goto_0

    :cond_16
    const-string p0, "Function10"

    return-object p0

    :sswitch_0
    const-string v0, "kotlin.jvm.internal.IntCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "java.lang.Throwable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto/16 :goto_0

    :cond_17
    const-string p0, "Throwable"

    return-object p0

    :sswitch_2
    const-string v0, "kotlin.jvm.internal.BooleanCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "java.lang.Iterable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto/16 :goto_0

    :cond_18
    const-string p0, "Iterable"

    return-object p0

    :sswitch_4
    const-string v0, "java.lang.String"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto/16 :goto_0

    :cond_19
    const-string p0, "String"

    return-object p0

    :sswitch_5
    const-string v0, "java.lang.Object"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const-string p0, "Any"

    return-object p0

    :sswitch_6
    const-string v0, "java.lang.Number"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const-string p0, "Number"

    return-object p0

    :sswitch_7
    const-string v0, "java.lang.Double"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_29

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "kotlin.jvm.internal.StringCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "java.util.ListIterator"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const-string p0, "ListIterator"

    return-object p0

    :sswitch_a
    const-string v0, "java.util.Iterator"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const-string p0, "Iterator"

    return-object p0

    :sswitch_b
    const-string v0, "kotlin.jvm.internal.FloatCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "java.lang.Long"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_21

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "java.lang.Enum"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const-string p0, "Enum"

    return-object p0

    :sswitch_e
    const-string v0, "java.lang.Byte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_23

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "java.lang.Boolean"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "kotlin.jvm.internal.EnumCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "java.lang.Character"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "short"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_25

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "float"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "kotlin.jvm.internal.ShortCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "java.util.List"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const-string p0, "List"

    return-object p0

    :sswitch_16
    const-string v0, "boolean"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto/16 :goto_0

    :cond_20
    const-string p0, "Boolean"

    return-object p0

    :sswitch_17
    const-string v0, "long"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_21

    goto/16 :goto_0

    :cond_21
    const-string p0, "Long"

    return-object p0

    :sswitch_18
    const-string v0, "char"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    goto/16 :goto_0

    :cond_22
    const-string p0, "Char"

    return-object p0

    :sswitch_19
    const-string v0, "byte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_23

    goto/16 :goto_0

    :cond_23
    const-string p0, "Byte"

    return-object p0

    :sswitch_1a
    const-string v0, "int"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2f

    goto/16 :goto_0

    :sswitch_1b
    const-string v0, "java.util.Map$Entry"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_24

    goto/16 :goto_0

    :cond_24
    const-string p0, "Entry"

    return-object p0

    :sswitch_1c
    const-string v0, "kotlin.jvm.internal.LongCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_1d
    const-string v0, "kotlin.jvm.internal.CharCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :sswitch_1e
    const-string v0, "java.lang.Short"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_25

    goto/16 :goto_0

    :cond_25
    const-string p0, "Short"

    return-object p0

    :sswitch_1f
    const-string v0, "java.lang.Float"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    goto/16 :goto_0

    :cond_26
    const-string p0, "Float"

    return-object p0

    :sswitch_20
    const-string v0, "java.util.Collection"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_27

    goto/16 :goto_0

    :cond_27
    const-string p0, "Collection"

    return-object p0

    :sswitch_21
    const-string v0, "java.lang.CharSequence"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_28

    goto/16 :goto_0

    :cond_28
    const-string p0, "CharSequence"

    return-object p0

    :sswitch_22
    const-string v0, "kotlin.jvm.internal.ByteCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto :goto_0

    :sswitch_23
    const-string v0, "double"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_29

    goto :goto_0

    :cond_29
    const-string p0, "Double"

    return-object p0

    :sswitch_24
    const-string v0, "java.util.Set"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2a

    goto :goto_0

    :cond_2a
    const-string p0, "Set"

    return-object p0

    :sswitch_25
    const-string v0, "java.util.Map"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2b

    goto :goto_0

    :cond_2b
    const-string p0, "Map"

    return-object p0

    :sswitch_26
    const-string v0, "java.lang.Comparable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2c

    goto :goto_0

    :cond_2c
    const-string p0, "Comparable"

    return-object p0

    :sswitch_27
    const-string v0, "java.lang.annotation.Annotation"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2d

    goto :goto_0

    :cond_2d
    const-string p0, "Annotation"

    return-object p0

    :sswitch_28
    const-string v0, "java.lang.Cloneable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2e

    goto :goto_0

    :cond_2e
    const-string p0, "Cloneable"

    return-object p0

    :sswitch_29
    const-string v0, "java.lang.Integer"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2f

    goto :goto_0

    :cond_2f
    const-string p0, "Int"

    return-object p0

    :sswitch_2a
    const-string v0, "kotlin.jvm.internal.DoubleCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_30
    const-string p0, "Companion"

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ae0c43d -> :sswitch_2a
        -0x7a988a96 -> :sswitch_29
        -0x793eea9d -> :sswitch_28
        -0x75fda146 -> :sswitch_27
        -0x5dab6ad2 -> :sswitch_26
        -0x52743c64 -> :sswitch_25
        -0x5274255e -> :sswitch_24
        -0x4f08842f -> :sswitch_23
        -0x46781814 -> :sswitch_22
        -0x3f507f75 -> :sswitch_21
        -0x2906f7a2 -> :sswitch_20
        -0x1f76ce78 -> :sswitch_1f
        -0x1ec16c58 -> :sswitch_1e
        -0xeb0f022 -> :sswitch_1d
        -0xc5a9408 -> :sswitch_1c
        -0x9d7d2b6 -> :sswitch_1b
        0x197ef -> :sswitch_1a
        0x2e6108 -> :sswitch_19
        0x2e9356 -> :sswitch_18
        0x32c67c -> :sswitch_17
        0x3db6c28 -> :sswitch_16
        0x3ec5a5e -> :sswitch_15
        0x49a71c6 -> :sswitch_14
        0x5d0225c -> :sswitch_13
        0x685847c -> :sswitch_12
        0x9415455 -> :sswitch_11
        0xd7b22d3 -> :sswitch_10
        0x148d6054 -> :sswitch_f
        0x17c0bc5c -> :sswitch_e
        0x17c1f055 -> :sswitch_d
        0x17c521d0 -> :sswitch_c
        0x1cc457e6 -> :sswitch_b
        0x1dcad22e -> :sswitch_a
        0x226988ec -> :sswitch_9
        0x23b44f83 -> :sswitch_8
        0x2d605225 -> :sswitch_7
        0x3ec1b19d -> :sswitch_6
        0x3f697993 -> :sswitch_5
        0x473e3665 -> :sswitch_4
        0x4c0855c6 -> :sswitch_3
        0x52797ada -> :sswitch_2
        0x612cf26c -> :sswitch_1
        0x6fe35bb3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch -0x6bf3d83c
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
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x6bf3d81d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x4c695eb
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

.method public static G(ILwm/j;Led3/a;)Lbb/f;
    .locals 6

    invoke-static {p1, p2}, Lbb/f;->b(Lwm/j;Led3/a;)Lbb/f;

    move-result-object v0

    :goto_0
    iget v1, v0, Lbb/f;->a:I

    if-eq v1, p0, :cond_1

    const/16 v2, 0x27

    const-string v3, "Ignoring unknown WAV chunk: "

    const-string v4, "WavHeaderReader"

    invoke-static {v2, v1, v3, v4}, Lq63/c;->t(IILjava/lang/String;Ljava/lang/String;)V

    const-wide/16 v2, 0x8

    iget-wide v4, v0, Lbb/f;->b:J

    add-long/2addr v4, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v4, v2

    if-gtz v0, :cond_0

    long-to-int v0, v4

    invoke-interface {p1, v0}, Lwm/j;->n(I)V

    invoke-static {p1, p2}, Lbb/f;->b(Lwm/j;Led3/a;)Lbb/f;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    const/16 p1, 0x33

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "Chunk is too large (~2GB+) to skip; id: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/exoplayer2/ParserException;->c(Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p0

    throw p0

    :cond_1
    return-object v0
.end method

.method public static final H(Lr93/x0;)Llb3/y;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lr93/i;

    const-string v2, "getUpperBounds(...)"

    const-string v3, "getTypeConstructor(...)"

    const/16 v4, 0xa

    if-eqz v1, :cond_1

    check-cast v0, Lr93/i;

    invoke-interface {v0}, Lr93/h;->e()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v0

    const-string v1, "getParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/x0;

    invoke-interface {v4}, Lr93/x0;->e()Llb3/q0;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object p0

    invoke-static {v1, v0, p0}, Lds/q;->n(Ljava/util/ArrayList;Ljava/util/List;Lo93/h;)Llb3/y;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v1, v0, Lr93/w;

    if-eqz v1, :cond_3

    check-cast v0, Lr93/w;

    invoke-interface {v0}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/x0;

    invoke-interface {v4}, Lr93/x0;->e()Llb3/q0;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object p0

    invoke-static {v1, v0, p0}, Lds/q;->n(Ljava/util/ArrayList;Ljava/util/List;Lo93/h;)Llb3/y;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported descriptor type to build star projection type based on type parameters of it"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final I(Le10/v;)Lk20/h;
    .locals 2

    iget-object v0, p0, Le10/v;->c:Le10/u;

    sget-object v1, Le10/o;->a:Le10/o;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Lk20/e;->w:Lk20/e;

    return-object p0

    :cond_0
    sget-object v1, Le10/t;->a:Le10/t;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lk20/g;

    iget-object p0, p0, Le10/v;->a:Ljava/lang/Throwable;

    invoke-direct {v0, p0}, Lk20/g;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :cond_1
    instance-of p0, v0, Le10/q;

    if-eqz p0, :cond_2

    new-instance p0, Lk20/f;

    check-cast v0, Le10/q;

    iget v0, v0, Le10/q;->a:I

    invoke-direct {p0, v0}, Lk20/f;-><init>(I)V

    return-object p0

    :cond_2
    sget-object p0, Le10/r;->a:Le10/r;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    sget-object p0, Le10/s;->a:Le10/s;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    sget-object p0, Le10/p;->a:Le10/p;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final J(Lq20/t;)Le10/l;
    .locals 5

    invoke-virtual {p0}, Lq20/t;->i()Ly00/d5;

    move-result-object v0

    iget-object v0, v0, Ly00/d5;->w:Ljava/lang/String;

    sget-object v1, Ly00/f4;->G:Lt9/c0;

    const-string v1, "bacs_debit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lg10/b;

    invoke-virtual {p0}, Lq20/t;->i()Ly00/d5;

    move-result-object v1

    invoke-virtual {p0}, Lq20/t;->s()Ly00/u5;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lg10/b;-><init>(Ly00/d5;Ly00/u5;)V

    return-object v0

    :cond_0
    new-instance v0, Le10/t0;

    invoke-virtual {p0}, Lq20/t;->i()Ly00/d5;

    move-result-object v1

    invoke-virtual {p0}, Lq20/t;->s()Ly00/u5;

    move-result-object v2

    invoke-virtual {p0}, Lq20/t;->k()Ly00/j5;

    move-result-object v3

    invoke-virtual {p0}, Lq20/t;->h()Lq20/h;

    move-result-object p0

    sget-object v4, Lq20/h;->x:Lq20/h;

    if-ne p0, v4, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, Le10/t0;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;Z)V

    return-object v0
.end method

.method public static final K(Lq20/y;Lmy/a;Lwz/g0;Lux/b;)Le10/l;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lq20/w;

    const/16 v1, 0x1c

    if-eqz v0, :cond_0

    check-cast p0, Lq20/w;

    new-instance p1, Le10/u0;

    iget-object p2, p0, Lq20/w;->x:Ly00/o4;

    iget-object p0, p0, Lq20/w;->z:Ly00/u5;

    invoke-direct {p1, p2, p0, v1}, Le10/u0;-><init>(Ly00/o4;Ly00/u5;I)V

    return-object p1

    :cond_0
    instance-of v0, p0, Lq20/i;

    if-eqz v0, :cond_1

    check-cast p0, Lq20/i;

    new-instance p1, Lk10/a;

    iget-object p2, p0, Lq20/i;->x:Ljava/lang/String;

    iget-object p0, p0, Lq20/i;->y:Ly00/v3;

    invoke-direct {p1, p2, p0}, Lk10/a;-><init>(Ljava/lang/String;Ly00/v3;)V

    return-object p1

    :cond_1
    instance-of v0, p0, Lq20/g;

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    check-cast p0, Lq20/g;

    iget-object p1, p1, Lmy/a;->P:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Lh20/y1;

    iget-object p3, p3, Lh20/y1;->w:Ljava/lang/String;

    iget-object v0, p0, Lq20/g;->x:Ljava/lang/String;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_3
    move-object p2, v2

    :goto_0
    check-cast p2, Lh20/y1;

    if-eqz p2, :cond_12

    new-instance p1, Li10/b;

    iget-object p0, p0, Lq20/g;->y:Ly00/v3;

    invoke-direct {p1, p2, p0}, Li10/b;-><init>(Lh20/y1;Ly00/v3;)V

    return-object p1

    :cond_4
    instance-of v0, p0, Lq20/s;

    const/4 v3, 0x1

    if-eqz v0, :cond_7

    check-cast p0, Lq20/s;

    iget-object p1, p0, Lq20/s;->I:Ly00/u5;

    iget-object p2, p0, Lq20/s;->F:Lq20/r;

    if-eqz p2, :cond_5

    new-instance p0, Le10/u0;

    iget-object p2, p2, Lq20/r;->w:Ly00/o4;

    invoke-direct {p0, p2, p1, v1}, Le10/u0;-><init>(Ly00/o4;Ly00/u5;I)V

    return-object p0

    :cond_5
    new-instance p2, Le10/t0;

    iget-object p3, p0, Lq20/s;->G:Ly00/d5;

    iget-object v0, p0, Lq20/s;->J:Ly00/j5;

    iget-object p0, p0, Lq20/s;->H:Lq20/h;

    sget-object v1, Lq20/h;->x:Lq20/h;

    if-ne p0, v1, :cond_6

    goto :goto_1

    :cond_6
    const/4 v3, 0x0

    :goto_1
    invoke-direct {p2, p3, p1, v0, v3}, Le10/t0;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;Z)V

    return-object p2

    :cond_7
    instance-of v0, p0, Lq20/n;

    if-eqz v0, :cond_c

    check-cast p0, Lq20/n;

    iget-object p1, p0, Lq20/n;->G:Lj00/i0;

    if-eqz p1, :cond_b

    if-eqz p2, :cond_b

    new-instance v4, Lp10/h;

    iget-object v5, p0, Lq20/n;->x:Ly00/d5;

    iget-object v6, p0, Lq20/n;->E:Ly00/u5;

    iget-object v7, p0, Lq20/n;->F:Ly00/j5;

    iget-object p1, p0, Lq20/n;->z:Lq20/h;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_a

    if-eq p1, v3, :cond_9

    const/4 p3, 0x2

    if-ne p1, p3, :cond_8

    sget-object p1, Lp10/g;->z:Lp10/g;

    :goto_2
    move-object v8, p1

    goto :goto_3

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_9
    sget-object p1, Lp10/g;->y:Lp10/g;

    goto :goto_2

    :cond_a
    sget-object p1, Lp10/g;->x:Lp10/g;

    goto :goto_2

    :goto_3
    iget-object v10, p0, Lq20/n;->G:Lj00/i0;

    move-object v9, p2

    invoke-direct/range {v4 .. v10}, Lp10/h;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;Lp10/g;Lwz/g0;Lj00/i0;)V

    return-object v4

    :cond_b
    invoke-static {p0}, Lds/q;->J(Lq20/t;)Le10/l;

    move-result-object p0

    return-object p0

    :cond_c
    move-object v9, p2

    instance-of p2, p0, Lq20/t;

    if-eqz p2, :cond_d

    check-cast p0, Lq20/t;

    invoke-static {p0}, Lds/q;->J(Lq20/t;)Le10/l;

    move-result-object p0

    return-object p0

    :cond_d
    instance-of p2, p0, Lq20/j;

    if-eqz p2, :cond_e

    check-cast p0, Lq20/j;

    iget-object p0, p1, Lmy/a;->y:Lh20/h2;

    if-eqz p0, :cond_12

    new-instance p2, Ll10/c;

    iget-object v1, p0, Lh20/h2;->w:Lh20/g2;

    iget-object v2, p1, Lmy/a;->w:Ljava/lang/String;

    iget-object v3, p0, Lh20/h2;->x:Ljava/lang/String;

    iget-object v4, p0, Lh20/h2;->y:Ljava/lang/String;

    iget-object v5, p0, Lh20/h2;->z:Ljava/lang/Long;

    iget-object v6, p0, Lh20/h2;->E:Ljava/lang/String;

    iget-object v7, p1, Lmy/a;->I:Lh20/l1;

    iget-object v10, p0, Lh20/h2;->G:Ljava/util/List;

    new-instance v8, Lv00/j0;

    iget-object p0, p1, Lmy/a;->N:Lh20/t1;

    invoke-direct {v8, p0}, Lv00/j0;-><init>(Lh20/t1;)V

    new-instance v0, Ll10/b;

    move-object v9, p3

    invoke-direct/range {v0 .. v10}, Ll10/b;-><init>(Lh20/g2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lh20/l1;Lux/a;Lux/b;Ljava/util/List;)V

    invoke-direct {p2, v0}, Ll10/c;-><init>(Ll10/b;)V

    return-object p2

    :cond_e
    instance-of p2, p0, Lq20/m;

    if-eqz p2, :cond_10

    check-cast p0, Lq20/m;

    if-eqz v9, :cond_12

    iget-object p1, p0, Lq20/m;->x:Lwz/h0;

    iget-object p0, p0, Lq20/m;->y:Lwz/u0;

    if-eqz p0, :cond_f

    new-instance p2, Lwz/k0;

    invoke-direct {p2, p0}, Lwz/k0;-><init>(Lwz/u0;)V

    goto :goto_4

    :cond_f
    sget-object p2, Lwz/l0;->w:Lwz/l0;

    :goto_4
    new-instance p0, Lo10/a;

    invoke-direct {p0, v9, p2, p1}, Lo10/a;-><init>(Lwz/g0;Lwz/n0;Lwz/h0;)V

    return-object p0

    :cond_10
    instance-of p2, p0, Lq20/x;

    if-eqz p2, :cond_13

    check-cast p0, Lq20/x;

    iget-object p0, p1, Lmy/a;->x:Lh20/c2;

    if-eqz p0, :cond_11

    iget-object p0, p0, Lh20/c2;->y:Lh20/b2;

    goto :goto_5

    :cond_11
    move-object p0, v2

    :goto_5
    instance-of p2, p0, Lh20/z1;

    if-eqz p2, :cond_12

    check-cast p0, Lh20/z1;

    iget-object p0, p0, Lh20/z1;->w:Ljava/lang/String;

    iget-object p2, p1, Lmy/a;->Q:Lh20/g3;

    if-eqz p2, :cond_12

    new-instance p3, Lq10/a;

    iget-object p1, p1, Lmy/a;->w:Ljava/lang/String;

    invoke-direct {p3, p2, p0, p1}, Lq10/a;-><init>(Lh20/g3;Ljava/lang/String;Ljava/lang/String;)V

    return-object p3

    :cond_12
    return-object v2

    :cond_13
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static L(I)Ljava/lang/String;
    .locals 7

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result p0

    int-to-double v3, p0

    const-wide v5, 0x406fe00000000000L    # 255.0

    div-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/Object;

    move-result-object p0

    sget v0, Llo/y;->a:I

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "rgba(%d,%d,%d,%.3f)"

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x45ceff0b

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x1

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    or-int/lit8 v1, p1, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p1, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    or-int/2addr v1, p1

    goto :goto_1

    :cond_2
    move v1, p1

    :goto_1
    and-int/lit8 v1, v1, 0x3

    if-ne v1, v0, :cond_4

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz p2, :cond_5

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_5
    const p2, 0x7f07056d

    invoke-static {v4, p2}, Lup/d;->u(Landroidx/compose/runtime/Composer;I)F

    move-result p2

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v5, 0x2

    const-wide/16 v0, 0x0

    invoke-static/range {v0 .. v5}, Lds/q;->e(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lb70/a;

    const/16 v1, 0x18

    invoke-direct {v0, p1, p3, v1, p0}, Lb70/a;-><init>(IIILandroidx/compose/ui/Modifier;)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b(FZZ)J
    .locals 4

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v0, p0

    const-wide/16 v2, 0x0

    if-eqz p1, :cond_0

    const-wide/16 p0, 0x1

    goto :goto_0

    :cond_0
    move-wide p0, v2

    :goto_0
    if-eqz p2, :cond_1

    const-wide/16 v2, 0x2

    :cond_1
    or-long/2addr p0, v2

    const/16 p2, 0x20

    shl-long/2addr v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static synthetic c(FZ)J
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lds/q;->b(FZZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final d(Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v8, p2

    check-cast v8, Lp1/q;

    const p2, 0x242cddc0

    invoke-virtual {v8, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v8, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p2, v0

    and-int/lit8 p2, p2, 0x13

    const/16 v0, 0x12

    if-ne p2, v0, :cond_3

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    new-instance p2, Lb30/w2;

    const/4 v0, 0x4

    invoke-direct {p2, v0, p1, p0}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x7ddde9d6

    invoke-static {v0, v8, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/high16 v9, 0xc00000

    const/16 v10, 0x7f

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v10}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_4

    new-instance v0, Lb30/u3;

    invoke-direct {v0, p0, p3, p1}, Lb30/u3;-><init>(Ljava/lang/String;ILjava/lang/Integer;)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final e(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v8, p4

    check-cast v8, Lp1/q;

    const v0, 0x73453206

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v8, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-nez v2, :cond_2

    invoke-virtual {v8, p0, p1}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_4

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    move-wide v2, p0

    goto/16 :goto_7

    :cond_4
    :goto_3
    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v4, p3, 0x1

    if-eqz v4, :cond_7

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Lp1/q;->X()V

    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_6

    and-int/lit8 v0, v0, -0x71

    :cond_6
    move-wide v4, p0

    goto :goto_5

    :cond_7
    :goto_4
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_6

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v8, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->e()J

    move-result-wide v2

    and-int/lit8 v0, v0, -0x71

    move-wide v4, v2

    :goto_5
    invoke-virtual {v8}, Lp1/q;->r()V

    const v2, 0x7f07056e

    invoke-static {v8, v2}, Lup/d;->u(Landroidx/compose/runtime/Composer;I)F

    move-result v2

    const v3, 0x7f07056f

    invoke-static {v8, v3}, Lup/d;->u(Landroidx/compose/runtime/Composer;I)F

    move-result v3

    sget-object v6, Lb2/e;->E:Lb2/m;

    const/4 v7, 0x0

    invoke-static {v6, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_8

    invoke-virtual {v8, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v8, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    invoke-static {v7, v8, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v8, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    and-int/lit8 v0, v0, 0x70

    const-wide/16 v6, 0x0

    move v2, v3

    move v3, v0

    invoke-static/range {v2 .. v9}, Ls4/g;->a(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move-wide v2, v4

    :goto_7
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Ln21/g;

    const/4 v6, 0x2

    move-object v1, p2

    move/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ln21/g;-><init>(Landroidx/compose/ui/Modifier;JIII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final f(Ld30/h;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    const v2, -0x27196c6d

    invoke-virtual {v9, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    const/4 v12, 0x4

    if-eqz v2, :cond_0

    move v2, v12

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v13, v1, v2

    and-int/lit8 v2, v13, 0x3

    if-ne v2, v3, :cond_2

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_2
    :goto_1
    sget-object v2, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v2

    iget-object v3, v0, Ld30/h;->j:Ljava/lang/Object;

    check-cast v3, Ln53/e;

    const/4 v14, 0x0

    invoke-static {v3, v9, v14}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v15

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "manage_screen_saved_pms_list"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v9, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_2
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v4, v9, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x26a1bcde

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld30/x;

    iget-object v2, v2, Ld30/x;->a:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_9

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh20/l;

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld30/x;

    iget-object v4, v4, Ld30/x;->b:Lh20/l;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v5, 0x214ea98f

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v6, v13, 0xe

    if-eq v6, v12, :cond_6

    move v6, v14

    goto :goto_4

    :cond_6
    move v6, v3

    :goto_4
    or-int/2addr v5, v6

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_7

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_8

    :cond_7
    new-instance v6, Ld30/r;

    invoke-direct {v6, v15, v0, v2, v3}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v7, v6

    check-cast v7, Lc93/a;

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    new-instance v3, Ld30/b0;

    invoke-direct {v3, v14, v2, v15}, Ld30/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, 0x4a27e85

    invoke-static {v5, v9, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0x180030

    const/16 v11, 0x18

    const/4 v3, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v11}, Lse/a;->n(Lh20/l;ZZLandroidx/compose/ui/Modifier;Lh20/g1;Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_9
    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_a

    new-instance v3, Ld30/b;

    invoke-direct {v3, v0, v1}, Ld30/b;-><init>(Ld30/h;I)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final g(Lcom/amplitude/android/engagement/types/Nudge;ILmj/n;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    check-cast p3, Lp1/q;

    const v0, 0x6fcb910e

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/Nudge;->getSteps()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/amplitude/android/engagement/types/NudgeStep;

    new-instance v1, Lmj/k;

    move-object v3, p0

    move v4, p1

    move-object v5, p2

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lmj/k;-><init>(Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/Nudge;ILmj/n;I)V

    const p0, 0x4e92f985

    invoke-static {p0, p3, v1}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p0

    const/16 p1, 0x188

    invoke-static {v3, v4, p0, p3, p1}, Ltj/b;->a(Lcom/amplitude/android/engagement/types/Nudge;ILx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    move v7, v6

    move-object v6, v5

    move v5, v4

    move-object v4, v3

    new-instance v3, Lc4/i;

    const/4 v8, 0x1

    invoke-direct/range {v3 .. v8}, Lc4/i;-><init>(Lcom/amplitude/android/engagement/types/Nudge;ILl83/e;II)V

    iput-object v3, p0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final h(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    const v2, -0x351f3c2d    # -7365097.5f

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_2

    or-int/lit8 v2, v2, 0x30

    :cond_1
    move-object/from16 v4, p1

    goto :goto_2

    :cond_2
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_1

    move-object/from16 v4, p1

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_1

    :cond_3
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v2, v5

    :goto_2
    or-int/lit16 v2, v2, 0x180

    and-int/lit16 v5, v2, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_5

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Lp1/q;->X()V

    move/from16 v3, p2

    move-object/from16 v21, v1

    move-object v2, v4

    goto :goto_5

    :cond_5
    :goto_3
    if-eqz v3, :cond_6

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_6
    move-object v3, v4

    :goto_4
    invoke-static {v1}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v4

    iget-wide v4, v4, Ld40/n;->g:J

    const v6, -0x223f2d9b

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    invoke-static {v1}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v6

    iget-object v6, v6, Lg1/h9;->g:Ll3/v0;

    and-int/lit8 v22, v2, 0x7e

    const/16 v23, 0x0

    const v24, 0xfff8

    move-object/from16 v21, v1

    move-object v1, v3

    move-wide v2, v4

    const-wide/16 v4, 0x0

    move-object/from16 v20, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x1

    move v3, v0

    move-object v2, v1

    :goto_5
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_7

    new-instance v0, Lg40/j1;

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lg40/j1;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZIII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final i(Ljava/lang/String;Lm40/w;Landroidx/compose/ui/Modifier;Ly2/k;Li2/y;Ln2/a;Lb2/h;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v11, p11

    move/from16 v13, p13

    const-string v0, "url"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p10

    check-cast v12, Lp1/q;

    const v0, -0x3918504f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v5, v11, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v11, 0x180

    const/4 v6, 0x0

    if-nez v5, :cond_5

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v11, 0xc00

    move-object/from16 v7, p2

    if-nez v5, :cond_7

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v0, v5

    :cond_7
    and-int/lit8 v5, v13, 0x10

    if-eqz v5, :cond_9

    or-int/lit16 v0, v0, 0x6000

    :cond_8
    move-object/from16 v8, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v8, v11, 0x6000

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_5

    :cond_a
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit8 v9, v13, 0x20

    const/high16 v10, 0x30000

    if-eqz v9, :cond_c

    or-int/2addr v0, v10

    :cond_b
    move-object/from16 v10, p4

    goto :goto_8

    :cond_c
    and-int/2addr v10, v11

    if-nez v10, :cond_b

    move-object/from16 v10, p4

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/high16 v14, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v14, 0x10000

    :goto_7
    or-int/2addr v0, v14

    :goto_8
    and-int/lit8 v14, v13, 0x40

    const/high16 v15, 0x180000

    if-eqz v14, :cond_f

    or-int/2addr v0, v15

    :cond_e
    move-object/from16 v15, p5

    goto :goto_a

    :cond_f
    and-int/2addr v15, v11

    if-nez v15, :cond_e

    move-object/from16 v15, p5

    invoke-virtual {v12, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x100000

    goto :goto_9

    :cond_10
    const/high16 v16, 0x80000

    :goto_9
    or-int v0, v0, v16

    :goto_a
    and-int/lit16 v3, v13, 0x80

    const/high16 v16, 0xc00000

    if-eqz v3, :cond_11

    or-int v0, v0, v16

    move-object/from16 v6, p6

    goto :goto_c

    :cond_11
    and-int v16, v11, v16

    move-object/from16 v6, p6

    if-nez v16, :cond_13

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x800000

    goto :goto_b

    :cond_12
    const/high16 v17, 0x400000

    :goto_b
    or-int v0, v0, v17

    :cond_13
    :goto_c
    and-int/lit16 v4, v13, 0x100

    const/high16 v18, 0x6000000

    if-eqz v4, :cond_15

    or-int v0, v0, v18

    :cond_14
    move/from16 v18, v0

    move/from16 v0, p7

    goto :goto_e

    :cond_15
    and-int v18, v11, v18

    if-nez v18, :cond_14

    move/from16 v18, v0

    move/from16 v0, p7

    invoke-virtual {v12, v0}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x4000000

    goto :goto_d

    :cond_16
    const/high16 v19, 0x2000000

    :goto_d
    or-int v18, v18, v19

    :goto_e
    and-int/lit16 v0, v13, 0x200

    const/high16 v19, 0x30000000

    if-eqz v0, :cond_18

    or-int v18, v18, v19

    :cond_17
    move/from16 v19, v0

    move-object/from16 v0, p8

    goto :goto_10

    :cond_18
    and-int v19, v11, v19

    if-nez v19, :cond_17

    move/from16 v19, v0

    move-object/from16 v0, p8

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_19

    const/high16 v20, 0x20000000

    goto :goto_f

    :cond_19
    const/high16 v20, 0x10000000

    :goto_f
    or-int v18, v18, v20

    :goto_10
    and-int/lit16 v0, v13, 0x400

    if-eqz v0, :cond_1a

    const/16 v20, 0x6

    move/from16 v21, v20

    move/from16 v20, v0

    move-object/from16 v0, p9

    goto :goto_12

    :cond_1a
    and-int/lit8 v20, p12, 0x6

    if-nez v20, :cond_1c

    move/from16 v20, v0

    move-object/from16 v0, p9

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1b

    const/16 v21, 0x4

    goto :goto_11

    :cond_1b
    const/16 v21, 0x2

    :goto_11
    or-int v21, p12, v21

    goto :goto_12

    :cond_1c
    move/from16 v20, v0

    move-object/from16 v0, p9

    move/from16 v21, p12

    :goto_12
    const v22, 0x12492493

    and-int v0, v18, v22

    const v1, 0x12492492

    if-ne v0, v1, :cond_1e

    and-int/lit8 v0, v21, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1e

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_13

    :cond_1d
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v9, p8

    move-object v7, v6

    move-object v4, v8

    move-object v5, v10

    move-object v0, v12

    move-object v6, v15

    move/from16 v8, p7

    move-object/from16 v10, p9

    goto/16 :goto_17

    :cond_1e
    :goto_13
    if-eqz v5, :cond_1f

    sget-object v0, Ly2/j;->b:Ly2/b1;

    move-object v8, v0

    :cond_1f
    if-eqz v9, :cond_20

    const/4 v10, 0x0

    :cond_20
    if-eqz v14, :cond_21

    const/4 v15, 0x0

    :cond_21
    if-eqz v3, :cond_22

    sget-object v0, Lb2/e;->E:Lb2/m;

    move-object v6, v0

    :cond_22
    if-eqz v4, :cond_23

    const/4 v0, 0x0

    move v3, v0

    goto :goto_14

    :cond_23
    move/from16 v3, p7

    :goto_14
    if-eqz v19, :cond_24

    sget-object v0, Lm40/b;->a:Lx1/b;

    move-object v5, v0

    goto :goto_15

    :cond_24
    move-object/from16 v5, p8

    :goto_15
    if-eqz v20, :cond_25

    sget-object v0, Lm40/b;->b:Lx1/b;

    goto :goto_16

    :cond_25
    move-object/from16 v0, p9

    :goto_16
    new-instance v1, Lm40/o;

    move-object v9, v8

    move-object v4, v15

    move-object v8, v6

    move-object v6, v0

    move-object v0, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v10}, Lm40/o;-><init>(Ljava/lang/String;Lm40/w;ZLn2/a;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;Li2/y;)V

    const v1, 0x406c079b

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0xc00

    const/4 v2, 0x7

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 p6, v0

    move/from16 p8, v1

    move/from16 p9, v2

    move-object/from16 p3, v7

    move-object/from16 p7, v12

    move-object/from16 p4, v14

    move/from16 p5, v15

    invoke-static/range {p3 .. p9}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, p7

    move-object v7, v6

    move-object v6, v4

    move-object v4, v9

    move-object v9, v5

    move-object v5, v10

    move-object v10, v7

    move-object v7, v8

    move v8, v3

    :goto_17
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_26

    new-instance v0, Lm40/l;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v12, p12

    invoke-direct/range {v0 .. v13}, Lm40/l;-><init>(Ljava/lang/String;Lm40/w;Landroidx/compose/ui/Modifier;Ly2/k;Li2/y;Ln2/a;Lb2/h;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;III)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method public static final j(Lh20/l;ZLandroidx/compose/runtime/Composer;I)V
    .locals 2

    check-cast p2, Lp1/q;

    const v0, -0x63ec502d

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    if-eqz p1, :cond_4

    iget-object v0, p0, Lh20/l;->b:Ly00/o4;

    iget-object v0, v0, Ly00/o4;->w:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Ldp/d;->b(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    :cond_4
    :goto_3
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_5

    new-instance v0, Lb30/t2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lb30/t2;-><init>(Ljava/lang/Object;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final synthetic k(FZZ)J
    .locals 0

    invoke-static {p0, p1, p2}, Lds/q;->b(FZZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final l(Lhg/i;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lhg/i;->c:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-class v2, Lig/c;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lhg/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v3, v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lhg/d;

    if-eqz v1, :cond_2

    check-cast v1, Lig/c;

    iget-object p0, v1, Lig/c;->a:Ljava/lang/String;

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected to find trait "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " but was not present."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final m(La3/n;Lc93/a;Ls83/c;)Ljava/lang/Object;
    .locals 10

    move-object v0, p0

    check-cast v0, Lb2/v;

    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_0

    goto/16 :goto_6

    :cond_0
    if-nez v1, :cond_1

    const-string v1, "visitAncestors called on an unattached node"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, v0, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_c

    iget-object v3, v1, La3/n0;->e0:La3/l1;

    iget-object v3, v3, La3/l1;->g:Ljava/lang/Object;

    check-cast v3, Lb2/v;

    iget v3, v3, Lb2/v;->z:I

    const/high16 v4, 0x80000

    and-int/2addr v3, v4

    if-eqz v3, :cond_a

    :goto_1
    if-eqz v0, :cond_a

    iget v3, v0, Lb2/v;->y:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_9

    move-object v3, v0

    move-object v5, v2

    :goto_2
    if-eqz v3, :cond_9

    instance-of v6, v3, Lf3/a;

    if-eqz v6, :cond_2

    move-object v2, v3

    goto :goto_5

    :cond_2
    iget v6, v3, Lb2/v;->y:I

    and-int/2addr v6, v4

    if-eqz v6, :cond_8

    instance-of v6, v3, La3/o;

    if-eqz v6, :cond_8

    move-object v6, v3

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_7

    iget v9, v6, Lb2/v;->y:I

    and-int/2addr v9, v4

    if-eqz v9, :cond_6

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_3

    move-object v3, v6

    goto :goto_4

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, Lr1/c;

    const/16 v8, 0x10

    new-array v8, v8, [Lb2/v;

    invoke-direct {v5, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v5, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v3, v2

    :cond_5
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_6
    :goto_4
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_7
    if-ne v7, v8, :cond_8

    goto :goto_2

    :cond_8
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v3

    goto :goto_2

    :cond_9
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_a
    invoke-virtual {v1}, La3/n0;->G()La3/n0;

    move-result-object v1

    if-eqz v1, :cond_b

    iget-object v0, v1, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_b

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto :goto_0

    :cond_b
    move-object v0, v2

    goto :goto_0

    :cond_c
    :goto_5
    check-cast v2, Lf3/a;

    if-nez v2, :cond_d

    goto :goto_6

    :cond_d
    invoke-static {p0}, La3/g;->o(La3/n;)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p0

    new-instance v0, La3/z0;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1, p0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, p0, v0, p2}, Lf3/a;->o0(Landroidx/compose/ui/node/NodeCoordinator;La3/z0;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_e

    return-object p0

    :cond_e
    :goto_6
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Ljava/util/ArrayList;Ljava/util/List;Lo93/h;)Llb3/y;
    .locals 1

    new-instance v0, Llb3/i0;

    invoke-direct {v0, p0}, Llb3/i0;-><init>(Ljava/util/ArrayList;)V

    new-instance p0, Llb3/a1;

    invoke-direct {p0, v0}, Llb3/a1;-><init>(Llb3/y0;)V

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/y;

    sget-object v0, Llb3/g1;->E:Llb3/g1;

    invoke-virtual {p0, p1, v0}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-virtual {p2}, Lo93/h;->n()Llb3/c0;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static o(Lwm/j;)Z
    .locals 4

    new-instance v0, Led3/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Led3/a;-><init>(I)V

    invoke-static {p0, v0}, Lbb/f;->b(Lwm/j;Led3/a;)Lbb/f;

    move-result-object v1

    iget v1, v1, Lbb/f;->a:I

    const v2, 0x52494646

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    const v2, 0x52463634

    if-eq v1, v2, :cond_0

    return v3

    :cond_0
    iget-object v1, v0, Led3/a;->a:[B

    const/4 v2, 0x4

    invoke-interface {p0, v1, v3, v2}, Lwm/j;->p([BII)V

    invoke-virtual {v0, v3}, Led3/a;->K(I)V

    invoke-virtual {v0}, Led3/a;->i()I

    move-result p0

    const v0, 0x57415645

    if-eq p0, v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x22

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unsupported form type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "WavHeaderReader"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static p(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    goto/16 :goto_0

    :pswitch_0
    const-string v0, "kotlin.jvm.functions.Function9"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string p0, "kotlin.Function9"

    return-object p0

    :pswitch_1
    const-string v0, "kotlin.jvm.functions.Function8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string p0, "kotlin.Function8"

    return-object p0

    :pswitch_2
    const-string v0, "kotlin.jvm.functions.Function7"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string p0, "kotlin.Function7"

    return-object p0

    :pswitch_3
    const-string v0, "kotlin.jvm.functions.Function6"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const-string p0, "kotlin.Function6"

    return-object p0

    :pswitch_4
    const-string v0, "kotlin.jvm.functions.Function5"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const-string p0, "kotlin.Function5"

    return-object p0

    :pswitch_5
    const-string v0, "kotlin.jvm.functions.Function4"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const-string p0, "kotlin.Function4"

    return-object p0

    :pswitch_6
    const-string v0, "kotlin.jvm.functions.Function3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const-string p0, "kotlin.Function3"

    return-object p0

    :pswitch_7
    const-string v0, "kotlin.jvm.functions.Function2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const-string p0, "kotlin.Function2"

    return-object p0

    :pswitch_8
    const-string v0, "kotlin.jvm.functions.Function1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const-string p0, "kotlin.Function1"

    return-object p0

    :pswitch_9
    const-string v0, "kotlin.jvm.functions.Function0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const-string p0, "kotlin.Function0"

    return-object p0

    :pswitch_a
    const-string v0, "kotlin.jvm.functions.Function22"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const-string p0, "kotlin.Function22"

    return-object p0

    :pswitch_b
    const-string v0, "kotlin.jvm.functions.Function21"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const-string p0, "kotlin.Function21"

    return-object p0

    :pswitch_c
    const-string v0, "kotlin.jvm.functions.Function20"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const-string p0, "kotlin.Function20"

    return-object p0

    :pswitch_d
    const-string v0, "kotlin.jvm.functions.Function19"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const-string p0, "kotlin.Function19"

    return-object p0

    :pswitch_e
    const-string v0, "kotlin.jvm.functions.Function18"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto/16 :goto_0

    :cond_e
    const-string p0, "kotlin.Function18"

    return-object p0

    :pswitch_f
    const-string v0, "kotlin.jvm.functions.Function17"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto/16 :goto_0

    :cond_f
    const-string p0, "kotlin.Function17"

    return-object p0

    :pswitch_10
    const-string v0, "kotlin.jvm.functions.Function16"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto/16 :goto_0

    :cond_10
    const-string p0, "kotlin.Function16"

    return-object p0

    :pswitch_11
    const-string v0, "kotlin.jvm.functions.Function15"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto/16 :goto_0

    :cond_11
    const-string p0, "kotlin.Function15"

    return-object p0

    :pswitch_12
    const-string v0, "kotlin.jvm.functions.Function14"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto/16 :goto_0

    :cond_12
    const-string p0, "kotlin.Function14"

    return-object p0

    :pswitch_13
    const-string v0, "kotlin.jvm.functions.Function13"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto/16 :goto_0

    :cond_13
    const-string p0, "kotlin.Function13"

    return-object p0

    :pswitch_14
    const-string v0, "kotlin.jvm.functions.Function12"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto/16 :goto_0

    :cond_14
    const-string p0, "kotlin.Function12"

    return-object p0

    :pswitch_15
    const-string v0, "kotlin.jvm.functions.Function11"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto/16 :goto_0

    :cond_15
    const-string p0, "kotlin.Function11"

    return-object p0

    :pswitch_16
    const-string v0, "kotlin.jvm.functions.Function10"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_16

    goto/16 :goto_0

    :cond_16
    const-string p0, "kotlin.Function10"

    return-object p0

    :sswitch_0
    const-string v0, "kotlin.jvm.internal.IntCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_17

    goto/16 :goto_0

    :cond_17
    const-string p0, "kotlin.Int.Companion"

    return-object p0

    :sswitch_1
    const-string v0, "java.lang.Throwable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_18

    goto/16 :goto_0

    :cond_18
    const-string p0, "kotlin.Throwable"

    return-object p0

    :sswitch_2
    const-string v0, "kotlin.jvm.internal.BooleanCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_19

    goto/16 :goto_0

    :cond_19
    const-string p0, "kotlin.Boolean.Companion"

    return-object p0

    :sswitch_3
    const-string v0, "java.lang.Iterable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const-string p0, "kotlin.collections.Iterable"

    return-object p0

    :sswitch_4
    const-string v0, "java.lang.String"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const-string p0, "kotlin.String"

    return-object p0

    :sswitch_5
    const-string v0, "java.lang.Object"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const-string p0, "kotlin.Any"

    return-object p0

    :sswitch_6
    const-string v0, "java.lang.Number"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const-string p0, "kotlin.Number"

    return-object p0

    :sswitch_7
    const-string v0, "java.lang.Double"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_32

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "kotlin.jvm.internal.StringCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const-string p0, "kotlin.String.Companion"

    return-object p0

    :sswitch_9
    const-string v0, "java.util.ListIterator"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const-string p0, "kotlin.collections.ListIterator"

    return-object p0

    :sswitch_a
    const-string v0, "java.util.Iterator"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_20

    goto/16 :goto_0

    :cond_20
    const-string p0, "kotlin.collections.Iterator"

    return-object p0

    :sswitch_b
    const-string v0, "kotlin.jvm.internal.FloatCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_21

    goto/16 :goto_0

    :cond_21
    const-string p0, "kotlin.Float.Companion"

    return-object p0

    :sswitch_c
    const-string v0, "java.lang.Long"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_27

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "java.lang.Enum"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    goto/16 :goto_0

    :cond_22
    const-string p0, "kotlin.Enum"

    return-object p0

    :sswitch_e
    const-string v0, "java.lang.Byte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_29

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "java.lang.Boolean"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "kotlin.jvm.internal.EnumCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_23

    goto/16 :goto_0

    :cond_23
    const-string p0, "kotlin.Enum.Companion"

    return-object p0

    :sswitch_11
    const-string v0, "java.lang.Character"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_28

    goto/16 :goto_0

    :sswitch_12
    const-string v0, "short"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2d

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "float"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2e

    goto/16 :goto_0

    :sswitch_14
    const-string v0, "kotlin.jvm.internal.ShortCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_24

    goto/16 :goto_0

    :cond_24
    const-string p0, "kotlin.Short.Companion"

    return-object p0

    :sswitch_15
    const-string v0, "java.util.List"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_25

    goto/16 :goto_0

    :cond_25
    const-string p0, "kotlin.collections.List"

    return-object p0

    :sswitch_16
    const-string v0, "boolean"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_26

    goto/16 :goto_0

    :cond_26
    const-string p0, "kotlin.Boolean"

    return-object p0

    :sswitch_17
    const-string v0, "long"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_27

    goto/16 :goto_0

    :cond_27
    const-string p0, "kotlin.Long"

    return-object p0

    :sswitch_18
    const-string v0, "char"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_28

    goto/16 :goto_0

    :cond_28
    const-string p0, "kotlin.Char"

    return-object p0

    :sswitch_19
    const-string v0, "byte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_29

    goto/16 :goto_0

    :cond_29
    const-string p0, "kotlin.Byte"

    return-object p0

    :sswitch_1a
    const-string v0, "int"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_38

    goto/16 :goto_0

    :sswitch_1b
    const-string v0, "java.util.Map$Entry"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2a

    goto/16 :goto_0

    :cond_2a
    const-string p0, "kotlin.collections.Map.Entry"

    return-object p0

    :sswitch_1c
    const-string v0, "kotlin.jvm.internal.LongCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2b

    goto/16 :goto_0

    :cond_2b
    const-string p0, "kotlin.Long.Companion"

    return-object p0

    :sswitch_1d
    const-string v0, "kotlin.jvm.internal.CharCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2c

    goto/16 :goto_0

    :cond_2c
    const-string p0, "kotlin.Char.Companion"

    return-object p0

    :sswitch_1e
    const-string v0, "java.lang.Short"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2d

    goto/16 :goto_0

    :cond_2d
    const-string p0, "kotlin.Short"

    return-object p0

    :sswitch_1f
    const-string v0, "java.lang.Float"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2e

    goto/16 :goto_0

    :cond_2e
    const-string p0, "kotlin.Float"

    return-object p0

    :sswitch_20
    const-string v0, "java.util.Collection"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2f

    goto/16 :goto_0

    :cond_2f
    const-string p0, "kotlin.collections.Collection"

    return-object p0

    :sswitch_21
    const-string v0, "java.lang.CharSequence"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    goto/16 :goto_0

    :cond_30
    const-string p0, "kotlin.CharSequence"

    return-object p0

    :sswitch_22
    const-string v0, "kotlin.jvm.internal.ByteCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_31

    goto :goto_0

    :cond_31
    const-string p0, "kotlin.Byte.Companion"

    return-object p0

    :sswitch_23
    const-string v0, "double"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_32

    goto :goto_0

    :cond_32
    const-string p0, "kotlin.Double"

    return-object p0

    :sswitch_24
    const-string v0, "java.util.Set"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_33

    goto :goto_0

    :cond_33
    const-string p0, "kotlin.collections.Set"

    return-object p0

    :sswitch_25
    const-string v0, "java.util.Map"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_34

    goto :goto_0

    :cond_34
    const-string p0, "kotlin.collections.Map"

    return-object p0

    :sswitch_26
    const-string v0, "java.lang.Comparable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_35

    goto :goto_0

    :cond_35
    const-string p0, "kotlin.Comparable"

    return-object p0

    :sswitch_27
    const-string v0, "java.lang.annotation.Annotation"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_36

    goto :goto_0

    :cond_36
    const-string p0, "kotlin.Annotation"

    return-object p0

    :sswitch_28
    const-string v0, "java.lang.Cloneable"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_37

    goto :goto_0

    :cond_37
    const-string p0, "kotlin.Cloneable"

    return-object p0

    :sswitch_29
    const-string v0, "java.lang.Integer"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_38

    goto :goto_0

    :cond_38
    const-string p0, "kotlin.Int"

    return-object p0

    :sswitch_2a
    const-string v0, "kotlin.jvm.internal.DoubleCompanionObject"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_39

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_39
    const-string p0, "kotlin.Double.Companion"

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x7ae0c43d -> :sswitch_2a
        -0x7a988a96 -> :sswitch_29
        -0x793eea9d -> :sswitch_28
        -0x75fda146 -> :sswitch_27
        -0x5dab6ad2 -> :sswitch_26
        -0x52743c64 -> :sswitch_25
        -0x5274255e -> :sswitch_24
        -0x4f08842f -> :sswitch_23
        -0x46781814 -> :sswitch_22
        -0x3f507f75 -> :sswitch_21
        -0x2906f7a2 -> :sswitch_20
        -0x1f76ce78 -> :sswitch_1f
        -0x1ec16c58 -> :sswitch_1e
        -0xeb0f022 -> :sswitch_1d
        -0xc5a9408 -> :sswitch_1c
        -0x9d7d2b6 -> :sswitch_1b
        0x197ef -> :sswitch_1a
        0x2e6108 -> :sswitch_19
        0x2e9356 -> :sswitch_18
        0x32c67c -> :sswitch_17
        0x3db6c28 -> :sswitch_16
        0x3ec5a5e -> :sswitch_15
        0x49a71c6 -> :sswitch_14
        0x5d0225c -> :sswitch_13
        0x685847c -> :sswitch_12
        0x9415455 -> :sswitch_11
        0xd7b22d3 -> :sswitch_10
        0x148d6054 -> :sswitch_f
        0x17c0bc5c -> :sswitch_e
        0x17c1f055 -> :sswitch_d
        0x17c521d0 -> :sswitch_c
        0x1cc457e6 -> :sswitch_b
        0x1dcad22e -> :sswitch_a
        0x226988ec -> :sswitch_9
        0x23b44f83 -> :sswitch_8
        0x2d605225 -> :sswitch_7
        0x3ec1b19d -> :sswitch_6
        0x3f697993 -> :sswitch_5
        0x473e3665 -> :sswitch_4
        0x4c0855c6 -> :sswitch_3
        0x52797ada -> :sswitch_2
        0x612cf26c -> :sswitch_1
        0x6fe35bb3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch -0x6bf3d83c
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
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x6bf3d81d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x4c695eb
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

.method public static q(Ljava/lang/ClassLoader;)Ljava/lang/ClassLoader;
    .locals 0

    if-nez p0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final r(F)I
    .locals 2

    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_0

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    :goto_0
    double-to-float p0, v0

    goto :goto_1

    :cond_0
    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    goto :goto_0

    :goto_1
    float-to-int p0, p0

    mul-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x5

    invoke-static {v0, p0}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    invoke-static {v0, p0}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " *"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ljava/lang/String;Ljava/lang/String;)Loa3/r;
    .locals 2

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "desc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Loa3/r;

    const/16 v1, 0x23

    invoke-static {v1, p0, p1}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Loa3/r;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static u(Ljc/x;)Loa3/r;
    .locals 2

    instance-of v0, p0, Lua3/e;

    if-eqz v0, :cond_0

    check-cast p0, Lua3/e;

    iget-object v0, p0, Lua3/e;->x:Ljava/lang/String;

    iget-object p0, p0, Lua3/e;->y:Ljava/lang/String;

    const-string v1, "name"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "desc"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Loa3/r;

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Loa3/r;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_0
    instance-of v0, p0, Lua3/d;

    if-eqz v0, :cond_1

    check-cast p0, Lua3/d;

    iget-object v0, p0, Lua3/d;->x:Ljava/lang/String;

    iget-object p0, p0, Lua3/d;->y:Ljava/lang/String;

    invoke-static {v0, p0}, Lds/q;->t(Ljava/lang/String;Ljava/lang/String;)Loa3/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static v(Lsa3/f;Lta3/d;)Loa3/r;
    .locals 1

    const-string v0, "nameResolver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Lta3/d;->y:I

    invoke-interface {p0, v0}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget p1, p1, Lta3/d;->z:I

    invoke-interface {p0, p1}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Loa3/r;

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Loa3/r;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public static w(Loa3/r;I)Loa3/r;
    .locals 2

    new-instance v0, Loa3/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p0, p0, Loa3/r;->a:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x40

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Loa3/r;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final x(Lp0/d0;IJLq0/o;JLh0/d2;Lb2/f;Lb2/g;Ly3/m;ILa0/g0;)Lq0/d;
    .locals 11

    move-object/from16 v0, p12

    invoke-virtual {p4, p1}, Lq0/o;->c(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, p1}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/List;

    if-eqz p4, :cond_0

    move-object v3, p4

    goto :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p1}, Lp0/d0;->a(I)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p4, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-interface {v3, p2, p3}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1, v1}, La0/g0;->h(ILjava/lang/Object;)V

    move-object v3, v1

    :goto_1
    new-instance v0, Lq0/d;

    move v1, p1

    move-wide/from16 v4, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v2, p11

    invoke-direct/range {v0 .. v10}, Lq0/d;-><init>(IILjava/util/List;JLjava/lang/Object;Lh0/d2;Lb2/f;Lb2/g;Ly3/m;)V

    return-object v0
.end method

.method public static y()Lp93/m;
    .locals 1

    sget-object v0, Lp93/m;->b:Lp93/m;

    return-object v0
.end method

.method public static final z(Lq83/j;)Lng/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lng/h;->x:Lng/f;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    check-cast p0, Lng/h;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lng/h;->w:Lng/f;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lds/q;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "SerialKind"

    :cond_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method
