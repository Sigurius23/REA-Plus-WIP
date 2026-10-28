.class public final Ln10/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final E:Lv03/h;

.field public final F:Lv03/e;

.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public synthetic constructor <init>(Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/e;I)V
    .locals 0

    iput p6, p0, Ln10/s;->w:I

    iput-object p1, p0, Ln10/s;->x:Lv03/h;

    iput-object p2, p0, Ln10/s;->y:Lv03/h;

    iput-object p3, p0, Ln10/s;->z:Lv03/h;

    iput-object p4, p0, Ln10/s;->E:Lv03/h;

    iput-object p5, p0, Ln10/s;->F:Lv03/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ln10/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln10/s;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    iget-object v1, p0, Ln10/s;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc93/a;

    iget-object v2, p0, Ln10/s;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsz/c0;

    iget-object v3, p0, Ln10/s;->E:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lux/a;

    iget-object v3, p0, Ln10/s;->F:Lv03/e;

    iget-object v3, v3, Lv03/e;->w:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, Lux/b;

    new-instance v4, Lux/q;

    const-string v3, "publishableKeyProvider"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "stripeAccountIdProvider"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "googlePayConfig"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardBrandFilter"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardFundingFilter"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcd/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v5, v0, v1}, Lcd/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v2, Lsz/c0;->x:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->JAPAN:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v0, v1, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    iget-object v7, v2, Lsz/c0;->H:Ljava/util/List;

    invoke-direct/range {v4 .. v9}, Lux/q;-><init>(Lcd/a;ZLjava/util/List;Lux/a;Lux/b;)V

    return-object v4

    :pswitch_0
    iget-object v0, p0, Ln10/s;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ln10/u;

    iget-object v0, p0, Ln10/s;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ln10/o0;

    iget-object v0, p0, Ln10/s;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ln10/b0;

    iget-object v0, p0, Ln10/s;->E:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ln10/h;

    iget-object v0, p0, Ln10/s;->F:Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ln10/s0;

    new-instance v1, Ln10/r;

    invoke-direct/range {v1 .. v6}, Ln10/r;-><init>(Ln10/u;Ln10/o0;Ln10/b0;Ln10/h;Ln10/s0;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
