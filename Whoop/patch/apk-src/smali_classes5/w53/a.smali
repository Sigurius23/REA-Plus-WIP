.class public final Lw53/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lw53/b;

.field public x:Ls63/a;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lw53/b;


# direct methods
.method public constructor <init>(Lw53/b;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lw53/a;->z:Lw53/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lw53/a;->y:Ljava/lang/Object;

    iget p1, p0, Lw53/a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw53/a;->E:I

    iget-object p1, p0, Lw53/a;->z:Lw53/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
