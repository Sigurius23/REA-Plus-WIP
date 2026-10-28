.class public final synthetic Lno0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll83/h;


# direct methods
.method public synthetic constructor <init>(Ll83/h;I)V
    .locals 0

    iput p2, p0, Lno0/q;->w:I

    iput-object p1, p0, Lno0/q;->x:Ll83/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lno0/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno0/q;->x:Ll83/h;

    check-cast p1, Lfc2/c;

    invoke-static {v0, p1}, Lcom/whoop/settings/language/LanguagePrefsFragment;->A(Ll83/h;Lfc2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lno0/q;->x:Ll83/h;

    check-cast p1, Lgv1/m;

    invoke-static {v0, p1}, Lw60/f;->b(Ll83/h;Lgv1/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lno0/q;->x:Ll83/h;

    check-cast p1, Lcom/whoop/archv2/feature/domain/p;

    invoke-static {v0, p1}, Lui0/n;->m(Ll83/h;Lcom/whoop/archv2/feature/domain/p;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lno0/q;->x:Ll83/h;

    check-cast p1, Lsu2/b;

    invoke-static {v0, p1}, Ltu2/b;->c(Ll83/h;Lsu2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lno0/q;->x:Ll83/h;

    check-cast p1, Lj/a;

    invoke-static {v0, p1}, Lql2/a;->e(Ll83/h;Lj/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lno0/q;->x:Ll83/h;

    invoke-static {v0, p1}, Lql2/a;->j(Ll83/h;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lno0/q;->x:Ll83/h;

    check-cast p1, Lo52/f;

    invoke-static {v0, p1}, Lo52/e0;->c(Ll83/h;Lo52/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lno0/q;->x:Ll83/h;

    check-cast p1, Llo0/v;

    invoke-static {v0, p1}, Lno0/w;->j(Ll83/h;Llo0/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lno0/q;->x:Ll83/h;

    check-cast p1, Llo0/k;

    invoke-static {v0, p1}, Lno0/s;->i(Ll83/h;Llo0/k;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
