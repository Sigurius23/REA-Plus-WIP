.class public final synthetic Lzc1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lp1/c1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lzc1/g;->w:I

    iput-object p1, p0, Lzc1/g;->x:Landroid/content/Context;

    iput-object p2, p0, Lzc1/g;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Landroid/content/Context;I)V
    .locals 0

    .line 2
    iput p3, p0, Lzc1/g;->w:I

    iput-object p1, p0, Lzc1/g;->y:Lp1/c1;

    iput-object p2, p0, Lzc1/g;->x:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lzc1/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lzc1/g;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/g;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/m5;->b(Landroid/content/Context;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lzc1/g;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/g;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/u3;->a(Landroid/content/Context;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lzc1/g;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/g;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/u3;->i(Landroid/content/Context;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lzc1/g;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/g;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/u3;->b(Landroid/content/Context;Lp1/c1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lzc1/g;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/g;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/h;->b(Landroid/content/Context;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lzc1/g;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/g;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/h;->d(Landroid/content/Context;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
