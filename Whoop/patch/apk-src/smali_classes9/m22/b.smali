.class public final synthetic Lm22/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lm22/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lm22/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Loy2/e;->m(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Loy2/e;->b(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Loy2/e;->k(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lox0/f;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lox0/f;->d(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Los0/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/util/List;

    invoke-static {p1, p2}, Lo52/n;->Q(Ljava/lang/Integer;Ljava/util/List;)Ll83/k;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lo42/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/stripe/android/ui/core/elements/FormItemSpec;

    check-cast p2, Lcom/stripe/android/ui/core/elements/FormItemSpec;

    instance-of v0, p1, Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    if-nez v0, :cond_3

    instance-of p1, p1, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of p1, p2, Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    if-nez p1, :cond_2

    instance-of p1, p2, Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_0
    const/4 p1, -0x1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x1

    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/util/Set;

    check-cast p2, Ljava/util/List;

    const-string v0, "hiddenIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textFieldControllerIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    check-cast v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0

    :pswitch_9
    check-cast p1, Ljava/util/Set;

    check-cast p2, Ljava/util/Set;

    const-string v0, "cardBillingIdentifiers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalHiddenIdentifiers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p2, p1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ly1/b;

    check-cast p2, Lo0/y;

    iget-object p1, p2, Lo0/y;->d:Lc33/c;

    iget-object p1, p1, Lc33/c;->c:Ljava/lang/Object;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p2, Lo0/y;->d:Lc33/c;

    iget-object p2, p2, Lc33/c;->b:Ljava/lang/Object;

    check-cast p2, Lp1/h1;

    invoke-virtual {p2}, Lp1/h1;->x()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lo0/u;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    int-to-long p1, p1

    new-instance v0, Lo0/c;

    invoke-direct {v0, p1, p2}, Lo0/c;-><init>(J)V

    return-object v0

    :pswitch_c
    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    invoke-static {p1, p2}, Lnx0/a;->a(Lxf3/c;Luf3/a;)Lvx0/e;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lno1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lno0/t0;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Lm91/u;

    invoke-static {p1, p2}, Lno0/a0;->g(ILm91/u;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ln6/j;

    check-cast p2, Ljava/lang/Float;

    iput-object p2, p1, Ln6/j;->c:Ljava/lang/Float;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    check-cast p1, Ln6/j;

    if-nez p2, :cond_6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_12
    check-cast p1, Ln6/j;

    check-cast p2, Lv6/i;

    iget p2, p2, Lv6/i;->a:I

    iput p2, p1, Ln6/j;->d:I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    check-cast p1, Ln6/j;

    check-cast p2, Ln6/o;

    iput-object p2, p1, Ln6/j;->a:Ln6/o;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    check-cast p1, Ln6/j;

    check-cast p2, Ln6/r;

    iput-object p2, p1, Ln6/j;->b:Ln6/r;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ln6/n;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_4
    return-object p1

    :pswitch_16
    check-cast p1, Ly1/b;

    check-cast p2, Ln1/o;

    iget-object p1, p2, Ln1/o;->a:Ld0/e;

    invoke-virtual {p1}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    return-object p1

    :pswitch_17
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Ln03/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Le41/i;

    invoke-static {p1, p2}, Lmn1/c;->a(ILe41/i;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lmn1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lm72/h;->a(Landroidx/compose/runtime/Composer;I)Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lm72/h;->b(Landroidx/compose/runtime/Composer;I)Lb91/a;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lm22/c;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
