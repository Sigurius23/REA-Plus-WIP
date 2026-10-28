.class public abstract Lql/g;
.super Lql/a;
.source "SourceFile"


# instance fields
.field private final x:I

.field private final y:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    iput v0, p0, Lql/g;->x:I

    iput v0, p0, Lql/g;->y:I

    return-void
.end method


# virtual methods
.method public a(Lql/h;)V
    .locals 0

    return-void
.end method

.method public final h(Lql/h;)V
    .locals 3

    iget v0, p0, Lql/g;->x:I

    iget v1, p0, Lql/g;->y:I

    invoke-static {v0, v1}, Ltl/l;->h(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lql/g;->x:I

    iget v1, p0, Lql/g;->y:I

    check-cast p1, Lpl/e;

    invoke-virtual {p1, v0, v1}, Lpl/e;->l(II)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lql/g;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " and height: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lql/g;->y:I

    const-string v2, ", either provide dimensions in the constructor or call override()"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
