.class public final Leb/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Leb/w0;

.field public b:Z

.field public c:Z

.field public d:I

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Leb/w0;

    invoke-direct {v0}, Leb/w0;-><init>()V

    iput-object v0, p0, Leb/y0;->a:Leb/w0;

    const/4 v0, -0x1

    iput v0, p0, Leb/y0;->d:I

    return-void
.end method


# virtual methods
.method public final a(ILkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p1, p0, Leb/y0;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Leb/y0;->f:Z

    new-instance p1, Leb/k1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean p2, p1, Leb/k1;->a:Z

    iput-boolean p2, p0, Leb/y0;->f:Z

    iget-boolean p1, p1, Leb/k1;->b:Z

    iput-boolean p1, p0, Leb/y0;->g:Z

    return-void
.end method

.method public final b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Leb/y0;->e:Ljava/lang/String;

    const/4 p1, -0x1

    iput p1, p0, Leb/y0;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Leb/y0;->f:Z

    new-instance p1, Leb/k1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean p2, p1, Leb/k1;->a:Z

    iput-boolean p2, p0, Leb/y0;->f:Z

    iget-boolean p1, p1, Leb/k1;->b:Z

    iput-boolean p1, p0, Leb/y0;->g:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot pop up to an empty route"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
