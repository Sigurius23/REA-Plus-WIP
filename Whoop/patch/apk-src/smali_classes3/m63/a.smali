.class public final Lm63/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lla/b;

.field public x:Lm63/d;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lla/b;


# direct methods
.method public constructor <init>(Lla/b;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lm63/a;->z:Lla/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm63/a;->y:Ljava/lang/Object;

    iget p1, p0, Lm63/a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm63/a;->E:I

    iget-object p1, p0, Lm63/a;->z:Lla/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lla/b;->G(Lm63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
