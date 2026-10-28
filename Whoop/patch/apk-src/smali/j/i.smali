.class public final Lj/i;
.super Lj/d;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lj/j;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lk/b;


# direct methods
.method public synthetic constructor <init>(Lj/j;Ljava/lang/String;Lk/b;I)V
    .locals 0

    iput p4, p0, Lj/i;->a:I

    iput-object p1, p0, Lj/i;->b:Lj/j;

    iput-object p2, p0, Lj/i;->c:Ljava/lang/String;

    iput-object p3, p0, Lj/i;->d:Lk/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    .locals 5

    iget v0, p0, Lj/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj/i;->b:Lj/j;

    iget-object v1, v0, Lj/j;->d:Ljava/util/ArrayList;

    iget-object v2, v0, Lj/j;->b:Ljava/util/LinkedHashMap;

    iget-object v3, p0, Lj/i;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-object v4, p0, Lj/i;->d:Lk/b;

    if-eqz v2, :cond_0

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :try_start_0
    invoke-virtual {v0, v2, v4, p1, p2}, Lj/j;->b(ILk/b;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    throw p1

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " and input "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    iget-object v0, p0, Lj/i;->b:Lj/j;

    iget-object v1, v0, Lj/j;->d:Ljava/util/ArrayList;

    iget-object v2, v0, Lj/j;->b:Ljava/util/LinkedHashMap;

    iget-object v3, p0, Lj/i;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-object v4, p0, Lj/i;->d:Lk/b;

    if-eqz v2, :cond_1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :try_start_1
    invoke-virtual {v0, v2, v4, p1, p2}, Lj/j;->b(ILk/b;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " and input "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 2

    iget v0, p0, Lj/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj/i;->b:Lj/j;

    iget-object v1, p0, Lj/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lj/j;->f(Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lj/i;->b:Lj/j;

    iget-object v1, p0, Lj/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lj/j;->f(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
