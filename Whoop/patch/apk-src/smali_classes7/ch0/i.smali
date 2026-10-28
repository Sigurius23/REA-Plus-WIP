.class public final synthetic Lch0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lch0/i;->w:I

    iput-object p2, p0, Lch0/i;->x:Ljava/lang/Object;

    iput-object p3, p0, Lch0/i;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lch0/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/i;->x:Ljava/lang/Object;

    check-cast v0, Lch0/v0;

    iget-object v1, p0, Lch0/i;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Lyg0/b;

    invoke-static {v0, v1, p1}, Lch0/c1;->j(Lch0/v0;Lc93/a;Lyg0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/i;->x:Ljava/lang/Object;

    check-cast v0, Lzg0/h;

    iget-object v1, p0, Lch0/i;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lch0/w0;->f(Lzg0/h;Landroid/content/Context;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lch0/i;->x:Ljava/lang/Object;

    check-cast v0, Lzg0/c;

    iget-object v1, p0, Lch0/i;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lch0/u;->d(Lzg0/c;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lch0/i;->x:Ljava/lang/Object;

    check-cast v0, Lch0/v0;

    iget-object v1, p0, Lch0/i;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lch0/n;->h(Lch0/v0;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
