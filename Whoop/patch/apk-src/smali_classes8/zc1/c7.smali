.class public final synthetic Lzc1/c7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/List;I)V
    .locals 0

    iput p3, p0, Lzc1/c7;->w:I

    iput-object p1, p0, Lzc1/c7;->x:Landroid/content/Context;

    iput-object p2, p0, Lzc1/c7;->y:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lzc1/c7;->w:I

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzc1/c7;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/c7;->y:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lzc1/d7;->b(Landroid/content/Context;Ljava/util/List;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzc1/c7;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/c7;->y:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lzc1/d7;->a(Landroid/content/Context;Ljava/util/List;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lzc1/c7;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/c7;->y:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lzc1/d7;->e(Landroid/content/Context;Ljava/util/List;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lzc1/c7;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/c7;->y:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lzc1/d7;->f(Landroid/content/Context;Ljava/util/List;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lzc1/c7;->x:Landroid/content/Context;

    iget-object v1, p0, Lzc1/c7;->y:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lzc1/d7;->c(Landroid/content/Context;Ljava/util/List;I)Ll83/a0;

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
