.class public final synthetic Lsy2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lsy2/s;->w:I

    iput-object p1, p0, Lsy2/s;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsy2/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsy2/s;->x:Ljava/lang/Object;

    check-cast v0, Lb3/x2;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lsy2/p;->f(Lb3/x2;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsy2/s;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lsy2/t;->c(Lp1/c1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsy2/s;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Landroid/webkit/ValueCallback;

    invoke-static {v0, p1}, Lsy2/t;->i(Lp1/c1;Landroid/webkit/ValueCallback;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
