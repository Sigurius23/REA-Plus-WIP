.class public final Lwz/j;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Landroidx/room/x;

.field public x:Lwz/q;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Landroidx/room/x;


# direct methods
.method public constructor <init>(Landroidx/room/x;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lwz/j;->z:Landroidx/room/x;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwz/j;->y:Ljava/lang/Object;

    iget p1, p0, Lwz/j;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwz/j;->E:I

    iget-object p1, p0, Lwz/j;->z:Landroidx/room/x;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Landroidx/room/x;->f(Lwz/q;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
