.class public final synthetic Lu71/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu71/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lu71/c;->w:I

    const/4 v1, 0x0

    const-string v2, "it"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Llb1/z0;

    invoke-static {p1}, Luk2/b;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lm91/q;

    invoke-static {p1}, Luk2/b;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Luk2/b;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lri0/b;

    invoke-static {p1}, Lui0/n;->f(Lri0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lui0/g;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ltb/a;

    invoke-static {p1}, Luh1/b;->j(Ltb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Lug2/d;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1}, Lug2/d;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lug2/b;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Lug/s;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lsf0/a;

    invoke-static {p1}, Luf0/h;->d(Lsf0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lm91/q;

    invoke-static {p1}, Luf0/g;->i(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1}, Luf0/g;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ltd2/f$f;

    invoke-static {p1}, Lud2/e;->o(Ltd2/f$f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {p1}, Lud2/a;->c(Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Luc3/g;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "position "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Luc3/g;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Luc3/g;->b:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/16 v1, 0x27

    invoke-static {v0, p1, v1}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lcom/whoop/design/models/items/whooprow/WhoopRowModel;

    invoke-static {p1}, Luc1/a;->c(Lcom/whoop/design/models/items/whooprow/WhoopRowModel;)Ls81/h;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Luc1/a;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/whoop/settings/journalv2/e;->i(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/whoop/settings/journalv2/e;->e(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lub2/d;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/design/models/items/emoji/EmojiModel;

    invoke-static {p1}, Lub1/a;->b(Lcom/whoop/design/models/items/emoji/EmojiModel;)Luy0/b;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lub1/a;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    invoke-static {p1}, Lu90/b;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1}, Lu80/c;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lu80/a;

    invoke-static {p1}, Lu80/c;->b(Lu80/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    invoke-static {p1}, Lu71/i;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    invoke-static {p1}, Lu71/g;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1}, Lu71/d;->a(Ljava/lang/Object;)Ll83/a0;

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
