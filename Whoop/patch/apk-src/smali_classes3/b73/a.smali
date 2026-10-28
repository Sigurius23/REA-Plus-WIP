.class public final Lb73/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz63/e;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb73/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb30/m;Lg9/k;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb73/a;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Landroid/text/style/StrikethroughSpan;

    invoke-direct {p1}, Landroid/text/style/StrikethroughSpan;-><init>()V

    return-object p1

    :pswitch_0
    new-instance p2, Lc73/a;

    iget-object p1, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast p1, La73/e;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, Lc73/a;-><init>(La73/e;I)V

    return-object p2

    :pswitch_1
    new-instance p1, Lc73/e;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lc73/e;-><init>(I)V

    return-object p1

    :pswitch_2
    sget-object v0, La73/d;->a:Lz63/c;

    invoke-virtual {v0, p2}, Lz63/c;->a(Lg9/k;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, La73/c;->w:La73/c;

    if-ne v1, v0, :cond_0

    new-instance v0, Lc73/b;

    iget-object p1, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast p1, La73/e;

    sget-object v1, La73/d;->b:Lz63/c;

    invoke-virtual {v1, p2}, Lz63/c;->a(Lg9/k;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lc73/b;-><init>(La73/e;I)V

    goto :goto_0

    :cond_0
    sget-object v0, La73/d;->c:Lz63/c;

    invoke-virtual {v0, p2}, Lz63/c;->a(Lg9/k;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, ".\u00a0"

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lc73/i;

    iget-object p1, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast p1, La73/e;

    invoke-direct {v0, p1, p2}, Lc73/i;-><init>(La73/e;Ljava/lang/String;)V

    :goto_0
    return-object v0

    :pswitch_3
    new-instance v0, Lc73/g;

    iget-object v1, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast v1, La73/e;

    sget-object v2, La73/d;->e:Lz63/c;

    invoke-virtual {v2, p2}, Lz63/c;->a(Lg9/k;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iget-object p1, p1, Lb30/m;->z:Ljava/lang/Object;

    check-cast p1, Lz5/b;

    invoke-direct {v0, v1, p2, p1}, Lc73/g;-><init>(La73/e;Ljava/lang/String;Lz5/b;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lc73/f;

    iget-object p1, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast p1, La73/e;

    sget-object v1, La73/d;->d:Lz63/c;

    invoke-virtual {v1, p2}, Lz63/c;->a(Lg9/k;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lc73/f;-><init>(La73/e;I)V

    return-object v0

    :pswitch_5
    new-instance p1, Lc73/e;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lc73/e;-><init>(I)V

    return-object p1

    :pswitch_6
    new-instance p2, Lc73/d;

    iget-object p1, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast p1, La73/e;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lc73/d;-><init>(Ljava/lang/Object;I)V

    return-object p2

    :pswitch_7
    new-instance p2, Lc73/c;

    iget-object p1, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast p1, La73/e;

    invoke-direct {p2, p1}, Lc73/c;-><init>(La73/e;)V

    return-object p2

    :pswitch_8
    new-instance p2, Lc73/a;

    iget-object p1, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast p1, La73/e;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lc73/a;-><init>(La73/e;I)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
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
