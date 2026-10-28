.class public final Lsh/v;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lsh/x;

.field public x:Lmc3/i;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lsh/x;


# direct methods
.method public constructor <init>(Lsh/x;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lsh/v;->z:Lsh/x;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsh/v;->y:Ljava/lang/Object;

    iget p1, p0, Lsh/v;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsh/v;->E:I

    iget-object p1, p0, Lsh/v;->z:Lsh/x;

    invoke-virtual {p1, p0}, Lsh/x;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
