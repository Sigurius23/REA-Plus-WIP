.class public final Lij/o;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Laj/c;


# direct methods
.method public synthetic constructor <init>(Laj/c;I)V
    .locals 0

    iput p2, p0, Lij/o;->w:I

    iput-object p1, p0, Lij/o;->x:Laj/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lij/o;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, [Ljava/lang/Object;

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lij/o;->x:Laj/c;

    iget-object p1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Lcom/amplitude/android/engagement/a;

    iget-object p1, p1, Lcom/amplitude/android/engagement/a;->e:Lcom/google/android/gms/common/f;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/f;->b()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    if-nez v0, :cond_1

    sget-object p1, Lcom/amplitude/quickjs/wrapper/JSNull;->VALUE:Lcom/amplitude/quickjs/wrapper/JSNull;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lij/o;->x:Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->e:Lcom/google/android/gms/common/f;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/common/f;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->t1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    if-ltz p1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_2

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_5

    :cond_3
    sget-object p1, Lcom/amplitude/quickjs/wrapper/JSNull;->VALUE:Lcom/amplitude/quickjs/wrapper/JSNull;

    goto :goto_1

    :cond_4
    sget-object p1, Lcom/amplitude/quickjs/wrapper/JSNull;->VALUE:Lcom/amplitude/quickjs/wrapper/JSNull;

    :cond_5
    :goto_1
    return-object p1

    :pswitch_1
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lij/o;->x:Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->e:Lcom/google/android/gms/common/f;

    if-eqz v0, :cond_7

    const-string v1, "key"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/common/f;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_7
    :goto_2
    const/4 p1, 0x0

    return-object p1

    :pswitch_2
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_8

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lij/o;->x:Laj/c;

    iget-object v1, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lcom/amplitude/android/engagement/a;

    iget-object v1, v1, Lcom/amplitude/android/engagement/a;->e:Lcom/google/android/gms/common/f;

    if-eqz v1, :cond_9

    const-string v2, "key"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "value"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/android/gms/common/f;->b()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_9
    :goto_3
    const/4 p1, 0x0

    return-object p1

    :pswitch_3
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    if-nez v0, :cond_a

    sget-object p1, Lcom/amplitude/quickjs/wrapper/JSNull;->VALUE:Lcom/amplitude/quickjs/wrapper/JSNull;

    goto :goto_4

    :cond_a
    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lij/o;->x:Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->e:Lcom/google/android/gms/common/f;

    if-eqz v0, :cond_b

    const-string v1, "key"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/common/f;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_c

    :cond_b
    sget-object p1, Lcom/amplitude/quickjs/wrapper/JSNull;->VALUE:Lcom/amplitude/quickjs/wrapper/JSNull;

    :cond_c
    :goto_4
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
