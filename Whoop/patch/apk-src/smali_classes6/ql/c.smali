.class public abstract Lql/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/i;


# instance fields
.field private final w:I

.field private final x:I

.field private y:Lpl/b;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, -0x80000000

    invoke-static {p1, p1}, Ltl/l;->h(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iput p1, p0, Lql/c;->w:I

    iput p1, p0, Lql/c;->x:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lql/h;)V
    .locals 0

    return-void
.end method

.method public c(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public final d()Lpl/b;
    .locals 1

    iget-object v0, p0, Lql/c;->y:Lpl/b;

    return-object v0
.end method

.method public final f(Lpl/b;)V
    .locals 0

    iput-object p1, p0, Lql/c;->y:Lpl/b;

    return-void
.end method

.method public g(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public final h(Lql/h;)V
    .locals 2

    iget v0, p0, Lql/c;->w:I

    iget v1, p0, Lql/c;->x:I

    check-cast p1, Lpl/e;

    invoke-virtual {p1, v0, v1}, Lpl/e;->l(II)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 0

    return-void
.end method
