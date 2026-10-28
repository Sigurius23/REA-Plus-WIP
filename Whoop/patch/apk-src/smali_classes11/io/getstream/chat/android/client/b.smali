.class public final synthetic Lio/getstream/chat/android/client/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lio/getstream/chat/android/client/b;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/b;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lio/getstream/chat/android/client/b;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lio/getstream/chat/android/client/b;->w:I

    iput-boolean p1, p0, Lio/getstream/chat/android/client/b;->x:Z

    iput-object p2, p0, Lio/getstream/chat/android/client/b;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lio/getstream/chat/android/client/b;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lio/getstream/chat/android/client/b;->y:Ljava/lang/Object;

    iget-boolean v3, p0, Lio/getstream/chat/android/client/b;->x:Z

    packed-switch v0, :pswitch_data_0

    check-cast v2, Landroid/app/DatePickerDialog;

    invoke-static {v3, v2}, Lvp1/h;->X(ZLandroid/app/DatePickerDialog;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    check-cast v2, Ld1/b;

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ld1/b;->i()Lec3/o1;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Lec3/w1;

    invoke-virtual {v0, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :cond_0
    return-object v1

    :pswitch_1
    check-cast v2, Lnh1/c$d;

    invoke-static {v3, v2}, Lph1/i;->j(ZLnh1/c$d;)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_2
    check-cast v2, Llb/e;

    if-eqz v3, :cond_1

    const-string v0, "reader"

    goto :goto_0

    :cond_1
    const-string v0, "writer"

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Timed out attempting to acquire a "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " connection."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\nWriter pool:\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v2, Llb/e;->x:Llb/s;

    invoke-virtual {v0, v3}, Llb/s;->d(Ljava/lang/StringBuilder;)V

    const-string v0, "Reader pool:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, v2, Llb/e;->w:Llb/s;

    invoke-virtual {v0, v3}, Llb/s;->d(Ljava/lang/StringBuilder;)V

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x5

    :try_start_0
    invoke-static {v3, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 v0, 0x0

    throw v0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    iget v2, v2, Llb/e;->G:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    return-object v1

    :cond_3
    throw v0

    :pswitch_3
    check-cast v2, Landroid/view/View;

    invoke-static {v2, v3}, Lkd1/y;->d(Landroid/view/View;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    check-cast v2, Lis0/a0;

    invoke-static {v3, v2}, Lis0/p;->b(ZLis0/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    check-cast v2, Ljava/lang/String;

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-static {v2, v3}, Lio/getstream/chat/android/client/api/models/identifier/IdentifiersKt;->DeleteMessageIdentifier(Ljava/lang/String;Z)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

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
