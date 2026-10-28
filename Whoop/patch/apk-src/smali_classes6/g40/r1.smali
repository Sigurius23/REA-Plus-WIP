.class public final synthetic Lg40/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lp1/a1;


# direct methods
.method public synthetic constructor <init>(ILp1/a1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg40/r1;->w:I

    iput-boolean p3, p0, Lg40/r1;->x:Z

    iput-object p2, p0, Lg40/r1;->y:Lp1/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lg2/v;

    const-string v0, "focusState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result v0

    iget-object v1, p0, Lg40/r1;->y:Lp1/a1;

    if-eqz v0, :cond_0

    check-cast v1, Lp1/h1;

    iget p1, p0, Lg40/r1;->w:I

    invoke-virtual {v1, p1}, Lp1/h1;->y(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lg2/w;->b()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lg40/r1;->x:Z

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    check-cast v1, Lp1/h1;

    invoke-virtual {v1, p1}, Lp1/h1;->y(I)V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
