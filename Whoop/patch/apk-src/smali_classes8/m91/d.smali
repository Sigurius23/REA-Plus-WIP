.class public final synthetic Lm91/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lm91/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lm91/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm91/q;

    invoke-static {p1}, Lm91/t;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lm91/m;->e(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lm91/l;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lm91/n;

    invoke-static {p1}, Lm91/c;->a(Lm91/n;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lm91/a;

    invoke-static {p1}, Lm91/c$b$a;->c(Lm91/a;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
