.class public final Lx30/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/l3;


# instance fields
.field public final E:Lec3/h2;

.field public final F:Lec3/h2;

.field public final synthetic w:I

.field public final x:Ll83/p;

.field public final y:Lzy/b;

.field public final z:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lx30/h;->w:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lwr1/f;

    const/16 v0, 0xe

    invoke-direct {p1, v0}, Lwr1/f;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lx30/h;->x:Ll83/p;

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    sget-object v0, Lm83/y;->w:Lm83/y;

    const v1, 0x7f140fcf

    invoke-static {v1, p1, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    iput-object p1, p0, Lx30/h;->y:Lzy/b;

    const/4 p1, 0x3

    iput p1, p0, Lx30/h;->z:I

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lx30/h;->E:Lec3/h2;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lx30/h;->F:Lec3/h2;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lwr1/f;

    const/16 v0, 0x18

    invoke-direct {p1, v0}, Lwr1/f;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lx30/h;->x:Ll83/p;

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    sget-object v0, Lm83/y;->w:Lm83/y;

    const v1, 0x7f1410fc

    invoke-static {v1, p1, v0}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    iput-object p1, p0, Lx30/h;->y:Lzy/b;

    const/4 p1, 0x6

    iput p1, p0, Lx30/h;->z:I

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lx30/h;->E:Lec3/h2;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lx30/h;->F:Lec3/h2;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Lec3/f2;
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx30/h;->E:Lec3/h2;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lx30/h;->E:Lec3/h2;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Lq3/g0;
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getLabel()Lzy/c;
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx30/h;->y:Lzy/b;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lx30/h;->y:Lzy/b;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getLoading()Lec3/h2;
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx30/h;->F:Lec3/h2;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lx30/h;->F:Lec3/h2;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "userTyped"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ljava/lang/String;)Lg40/s3;
    .locals 5

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx30/h;->x:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1e

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lg40/t3;->b:Lg40/t3;

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    sget-object p1, Lg40/y3;->a:Lg40/y3;

    goto :goto_1

    :cond_2
    new-instance p1, Lg40/u3;

    const v0, 0x7f141026

    invoke-direct {p1, v0}, Lg40/u3;-><init>(I)V

    :goto_1
    return-object p1

    :pswitch_0
    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx30/h;->x:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_3

    sget-object p1, Lg40/t3;->b:Lg40/t3;

    goto :goto_3

    :cond_3
    if-eqz v0, :cond_4

    sget-object p1, Lg40/y3;->a:Lg40/y3;

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const v3, 0x7f14101e

    const/4 v4, 0x6

    if-ge v0, v1, :cond_6

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    if-nez v1, :cond_5

    new-instance p1, Lg40/v3;

    invoke-direct {p1, v3, v4, v2}, Lg40/v3;-><init>(IILjava/util/List;)V

    goto :goto_3

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, v4, :cond_7

    new-instance p1, Lg40/u3;

    const v0, 0x7f141015

    invoke-direct {p1, v0}, Lg40/u3;-><init>(I)V

    goto :goto_3

    :cond_7
    new-instance p1, Lg40/v3;

    invoke-direct {p1, v3, v4, v2}, Lg40/v3;-><init>(IILjava/util/List;)V

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l()Z
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "displayName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lx30/h;->z:I

    return v0

    :pswitch_0
    iget v0, p0, Lx30/h;->z:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o()Z
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p()Z
    .locals 1

    iget v0, p0, Lx30/h;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
