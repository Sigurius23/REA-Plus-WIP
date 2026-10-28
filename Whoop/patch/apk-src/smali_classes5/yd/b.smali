.class public final Lyd/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lwb3/f;

.field public x:Lrg/f;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lvo/b;


# direct methods
.method public constructor <init>(Lvo/b;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lyd/b;->z:Lvo/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyd/b;->y:Ljava/lang/Object;

    iget p1, p0, Lyd/b;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyd/b;->E:I

    iget-object p1, p0, Lyd/b;->z:Lvo/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lvo/b;->p(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
