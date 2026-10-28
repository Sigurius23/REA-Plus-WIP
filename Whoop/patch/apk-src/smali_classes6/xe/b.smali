.class public final Lxe/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lyf/k;

.field public x:Ld9/p;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ld9/p;


# direct methods
.method public constructor <init>(Ld9/p;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lxe/b;->z:Ld9/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxe/b;->y:Ljava/lang/Object;

    iget p1, p0, Lxe/b;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxe/b;->E:I

    iget-object p1, p0, Lxe/b;->z:Ld9/p;

    invoke-virtual {p1, p0}, Ld9/p;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
