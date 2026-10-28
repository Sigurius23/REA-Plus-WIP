.class public final Lrb3/q;
.super Lrb3/a;
.source "SourceFile"


# instance fields
.field public final w:Llb3/g;

.field public final x:I


# direct methods
.method public constructor <init>(Llb3/g;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrb3/q;->w:Llb3/g;

    iput p2, p0, Lrb3/q;->x:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lrb3/q;->x:I

    return v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrb3/q;->w:Llb3/g;

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrb3/q;->x:I

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lrb3/q;->w:Llb3/g;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lrb3/p;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lrb3/p;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method
