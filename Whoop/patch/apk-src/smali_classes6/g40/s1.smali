.class public final Lg40/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg2/i;

.field public final synthetic y:Lg40/o1;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public constructor <init>(ILg2/i;Lg40/o1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg40/s1;->w:I

    iput-object p2, p0, Lg40/s1;->x:Lg2/i;

    iput-object p3, p0, Lg40/s1;->y:Lg40/o1;

    iput-object p4, p0, Lg40/s1;->z:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ls2/c;

    iget-object p1, p1, Ls2/c;->a:Landroid/view/KeyEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lg40/s1;->w:I

    if-eqz v0, :cond_0

    invoke-static {p1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/16 v1, 0x43

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lg40/s1;->z:Lp1/t2;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lg40/s1;->x:Lg2/i;

    invoke-static {p1, v2}, Luf/c0;->c0(Lg2/i;I)V

    iget-object p1, p0, Lg40/s1;->y:Lg40/o1;

    iget-object p1, p1, Lg40/o1;->b:Lg40/m1;

    add-int/lit8 v0, v0, -0x1

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lg40/m1;->a(ILjava/lang/String;)I

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method
