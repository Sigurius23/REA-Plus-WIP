.class public final Lc6/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lc6/c;

.field public x:Lne3/j0;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lc6/c;


# direct methods
.method public constructor <init>(Lc6/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lc6/b;->z:Lc6/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lc6/b;->y:Ljava/lang/Object;

    iget p1, p0, Lc6/b;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lc6/b;->E:I

    iget-object p1, p0, Lc6/b;->z:Lc6/c;

    invoke-static {p1, p0}, Lc6/c;->f(Lc6/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
