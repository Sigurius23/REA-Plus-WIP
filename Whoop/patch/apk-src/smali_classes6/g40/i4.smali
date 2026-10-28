.class public final Lg40/i4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lg2/i;

.field public final synthetic y:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lg2/i;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg40/i4;->w:Ljava/lang/String;

    iput-object p2, p0, Lg40/i4;->x:Lg2/i;

    iput p3, p0, Lg40/i4;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ls2/c;

    iget-object p1, p1, Ls2/c;->a:Landroid/view/KeyEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ls2/e;->L(Landroid/view/KeyEvent;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/16 v0, 0x43

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lg40/i4;->w:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lg40/i4;->x:Lg2/i;

    iget v0, p0, Lg40/i4;->y:I

    invoke-static {p1, v0}, Luf/c0;->c0(Lg2/i;I)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
