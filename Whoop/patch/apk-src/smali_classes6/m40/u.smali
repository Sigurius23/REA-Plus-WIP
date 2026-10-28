.class public final Lm40/u;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lm40/w;

.field public x:Ljava/lang/String;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lm40/w;


# direct methods
.method public constructor <init>(Lm40/w;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lm40/u;->z:Lm40/w;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm40/u;->y:Ljava/lang/Object;

    iget p1, p0, Lm40/u;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm40/u;->E:I

    iget-object p1, p0, Lm40/u;->z:Lm40/w;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lm40/w;->d(Lm40/w;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
