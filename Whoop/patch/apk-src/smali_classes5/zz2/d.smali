.class public final synthetic Lzz2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lzz2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzz2/d;->w:I

    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lzz2/e;->h(Lxf3/c;Luf3/a;)Lzz2/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1, p2}, Lzz2/e;->f(Lxf3/c;Luf3/a;)Lzz2/c;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1, p2}, Lzz2/e;->d(Lxf3/c;Luf3/a;)Lzz2/b;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1, p2}, Lzz2/e;->a(Lxf3/c;Luf3/a;)La03/b;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1, p2}, Lzz2/e;->e(Lxf3/c;Luf3/a;)Lb03/f;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {p1, p2}, Lzz2/e;->c(Lxf3/c;Luf3/a;)Lc03/b;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1, p2}, Lzz2/e;->b(Lxf3/c;Luf3/a;)La03/c;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
