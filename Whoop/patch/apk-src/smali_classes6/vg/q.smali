.class public final Lvg/q;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lvg/r;

.field public y:I


# direct methods
.method public constructor <init>(Lvg/r;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lvg/q;->x:Lvg/r;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lvg/q;->w:Ljava/lang/Object;

    iget p1, p0, Lvg/q;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvg/q;->y:I

    iget-object p1, p0, Lvg/q;->x:Lvg/r;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lvg/r;->d(Ljava/lang/String;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
