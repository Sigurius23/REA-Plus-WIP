.class public final Lx30/i;
.super Lg40/b3;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Lg40/k1;

.field public final d:Z

.field public final e:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method public constructor <init>(I)V
    .locals 4

    iput p1, p0, Lx30/i;->b:I

    packed-switch p1, :pswitch_data_0

    .line 5
    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getBlikCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    .line 7
    new-instance v0, Lg40/f3;

    .line 8
    new-instance v1, Lx30/h;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lx30/h;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x6

    .line 9
    invoke-direct {v0, v1, v2, v2, v3}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    .line 10
    const-string v1, "identifier"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, p1}, Lg40/b3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    .line 12
    iput-object p1, p0, Lx30/i;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 13
    iput-object v0, p0, Lx30/i;->c:Lg40/k1;

    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Lx30/i;->d:Z

    return-void

    .line 15
    :pswitch_0
    new-instance p1, Lg40/f3;

    .line 16
    new-instance v0, Lx30/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lx30/h;-><init>(I)V

    const/4 v1, 0x0

    const/4 v2, 0x6

    .line 17
    invoke-direct {p1, v0, v1, v1, v2}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    .line 18
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getVpa$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    .line 20
    invoke-direct {p0, v0}, Lg40/b3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    .line 21
    iput-object p1, p0, Lx30/i;->c:Lg40/k1;

    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lx30/i;->d:Z

    .line 23
    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getVpa$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    .line 24
    iput-object p1, p0, Lx30/i;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lzy/b;Lc93/a;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lx30/i;->b:I

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lg40/b3;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    .line 2
    iput-object p1, p0, Lx30/i;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lx30/i;->d:Z

    .line 4
    new-instance p1, Lg40/n;

    invoke-direct {p1, p2, p3}, Lg40/n;-><init>(Lzy/b;Lc93/a;)V

    iput-object p1, p0, Lx30/i;->c:Lg40/k1;

    return-void
.end method


# virtual methods
.method public final a()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget v0, p0, Lx30/i;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx30/i;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lx30/i;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lx30/i;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Lzy/c;
    .locals 1

    iget v0, p0, Lx30/i;->b:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_1
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Z
    .locals 1

    iget v0, p0, Lx30/i;->b:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lx30/i;->d:Z

    return v0

    :pswitch_0
    iget-boolean v0, p0, Lx30/i;->d:Z

    return v0

    :pswitch_1
    iget-boolean v0, p0, Lx30/i;->d:Z

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e()Lec3/f2;
    .locals 3

    iget v0, p0, Lx30/i;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lg40/b3;->e()Lec3/f2;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lx30/i;->c:Lg40/k1;

    invoke-interface {v0}, Lg40/k1;->j()Lec3/f2;

    move-result-object v0

    new-instance v1, Luo1/b;

    const/16 v2, 0x19

    invoke-direct {v1, p0, v2}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f()Lec3/f2;
    .locals 1

    iget v0, p0, Lx30/i;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lg40/b3;->f()Lec3/f2;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lx30/i;->e:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final k()Lg40/k1;
    .locals 1

    iget v0, p0, Lx30/i;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx30/i;->c:Lg40/k1;

    check-cast v0, Lg40/n;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lx30/i;->c:Lg40/k1;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lx30/i;->c:Lg40/k1;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
