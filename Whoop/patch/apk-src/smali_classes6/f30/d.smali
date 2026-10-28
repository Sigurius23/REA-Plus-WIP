.class public final Lf30/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lf30/e;

.field public x:Lec3/h2;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lf30/e;


# direct methods
.method public constructor <init>(Lf30/e;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lf30/d;->z:Lf30/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf30/d;->y:Ljava/lang/Object;

    iget p1, p0, Lf30/d;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf30/d;->E:I

    iget-object p1, p0, Lf30/d;->z:Lf30/e;

    invoke-virtual {p1, p0}, Lf30/e;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
