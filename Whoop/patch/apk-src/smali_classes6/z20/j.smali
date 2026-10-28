.class public final Lz20/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lz20/l;

.field public y:I


# direct methods
.method public constructor <init>(Lz20/l;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lz20/j;->x:Lz20/l;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lz20/j;->w:Ljava/lang/Object;

    iget p1, p0, Lz20/j;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz20/j;->y:I

    iget-object p1, p0, Lz20/j;->x:Lz20/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lz20/l;->a(Ly00/b2;Ljava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
