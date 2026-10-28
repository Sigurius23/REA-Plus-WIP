.class public final Lh53/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lh53/e;

.field public x:Lv33/n;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lh53/e;


# direct methods
.method public constructor <init>(Lh53/e;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lh53/b;->z:Lh53/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh53/b;->y:Ljava/lang/Object;

    iget p1, p0, Lh53/b;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh53/b;->E:I

    iget-object p1, p0, Lh53/b;->z:Lh53/e;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lh53/e;->b(Lh53/e;Lv33/w;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
