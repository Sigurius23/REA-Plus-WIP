.class public final Lnc/c;
.super Lnc/b;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:I


# direct methods
.method public constructor <init>(Leb/o0;I)V
    .locals 0

    iput p2, p0, Lnc/c;->b:I

    packed-switch p2, :pswitch_data_0

    const-string p2, "tracker"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lnc/b;-><init>(Leb/o0;)V

    const/4 p1, 0x6

    .line 2
    iput p1, p0, Lnc/c;->c:I

    return-void

    .line 3
    :pswitch_0
    const-string p2, "tracker"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1}, Lnc/b;-><init>(Leb/o0;)V

    const/16 p1, 0x9

    .line 5
    iput p1, p0, Lnc/c;->c:I

    return-void

    .line 6
    :pswitch_1
    const-string p2, "tracker"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0, p1}, Lnc/b;-><init>(Leb/o0;)V

    const/4 p1, 0x7

    .line 8
    iput p1, p0, Lnc/c;->c:I

    return-void

    .line 9
    :pswitch_2
    const-string p2, "tracker"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0, p1}, Lnc/b;-><init>(Leb/o0;)V

    const/4 p1, 0x7

    .line 11
    iput p1, p0, Lnc/c;->c:I

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Loc/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lnc/c;->b:I

    const-string v0, "tracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0, p1}, Lnc/b;-><init>(Leb/o0;)V

    const/4 p1, 0x5

    .line 13
    iput p1, p0, Lnc/c;->c:I

    return-void
.end method


# virtual methods
.method public final b(Lqc/q;)Z
    .locals 2

    iget v0, p0, Lnc/c;->b:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lqc/q;->j:Lic/e;

    iget-boolean p1, p1, Lic/e;->f:Z

    return p1

    :pswitch_0
    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lqc/q;->j:Lic/e;

    iget-object p1, p1, Lic/e;->a:Lic/x;

    sget-object v0, Lic/x;->y:Lic/x;

    if-eq p1, v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, Lic/x;->F:Lic/x;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1

    :pswitch_1
    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lqc/q;->j:Lic/e;

    iget-object p1, p1, Lic/e;->a:Lic/x;

    sget-object v0, Lic/x;->x:Lic/x;

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return p1

    :pswitch_2
    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lqc/q;->j:Lic/e;

    iget-boolean p1, p1, Lic/e;->e:Z

    return p1

    :pswitch_3
    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lqc/q;->j:Lic/e;

    iget-boolean p1, p1, Lic/e;->c:Z

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lnc/c;->b:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lnc/c;->c:I

    return v0

    :pswitch_0
    iget v0, p0, Lnc/c;->c:I

    return v0

    :pswitch_1
    iget v0, p0, Lnc/c;->c:I

    return v0

    :pswitch_2
    iget v0, p0, Lnc/c;->c:I

    return v0

    :pswitch_3
    iget v0, p0, Lnc/c;->c:I

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, Lnc/c;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_0
    xor-int/lit8 p1, p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Lmc/e;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lmc/e;->a:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Lmc/e;->c:Z

    if-nez v0, :cond_1

    iget-boolean p1, p1, Lmc/e;->e:Z

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1

    :pswitch_1
    check-cast p1, Lmc/e;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Lmc/e;->e:Z

    if-nez v0, :cond_3

    iget-boolean v0, p1, Lmc/e;->a:Z

    if-eqz v0, :cond_3

    iget-boolean p1, p1, Lmc/e;->b:Z

    if-nez p1, :cond_2

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    goto :goto_4

    :cond_3
    :goto_3
    const/4 p1, 0x1

    :goto_4
    return p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
