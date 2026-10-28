.class public final Lw73/d;
.super Ll73/c;
.source "SourceFile"


# instance fields
.field public final w:[Ll73/c;

.field public final x:Lq30/u0;

.field public final y:I


# direct methods
.method public constructor <init>([Ll73/c;Lq30/u0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw73/d;->w:[Ll73/c;

    iput-object p2, p0, Lw73/d;->x:Lq30/u0;

    iput p3, p0, Lw73/d;->y:I

    return-void
.end method


# virtual methods
.method public final d(Ll73/d;)V
    .locals 6

    iget-object v0, p0, Lw73/d;->w:[Ll73/c;

    array-length v1, v0

    if-nez v1, :cond_0

    sget-object v0, Lq73/d;->w:Lq73/d;

    invoke-interface {p1, v0}, Ll73/d;->b(Ln73/b;)V

    invoke-interface {p1}, Ll73/d;->onComplete()V

    return-void

    :cond_0
    new-instance v2, Lw73/c;

    iget-object v3, p0, Lw73/d;->x:Lq30/u0;

    iget v4, p0, Lw73/d;->y:I

    invoke-direct {v2, p1, v3, v1, v4}, Lw73/c;-><init>(Ll73/d;Lq30/u0;II)V

    iget-object p1, v2, Lw73/c;->y:[Lw73/b;

    array-length v1, p1

    iget-object v3, v2, Lw73/c;->w:Ll73/d;

    invoke-interface {v3, v2}, Ll73/d;->b(Ln73/b;)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    iget-boolean v4, v2, Lw73/c;->G:Z

    if-nez v4, :cond_2

    iget-boolean v4, v2, Lw73/c;->F:Z

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    aget-object v4, v0, v3

    aget-object v5, p1, v3

    invoke-virtual {v4, v5}, Ll73/c;->c(Ll73/d;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
