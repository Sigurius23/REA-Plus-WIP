.class public final Ldl/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/t;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ldl/d;->a:I

    iput-object p1, p0, Ldl/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Ldl/d;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ldl/i;

    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Ljava/io/File;

    const/4 p1, 0x1

    return p1

    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "data:image"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, [B

    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILwk/h;)Ldl/s;
    .locals 2

    iget p2, p0, Ldl/d;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ldl/i;

    new-instance p2, Ldl/s;

    new-instance p3, Lvk/a;

    iget-object p4, p0, Ldl/d;->b:Ljava/lang/Object;

    check-cast p4, Lud3/i;

    invoke-direct {p3, p4, p1}, Lvk/a;-><init>(Lud3/i;Ldl/i;)V

    invoke-direct {p2, p1, p3}, Ldl/s;-><init>(Lwk/e;Lxk/e;)V

    return-object p2

    :pswitch_0
    check-cast p1, Ljava/io/File;

    new-instance p2, Ldl/s;

    new-instance p3, Lsl/d;

    invoke-direct {p3, p1}, Lsl/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Ldl/g;

    iget-object v0, p0, Ldl/d;->b:Ljava/lang/Object;

    check-cast v0, Ldl/e;

    const/4 v1, 0x1

    invoke-direct {p4, v1, p1, v0}, Ldl/g;-><init>(ILjava/lang/Comparable;Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, Ldl/s;-><init>(Lwk/e;Lxk/e;)V

    return-object p2

    :pswitch_1
    new-instance p2, Ldl/s;

    new-instance p3, Lsl/d;

    invoke-direct {p3, p1}, Lsl/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Ldl/g;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ldl/d;->b:Ljava/lang/Object;

    check-cast v0, Ldl/e;

    const/4 v1, 0x0

    invoke-direct {p4, v1, p1, v0}, Ldl/g;-><init>(ILjava/lang/Comparable;Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, Ldl/s;-><init>(Lwk/e;Lxk/e;)V

    return-object p2

    :pswitch_2
    check-cast p1, [B

    new-instance p2, Ldl/s;

    new-instance p3, Lsl/d;

    invoke-direct {p3, p1}, Lsl/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Ldl/o;

    iget-object v0, p0, Ldl/d;->b:Ljava/lang/Object;

    check-cast v0, Ldl/c;

    const/4 v1, 0x1

    invoke-direct {p4, v1, p1, v0}, Ldl/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, Ldl/s;-><init>(Lwk/e;Lxk/e;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
