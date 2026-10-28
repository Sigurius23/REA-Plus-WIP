.class public final Leg/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ljava/lang/Object;

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Leg/o;


# direct methods
.method public constructor <init>(Leg/o;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Leg/n;->z:Leg/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Leg/n;->y:Ljava/lang/Object;

    iget p1, p0, Leg/n;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Leg/n;->E:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Leg/n;->z:Leg/o;

    invoke-virtual {v1, p1, v0, p1, p0}, Leg/o;->h(Lfg/q;ILjava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
